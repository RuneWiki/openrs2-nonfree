import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rda")
public final class Class1_Sub41 extends Class1 {

	@OriginalMember(owner = "client!rda", name = "q", descriptor = "I")
	private int anInt7836;

	@OriginalMember(owner = "client!rda", name = "w", descriptor = "Lclient!hca;")
	private final Class129_Sub1 aClass129_Sub1_3;

	@OriginalMember(owner = "client!rda", name = "B", descriptor = "Lclient!tw;")
	private final Class1_Sub24 aClass1_Sub24_3;

	@OriginalMember(owner = "client!rda", name = "F", descriptor = "Lclient!lj;")
	private final Class78_Sub3 aClass78_Sub3_36;

	@OriginalMember(owner = "client!rda", name = "o", descriptor = "I")
	private final int anInt7834;

	@OriginalMember(owner = "client!rda", name = "H", descriptor = "I")
	private final int anInt7842;

	@OriginalMember(owner = "client!rda", name = "v", descriptor = "I")
	private final int anInt7839;

	@OriginalMember(owner = "client!rda", name = "j", descriptor = "I")
	private final int anInt7832;

	@OriginalMember(owner = "client!rda", name = "C", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!rda", name = "l", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!rda", name = "u", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!rda", name = "y", descriptor = "I")
	private int anInt7840;

	@OriginalMember(owner = "client!rda", name = "A", descriptor = "Lclient!ac;")
	private Class1_Sub3 aClass1_Sub3_6;

	@OriginalMember(owner = "client!rda", name = "s", descriptor = "Lclient!wu;")
	private Class1_Sub3_Sub2 aClass1_Sub3_Sub2_3;

	@OriginalMember(owner = "client!rda", name = "D", descriptor = "Lclient!faa;")
	private Class91 aClass91_35;

	@OriginalMember(owner = "client!rda", name = "G", descriptor = "Lclient!ii;")
	private final Interface12 anInterface12_5;

	@OriginalMember(owner = "client!rda", name = "z", descriptor = "Lclient!eq;")
	private final Interface8 anInterface8_7;

	@OriginalMember(owner = "client!rda", name = "x", descriptor = "Lclient!mq;")
	private final Class226 aClass226_16;

	@OriginalMember(owner = "client!rda", name = "k", descriptor = "Lclient!mq;")
	private final Class226 aClass226_15;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Lclient!lj;Lclient!hca;Lclient!tw;[I)V")
	public Class1_Sub41(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) Class129_Sub1 arg1, @OriginalArg(2) Class1_Sub24 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass129_Sub1_3 = arg1;
		this.aClass1_Sub24_3 = arg2;
		this.aClass78_Sub3_36 = arg0;
		@Pc(23) int local23 = this.aClass1_Sub24_3.method7610() - (arg1.anInt8060 >> 1);
		this.anInt7834 = this.aClass1_Sub24_3.method7609() - local23 >> arg1.anInt8066;
		this.anInt7842 = local23 + this.aClass1_Sub24_3.method7609() >> arg1.anInt8066;
		this.anInt7839 = this.aClass1_Sub24_3.method7608() - local23 >> arg1.anInt8066;
		this.anInt7832 = local23 + this.aClass1_Sub24_3.method7608() >> arg1.anInt8066;
		@Pc(78) int local78 = this.anInt7842 + 1 - this.anInt7834;
		@Pc(87) int local87 = this.anInt7832 + 1 - this.anInt7839;
		this.aFloatArrayArray13 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray11 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray12 = new float[local78 + 1][local87 + 1];
		@Pc(123) int local123;
		@Pc(137) int local137;
		@Pc(145) int local145;
		@Pc(171) int local171;
		@Pc(187) int local187;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local123 = this.anInt7839 + local116;
			if (local123 > 0 && this.aClass129_Sub1_3.anInt8058 - 1 > local123) {
				for (local137 = 0; local137 <= local78; local137++) {
					local145 = local137 + this.anInt7834;
					if (local145 > 0 && local145 < this.aClass129_Sub1_3.anInt8065 - 1) {
						local171 = arg1.method6481(local123, local145 + 1) - arg1.method6481(local123, local145 - 1);
						local187 = arg1.method6481(local123 + 1, local145) - arg1.method6481(local123 - 1, local145);
						@Pc(203) float local203 = (float) (1.0D / Math.sqrt((double) (local171 * local171 + local187 * local187 + 65536)));
						this.aFloatArrayArray13[local137][local116] = (float) local171 * local203;
						this.aFloatArrayArray11[local137][local116] = local203 * -256.0F;
						this.aFloatArrayArray12[local137][local116] = local203 * (float) local187;
					}
				}
			}
		}
		local123 = 0;
		@Pc(294) int local294;
		for (local137 = this.anInt7839; local137 <= this.anInt7832; local137++) {
			if (local137 >= 0 && local137 < arg1.anInt8058) {
				for (local145 = this.anInt7834; local145 <= this.anInt7842; local145++) {
					if (local145 >= 0 && arg1.anInt8065 > local145) {
						local171 = arg3[local123];
						@Pc(283) int[] local283 = arg1.anIntArrayArrayArray1[local145][local137];
						if (local283 != null && local171 != 0) {
							if (local171 == 1) {
								local294 = 0;
								while (local294 < local283.length) {
									if (local283[local294++] != -1 && local283[local294++] != -1 && local283[local294++] != -1) {
										this.anInt7840 += 3;
									}
								}
							} else {
								this.anInt7840 += 3;
							}
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt7842 - this.anInt7834;
			}
		}
		if (this.anInt7840 > 0) {
			this.aClass1_Sub3_6 = new Class1_Sub3(this.anInt7840 * 2);
			this.aClass1_Sub3_Sub2_3 = new Class1_Sub3_Sub2(this.anInt7840 * 16);
			this.aClass91_35 = new Class91(Static122.method2187(this.anInt7840));
			local145 = 0;
			local123 = 0;
			for (local171 = this.anInt7839; local171 <= this.anInt7832; local171++) {
				if (local171 >= 0 && local171 < arg1.anInt8058) {
					local187 = 0;
					for (local294 = this.anInt7834; local294 <= this.anInt7842; local294++) {
						if (local294 >= 0 && arg1.anInt8065 > local294) {
							@Pc(437) int local437 = arg3[local123];
							@Pc(444) int[] local444 = arg1.anIntArrayArrayArray1[local294][local171];
							if (local444 != null && local437 != 0) {
								if (local437 == 1) {
									@Pc(461) int[] local461 = arg1.anIntArrayArrayArray3[local294][local171];
									@Pc(468) int[] local468 = arg1.anIntArrayArrayArray2[local294][local171];
									@Pc(470) int local470 = 0;
									label107: while (true) {
										while (true) {
											if (local444.length <= local470) {
												break label107;
											}
											if (local444[local470] == -1 || local444[local470 + 1] == -1 || local444[local470 + 2] == -1) {
												local470 += 3;
											} else {
												this.method6250(local145, local294, local461[local470], local171, local187, local468[local470]);
												local470++;
												this.method6250(local145, local294, local461[local470], local171, local187, local468[local470]);
												local470++;
												this.method6250(local145, local294, local461[local470], local171, local187, local468[local470]);
												local470++;
											}
										}
									}
								} else if (local437 == 3) {
									this.method6250(local145, local294, 0, local171, local187, 0);
									this.method6250(local145, local294, arg1.anInt8060, local171, local187, 0);
									this.method6250(local145, local294, 0, local171, local187, arg1.anInt8060);
								} else if (local437 == 2) {
									this.method6250(local145, local294, arg1.anInt8060, local171, local187, 0);
									this.method6250(local145, local294, arg1.anInt8060, local171, local187, arg1.anInt8060);
									this.method6250(local145, local294, 0, local171, local187, 0);
								} else if (local437 == 5) {
									this.method6250(local145, local294, arg1.anInt8060, local171, local187, arg1.anInt8060);
									this.method6250(local145, local294, 0, local171, local187, arg1.anInt8060);
									this.method6250(local145, local294, arg1.anInt8060, local171, local187, 0);
								} else if (local437 == 4) {
									this.method6250(local145, local294, 0, local171, local187, arg1.anInt8060);
									this.method6250(local145, local294, 0, local171, local187, 0);
									this.method6250(local145, local294, arg1.anInt8060, local171, local187, arg1.anInt8060);
								}
							}
						}
						local187++;
						local123++;
					}
				} else {
					local123 += this.anInt7842 - this.anInt7834;
				}
				local145++;
			}
			this.anInterface12_5 = this.aClass78_Sub3_36.method4508(this.aClass1_Sub3_6.aByteArray104, this.aClass1_Sub3_6.anInt9802, false);
			this.anInterface8_7 = this.aClass78_Sub3_36.method4550(this.aClass1_Sub3_Sub2_3.anInt9802, false, this.aClass1_Sub3_Sub2_3.aByteArray104, 16);
			this.aClass226_16 = new Class226(this.anInterface8_7, 5126, 3, 0);
			this.aClass226_15 = new Class226(this.anInterface8_7, 5121, 4, 12);
		} else {
			this.anInterface8_7 = null;
			this.aClass226_16 = null;
			this.anInterface12_5 = null;
			this.aClass226_15 = null;
		}
		this.aClass91_35 = null;
		this.aClass1_Sub3_6 = null;
		this.aFloatArrayArray13 = this.aFloatArrayArray11 = this.aFloatArrayArray12 = null;
		this.aClass1_Sub3_Sub2_3 = null;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(SZ)V")
	private void method6246(@OriginalArg(0) short arg0) {
		if (this.aClass78_Sub3_36.aBoolean425) {
			this.aClass1_Sub3_6.method7937(arg0);
		} else {
			this.aClass1_Sub3_6.method7948(arg0);
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IBII[[Z)V")
	public void method6248(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface12_5 == null || (this.anInt7834 > arg0 + arg1 || (arg0 - arg1 > this.anInt7842 || (this.anInt7839 > arg2 + arg1 || this.anInt7832 < arg2 - arg1)))) {
			return;
		}
		for (@Pc(49) int local49 = this.anInt7839; local49 <= this.anInt7832; local49++) {
			for (@Pc(60) int local60 = this.anInt7834; local60 <= this.anInt7842; local60++) {
				@Pc(67) int local67 = local60 - arg0;
				@Pc(72) int local72 = local49 - arg2;
				if (local67 > -arg1 && arg1 > local67 && -arg1 < local72 && arg1 > local72 && arg3[arg1 + local67][arg1 + local72]) {
					this.aClass78_Sub3_36.method4491((int) (this.aClass1_Sub24_3.method7615() * 255.0F) << 24);
					this.aClass78_Sub3_36.method4537(null, null, this.aClass226_16, this.aClass226_15);
					this.aClass78_Sub3_36.method4564(this.anInt7840, 0, this.anInterface12_5);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIIIIII)V")
	private void method6250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg1 << this.aClass129_Sub1_3.anInt8066) + arg2;
		@Pc(23) int local23 = arg5 + (arg3 << this.aClass129_Sub1_3.anInt8066);
		@Pc(30) int local30 = this.aClass129_Sub1_3.method6480(local23, local15);
		if ((arg2 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | ((long) local23 & 0xFFFFL) << 16;
			@Pc(62) Class1 local62 = this.aClass91_35.method2271(local7);
			if (local62 != null) {
				this.method6246(((Class1_Sub47) local62).aShort114);
				return;
			}
		}
		@Pc(80) short local80 = (short) this.anInt7836++;
		if (local7 != -1L) {
			this.aClass91_35.method2269(local7, new Class1_Sub47(local80));
		}
		@Pc(120) float local120;
		@Pc(129) float local129;
		@Pc(138) float local138;
		@Pc(212) float local212;
		@Pc(220) float local220;
		@Pc(227) float local227;
		@Pc(234) float local234;
		@Pc(241) float local241;
		@Pc(250) float local250;
		@Pc(259) float local259;
		@Pc(348) float local348;
		if (arg2 == 0 && arg5 == 0) {
			local129 = this.aFloatArrayArray11[arg4][arg0];
			local138 = this.aFloatArrayArray12[arg4][arg0];
			local120 = this.aFloatArrayArray13[arg4][arg0];
		} else if (this.aClass129_Sub1_3.anInt8060 == arg2 && arg5 == 0) {
			local120 = this.aFloatArrayArray13[arg4 + 1][arg0];
			local129 = this.aFloatArrayArray11[arg4 + 1][arg0];
			local138 = this.aFloatArrayArray12[arg4 + 1][arg0];
		} else if (arg2 == this.aClass129_Sub1_3.anInt8060 && this.aClass129_Sub1_3.anInt8060 == arg5) {
			local120 = this.aFloatArrayArray13[arg4 + 1][arg0 + 1];
			local129 = this.aFloatArrayArray11[arg4 + 1][arg0 + 1];
			local138 = this.aFloatArrayArray12[arg4 + 1][arg0 + 1];
		} else if (arg2 == 0 && arg5 == this.aClass129_Sub1_3.anInt8060) {
			local120 = this.aFloatArrayArray13[arg4][arg0 + 1];
			local138 = this.aFloatArrayArray12[arg4][arg0 + 1];
			local129 = this.aFloatArrayArray11[arg4][arg0 + 1];
		} else {
			local212 = (float) arg2 / (float) this.aClass129_Sub1_3.anInt8060;
			local220 = (float) arg5 / (float) this.aClass129_Sub1_3.anInt8060;
			local227 = this.aFloatArrayArray13[arg4][arg0];
			local234 = this.aFloatArrayArray11[arg4][arg0];
			local241 = this.aFloatArrayArray12[arg4][arg0];
			local250 = this.aFloatArrayArray13[arg4 + 1][arg0];
			local259 = this.aFloatArrayArray11[arg4 + 1][arg0];
			@Pc(274) float local274 = local227 + (this.aFloatArrayArray13[arg4][arg0 + 1] - local227) * local212;
			@Pc(291) float local291 = local259 + (this.aFloatArrayArray11[arg4 + 1][arg0 + 1] - local259) * local212;
			@Pc(306) float local306 = local241 + (this.aFloatArrayArray12[arg4][arg0 + 1] - local241) * local212;
			@Pc(322) float local322 = local234 + local212 * (this.aFloatArrayArray11[arg4][arg0 + 1] - local234);
			@Pc(339) float local339 = local250 + local212 * (this.aFloatArrayArray13[arg4 + 1][arg0 + 1] - local250);
			local348 = this.aFloatArrayArray12[arg4 + 1][arg0];
			local120 = (local339 - local274) * local220 + local274;
			local129 = local322 + (local291 - local322) * local220;
			@Pc(383) float local383 = local348 + local212 * (this.aFloatArrayArray12[arg4 + 1][arg0 + 1] - local348);
			local138 = local306 + (local383 - local306) * local220;
		}
		local212 = this.aClass1_Sub24_3.method7609() - local15;
		local220 = this.aClass1_Sub24_3.method7612() - local30;
		local227 = this.aClass1_Sub24_3.method7608() - local23;
		local234 = (float) Math.sqrt((double) (local220 * local220 + local212 * local212 + local227 * local227));
		local241 = 1.0F / local234;
		local227 *= local241;
		local220 *= local241;
		local212 *= local241;
		local250 = local234 / (float) this.aClass1_Sub24_3.method7610();
		local259 = 1.0F - local250 * local250;
		if (local259 < 0.0F) {
			local259 = 0.0F;
		}
		local348 = local212 * local120 + local129 * local220 + local138 * local227;
		if (local348 < (float) 0) {
			local348 = 0.0F;
		}
		@Pc(546) float local546 = local259 * 2.0F * local348;
		if (local546 > 1.0F) {
			local546 = 1.0F;
		}
		@Pc(557) int local557 = this.aClass1_Sub24_3.method7613();
		@Pc(567) int local567 = (int) (local546 * (float) (local557 >> 16 & 0xFF));
		if (local567 > 255) {
			local567 = 255;
		}
		@Pc(582) int local582 = (int) (local546 * (float) (local557 >> 8 & 0xFF));
		if (local582 > 255) {
			local582 = 255;
		}
		@Pc(597) int local597 = (int) ((float) (local557 & 0xFF) * local546);
		if (this.aClass78_Sub3_36.aBoolean425) {
			this.aClass1_Sub3_Sub2_3.method7979((float) local15);
			this.aClass1_Sub3_Sub2_3.method7979((float) local30);
			this.aClass1_Sub3_Sub2_3.method7979((float) local23);
		} else {
			this.aClass1_Sub3_Sub2_3.method7984((float) local15);
			this.aClass1_Sub3_Sub2_3.method7984((float) local30);
			this.aClass1_Sub3_Sub2_3.method7984((float) local23);
		}
		if (local597 > 255) {
			local597 = 255;
		}
		this.aClass1_Sub3_Sub2_3.method7917(local567);
		this.aClass1_Sub3_Sub2_3.method7917(local582);
		this.aClass1_Sub3_Sub2_3.method7917(local597);
		this.aClass1_Sub3_Sub2_3.method7917(255);
		this.method6246(local80);
	}
}
