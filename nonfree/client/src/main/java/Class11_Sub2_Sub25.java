import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class11_Sub2_Sub25 extends Class11_Sub2 {

	@OriginalMember(owner = "client!nf", name = "D", descriptor = "I")
	private int anInt4230;

	@OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
	private int anInt4235 = 1024;

	@OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
	private int anInt4236 = 409;

	@OriginalMember(owner = "client!nf", name = "R", descriptor = "I")
	private int anInt4242 = 819;

	@OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
	private int anInt4241 = 1024;

	@OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
	private int anInt4231 = 2048;

	@OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
	private int anInt4245 = 0;

	@OriginalMember(owner = "client!nf", name = "U", descriptor = "I")
	private int anInt4244 = 0;

	@OriginalMember(owner = "client!nf", name = "O", descriptor = "I")
	private int anInt4239 = 1024;

	@OriginalMember(owner = "client!nf", name = "X", descriptor = "I")
	private int anInt4246 = 1024;

	static {
		new Class117("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III[[IILjava/util/Random;I)V")
	private void method3722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = this.anInt4239 <= 0 ? 4096 : 4096 - Static331.method5444(this.anInt4239, arg4);
		@Pc(30) int local30 = this.anInt4230 * this.anInt4241 >> 12;
		@Pc(45) int local45 = this.anInt4230 - (local30 > 0 ? Static331.method5444(local30, arg4) : 0);
		if (arg1 >= Static339.anInt6549) {
			arg1 -= Static339.anInt6549;
		}
		@Pc(74) int local74;
		@Pc(78) int local78;
		if (local45 > 0) {
			if (arg0 > 0 && arg3 > 0) {
				local74 = arg3 / 2;
				local78 = arg0 / 2;
				@Pc(89) int local89 = local74 < local45 ? local74 : local45;
				@Pc(100) int local100 = local78 < local45 ? local78 : local45;
				@Pc(104) int local104 = local89 + arg1;
				@Pc(110) int local110 = arg3 - local89 * 2;
				for (@Pc(112) int local112 = 0; local112 < arg0; local112++) {
					@Pc(120) int[] local120 = arg2[local112 + arg5];
					@Pc(133) int local133;
					@Pc(138) int local138;
					@Pc(146) int local146;
					if (local112 < local100) {
						local133 = local22 * local112 / local100;
						if (this.anInt4245 == 0) {
							for (local138 = 0; local138 < local89; local138++) {
								local146 = local22 * local138 / local89;
								local120[arg1 + local138 & Static323.anInt6272] = local120[Static323.anInt6272 & arg1 + arg3 - local138 - 1] = local133 * local146 >> 12;
							}
						} else {
							for (local138 = 0; local138 < local89; local138++) {
								local146 = local138 * local22 / local89;
								local120[local138 + arg1 & Static323.anInt6272] = local120[arg1 + arg3 - local138 - 1 & Static323.anInt6272] = local146 < local133 ? local146 : local133;
							}
						}
						if (Static339.anInt6549 < local104 + local110) {
							local138 = Static339.anInt6549 - local104;
							Static363.method1670(local120, local104, local138, local133);
							Static363.method1670(local120, 0, local110 - local138, local133);
						} else {
							Static363.method1670(local120, local104, local110, local133);
						}
					} else {
						local133 = arg0 - local112 - 1;
						if (local133 < local100) {
							local138 = local133 * local22 / local100;
							@Pc(291) int local291;
							if (this.anInt4245 == 0) {
								for (local146 = 0; local146 < local89; local146++) {
									local291 = local146 * local22 / local89;
									local120[local146 + arg1 & Static323.anInt6272] = local120[Static323.anInt6272 & arg1 + arg3 - local146 - 1] = local291 * local138 >> 12;
								}
							} else {
								for (local146 = 0; local146 < local89; local146++) {
									local291 = local146 * local22 / local89;
									local120[arg1 + local146 & Static323.anInt6272] = local120[Static323.anInt6272 & arg1 + arg3 - local146 - 1] = local138 > local291 ? local291 : local138;
								}
							}
							if (local110 + local104 <= Static339.anInt6549) {
								Static363.method1670(local120, local104, local110, local138);
							} else {
								local146 = Static339.anInt6549 - local104;
								Static363.method1670(local120, local104, local146, local138);
								Static363.method1670(local120, 0, local110 - local146, local138);
							}
						} else {
							for (local138 = 0; local138 < local89; local138++) {
								local120[arg1 + local138 & Static323.anInt6272] = local120[arg1 + arg3 - local138 - 1 & Static323.anInt6272] = local22 * local138 / local89;
							}
							if (Static339.anInt6549 >= local110 + local104) {
								Static363.method1670(local120, local104, local110, local22);
							} else {
								local146 = Static339.anInt6549 - local104;
								Static363.method1670(local120, local104, local146, local22);
								Static363.method1670(local120, 0, local110 - local146, local22);
							}
						}
					}
				}
			}
		} else if (arg3 + arg1 > Static339.anInt6549) {
			local74 = Static339.anInt6549 - arg1;
			for (local78 = 0; local78 < arg0; local78++) {
				@Pc(501) int[] local501 = arg2[arg5 + local78];
				Static363.method1670(local501, arg1, local74, local22);
				Static363.method1670(local501, 0, arg3 - local74, local22);
			}
		} else {
			for (local74 = 0; local74 < arg0; local74++) {
				Static363.method1670(arg2[arg5 + local74], arg1, arg3, local22);
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
	@Override
	public void method5708() {
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass124_41.method2853(arg0);
		if (!super.aClass124_41.aBoolean221) {
			return local16;
		}
		@Pc(25) int[][] local25 = super.aClass124_41.method2856();
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) boolean local37 = true;
		@Pc(39) boolean local39 = true;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50 = Static339.anInt6549 * this.anInt4246 >> 12;
		@Pc(57) int local57 = this.anInt4231 * Static339.anInt6549 >> 12;
		@Pc(64) int local64 = this.anInt4236 * Static113.anInt2160 >> 12;
		@Pc(71) int local71 = this.anInt4242 * Static113.anInt2160 >> 12;
		if (local71 <= 1) {
			return local25[arg0];
		}
		this.anInt4230 = Static339.anInt6549 / 8 * this.anInt4235 >> 12;
		@Pc(95) int local95 = Static339.anInt6549 / local50 + 1;
		@Pc(99) int[][] local99 = new int[local95][3];
		@Pc(103) int[][] local103 = new int[local95][3];
		@Pc(110) Random local110 = new Random((long) this.anInt4244);
		while (true) {
			while (true) {
				@Pc(120) int local120 = Static331.method5444(local57 - local50, local110) + local50;
				@Pc(129) int local129 = Static331.method5444(local71 - local64, local110) + local64;
				@Pc(133) int local133 = local120 + local33;
				if (local133 > Static339.anInt6549) {
					local120 = Static339.anInt6549 - local33;
					local133 = Static339.anInt6549;
				}
				@Pc(177) int local177;
				@Pc(153) int local153;
				if (local39) {
					local177 = 0;
				} else {
					@Pc(147) int local147 = local35;
					@Pc(151) int[] local151 = local103[local35];
					local153 = 0;
					@Pc(157) int local157 = local27 + local133;
					if (local157 < 0) {
						local157 += Static339.anInt6549;
					}
					if (Static339.anInt6549 < local157) {
						local157 -= Static339.anInt6549;
					}
					local177 = local151[2];
					while (true) {
						@Pc(181) int[] local181 = local103[local147];
						if (local181[0] <= local157 && local181[1] >= local157) {
							if (local35 != local147) {
								@Pc(211) int local211 = local27 + local33;
								if (local211 < 0) {
									local211 += Static339.anInt6549;
								}
								if (Static339.anInt6549 < local211) {
									local211 -= Static339.anInt6549;
								}
								for (@Pc(229) int local229 = 1; local229 <= local153; local229++) {
									@Pc(240) int[] local240 = local103[(local35 + local229) % local41];
									local177 = Math.max(local177, local240[2]);
								}
								for (@Pc(256) int local256 = 0; local256 <= local153; local256++) {
									@Pc(267) int[] local267 = local103[(local35 + local256) % local41];
									@Pc(271) int local271 = local267[2];
									if (local177 != local271) {
										@Pc(282) int local282 = local267[0];
										@Pc(286) int local286 = local267[1];
										@Pc(299) int local299;
										@Pc(301) int local301;
										if (local157 > local211) {
											local299 = Math.max(local211, local282);
											local301 = Math.min(local157, local286);
										} else if (local282 == 0) {
											local299 = 0;
											local301 = Math.min(local157, local286);
										} else {
											local299 = Math.max(local211, local282);
											local301 = Static339.anInt6549;
										}
										this.method3722(local177 - local271, local299 - -local31, local25, local301 - local299, local110, local271);
									}
								}
							}
							local35 = local147;
							break;
						}
						local147++;
						if (local41 <= local147) {
							local147 = 0;
						}
						local153++;
					}
				}
				if (local177 + local129 <= Static113.anInt2160) {
					local37 = false;
				} else {
					local129 = Static113.anInt2160 - local177;
				}
				@Pc(385) int[] local385;
				if (local133 == Static339.anInt6549) {
					this.method3722(local129, local33 + local29, local25, local120, local110, local177);
					if (local37) {
						return local16;
					}
					local37 = true;
					local385 = local99[local43++];
					local385[0] = local33;
					local385[1] = local133;
					local385[2] = local129 + local177;
					@Pc(401) int[][] local401 = local103;
					local103 = local99;
					local99 = local401;
					local41 = local43;
					local31 = local29;
					local43 = 0;
					local29 = Static331.method5444(Static339.anInt6549, local110);
					local33 = 0;
					local27 = local29 - local31;
					local153 = local27;
					if (local27 < 0) {
						local153 = local27 + Static339.anInt6549;
					}
					if (local153 > Static339.anInt6549) {
						local153 -= Static339.anInt6549;
					}
					local35 = 0;
					while (true) {
						@Pc(444) int[] local444 = local103[local35];
						if (local153 >= local444[0] && local153 <= local444[1]) {
							local39 = false;
							break;
						}
						local35++;
						if (local41 <= local35) {
							local35 = 0;
						}
					}
				} else {
					local385 = local99[local43++];
					local385[1] = local133;
					local385[2] = local177 + local129;
					local385[0] = local33;
					this.method3722(local129, local29 + local33, local25, local120, local110, local177);
					local33 = local133;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4244 = arg0.method5185();
		} else if (arg1 == 1) {
			this.anInt4246 = arg0.method5187();
		} else if (arg1 == 2) {
			this.anInt4231 = arg0.method5187();
		} else if (arg1 == 3) {
			this.anInt4236 = arg0.method5187();
		} else if (arg1 == 4) {
			this.anInt4242 = arg0.method5187();
		} else if (arg1 == 5) {
			this.anInt4235 = arg0.method5187();
		} else if (arg1 == 6) {
			this.anInt4245 = arg0.method5185();
		} else if (arg1 == 7) {
			this.anInt4241 = arg0.method5187();
		} else if (arg1 == 8) {
			this.anInt4239 = arg0.method5187();
		}
	}
}
