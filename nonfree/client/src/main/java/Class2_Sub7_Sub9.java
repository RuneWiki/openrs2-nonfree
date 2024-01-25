import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class2_Sub7_Sub9 extends Class2_Sub7 {

	@OriginalMember(owner = "client!fm", name = "R", descriptor = "I")
	private int anInt2604;

	@OriginalMember(owner = "client!fm", name = "L", descriptor = "I")
	private int anInt2598 = 409;

	@OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
	private int anInt2596 = 0;

	@OriginalMember(owner = "client!fm", name = "O", descriptor = "I")
	private int anInt2601 = 0;

	@OriginalMember(owner = "client!fm", name = "M", descriptor = "I")
	private int anInt2599 = 1024;

	@OriginalMember(owner = "client!fm", name = "T", descriptor = "I")
	private int anInt2606 = 1024;

	@OriginalMember(owner = "client!fm", name = "N", descriptor = "I")
	private int anInt2600 = 1024;

	@OriginalMember(owner = "client!fm", name = "V", descriptor = "I")
	private int anInt2608 = 2048;

	@OriginalMember(owner = "client!fm", name = "Q", descriptor = "I")
	private int anInt2603 = 1024;

	@OriginalMember(owner = "client!fm", name = "W", descriptor = "I")
	private int anInt2609 = 819;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
	@Override
	public void method7583() {
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt2601 = arg1.method5170();
		} else if (arg0 == 1) {
			this.anInt2606 = arg1.method5229();
		} else if (arg0 == 2) {
			this.anInt2608 = arg1.method5229();
		} else if (arg0 == 3) {
			this.anInt2598 = arg1.method5229();
		} else if (arg0 == 4) {
			this.anInt2609 = arg1.method5229();
		} else if (arg0 == 5) {
			this.anInt2600 = arg1.method5229();
		} else if (arg0 == 6) {
			this.anInt2596 = arg1.method5170();
		} else if (arg0 == 7) {
			this.anInt2603 = arg1.method5229();
		} else if (arg0 == 8) {
			this.anInt2599 = arg1.method5229();
		}
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass221_41.method5903(arg0);
		if (!super.aClass221_41.aBoolean523) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass221_41.method5900();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = this.anInt2606 * Static352.anInt6485 >> 12;
		@Pc(52) int local52 = this.anInt2608 * Static352.anInt6485 >> 12;
		@Pc(59) int local59 = Static79.anInt1658 * this.anInt2598 >> 12;
		@Pc(66) int local66 = Static79.anInt1658 * this.anInt2609 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt2604 = Static352.anInt6485 / 8 * this.anInt2600 >> 12;
		@Pc(91) int local91 = Static352.anInt6485 / local45 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt2601);
		while (true) {
			while (true) {
				@Pc(116) int local116 = local45 + Static202.method3259(local52 - local45, local106);
				@Pc(126) int local126 = Static202.method3259(local66 - local59, local106) + local59;
				@Pc(130) int local130 = local116 + local28;
				if (Static352.anInt6485 < local130) {
					local116 = Static352.anInt6485 - local28;
					local130 = Static352.anInt6485;
				}
				@Pc(144) int local144;
				@Pc(154) int local154;
				if (local34) {
					local144 = 0;
				} else {
					@Pc(148) int local148 = local30;
					@Pc(152) int[] local152 = local99[local30];
					local154 = 0;
					@Pc(158) int local158 = local130 + local22;
					if (local158 < 0) {
						local158 += Static352.anInt6485;
					}
					if (Static352.anInt6485 < local158) {
						local158 -= Static352.anInt6485;
					}
					local144 = local152[2];
					while (true) {
						@Pc(182) int[] local182 = local99[local148];
						if (local158 >= local182[0] && local182[1] >= local158) {
							if (local148 != local30) {
								@Pc(216) int local216 = local22 + local28;
								if (local216 < 0) {
									local216 += Static352.anInt6485;
								}
								if (Static352.anInt6485 < local216) {
									local216 -= Static352.anInt6485;
								}
								for (@Pc(231) int local231 = 1; local231 <= local154; local231++) {
									@Pc(241) int[] local241 = local99[(local231 + local30) % local36];
									local144 = Math.max(local144, local241[2]);
								}
								for (@Pc(257) int local257 = 0; local257 <= local154; local257++) {
									@Pc(268) int[] local268 = local99[(local30 + local257) % local36];
									@Pc(272) int local272 = local268[2];
									if (local144 != local272) {
										@Pc(279) int local279 = local268[0];
										@Pc(283) int local283 = local268[1];
										@Pc(290) int local290;
										@Pc(294) int local294;
										if (local158 > local216) {
											local290 = Math.max(local216, local279);
											local294 = Math.min(local158, local283);
										} else if (local279 == 0) {
											local290 = 0;
											local294 = Math.min(local158, local283);
										} else {
											local290 = Math.max(local216, local279);
											local294 = Static352.anInt6485;
										}
										this.method2467(local26 + local290, -local272 + local144, local20, local272, local106, local294 - local290);
									}
								}
							}
							local30 = local148;
							break;
						}
						local154++;
						@Pc(200) int local200 = ~local36;
						local148++;
						if (local200 >= ~local148) {
							local148 = 0;
						}
					}
				}
				if (local126 + local144 <= Static79.anInt1658) {
					local32 = false;
				} else {
					local126 = Static79.anInt1658 - local144;
				}
				@Pc(356) int[] local356;
				if (local130 == Static352.anInt6485) {
					this.method2467(local28 + local24, local126, local20, local144, local106, local116);
					if (local32) {
						return local11;
					}
					local32 = true;
					local356 = local95[local38++];
					local356[2] = local144 + local126;
					local356[0] = local28;
					local356[1] = local130;
					@Pc(421) int[][] local421 = local99;
					local99 = local95;
					local36 = local38;
					local95 = local421;
					local26 = local24;
					local38 = 0;
					local24 = Static202.method3259(Static352.anInt6485, local106);
					local22 = local24 - local26;
					local28 = 0;
					local154 = local22;
					if (local22 < 0) {
						local154 = local22 + Static352.anInt6485;
					}
					local30 = 0;
					if (Static352.anInt6485 < local154) {
						local154 -= Static352.anInt6485;
					}
					local34 = false;
					while (true) {
						@Pc(465) int[] local465 = local99[local30];
						if (local465[0] <= local154 && local154 <= local465[1]) {
							break;
						}
						local30++;
						if (local36 <= local30) {
							local30 = 0;
						}
					}
				} else {
					local356 = local95[local38++];
					local356[2] = local126 + local144;
					local356[0] = local28;
					local356[1] = local130;
					this.method2467(local28 + local24, local126, local20, local144, local106, local116);
					local28 = local130;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(III[[IILjava/util/Random;I)V")
	private void method2467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = this.anInt2599 > 0 ? 4096 - Static202.method3259(this.anInt2599, arg4) : 4096;
		@Pc(27) int local27 = this.anInt2603 * this.anInt2604 >> 12;
		@Pc(40) int local40 = this.anInt2604 - (local27 > 0 ? Static202.method3259(local27, arg4) : 0);
		if (Static352.anInt6485 <= arg0) {
			arg0 -= Static352.anInt6485;
		}
		@Pc(61) int local61;
		@Pc(63) int local63;
		if (local40 <= 0) {
			if (Static352.anInt6485 < arg5 + arg0) {
				local61 = Static352.anInt6485 - arg0;
				for (local63 = 0; local63 < arg1; local63++) {
					@Pc(71) int[] local71 = arg2[local63 + arg3];
					Static553.method3371(local71, arg0, local61, local19);
					Static553.method3371(local71, 0, arg5 - local61, local19);
				}
			} else {
				for (local61 = 0; local61 < arg1; local61++) {
					Static553.method3371(arg2[local61 + arg3], arg0, arg5, local19);
				}
			}
		} else if (arg1 > 0 && arg5 > 0) {
			local61 = arg5 / 2;
			local63 = arg1 / 2;
			@Pc(138) int local138 = local40 <= local61 ? local40 : local61;
			@Pc(145) int local145 = local63 >= local40 ? local40 : local63;
			@Pc(149) int local149 = local138 + arg0;
			@Pc(156) int local156 = arg5 - local138 * 2;
			for (@Pc(158) int local158 = 0; local158 < arg1; local158++) {
				@Pc(166) int[] local166 = arg2[arg3 + local158];
				@Pc(175) int local175;
				@Pc(183) int local183;
				@Pc(191) int local191;
				if (local145 > local158) {
					local175 = local158 * local19 / local145;
					if (this.anInt2596 == 0) {
						for (local183 = 0; local183 < local138; local183++) {
							local191 = local19 * local183 / local138;
							local166[Static38.anInt733 & local183 + arg0] = local166[arg5 + arg0 - local183 - 1 & Static38.anInt733] = local191 * local175 >> 12;
						}
					} else {
						for (local183 = 0; local183 < local138; local183++) {
							local191 = local19 * local183 / local138;
							local166[Static38.anInt733 & local183 + arg0] = local166[arg0 + arg5 - local183 - 1 & Static38.anInt733] = local175 > local191 ? local191 : local175;
						}
					}
					if (Static352.anInt6485 < local156 + local149) {
						local183 = Static352.anInt6485 - local149;
						Static553.method3371(local166, local149, local183, local175);
						Static553.method3371(local166, 0, local156 - local183, local175);
					} else {
						Static553.method3371(local166, local149, local156, local175);
					}
				} else {
					local175 = arg1 - local158 - 1;
					if (local175 < local145) {
						local183 = local19 * local175 / local145;
						@Pc(324) int local324;
						if (this.anInt2596 == 0) {
							for (local191 = 0; local191 < local138; local191++) {
								local324 = local19 * local191 / local138;
								local166[arg0 + local191 & Static38.anInt733] = local166[Static38.anInt733 & arg5 + arg0 - local191 - 1] = local183 * local324 >> 12;
							}
						} else {
							for (local191 = 0; local191 < local138; local191++) {
								local324 = local19 * local191 / local138;
								local166[Static38.anInt733 & arg0 + local191] = local166[arg5 + arg0 - local191 - 1 & Static38.anInt733] = local183 <= local324 ? local183 : local324;
							}
						}
						if (Static352.anInt6485 >= local149 + local156) {
							Static553.method3371(local166, local149, local156, local183);
						} else {
							local191 = Static352.anInt6485 - local149;
							Static553.method3371(local166, local149, local191, local183);
							Static553.method3371(local166, 0, local156 - local191, local183);
						}
					} else {
						for (local183 = 0; local183 < local138; local183++) {
							local166[Static38.anInt733 & local183 + arg0] = local166[arg0 + arg5 - local183 - 1 & Static38.anInt733] = local19 * local183 / local138;
						}
						if (Static352.anInt6485 >= local156 + local149) {
							Static553.method3371(local166, local149, local156, local19);
						} else {
							local191 = Static352.anInt6485 - local149;
							Static553.method3371(local166, local149, local191, local19);
							Static553.method3371(local166, 0, local156 - local191, local19);
						}
					}
				}
			}
		}
	}
}
