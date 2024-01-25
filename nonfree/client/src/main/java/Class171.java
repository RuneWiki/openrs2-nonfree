import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class171 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "I")
	private int anInt5350 = 65000;

	@OriginalMember(owner = "client!r", name = "g", descriptor = "Lclient!fc;")
	private Class69 aClass69_4 = null;

	@OriginalMember(owner = "client!r", name = "h", descriptor = "Lclient!fc;")
	private Class69 aClass69_5 = null;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "I")
	private final int anInt5354;

	static {
		new Class117("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(ILclient!fc;Lclient!fc;I)V")
	public Class171(@OriginalArg(0) int arg0, @OriginalArg(1) Class69 arg1, @OriginalArg(2) Class69 arg2, @OriginalArg(3) int arg3) {
		this.aClass69_4 = arg2;
		this.aClass69_5 = arg1;
		this.anInt5354 = arg0;
		this.anInt5350 = arg3;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ[BI)Z")
	private boolean method4543(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class69 local8 = this.aClass69_5;
		synchronized (this.aClass69_5) {
			try {
				@Pc(22) int local22;
				if (arg1) {
					if ((long) (arg3 * 6 + 6) > this.aClass69_4.method1221()) {
						return false;
					}
					this.aClass69_4.method1219((long) (arg3 * 6));
					this.aClass69_4.method1228(Static284.aByteArray90, 0, 6);
					local22 = (Static284.aByteArray90[5] & 0xFF) + ((Static284.aByteArray90[4] & 0xFF) << 8) + ((Static284.aByteArray90[3] & 0xFF) << 16);
					if (local22 <= 0 || this.aClass69_5.method1221() / 520L < (long) local22) {
						return false;
					}
				} else {
					local22 = (int) ((this.aClass69_5.method1221() + 519L) / 520L);
					if (local22 == 0) {
						local22 = 1;
					}
				}
				Static284.aByteArray90[5] = (byte) local22;
				Static284.aByteArray90[3] = (byte) (local22 >> 16);
				Static284.aByteArray90[2] = (byte) arg0;
				Static284.aByteArray90[0] = (byte) (arg0 >> 16);
				Static284.aByteArray90[1] = (byte) (arg0 >> 8);
				Static284.aByteArray90[4] = (byte) (local22 >> 8);
				this.aClass69_4.method1219((long) (arg3 * 6));
				this.aClass69_4.method1225(6, 0, Static284.aByteArray90);
				@Pc(162) int local162 = 0;
				@Pc(164) int local164 = 0;
				while (local162 < arg0) {
					@Pc(168) int local168 = 0;
					@Pc(203) int local203;
					if (arg1) {
						this.aClass69_5.method1219((long) (local22 * 520));
						try {
							this.aClass69_5.method1228(Static284.aByteArray90, 0, 8);
						} catch (@Pc(187) EOFException local187) {
							return true;
						}
						local203 = (Static284.aByteArray90[1] & 0xFF) + ((Static284.aByteArray90[0] & 0xFF) << 8);
						@Pc(218) int local218 = ((Static284.aByteArray90[2] & 0xFF) << 8) + (Static284.aByteArray90[3] & 0xFF);
						local168 = ((Static284.aByteArray90[4] & 0xFF) << 16) + ((Static284.aByteArray90[5] & 0xFF) << 8) + (Static284.aByteArray90[6] & 0xFF);
						@Pc(246) int local246 = Static284.aByteArray90[7] & 0xFF;
						if (local203 != arg3 || local164 != local218 || local246 != this.anInt5354) {
							return false;
						}
						if (local168 < 0 || (long) local168 > this.aClass69_5.method1221() / 520L) {
							return false;
						}
					}
					if (local168 == 0) {
						local168 = (int) ((this.aClass69_5.method1221() + 519L) / 520L);
						arg1 = false;
						if (local168 == 0) {
							local168++;
						}
						if (local168 == local22) {
							local168++;
						}
					}
					Static284.aByteArray90[1] = (byte) arg3;
					Static284.aByteArray90[2] = (byte) (local164 >> 8);
					if (arg0 - local162 <= 512) {
						local168 = 0;
					}
					Static284.aByteArray90[3] = (byte) local164;
					Static284.aByteArray90[0] = (byte) (arg3 >> 8);
					Static284.aByteArray90[6] = (byte) local168;
					Static284.aByteArray90[5] = (byte) (local168 >> 8);
					Static284.aByteArray90[7] = (byte) this.anInt5354;
					Static284.aByteArray90[4] = (byte) (local168 >> 16);
					this.aClass69_5.method1219((long) (local22 * 520));
					this.aClass69_5.method1225(8, 0, Static284.aByteArray90);
					local203 = arg0 - local162;
					if (local203 > 512) {
						local203 = 512;
					}
					this.aClass69_5.method1225(local203, local162, arg2);
					local162 += local203;
					local22 = local168;
					local164++;
				}
				return true;
			} catch (@Pc(421) IOException local421) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)[B")
	public byte[] method4544(@OriginalArg(0) int arg0) {
		@Pc(8) Class69 local8 = this.aClass69_5;
		synchronized (this.aClass69_5) {
			try {
				if ((long) (arg0 * 6 + 6) > this.aClass69_4.method1221()) {
					return null;
				}
				this.aClass69_4.method1219((long) (arg0 * 6));
				this.aClass69_4.method1228(Static284.aByteArray90, 0, 6);
				@Pc(78) int local78 = (Static284.aByteArray90[2] & 0xFF) + ((Static284.aByteArray90[1] & 0xFF) << 8) + ((Static284.aByteArray90[0] & 0xFF) << 16);
				@Pc(100) int local100 = ((Static284.aByteArray90[4] & 0xFF) << 8) + ((Static284.aByteArray90[3] & 0xFF) << 16) + (Static284.aByteArray90[5] & 0xFF);
				if (local78 < 0 || local78 > this.anInt5350) {
					return null;
				} else if (local100 > 0 && this.aClass69_5.method1221() / 520L >= (long) local100) {
					@Pc(140) byte[] local140 = new byte[local78];
					@Pc(142) int local142 = 0;
					@Pc(144) int local144 = 0;
					label55: while (local142 < local78) {
						if (local100 == 0) {
							return null;
						}
						this.aClass69_5.method1219((long) (local100 * 520));
						@Pc(170) int local170 = local78 - local142;
						if (local170 > 512) {
							local170 = 512;
						}
						this.aClass69_5.method1228(Static284.aByteArray90, 0, local170 + 8);
						@Pc(198) int local198 = (Static284.aByteArray90[1] & 0xFF) + ((Static284.aByteArray90[0] & 0xFF) << 8);
						@Pc(212) int local212 = (Static284.aByteArray90[3] & 0xFF) + ((Static284.aByteArray90[2] & 0xFF) << 8);
						@Pc(234) int local234 = ((Static284.aByteArray90[5] & 0xFF) << 8) + ((Static284.aByteArray90[4] & 0xFF) << 16) + (Static284.aByteArray90[6] & 0xFF);
						@Pc(240) int local240 = Static284.aByteArray90[7] & 0xFF;
						if (local198 == arg0 && local212 == local144 && this.anInt5354 == local240) {
							if (local234 >= 0 && this.aClass69_5.method1221() / 520L >= (long) local234) {
								local100 = local234;
								local144++;
								@Pc(283) int local283 = 0;
								while (true) {
									if (local170 <= local283) {
										continue label55;
									}
									local140[local142++] = Static284.aByteArray90[local283 + 8];
									local283++;
								}
							}
							return null;
						}
						return null;
					}
					return local140;
				} else {
					return null;
				}
			} catch (@Pc(312) IOException local312) {
				return null;
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "Cache:" + this.anInt5354;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II[BI)Z")
	public boolean method4545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(6) Class69 local6 = this.aClass69_5;
		synchronized (this.aClass69_5) {
			if (arg1 < 0 || arg1 > this.anInt5350) {
				throw new IllegalArgumentException();
			}
			@Pc(41) boolean local41 = this.method4543(arg1, true, arg2, arg0);
			if (!local41) {
				local41 = this.method4543(arg1, false, arg2, arg0);
			}
			return local41;
		}
	}
}
