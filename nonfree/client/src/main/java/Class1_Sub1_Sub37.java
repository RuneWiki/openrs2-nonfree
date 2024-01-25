import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class1_Sub1_Sub37 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
	private int anInt6908;

	@OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
	private int anInt6907 = 1024;

	@OriginalMember(owner = "client!vd", name = "V", descriptor = "I")
	private int anInt6918 = 0;

	@OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
	private int anInt6914 = 819;

	@OriginalMember(owner = "client!vd", name = "T", descriptor = "I")
	private int anInt6916 = 1024;

	@OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
	private int anInt6913 = 1024;

	@OriginalMember(owner = "client!vd", name = "W", descriptor = "I")
	private int anInt6919 = 0;

	@OriginalMember(owner = "client!vd", name = "Y", descriptor = "I")
	private int anInt6921 = 1024;

	@OriginalMember(owner = "client!vd", name = "X", descriptor = "I")
	private int anInt6920 = 409;

	@OriginalMember(owner = "client!vd", name = "O", descriptor = "I")
	private int anInt6911 = 2048;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	@Override
	public void method5627() {
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt6919 = arg1.method4463();
		} else if (arg0 == 1) {
			this.anInt6921 = arg1.method4485();
		} else if (arg0 == 2) {
			this.anInt6911 = arg1.method4485();
		} else if (arg0 == 3) {
			this.anInt6920 = arg1.method4485();
		} else if (arg0 == 4) {
			this.anInt6914 = arg1.method4485();
		} else if (arg0 == 5) {
			this.anInt6916 = arg1.method4485();
		} else if (arg0 == 6) {
			this.anInt6918 = arg1.method4463();
		} else if (arg0 == 7) {
			this.anInt6913 = arg1.method4485();
		} else if (arg0 == 8) {
			this.anInt6907 = arg1.method4485();
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII[[ILjava/util/Random;I)V")
	private void method5305(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = this.anInt6907 > 0 ? 4096 - Static368.method4796(arg4, this.anInt6907) : 4096;
		@Pc(27) int local27 = this.anInt6908 * this.anInt6913 >> 12;
		@Pc(46) int local46 = this.anInt6908 - (local27 <= 0 ? 0 : Static368.method4796(arg4, local27));
		if (Static434.anInt4326 <= arg0) {
			arg0 -= Static434.anInt4326;
		}
		@Pc(71) int local71;
		@Pc(75) int local75;
		if (local46 > 0) {
			if (arg2 > 0 && arg1 > 0) {
				local71 = arg1 / 2;
				local75 = arg2 / 2;
				@Pc(86) int local86 = local46 > local71 ? local71 : local46;
				@Pc(97) int local97 = local75 < local46 ? local75 : local46;
				@Pc(101) int local101 = arg0 + local86;
				@Pc(108) int local108 = arg1 - local86 * 2;
				for (@Pc(110) int local110 = 0; local110 < arg2; local110++) {
					@Pc(119) int[] local119 = arg3[local110 + arg5];
					@Pc(132) int local132;
					@Pc(137) int local137;
					@Pc(145) int local145;
					if (local110 < local97) {
						local132 = local110 * local19 / local97;
						if (this.anInt6918 == 0) {
							for (local137 = 0; local137 < local86; local137++) {
								local145 = local137 * local19 / local86;
								local119[arg0 + local137 & Static429.anInt7144] = local119[Static429.anInt7144 & arg0 + arg1 - local137 - 1] = local132 * local145 >> 12;
							}
						} else {
							for (local137 = 0; local137 < local86; local137++) {
								local145 = local137 * local19 / local86;
								local119[local137 + arg0 & Static429.anInt7144] = local119[arg1 + arg0 - local137 - 1 & Static429.anInt7144] = local145 < local132 ? local145 : local132;
							}
						}
						if (local101 + local108 <= Static434.anInt4326) {
							Static459.method2113(local119, local101, local108, local132);
						} else {
							local137 = Static434.anInt4326 - local101;
							Static459.method2113(local119, local101, local137, local132);
							Static459.method2113(local119, 0, local108 - local137, local132);
						}
					} else {
						local132 = arg2 - local110 - 1;
						if (local132 < local97) {
							local137 = local132 * local19 / local97;
							@Pc(289) int local289;
							if (this.anInt6918 == 0) {
								for (local145 = 0; local145 < local86; local145++) {
									local289 = local145 * local19 / local86;
									local119[local145 + arg0 & Static429.anInt7144] = local119[Static429.anInt7144 & arg0 + arg1 - local145 - 1] = local137 * local289 >> 12;
								}
							} else {
								for (local145 = 0; local145 < local86; local145++) {
									local289 = local19 * local145 / local86;
									local119[local145 + arg0 & Static429.anInt7144] = local119[Static429.anInt7144 & arg1 + arg0 - local145 - 1] = local289 < local137 ? local289 : local137;
								}
							}
							if (local101 + local108 > Static434.anInt4326) {
								local145 = Static434.anInt4326 - local101;
								Static459.method2113(local119, local101, local145, local137);
								Static459.method2113(local119, 0, local108 - local145, local137);
							} else {
								Static459.method2113(local119, local101, local108, local137);
							}
						} else {
							for (local137 = 0; local137 < local86; local137++) {
								local119[Static429.anInt7144 & arg0 + local137] = local119[Static429.anInt7144 & arg0 + arg1 - local137 - 1] = local19 * local137 / local86;
							}
							if (Static434.anInt4326 >= local108 + local101) {
								Static459.method2113(local119, local101, local108, local19);
							} else {
								local145 = Static434.anInt4326 - local101;
								Static459.method2113(local119, local101, local145, local19);
								Static459.method2113(local119, 0, local108 - local145, local19);
							}
						}
					}
				}
			}
		} else if (Static434.anInt4326 >= arg0 + arg1) {
			for (local71 = 0; local71 < arg2; local71++) {
				Static459.method2113(arg3[arg5 + local71], arg0, arg1, local19);
			}
		} else {
			local71 = Static434.anInt4326 - arg0;
			for (local75 = 0; local75 < arg2; local75++) {
				@Pc(516) int[] local516 = arg3[local75 + arg5];
				Static459.method2113(local516, arg0, local71, local19);
				Static459.method2113(local516, 0, arg1 - local71, local19);
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass109_41.method2236(arg0);
		if (!super.aClass109_41.aBoolean214) {
			return local17;
		}
		@Pc(26) int[][] local26 = super.aClass109_41.method2239();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = Static434.anInt4326 * this.anInt6921 >> 12;
		@Pc(58) int local58 = this.anInt6911 * Static434.anInt4326 >> 12;
		@Pc(65) int local65 = this.anInt6920 * Static452.anInt7412 >> 12;
		@Pc(72) int local72 = Static452.anInt7412 * this.anInt6914 >> 12;
		if (local72 <= 1) {
			return local26[arg0];
		}
		this.anInt6908 = Static434.anInt4326 / 8 * this.anInt6916 >> 12;
		@Pc(95) int local95 = Static434.anInt4326 / local51 + 1;
		@Pc(99) int[][] local99 = new int[local95][3];
		@Pc(103) int[][] local103 = new int[local95][3];
		@Pc(110) Random local110 = new Random((long) this.anInt6919);
		while (true) {
			while (true) {
				@Pc(120) int local120 = Static368.method4796(local110, local58 - local51) + local51;
				@Pc(130) int local130 = Static368.method4796(local110, local72 - local65) + local65;
				@Pc(134) int local134 = local120 + local34;
				if (local134 > Static434.anInt4326) {
					local134 = Static434.anInt4326;
					local120 = Static434.anInt4326 - local34;
				}
				@Pc(148) int local148;
				@Pc(158) int local158;
				if (local40) {
					local148 = 0;
				} else {
					@Pc(152) int local152 = local36;
					@Pc(156) int[] local156 = local103[local36];
					local158 = 0;
					@Pc(163) int local163 = local134 + local28;
					if (local163 < 0) {
						local163 += Static434.anInt4326;
					}
					if (local163 > Static434.anInt4326) {
						local163 -= Static434.anInt4326;
					}
					while (true) {
						@Pc(180) int[] local180 = local103[local152];
						if (local163 >= local180[0] && local163 <= local180[1]) {
							local148 = local156[2];
							if (local36 != local152) {
								@Pc(222) int local222 = local34 + local28;
								if (local222 < 0) {
									local222 += Static434.anInt4326;
								}
								if (Static434.anInt4326 < local222) {
									local222 -= Static434.anInt4326;
								}
								for (@Pc(240) int local240 = 1; local240 <= local158; local240++) {
									@Pc(250) int[] local250 = local103[(local240 + local36) % local42];
									local148 = Math.max(local148, local250[2]);
								}
								for (@Pc(266) int local266 = 0; local266 <= local158; local266++) {
									@Pc(276) int[] local276 = local103[(local266 + local36) % local42];
									@Pc(280) int local280 = local276[2];
									if (local148 != local280) {
										@Pc(291) int local291 = local276[0];
										@Pc(295) int local295 = local276[1];
										@Pc(302) int local302;
										@Pc(306) int local306;
										if (local222 < local163) {
											local302 = Math.max(local222, local291);
											local306 = Math.min(local163, local295);
										} else if (local291 == 0) {
											local302 = 0;
											local306 = Math.min(local163, local295);
										} else {
											local302 = Math.max(local222, local291);
											local306 = Static434.anInt4326;
										}
										this.method5305(local32 + local302, -local302 + local306, local148 - local280, local26, local110, local280);
									}
								}
							}
							local36 = local152;
							break;
						}
						local158++;
						local152++;
						if (local42 <= local152) {
							local152 = 0;
						}
					}
				}
				if (Static452.anInt7412 < local148 + local130) {
					local130 = Static452.anInt7412 - local148;
				} else {
					local38 = false;
				}
				@Pc(395) int[] local395;
				if (local134 == Static434.anInt4326) {
					this.method5305(local34 + local30, local120, local130, local26, local110, local148);
					if (local38) {
						return local17;
					}
					local38 = true;
					local395 = local99[local44++];
					local395[1] = local134;
					local395[2] = local148 + local130;
					local395[0] = local34;
					@Pc(412) int[][] local412 = local103;
					local103 = local99;
					local42 = local44;
					local99 = local412;
					local44 = 0;
					local32 = local30;
					local30 = Static368.method4796(local110, Static434.anInt4326);
					local28 = local30 - local32;
					local34 = 0;
					local158 = local28;
					if (local28 < 0) {
						local158 = local28 + Static434.anInt4326;
					}
					local36 = 0;
					if (local158 > Static434.anInt4326) {
						local158 -= Static434.anInt4326;
					}
					while (true) {
						@Pc(461) int[] local461 = local103[local36];
						if (local158 >= local461[0] && local461[1] >= local158) {
							local40 = false;
							break;
						}
						@Pc(478) int local478 = ~local42;
						local36++;
						if (local478 >= ~local36) {
							local36 = 0;
						}
					}
				} else {
					local395 = local99[local44++];
					local395[0] = local34;
					local395[1] = local134;
					local395[2] = local148 + local130;
					this.method5305(local34 + local30, local120, local130, local26, local110, local148);
					local34 = local134;
				}
			}
		}
	}
}
