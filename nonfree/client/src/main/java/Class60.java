import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class60 {

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
	private int anInt2172 = 65000;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "Lclient!b;")
	private Class6 aClass6_1 = null;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Lclient!b;")
	private Class6 aClass6_2 = null;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
	private final int anInt2168;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(ILclient!b;Lclient!b;I)V")
	public Class60(@OriginalArg(0) int arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) int arg3) {
		this.anInt2172 = arg3;
		this.aClass6_1 = arg2;
		this.aClass6_2 = arg1;
		this.anInt2168 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI[BII)Z")
	private boolean method1323(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class6 local8 = this.aClass6_2;
		synchronized (this.aClass6_2) {
			try {
				@Pc(68) int local68;
				if (arg0) {
					if (this.aClass6_1.method116() < (long) (arg3 * 6 + 6)) {
						return false;
					}
					this.aClass6_1.method114((long) (arg3 * 6));
					this.aClass6_1.method111(0, Static77.aByteArray27, 6);
					local68 = (Static77.aByteArray27[5] & 0xFF) + ((Static77.aByteArray27[3] & 0xFF) << 16) + ((Static77.aByteArray27[4] & 0xFF) << 8);
					if (local68 <= 0 || (long) local68 > this.aClass6_2.method116() / 520L) {
						return false;
					}
				} else {
					local68 = (int) ((this.aClass6_2.method116() + 519L) / 520L);
					if (local68 == 0) {
						local68 = 1;
					}
				}
				Static77.aByteArray27[0] = (byte) (arg1 >> 16);
				Static77.aByteArray27[5] = (byte) local68;
				Static77.aByteArray27[3] = (byte) (local68 >> 16);
				Static77.aByteArray27[1] = (byte) (arg1 >> 8);
				Static77.aByteArray27[2] = (byte) arg1;
				Static77.aByteArray27[4] = (byte) (local68 >> 8);
				this.aClass6_1.method114((long) (arg3 * 6));
				this.aClass6_1.method110(0, 6, Static77.aByteArray27);
				@Pc(175) int local175 = 0;
				@Pc(177) int local177 = 0;
				while (arg1 > local175) {
					@Pc(181) int local181 = 0;
					@Pc(238) int local238;
					if (arg0) {
						this.aClass6_2.method114((long) (local68 * 520));
						try {
							this.aClass6_2.method111(0, Static77.aByteArray27, 8);
						} catch (@Pc(200) EOFException local200) {
							return true;
						}
						local181 = ((Static77.aByteArray27[5] & 0xFF) << 8) + ((Static77.aByteArray27[4] & 0xFF) << 16) + (Static77.aByteArray27[6] & 0xFF);
						local238 = (Static77.aByteArray27[1] & 0xFF) + ((Static77.aByteArray27[0] & 0xFF) << 8);
						@Pc(253) int local253 = ((Static77.aByteArray27[2] & 0xFF) << 8) + (Static77.aByteArray27[3] & 0xFF);
						@Pc(259) int local259 = Static77.aByteArray27[7] & 0xFF;
						if (arg3 != local238 || local177 != local253 || this.anInt2168 != local259) {
							return false;
						}
						if (local181 < 0 || this.aClass6_2.method116() / 520L < (long) local181) {
							return false;
						}
					}
					if (local181 == 0) {
						local181 = (int) ((this.aClass6_2.method116() + 519L) / 520L);
						arg0 = false;
						if (local181 == 0) {
							local181++;
						}
						if (local68 == local181) {
							local181++;
						}
					}
					if (arg1 - local175 <= 512) {
						local181 = 0;
					}
					Static77.aByteArray27[0] = (byte) (arg3 >> 8);
					Static77.aByteArray27[2] = (byte) (local177 >> 8);
					local238 = arg1 - local175;
					Static77.aByteArray27[3] = (byte) local177;
					if (local238 > 512) {
						local238 = 512;
					}
					Static77.aByteArray27[5] = (byte) (local181 >> 8);
					Static77.aByteArray27[7] = (byte) this.anInt2168;
					Static77.aByteArray27[4] = (byte) (local181 >> 16);
					Static77.aByteArray27[6] = (byte) local181;
					local177++;
					Static77.aByteArray27[1] = (byte) arg3;
					this.aClass6_2.method114((long) (local68 * 520));
					local68 = local181;
					this.aClass6_2.method110(0, 8, Static77.aByteArray27);
					this.aClass6_2.method110(local175, local238, arg2);
					local175 += local238;
				}
				return true;
			} catch (@Pc(442) IOException local442) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II[BI)Z")
	public boolean method1325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(11) Class6 local11 = this.aClass6_2;
		synchronized (this.aClass6_2) {
			if (arg0 < 0 || arg0 > this.anInt2172) {
				throw new IllegalArgumentException();
			}
			@Pc(37) boolean local37 = this.method1323(true, arg0, arg2, arg1);
			if (!local37) {
				local37 = this.method1323(false, arg0, arg2, arg1);
			}
			return local37;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)[B")
	public byte[] method1326(@OriginalArg(1) int arg0) {
		@Pc(8) Class6 local8 = this.aClass6_2;
		synchronized (this.aClass6_2) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass6_1.method116()) {
					return null;
				}
				this.aClass6_1.method114((long) (arg0 * 6));
				this.aClass6_1.method111(0, Static77.aByteArray27, 6);
				@Pc(65) int local65 = (Static77.aByteArray27[2] & 0xFF) + ((Static77.aByteArray27[1] & 0xFF) << 8) + ((Static77.aByteArray27[0] & 0xFF) << 16);
				@Pc(87) int local87 = ((Static77.aByteArray27[4] & 0xFF) << 8) + (Static77.aByteArray27[3] << 16 & 0xFF0000) + (Static77.aByteArray27[5] & 0xFF);
				if (local65 < 0 || local65 > this.anInt2172) {
					return null;
				} else if (local87 > 0 && this.aClass6_2.method116() / 520L >= (long) local87) {
					@Pc(128) int local128 = 0;
					@Pc(131) byte[] local131 = new byte[local65];
					@Pc(133) int local133 = 0;
					while (local128 < local65) {
						if (local87 == 0) {
							return null;
						}
						this.aClass6_2.method114((long) (local87 * 520));
						@Pc(159) int local159 = local65 - local128;
						if (local159 > 512) {
							local159 = 512;
						}
						this.aClass6_2.method111(0, Static77.aByteArray27, local159 + 8);
						@Pc(189) int local189 = (Static77.aByteArray27[3] & 0xFF) + ((Static77.aByteArray27[2] & 0xFF) << 8);
						@Pc(195) int local195 = Static77.aByteArray27[7] & 0xFF;
						@Pc(209) int local209 = (Static77.aByteArray27[1] & 0xFF) + ((Static77.aByteArray27[0] & 0xFF) << 8);
						@Pc(232) int local232 = ((Static77.aByteArray27[5] & 0xFF) << 8) + (((Static77.aByteArray27[4] & 0xFF) << 16) + (Static77.aByteArray27[6] & 0xFF));
						if (arg0 == local209 && local189 == local133 && this.anInt2168 == local195) {
							if (local232 >= 0 && (long) local232 <= this.aClass6_2.method116() / 520L) {
								local87 = local232;
								for (@Pc(282) int local282 = 0; local282 < local159; local282++) {
									local131[local128++] = Static77.aByteArray27[local282 + 8];
								}
								local133++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local131;
				} else {
					return null;
				}
			} catch (@Pc(312) IOException local312) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2168;
	}
}
