import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class4_Sub4_Sub36 extends Class4_Sub4 {

	@OriginalMember(owner = "client!wm", name = "M", descriptor = "I")
	private int anInt7503;

	@OriginalMember(owner = "client!wm", name = "E", descriptor = "I")
	private int anInt7496 = 409;

	@OriginalMember(owner = "client!wm", name = "H", descriptor = "I")
	private int anInt7498 = 2048;

	@OriginalMember(owner = "client!wm", name = "D", descriptor = "I")
	private int anInt7495 = 1024;

	@OriginalMember(owner = "client!wm", name = "L", descriptor = "I")
	private int anInt7502 = 1024;

	@OriginalMember(owner = "client!wm", name = "O", descriptor = "I")
	private int anInt7504 = 0;

	@OriginalMember(owner = "client!wm", name = "P", descriptor = "I")
	private int anInt7505 = 0;

	@OriginalMember(owner = "client!wm", name = "K", descriptor = "I")
	private int anInt7501 = 1024;

	@OriginalMember(owner = "client!wm", name = "T", descriptor = "I")
	private int anInt7509 = 819;

	@OriginalMember(owner = "client!wm", name = "V", descriptor = "I")
	private int anInt7511 = 1024;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BILclient!fh;)V")
	@Override
	public void method6046(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt7505 = arg1.method5007();
		} else if (arg0 == 1) {
			this.anInt7502 = arg1.method5028();
		} else if (arg0 == 2) {
			this.anInt7498 = arg1.method5028();
		} else if (arg0 == 3) {
			this.anInt7496 = arg1.method5028();
		} else if (arg0 == 4) {
			this.anInt7509 = arg1.method5028();
		} else if (arg0 == 5) {
			this.anInt7511 = arg1.method5028();
		} else if (arg0 == 6) {
			this.anInt7504 = arg1.method5007();
		} else if (arg0 == 7) {
			this.anInt7501 = arg1.method5028();
		} else if (arg0 == 8) {
			this.anInt7495 = arg1.method5028();
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass103_41.method1977(arg0);
		if (!super.aClass103_41.aBoolean164) {
			return local18;
		}
		@Pc(27) int[][] local27 = super.aClass103_41.method1978();
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(39) boolean local39 = true;
		@Pc(41) boolean local41 = true;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(52) int local52 = Static419.anInt6404 * this.anInt7502 >> 12;
		@Pc(59) int local59 = this.anInt7498 * Static419.anInt6404 >> 12;
		@Pc(66) int local66 = Static91.anInt1740 * this.anInt7496 >> 12;
		@Pc(73) int local73 = Static91.anInt1740 * this.anInt7509 >> 12;
		if (local73 <= 1) {
			return local27[arg0];
		}
		this.anInt7503 = this.anInt7511 * (Static419.anInt6404 / 8) >> 12;
		@Pc(97) int local97 = Static419.anInt6404 / local52 + 1;
		@Pc(101) int[][] local101 = new int[local97][3];
		@Pc(105) int[][] local105 = new int[local97][3];
		@Pc(112) Random local112 = new Random((long) this.anInt7505);
		while (true) {
			while (true) {
				@Pc(123) int local123 = local52 + Static425.method5717(local112, local59 - local52);
				@Pc(133) int local133 = Static425.method5717(local112, local73 - local66) + local66;
				@Pc(137) int local137 = local123 + local35;
				if (Static419.anInt6404 < local137) {
					local137 = Static419.anInt6404;
					local123 = Static419.anInt6404 - local35;
				}
				@Pc(151) int local151;
				@Pc(161) int local161;
				if (local41) {
					local151 = 0;
				} else {
					@Pc(155) int local155 = local37;
					@Pc(159) int[] local159 = local105[local37];
					local161 = 0;
					@Pc(165) int local165 = local29 + local137;
					if (local165 < 0) {
						local165 += Static419.anInt6404;
					}
					if (Static419.anInt6404 < local165) {
						local165 -= Static419.anInt6404;
					}
					while (true) {
						@Pc(182) int[] local182 = local105[local155];
						if (local165 >= local182[0] && local182[1] >= local165) {
							local151 = local159[2];
							if (local155 != local37) {
								@Pc(220) int local220 = local35 + local29;
								if (local220 < 0) {
									local220 += Static419.anInt6404;
								}
								if (Static419.anInt6404 < local220) {
									local220 -= Static419.anInt6404;
								}
								for (@Pc(238) int local238 = 1; local238 <= local161; local238++) {
									@Pc(248) int[] local248 = local105[(local37 + local238) % local43];
									local151 = Math.max(local151, local248[2]);
								}
								for (@Pc(260) int local260 = 0; local260 <= local161; local260++) {
									@Pc(271) int[] local271 = local105[(local37 + local260) % local43];
									@Pc(275) int local275 = local271[2];
									if (local275 != local151) {
										@Pc(286) int local286 = local271[0];
										@Pc(290) int local290 = local271[1];
										@Pc(308) int local308;
										@Pc(306) int local306;
										if (local220 < local165) {
											local308 = Math.max(local220, local286);
											local306 = Math.min(local165, local290);
										} else if (local286 == 0) {
											local306 = Math.min(local165, local290);
											local308 = 0;
										} else {
											local308 = Math.max(local220, local286);
											local306 = Static419.anInt6404;
										}
										this.method5956(local275, local151 - local275, local27, local306 - local308, local308 + local33, local112);
									}
								}
							}
							local37 = local155;
							break;
						}
						local155++;
						if (local43 <= local155) {
							local155 = 0;
						}
						local161++;
					}
				}
				if (local133 + local151 <= Static91.anInt1740) {
					local39 = false;
				} else {
					local133 = Static91.anInt1740 - local151;
				}
				@Pc(395) int[] local395;
				if (Static419.anInt6404 == local137) {
					this.method5956(local151, local133, local27, local123, local35 + local31, local112);
					if (local39) {
						return local18;
					}
					local39 = true;
					local395 = local101[local45++];
					local395[2] = local133 + local151;
					local395[0] = local35;
					local395[1] = local137;
					@Pc(411) int[][] local411 = local105;
					local105 = local101;
					local101 = local411;
					local43 = local45;
					local45 = 0;
					local33 = local31;
					local31 = Static425.method5717(local112, Static419.anInt6404);
					local35 = 0;
					local29 = local31 - local33;
					local161 = local29;
					if (local29 < 0) {
						local161 = local29 + Static419.anInt6404;
					}
					if (Static419.anInt6404 < local161) {
						local161 -= Static419.anInt6404;
					}
					local37 = 0;
					while (true) {
						@Pc(461) int[] local461 = local105[local37];
						if (local161 >= local461[0] && local161 <= local461[1]) {
							local41 = false;
							break;
						}
						local37++;
						if (local37 >= local43) {
							local37 = 0;
						}
					}
				} else {
					local395 = local101[local45++];
					local395[2] = local133 + local151;
					local395[1] = local137;
					local395[0] = local35;
					this.method5956(local151, local133, local27, local123, local31 + local35, local112);
					local35 = local137;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(Z)V")
	@Override
	public void method6038() {
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II[[IIIILjava/util/Random;)V")
	private void method5956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Random arg5) {
		@Pc(33) int local33 = this.anInt7495 > 0 ? 4096 - Static425.method5717(arg5, this.anInt7495) : 4096;
		@Pc(41) int local41 = this.anInt7503 * this.anInt7501 >> 12;
		@Pc(56) int local56 = this.anInt7503 - (local41 > 0 ? Static425.method5717(arg5, local41) : 0);
		if (arg4 >= Static419.anInt6404) {
			arg4 -= Static419.anInt6404;
		}
		@Pc(75) int local75;
		@Pc(102) int local102;
		if (local56 <= 0) {
			if (arg3 + arg4 <= Static419.anInt6404) {
				for (local75 = 0; local75 < arg1; local75++) {
					Static461.method1986(arg2[arg0 + local75], arg4, arg3, local33);
				}
			} else {
				local75 = Static419.anInt6404 - arg4;
				for (local102 = 0; local102 < arg1; local102++) {
					@Pc(110) int[] local110 = arg2[local102 + arg0];
					Static461.method1986(local110, arg4, local75, local33);
					Static461.method1986(local110, 0, arg3 - local75, local33);
				}
			}
		} else if (arg1 > 0 && arg3 > 0) {
			local75 = arg3 / 2;
			local102 = arg1 / 2;
			@Pc(151) int local151 = local56 <= local75 ? local56 : local75;
			@Pc(158) int local158 = local56 <= local102 ? local56 : local102;
			@Pc(163) int local163 = arg4 + local151;
			@Pc(170) int local170 = arg3 - local151 * 2;
			for (@Pc(172) int local172 = 0; local172 < arg1; local172++) {
				@Pc(180) int[] local180 = arg2[arg0 + local172];
				@Pc(193) int local193;
				@Pc(198) int local198;
				@Pc(206) int local206;
				if (local158 > local172) {
					local193 = local172 * local33 / local158;
					if (this.anInt7504 == 0) {
						for (local198 = 0; local198 < local151; local198++) {
							local206 = local33 * local198 / local151;
							local180[arg4 + local198 & Static211.anInt3669] = local180[Static211.anInt3669 & arg4 + arg3 - local198 - 1] = local206 * local193 >> 12;
						}
					} else {
						for (local198 = 0; local198 < local151; local198++) {
							local206 = local198 * local33 / local151;
							local180[local198 + arg4 & Static211.anInt3669] = local180[arg4 + arg3 - local198 - 1 & Static211.anInt3669] = local193 <= local206 ? local193 : local206;
						}
					}
					if (Static419.anInt6404 < local163 + local170) {
						local198 = Static419.anInt6404 - local163;
						Static461.method1986(local180, local163, local198, local193);
						Static461.method1986(local180, 0, local170 - local198, local193);
					} else {
						Static461.method1986(local180, local163, local170, local193);
					}
				} else {
					local193 = arg1 - local172 - 1;
					if (local158 > local193) {
						local198 = local193 * local33 / local158;
						@Pc(350) int local350;
						if (this.anInt7504 == 0) {
							for (local206 = 0; local206 < local151; local206++) {
								local350 = local33 * local206 / local151;
								local180[local206 + arg4 & Static211.anInt3669] = local180[Static211.anInt3669 & arg3 + arg4 - local206 - 1] = local198 * local350 >> 12;
							}
						} else {
							for (local206 = 0; local206 < local151; local206++) {
								local350 = local206 * local33 / local151;
								local180[Static211.anInt3669 & local206 + arg4] = local180[Static211.anInt3669 & arg4 + arg3 - local206 - 1] = local350 >= local198 ? local198 : local350;
							}
						}
						if (Static419.anInt6404 >= local163 + local170) {
							Static461.method1986(local180, local163, local170, local198);
						} else {
							local206 = Static419.anInt6404 - local163;
							Static461.method1986(local180, local163, local206, local198);
							Static461.method1986(local180, 0, local170 - local206, local198);
						}
					} else {
						for (local198 = 0; local198 < local151; local198++) {
							local180[arg4 + local198 & Static211.anInt3669] = local180[arg4 + arg3 - local198 - 1 & Static211.anInt3669] = local198 * local33 / local151;
						}
						if (Static419.anInt6404 < local170 + local163) {
							local206 = Static419.anInt6404 - local163;
							Static461.method1986(local180, local163, local206, local33);
							Static461.method1986(local180, 0, local170 - local206, local33);
						} else {
							Static461.method1986(local180, local163, local170, local33);
						}
					}
				}
			}
		}
	}
}
