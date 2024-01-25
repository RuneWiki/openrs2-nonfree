import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class5_Sub7 extends Class5 {

	@OriginalMember(owner = "client!au", name = "r", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!au", name = "x", descriptor = "Lclient!wr;")
	private final Class88_Sub3 aClass88_Sub3_2;

	@OriginalMember(owner = "client!au", name = "l", descriptor = "Lclient!kv;")
	private final Class143_Sub2 aClass143_Sub2_4;

	@OriginalMember(owner = "client!au", name = "z", descriptor = "Lclient!jw;")
	private final Class5_Sub3 aClass5_Sub3_1;

	@OriginalMember(owner = "client!au", name = "t", descriptor = "I")
	private final int anInt400;

	@OriginalMember(owner = "client!au", name = "E", descriptor = "I")
	private final int anInt405;

	@OriginalMember(owner = "client!au", name = "F", descriptor = "I")
	private final int anInt406;

	@OriginalMember(owner = "client!au", name = "y", descriptor = "I")
	private final int anInt402;

	@OriginalMember(owner = "client!au", name = "j", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!au", name = "i", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!au", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!au", name = "o", descriptor = "I")
	private int anInt397;

	@OriginalMember(owner = "client!au", name = "s", descriptor = "Lclient!mda;")
	private final Interface15 anInterface15_1;

	@OriginalMember(owner = "client!au", name = "I", descriptor = "Lclient!ic;")
	private final Interface8 anInterface8_1;

	@OriginalMember(owner = "client!au", name = "A", descriptor = "Lclient!kb;")
	private final Class194 aClass194_1;

	@OriginalMember(owner = "client!au", name = "H", descriptor = "Lclient!kb;")
	private final Class194 aClass194_2;

	@OriginalMember(owner = "client!au", name = "D", descriptor = "Lclient!rv;")
	private Class5_Sub15 aClass5_Sub15_1;

	@OriginalMember(owner = "client!au", name = "u", descriptor = "Lclient!dca;")
	private Class5_Sub15_Sub1 aClass5_Sub15_Sub1_1;

	@OriginalMember(owner = "client!au", name = "w", descriptor = "Lclient!tga;")
	private Class335 aClass335_2;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!kv;Lclient!wr;Lclient!jw;[I)V")
	public Class5_Sub7(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) Class88_Sub3 arg1, @OriginalArg(2) Class5_Sub3 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass88_Sub3_2 = arg1;
		this.aClass143_Sub2_4 = arg0;
		this.aClass5_Sub3_1 = arg2;
		@Pc(23) int local23 = this.aClass5_Sub3_1.method8319() - (arg1.anInt10540 >> 1);
		this.anInt400 = this.aClass5_Sub3_1.method8317() - local23 >> arg1.anInt10547;
		this.anInt405 = local23 + this.aClass5_Sub3_1.method8317() >> arg1.anInt10547;
		this.anInt406 = this.aClass5_Sub3_1.method8323() - local23 >> arg1.anInt10547;
		this.anInt402 = local23 + this.aClass5_Sub3_1.method8323() >> arg1.anInt10547;
		@Pc(77) int local77 = this.anInt405 + 1 - this.anInt400;
		@Pc(85) int local85 = this.anInt402 + 1 - this.anInt406;
		this.aFloatArrayArray2 = new float[local77 + 1][local85 + 1];
		this.aFloatArrayArray1 = new float[local77 + 1][local85 + 1];
		this.aFloatArrayArray3 = new float[local77 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(135) int local135;
		@Pc(142) int local142;
		@Pc(170) int local170;
		@Pc(186) int local186;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = this.anInt406 + local114;
			if (local121 > 0 && this.aClass88_Sub3_2.anInt10545 - 1 > local121) {
				for (local135 = 0; local135 <= local77; local135++) {
					local142 = local135 + this.anInt400;
					if (local142 > 0 && this.aClass88_Sub3_2.anInt10541 - 1 > local142) {
						local170 = arg1.method8749(local142 + 1, local121) - arg1.method8749(local142 - 1, local121);
						local186 = arg1.method8749(local142, local121 + 1) - arg1.method8749(local142, local121 - 1);
						@Pc(202) float local202 = (float) (1.0D / Math.sqrt((double) (local170 * local170 + local186 * local186 + 65536)));
						this.aFloatArrayArray1[local135][local114] = local202 * (float) local170;
						this.aFloatArrayArray2[local135][local114] = local202 * -256.0F;
						this.aFloatArrayArray3[local135][local114] = local202 * (float) local186;
					}
				}
			}
		}
		local121 = 0;
		@Pc(315) int local315;
		for (local135 = this.anInt406; local135 <= this.anInt402; local135++) {
			if (local135 >= 0 && arg1.anInt10545 > local135) {
				for (local142 = this.anInt400; local142 <= this.anInt405; local142++) {
					if (local142 >= 0 && local142 < arg1.anInt10541) {
						local170 = arg3[local121];
						@Pc(296) int[] local296 = arg1.anIntArrayArrayArray16[local142][local135];
						if (local296 != null && local170 != 0) {
							if (local170 == 1) {
								local315 = 0;
								while (local315 < local296.length) {
									if (local296[local315++] != -1 && local296[local315++] != -1 && local296[local315++] != -1) {
										this.anInt397 += 3;
									}
								}
							} else {
								this.anInt397 += 3;
							}
						}
					}
					local121++;
				}
			} else {
				local121 += this.anInt405 - this.anInt400;
			}
		}
		if (this.anInt397 <= 0) {
			this.anInterface15_1 = null;
			this.anInterface8_1 = null;
			this.aClass194_1 = null;
			this.aClass194_2 = null;
		} else {
			this.aClass5_Sub15_1 = new Class5_Sub15(this.anInt397 * 2);
			this.aClass5_Sub15_Sub1_1 = new Class5_Sub15_Sub1(this.anInt397 * 16);
			this.aClass335_2 = new Class335(Static209.method2991(this.anInt397));
			local142 = 0;
			local121 = 0;
			for (local170 = this.anInt406; local170 <= this.anInt402; local170++) {
				if (local170 >= 0 && local170 < arg1.anInt10545) {
					local186 = 0;
					for (local315 = this.anInt400; local315 <= this.anInt405; local315++) {
						if (local315 >= 0 && arg1.anInt10541 > local315) {
							@Pc(466) int local466 = arg3[local121];
							@Pc(473) int[] local473 = arg1.anIntArrayArrayArray16[local315][local170];
							if (local473 != null && local466 != 0) {
								if (local466 == 1) {
									@Pc(634) int[] local634 = arg1.anIntArrayArrayArray18[local315][local170];
									@Pc(641) int[] local641 = arg1.anIntArrayArrayArray17[local315][local170];
									@Pc(643) int local643 = 0;
									label104: while (true) {
										while (true) {
											if (local643 >= local473.length) {
												break label104;
											}
											if (local473[local643] == -1 || local473[local643 + 1] == -1 || local473[local643 + 2] == -1) {
												local643 += 3;
											} else {
												this.method389(local315, local641[local643], local186, local170, local142, local634[local643]);
												local643++;
												this.method389(local315, local641[local643], local186, local170, local142, local634[local643]);
												local643++;
												this.method389(local315, local641[local643], local186, local170, local142, local634[local643]);
												local643++;
											}
										}
									}
								} else if (local466 == 3) {
									this.method389(local315, 0, local186, local170, local142, 0);
									this.method389(local315, 0, local186, local170, local142, arg1.anInt10540);
									this.method389(local315, arg1.anInt10540, local186, local170, local142, 0);
								} else if (local466 == 2) {
									this.method389(local315, 0, local186, local170, local142, arg1.anInt10540);
									this.method389(local315, arg1.anInt10540, local186, local170, local142, arg1.anInt10540);
									this.method389(local315, 0, local186, local170, local142, 0);
								} else if (local466 == 5) {
									this.method389(local315, arg1.anInt10540, local186, local170, local142, arg1.anInt10540);
									this.method389(local315, arg1.anInt10540, local186, local170, local142, 0);
									this.method389(local315, 0, local186, local170, local142, arg1.anInt10540);
								} else if (local466 == 4) {
									this.method389(local315, arg1.anInt10540, local186, local170, local142, 0);
									this.method389(local315, 0, local186, local170, local142, 0);
									this.method389(local315, arg1.anInt10540, local186, local170, local142, arg1.anInt10540);
								}
							}
						}
						local186++;
						local121++;
					}
				} else {
					local121 += this.anInt405 - this.anInt400;
				}
				local142++;
			}
			this.anInterface15_1 = this.aClass143_Sub2_4.method4943(this.aClass5_Sub15_1.aByteArray45, false, this.aClass5_Sub15_1.anInt4144);
			this.anInterface8_1 = this.aClass143_Sub2_4.method4986(this.aClass5_Sub15_Sub1_1.anInt4144, this.aClass5_Sub15_Sub1_1.aByteArray45, 16, false);
			this.aClass194_2 = new Class194(this.anInterface8_1, 5126, 3, 0);
			this.aClass194_1 = new Class194(this.anInterface8_1, 5121, 4, 12);
		}
		this.aFloatArrayArray1 = this.aFloatArrayArray2 = this.aFloatArrayArray3 = null;
		this.aClass335_2 = null;
		this.aClass5_Sub15_1 = null;
		this.aClass5_Sub15_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIIII)V")
	private void method389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg5 + (arg0 << this.aClass88_Sub3_2.anInt10547);
		@Pc(24) int local24 = arg1 + (arg3 << this.aClass88_Sub3_2.anInt10547);
		@Pc(31) int local31 = this.aClass88_Sub3_2.method8753(local15, local24);
		if ((arg5 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local7 = ((long) local24 & 0xFFFFL) << 16 | (long) local15 & 0xFFFFL;
			@Pc(57) Class5 local57 = this.aClass335_2.method7766(local7);
			if (local57 != null) {
				this.method393(((Class5_Sub19) local57).aShort26);
				return;
			}
		}
		@Pc(75) short local75 = (short) this.anInt399++;
		if (local7 != -1L) {
			this.aClass335_2.method7770(local7, new Class5_Sub19(local75));
		}
		@Pc(101) float local101;
		@Pc(115) float local115;
		@Pc(108) float local108;
		@Pc(193) float local193;
		@Pc(201) float local201;
		@Pc(208) float local208;
		@Pc(215) float local215;
		@Pc(222) float local222;
		@Pc(231) float local231;
		@Pc(240) float local240;
		@Pc(249) float local249;
		if (arg5 == 0 && arg1 == 0) {
			local101 = this.aFloatArrayArray1[arg2][arg4];
			local108 = this.aFloatArrayArray3[arg2][arg4];
			local115 = this.aFloatArrayArray2[arg2][arg4];
		} else if (this.aClass88_Sub3_2.anInt10540 == arg5 && arg1 == 0) {
			local101 = this.aFloatArrayArray1[arg2 + 1][arg4];
			local115 = this.aFloatArrayArray2[arg2 + 1][arg4];
			local108 = this.aFloatArrayArray3[arg2 + 1][arg4];
		} else if (this.aClass88_Sub3_2.anInt10540 == arg5 && this.aClass88_Sub3_2.anInt10540 == arg1) {
			local101 = this.aFloatArrayArray1[arg2 + 1][arg4 + 1];
			local115 = this.aFloatArrayArray2[arg2 + 1][arg4 + 1];
			local108 = this.aFloatArrayArray3[arg2 + 1][arg4 + 1];
		} else if (arg5 == 0 && arg1 == this.aClass88_Sub3_2.anInt10540) {
			local101 = this.aFloatArrayArray1[arg2][arg4 + 1];
			local108 = this.aFloatArrayArray3[arg2][arg4 + 1];
			local115 = this.aFloatArrayArray2[arg2][arg4 + 1];
		} else {
			local193 = (float) arg5 / (float) this.aClass88_Sub3_2.anInt10540;
			local201 = (float) arg1 / (float) this.aClass88_Sub3_2.anInt10540;
			local208 = this.aFloatArrayArray1[arg2][arg4];
			local215 = this.aFloatArrayArray2[arg2][arg4];
			local222 = this.aFloatArrayArray3[arg2][arg4];
			local231 = this.aFloatArrayArray1[arg2 + 1][arg4];
			local240 = this.aFloatArrayArray2[arg2 + 1][arg4];
			local249 = this.aFloatArrayArray3[arg2 + 1][arg4];
			@Pc(264) float local264 = local215 + (this.aFloatArrayArray2[arg2][arg4 + 1] - local215) * local193;
			@Pc(279) float local279 = local222 + local193 * (this.aFloatArrayArray3[arg2][arg4 + 1] - local222);
			@Pc(295) float local295 = local208 + (this.aFloatArrayArray1[arg2][arg4 + 1] - local208) * local193;
			@Pc(312) float local312 = local231 + (this.aFloatArrayArray1[arg2 + 1][arg4 + 1] - local231) * local193;
			@Pc(330) float local330 = local240 + (this.aFloatArrayArray2[arg2 + 1][arg4 + 1] - local240) * local193;
			local115 = local264 + (local330 - local264) * local201;
			@Pc(355) float local355 = local249 + (this.aFloatArrayArray3[arg2 + 1][arg4 + 1] - local249) * local193;
			local101 = (local312 - local295) * local201 + local295;
			local108 = local201 * (local355 - local279) + local279;
		}
		local193 = (float) (this.aClass5_Sub3_1.method8317() - local15);
		local201 = (float) (this.aClass5_Sub3_1.method8313() - local31);
		local208 = (float) (this.aClass5_Sub3_1.method8323() - local24);
		local215 = (float) Math.sqrt((double) (local208 * local208 + local193 * local193 + local201 * local201));
		local222 = 1.0F / local215;
		local193 *= local222;
		local201 *= local222;
		local208 *= local222;
		local231 = local215 / (float) this.aClass5_Sub3_1.method8319();
		local240 = 1.0F - local231 * local231;
		if (local240 < 0.0F) {
			local240 = 0.0F;
		}
		local249 = local108 * local208 + local193 * local101 + local115 * local201;
		if (local249 < 0.0F) {
			local249 = 0.0F;
		}
		@Pc(538) float local538 = local240 * 2.0F * local249;
		if (local538 > 1.0F) {
			local538 = 1.0F;
		}
		@Pc(551) int local551 = this.aClass5_Sub3_1.method8322();
		@Pc(561) int local561 = (int) (local538 * (float) (local551 >> 16 & 0xFF));
		if (local561 > 255) {
			local561 = 255;
		}
		@Pc(576) int local576 = (int) ((float) (local551 >> 8 & 0xFF) * local538);
		if (local576 > 255) {
			local576 = 255;
		}
		@Pc(591) int local591 = (int) ((float) (local551 & 0xFF) * local538);
		if (local591 > 255) {
			local591 = 255;
		}
		if (this.aClass143_Sub2_4.aBoolean408) {
			this.aClass5_Sub15_Sub1_1.method1614((float) local15);
			this.aClass5_Sub15_Sub1_1.method1614((float) local31);
			this.aClass5_Sub15_Sub1_1.method1614((float) local24);
		} else {
			this.aClass5_Sub15_Sub1_1.method1612((float) local15);
			this.aClass5_Sub15_Sub1_1.method1612((float) local31);
			this.aClass5_Sub15_Sub1_1.method1612((float) local24);
		}
		this.aClass5_Sub15_Sub1_1.method3651(local561);
		this.aClass5_Sub15_Sub1_1.method3651(local576);
		this.aClass5_Sub15_Sub1_1.method3651(local591);
		this.aClass5_Sub15_Sub1_1.method3651(255);
		this.method393(local75);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "([[ZIIII)V")
	public void method392(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface15_1 == null || (arg3 + arg2 < this.anInt400 || (arg3 - arg2 > this.anInt405 || (arg2 + arg1 < this.anInt406 || arg1 - arg2 > this.anInt402)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt406; local54 <= this.anInt402; local54++) {
			for (@Pc(59) int local59 = this.anInt400; local59 <= this.anInt405; local59++) {
				@Pc(66) int local66 = local59 - arg3;
				@Pc(71) int local71 = local54 - arg1;
				if (local66 > -arg2 && local66 < arg2 && -arg2 < local71 && arg2 > local71 && arg0[arg2 + local66][local71 + arg2]) {
					this.aClass143_Sub2_4.method4982((int) (this.aClass5_Sub3_1.method8314() * 255.0F) << 24);
					this.aClass143_Sub2_4.method4970(this.aClass194_2, (Class194) null, this.aClass194_1, (Class194) null);
					this.aClass143_Sub2_4.method5004(this.anInterface15_1, this.anInt397, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IS)V")
	private void method393(@OriginalArg(1) short arg0) {
		if (this.aClass143_Sub2_4.aBoolean408) {
			this.aClass5_Sub15_1.method3660(arg0);
		} else {
			this.aClass5_Sub15_1.method3668(arg0);
		}
	}
}
