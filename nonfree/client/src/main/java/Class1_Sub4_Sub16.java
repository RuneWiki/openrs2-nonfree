import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class1_Sub4_Sub16 extends Class1_Sub4 {

	@OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
	private int anInt2252;

	@OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
	private int anInt2255 = 1024;

	@OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
	private int anInt2253 = 1024;

	@OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
	private int anInt2257 = 819;

	@OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
	private int anInt2247 = 1024;

	@OriginalMember(owner = "client!hj", name = "W", descriptor = "I")
	private int anInt2259 = 2048;

	@OriginalMember(owner = "client!hj", name = "X", descriptor = "I")
	private int anInt2260 = 1024;

	@OriginalMember(owner = "client!hj", name = "Z", descriptor = "I")
	private int anInt2262 = 0;

	@OriginalMember(owner = "client!hj", name = "bb", descriptor = "I")
	private int anInt2264 = 0;

	@OriginalMember(owner = "client!hj", name = "ab", descriptor = "I")
	private int anInt2263 = 409;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2264 = arg0.method1378();
		} else if (arg1 == 1) {
			this.anInt2255 = arg0.method1386();
		} else if (arg1 == 2) {
			this.anInt2259 = arg0.method1386();
		} else if (arg1 == 3) {
			this.anInt2263 = arg0.method1386();
		} else if (arg1 == 4) {
			this.anInt2257 = arg0.method1386();
		} else if (arg1 == 5) {
			this.anInt2253 = arg0.method1386();
		} else if (arg1 == 6) {
			this.anInt2262 = arg0.method1378();
		} else if (arg1 == 7) {
			this.anInt2247 = arg0.method1386();
		} else if (arg1 == 8) {
			this.anInt2260 = arg0.method1386();
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = this.aClass7_41.method116(arg0);
		if (!this.aClass7_41.aBoolean4) {
			return local9;
		}
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(38) int[][] local38 = this.aClass7_41.method112();
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		@Pc(44) boolean local44 = true;
		@Pc(46) boolean local46 = true;
		@Pc(48) int local48 = 0;
		@Pc(50) int local50 = 0;
		@Pc(57) int local57 = Static182.anInt3492 * this.anInt2259 >> 12;
		@Pc(64) int local64 = Static117.anInt2472 * this.anInt2257 >> 12;
		@Pc(71) int local71 = Static117.anInt2472 * this.anInt2263 >> 12;
		@Pc(78) int local78 = this.anInt2255 * Static182.anInt3492 >> 12;
		if (local64 <= 1) {
			return local38[arg0];
		}
		@Pc(94) int local94 = Static182.anInt3492 / local78 + 1;
		@Pc(98) int[][] local98 = new int[local94][3];
		this.anInt2252 = this.anInt2253 * (Static182.anInt3492 / 8) >> 12;
		@Pc(115) Random local115 = new Random((long) this.anInt2264);
		@Pc(119) int[][] local119 = new int[local94][3];
		while (true) {
			while (true) {
				@Pc(129) int local129 = Static151.method2554(local57 - local78, local115) + local78;
				@Pc(138) int local138 = Static151.method2554(local64 - local71, local115) + local71;
				@Pc(142) int local142 = local40 + local129;
				if (local142 > Static182.anInt3492) {
					local129 = Static182.anInt3492 - local40;
					local142 = Static182.anInt3492;
				}
				@Pc(166) int local166;
				@Pc(168) int local168;
				if (local46) {
					local166 = 0;
				} else {
					@Pc(162) int[] local162 = local119[local42];
					local166 = local162[2];
					local168 = 0;
					@Pc(170) int local170 = local42;
					@Pc(174) int local174 = local27 + local142;
					if (local174 < 0) {
						local174 += Static182.anInt3492;
					}
					if (Static182.anInt3492 < local174) {
						local174 -= Static182.anInt3492;
					}
					while (true) {
						@Pc(195) int[] local195 = local119[local170];
						if (local174 >= local195[0] && local195[1] >= local174) {
							if (local42 != local170) {
								@Pc(235) int local235 = local27 + local40;
								if (local235 < 0) {
									local235 += Static182.anInt3492;
								}
								if (local235 > Static182.anInt3492) {
									local235 -= Static182.anInt3492;
								}
								@Pc(258) int local258;
								@Pc(273) int[] local273;
								for (local258 = 1; local258 <= local168; local258++) {
									local273 = local119[(local258 + local42) % local50];
									local166 = Math.max(local166, local273[2]);
								}
								for (local258 = 0; local258 <= local168; local258++) {
									local273 = local119[(local42 + local258) % local50];
									@Pc(304) int local304 = local273[2];
									if (local166 != local304) {
										@Pc(311) int local311 = local273[1];
										@Pc(315) int local315 = local273[0];
										@Pc(331) int local331;
										@Pc(333) int local333;
										if (local235 < local174) {
											local331 = Math.max(local235, local315);
											local333 = Math.min(local174, local311);
										} else if (local315 == 0) {
											local331 = 0;
											local333 = Math.min(local174, local311);
										} else {
											local331 = Math.max(local235, local315);
											local333 = Static182.anInt3492;
										}
										this.method1948(local304, local38, local115, local166 - local304, local31 + local331, local333 - local331);
									}
								}
							}
							local42 = local170;
							break;
						}
						local170++;
						if (local170 >= local50) {
							local170 = 0;
						}
						local168++;
					}
				}
				if (local138 + local166 > Static117.anInt2472) {
					local138 = Static117.anInt2472 - local166;
				} else {
					local44 = false;
				}
				@Pc(400) int[] local400;
				if (local142 == Static182.anInt3492) {
					this.method1948(local166, local38, local115, local138, local40 + local29, local129);
					if (local44) {
						return local9;
					}
					local31 = local29;
					local46 = false;
					local42 = 0;
					@Pc(452) int[][] local452 = local119;
					local400 = local98[local48++];
					local50 = local48;
					local400[0] = local40;
					local44 = true;
					local400[1] = local142;
					local48 = 0;
					local40 = 0;
					local119 = local98;
					local400[2] = local138 + local166;
					local29 = Static151.method2554(Static182.anInt3492, local115);
					local27 = local29 - local31;
					local98 = local452;
					local168 = local27;
					if (local27 < 0) {
						local168 = local27 + Static182.anInt3492;
					}
					if (Static182.anInt3492 < local168) {
						local168 -= Static182.anInt3492;
					}
					while (true) {
						@Pc(513) int[] local513 = local119[local42];
						if (local513[0] <= local168 && local168 <= local513[1]) {
							break;
						}
						local42++;
						if (local42 >= local50) {
							local42 = 0;
						}
					}
				} else {
					local400 = local98[local48++];
					local400[0] = local40;
					local400[1] = local142;
					local400[2] = local166 + local138;
					this.method1948(local166, local38, local115, local138, local29 + local40, local129);
					local40 = local142;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)V")
	@Override
	public void method4755() {
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II[[ILjava/util/Random;III)V")
	private void method1948(@OriginalArg(0) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) int local33 = this.anInt2260 <= 0 ? 4096 : 4096 - Static151.method2554(this.anInt2260, arg2);
		@Pc(41) int local41 = this.anInt2252 * this.anInt2247 >> 12;
		@Pc(56) int local56 = this.anInt2252 - (local41 <= 0 ? 0 : Static151.method2554(local41, arg2));
		if (arg4 >= Static182.anInt3492) {
			arg4 -= Static182.anInt3492;
		}
		@Pc(81) int local81;
		@Pc(96) int local96;
		if (local56 > 0) {
			if (arg3 <= 0 || arg5 <= 0) {
				return;
			}
			local81 = arg5 / 2;
			@Pc(92) int local92 = local56 <= local81 ? local56 : local81;
			local96 = arg3 / 2;
			@Pc(103) int local103 = local96 >= local56 ? local56 : local96;
			@Pc(107) int local107 = local92 + arg4;
			@Pc(113) int local113 = arg5 - local92 * 2;
			for (@Pc(115) int local115 = 0; local115 < arg3; local115++) {
				@Pc(125) int[] local125 = arg1[local115 + arg0];
				@Pc(134) int local134;
				@Pc(139) int local139;
				@Pc(148) int local148;
				if (local103 > local115) {
					local134 = local33 * local115 / local103;
					if (this.anInt2262 == 0) {
						for (local139 = 0; local139 < local92; local139++) {
							local148 = local33 * local139 / local92;
							local125[arg4 + local139 & Static61.anInt1166] = local125[Static61.anInt1166 & arg5 + arg4 - local139 - 1] = local148 * local134 >> 12;
						}
					} else {
						for (local139 = 0; local139 < local92; local139++) {
							local148 = local139 * local33 / local92;
							local125[arg4 + local139 & Static61.anInt1166] = local125[arg4 + arg5 - local139 - 1 & Static61.anInt1166] = local148 < local134 ? local148 : local134;
						}
					}
					if (Static182.anInt3492 < local107 + local113) {
						local139 = Static182.anInt3492 - local107;
						Static319.method1765(local125, local107, local139, local134);
						Static319.method1765(local125, 0, local113 - local139, local134);
					} else {
						Static319.method1765(local125, local107, local113, local134);
					}
				} else {
					local134 = arg3 - local115 - 1;
					if (local134 >= local103) {
						for (local139 = 0; local139 < local92; local139++) {
							local125[Static61.anInt1166 & arg4 + local139] = local125[Static61.anInt1166 & arg4 + arg5 - local139 - 1] = local139 * local33 / local92;
						}
						if (Static182.anInt3492 >= local113 + local107) {
							Static319.method1765(local125, local107, local113, local33);
						} else {
							local139 = Static182.anInt3492 - local107;
							Static319.method1765(local125, local107, local139, local33);
							Static319.method1765(local125, 0, local113 - local139, local33);
						}
					} else {
						local139 = local134 * local33 / local103;
						@Pc(286) int local286;
						if (this.anInt2262 == 0) {
							for (local148 = 0; local148 < local92; local148++) {
								local286 = local148 * local33 / local92;
								local125[Static61.anInt1166 & arg4 + local148] = local125[arg5 + arg4 - local148 - 1 & Static61.anInt1166] = local139 * local286 >> 12;
							}
						} else {
							for (local148 = 0; local148 < local92; local148++) {
								local286 = local148 * local33 / local92;
								local125[Static61.anInt1166 & arg4 + local148] = local125[Static61.anInt1166 & arg5 + arg4 - local148 - 1] = local286 >= local139 ? local139 : local286;
							}
						}
						if (local107 + local113 > Static182.anInt3492) {
							local148 = Static182.anInt3492 - local107;
							Static319.method1765(local125, local107, local148, local139);
							Static319.method1765(local125, 0, local113 - local148, local139);
						} else {
							Static319.method1765(local125, local107, local113, local139);
						}
					}
				}
			}
		} else if (Static182.anInt3492 >= arg5 + arg4) {
			for (local81 = 0; local81 < arg3; local81++) {
				Static319.method1765(arg1[local81 + arg0], arg4, arg5, local33);
			}
		} else {
			local81 = Static182.anInt3492 - arg4;
			for (local96 = 0; local96 < arg3; local96++) {
				@Pc(517) int[] local517 = arg1[arg0 + local96];
				Static319.method1765(local517, arg4, local81, local33);
				Static319.method1765(local517, 0, arg5 - local81, local33);
			}
		}
	}
}
