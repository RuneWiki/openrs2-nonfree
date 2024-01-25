import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class90 {

	@OriginalMember(owner = "client!es", name = "e", descriptor = "Lclient!se;")
	private Class265 aClass265_3 = null;

	@OriginalMember(owner = "client!es", name = "d", descriptor = "Lclient!se;")
	private Class265 aClass265_2 = null;

	@OriginalMember(owner = "client!es", name = "f", descriptor = "I")
	private int anInt2359 = 65000;

	@OriginalMember(owner = "client!es", name = "b", descriptor = "I")
	private final int anInt2358;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(ILclient!se;Lclient!se;I)V")
	public Class90(@OriginalArg(0) int arg0, @OriginalArg(1) Class265 arg1, @OriginalArg(2) Class265 arg2, @OriginalArg(3) int arg3) {
		this.anInt2358 = arg0;
		this.aClass265_2 = arg2;
		this.anInt2359 = arg3;
		this.aClass265_3 = arg1;
	}

	@OriginalMember(owner = "client!es", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt2358;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)[B")
	public byte[] method2269(@OriginalArg(1) int arg0) {
		@Pc(8) Class265 local8 = this.aClass265_3;
		synchronized (this.aClass265_3) {
			try {
				if (this.aClass265_2.method6868() < (long) (arg0 * 6 + 6)) {
					return null;
				}
				this.aClass265_2.method6862((long) (arg0 * 6));
				this.aClass265_2.method6861(6, 0, Static98.aByteArray22);
				@Pc(69) int local69 = (Static98.aByteArray22[2] & 0xFF) + ((Static98.aByteArray22[1] & 0xFF) << 8) + ((Static98.aByteArray22[0] & 0xFF) << 16);
				@Pc(91) int local91 = ((Static98.aByteArray22[4] & 0xFF) << 8) + ((Static98.aByteArray22[3] & 0xFF) << 16) + (Static98.aByteArray22[5] & 0xFF);
				if (local69 < 0 || local69 > this.anInt2359) {
					return null;
				} else if (local91 > 0 && (long) local91 <= this.aClass265_3.method6868() / 520L) {
					@Pc(138) byte[] local138 = new byte[local69];
					@Pc(140) int local140 = 0;
					@Pc(142) int local142 = 0;
					while (local140 < local69) {
						if (local91 == 0) {
							return null;
						}
						this.aClass265_3.method6862((long) (local91 * 520));
						@Pc(166) int local166 = local69 - local140;
						if (local166 > 512) {
							local166 = 512;
						}
						this.aClass265_3.method6861(local166 + 8, 0, Static98.aByteArray22);
						@Pc(196) int local196 = ((Static98.aByteArray22[0] & 0xFF) << 8) + (Static98.aByteArray22[1] & 0xFF);
						@Pc(210) int local210 = (Static98.aByteArray22[3] & 0xFF) + ((Static98.aByteArray22[2] & 0xFF) << 8);
						@Pc(234) int local234 = ((Static98.aByteArray22[4] & 0xFF) << 16) + ((Static98.aByteArray22[5] & 0xFF) << 8) + (Static98.aByteArray22[6] & 0xFF);
						@Pc(240) int local240 = Static98.aByteArray22[7] & 0xFF;
						if (local196 == arg0 && local210 == local142 && this.anInt2358 == local240) {
							if (local234 >= 0 && (long) local234 <= this.aClass265_3.method6868() / 520L) {
								local91 = local234;
								for (@Pc(286) int local286 = 0; local286 < local166; local286++) {
									local138[local140++] = Static98.aByteArray22[local286 + 8];
								}
								local142++;
								continue;
							}
							return null;
						}
						return null;
					}
					return local138;
				} else {
					return null;
				}
			} catch (@Pc(320) IOException local320) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IZI[BI)Z")
	private boolean method2270(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class265 local8 = this.aClass265_3;
		synchronized (this.aClass265_3) {
			try {
				@Pc(22) int local22;
				if (arg0) {
					if ((long) (arg1 * 6 + 6) > this.aClass265_2.method6868()) {
						return false;
					}
					this.aClass265_2.method6862((long) (arg1 * 6));
					this.aClass265_2.method6861(6, 0, Static98.aByteArray22);
					local22 = ((Static98.aByteArray22[3] & 0xFF) << 16) - (-(Static98.aByteArray22[4] << 8 & 0xFF00) - (Static98.aByteArray22[5] & 0xFF));
					if (local22 <= 0 || this.aClass265_3.method6868() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass265_3.method6868() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static98.aByteArray22[1] = (byte) (arg3 >> 8);
				Static98.aByteArray22[0] = (byte) (arg3 >> 16);
				Static98.aByteArray22[5] = (byte) local22;
				Static98.aByteArray22[2] = (byte) arg3;
				Static98.aByteArray22[4] = (byte) (local22 >> 8);
				Static98.aByteArray22[3] = (byte) (local22 >> 16);
				this.aClass265_2.method6862((long) (arg1 * 6));
				this.aClass265_2.method6867(Static98.aByteArray22, 6, 0);
				@Pc(165) int local165 = 0;
				@Pc(167) int local167 = 0;
				while (arg3 > local165) {
					@Pc(177) int local177 = 0;
					@Pc(213) int local213;
					if (arg0) {
						this.aClass265_3.method6862((long) (local22 * 520));
						try {
							this.aClass265_3.method6861(8, 0, Static98.aByteArray22);
						} catch (@Pc(196) EOFException local196) {
							return true;
						}
						local213 = ((Static98.aByteArray22[0] & 0xFF) << 8) + (Static98.aByteArray22[1] & 0xFF);
						@Pc(227) int local227 = ((Static98.aByteArray22[2] & 0xFF) << 8) + (Static98.aByteArray22[3] & 0xFF);
						local177 = (Static98.aByteArray22[6] & 0xFF) + ((Static98.aByteArray22[5] & 0xFF) << 8) + ((Static98.aByteArray22[4] & 0xFF) << 16);
						@Pc(255) int local255 = Static98.aByteArray22[7] & 0xFF;
						if (arg1 != local213 || local227 != local167 || local255 != this.anInt2358) {
							return false;
						}
						if (local177 < 0 || this.aClass265_3.method6868() / 520L < (long) local177) {
							return false;
						}
					}
					if (local177 == 0) {
						local177 = (int) ((this.aClass265_3.method6868() + 519L) / 520L);
						arg0 = false;
						if (local177 == 0) {
							local177++;
						}
						if (local22 == local177) {
							local177++;
						}
					}
					Static98.aByteArray22[3] = (byte) local167;
					Static98.aByteArray22[1] = (byte) arg1;
					Static98.aByteArray22[0] = (byte) (arg1 >> 8);
					Static98.aByteArray22[2] = (byte) (local167 >> 8);
					if (arg3 - local165 <= 512) {
						local177 = 0;
					}
					Static98.aByteArray22[7] = (byte) this.anInt2358;
					Static98.aByteArray22[4] = (byte) (local177 >> 16);
					Static98.aByteArray22[5] = (byte) (local177 >> 8);
					Static98.aByteArray22[6] = (byte) local177;
					this.aClass265_3.method6862((long) (local22 * 520));
					this.aClass265_3.method6867(Static98.aByteArray22, 8, 0);
					local213 = arg3 - local165;
					if (local213 > 512) {
						local213 = 512;
					}
					this.aClass265_3.method6867(arg2, local213, local165);
					local165 += local213;
					local167++;
					local22 = local177;
				}
				return true;
			} catch (@Pc(428) IOException local428) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I[BII)Z")
	public boolean method2271(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class265 local6 = this.aClass265_3;
		synchronized (this.aClass265_3) {
			if (arg2 < 0 || arg2 > this.anInt2359) {
				throw new IllegalArgumentException();
			}
			@Pc(28) boolean local28 = this.method2270(true, arg1, arg0, arg2);
			if (!local28) {
				local28 = this.method2270(false, arg1, arg0, arg2);
			}
			return local28;
		}
	}
}
