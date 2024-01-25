import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class1_Sub3_Sub11 extends Class1_Sub3 {

	@OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
	private int anInt2071;

	@OriginalMember(owner = "client!fd", name = "R", descriptor = "I")
	private int anInt2068 = 1024;

	@OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
	private int anInt2065 = 0;

	@OriginalMember(owner = "client!fd", name = "P", descriptor = "I")
	private int anInt2067 = 819;

	@OriginalMember(owner = "client!fd", name = "Y", descriptor = "I")
	private int anInt2075 = 2048;

	@OriginalMember(owner = "client!fd", name = "X", descriptor = "I")
	private int anInt2074 = 1024;

	@OriginalMember(owner = "client!fd", name = "V", descriptor = "I")
	private int anInt2072 = 1024;

	@OriginalMember(owner = "client!fd", name = "Z", descriptor = "I")
	private int anInt2076 = 1024;

	@OriginalMember(owner = "client!fd", name = "ab", descriptor = "I")
	private int anInt2077 = 409;

	@OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
	private int anInt2066 = 0;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass122_41.method3385(arg0);
		if (!super.aClass122_41.aBoolean342) {
			return local11;
		}
		@Pc(28) int[][] local28 = super.aClass122_41.method3384();
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) boolean local40 = true;
		@Pc(42) boolean local42 = true;
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		@Pc(53) int local53 = Static153.anInt3378 * this.anInt2068 >> 12;
		@Pc(60) int local60 = Static153.anInt3378 * this.anInt2075 >> 12;
		@Pc(67) int local67 = Static319.anInt6144 * this.anInt2077 >> 12;
		@Pc(74) int local74 = this.anInt2067 * Static319.anInt6144 >> 12;
		if (local74 <= 1) {
			return local28[arg0];
		}
		this.anInt2071 = this.anInt2072 * (Static153.anInt3378 / 8) >> 12;
		@Pc(99) int local99 = Static153.anInt3378 / local53 + 1;
		@Pc(103) int[][] local103 = new int[local99][3];
		@Pc(107) int[][] local107 = new int[local99][3];
		@Pc(114) Random local114 = new Random((long) this.anInt2066);
		while (true) {
			while (true) {
				@Pc(123) int local123 = local53 + Static295.method4970(local114, local60 - local53);
				@Pc(133) int local133 = Static295.method4970(local114, local74 - local67) + local67;
				@Pc(137) int local137 = local36 + local123;
				if (local137 > Static153.anInt3378) {
					local123 = Static153.anInt3378 - local36;
					local137 = Static153.anInt3378;
				}
				@Pc(150) int local150;
				@Pc(160) int local160;
				if (local42) {
					local150 = 0;
				} else {
					@Pc(154) int local154 = local38;
					@Pc(158) int[] local158 = local107[local38];
					local160 = 0;
					@Pc(164) int local164 = local137 + local30;
					if (local164 < 0) {
						local164 += Static153.anInt3378;
					}
					if (Static153.anInt3378 < local164) {
						local164 -= Static153.anInt3378;
					}
					local150 = local158[2];
					while (true) {
						@Pc(192) int[] local192 = local107[local154];
						if (local192[0] <= local164 && local192[1] >= local164) {
							if (local38 != local154) {
								@Pc(230) int local230 = local30 + local36;
								if (local230 < 0) {
									local230 += Static153.anInt3378;
								}
								if (Static153.anInt3378 < local230) {
									local230 -= Static153.anInt3378;
								}
								for (@Pc(245) int local245 = 1; local245 <= local160; local245++) {
									@Pc(256) int[] local256 = local107[(local38 + local245) % local44];
									local150 = Math.max(local150, local256[2]);
								}
								for (@Pc(268) int local268 = 0; local268 <= local160; local268++) {
									@Pc(278) int[] local278 = local107[(local268 + local38) % local44];
									@Pc(282) int local282 = local278[2];
									if (local282 != local150) {
										@Pc(289) int local289 = local278[0];
										@Pc(293) int local293 = local278[1];
										@Pc(300) int local300;
										@Pc(304) int local304;
										if (local230 < local164) {
											local300 = Math.max(local230, local289);
											local304 = Math.min(local164, local293);
										} else if (local289 == 0) {
											local300 = 0;
											local304 = Math.min(local164, local293);
										} else {
											local300 = Math.max(local230, local289);
											local304 = Static153.anInt3378;
										}
										this.method1811(local282, local300 + local34, -local300 + local304, local114, local150 - local282, local28);
									}
								}
							}
							local38 = local154;
							break;
						}
						local154++;
						if (local44 <= local154) {
							local154 = 0;
						}
						local160++;
					}
				}
				if (Static319.anInt6144 < local150 + local133) {
					local133 = Static319.anInt6144 - local150;
				} else {
					local40 = false;
				}
				@Pc(379) int[] local379;
				if (local137 == Static153.anInt3378) {
					this.method1811(local150, local36 + local32, local123, local114, local133, local28);
					if (local40) {
						return local11;
					}
					local40 = true;
					local379 = local103[local46++];
					local379[2] = local133 + local150;
					local379[1] = local137;
					local379[0] = local36;
					@Pc(445) int[][] local445 = local107;
					local107 = local103;
					local103 = local445;
					local44 = local46;
					local34 = local32;
					local46 = 0;
					local32 = Static295.method4970(local114, Static153.anInt3378);
					local36 = 0;
					local30 = local32 - local34;
					local160 = local30;
					if (local30 < 0) {
						local160 = local30 + Static153.anInt3378;
					}
					if (Static153.anInt3378 < local160) {
						local160 -= Static153.anInt3378;
					}
					local38 = 0;
					local42 = false;
					while (true) {
						@Pc(490) int[] local490 = local107[local38];
						if (local160 >= local490[0] && local490[1] >= local160) {
							break;
						}
						@Pc(511) int local511 = ~local44;
						local38++;
						if (local511 >= ~local38) {
							local38 = 0;
						}
					}
				} else {
					local379 = local103[local46++];
					local379[1] = local137;
					local379[2] = local150 + local133;
					local379[0] = local36;
					this.method1811(local150, local32 + local36, local123, local114, local133, local28);
					local36 = local137;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZIIILjava/util/Random;I[[I)V")
	private void method1811(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Random arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(22) int local22 = this.anInt2074 <= 0 ? 4096 : 4096 - Static295.method4970(arg3, this.anInt2074);
		@Pc(30) int local30 = this.anInt2071 * this.anInt2076 >> 12;
		@Pc(45) int local45 = this.anInt2071 - (local30 <= 0 ? 0 : Static295.method4970(arg3, local30));
		if (Static153.anInt3378 <= arg1) {
			arg1 -= Static153.anInt3378;
		}
		@Pc(76) int local76;
		@Pc(99) int local99;
		if (local45 <= 0) {
			if (arg2 + arg1 <= Static153.anInt3378) {
				for (local76 = 0; local76 < arg4; local76++) {
					Static361.method1333(arg5[local76 + arg0], arg1, arg2, local22);
				}
			} else {
				local76 = Static153.anInt3378 - arg1;
				for (local99 = 0; local99 < arg4; local99++) {
					@Pc(107) int[] local107 = arg5[arg0 + local99];
					Static361.method1333(local107, arg1, local76, local22);
					Static361.method1333(local107, 0, arg2 - local76, local22);
				}
			}
		} else if (arg4 > 0 && arg2 > 0) {
			local76 = arg2 / 2;
			local99 = arg4 / 2;
			@Pc(149) int local149 = local45 <= local76 ? local45 : local76;
			@Pc(160) int local160 = local99 >= local45 ? local45 : local99;
			@Pc(164) int local164 = local149 + arg1;
			@Pc(171) int local171 = arg2 - local149 * 2;
			for (@Pc(173) int local173 = 0; local173 < arg4; local173++) {
				@Pc(182) int[] local182 = arg5[local173 + arg0];
				@Pc(191) int local191;
				@Pc(196) int local196;
				@Pc(204) int local204;
				if (local160 > local173) {
					local191 = local22 * local173 / local160;
					if (this.anInt2065 == 0) {
						for (local196 = 0; local196 < local149; local196++) {
							local204 = local196 * local22 / local149;
							local182[Static250.anInt5127 & arg1 + local196] = local182[arg2 + arg1 - local196 - 1 & Static250.anInt5127] = local204 * local191 >> 12;
						}
					} else {
						for (local196 = 0; local196 < local149; local196++) {
							local204 = local22 * local196 / local149;
							local182[local196 + arg1 & Static250.anInt5127] = local182[arg2 + arg1 - local196 - 1 & Static250.anInt5127] = local204 < local191 ? local204 : local191;
						}
					}
					if (local171 + local164 <= Static153.anInt3378) {
						Static361.method1333(local182, local164, local171, local191);
					} else {
						local196 = Static153.anInt3378 - local164;
						Static361.method1333(local182, local164, local196, local191);
						Static361.method1333(local182, 0, local171 - local196, local191);
					}
				} else {
					local191 = arg4 - local173 - 1;
					if (local191 < local160) {
						local196 = local191 * local22 / local160;
						@Pc(353) int local353;
						if (this.anInt2065 == 0) {
							for (local204 = 0; local204 < local149; local204++) {
								local353 = local22 * local204 / local149;
								local182[arg1 + local204 & Static250.anInt5127] = local182[arg1 + arg2 - local204 - 1 & Static250.anInt5127] = local196 * local353 >> 12;
							}
						} else {
							for (local204 = 0; local204 < local149; local204++) {
								local353 = local204 * local22 / local149;
								local182[arg1 + local204 & Static250.anInt5127] = local182[Static250.anInt5127 & arg1 + arg2 - local204 - 1] = local196 > local353 ? local353 : local196;
							}
						}
						if (Static153.anInt3378 >= local171 + local164) {
							Static361.method1333(local182, local164, local171, local196);
						} else {
							local204 = Static153.anInt3378 - local164;
							Static361.method1333(local182, local164, local204, local196);
							Static361.method1333(local182, 0, local171 - local204, local196);
						}
					} else {
						for (local196 = 0; local196 < local149; local196++) {
							local182[arg1 + local196 & Static250.anInt5127] = local182[arg1 + arg2 - local196 - 1 & Static250.anInt5127] = local196 * local22 / local149;
						}
						if (Static153.anInt3378 < local171 + local164) {
							local204 = Static153.anInt3378 - local164;
							Static361.method1333(local182, local164, local204, local22);
							Static361.method1333(local182, 0, local171 - local204, local22);
						} else {
							Static361.method1333(local182, local164, local171, local22);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)V")
	@Override
	public void method5535() {
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2066 = arg1.method4532();
		} else if (arg0 == 1) {
			this.anInt2068 = arg1.method4556();
		} else if (arg0 == 2) {
			this.anInt2075 = arg1.method4556();
		} else if (arg0 == 3) {
			this.anInt2077 = arg1.method4556();
		} else if (arg0 == 4) {
			this.anInt2067 = arg1.method4556();
		} else if (arg0 == 5) {
			this.anInt2072 = arg1.method4556();
		} else if (arg0 == 6) {
			this.anInt2065 = arg1.method4532();
		} else if (arg0 == 7) {
			this.anInt2076 = arg1.method4556();
		} else if (arg0 == 8) {
			this.anInt2074 = arg1.method4556();
		}
	}
}
