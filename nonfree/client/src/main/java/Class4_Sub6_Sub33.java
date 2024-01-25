import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class4_Sub6_Sub33 extends Class4_Sub6 {

	@OriginalMember(owner = "client!tl", name = "O", descriptor = "I")
	private int anInt5984 = 6;

	static {
		new Class159("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub33() {
		super(2, false);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt5984 = arg1.method3440();
		} else if (arg0 == 1) {
			super.aBoolean489 = arg1.method3440() == 1;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5694(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass90_41.method2575(arg0);
		if (super.aClass90_41.aBoolean211) {
			@Pc(21) int[][] local21 = this.method5693(0, arg0);
			@Pc(27) int[][] local27 = this.method5693(1, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(43) int[] local43 = local21[0];
			@Pc(47) int[] local47 = local21[1];
			@Pc(51) int[] local51 = local21[2];
			@Pc(55) int[] local55 = local27[0];
			@Pc(59) int[] local59 = local27[1];
			@Pc(63) int[] local63 = local27[2];
			@Pc(66) int local66 = this.anInt5984;
			if (local66 == 1) {
				for (local66 = 0; local66 < Static31.anInt797; local66++) {
					local31[local66] = local55[local66] + local43[local66];
					local35[local66] = local47[local66] + local59[local66];
					local39[local66] = local63[local66] + local51[local66];
				}
			} else if (local66 == 2) {
				for (local66 = 0; local66 < Static31.anInt797; local66++) {
					local31[local66] = local43[local66] - local55[local66];
					local35[local66] = local47[local66] - local59[local66];
					local39[local66] = local51[local66] - local63[local66];
				}
			} else if (local66 == 3) {
				for (local66 = 0; local66 < Static31.anInt797; local66++) {
					local31[local66] = local43[local66] * local55[local66] >> 12;
					local35[local66] = local59[local66] * local47[local66] >> 12;
					local39[local66] = local51[local66] * local63[local66] >> 12;
				}
			} else {
				@Pc(261) int local261;
				@Pc(265) int local265;
				@Pc(269) int local269;
				if (local66 == 4) {
					for (local66 = 0; local66 < Static31.anInt797; local66++) {
						local261 = local55[local66];
						local265 = local59[local66];
						local269 = local63[local66];
						local31[local66] = local261 == 0 ? 4096 : (local43[local66] << 12) / local261;
						local35[local66] = local265 == 0 ? 4096 : (local47[local66] << 12) / local265;
						local39[local66] = local269 == 0 ? 4096 : (local51[local66] << 12) / local269;
					}
				} else if (local66 == 5) {
					for (local66 = 0; local66 < Static31.anInt797; local66++) {
						local31[local66] = 4096 - ((4096 - local55[local66]) * (-local43[local66] + 4096) >> 12);
						local35[local66] = 4096 - ((4096 - local47[local66]) * (-local59[local66] + 4096) >> 12);
						local39[local66] = 4096 - ((4096 - local63[local66]) * (-local51[local66] + 4096) >> 12);
					}
				} else if (local66 == 6) {
					for (local66 = 0; local66 < Static31.anInt797; local66++) {
						local269 = local63[local66];
						local261 = local55[local66];
						local265 = local59[local66];
						local31[local66] = local261 >= 2048 ? 4096 - ((4096 - local261) * (-local43[local66] + 4096) >> 11) : local43[local66] * local261 >> 11;
						local35[local66] = local265 < 2048 ? local47[local66] * local265 >> 11 : 4096 - ((4096 - local47[local66]) * (4096 - local265) >> 11);
						local39[local66] = local269 >= 2048 ? 4096 - ((4096 - local269) * (-local51[local66] + 4096) >> 11) : local269 * local51[local66] >> 11;
					}
				} else {
					@Pc(527) int local527;
					@Pc(531) int local531;
					@Pc(523) int local523;
					if (local66 == 7) {
						for (local66 = 0; local66 < Static31.anInt797; local66++) {
							local523 = local51[local66];
							local527 = local43[local66];
							local531 = local47[local66];
							local31[local66] = local527 == 4096 ? 4096 : (local55[local66] << 12) / (4096 - local527);
							local35[local66] = local531 == 4096 ? 4096 : (local59[local66] << 12) / (4096 - local531);
							local39[local66] = local523 == 4096 ? 4096 : (local63[local66] << 12) / (4096 - local523);
						}
					} else if (local66 == 8) {
						for (local66 = 0; local66 < Static31.anInt797; local66++) {
							local523 = local51[local66];
							local531 = local47[local66];
							local527 = local43[local66];
							local31[local66] = local527 == 0 ? 0 : 4096 - (4096 - local55[local66] << 12) / local527;
							local35[local66] = local531 == 0 ? 0 : 4096 - (4096 - local59[local66] << 12) / local531;
							local39[local66] = local523 == 0 ? 0 : 4096 - (4096 - local63[local66] << 12) / local523;
						}
					} else if (local66 == 9) {
						for (local66 = 0; local66 < Static31.anInt797; local66++) {
							local261 = local55[local66];
							local265 = local59[local66];
							local523 = local51[local66];
							local269 = local63[local66];
							local531 = local47[local66];
							local527 = local43[local66];
							local31[local66] = local261 > local527 ? local527 : local261;
							local35[local66] = local531 >= local265 ? local265 : local531;
							local39[local66] = local269 <= local523 ? local269 : local523;
						}
					} else if (local66 == 10) {
						for (local66 = 0; local66 < Static31.anInt797; local66++) {
							local523 = local51[local66];
							local261 = local55[local66];
							local265 = local59[local66];
							local269 = local63[local66];
							local527 = local43[local66];
							local531 = local47[local66];
							local31[local66] = local261 >= local527 ? local261 : local527;
							local35[local66] = local265 < local531 ? local531 : local265;
							local39[local66] = local523 > local269 ? local523 : local269;
						}
					} else if (local66 == 11) {
						for (local66 = 0; local66 < Static31.anInt797; local66++) {
							local527 = local43[local66];
							local531 = local47[local66];
							local261 = local55[local66];
							local523 = local51[local66];
							local265 = local59[local66];
							local269 = local63[local66];
							local31[local66] = local527 <= local261 ? local261 - local527 : local527 - local261;
							local35[local66] = local265 < local531 ? local531 - local265 : -local531 + local265;
							local39[local66] = local523 > local269 ? local523 - local269 : -local523 + local269;
						}
					} else if (local66 == 12) {
						for (local66 = 0; local66 < Static31.anInt797; local66++) {
							local523 = local51[local66];
							local261 = local55[local66];
							local531 = local47[local66];
							local527 = local43[local66];
							local265 = local59[local66];
							local269 = local63[local66];
							local31[local66] = local527 + local261 - (local527 * local261 >> 11);
							local35[local66] = local265 + local531 - (local531 * local265 >> 11);
							local39[local66] = local269 + local523 - (local523 * local269 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			@Pc(27) int[] local27 = this.method5702(arg0, 0);
			@Pc(33) int[] local33 = this.method5702(arg0, 1);
			@Pc(36) int local36 = this.anInt5984;
			if (local36 == 1) {
				for (local36 = 0; local36 < Static31.anInt797; local36++) {
					local11[local36] = local27[local36] + local33[local36];
				}
			} else if (local36 == 2) {
				for (local36 = 0; local36 < Static31.anInt797; local36++) {
					local11[local36] = local27[local36] - local33[local36];
				}
			} else if (local36 == 3) {
				for (local36 = 0; local36 < Static31.anInt797; local36++) {
					local11[local36] = local27[local36] * local33[local36] >> 12;
				}
			} else {
				@Pc(165) int local165;
				if (local36 == 4) {
					for (local36 = 0; local36 < Static31.anInt797; local36++) {
						local165 = local33[local36];
						local11[local36] = local165 == 0 ? 4096 : (local27[local36] << 12) / local165;
					}
				} else if (local36 == 5) {
					for (local36 = 0; local36 < Static31.anInt797; local36++) {
						local11[local36] = 4096 - ((4096 - local33[local36]) * (4096 - local27[local36]) >> 12);
					}
				} else if (local36 == 6) {
					for (local36 = 0; local36 < Static31.anInt797; local36++) {
						local165 = local33[local36];
						local11[local36] = local165 >= 2048 ? 4096 - ((4096 - local27[local36]) * (4096 - local165) >> 11) : local27[local36] * local165 >> 11;
					}
				} else {
					@Pc(271) int local271;
					if (local36 == 7) {
						for (local36 = 0; local36 < Static31.anInt797; local36++) {
							local271 = local27[local36];
							local11[local36] = local271 == 4096 ? 4096 : (local33[local36] << 12) / (4096 - local271);
						}
					} else if (local36 == 8) {
						for (local36 = 0; local36 < Static31.anInt797; local36++) {
							local271 = local27[local36];
							local11[local36] = local271 == 0 ? 0 : 4096 - (4096 - local33[local36] << 12) / local271;
						}
					} else if (local36 == 9) {
						for (local36 = 0; local36 < Static31.anInt797; local36++) {
							local165 = local33[local36];
							local271 = local27[local36];
							local11[local36] = local165 <= local271 ? local165 : local271;
						}
					} else if (local36 == 10) {
						for (local36 = 0; local36 < Static31.anInt797; local36++) {
							local165 = local33[local36];
							local271 = local27[local36];
							local11[local36] = local271 > local165 ? local271 : local165;
						}
					} else if (local36 == 11) {
						for (local36 = 0; local36 < Static31.anInt797; local36++) {
							local165 = local33[local36];
							local271 = local27[local36];
							local11[local36] = local165 >= local271 ? local165 - local271 : -local165 + local271;
						}
					} else if (local36 == 12) {
						for (local36 = 0; local36 < Static31.anInt797; local36++) {
							local271 = local27[local36];
							local165 = local33[local36];
							local11[local36] = local165 + local271 - (local271 * local165 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
