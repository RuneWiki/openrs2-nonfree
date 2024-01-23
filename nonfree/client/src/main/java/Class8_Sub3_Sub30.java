import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class8_Sub3_Sub30 extends Class8_Sub3 {

	@OriginalMember(owner = "client!pj", name = "L", descriptor = "I")
	private int anInt4212 = 6;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub30() {
		super(2, false);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt4212 = arg1.method2334();
		} else if (arg0 == 1) {
			this.aBoolean469 = arg1.method2334() == 1;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			@Pc(28) int[] local28 = this.method4230(arg0, 0);
			@Pc(34) int[] local34 = this.method4230(arg0, 1);
			@Pc(37) int local37 = this.anInt4212;
			if (local37 == 1) {
				for (local37 = 0; local37 < Static239.anInt4789; local37++) {
					local11[local37] = local28[local37] + local34[local37];
				}
			} else if (local37 == 2) {
				for (local37 = 0; local37 < Static239.anInt4789; local37++) {
					local11[local37] = local28[local37] - local34[local37];
				}
			} else if (local37 == 3) {
				for (local37 = 0; local37 < Static239.anInt4789; local37++) {
					local11[local37] = local34[local37] * local28[local37] >> 12;
				}
			} else {
				@Pc(174) int local174;
				if (local37 == 4) {
					for (local37 = 0; local37 < Static239.anInt4789; local37++) {
						local174 = local34[local37];
						local11[local37] = local174 == 0 ? 4096 : (local28[local37] << 12) / local174;
					}
				} else if (local37 == 5) {
					for (local37 = 0; local37 < Static239.anInt4789; local37++) {
						local11[local37] = 4096 - ((4096 - local34[local37]) * (-local28[local37] + 4096) >> 12);
					}
				} else if (local37 == 6) {
					for (local37 = 0; local37 < Static239.anInt4789; local37++) {
						local174 = local34[local37];
						local11[local37] = local174 < 2048 ? local28[local37] * local174 >> 11 : 4096 - ((4096 - local174) * (-local28[local37] + 4096) >> 11);
					}
				} else {
					@Pc(288) int local288;
					if (local37 == 7) {
						for (local37 = 0; local37 < Static239.anInt4789; local37++) {
							local288 = local28[local37];
							local11[local37] = local288 == 4096 ? 4096 : (local34[local37] << 12) / (4096 - local288);
						}
					} else if (local37 == 8) {
						for (local37 = 0; local37 < Static239.anInt4789; local37++) {
							local288 = local28[local37];
							local11[local37] = local288 == 0 ? 0 : 4096 - (4096 - local34[local37] << 12) / local288;
						}
					} else if (local37 == 9) {
						for (local37 = 0; local37 < Static239.anInt4789; local37++) {
							local174 = local34[local37];
							local288 = local28[local37];
							local11[local37] = local288 < local174 ? local288 : local174;
						}
					} else if (local37 == 10) {
						for (local37 = 0; local37 < Static239.anInt4789; local37++) {
							local174 = local34[local37];
							local288 = local28[local37];
							local11[local37] = local174 < local288 ? local288 : local174;
						}
					} else if (local37 == 11) {
						for (local37 = 0; local37 < Static239.anInt4789; local37++) {
							local288 = local28[local37];
							local174 = local34[local37];
							local11[local37] = local288 > local174 ? local288 - local174 : -local288 + local174;
						}
					} else if (local37 == 12) {
						for (local37 = 0; local37 < Static239.anInt4789; local37++) {
							local288 = local28[local37];
							local174 = local34[local37];
							local11[local37] = local288 + local174 - (local174 * local288 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4217(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass166_41.method4037(arg0);
		if (this.aClass166_41.aBoolean451) {
			@Pc(23) int[][] local23 = this.method4224(arg0, 0);
			@Pc(31) int[][] local31 = this.method4224(arg0, 1);
			@Pc(35) int[] local35 = local11[2];
			@Pc(39) int[] local39 = local23[1];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local23[0];
			@Pc(51) int[] local51 = local23[2];
			@Pc(55) int[] local55 = local31[0];
			@Pc(59) int[] local59 = local31[1];
			@Pc(63) int[] local63 = local11[1];
			@Pc(67) int[] local67 = local31[2];
			@Pc(70) int local70 = this.anInt4212;
			if (local70 == 1) {
				for (local70 = 0; local70 < Static239.anInt4789; local70++) {
					local43[local70] = local47[local70] + local55[local70];
					local63[local70] = local59[local70] + local39[local70];
					local35[local70] = local67[local70] + local51[local70];
				}
			} else if (local70 == 2) {
				for (local70 = 0; local70 < Static239.anInt4789; local70++) {
					local43[local70] = local47[local70] - local55[local70];
					local63[local70] = local39[local70] - local59[local70];
					local35[local70] = local51[local70] - local67[local70];
				}
			} else if (local70 == 3) {
				for (local70 = 0; local70 < Static239.anInt4789; local70++) {
					local43[local70] = local47[local70] * local55[local70] >> 12;
					local63[local70] = local39[local70] * local59[local70] >> 12;
					local35[local70] = local67[local70] * local51[local70] >> 12;
				}
			} else {
				@Pc(267) int local267;
				@Pc(271) int local271;
				@Pc(263) int local263;
				if (local70 == 4) {
					for (local70 = 0; local70 < Static239.anInt4789; local70++) {
						local263 = local67[local70];
						local267 = local55[local70];
						local271 = local59[local70];
						local43[local70] = local267 == 0 ? 4096 : (local47[local70] << 12) / local267;
						local63[local70] = local271 == 0 ? 4096 : (local39[local70] << 12) / local271;
						local35[local70] = local263 == 0 ? 4096 : (local51[local70] << 12) / local263;
					}
				} else if (local70 == 5) {
					for (local70 = 0; local70 < Static239.anInt4789; local70++) {
						local43[local70] = 4096 - ((4096 - local55[local70]) * (-local47[local70] + 4096) >> 12);
						local63[local70] = 4096 - ((4096 - local59[local70]) * (-local39[local70] + 4096) >> 12);
						local35[local70] = 4096 - ((4096 - local51[local70]) * (-local67[local70] + 4096) >> 12);
					}
				} else if (local70 == 6) {
					for (local70 = 0; local70 < Static239.anInt4789; local70++) {
						local271 = local59[local70];
						local263 = local67[local70];
						local267 = local55[local70];
						local43[local70] = local267 >= 2048 ? 4096 - ((4096 - local267) * (-local47[local70] + 4096) >> 11) : local47[local70] * local267 >> 11;
						local63[local70] = local271 < 2048 ? local39[local70] * local271 >> 11 : 4096 - ((4096 - local39[local70]) * (-local271 + 4096) >> 11);
						local35[local70] = local263 >= 2048 ? 4096 - ((4096 - local263) * (-local51[local70] + 4096) >> 11) : local51[local70] * local263 >> 11;
					}
				} else {
					@Pc(527) int local527;
					@Pc(523) int local523;
					@Pc(519) int local519;
					if (local70 == 7) {
						for (local70 = 0; local70 < Static239.anInt4789; local70++) {
							local519 = local51[local70];
							local523 = local39[local70];
							local527 = local47[local70];
							local43[local70] = local527 == 4096 ? 4096 : (local55[local70] << 12) / (4096 - local527);
							local63[local70] = local523 == 4096 ? 4096 : (local59[local70] << 12) / (4096 - local523);
							local35[local70] = local519 == 4096 ? 4096 : (local67[local70] << 12) / (4096 - local519);
						}
					} else if (local70 == 8) {
						for (local70 = 0; local70 < Static239.anInt4789; local70++) {
							local519 = local51[local70];
							local527 = local47[local70];
							local523 = local39[local70];
							local43[local70] = local527 == 0 ? 0 : 4096 - (4096 - local55[local70] << 12) / local527;
							local63[local70] = local523 == 0 ? 0 : 4096 - (4096 - local59[local70] << 12) / local523;
							local35[local70] = local519 == 0 ? 0 : 4096 - (4096 - local67[local70] << 12) / local519;
						}
					} else if (local70 == 9) {
						for (local70 = 0; local70 < Static239.anInt4789; local70++) {
							local519 = local51[local70];
							local523 = local39[local70];
							local263 = local67[local70];
							local527 = local47[local70];
							local267 = local55[local70];
							local271 = local59[local70];
							local43[local70] = local527 >= local267 ? local267 : local527;
							local63[local70] = local271 > local523 ? local523 : local271;
							local35[local70] = local263 <= local519 ? local263 : local519;
						}
					} else if (local70 == 10) {
						for (local70 = 0; local70 < Static239.anInt4789; local70++) {
							local271 = local59[local70];
							local267 = local55[local70];
							local263 = local67[local70];
							local519 = local51[local70];
							local527 = local47[local70];
							local523 = local39[local70];
							local43[local70] = local267 >= local527 ? local267 : local527;
							local63[local70] = local271 < local523 ? local523 : local271;
							local35[local70] = local519 <= local263 ? local263 : local519;
						}
					} else if (local70 == 11) {
						for (local70 = 0; local70 < Static239.anInt4789; local70++) {
							local267 = local55[local70];
							local523 = local39[local70];
							local271 = local59[local70];
							local263 = local67[local70];
							local519 = local51[local70];
							local527 = local47[local70];
							local43[local70] = local527 > local267 ? local527 - local267 : -local527 + local267;
							local63[local70] = local523 <= local271 ? local271 - local523 : -local271 + local523;
							local35[local70] = local519 > local263 ? local519 - local263 : -local519 + local263;
						}
					} else if (local70 == 12) {
						for (local70 = 0; local70 < Static239.anInt4789; local70++) {
							local519 = local51[local70];
							local267 = local55[local70];
							local263 = local67[local70];
							local527 = local47[local70];
							local271 = local59[local70];
							local523 = local39[local70];
							local43[local70] = local267 + local527 - (local267 * local527 >> 11);
							local63[local70] = local271 + local523 - (local271 * local523 >> 11);
							local35[local70] = local519 + local263 - (local263 * local519 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
