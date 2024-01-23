import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class1_Sub3_Sub5 extends Class1_Sub3 {

	@OriginalMember(owner = "client!df", name = "L", descriptor = "I")
	private int anInt1100 = 6;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub5() {
		super(2, false);
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4453(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = this.aClass122_41.method3152(arg0);
		if (this.aClass122_41.aBoolean297) {
			@Pc(29) int[] local29 = this.method4450(0, arg0);
			@Pc(35) int[] local35 = this.method4450(1, arg0);
			@Pc(38) int local38 = this.anInt1100;
			if (local38 == 1) {
				for (local38 = 0; local38 < Static227.anInt4511; local38++) {
					local19[local38] = local35[local38] + local29[local38];
				}
			} else if (local38 == 2) {
				for (local38 = 0; local38 < Static227.anInt4511; local38++) {
					local19[local38] = local29[local38] - local35[local38];
				}
			} else if (local38 == 3) {
				for (local38 = 0; local38 < Static227.anInt4511; local38++) {
					local19[local38] = local35[local38] * local29[local38] >> 12;
				}
			} else {
				@Pc(187) int local187;
				if (local38 == 4) {
					for (local38 = 0; local38 < Static227.anInt4511; local38++) {
						local187 = local35[local38];
						local19[local38] = local187 == 0 ? 4096 : (local29[local38] << 12) / local187;
					}
				} else if (local38 == 5) {
					for (local38 = 0; local38 < Static227.anInt4511; local38++) {
						local19[local38] = 4096 - ((4096 - local35[local38]) * (-local29[local38] + 4096) >> 12);
					}
				} else if (local38 == 6) {
					for (local38 = 0; local38 < Static227.anInt4511; local38++) {
						local187 = local35[local38];
						local19[local38] = local187 >= 2048 ? 4096 - ((4096 - local187) * (-local29[local38] + 4096) >> 11) : local187 * local29[local38] >> 11;
					}
				} else {
					@Pc(299) int local299;
					if (local38 == 7) {
						for (local38 = 0; local38 < Static227.anInt4511; local38++) {
							local299 = local29[local38];
							local19[local38] = local299 == 4096 ? 4096 : (local35[local38] << 12) / (4096 - local299);
						}
					} else if (local38 == 8) {
						for (local38 = 0; local38 < Static227.anInt4511; local38++) {
							local299 = local29[local38];
							local19[local38] = local299 == 0 ? 0 : 4096 - (4096 - local35[local38] << 12) / local299;
						}
					} else if (local38 == 9) {
						for (local38 = 0; local38 < Static227.anInt4511; local38++) {
							local299 = local29[local38];
							local187 = local35[local38];
							local19[local38] = local187 <= local299 ? local187 : local299;
						}
					} else if (local38 == 10) {
						for (local38 = 0; local38 < Static227.anInt4511; local38++) {
							local187 = local35[local38];
							local299 = local29[local38];
							local19[local38] = local299 <= local187 ? local187 : local299;
						}
					} else if (local38 == 11) {
						for (local38 = 0; local38 < Static227.anInt4511; local38++) {
							local299 = local29[local38];
							local187 = local35[local38];
							local19[local38] = local299 > local187 ? local299 - local187 : local187 - local299;
						}
					} else if (local38 == 12) {
						for (local38 = 0; local38 < Static227.anInt4511; local38++) {
							local187 = local35[local38];
							local299 = local29[local38];
							local19[local38] = local187 + local299 - (local299 * local187 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4452(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = this.aClass56_41.method1596(arg0);
		if (this.aClass56_41.aBoolean144) {
			@Pc(29) int[][] local29 = this.method4455(0, arg0);
			@Pc(35) int[][] local35 = this.method4455(1, arg0);
			@Pc(39) int[] local39 = local15[2];
			@Pc(43) int[] local43 = local15[0];
			@Pc(47) int[] local47 = local29[0];
			@Pc(51) int[] local51 = local15[1];
			@Pc(55) int[] local55 = local29[2];
			@Pc(59) int[] local59 = local29[1];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt1100;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static227.anInt4511; local74++) {
					local43[local74] = local63[local74] + local47[local74];
					local51[local74] = local67[local74] + local59[local74];
					local39[local74] = local55[local74] + local71[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static227.anInt4511; local74++) {
					local43[local74] = local47[local74] - local63[local74];
					local51[local74] = local59[local74] - local67[local74];
					local39[local74] = local55[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static227.anInt4511; local74++) {
					local43[local74] = local47[local74] * local63[local74] >> 12;
					local51[local74] = local67[local74] * local59[local74] >> 12;
					local39[local74] = local55[local74] * local71[local74] >> 12;
				}
			} else {
				@Pc(292) int local292;
				@Pc(288) int local288;
				@Pc(296) int local296;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static227.anInt4511; local74++) {
						local288 = local67[local74];
						local292 = local63[local74];
						local296 = local71[local74];
						local43[local74] = local292 == 0 ? 4096 : (local47[local74] << 12) / local292;
						local51[local74] = local288 == 0 ? 4096 : (local59[local74] << 12) / local288;
						local39[local74] = local296 == 0 ? 4096 : (local55[local74] << 12) / local296;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static227.anInt4511; local74++) {
						local43[local74] = 4096 - ((4096 - local63[local74]) * (-local47[local74] + 4096) >> 12);
						local51[local74] = 4096 - ((4096 - local59[local74]) * (-local67[local74] + 4096) >> 12);
						local39[local74] = 4096 - ((4096 - local71[local74]) * (-local55[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static227.anInt4511; local74++) {
						local296 = local71[local74];
						local288 = local67[local74];
						local292 = local63[local74];
						local43[local74] = local292 >= 2048 ? 4096 - ((4096 - local47[local74]) * (-local292 + 4096) >> 11) : local47[local74] * local292 >> 11;
						local51[local74] = local288 < 2048 ? local59[local74] * local288 >> 11 : 4096 - ((4096 - local59[local74]) * (-local288 + 4096) >> 11);
						local39[local74] = local296 >= 2048 ? 4096 - ((4096 - local296) * (-local55[local74] + 4096) >> 11) : local296 * local55[local74] >> 11;
					}
				} else {
					@Pc(554) int local554;
					@Pc(546) int local546;
					@Pc(550) int local550;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static227.anInt4511; local74++) {
							local546 = local59[local74];
							local550 = local55[local74];
							local554 = local47[local74];
							local43[local74] = local554 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local554);
							local51[local74] = local546 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local546);
							local39[local74] = local550 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local550);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static227.anInt4511; local74++) {
							local546 = local59[local74];
							local550 = local55[local74];
							local554 = local47[local74];
							local43[local74] = local554 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local554;
							local51[local74] = local546 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local546;
							local39[local74] = local550 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local550;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static227.anInt4511; local74++) {
							local546 = local59[local74];
							local550 = local55[local74];
							local554 = local47[local74];
							local288 = local67[local74];
							local296 = local71[local74];
							local292 = local63[local74];
							local43[local74] = local554 >= local292 ? local292 : local554;
							local51[local74] = local546 < local288 ? local546 : local288;
							local39[local74] = local296 > local550 ? local550 : local296;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static227.anInt4511; local74++) {
							local292 = local63[local74];
							local554 = local47[local74];
							local550 = local55[local74];
							local296 = local71[local74];
							local288 = local67[local74];
							local546 = local59[local74];
							local43[local74] = local292 >= local554 ? local292 : local554;
							local51[local74] = local288 < local546 ? local546 : local288;
							local39[local74] = local550 > local296 ? local550 : local296;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static227.anInt4511; local74++) {
							local292 = local63[local74];
							local550 = local55[local74];
							local296 = local71[local74];
							local288 = local67[local74];
							local546 = local59[local74];
							local554 = local47[local74];
							local43[local74] = local292 >= local554 ? local292 - local554 : -local292 + local554;
							local51[local74] = local546 <= local288 ? local288 - local546 : local546 + -local288;
							local39[local74] = local550 > local296 ? local550 - local296 : local296 + -local550;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static227.anInt4511; local74++) {
							local296 = local71[local74];
							local292 = local63[local74];
							local554 = local47[local74];
							local550 = local55[local74];
							local288 = local67[local74];
							local546 = local59[local74];
							local43[local74] = local292 + local554 - (local554 * local292 >> 11);
							local51[local74] = local288 + local546 - (local288 * local546 >> 11);
							local39[local74] = local550 + local296 - (local296 * local550 >> 11);
						}
					}
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!cg;II)V")
	@Override
	public void method4449(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1100 = arg0.method2690();
		} else if (arg1 == 1) {
			this.aBoolean451 = arg0.method2690() == 1;
		}
	}
}
