import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!aj", name = "O", descriptor = "I")
	private int anInt266;

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "Lclient!lc;")
	private final Class109_Sub2 aClass109_Sub2_1;

	@OriginalMember(owner = "client!aj", name = "v", descriptor = "Lclient!gu;")
	private final Class5_Sub18 aClass5_Sub18_1;

	@OriginalMember(owner = "client!aj", name = "A", descriptor = "Lclient!ck;")
	private final Class65_Sub1 aClass65_Sub1_1;

	@OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
	private final int anInt258;

	@OriginalMember(owner = "client!aj", name = "D", descriptor = "I")
	private final int anInt261;

	@OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
	private final int anInt265;

	@OriginalMember(owner = "client!aj", name = "I", descriptor = "I")
	private final int anInt264;

	@OriginalMember(owner = "client!aj", name = "Q", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!aj", name = "C", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!aj", name = "G", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "Lclient!mc;")
	private Class5_Sub41 aClass5_Sub41_1;

	@OriginalMember(owner = "client!aj", name = "F", descriptor = "Lclient!qca;")
	private Class5_Sub41_Sub1 aClass5_Sub41_Sub1_1;

	@OriginalMember(owner = "client!aj", name = "z", descriptor = "Lclient!rda;")
	private Class300 aClass300_2;

	@OriginalMember(owner = "client!aj", name = "L", descriptor = "Lclient!pm;")
	private final Interface23 anInterface23_1;

	@OriginalMember(owner = "client!aj", name = "x", descriptor = "Lclient!nk;")
	private final Interface17 anInterface17_1;

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "Lclient!dea;")
	private final Class79 aClass79_1;

	@OriginalMember(owner = "client!aj", name = "N", descriptor = "Lclient!dea;")
	private final Class79 aClass79_2;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lclient!ck;Lclient!lc;Lclient!gu;[I)V")
	public Class5_Sub4(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) Class109_Sub2 arg1, @OriginalArg(2) Class5_Sub18 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass109_Sub2_1 = arg1;
		this.aClass5_Sub18_1 = arg2;
		this.aClass65_Sub1_1 = arg0;
		@Pc(22) int local22 = this.aClass5_Sub18_1.method8056() - (arg1.anInt9063 >> 1);
		this.anInt258 = this.aClass5_Sub18_1.method8055() - local22 >> arg1.anInt9066;
		this.anInt261 = local22 + this.aClass5_Sub18_1.method8055() >> arg1.anInt9066;
		this.anInt265 = this.aClass5_Sub18_1.method8057() - local22 >> arg1.anInt9066;
		this.anInt264 = local22 + this.aClass5_Sub18_1.method8057() >> arg1.anInt9066;
		@Pc(77) int local77 = this.anInt261 + 1 - this.anInt258;
		@Pc(86) int local86 = this.anInt264 + 1 - this.anInt265;
		this.aFloatArrayArray3 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray1 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray2 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(136) int local136;
		@Pc(143) int local143;
		@Pc(176) int local176;
		@Pc(192) int local192;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = local115 + this.anInt265;
			if (local122 > 0 && this.aClass109_Sub2_1.anInt9065 - 1 > local122) {
				for (local136 = 0; local136 <= local77; local136++) {
					local143 = this.anInt258 + local136;
					if (local143 > 0 && local143 < this.aClass109_Sub2_1.anInt9061 - 1) {
						local176 = arg1.method7695(local122, local143 + 1) - arg1.method7695(local122, local143 - 1);
						local192 = arg1.method7695(local122 + 1, local143) - arg1.method7695(local122 - 1, local143);
						@Pc(207) float local207 = (float) (1.0D / Math.sqrt((double) (local176 * local176 + local192 * local192 + 65536)));
						this.aFloatArrayArray1[local136][local115] = local207 * (float) local176;
						this.aFloatArrayArray2[local136][local115] = -256.0F * local207;
						this.aFloatArrayArray3[local136][local115] = (float) local192 * local207;
					}
				}
			}
		}
		local122 = 0;
		@Pc(301) int local301;
		for (local136 = this.anInt265; local136 <= this.anInt264; local136++) {
			if (local136 >= 0 && local136 < arg1.anInt9065) {
				for (local143 = this.anInt258; local143 <= this.anInt261; local143++) {
					if (local143 >= 0 && arg1.anInt9061 > local143) {
						local176 = arg3[local122];
						@Pc(282) int[] local282 = arg1.anIntArrayArrayArray26[local143][local136];
						if (local282 != null && local176 != 0) {
							if (local176 == 1) {
								local301 = 0;
								while (local301 < local282.length) {
									if (local282[local301++] != -1 && local282[local301++] != -1 && local282[local301++] != -1) {
										this.anInt262 += 3;
									}
								}
							} else {
								this.anInt262 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt261 - this.anInt258;
			}
		}
		if (this.anInt262 > 0) {
			this.aClass5_Sub41_1 = new Class5_Sub41(this.anInt262 * 2);
			this.aClass5_Sub41_Sub1_1 = new Class5_Sub41_Sub1(this.anInt262 * 16);
			this.aClass300_2 = new Class300(Static67.method917(this.anInt262));
			local122 = 0;
			local143 = 0;
			for (local176 = this.anInt265; local176 <= this.anInt264; local176++) {
				if (local176 >= 0 && arg1.anInt9065 > local176) {
					local192 = 0;
					for (local301 = this.anInt258; local301 <= this.anInt261; local301++) {
						if (local301 >= 0 && local301 < arg1.anInt9061) {
							@Pc(432) int local432 = arg3[local122];
							@Pc(439) int[] local439 = arg1.anIntArrayArrayArray26[local301][local176];
							if (local439 != null && local432 != 0) {
								if (local432 == 1) {
									@Pc(595) int[] local595 = arg1.anIntArrayArrayArray27[local301][local176];
									@Pc(602) int[] local602 = arg1.anIntArrayArrayArray28[local301][local176];
									@Pc(604) int local604 = 0;
									label105: while (true) {
										while (true) {
											if (local604 >= local439.length) {
												break label105;
											}
											if (local439[local604] == -1 || local439[local604 + 1] == -1 || local439[local604 + 2] == -1) {
												local604 += 3;
											} else {
												this.method225(local595[local604], local176, local602[local604], local192, local143, local301);
												local604++;
												this.method225(local595[local604], local176, local602[local604], local192, local143, local301);
												local604++;
												this.method225(local595[local604], local176, local602[local604], local192, local143, local301);
												local604++;
											}
										}
									}
								} else if (local432 == 3) {
									this.method225(0, local176, 0, local192, local143, local301);
									this.method225(arg1.anInt9063, local176, 0, local192, local143, local301);
									this.method225(0, local176, arg1.anInt9063, local192, local143, local301);
								} else if (local432 == 2) {
									this.method225(arg1.anInt9063, local176, 0, local192, local143, local301);
									this.method225(arg1.anInt9063, local176, arg1.anInt9063, local192, local143, local301);
									this.method225(0, local176, 0, local192, local143, local301);
								} else if (local432 == 5) {
									this.method225(arg1.anInt9063, local176, arg1.anInt9063, local192, local143, local301);
									this.method225(0, local176, arg1.anInt9063, local192, local143, local301);
									this.method225(arg1.anInt9063, local176, 0, local192, local143, local301);
								} else if (local432 == 4) {
									this.method225(0, local176, arg1.anInt9063, local192, local143, local301);
									this.method225(0, local176, 0, local192, local143, local301);
									this.method225(arg1.anInt9063, local176, arg1.anInt9063, local192, local143, local301);
								}
							}
						}
						local122++;
						local192++;
					}
				} else {
					local122 += this.anInt261 - this.anInt258;
				}
				local143++;
			}
			this.anInterface23_1 = this.aClass65_Sub1_1.method1292(this.aClass5_Sub41_1.anInt9230, false, this.aClass5_Sub41_1.aByteArray93);
			this.anInterface17_1 = this.aClass65_Sub1_1.method1223(this.aClass5_Sub41_Sub1_1.aByteArray93, false, this.aClass5_Sub41_Sub1_1.anInt9230, 16);
			this.aClass79_1 = new Class79(this.anInterface17_1, 5126, 3, 0);
			this.aClass79_2 = new Class79(this.anInterface17_1, 5121, 4, 12);
		} else {
			this.anInterface23_1 = null;
			this.anInterface17_1 = null;
			this.aClass79_2 = null;
			this.aClass79_1 = null;
		}
		this.aClass5_Sub41_1 = null;
		this.aClass5_Sub41_Sub1_1 = null;
		this.aFloatArrayArray1 = this.aFloatArrayArray2 = this.aFloatArrayArray3 = null;
		this.aClass300_2 = null;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIII)V")
	private void method225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) long local8 = (long) -1;
		@Pc(16) int local16 = (arg5 << this.aClass109_Sub2_1.anInt9066) + arg0;
		@Pc(24) int local24 = (arg1 << this.aClass109_Sub2_1.anInt9066) + arg2;
		@Pc(31) int local31 = this.aClass109_Sub2_1.method7702(local16, local24);
		if ((arg0 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local8 = 0xFFFFL << 16 & (long) local24 << 16 | (long) local16 & 0xFFFFL;
			@Pc(62) Class5 local62 = this.aClass300_2.method7188(local8);
			if (local62 != null) {
				this.method228(((Class5_Sub37) local62).aShort54);
				return;
			}
		}
		@Pc(80) short local80 = (short) this.anInt266++;
		if (local8 != -1L) {
			this.aClass300_2.method7191(new Class5_Sub37(local80), local8);
		}
		@Pc(128) float local128;
		@Pc(137) float local137;
		@Pc(119) float local119;
		@Pc(214) float local214;
		@Pc(222) float local222;
		@Pc(229) float local229;
		@Pc(236) float local236;
		@Pc(243) float local243;
		@Pc(252) float local252;
		@Pc(261) float local261;
		@Pc(353) float local353;
		if (arg0 == 0 && arg2 == 0) {
			local119 = this.aFloatArrayArray3[arg3][arg4];
			local137 = this.aFloatArrayArray2[arg3][arg4];
			local128 = this.aFloatArrayArray1[arg3][arg4];
		} else if (this.aClass109_Sub2_1.anInt9063 == arg0 && arg2 == 0) {
			local119 = this.aFloatArrayArray3[arg3 + 1][arg4];
			local128 = this.aFloatArrayArray1[arg3 + 1][arg4];
			local137 = this.aFloatArrayArray2[arg3 + 1][arg4];
		} else if (arg0 == this.aClass109_Sub2_1.anInt9063 && arg2 == this.aClass109_Sub2_1.anInt9063) {
			local128 = this.aFloatArrayArray1[arg3 + 1][arg4 + 1];
			local137 = this.aFloatArrayArray2[arg3 + 1][arg4 + 1];
			local119 = this.aFloatArrayArray3[arg3 + 1][arg4 + 1];
		} else if (arg0 == 0 && arg2 == this.aClass109_Sub2_1.anInt9063) {
			local137 = this.aFloatArrayArray2[arg3][arg4 + 1];
			local128 = this.aFloatArrayArray1[arg3][arg4 + 1];
			local119 = this.aFloatArrayArray3[arg3][arg4 + 1];
		} else {
			local214 = (float) arg0 / (float) this.aClass109_Sub2_1.anInt9063;
			local222 = (float) arg2 / (float) this.aClass109_Sub2_1.anInt9063;
			local229 = this.aFloatArrayArray1[arg3][arg4];
			local236 = this.aFloatArrayArray2[arg3][arg4];
			local243 = this.aFloatArrayArray3[arg3][arg4];
			local252 = this.aFloatArrayArray1[arg3 + 1][arg4];
			local261 = this.aFloatArrayArray2[arg3 + 1][arg4];
			@Pc(277) float local277 = local229 + (this.aFloatArrayArray1[arg3][arg4 + 1] - local229) * local214;
			@Pc(295) float local295 = local261 + (this.aFloatArrayArray2[arg3 + 1][arg4 + 1] - local261) * local214;
			@Pc(312) float local312 = local252 + (this.aFloatArrayArray1[arg3 + 1][arg4 + 1] - local252) * local214;
			@Pc(328) float local328 = local243 + local214 * (this.aFloatArrayArray3[arg3][arg4 + 1] - local243);
			@Pc(344) float local344 = local236 + (this.aFloatArrayArray2[arg3][arg4 + 1] - local236) * local214;
			local353 = this.aFloatArrayArray3[arg3 + 1][arg4];
			@Pc(370) float local370 = local353 + (this.aFloatArrayArray3[arg3 + 1][arg4 + 1] - local353) * local214;
			local137 = local344 + local222 * (local295 - local344);
			local128 = local277 + local222 * (local312 - local277);
			local119 = local222 * (local370 - local328) + local328;
		}
		local214 = (float) (this.aClass5_Sub18_1.method8055() - local16);
		local222 = (float) (this.aClass5_Sub18_1.method8051() - local31);
		local229 = (float) (this.aClass5_Sub18_1.method8057() - local24);
		local236 = (float) Math.sqrt((double) (local229 * local229 + local222 * local222 + local214 * local214));
		local243 = 1.0F / local236;
		local222 *= local243;
		local229 *= local243;
		local214 *= local243;
		local252 = local236 / (float) this.aClass5_Sub18_1.method8056();
		local261 = 1.0F - local252 * local252;
		if (local261 < 0.0F) {
			local261 = 0.0F;
		}
		local353 = local214 * local128 + local137 * local222 + local229 * local119;
		if (local353 < 0.0F) {
			local353 = 0.0F;
		}
		@Pc(552) float local552 = local353 * local261 * 2.0F;
		if (local552 > 1.0F) {
			local552 = 1.0F;
		}
		@Pc(563) int local563 = this.aClass5_Sub18_1.method8058();
		@Pc(573) int local573 = (int) ((float) (local563 >> 16 & 0xFF) * local552);
		if (local573 > 255) {
			local573 = 255;
		}
		@Pc(588) int local588 = (int) ((float) (local563 >> 8 & 0xFF) * local552);
		if (local588 > 255) {
			local588 = 255;
		}
		@Pc(601) int local601 = (int) (local552 * (float) (local563 & 0xFF));
		if (this.aClass65_Sub1_1.aBoolean97) {
			this.aClass5_Sub41_Sub1_1.method6771((float) local16);
			this.aClass5_Sub41_Sub1_1.method6771((float) local31);
			this.aClass5_Sub41_Sub1_1.method6771((float) local24);
		} else {
			this.aClass5_Sub41_Sub1_1.method6768((float) local16);
			this.aClass5_Sub41_Sub1_1.method6768((float) local31);
			this.aClass5_Sub41_Sub1_1.method6768((float) local24);
		}
		if (local601 > 255) {
			local601 = 255;
		}
		this.aClass5_Sub41_Sub1_1.method7798(local573);
		this.aClass5_Sub41_Sub1_1.method7798(local588);
		this.aClass5_Sub41_Sub1_1.method7798(local601);
		this.aClass5_Sub41_Sub1_1.method7798(255);
		this.method228(local80);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(SB)V")
	private void method228(@OriginalArg(0) short arg0) {
		if (this.aClass65_Sub1_1.aBoolean97) {
			this.aClass5_Sub41_1.method7848(arg0);
		} else {
			this.aClass5_Sub41_1.method7821(arg0);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I[[ZIII)V")
	public void method229(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInterface23_1 == null || (this.anInt258 > arg3 + arg0 || (arg3 - arg0 > this.anInt261 || (arg2 + arg0 < this.anInt265 || this.anInt264 < arg2 - arg0)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt265; local54 <= this.anInt264; local54++) {
			for (@Pc(61) int local61 = this.anInt258; local61 <= this.anInt261; local61++) {
				@Pc(67) int local67 = local61 - arg3;
				@Pc(72) int local72 = local54 - arg2;
				if (local67 > -arg0 && arg0 > local67 && local72 > -arg0 && arg0 > local72 && arg1[local67 + arg0][local72 + arg0]) {
					this.aClass65_Sub1_1.method1232((int) (this.aClass5_Sub18_1.method8054() * 255.0F) << 24);
					this.aClass65_Sub1_1.method1258(this.aClass79_1, (Class79) null, this.aClass79_2, (Class79) null);
					this.aClass65_Sub1_1.method1291(this.anInterface23_1, this.anInt262, 0);
					return;
				}
			}
		}
	}
}
