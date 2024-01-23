import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class2_Sub1_Sub31 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ra", name = "ab", descriptor = "I")
	private int anInt3861;

	@OriginalMember(owner = "client!ra", name = "U", descriptor = "I")
	private int anInt3857 = 1024;

	@OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
	private int anInt3854 = 1024;

	@OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
	private int anInt3855 = 1024;

	@OriginalMember(owner = "client!ra", name = "db", descriptor = "I")
	private int anInt3864 = 2048;

	@OriginalMember(owner = "client!ra", name = "fb", descriptor = "I")
	private int anInt3865 = 1024;

	@OriginalMember(owner = "client!ra", name = "hb", descriptor = "I")
	private int anInt3867 = 0;

	@OriginalMember(owner = "client!ra", name = "kb", descriptor = "I")
	private int anInt3870 = 0;

	@OriginalMember(owner = "client!ra", name = "jb", descriptor = "I")
	private int anInt3869 = 819;

	@OriginalMember(owner = "client!ra", name = "cb", descriptor = "I")
	private int anInt3863 = 409;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass73_41.method2249(arg0);
		if (!super.aClass73_41.aBoolean188) {
			return local7;
		}
		@Pc(28) int[][] local28 = super.aClass73_41.method2246();
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) boolean local40 = true;
		@Pc(42) boolean local42 = true;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = this.anInt3865 * Static62.anInt1675 >> 12;
		@Pc(53) int local53 = 0;
		@Pc(60) int local60 = this.anInt3864 * Static62.anInt1675 >> 12;
		@Pc(67) int local67 = Static25.anInt4767 * this.anInt3863 >> 12;
		@Pc(74) int local74 = Static25.anInt4767 * this.anInt3869 >> 12;
		if (local74 <= 1) {
			return local28[arg0];
		}
		this.anInt3861 = this.anInt3855 * (Static62.anInt1675 / 8) >> 12;
		@Pc(97) int local97 = Static62.anInt1675 / local51 + 1;
		@Pc(101) int[][] local101 = new int[local97][3];
		@Pc(108) Random local108 = new Random((long) this.anInt3867);
		@Pc(112) int[][] local112 = new int[local97][3];
		while (true) {
			while (true) {
				@Pc(123) int local123 = local51 + Static105.method1788(local60 - local51, local108);
				@Pc(127) int local127 = local123 + local36;
				@Pc(137) int local137 = local67 + Static105.method1788(local74 - local67, local108);
				if (local127 > Static62.anInt1675) {
					local127 = Static62.anInt1675;
					local123 = Static62.anInt1675 - local36;
				}
				@Pc(160) int local160;
				@Pc(156) int local156;
				if (local42) {
					local160 = 0;
				} else {
					@Pc(150) int local150 = local38;
					@Pc(154) int[] local154 = local112[local38];
					local156 = 0;
					local160 = local154[2];
					@Pc(165) int local165 = local127 + local30;
					if (local165 < 0) {
						local165 += Static62.anInt1675;
					}
					if (Static62.anInt1675 < local165) {
						local165 -= Static62.anInt1675;
					}
					while (true) {
						@Pc(186) int[] local186 = local112[local150];
						if (local165 >= local186[0] && local165 <= local186[1]) {
							if (local38 != local150) {
								@Pc(220) int local220 = local30 + local36;
								if (local220 < 0) {
									local220 += Static62.anInt1675;
								}
								if (local220 > Static62.anInt1675) {
									local220 -= Static62.anInt1675;
								}
								for (@Pc(239) int local239 = 1; local239 <= local156; local239++) {
									@Pc(249) int[] local249 = local112[(local239 + local38) % local53];
									local160 = Math.max(local160, local249[2]);
								}
								for (@Pc(265) int local265 = 0; local265 <= local156; local265++) {
									@Pc(276) int[] local276 = local112[(local38 + local265) % local53];
									@Pc(280) int local280 = local276[2];
									if (local280 != local160) {
										@Pc(287) int local287 = local276[1];
										@Pc(291) int local291 = local276[0];
										@Pc(306) int local306;
										@Pc(304) int local304;
										if (local165 > local220) {
											local306 = Math.max(local220, local291);
											local304 = Math.min(local165, local287);
										} else if (local291 == 0) {
											local304 = Math.min(local165, local287);
											local306 = 0;
										} else {
											local306 = Math.max(local220, local291);
											local304 = Static62.anInt1675;
										}
										this.method2688(local108, local28, local34 + local306, local280, local304 - local306, local160 - local280);
									}
								}
							}
							local38 = local150;
							break;
						}
						local150++;
						if (local150 >= local53) {
							local150 = 0;
						}
						local156++;
					}
				}
				if (local137 + local160 <= Static25.anInt4767) {
					local40 = false;
				} else {
					local137 = Static25.anInt4767 - local160;
				}
				@Pc(390) int[] local390;
				if (Static62.anInt1675 == local127) {
					this.method2688(local108, local28, local36 + local32, local160, local123, local137);
					if (local40) {
						return local7;
					}
					local40 = true;
					local38 = 0;
					local42 = false;
					local390 = local101[local44++];
					local390[2] = local160 + local137;
					@Pc(398) int[][] local398 = local112;
					local53 = local44;
					local390[0] = local36;
					local36 = 0;
					local112 = local101;
					local34 = local32;
					local44 = 0;
					local390[1] = local127;
					local101 = local398;
					local32 = Static105.method1788(Static62.anInt1675, local108);
					local30 = local32 - local34;
					local156 = local30;
					if (local30 < 0) {
						local156 = local30 + Static62.anInt1675;
					}
					if (local156 > Static62.anInt1675) {
						local156 -= Static62.anInt1675;
					}
					while (true) {
						@Pc(453) int[] local453 = local112[local38];
						if (local156 >= local453[0] && local453[1] >= local156) {
							break;
						}
						local38++;
						if (local38 >= local53) {
							local38 = 0;
						}
					}
				} else {
					local390 = local101[local44++];
					local390[0] = local36;
					local390[2] = local137 + local160;
					local390[1] = local127;
					this.method2688(local108, local28, local36 + local32, local160, local123, local137);
					local36 = local127;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/util/Random;[[IIIIZI)V")
	private void method2688(@OriginalArg(0) Random arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = this.anInt3854 <= 0 ? 4096 : 4096 - Static105.method1788(this.anInt3854, arg0);
		@Pc(30) int local30 = this.anInt3857 * this.anInt3861 >> 12;
		@Pc(46) int local46 = this.anInt3861 - (local30 <= 0 ? 0 : Static105.method1788(local30, arg0));
		if (Static62.anInt1675 <= arg2) {
			arg2 -= Static62.anInt1675;
		}
		@Pc(72) int local72;
		@Pc(74) int local74;
		if (local46 > 0) {
			if (arg5 <= 0 || arg4 <= 0) {
				return;
			}
			local72 = arg4 / 2;
			local74 = arg5 / 2;
			@Pc(148) int local148 = local74 >= local46 ? local46 : local74;
			@Pc(155) int local155 = local72 >= local46 ? local46 : local72;
			@Pc(159) int local159 = local155 + arg2;
			@Pc(166) int local166 = arg4 - local155 * 2;
			for (@Pc(168) int local168 = 0; local168 < arg5; local168++) {
				@Pc(176) int[] local176 = arg1[arg3 + local168];
				@Pc(185) int local185;
				@Pc(193) int local193;
				@Pc(201) int local201;
				if (local148 > local168) {
					local185 = local22 * local168 / local148;
					if (this.anInt3870 == 0) {
						for (local193 = 0; local193 < local155; local193++) {
							local201 = local22 * local193 / local155;
							local176[arg2 + local193 & Static41.anInt1259] = local176[arg4 + arg2 - local193 - 1 & Static41.anInt1259] = local185 * local201 >> 12;
						}
					} else {
						for (local193 = 0; local193 < local155; local193++) {
							local201 = local193 * local22 / local155;
							local176[local193 + arg2 & Static41.anInt1259] = local176[arg2 + arg4 - local193 - 1 & Static41.anInt1259] = local185 <= local201 ? local185 : local201;
						}
					}
					if (Static62.anInt1675 < local166 + local159) {
						local193 = Static62.anInt1675 - local159;
						Static225.method1840(local176, local159, local193, local185);
						Static225.method1840(local176, 0, local166 - local193, local185);
					} else {
						Static225.method1840(local176, local159, local166, local185);
					}
				} else {
					local185 = arg5 - local168 - 1;
					if (local148 > local185) {
						local193 = local185 * local22 / local148;
						@Pc(351) int local351;
						if (this.anInt3870 == 0) {
							for (local201 = 0; local201 < local155; local201++) {
								local351 = local22 * local201 / local155;
								local176[Static41.anInt1259 & local201 + arg2] = local176[Static41.anInt1259 & arg2 + arg4 - local201 - 1] = local351 * local193 >> 12;
							}
						} else {
							for (local201 = 0; local201 < local155; local201++) {
								local351 = local201 * local22 / local155;
								local176[Static41.anInt1259 & local201 + arg2] = local176[Static41.anInt1259 & arg2 + arg4 - local201 - 1] = local193 <= local351 ? local193 : local351;
							}
						}
						if (Static62.anInt1675 >= local159 + local166) {
							Static225.method1840(local176, local159, local166, local193);
						} else {
							local201 = Static62.anInt1675 - local159;
							Static225.method1840(local176, local159, local201, local193);
							Static225.method1840(local176, 0, local166 - local201, local193);
						}
					} else {
						for (local193 = 0; local193 < local155; local193++) {
							local176[local193 + arg2 & Static41.anInt1259] = local176[Static41.anInt1259 & arg4 + arg2 - local193 - 1] = local22 * local193 / local155;
						}
						if (local166 + local159 <= Static62.anInt1675) {
							Static225.method1840(local176, local159, local166, local22);
						} else {
							local201 = Static62.anInt1675 - local159;
							Static225.method1840(local176, local159, local201, local22);
							Static225.method1840(local176, 0, local166 - local201, local22);
						}
					}
				}
			}
		} else if (arg4 + arg2 > Static62.anInt1675) {
			local72 = Static62.anInt1675 - arg2;
			for (local74 = 0; local74 < arg5; local74++) {
				@Pc(82) int[] local82 = arg1[arg3 + local74];
				Static225.method1840(local82, arg2, local72, local22);
				Static225.method1840(local82, 0, arg4 - local72, local22);
			}
		} else {
			for (local72 = 0; local72 < arg5; local72++) {
				Static225.method1840(arg1[local72 + arg3], arg2, arg4, local22);
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3867 = arg0.method209();
		} else if (arg1 == 1) {
			this.anInt3865 = arg0.method163();
		} else if (arg1 == 2) {
			this.anInt3864 = arg0.method163();
		} else if (arg1 == 3) {
			this.anInt3863 = arg0.method163();
		} else if (arg1 == 4) {
			this.anInt3869 = arg0.method163();
		} else if (arg1 == 5) {
			this.anInt3855 = arg0.method163();
		} else if (arg1 == 6) {
			this.anInt3870 = arg0.method209();
		} else if (arg1 == 7) {
			this.anInt3857 = arg0.method163();
		} else if (arg1 == 8) {
			this.anInt3854 = arg0.method163();
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V")
	@Override
	public void method3207() {
	}
}
