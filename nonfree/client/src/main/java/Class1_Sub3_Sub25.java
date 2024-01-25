import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class1_Sub3_Sub25 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
	private int anInt4781 = 6;

	static {
		new Class84("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub25() {
		super(2, false);
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass172_41.method3962(arg0);
		if (super.aClass172_41.aBoolean327) {
			@Pc(26) int[] local26 = this.method6076(0, arg0);
			@Pc(32) int[] local32 = this.method6076(1, arg0);
			@Pc(35) int local35 = this.anInt4781;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static347.anInt5974; local35++) {
					local11[local35] = local26[local35] + local32[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static347.anInt5974; local35++) {
					local11[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static347.anInt5974; local35++) {
					local11[local35] = local26[local35] * local32[local35] >> 12;
				}
			} else {
				@Pc(171) int local171;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static347.anInt5974; local35++) {
						local171 = local32[local35];
						local11[local35] = local171 == 0 ? 4096 : (local26[local35] << 12) / local171;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static347.anInt5974; local35++) {
						local11[local35] = 4096 - ((4096 - local26[local35]) * (-local32[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static347.anInt5974; local35++) {
						local171 = local32[local35];
						local11[local35] = local171 >= 2048 ? 4096 - ((4096 - local26[local35]) * (-local171 + 4096) >> 11) : local171 * local26[local35] >> 11;
					}
				} else {
					@Pc(286) int local286;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static347.anInt5974; local35++) {
							local286 = local26[local35];
							local11[local35] = local286 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local286);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static347.anInt5974; local35++) {
							local286 = local26[local35];
							local11[local35] = local286 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local286;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static347.anInt5974; local35++) {
							local171 = local32[local35];
							local286 = local26[local35];
							local11[local35] = local171 <= local286 ? local171 : local286;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static347.anInt5974; local35++) {
							local171 = local32[local35];
							local286 = local26[local35];
							local11[local35] = local171 >= local286 ? local171 : local286;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static347.anInt5974; local35++) {
							local171 = local32[local35];
							local286 = local26[local35];
							local11[local35] = local286 > local171 ? local286 - local171 : local171 + -local286;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static347.anInt5974; local35++) {
							local171 = local32[local35];
							local286 = local26[local35];
							local11[local35] = local286 + local171 - (local286 * local171 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4781 = arg0.method4130();
		} else if (arg1 == 1) {
			super.aBoolean494 = arg0.method4130() == 1;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6083(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass20_41.method474(arg0);
		if (super.aClass20_41.aBoolean14) {
			@Pc(26) int[][] local26 = this.method6072(0, arg0);
			@Pc(32) int[][] local32 = this.method6072(1, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt4781;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static347.anInt5974; local71++) {
					local36[local71] = local48[local71] + local60[local71];
					local40[local71] = local52[local71] + local64[local71];
					local44[local71] = local56[local71] + local68[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static347.anInt5974; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static347.anInt5974; local71++) {
					local36[local71] = local48[local71] * local60[local71] >> 12;
					local40[local71] = local52[local71] * local64[local71] >> 12;
					local44[local71] = local68[local71] * local56[local71] >> 12;
				}
			} else {
				@Pc(276) int local276;
				@Pc(268) int local268;
				@Pc(272) int local272;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static347.anInt5974; local71++) {
						local268 = local64[local71];
						local272 = local68[local71];
						local276 = local60[local71];
						local36[local71] = local276 == 0 ? 4096 : (local48[local71] << 12) / local276;
						local40[local71] = local268 == 0 ? 4096 : (local52[local71] << 12) / local268;
						local44[local71] = local272 == 0 ? 4096 : (local56[local71] << 12) / local272;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static347.anInt5974; local71++) {
						local36[local71] = 4096 - ((4096 - local60[local71]) * (-local48[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local64[local71]) * (-local52[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local56[local71]) * (4096 - local68[local71]) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static347.anInt5974; local71++) {
						local268 = local64[local71];
						local272 = local68[local71];
						local276 = local60[local71];
						local36[local71] = local276 >= 2048 ? 4096 - ((4096 - local48[local71]) * (-local276 + 4096) >> 11) : local276 * local48[local71] >> 11;
						local40[local71] = local268 >= 2048 ? 4096 - ((4096 - local268) * (4096 - local52[local71]) >> 11) : local268 * local52[local71] >> 11;
						local44[local71] = local272 < 2048 ? local272 * local56[local71] >> 11 : 4096 - ((4096 - local272) * (4096 - local56[local71]) >> 11);
					}
				} else {
					@Pc(532) int local532;
					@Pc(528) int local528;
					@Pc(536) int local536;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static347.anInt5974; local71++) {
							local528 = local52[local71];
							local532 = local48[local71];
							local536 = local56[local71];
							local36[local71] = local532 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local532);
							local40[local71] = local528 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local528);
							local44[local71] = local536 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local536);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static347.anInt5974; local71++) {
							local532 = local48[local71];
							local536 = local56[local71];
							local528 = local52[local71];
							local36[local71] = local532 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local532;
							local40[local71] = local528 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local528;
							local44[local71] = local536 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local536;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static347.anInt5974; local71++) {
							local532 = local48[local71];
							local272 = local68[local71];
							local528 = local52[local71];
							local276 = local60[local71];
							local268 = local64[local71];
							local536 = local56[local71];
							local36[local71] = local276 > local532 ? local532 : local276;
							local40[local71] = local268 > local528 ? local528 : local268;
							local44[local71] = local272 > local536 ? local536 : local272;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static347.anInt5974; local71++) {
							local276 = local60[local71];
							local536 = local56[local71];
							local528 = local52[local71];
							local532 = local48[local71];
							local268 = local64[local71];
							local272 = local68[local71];
							local36[local71] = local276 < local532 ? local532 : local276;
							local40[local71] = local528 <= local268 ? local268 : local528;
							local44[local71] = local272 < local536 ? local536 : local272;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static347.anInt5974; local71++) {
							local276 = local60[local71];
							local272 = local68[local71];
							local536 = local56[local71];
							local268 = local64[local71];
							local532 = local48[local71];
							local528 = local52[local71];
							local36[local71] = local532 <= local276 ? local276 - local532 : local532 - local276;
							local40[local71] = local268 >= local528 ? local268 - local528 : -local268 + local528;
							local44[local71] = local536 <= local272 ? local272 - local536 : -local272 + local536;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static347.anInt5974; local71++) {
							local276 = local60[local71];
							local268 = local64[local71];
							local532 = local48[local71];
							local272 = local68[local71];
							local528 = local52[local71];
							local536 = local56[local71];
							local36[local71] = local276 + local532 - (local532 * local276 >> 11);
							local40[local71] = local528 + local268 - (local268 * local528 >> 11);
							local44[local71] = local536 + local272 - (local536 * local272 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}
}
