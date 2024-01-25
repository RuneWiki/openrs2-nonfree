import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class51 {

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "Lclient!tq;")
	private Class279 aClass279_5 = null;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
	private int anInt2030 = 65000;

	@OriginalMember(owner = "client!cw", name = "h", descriptor = "Lclient!tq;")
	private Class279 aClass279_6 = null;

	@OriginalMember(owner = "client!cw", name = "l", descriptor = "I")
	private final int anInt2038;

	static {
		new Class114("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(ILclient!tq;Lclient!tq;I)V")
	public Class51(@OriginalArg(0) int arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(2) Class279 arg2, @OriginalArg(3) int arg3) {
		this.anInt2038 = arg0;
		this.aClass279_6 = arg1;
		this.anInt2030 = arg3;
		this.aClass279_5 = arg2;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(II[BI)Z")
	public boolean method1945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(6) Class279 local6 = this.aClass279_6;
		synchronized (this.aClass279_6) {
			if (arg1 < 0 || arg1 > this.anInt2030) {
				throw new IllegalArgumentException();
			}
			@Pc(44) boolean local44 = this.method1946(arg1, arg0, arg2, true);
			if (!local44) {
				local44 = this.method1946(arg1, arg0, arg2, false);
			}
			return local44;
		}
	}

	@OriginalMember(owner = "client!cw", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2038;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(III[BZ)Z")
	private boolean method1946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class279 local8 = this.aClass279_6;
		synchronized (this.aClass279_6) {
			try {
				@Pc(72) int local72;
				if (arg3) {
					if ((long) (arg1 * 6 + 6) > this.aClass279_5.method6841()) {
						return false;
					}
					this.aClass279_5.method6839((long) (arg1 * 6));
					this.aClass279_5.method6846(0, Static222.aByteArray64, 6);
					local72 = ((Static222.aByteArray64[3] & 0xFF) << 16) + ((Static222.aByteArray64[4] & 0xFF) << 8) + (Static222.aByteArray64[5] & 0xFF);
					if (local72 <= 0 || this.aClass279_6.method6841() / 520L < (long) local72) {
						return false;
					}
				} else {
					local72 = (int) ((this.aClass279_6.method6841() + 519L) / 520L);
					if (local72 == 0) {
						local72 = 1;
					}
				}
				Static222.aByteArray64[5] = (byte) local72;
				Static222.aByteArray64[3] = (byte) (local72 >> 16);
				Static222.aByteArray64[4] = (byte) (local72 >> 8);
				Static222.aByteArray64[1] = (byte) (arg0 >> 8);
				Static222.aByteArray64[0] = (byte) (arg0 >> 16);
				Static222.aByteArray64[2] = (byte) arg0;
				this.aClass279_5.method6839((long) (arg1 * 6));
				this.aClass279_5.method6847(0, Static222.aByteArray64, 6);
				@Pc(171) int local171 = 0;
				@Pc(173) int local173 = 0;
				while (local171 < arg0) {
					@Pc(177) int local177 = 0;
					@Pc(212) int local212;
					if (arg3) {
						this.aClass279_6.method6839((long) (local72 * 520));
						try {
							this.aClass279_6.method6846(0, Static222.aByteArray64, 8);
						} catch (@Pc(196) EOFException local196) {
							return true;
						}
						local212 = ((Static222.aByteArray64[0] & 0xFF) << 8) + (Static222.aByteArray64[1] & 0xFF);
						@Pc(226) int local226 = (Static222.aByteArray64[3] & 0xFF) + ((Static222.aByteArray64[2] & 0xFF) << 8);
						local177 = (Static222.aByteArray64[6] & 0xFF) + ((Static222.aByteArray64[5] & 0xFF) << 8) + ((Static222.aByteArray64[4] & 0xFF) << 16);
						@Pc(254) int local254 = Static222.aByteArray64[7] & 0xFF;
						if (arg1 != local212 || local226 != local173 || local254 != this.anInt2038) {
							return false;
						}
						if (local177 < 0 || (long) local177 > this.aClass279_6.method6841() / 520L) {
							return false;
						}
					}
					if (local177 == 0) {
						arg3 = false;
						local177 = (int) ((this.aClass279_6.method6841() + 519L) / 520L);
						if (local177 == 0) {
							local177++;
						}
						if (local72 == local177) {
							local177++;
						}
					}
					Static222.aByteArray64[3] = (byte) local173;
					Static222.aByteArray64[1] = (byte) arg1;
					if (arg0 - local171 <= 512) {
						local177 = 0;
					}
					Static222.aByteArray64[2] = (byte) (local173 >> 8);
					Static222.aByteArray64[0] = (byte) (arg1 >> 8);
					Static222.aByteArray64[6] = (byte) local177;
					Static222.aByteArray64[5] = (byte) (local177 >> 8);
					Static222.aByteArray64[7] = (byte) this.anInt2038;
					Static222.aByteArray64[4] = (byte) (local177 >> 16);
					this.aClass279_6.method6839((long) (local72 * 520));
					this.aClass279_6.method6847(0, Static222.aByteArray64, 8);
					local212 = arg0 - local171;
					if (local212 > 512) {
						local212 = 512;
					}
					this.aClass279_6.method6847(local171, arg2, local212);
					local173++;
					local171 += local212;
					local72 = local177;
				}
				return true;
			} catch (@Pc(438) IOException local438) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(II)[B")
	public byte[] method1948(@OriginalArg(1) int arg0) {
		@Pc(6) Class279 local6 = this.aClass279_6;
		synchronized (this.aClass279_6) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass279_5.method6841()) {
					return null;
				}
				this.aClass279_5.method6839((long) (arg0 * 6));
				this.aClass279_5.method6846(0, Static222.aByteArray64, 6);
				@Pc(65) int local65 = ((Static222.aByteArray64[0] & 0xFF) << 16) - (-((Static222.aByteArray64[1] & 0xFF) << 8) - (Static222.aByteArray64[2] & 0xFF));
				@Pc(88) int local88 = (Static222.aByteArray64[5] & 0xFF) + (((Static222.aByteArray64[3] & 0xFF) << 16) + ((Static222.aByteArray64[4] & 0xFF) << 8));
				if (local65 < 0 || local65 > this.anInt2030) {
					return null;
				} else if (local88 > 0 && this.aClass279_6.method6841() / 520L >= (long) local88) {
					@Pc(135) byte[] local135 = new byte[local65];
					@Pc(143) int local143 = 0;
					@Pc(145) int local145 = 0;
					while (local143 < local65) {
						if (local88 == 0) {
							return null;
						}
						this.aClass279_6.method6839((long) (local88 * 520));
						@Pc(167) int local167 = local65 - local143;
						if (local167 > 512) {
							local167 = 512;
						}
						this.aClass279_6.method6846(0, Static222.aByteArray64, local167 + 8);
						@Pc(196) int local196 = ((Static222.aByteArray64[0] & 0xFF) << 8) + (Static222.aByteArray64[1] & 0xFF);
						@Pc(211) int local211 = ((Static222.aByteArray64[2] & 0xFF) << 8) + (Static222.aByteArray64[3] & 0xFF);
						@Pc(234) int local234 = ((Static222.aByteArray64[4] & 0xFF) << 16) + ((Static222.aByteArray64[5] & 0xFF) << 8) + (Static222.aByteArray64[6] & 0xFF);
						@Pc(240) int local240 = Static222.aByteArray64[7] & 0xFF;
						if (local196 == arg0 && local145 == local211 && this.anInt2038 == local240) {
							if (local234 >= 0 && this.aClass279_6.method6841() / 520L >= (long) local234) {
								local88 = local234;
								for (@Pc(286) int local286 = 0; local286 < local167; local286++) {
									local135[local143++] = Static222.aByteArray64[local286 + 8];
								}
								local145++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local135;
				} else {
					return null;
				}
			} catch (@Pc(311) IOException local311) {
				return null;
			}
		}
	}
}
