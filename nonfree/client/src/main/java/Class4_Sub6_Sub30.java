import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class4_Sub6_Sub30 extends Class4_Sub6 {

	@OriginalMember(owner = "client!sh", name = "M", descriptor = "I")
	private int anInt4682 = 6;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub30() {
		super(2, false);
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = this.aClass156_41.method3763(arg0);
		if (this.aClass156_41.aBoolean307) {
			@Pc(26) int[] local26 = this.method4372(0, arg0);
			@Pc(32) int[] local32 = this.method4372(1, arg0);
			@Pc(35) int local35 = this.anInt4682;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static2.anInt19; local35++) {
					local16[local35] = local32[local35] + local26[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static2.anInt19; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static2.anInt19; local35++) {
					local16[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(180) int local180;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static2.anInt19; local35++) {
						local180 = local32[local35];
						local16[local35] = local180 == 0 ? 4096 : (local26[local35] << 12) / local180;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static2.anInt19; local35++) {
						local16[local35] = 4096 - ((4096 - local26[local35]) * (4096 - local32[local35]) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static2.anInt19; local35++) {
						local180 = local32[local35];
						local16[local35] = local180 < 2048 ? local26[local35] * local180 >> 11 : 4096 - ((4096 - local26[local35]) * (-local180 + 4096) >> 11);
					}
				} else {
					@Pc(294) int local294;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static2.anInt19; local35++) {
							local294 = local26[local35];
							local16[local35] = local294 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local294);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static2.anInt19; local35++) {
							local294 = local26[local35];
							local16[local35] = local294 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local294;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static2.anInt19; local35++) {
							local180 = local32[local35];
							local294 = local26[local35];
							local16[local35] = local294 >= local180 ? local180 : local294;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static2.anInt19; local35++) {
							local294 = local26[local35];
							local180 = local32[local35];
							local16[local35] = local294 <= local180 ? local180 : local294;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static2.anInt19; local35++) {
							local180 = local32[local35];
							local294 = local26[local35];
							local16[local35] = local294 <= local180 ? local180 - local294 : -local180 + local294;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static2.anInt19; local35++) {
							local180 = local32[local35];
							local294 = local26[local35];
							local16[local35] = local180 + local294 - (local180 * local294 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4682 = arg0.method1874();
		} else if (arg1 == 1) {
			this.aBoolean355 = arg0.method1874() == 1;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4379(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = this.aClass84_41.method2153(arg0);
		if (this.aClass84_41.aBoolean183) {
			@Pc(27) int[][] local27 = this.method4377(arg0, 0);
			@Pc(35) int[][] local35 = this.method4377(arg0, 1);
			@Pc(39) int[] local39 = local17[2];
			@Pc(43) int[] local43 = local17[1];
			@Pc(47) int[] local47 = local17[0];
			@Pc(51) int[] local51 = local27[0];
			@Pc(55) int[] local55 = local27[1];
			@Pc(59) int[] local59 = local35[0];
			@Pc(63) int[] local63 = local27[2];
			@Pc(67) int[] local67 = local35[2];
			@Pc(71) int[] local71 = local35[1];
			@Pc(74) int local74 = this.anInt4682;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static2.anInt19; local74++) {
					local47[local74] = local51[local74] + local59[local74];
					local43[local74] = local55[local74] + local71[local74];
					local39[local74] = local63[local74] + local67[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static2.anInt19; local74++) {
					local47[local74] = local51[local74] - local59[local74];
					local43[local74] = local55[local74] - local71[local74];
					local39[local74] = local63[local74] - local67[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static2.anInt19; local74++) {
					local47[local74] = local59[local74] * local51[local74] >> 12;
					local43[local74] = local71[local74] * local55[local74] >> 12;
					local39[local74] = local67[local74] * local63[local74] >> 12;
				}
			} else {
				@Pc(289) int local289;
				@Pc(293) int local293;
				@Pc(285) int local285;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static2.anInt19; local74++) {
						local285 = local67[local74];
						local289 = local59[local74];
						local293 = local71[local74];
						local47[local74] = local289 == 0 ? 4096 : (local51[local74] << 12) / local289;
						local43[local74] = local293 == 0 ? 4096 : (local55[local74] << 12) / local293;
						local39[local74] = local285 == 0 ? 4096 : (local63[local74] << 12) / local285;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static2.anInt19; local74++) {
						local47[local74] = 4096 - ((4096 - local59[local74]) * (-local51[local74] + 4096) >> 12);
						local43[local74] = 4096 - ((4096 - local55[local74]) * (-local71[local74] + 4096) >> 12);
						local39[local74] = 4096 - ((4096 - local63[local74]) * (-local67[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static2.anInt19; local74++) {
						local293 = local71[local74];
						local285 = local67[local74];
						local289 = local59[local74];
						local47[local74] = local289 >= 2048 ? 4096 - ((4096 - local289) * (-local51[local74] + 4096) >> 11) : local289 * local51[local74] >> 11;
						local43[local74] = local293 < 2048 ? local55[local74] * local293 >> 11 : 4096 - ((4096 - local55[local74]) * (-local293 + 4096) >> 11);
						local39[local74] = local285 >= 2048 ? 4096 - ((4096 - local285) * (-local63[local74] + 4096) >> 11) : local63[local74] * local285 >> 11;
					}
				} else {
					@Pc(543) int local543;
					@Pc(547) int local547;
					@Pc(551) int local551;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static2.anInt19; local74++) {
							local543 = local51[local74];
							local547 = local55[local74];
							local551 = local63[local74];
							local47[local74] = local543 == 4096 ? 4096 : (local59[local74] << 12) / (4096 - local543);
							local43[local74] = local547 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local547);
							local39[local74] = local551 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local551);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static2.anInt19; local74++) {
							local551 = local63[local74];
							local543 = local51[local74];
							local547 = local55[local74];
							local47[local74] = local543 == 0 ? 0 : 4096 - (4096 - local59[local74] << 12) / local543;
							local43[local74] = local547 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local547;
							local39[local74] = local551 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local551;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static2.anInt19; local74++) {
							local285 = local67[local74];
							local289 = local59[local74];
							local551 = local63[local74];
							local293 = local71[local74];
							local547 = local55[local74];
							local543 = local51[local74];
							local47[local74] = local289 > local543 ? local543 : local289;
							local43[local74] = local293 <= local547 ? local293 : local547;
							local39[local74] = local285 > local551 ? local551 : local285;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static2.anInt19; local74++) {
							local289 = local59[local74];
							local285 = local67[local74];
							local551 = local63[local74];
							local543 = local51[local74];
							local547 = local55[local74];
							local293 = local71[local74];
							local47[local74] = local289 >= local543 ? local289 : local543;
							local43[local74] = local547 > local293 ? local547 : local293;
							local39[local74] = local285 < local551 ? local551 : local285;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static2.anInt19; local74++) {
							local551 = local63[local74];
							local547 = local55[local74];
							local543 = local51[local74];
							local289 = local59[local74];
							local285 = local67[local74];
							local293 = local71[local74];
							local47[local74] = local289 < local543 ? local543 - local289 : local289 + -local543;
							local43[local74] = local293 >= local547 ? local293 - local547 : local547 - local293;
							local39[local74] = local551 > local285 ? local551 - local285 : -local551 + local285;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static2.anInt19; local74++) {
							local547 = local55[local74];
							local289 = local59[local74];
							local285 = local67[local74];
							local543 = local51[local74];
							local293 = local71[local74];
							local551 = local63[local74];
							local47[local74] = local289 + local543 - (local289 * local543 >> 11);
							local43[local74] = local293 + local547 - (local293 * local547 >> 11);
							local39[local74] = local551 + local285 - (local285 * local551 >> 11);
						}
					}
				}
			}
		}
		return local17;
	}
}
