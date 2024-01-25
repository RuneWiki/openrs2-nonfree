import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class117 {

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
	private int anInt3738 = 65000;

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!up;")
	private Class240 aClass240_6 = null;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "Lclient!up;")
	private Class240 aClass240_7 = null;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
	private final int anInt3742;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(ILclient!up;Lclient!up;I)V")
	public Class117(@OriginalArg(0) int arg0, @OriginalArg(1) Class240 arg1, @OriginalArg(2) Class240 arg2, @OriginalArg(3) int arg3) {
		this.anInt3742 = arg0;
		this.aClass240_6 = arg2;
		this.aClass240_7 = arg1;
		this.anInt3738 = arg3;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)[B")
	public byte[] method3107(@OriginalArg(0) int arg0) {
		@Pc(8) Class240 local8 = this.aClass240_7;
		synchronized (this.aClass240_7) {
			try {
				if (this.aClass240_6.method5507() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass240_6.method5504((long) (arg0 * 6));
				this.aClass240_6.method5510(Static220.aByteArray53, 6, 0);
				@Pc(69) int local69 = (Static220.aByteArray53[2] & 0xFF) + ((Static220.aByteArray53[1] & 0xFF) << 8) + ((Static220.aByteArray53[0] & 0xFF) << 16);
				@Pc(91) int local91 = ((Static220.aByteArray53[3] & 0xFF) << 16) + ((Static220.aByteArray53[4] & 0xFF) << 8) + (Static220.aByteArray53[5] & 0xFF);
				if (local69 < 0 || local69 > this.anInt3738) {
					return null;
				} else if (local91 > 0 && (long) local91 <= this.aClass240_7.method5507() / 520L) {
					@Pc(131) byte[] local131 = new byte[local69];
					@Pc(133) int local133 = 0;
					@Pc(135) int local135 = 0;
					while (local133 < local69) {
						if (local91 == 0) {
							return null;
						}
						this.aClass240_7.method5504((long) (local91 * 520));
						@Pc(160) int local160 = local69 - local133;
						if (local160 > 512) {
							local160 = 512;
						}
						this.aClass240_7.method5510(Static220.aByteArray53, local160 + 8, 0);
						@Pc(188) int local188 = (Static220.aByteArray53[1] & 0xFF) + ((Static220.aByteArray53[0] & 0xFF) << 8);
						@Pc(203) int local203 = ((Static220.aByteArray53[2] & 0xFF) << 8) + (Static220.aByteArray53[3] & 0xFF);
						@Pc(226) int local226 = ((Static220.aByteArray53[5] & 0xFF) << 8) + ((Static220.aByteArray53[4] & 0xFF) << 16) + (Static220.aByteArray53[6] & 0xFF);
						@Pc(232) int local232 = Static220.aByteArray53[7] & 0xFF;
						if (arg0 == local188 && local135 == local203 && local232 == this.anInt3742) {
							if (local226 >= 0 && (long) local226 <= this.aClass240_7.method5507() / 520L) {
								local135++;
								for (@Pc(284) int local284 = 0; local284 < local160; local284++) {
									local131[local133++] = Static220.aByteArray53[local284 + 8];
								}
								local91 = local226;
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
			} catch (@Pc(323) IOException local323) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt3742;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI[BI)Z")
	public boolean method3108(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class240 local6 = this.aClass240_7;
		synchronized (this.aClass240_7) {
			if (arg2 < 0 || arg2 > this.anInt3738) {
				throw new IllegalArgumentException();
			}
			@Pc(38) boolean local38 = this.method3110(arg1, arg2, true, arg0);
			if (!local38) {
				local38 = this.method3110(arg1, arg2, false, arg0);
			}
			return local38;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([BIZBI)Z")
	private boolean method3110(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class240 local8 = this.aClass240_7;
		synchronized (this.aClass240_7) {
			try {
				@Pc(24) int local24;
				if (arg2) {
					if ((long) (arg3 * 6 + 6) > this.aClass240_6.method5507()) {
						return false;
					}
					this.aClass240_6.method5504((long) (arg3 * 6));
					this.aClass240_6.method5510(Static220.aByteArray53, 6, 0);
					local24 = ((Static220.aByteArray53[3] & 0xFF) << 16) - (-(Static220.aByteArray53[4] << 8 & 0xFF00) - (Static220.aByteArray53[5] & 0xFF));
					if (local24 <= 0 || this.aClass240_7.method5507() / 520L < (long) local24) {
						return false;
					}
				} else {
					local24 = (int) ((this.aClass240_7.method5507() + 519L) / 520L);
					if (local24 == 0) {
						local24 = 1;
					}
				}
				Static220.aByteArray53[2] = (byte) arg1;
				Static220.aByteArray53[4] = (byte) (local24 >> 8);
				Static220.aByteArray53[3] = (byte) (local24 >> 16);
				Static220.aByteArray53[0] = (byte) (arg1 >> 16);
				Static220.aByteArray53[5] = (byte) local24;
				Static220.aByteArray53[1] = (byte) (arg1 >> 8);
				this.aClass240_6.method5504((long) (arg3 * 6));
				this.aClass240_6.method5503(Static220.aByteArray53, 0, 6);
				@Pc(180) int local180 = 0;
				@Pc(182) int local182 = 0;
				while (local180 < arg1) {
					@Pc(186) int local186 = 0;
					@Pc(222) int local222;
					if (arg2) {
						this.aClass240_7.method5504((long) (local24 * 520));
						try {
							this.aClass240_7.method5510(Static220.aByteArray53, 8, 0);
						} catch (@Pc(205) EOFException local205) {
							return true;
						}
						local222 = ((Static220.aByteArray53[0] & 0xFF) << 8) + (Static220.aByteArray53[1] & 0xFF);
						local186 = (Static220.aByteArray53[6] & 0xFF) + ((Static220.aByteArray53[5] & 0xFF) << 8) + ((Static220.aByteArray53[4] & 0xFF) << 16);
						@Pc(258) int local258 = (Static220.aByteArray53[3] & 0xFF) + ((Static220.aByteArray53[2] & 0xFF) << 8);
						@Pc(264) int local264 = Static220.aByteArray53[7] & 0xFF;
						if (local222 != arg3 || local258 != local182 || local264 != this.anInt3742) {
							return false;
						}
						if (local186 < 0 || this.aClass240_7.method5507() / 520L < (long) local186) {
							return false;
						}
					}
					if (local186 == 0) {
						arg2 = false;
						local186 = (int) ((this.aClass240_7.method5507() + 519L) / 520L);
						if (local186 == 0) {
							local186++;
						}
						if (local24 == local186) {
							local186++;
						}
					}
					Static220.aByteArray53[1] = (byte) arg3;
					if (arg1 - local180 <= 512) {
						local186 = 0;
					}
					Static220.aByteArray53[3] = (byte) local182;
					Static220.aByteArray53[2] = (byte) (local182 >> 8);
					Static220.aByteArray53[0] = (byte) (arg3 >> 8);
					Static220.aByteArray53[4] = (byte) (local186 >> 16);
					Static220.aByteArray53[7] = (byte) this.anInt3742;
					Static220.aByteArray53[5] = (byte) (local186 >> 8);
					Static220.aByteArray53[6] = (byte) local186;
					this.aClass240_7.method5504((long) (local24 * 520));
					this.aClass240_7.method5503(Static220.aByteArray53, 0, 8);
					local222 = arg1 - local180;
					if (local222 > 512) {
						local222 = 512;
					}
					this.aClass240_7.method5503(arg0, local180, local222);
					local182++;
					local180 += local222;
					local24 = local186;
				}
				return true;
			} catch (@Pc(449) IOException local449) {
				return false;
			}
		}
	}
}
