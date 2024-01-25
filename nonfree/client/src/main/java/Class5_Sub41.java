import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class5_Sub41 extends Class5 {

	@OriginalMember(owner = "client!pn", name = "B", descriptor = "I")
	private int anInt7825;

	@OriginalMember(owner = "client!pn", name = "G", descriptor = "Lclient!ffa;")
	private final Class57_Sub2 aClass57_Sub2_28;

	@OriginalMember(owner = "client!pn", name = "x", descriptor = "Lclient!aq;")
	private final Class22_Sub1 aClass22_Sub1_3;

	@OriginalMember(owner = "client!pn", name = "r", descriptor = "Lclient!uf;")
	private final Class5_Sub43 aClass5_Sub43_2;

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
	private final int anInt7828;

	@OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
	private final int anInt7833;

	@OriginalMember(owner = "client!pn", name = "v", descriptor = "I")
	private final int anInt7826;

	@OriginalMember(owner = "client!pn", name = "p", descriptor = "I")
	private final int anInt7830;

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "[[F")
	private float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!pn", name = "F", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!pn", name = "E", descriptor = "[[F")
	private float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!pn", name = "w", descriptor = "I")
	private int anInt7829;

	@OriginalMember(owner = "client!pn", name = "o", descriptor = "Lclient!uo;")
	private final Class356 aClass356_16;

	@OriginalMember(owner = "client!pn", name = "t", descriptor = "Lclient!ml;")
	private final Interface15 anInterface15_6;

	@OriginalMember(owner = "client!pn", name = "y", descriptor = "Lclient!raa;")
	private final Interface21 anInterface21_5;

	@OriginalMember(owner = "client!pn", name = "s", descriptor = "Lclient!uo;")
	private final Class356 aClass356_15;

	@OriginalMember(owner = "client!pn", name = "u", descriptor = "Lclient!ib;")
	private Class5_Sub23 aClass5_Sub23_7;

	@OriginalMember(owner = "client!pn", name = "j", descriptor = "Lclient!jo;")
	private Class5_Sub23_Sub1 aClass5_Sub23_Sub1_3;

	@OriginalMember(owner = "client!pn", name = "A", descriptor = "Lclient!qha;")
	private Class291 aClass291_32;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lclient!ffa;Lclient!aq;Lclient!uf;[I)V")
	public Class5_Sub41(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) Class22_Sub1 arg1, @OriginalArg(2) Class5_Sub43 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass57_Sub2_28 = arg0;
		this.aClass22_Sub1_3 = arg1;
		this.aClass5_Sub43_2 = arg2;
		@Pc(22) int local22 = this.aClass5_Sub43_2.method8254() - (arg1.anInt9377 >> 1);
		this.anInt7828 = this.aClass5_Sub43_2.method8251() - local22 >> arg1.anInt9378;
		this.anInt7833 = this.aClass5_Sub43_2.method8251() + local22 >> arg1.anInt9378;
		this.anInt7826 = this.aClass5_Sub43_2.method8255() - local22 >> arg1.anInt9378;
		this.anInt7830 = this.aClass5_Sub43_2.method8255() + local22 >> arg1.anInt9378;
		@Pc(78) int local78 = this.anInt7833 + 1 - this.anInt7828;
		@Pc(86) int local86 = this.anInt7830 + 1 - this.anInt7826;
		this.aFloatArrayArray9 = new float[local78 + 1][local86 + 1];
		this.aFloatArrayArray11 = new float[local78 + 1][local86 + 1];
		this.aFloatArrayArray10 = new float[local78 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(139) int local139;
		@Pc(147) int local147;
		@Pc(175) int local175;
		@Pc(192) int local192;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = this.anInt7826 + local115;
			if (local122 > 0 && local122 < this.aClass22_Sub1_3.anInt9375 - 1) {
				for (local139 = 0; local139 <= local78; local139++) {
					local147 = local139 + this.anInt7828;
					if (local147 > 0 && local147 < this.aClass22_Sub1_3.anInt9376 - 1) {
						local175 = arg1.method8038(local122, local147 + 1) - arg1.method8038(local122, local147 - 1);
						local192 = arg1.method8038(local122 + 1, local147) - arg1.method8038(local122 - 1, local147);
						@Pc(207) float local207 = (float) (1.0D / Math.sqrt((double) (local192 * local192 + local175 * local175 + 65536)));
						this.aFloatArrayArray9[local139][local115] = local207 * (float) local175;
						this.aFloatArrayArray10[local139][local115] = local207 * -256.0F;
						this.aFloatArrayArray11[local139][local115] = (float) local192 * local207;
					}
				}
			}
		}
		local122 = 0;
		@Pc(324) int local324;
		for (local139 = this.anInt7826; local139 <= this.anInt7830; local139++) {
			if (local139 >= 0 && arg1.anInt9375 > local139) {
				for (local147 = this.anInt7828; local147 <= this.anInt7833; local147++) {
					if (local147 >= 0 && local147 < arg1.anInt9376) {
						local175 = arg3[local122];
						@Pc(309) int[] local309 = arg1.anIntArrayArrayArray1[local147][local139];
						if (local309 != null && local175 != 0) {
							if (local175 == 1) {
								local324 = 0;
								while (local309.length > local324) {
									if (local309[local324++] != -1 && local309[local324++] != -1 && local309[local324++] != -1) {
										this.anInt7829 += 3;
									}
								}
							} else {
								this.anInt7829 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt7833 - this.anInt7828;
			}
		}
		if (this.anInt7829 <= 0) {
			this.aClass356_16 = null;
			this.anInterface15_6 = null;
			this.anInterface21_5 = null;
			this.aClass356_15 = null;
		} else {
			this.aClass5_Sub23_7 = new Class5_Sub23(this.anInt7829 * 2);
			this.aClass5_Sub23_Sub1_3 = new Class5_Sub23_Sub1(this.anInt7829 * 16);
			this.aClass291_32 = new Class291(Static94.method1393(this.anInt7829));
			local122 = 0;
			local147 = 0;
			for (local175 = this.anInt7826; local175 <= this.anInt7830; local175++) {
				if (local175 >= 0 && local175 < arg1.anInt9375) {
					local192 = 0;
					for (local324 = this.anInt7828; local324 <= this.anInt7833; local324++) {
						if (local324 >= 0 && local324 < arg1.anInt9376) {
							@Pc(510) int local510 = arg3[local122];
							@Pc(517) int[] local517 = arg1.anIntArrayArrayArray1[local324][local175];
							if (local517 != null && local510 != 0) {
								if (local510 == 1) {
									@Pc(700) int[] local700 = arg1.anIntArrayArrayArray4[local324][local175];
									@Pc(707) int[] local707 = arg1.anIntArrayArrayArray6[local324][local175];
									@Pc(709) int local709 = 0;
									label105: while (true) {
										while (true) {
											if (local517.length <= local709) {
												break label105;
											}
											if (local517[local709] == -1 || local517[local709 + 1] == -1 || local517[local709 + 2] == -1) {
												local709 += 3;
											} else {
												this.method6732(local175, local192, local700[local709], local147, local707[local709], local324);
												local709++;
												this.method6732(local175, local192, local700[local709], local147, local707[local709], local324);
												local709++;
												this.method6732(local175, local192, local700[local709], local147, local707[local709], local324);
												local709++;
											}
										}
									}
								} else if (local510 == 3) {
									this.method6732(local175, local192, 0, local147, 0, local324);
									this.method6732(local175, local192, arg1.anInt9377, local147, 0, local324);
									this.method6732(local175, local192, 0, local147, arg1.anInt9377, local324);
								} else if (local510 == 2) {
									this.method6732(local175, local192, arg1.anInt9377, local147, 0, local324);
									this.method6732(local175, local192, arg1.anInt9377, local147, arg1.anInt9377, local324);
									this.method6732(local175, local192, 0, local147, 0, local324);
								} else if (local510 == 5) {
									this.method6732(local175, local192, arg1.anInt9377, local147, arg1.anInt9377, local324);
									this.method6732(local175, local192, 0, local147, arg1.anInt9377, local324);
									this.method6732(local175, local192, arg1.anInt9377, local147, 0, local324);
								} else if (local510 == 4) {
									this.method6732(local175, local192, 0, local147, arg1.anInt9377, local324);
									this.method6732(local175, local192, 0, local147, 0, local324);
									this.method6732(local175, local192, arg1.anInt9377, local147, arg1.anInt9377, local324);
								}
							}
						}
						local192++;
						local122++;
					}
				} else {
					local122 += this.anInt7833 - this.anInt7828;
				}
				local147++;
			}
			this.anInterface21_5 = this.aClass57_Sub2_28.method2356(this.aClass5_Sub23_7.anInt9869, this.aClass5_Sub23_7.aByteArray102, false);
			this.anInterface15_6 = this.aClass57_Sub2_28.method2311(this.aClass5_Sub23_Sub1_3.anInt9869, false, 16, this.aClass5_Sub23_Sub1_3.aByteArray102);
			this.aClass356_16 = new Class356(this.anInterface15_6, 5126, 3, 0);
			this.aClass356_15 = new Class356(this.anInterface15_6, 5121, 4, 12);
		}
		this.aFloatArrayArray9 = this.aFloatArrayArray10 = this.aFloatArrayArray11 = null;
		this.aClass291_32 = null;
		this.aClass5_Sub23_Sub1_3 = null;
		this.aClass5_Sub23_7 = null;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZS)V")
	private void method6730(@OriginalArg(1) short arg0) {
		if (this.aClass57_Sub2_28.aBoolean216) {
			this.aClass5_Sub23_7.method8480(arg0);
		} else {
			this.aClass5_Sub23_7.method8539(arg0);
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III[[ZI)V")
	public void method6731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface21_5 == null || (arg0 + arg2 < this.anInt7828 || (this.anInt7833 < arg0 - arg2 || (this.anInt7826 > arg1 + arg2 || arg1 - arg2 > this.anInt7830)))) {
			return;
		}
		for (@Pc(67) int local67 = this.anInt7826; local67 <= this.anInt7830; local67++) {
			for (@Pc(72) int local72 = this.anInt7828; local72 <= this.anInt7833; local72++) {
				@Pc(79) int local79 = local72 - arg0;
				@Pc(83) int local83 = local67 - arg1;
				if (-arg2 < local79 && arg2 > local79 && -arg2 < local83 && local83 < arg2 && arg3[local79 + arg2][local83 + arg2]) {
					this.aClass57_Sub2_28.method2322((int) (this.aClass5_Sub43_2.method8250() * 255.0F) << 24);
					this.aClass57_Sub2_28.method2353((Class356) null, this.aClass356_16, this.aClass356_15, (Class356) null);
					this.aClass57_Sub2_28.method2323(this.anInterface21_5, this.anInt7829, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIIII)V")
	private void method6732(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg5 << this.aClass22_Sub1_3.anInt9378) + arg2;
		@Pc(23) int local23 = (arg0 << this.aClass22_Sub1_3.anInt9378) + arg4;
		@Pc(30) int local30 = this.aClass22_Sub1_3.method8032(local15, local23);
		if ((arg2 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | ((long) local23 & 0xFFFFL) << 16;
			@Pc(61) Class5 local61 = this.aClass291_32.method6993(local7, 1);
			if (local61 != null) {
				this.method6730(((Class5_Sub17) local61).aShort35);
				return;
			}
		}
		@Pc(85) short local85 = (short) this.anInt7825++;
		if (local7 != -1L) {
			this.aClass291_32.method6984(local7, new Class5_Sub17(local85));
		}
		@Pc(154) float local154;
		@Pc(136) float local136;
		@Pc(145) float local145;
		@Pc(226) float local226;
		@Pc(234) float local234;
		@Pc(241) float local241;
		@Pc(248) float local248;
		@Pc(255) float local255;
		@Pc(264) float local264;
		@Pc(273) float local273;
		@Pc(314) float local314;
		if (arg2 == 0 && arg4 == 0) {
			local136 = this.aFloatArrayArray10[arg1][arg3];
			local145 = this.aFloatArrayArray11[arg1][arg3];
			local154 = this.aFloatArrayArray9[arg1][arg3];
		} else if (this.aClass22_Sub1_3.anInt9377 == arg2 && arg4 == 0) {
			local136 = this.aFloatArrayArray10[arg1 + 1][arg3];
			local145 = this.aFloatArrayArray11[arg1 + 1][arg3];
			local154 = this.aFloatArrayArray9[arg1 + 1][arg3];
		} else if (arg2 == this.aClass22_Sub1_3.anInt9377 && arg4 == this.aClass22_Sub1_3.anInt9377) {
			local136 = this.aFloatArrayArray10[arg1 + 1][arg3 + 1];
			local154 = this.aFloatArrayArray9[arg1 + 1][arg3 + 1];
			local145 = this.aFloatArrayArray11[arg1 + 1][arg3 + 1];
		} else if (arg2 == 0 && arg4 == this.aClass22_Sub1_3.anInt9377) {
			local154 = this.aFloatArrayArray9[arg1][arg3 + 1];
			local136 = this.aFloatArrayArray10[arg1][arg3 + 1];
			local145 = this.aFloatArrayArray11[arg1][arg3 + 1];
		} else {
			local226 = (float) arg2 / (float) this.aClass22_Sub1_3.anInt9377;
			local234 = (float) arg4 / (float) this.aClass22_Sub1_3.anInt9377;
			local241 = this.aFloatArrayArray9[arg1][arg3];
			local248 = this.aFloatArrayArray10[arg1][arg3];
			local255 = this.aFloatArrayArray11[arg1][arg3];
			local264 = this.aFloatArrayArray9[arg1 + 1][arg3];
			local273 = this.aFloatArrayArray10[arg1 + 1][arg3];
			@Pc(288) float local288 = local248 + local226 * (this.aFloatArrayArray10[arg1][arg3 + 1] - local248);
			@Pc(305) float local305 = local264 + local226 * (this.aFloatArrayArray9[arg1 + 1][arg3 + 1] - local264);
			local314 = this.aFloatArrayArray11[arg1 + 1][arg3];
			@Pc(330) float local330 = local241 + (this.aFloatArrayArray9[arg1][arg3 + 1] - local241) * local226;
			@Pc(346) float local346 = local255 + (this.aFloatArrayArray11[arg1][arg3 + 1] - local255) * local226;
			@Pc(364) float local364 = local273 + (this.aFloatArrayArray10[arg1 + 1][arg3 + 1] - local273) * local226;
			@Pc(382) float local382 = local314 + (this.aFloatArrayArray11[arg1 + 1][arg3 + 1] - local314) * local226;
			local154 = local330 + local234 * (local305 - local330);
			local136 = local288 + (local364 - local288) * local234;
			local145 = local346 + local234 * (local382 - local346);
		}
		local226 = (float) (this.aClass5_Sub43_2.method8251() - local15);
		local234 = (float) (this.aClass5_Sub43_2.method8257() - local30);
		local241 = (float) (this.aClass5_Sub43_2.method8255() - local23);
		local248 = (float) Math.sqrt((double) (local234 * local234 + local226 * local226 + local241 * local241));
		local255 = 1.0F / local248;
		local226 *= local255;
		local241 *= local255;
		local234 *= local255;
		local264 = local248 / (float) this.aClass5_Sub43_2.method8254();
		local273 = 1.0F - local264 * local264;
		if (local273 < 0.0F) {
			local273 = 0.0F;
		}
		local314 = local145 * local241 + local154 * local226 + local136 * local234;
		if (local314 < 0.0F) {
			local314 = 0.0F;
		}
		@Pc(567) float local567 = local314 * 2.0F * local273;
		if (local567 > 1.0F) {
			local567 = 1.0F;
		}
		@Pc(578) int local578 = this.aClass5_Sub43_2.method8253();
		@Pc(588) int local588 = (int) ((float) (local578 >> 16 & 0xFF) * local567);
		if (local588 > 255) {
			local588 = 255;
		}
		@Pc(605) int local605 = (int) (local567 * (float) (local578 >> 8 & 0xFF));
		if (local605 > 255) {
			local605 = 255;
		}
		@Pc(620) int local620 = (int) ((float) (local578 & 0xFF) * local567);
		if (this.aClass57_Sub2_28.aBoolean216) {
			this.aClass5_Sub23_Sub1_3.method4302((float) local15);
			this.aClass5_Sub23_Sub1_3.method4302((float) local30);
			this.aClass5_Sub23_Sub1_3.method4302((float) local23);
		} else {
			this.aClass5_Sub23_Sub1_3.method4304((float) local15);
			this.aClass5_Sub23_Sub1_3.method4304((float) local30);
			this.aClass5_Sub23_Sub1_3.method4304((float) local23);
		}
		if (local620 > 255) {
			local620 = 255;
		}
		this.aClass5_Sub23_Sub1_3.method8502(local588);
		this.aClass5_Sub23_Sub1_3.method8502(local605);
		this.aClass5_Sub23_Sub1_3.method8502(local620);
		this.aClass5_Sub23_Sub1_3.method8502(255);
		this.method6730(local85);
	}
}
