import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Class146 {

	@OriginalMember(owner = "client!lv", name = "o", descriptor = "[[Lclient!dr;")
	private Class55[][] aClass55ArrayArray1;

	@OriginalMember(owner = "client!lv", name = "r", descriptor = "Lclient!si;")
	private final Class159_Sub2 aClass159_Sub2_3;

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "Lclient!vj;")
	private final Class172_Sub2 aClass172_Sub2_22;

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
	public final int anInt4572;

	@OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
	private final int anInt4573;

	@OriginalMember(owner = "client!lv", name = "p", descriptor = "[B")
	public final byte[] aByteArray56;

	@OriginalMember(owner = "client!lv", name = "g", descriptor = "I")
	private final int anInt4574;

	@OriginalMember(owner = "client!lv", name = "s", descriptor = "I")
	private final int anInt4582;

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
	private final int anInt4571;

	static {
		new Class189("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lclient!vj;Lclient!si;)V")
	public Class146(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) Class159_Sub2 arg1) {
		this.aClass159_Sub2_3 = arg1;
		this.aClass172_Sub2_22 = arg0;
		this.anInt4572 = (this.aClass159_Sub2_3.anInt6189 * this.aClass159_Sub2_3.anInt6190 >> this.aClass172_Sub2_22.anInt7162) + 2;
		this.anInt4573 = (this.aClass159_Sub2_3.anInt6192 * this.aClass159_Sub2_3.anInt6190 >> this.aClass172_Sub2_22.anInt7162) + 2;
		this.aByteArray56 = new byte[this.anInt4573 * this.anInt4572];
		this.anInt4574 = this.aClass172_Sub2_22.anInt7162 + 7 - this.aClass159_Sub2_3.anInt6193;
		this.anInt4582 = this.aClass159_Sub2_3.anInt6189 >> this.anInt4574;
		this.anInt4571 = this.aClass159_Sub2_3.anInt6192 >> this.anInt4574;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!j;IIB)Z")
	public boolean method3612(@OriginalArg(0) Class3_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class3_Sub4_Sub4_Sub1 local6 = (Class3_Sub4_Sub4_Sub1) arg0;
		arg1 += local6.anInt1513 + 1;
		arg2 += local6.anInt1511 + 1;
		@Pc(27) int local27 = arg1 * this.anInt4572 + arg2;
		@Pc(30) int local30 = local6.anInt1510;
		@Pc(33) int local33 = local6.anInt1512;
		@Pc(48) int local48 = this.anInt4572 - local33;
		@Pc(55) int local55;
		if (arg1 <= 0) {
			local55 = 1 - arg1;
			local30 -= local55;
			arg1 = 1;
			local27 += this.anInt4572 * local55;
		}
		if (this.anInt4573 <= local30 + arg1) {
			local55 = local30 + arg1 + 1 - this.anInt4573;
			local30 -= local55;
		}
		if (arg2 <= 0) {
			local55 = 1 - arg2;
			local27 += local55;
			local33 -= local55;
			arg2 = 1;
			local48 += local55;
		}
		if (this.anInt4572 <= arg2 + local33) {
			local55 = local33 + arg2 + 1 - this.anInt4572;
			local48 += local55;
			local33 -= local55;
		}
		if (local33 > 0 && local30 > 0) {
			local48 += this.anInt4572 * 7;
			return Static345.method5808(local30, local48, local27, local33, this.aByteArray56);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIZZ[[ZI)V")
	public void method3613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) int arg4) {
		this.aClass172_Sub2_22.method5581(false);
		this.aClass172_Sub2_22.method5624(false);
		this.aClass172_Sub2_22.method5610(-2);
		this.aClass172_Sub2_22.method5629(1);
		this.aClass172_Sub2_22.method5574(1);
		@Pc(49) float local49 = 1.0F / (float) (this.aClass172_Sub2_22.anInt7163 * 128);
		@Pc(53) int local53;
		@Pc(60) int local60;
		@Pc(67) int local67;
		@Pc(69) int local69;
		@Pc(76) int local76;
		@Pc(83) int local83;
		@Pc(85) int local85;
		if (arg2) {
			for (local53 = 0; local53 < this.anInt4571; local53++) {
				local60 = local53 << this.anInt4574;
				local67 = local53 + 1 << this.anInt4574;
				label128: for (local69 = 0; local69 < this.anInt4582; local69++) {
					local76 = local69 << this.anInt4574;
					local83 = local69 + 1 << this.anInt4574;
					for (local85 = local76; local85 < local83; local85++) {
						if (local85 - arg4 >= -arg1 && local85 - arg4 <= arg1) {
							for (@Pc(104) int local104 = local60; local104 < local67; local104++) {
								if (local104 - arg0 >= -arg1 && arg1 >= local104 - arg0 && arg3[local85 + arg1 - arg4][local104 + arg1 - arg0]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local49, local49, 1.0F);
									OpenGL.glTranslatef((float) -local69 / local49, (float) -local53 / local49, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass55ArrayArray1[local69][local53].method1471();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local53 = 0; local53 < this.anInt4571; local53++) {
				local60 = local53 << this.anInt4574;
				local67 = local53 + 1 << this.anInt4574;
				for (local69 = 0; local69 < this.anInt4582; local69++) {
					local76 = 0;
					local83 = local69 << this.anInt4574;
					local85 = local69 + 1 << this.anInt4574;
					@Pc(235) Class3_Sub7 local235 = Static273.aClass3_Sub7_2;
					local235.anInt3235 = 0;
					for (@Pc(240) int local240 = local60; local240 < local67; local240++) {
						if (-arg1 <= local240 - arg0 && arg1 >= local240 - arg0) {
							@Pc(267) int local267 = local83 + local240 * this.aClass159_Sub2_3.anInt6189;
							for (@Pc(269) int local269 = local83; local269 < local85; local269++) {
								if (local269 - arg4 >= -arg1 && local269 - arg4 <= arg1 && arg3[arg1 + local269 - arg4][local240 + arg1 - arg0]) {
									@Pc(304) short[] local304 = this.aClass159_Sub2_3.aShortArrayArray5[local267];
									if (local304 != null) {
										@Pc(312) int local312;
										if (this.aClass172_Sub2_22.aBoolean621) {
											for (local312 = 0; local312 < local304.length; local312++) {
												local235.method2613(local304[local312] & 0xFFFF);
												local76++;
											}
										} else {
											for (local312 = 0; local312 < local304.length; local312++) {
												local76++;
												local235.method2585(local304[local312] & 0xFFFF);
											}
										}
									}
								}
								local267++;
							}
						}
					}
					if (local76 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local49, local49, 1.0F);
						OpenGL.glTranslatef((float) -local69 / local49, (float) -local53 / local49, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass55ArrayArray1[local69][local53].method1475(local235.aByteArray46, local76);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ZIIII)V")
	private void method3614(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass55ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(23) int local23 = arg3 + arg1 - 2 >> 7;
		@Pc(29) int local29 = arg0 - 1 >> 7;
		@Pc(39) int local39 = arg0 + arg2 - 1 - 1 >> 7;
		for (@Pc(45) int local45 = local15; local45 <= local23; local45++) {
			@Pc(52) Class55[] local52 = this.aClass55ArrayArray1[local45];
			for (@Pc(54) int local54 = local29; local54 <= local39; local54++) {
				local52[local54].aBoolean157 = true;
			}
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IILclient!j;I)V")
	public void method3615(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4_Sub4 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class3_Sub4_Sub4_Sub1 local6 = (Class3_Sub4_Sub4_Sub1) arg1;
		arg2 += local6.anInt1511 + 1;
		arg0 += local6.anInt1513 + 1;
		@Pc(27) int local27 = arg2 + this.anInt4572 * arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt1510;
		@Pc(35) int local35 = local6.anInt1512;
		@Pc(41) int local41 = this.anInt4572 - local35;
		@Pc(48) int local48;
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			local27 += this.anInt4572 * local48;
			arg0 = 1;
			local32 -= local48;
			local29 = local35 * local48;
		}
		@Pc(69) int local69 = 0;
		if (arg0 + local32 >= this.anInt4573) {
			local48 = local32 + arg0 + 1 - this.anInt4573;
			local32 -= local48;
		}
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			local27 += local48;
			local29 += local48;
			local35 -= local48;
			local69 = local48;
			local41 += local48;
			arg2 = 1;
		}
		if (this.anInt4572 <= arg2 + local35) {
			local48 = local35 + arg2 + 1 - this.anInt4572;
			local35 -= local48;
			local41 += local48;
			local69 += local48;
		}
		if (local35 > 0 && local32 > 0) {
			Static407.method5242(local41, local32, local35, this.aByteArray56, local69, local27, local6.aByteArray20, local29);
			this.method3614(arg0, arg2, local32, local35);
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
	public void method3616() {
		this.aClass55ArrayArray1 = new Class55[this.anInt4582][this.anInt4571];
		for (@Pc(18) int local18 = 0; local18 < this.anInt4571; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt4582; local22++) {
				this.aClass55ArrayArray1[local22][local18] = new Class55(this.aClass172_Sub2_22, this, this.aClass159_Sub2_3, local22, local18, this.anInt4574, local22 * 128 + 1, local18 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!j;III)V")
	public void method3617(@OriginalArg(0) Class3_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class3_Sub4_Sub4_Sub1 local6 = (Class3_Sub4_Sub4_Sub1) arg0;
		arg1 += local6.anInt1511 + 1;
		arg2 += local6.anInt1513 + 1;
		@Pc(27) int local27 = this.anInt4572 * arg2 + arg1;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt1510;
		@Pc(35) int local35 = local6.anInt1512;
		@Pc(41) int local41 = this.anInt4572 - local35;
		@Pc(43) int local43 = 0;
		@Pc(50) int local50;
		if (arg2 <= 0) {
			local50 = 1 - arg2;
			local32 -= local50;
			local27 += local50 * this.anInt4572;
			arg2 = 1;
			local29 = local50 * local35;
		}
		if (local32 + arg2 >= this.anInt4573) {
			local50 = local32 + arg2 + 1 - this.anInt4573;
			local32 -= local50;
		}
		if (arg1 <= 0) {
			local50 = 1 - arg1;
			local35 -= local50;
			local27 += local50;
			local41 += local50;
			local43 = local50;
			arg1 = 1;
			local29 += local50;
		}
		if (this.anInt4572 <= arg1 + local35) {
			local50 = local35 + arg1 + 1 - this.anInt4572;
			local43 += local50;
			local35 -= local50;
			local41 += local50;
		}
		if (local35 > 0 && local32 > 0) {
			Static49.method872(local29, local6.aByteArray20, local27, local41, this.aByteArray56, local35, local32, local43);
			this.method3614(arg2, arg1, local32, local35);
		}
	}
}
