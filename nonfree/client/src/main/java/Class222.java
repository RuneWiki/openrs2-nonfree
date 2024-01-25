import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class222 {

	@OriginalMember(owner = "client!st", name = "b", descriptor = "Lclient!lq;")
	private Class139 aClass139_3 = null;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "Lclient!lq;")
	private Class139 aClass139_2 = null;

	@OriginalMember(owner = "client!st", name = "g", descriptor = "I")
	private int anInt6379 = 65000;

	@OriginalMember(owner = "client!st", name = "k", descriptor = "I")
	private final int anInt6382;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(ILclient!lq;Lclient!lq;I)V")
	public Class222(@OriginalArg(0) int arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) Class139 arg2, @OriginalArg(3) int arg3) {
		this.aClass139_3 = arg2;
		this.aClass139_2 = arg1;
		this.anInt6382 = arg0;
		this.anInt6379 = arg3;
	}

	@OriginalMember(owner = "client!st", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt6382;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(II)[B")
	public byte[] method4981(@OriginalArg(1) int arg0) {
		@Pc(8) Class139 local8 = this.aClass139_2;
		synchronized (this.aClass139_2) {
			try {
				if (this.aClass139_3.method3463() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass139_3.method3466((long) (arg0 * 6));
				this.aClass139_3.method3471(6, Static166.aByteArray37, 0);
				@Pc(70) int local70 = (Static166.aByteArray37[2] & 0xFF) + (((Static166.aByteArray37[0] & 0xFF) << 16) + ((Static166.aByteArray37[1] & 0xFF) << 8));
				@Pc(93) int local93 = ((Static166.aByteArray37[3] & 0xFF) << 16) + ((Static166.aByteArray37[4] & 0xFF) << 8) + (Static166.aByteArray37[5] & 0xFF);
				if (local70 < 0 || this.anInt6379 < local70) {
					return null;
				} else if (local93 > 0 && (long) local93 <= this.aClass139_2.method3463() / 520L) {
					@Pc(137) byte[] local137 = new byte[local70];
					@Pc(139) int local139 = 0;
					@Pc(147) int local147 = 0;
					while (local139 < local70) {
						if (local93 == 0) {
							return null;
						}
						this.aClass139_2.method3466((long) (local93 * 520));
						@Pc(170) int local170 = local70 - local139;
						if (local170 > 512) {
							local170 = 512;
						}
						this.aClass139_2.method3471(local170 + 8, Static166.aByteArray37, 0);
						@Pc(201) int local201 = ((Static166.aByteArray37[0] & 0xFF) << 8) + (Static166.aByteArray37[1] & 0xFF);
						@Pc(215) int local215 = (Static166.aByteArray37[3] & 0xFF) + ((Static166.aByteArray37[2] & 0xFF) << 8);
						@Pc(237) int local237 = ((Static166.aByteArray37[5] & 0xFF) << 8) + ((Static166.aByteArray37[4] & 0xFF) << 16) + (Static166.aByteArray37[6] & 0xFF);
						@Pc(243) int local243 = Static166.aByteArray37[7] & 0xFF;
						if (arg0 == local201 && local147 == local215 && this.anInt6382 == local243) {
							if (local237 >= 0 && (long) local237 <= this.aClass139_2.method3463() / 520L) {
								for (@Pc(290) int local290 = 0; local290 < local170; local290++) {
									local137[local139++] = Static166.aByteArray37[local290 + 8];
								}
								local147++;
								local93 = local237;
								continue;
							}
							return null;
						}
						return null;
					}
					return local137;
				} else {
					return null;
				}
			} catch (@Pc(322) IOException local322) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "([BZII)Z")
	public boolean method4982(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class139 local12 = this.aClass139_2;
		synchronized (this.aClass139_2) {
			if (arg2 < 0 || this.anInt6379 < arg2) {
				throw new IllegalArgumentException();
			}
			@Pc(35) boolean local35 = this.method4983(arg1, arg0, arg2, true);
			if (!local35) {
				local35 = this.method4983(arg1, arg0, arg2, false);
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(II[BIZ)Z")
	private boolean method4983(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) Class139 local8 = this.aClass139_2;
		synchronized (this.aClass139_2) {
			try {
				@Pc(67) int local67;
				if (arg3) {
					if ((long) (arg0 * 6 + 6) > this.aClass139_3.method3463()) {
						return false;
					}
					this.aClass139_3.method3466((long) (arg0 * 6));
					this.aClass139_3.method3471(6, Static166.aByteArray37, 0);
					local67 = ((Static166.aByteArray37[4] & 0xFF) << 8) + (Static166.aByteArray37[3] << 16 & 0xFF0000) + (Static166.aByteArray37[5] & 0xFF);
					if (local67 <= 0 || this.aClass139_2.method3463() / 520L < (long) local67) {
						return false;
					}
				} else {
					local67 = (int) ((this.aClass139_2.method3463() + 519L) / 520L);
					if (local67 == 0) {
						local67 = 1;
					}
				}
				Static166.aByteArray37[3] = (byte) (local67 >> 16);
				Static166.aByteArray37[5] = (byte) local67;
				Static166.aByteArray37[2] = (byte) arg2;
				Static166.aByteArray37[0] = (byte) (arg2 >> 16);
				Static166.aByteArray37[4] = (byte) (local67 >> 8);
				Static166.aByteArray37[1] = (byte) (arg2 >> 8);
				this.aClass139_3.method3466((long) (arg0 * 6));
				this.aClass139_3.method3464(0, Static166.aByteArray37, 6);
				@Pc(163) int local163 = 0;
				@Pc(165) int local165 = 0;
				while (arg2 > local163) {
					@Pc(169) int local169 = 0;
					@Pc(204) int local204;
					if (arg3) {
						this.aClass139_2.method3466((long) (local67 * 520));
						try {
							this.aClass139_2.method3471(8, Static166.aByteArray37, 0);
						} catch (@Pc(188) EOFException local188) {
							return true;
						}
						local204 = (Static166.aByteArray37[1] & 0xFF) + ((Static166.aByteArray37[0] & 0xFF) << 8);
						local169 = ((Static166.aByteArray37[4] & 0xFF) << 16) + ((Static166.aByteArray37[5] & 0xFF) << 8) + (Static166.aByteArray37[6] & 0xFF);
						@Pc(242) int local242 = ((Static166.aByteArray37[2] & 0xFF) << 8) + (Static166.aByteArray37[3] & 0xFF);
						@Pc(248) int local248 = Static166.aByteArray37[7] & 0xFF;
						if (arg0 != local204 || local242 != local165 || this.anInt6382 != local248) {
							return false;
						}
						if (local169 < 0 || (long) local169 > this.aClass139_2.method3463() / 520L) {
							return false;
						}
					}
					if (local169 == 0) {
						arg3 = false;
						local169 = (int) ((this.aClass139_2.method3463() + 519L) / 520L);
						if (local169 == 0) {
							local169++;
						}
						if (local67 == local169) {
							local169++;
						}
					}
					Static166.aByteArray37[1] = (byte) arg0;
					Static166.aByteArray37[2] = (byte) (local165 >> 8);
					Static166.aByteArray37[0] = (byte) (arg0 >> 8);
					Static166.aByteArray37[3] = (byte) local165;
					if (arg2 - local163 <= 512) {
						local169 = 0;
					}
					Static166.aByteArray37[7] = (byte) this.anInt6382;
					Static166.aByteArray37[5] = (byte) (local169 >> 8);
					Static166.aByteArray37[4] = (byte) (local169 >> 16);
					Static166.aByteArray37[6] = (byte) local169;
					this.aClass139_2.method3466((long) (local67 * 520));
					this.aClass139_2.method3464(0, Static166.aByteArray37, 8);
					local204 = arg2 - local163;
					if (local204 > 512) {
						local204 = 512;
					}
					this.aClass139_2.method3464(local163, arg1, local204);
					local165++;
					local163 += local204;
					local67 = local169;
				}
				return true;
			} catch (@Pc(432) IOException local432) {
				return false;
			}
		}
	}
}
