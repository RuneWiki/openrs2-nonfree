import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class202 {

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
	private int anInt6849 = -1;

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "Z")
	public boolean aBoolean504 = true;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "Lclient!wga;")
	private final Class20_Sub2 aClass20_Sub2_16;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
	private final int anInt6837;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
	private final int anInt6850;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "Lclient!dg;")
	private final Class73 aClass73_1;

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
	public final int anInt6851;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Lclient!wfa;")
	private Interface27 anInterface27_5;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
	private int anInt6839;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
	private int anInt6840;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Lclient!uq;")
	private Interface24 anInterface24_4;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!wga;Lclient!dg;Lclient!qm;IIIII)V")
	public Class202(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) Class65_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass20_Sub2_16 = arg0;
		this.anInt6837 = arg6;
		this.anInt6850 = arg7;
		this.aClass73_1 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local48 = local31 + (local37 + local35) * arg2.anInt9615;
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray23[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt6851 = 0;
			this.anInterface27_5 = null;
		} else {
			this.anInt6839 = Integer.MIN_VALUE;
			this.anInt6840 = Integer.MAX_VALUE;
			this.anInterface24_4 = this.aClass20_Sub2_16.method1474(false);
			this.anInterface24_4.method6476(local27);
			for (local48 = 0; local48 < 4; local48++) {
				@Pc(110) Buffer local110 = this.anInterface24_4.method6477();
				if (local110 != null) {
					@Pc(118) Stream local118 = this.aClass20_Sub2_16.method1527(local110);
					@Pc(122) int local122;
					@Pc(134) int local134;
					@Pc(136) int local136;
					@Pc(144) short[] local144;
					@Pc(148) int local148;
					@Pc(156) int local156;
					if (Stream.c()) {
						for (local122 = 0; local122 < local25; local122++) {
							local134 = arg2.anInt9615 * (local122 + local35) + local31;
							for (local136 = 0; local136 < local25; local136++) {
								local144 = arg2.aShortArrayArray23[local134++];
								if (local144 != null) {
									for (local148 = 0; local148 < local144.length; local148++) {
										local156 = local144[local148] & 0xFFFF;
										if (this.anInt6839 < local156) {
											this.anInt6839 = local156;
										}
										if (local156 < this.anInt6840) {
											this.anInt6840 = local156;
										}
										local118.d(local156);
									}
								}
							}
						}
					} else {
						for (local122 = 0; local122 < local25; local122++) {
							local134 = arg2.anInt9615 * (local35 + local122) + local31;
							for (local136 = 0; local136 < local25; local136++) {
								local144 = arg2.aShortArrayArray23[local134++];
								if (local144 != null) {
									for (local148 = 0; local148 < local144.length; local148++) {
										local156 = local144[local148] & 0xFFFF;
										if (local156 < this.anInt6840) {
											this.anInt6840 = local156;
										}
										if (local156 > this.anInt6839) {
											this.anInt6839 = local156;
										}
										local118.a(local156);
									}
								}
							}
						}
					}
					local118.a();
					if (this.anInterface24_4.method6474()) {
						break;
					}
				}
			}
			this.anInt6851 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public void method5847() {
		this.method5851(this.anInterface24_4, this.anInt6851);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	private void method5850() {
		if (!this.aBoolean504) {
			return;
		}
		this.aBoolean504 = false;
		@Pc(16) byte[] local16 = this.aClass73_1.aByteArray34;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass73_1.anInt2726;
		@Pc(32) int local32 = this.aClass73_1.anInt2726 * this.anInt6850 + this.anInt6837;
		@Pc(44) int local44;
		for (@Pc(34) int local34 = -128; local34 < 0; local34++) {
			local18 = (local18 << 8) - local18;
			for (local44 = -128; local44 < 0; local44++) {
				if (local16[local32++] != 0) {
					local18++;
				}
			}
			local32 += local22 - 128;
		}
		if (this.anInterface27_5 != null && this.anInt6849 == local18) {
			this.aBoolean504 = false;
			return;
		}
		this.anInt6849 = local18;
		local44 = 0;
		local32 = this.anInt6837 + this.anInt6850 * local22;
		@Pc(120) int local120;
		@Pc(124) int local124;
		@Pc(135) int local135;
		if (!this.aClass20_Sub2_16.method1514(Static29.aClass26_4, Static155.aClass375_18)) {
			if (Static239.anIntArray268 == null) {
				Static239.anIntArray268 = new int[16384];
			}
			@Pc(254) int[] local254 = Static239.anIntArray268;
			for (local120 = -128; local120 < 0; local120++) {
				for (local124 = -128; local124 < 0; local124++) {
					if (local16[local32] == 0) {
						local135 = 0;
						if (local16[local32 - 1] != 0) {
							local135++;
						}
						if (local16[local32 + 1] != 0) {
							local135++;
						}
						if (local16[local32 - local22] != 0) {
							local135++;
						}
						if (local16[local22 + local32] != 0) {
							local135++;
						}
						local254[local44++] = local135 * 17 << 24;
					} else {
						local254[local44++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass73_1.anInt2726 - 128;
			}
			if (this.anInterface27_5 == null) {
				this.anInterface27_5 = this.aClass20_Sub2_16.method1473(128, 128, false, Static239.anIntArray268);
				this.anInterface27_5.method8300(false, false);
			} else {
				this.anInterface27_5.method8302(128, Static239.anIntArray268, 0, 128, 0, 128);
			}
			return;
		}
		if (Static407.aByteArray102 == null) {
			Static407.aByteArray102 = new byte[16384];
		}
		@Pc(118) byte[] local118 = Static407.aByteArray102;
		for (local120 = -128; local120 < 0; local120++) {
			for (local124 = -128; local124 < 0; local124++) {
				if (local16[local32] == 0) {
					local135 = 0;
					if (local16[local32 - 1] != 0) {
						local135++;
					}
					if (local16[local32 + 1] != 0) {
						local135++;
					}
					if (local16[local32 - local22] != 0) {
						local135++;
					}
					if (local16[local22 + local32] != 0) {
						local135++;
					}
					local118[local44++] = (byte) (local135 * 17);
				} else {
					local118[local44++] = 68;
				}
				local32++;
			}
			local32 += this.aClass73_1.anInt2726 - 128;
		}
		if (this.anInterface27_5 == null) {
			this.anInterface27_5 = this.aClass20_Sub2_16.method1578(Static407.aByteArray102, 128, Static155.aClass375_18, false, 128);
			this.anInterface27_5.method8300(false, false);
		} else {
			this.anInterface27_5.method8304(128, 128, 128, Static407.aByteArray102, Static155.aClass375_18);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!uq;I)V")
	public void method5851(@OriginalArg(1) Interface24 arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 0) {
			this.method5850();
			this.aClass20_Sub2_16.method1484(this.anInterface27_5);
			this.aClass20_Sub2_16.method1572(Static539.aClass134_6, arg1, arg0, this.anInt6840, 0, this.anInt6839 + 1 - this.anInt6840);
		}
	}
}
