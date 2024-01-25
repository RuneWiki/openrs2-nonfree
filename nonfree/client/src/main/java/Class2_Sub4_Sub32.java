import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class2_Sub4_Sub32 extends Class2_Sub4 {

	@OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
	private int anInt5578;

	@OriginalMember(owner = "client!td", name = "O", descriptor = "I")
	private int anInt5576 = 0;

	@OriginalMember(owner = "client!td", name = "R", descriptor = "I")
	private int anInt5579 = 819;

	@OriginalMember(owner = "client!td", name = "X", descriptor = "I")
	private int anInt5585 = 2048;

	@OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
	private int anInt5586 = 1024;

	@OriginalMember(owner = "client!td", name = "ab", descriptor = "I")
	private int anInt5588 = 0;

	@OriginalMember(owner = "client!td", name = "T", descriptor = "I")
	private int anInt5581 = 409;

	@OriginalMember(owner = "client!td", name = "S", descriptor = "I")
	private int anInt5580 = 1024;

	@OriginalMember(owner = "client!td", name = "cb", descriptor = "I")
	private int anInt5590 = 1024;

	@OriginalMember(owner = "client!td", name = "bb", descriptor = "I")
	private int anInt5589 = 1024;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V")
	@Override
	public void method5596() {
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass237_41.method5430(arg0);
		if (!super.aClass237_41.aBoolean441) {
			return local11;
		}
		@Pc(20) int[][] local20 = super.aClass237_41.method5429();
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) boolean local32 = true;
		@Pc(34) boolean local34 = true;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(45) int local45 = Static76.anInt1458 * this.anInt5586 >> 12;
		@Pc(52) int local52 = Static76.anInt1458 * this.anInt5585 >> 12;
		@Pc(59) int local59 = this.anInt5581 * Static193.anInt3629 >> 12;
		@Pc(66) int local66 = Static193.anInt3629 * this.anInt5579 >> 12;
		if (local66 <= 1) {
			return local20[arg0];
		}
		this.anInt5578 = Static76.anInt1458 / 8 * this.anInt5590 >> 12;
		@Pc(91) int local91 = Static76.anInt1458 / local45 + 1;
		@Pc(95) int[][] local95 = new int[local91][3];
		@Pc(99) int[][] local99 = new int[local91][3];
		@Pc(106) Random local106 = new Random((long) this.anInt5576);
		while (true) {
			while (true) {
				@Pc(116) int local116 = Static331.method4885(local106, local52 - local45) + local45;
				@Pc(125) int local125 = Static331.method4885(local106, local66 - local59) + local59;
				@Pc(129) int local129 = local116 + local28;
				if (Static76.anInt1458 < local129) {
					local116 = Static76.anInt1458 - local28;
					local129 = Static76.anInt1458;
				}
				@Pc(146) int local146;
				@Pc(156) int local156;
				if (local34) {
					local146 = 0;
				} else {
					@Pc(150) int local150 = local30;
					@Pc(154) int[] local154 = local99[local30];
					local156 = 0;
					@Pc(160) int local160 = local22 + local129;
					if (local160 < 0) {
						local160 += Static76.anInt1458;
					}
					if (Static76.anInt1458 < local160) {
						local160 -= Static76.anInt1458;
					}
					local146 = local154[2];
					while (true) {
						@Pc(181) int[] local181 = local99[local150];
						if (local160 >= local181[0] && local160 <= local181[1]) {
							if (local30 != local150) {
								@Pc(215) int local215 = local28 + local22;
								if (local215 < 0) {
									local215 += Static76.anInt1458;
								}
								if (Static76.anInt1458 < local215) {
									local215 -= Static76.anInt1458;
								}
								for (@Pc(230) int local230 = 1; local230 <= local156; local230++) {
									@Pc(240) int[] local240 = local99[(local230 + local30) % local36];
									local146 = Math.max(local146, local240[2]);
								}
								for (@Pc(256) int local256 = 0; local256 <= local156; local256++) {
									@Pc(266) int[] local266 = local99[(local256 + local30) % local36];
									@Pc(270) int local270 = local266[2];
									if (local146 != local270) {
										@Pc(281) int local281 = local266[0];
										@Pc(285) int local285 = local266[1];
										@Pc(292) int local292;
										@Pc(296) int local296;
										if (local215 < local160) {
											local292 = Math.max(local215, local281);
											local296 = Math.min(local160, local285);
										} else if (local281 == 0) {
											local292 = 0;
											local296 = Math.min(local160, local285);
										} else {
											local292 = Math.max(local215, local281);
											local296 = Static76.anInt1458;
										}
										this.method4823(local26 + local292, local146 - local270, local270, local296 - local292, local106, local20);
									}
								}
							}
							local30 = local150;
							break;
						}
						local156++;
						local150++;
						if (local36 <= local150) {
							local150 = 0;
						}
					}
				}
				if (Static193.anInt3629 < local125 + local146) {
					local125 = Static193.anInt3629 - local146;
				} else {
					local32 = false;
				}
				@Pc(377) int[] local377;
				if (local129 == Static76.anInt1458) {
					this.method4823(local24 + local28, local125, local146, local116, local106, local20);
					if (local32) {
						return local11;
					}
					local32 = true;
					local377 = local95[local38++];
					local377[1] = local129;
					local377[2] = local146 + local125;
					local377[0] = local28;
					@Pc(393) int[][] local393 = local99;
					local99 = local95;
					local36 = local38;
					local95 = local393;
					local38 = 0;
					local26 = local24;
					local24 = Static331.method4885(local106, Static76.anInt1458);
					local22 = local24 - local26;
					local28 = 0;
					local156 = local22;
					if (local22 < 0) {
						local156 = local22 + Static76.anInt1458;
					}
					local30 = 0;
					if (Static76.anInt1458 < local156) {
						local156 -= Static76.anInt1458;
					}
					local34 = false;
					while (true) {
						@Pc(437) int[] local437 = local99[local30];
						if (local437[0] <= local156 && local437[1] >= local156) {
							break;
						}
						local30++;
						if (local30 >= local36) {
							local30 = 0;
						}
					}
				} else {
					local377 = local95[local38++];
					local377[2] = local146 + local125;
					local377[0] = local28;
					local377[1] = local129;
					this.method4823(local28 + local24, local125, local146, local116, local106, local20);
					local28 = local129;
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BLclient!kk;I)V")
	@Override
	public void method5601(@OriginalArg(1) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5576 = arg0.method5350();
		} else if (arg1 == 1) {
			this.anInt5586 = arg0.method5312();
		} else if (arg1 == 2) {
			this.anInt5585 = arg0.method5312();
		} else if (arg1 == 3) {
			this.anInt5581 = arg0.method5312();
		} else if (arg1 == 4) {
			this.anInt5579 = arg0.method5312();
		} else if (arg1 == 5) {
			this.anInt5590 = arg0.method5312();
		} else if (arg1 == 6) {
			this.anInt5588 = arg0.method5350();
		} else if (arg1 == 7) {
			this.anInt5589 = arg0.method5312();
		} else if (arg1 == 8) {
			this.anInt5580 = arg0.method5312();
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIZLjava/util/Random;[[I)V")
	private void method4823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(19) int local19 = this.anInt5580 > 0 ? 4096 - Static331.method4885(arg4, this.anInt5580) : 4096;
		@Pc(31) int local31 = this.anInt5578 * this.anInt5589 >> 12;
		@Pc(44) int local44 = this.anInt5578 - (local31 <= 0 ? 0 : Static331.method4885(arg4, local31));
		if (Static76.anInt1458 <= arg0) {
			arg0 -= Static76.anInt1458;
		}
		@Pc(69) int local69;
		@Pc(73) int local73;
		if (local44 > 0) {
			if (arg1 > 0 && arg3 > 0) {
				local69 = arg3 / 2;
				local73 = arg1 / 2;
				@Pc(84) int local84 = local44 > local69 ? local69 : local44;
				@Pc(91) int local91 = local44 > local73 ? local73 : local44;
				@Pc(96) int local96 = arg0 + local84;
				@Pc(103) int local103 = arg3 - local84 * 2;
				for (@Pc(105) int local105 = 0; local105 < arg1; local105++) {
					@Pc(113) int[] local113 = arg5[local105 + arg2];
					@Pc(122) int local122;
					@Pc(127) int local127;
					@Pc(135) int local135;
					if (local91 > local105) {
						local122 = local105 * local19 / local91;
						if (this.anInt5588 == 0) {
							for (local127 = 0; local127 < local84; local127++) {
								local135 = local19 * local127 / local84;
								local113[Static269.anInt4657 & arg0 + local127] = local113[Static269.anInt4657 & arg3 + arg0 - local127 - 1] = local122 * local135 >> 12;
							}
						} else {
							for (local127 = 0; local127 < local84; local127++) {
								local135 = local127 * local19 / local84;
								local113[Static269.anInt4657 & local127 + arg0] = local113[Static269.anInt4657 & arg0 + arg3 - local127 - 1] = local135 < local122 ? local135 : local122;
							}
						}
						if (local103 + local96 <= Static76.anInt1458) {
							Static399.method2490(local113, local96, local103, local122);
						} else {
							local127 = Static76.anInt1458 - local96;
							Static399.method2490(local113, local96, local127, local122);
							Static399.method2490(local113, 0, local103 - local127, local122);
						}
					} else {
						local122 = arg1 - local105 - 1;
						if (local122 < local91) {
							local127 = local19 * local122 / local91;
							@Pc(281) int local281;
							if (this.anInt5588 == 0) {
								for (local135 = 0; local135 < local84; local135++) {
									local281 = local135 * local19 / local84;
									local113[Static269.anInt4657 & arg0 + local135] = local113[Static269.anInt4657 & arg3 + arg0 - local135 - 1] = local281 * local127 >> 12;
								}
							} else {
								for (local135 = 0; local135 < local84; local135++) {
									local281 = local135 * local19 / local84;
									local113[local135 + arg0 & Static269.anInt4657] = local113[arg0 + arg3 - local135 - 1 & Static269.anInt4657] = local127 > local281 ? local281 : local127;
								}
							}
							if (local96 + local103 <= Static76.anInt1458) {
								Static399.method2490(local113, local96, local103, local127);
							} else {
								local135 = Static76.anInt1458 - local96;
								Static399.method2490(local113, local96, local135, local127);
								Static399.method2490(local113, 0, local103 - local135, local127);
							}
						} else {
							for (local127 = 0; local127 < local84; local127++) {
								local113[Static269.anInt4657 & local127 + arg0] = local113[Static269.anInt4657 & arg3 + arg0 - local127 - 1] = local19 * local127 / local84;
							}
							if (local103 + local96 <= Static76.anInt1458) {
								Static399.method2490(local113, local96, local103, local19);
							} else {
								local135 = Static76.anInt1458 - local96;
								Static399.method2490(local113, local96, local135, local19);
								Static399.method2490(local113, 0, local103 - local135, local19);
							}
						}
					}
				}
			}
		} else if (Static76.anInt1458 >= arg3 + arg0) {
			for (local69 = 0; local69 < arg1; local69++) {
				Static399.method2490(arg5[local69 + arg2], arg0, arg3, local19);
			}
		} else {
			local69 = Static76.anInt1458 - arg0;
			for (local73 = 0; local73 < arg1; local73++) {
				@Pc(500) int[] local500 = arg5[local73 + arg2];
				Static399.method2490(local500, arg0, local69, local19);
				Static399.method2490(local500, 0, arg3 - local69, local19);
			}
		}
	}
}
