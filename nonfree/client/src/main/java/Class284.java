import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class284 {

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
	private int anInt7647 = -1;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "Z")
	public boolean aBoolean516 = true;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "Lclient!pja;")
	private final Class291 aClass291_2;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Lclient!jca;")
	private final Class22_Sub2 aClass22_Sub2_15;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
	private final int anInt7644;

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
	private final int anInt7650;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
	private int anInt7649;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
	private int anInt7645;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "Lclient!kl;")
	private Interface11 anInterface11_5;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
	public final int anInt7651;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "Lclient!pt;")
	private Interface16 anInterface16_4;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!jca;Lclient!pja;Lclient!ne;IIIII)V")
	public Class284(@OriginalArg(0) Class22_Sub2 arg0, @OriginalArg(1) Class291 arg1, @OriginalArg(2) Class259_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass291_2 = arg1;
		this.aClass22_Sub2_15 = arg0;
		this.anInt7644 = arg7;
		this.anInt7650 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local50 = local31 + (local37 + local35) * arg2.anInt10949;
			for (@Pc(52) int local52 = 0; local52 < local25; local52++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray3[local50++];
				if (local60 != null) {
					local27 += local60.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt7651 = 0;
			this.anInterface16_4 = null;
		} else {
			this.anInt7649 = Integer.MIN_VALUE;
			this.anInt7645 = Integer.MAX_VALUE;
			this.anInterface11_5 = this.aClass22_Sub2_15.method8916(false);
			this.anInterface11_5.method6757(local27);
			for (local50 = 0; local50 < 4; local50++) {
				@Pc(117) Buffer local117 = this.anInterface11_5.method5367();
				if (local117 != null) {
					@Pc(125) Stream local125 = this.aClass22_Sub2_15.method8918(local117);
					@Pc(129) int local129;
					@Pc(140) int local140;
					@Pc(142) int local142;
					@Pc(150) short[] local150;
					@Pc(154) int local154;
					@Pc(162) int local162;
					if (Stream.c()) {
						for (local129 = 0; local129 < local25; local129++) {
							local140 = local31 + arg2.anInt10949 * (local129 + local35);
							for (local142 = 0; local142 < local25; local142++) {
								local150 = arg2.aShortArrayArray3[local140++];
								if (local150 != null) {
									for (local154 = 0; local154 < local150.length; local154++) {
										local162 = local150[local154] & 0xFFFF;
										if (this.anInt7645 > local162) {
											this.anInt7645 = local162;
										}
										if (local162 > this.anInt7649) {
											this.anInt7649 = local162;
										}
										local125.d(local162);
									}
								}
							}
						}
					} else {
						for (local129 = 0; local129 < local25; local129++) {
							local140 = local31 + (local129 + local35) * arg2.anInt10949;
							for (local142 = 0; local142 < local25; local142++) {
								local150 = arg2.aShortArrayArray3[local140++];
								if (local150 != null) {
									for (local154 = 0; local154 < local150.length; local154++) {
										local162 = local150[local154] & 0xFFFF;
										if (this.anInt7645 > local162) {
											this.anInt7645 = local162;
										}
										if (this.anInt7649 < local162) {
											this.anInt7649 = local162;
										}
										local125.a(local162);
									}
								}
							}
						}
					}
					local125.b();
					if (this.anInterface11_5.method5366()) {
						break;
					}
				}
			}
			this.anInt7651 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BLclient!kl;I)V")
	public void method6601(@OriginalArg(1) Interface11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 0) {
			this.method6603();
			this.aClass22_Sub2_15.method8976(this.anInterface16_4);
			this.aClass22_Sub2_15.method8861(Static492.aClass234_6, this.anInt7645, arg1, this.anInt7649 + 1 - this.anInt7645, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
	public void method6602() {
		this.method6601(this.anInterface11_5, this.anInt7651);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)V")
	private void method6603() {
		if (!this.aBoolean516) {
			return;
		}
		this.aBoolean516 = false;
		@Pc(17) byte[] local17 = this.aClass291_2.aByteArray79;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = this.aClass291_2.anInt7988;
		@Pc(34) int local34 = this.anInt7650 + this.anInt7644 * this.aClass291_2.anInt7988;
		@Pc(55) int local55;
		for (@Pc(44) int local44 = -128; local44 < 0; local44++) {
			local19 = (local19 << 8) - local19;
			for (local55 = -128; local55 < 0; local55++) {
				if (local17[local34++] != 0) {
					local19++;
				}
			}
			local34 += local23 - 128;
		}
		if (this.anInterface16_4 != null && local19 == this.anInt7647) {
			this.aBoolean516 = false;
			return;
		}
		this.anInt7647 = local19;
		local34 = this.anInt7650 + this.anInt7644 * local23;
		local55 = 0;
		@Pc(146) int local146;
		@Pc(150) int local150;
		@Pc(169) int local169;
		if (!this.aClass22_Sub2_15.method8953(Static259.aClass167_7, Static702.aClass335_19)) {
			if (Static721.anIntArray400 == null) {
				Static721.anIntArray400 = new int[16384];
			}
			@Pc(144) int[] local144 = Static721.anIntArray400;
			for (local146 = -128; local146 < 0; local146++) {
				for (local150 = -128; local150 < 0; local150++) {
					if (local17[local34] == 0) {
						local169 = 0;
						if (local17[local34 - 1] != 0) {
							local169++;
						}
						if (local17[local34 + 1] != 0) {
							local169++;
						}
						if (local17[local34 - local23] != 0) {
							local169++;
						}
						if (local17[local23 + local34] != 0) {
							local169++;
						}
						local144[local55++] = local169 * 17 << 24;
					} else {
						local144[local55++] = 1140850688;
					}
					local34++;
				}
				local34 += this.aClass291_2.anInt7988 - 128;
			}
			if (this.anInterface16_4 == null) {
				this.anInterface16_4 = this.aClass22_Sub2_15.method8950(Static721.anIntArray400, 128, 128, false);
				this.anInterface16_4.method8248(false, false);
			} else {
				this.anInterface16_4.method8242(128, 0, 128, Static721.anIntArray400, 0, 128);
			}
			return;
		}
		if (Static106.aByteArray21 == null) {
			Static106.aByteArray21 = new byte[16384];
		}
		@Pc(279) byte[] local279 = Static106.aByteArray21;
		for (local146 = -128; local146 < 0; local146++) {
			for (local150 = -128; local150 < 0; local150++) {
				if (local17[local34] == 0) {
					local169 = 0;
					if (local17[local34 - 1] != 0) {
						local169++;
					}
					if (local17[local34 + 1] != 0) {
						local169++;
					}
					if (local17[local34 - local23] != 0) {
						local169++;
					}
					if (local17[local34 + local23] != 0) {
						local169++;
					}
					local279[local55++] = (byte) (local169 * 17);
				} else {
					local279[local55++] = 68;
				}
				local34++;
			}
			local34 += this.aClass291_2.anInt7988 - 128;
		}
		if (this.anInterface16_4 == null) {
			this.anInterface16_4 = this.aClass22_Sub2_15.method8934(128, 128, Static702.aClass335_19, Static106.aByteArray21, false);
			this.anInterface16_4.method8248(false, false);
		} else {
			this.anInterface16_4.method8243(128, 128, Static702.aClass335_19, Static106.aByteArray21, 128);
		}
	}
}
