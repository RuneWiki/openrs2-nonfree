import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class3_Sub2_Sub26 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ql", name = "V", descriptor = "I")
	private int anInt5690;

	@OriginalMember(owner = "client!ql", name = "N", descriptor = "I")
	private int anInt5683 = 0;

	@OriginalMember(owner = "client!ql", name = "L", descriptor = "I")
	private int anInt5681 = 2048;

	@OriginalMember(owner = "client!ql", name = "H", descriptor = "I")
	private int anInt5678 = 409;

	@OriginalMember(owner = "client!ql", name = "M", descriptor = "I")
	private int anInt5682 = 1024;

	@OriginalMember(owner = "client!ql", name = "K", descriptor = "I")
	private int anInt5680 = 1024;

	@OriginalMember(owner = "client!ql", name = "S", descriptor = "I")
	private int anInt5687 = 1024;

	@OriginalMember(owner = "client!ql", name = "U", descriptor = "I")
	private int anInt5689 = 1024;

	@OriginalMember(owner = "client!ql", name = "X", descriptor = "I")
	private int anInt5692 = 819;

	@OriginalMember(owner = "client!ql", name = "Y", descriptor = "I")
	private int anInt5693 = 0;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)V")
	@Override
	public void method5898() {
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILjava/util/Random;I[[IZII)V")
	private void method4448(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = this.anInt5680 > 0 ? 4096 - Static180.method2865(arg1, this.anInt5680) : 4096;
		@Pc(34) int local34 = this.anInt5687 * this.anInt5690 >> 12;
		@Pc(50) int local50 = this.anInt5690 - (local34 <= 0 ? 0 : Static180.method2865(arg1, local34));
		if (Static406.anInt6694 <= arg2) {
			arg2 -= Static406.anInt6694;
		}
		@Pc(74) int local74;
		@Pc(78) int local78;
		if (local50 > 0) {
			if (arg0 > 0 && arg4 > 0) {
				local74 = arg4 / 2;
				local78 = arg0 / 2;
				@Pc(89) int local89 = local50 > local74 ? local74 : local50;
				@Pc(96) int local96 = local78 >= local50 ? local50 : local78;
				@Pc(101) int local101 = arg2 + local89;
				@Pc(108) int local108 = arg4 - local89 * 2;
				for (@Pc(110) int local110 = 0; local110 < arg0; local110++) {
					@Pc(119) int[] local119 = arg3[local110 + arg5];
					@Pc(132) int local132;
					@Pc(140) int local140;
					@Pc(148) int local148;
					if (local110 < local96) {
						local132 = local18 * local110 / local96;
						if (this.anInt5693 == 0) {
							for (local140 = 0; local140 < local89; local140++) {
								local148 = local18 * local140 / local89;
								local119[local140 + arg2 & Static5.anInt72] = local119[arg4 + arg2 - local140 - 1 & Static5.anInt72] = local132 * local148 >> 12;
							}
						} else {
							for (local140 = 0; local140 < local89; local140++) {
								local148 = local18 * local140 / local89;
								local119[local140 + arg2 & Static5.anInt72] = local119[Static5.anInt72 & arg4 + arg2 - local140 - 1] = local132 > local148 ? local148 : local132;
							}
						}
						if (Static406.anInt6694 >= local101 + local108) {
							Static462.method4617(local119, local101, local108, local132);
						} else {
							local140 = Static406.anInt6694 - local101;
							Static462.method4617(local119, local101, local140, local132);
							Static462.method4617(local119, 0, local108 - local140, local132);
						}
					} else {
						local132 = arg0 - local110 - 1;
						if (local132 < local96) {
							local140 = local18 * local132 / local96;
							@Pc(280) int local280;
							if (this.anInt5693 == 0) {
								for (local148 = 0; local148 < local89; local148++) {
									local280 = local18 * local148 / local89;
									local119[Static5.anInt72 & local148 + arg2] = local119[arg4 + arg2 - local148 - 1 & Static5.anInt72] = local280 * local140 >> 12;
								}
							} else {
								for (local148 = 0; local148 < local89; local148++) {
									local280 = local148 * local18 / local89;
									local119[arg2 + local148 & Static5.anInt72] = local119[arg2 + arg4 - local148 - 1 & Static5.anInt72] = local140 > local280 ? local280 : local140;
								}
							}
							if (local101 + local108 > Static406.anInt6694) {
								local148 = Static406.anInt6694 - local101;
								Static462.method4617(local119, local101, local148, local140);
								Static462.method4617(local119, 0, local108 - local148, local140);
							} else {
								Static462.method4617(local119, local101, local108, local140);
							}
						} else {
							for (local140 = 0; local140 < local89; local140++) {
								local119[Static5.anInt72 & local140 + arg2] = local119[Static5.anInt72 & arg2 + arg4 - local140 - 1] = local140 * local18 / local89;
							}
							if (local108 + local101 <= Static406.anInt6694) {
								Static462.method4617(local119, local101, local108, local18);
							} else {
								local148 = Static406.anInt6694 - local101;
								Static462.method4617(local119, local101, local148, local18);
								Static462.method4617(local119, 0, local108 - local148, local18);
							}
						}
					}
				}
			}
		} else if (Static406.anInt6694 < arg2 + arg4) {
			local74 = Static406.anInt6694 - arg2;
			for (local78 = 0; local78 < arg0; local78++) {
				@Pc(484) int[] local484 = arg3[local78 + arg5];
				Static462.method4617(local484, arg2, local74, local18);
				Static462.method4617(local484, 0, arg4 - local74, local18);
			}
		} else {
			for (local74 = 0; local74 < arg0; local74++) {
				Static462.method4617(arg3[arg5 + local74], arg2, arg4, local18);
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass62_41.method1670(arg0);
		if (!super.aClass62_41.aBoolean169) {
			return local15;
		}
		@Pc(24) int[][] local24 = super.aClass62_41.method1669();
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) boolean local36 = true;
		@Pc(38) boolean local38 = true;
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		@Pc(49) int local49 = Static406.anInt6694 * this.anInt5689 >> 12;
		@Pc(56) int local56 = Static406.anInt6694 * this.anInt5681 >> 12;
		@Pc(63) int local63 = this.anInt5678 * Static286.anInt1445 >> 12;
		@Pc(70) int local70 = this.anInt5692 * Static286.anInt1445 >> 12;
		if (local70 <= 1) {
			return local24[arg0];
		}
		this.anInt5690 = Static406.anInt6694 / 8 * this.anInt5682 >> 12;
		@Pc(95) int local95 = Static406.anInt6694 / local49 + 1;
		@Pc(99) int[][] local99 = new int[local95][3];
		@Pc(103) int[][] local103 = new int[local95][3];
		@Pc(110) Random local110 = new Random((long) this.anInt5683);
		while (true) {
			while (true) {
				@Pc(122) int local122 = local49 + Static180.method2865(local110, local56 - local49);
				@Pc(133) int local133 = local63 + Static180.method2865(local110, local70 - local63);
				@Pc(137) int local137 = local122 + local32;
				if (Static406.anInt6694 < local137) {
					local122 = Static406.anInt6694 - local32;
					local137 = Static406.anInt6694;
				}
				@Pc(151) int local151;
				@Pc(161) int local161;
				if (local38) {
					local151 = 0;
				} else {
					@Pc(155) int local155 = local34;
					@Pc(159) int[] local159 = local103[local34];
					local161 = 0;
					@Pc(165) int local165 = local26 + local137;
					if (local165 < 0) {
						local165 += Static406.anInt6694;
					}
					if (local165 > Static406.anInt6694) {
						local165 -= Static406.anInt6694;
					}
					while (true) {
						@Pc(182) int[] local182 = local103[local155];
						if (local165 >= local182[0] && local182[1] >= local165) {
							local151 = local159[2];
							if (local34 != local155) {
								@Pc(225) int local225 = local32 + local26;
								if (local225 < 0) {
									local225 += Static406.anInt6694;
								}
								if (local225 > Static406.anInt6694) {
									local225 -= Static406.anInt6694;
								}
								for (@Pc(247) int local247 = 1; local247 <= local161; local247++) {
									@Pc(257) int[] local257 = local103[(local247 + local34) % local40];
									local151 = Math.max(local151, local257[2]);
								}
								for (@Pc(273) int local273 = 0; local273 <= local161; local273++) {
									@Pc(283) int[] local283 = local103[(local273 + local34) % local40];
									@Pc(287) int local287 = local283[2];
									if (local287 != local151) {
										@Pc(298) int local298 = local283[0];
										@Pc(302) int local302 = local283[1];
										@Pc(309) int local309;
										@Pc(313) int local313;
										if (local165 > local225) {
											local309 = Math.max(local225, local298);
											local313 = Math.min(local165, local302);
										} else if (local298 == 0) {
											local309 = 0;
											local313 = Math.min(local165, local302);
										} else {
											local309 = Math.max(local225, local298);
											local313 = Static406.anInt6694;
										}
										this.method4448(local151 - local287, local110, local30 + local309, local24, local313 - local309, local287);
									}
								}
							}
							local34 = local155;
							break;
						}
						local161++;
						local155++;
						if (local40 <= local155) {
							local155 = 0;
						}
					}
				}
				if (Static286.anInt1445 < local133 + local151) {
					local133 = Static286.anInt1445 - local151;
				} else {
					local36 = false;
				}
				@Pc(388) int[] local388;
				if (local137 == Static406.anInt6694) {
					this.method4448(local133, local110, local28 + local32, local24, local122, local151);
					if (local36) {
						return local15;
					}
					local36 = true;
					local388 = local99[local42++];
					local388[1] = local137;
					local388[2] = local151 + local133;
					local388[0] = local32;
					@Pc(453) int[][] local453 = local103;
					local103 = local99;
					local40 = local42;
					local99 = local453;
					local30 = local28;
					local42 = 0;
					local28 = Static180.method2865(local110, Static406.anInt6694);
					local32 = 0;
					local26 = local28 - local30;
					local161 = local26;
					if (local26 < 0) {
						local161 = local26 + Static406.anInt6694;
					}
					if (Static406.anInt6694 < local161) {
						local161 -= Static406.anInt6694;
					}
					local34 = 0;
					local38 = false;
					while (true) {
						@Pc(498) int[] local498 = local103[local34];
						if (local161 >= local498[0] && local498[1] >= local161) {
							break;
						}
						local34++;
						if (local34 >= local40) {
							local34 = 0;
						}
					}
				} else {
					local388 = local99[local42++];
					local388[1] = local137;
					local388[2] = local151 + local133;
					local388[0] = local32;
					this.method4448(local133, local110, local28 + local32, local24, local122, local151);
					local32 = local137;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!cu;II)V")
	@Override
	public void method5892(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5683 = arg0.method2582();
		} else if (arg1 == 1) {
			this.anInt5689 = arg0.method2588();
		} else if (arg1 == 2) {
			this.anInt5681 = arg0.method2588();
		} else if (arg1 == 3) {
			this.anInt5678 = arg0.method2588();
		} else if (arg1 == 4) {
			this.anInt5692 = arg0.method2588();
		} else if (arg1 == 5) {
			this.anInt5682 = arg0.method2588();
		} else if (arg1 == 6) {
			this.anInt5693 = arg0.method2582();
		} else if (arg1 == 7) {
			this.anInt5687 = arg0.method2588();
		} else if (arg1 == 8) {
			this.anInt5680 = arg0.method2588();
		}
	}
}
