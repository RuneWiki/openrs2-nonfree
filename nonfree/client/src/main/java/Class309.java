import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tfa")
public final class Class309 {

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "[[Lclient!wea;")
	private Class352[][] aClass352ArrayArray1;

	@OriginalMember(owner = "client!tfa", name = "s", descriptor = "Lclient!ji;")
	private final Class15_Sub3 aClass15_Sub3_37;

	@OriginalMember(owner = "client!tfa", name = "i", descriptor = "Lclient!wo;")
	private final Class4_Sub3 aClass4_Sub3_3;

	@OriginalMember(owner = "client!tfa", name = "m", descriptor = "I")
	public final int anInt9314;

	@OriginalMember(owner = "client!tfa", name = "d", descriptor = "I")
	private final int anInt9307;

	@OriginalMember(owner = "client!tfa", name = "e", descriptor = "[B")
	public final byte[] aByteArray108;

	@OriginalMember(owner = "client!tfa", name = "r", descriptor = "I")
	private final int anInt9317;

	@OriginalMember(owner = "client!tfa", name = "f", descriptor = "I")
	private final int anInt9308;

	@OriginalMember(owner = "client!tfa", name = "l", descriptor = "I")
	private final int anInt9313;

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lclient!ji;Lclient!wo;)V")
	public Class309(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) Class4_Sub3 arg1) {
		this.aClass15_Sub3_37 = arg0;
		this.aClass4_Sub3_3 = arg1;
		this.anInt9314 = (this.aClass4_Sub3_3.anInt10458 * this.aClass4_Sub3_3.anInt10461 >> this.aClass15_Sub3_37.anInt5327) + 2;
		this.anInt9307 = (this.aClass4_Sub3_3.anInt10459 * this.aClass4_Sub3_3.anInt10458 >> this.aClass15_Sub3_37.anInt5327) + 2;
		this.aByteArray108 = new byte[this.anInt9307 * this.anInt9314];
		this.anInt9317 = this.aClass15_Sub3_37.anInt5327 + 7 - this.aClass4_Sub3_3.anInt10463;
		this.anInt9308 = this.aClass4_Sub3_3.anInt10461 >> this.anInt9317;
		this.anInt9313 = this.aClass4_Sub3_3.anInt10459 >> this.anInt9317;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIBII)V")
	private void method7559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass352ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(26) int local26 = arg1 + arg0 - 1 - 1 >> 7;
		@Pc(36) int local36 = arg2 - 1 >> 7;
		@Pc(46) int local46 = arg3 + arg2 - 1 - 1 >> 7;
		for (@Pc(48) int local48 = local15; local48 <= local26; local48++) {
			@Pc(55) Class352[] local55 = this.aClass352ArrayArray1[local48];
			for (@Pc(57) int local57 = local36; local57 <= local46; local57++) {
				local55[local57].aBoolean843 = true;
			}
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "([[ZIIIIZ)V")
	public void method7561(@OriginalArg(0) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		this.aClass15_Sub3_37.method4414(false);
		this.aClass15_Sub3_37.method4413(false);
		this.aClass15_Sub3_37.method4448(-2);
		this.aClass15_Sub3_37.method4432(1);
		this.aClass15_Sub3_37.method4392(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass15_Sub3_37.anInt5326 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(66) int local66;
		@Pc(73) int local73;
		@Pc(75) int local75;
		if (arg4) {
			for (local43 = 0; local43 < this.anInt9313; local43++) {
				local50 = local43 << this.anInt9317;
				local57 = local43 + 1 << this.anInt9317;
				label128: for (local59 = 0; local59 < this.anInt9308; local59++) {
					local66 = local59 << this.anInt9317;
					local73 = local59 + 1 << this.anInt9317;
					for (local75 = local66; local75 < local73; local75++) {
						if (local75 - arg2 >= -arg1 && local75 - arg2 <= arg1) {
							for (@Pc(95) int local95 = local50; local95 < local57; local95++) {
								if (-arg1 <= local95 - arg3 && local95 - arg3 <= arg1 && arg0[local75 + arg1 - arg2][arg1 + local95 - arg3]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass352ArrayArray1[local59][local43].method8272();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt9313; local43++) {
				local50 = local43 << this.anInt9317;
				local57 = local43 + 1 << this.anInt9317;
				for (local59 = 0; local59 < this.anInt9308; local59++) {
					local66 = 0;
					local73 = local59 << this.anInt9317;
					local75 = local59 + 1 << this.anInt9317;
					@Pc(222) Class3_Sub7_Sub2 local222 = this.aClass15_Sub3_37.aClass3_Sub7_Sub2_3;
					local222.anInt7869 = 0;
					for (@Pc(227) int local227 = local50; local227 < local57; local227++) {
						if (-arg1 <= local227 - arg3 && arg1 >= local227 - arg3) {
							@Pc(248) int local248 = this.aClass4_Sub3_3.anInt10461 * local227 + local73;
							for (@Pc(250) int local250 = local73; local250 < local75; local250++) {
								if (local250 - arg2 >= -arg1 && arg1 >= local250 - arg2 && arg0[arg1 + local250 - arg2][local227 + arg1 - arg3]) {
									@Pc(291) short[] local291 = this.aClass4_Sub3_3.aShortArrayArray13[local248];
									if (local291 != null) {
										@Pc(299) int local299;
										if (this.aClass15_Sub3_37.aBoolean442) {
											for (local299 = 0; local299 < local291.length; local299++) {
												local222.method6528(local291[local299] & 0xFFFF);
												local66++;
											}
										} else {
											for (local299 = 0; local299 < local291.length; local299++) {
												local66++;
												local222.method6498(local291[local299] & 0xFFFF);
											}
										}
									}
								}
								local248++;
							}
						}
					}
					if (local66 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass352ArrayArray1[local59][local43].method8270(local222.aByteArray86, local66);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V")
	public void method7563() {
		this.aClass352ArrayArray1 = new Class352[this.anInt9308][this.anInt9313];
		for (@Pc(14) int local14 = 0; local14 < this.anInt9313; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt9308; local18++) {
				this.aClass352ArrayArray1[local18][local14] = new Class352(this.aClass15_Sub3_37, this, this.aClass4_Sub3_3, local18, local14, this.anInt9317, local18 * 128 + 1, local14 * 128 - -1);
			}
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ILclient!w;II)Z")
	public boolean method7564(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4_Sub2 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class3_Sub4_Sub2_Sub1 local6 = (Class3_Sub4_Sub2_Sub1) arg1;
		arg2 += local6.anInt947 + 1;
		arg0 += local6.anInt949 + 1;
		@Pc(27) int local27 = this.anInt9314 * arg2 + arg0;
		@Pc(30) int local30 = local6.anInt948;
		@Pc(33) int local33 = local6.anInt952;
		@Pc(39) int local39 = this.anInt9314 - local33;
		@Pc(45) int local45;
		if (arg2 <= 0) {
			local45 = 1 - arg2;
			arg2 = 1;
			local27 += this.anInt9314 * local45;
			local30 -= local45;
		}
		if (arg2 + local30 >= this.anInt9307) {
			local45 = local30 + arg2 + 1 - this.anInt9307;
			local30 -= local45;
		}
		if (arg0 <= 0) {
			local45 = 1 - arg0;
			local27 += local45;
			arg0 = 1;
			local33 -= local45;
			local39 += local45;
		}
		if (this.anInt9314 <= arg0 + local33) {
			local45 = local33 + arg0 + 1 - this.anInt9314;
			local39 += local45;
			local33 -= local45;
		}
		if (local33 > 0 && local30 > 0) {
			local39 += this.anInt9314 * 7;
			return Static536.method7896(local27, local33, local39, local30, this.aByteArray108);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IBLclient!w;I)V")
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub4_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub4_Sub2_Sub1 local6 = (Class3_Sub4_Sub2_Sub1) arg1;
		arg0 += local6.anInt947 + 1;
		arg2 += local6.anInt949 + 1;
		@Pc(27) int local27 = arg0 * this.anInt9314 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt948;
		@Pc(35) int local35 = local6.anInt952;
		@Pc(41) int local41 = this.anInt9314 - local35;
		@Pc(48) int local48;
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			local32 -= local48;
			local27 += local48 * this.anInt9314;
			arg0 = 1;
			local29 = local35 * local48;
		}
		@Pc(69) int local69 = 0;
		if (this.anInt9307 <= local32 + arg0) {
			local48 = arg0 + local32 + 1 - this.anInt9307;
			local32 -= local48;
		}
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			local27 += local48;
			local69 = local48;
			local35 -= local48;
			local29 += local48;
			arg2 = 1;
			local41 += local48;
		}
		if (arg2 + local35 >= this.anInt9314) {
			local48 = local35 + arg2 + 1 - this.anInt9314;
			local69 += local48;
			local41 += local48;
			local35 -= local48;
		}
		if (local35 > 0 && local32 > 0) {
			Static123.method2497(this.aByteArray108, local32, local69, local35, local41, local27, local29, local6.aByteArray11);
			this.method7559(local35, arg2, arg0, local32);
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(BILclient!w;I)V")
	public void method7567(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub4_Sub2_Sub1 local6 = (Class3_Sub4_Sub2_Sub1) arg1;
		arg0 += local6.anInt947 + 1;
		arg2 += local6.anInt949 + 1;
		@Pc(27) int local27 = arg0 * this.anInt9314 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt948;
		@Pc(39) int local39 = local6.anInt952;
		@Pc(45) int local45 = this.anInt9314 - local39;
		@Pc(55) int local55;
		if (arg0 <= 0) {
			local55 = 1 - arg0;
			local27 += this.anInt9314 * local55;
			local29 = local39 * local55;
			local32 -= local55;
			arg0 = 1;
		}
		@Pc(76) int local76 = 0;
		if (arg0 + local32 >= this.anInt9307) {
			local55 = arg0 + local32 + 1 - this.anInt9307;
			local32 -= local55;
		}
		if (arg2 <= 0) {
			local55 = 1 - arg2;
			local27 += local55;
			local39 -= local55;
			local29 += local55;
			local76 = local55;
			arg2 = 1;
			local45 += local55;
		}
		if (local39 + arg2 >= this.anInt9314) {
			local55 = local39 + arg2 + 1 - this.anInt9314;
			local76 += local55;
			local45 += local55;
			local39 -= local55;
		}
		if (local39 > 0 && local32 > 0) {
			Static98.method4084(local29, local39, local27, local6.aByteArray11, local45, this.aByteArray108, local32, local76);
			this.method7559(local39, arg2, arg0, local32);
		}
	}
}
