import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class2_Sub2_Sub20 extends Class2_Sub2 {

	@OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
	private int anInt5392;

	@OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
	private int anInt5391 = 409;

	@OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
	private int anInt5396 = 1024;

	@OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
	private int anInt5402 = 819;

	@OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
	private int anInt5401 = 1024;

	@OriginalMember(owner = "client!lc", name = "T", descriptor = "I")
	private int anInt5400 = 1024;

	@OriginalMember(owner = "client!lc", name = "Y", descriptor = "I")
	private int anInt5404 = 0;

	@OriginalMember(owner = "client!lc", name = "ab", descriptor = "I")
	private int anInt5406 = 2048;

	@OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
	private int anInt5398 = 1024;

	@OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
	private int anInt5399 = 0;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5399 = arg0.method4325();
		} else if (arg1 == 1) {
			this.anInt5400 = arg0.method4294();
		} else if (arg1 == 2) {
			this.anInt5406 = arg0.method4294();
		} else if (arg1 == 3) {
			this.anInt5391 = arg0.method4294();
		} else if (arg1 == 4) {
			this.anInt5402 = arg0.method4294();
		} else if (arg1 == 5) {
			this.anInt5396 = arg0.method4294();
		} else if (arg1 == 6) {
			this.anInt5404 = arg0.method4325();
		} else if (arg1 == 7) {
			this.anInt5398 = arg0.method4294();
		} else if (arg1 == 8) {
			this.anInt5401 = arg0.method4294();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	@Override
	public void method7948() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III[[ILjava/util/Random;II)V")
	private void method4540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) Random arg4, @OriginalArg(5) int arg5) {
		@Pc(22) int local22 = this.anInt5401 > 0 ? 4096 - Static233.method3629(arg4, this.anInt5401) : 4096;
		@Pc(30) int local30 = this.anInt5392 * this.anInt5398 >> 12;
		@Pc(45) int local45 = this.anInt5392 - (local30 > 0 ? Static233.method3629(arg4, local30) : 0);
		if (arg1 >= Static153.anInt3070) {
			arg1 -= Static153.anInt3070;
		}
		@Pc(66) int local66;
		@Pc(70) int local70;
		if (local45 > 0) {
			if (arg5 > 0 && arg2 > 0) {
				local66 = arg2 / 2;
				local70 = arg5 / 2;
				@Pc(81) int local81 = local45 > local66 ? local66 : local45;
				@Pc(92) int local92 = local70 >= local45 ? local45 : local70;
				@Pc(97) int local97 = arg1 + local81;
				@Pc(104) int local104 = arg2 - local81 * 2;
				for (@Pc(106) int local106 = 0; local106 < arg5; local106++) {
					@Pc(115) int[] local115 = arg3[local106 + arg0];
					@Pc(124) int local124;
					@Pc(132) int local132;
					@Pc(140) int local140;
					if (local92 > local106) {
						local124 = local22 * local106 / local92;
						if (this.anInt5404 == 0) {
							for (local132 = 0; local132 < local81; local132++) {
								local140 = local132 * local22 / local81;
								local115[Static431.anInt7305 & local132 + arg1] = local115[Static431.anInt7305 & arg1 + arg2 - local132 - 1] = local140 * local124 >> 12;
							}
						} else {
							for (local132 = 0; local132 < local81; local132++) {
								local140 = local22 * local132 / local81;
								local115[arg1 + local132 & Static431.anInt7305] = local115[arg2 + arg1 - local132 - 1 & Static431.anInt7305] = local124 > local140 ? local140 : local124;
							}
						}
						if (local97 + local104 > Static153.anInt3070) {
							local132 = Static153.anInt3070 - local97;
							Static598.method1134(local115, local97, local132, local124);
							Static598.method1134(local115, 0, local104 - local132, local124);
						} else {
							Static598.method1134(local115, local97, local104, local124);
						}
					} else {
						local124 = arg5 - local106 - 1;
						if (local124 < local92) {
							local132 = local22 * local124 / local92;
							@Pc(284) int local284;
							if (this.anInt5404 == 0) {
								for (local140 = 0; local140 < local81; local140++) {
									local284 = local140 * local22 / local81;
									local115[local140 + arg1 & Static431.anInt7305] = local115[Static431.anInt7305 & arg1 + arg2 - local140 - 1] = local132 * local284 >> 12;
								}
							} else {
								for (local140 = 0; local140 < local81; local140++) {
									local284 = local22 * local140 / local81;
									local115[Static431.anInt7305 & local140 + arg1] = local115[arg1 + arg2 - local140 - 1 & Static431.anInt7305] = local132 <= local284 ? local132 : local284;
								}
							}
							if (local97 + local104 <= Static153.anInt3070) {
								Static598.method1134(local115, local97, local104, local132);
							} else {
								local140 = Static153.anInt3070 - local97;
								Static598.method1134(local115, local97, local140, local132);
								Static598.method1134(local115, 0, local104 - local140, local132);
							}
						} else {
							for (local132 = 0; local132 < local81; local132++) {
								local115[Static431.anInt7305 & arg1 + local132] = local115[Static431.anInt7305 & arg2 + arg1 - local132 - 1] = local132 * local22 / local81;
							}
							if (Static153.anInt3070 < local104 + local97) {
								local140 = Static153.anInt3070 - local97;
								Static598.method1134(local115, local97, local140, local22);
								Static598.method1134(local115, 0, local104 - local140, local22);
							} else {
								Static598.method1134(local115, local97, local104, local22);
							}
						}
					}
				}
			}
		} else if (Static153.anInt3070 < arg1 + arg2) {
			local66 = Static153.anInt3070 - arg1;
			for (local70 = 0; local70 < arg5; local70++) {
				@Pc(499) int[] local499 = arg3[arg0 + local70];
				Static598.method1134(local499, arg1, local66, local22);
				Static598.method1134(local499, 0, arg2 - local66, local22);
			}
		} else {
			for (local66 = 0; local66 < arg5; local66++) {
				Static598.method1134(arg3[local66 + arg0], arg1, arg2, local22);
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass238_41.method5571(arg0);
		if (!super.aClass238_41.aBoolean518) {
			return local11;
		}
		@Pc(28) int[][] local28 = super.aClass238_41.method5573();
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) boolean local40 = true;
		@Pc(42) boolean local42 = true;
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		@Pc(53) int local53 = Static153.anInt3070 * this.anInt5400 >> 12;
		@Pc(60) int local60 = this.anInt5406 * Static153.anInt3070 >> 12;
		@Pc(67) int local67 = this.anInt5391 * Static377.anInt6692 >> 12;
		@Pc(74) int local74 = this.anInt5402 * Static377.anInt6692 >> 12;
		if (local74 <= 1) {
			return local28[arg0];
		}
		this.anInt5392 = Static153.anInt3070 / 8 * this.anInt5396 >> 12;
		@Pc(99) int local99 = Static153.anInt3070 / local53 + 1;
		@Pc(103) int[][] local103 = new int[local99][3];
		@Pc(107) int[][] local107 = new int[local99][3];
		@Pc(114) Random local114 = new Random((long) this.anInt5399);
		while (true) {
			while (true) {
				@Pc(124) int local124 = Static233.method3629(local114, local60 - local53) + local53;
				@Pc(135) int local135 = local67 + Static233.method3629(local114, local74 - local67);
				@Pc(139) int local139 = local36 + local124;
				if (local139 > Static153.anInt3070) {
					local139 = Static153.anInt3070;
					local124 = Static153.anInt3070 - local36;
				}
				@Pc(188) int local188;
				@Pc(163) int local163;
				if (local42) {
					local188 = 0;
				} else {
					@Pc(157) int local157 = local38;
					@Pc(161) int[] local161 = local107[local38];
					local163 = 0;
					@Pc(167) int local167 = local30 + local139;
					if (local167 < 0) {
						local167 += Static153.anInt3070;
					}
					if (Static153.anInt3070 < local167) {
						local167 -= Static153.anInt3070;
					}
					local188 = local161[2];
					while (true) {
						@Pc(192) int[] local192 = local107[local157];
						if (local192[0] <= local167 && local167 <= local192[1]) {
							if (local38 != local157) {
								@Pc(219) int local219 = local36 + local30;
								if (local219 < 0) {
									local219 += Static153.anInt3070;
								}
								if (Static153.anInt3070 < local219) {
									local219 -= Static153.anInt3070;
								}
								for (@Pc(241) int local241 = 1; local241 <= local163; local241++) {
									@Pc(252) int[] local252 = local107[(local38 + local241) % local44];
									local188 = Math.max(local188, local252[2]);
								}
								for (@Pc(268) int local268 = 0; local268 <= local163; local268++) {
									@Pc(278) int[] local278 = local107[(local268 + local38) % local44];
									@Pc(282) int local282 = local278[2];
									if (local188 != local282) {
										@Pc(289) int local289 = local278[0];
										@Pc(293) int local293 = local278[1];
										@Pc(300) int local300;
										@Pc(304) int local304;
										if (local167 > local219) {
											local300 = Math.max(local219, local289);
											local304 = Math.min(local167, local293);
										} else if (local289 == 0) {
											local304 = Math.min(local167, local293);
											local300 = 0;
										} else {
											local300 = Math.max(local219, local289);
											local304 = Static153.anInt3070;
										}
										this.method4540(local282, local300 + local34, local304 - local300, local28, local114, local188 - local282);
									}
								}
							}
							local38 = local157;
							break;
						}
						local157++;
						if (local157 >= local44) {
							local157 = 0;
						}
						local163++;
					}
				}
				if (Static377.anInt6692 >= local188 + local135) {
					local40 = false;
				} else {
					local135 = Static377.anInt6692 - local188;
				}
				@Pc(373) int[] local373;
				if (local139 == Static153.anInt3070) {
					this.method4540(local188, local32 + local36, local124, local28, local114, local135);
					if (local40) {
						return local11;
					}
					local40 = true;
					local373 = local103[local46++];
					local373[1] = local139;
					local373[2] = local188 + local135;
					local373[0] = local36;
					@Pc(438) int[][] local438 = local107;
					local107 = local103;
					local103 = local438;
					local44 = local46;
					local46 = 0;
					local34 = local32;
					local32 = Static233.method3629(local114, Static153.anInt3070);
					local30 = local32 - local34;
					local36 = 0;
					local163 = local30;
					if (local30 < 0) {
						local163 = local30 + Static153.anInt3070;
					}
					local38 = 0;
					if (Static153.anInt3070 < local163) {
						local163 -= Static153.anInt3070;
					}
					local42 = false;
					while (true) {
						@Pc(489) int[] local489 = local107[local38];
						if (local163 >= local489[0] && local163 <= local489[1]) {
							break;
						}
						@Pc(506) int local506 = ~local44;
						local38++;
						if (local506 >= ~local38) {
							local38 = 0;
						}
					}
				} else {
					local373 = local103[local46++];
					local373[2] = local188 + local135;
					local373[0] = local36;
					local373[1] = local139;
					this.method4540(local188, local32 + local36, local124, local28, local114, local135);
					local36 = local139;
				}
			}
		}
	}
}
