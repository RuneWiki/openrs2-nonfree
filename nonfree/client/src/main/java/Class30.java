import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class30 {

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
	private int anInt1383 = 65000;

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "Lclient!bb;")
	private Class6 aClass6_1 = null;

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "Lclient!bb;")
	private Class6 aClass6_2 = null;

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
	private final int anInt1387;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(ILclient!bb;Lclient!bb;I)V")
	public Class30(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) int arg3) {
		this.aClass6_1 = arg1;
		this.anInt1387 = arg0;
		this.aClass6_2 = arg2;
		this.anInt1383 = arg3;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZII[B)Z")
	private boolean method999(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class6 local8 = this.aClass6_1;
		synchronized (this.aClass6_1) {
			try {
				@Pc(22) int local22;
				if (arg0) {
					if (this.aClass6_2.method285() < (long) (arg1 * 6 + 6)) {
						return false;
					}
					this.aClass6_2.method295((long) (arg1 * 6));
					this.aClass6_2.method290(0, Static95.aByteArray18, 6);
					local22 = (Static95.aByteArray18[5] & 0xFF) + ((Static95.aByteArray18[3] & 0xFF) << 16) + ((Static95.aByteArray18[4] & 0xFF) << 8);
					if (local22 <= 0 || this.aClass6_1.method285() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass6_1.method285() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static95.aByteArray18[5] = (byte) local22;
				Static95.aByteArray18[1] = (byte) (arg2 >> 8);
				Static95.aByteArray18[4] = (byte) (local22 >> 8);
				Static95.aByteArray18[3] = (byte) (local22 >> 16);
				@Pc(145) int local145 = 0;
				Static95.aByteArray18[2] = (byte) arg2;
				@Pc(152) int local152 = 0;
				Static95.aByteArray18[0] = (byte) (arg2 >> 16);
				this.aClass6_2.method295((long) (arg1 * 6));
				this.aClass6_2.method287(6, 0, Static95.aByteArray18);
				while (local152 < arg2) {
					@Pc(178) int local178 = 0;
					@Pc(249) int local249;
					if (arg0) {
						this.aClass6_1.method295((long) (local22 * 520));
						try {
							this.aClass6_1.method290(0, Static95.aByteArray18, 8);
						} catch (@Pc(197) EOFException local197) {
							return true;
						}
						local178 = ((Static95.aByteArray18[5] & 0xFF) << 8) + ((Static95.aByteArray18[4] & 0xFF) << 16) + (Static95.aByteArray18[6] & 0xFF);
						@Pc(235) int local235 = ((Static95.aByteArray18[2] & 0xFF) << 8) + (Static95.aByteArray18[3] & 0xFF);
						local249 = (Static95.aByteArray18[1] & 0xFF) + ((Static95.aByteArray18[0] & 0xFF) << 8);
						@Pc(255) int local255 = Static95.aByteArray18[7] & 0xFF;
						if (arg1 != local249 || local235 != local145 || this.anInt1387 != local255) {
							return false;
						}
						if (local178 < 0 || this.aClass6_1.method285() / 520L < (long) local178) {
							return false;
						}
					}
					if (local178 == 0) {
						local178 = (int) ((this.aClass6_1.method285() + 519L) / 520L);
						if (local178 == 0) {
							local178++;
						}
						arg0 = false;
						if (local178 == local22) {
							local178++;
						}
					}
					Static95.aByteArray18[7] = (byte) this.anInt1387;
					Static95.aByteArray18[1] = (byte) arg1;
					Static95.aByteArray18[0] = (byte) (arg1 >> 8);
					Static95.aByteArray18[2] = (byte) (local145 >> 8);
					Static95.aByteArray18[3] = (byte) local145;
					local145++;
					if (arg2 - local152 <= 512) {
						local178 = 0;
					}
					Static95.aByteArray18[6] = (byte) local178;
					Static95.aByteArray18[5] = (byte) (local178 >> 8);
					local249 = arg2 - local152;
					Static95.aByteArray18[4] = (byte) (local178 >> 16);
					this.aClass6_1.method295((long) (local22 * 520));
					local22 = local178;
					if (local249 > 512) {
						local249 = 512;
					}
					this.aClass6_1.method287(8, 0, Static95.aByteArray18);
					this.aClass6_1.method287(local249, local152, arg3);
					local152 += local249;
				}
				return true;
			} catch (@Pc(450) IOException local450) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([BBII)Z")
	public boolean method1002(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class6 local6 = this.aClass6_1;
		synchronized (this.aClass6_1) {
			if (arg1 < 0 || this.anInt1383 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(44) boolean local44 = this.method999(true, arg2, arg1, arg0);
			if (!local44) {
				local44 = this.method999(false, arg2, arg1, arg0);
			}
			return local44;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)[B")
	public byte[] method1004(@OriginalArg(1) int arg0) {
		@Pc(8) Class6 local8 = this.aClass6_1;
		synchronized (this.aClass6_1) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass6_2.method285()) {
					return null;
				}
				this.aClass6_2.method295((long) (arg0 * 6));
				this.aClass6_2.method290(0, Static95.aByteArray18, 6);
				@Pc(65) int local65 = (Static95.aByteArray18[2] & 0xFF) + ((Static95.aByteArray18[1] & 0xFF) << 8) + ((Static95.aByteArray18[0] & 0xFF) << 16);
				@Pc(87) int local87 = ((Static95.aByteArray18[3] & 0xFF) << 16) + ((Static95.aByteArray18[4] & 0xFF) << 8) + (Static95.aByteArray18[5] & 0xFF);
				if (local65 < 0 || local65 > this.anInt1383) {
					return null;
				} else if (local87 > 0 && this.aClass6_1.method285() / 520L >= (long) local87) {
					@Pc(128) int local128 = 0;
					@Pc(131) byte[] local131 = new byte[local65];
					@Pc(133) int local133 = 0;
					label55: while (local65 > local128) {
						if (local87 == 0) {
							return null;
						}
						this.aClass6_1.method295((long) (local87 * 520));
						@Pc(158) int local158 = local65 - local128;
						if (local158 > 512) {
							local158 = 512;
						}
						this.aClass6_1.method290(0, Static95.aByteArray18, local158 + 8);
						@Pc(180) int local180 = Static95.aByteArray18[7] & 0xFF;
						@Pc(195) int local195 = ((Static95.aByteArray18[0] & 0xFF) << 8) + (Static95.aByteArray18[1] & 0xFF);
						@Pc(210) int local210 = ((Static95.aByteArray18[2] & 0xFF) << 8) + (Static95.aByteArray18[3] & 0xFF);
						@Pc(232) int local232 = (Static95.aByteArray18[6] & 0xFF) + ((Static95.aByteArray18[5] & 0xFF) << 8) + ((Static95.aByteArray18[4] & 0xFF) << 16);
						if (arg0 == local195 && local210 == local133 && this.anInt1387 == local180) {
							if (local232 >= 0 && this.aClass6_1.method285() / 520L >= (long) local232) {
								local87 = local232;
								local133++;
								@Pc(279) int local279 = 0;
								while (true) {
									if (local279 >= local158) {
										continue label55;
									}
									local131[local128++] = Static95.aByteArray18[local279 + 8];
									local279++;
								}
							}
							return null;
						}
						return null;
					}
					return local131;
				} else {
					return null;
				}
			} catch (@Pc(308) IOException local308) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1387;
	}
}
