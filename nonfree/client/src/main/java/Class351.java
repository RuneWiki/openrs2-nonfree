import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!waa")
public final class Class351 {

	@OriginalMember(owner = "client!waa", name = "s", descriptor = "[[Lclient!wv;")
	private Class362[][] aClass362ArrayArray1;

	@OriginalMember(owner = "client!waa", name = "l", descriptor = "Lclient!sm;")
	private final Class16_Sub3 aClass16_Sub3_3;

	@OriginalMember(owner = "client!waa", name = "g", descriptor = "Lclient!no;")
	private final Class66_Sub3 aClass66_Sub3_42;

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "I")
	public final int anInt9531;

	@OriginalMember(owner = "client!waa", name = "h", descriptor = "I")
	private final int anInt9536;

	@OriginalMember(owner = "client!waa", name = "r", descriptor = "I")
	private final int anInt9543;

	@OriginalMember(owner = "client!waa", name = "p", descriptor = "[B")
	public final byte[] aByteArray117;

	@OriginalMember(owner = "client!waa", name = "m", descriptor = "I")
	private final int anInt9540;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "I")
	private final int anInt9530;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!no;Lclient!sm;)V")
	public Class351(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) Class16_Sub3 arg1) {
		this.aClass16_Sub3_3 = arg1;
		this.aClass66_Sub3_42 = arg0;
		this.anInt9531 = (this.aClass16_Sub3_3.anInt9841 * this.aClass16_Sub3_3.anInt9838 >> this.aClass66_Sub3_42.anInt6443) + 2;
		this.anInt9536 = (this.aClass16_Sub3_3.anInt9841 * this.aClass16_Sub3_3.anInt9839 >> this.aClass66_Sub3_42.anInt6443) + 2;
		this.anInt9543 = this.aClass66_Sub3_42.anInt6443 + 7 - this.aClass16_Sub3_3.anInt9837;
		this.aByteArray117 = new byte[this.anInt9536 * this.anInt9531];
		this.anInt9540 = this.aClass16_Sub3_3.anInt9838 >> this.anInt9543;
		this.anInt9530 = this.aClass16_Sub3_3.anInt9839 >> this.anInt9543;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)V")
	public void method7829() {
		this.aClass362ArrayArray1 = new Class362[this.anInt9540][this.anInt9530];
		for (@Pc(14) int local14 = 0; local14 < this.anInt9530; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt9540; local18++) {
				this.aClass362ArrayArray1[local18][local14] = new Class362(this.aClass66_Sub3_42, this, this.aClass16_Sub3_3, local18, local14, this.anInt9543, local18 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(III[[ZIZ)V")
	public void method7830(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		this.aClass66_Sub3_42.method5405(false);
		this.aClass66_Sub3_42.method5432(false);
		this.aClass66_Sub3_42.method5431(-2);
		this.aClass66_Sub3_42.method5355(1);
		this.aClass66_Sub3_42.method5398(1);
		@Pc(42) float local42 = 1.0F / (float) (this.aClass66_Sub3_42.anInt6441 * 128);
		@Pc(46) int local46;
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(62) int local62;
		@Pc(66) int local66;
		@Pc(71) int local71;
		@Pc(78) int local78;
		if (arg4) {
			for (local46 = 0; local46 < this.anInt9530; local46++) {
				local53 = local46 << this.anInt9543;
				local60 = local46 + 1 << this.anInt9543;
				label81: for (local62 = 0; local62 < this.anInt9540; local62++) {
					local66 = local62 << this.anInt9543;
					local71 = local62 + 1 << this.anInt9543;
					for (local78 = local66; local78 < local71; local78++) {
						if (local78 - arg0 >= -arg1 && arg1 >= local78 - arg0) {
							for (@Pc(331) int local331 = local53; local331 < local60; local331++) {
								if (local331 - arg3 >= -arg1 && arg1 >= local331 - arg3 && arg2[arg1 + local78 - arg0][local331 + arg1 - arg3]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local42, local42, 1.0F);
									OpenGL.glTranslatef((float) -local62 / local42, (float) -local46 / local42, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass362ArrayArray1[local62][local46].method8032();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local46 = 0; local46 < this.anInt9530; local46++) {
				local53 = local46 << this.anInt9543;
				local60 = local46 + 1 << this.anInt9543;
				for (local62 = 0; local62 < this.anInt9540; local62++) {
					local66 = 0;
					local71 = local62 << this.anInt9543;
					local78 = local62 + 1 << this.anInt9543;
					@Pc(82) Class4_Sub9_Sub2 local82 = this.aClass66_Sub3_42.aClass4_Sub9_Sub2_2;
					local82.anInt7219 = 0;
					for (@Pc(87) int local87 = local53; local87 < local60; local87++) {
						if (local87 - arg3 >= -arg1 && local87 - arg3 <= arg1) {
							@Pc(117) int local117 = local71 + local87 * this.aClass16_Sub3_3.anInt9838;
							for (@Pc(119) int local119 = local71; local119 < local78; local119++) {
								if (local119 - arg0 >= -arg1 && local119 - arg0 <= arg1 && arg2[local119 + arg1 - arg0][local87 + arg1 - arg3]) {
									@Pc(165) short[] local165 = this.aClass16_Sub3_3.aShortArrayArray32[local117];
									if (local165 != null) {
										@Pc(173) int local173;
										if (this.aClass66_Sub3_42.aBoolean476) {
											for (local173 = 0; local173 < local165.length; local173++) {
												local66++;
												local82.method6012(local165[local173] & 0xFFFF);
											}
										} else {
											for (local173 = 0; local173 < local165.length; local173++) {
												local82.method5989(local165[local173] & 0xFFFF);
												local66++;
											}
										}
									}
								}
								local117++;
							}
						}
					}
					if (local66 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local42, local42, 1.0F);
						OpenGL.glTranslatef((float) -local62 / local42, (float) -local46 / local42, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass362ArrayArray1[local62][local46].method8033(local66, local82.aByteArray97);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIBII)V")
	private void method7831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass362ArrayArray1 == null) {
			return;
		}
		@Pc(26) int local26 = arg1 - 1 >> 7;
		@Pc(36) int local36 = arg1 + arg3 - 1 - 1 >> 7;
		@Pc(42) int local42 = arg2 - 1 >> 7;
		@Pc(51) int local51 = arg2 + arg0 - 2 >> 7;
		for (@Pc(53) int local53 = local26; local53 <= local36; local53++) {
			@Pc(60) Class362[] local60 = this.aClass362ArrayArray1[local53];
			for (@Pc(62) int local62 = local42; local62 <= local51; local62++) {
				local60[local62].aBoolean695 = true;
			}
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lclient!w;III)Z")
	public boolean method7833(@OriginalArg(0) Class4_Sub7_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class4_Sub7_Sub3_Sub2 local6 = (Class4_Sub7_Sub3_Sub2) arg0;
		arg1 += local6.anInt6601 + 1;
		arg2 += local6.anInt6608 + 1;
		@Pc(28) int local28 = arg2 + arg1 * this.anInt9531;
		@Pc(31) int local31 = local6.anInt6603;
		@Pc(34) int local34 = local6.anInt6600;
		@Pc(39) int local39 = this.anInt9531 - local34;
		@Pc(46) int local46;
		if (arg1 <= 0) {
			local46 = 1 - arg1;
			local28 += local46 * this.anInt9531;
			arg1 = 1;
			local31 -= local46;
		}
		if (this.anInt9536 <= arg1 + local31) {
			local46 = arg1 + local31 + 1 - this.anInt9536;
			local31 -= local46;
		}
		if (arg2 <= 0) {
			local46 = 1 - arg2;
			arg2 = 1;
			local28 += local46;
			local39 += local46;
			local34 -= local46;
		}
		if (this.anInt9531 <= local34 + arg2) {
			local46 = arg2 + local34 + 1 - this.anInt9531;
			local39 += local46;
			local34 -= local46;
		}
		if (local34 > 0 && local31 > 0) {
			local39 += this.anInt9531 * 7;
			return Static547.method5790(local28, local31, local34, this.aByteArray117, local39);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IILclient!w;I)V")
	public void method7835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub7_Sub3 arg2) {
		@Pc(6) Class4_Sub7_Sub3_Sub2 local6 = (Class4_Sub7_Sub3_Sub2) arg2;
		arg0 += local6.anInt6608 + 1;
		arg1 += local6.anInt6601 + 1;
		@Pc(27) int local27 = this.anInt9531 * arg1 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt6603;
		@Pc(35) int local35 = local6.anInt6600;
		@Pc(41) int local41 = this.anInt9531 - local35;
		@Pc(47) int local47;
		if (arg1 <= 0) {
			local47 = 1 - arg1;
			arg1 = 1;
			local32 -= local47;
			local27 += this.anInt9531 * local47;
			local29 = local35 * local47;
		}
		@Pc(68) int local68 = 0;
		if (arg1 + local32 >= this.anInt9536) {
			local47 = arg1 + local32 + 1 - this.anInt9536;
			local32 -= local47;
		}
		if (arg0 <= 0) {
			local47 = 1 - arg0;
			local68 = local47;
			local35 -= local47;
			local27 += local47;
			arg0 = 1;
			local41 += local47;
			local29 += local47;
		}
		if (this.anInt9531 <= arg0 + local35) {
			local47 = local35 + arg0 + 1 - this.anInt9531;
			local68 += local47;
			local35 -= local47;
			local41 += local47;
		}
		if (local35 > 0 && local32 > 0) {
			Static272.method4391(local6.aByteArray73, local29, local41, local35, local32, this.aByteArray117, local68, local27);
			this.method7831(local32, arg0, arg1, local35);
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(ILclient!w;II)V")
	public void method7837(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub7_Sub3 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class4_Sub7_Sub3_Sub2 local6 = (Class4_Sub7_Sub3_Sub2) arg1;
		arg2 += local6.anInt6608 + 1;
		arg0 += local6.anInt6601 + 1;
		@Pc(27) int local27 = arg0 * this.anInt9531 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt6603;
		@Pc(35) int local35 = local6.anInt6600;
		@Pc(41) int local41 = this.anInt9531 - local35;
		@Pc(50) int local50;
		if (arg0 <= 0) {
			local50 = 1 - arg0;
			local32 -= local50;
			local27 += this.anInt9531 * local50;
			arg0 = 1;
			local29 = local50 * local35;
		}
		@Pc(71) int local71 = 0;
		if (this.anInt9536 <= arg0 + local32) {
			local50 = arg0 + local32 + 1 - this.anInt9536;
			local32 -= local50;
		}
		if (arg2 <= 0) {
			local50 = 1 - arg2;
			local41 += local50;
			local29 += local50;
			arg2 = 1;
			local35 -= local50;
			local71 = local50;
			local27 += local50;
		}
		if (this.anInt9531 <= local35 + arg2) {
			local50 = local35 + arg2 + 1 - this.anInt9531;
			local41 += local50;
			local71 += local50;
			local35 -= local50;
		}
		if (local35 > 0 && local32 > 0) {
			Static146.method3012(local32, local35, local71, local27, this.aByteArray117, local6.aByteArray73, local41, local29);
			this.method7831(local32, arg2, arg0, local35);
		}
	}
}
