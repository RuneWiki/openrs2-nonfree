import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class33_Sub3 extends Class33 {

	@OriginalMember(owner = "client!rp", name = "p", descriptor = "Lclient!me;")
	private Class85_Sub3_Sub1 aClass85_Sub3_Sub1_4;

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
	private int anInt8738 = 0;

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
	private int anInt8740 = 0;

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "I")
	private int anInt8743 = 0;

	@OriginalMember(owner = "client!rp", name = "n", descriptor = "I")
	private int anInt8747 = 0;

	@OriginalMember(owner = "client!rp", name = "A", descriptor = "I")
	private int anInt8757 = 0;

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "Z")
	private boolean aBoolean682 = false;

	@OriginalMember(owner = "client!rp", name = "z", descriptor = "Lclient!dia;")
	private final Class13_Sub2 aClass13_Sub2_38;

	@OriginalMember(owner = "client!rp", name = "s", descriptor = "Lclient!me;")
	private final Class85_Sub3_Sub1 aClass85_Sub3_Sub1_5;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!dia;IIZ)V")
	public Class33_Sub3(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass13_Sub2_38 = arg0;
		this.aClass85_Sub3_Sub1_5 = Static306.method4684(arg3 ? 6408 : 6407, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!dia;IIII)V")
	public Class33_Sub3(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass13_Sub2_38 = arg0;
		this.aClass85_Sub3_Sub1_5 = Static518.method7286(arg4, arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!dia;II[III)V")
	public Class33_Sub3(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass13_Sub2_38 = arg0;
		this.aClass85_Sub3_Sub1_5 = Static488.method7056(arg1, arg3, arg5, arg2, arg0, arg4);
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(IIII)V")
	@Override
	public void method7664(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8757 = arg1;
		this.anInt8747 = arg0;
		this.anInt8740 = arg3;
		this.anInt8738 = arg2;
		this.aBoolean682 = this.anInt8747 != 0 || this.anInt8757 != 0 || this.anInt8738 != 0 || this.anInt8740 != 0;
	}

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "()I")
	@Override
	public int method7662() {
		return this.aClass85_Sub3_Sub1_5.anInt5927;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IB)V")
	private void method7670(@OriginalArg(0) int arg0) {
		this.aClass13_Sub2_38.method2008(1);
		this.aClass13_Sub2_38.method2024(this.aClass85_Sub3_Sub1_5);
		this.aClass13_Sub2_38.method1993(7681, this.aClass13_Sub2_38.method1979(arg0));
		this.aClass13_Sub2_38.method2012(34167, 768, 1);
		this.aClass13_Sub2_38.method2028(0, 34168);
		this.aClass13_Sub2_38.method2008(0);
		this.aClass13_Sub2_38.method2024(this.aClass85_Sub3_Sub1_4);
		this.aClass13_Sub2_38.method1993(7681, 34479);
		this.aClass13_Sub2_38.method2012(34166, 768, 1);
		if (this.anInt8743 == 0) {
			this.aClass13_Sub2_38.method1983(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt8743 == 1) {
			this.aClass13_Sub2_38.method1983(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt8743 == 2) {
			this.aClass13_Sub2_38.method1983(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt8743 == 3) {
			this.aClass13_Sub2_38.method1983(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method7652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass85_Sub3_Sub1_5.method7875(true);
		this.aClass13_Sub2_38.method1974();
		this.aClass13_Sub2_38.method2019(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean682) {
			@Pc(190) float local190 = (float) arg2 / (float) this.method7645();
			@Pc(197) float local197 = (float) arg3 / (float) this.method7658();
			@Pc(206) float local206 = (float) arg0 + (float) this.anInt8747 * local190;
			@Pc(215) float local215 = (float) this.anInt8757 * local197 + (float) arg1;
			@Pc(224) float local224 = (float) this.aClass85_Sub3_Sub1_5.anInt5931 * local190 + local206;
			@Pc(233) float local233 = (float) this.aClass85_Sub3_Sub1_5.anInt5927 * local197 + local215;
			if (this.aClass85_Sub3_Sub1_4 == null) {
				this.aClass13_Sub2_38.method2024(this.aClass85_Sub3_Sub1_5);
				this.aClass13_Sub2_38.method1960(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass85_Sub3_Sub1_5.aFloat118);
				OpenGL.glVertex2f(local206, local215);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local206, local233);
				OpenGL.glTexCoord2f(this.aClass85_Sub3_Sub1_5.aFloat119, 0.0F);
				OpenGL.glVertex2f(local224, local233);
				OpenGL.glTexCoord2f(this.aClass85_Sub3_Sub1_5.aFloat119, this.aClass85_Sub3_Sub1_5.aFloat118);
				OpenGL.glVertex2f(local224, local215);
				OpenGL.glEnd();
			} else {
				this.method7670(arg4);
				this.aClass85_Sub3_Sub1_4.method7875(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass85_Sub3_Sub1_5.aFloat118);
				OpenGL.glTexCoord2f(0.0F, this.aClass85_Sub3_Sub1_5.aFloat118);
				OpenGL.glVertex2f(local206, local215);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local206, local233);
				OpenGL.glMultiTexCoord2f(33985, this.aClass85_Sub3_Sub1_5.aFloat119, 0.0F);
				OpenGL.glTexCoord2f(this.aClass85_Sub3_Sub1_5.aFloat119, 0.0F);
				OpenGL.glVertex2f(local224, local233);
				OpenGL.glMultiTexCoord2f(33985, this.aClass85_Sub3_Sub1_5.aFloat119, this.aClass85_Sub3_Sub1_5.aFloat118);
				OpenGL.glTexCoord2f(this.aClass85_Sub3_Sub1_5.aFloat119, this.aClass85_Sub3_Sub1_5.aFloat118);
				OpenGL.glVertex2f(local224, local215);
				OpenGL.glEnd();
				this.method7671();
			}
		} else if (this.aClass85_Sub3_Sub1_4 == null) {
			this.aClass13_Sub2_38.method2024(this.aClass85_Sub3_Sub1_5);
			this.aClass13_Sub2_38.method1960(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass85_Sub3_Sub1_5.aFloat118);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass85_Sub3_Sub1_5.aFloat119, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass85_Sub3_Sub1_5.aFloat119, this.aClass85_Sub3_Sub1_5.aFloat118);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method7670(arg4);
			this.aClass85_Sub3_Sub1_4.method7875(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass85_Sub3_Sub1_5.aFloat118);
			OpenGL.glTexCoord2f(0.0F, this.aClass85_Sub3_Sub1_5.aFloat118);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass85_Sub3_Sub1_5.aFloat119, 0.0F);
			OpenGL.glTexCoord2f(this.aClass85_Sub3_Sub1_5.aFloat119, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass85_Sub3_Sub1_5.aFloat119, this.aClass85_Sub3_Sub1_5.aFloat118);
			OpenGL.glTexCoord2f(this.aClass85_Sub3_Sub1_5.aFloat119, this.aClass85_Sub3_Sub1_5.aFloat118);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method7671();
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V")
	private void method7671() {
		this.aClass13_Sub2_38.method2008(1);
		this.aClass13_Sub2_38.method2024((Class85) null);
		this.aClass13_Sub2_38.method1993(8448, 8448);
		this.aClass13_Sub2_38.method2012(34168, 768, 1);
		this.aClass13_Sub2_38.method2028(0, 5890);
		this.aClass13_Sub2_38.method2008(0);
		this.aClass13_Sub2_38.method2012(34168, 768, 1);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method7650(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class85_Sub3_Sub1 local7 = ((Class1_Sub1) arg6).aClass85_Sub3_Sub1_1;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(31) float local31;
		if (this.aBoolean682) {
			local14 = (float) this.method7645();
			local18 = (float) this.method7658();
			local24 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = local38 * (float) this.anInt8757;
			@Pc(56) float local56 = local44 * (float) this.anInt8757;
			@Pc(62) float local62 = local24 * (float) this.anInt8747;
			@Pc(68) float local68 = (float) this.anInt8747 * local31;
			@Pc(75) float local75 = -local24 * (float) this.anInt8738;
			@Pc(82) float local82 = (float) this.anInt8738 * -local31;
			@Pc(89) float local89 = (float) this.anInt8740 * -local38;
			arg1 = local56 + local68 + arg1;
			@Pc(102) float local102 = (float) this.anInt8740 * -local44;
			arg0 = local50 + local62 + arg0;
			arg4 = arg4 + local62 + local89;
			arg2 = local50 + arg2 + local75;
			arg3 = arg3 + local82 + local56;
			arg5 = arg5 + local68 + local102;
		}
		local14 = arg2 + arg4 - arg0;
		local18 = arg5 + arg3 - arg1;
		this.aClass85_Sub3_Sub1_5.method7875(true);
		this.aClass13_Sub2_38.method1974();
		this.aClass13_Sub2_38.method2024(this.aClass85_Sub3_Sub1_5);
		this.aClass13_Sub2_38.method1960(1);
		this.aClass13_Sub2_38.method2008(1);
		this.aClass13_Sub2_38.method2024(local7);
		this.aClass13_Sub2_38.method1993(8448, 7681);
		this.aClass13_Sub2_38.method2012(34168, 768, 0);
		this.aClass13_Sub2_38.method2019(1);
		local24 = local7.aFloat119 / (float) local7.anInt5931;
		local31 = local7.aFloat118 / (float) local7.anInt5927;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass85_Sub3_Sub1_5.aFloat118);
		OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * local24, local7.aFloat118 - ((float) -arg8 + arg1) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg4), local7.aFloat118 - (arg5 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass85_Sub3_Sub1_5.aFloat119, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (local14 - (float) arg7) * local24, local7.aFloat118 - local31 * ((float) -arg8 + local18));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass85_Sub3_Sub1_5.aFloat119, this.aClass85_Sub3_Sub1_5.aFloat118);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg2) * local24, local7.aFloat118 - (arg3 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass13_Sub2_38.method2012(5890, 768, 0);
		this.aClass13_Sub2_38.method1960(0);
		this.aClass13_Sub2_38.method2024((Class85) null);
		this.aClass13_Sub2_38.method2008(0);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)V")
	@Override
	public void method7643(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass85_Sub3_Sub1_4 = Static518.method7286(this.aClass85_Sub3_Sub1_5.anInt5927, this.aClass13_Sub2_38, 0, 0, this.aClass85_Sub3_Sub1_5.anInt5931);
		this.anInt8743 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIII[III)V")
	private void method7672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass85_Sub3_Sub1_5.method5372(arg4, arg1, arg3, arg5, arg2, arg0);
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "()I")
	@Override
	public int method7658() {
		return this.anInt8740 + this.anInt8757 + this.aClass85_Sub3_Sub1_5.anInt5927;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method7647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg2;
		@Pc(9) Class85_Sub3_Sub1 local9 = local6.aClass85_Sub3_Sub1_1;
		this.aClass85_Sub3_Sub1_5.method7875(false);
		this.aClass13_Sub2_38.method1974();
		this.aClass13_Sub2_38.method2024(this.aClass85_Sub3_Sub1_5);
		this.aClass13_Sub2_38.method1960(1);
		this.aClass13_Sub2_38.method2008(1);
		this.aClass13_Sub2_38.method2024(local9);
		this.aClass13_Sub2_38.method1993(8448, 7681);
		this.aClass13_Sub2_38.method2012(34168, 768, 0);
		this.aClass13_Sub2_38.method2019(1);
		@Pc(62) int local62 = arg1 + this.anInt8757;
		@Pc(67) int local67 = arg0 + this.anInt8747;
		@Pc(74) int local74 = local67 + this.aClass85_Sub3_Sub1_5.anInt5931;
		@Pc(80) int local80 = local62 + this.aClass85_Sub3_Sub1_5.anInt5927;
		@Pc(87) float local87 = local9.aFloat119 / (float) local9.anInt5931;
		@Pc(94) float local94 = local9.aFloat118 / (float) local9.anInt5927;
		@Pc(102) float local102 = local87 * (float) (local67 - arg3);
		@Pc(110) float local110 = local87 * (float) (local74 - arg3);
		@Pc(121) float local121 = local9.aFloat118 - (float) (local62 - arg4) * local94;
		@Pc(132) float local132 = local9.aFloat118 - (float) (local80 - arg4) * local94;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass85_Sub3_Sub1_5.aFloat118);
		OpenGL.glMultiTexCoord2f(33985, local102, local121);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local132);
		OpenGL.glVertex2i(local67, this.aClass85_Sub3_Sub1_5.anInt5927 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass85_Sub3_Sub1_5.aFloat119, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local132);
		OpenGL.glVertex2i(this.aClass85_Sub3_Sub1_5.anInt5931 + local67, this.aClass85_Sub3_Sub1_5.anInt5927 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass85_Sub3_Sub1_5.aFloat119, this.aClass85_Sub3_Sub1_5.aFloat118);
		OpenGL.glMultiTexCoord2f(33985, local110, local121);
		OpenGL.glVertex2i(this.aClass85_Sub3_Sub1_5.anInt5931 + local67, local62);
		OpenGL.glEnd();
		this.aClass13_Sub2_38.method2012(5890, 768, 0);
		this.aClass13_Sub2_38.method1960(0);
		this.aClass13_Sub2_38.method2024((Class85) null);
		this.aClass13_Sub2_38.method2008(0);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg0 + arg2;
		this.aClass85_Sub3_Sub1_5.method7875(false);
		@Pc(19) int local19 = arg1 + arg3;
		this.aClass13_Sub2_38.method1974();
		this.aClass13_Sub2_38.method2024(this.aClass85_Sub3_Sub1_5);
		this.aClass13_Sub2_38.method2019(arg6);
		this.aClass13_Sub2_38.method1960(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass85_Sub3_Sub1_5.aBoolean427 && !this.aBoolean682) {
			@Pc(73) float local73 = (float) arg3 * this.aClass85_Sub3_Sub1_5.aFloat118 / (float) this.aClass85_Sub3_Sub1_5.anInt5927;
			@Pc(85) float local85 = (float) arg2 * this.aClass85_Sub3_Sub1_5.aFloat119 / (float) this.aClass85_Sub3_Sub1_5.anInt5931;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local73);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local19);
			OpenGL.glTexCoord2f(local85, 0.0F);
			OpenGL.glVertex2i(local10, local19);
			OpenGL.glTexCoord2f(local85, local73);
			OpenGL.glVertex2i(local10, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt8747, (float) this.anInt8757, 0.0F);
		@Pc(125) int local125 = this.method7645();
		@Pc(128) int local128 = this.method7658();
		@Pc(134) int local134 = this.aClass85_Sub3_Sub1_5.anInt5927 + arg1;
		OpenGL.glBegin(7);
		@Pc(138) int local138 = arg1;
		@Pc(146) int local146;
		while (local19 >= local134) {
			local146 = this.aClass85_Sub3_Sub1_5.anInt5931 + arg0;
			@Pc(148) int local148 = arg0;
			while (local146 <= local10) {
				OpenGL.glTexCoord2f(0.0F, this.aClass85_Sub3_Sub1_5.aFloat118);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(this.aClass85_Sub3_Sub1_5.aFloat119, 0.0F);
				OpenGL.glVertex2i(local146, local134);
				OpenGL.glTexCoord2f(this.aClass85_Sub3_Sub1_5.aFloat119, this.aClass85_Sub3_Sub1_5.aFloat118);
				OpenGL.glVertex2i(local146, local138);
				local146 += local125;
				local148 += local125;
			}
			if (local148 < local10) {
				@Pc(218) float local218 = this.aClass85_Sub3_Sub1_5.aFloat119 * (float) (local10 - local148) / (float) this.aClass85_Sub3_Sub1_5.anInt5931;
				OpenGL.glTexCoord2f(0.0F, this.aClass85_Sub3_Sub1_5.aFloat118);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(local218, 0.0F);
				OpenGL.glVertex2i(local10, local134);
				OpenGL.glTexCoord2f(local218, this.aClass85_Sub3_Sub1_5.aFloat118);
				OpenGL.glVertex2i(local10, local138);
			}
			local134 += local128;
			local138 += local128;
		}
		if (local19 > local138) {
			@Pc(282) float local282 = (float) (local138 + this.aClass85_Sub3_Sub1_5.anInt5927 - local19) * this.aClass85_Sub3_Sub1_5.aFloat118 / (float) this.aClass85_Sub3_Sub1_5.anInt5927;
			@Pc(288) int local288 = arg0 + this.aClass85_Sub3_Sub1_5.anInt5931;
			local146 = arg0;
			while (local10 >= local288) {
				OpenGL.glTexCoord2f(0.0F, this.aClass85_Sub3_Sub1_5.aFloat118);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local282);
				OpenGL.glVertex2i(local146, local19);
				OpenGL.glTexCoord2f(this.aClass85_Sub3_Sub1_5.aFloat119, local282);
				OpenGL.glVertex2i(local288, local19);
				OpenGL.glTexCoord2f(this.aClass85_Sub3_Sub1_5.aFloat119, this.aClass85_Sub3_Sub1_5.aFloat118);
				OpenGL.glVertex2i(local288, local138);
				local288 += local125;
				local146 += local125;
			}
			if (local10 > local146) {
				@Pc(357) float local357 = this.aClass85_Sub3_Sub1_5.aFloat119 * (float) (local10 - local146) / (float) this.aClass85_Sub3_Sub1_5.anInt5931;
				OpenGL.glTexCoord2f(0.0F, this.aClass85_Sub3_Sub1_5.aFloat118);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local282);
				OpenGL.glVertex2i(local146, local19);
				OpenGL.glTexCoord2f(local357, local282);
				OpenGL.glVertex2i(local10, local19);
				OpenGL.glTexCoord2f(local357, this.aClass85_Sub3_Sub1_5.aFloat118);
				OpenGL.glVertex2i(local10, local138);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method7644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass85_Sub3_Sub1_5.method7875(false);
		this.aClass13_Sub2_38.method1974();
		this.aClass13_Sub2_38.method2019(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt8757;
		@Pc(42) int local42 = arg0 + this.anInt8747;
		if (this.aClass85_Sub3_Sub1_4 == null) {
			this.aClass13_Sub2_38.method2024(this.aClass85_Sub3_Sub1_5);
			this.aClass13_Sub2_38.method1960(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass85_Sub3_Sub1_5.aFloat118);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, this.aClass85_Sub3_Sub1_5.anInt5927 + local37);
			OpenGL.glTexCoord2f(this.aClass85_Sub3_Sub1_5.aFloat119, 0.0F);
			OpenGL.glVertex2i(local42 + this.aClass85_Sub3_Sub1_5.anInt5931, local37 - -this.aClass85_Sub3_Sub1_5.anInt5927);
			OpenGL.glTexCoord2f(this.aClass85_Sub3_Sub1_5.aFloat119, this.aClass85_Sub3_Sub1_5.aFloat118);
			OpenGL.glVertex2i(local42 + this.aClass85_Sub3_Sub1_5.anInt5931, local37);
			OpenGL.glEnd();
			return;
		}
		this.method7670(arg2);
		this.aClass85_Sub3_Sub1_4.method7875(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass85_Sub3_Sub1_5.aFloat118);
		OpenGL.glTexCoord2f(0.0F, this.aClass85_Sub3_Sub1_5.aFloat118);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, this.aClass85_Sub3_Sub1_5.anInt5927 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass85_Sub3_Sub1_5.aFloat119, 0.0F);
		OpenGL.glTexCoord2f(this.aClass85_Sub3_Sub1_5.aFloat119, 0.0F);
		OpenGL.glVertex2i(this.aClass85_Sub3_Sub1_5.anInt5931 + local42, local37 + this.aClass85_Sub3_Sub1_5.anInt5927);
		OpenGL.glMultiTexCoord2f(33985, this.aClass85_Sub3_Sub1_5.aFloat119, this.aClass85_Sub3_Sub1_5.aFloat118);
		OpenGL.glTexCoord2f(this.aClass85_Sub3_Sub1_5.aFloat119, this.aClass85_Sub3_Sub1_5.aFloat118);
		OpenGL.glVertex2i(this.aClass85_Sub3_Sub1_5.anInt5931 + local42, local37);
		OpenGL.glEnd();
		this.method7671();
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method7648(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean682) {
			local6 = (float) this.method7645();
			local10 = (float) this.method7658();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(36) float local36 = (arg5 - arg1) / local10;
			@Pc(42) float local42 = local29 * (float) this.anInt8757;
			@Pc(48) float local48 = local36 * (float) this.anInt8757;
			@Pc(54) float local54 = local16 * (float) this.anInt8747;
			@Pc(60) float local60 = local22 * (float) this.anInt8747;
			@Pc(67) float local67 = (float) this.anInt8738 * -local16;
			@Pc(74) float local74 = (float) this.anInt8738 * -local22;
			@Pc(81) float local81 = -local29 * (float) this.anInt8740;
			@Pc(88) float local88 = (float) this.anInt8740 * -local36;
			arg0 = arg0 + local54 + local42;
			arg1 = arg1 + local60 + local48;
			arg4 = arg4 + local54 + local81;
			arg3 = local48 + arg3 + local74;
			arg2 = local42 + arg2 + local67;
			arg5 = local88 + arg5 + local60;
		}
		local6 = arg2 + arg4 - arg0;
		this.aClass85_Sub3_Sub1_5.method7875(true);
		local10 = arg5 + arg3 - arg1;
		this.aClass13_Sub2_38.method1974();
		this.aClass13_Sub2_38.method2024(this.aClass85_Sub3_Sub1_5);
		this.aClass13_Sub2_38.method2019(1);
		this.aClass13_Sub2_38.method1960(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass85_Sub3_Sub1_5.aFloat118);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass85_Sub3_Sub1_5.aFloat119, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass85_Sub3_Sub1_5.aFloat119, this.aClass85_Sub3_Sub1_5.aFloat118);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "()I")
	@Override
	public int method7645() {
		return this.aClass85_Sub3_Sub1_5.anInt5931 + this.anInt8747 + this.anInt8738;
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "()I")
	@Override
	public int method7659() {
		return this.aClass85_Sub3_Sub1_5.anInt5931;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass13_Sub2_38.aBoolean161) {
			this.aClass85_Sub3_Sub1_5.method5371(arg4, arg1, arg2, arg3, arg5, arg0);
			return;
		}
		@Pc(13) int[] local13 = this.aClass13_Sub2_38.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method7672(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "([I)V")
	@Override
	public void method7657(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt8740;
		arg0[2] = this.anInt8738;
		arg0[0] = this.anInt8747;
		arg0[1] = this.anInt8757;
	}
}
