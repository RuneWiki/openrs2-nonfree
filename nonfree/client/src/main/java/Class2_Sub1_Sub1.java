import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
	private int anInt66 = 6;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub1() {
		super(2, false);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4586(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = this.aClass25_41.method652(arg0);
		if (this.aClass25_41.aBoolean53) {
			@Pc(29) int[][] local29 = this.method4600(arg0, 0);
			@Pc(35) int[][] local35 = this.method4600(arg0, 1);
			@Pc(39) int[] local39 = local19[1];
			@Pc(43) int[] local43 = local19[0];
			@Pc(47) int[] local47 = local19[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local35[0];
			@Pc(63) int[] local63 = local29[2];
			@Pc(67) int[] local67 = local35[2];
			@Pc(71) int[] local71 = local35[1];
			@Pc(74) int local74 = this.anInt66;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static281.anInt5558; local74++) {
					local43[local74] = local59[local74] + local51[local74];
					local39[local74] = local55[local74] + local71[local74];
					local47[local74] = local67[local74] + local63[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static281.anInt5558; local74++) {
					local43[local74] = local51[local74] - local59[local74];
					local39[local74] = local55[local74] - local71[local74];
					local47[local74] = local63[local74] - local67[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static281.anInt5558; local74++) {
					local43[local74] = local59[local74] * local51[local74] >> 12;
					local39[local74] = local71[local74] * local55[local74] >> 12;
					local47[local74] = local63[local74] * local67[local74] >> 12;
				}
			} else {
				@Pc(293) int local293;
				@Pc(301) int local301;
				@Pc(297) int local297;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static281.anInt5558; local74++) {
						local293 = local59[local74];
						local297 = local67[local74];
						local301 = local71[local74];
						local43[local74] = local293 == 0 ? 4096 : (local51[local74] << 12) / local293;
						local39[local74] = local301 == 0 ? 4096 : (local55[local74] << 12) / local301;
						local47[local74] = local297 == 0 ? 4096 : (local63[local74] << 12) / local297;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static281.anInt5558; local74++) {
						local43[local74] = 4096 - ((4096 - local59[local74]) * (4096 - local51[local74]) >> 12);
						local39[local74] = 4096 - ((4096 - local55[local74]) * (-local71[local74] + 4096) >> 12);
						local47[local74] = 4096 - ((4096 - local67[local74]) * (-local63[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static281.anInt5558; local74++) {
						local301 = local71[local74];
						local297 = local67[local74];
						local293 = local59[local74];
						local43[local74] = local293 < 2048 ? local51[local74] * local293 >> 11 : 4096 - ((4096 - local293) * (-local51[local74] + 4096) >> 11);
						local39[local74] = local301 < 2048 ? local55[local74] * local301 >> 11 : 4096 - ((4096 - local55[local74]) * (4096 - local301) >> 11);
						local47[local74] = local297 >= 2048 ? 4096 - ((4096 - local63[local74]) * (4096 - local297) >> 11) : local63[local74] * local297 >> 11;
					}
				} else {
					@Pc(545) int local545;
					@Pc(549) int local549;
					@Pc(541) int local541;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static281.anInt5558; local74++) {
							local541 = local63[local74];
							local545 = local51[local74];
							local549 = local55[local74];
							local43[local74] = local545 == 4096 ? 4096 : (local59[local74] << 12) / (4096 - local545);
							local39[local74] = local549 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local549);
							local47[local74] = local541 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local541);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static281.anInt5558; local74++) {
							local541 = local63[local74];
							local545 = local51[local74];
							local549 = local55[local74];
							local43[local74] = local545 == 0 ? 0 : 4096 - (4096 - local59[local74] << 12) / local545;
							local39[local74] = local549 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local549;
							local47[local74] = local541 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local541;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static281.anInt5558; local74++) {
							local301 = local71[local74];
							local541 = local63[local74];
							local545 = local51[local74];
							local297 = local67[local74];
							local549 = local55[local74];
							local293 = local59[local74];
							local43[local74] = local293 <= local545 ? local293 : local545;
							local39[local74] = local549 < local301 ? local549 : local301;
							local47[local74] = local541 < local297 ? local541 : local297;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static281.anInt5558; local74++) {
							local545 = local51[local74];
							local293 = local59[local74];
							local549 = local55[local74];
							local541 = local63[local74];
							local297 = local67[local74];
							local301 = local71[local74];
							local43[local74] = local545 <= local293 ? local293 : local545;
							local39[local74] = local549 > local301 ? local549 : local301;
							local47[local74] = local297 >= local541 ? local297 : local541;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static281.anInt5558; local74++) {
							local549 = local55[local74];
							local293 = local59[local74];
							local297 = local67[local74];
							local541 = local63[local74];
							local301 = local71[local74];
							local545 = local51[local74];
							local43[local74] = local545 <= local293 ? local293 - local545 : local545 - local293;
							local39[local74] = local549 <= local301 ? local301 - local549 : -local301 + local549;
							local47[local74] = local541 > local297 ? local541 - local297 : -local541 + local297;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static281.anInt5558; local74++) {
							local293 = local59[local74];
							local541 = local63[local74];
							local545 = local51[local74];
							local549 = local55[local74];
							local297 = local67[local74];
							local301 = local71[local74];
							local43[local74] = local545 + local293 - (local545 * local293 >> 11);
							local39[local74] = local301 + local549 - (local549 * local301 >> 11);
							local47[local74] = local541 + local297 - (local541 * local297 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(21) int[] local21 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			@Pc(32) int[] local32 = this.method4601(arg0, 0);
			@Pc(38) int[] local38 = this.method4601(arg0, 1);
			@Pc(41) int local41 = this.anInt66;
			if (local41 == 1) {
				for (local41 = 0; local41 < Static281.anInt5558; local41++) {
					local21[local41] = local38[local41] + local32[local41];
				}
			} else if (local41 == 2) {
				for (local41 = 0; local41 < Static281.anInt5558; local41++) {
					local21[local41] = local32[local41] - local38[local41];
				}
			} else if (local41 == 3) {
				for (local41 = 0; local41 < Static281.anInt5558; local41++) {
					local21[local41] = local38[local41] * local32[local41] >> 12;
				}
			} else {
				@Pc(176) int local176;
				if (local41 == 4) {
					for (local41 = 0; local41 < Static281.anInt5558; local41++) {
						local176 = local38[local41];
						local21[local41] = local176 == 0 ? 4096 : (local32[local41] << 12) / local176;
					}
				} else if (local41 == 5) {
					for (local41 = 0; local41 < Static281.anInt5558; local41++) {
						local21[local41] = 4096 - ((4096 - local32[local41]) * (-local38[local41] + 4096) >> 12);
					}
				} else if (local41 == 6) {
					for (local41 = 0; local41 < Static281.anInt5558; local41++) {
						local176 = local38[local41];
						local21[local41] = local176 < 2048 ? local32[local41] * local176 >> 11 : 4096 - ((4096 - local176) * (-local32[local41] + 4096) >> 11);
					}
				} else {
					@Pc(291) int local291;
					if (local41 == 7) {
						for (local41 = 0; local41 < Static281.anInt5558; local41++) {
							local291 = local32[local41];
							local21[local41] = local291 == 4096 ? 4096 : (local38[local41] << 12) / (4096 - local291);
						}
					} else if (local41 == 8) {
						for (local41 = 0; local41 < Static281.anInt5558; local41++) {
							local291 = local32[local41];
							local21[local41] = local291 == 0 ? 0 : 4096 - (4096 - local38[local41] << 12) / local291;
						}
					} else if (local41 == 9) {
						for (local41 = 0; local41 < Static281.anInt5558; local41++) {
							local176 = local38[local41];
							local291 = local32[local41];
							local21[local41] = local291 >= local176 ? local176 : local291;
						}
					} else if (local41 == 10) {
						for (local41 = 0; local41 < Static281.anInt5558; local41++) {
							local291 = local32[local41];
							local176 = local38[local41];
							local21[local41] = local176 >= local291 ? local176 : local291;
						}
					} else if (local41 == 11) {
						for (local41 = 0; local41 < Static281.anInt5558; local41++) {
							local291 = local32[local41];
							local176 = local38[local41];
							local21[local41] = local291 <= local176 ? local176 - local291 : local291 - local176;
						}
					} else if (local41 == 12) {
						for (local41 = 0; local41 < Static281.anInt5558; local41++) {
							local176 = local38[local41];
							local291 = local32[local41];
							local21[local41] = local176 + local291 - (local291 * local176 >> 11);
						}
					}
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt66 = arg0.method2146();
		} else if (arg1 == 1) {
			this.aBoolean385 = arg0.method2146() == 1;
		}
	}
}
