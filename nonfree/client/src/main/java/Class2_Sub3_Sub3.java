import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class2_Sub3_Sub3 extends Class2_Sub3 {

	@OriginalMember(owner = "client!cc", name = "I", descriptor = "I")
	private int anInt2033;

	@OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
	private int anInt2037 = 1024;

	@OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
	private int anInt2038 = 0;

	@OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
	private int anInt2036 = 1024;

	@OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
	private int anInt2040 = 1024;

	@OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
	private int anInt2044 = 0;

	@OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
	private int anInt2043 = 1024;

	@OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
	private int anInt2045 = 2048;

	@OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
	private int anInt2047 = 409;

	@OriginalMember(owner = "client!cc", name = "Z", descriptor = "I")
	private int anInt2048 = 819;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2044 = arg0.method8383();
		} else if (arg1 == 1) {
			this.anInt2043 = arg0.method8326();
		} else if (arg1 == 2) {
			this.anInt2045 = arg0.method8326();
		} else if (arg1 == 3) {
			this.anInt2047 = arg0.method8326();
		} else if (arg1 == 4) {
			this.anInt2048 = arg0.method8326();
		} else if (arg1 == 5) {
			this.anInt2037 = arg0.method8326();
		} else if (arg1 == 6) {
			this.anInt2038 = arg0.method8383();
		} else if (arg1 == 7) {
			this.anInt2040 = arg0.method8326();
		} else if (arg1 == 8) {
			this.anInt2036 = arg0.method8326();
		}
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
	@Override
	public void method9152() {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II[[ILjava/util/Random;III)V")
	private void method1945(@OriginalArg(1) int arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) Random arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(21) int local21 = this.anInt2036 <= 0 ? 4096 : 4096 - Static42.method1597(this.anInt2036, arg2);
		@Pc(37) int local37 = this.anInt2033 * this.anInt2040 >> 12;
		@Pc(52) int local52 = this.anInt2033 - (local37 > 0 ? Static42.method1597(local37, arg2) : 0);
		if (Static222.anInt4971 <= arg3) {
			arg3 -= Static222.anInt4971;
		}
		@Pc(75) int local75;
		@Pc(77) int local77;
		if (local52 <= 0) {
			if (arg3 + arg5 > Static222.anInt4971) {
				local75 = Static222.anInt4971 - arg3;
				for (local77 = 0; local77 < arg0; local77++) {
					@Pc(85) int[] local85 = arg1[local77 + arg4];
					Static653.method7725(local85, arg3, local75, local21);
					Static653.method7725(local85, 0, arg5 - local75, local21);
				}
			} else {
				for (local75 = 0; local75 < arg0; local75++) {
					Static653.method7725(arg1[local75 + arg4], arg3, arg5, local21);
				}
			}
		} else if (arg0 > 0 && arg5 > 0) {
			local75 = arg5 / 2;
			local77 = arg0 / 2;
			@Pc(150) int local150 = local75 < local52 ? local75 : local52;
			@Pc(157) int local157 = local77 >= local52 ? local52 : local77;
			@Pc(162) int local162 = arg3 + local150;
			@Pc(168) int local168 = arg5 - local150 * 2;
			for (@Pc(170) int local170 = 0; local170 < arg0; local170++) {
				@Pc(179) int[] local179 = arg1[local170 + arg4];
				@Pc(192) int local192;
				@Pc(200) int local200;
				@Pc(208) int local208;
				if (local157 > local170) {
					local192 = local21 * local170 / local157;
					if (this.anInt2038 == 0) {
						for (local200 = 0; local200 < local150; local200++) {
							local208 = local21 * local200 / local150;
							local179[local200 + arg3 & Static620.anInt10845] = local179[Static620.anInt10845 & arg3 + arg5 - local200 - 1] = local192 * local208 >> 12;
						}
					} else {
						for (local200 = 0; local200 < local150; local200++) {
							local208 = local21 * local200 / local150;
							local179[Static620.anInt10845 & local200 + arg3] = local179[arg3 + arg5 - local200 - 1 & Static620.anInt10845] = local208 < local192 ? local208 : local192;
						}
					}
					if (Static222.anInt4971 >= local168 + local162) {
						Static653.method7725(local179, local162, local168, local192);
					} else {
						local200 = Static222.anInt4971 - local162;
						Static653.method7725(local179, local162, local200, local192);
						Static653.method7725(local179, 0, local168 - local200, local192);
					}
				} else {
					local192 = arg0 - local170 - 1;
					if (local192 < local157) {
						local200 = local192 * local21 / local157;
						@Pc(352) int local352;
						if (this.anInt2038 == 0) {
							for (local208 = 0; local208 < local150; local208++) {
								local352 = local21 * local208 / local150;
								local179[Static620.anInt10845 & local208 + arg3] = local179[Static620.anInt10845 & arg5 + arg3 - local208 - 1] = local352 * local200 >> 12;
							}
						} else {
							for (local208 = 0; local208 < local150; local208++) {
								local352 = local208 * local21 / local150;
								local179[Static620.anInt10845 & arg3 + local208] = local179[Static620.anInt10845 & arg5 + arg3 - local208 - 1] = local200 <= local352 ? local200 : local352;
							}
						}
						if (local168 + local162 <= Static222.anInt4971) {
							Static653.method7725(local179, local162, local168, local200);
						} else {
							local208 = Static222.anInt4971 - local162;
							Static653.method7725(local179, local162, local208, local200);
							Static653.method7725(local179, 0, local168 - local208, local200);
						}
					} else {
						for (local200 = 0; local200 < local150; local200++) {
							local179[local200 + arg3 & Static620.anInt10845] = local179[Static620.anInt10845 & arg3 + arg5 - local200 - 1] = local21 * local200 / local150;
						}
						if (Static222.anInt4971 >= local162 + local168) {
							Static653.method7725(local179, local162, local168, local21);
						} else {
							local208 = Static222.anInt4971 - local162;
							Static653.method7725(local179, local162, local208, local21);
							Static653.method7725(local179, 0, local168 - local208, local21);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass281_41.method7189(arg0);
		if (!super.aClass281_41.aBoolean607) {
			return local17;
		}
		@Pc(26) int[][] local26 = super.aClass281_41.method7183();
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = true;
		@Pc(40) boolean local40 = true;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(51) int local51 = this.anInt2043 * Static222.anInt4971 >> 12;
		@Pc(58) int local58 = Static222.anInt4971 * this.anInt2045 >> 12;
		@Pc(65) int local65 = this.anInt2047 * Static101.anInt2845 >> 12;
		@Pc(72) int local72 = Static101.anInt2845 * this.anInt2048 >> 12;
		if (local72 <= 1) {
			return local26[arg0];
		}
		this.anInt2033 = Static222.anInt4971 / 8 * this.anInt2037 >> 12;
		@Pc(95) int local95 = Static222.anInt4971 / local51 + 1;
		@Pc(99) int[][] local99 = new int[local95][3];
		@Pc(103) int[][] local103 = new int[local95][3];
		@Pc(110) Random local110 = new Random((long) this.anInt2044);
		while (true) {
			while (true) {
				@Pc(119) int local119 = local51 + Static42.method1597(local58 - local51, local110);
				@Pc(129) int local129 = Static42.method1597(local72 - local65, local110) + local65;
				@Pc(133) int local133 = local34 + local119;
				if (local133 > Static222.anInt4971) {
					local133 = Static222.anInt4971;
					local119 = Static222.anInt4971 - local34;
				}
				@Pc(146) int local146;
				@Pc(156) int local156;
				if (local40) {
					local146 = 0;
				} else {
					@Pc(150) int local150 = local36;
					@Pc(154) int[] local154 = local103[local36];
					local156 = 0;
					@Pc(160) int local160 = local28 + local133;
					if (local160 < 0) {
						local160 += Static222.anInt4971;
					}
					if (Static222.anInt4971 < local160) {
						local160 -= Static222.anInt4971;
					}
					while (true) {
						@Pc(181) int[] local181 = local103[local150];
						if (local160 >= local181[0] && local181[1] >= local160) {
							local146 = local154[2];
							if (local150 != local36) {
								@Pc(216) int local216 = local34 + local28;
								if (local216 < 0) {
									local216 += Static222.anInt4971;
								}
								if (local216 > Static222.anInt4971) {
									local216 -= Static222.anInt4971;
								}
								for (@Pc(235) int local235 = 1; local235 <= local156; local235++) {
									@Pc(245) int[] local245 = local103[(local235 + local36) % local42];
									local146 = Math.max(local146, local245[2]);
								}
								for (@Pc(261) int local261 = 0; local261 <= local156; local261++) {
									@Pc(272) int[] local272 = local103[(local36 + local261) % local42];
									@Pc(276) int local276 = local272[2];
									if (local276 != local146) {
										@Pc(287) int local287 = local272[0];
										@Pc(291) int local291 = local272[1];
										@Pc(303) int local303;
										@Pc(305) int local305;
										if (local216 < local160) {
											local303 = Math.max(local216, local287);
											local305 = Math.min(local160, local291);
										} else if (local287 == 0) {
											local303 = 0;
											local305 = Math.min(local160, local291);
										} else {
											local303 = Math.max(local216, local287);
											local305 = Static222.anInt4971;
										}
										this.method1945(local146 - local276, local26, local110, local32 + local303, local276, local305 - local303);
									}
								}
							}
							local36 = local150;
							break;
						}
						local150++;
						if (local150 >= local42) {
							local150 = 0;
						}
						local156++;
					}
				}
				if (local129 + local146 <= Static101.anInt2845) {
					local38 = false;
				} else {
					local129 = Static101.anInt2845 - local146;
				}
				@Pc(379) int[] local379;
				if (Static222.anInt4971 == local133) {
					this.method1945(local129, local26, local110, local34 + local30, local146, local119);
					if (local38) {
						return local17;
					}
					local38 = true;
					local379 = local99[local44++];
					local379[1] = local133;
					local379[2] = local129 + local146;
					local379[0] = local34;
					@Pc(444) int[][] local444 = local103;
					local103 = local99;
					local99 = local444;
					local42 = local44;
					local32 = local30;
					local44 = 0;
					local30 = Static42.method1597(Static222.anInt4971, local110);
					local28 = local30 - local32;
					local34 = 0;
					local156 = local28;
					if (local28 < 0) {
						local156 = local28 + Static222.anInt4971;
					}
					local36 = 0;
					if (Static222.anInt4971 < local156) {
						local156 -= Static222.anInt4971;
					}
					local40 = false;
					while (true) {
						@Pc(496) int[] local496 = local103[local36];
						if (local156 >= local496[0] && local156 <= local496[1]) {
							break;
						}
						local36++;
						if (local36 >= local42) {
							local36 = 0;
						}
					}
				} else {
					local379 = local99[local44++];
					local379[1] = local133;
					local379[0] = local34;
					local379[2] = local129 + local146;
					this.method1945(local129, local26, local110, local34 + local30, local146, local119);
					local34 = local133;
				}
			}
		}
	}
}
