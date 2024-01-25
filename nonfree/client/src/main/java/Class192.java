import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class192 {

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
	private int anInt5768 = -1;

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "Z")
	public boolean aBoolean393 = true;

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "Lclient!ml;")
	private final Class209 aClass209_2;

	@OriginalMember(owner = "client!lo", name = "u", descriptor = "I")
	private final int anInt5782;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
	private final int anInt5767;

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "Lclient!rr;")
	private final Class31_Sub1 aClass31_Sub1_10;

	@OriginalMember(owner = "client!lo", name = "m", descriptor = "I")
	private int anInt5776;

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
	private int anInt5771;

	@OriginalMember(owner = "client!lo", name = "s", descriptor = "Lclient!bo;")
	private Interface2 anInterface2_4;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
	public final int anInt5769;

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "Lclient!mca;")
	private Interface12 anInterface12_3;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!rr;Lclient!ml;Lclient!hm;IIIII)V")
	public Class192(@OriginalArg(0) Class31_Sub1 arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) Class127_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass209_2 = arg1;
		this.anInt5782 = arg7;
		this.anInt5767 = arg6;
		this.aClass31_Sub1_10 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(49) int local49;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local49 = arg2.anInt10004 * (local35 + local37) + local31;
			for (@Pc(51) int local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray4[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface12_3 = null;
			this.anInt5769 = 0;
		} else {
			this.anInt5776 = Integer.MAX_VALUE;
			this.anInt5771 = Integer.MIN_VALUE;
			this.anInterface2_4 = this.aClass31_Sub1_10.method7158(false);
			this.anInterface2_4.method7282(local27);
			for (local49 = 0; local49 < 4; local49++) {
				@Pc(112) Buffer local112 = this.anInterface2_4.method7292();
				if (local112 != null) {
					@Pc(120) Stream local120 = this.aClass31_Sub1_10.method7154(local112);
					@Pc(124) int local124;
					@Pc(135) int local135;
					@Pc(137) int local137;
					@Pc(145) short[] local145;
					@Pc(149) int local149;
					@Pc(157) int local157;
					if (Stream.a()) {
						for (local124 = 0; local124 < local25; local124++) {
							local135 = arg2.anInt10004 * (local35 + local124) + local31;
							for (local137 = 0; local137 < local25; local137++) {
								local145 = arg2.aShortArrayArray4[local135++];
								if (local145 != null) {
									for (local149 = 0; local149 < local145.length; local149++) {
										local157 = local145[local149] & 0xFFFF;
										if (this.anInt5771 < local157) {
											this.anInt5771 = local157;
										}
										if (this.anInt5776 > local157) {
											this.anInt5776 = local157;
										}
										local120.e(local157);
									}
								}
							}
						}
					} else {
						for (local124 = 0; local124 < local25; local124++) {
							local135 = (local35 + local124) * arg2.anInt10004 + local31;
							for (local137 = 0; local137 < local25; local137++) {
								local145 = arg2.aShortArrayArray4[local135++];
								if (local145 != null) {
									for (local149 = 0; local149 < local145.length; local149++) {
										local157 = local145[local149] & 0xFFFF;
										if (this.anInt5776 > local157) {
											this.anInt5776 = local157;
										}
										if (this.anInt5771 < local157) {
											this.anInt5771 = local157;
										}
										local120.c(local157);
									}
								}
							}
						}
					}
					local120.c();
					if (this.anInterface2_4.method7291()) {
						break;
					}
				}
			}
			this.anInt5769 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
	private void method4674() {
		if (!this.aBoolean393) {
			return;
		}
		this.aBoolean393 = false;
		@Pc(16) byte[] local16 = this.aClass209_2.aByteArray155;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass209_2.anInt6080;
		@Pc(32) int local32 = this.aClass209_2.anInt6080 * this.anInt5782 + this.anInt5767;
		for (@Pc(34) int local34 = -128; local34 < 0; local34++) {
			local18 = (local18 << 8) - local18;
			for (@Pc(45) int local45 = -128; local45 < 0; local45++) {
				if (local16[local32++] != 0) {
					local18++;
				}
			}
			local32 += local22 - 128;
		}
		if (this.anInterface12_3 != null && local18 == this.anInt5768) {
			this.aBoolean393 = false;
			return;
		}
		this.anInt5768 = local18;
		@Pc(99) int local99 = 0;
		local32 = this.anInt5767 + this.anInt5782 * local22;
		@Pc(124) int local124;
		@Pc(128) int local128;
		@Pc(139) int local139;
		if (!this.aClass31_Sub1_10.method7080(Static331.aClass204_13, Static199.aClass245_11)) {
			if (Static361.anIntArray355 == null) {
				Static361.anIntArray355 = new int[16384];
			}
			@Pc(248) int[] local248 = Static361.anIntArray355;
			for (local124 = -128; local124 < 0; local124++) {
				for (local128 = -128; local128 < 0; local128++) {
					if (local16[local32] == 0) {
						local139 = 0;
						if (local16[local32 - 1] != 0) {
							local139++;
						}
						if (local16[local32 + 1] != 0) {
							local139++;
						}
						if (local16[local32 - local22] != 0) {
							local139++;
						}
						if (local16[local32 + local22] != 0) {
							local139++;
						}
						local248[local99++] = local139 * 17 << 24;
					} else {
						local248[local99++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass209_2.anInt6080 - 128;
			}
			if (this.anInterface12_3 == null) {
				this.anInterface12_3 = this.aClass31_Sub1_10.method7089(Static361.anIntArray355, 128, false, 128);
				this.anInterface12_3.method2990(false, false);
			} else {
				this.anInterface12_3.method2995(128, Static361.anIntArray355, 128, 0, 128, 0);
			}
			return;
		}
		if (Static159.aByteArray235 == null) {
			Static159.aByteArray235 = new byte[16384];
		}
		@Pc(122) byte[] local122 = Static159.aByteArray235;
		for (local124 = -128; local124 < 0; local124++) {
			for (local128 = -128; local128 < 0; local128++) {
				if (local16[local32] == 0) {
					local139 = 0;
					if (local16[local32 - 1] != 0) {
						local139++;
					}
					if (local16[local32 + 1] != 0) {
						local139++;
					}
					if (local16[local32 - local22] != 0) {
						local139++;
					}
					if (local16[local22 + local32] != 0) {
						local139++;
					}
					local122[local99++] = (byte) (local139 * 17);
				} else {
					local122[local99++] = 68;
				}
				local32++;
			}
			local32 += this.aClass209_2.anInt6080 - 128;
		}
		if (this.anInterface12_3 == null) {
			this.anInterface12_3 = this.aClass31_Sub1_10.method7087(Static159.aByteArray235, false, Static199.aClass245_11, 128, 128);
			this.anInterface12_3.method2990(false, false);
		} else {
			this.anInterface12_3.method2989(Static199.aClass245_11, Static159.aByteArray235, 128, 128, 128);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BLclient!bo;I)V")
	public void method4676(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 0) {
			this.method4674();
			this.aClass31_Sub1_10.method7129(this.anInterface12_3);
			this.aClass31_Sub1_10.method7174(Static486.aClass265_10, this.anInt5771 + 1 - this.anInt5776, arg0, 0, arg1, this.anInt5776);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)V")
	public void method4677() {
		this.method4676(this.anInterface2_4, this.anInt5769);
	}
}
