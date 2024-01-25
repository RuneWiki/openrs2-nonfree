import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dea")
public final class Class6_Sub1_Sub6 extends Class6_Sub1 {

	@OriginalMember(owner = "client!dea", name = "D", descriptor = "I")
	private int anInt1851 = 6;

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub6() {
		super(2, false);
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1851 = arg0.method8374();
		} else if (arg1 == 1) {
			super.aBoolean736 = arg0.method8374() == 1;
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			@Pc(27) int[] local27 = this.method8963(0, arg0);
			@Pc(33) int[] local33 = this.method8963(1, arg0);
			@Pc(36) int local36 = this.anInt1851;
			if (local36 == 1) {
				for (local36 = 0; local36 < Static479.anInt8231; local36++) {
					local17[local36] = local27[local36] + local33[local36];
				}
			} else if (local36 == 2) {
				for (local36 = 0; local36 < Static479.anInt8231; local36++) {
					local17[local36] = local27[local36] - local33[local36];
				}
			} else if (local36 == 3) {
				for (local36 = 0; local36 < Static479.anInt8231; local36++) {
					local17[local36] = local27[local36] * local33[local36] >> 12;
				}
			} else {
				@Pc(157) int local157;
				if (local36 == 4) {
					for (local36 = 0; local36 < Static479.anInt8231; local36++) {
						local157 = local33[local36];
						local17[local36] = local157 == 0 ? 4096 : (local27[local36] << 12) / local157;
					}
				} else if (local36 == 5) {
					for (local36 = 0; local36 < Static479.anInt8231; local36++) {
						local17[local36] = 4096 - ((4096 - local33[local36]) * (4096 - local27[local36]) >> 12);
					}
				} else if (local36 == 6) {
					for (local36 = 0; local36 < Static479.anInt8231; local36++) {
						local157 = local33[local36];
						local17[local36] = local157 < 2048 ? local27[local36] * local157 >> 11 : 4096 - ((4096 - local27[local36]) * (-local157 + 4096) >> 11);
					}
				} else {
					@Pc(267) int local267;
					if (local36 == 7) {
						for (local36 = 0; local36 < Static479.anInt8231; local36++) {
							local267 = local27[local36];
							local17[local36] = local267 == 4096 ? 4096 : (local33[local36] << 12) / (4096 - local267);
						}
					} else if (local36 == 8) {
						for (local36 = 0; local36 < Static479.anInt8231; local36++) {
							local267 = local27[local36];
							local17[local36] = local267 == 0 ? 0 : 4096 - (4096 - local33[local36] << 12) / local267;
						}
					} else if (local36 == 9) {
						for (local36 = 0; local36 < Static479.anInt8231; local36++) {
							local267 = local27[local36];
							local157 = local33[local36];
							local17[local36] = local157 > local267 ? local267 : local157;
						}
					} else if (local36 == 10) {
						for (local36 = 0; local36 < Static479.anInt8231; local36++) {
							local267 = local27[local36];
							local157 = local33[local36];
							local17[local36] = local157 >= local267 ? local157 : local267;
						}
					} else if (local36 == 11) {
						for (local36 = 0; local36 < Static479.anInt8231; local36++) {
							local267 = local27[local36];
							local157 = local33[local36];
							local17[local36] = local267 <= local157 ? local157 - local267 : local267 + -local157;
						}
					} else if (local36 == 12) {
						for (local36 = 0; local36 < Static479.anInt8231; local36++) {
							local267 = local27[local36];
							local157 = local33[local36];
							local17[local36] = local267 + local157 - (local267 * local157 >> 11);
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8957(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = super.aClass54_41.method1386(arg0);
		if (super.aClass54_41.aBoolean81) {
			@Pc(25) int[][] local25 = this.method8959(arg0, 0);
			@Pc(31) int[][] local31 = this.method8959(arg0, 1);
			@Pc(35) int[] local35 = local15[0];
			@Pc(39) int[] local39 = local15[1];
			@Pc(43) int[] local43 = local15[2];
			@Pc(47) int[] local47 = local25[0];
			@Pc(51) int[] local51 = local25[1];
			@Pc(55) int[] local55 = local25[2];
			@Pc(59) int[] local59 = local31[0];
			@Pc(63) int[] local63 = local31[1];
			@Pc(67) int[] local67 = local31[2];
			@Pc(70) int local70 = this.anInt1851;
			if (local70 == 1) {
				for (local70 = 0; local70 < Static479.anInt8231; local70++) {
					local35[local70] = local47[local70] + local59[local70];
					local39[local70] = local51[local70] + local63[local70];
					local43[local70] = local55[local70] + local67[local70];
				}
			} else if (local70 == 2) {
				for (local70 = 0; local70 < Static479.anInt8231; local70++) {
					local35[local70] = local47[local70] - local59[local70];
					local39[local70] = local51[local70] - local63[local70];
					local43[local70] = local55[local70] - local67[local70];
				}
			} else if (local70 == 3) {
				for (local70 = 0; local70 < Static479.anInt8231; local70++) {
					local35[local70] = local59[local70] * local47[local70] >> 12;
					local39[local70] = local51[local70] * local63[local70] >> 12;
					local43[local70] = local55[local70] * local67[local70] >> 12;
				}
			} else {
				@Pc(271) int local271;
				@Pc(263) int local263;
				@Pc(267) int local267;
				if (local70 == 4) {
					for (local70 = 0; local70 < Static479.anInt8231; local70++) {
						local263 = local63[local70];
						local267 = local67[local70];
						local271 = local59[local70];
						local35[local70] = local271 == 0 ? 4096 : (local47[local70] << 12) / local271;
						local39[local70] = local263 == 0 ? 4096 : (local51[local70] << 12) / local263;
						local43[local70] = local267 == 0 ? 4096 : (local55[local70] << 12) / local267;
					}
				} else if (local70 == 5) {
					for (local70 = 0; local70 < Static479.anInt8231; local70++) {
						local35[local70] = 4096 - ((4096 - local59[local70]) * (-local47[local70] + 4096) >> 12);
						local39[local70] = 4096 - ((4096 - local63[local70]) * (-local51[local70] + 4096) >> 12);
						local43[local70] = 4096 - ((4096 - local55[local70]) * (4096 - local67[local70]) >> 12);
					}
				} else if (local70 == 6) {
					for (local70 = 0; local70 < Static479.anInt8231; local70++) {
						local263 = local63[local70];
						local271 = local59[local70];
						local267 = local67[local70];
						local35[local70] = local271 < 2048 ? local271 * local47[local70] >> 11 : 4096 - ((4096 - local271) * (-local47[local70] + 4096) >> 11);
						local39[local70] = local263 < 2048 ? local263 * local51[local70] >> 11 : 4096 - ((4096 - local263) * (-local51[local70] + 4096) >> 11);
						local43[local70] = local267 < 2048 ? local267 * local55[local70] >> 11 : 4096 - ((4096 - local267) * (-local55[local70] + 4096) >> 11);
					}
				} else {
					@Pc(526) int local526;
					@Pc(530) int local530;
					@Pc(522) int local522;
					if (local70 == 7) {
						for (local70 = 0; local70 < Static479.anInt8231; local70++) {
							local522 = local55[local70];
							local526 = local47[local70];
							local530 = local51[local70];
							local35[local70] = local526 == 4096 ? 4096 : (local59[local70] << 12) / (4096 - local526);
							local39[local70] = local530 == 4096 ? 4096 : (local63[local70] << 12) / (4096 - local530);
							local43[local70] = local522 == 4096 ? 4096 : (local67[local70] << 12) / (4096 - local522);
						}
					} else if (local70 == 8) {
						for (local70 = 0; local70 < Static479.anInt8231; local70++) {
							local522 = local55[local70];
							local526 = local47[local70];
							local530 = local51[local70];
							local35[local70] = local526 == 0 ? 0 : 4096 - (4096 - local59[local70] << 12) / local526;
							local39[local70] = local530 == 0 ? 0 : 4096 - (4096 - local63[local70] << 12) / local530;
							local43[local70] = local522 == 0 ? 0 : 4096 - (4096 - local67[local70] << 12) / local522;
						}
					} else if (local70 == 9) {
						for (local70 = 0; local70 < Static479.anInt8231; local70++) {
							local522 = local55[local70];
							local526 = local47[local70];
							local271 = local59[local70];
							local267 = local67[local70];
							local263 = local63[local70];
							local530 = local51[local70];
							local35[local70] = local271 > local526 ? local526 : local271;
							local39[local70] = local263 <= local530 ? local263 : local530;
							local43[local70] = local267 > local522 ? local522 : local267;
						}
					} else if (local70 == 10) {
						for (local70 = 0; local70 < Static479.anInt8231; local70++) {
							local271 = local59[local70];
							local522 = local55[local70];
							local263 = local63[local70];
							local267 = local67[local70];
							local526 = local47[local70];
							local530 = local51[local70];
							local35[local70] = local271 < local526 ? local526 : local271;
							local39[local70] = local263 >= local530 ? local263 : local530;
							local43[local70] = local522 > local267 ? local522 : local267;
						}
					} else if (local70 == 11) {
						for (local70 = 0; local70 < Static479.anInt8231; local70++) {
							local530 = local51[local70];
							local263 = local63[local70];
							local271 = local59[local70];
							local267 = local67[local70];
							local526 = local47[local70];
							local522 = local55[local70];
							local35[local70] = local526 <= local271 ? local271 - local526 : local526 - local271;
							local39[local70] = local530 <= local263 ? local263 - local530 : local530 - local263;
							local43[local70] = local522 <= local267 ? local267 - local522 : -local267 + local522;
						}
					} else if (local70 == 12) {
						for (local70 = 0; local70 < Static479.anInt8231; local70++) {
							local263 = local63[local70];
							local522 = local55[local70];
							local530 = local51[local70];
							local267 = local67[local70];
							local271 = local59[local70];
							local526 = local47[local70];
							local35[local70] = local271 + local526 - (local271 * local526 >> 11);
							local39[local70] = local530 + local263 - (local263 * local530 >> 11);
							local43[local70] = local267 + local522 - (local522 * local267 >> 11);
						}
					}
				}
			}
		}
		return local15;
	}
}
