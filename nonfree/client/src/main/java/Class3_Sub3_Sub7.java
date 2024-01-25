import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class3_Sub3_Sub7 extends Class3_Sub3 {

	@OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
	private int anInt1554;

	@OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
	private int anInt1556 = 0;

	@OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
	private int anInt1555 = 819;

	@OriginalMember(owner = "client!eh", name = "O", descriptor = "I")
	private int anInt1559 = 2048;

	@OriginalMember(owner = "client!eh", name = "H", descriptor = "I")
	private int anInt1552 = 0;

	@OriginalMember(owner = "client!eh", name = "V", descriptor = "I")
	private int anInt1565 = 1024;

	@OriginalMember(owner = "client!eh", name = "W", descriptor = "I")
	private int anInt1566 = 409;

	@OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
	private int anInt1561 = 1024;

	@OriginalMember(owner = "client!eh", name = "Y", descriptor = "I")
	private int anInt1568 = 1024;

	@OriginalMember(owner = "client!eh", name = "Z", descriptor = "I")
	private int anInt1569 = 1024;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1556 = arg0.method3643();
		} else if (arg1 == 1) {
			this.anInt1565 = arg0.method3649();
		} else if (arg1 == 2) {
			this.anInt1559 = arg0.method3649();
		} else if (arg1 == 3) {
			this.anInt1566 = arg0.method3649();
		} else if (arg1 == 4) {
			this.anInt1555 = arg0.method3649();
		} else if (arg1 == 5) {
			this.anInt1568 = arg0.method3649();
		} else if (arg1 == 6) {
			this.anInt1552 = arg0.method3643();
		} else if (arg1 == 7) {
			this.anInt1569 = arg0.method3649();
		} else if (arg1 == 8) {
			this.anInt1561 = arg0.method3649();
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass217_41.method5701(arg0);
		if (!super.aClass217_41.aBoolean451) {
			return local16;
		}
		@Pc(25) int[][] local25 = super.aClass217_41.method5706();
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) boolean local37 = true;
		@Pc(39) boolean local39 = true;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50 = Static131.anInt2755 * this.anInt1565 >> 12;
		@Pc(57) int local57 = Static131.anInt2755 * this.anInt1559 >> 12;
		@Pc(64) int local64 = this.anInt1566 * Static182.anInt3888 >> 12;
		@Pc(71) int local71 = Static182.anInt3888 * this.anInt1555 >> 12;
		if (local71 <= 1) {
			return local25[arg0];
		}
		this.anInt1554 = this.anInt1568 * (Static131.anInt2755 / 8) >> 12;
		@Pc(96) int local96 = Static131.anInt2755 / local50 + 1;
		@Pc(100) int[][] local100 = new int[local96][3];
		@Pc(104) int[][] local104 = new int[local96][3];
		@Pc(111) Random local111 = new Random((long) this.anInt1556);
		while (true) {
			while (true) {
				@Pc(121) int local121 = Static54.method915(local57 - local50, local111) + local50;
				@Pc(133) int local133 = Static54.method915(local71 - local64, local111) + local64;
				@Pc(137) int local137 = local121 + local33;
				if (local137 > Static131.anInt2755) {
					local121 = Static131.anInt2755 - local33;
					local137 = Static131.anInt2755;
				}
				@Pc(155) int local155;
				@Pc(165) int local165;
				if (local39) {
					local155 = 0;
				} else {
					@Pc(159) int local159 = local35;
					@Pc(163) int[] local163 = local104[local35];
					local165 = 0;
					@Pc(170) int local170 = local137 + local27;
					if (local170 < 0) {
						local170 += Static131.anInt2755;
					}
					if (Static131.anInt2755 < local170) {
						local170 -= Static131.anInt2755;
					}
					local155 = local163[2];
					while (true) {
						@Pc(191) int[] local191 = local104[local159];
						if (local170 >= local191[0] && local170 <= local191[1]) {
							if (local35 != local159) {
								@Pc(221) int local221 = local33 + local27;
								if (local221 < 0) {
									local221 += Static131.anInt2755;
								}
								if (Static131.anInt2755 < local221) {
									local221 -= Static131.anInt2755;
								}
								for (@Pc(239) int local239 = 1; local239 <= local165; local239++) {
									@Pc(249) int[] local249 = local104[(local35 + local239) % local41];
									local155 = Math.max(local155, local249[2]);
								}
								for (@Pc(265) int local265 = 0; local265 <= local165; local265++) {
									@Pc(275) int[] local275 = local104[(local265 + local35) % local41];
									@Pc(279) int local279 = local275[2];
									if (local279 != local155) {
										@Pc(290) int local290 = local275[0];
										@Pc(294) int local294 = local275[1];
										@Pc(306) int local306;
										@Pc(308) int local308;
										if (local170 > local221) {
											local306 = Math.max(local221, local290);
											local308 = Math.min(local170, local294);
										} else if (local290 == 0) {
											local306 = 0;
											local308 = Math.min(local170, local294);
										} else {
											local306 = Math.max(local221, local290);
											local308 = Static131.anInt2755;
										}
										this.method1188(local308 - local306, local155 + -local279, local306 + local31, local25, local111, local279);
									}
								}
							}
							local35 = local159;
							break;
						}
						local159++;
						if (local41 <= local159) {
							local159 = 0;
						}
						local165++;
					}
				}
				if (local133 + local155 <= Static182.anInt3888) {
					local37 = false;
				} else {
					local133 = Static182.anInt3888 - local155;
				}
				@Pc(375) int[] local375;
				if (Static131.anInt2755 == local137) {
					this.method1188(local121, local133, local29 + local33, local25, local111, local155);
					if (local37) {
						return local16;
					}
					local37 = true;
					local375 = local100[local43++];
					local375[2] = local155 + local133;
					local375[0] = local33;
					local375[1] = local137;
					@Pc(442) int[][] local442 = local104;
					local104 = local100;
					local100 = local442;
					local41 = local43;
					local43 = 0;
					local31 = local29;
					local29 = Static54.method915(Static131.anInt2755, local111);
					local33 = 0;
					local27 = local29 - local31;
					local165 = local27;
					if (local27 < 0) {
						local165 = local27 + Static131.anInt2755;
					}
					if (Static131.anInt2755 < local165) {
						local165 -= Static131.anInt2755;
					}
					local35 = 0;
					local39 = false;
					while (true) {
						@Pc(487) int[] local487 = local104[local35];
						if (local165 >= local487[0] && local165 <= local487[1]) {
							break;
						}
						local35++;
						if (local41 <= local35) {
							local35 = 0;
						}
					}
				} else {
					local375 = local100[local43++];
					local375[1] = local137;
					local375[2] = local155 + local133;
					local375[0] = local33;
					this.method1188(local121, local133, local29 + local33, local25, local111, local155);
					local33 = local137;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
	@Override
	public void method5730() {
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III[[ILjava/util/Random;II)V")
	private void method1188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) Random arg4, @OriginalArg(5) int arg5) {
		@Pc(19) int local19 = this.anInt1561 > 0 ? 4096 - Static54.method915(this.anInt1561, arg4) : 4096;
		@Pc(27) int local27 = this.anInt1554 * this.anInt1569 >> 12;
		@Pc(43) int local43 = this.anInt1554 - (local27 > 0 ? Static54.method915(local27, arg4) : 0);
		if (arg2 >= Static131.anInt2755) {
			arg2 -= Static131.anInt2755;
		}
		@Pc(75) int local75;
		@Pc(79) int local79;
		if (local43 > 0) {
			if (arg1 > 0 && arg0 > 0) {
				local75 = arg0 / 2;
				local79 = arg1 / 2;
				@Pc(86) int local86 = local43 <= local75 ? local43 : local75;
				@Pc(97) int local97 = local43 <= local79 ? local43 : local79;
				@Pc(101) int local101 = arg2 + local86;
				@Pc(108) int local108 = arg0 - local86 * 2;
				for (@Pc(110) int local110 = 0; local110 < arg1; local110++) {
					@Pc(118) int[] local118 = arg3[arg5 + local110];
					@Pc(127) int local127;
					@Pc(135) int local135;
					@Pc(143) int local143;
					if (local97 > local110) {
						local127 = local19 * local110 / local97;
						if (this.anInt1552 == 0) {
							for (local135 = 0; local135 < local86; local135++) {
								local143 = local135 * local19 / local86;
								local118[Static167.anInt3460 & arg2 + local135] = local118[Static167.anInt3460 & arg2 + arg0 - local135 - 1] = local127 * local143 >> 12;
							}
						} else {
							for (local135 = 0; local135 < local86; local135++) {
								local143 = local135 * local19 / local86;
								local118[Static167.anInt3460 & local135 + arg2] = local118[arg2 + arg0 - local135 - 1 & Static167.anInt3460] = local127 > local143 ? local143 : local127;
							}
						}
						if (local108 + local101 > Static131.anInt2755) {
							local135 = Static131.anInt2755 - local101;
							Static367.method4031(local118, local101, local135, local127);
							Static367.method4031(local118, 0, local108 - local135, local127);
						} else {
							Static367.method4031(local118, local101, local108, local127);
						}
					} else {
						local127 = arg1 - local110 - 1;
						if (local97 > local127) {
							local135 = local19 * local127 / local97;
							@Pc(282) int local282;
							if (this.anInt1552 == 0) {
								for (local143 = 0; local143 < local86; local143++) {
									local282 = local19 * local143 / local86;
									local118[Static167.anInt3460 & local143 + arg2] = local118[Static167.anInt3460 & arg2 + arg0 - local143 - 1] = local282 * local135 >> 12;
								}
							} else {
								for (local143 = 0; local143 < local86; local143++) {
									local282 = local143 * local19 / local86;
									local118[Static167.anInt3460 & arg2 + local143] = local118[arg2 + arg0 - local143 - 1 & Static167.anInt3460] = local282 >= local135 ? local135 : local282;
								}
							}
							if (Static131.anInt2755 < local101 + local108) {
								local143 = Static131.anInt2755 - local101;
								Static367.method4031(local118, local101, local143, local135);
								Static367.method4031(local118, 0, local108 - local143, local135);
							} else {
								Static367.method4031(local118, local101, local108, local135);
							}
						} else {
							for (local135 = 0; local135 < local86; local135++) {
								local118[arg2 + local135 & Static167.anInt3460] = local118[Static167.anInt3460 & arg2 + arg0 - local135 - 1] = local135 * local19 / local86;
							}
							if (local101 + local108 > Static131.anInt2755) {
								local143 = Static131.anInt2755 - local101;
								Static367.method4031(local118, local101, local143, local19);
								Static367.method4031(local118, 0, local108 - local143, local19);
							} else {
								Static367.method4031(local118, local101, local108, local19);
							}
						}
					}
				}
			}
		} else if (arg2 + arg0 > Static131.anInt2755) {
			local75 = Static131.anInt2755 - arg2;
			for (local79 = 0; local79 < arg1; local79++) {
				@Pc(497) int[] local497 = arg3[local79 + arg5];
				Static367.method4031(local497, arg2, local75, local19);
				Static367.method4031(local497, 0, arg0 - local75, local19);
			}
		} else {
			for (local75 = 0; local75 < arg1; local75++) {
				Static367.method4031(arg3[local75 + arg5], arg2, arg0, local19);
			}
		}
	}
}
