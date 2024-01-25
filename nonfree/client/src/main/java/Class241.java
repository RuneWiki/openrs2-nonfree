import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!naa")
public final class Class241 {

	@OriginalMember(owner = "client!naa", name = "c", descriptor = "Lclient!hp;")
	private Class152 aClass152_3 = null;

	@OriginalMember(owner = "client!naa", name = "j", descriptor = "I")
	private int anInt6470 = 65000;

	@OriginalMember(owner = "client!naa", name = "i", descriptor = "Lclient!hp;")
	private Class152 aClass152_4 = null;

	@OriginalMember(owner = "client!naa", name = "d", descriptor = "I")
	private final int anInt6466;

	@OriginalMember(owner = "client!naa", name = "<init>", descriptor = "(ILclient!hp;Lclient!hp;I)V")
	public Class241(@OriginalArg(0) int arg0, @OriginalArg(1) Class152 arg1, @OriginalArg(2) Class152 arg2, @OriginalArg(3) int arg3) {
		this.anInt6466 = arg0;
		this.aClass152_3 = arg1;
		this.aClass152_4 = arg2;
		this.anInt6470 = arg3;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(BI)[B")
	public byte[] method5431(@OriginalArg(1) int arg0) {
		@Pc(8) Class152 local8 = this.aClass152_3;
		synchronized (this.aClass152_3) {
			try {
				if (this.aClass152_4.method3507() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass152_4.method3506((long) (arg0 * 6));
				this.aClass152_4.method3505(6, 0, Static169.aByteArray17);
				@Pc(75) int local75 = ((Static169.aByteArray17[0] & 0xFF) << 16) + (((Static169.aByteArray17[1] & 0xFF) << 8) + (Static169.aByteArray17[2] & 0xFF));
				@Pc(97) int local97 = ((Static169.aByteArray17[4] & 0xFF) << 8) + (Static169.aByteArray17[3] << 16 & 0xFF0000) + (Static169.aByteArray17[5] & 0xFF);
				if (local75 < 0 || this.anInt6470 < local75) {
					return null;
				} else if (local97 > 0 && this.aClass152_3.method3507() / 520L >= (long) local97) {
					@Pc(134) byte[] local134 = new byte[local75];
					@Pc(136) int local136 = 0;
					@Pc(138) int local138 = 0;
					while (local136 < local75) {
						if (local97 == 0) {
							return null;
						}
						this.aClass152_3.method3506((long) (local97 * 520));
						@Pc(164) int local164 = local75 - local136;
						if (local164 > 512) {
							local164 = 512;
						}
						this.aClass152_3.method3505(local164 + 8, 0, Static169.aByteArray17);
						@Pc(195) int local195 = ((Static169.aByteArray17[0] & 0xFF) << 8) + (Static169.aByteArray17[1] & 0xFF);
						@Pc(209) int local209 = ((Static169.aByteArray17[2] & 0xFF) << 8) + (Static169.aByteArray17[3] & 0xFF);
						@Pc(232) int local232 = (Static169.aByteArray17[6] & 0xFF) + (((Static169.aByteArray17[4] & 0xFF) << 16) + ((Static169.aByteArray17[5] & 0xFF) << 8));
						@Pc(238) int local238 = Static169.aByteArray17[7] & 0xFF;
						if (arg0 == local195 && local138 == local209 && local238 == this.anInt6466) {
							if (local232 >= 0 && this.aClass152_3.method3507() / 520L >= (long) local232) {
								for (@Pc(286) int local286 = 0; local286 < local164; local286++) {
									local134[local136++] = Static169.aByteArray17[local286 + 8];
								}
								local97 = local232;
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
			} catch (@Pc(322) IOException local322) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!naa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt6466;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "([BIIZ)Z")
	public boolean method5434(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class152 local6 = this.aClass152_3;
		synchronized (this.aClass152_3) {
			if (arg2 < 0 || arg2 > this.anInt6470) {
				throw new IllegalArgumentException();
			}
			@Pc(30) boolean local30 = this.method5435(arg2, arg0, arg1, true);
			if (!local30) {
				local30 = this.method5435(arg2, arg0, arg1, false);
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(I[BBIZ)Z")
	private boolean method5435(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class152 local8 = this.aClass152_3;
		synchronized (this.aClass152_3) {
			try {
				@Pc(22) int local22;
				if (arg3) {
					if (this.aClass152_4.method3507() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass152_4.method3506((long) (arg2 * 6));
					this.aClass152_4.method3505(6, 0, Static169.aByteArray17);
					local22 = (Static169.aByteArray17[5] & 0xFF) + ((Static169.aByteArray17[3] & 0xFF) << 16) + ((Static169.aByteArray17[4] & 0xFF) << 8);
					if (local22 <= 0 || this.aClass152_3.method3507() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass152_3.method3507() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static169.aByteArray17[3] = (byte) (local22 >> 16);
				Static169.aByteArray17[1] = (byte) (arg0 >> 8);
				Static169.aByteArray17[0] = (byte) (arg0 >> 16);
				Static169.aByteArray17[4] = (byte) (local22 >> 8);
				Static169.aByteArray17[2] = (byte) arg0;
				Static169.aByteArray17[5] = (byte) local22;
				this.aClass152_4.method3506((long) (arg2 * 6));
				this.aClass152_4.method3499(Static169.aByteArray17, 6, 0);
				@Pc(173) int local173 = 0;
				@Pc(175) int local175 = 0;
				while (local173 < arg0) {
					@Pc(179) int local179 = 0;
					@Pc(216) int local216;
					if (arg3) {
						this.aClass152_3.method3506((long) (local22 * 520));
						try {
							this.aClass152_3.method3505(8, 0, Static169.aByteArray17);
						} catch (@Pc(200) EOFException local200) {
							return true;
						}
						local216 = (Static169.aByteArray17[1] & 0xFF) + ((Static169.aByteArray17[0] & 0xFF) << 8);
						local179 = (Static169.aByteArray17[6] & 0xFF) + ((Static169.aByteArray17[4] & 0xFF) << 16) + ((Static169.aByteArray17[5] & 0xFF) << 8);
						@Pc(253) int local253 = (Static169.aByteArray17[3] & 0xFF) + ((Static169.aByteArray17[2] & 0xFF) << 8);
						@Pc(259) int local259 = Static169.aByteArray17[7] & 0xFF;
						if (arg2 != local216 || local253 != local175 || local259 != this.anInt6466) {
							return false;
						}
						if (local179 < 0 || this.aClass152_3.method3507() / 520L < (long) local179) {
							return false;
						}
					}
					if (local179 == 0) {
						local179 = (int) ((this.aClass152_3.method3507() + 519L) / 520L);
						arg3 = false;
						if (local179 == 0) {
							local179++;
						}
						if (local179 == local22) {
							local179++;
						}
					}
					Static169.aByteArray17[1] = (byte) arg2;
					Static169.aByteArray17[2] = (byte) (local175 >> 8);
					Static169.aByteArray17[3] = (byte) local175;
					Static169.aByteArray17[0] = (byte) (arg2 >> 8);
					if (arg0 - local173 <= 512) {
						local179 = 0;
					}
					Static169.aByteArray17[6] = (byte) local179;
					Static169.aByteArray17[5] = (byte) (local179 >> 8);
					Static169.aByteArray17[7] = (byte) this.anInt6466;
					Static169.aByteArray17[4] = (byte) (local179 >> 16);
					this.aClass152_3.method3506((long) (local22 * 520));
					this.aClass152_3.method3499(Static169.aByteArray17, 8, 0);
					local216 = arg0 - local173;
					if (local216 > 512) {
						local216 = 512;
					}
					this.aClass152_3.method3499(arg1, local216, local173);
					local175++;
					local173 += local216;
					local22 = local179;
				}
				return true;
			} catch (@Pc(448) IOException local448) {
				return false;
			}
		}
	}
}
