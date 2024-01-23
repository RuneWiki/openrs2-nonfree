import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class90 {

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "Lclient!me;")
	private Class66 aClass66_4 = null;

	@OriginalMember(owner = "client!sf", name = "q", descriptor = "Lclient!me;")
	private Class66 aClass66_5 = null;

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
	private int anInt3839 = 65000;

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
	private int anInt3842;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(ILclient!me;Lclient!me;I)V")
	public Class90(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) Class66 arg2, @OriginalArg(3) int arg3) {
		this.anInt3839 = arg3;
		this.aClass66_5 = arg1;
		this.anInt3842 = arg0;
		this.aClass66_4 = arg2;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([BIII)Z")
	public boolean method2856(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class66 local12 = this.aClass66_5;
		synchronized (this.aClass66_5) {
			if (arg2 < 0 || arg2 > this.anInt3839) {
				throw new IllegalArgumentException();
			}
			@Pc(39) boolean local39 = this.method2857(arg2, true, arg1, arg0);
			if (!local39) {
				local39 = this.method2857(arg2, false, arg1, arg0);
			}
			return local39;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZI[BB)Z")
	private boolean method2857(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		@Pc(8) Class66 local8 = this.aClass66_5;
		synchronized (this.aClass66_5) {
			try {
				@Pc(22) int local22;
				if (arg1) {
					if (this.aClass66_4.method2038() < (long) (arg2 * 6 + 6)) {
						return false;
					}
					this.aClass66_4.method2030((long) (arg2 * 6));
					this.aClass66_4.method2035(6, 0, Static114.aByteArray35);
					local22 = ((Static114.aByteArray35[3] & 0xFF) << 16) - (-(Static114.aByteArray35[4] << 8 & 0xFF00) - (Static114.aByteArray35[5] & 0xFF));
					if (local22 <= 0 || this.aClass66_5.method2038() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass66_5.method2038() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static114.aByteArray35[5] = (byte) local22;
				Static114.aByteArray35[2] = (byte) arg0;
				Static114.aByteArray35[4] = (byte) (local22 >> 8);
				Static114.aByteArray35[3] = (byte) (local22 >> 16);
				Static114.aByteArray35[1] = (byte) (arg0 >> 8);
				@Pc(143) int local143 = 0;
				Static114.aByteArray35[0] = (byte) (arg0 >> 16);
				@Pc(152) int local152 = 0;
				this.aClass66_4.method2030((long) (arg2 * 6));
				this.aClass66_4.method2037(Static114.aByteArray35, 6, 0);
				while (arg0 > local143) {
					@Pc(176) int local176 = 0;
					@Pc(253) int local253;
					if (arg1) {
						this.aClass66_5.method2030((long) (local22 * 520));
						try {
							this.aClass66_5.method2035(8, 0, Static114.aByteArray35);
						} catch (@Pc(195) EOFException local195) {
							return true;
						}
						local176 = ((Static114.aByteArray35[5] & 0xFF) << 8) + ((Static114.aByteArray35[4] & 0xFF) << 16) + (Static114.aByteArray35[6] & 0xFF);
						@Pc(225) int local225 = Static114.aByteArray35[7] & 0xFF;
						@Pc(239) int local239 = ((Static114.aByteArray35[2] & 0xFF) << 8) + (Static114.aByteArray35[3] & 0xFF);
						local253 = (Static114.aByteArray35[1] & 0xFF) + ((Static114.aByteArray35[0] & 0xFF) << 8);
						if (local253 != arg2 || local239 != local152 || local225 != this.anInt3842) {
							return false;
						}
						if (local176 < 0 || this.aClass66_5.method2038() / 520L < (long) local176) {
							return false;
						}
					}
					if (local176 == 0) {
						local176 = (int) ((this.aClass66_5.method2038() + 519L) / 520L);
						arg1 = false;
						if (local176 == 0) {
							local176++;
						}
						if (local22 == local176) {
							local176++;
						}
					}
					Static114.aByteArray35[7] = (byte) this.anInt3842;
					Static114.aByteArray35[1] = (byte) arg2;
					Static114.aByteArray35[0] = (byte) (arg2 >> 8);
					Static114.aByteArray35[2] = (byte) (local152 >> 8);
					local253 = arg0 - local143;
					if (local253 > 512) {
						local253 = 512;
					}
					if (arg0 - local143 <= 512) {
						local176 = 0;
					}
					Static114.aByteArray35[3] = (byte) local152;
					Static114.aByteArray35[4] = (byte) (local176 >> 16);
					Static114.aByteArray35[6] = (byte) local176;
					local152++;
					Static114.aByteArray35[5] = (byte) (local176 >> 8);
					this.aClass66_5.method2030((long) (local22 * 520));
					this.aClass66_5.method2037(Static114.aByteArray35, 8, 0);
					this.aClass66_5.method2037(arg3, local253, local143);
					local22 = local176;
					local143 += local253;
				}
				return true;
			} catch (@Pc(441) IOException local441) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt3842;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)[B")
	public byte[] method2860(@OriginalArg(1) int arg0) {
		@Pc(8) Class66 local8 = this.aClass66_5;
		synchronized (this.aClass66_5) {
			try {
				if (this.aClass66_4.method2038() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass66_4.method2030((long) (arg0 * 6));
				this.aClass66_4.method2035(6, 0, Static114.aByteArray35);
				@Pc(66) int local66 = ((Static114.aByteArray35[3] & 0xFF) << 16) + ((Static114.aByteArray35[4] & 0xFF) << 8) + (Static114.aByteArray35[5] & 0xFF);
				@Pc(89) int local89 = (Static114.aByteArray35[2] & 0xFF) + ((Static114.aByteArray35[0] & 0xFF) << 16) + ((Static114.aByteArray35[1] & 0xFF) << 8);
				if (local89 < 0 || this.anInt3839 < local89) {
					return null;
				} else if (local66 > 0 && this.aClass66_5.method2038() / 520L >= (long) local66) {
					@Pc(121) int local121 = 0;
					@Pc(124) byte[] local124 = new byte[local89];
					@Pc(126) int local126 = 0;
					while (local126 < local89) {
						if (local66 == 0) {
							return null;
						}
						this.aClass66_5.method2030((long) (local66 * 520));
						@Pc(149) int local149 = local89 - local126;
						if (local149 > 512) {
							local149 = 512;
						}
						this.aClass66_5.method2035(local149 + 8, 0, Static114.aByteArray35);
						@Pc(179) int local179 = (Static114.aByteArray35[1] & 0xFF) + ((Static114.aByteArray35[0] & 0xFF) << 8);
						@Pc(193) int local193 = (Static114.aByteArray35[3] & 0xFF) + ((Static114.aByteArray35[2] & 0xFF) << 8);
						@Pc(199) int local199 = Static114.aByteArray35[7] & 0xFF;
						@Pc(221) int local221 = (Static114.aByteArray35[6] & 0xFF) + ((Static114.aByteArray35[5] & 0xFF) << 8) + ((Static114.aByteArray35[4] & 0xFF) << 16);
						if (arg0 == local179 && local121 == local193 && local199 == this.anInt3842) {
							if (local221 >= 0 && this.aClass66_5.method2038() / 520L >= (long) local221) {
								local66 = local221;
								for (@Pc(270) int local270 = 0; local270 < local149; local270++) {
									local124[local126++] = Static114.aByteArray35[local270 + 8];
								}
								local121++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local124;
				} else {
					return null;
				}
			} catch (@Pc(300) IOException local300) {
				return null;
			}
		}
	}
}
