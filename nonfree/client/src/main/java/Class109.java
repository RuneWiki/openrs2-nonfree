import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class109 {

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
	private int anInt2882 = 65000;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "Lclient!lv;")
	private Class193 aClass193_2 = null;

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "Lclient!lv;")
	private Class193 aClass193_3 = null;

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
	private final int anInt2881;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(ILclient!lv;Lclient!lv;I)V")
	public Class109(@OriginalArg(0) int arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(2) Class193 arg2, @OriginalArg(3) int arg3) {
		this.aClass193_2 = arg2;
		this.anInt2881 = arg0;
		this.aClass193_3 = arg1;
		this.anInt2882 = arg3;
	}

	@OriginalMember(owner = "client!fo", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2881;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "([BIBI)Z")
	public boolean method2455(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class193 local6 = this.aClass193_3;
		synchronized (this.aClass193_3) {
			if (arg1 < 0 || this.anInt2882 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(29) boolean local29 = this.method2456(true, arg2, arg0, arg1);
			if (!local29) {
				local29 = this.method2456(false, arg2, arg0, arg1);
			}
			return local29;
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZI[BIB)Z")
	private boolean method2456(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class193 local8 = this.aClass193_3;
		synchronized (this.aClass193_3) {
			try {
				@Pc(22) int local22;
				if (arg0) {
					if ((long) (arg1 * 6 + 6) > this.aClass193_2.method4603()) {
						return false;
					}
					this.aClass193_2.method4607((long) (arg1 * 6));
					this.aClass193_2.method4604(Static332.aByteArray82, 0, 6);
					local22 = (Static332.aByteArray82[5] & 0xFF) + ((Static332.aByteArray82[4] & 0xFF) << 8) + ((Static332.aByteArray82[3] & 0xFF) << 16);
					if (local22 <= 0 || (long) local22 > this.aClass193_3.method4603() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass193_3.method4603() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static332.aByteArray82[3] = (byte) (local22 >> 16);
				Static332.aByteArray82[4] = (byte) (local22 >> 8);
				Static332.aByteArray82[2] = (byte) arg3;
				Static332.aByteArray82[5] = (byte) local22;
				Static332.aByteArray82[0] = (byte) (arg3 >> 16);
				Static332.aByteArray82[1] = (byte) (arg3 >> 8);
				this.aClass193_2.method4607((long) (arg1 * 6));
				this.aClass193_2.method4599(6, 0, Static332.aByteArray82);
				@Pc(177) int local177 = 0;
				@Pc(179) int local179 = 0;
				while (arg3 > local177) {
					@Pc(183) int local183 = 0;
					@Pc(220) int local220;
					if (arg0) {
						this.aClass193_3.method4607((long) (local22 * 520));
						try {
							this.aClass193_3.method4604(Static332.aByteArray82, 0, 8);
						} catch (@Pc(204) EOFException local204) {
							return true;
						}
						local220 = (Static332.aByteArray82[1] & 0xFF) + ((Static332.aByteArray82[0] & 0xFF) << 8);
						@Pc(234) int local234 = (Static332.aByteArray82[3] & 0xFF) + ((Static332.aByteArray82[2] & 0xFF) << 8);
						local183 = ((Static332.aByteArray82[5] & 0xFF) << 8) + (Static332.aByteArray82[4] << 16 & 0xFF0000) + (Static332.aByteArray82[6] & 0xFF);
						@Pc(263) int local263 = Static332.aByteArray82[7] & 0xFF;
						if (local220 != arg1 || local234 != local179 || this.anInt2881 != local263) {
							return false;
						}
						if (local183 < 0 || this.aClass193_3.method4603() / 520L < (long) local183) {
							return false;
						}
					}
					if (local183 == 0) {
						arg0 = false;
						local183 = (int) ((this.aClass193_3.method4603() + 519L) / 520L);
						if (local183 == 0) {
							local183++;
						}
						if (local183 == local22) {
							local183++;
						}
					}
					Static332.aByteArray82[1] = (byte) arg1;
					Static332.aByteArray82[0] = (byte) (arg1 >> 8);
					if (arg3 - local177 <= 512) {
						local183 = 0;
					}
					Static332.aByteArray82[3] = (byte) local179;
					Static332.aByteArray82[2] = (byte) (local179 >> 8);
					Static332.aByteArray82[5] = (byte) (local183 >> 8);
					Static332.aByteArray82[7] = (byte) this.anInt2881;
					Static332.aByteArray82[4] = (byte) (local183 >> 16);
					Static332.aByteArray82[6] = (byte) local183;
					this.aClass193_3.method4607((long) (local22 * 520));
					this.aClass193_3.method4599(8, 0, Static332.aByteArray82);
					local220 = arg3 - local177;
					if (local220 > 512) {
						local220 = 512;
					}
					this.aClass193_3.method4599(local220, local177, arg2);
					local22 = local183;
					local177 += local220;
					local179++;
				}
				return true;
			} catch (@Pc(448) IOException local448) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)[B")
	public byte[] method2457(@OriginalArg(1) int arg0) {
		@Pc(8) Class193 local8 = this.aClass193_3;
		synchronized (this.aClass193_3) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass193_2.method4603()) {
					return null;
				}
				this.aClass193_2.method4607((long) (arg0 * 6));
				this.aClass193_2.method4604(Static332.aByteArray82, 0, 6);
				@Pc(66) int local66 = ((Static332.aByteArray82[0] & 0xFF) << 16) + ((Static332.aByteArray82[1] & 0xFF) << 8) + (Static332.aByteArray82[2] & 0xFF);
				@Pc(88) int local88 = (Static332.aByteArray82[5] & 0xFF) + ((Static332.aByteArray82[3] & 0xFF) << 16) + ((Static332.aByteArray82[4] & 0xFF) << 8);
				if (local66 < 0 || local66 > this.anInt2882) {
					return null;
				} else if (local88 > 0 && this.aClass193_3.method4603() / 520L >= (long) local88) {
					@Pc(134) byte[] local134 = new byte[local66];
					@Pc(136) int local136 = 0;
					@Pc(138) int local138 = 0;
					while (local136 < local66) {
						if (local88 == 0) {
							return null;
						}
						this.aClass193_3.method4607((long) (local88 * 520));
						@Pc(164) int local164 = local66 - local136;
						if (local164 > 512) {
							local164 = 512;
						}
						this.aClass193_3.method4604(Static332.aByteArray82, 0, local164 + 8);
						@Pc(192) int local192 = (Static332.aByteArray82[1] & 0xFF) + ((Static332.aByteArray82[0] & 0xFF) << 8);
						@Pc(207) int local207 = ((Static332.aByteArray82[2] & 0xFF) << 8) + (Static332.aByteArray82[3] & 0xFF);
						@Pc(229) int local229 = ((Static332.aByteArray82[5] & 0xFF) << 8) + ((Static332.aByteArray82[4] & 0xFF) << 16) + (Static332.aByteArray82[6] & 0xFF);
						@Pc(235) int local235 = Static332.aByteArray82[7] & 0xFF;
						if (local192 == arg0 && local138 == local207 && local235 == this.anInt2881) {
							if (local229 >= 0 && (long) local229 <= this.aClass193_3.method4603() / 520L) {
								local88 = local229;
								for (@Pc(285) int local285 = 0; local285 < local164; local285++) {
									local134[local136++] = Static332.aByteArray82[local285 + 8];
								}
								local138++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local134;
				} else {
					return null;
				}
			} catch (@Pc(315) IOException local315) {
				return null;
			}
		}
	}
}
