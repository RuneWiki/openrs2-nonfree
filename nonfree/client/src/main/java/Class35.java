import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class35 {

	@OriginalMember(owner = "client!co", name = "d", descriptor = "I")
	private int anInt910 = 65000;

	@OriginalMember(owner = "client!co", name = "f", descriptor = "Lclient!pe;")
	private Class135 aClass135_1 = null;

	@OriginalMember(owner = "client!co", name = "l", descriptor = "Lclient!pe;")
	private Class135 aClass135_2 = null;

	@OriginalMember(owner = "client!co", name = "k", descriptor = "I")
	private int anInt916;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(ILclient!pe;Lclient!pe;I)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) Class135 arg1, @OriginalArg(2) Class135 arg2, @OriginalArg(3) int arg3) {
		this.aClass135_1 = arg1;
		this.anInt916 = arg0;
		this.anInt910 = arg3;
		this.aClass135_2 = arg2;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([BIZII)Z")
	private boolean method725(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class135 local9 = this.aClass135_1;
		synchronized (this.aClass135_1) {
			try {
				@Pc(22) int local22;
				@Pc(42) boolean local42;
				if (arg2) {
					if (this.aClass135_2.method3368() < (long) (arg1 * 6 + 6)) {
						local42 = false;
						return local42;
					}
					this.aClass135_2.method3372((long) (arg1 * 6));
					this.aClass135_2.method3375(0, Static202.aByteArray45, 6);
					local22 = (Static202.aByteArray45[5] & 0xFF) + ((Static202.aByteArray45[3] & 0xFF) << 16) + ((Static202.aByteArray45[4] & 0xFF) << 8);
					if (local22 <= 0 || (long) local22 > this.aClass135_1.method3368() / 520L) {
						local42 = false;
						return local42;
					}
				} else {
					local22 = (int) ((this.aClass135_1.method3368() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static202.aByteArray45[0] = (byte) (arg3 >> 16);
				Static202.aByteArray45[4] = (byte) (local22 >> 8);
				Static202.aByteArray45[1] = (byte) (arg3 >> 8);
				Static202.aByteArray45[2] = (byte) arg3;
				Static202.aByteArray45[3] = (byte) (local22 >> 16);
				Static202.aByteArray45[5] = (byte) local22;
				@Pc(146) int local146 = 0;
				@Pc(148) int local148 = 0;
				this.aClass135_2.method3372((long) (arg1 * 6));
				this.aClass135_2.method3374(0, Static202.aByteArray45, 6);
				while (true) {
					if (local146 < arg3) {
						label135: {
							@Pc(168) int local168 = 0;
							@Pc(242) int local242;
							if (arg2) {
								this.aClass135_1.method3372((long) (local22 * 520));
								try {
									this.aClass135_1.method3375(0, Static202.aByteArray45, 8);
								} catch (@Pc(187) EOFException local187) {
									break label135;
								}
								local168 = ((Static202.aByteArray45[4] & 0xFF) << 16) + (((Static202.aByteArray45[5] & 0xFF) << 8) + (Static202.aByteArray45[6] & 0xFF));
								@Pc(227) int local227 = ((Static202.aByteArray45[2] & 0xFF) << 8) + (Static202.aByteArray45[3] & 0xFF);
								local242 = ((Static202.aByteArray45[0] & 0xFF) << 8) + (Static202.aByteArray45[1] & 0xFF);
								@Pc(248) int local248 = Static202.aByteArray45[7] & 0xFF;
								if (local242 != arg1 || local148 != local227 || local248 != this.anInt916) {
									local42 = false;
									return local42;
								}
								if (local168 < 0 || (long) local168 > this.aClass135_1.method3368() / 520L) {
									local42 = false;
									return local42;
								}
							}
							if (local168 == 0) {
								local168 = (int) ((this.aClass135_1.method3368() + 519L) / 520L);
								if (local168 == 0) {
									local168++;
								}
								arg2 = false;
								if (local168 == local22) {
									local168++;
								}
							}
							if (arg3 - local146 <= 512) {
								local168 = 0;
							}
							Static202.aByteArray45[6] = (byte) local168;
							Static202.aByteArray45[5] = (byte) (local168 >> 8);
							Static202.aByteArray45[0] = (byte) (arg1 >> 8);
							Static202.aByteArray45[3] = (byte) local148;
							Static202.aByteArray45[2] = (byte) (local148 >> 8);
							local148++;
							Static202.aByteArray45[1] = (byte) arg1;
							Static202.aByteArray45[7] = (byte) this.anInt916;
							Static202.aByteArray45[4] = (byte) (local168 >> 16);
							this.aClass135_1.method3372((long) (local22 * 520));
							this.aClass135_1.method3374(0, Static202.aByteArray45, 8);
							local22 = local168;
							local242 = arg3 - local146;
							if (local242 > 512) {
								local242 = 512;
							}
							this.aClass135_1.method3374(local146, arg0, local242);
							local146 += local242;
							continue;
						}
					}
					local42 = true;
					return local42;
				}
			} catch (@Pc(417) IOException local417) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)[B")
	public byte[] method727(@OriginalArg(0) int arg0) {
		@Pc(9) Class135 local9 = this.aClass135_1;
		synchronized (this.aClass135_1) {
			@Pc(23) Object local23;
			try {
				if (this.aClass135_2.method3368() < (long) (arg0 * 6 + 6)) {
					local23 = null;
					return (byte[]) local23;
				}
				this.aClass135_2.method3372((long) (arg0 * 6));
				this.aClass135_2.method3375(0, Static202.aByteArray45, 6);
				@Pc(64) int local64 = (Static202.aByteArray45[5] & 0xFF) + (((Static202.aByteArray45[3] & 0xFF) << 16) + ((Static202.aByteArray45[4] & 0xFF) << 8));
				@Pc(86) int local86 = (Static202.aByteArray45[2] & 0xFF) + ((Static202.aByteArray45[1] & 0xFF) << 8) + ((Static202.aByteArray45[0] & 0xFF) << 16);
				if (local86 < 0 || local86 > this.anInt910) {
					local23 = null;
					return (byte[]) local23;
				}
				if (local64 > 0 && (long) local64 <= this.aClass135_1.method3368() / 520L) {
					@Pc(124) byte[] local124 = new byte[local86];
					@Pc(134) int local134 = 0;
					@Pc(136) int local136 = 0;
					while (local136 < local86) {
						if (local64 != 0) {
							@Pc(158) int local158 = local86 - local136;
							this.aClass135_1.method3372((long) (local64 * 520));
							if (local158 > 512) {
								local158 = 512;
							}
							this.aClass135_1.method3375(0, Static202.aByteArray45, local158 + 8);
							@Pc(189) int local189 = Static202.aByteArray45[7] & 0xFF;
							@Pc(211) int local211 = (Static202.aByteArray45[6] & 0xFF) + ((Static202.aByteArray45[5] & 0xFF) << 8) + ((Static202.aByteArray45[4] & 0xFF) << 16);
							@Pc(225) int local225 = (Static202.aByteArray45[1] & 0xFF) + ((Static202.aByteArray45[0] & 0xFF) << 8);
							@Pc(239) int local239 = (Static202.aByteArray45[3] & 0xFF) + ((Static202.aByteArray45[2] & 0xFF) << 8);
							if (local225 == arg0 && local239 == local134 && this.anInt916 == local189) {
								if (local211 >= 0 && this.aClass135_1.method3368() / 520L >= (long) local211) {
									for (@Pc(282) int local282 = 0; local282 < local158; local282++) {
										local124[local136++] = Static202.aByteArray45[local282 + 8];
									}
									local64 = local211;
									local134++;
									continue;
								}
								local23 = null;
								return (byte[]) local23;
							}
							local23 = null;
							return (byte[]) local23;
						}
						local23 = null;
						return (byte[]) local23;
					}
					@Pc(303) byte[] local303 = local124;
					return local303;
				}
				local23 = null;
			} catch (@Pc(307) IOException local307) {
				return null;
			}
			return (byte[]) local23;
		}
	}

	@OriginalMember(owner = "client!co", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt916;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I[BIB)Z")
	public boolean method728(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class135 local7 = this.aClass135_1;
		synchronized (this.aClass135_1) {
			if (arg2 < 0 || this.anInt910 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(30) boolean local30 = this.method725(arg1, arg0, true, arg2);
			if (!local30) {
				local30 = this.method725(arg1, arg0, false, arg2);
			}
			return local30;
		}
	}
}
