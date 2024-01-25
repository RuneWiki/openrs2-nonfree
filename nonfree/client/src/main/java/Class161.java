import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class161 {

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "Lclient!bg;")
	private Class20 aClass20_5 = null;

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
	private int anInt4354 = 65000;

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "Lclient!bg;")
	private Class20 aClass20_6 = null;

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
	private final int anInt4358;

	static {
		new Class144("", 76);
	}

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(ILclient!bg;Lclient!bg;I)V")
	public Class161(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) int arg3) {
		this.aClass20_5 = arg1;
		this.aClass20_6 = arg2;
		this.anInt4354 = arg3;
		this.anInt4358 = arg0;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)[B")
	public byte[] method3866(@OriginalArg(1) int arg0) {
		@Pc(8) Class20 local8 = this.aClass20_5;
		synchronized (this.aClass20_5) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass20_6.method496()) {
					return null;
				}
				this.aClass20_6.method491((long) (arg0 * 6));
				this.aClass20_6.method497(6, Static329.aByteArray90, 0);
				@Pc(72) int local72 = ((Static329.aByteArray90[0] & 0xFF) << 16) + ((Static329.aByteArray90[1] & 0xFF) << 8) + (Static329.aByteArray90[2] & 0xFF);
				@Pc(95) int local95 = ((Static329.aByteArray90[3] & 0xFF) << 16) - (-((Static329.aByteArray90[4] & 0xFF) << 8) - (Static329.aByteArray90[5] & 0xFF));
				if (local72 < 0 || this.anInt4354 < local72) {
					return null;
				} else if (local95 > 0 && (long) local95 <= this.aClass20_5.method496() / 520L) {
					@Pc(135) byte[] local135 = new byte[local72];
					@Pc(142) int local142 = 0;
					@Pc(144) int local144 = 0;
					label55: while (local72 > local142) {
						if (local95 == 0) {
							return null;
						}
						this.aClass20_5.method491((long) (local95 * 520));
						@Pc(167) int local167 = local72 - local142;
						if (local167 > 512) {
							local167 = 512;
						}
						this.aClass20_5.method497(local167 + 8, Static329.aByteArray90, 0);
						@Pc(197) int local197 = (Static329.aByteArray90[1] & 0xFF) + ((Static329.aByteArray90[0] & 0xFF) << 8);
						@Pc(211) int local211 = (Static329.aByteArray90[3] & 0xFF) + ((Static329.aByteArray90[2] & 0xFF) << 8);
						@Pc(234) int local234 = (Static329.aByteArray90[6] & 0xFF) + ((Static329.aByteArray90[4] & 0xFF) << 16) + ((Static329.aByteArray90[5] & 0xFF) << 8);
						@Pc(240) int local240 = Static329.aByteArray90[7] & 0xFF;
						if (local197 == arg0 && local211 == local144 && this.anInt4358 == local240) {
							if (local234 >= 0 && this.aClass20_5.method496() / 520L >= (long) local234) {
								local95 = local234;
								local144++;
								@Pc(287) int local287 = 0;
								while (true) {
									if (local287 >= local167) {
										continue label55;
									}
									local135[local142++] = Static329.aByteArray90[local287 + 8];
									local287++;
								}
							}
							return null;
						}
						return null;
					}
					return local135;
				} else {
					return null;
				}
			} catch (@Pc(316) IOException local316) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt4358;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "([BZIII)Z")
	private boolean method3871(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class20 local8 = this.aClass20_5;
		synchronized (this.aClass20_5) {
			try {
				@Pc(22) int local22;
				if (arg1) {
					if ((long) (arg3 * 6 + 6) > this.aClass20_6.method496()) {
						return false;
					}
					this.aClass20_6.method491((long) (arg3 * 6));
					this.aClass20_6.method497(6, Static329.aByteArray90, 0);
					local22 = ((Static329.aByteArray90[3] & 0xFF) << 16) + ((Static329.aByteArray90[4] & 0xFF) << 8) + (Static329.aByteArray90[5] & 0xFF);
					if (local22 <= 0 || (long) local22 > this.aClass20_5.method496() / 520L) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass20_5.method496() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static329.aByteArray90[3] = (byte) (local22 >> 16);
				Static329.aByteArray90[0] = (byte) (arg2 >> 16);
				Static329.aByteArray90[4] = (byte) (local22 >> 8);
				Static329.aByteArray90[5] = (byte) local22;
				Static329.aByteArray90[1] = (byte) (arg2 >> 8);
				Static329.aByteArray90[2] = (byte) arg2;
				this.aClass20_6.method491((long) (arg3 * 6));
				this.aClass20_6.method500(6, Static329.aByteArray90, 0);
				@Pc(161) int local161 = 0;
				@Pc(163) int local163 = 0;
				while (arg2 > local161) {
					@Pc(167) int local167 = 0;
					@Pc(202) int local202;
					if (arg1) {
						this.aClass20_5.method491((long) (local22 * 520));
						try {
							this.aClass20_5.method497(8, Static329.aByteArray90, 0);
						} catch (@Pc(186) EOFException local186) {
							return true;
						}
						local202 = (Static329.aByteArray90[1] & 0xFF) + ((Static329.aByteArray90[0] & 0xFF) << 8);
						@Pc(217) int local217 = ((Static329.aByteArray90[2] & 0xFF) << 8) + (Static329.aByteArray90[3] & 0xFF);
						local167 = (Static329.aByteArray90[6] & 0xFF) + (((Static329.aByteArray90[4] & 0xFF) << 16) + ((Static329.aByteArray90[5] & 0xFF) << 8));
						@Pc(246) int local246 = Static329.aByteArray90[7] & 0xFF;
						if (local202 != arg3 || local217 != local163 || local246 != this.anInt4358) {
							return false;
						}
						if (local167 < 0 || this.aClass20_5.method496() / 520L < (long) local167) {
							return false;
						}
					}
					if (local167 == 0) {
						local167 = (int) ((this.aClass20_5.method496() + 519L) / 520L);
						arg1 = false;
						if (local167 == 0) {
							local167++;
						}
						if (local167 == local22) {
							local167++;
						}
					}
					if (arg2 - local161 <= 512) {
						local167 = 0;
					}
					Static329.aByteArray90[2] = (byte) (local163 >> 8);
					Static329.aByteArray90[3] = (byte) local163;
					Static329.aByteArray90[1] = (byte) arg3;
					Static329.aByteArray90[0] = (byte) (arg3 >> 8);
					Static329.aByteArray90[5] = (byte) (local167 >> 8);
					Static329.aByteArray90[7] = (byte) this.anInt4358;
					Static329.aByteArray90[6] = (byte) local167;
					Static329.aByteArray90[4] = (byte) (local167 >> 16);
					this.aClass20_5.method491((long) (local22 * 520));
					this.aClass20_5.method500(8, Static329.aByteArray90, 0);
					local202 = arg2 - local161;
					if (local202 > 512) {
						local202 = 512;
					}
					this.aClass20_5.method500(local202, arg0, local161);
					local22 = local167;
					local163++;
					local161 += local202;
				}
				return true;
			} catch (@Pc(418) IOException local418) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II[BI)Z")
	public boolean method3872(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class20 local6 = this.aClass20_5;
		synchronized (this.aClass20_5) {
			if (arg2 < 0 || arg2 > this.anInt4354) {
				throw new IllegalArgumentException();
			}
			@Pc(26) boolean local26 = this.method3871(arg1, true, arg2, arg0);
			if (!local26) {
				local26 = this.method3871(arg1, false, arg2, arg0);
			}
			return local26;
		}
	}
}
