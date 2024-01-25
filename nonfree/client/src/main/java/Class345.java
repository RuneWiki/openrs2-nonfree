import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class345 {

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "Lclient!hca;")
	private Class134 aClass134_4 = null;

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "Lclient!hca;")
	private Class134 aClass134_5 = null;

	@OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
	private int anInt9918 = 65000;

	@OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
	private final int anInt9916;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(ILclient!hca;Lclient!hca;I)V")
	public Class345(@OriginalArg(0) int arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Class134 arg2, @OriginalArg(3) int arg3) {
		this.aClass134_5 = arg2;
		this.aClass134_4 = arg1;
		this.anInt9916 = arg0;
		this.anInt9918 = arg3;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "([BIII)Z")
	public boolean method8095(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class134 local6 = this.aClass134_4;
		synchronized (this.aClass134_4) {
			if (arg1 < 0 || this.anInt9918 < arg1) {
				throw new IllegalArgumentException();
			}
			@Pc(30) boolean local30 = this.method8098(arg2, arg0, true, arg1);
			if (!local30) {
				local30 = this.method8098(arg2, arg0, false, arg1);
			}
			return local30;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)[B")
	public byte[] method8096(@OriginalArg(1) int arg0) {
		@Pc(8) Class134 local8 = this.aClass134_4;
		synchronized (this.aClass134_4) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass134_5.method3244()) {
					return null;
				}
				this.aClass134_5.method3241((long) (arg0 * 6));
				this.aClass134_5.method3243(Static21.aByteArray2, 0, 6);
				@Pc(69) int local69 = ((Static21.aByteArray2[1] & 0xFF) << 8) + (Static21.aByteArray2[0] << 16 & 0xFF0000) + (Static21.aByteArray2[2] & 0xFF);
				@Pc(92) int local92 = ((Static21.aByteArray2[3] & 0xFF) << 16) - (-(Static21.aByteArray2[4] << 8 & 0xFF00) - (Static21.aByteArray2[5] & 0xFF));
				if (local69 < 0 || local69 > this.anInt9918) {
					return null;
				} else if (local92 > 0 && (long) local92 <= this.aClass134_4.method3244() / 520L) {
					@Pc(144) byte[] local144 = new byte[local69];
					@Pc(146) int local146 = 0;
					@Pc(148) int local148 = 0;
					while (local69 > local146) {
						if (local92 == 0) {
							return null;
						}
						this.aClass134_4.method3241((long) (local92 * 520));
						@Pc(174) int local174 = local69 - local146;
						if (local174 > 512) {
							local174 = 512;
						}
						this.aClass134_4.method3243(Static21.aByteArray2, 0, local174 + 8);
						@Pc(202) int local202 = (Static21.aByteArray2[1] & 0xFF) + ((Static21.aByteArray2[0] & 0xFF) << 8);
						@Pc(217) int local217 = ((Static21.aByteArray2[2] & 0xFF) << 8) + (Static21.aByteArray2[3] & 0xFF);
						@Pc(240) int local240 = (Static21.aByteArray2[6] & 0xFF) + (((Static21.aByteArray2[4] & 0xFF) << 16) + ((Static21.aByteArray2[5] & 0xFF) << 8));
						@Pc(246) int local246 = Static21.aByteArray2[7] & 0xFF;
						if (local202 == arg0 && local217 == local148 && local246 == this.anInt9916) {
							if (local240 >= 0 && (long) local240 <= this.aClass134_4.method3244() / 520L) {
								for (@Pc(301) int local301 = 0; local301 < local174; local301++) {
									local144[local146++] = Static21.aByteArray2[local301 + 8];
								}
								local92 = local240;
								local148++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local144;
				} else {
					return null;
				}
			} catch (@Pc(337) IOException local337) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I[BZII)Z")
	private boolean method8098(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class134 local8 = this.aClass134_4;
		synchronized (this.aClass134_4) {
			try {
				@Pc(22) int local22;
				if (arg2) {
					if (this.aClass134_5.method3244() < (long) (arg0 * 6 + 6)) {
						return false;
					}
					this.aClass134_5.method3241((long) (arg0 * 6));
					this.aClass134_5.method3243(Static21.aByteArray2, 0, 6);
					local22 = ((Static21.aByteArray2[4] & 0xFF) << 8) + (Static21.aByteArray2[3] << 16 & 0xFF0000) + (Static21.aByteArray2[5] & 0xFF);
					if (local22 <= 0 || this.aClass134_4.method3244() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass134_4.method3244() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static21.aByteArray2[2] = (byte) arg3;
				Static21.aByteArray2[0] = (byte) (arg3 >> 16);
				Static21.aByteArray2[5] = (byte) local22;
				Static21.aByteArray2[4] = (byte) (local22 >> 8);
				Static21.aByteArray2[3] = (byte) (local22 >> 16);
				Static21.aByteArray2[1] = (byte) (arg3 >> 8);
				this.aClass134_5.method3241((long) (arg0 * 6));
				this.aClass134_5.method3245(6, 0, Static21.aByteArray2);
				@Pc(159) int local159 = 0;
				@Pc(161) int local161 = 0;
				while (local159 < arg3) {
					@Pc(165) int local165 = 0;
					@Pc(200) int local200;
					if (arg2) {
						this.aClass134_4.method3241((long) (local22 * 520));
						try {
							this.aClass134_4.method3243(Static21.aByteArray2, 0, 8);
						} catch (@Pc(184) EOFException local184) {
							return true;
						}
						local200 = (Static21.aByteArray2[1] & 0xFF) + ((Static21.aByteArray2[0] & 0xFF) << 8);
						@Pc(214) int local214 = (Static21.aByteArray2[3] & 0xFF) + ((Static21.aByteArray2[2] & 0xFF) << 8);
						local165 = (Static21.aByteArray2[6] & 0xFF) + ((Static21.aByteArray2[4] & 0xFF) << 16) + ((Static21.aByteArray2[5] & 0xFF) << 8);
						@Pc(242) int local242 = Static21.aByteArray2[7] & 0xFF;
						if (arg0 != local200 || local214 != local161 || this.anInt9916 != local242) {
							return false;
						}
						if (local165 < 0 || (long) local165 > this.aClass134_4.method3244() / 520L) {
							return false;
						}
					}
					if (local165 == 0) {
						arg2 = false;
						local165 = (int) ((this.aClass134_4.method3244() + 519L) / 520L);
						if (local165 == 0) {
							local165++;
						}
						if (local165 == local22) {
							local165++;
						}
					}
					Static21.aByteArray2[3] = (byte) local161;
					if (arg3 - local159 <= 512) {
						local165 = 0;
					}
					Static21.aByteArray2[2] = (byte) (local161 >> 8);
					Static21.aByteArray2[0] = (byte) (arg0 >> 8);
					Static21.aByteArray2[1] = (byte) arg0;
					Static21.aByteArray2[5] = (byte) (local165 >> 8);
					Static21.aByteArray2[7] = (byte) this.anInt9916;
					Static21.aByteArray2[6] = (byte) local165;
					Static21.aByteArray2[4] = (byte) (local165 >> 16);
					this.aClass134_4.method3241((long) (local22 * 520));
					this.aClass134_4.method3245(8, 0, Static21.aByteArray2);
					local200 = arg3 - local159;
					if (local200 > 512) {
						local200 = 512;
					}
					this.aClass134_4.method3245(local200, local159, arg1);
					local22 = local165;
					local159 += local200;
					local161++;
				}
				return true;
			} catch (@Pc(429) IOException local429) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!vp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt9916;
	}
}
