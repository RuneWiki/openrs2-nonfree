import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class89 {

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
	private int anInt2516 = -1;

	@OriginalMember(owner = "client!fa", name = "t", descriptor = "Z")
	public boolean aBoolean159 = true;

	@OriginalMember(owner = "client!fa", name = "o", descriptor = "Lclient!re;")
	private final Class122_Sub2 aClass122_Sub2_6;

	@OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
	private final int anInt2515;

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
	private final int anInt2520;

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "Lclient!la;")
	private final Class176 aClass176_1;

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
	public final int anInt2510;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "Lclient!gq;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
	private int anInt2514;

	@OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
	private int anInt2519;

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "Lclient!bd;")
	private Interface1 anInterface1_2;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lclient!re;Lclient!la;Lclient!uo;IIIII)V")
	public Class89(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class205_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass122_Sub2_6 = arg0;
		this.anInt2515 = arg7;
		this.anInt2520 = arg6;
		this.aClass176_1 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(49) int local49;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local49 = local31 + (local35 + local37) * arg2.anInt8174;
			for (@Pc(51) int local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray9[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt2510 = 0;
			this.anInterface3_2 = null;
		} else {
			this.anInt2514 = Integer.MAX_VALUE;
			this.anInt2519 = Integer.MIN_VALUE;
			this.anInterface1_2 = this.aClass122_Sub2_6.method5660(false);
			this.anInterface1_2.method5227(local27);
			for (local49 = 0; local49 < 4; local49++) {
				@Pc(119) Buffer local119 = this.anInterface1_2.method5729();
				if (local119 != null) {
					@Pc(127) Stream local127 = this.aClass122_Sub2_6.method5555(local119);
					@Pc(131) int local131;
					@Pc(142) int local142;
					@Pc(144) int local144;
					@Pc(152) short[] local152;
					@Pc(156) int local156;
					@Pc(164) int local164;
					if (Stream.c()) {
						for (local131 = 0; local131 < local25; local131++) {
							local142 = arg2.anInt8174 * (local131 + local35) + local31;
							for (local144 = 0; local144 < local25; local144++) {
								local152 = arg2.aShortArrayArray9[local142++];
								if (local152 != null) {
									for (local156 = 0; local156 < local152.length; local156++) {
										local164 = local152[local156] & 0xFFFF;
										if (local164 < this.anInt2514) {
											this.anInt2514 = local164;
										}
										if (this.anInt2519 < local164) {
											this.anInt2519 = local164;
										}
										local127.a(local164);
									}
								}
							}
						}
					} else {
						for (local131 = 0; local131 < local25; local131++) {
							local142 = local31 + (local35 + local131) * arg2.anInt8174;
							for (local144 = 0; local144 < local25; local144++) {
								local152 = arg2.aShortArrayArray9[local142++];
								if (local152 != null) {
									for (local156 = 0; local156 < local152.length; local156++) {
										local164 = local152[local156] & 0xFFFF;
										if (local164 < this.anInt2514) {
											this.anInt2514 = local164;
										}
										if (this.anInt2519 < local164) {
											this.anInt2519 = local164;
										}
										local127.d(local164);
									}
								}
							}
						}
					}
					local127.b();
					if (this.anInterface1_2.method5730()) {
						break;
					}
				}
			}
			this.anInt2510 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
	private void method2111() {
		if (!this.aBoolean159) {
			return;
		}
		this.aBoolean159 = false;
		@Pc(22) byte[] local22 = this.aClass176_1.aByteArray77;
		@Pc(24) int local24 = 0;
		@Pc(28) int local28 = this.aClass176_1.anInt5088;
		@Pc(38) int local38 = this.anInt2520 + this.anInt2515 * this.aClass176_1.anInt5088;
		@Pc(50) int local50;
		for (@Pc(40) int local40 = -128; local40 < 0; local40++) {
			local24 = (local24 << 8) - local24;
			for (local50 = -128; local50 < 0; local50++) {
				if (local22[local38++] != 0) {
					local24++;
				}
			}
			local38 += local28 - 128;
		}
		if (this.anInterface3_2 != null && this.anInt2516 == local24) {
			this.aBoolean159 = false;
			return;
		}
		this.anInt2516 = local24;
		local50 = 0;
		local38 = local28 * this.anInt2515 + this.anInt2520;
		@Pc(116) int local116;
		@Pc(120) int local120;
		@Pc(138) int local138;
		if (!this.aClass122_Sub2_6.method5618(Static431.aClass264_15, Static526.aClass292_15)) {
			if (Static316.anIntArray580 == null) {
				Static316.anIntArray580 = new int[16384];
			}
			@Pc(237) int[] local237 = Static316.anIntArray580;
			for (local116 = -128; local116 < 0; local116++) {
				for (local120 = -128; local120 < 0; local120++) {
					if (local22[local38] == 0) {
						local138 = 0;
						if (local22[local38 - 1] != 0) {
							local138++;
						}
						if (local22[local38 + 1] != 0) {
							local138++;
						}
						if (local22[local38 - local28] != 0) {
							local138++;
						}
						if (local22[local38 + local28] != 0) {
							local138++;
						}
						local237[local50++] = local138 * 17 << 24;
					} else {
						local237[local50++] = 1140850688;
					}
					local38++;
				}
				local38 += this.aClass176_1.anInt5088 - 128;
			}
			if (this.anInterface3_2 == null) {
				this.anInterface3_2 = this.aClass122_Sub2_6.method5661(128, false, 128, Static316.anIntArray580);
				this.anInterface3_2.method7318(false, false);
			} else {
				this.anInterface3_2.method7322(128, Static316.anIntArray580, 0, 128, 128, 0);
			}
			return;
		}
		if (Static212.aByteArray55 == null) {
			Static212.aByteArray55 = new byte[16384];
		}
		@Pc(114) byte[] local114 = Static212.aByteArray55;
		for (local116 = -128; local116 < 0; local116++) {
			for (local120 = -128; local120 < 0; local120++) {
				if (local22[local38] == 0) {
					local138 = 0;
					if (local22[local38 - 1] != 0) {
						local138++;
					}
					if (local22[local38 + 1] != 0) {
						local138++;
					}
					if (local22[local38 - local28] != 0) {
						local138++;
					}
					if (local22[local38 + local28] != 0) {
						local138++;
					}
					local114[local50++] = (byte) (local138 * 17);
				} else {
					local114[local50++] = 68;
				}
				local38++;
			}
			local38 += this.aClass176_1.anInt5088 - 128;
		}
		if (this.anInterface3_2 == null) {
			this.anInterface3_2 = this.aClass122_Sub2_6.method5662(Static526.aClass292_15, Static212.aByteArray55, false, 128, 128);
			this.anInterface3_2.method7318(false, false);
		} else {
			this.anInterface3_2.method7321(128, Static212.aByteArray55, 128, Static526.aClass292_15, 128);
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!bd;IB)V")
	public void method2112(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) int arg1) {
		if (arg1 > 0) {
			this.method2111();
			this.aClass122_Sub2_6.method5651(this.anInterface3_2);
			this.aClass122_Sub2_6.method5669(Static354.aClass22_4, arg0, this.anInt2519 + 1 - this.anInt2514, this.anInt2514, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
	public void method2113() {
		this.method2112(this.anInterface1_2, this.anInt2510);
	}
}
