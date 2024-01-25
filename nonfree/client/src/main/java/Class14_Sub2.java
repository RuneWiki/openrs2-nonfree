import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Lclient!br;")
	private Class24_Sub1_Sub1 aClass24_Sub1_Sub1_1;

	@OriginalMember(owner = "client!be", name = "d", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "I")
	private int anInt709 = 0;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "I")
	private int anInt710 = 0;

	@OriginalMember(owner = "client!be", name = "s", descriptor = "I")
	private int anInt723 = 0;

	@OriginalMember(owner = "client!be", name = "z", descriptor = "I")
	private int anInt729 = 0;

	@OriginalMember(owner = "client!be", name = "y", descriptor = "I")
	private int anInt728 = 0;

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Lclient!vj;")
	private final Class45_Sub3 aClass45_Sub3_5;

	@OriginalMember(owner = "client!be", name = "t", descriptor = "Lclient!br;")
	public final Class24_Sub1_Sub1 aClass24_Sub1_Sub1_2;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!vj;IIZ)V")
	public Class14_Sub2(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass45_Sub3_5 = arg0;
		this.aClass24_Sub1_Sub1_2 = Static514.method6923(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!vj;IIII)V")
	public Class14_Sub2(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass45_Sub3_5 = arg0;
		this.aClass24_Sub1_Sub1_2 = Static401.method5816(arg2, arg0, arg1, arg4, arg3);
	}

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!vj;II[III)V")
	public Class14_Sub2(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass45_Sub3_5 = arg0;
		this.aClass24_Sub1_Sub1_2 = Static236.method3659(arg2, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!be", name = "da", descriptor = "(IIIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass24_Sub1_Sub1_2.method822(arg4, arg3, arg1, arg5, arg0, arg2);
	}

	@OriginalMember(owner = "client!be", name = "A", descriptor = "()I")
	@Override
	public int A() {
		return this.aClass24_Sub1_Sub1_2.anInt991 + this.anInt709 + this.anInt728;
	}

	@OriginalMember(owner = "client!be", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass24_Sub1_Sub1_1 = Static401.method5816(arg1, this.aClass45_Sub3_5, arg0, this.aClass24_Sub1_Sub1_2.anInt990, this.aClass24_Sub1_Sub1_2.anInt991);
		this.anInt710 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected void method7684(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class81 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class24_Sub1_Sub1 local7 = ((Class81_Sub1) arg6).aClass24_Sub1_Sub1_3;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(31) float local31;
		if (this.aBoolean71) {
			local14 = this.A();
			local18 = this.ca();
			local24 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(43) float local43 = (arg5 - arg1) / local18;
			@Pc(49) float local49 = (float) this.anInt723 * local37;
			@Pc(55) float local55 = (float) this.anInt723 * local43;
			@Pc(61) float local61 = local24 * (float) this.anInt709;
			@Pc(67) float local67 = (float) this.anInt709 * local31;
			@Pc(74) float local74 = -local24 * (float) this.anInt728;
			@Pc(81) float local81 = -local31 * (float) this.anInt728;
			@Pc(88) float local88 = -local37 * (float) this.anInt729;
			arg0 = arg0 + local61 + local49;
			arg2 = local49 + arg2 + local74;
			@Pc(107) float local107 = (float) this.anInt729 * -local43;
			arg3 = local81 + arg3 + local55;
			arg1 = local67 + arg1 + local55;
			arg4 = local88 + arg4 + local61;
			arg5 = local67 + arg5 + local107;
		}
		local14 = arg2 + arg4 - arg0;
		local18 = arg5 + arg3 - arg1;
		this.aClass24_Sub1_Sub1_2.method2802(true);
		this.aClass45_Sub3_5.method7476();
		this.aClass45_Sub3_5.method7475(this.aClass24_Sub1_Sub1_2);
		this.aClass45_Sub3_5.method7500(1);
		this.aClass45_Sub3_5.method7510(1);
		this.aClass45_Sub3_5.method7475(local7);
		this.aClass45_Sub3_5.method7491(7681, 8448);
		this.aClass45_Sub3_5.method7507(768, 34168, 0);
		this.aClass45_Sub3_5.method7465(1);
		local24 = local7.aFloat25 / (float) local7.anInt991;
		local31 = local7.aFloat26 / (float) local7.anInt990;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass24_Sub1_Sub1_2.aFloat26);
		OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * local24, local7.aFloat26 - (arg1 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * local24, local7.aFloat26 - (arg5 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass24_Sub1_Sub1_2.aFloat25, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + local14), local7.aFloat26 - (local18 - (float) arg8) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass24_Sub1_Sub1_2.aFloat25, this.aClass24_Sub1_Sub1_2.aFloat26);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg2 - (float) arg7), local7.aFloat26 - ((float) -arg8 + arg3) * local31);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass45_Sub3_5.method7507(768, 5890, 0);
		this.aClass45_Sub3_5.method7500(0);
		this.aClass45_Sub3_5.method7475(null);
		this.aClass45_Sub3_5.method7510(0);
	}

	@OriginalMember(owner = "client!be", name = "V", descriptor = "(IIIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass24_Sub1_Sub1_2.method2802(false);
		this.aClass45_Sub3_5.method7476();
		this.aClass45_Sub3_5.method7465(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt723;
		@Pc(42) int local42 = arg0 + this.anInt709;
		if (this.aClass24_Sub1_Sub1_1 == null) {
			this.aClass45_Sub3_5.method7475(this.aClass24_Sub1_Sub1_2);
			this.aClass45_Sub3_5.method7500(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass24_Sub1_Sub1_2.aFloat26);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, local37 + this.aClass24_Sub1_Sub1_2.anInt990);
			OpenGL.glTexCoord2f(this.aClass24_Sub1_Sub1_2.aFloat25, 0.0F);
			OpenGL.glVertex2i(this.aClass24_Sub1_Sub1_2.anInt991 + local42, this.aClass24_Sub1_Sub1_2.anInt990 + local37);
			OpenGL.glTexCoord2f(this.aClass24_Sub1_Sub1_2.aFloat25, this.aClass24_Sub1_Sub1_2.aFloat26);
			OpenGL.glVertex2i(this.aClass24_Sub1_Sub1_2.anInt991 + local42, local37);
			OpenGL.glEnd();
			return;
		}
		this.method623(arg2);
		this.aClass24_Sub1_Sub1_1.method2802(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass24_Sub1_Sub1_2.aFloat26);
		OpenGL.glTexCoord2f(0.0F, this.aClass24_Sub1_Sub1_2.aFloat26);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, this.aClass24_Sub1_Sub1_2.anInt990 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass24_Sub1_Sub1_2.aFloat25, 0.0F);
		OpenGL.glTexCoord2f(this.aClass24_Sub1_Sub1_2.aFloat25, 0.0F);
		OpenGL.glVertex2i(this.aClass24_Sub1_Sub1_2.anInt991 + local42, local37 - -this.aClass24_Sub1_Sub1_2.anInt990);
		OpenGL.glMultiTexCoord2f(33985, this.aClass24_Sub1_Sub1_2.aFloat25, this.aClass24_Sub1_Sub1_2.aFloat26);
		OpenGL.glTexCoord2f(this.aClass24_Sub1_Sub1_2.aFloat25, this.aClass24_Sub1_Sub1_2.aFloat26);
		OpenGL.glVertex2i(this.aClass24_Sub1_Sub1_2.anInt991 + local42, local37);
		OpenGL.glEnd();
		this.method625();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method7683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class81_Sub1 local6 = (Class81_Sub1) arg2;
		@Pc(9) Class24_Sub1_Sub1 local9 = local6.aClass24_Sub1_Sub1_3;
		this.aClass24_Sub1_Sub1_2.method2802(false);
		this.aClass45_Sub3_5.method7476();
		this.aClass45_Sub3_5.method7475(this.aClass24_Sub1_Sub1_2);
		this.aClass45_Sub3_5.method7500(1);
		this.aClass45_Sub3_5.method7510(1);
		this.aClass45_Sub3_5.method7475(local9);
		this.aClass45_Sub3_5.method7491(7681, 8448);
		this.aClass45_Sub3_5.method7507(768, 34168, 0);
		this.aClass45_Sub3_5.method7465(1);
		@Pc(62) int local62 = arg1 + this.anInt723;
		@Pc(67) int local67 = arg0 + this.anInt709;
		@Pc(74) int local74 = local67 + this.aClass24_Sub1_Sub1_2.anInt991;
		@Pc(80) int local80 = this.aClass24_Sub1_Sub1_2.anInt990 + local62;
		@Pc(87) float local87 = local9.aFloat25 / (float) local9.anInt991;
		@Pc(94) float local94 = local9.aFloat26 / (float) local9.anInt990;
		@Pc(102) float local102 = (float) (local67 - arg3) * local87;
		@Pc(110) float local110 = (float) (local74 - arg3) * local87;
		@Pc(120) float local120 = local9.aFloat26 - (float) (local62 - arg4) * local94;
		@Pc(132) float local132 = local9.aFloat26 - local94 * (float) (local80 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass24_Sub1_Sub1_2.aFloat26);
		OpenGL.glMultiTexCoord2f(33985, local102, local120);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local132);
		OpenGL.glVertex2i(local67, this.aClass24_Sub1_Sub1_2.anInt990 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass24_Sub1_Sub1_2.aFloat25, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local132);
		OpenGL.glVertex2i(this.aClass24_Sub1_Sub1_2.anInt991 + local67, local62 - -this.aClass24_Sub1_Sub1_2.anInt990);
		OpenGL.glMultiTexCoord2f(33984, this.aClass24_Sub1_Sub1_2.aFloat25, this.aClass24_Sub1_Sub1_2.aFloat26);
		OpenGL.glMultiTexCoord2f(33985, local110, local120);
		OpenGL.glVertex2i(local67 + this.aClass24_Sub1_Sub1_2.anInt991, local62);
		OpenGL.glEnd();
		this.aClass45_Sub3_5.method7507(768, 5890, 0);
		this.aClass45_Sub3_5.method7500(0);
		this.aClass45_Sub3_5.method7475(null);
		this.aClass45_Sub3_5.method7510(0);
	}

	@OriginalMember(owner = "client!be", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.aClass24_Sub1_Sub1_2.anInt991;
	}

	@OriginalMember(owner = "client!be", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aClass24_Sub1_Sub1_2.anInt990;
	}

	@OriginalMember(owner = "client!be", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt709 = arg0;
		this.anInt723 = arg1;
		this.anInt728 = arg2;
		this.anInt729 = arg3;
		this.aBoolean71 = this.anInt709 != 0 || this.anInt723 != 0 || this.anInt728 != 0 || this.anInt729 != 0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)V")
	private void method623(@OriginalArg(0) int arg0) {
		this.aClass45_Sub3_5.method7510(1);
		this.aClass45_Sub3_5.method7475(this.aClass24_Sub1_Sub1_2);
		this.aClass45_Sub3_5.method7491(this.aClass45_Sub3_5.method7468(arg0), 7681);
		this.aClass45_Sub3_5.method7507(768, 34167, 1);
		this.aClass45_Sub3_5.method7450(0, 34168);
		this.aClass45_Sub3_5.method7510(0);
		this.aClass45_Sub3_5.method7475(this.aClass24_Sub1_Sub1_1);
		this.aClass45_Sub3_5.method7491(34479, 7681);
		this.aClass45_Sub3_5.method7507(768, 34166, 1);
		if (this.anInt710 == 0) {
			this.aClass45_Sub3_5.method7440(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt710 == 1) {
			this.aClass45_Sub3_5.method7440(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt710 == 2) {
			this.aClass45_Sub3_5.method7440(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt710 == 3) {
			this.aClass45_Sub3_5.method7440(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!be", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean71) {
			local6 = this.A();
			local10 = this.ca();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(36) float local36 = (arg5 - arg1) / local10;
			@Pc(42) float local42 = local29 * (float) this.anInt723;
			@Pc(48) float local48 = (float) this.anInt723 * local36;
			@Pc(54) float local54 = (float) this.anInt709 * local17;
			@Pc(60) float local60 = (float) this.anInt709 * local23;
			@Pc(67) float local67 = (float) this.anInt728 * -local17;
			@Pc(74) float local74 = (float) this.anInt728 * -local23;
			@Pc(81) float local81 = (float) this.anInt729 * -local29;
			arg2 = arg2 + local67 + local42;
			arg4 = local54 + arg4 + local81;
			arg3 = local48 + arg3 + local74;
			@Pc(106) float local106 = (float) this.anInt729 * -local36;
			arg0 = local42 + arg0 + local54;
			arg1 = arg1 + local60 + local48;
			arg5 = local106 + arg5 + local60;
		}
		local6 = arg2 + arg4 - arg0;
		this.aClass24_Sub1_Sub1_2.method2802(true);
		local10 = arg3 + arg5 - arg1;
		this.aClass45_Sub3_5.method7476();
		this.aClass45_Sub3_5.method7475(this.aClass24_Sub1_Sub1_2);
		this.aClass45_Sub3_5.method7465(arg8);
		this.aClass45_Sub3_5.method7500(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass24_Sub1_Sub1_2.aFloat26);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass24_Sub1_Sub1_2.aFloat25, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass24_Sub1_Sub1_2.aFloat25, this.aClass24_Sub1_Sub1_2.aFloat26);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!be", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg0 + arg2;
		@Pc(13) int local13 = arg3 + arg1;
		this.aClass24_Sub1_Sub1_2.method2802(false);
		this.aClass45_Sub3_5.method7476();
		this.aClass45_Sub3_5.method7475(this.aClass24_Sub1_Sub1_2);
		this.aClass45_Sub3_5.method7465(arg6);
		this.aClass45_Sub3_5.method7500(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass24_Sub1_Sub1_2.aBoolean81 && !this.aBoolean71) {
			@Pc(72) float local72 = this.aClass24_Sub1_Sub1_2.aFloat26 * (float) arg3 / (float) this.aClass24_Sub1_Sub1_2.anInt990;
			@Pc(84) float local84 = this.aClass24_Sub1_Sub1_2.aFloat25 * (float) arg2 / (float) this.aClass24_Sub1_Sub1_2.anInt991;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local72);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local13);
			OpenGL.glTexCoord2f(local84, 0.0F);
			OpenGL.glVertex2i(local9, local13);
			OpenGL.glTexCoord2f(local84, local72);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt709, (float) this.anInt723, 0.0F);
		@Pc(124) int local124 = this.A();
		@Pc(127) int local127 = this.ca();
		@Pc(133) int local133 = this.aClass24_Sub1_Sub1_2.anInt990 + arg1;
		OpenGL.glBegin(7);
		@Pc(137) int local137 = arg1;
		@Pc(145) int local145;
		while (local133 <= local13) {
			local145 = this.aClass24_Sub1_Sub1_2.anInt991 + arg0;
			@Pc(147) int local147 = arg0;
			while (local145 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass24_Sub1_Sub1_2.aFloat26);
				OpenGL.glVertex2i(local147, local137);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local133);
				OpenGL.glTexCoord2f(this.aClass24_Sub1_Sub1_2.aFloat25, 0.0F);
				OpenGL.glVertex2i(local145, local133);
				OpenGL.glTexCoord2f(this.aClass24_Sub1_Sub1_2.aFloat25, this.aClass24_Sub1_Sub1_2.aFloat26);
				OpenGL.glVertex2i(local145, local137);
				local147 += local124;
				local145 += local124;
			}
			if (local147 < local9) {
				@Pc(210) float local210 = (float) (local9 - local147) * this.aClass24_Sub1_Sub1_2.aFloat25 / (float) this.aClass24_Sub1_Sub1_2.anInt991;
				OpenGL.glTexCoord2f(0.0F, this.aClass24_Sub1_Sub1_2.aFloat26);
				OpenGL.glVertex2i(local147, local137);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local133);
				OpenGL.glTexCoord2f(local210, 0.0F);
				OpenGL.glVertex2i(local9, local133);
				OpenGL.glTexCoord2f(local210, this.aClass24_Sub1_Sub1_2.aFloat26);
				OpenGL.glVertex2i(local9, local137);
			}
			local133 += local127;
			local137 += local127;
		}
		if (local13 > local137) {
			@Pc(271) float local271 = this.aClass24_Sub1_Sub1_2.aFloat26 * (float) (this.aClass24_Sub1_Sub1_2.anInt990 + local137 - local13) / (float) this.aClass24_Sub1_Sub1_2.anInt990;
			@Pc(277) int local277 = this.aClass24_Sub1_Sub1_2.anInt991 + arg0;
			local145 = arg0;
			while (local9 >= local277) {
				OpenGL.glTexCoord2f(0.0F, this.aClass24_Sub1_Sub1_2.aFloat26);
				OpenGL.glVertex2i(local145, local137);
				OpenGL.glTexCoord2f(0.0F, local271);
				OpenGL.glVertex2i(local145, local13);
				OpenGL.glTexCoord2f(this.aClass24_Sub1_Sub1_2.aFloat25, local271);
				OpenGL.glVertex2i(local277, local13);
				OpenGL.glTexCoord2f(this.aClass24_Sub1_Sub1_2.aFloat25, this.aClass24_Sub1_Sub1_2.aFloat26);
				OpenGL.glVertex2i(local277, local137);
				local145 += local124;
				local277 += local124;
			}
			if (local145 < local9) {
				@Pc(342) float local342 = (float) (local9 - local145) * this.aClass24_Sub1_Sub1_2.aFloat25 / (float) this.aClass24_Sub1_Sub1_2.anInt991;
				OpenGL.glTexCoord2f(0.0F, this.aClass24_Sub1_Sub1_2.aFloat26);
				OpenGL.glVertex2i(local145, local137);
				OpenGL.glTexCoord2f(0.0F, local271);
				OpenGL.glVertex2i(local145, local13);
				OpenGL.glTexCoord2f(local342, local271);
				OpenGL.glVertex2i(local9, local13);
				OpenGL.glTexCoord2f(local342, this.aClass24_Sub1_Sub1_2.aFloat26);
				OpenGL.glVertex2i(local9, local137);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	private void method625() {
		this.aClass45_Sub3_5.method7510(1);
		this.aClass45_Sub3_5.method7475(null);
		this.aClass45_Sub3_5.method7491(8448, 8448);
		this.aClass45_Sub3_5.method7507(768, 34168, 1);
		this.aClass45_Sub3_5.method7450(0, 5890);
		this.aClass45_Sub3_5.method7510(0);
		this.aClass45_Sub3_5.method7507(768, 34168, 1);
	}

	@OriginalMember(owner = "client!be", name = "ca", descriptor = "()I")
	@Override
	public int ca() {
		return this.anInt729 + this.aClass24_Sub1_Sub1_2.anInt990 + this.anInt723;
	}

	@OriginalMember(owner = "client!be", name = "YA", descriptor = "(IIIIIIII)V")
	@Override
	protected void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass24_Sub1_Sub1_2.method2802(true);
		this.aClass45_Sub3_5.method7476();
		this.aClass45_Sub3_5.method7465(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean71) {
			@Pc(186) float local186 = (float) arg2 / (float) this.A();
			@Pc(193) float local193 = (float) arg3 / (float) this.ca();
			@Pc(202) float local202 = (float) arg0 + (float) this.anInt709 * local186;
			@Pc(211) float local211 = (float) this.anInt723 * local193 + (float) arg1;
			@Pc(220) float local220 = (float) this.aClass24_Sub1_Sub1_2.anInt991 * local186 + local202;
			@Pc(229) float local229 = local211 + (float) this.aClass24_Sub1_Sub1_2.anInt990 * local193;
			if (this.aClass24_Sub1_Sub1_1 == null) {
				this.aClass45_Sub3_5.method7475(this.aClass24_Sub1_Sub1_2);
				this.aClass45_Sub3_5.method7500(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass24_Sub1_Sub1_2.aFloat26);
				OpenGL.glVertex2f(local202, local211);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local202, local229);
				OpenGL.glTexCoord2f(this.aClass24_Sub1_Sub1_2.aFloat25, 0.0F);
				OpenGL.glVertex2f(local220, local229);
				OpenGL.glTexCoord2f(this.aClass24_Sub1_Sub1_2.aFloat25, this.aClass24_Sub1_Sub1_2.aFloat26);
				OpenGL.glVertex2f(local220, local211);
				OpenGL.glEnd();
			} else {
				this.method623(arg4);
				this.aClass24_Sub1_Sub1_1.method2802(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass24_Sub1_Sub1_2.aFloat26);
				OpenGL.glTexCoord2f(0.0F, this.aClass24_Sub1_Sub1_2.aFloat26);
				OpenGL.glVertex2f(local202, local211);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local202, local229);
				OpenGL.glMultiTexCoord2f(33985, this.aClass24_Sub1_Sub1_2.aFloat25, 0.0F);
				OpenGL.glTexCoord2f(this.aClass24_Sub1_Sub1_2.aFloat25, 0.0F);
				OpenGL.glVertex2f(local220, local229);
				OpenGL.glMultiTexCoord2f(33985, this.aClass24_Sub1_Sub1_2.aFloat25, this.aClass24_Sub1_Sub1_2.aFloat26);
				OpenGL.glTexCoord2f(this.aClass24_Sub1_Sub1_2.aFloat25, this.aClass24_Sub1_Sub1_2.aFloat26);
				OpenGL.glVertex2f(local220, local211);
				OpenGL.glEnd();
				this.method625();
			}
		} else if (this.aClass24_Sub1_Sub1_1 == null) {
			this.aClass45_Sub3_5.method7475(this.aClass24_Sub1_Sub1_2);
			this.aClass45_Sub3_5.method7500(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass24_Sub1_Sub1_2.aFloat26);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass24_Sub1_Sub1_2.aFloat25, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass24_Sub1_Sub1_2.aFloat25, this.aClass24_Sub1_Sub1_2.aFloat26);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method623(arg4);
			this.aClass24_Sub1_Sub1_1.method2802(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass24_Sub1_Sub1_2.aFloat26);
			OpenGL.glTexCoord2f(0.0F, this.aClass24_Sub1_Sub1_2.aFloat26);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass24_Sub1_Sub1_2.aFloat25, 0.0F);
			OpenGL.glTexCoord2f(this.aClass24_Sub1_Sub1_2.aFloat25, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass24_Sub1_Sub1_2.aFloat25, this.aClass24_Sub1_Sub1_2.aFloat26);
			OpenGL.glTexCoord2f(this.aClass24_Sub1_Sub1_2.aFloat25, this.aClass24_Sub1_Sub1_2.aFloat26);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method625();
		}
	}
}
