import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mh")
public final class Class1_Sub1_Sub20 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mh", name = "yb", descriptor = "I")
	private int anInt2905;

	@OriginalMember(owner = "client!mh", name = "bb", descriptor = "I")
	private int anInt2892 = 1024;

	@OriginalMember(owner = "client!mh", name = "pb", descriptor = "I")
	private int anInt2901 = 819;

	@OriginalMember(owner = "client!mh", name = "kb", descriptor = "I")
	private int anInt2897 = 2048;

	@OriginalMember(owner = "client!mh", name = "hb", descriptor = "I")
	private int anInt2896 = 409;

	@OriginalMember(owner = "client!mh", name = "Ab", descriptor = "I")
	private int anInt2907 = 0;

	@OriginalMember(owner = "client!mh", name = "gb", descriptor = "I")
	private int anInt2895 = 0;

	@OriginalMember(owner = "client!mh", name = "wb", descriptor = "I")
	private int anInt2904 = 1024;

	@OriginalMember(owner = "client!mh", name = "Hb", descriptor = "I")
	private int anInt2910 = 1024;

	@OriginalMember(owner = "client!mh", name = "Kb", descriptor = "I")
	private int anInt2911 = 1024;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BIII[[ILjava/util/Random;I)V")
	private void method2242(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) Random arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = this.anInt2892 > 0 ? 4096 - Static108.method1839(arg4, this.anInt2892) : 4096;
		@Pc(32) int local32 = this.anInt2905 * this.anInt2911 >> 12;
		@Pc(48) int local48 = this.anInt2905 - (local32 <= 0 ? 0 : Static108.method1839(arg4, local32));
		if (arg2 >= Static157.anInt3431) {
			arg2 -= Static157.anInt3431;
		}
		@Pc(64) int local64;
		@Pc(86) int local86;
		if (local48 <= 0) {
			if (Static157.anInt3431 >= arg1 + arg2) {
				for (local64 = 0; local64 < arg0; local64++) {
					Static233.method869(arg3[arg5 + local64], arg2, arg1, local15);
				}
			} else {
				local64 = Static157.anInt3431 - arg2;
				for (local86 = 0; local86 < arg0; local86++) {
					@Pc(94) int[] local94 = arg3[local86 + arg5];
					Static233.method869(local94, arg2, local64, local15);
					Static233.method869(local94, 0, arg1 - local64, local15);
				}
			}
		} else if (arg0 > 0 && arg1 > 0) {
			local64 = arg1 / 2;
			local86 = arg0 / 2;
			@Pc(136) int local136 = local48 > local64 ? local64 : local48;
			@Pc(140) int local140 = arg2 + local136;
			@Pc(151) int local151 = local86 >= local48 ? local48 : local86;
			@Pc(158) int local158 = arg1 - local136 * 2;
			for (@Pc(160) int local160 = 0; local160 < arg0; local160++) {
				@Pc(168) int[] local168 = arg3[arg5 + local160];
				@Pc(181) int local181;
				@Pc(189) int local189;
				@Pc(197) int local197;
				if (local151 > local160) {
					local181 = local15 * local160 / local151;
					if (this.anInt2907 == 0) {
						for (local189 = 0; local189 < local136; local189++) {
							local197 = local15 * local189 / local136;
							local168[Static74.anInt1679 & arg2 + local189] = local168[Static74.anInt1679 & arg1 + arg2 - local189 - 1] = local197 * local181 >> 12;
						}
					} else {
						for (local189 = 0; local189 < local136; local189++) {
							local197 = local15 * local189 / local136;
							local168[arg2 + local189 & Static74.anInt1679] = local168[arg1 + arg2 - local189 - 1 & Static74.anInt1679] = local181 > local197 ? local197 : local181;
						}
					}
					if (Static157.anInt3431 >= local140 + local158) {
						Static233.method869(local168, local140, local158, local181);
					} else {
						local189 = Static157.anInt3431 - local140;
						Static233.method869(local168, local140, local189, local181);
						Static233.method869(local168, 0, local158 - local189, local181);
					}
				} else {
					local181 = arg0 - local160 - 1;
					if (local181 < local151) {
						local189 = local15 * local181 / local151;
						@Pc(345) int local345;
						if (this.anInt2907 == 0) {
							for (local197 = 0; local197 < local136; local197++) {
								local345 = local15 * local197 / local136;
								local168[local197 + arg2 & Static74.anInt1679] = local168[arg2 + arg1 - local197 - 1 & Static74.anInt1679] = local345 * local189 >> 12;
							}
						} else {
							for (local197 = 0; local197 < local136; local197++) {
								local345 = local15 * local197 / local136;
								local168[Static74.anInt1679 & local197 + arg2] = local168[Static74.anInt1679 & arg1 + arg2 - local197 - 1] = local345 < local189 ? local345 : local189;
							}
						}
						if (local158 + local140 <= Static157.anInt3431) {
							Static233.method869(local168, local140, local158, local189);
						} else {
							local197 = Static157.anInt3431 - local140;
							Static233.method869(local168, local140, local197, local189);
							Static233.method869(local168, 0, local158 - local197, local189);
						}
					} else {
						for (local189 = 0; local189 < local136; local189++) {
							local168[arg2 + local189 & Static74.anInt1679] = local168[Static74.anInt1679 & arg1 + arg2 - local189 - 1] = local189 * local15 / local136;
						}
						if (local140 + local158 > Static157.anInt3431) {
							local197 = Static157.anInt3431 - local140;
							Static233.method869(local168, local140, local197, local15);
							Static233.method869(local168, 0, local158 - local197, local15);
						} else {
							Static233.method869(local168, local140, local158, local15);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass17_41.method474(arg0);
		if (!super.aClass17_41.aBoolean24) {
			return local16;
		}
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		@Pc(29) int[][] local29 = super.aClass17_41.method472();
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) boolean local35 = true;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) boolean local41 = true;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50 = this.anInt2910 * Static157.anInt3431 >> 12;
		@Pc(57) int local57 = Static187.anInt4033 * this.anInt2896 >> 12;
		@Pc(64) int local64 = this.anInt2897 * Static157.anInt3431 >> 12;
		@Pc(71) int local71 = Static187.anInt4033 * this.anInt2901 >> 12;
		if (local71 <= 1) {
			return local29[arg0];
		}
		this.anInt2905 = Static157.anInt3431 / 8 * this.anInt2904 >> 12;
		@Pc(94) int local94 = Static157.anInt3431 / local50 + 1;
		@Pc(98) int[][] local98 = new int[local94][3];
		@Pc(105) Random local105 = new Random((long) this.anInt2895);
		@Pc(109) int[][] local109 = new int[local94][3];
		while (true) {
			while (true) {
				@Pc(122) int local122 = local50 + Static108.method1839(local105, local64 - local50);
				@Pc(133) int local133 = local57 + Static108.method1839(local105, local71 - local57);
				@Pc(138) int local138 = local33 + local122;
				if (local138 > Static157.anInt3431) {
					local122 = Static157.anInt3431 - local33;
					local138 = Static157.anInt3431;
				}
				@Pc(163) int local163;
				@Pc(169) int local169;
				if (local35) {
					local163 = 0;
				} else {
					@Pc(157) int[] local157 = local109[local37];
					@Pc(159) int local159 = local37;
					local163 = local157[2];
					@Pc(167) int local167 = local138 + local22;
					local169 = 0;
					if (local167 < 0) {
						local167 += Static157.anInt3431;
					}
					if (local167 > Static157.anInt3431) {
						local167 -= Static157.anInt3431;
					}
					while (true) {
						@Pc(193) int[] local193 = local109[local159];
						if (local193[0] <= local167 && local167 <= local193[1]) {
							if (local159 != local37) {
								@Pc(231) int local231 = local22 + local33;
								if (local231 < 0) {
									local231 += Static157.anInt3431;
								}
								if (Static157.anInt3431 < local231) {
									local231 -= Static157.anInt3431;
								}
								for (@Pc(253) int local253 = 1; local253 <= local169; local253++) {
									@Pc(263) int[] local263 = local109[(local253 + local37) % local39];
									local163 = Math.max(local163, local263[2]);
								}
								for (@Pc(279) int local279 = 0; local279 <= local169; local279++) {
									@Pc(290) int[] local290 = local109[(local37 + local279) % local39];
									@Pc(294) int local294 = local290[2];
									if (local163 != local294) {
										@Pc(305) int local305 = local290[1];
										@Pc(309) int local309 = local290[0];
										@Pc(327) int local327;
										@Pc(325) int local325;
										if (local231 < local167) {
											local327 = Math.max(local231, local309);
											local325 = Math.min(local167, local305);
										} else if (local309 == 0) {
											local325 = Math.min(local167, local305);
											local327 = 0;
										} else {
											local327 = Math.max(local231, local309);
											local325 = Static157.anInt3431;
										}
										this.method2242(local163 - local294, -local327 + local325, local327 + local31, local29, local105, local294);
									}
								}
							}
							local37 = local159;
							break;
						}
						local169++;
						local159++;
						if (local159 >= local39) {
							local159 = 0;
						}
					}
				}
				if (Static187.anInt4033 < local163 + local133) {
					local133 = Static187.anInt4033 - local163;
				} else {
					local41 = false;
				}
				@Pc(415) int[] local415;
				if (Static157.anInt3431 == local138) {
					this.method2242(local133, local122, local24 + local33, local29, local105, local163);
					if (local41) {
						return local16;
					}
					local41 = true;
					local37 = 0;
					local35 = false;
					local415 = local98[local43++];
					local415[2] = local133 + local163;
					local415[0] = local33;
					local39 = local43;
					local31 = local24;
					local415[1] = local138;
					local43 = 0;
					local24 = Static108.method1839(local105, Static157.anInt3431);
					@Pc(442) int[][] local442 = local109;
					local22 = local24 - local31;
					local33 = 0;
					local109 = local98;
					local98 = local442;
					local169 = local22;
					if (local22 < 0) {
						local169 = local22 + Static157.anInt3431;
					}
					if (Static157.anInt3431 < local169) {
						local169 -= Static157.anInt3431;
					}
					while (true) {
						@Pc(475) int[] local475 = local109[local37];
						if (local475[0] <= local169 && local169 <= local475[1]) {
							break;
						}
						@Pc(492) int local492 = ~local39;
						local37++;
						if (local492 >= ~local37) {
							local37 = 0;
						}
					}
				} else {
					local415 = local98[local43++];
					local415[0] = local33;
					local415[1] = local138;
					local415[2] = local133 + local163;
					this.method2242(local133, local122, local24 + local33, local29, local105, local163);
					local33 = local138;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V")
	@Override
	public void method3739() {
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2895 = arg0.method3793();
		} else if (arg1 == 1) {
			this.anInt2910 = arg0.method3805();
		} else if (arg1 == 2) {
			this.anInt2897 = arg0.method3805();
		} else if (arg1 == 3) {
			this.anInt2896 = arg0.method3805();
		} else if (arg1 == 4) {
			this.anInt2901 = arg0.method3805();
		} else if (arg1 == 5) {
			this.anInt2904 = arg0.method3805();
		} else if (arg1 == 6) {
			this.anInt2907 = arg0.method3793();
		} else if (arg1 == 7) {
			this.anInt2911 = arg0.method3805();
		} else if (arg1 == 8) {
			this.anInt2892 = arg0.method3805();
		}
	}
}
