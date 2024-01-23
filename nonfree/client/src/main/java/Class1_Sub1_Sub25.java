import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class1_Sub1_Sub25 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nm", name = "Y", descriptor = "I")
	private int anInt4073 = 6;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub25() {
		super(2, false);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4073 = arg0.method2655();
		} else if (arg1 == 1) {
			this.aBoolean324 = arg0.method2655() == 1;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4749(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = this.aClass70_41.method1662(arg0);
		if (this.aClass70_41.aBoolean118) {
			@Pc(25) int[][] local25 = this.method4758(0, arg0);
			@Pc(31) int[][] local31 = this.method4758(1, arg0);
			@Pc(35) int[] local35 = local15[1];
			@Pc(39) int[] local39 = local15[2];
			@Pc(43) int[] local43 = local15[0];
			@Pc(47) int[] local47 = local25[1];
			@Pc(51) int[] local51 = local25[0];
			@Pc(55) int[] local55 = local31[0];
			@Pc(59) int[] local59 = local31[1];
			@Pc(63) int[] local63 = local25[2];
			@Pc(67) int[] local67 = local31[2];
			@Pc(70) int local70 = this.anInt4073;
			if (local70 == 1) {
				for (local70 = 0; local70 < Static75.anInt1848; local70++) {
					local43[local70] = local55[local70] + local51[local70];
					local35[local70] = local47[local70] + local59[local70];
					local39[local70] = local67[local70] + local63[local70];
				}
			} else if (local70 == 2) {
				for (local70 = 0; local70 < Static75.anInt1848; local70++) {
					local43[local70] = local51[local70] - local55[local70];
					local35[local70] = local47[local70] - local59[local70];
					local39[local70] = local63[local70] - local67[local70];
				}
			} else if (local70 == 3) {
				for (local70 = 0; local70 < Static75.anInt1848; local70++) {
					local43[local70] = local51[local70] * local55[local70] >> 12;
					local35[local70] = local59[local70] * local47[local70] >> 12;
					local39[local70] = local67[local70] * local63[local70] >> 12;
				}
			} else {
				@Pc(279) int local279;
				@Pc(271) int local271;
				@Pc(275) int local275;
				if (local70 == 4) {
					for (local70 = 0; local70 < Static75.anInt1848; local70++) {
						local271 = local59[local70];
						local275 = local67[local70];
						local279 = local55[local70];
						local43[local70] = local279 == 0 ? 4096 : (local51[local70] << 12) / local279;
						local35[local70] = local271 == 0 ? 4096 : (local47[local70] << 12) / local271;
						local39[local70] = local275 == 0 ? 4096 : (local63[local70] << 12) / local275;
					}
				} else if (local70 == 5) {
					for (local70 = 0; local70 < Static75.anInt1848; local70++) {
						local43[local70] = 4096 - ((4096 - local51[local70]) * (-local55[local70] + 4096) >> 12);
						local35[local70] = 4096 - ((4096 - local59[local70]) * (-local47[local70] + 4096) >> 12);
						local39[local70] = 4096 - ((4096 - local67[local70]) * (-local63[local70] + 4096) >> 12);
					}
				} else if (local70 == 6) {
					for (local70 = 0; local70 < Static75.anInt1848; local70++) {
						local271 = local59[local70];
						local279 = local55[local70];
						local275 = local67[local70];
						local43[local70] = local279 >= 2048 ? 4096 - ((4096 - local279) * (-local51[local70] + 4096) >> 11) : local279 * local51[local70] >> 11;
						local35[local70] = local271 < 2048 ? local271 * local47[local70] >> 11 : 4096 - ((4096 - local271) * (-local47[local70] + 4096) >> 11);
						local39[local70] = local275 >= 2048 ? 4096 - ((4096 - local63[local70]) * (-local275 + 4096) >> 11) : local63[local70] * local275 >> 11;
					}
				} else {
					@Pc(530) int local530;
					@Pc(538) int local538;
					@Pc(534) int local534;
					if (local70 == 7) {
						for (local70 = 0; local70 < Static75.anInt1848; local70++) {
							local530 = local51[local70];
							local534 = local63[local70];
							local538 = local47[local70];
							local43[local70] = local530 == 4096 ? 4096 : (local55[local70] << 12) / (4096 - local530);
							local35[local70] = local538 == 4096 ? 4096 : (local59[local70] << 12) / (4096 - local538);
							local39[local70] = local534 == 4096 ? 4096 : (local67[local70] << 12) / (4096 - local534);
						}
					} else if (local70 == 8) {
						for (local70 = 0; local70 < Static75.anInt1848; local70++) {
							local530 = local51[local70];
							local534 = local63[local70];
							local538 = local47[local70];
							local43[local70] = local530 == 0 ? 0 : 4096 - (4096 - local55[local70] << 12) / local530;
							local35[local70] = local538 == 0 ? 0 : 4096 - (4096 - local59[local70] << 12) / local538;
							local39[local70] = local534 == 0 ? 0 : 4096 - (4096 - local67[local70] << 12) / local534;
						}
					} else if (local70 == 9) {
						for (local70 = 0; local70 < Static75.anInt1848; local70++) {
							local271 = local59[local70];
							local530 = local51[local70];
							local538 = local47[local70];
							local275 = local67[local70];
							local279 = local55[local70];
							local534 = local63[local70];
							local43[local70] = local279 > local530 ? local530 : local279;
							local35[local70] = local271 <= local538 ? local271 : local538;
							local39[local70] = local275 <= local534 ? local275 : local534;
						}
					} else if (local70 == 10) {
						for (local70 = 0; local70 < Static75.anInt1848; local70++) {
							local530 = local51[local70];
							local534 = local63[local70];
							local275 = local67[local70];
							local271 = local59[local70];
							local538 = local47[local70];
							local279 = local55[local70];
							local43[local70] = local279 >= local530 ? local279 : local530;
							local35[local70] = local271 < local538 ? local538 : local271;
							local39[local70] = local275 < local534 ? local534 : local275;
						}
					} else if (local70 == 11) {
						for (local70 = 0; local70 < Static75.anInt1848; local70++) {
							local275 = local67[local70];
							local530 = local51[local70];
							local534 = local63[local70];
							local538 = local47[local70];
							local279 = local55[local70];
							local271 = local59[local70];
							local43[local70] = local530 <= local279 ? local279 - local530 : local530 + -local279;
							local35[local70] = local271 >= local538 ? local271 - local538 : -local271 + local538;
							local39[local70] = local275 < local534 ? local534 - local275 : local275 + -local534;
						}
					} else if (local70 == 12) {
						for (local70 = 0; local70 < Static75.anInt1848; local70++) {
							local530 = local51[local70];
							local279 = local55[local70];
							local538 = local47[local70];
							local534 = local63[local70];
							local275 = local67[local70];
							local271 = local59[local70];
							local43[local70] = local530 + local279 - (local530 * local279 >> 11);
							local35[local70] = local538 + local271 - (local271 * local538 >> 11);
							local39[local70] = local275 + local534 - (local534 * local275 >> 11);
						}
					}
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			@Pc(28) int[] local28 = this.method4746(0, arg0);
			@Pc(34) int[] local34 = this.method4746(1, arg0);
			@Pc(37) int local37 = this.anInt4073;
			if (local37 == 1) {
				for (local37 = 0; local37 < Static75.anInt1848; local37++) {
					local17[local37] = local28[local37] + local34[local37];
				}
			} else if (local37 == 2) {
				for (local37 = 0; local37 < Static75.anInt1848; local37++) {
					local17[local37] = local28[local37] - local34[local37];
				}
			} else if (local37 == 3) {
				for (local37 = 0; local37 < Static75.anInt1848; local37++) {
					local17[local37] = local28[local37] * local34[local37] >> 12;
				}
			} else {
				@Pc(164) int local164;
				if (local37 == 4) {
					for (local37 = 0; local37 < Static75.anInt1848; local37++) {
						local164 = local34[local37];
						local17[local37] = local164 == 0 ? 4096 : (local28[local37] << 12) / local164;
					}
				} else if (local37 == 5) {
					for (local37 = 0; local37 < Static75.anInt1848; local37++) {
						local17[local37] = 4096 - ((4096 - local34[local37]) * (-local28[local37] + 4096) >> 12);
					}
				} else if (local37 == 6) {
					for (local37 = 0; local37 < Static75.anInt1848; local37++) {
						local164 = local34[local37];
						local17[local37] = local164 < 2048 ? local164 * local28[local37] >> 11 : 4096 - ((4096 - local28[local37]) * (-local164 + 4096) >> 11);
					}
				} else {
					@Pc(276) int local276;
					if (local37 == 7) {
						for (local37 = 0; local37 < Static75.anInt1848; local37++) {
							local276 = local28[local37];
							local17[local37] = local276 == 4096 ? 4096 : (local34[local37] << 12) / (4096 - local276);
						}
					} else if (local37 == 8) {
						for (local37 = 0; local37 < Static75.anInt1848; local37++) {
							local276 = local28[local37];
							local17[local37] = local276 == 0 ? 0 : 4096 - (4096 - local34[local37] << 12) / local276;
						}
					} else if (local37 == 9) {
						for (local37 = 0; local37 < Static75.anInt1848; local37++) {
							local164 = local34[local37];
							local276 = local28[local37];
							local17[local37] = local164 > local276 ? local276 : local164;
						}
					} else if (local37 == 10) {
						for (local37 = 0; local37 < Static75.anInt1848; local37++) {
							local164 = local34[local37];
							local276 = local28[local37];
							local17[local37] = local164 >= local276 ? local164 : local276;
						}
					} else if (local37 == 11) {
						for (local37 = 0; local37 < Static75.anInt1848; local37++) {
							local276 = local28[local37];
							local164 = local34[local37];
							local17[local37] = local276 <= local164 ? local164 - local276 : -local164 + local276;
						}
					} else if (local37 == 12) {
						for (local37 = 0; local37 < Static75.anInt1848; local37++) {
							local276 = local28[local37];
							local164 = local34[local37];
							local17[local37] = local164 + local276 - (local164 * local276 >> 11);
						}
					}
				}
			}
		}
		return local17;
	}
}
