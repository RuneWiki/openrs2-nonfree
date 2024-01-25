import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class343 {

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "Lclient!nja;")
	private Class252 aClass252_5 = null;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
	private int anInt8757 = 65000;

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "Lclient!nja;")
	private Class252 aClass252_6 = null;

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
	private final int anInt8759;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(ILclient!nja;Lclient!nja;I)V")
	public Class343(@OriginalArg(0) int arg0, @OriginalArg(1) Class252 arg1, @OriginalArg(2) Class252 arg2, @OriginalArg(3) int arg3) {
		this.anInt8757 = arg3;
		this.anInt8759 = arg0;
		this.aClass252_6 = arg2;
		this.aClass252_5 = arg1;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI[BIZ)Z")
	private boolean method7511(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class252 local8 = this.aClass252_5;
		synchronized (this.aClass252_5) {
			try {
				@Pc(22) int local22;
				if (arg3) {
					if ((long) (arg2 * 6 + 6) > this.aClass252_6.method5164()) {
						return false;
					}
					this.aClass252_6.method5153((long) (arg2 * 6));
					this.aClass252_6.method5160(Static138.aByteArray33, 6, 0);
					local22 = (Static138.aByteArray33[5] & 0xFF) + ((Static138.aByteArray33[4] & 0xFF) << 8) + ((Static138.aByteArray33[3] & 0xFF) << 16);
					if (local22 <= 0 || this.aClass252_5.method5164() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass252_5.method5164() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static138.aByteArray33[3] = (byte) (local22 >> 16);
				Static138.aByteArray33[4] = (byte) (local22 >> 8);
				Static138.aByteArray33[5] = (byte) local22;
				Static138.aByteArray33[2] = (byte) arg0;
				Static138.aByteArray33[1] = (byte) (arg0 >> 8);
				Static138.aByteArray33[0] = (byte) (arg0 >> 16);
				this.aClass252_6.method5153((long) (arg2 * 6));
				this.aClass252_6.method5163(0, 6, Static138.aByteArray33);
				@Pc(170) int local170 = 0;
				@Pc(172) int local172 = 0;
				while (arg0 > local170) {
					@Pc(176) int local176 = 0;
					@Pc(211) int local211;
					if (arg3) {
						this.aClass252_5.method5153((long) (local22 * 520));
						try {
							this.aClass252_5.method5160(Static138.aByteArray33, 8, 0);
						} catch (@Pc(195) EOFException local195) {
							return true;
						}
						local211 = (Static138.aByteArray33[1] & 0xFF) + ((Static138.aByteArray33[0] & 0xFF) << 8);
						@Pc(225) int local225 = (Static138.aByteArray33[3] & 0xFF) + ((Static138.aByteArray33[2] & 0xFF) << 8);
						local176 = ((Static138.aByteArray33[5] & 0xFF) << 8) + ((Static138.aByteArray33[4] & 0xFF) << 16) + (Static138.aByteArray33[6] & 0xFF);
						@Pc(254) int local254 = Static138.aByteArray33[7] & 0xFF;
						if (local211 != arg2 || local172 != local225 || local254 != this.anInt8759) {
							return false;
						}
						if (local176 < 0 || (long) local176 > this.aClass252_5.method5164() / 520L) {
							return false;
						}
					}
					if (local176 == 0) {
						arg3 = false;
						local176 = (int) ((this.aClass252_5.method5164() + 519L) / 520L);
						if (local176 == 0) {
							local176++;
						}
						if (local176 == local22) {
							local176++;
						}
					}
					if (arg0 - local170 <= 512) {
						local176 = 0;
					}
					Static138.aByteArray33[3] = (byte) local172;
					Static138.aByteArray33[0] = (byte) (arg2 >> 8);
					Static138.aByteArray33[1] = (byte) arg2;
					Static138.aByteArray33[2] = (byte) (local172 >> 8);
					Static138.aByteArray33[7] = (byte) this.anInt8759;
					Static138.aByteArray33[6] = (byte) local176;
					Static138.aByteArray33[4] = (byte) (local176 >> 16);
					Static138.aByteArray33[5] = (byte) (local176 >> 8);
					this.aClass252_5.method5153((long) (local22 * 520));
					this.aClass252_5.method5163(0, 8, Static138.aByteArray33);
					local211 = arg0 - local170;
					if (local211 > 512) {
						local211 = 512;
					}
					this.aClass252_5.method5163(local170, local211, arg1);
					local172++;
					local170 += local211;
					local22 = local176;
				}
				return true;
			} catch (@Pc(434) IOException local434) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)[B")
	public byte[] method7514(@OriginalArg(1) int arg0) {
		@Pc(8) Class252 local8 = this.aClass252_5;
		synchronized (this.aClass252_5) {
			try {
				if (this.aClass252_6.method5164() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass252_6.method5153((long) (arg0 * 6));
				this.aClass252_6.method5160(Static138.aByteArray33, 6, 0);
				@Pc(65) int local65 = (Static138.aByteArray33[2] & 0xFF) + ((Static138.aByteArray33[1] & 0xFF) << 8) + ((Static138.aByteArray33[0] & 0xFF) << 16);
				@Pc(87) int local87 = (Static138.aByteArray33[5] & 0xFF) + ((Static138.aByteArray33[4] & 0xFF) << 8) + ((Static138.aByteArray33[3] & 0xFF) << 16);
				if (local65 < 0 || local65 > this.anInt8757) {
					return null;
				} else if (local87 > 0 && this.aClass252_5.method5164() / 520L >= (long) local87) {
					@Pc(140) byte[] local140 = new byte[local65];
					@Pc(142) int local142 = 0;
					@Pc(144) int local144 = 0;
					while (local142 < local65) {
						if (local87 == 0) {
							return null;
						}
						this.aClass252_5.method5153((long) (local87 * 520));
						@Pc(170) int local170 = local65 - local142;
						if (local170 > 512) {
							local170 = 512;
						}
						this.aClass252_5.method5160(Static138.aByteArray33, local170 + 8, 0);
						@Pc(200) int local200 = (Static138.aByteArray33[1] & 0xFF) + ((Static138.aByteArray33[0] & 0xFF) << 8);
						@Pc(214) int local214 = (Static138.aByteArray33[3] & 0xFF) + ((Static138.aByteArray33[2] & 0xFF) << 8);
						@Pc(237) int local237 = ((Static138.aByteArray33[5] & 0xFF) << 8) + ((Static138.aByteArray33[4] & 0xFF) << 16) + (Static138.aByteArray33[6] & 0xFF);
						@Pc(243) int local243 = Static138.aByteArray33[7] & 0xFF;
						if (arg0 == local200 && local214 == local144 && local243 == this.anInt8759) {
							if (local237 >= 0 && this.aClass252_5.method5164() / 520L >= (long) local237) {
								local144++;
								for (@Pc(299) int local299 = 0; local299 < local170; local299++) {
									local140[local142++] = Static138.aByteArray33[local299 + 8];
								}
								local87 = local237;
								continue;
							}
							return null;
						}
						return null;
					}
					return local140;
				} else {
					return null;
				}
			} catch (@Pc(334) IOException local334) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZII[B)Z")
	public boolean method7515(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(6) Class252 local6 = this.aClass252_5;
		synchronized (this.aClass252_5) {
			if (arg1 < 0 || this.anInt8757 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(30) boolean local30 = this.method7511(arg1, arg2, arg0, true);
			if (!local30) {
				local30 = this.method7511(arg1, arg2, arg0, false);
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!tc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt8759;
	}
}
