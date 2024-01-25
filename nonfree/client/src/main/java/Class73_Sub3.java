import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wfa")
public final class Class73_Sub3 extends Class73 {

	@OriginalMember(owner = "client!wfa", name = "D", descriptor = "Lclient!cea;")
	private Class50_Sub1_Sub1 aClass50_Sub1_Sub1_5;

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "I")
	private int anInt10106 = 0;

	@OriginalMember(owner = "client!wfa", name = "e", descriptor = "I")
	private int anInt10108 = 0;

	@OriginalMember(owner = "client!wfa", name = "g", descriptor = "Z")
	private boolean aBoolean703 = false;

	@OriginalMember(owner = "client!wfa", name = "j", descriptor = "I")
	private int anInt10111 = 0;

	@OriginalMember(owner = "client!wfa", name = "w", descriptor = "I")
	private int anInt10123 = 0;

	@OriginalMember(owner = "client!wfa", name = "u", descriptor = "I")
	private int anInt10121 = 0;

	@OriginalMember(owner = "client!wfa", name = "m", descriptor = "Lclient!er;")
	private final Class31_Sub2 aClass31_Sub2_44;

	@OriginalMember(owner = "client!wfa", name = "f", descriptor = "Lclient!cea;")
	public final Class50_Sub1_Sub1 aClass50_Sub1_Sub1_4;

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Lclient!er;IIZ)V")
	public Class73_Sub3(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass31_Sub2_44 = arg0;
		this.aClass50_Sub1_Sub1_4 = Static333.method4885(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Lclient!er;IIII)V")
	public Class73_Sub3(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass31_Sub2_44 = arg0;
		this.aClass50_Sub1_Sub1_4 = Static264.method4042(arg2, arg3, arg1, arg0, arg4);
	}

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Lclient!er;II[III)V")
	public Class73_Sub3(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass31_Sub2_44 = arg0;
		this.aClass50_Sub1_Sub1_4 = Static309.method4636(arg3, arg5, arg1, arg0, arg2, arg4);
	}

	@OriginalMember(owner = "client!wfa", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.aClass50_Sub1_Sub1_4.anInt1674;
	}

	@OriginalMember(owner = "client!wfa", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt10121 = arg1;
		this.anInt10108 = arg2;
		this.anInt10123 = arg0;
		this.anInt10106 = arg3;
		this.aBoolean703 = this.anInt10123 != 0 || this.anInt10121 != 0 || this.anInt10108 != 0 || this.anInt10106 != 0;
	}

	@OriginalMember(owner = "client!wfa", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass50_Sub1_Sub1_5 = Static264.method4042(arg1, this.aClass50_Sub1_Sub1_4.anInt1674, arg0, this.aClass31_Sub2_44, this.aClass50_Sub1_Sub1_4.anInt1677);
		this.anInt10111 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!wfa", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg0 + arg2;
		this.aClass50_Sub1_Sub1_4.method6153(false);
		@Pc(18) int local18 = arg3 + arg1;
		this.aClass31_Sub2_44.method2501();
		this.aClass31_Sub2_44.method2535(this.aClass50_Sub1_Sub1_4);
		this.aClass31_Sub2_44.method2568(arg6);
		this.aClass31_Sub2_44.method2495(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass50_Sub1_Sub1_4.aBoolean123 && !this.aBoolean703) {
			@Pc(345) float local345 = this.aClass50_Sub1_Sub1_4.aFloat58 * (float) arg3 / (float) this.aClass50_Sub1_Sub1_4.anInt1677;
			@Pc(357) float local357 = this.aClass50_Sub1_Sub1_4.aFloat57 * (float) arg2 / (float) this.aClass50_Sub1_Sub1_4.anInt1674;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local345);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local18);
			OpenGL.glTexCoord2f(local357, 0.0F);
			OpenGL.glVertex2i(local9, local18);
			OpenGL.glTexCoord2f(local357, local345);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt10123, (float) this.anInt10121, 0.0F);
		@Pc(72) int local72 = this.A();
		@Pc(75) int local75 = this.ca();
		@Pc(81) int local81 = this.aClass50_Sub1_Sub1_4.anInt1677 + arg1;
		OpenGL.glBegin(7);
		@Pc(85) int local85 = arg1;
		@Pc(93) int local93;
		while (local18 >= local81) {
			local93 = arg0 + this.aClass50_Sub1_Sub1_4.anInt1674;
			@Pc(95) int local95 = arg0;
			while (local93 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass50_Sub1_Sub1_4.aFloat58);
				OpenGL.glVertex2i(local95, local85);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local95, local81);
				OpenGL.glTexCoord2f(this.aClass50_Sub1_Sub1_4.aFloat57, 0.0F);
				OpenGL.glVertex2i(local93, local81);
				OpenGL.glTexCoord2f(this.aClass50_Sub1_Sub1_4.aFloat57, this.aClass50_Sub1_Sub1_4.aFloat58);
				OpenGL.glVertex2i(local93, local85);
				local93 += local72;
				local95 += local72;
			}
			if (local9 > local95) {
				@Pc(158) float local158 = (float) (local9 - local95) * this.aClass50_Sub1_Sub1_4.aFloat57 / (float) this.aClass50_Sub1_Sub1_4.anInt1674;
				OpenGL.glTexCoord2f(0.0F, this.aClass50_Sub1_Sub1_4.aFloat58);
				OpenGL.glVertex2i(local95, local85);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local95, local81);
				OpenGL.glTexCoord2f(local158, 0.0F);
				OpenGL.glVertex2i(local9, local81);
				OpenGL.glTexCoord2f(local158, this.aClass50_Sub1_Sub1_4.aFloat58);
				OpenGL.glVertex2i(local9, local85);
			}
			local85 += local75;
			local81 += local75;
		}
		if (local18 > local85) {
			@Pc(222) float local222 = (float) (this.aClass50_Sub1_Sub1_4.anInt1677 + local85 - local18) * this.aClass50_Sub1_Sub1_4.aFloat58 / (float) this.aClass50_Sub1_Sub1_4.anInt1677;
			@Pc(229) int local229 = arg0 + this.aClass50_Sub1_Sub1_4.anInt1674;
			local93 = arg0;
			while (local9 >= local229) {
				OpenGL.glTexCoord2f(0.0F, this.aClass50_Sub1_Sub1_4.aFloat58);
				OpenGL.glVertex2i(local93, local85);
				OpenGL.glTexCoord2f(0.0F, local222);
				OpenGL.glVertex2i(local93, local18);
				OpenGL.glTexCoord2f(this.aClass50_Sub1_Sub1_4.aFloat57, local222);
				OpenGL.glVertex2i(local229, local18);
				OpenGL.glTexCoord2f(this.aClass50_Sub1_Sub1_4.aFloat57, this.aClass50_Sub1_Sub1_4.aFloat58);
				OpenGL.glVertex2i(local229, local85);
				local229 += local72;
				local93 += local72;
			}
			if (local9 > local93) {
				@Pc(302) float local302 = (float) (local9 - local93) * this.aClass50_Sub1_Sub1_4.aFloat57 / (float) this.aClass50_Sub1_Sub1_4.anInt1674;
				OpenGL.glTexCoord2f(0.0F, this.aClass50_Sub1_Sub1_4.aFloat58);
				OpenGL.glVertex2i(local93, local85);
				OpenGL.glTexCoord2f(0.0F, local222);
				OpenGL.glVertex2i(local93, local18);
				OpenGL.glTexCoord2f(local302, local222);
				OpenGL.glVertex2i(local9, local18);
				OpenGL.glTexCoord2f(local302, this.aClass50_Sub1_Sub1_4.aFloat58);
				OpenGL.glVertex2i(local9, local85);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V")
	private void method7962() {
		this.aClass31_Sub2_44.method2513(1);
		this.aClass31_Sub2_44.method2535(null);
		this.aClass31_Sub2_44.method2536(8448, 8448);
		this.aClass31_Sub2_44.method2523(768, 34168, 1);
		this.aClass31_Sub2_44.method2499(5890, 0);
		this.aClass31_Sub2_44.method2513(0);
		this.aClass31_Sub2_44.method2523(768, 34168, 1);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method7952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class53 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class53_Sub2 local6 = (Class53_Sub2) arg2;
		@Pc(9) Class50_Sub1_Sub1 local9 = local6.aClass50_Sub1_Sub1_3;
		this.aClass50_Sub1_Sub1_4.method6153(false);
		this.aClass31_Sub2_44.method2501();
		this.aClass31_Sub2_44.method2535(this.aClass50_Sub1_Sub1_4);
		this.aClass31_Sub2_44.method2495(1);
		this.aClass31_Sub2_44.method2513(1);
		this.aClass31_Sub2_44.method2535(local9);
		this.aClass31_Sub2_44.method2536(8448, 7681);
		this.aClass31_Sub2_44.method2523(768, 34168, 0);
		this.aClass31_Sub2_44.method2568(1);
		@Pc(62) int local62 = arg1 + this.anInt10121;
		@Pc(67) int local67 = arg0 + this.anInt10123;
		@Pc(73) int local73 = this.aClass50_Sub1_Sub1_4.anInt1674 + local67;
		@Pc(80) int local80 = local62 + this.aClass50_Sub1_Sub1_4.anInt1677;
		@Pc(87) float local87 = local9.aFloat57 / (float) local9.anInt1674;
		@Pc(94) float local94 = local9.aFloat58 / (float) local9.anInt1677;
		@Pc(101) float local101 = (float) (local67 - arg3) * local87;
		@Pc(109) float local109 = (float) (local73 - arg3) * local87;
		@Pc(121) float local121 = local9.aFloat58 - local94 * (float) (local62 - arg4);
		@Pc(132) float local132 = local9.aFloat58 - (float) (local80 - arg4) * local94;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass50_Sub1_Sub1_4.aFloat58);
		OpenGL.glMultiTexCoord2f(33985, local101, local121);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local132);
		OpenGL.glVertex2i(local67, this.aClass50_Sub1_Sub1_4.anInt1677 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass50_Sub1_Sub1_4.aFloat57, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local132);
		OpenGL.glVertex2i(local67 + this.aClass50_Sub1_Sub1_4.anInt1674, local62 + this.aClass50_Sub1_Sub1_4.anInt1677);
		OpenGL.glMultiTexCoord2f(33984, this.aClass50_Sub1_Sub1_4.aFloat57, this.aClass50_Sub1_Sub1_4.aFloat58);
		OpenGL.glMultiTexCoord2f(33985, local109, local121);
		OpenGL.glVertex2i(local67 + this.aClass50_Sub1_Sub1_4.anInt1674, local62);
		OpenGL.glEnd();
		this.aClass31_Sub2_44.method2523(768, 5890, 0);
		this.aClass31_Sub2_44.method2495(0);
		this.aClass31_Sub2_44.method2535(null);
		this.aClass31_Sub2_44.method2513(0);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected void method7951(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class53 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class50_Sub1_Sub1 local7 = ((Class53_Sub2) arg6).aClass50_Sub1_Sub1_3;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(31) float local31;
		if (this.aBoolean703) {
			local14 = this.A();
			local18 = this.ca();
			local25 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(45) float local45 = (arg5 - arg1) / local18;
			@Pc(51) float local51 = local38 * (float) this.anInt10121;
			@Pc(57) float local57 = local45 * (float) this.anInt10121;
			@Pc(63) float local63 = local25 * (float) this.anInt10123;
			@Pc(69) float local69 = local31 * (float) this.anInt10123;
			@Pc(76) float local76 = -local25 * (float) this.anInt10108;
			@Pc(83) float local83 = (float) this.anInt10108 * -local31;
			@Pc(90) float local90 = (float) this.anInt10106 * -local38;
			@Pc(97) float local97 = -local45 * (float) this.anInt10106;
			arg4 = local90 + local63 + arg4;
			arg3 = local57 + local83 + arg3;
			arg2 = local51 + arg2 + local76;
			arg1 = arg1 + local69 + local57;
			arg0 = local63 + arg0 + local51;
			arg5 = local69 + arg5 + local97;
		}
		local14 = arg4 + arg2 - arg0;
		local18 = arg5 + arg3 - arg1;
		this.aClass50_Sub1_Sub1_4.method6153(true);
		this.aClass31_Sub2_44.method2501();
		this.aClass31_Sub2_44.method2535(this.aClass50_Sub1_Sub1_4);
		this.aClass31_Sub2_44.method2495(1);
		this.aClass31_Sub2_44.method2513(1);
		this.aClass31_Sub2_44.method2535(local7);
		this.aClass31_Sub2_44.method2536(8448, 7681);
		this.aClass31_Sub2_44.method2523(768, 34168, 0);
		this.aClass31_Sub2_44.method2568(1);
		local25 = local7.aFloat57 / (float) local7.anInt1674;
		local31 = local7.aFloat58 / (float) local7.anInt1677;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass50_Sub1_Sub1_4.aFloat58);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg0), local7.aFloat58 - local31 * (arg1 - (float) arg8));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg4) * local25, local7.aFloat58 - ((float) -arg8 + arg5) * local31);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass50_Sub1_Sub1_4.aFloat57, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (local14 - (float) arg7) * local25, local7.aFloat58 - ((float) -arg8 + local18) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass50_Sub1_Sub1_4.aFloat57, this.aClass50_Sub1_Sub1_4.aFloat58);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg2), local7.aFloat58 - local31 * (arg3 - (float) arg8));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass31_Sub2_44.method2523(768, 5890, 0);
		this.aClass31_Sub2_44.method2495(0);
		this.aClass31_Sub2_44.method2535(null);
		this.aClass31_Sub2_44.method2513(0);
	}

	@OriginalMember(owner = "client!wfa", name = "V", descriptor = "(IIIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass50_Sub1_Sub1_4.method6153(false);
		this.aClass31_Sub2_44.method2501();
		this.aClass31_Sub2_44.method2568(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt10121;
		@Pc(42) int local42 = arg0 + this.anInt10123;
		if (this.aClass50_Sub1_Sub1_5 == null) {
			this.aClass31_Sub2_44.method2535(this.aClass50_Sub1_Sub1_4);
			this.aClass31_Sub2_44.method2495(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass50_Sub1_Sub1_4.aFloat58);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, local37 + this.aClass50_Sub1_Sub1_4.anInt1677);
			OpenGL.glTexCoord2f(this.aClass50_Sub1_Sub1_4.aFloat57, 0.0F);
			OpenGL.glVertex2i(local42 + this.aClass50_Sub1_Sub1_4.anInt1674, local37 - -this.aClass50_Sub1_Sub1_4.anInt1677);
			OpenGL.glTexCoord2f(this.aClass50_Sub1_Sub1_4.aFloat57, this.aClass50_Sub1_Sub1_4.aFloat58);
			OpenGL.glVertex2i(this.aClass50_Sub1_Sub1_4.anInt1674 + local42, local37);
			OpenGL.glEnd();
			return;
		}
		this.method7967(arg2);
		this.aClass50_Sub1_Sub1_5.method6153(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass50_Sub1_Sub1_4.aFloat58);
		OpenGL.glTexCoord2f(0.0F, this.aClass50_Sub1_Sub1_4.aFloat58);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, local37 + this.aClass50_Sub1_Sub1_4.anInt1677);
		OpenGL.glMultiTexCoord2f(33985, this.aClass50_Sub1_Sub1_4.aFloat57, 0.0F);
		OpenGL.glTexCoord2f(this.aClass50_Sub1_Sub1_4.aFloat57, 0.0F);
		OpenGL.glVertex2i(this.aClass50_Sub1_Sub1_4.anInt1674 + local42, local37 - -this.aClass50_Sub1_Sub1_4.anInt1677);
		OpenGL.glMultiTexCoord2f(33985, this.aClass50_Sub1_Sub1_4.aFloat57, this.aClass50_Sub1_Sub1_4.aFloat58);
		OpenGL.glTexCoord2f(this.aClass50_Sub1_Sub1_4.aFloat57, this.aClass50_Sub1_Sub1_4.aFloat58);
		OpenGL.glVertex2i(local42 + this.aClass50_Sub1_Sub1_4.anInt1674, local37);
		OpenGL.glEnd();
		this.method7962();
	}

	@OriginalMember(owner = "client!wfa", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean703) {
			local6 = this.A();
			local10 = this.ca();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(24) float local24 = (arg3 - arg1) / local6;
			@Pc(31) float local31 = (arg4 - arg0) / local10;
			@Pc(37) float local37 = (arg5 - arg1) / local10;
			@Pc(43) float local43 = local31 * (float) this.anInt10121;
			@Pc(49) float local49 = local37 * (float) this.anInt10121;
			@Pc(55) float local55 = (float) this.anInt10123 * local17;
			@Pc(61) float local61 = local24 * (float) this.anInt10123;
			@Pc(68) float local68 = (float) this.anInt10108 * -local17;
			@Pc(75) float local75 = -local24 * (float) this.anInt10108;
			@Pc(82) float local82 = (float) this.anInt10106 * -local31;
			@Pc(89) float local89 = -local37 * (float) this.anInt10106;
			arg0 = local43 + local55 + arg0;
			arg3 = local75 + arg3 + local49;
			arg2 = local43 + local68 + arg2;
			arg1 = local49 + local61 + arg1;
			arg4 = local82 + arg4 + local55;
			arg5 = local61 + arg5 + local89;
		}
		local6 = arg2 + arg4 - arg0;
		local10 = arg3 + arg5 - arg1;
		this.aClass50_Sub1_Sub1_4.method6153(true);
		this.aClass31_Sub2_44.method2501();
		this.aClass31_Sub2_44.method2535(this.aClass50_Sub1_Sub1_4);
		this.aClass31_Sub2_44.method2568(arg8);
		this.aClass31_Sub2_44.method2495(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass50_Sub1_Sub1_4.aFloat58);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass50_Sub1_Sub1_4.aFloat57, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass50_Sub1_Sub1_4.aFloat57, this.aClass50_Sub1_Sub1_4.aFloat58);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!wfa", name = "A", descriptor = "()I")
	@Override
	public int A() {
		return this.anInt10108 + this.anInt10123 + this.aClass50_Sub1_Sub1_4.anInt1674;
	}

	@OriginalMember(owner = "client!wfa", name = "da", descriptor = "(IIIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass50_Sub1_Sub1_4.method1508(arg5, arg1, arg2, arg3, arg0, arg4);
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(II)V")
	private void method7967(@OriginalArg(0) int arg0) {
		this.aClass31_Sub2_44.method2513(1);
		this.aClass31_Sub2_44.method2535(this.aClass50_Sub1_Sub1_4);
		this.aClass31_Sub2_44.method2536(7681, this.aClass31_Sub2_44.method2504(arg0));
		this.aClass31_Sub2_44.method2523(768, 34167, 1);
		this.aClass31_Sub2_44.method2499(34168, 0);
		this.aClass31_Sub2_44.method2513(0);
		this.aClass31_Sub2_44.method2535(this.aClass50_Sub1_Sub1_5);
		this.aClass31_Sub2_44.method2536(7681, 34479);
		this.aClass31_Sub2_44.method2523(768, 34166, 1);
		if (this.anInt10111 == 0) {
			this.aClass31_Sub2_44.method2524(1.0F, 0.0F, 0.5F, 0.5F);
		} else if (this.anInt10111 == 1) {
			this.aClass31_Sub2_44.method2524(0.5F, 0.0F, 1.0F, 0.5F);
		} else if (this.anInt10111 == 2) {
			this.aClass31_Sub2_44.method2524(0.5F, 0.0F, 0.5F, 1.0F);
		} else if (this.anInt10111 == 3) {
			this.aClass31_Sub2_44.method2524(128.5F, 0.0F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aClass50_Sub1_Sub1_4.anInt1677;
	}

	@OriginalMember(owner = "client!wfa", name = "ca", descriptor = "()I")
	@Override
	public int ca() {
		return this.anInt10121 + this.aClass50_Sub1_Sub1_4.anInt1677 + this.anInt10106;
	}

	@OriginalMember(owner = "client!wfa", name = "YA", descriptor = "(IIIIIIII)V")
	@Override
	protected void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass50_Sub1_Sub1_4.method6153(true);
		this.aClass31_Sub2_44.method2501();
		this.aClass31_Sub2_44.method2568(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean703) {
			@Pc(189) float local189 = (float) arg2 / (float) this.A();
			@Pc(196) float local196 = (float) arg3 / (float) this.ca();
			@Pc(205) float local205 = (float) arg0 + local189 * (float) this.anInt10123;
			@Pc(214) float local214 = (float) arg1 + (float) this.anInt10121 * local196;
			@Pc(223) float local223 = local189 * (float) this.aClass50_Sub1_Sub1_4.anInt1674 + local205;
			@Pc(232) float local232 = local214 + (float) this.aClass50_Sub1_Sub1_4.anInt1677 * local196;
			if (this.aClass50_Sub1_Sub1_5 == null) {
				this.aClass31_Sub2_44.method2535(this.aClass50_Sub1_Sub1_4);
				this.aClass31_Sub2_44.method2495(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass50_Sub1_Sub1_4.aFloat58);
				OpenGL.glVertex2f(local205, local214);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local205, local232);
				OpenGL.glTexCoord2f(this.aClass50_Sub1_Sub1_4.aFloat57, 0.0F);
				OpenGL.glVertex2f(local223, local232);
				OpenGL.glTexCoord2f(this.aClass50_Sub1_Sub1_4.aFloat57, this.aClass50_Sub1_Sub1_4.aFloat58);
				OpenGL.glVertex2f(local223, local214);
				OpenGL.glEnd();
			} else {
				this.method7967(arg4);
				this.aClass50_Sub1_Sub1_5.method6153(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass50_Sub1_Sub1_4.aFloat58);
				OpenGL.glTexCoord2f(0.0F, this.aClass50_Sub1_Sub1_4.aFloat58);
				OpenGL.glVertex2f(local205, local214);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local205, local232);
				OpenGL.glMultiTexCoord2f(33985, this.aClass50_Sub1_Sub1_4.aFloat57, 0.0F);
				OpenGL.glTexCoord2f(this.aClass50_Sub1_Sub1_4.aFloat57, 0.0F);
				OpenGL.glVertex2f(local223, local232);
				OpenGL.glMultiTexCoord2f(33985, this.aClass50_Sub1_Sub1_4.aFloat57, this.aClass50_Sub1_Sub1_4.aFloat58);
				OpenGL.glTexCoord2f(this.aClass50_Sub1_Sub1_4.aFloat57, this.aClass50_Sub1_Sub1_4.aFloat58);
				OpenGL.glVertex2f(local223, local214);
				OpenGL.glEnd();
				this.method7962();
			}
		} else if (this.aClass50_Sub1_Sub1_5 == null) {
			this.aClass31_Sub2_44.method2535(this.aClass50_Sub1_Sub1_4);
			this.aClass31_Sub2_44.method2495(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass50_Sub1_Sub1_4.aFloat58);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass50_Sub1_Sub1_4.aFloat57, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass50_Sub1_Sub1_4.aFloat57, this.aClass50_Sub1_Sub1_4.aFloat58);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method7967(arg4);
			this.aClass50_Sub1_Sub1_5.method6153(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass50_Sub1_Sub1_4.aFloat58);
			OpenGL.glTexCoord2f(0.0F, this.aClass50_Sub1_Sub1_4.aFloat58);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass50_Sub1_Sub1_4.aFloat57, 0.0F);
			OpenGL.glTexCoord2f(this.aClass50_Sub1_Sub1_4.aFloat57, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass50_Sub1_Sub1_4.aFloat57, this.aClass50_Sub1_Sub1_4.aFloat58);
			OpenGL.glTexCoord2f(this.aClass50_Sub1_Sub1_4.aFloat57, this.aClass50_Sub1_Sub1_4.aFloat58);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method7962();
		}
	}
}
