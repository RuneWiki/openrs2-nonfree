import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class1_Sub2_Sub26 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
	private int anInt4112 = 6;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub26() {
		super(2, false);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			@Pc(30) int[] local30 = this.method4570(arg0, 0);
			@Pc(36) int[] local36 = this.method4570(arg0, 1);
			@Pc(39) int local39 = this.anInt4112;
			if (local39 == 1) {
				for (local39 = 0; local39 < Static299.anInt5670; local39++) {
					local17[local39] = local36[local39] + local30[local39];
				}
			} else if (local39 == 2) {
				for (local39 = 0; local39 < Static299.anInt5670; local39++) {
					local17[local39] = local30[local39] - local36[local39];
				}
			} else if (local39 == 3) {
				for (local39 = 0; local39 < Static299.anInt5670; local39++) {
					local17[local39] = local30[local39] * local36[local39] >> 12;
				}
			} else {
				@Pc(183) int local183;
				if (local39 == 4) {
					for (local39 = 0; local39 < Static299.anInt5670; local39++) {
						local183 = local36[local39];
						local17[local39] = local183 == 0 ? 4096 : (local30[local39] << 12) / local183;
					}
				} else if (local39 == 5) {
					for (local39 = 0; local39 < Static299.anInt5670; local39++) {
						local17[local39] = 4096 - ((4096 - local36[local39]) * (-local30[local39] + 4096) >> 12);
					}
				} else if (local39 == 6) {
					for (local39 = 0; local39 < Static299.anInt5670; local39++) {
						local183 = local36[local39];
						local17[local39] = local183 >= 2048 ? 4096 - ((4096 - local30[local39]) * (-local183 + 4096) >> 11) : local30[local39] * local183 >> 11;
					}
				} else {
					@Pc(295) int local295;
					if (local39 == 7) {
						for (local39 = 0; local39 < Static299.anInt5670; local39++) {
							local295 = local30[local39];
							local17[local39] = local295 == 4096 ? 4096 : (local36[local39] << 12) / (4096 - local295);
						}
					} else if (local39 == 8) {
						for (local39 = 0; local39 < Static299.anInt5670; local39++) {
							local295 = local30[local39];
							local17[local39] = local295 == 0 ? 0 : 4096 - (4096 - local36[local39] << 12) / local295;
						}
					} else if (local39 == 9) {
						for (local39 = 0; local39 < Static299.anInt5670; local39++) {
							local295 = local30[local39];
							local183 = local36[local39];
							local17[local39] = local295 >= local183 ? local183 : local295;
						}
					} else if (local39 == 10) {
						for (local39 = 0; local39 < Static299.anInt5670; local39++) {
							local183 = local36[local39];
							local295 = local30[local39];
							local17[local39] = local295 <= local183 ? local183 : local295;
						}
					} else if (local39 == 11) {
						for (local39 = 0; local39 < Static299.anInt5670; local39++) {
							local183 = local36[local39];
							local295 = local30[local39];
							local17[local39] = local183 < local295 ? local295 - local183 : local183 - local295;
						}
					} else if (local39 == 12) {
						for (local39 = 0; local39 < Static299.anInt5670; local39++) {
							local183 = local36[local39];
							local295 = local30[local39];
							local17[local39] = local183 + local295 - (local183 * local295 >> 11);
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4572(@OriginalArg(1) int arg0) {
		@Pc(12) int[][] local12 = this.aClass151_41.method3758(arg0);
		if (this.aClass151_41.aBoolean344) {
			@Pc(27) int[][] local27 = this.method4575(0, arg0);
			@Pc(35) int[][] local35 = this.method4575(1, arg0);
			@Pc(39) int[] local39 = local12[0];
			@Pc(43) int[] local43 = local12[1];
			@Pc(47) int[] local47 = local12[2];
			@Pc(51) int[] local51 = local27[0];
			@Pc(55) int[] local55 = local27[2];
			@Pc(59) int[] local59 = local27[1];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[2];
			@Pc(71) int[] local71 = local35[1];
			@Pc(74) int local74 = this.anInt4112;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static299.anInt5670; local74++) {
					local39[local74] = local51[local74] + local63[local74];
					local43[local74] = local59[local74] + local71[local74];
					local47[local74] = local55[local74] + local67[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static299.anInt5670; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local59[local74] - local71[local74];
					local47[local74] = local55[local74] - local67[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static299.anInt5670; local74++) {
					local39[local74] = local63[local74] * local51[local74] >> 12;
					local43[local74] = local71[local74] * local59[local74] >> 12;
					local47[local74] = local67[local74] * local55[local74] >> 12;
				}
			} else {
				@Pc(282) int local282;
				@Pc(286) int local286;
				@Pc(278) int local278;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static299.anInt5670; local74++) {
						local278 = local67[local74];
						local282 = local63[local74];
						local286 = local71[local74];
						local39[local74] = local282 == 0 ? 4096 : (local51[local74] << 12) / local282;
						local43[local74] = local286 == 0 ? 4096 : (local59[local74] << 12) / local286;
						local47[local74] = local278 == 0 ? 4096 : (local55[local74] << 12) / local278;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static299.anInt5670; local74++) {
						local39[local74] = 4096 - ((4096 - local63[local74]) * (4096 - local51[local74]) >> 12);
						local43[local74] = 4096 - ((4096 - local71[local74]) * (-local59[local74] + 4096) >> 12);
						local47[local74] = 4096 - ((4096 - local55[local74]) * (-local67[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static299.anInt5670; local74++) {
						local282 = local63[local74];
						local278 = local67[local74];
						local286 = local71[local74];
						local39[local74] = local282 >= 2048 ? 4096 - ((4096 - local51[local74]) * (-local282 + 4096) >> 11) : local282 * local51[local74] >> 11;
						local43[local74] = local286 >= 2048 ? 4096 - ((4096 - local59[local74]) * (-local286 + 4096) >> 11) : local59[local74] * local286 >> 11;
						local47[local74] = local278 < 2048 ? local55[local74] * local278 >> 11 : 4096 - ((4096 - local278) * (-local55[local74] + 4096) >> 11);
					}
				} else {
					@Pc(543) int local543;
					@Pc(539) int local539;
					@Pc(547) int local547;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static299.anInt5670; local74++) {
							local539 = local59[local74];
							local543 = local51[local74];
							local547 = local55[local74];
							local39[local74] = local543 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local543);
							local43[local74] = local539 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local539);
							local47[local74] = local547 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local547);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static299.anInt5670; local74++) {
							local547 = local55[local74];
							local543 = local51[local74];
							local539 = local59[local74];
							local39[local74] = local543 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local543;
							local43[local74] = local539 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local539;
							local47[local74] = local547 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local547;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static299.anInt5670; local74++) {
							local547 = local55[local74];
							local539 = local59[local74];
							local278 = local67[local74];
							local286 = local71[local74];
							local543 = local51[local74];
							local282 = local63[local74];
							local39[local74] = local282 > local543 ? local543 : local282;
							local43[local74] = local539 < local286 ? local539 : local286;
							local47[local74] = local278 <= local547 ? local278 : local547;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static299.anInt5670; local74++) {
							local547 = local55[local74];
							local278 = local67[local74];
							local286 = local71[local74];
							local282 = local63[local74];
							local539 = local59[local74];
							local543 = local51[local74];
							local39[local74] = local282 >= local543 ? local282 : local543;
							local43[local74] = local539 > local286 ? local539 : local286;
							local47[local74] = local547 <= local278 ? local278 : local547;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static299.anInt5670; local74++) {
							local282 = local63[local74];
							local286 = local71[local74];
							local547 = local55[local74];
							local539 = local59[local74];
							local278 = local67[local74];
							local543 = local51[local74];
							local39[local74] = local282 < local543 ? local543 - local282 : local282 - local543;
							local43[local74] = local286 >= local539 ? local286 - local539 : -local286 + local539;
							local47[local74] = local278 >= local547 ? local278 - local547 : -local278 + local547;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static299.anInt5670; local74++) {
							local543 = local51[local74];
							local539 = local59[local74];
							local282 = local63[local74];
							local547 = local55[local74];
							local286 = local71[local74];
							local278 = local67[local74];
							local39[local74] = local543 + local282 - (local543 * local282 >> 11);
							local43[local74] = local539 + local286 - (local539 * local286 >> 11);
							local47[local74] = local547 + local278 - (local547 * local278 >> 11);
						}
					}
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4112 = arg0.method2595();
		} else if (arg1 == 1) {
			this.aBoolean424 = arg0.method2595() == 1;
		}
	}
}
