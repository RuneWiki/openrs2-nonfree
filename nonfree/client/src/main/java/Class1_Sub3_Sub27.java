import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class1_Sub3_Sub27 extends Class1_Sub3 {

	@OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
	private int anInt5332;

	@OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
	private int anInt5328 = 409;

	@OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
	private int anInt5330 = 0;

	@OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
	private int anInt5334 = 2048;

	@OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
	private int anInt5329 = 1024;

	@OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
	private int anInt5333 = 1024;

	@OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
	private int anInt5336 = 1024;

	@OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
	private int anInt5338 = 0;

	@OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
	private int anInt5340 = 819;

	@OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
	private int anInt5335 = 1024;

	static {
		new Class84("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		@Pc(25) int[] local25 = super.aClass172_41.method3962(arg0);
		if (!super.aClass172_41.aBoolean327) {
			return local25;
		}
		@Pc(34) int[][] local34 = super.aClass172_41.method3959();
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(46) boolean local46 = true;
		@Pc(48) boolean local48 = true;
		@Pc(50) int local50 = 0;
		@Pc(52) int local52 = 0;
		@Pc(59) int local59 = this.anInt5336 * Static347.anInt5974 >> 12;
		@Pc(66) int local66 = this.anInt5334 * Static347.anInt5974 >> 12;
		@Pc(73) int local73 = Static241.anInt4307 * this.anInt5328 >> 12;
		@Pc(80) int local80 = this.anInt5340 * Static241.anInt4307 >> 12;
		if (local80 <= 1) {
			return local34[arg0];
		}
		this.anInt5332 = Static347.anInt5974 / 8 * this.anInt5329 >> 12;
		@Pc(103) int local103 = Static347.anInt5974 / local59 + 1;
		@Pc(107) int[][] local107 = new int[local103][3];
		@Pc(111) int[][] local111 = new int[local103][3];
		@Pc(118) Random local118 = new Random((long) this.anInt5330);
		while (true) {
			while (true) {
				@Pc(129) int local129 = local59 + Static301.method3334(local66 - local59, local118);
				@Pc(139) int local139 = Static301.method3334(local80 - local73, local118) + local73;
				@Pc(144) int local144 = local42 + local129;
				if (Static347.anInt5974 < local144) {
					local129 = Static347.anInt5974 - local42;
					local144 = Static347.anInt5974;
				}
				@Pc(214) int local214;
				@Pc(167) int local167;
				if (local48) {
					local214 = 0;
				} else {
					@Pc(161) int local161 = local44;
					@Pc(165) int[] local165 = local111[local44];
					local167 = 0;
					@Pc(171) int local171 = local36 + local144;
					if (local171 < 0) {
						local171 += Static347.anInt5974;
					}
					if (local171 > Static347.anInt5974) {
						local171 -= Static347.anInt5974;
					}
					while (true) {
						@Pc(191) int[] local191 = local111[local161];
						if (local191[0] <= local171 && local191[1] >= local171) {
							local214 = local165[2];
							if (local161 != local44) {
								@Pc(225) int local225 = local36 + local42;
								if (local225 < 0) {
									local225 += Static347.anInt5974;
								}
								if (Static347.anInt5974 < local225) {
									local225 -= Static347.anInt5974;
								}
								for (@Pc(247) int local247 = 1; local247 <= local167; local247++) {
									@Pc(257) int[] local257 = local111[(local247 + local44) % local50];
									local214 = Math.max(local214, local257[2]);
								}
								for (@Pc(273) int local273 = 0; local273 <= local167; local273++) {
									@Pc(283) int[] local283 = local111[(local44 + local273) % local50];
									@Pc(287) int local287 = local283[2];
									if (local287 != local214) {
										@Pc(294) int local294 = local283[0];
										@Pc(298) int local298 = local283[1];
										@Pc(316) int local316;
										@Pc(314) int local314;
										if (local225 < local171) {
											local316 = Math.max(local225, local294);
											local314 = Math.min(local171, local298);
										} else if (local294 == 0) {
											local314 = Math.min(local171, local298);
											local316 = 0;
										} else {
											local316 = Math.max(local225, local294);
											local314 = Static347.anInt5974;
										}
										this.method4297(local287, local40 + local316, -local287 + local214, local34, local314 - local316, local118);
									}
								}
							}
							local44 = local161;
							break;
						}
						local161++;
						if (local50 <= local161) {
							local161 = 0;
						}
						local167++;
					}
				}
				if (local139 + local214 <= Static241.anInt4307) {
					local46 = false;
				} else {
					local139 = Static241.anInt4307 - local214;
				}
				@Pc(399) int[] local399;
				if (Static347.anInt5974 == local144) {
					this.method4297(local214, local42 + local38, local139, local34, local129, local118);
					if (local46) {
						return local25;
					}
					local46 = true;
					local399 = local107[local52++];
					local399[0] = local42;
					local399[1] = local144;
					local399[2] = local214 + local139;
					@Pc(415) int[][] local415 = local111;
					local111 = local107;
					local107 = local415;
					local50 = local52;
					local52 = 0;
					local40 = local38;
					local38 = Static301.method3334(Static347.anInt5974, local118);
					local36 = local38 - local40;
					local42 = 0;
					local167 = local36;
					if (local36 < 0) {
						local167 = local36 + Static347.anInt5974;
					}
					if (Static347.anInt5974 < local167) {
						local167 -= Static347.anInt5974;
					}
					local44 = 0;
					local48 = false;
					while (true) {
						@Pc(464) int[] local464 = local111[local44];
						if (local464[0] <= local167 && local464[1] >= local167) {
							break;
						}
						local44++;
						if (local44 >= local50) {
							local44 = 0;
						}
					}
				} else {
					local399 = local107[local52++];
					local399[0] = local42;
					local399[2] = local139 + local214;
					local399[1] = local144;
					this.method4297(local214, local42 + local38, local139, local34, local129, local118);
					local42 = local144;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!lh;II)V")
	@Override
	public void method6079(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5330 = arg0.method4130();
		} else if (arg1 == 1) {
			this.anInt5336 = arg0.method4093();
		} else if (arg1 == 2) {
			this.anInt5334 = arg0.method4093();
		} else if (arg1 == 3) {
			this.anInt5328 = arg0.method4093();
		} else if (arg1 == 4) {
			this.anInt5340 = arg0.method4093();
		} else if (arg1 == 5) {
			this.anInt5329 = arg0.method4093();
		} else if (arg1 == 6) {
			this.anInt5338 = arg0.method4130();
		} else if (arg1 == 7) {
			this.anInt5335 = arg0.method4093();
		} else if (arg1 == 8) {
			this.anInt5333 = arg0.method4093();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III[[IIILjava/util/Random;)V")
	private void method4297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Random arg5) {
		@Pc(19) int local19 = this.anInt5333 > 0 ? 4096 - Static301.method3334(this.anInt5333, arg5) : 4096;
		@Pc(27) int local27 = this.anInt5332 * this.anInt5335 >> 12;
		@Pc(40) int local40 = this.anInt5332 - (local27 > 0 ? Static301.method3334(local27, arg5) : 0);
		if (Static347.anInt5974 <= arg1) {
			arg1 -= Static347.anInt5974;
		}
		@Pc(60) int local60;
		@Pc(89) int local89;
		if (local40 > 0) {
			if (arg2 <= 0 || arg4 <= 0) {
				return;
			}
			local60 = arg4 / 2;
			local89 = arg2 / 2;
			@Pc(143) int local143 = local60 < local40 ? local60 : local40;
			@Pc(150) int local150 = local40 <= local89 ? local40 : local89;
			@Pc(155) int local155 = arg1 + local143;
			@Pc(161) int local161 = arg4 - local143 * 2;
			for (@Pc(163) int local163 = 0; local163 < arg2; local163++) {
				@Pc(172) int[] local172 = arg3[local163 + arg0];
				@Pc(181) int local181;
				@Pc(186) int local186;
				@Pc(194) int local194;
				if (local163 < local150) {
					local181 = local163 * local19 / local150;
					if (this.anInt5338 == 0) {
						for (local186 = 0; local186 < local143; local186++) {
							local194 = local186 * local19 / local143;
							local172[arg1 + local186 & Static307.anInt5524] = local172[arg1 + arg4 - local186 - 1 & Static307.anInt5524] = local181 * local194 >> 12;
						}
					} else {
						for (local186 = 0; local186 < local143; local186++) {
							local194 = local186 * local19 / local143;
							local172[Static307.anInt5524 & local186 + arg1] = local172[arg4 + arg1 - local186 - 1 & Static307.anInt5524] = local194 >= local181 ? local181 : local194;
						}
					}
					if (local161 + local155 > Static347.anInt5974) {
						local186 = Static347.anInt5974 - local155;
						Static460.method4215(local172, local155, local186, local181);
						Static460.method4215(local172, 0, local161 - local186, local181);
					} else {
						Static460.method4215(local172, local155, local161, local181);
					}
				} else {
					local181 = arg2 - local163 - 1;
					if (local150 > local181) {
						local186 = local181 * local19 / local150;
						@Pc(344) int local344;
						if (this.anInt5338 == 0) {
							for (local194 = 0; local194 < local143; local194++) {
								local344 = local19 * local194 / local143;
								local172[arg1 + local194 & Static307.anInt5524] = local172[Static307.anInt5524 & arg4 + arg1 - local194 - 1] = local344 * local186 >> 12;
							}
						} else {
							for (local194 = 0; local194 < local143; local194++) {
								local344 = local194 * local19 / local143;
								local172[Static307.anInt5524 & arg1 + local194] = local172[arg1 + arg4 - local194 - 1 & Static307.anInt5524] = local186 <= local344 ? local186 : local344;
							}
						}
						if (local155 + local161 > Static347.anInt5974) {
							local194 = Static347.anInt5974 - local155;
							Static460.method4215(local172, local155, local194, local186);
							Static460.method4215(local172, 0, local161 - local194, local186);
						} else {
							Static460.method4215(local172, local155, local161, local186);
						}
					} else {
						for (local186 = 0; local186 < local143; local186++) {
							local172[local186 + arg1 & Static307.anInt5524] = local172[arg4 + arg1 - local186 - 1 & Static307.anInt5524] = local19 * local186 / local143;
						}
						if (Static347.anInt5974 >= local155 + local161) {
							Static460.method4215(local172, local155, local161, local19);
						} else {
							local194 = Static347.anInt5974 - local155;
							Static460.method4215(local172, local155, local194, local19);
							Static460.method4215(local172, 0, local161 - local194, local19);
						}
					}
				}
			}
		} else if (Static347.anInt5974 >= arg4 + arg1) {
			for (local60 = 0; local60 < arg2; local60++) {
				Static460.method4215(arg3[arg0 + local60], arg1, arg4, local19);
			}
		} else {
			local60 = Static347.anInt5974 - arg1;
			for (local89 = 0; local89 < arg2; local89++) {
				@Pc(97) int[] local97 = arg3[local89 + arg0];
				Static460.method4215(local97, arg1, local60, local19);
				Static460.method4215(local97, 0, arg4 - local60, local19);
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
	@Override
	public void method6074() {
	}
}
