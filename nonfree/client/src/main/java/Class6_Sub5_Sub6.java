import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class6_Sub5_Sub6 extends Class6_Sub5 {

	@OriginalMember(owner = "client!di", name = "S", descriptor = "I")
	private int anInt1816 = 6;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub6() {
		super(2, false);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt1816 = arg1.method6433();
		} else if (arg0 == 1) {
			super.aBoolean495 = arg1.method6433() == 1;
		}
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			@Pc(23) int[] local23 = this.method6543(0, arg0);
			@Pc(31) int[] local31 = this.method6543(1, arg0);
			@Pc(34) int local34 = this.anInt1816;
			if (local34 == 1) {
				for (local34 = 0; local34 < Static240.anInt4386; local34++) {
					local11[local34] = local23[local34] + local31[local34];
				}
			} else if (local34 == 2) {
				for (local34 = 0; local34 < Static240.anInt4386; local34++) {
					local11[local34] = local23[local34] - local31[local34];
				}
			} else if (local34 == 3) {
				for (local34 = 0; local34 < Static240.anInt4386; local34++) {
					local11[local34] = local23[local34] * local31[local34] >> 12;
				}
			} else {
				@Pc(164) int local164;
				if (local34 == 4) {
					for (local34 = 0; local34 < Static240.anInt4386; local34++) {
						local164 = local31[local34];
						local11[local34] = local164 == 0 ? 4096 : (local23[local34] << 12) / local164;
					}
				} else if (local34 == 5) {
					for (local34 = 0; local34 < Static240.anInt4386; local34++) {
						local11[local34] = 4096 - ((4096 - local23[local34]) * (-local31[local34] + 4096) >> 12);
					}
				} else if (local34 == 6) {
					for (local34 = 0; local34 < Static240.anInt4386; local34++) {
						local164 = local31[local34];
						local11[local34] = local164 < 2048 ? local23[local34] * local164 >> 11 : 4096 - ((4096 - local23[local34]) * (4096 - local164) >> 11);
					}
				} else {
					@Pc(276) int local276;
					if (local34 == 7) {
						for (local34 = 0; local34 < Static240.anInt4386; local34++) {
							local276 = local23[local34];
							local11[local34] = local276 == 4096 ? 4096 : (local31[local34] << 12) / (4096 - local276);
						}
					} else if (local34 == 8) {
						for (local34 = 0; local34 < Static240.anInt4386; local34++) {
							local276 = local23[local34];
							local11[local34] = local276 == 0 ? 0 : 4096 - (4096 - local31[local34] << 12) / local276;
						}
					} else if (local34 == 9) {
						for (local34 = 0; local34 < Static240.anInt4386; local34++) {
							local164 = local31[local34];
							local276 = local23[local34];
							local11[local34] = local276 < local164 ? local276 : local164;
						}
					} else if (local34 == 10) {
						for (local34 = 0; local34 < Static240.anInt4386; local34++) {
							local276 = local23[local34];
							local164 = local31[local34];
							local11[local34] = local276 <= local164 ? local164 : local276;
						}
					} else if (local34 == 11) {
						for (local34 = 0; local34 < Static240.anInt4386; local34++) {
							local164 = local31[local34];
							local276 = local23[local34];
							local11[local34] = local164 < local276 ? local276 - local164 : local164 - local276;
						}
					} else if (local34 == 12) {
						for (local34 = 0; local34 < Static240.anInt4386; local34++) {
							local164 = local31[local34];
							local276 = local23[local34];
							local11[local34] = local164 + local276 - (local164 * local276 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method6545(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass162_41.method3811(arg0);
		if (super.aClass162_41.aBoolean291) {
			@Pc(29) int[][] local29 = this.method6544(arg0, 0);
			@Pc(35) int[][] local35 = this.method6544(arg0, 1);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt1816;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static240.anInt4386; local74++) {
					local39[local74] = local51[local74] + local63[local74];
					local43[local74] = local67[local74] + local55[local74];
					local47[local74] = local71[local74] + local59[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static240.anInt4386; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static240.anInt4386; local74++) {
					local39[local74] = local63[local74] * local51[local74] >> 12;
					local43[local74] = local67[local74] * local55[local74] >> 12;
					local47[local74] = local59[local74] * local71[local74] >> 12;
				}
			} else {
				@Pc(275) int local275;
				@Pc(267) int local267;
				@Pc(271) int local271;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static240.anInt4386; local74++) {
						local267 = local67[local74];
						local271 = local71[local74];
						local275 = local63[local74];
						local39[local74] = local275 == 0 ? 4096 : (local51[local74] << 12) / local275;
						local43[local74] = local267 == 0 ? 4096 : (local55[local74] << 12) / local267;
						local47[local74] = local271 == 0 ? 4096 : (local59[local74] << 12) / local271;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static240.anInt4386; local74++) {
						local39[local74] = 4096 - ((4096 - local51[local74]) * (-local63[local74] + 4096) >> 12);
						local43[local74] = 4096 - ((4096 - local55[local74]) * (-local67[local74] + 4096) >> 12);
						local47[local74] = 4096 - ((4096 - local71[local74]) * (4096 - local59[local74]) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static240.anInt4386; local74++) {
						local275 = local63[local74];
						local271 = local71[local74];
						local267 = local67[local74];
						local39[local74] = local275 >= 2048 ? 4096 - ((4096 - local275) * (-local51[local74] + 4096) >> 11) : local275 * local51[local74] >> 11;
						local43[local74] = local267 < 2048 ? local267 * local55[local74] >> 11 : 4096 - ((4096 - local267) * (-local55[local74] + 4096) >> 11);
						local47[local74] = local271 >= 2048 ? 4096 - ((4096 - local271) * (-local59[local74] + 4096) >> 11) : local271 * local59[local74] >> 11;
					}
				} else {
					@Pc(534) int local534;
					@Pc(530) int local530;
					@Pc(538) int local538;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static240.anInt4386; local74++) {
							local530 = local55[local74];
							local534 = local51[local74];
							local538 = local59[local74];
							local39[local74] = local534 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local534);
							local43[local74] = local530 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local530);
							local47[local74] = local538 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local538);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static240.anInt4386; local74++) {
							local530 = local55[local74];
							local538 = local59[local74];
							local534 = local51[local74];
							local39[local74] = local534 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local534;
							local43[local74] = local530 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local530;
							local47[local74] = local538 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local538;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static240.anInt4386; local74++) {
							local530 = local55[local74];
							local267 = local67[local74];
							local275 = local63[local74];
							local534 = local51[local74];
							local271 = local71[local74];
							local538 = local59[local74];
							local39[local74] = local534 >= local275 ? local275 : local534;
							local43[local74] = local530 < local267 ? local530 : local267;
							local47[local74] = local538 >= local271 ? local271 : local538;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static240.anInt4386; local74++) {
							local271 = local71[local74];
							local530 = local55[local74];
							local275 = local63[local74];
							local267 = local67[local74];
							local538 = local59[local74];
							local534 = local51[local74];
							local39[local74] = local534 <= local275 ? local275 : local534;
							local43[local74] = local267 < local530 ? local530 : local267;
							local47[local74] = local538 > local271 ? local538 : local271;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static240.anInt4386; local74++) {
							local530 = local55[local74];
							local275 = local63[local74];
							local271 = local71[local74];
							local267 = local67[local74];
							local538 = local59[local74];
							local534 = local51[local74];
							local39[local74] = local534 > local275 ? local534 - local275 : local275 + -local534;
							local43[local74] = local267 < local530 ? local530 - local267 : local267 + -local530;
							local47[local74] = local538 > local271 ? local538 - local271 : -local538 + local271;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static240.anInt4386; local74++) {
							local538 = local59[local74];
							local530 = local55[local74];
							local534 = local51[local74];
							local275 = local63[local74];
							local267 = local67[local74];
							local271 = local71[local74];
							local39[local74] = local275 + local534 - (local534 * local275 >> 11);
							local43[local74] = local530 + local267 - (local267 * local530 >> 11);
							local47[local74] = local538 + local271 - (local538 * local271 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
