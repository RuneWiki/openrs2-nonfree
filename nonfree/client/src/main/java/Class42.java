import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class42 {

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "Lclient!qc;")
	private Class53 aClass53_5 = null;

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
	private int anInt1671 = 65000;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "Lclient!qc;")
	private Class53 aClass53_4 = null;

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
	private final int anInt1678;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(ILclient!qc;Lclient!qc;I)V")
	public Class42(@OriginalArg(0) int arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) Class53 arg2, @OriginalArg(3) int arg3) {
		this.anInt1671 = arg3;
		this.anInt1678 = arg0;
		this.aClass53_4 = arg2;
		this.aClass53_5 = arg1;
	}

	@OriginalMember(owner = "client!ld", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt1678;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[B")
	public byte[] method1157(@OriginalArg(0) int arg0) {
		@Pc(8) Class53 local8 = this.aClass53_5;
		synchronized (this.aClass53_5) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass53_4.method1625()) {
					return null;
				}
				this.aClass53_4.method1630((long) (arg0 * 6));
				this.aClass53_4.method1623(0, Static101.aByteArray25, 6);
				@Pc(74) int local74 = (Static101.aByteArray25[2] & 0xFF) + ((Static101.aByteArray25[1] & 0xFF) << 8) + ((Static101.aByteArray25[0] & 0xFF) << 16);
				@Pc(97) int local97 = ((Static101.aByteArray25[3] & 0xFF) << 16) + ((Static101.aByteArray25[4] & 0xFF) << 8) + (Static101.aByteArray25[5] & 0xFF);
				if (local74 < 0 || local74 > this.anInt1671) {
					return null;
				} else if (local97 > 0 && this.aClass53_5.method1625() / 520L >= (long) local97) {
					@Pc(136) int local136 = 0;
					@Pc(138) int local138 = 0;
					@Pc(141) byte[] local141 = new byte[local74];
					while (local74 > local136) {
						if (local97 == 0) {
							return null;
						}
						this.aClass53_5.method1630((long) (local97 * 520));
						@Pc(164) int local164 = local74 - local136;
						if (local164 > 512) {
							local164 = 512;
						}
						this.aClass53_5.method1623(0, Static101.aByteArray25, local164 + 8);
						@Pc(194) int local194 = (Static101.aByteArray25[1] & 0xFF) + ((Static101.aByteArray25[0] & 0xFF) << 8);
						@Pc(216) int local216 = ((Static101.aByteArray25[5] & 0xFF) << 8) + (Static101.aByteArray25[4] << 16 & 0xFF0000) + (Static101.aByteArray25[6] & 0xFF);
						@Pc(230) int local230 = ((Static101.aByteArray25[2] & 0xFF) << 8) + (Static101.aByteArray25[3] & 0xFF);
						@Pc(236) int local236 = Static101.aByteArray25[7] & 0xFF;
						if (arg0 == local194 && local138 == local230 && local236 == this.anInt1678) {
							if (local216 >= 0 && this.aClass53_5.method1625() / 520L >= (long) local216) {
								for (@Pc(280) int local280 = 0; local280 < local164; local280++) {
									local141[local136++] = Static101.aByteArray25[local280 + 8];
								}
								local97 = local216;
								local138++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local141;
				} else {
					return null;
				}
			} catch (@Pc(308) IOException local308) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[BII)Z")
	public boolean method1159(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class53 local6 = this.aClass53_5;
		synchronized (this.aClass53_5) {
			if (arg0 < 0 || arg0 > this.anInt1671) {
				throw new IllegalArgumentException();
			}
			@Pc(29) boolean local29 = this.method1163(arg2, arg1, true, arg0);
			if (!local29) {
				local29 = this.method1163(arg2, arg1, false, arg0);
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II[BZI)Z")
	private boolean method1163(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class53 local16 = this.aClass53_5;
		synchronized (this.aClass53_5) {
			try {
				@Pc(30) int local30;
				if (arg2) {
					if (this.aClass53_4.method1625() < (long) (arg0 * 6 + 6)) {
						return false;
					}
					this.aClass53_4.method1630((long) (arg0 * 6));
					this.aClass53_4.method1623(0, Static101.aByteArray25, 6);
					local30 = ((Static101.aByteArray25[4] & 0xFF) << 8) + ((Static101.aByteArray25[3] & 0xFF) << 16) + (Static101.aByteArray25[5] & 0xFF);
					if (local30 <= 0 || this.aClass53_5.method1625() / 520L < (long) local30) {
						return false;
					}
				} else {
					local30 = (int) ((this.aClass53_5.method1625() + 519L) / 520L);
					if (local30 == 0) {
						local30 = 1;
					}
				}
				Static101.aByteArray25[0] = (byte) (arg3 >> 16);
				@Pc(121) int local121 = 0;
				Static101.aByteArray25[1] = (byte) (arg3 >> 8);
				Static101.aByteArray25[2] = (byte) arg3;
				Static101.aByteArray25[3] = (byte) (local30 >> 16);
				Static101.aByteArray25[4] = (byte) (local30 >> 8);
				Static101.aByteArray25[5] = (byte) local30;
				@Pc(154) int local154 = 0;
				this.aClass53_4.method1630((long) (arg0 * 6));
				this.aClass53_4.method1631(6, 0, Static101.aByteArray25);
				while (local121 < arg3) {
					@Pc(173) int local173 = 0;
					@Pc(232) int local232;
					if (arg2) {
						this.aClass53_5.method1630((long) (local30 * 520));
						try {
							this.aClass53_5.method1623(0, Static101.aByteArray25, 8);
						} catch (@Pc(192) EOFException local192) {
							return true;
						}
						local173 = ((Static101.aByteArray25[5] & 0xFF) << 8) + ((Static101.aByteArray25[4] << 16 & 0xFF0000) + (Static101.aByteArray25[6] & 0xFF));
						local232 = ((Static101.aByteArray25[0] & 0xFF) << 8) + (Static101.aByteArray25[1] & 0xFF);
						@Pc(238) int local238 = Static101.aByteArray25[7] & 0xFF;
						@Pc(253) int local253 = ((Static101.aByteArray25[2] & 0xFF) << 8) + (Static101.aByteArray25[3] & 0xFF);
						if (local232 != arg0 || local253 != local154 || this.anInt1678 != local238) {
							return false;
						}
						if (local173 < 0 || this.aClass53_5.method1625() / 520L < (long) local173) {
							return false;
						}
					}
					if (local173 == 0) {
						arg2 = false;
						local173 = (int) ((this.aClass53_5.method1625() + 519L) / 520L);
						if (local173 == 0) {
							local173++;
						}
						if (local173 == local30) {
							local173++;
						}
					}
					local232 = arg3 - local121;
					Static101.aByteArray25[0] = (byte) (arg0 >> 8);
					Static101.aByteArray25[1] = (byte) arg0;
					Static101.aByteArray25[2] = (byte) (local154 >> 8);
					if (arg3 - local121 <= 512) {
						local173 = 0;
					}
					Static101.aByteArray25[3] = (byte) local154;
					local154++;
					if (local232 > 512) {
						local232 = 512;
					}
					Static101.aByteArray25[4] = (byte) (local173 >> 16);
					Static101.aByteArray25[5] = (byte) (local173 >> 8);
					Static101.aByteArray25[6] = (byte) local173;
					Static101.aByteArray25[7] = (byte) this.anInt1678;
					this.aClass53_5.method1630((long) (local30 * 520));
					local30 = local173;
					this.aClass53_5.method1631(8, 0, Static101.aByteArray25);
					this.aClass53_5.method1631(local232, local121, arg1);
					local121 += local232;
				}
				return true;
			} catch (@Pc(440) IOException local440) {
				return false;
			}
		}
	}
}
