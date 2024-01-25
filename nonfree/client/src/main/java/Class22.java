import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class22 {

	@OriginalMember(owner = "client!at", name = "h", descriptor = "I")
	private int anInt492 = 65000;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "Lclient!nh;")
	private Class226 aClass226_1 = null;

	@OriginalMember(owner = "client!at", name = "j", descriptor = "Lclient!nh;")
	private Class226 aClass226_2 = null;

	@OriginalMember(owner = "client!at", name = "g", descriptor = "I")
	private final int anInt491;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(ILclient!nh;Lclient!nh;I)V")
	public Class22(@OriginalArg(0) int arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) int arg3) {
		this.aClass226_1 = arg2;
		this.anInt491 = arg0;
		this.aClass226_2 = arg1;
		this.anInt492 = arg3;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIZI[B)Z")
	private boolean method437(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(8) Class226 local8 = this.aClass226_2;
		synchronized (this.aClass226_2) {
			try {
				@Pc(22) int local22;
				if (arg1) {
					if ((long) (arg0 * 6 + 6) > this.aClass226_1.method5274()) {
						return false;
					}
					this.aClass226_1.method5275((long) (arg0 * 6));
					this.aClass226_1.method5268(0, 6, Static43.aByteArray9);
					local22 = (Static43.aByteArray9[5] & 0xFF) + ((Static43.aByteArray9[4] & 0xFF) << 8) + ((Static43.aByteArray9[3] & 0xFF) << 16);
					if (local22 <= 0 || this.aClass226_2.method5274() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass226_2.method5274() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static43.aByteArray9[5] = (byte) local22;
				Static43.aByteArray9[4] = (byte) (local22 >> 8);
				Static43.aByteArray9[3] = (byte) (local22 >> 16);
				Static43.aByteArray9[1] = (byte) (arg2 >> 8);
				Static43.aByteArray9[2] = (byte) arg2;
				Static43.aByteArray9[0] = (byte) (arg2 >> 16);
				this.aClass226_1.method5275((long) (arg0 * 6));
				this.aClass226_1.method5272(0, Static43.aByteArray9, 6);
				@Pc(160) int local160 = 0;
				@Pc(162) int local162 = 0;
				while (arg2 > local160) {
					@Pc(174) int local174 = 0;
					@Pc(209) int local209;
					if (arg1) {
						this.aClass226_2.method5275((long) (local22 * 520));
						try {
							this.aClass226_2.method5268(0, 8, Static43.aByteArray9);
						} catch (@Pc(193) EOFException local193) {
							return true;
						}
						local209 = (Static43.aByteArray9[1] & 0xFF) + ((Static43.aByteArray9[0] & 0xFF) << 8);
						local174 = ((Static43.aByteArray9[4] & 0xFF) << 16) - (-((Static43.aByteArray9[5] & 0xFF) << 8) - (Static43.aByteArray9[6] & 0xFF));
						@Pc(246) int local246 = ((Static43.aByteArray9[2] & 0xFF) << 8) + (Static43.aByteArray9[3] & 0xFF);
						@Pc(252) int local252 = Static43.aByteArray9[7] & 0xFF;
						if (arg0 != local209 || local246 != local162 || this.anInt491 != local252) {
							return false;
						}
						if (local174 < 0 || (long) local174 > this.aClass226_2.method5274() / 520L) {
							return false;
						}
					}
					if (local174 == 0) {
						local174 = (int) ((this.aClass226_2.method5274() + 519L) / 520L);
						arg1 = false;
						if (local174 == 0) {
							local174++;
						}
						if (local22 == local174) {
							local174++;
						}
					}
					if (arg2 - local160 <= 512) {
						local174 = 0;
					}
					Static43.aByteArray9[3] = (byte) local162;
					Static43.aByteArray9[2] = (byte) (local162 >> 8);
					Static43.aByteArray9[1] = (byte) arg0;
					Static43.aByteArray9[0] = (byte) (arg0 >> 8);
					Static43.aByteArray9[4] = (byte) (local174 >> 16);
					Static43.aByteArray9[6] = (byte) local174;
					Static43.aByteArray9[7] = (byte) this.anInt491;
					Static43.aByteArray9[5] = (byte) (local174 >> 8);
					this.aClass226_2.method5275((long) (local22 * 520));
					this.aClass226_2.method5272(0, Static43.aByteArray9, 8);
					local209 = arg2 - local160;
					if (local209 > 512) {
						local209 = 512;
					}
					this.aClass226_2.method5272(local160, arg3, local209);
					local162++;
					local22 = local174;
					local160 += local209;
				}
				return true;
			} catch (@Pc(439) IOException local439) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "([BBII)Z")
	public boolean method438(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class226 local6 = this.aClass226_2;
		synchronized (this.aClass226_2) {
			if (arg2 < 0 || arg2 > this.anInt492) {
				throw new IllegalArgumentException();
			}
			@Pc(32) boolean local32 = this.method437(arg1, true, arg2, arg0);
			if (!local32) {
				local32 = this.method437(arg1, false, arg2, arg0);
			}
			return local32;
		}
	}

	@OriginalMember(owner = "client!at", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt491;
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(II)[B")
	public byte[] method440(@OriginalArg(0) int arg0) {
		@Pc(8) Class226 local8 = this.aClass226_2;
		synchronized (this.aClass226_2) {
			try {
				if (this.aClass226_1.method5274() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass226_1.method5275((long) (arg0 * 6));
				this.aClass226_1.method5268(0, 6, Static43.aByteArray9);
				@Pc(69) int local69 = ((Static43.aByteArray9[0] & 0xFF) << 16) + (Static43.aByteArray9[1] << 8 & 0xFF00) + (Static43.aByteArray9[2] & 0xFF);
				@Pc(91) int local91 = (Static43.aByteArray9[5] & 0xFF) + ((Static43.aByteArray9[4] & 0xFF) << 8) + ((Static43.aByteArray9[3] & 0xFF) << 16);
				if (local69 < 0 || this.anInt492 < local69) {
					return null;
				} else if (local91 > 0 && this.aClass226_2.method5274() / 520L >= (long) local91) {
					@Pc(134) byte[] local134 = new byte[local69];
					@Pc(136) int local136 = 0;
					@Pc(138) int local138 = 0;
					while (local136 < local69) {
						if (local91 == 0) {
							return null;
						}
						this.aClass226_2.method5275((long) (local91 * 520));
						@Pc(160) int local160 = local69 - local136;
						if (local160 > 512) {
							local160 = 512;
						}
						this.aClass226_2.method5268(0, local160 + 8, Static43.aByteArray9);
						@Pc(188) int local188 = ((Static43.aByteArray9[0] & 0xFF) << 8) + (Static43.aByteArray9[1] & 0xFF);
						@Pc(202) int local202 = ((Static43.aByteArray9[2] & 0xFF) << 8) + (Static43.aByteArray9[3] & 0xFF);
						@Pc(224) int local224 = (Static43.aByteArray9[6] & 0xFF) + ((Static43.aByteArray9[5] & 0xFF) << 8) + ((Static43.aByteArray9[4] & 0xFF) << 16);
						@Pc(230) int local230 = Static43.aByteArray9[7] & 0xFF;
						if (local188 == arg0 && local138 == local202 && local230 == this.anInt491) {
							if (local224 >= 0 && (long) local224 <= this.aClass226_2.method5274() / 520L) {
								for (@Pc(281) int local281 = 0; local281 < local160; local281++) {
									local134[local136++] = Static43.aByteArray9[local281 + 8];
								}
								local91 = local224;
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
			} catch (@Pc(326) IOException local326) {
				return null;
			}
		}
	}
}
