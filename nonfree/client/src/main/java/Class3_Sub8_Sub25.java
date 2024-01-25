import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class3_Sub8_Sub25 extends Class3_Sub8 {

	@OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
	private int anInt7697;

	@OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
	private int anInt7687 = 1024;

	@OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
	private int anInt7681 = 1024;

	@OriginalMember(owner = "client!qe", name = "L", descriptor = "I")
	private int anInt7686 = 0;

	@OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
	private int anInt7688 = 409;

	@OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
	private int anInt7694 = 1024;

	@OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
	private int anInt7692 = 819;

	@OriginalMember(owner = "client!qe", name = "F", descriptor = "I")
	private int anInt7682 = 0;

	@OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
	private int anInt7691 = 2048;

	@OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
	private int anInt7698 = 1024;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt7686 = arg1.method7954();
		} else if (arg0 == 1) {
			this.anInt7694 = arg1.method7951();
		} else if (arg0 == 2) {
			this.anInt7691 = arg1.method7951();
		} else if (arg0 == 3) {
			this.anInt7688 = arg1.method7951();
		} else if (arg0 == 4) {
			this.anInt7692 = arg1.method7951();
		} else if (arg0 == 5) {
			this.anInt7681 = arg1.method7951();
		} else if (arg0 == 6) {
			this.anInt7682 = arg1.method7954();
		} else if (arg0 == 7) {
			this.anInt7687 = arg1.method7951();
		} else if (arg0 == 8) {
			this.anInt7698 = arg1.method7951();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass87_41.method1796(arg0);
		if (!super.aClass87_41.aBoolean163) {
			return local17;
		}
		@Pc(26) int[][] local26 = super.aClass87_41.method1798();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = this.anInt7694 * Static91.anInt1849 >> 12;
		@Pc(58) int local58 = this.anInt7691 * Static91.anInt1849 >> 12;
		@Pc(65) int local65 = this.anInt7688 * Static589.anInt9553 >> 12;
		@Pc(72) int local72 = this.anInt7692 * Static589.anInt9553 >> 12;
		if (local72 <= 1) {
			return local26[arg0];
		}
		this.anInt7697 = this.anInt7681 * (Static91.anInt1849 / 8) >> 12;
		@Pc(97) int local97 = Static91.anInt1849 / local51 + 1;
		@Pc(101) int[][] local101 = new int[local97][3];
		@Pc(105) int[][] local105 = new int[local97][3];
		@Pc(112) Random local112 = new Random((long) this.anInt7686);
		while (true) {
			while (true) {
				@Pc(126) int local126 = Static93.method1603(local58 - local51, local112) + local51;
				@Pc(136) int local136 = Static93.method1603(local72 - local65, local112) + local65;
				@Pc(141) int local141 = local34 + local126;
				if (Static91.anInt1849 < local141) {
					local141 = Static91.anInt1849;
					local126 = Static91.anInt1849 - local34;
				}
				@Pc(213) int local213;
				@Pc(161) int local161;
				if (local40) {
					local213 = 0;
				} else {
					@Pc(155) int local155 = local36;
					@Pc(159) int[] local159 = local105[local36];
					local161 = 0;
					@Pc(165) int local165 = local141 + local28;
					if (local165 < 0) {
						local165 += Static91.anInt1849;
					}
					if (local165 > Static91.anInt1849) {
						local165 -= Static91.anInt1849;
					}
					while (true) {
						@Pc(186) int[] local186 = local105[local155];
						if (local165 >= local186[0] && local165 <= local186[1]) {
							local213 = local159[2];
							if (local155 != local36) {
								@Pc(220) int local220 = local34 + local28;
								if (local220 < 0) {
									local220 += Static91.anInt1849;
								}
								if (Static91.anInt1849 < local220) {
									local220 -= Static91.anInt1849;
								}
								for (@Pc(238) int local238 = 1; local238 <= local161; local238++) {
									@Pc(249) int[] local249 = local105[(local36 + local238) % local42];
									local213 = Math.max(local213, local249[2]);
								}
								for (@Pc(265) int local265 = 0; local265 <= local161; local265++) {
									@Pc(275) int[] local275 = local105[(local265 + local36) % local42];
									@Pc(279) int local279 = local275[2];
									if (local279 != local213) {
										@Pc(290) int local290 = local275[0];
										@Pc(294) int local294 = local275[1];
										@Pc(301) int local301;
										@Pc(305) int local305;
										if (local165 > local220) {
											local301 = Math.max(local220, local290);
											local305 = Math.min(local165, local294);
										} else if (local290 == 0) {
											local301 = 0;
											local305 = Math.min(local165, local294);
										} else {
											local301 = Math.max(local220, local290);
											local305 = Static91.anInt1849;
										}
										this.method6384(local213 - local279, local279, local26, local305 - local301, local112, local301 + local32);
									}
								}
							}
							local36 = local155;
							break;
						}
						local155++;
						if (local155 >= local42) {
							local155 = 0;
						}
						local161++;
					}
				}
				if (local213 + local136 <= Static589.anInt9553) {
					local38 = false;
				} else {
					local136 = Static589.anInt9553 - local213;
				}
				@Pc(399) int[] local399;
				if (Static91.anInt1849 == local141) {
					this.method6384(local136, local213, local26, local126, local112, local34 + local30);
					if (local38) {
						return local17;
					}
					local38 = true;
					local399 = local101[local44++];
					local399[1] = local141;
					local399[0] = local34;
					local399[2] = local213 + local136;
					@Pc(415) int[][] local415 = local105;
					local105 = local101;
					local42 = local44;
					local101 = local415;
					local32 = local30;
					local44 = 0;
					local30 = Static93.method1603(Static91.anInt1849, local112);
					local34 = 0;
					local28 = local30 - local32;
					local161 = local28;
					if (local28 < 0) {
						local161 = local28 + Static91.anInt1849;
					}
					if (Static91.anInt1849 < local161) {
						local161 -= Static91.anInt1849;
					}
					local36 = 0;
					while (true) {
						@Pc(462) int[] local462 = local105[local36];
						if (local161 >= local462[0] && local161 <= local462[1]) {
							local40 = false;
							break;
						}
						local36++;
						if (local42 <= local36) {
							local36 = 0;
						}
					}
				} else {
					local399 = local101[local44++];
					local399[0] = local34;
					local399[1] = local141;
					local399[2] = local213 + local136;
					this.method6384(local136, local213, local26, local126, local112, local34 + local30);
					local34 = local141;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBI[[IILjava/util/Random;I)V")
	private void method6384(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = this.anInt7698 > 0 ? 4096 - Static93.method1603(this.anInt7698, arg4) : 4096;
		@Pc(32) int local32 = this.anInt7697 * this.anInt7687 >> 12;
		@Pc(48) int local48 = this.anInt7697 - (local32 > 0 ? Static93.method1603(local32, arg4) : 0);
		if (arg5 >= Static91.anInt1849) {
			arg5 -= Static91.anInt1849;
		}
		@Pc(74) int local74;
		@Pc(76) int local76;
		if (local48 <= 0) {
			if (Static91.anInt1849 < arg5 + arg3) {
				local74 = Static91.anInt1849 - arg5;
				for (local76 = 0; local76 < arg0; local76++) {
					@Pc(85) int[] local85 = arg2[arg1 + local76];
					Static681.method4032(local85, arg5, local74, local18);
					Static681.method4032(local85, 0, arg3 - local74, local18);
				}
			} else {
				for (local74 = 0; local74 < arg0; local74++) {
					Static681.method4032(arg2[local74 + arg1], arg5, arg3, local18);
				}
			}
		} else if (arg0 > 0 && arg3 > 0) {
			local74 = arg3 / 2;
			local76 = arg0 / 2;
			@Pc(155) int local155 = local74 >= local48 ? local48 : local74;
			@Pc(166) int local166 = local76 < local48 ? local76 : local48;
			@Pc(170) int local170 = local155 + arg5;
			@Pc(177) int local177 = arg3 - local155 * 2;
			for (@Pc(179) int local179 = 0; local179 < arg0; local179++) {
				@Pc(188) int[] local188 = arg2[local179 + arg1];
				@Pc(201) int local201;
				@Pc(206) int local206;
				@Pc(214) int local214;
				if (local166 > local179) {
					local201 = local18 * local179 / local166;
					if (this.anInt7682 == 0) {
						for (local206 = 0; local206 < local155; local206++) {
							local214 = local206 * local18 / local155;
							local188[arg5 + local206 & Static348.anInt5973] = local188[arg3 + arg5 - local206 - 1 & Static348.anInt5973] = local201 * local214 >> 12;
						}
					} else {
						for (local206 = 0; local206 < local155; local206++) {
							local214 = local206 * local18 / local155;
							local188[local206 + arg5 & Static348.anInt5973] = local188[Static348.anInt5973 & arg3 + arg5 - local206 - 1] = local214 < local201 ? local214 : local201;
						}
					}
					if (local177 + local170 > Static91.anInt1849) {
						local206 = Static91.anInt1849 - local170;
						Static681.method4032(local188, local170, local206, local201);
						Static681.method4032(local188, 0, local177 - local206, local201);
					} else {
						Static681.method4032(local188, local170, local177, local201);
					}
				} else {
					local201 = arg0 - local179 - 1;
					if (local201 < local166) {
						local206 = local201 * local18 / local166;
						@Pc(354) int local354;
						if (this.anInt7682 == 0) {
							for (local214 = 0; local214 < local155; local214++) {
								local354 = local18 * local214 / local155;
								local188[Static348.anInt5973 & arg5 + local214] = local188[Static348.anInt5973 & arg5 + arg3 - local214 - 1] = local206 * local354 >> 12;
							}
						} else {
							for (local214 = 0; local214 < local155; local214++) {
								local354 = local18 * local214 / local155;
								local188[Static348.anInt5973 & arg5 + local214] = local188[arg5 + arg3 - local214 - 1 & Static348.anInt5973] = local206 <= local354 ? local206 : local354;
							}
						}
						if (local177 + local170 <= Static91.anInt1849) {
							Static681.method4032(local188, local170, local177, local206);
						} else {
							local214 = Static91.anInt1849 - local170;
							Static681.method4032(local188, local170, local214, local206);
							Static681.method4032(local188, 0, local177 - local214, local206);
						}
					} else {
						for (local206 = 0; local206 < local155; local206++) {
							local188[arg5 + local206 & Static348.anInt5973] = local188[arg3 + arg5 - local206 - 1 & Static348.anInt5973] = local206 * local18 / local155;
						}
						if (local177 + local170 <= Static91.anInt1849) {
							Static681.method4032(local188, local170, local177, local18);
						} else {
							local214 = Static91.anInt1849 - local170;
							Static681.method4032(local188, local170, local214, local18);
							Static681.method4032(local188, 0, local177 - local214, local18);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
	@Override
	public void method8780() {
	}
}
