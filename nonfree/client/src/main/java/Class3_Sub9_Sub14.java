import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fja")
public final class Class3_Sub9_Sub14 extends Class3_Sub9 {

	@OriginalMember(owner = "client!fja", name = "G", descriptor = "[C")
	private static final char[] aCharArray5 = new char[64];

	@OriginalMember(owner = "client!fja", name = "H", descriptor = "I")
	private int anInt3314 = 6;

	static {
		for (@Pc(6) int local6 = 0; local6 < 26; local6++) {
			aCharArray5[local6] = (char) (local6 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray5[local20] = (char) (local20 + 97 - 26);
		}
		for (@Pc(36) int local36 = 52; local36 < 62; local36++) {
			aCharArray5[local36] = (char) (local36 - 4);
		}
		aCharArray5[62] = '*';
		aCharArray5[63] = '-';
	}

	@OriginalMember(owner = "client!fja", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub14() {
		super(2, false);
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			@Pc(26) int[] local26 = this.method9162(arg0, 0);
			@Pc(32) int[] local32 = this.method9162(arg0, 1);
			@Pc(35) int local35 = this.anInt3314;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static62.anInt1251; local35++) {
					local11[local35] = local26[local35] + local32[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static62.anInt1251; local35++) {
					local11[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static62.anInt1251; local35++) {
					local11[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(163) int local163;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static62.anInt1251; local35++) {
						local163 = local32[local35];
						local11[local35] = local163 == 0 ? 4096 : (local26[local35] << 12) / local163;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static62.anInt1251; local35++) {
						local11[local35] = 4096 - ((4096 - local32[local35]) * (-local26[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static62.anInt1251; local35++) {
						local163 = local32[local35];
						local11[local35] = local163 < 2048 ? local163 * local26[local35] >> 11 : 4096 - ((4096 - local163) * (-local26[local35] + 4096) >> 11);
					}
				} else {
					@Pc(279) int local279;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static62.anInt1251; local35++) {
							local279 = local26[local35];
							local11[local35] = local279 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local279);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static62.anInt1251; local35++) {
							local279 = local26[local35];
							local11[local35] = local279 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local279;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static62.anInt1251; local35++) {
							local279 = local26[local35];
							local163 = local32[local35];
							local11[local35] = local279 < local163 ? local279 : local163;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static62.anInt1251; local35++) {
							local279 = local26[local35];
							local163 = local32[local35];
							local11[local35] = local279 <= local163 ? local163 : local279;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static62.anInt1251; local35++) {
							local163 = local32[local35];
							local279 = local26[local35];
							local11[local35] = local163 < local279 ? local279 - local163 : local163 - local279;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static62.anInt1251; local35++) {
							local163 = local32[local35];
							local279 = local26[local35];
							local11[local35] = local163 + local279 - (local163 * local279 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method9168(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass348_41.method8552(arg0);
		if (super.aClass348_41.aBoolean748) {
			@Pc(23) int[][] local23 = this.method9167(0, arg0);
			@Pc(31) int[][] local31 = this.method9167(1, arg0);
			@Pc(35) int[] local35 = local11[0];
			@Pc(39) int[] local39 = local11[1];
			@Pc(43) int[] local43 = local11[2];
			@Pc(47) int[] local47 = local23[0];
			@Pc(51) int[] local51 = local23[1];
			@Pc(55) int[] local55 = local23[2];
			@Pc(59) int[] local59 = local31[0];
			@Pc(63) int[] local63 = local31[1];
			@Pc(67) int[] local67 = local31[2];
			@Pc(70) int local70 = this.anInt3314;
			if (local70 == 1) {
				for (local70 = 0; local70 < Static62.anInt1251; local70++) {
					local35[local70] = local47[local70] + local59[local70];
					local39[local70] = local63[local70] + local51[local70];
					local43[local70] = local55[local70] + local67[local70];
				}
			} else if (local70 == 2) {
				for (local70 = 0; local70 < Static62.anInt1251; local70++) {
					local35[local70] = local47[local70] - local59[local70];
					local39[local70] = local51[local70] - local63[local70];
					local43[local70] = local55[local70] - local67[local70];
				}
			} else if (local70 == 3) {
				for (local70 = 0; local70 < Static62.anInt1251; local70++) {
					local35[local70] = local59[local70] * local47[local70] >> 12;
					local39[local70] = local51[local70] * local63[local70] >> 12;
					local43[local70] = local55[local70] * local67[local70] >> 12;
				}
			} else {
				@Pc(268) int local268;
				@Pc(264) int local264;
				@Pc(272) int local272;
				if (local70 == 4) {
					for (local70 = 0; local70 < Static62.anInt1251; local70++) {
						local264 = local63[local70];
						local268 = local59[local70];
						local272 = local67[local70];
						local35[local70] = local268 == 0 ? 4096 : (local47[local70] << 12) / local268;
						local39[local70] = local264 == 0 ? 4096 : (local51[local70] << 12) / local264;
						local43[local70] = local272 == 0 ? 4096 : (local55[local70] << 12) / local272;
					}
				} else if (local70 == 5) {
					for (local70 = 0; local70 < Static62.anInt1251; local70++) {
						local35[local70] = 4096 - ((4096 - local47[local70]) * (-local59[local70] + 4096) >> 12);
						local39[local70] = 4096 - ((4096 - local51[local70]) * (-local63[local70] + 4096) >> 12);
						local43[local70] = 4096 - ((4096 - local67[local70]) * (4096 - local55[local70]) >> 12);
					}
				} else if (local70 == 6) {
					for (local70 = 0; local70 < Static62.anInt1251; local70++) {
						local272 = local67[local70];
						local268 = local59[local70];
						local264 = local63[local70];
						local35[local70] = local268 >= 2048 ? 4096 - ((4096 - local268) * (-local47[local70] + 4096) >> 11) : local268 * local47[local70] >> 11;
						local39[local70] = local264 >= 2048 ? 4096 - ((4096 - local264) * (4096 - local51[local70]) >> 11) : local264 * local51[local70] >> 11;
						local43[local70] = local272 >= 2048 ? 4096 - ((4096 - local55[local70]) * (-local272 + 4096) >> 11) : local55[local70] * local272 >> 11;
					}
				} else {
					@Pc(524) int local524;
					@Pc(516) int local516;
					@Pc(520) int local520;
					if (local70 == 7) {
						for (local70 = 0; local70 < Static62.anInt1251; local70++) {
							local516 = local51[local70];
							local520 = local55[local70];
							local524 = local47[local70];
							local35[local70] = local524 == 4096 ? 4096 : (local59[local70] << 12) / (4096 - local524);
							local39[local70] = local516 == 4096 ? 4096 : (local63[local70] << 12) / (4096 - local516);
							local43[local70] = local520 == 4096 ? 4096 : (local67[local70] << 12) / (4096 - local520);
						}
					} else if (local70 == 8) {
						for (local70 = 0; local70 < Static62.anInt1251; local70++) {
							local516 = local51[local70];
							local520 = local55[local70];
							local524 = local47[local70];
							local35[local70] = local524 == 0 ? 0 : 4096 - (4096 - local59[local70] << 12) / local524;
							local39[local70] = local516 == 0 ? 0 : 4096 - (4096 - local63[local70] << 12) / local516;
							local43[local70] = local520 == 0 ? 0 : 4096 - (4096 - local67[local70] << 12) / local520;
						}
					} else if (local70 == 9) {
						for (local70 = 0; local70 < Static62.anInt1251; local70++) {
							local516 = local51[local70];
							local524 = local47[local70];
							local520 = local55[local70];
							local272 = local67[local70];
							local264 = local63[local70];
							local268 = local59[local70];
							local35[local70] = local268 > local524 ? local524 : local268;
							local39[local70] = local516 >= local264 ? local264 : local516;
							local43[local70] = local272 > local520 ? local520 : local272;
						}
					} else if (local70 == 10) {
						for (local70 = 0; local70 < Static62.anInt1251; local70++) {
							local272 = local67[local70];
							local264 = local63[local70];
							local516 = local51[local70];
							local520 = local55[local70];
							local268 = local59[local70];
							local524 = local47[local70];
							local35[local70] = local268 < local524 ? local524 : local268;
							local39[local70] = local264 >= local516 ? local264 : local516;
							local43[local70] = local520 <= local272 ? local272 : local520;
						}
					} else if (local70 == 11) {
						for (local70 = 0; local70 < Static62.anInt1251; local70++) {
							local524 = local47[local70];
							local516 = local51[local70];
							local520 = local55[local70];
							local272 = local67[local70];
							local268 = local59[local70];
							local264 = local63[local70];
							local35[local70] = local268 >= local524 ? local268 - local524 : -local268 + local524;
							local39[local70] = local516 <= local264 ? local264 - local516 : local516 + -local264;
							local43[local70] = local272 < local520 ? local520 - local272 : -local520 + local272;
						}
					} else if (local70 == 12) {
						for (local70 = 0; local70 < Static62.anInt1251; local70++) {
							local520 = local55[local70];
							local264 = local63[local70];
							local516 = local51[local70];
							local524 = local47[local70];
							local272 = local67[local70];
							local268 = local59[local70];
							local35[local70] = local524 + local268 - (local268 * local524 >> 11);
							local39[local70] = local264 + local516 - (local516 * local264 >> 11);
							local43[local70] = local520 + local272 - (local520 * local272 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3314 = arg0.method8632();
		} else if (arg1 == 1) {
			super.aBoolean804 = arg0.method8632() == 1;
		}
	}
}
