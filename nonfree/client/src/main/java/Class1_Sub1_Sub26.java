import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class1_Sub1_Sub26 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pd", name = "db", descriptor = "I")
	private int anInt3246;

	@OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
	private int anInt3238 = 1024;

	@OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
	private int anInt3237 = 1024;

	@OriginalMember(owner = "client!pd", name = "bb", descriptor = "I")
	private int anInt3244 = 819;

	@OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
	private int anInt3239 = 1024;

	@OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
	private int anInt3247 = 409;

	@OriginalMember(owner = "client!pd", name = "cb", descriptor = "I")
	private int anInt3245 = 2048;

	@OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
	private int anInt3240 = 0;

	@OriginalMember(owner = "client!pd", name = "ib", descriptor = "I")
	private int anInt3250 = 0;

	@OriginalMember(owner = "client!pd", name = "lb", descriptor = "I")
	private int anInt3252 = 1024;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass40_41.method1362(arg0);
		if (!super.aClass40_41.aBoolean86) {
			return local16;
		}
		@Pc(27) int[][] local27 = super.aClass40_41.method1363();
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) boolean local35 = true;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) boolean local41 = true;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50 = Static31.anInt857 * this.anInt3247 >> 12;
		@Pc(52) int local52 = 0;
		@Pc(59) int local59 = this.anInt3238 * Static115.anInt2578 >> 12;
		@Pc(66) int local66 = Static115.anInt2578 * this.anInt3245 >> 12;
		@Pc(73) int local73 = Static31.anInt857 * this.anInt3244 >> 12;
		if (local73 <= 1) {
			return local27[arg0];
		}
		this.anInt3246 = this.anInt3252 * (Static115.anInt2578 / 8) >> 12;
		@Pc(96) int local96 = Static115.anInt2578 / local59 + 1;
		@Pc(100) int[][] local100 = new int[local96][3];
		@Pc(104) int[][] local104 = new int[local96][3];
		@Pc(111) Random local111 = new Random((long) this.anInt3240);
		while (true) {
			while (true) {
				@Pc(122) int local122 = local59 + Static132.method2265(local66 - local59, local111);
				@Pc(131) int local131 = Static132.method2265(local73 - local50, local111) + local50;
				@Pc(135) int local135 = local52 + local122;
				if (Static115.anInt2578 < local135) {
					local122 = Static115.anInt2578 - local52;
					local135 = Static115.anInt2578;
				}
				@Pc(148) int local148;
				@Pc(156) int local156;
				if (local41) {
					local148 = 0;
				} else {
					@Pc(154) int[] local154 = local104[local37];
					local156 = 0;
					local148 = local154[2];
					@Pc(165) int local165 = local135 + local29;
					@Pc(167) int local167 = local37;
					if (local165 < 0) {
						local165 += Static115.anInt2578;
					}
					if (local165 > Static115.anInt2578) {
						local165 -= Static115.anInt2578;
					}
					while (true) {
						@Pc(191) int[] local191 = local104[local167];
						if (local191[0] <= local165 && local165 <= local191[1]) {
							if (local167 != local37) {
								@Pc(225) int local225 = local29 + local52;
								if (local225 < 0) {
									local225 += Static115.anInt2578;
								}
								if (local225 > Static115.anInt2578) {
									local225 -= Static115.anInt2578;
								}
								for (@Pc(243) int local243 = 1; local243 <= local156; local243++) {
									@Pc(253) int[] local253 = local104[(local37 + local243) % local39];
									local148 = Math.max(local148, local253[2]);
								}
								for (@Pc(265) int local265 = 0; local265 <= local156; local265++) {
									@Pc(275) int[] local275 = local104[(local265 + local37) % local39];
									@Pc(279) int local279 = local275[2];
									if (local279 != local148) {
										@Pc(290) int local290 = local275[0];
										@Pc(294) int local294 = local275[1];
										@Pc(306) int local306;
										@Pc(308) int local308;
										if (local225 < local165) {
											local306 = Math.max(local225, local290);
											local308 = Math.min(local165, local294);
										} else if (local290 == 0) {
											local308 = Math.min(local165, local294);
											local306 = 0;
										} else {
											local306 = Math.max(local225, local290);
											local308 = Static115.anInt2578;
										}
										this.method2513(local111, local148 - local279, local27, local33 + local306, local308 + -local306, local279);
									}
								}
							}
							local37 = local167;
							break;
						}
						local167++;
						if (local167 >= local39) {
							local167 = 0;
						}
						local156++;
					}
				}
				if (local131 + local148 <= Static31.anInt857) {
					local35 = false;
				} else {
					local131 = Static31.anInt857 - local148;
				}
				@Pc(374) int[] local374;
				if (Static115.anInt2578 == local135) {
					this.method2513(local111, local131, local27, local52 + local31, local122, local148);
					if (local35) {
						return local16;
					}
					local35 = true;
					local37 = 0;
					local41 = false;
					local33 = local31;
					local374 = local100[local43++];
					local374[1] = local135;
					local374[0] = local52;
					@Pc(441) int[][] local441 = local104;
					local39 = local43;
					local104 = local100;
					local374[2] = local131 + local148;
					local100 = local441;
					local43 = 0;
					local52 = 0;
					local31 = Static132.method2265(Static115.anInt2578, local111);
					local29 = local31 - local33;
					local156 = local29;
					if (local29 < 0) {
						local156 = local29 + Static115.anInt2578;
					}
					if (local156 > Static115.anInt2578) {
						local156 -= Static115.anInt2578;
					}
					while (true) {
						@Pc(491) int[] local491 = local104[local37];
						if (local491[0] <= local156 && local156 <= local491[1]) {
							break;
						}
						local37++;
						if (local39 <= local37) {
							local37 = 0;
						}
					}
				} else {
					local374 = local100[local43++];
					local374[2] = local148 + local131;
					local374[0] = local52;
					local374[1] = local135;
					this.method2513(local111, local131, local27, local31 + local52, local122, local148);
					local52 = local135;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V")
	@Override
	public void method3569() {
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3240 = arg0.method2771();
		} else if (arg1 == 1) {
			this.anInt3238 = arg0.method2765();
		} else if (arg1 == 2) {
			this.anInt3245 = arg0.method2765();
		} else if (arg1 == 3) {
			this.anInt3247 = arg0.method2765();
		} else if (arg1 == 4) {
			this.anInt3244 = arg0.method2765();
		} else if (arg1 == 5) {
			this.anInt3252 = arg0.method2765();
		} else if (arg1 == 6) {
			this.anInt3250 = arg0.method2771();
		} else if (arg1 == 7) {
			this.anInt3239 = arg0.method2765();
		} else if (arg1 == 8) {
			this.anInt3237 = arg0.method2765();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/util/Random;I[[IIIII)V")
	private void method2513(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = this.anInt3237 > 0 ? 4096 - Static132.method2265(this.anInt3237, arg0) : 4096;
		@Pc(30) int local30 = this.anInt3246 * this.anInt3239 >> 12;
		@Pc(43) int local43 = this.anInt3246 - (local30 <= 0 ? 0 : Static132.method2265(local30, arg0));
		if (arg3 >= Static115.anInt2578) {
			arg3 -= Static115.anInt2578;
		}
		@Pc(91) int local91;
		@Pc(76) int local76;
		if (local43 > 0) {
			if (arg1 > 0 && arg4 > 0) {
				local76 = arg1 / 2;
				@Pc(87) int local87 = local76 < local43 ? local76 : local43;
				local91 = arg4 / 2;
				@Pc(102) int local102 = local43 > local91 ? local91 : local43;
				@Pc(106) int local106 = local102 + arg3;
				@Pc(112) int local112 = arg4 - local102 * 2;
				for (@Pc(114) int local114 = 0; local114 < arg1; local114++) {
					@Pc(123) int[] local123 = arg2[local114 + arg5];
					@Pc(136) int local136;
					@Pc(144) int local144;
					@Pc(152) int local152;
					if (local87 > local114) {
						local136 = local22 * local114 / local87;
						if (this.anInt3250 == 0) {
							for (local144 = 0; local144 < local102; local144++) {
								local152 = local144 * local22 / local102;
								local123[arg3 + local144 & Static48.anInt1202] = local123[Static48.anInt1202 & arg3 + arg4 - local144 - 1] = local136 * local152 >> 12;
							}
						} else {
							for (local144 = 0; local144 < local102; local144++) {
								local152 = local22 * local144 / local102;
								local123[local144 + arg3 & Static48.anInt1202] = local123[Static48.anInt1202 & arg3 + arg4 - local144 - 1] = local152 >= local136 ? local136 : local152;
							}
						}
						if (local112 + local106 <= Static115.anInt2578) {
							Static214.method349(local123, local106, local112, local136);
						} else {
							local144 = Static115.anInt2578 - local106;
							Static214.method349(local123, local106, local144, local136);
							Static214.method349(local123, 0, local112 - local144, local136);
						}
					} else {
						local136 = arg1 - local114 - 1;
						if (local136 < local87) {
							local144 = local22 * local136 / local87;
							@Pc(297) int local297;
							if (this.anInt3250 == 0) {
								for (local152 = 0; local152 < local102; local152++) {
									local297 = local22 * local152 / local102;
									local123[local152 + arg3 & Static48.anInt1202] = local123[Static48.anInt1202 & arg3 + arg4 - local152 - 1] = local144 * local297 >> 12;
								}
							} else {
								for (local152 = 0; local152 < local102; local152++) {
									local297 = local152 * local22 / local102;
									local123[arg3 + local152 & Static48.anInt1202] = local123[Static48.anInt1202 & arg3 + arg4 - local152 - 1] = local144 <= local297 ? local144 : local297;
								}
							}
							if (Static115.anInt2578 < local106 + local112) {
								local152 = Static115.anInt2578 - local106;
								Static214.method349(local123, local106, local152, local144);
								Static214.method349(local123, 0, local112 - local152, local144);
							} else {
								Static214.method349(local123, local106, local112, local144);
							}
						} else {
							for (local144 = 0; local144 < local102; local144++) {
								local123[arg3 + local144 & Static48.anInt1202] = local123[Static48.anInt1202 & arg4 + arg3 - local144 - 1] = local144 * local22 / local102;
							}
							if (local106 + local112 <= Static115.anInt2578) {
								Static214.method349(local123, local106, local112, local22);
							} else {
								local152 = Static115.anInt2578 - local106;
								Static214.method349(local123, local106, local152, local22);
								Static214.method349(local123, 0, local112 - local152, local22);
							}
						}
					}
				}
			}
		} else if (arg3 + arg4 <= Static115.anInt2578) {
			for (local91 = 0; local91 < arg1; local91++) {
				Static214.method349(arg2[arg5 + local91], arg3, arg4, local22);
			}
		} else {
			local91 = Static115.anInt2578 - arg3;
			for (local76 = 0; local76 < arg1; local76++) {
				@Pc(534) int[] local534 = arg2[local76 + arg5];
				Static214.method349(local534, arg3, local91, local22);
				Static214.method349(local534, 0, arg4 - local91, local22);
			}
		}
	}
}
