import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class Class45_Sub3 extends Class45 {

	@OriginalMember(owner = "client!mt", name = "u", descriptor = "Lclient!hr;")
	private Class161_Sub1_Sub1 aClass161_Sub1_Sub1_3;

	@OriginalMember(owner = "client!mt", name = "n", descriptor = "I")
	private int anInt6833 = 0;

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "Z")
	private boolean aBoolean487 = false;

	@OriginalMember(owner = "client!mt", name = "x", descriptor = "I")
	private int anInt6835 = 0;

	@OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
	private int anInt6830 = 0;

	@OriginalMember(owner = "client!mt", name = "C", descriptor = "I")
	private int anInt6846 = 0;

	@OriginalMember(owner = "client!mt", name = "t", descriptor = "I")
	private int anInt6844 = 0;

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "Lclient!pi;")
	private final Class144_Sub3 aClass144_Sub3_27;

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "Lclient!hr;")
	private final Class161_Sub1_Sub1 aClass161_Sub1_Sub1_2;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!pi;IIZ)V")
	public Class45_Sub3(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass144_Sub3_27 = arg0;
		this.aClass161_Sub1_Sub1_2 = Static132.method2014(arg2, arg0, arg3 ? 6408 : 6407, arg1);
	}

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!pi;IIII)V")
	public Class45_Sub3(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass144_Sub3_27 = arg0;
		this.aClass161_Sub1_Sub1_2 = Static660.method5891(arg4, arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!pi;II[III)V")
	public Class45_Sub3(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass144_Sub3_27 = arg0;
		this.aClass161_Sub1_Sub1_2 = Static158.method2256(arg1, arg2, arg0, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass144_Sub3_27.aBoolean570) {
			this.aClass161_Sub1_Sub1_2.method3969(arg1, arg3, arg5, arg4, arg2, arg0);
			return;
		}
		@Pc(13) int[] local13 = this.aClass144_Sub3_27.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method5970(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(III)V")
	@Override
	public void method7505() {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass161_Sub1_Sub1_3 = Static660.method5891(this.aClass161_Sub1_Sub1_2.anInt4558, 0, this.aClass161_Sub1_Sub1_2.anInt4556, this.aClass144_Sub3_27, 0);
		this.anInt6844 = 3;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(IIII)V")
	@Override
	public void method7499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6835 = arg2;
		this.anInt6830 = arg0;
		this.anInt6846 = arg3;
		this.anInt6833 = arg1;
		this.aBoolean487 = this.anInt6830 != 0 || this.anInt6833 != 0 || this.anInt6835 != 0 || this.anInt6846 != 0;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method7486(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean487) {
			local6 = (float) this.method7508();
			local10 = (float) this.method7504();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(35) float local35 = (arg5 - arg1) / local10;
			@Pc(41) float local41 = local29 * (float) this.anInt6833;
			@Pc(47) float local47 = local35 * (float) this.anInt6833;
			@Pc(53) float local53 = local16 * (float) this.anInt6830;
			@Pc(59) float local59 = local23 * (float) this.anInt6830;
			@Pc(66) float local66 = -local16 * (float) this.anInt6835;
			@Pc(73) float local73 = -local23 * (float) this.anInt6835;
			@Pc(80) float local80 = -local29 * (float) this.anInt6846;
			@Pc(87) float local87 = -local35 * (float) this.anInt6846;
			arg1 = arg1 + local59 + local47;
			arg4 = local53 + arg4 + local80;
			arg2 = local41 + local66 + arg2;
			arg0 = arg0 + local53 + local41;
			arg3 = local47 + local73 + arg3;
			arg5 = local59 + arg5 + local87;
		}
		local6 = arg4 + arg2 - arg0;
		local10 = arg3 + arg5 - arg1;
		this.aClass161_Sub1_Sub1_2.method9173(true);
		this.aClass144_Sub3_27.method7033();
		this.aClass144_Sub3_27.method6982(this.aClass161_Sub1_Sub1_2);
		this.aClass144_Sub3_27.method7054(1);
		this.aClass144_Sub3_27.method6988(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass161_Sub1_Sub1_2.aFloat72);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass161_Sub1_Sub1_2.aFloat71, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass161_Sub1_Sub1_2.aFloat71, this.aClass161_Sub1_Sub1_2.aFloat72);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method7489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass161_Sub1_Sub1_2.method9173(true);
		this.aClass144_Sub3_27.method7033();
		this.aClass144_Sub3_27.method7054(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean487) {
			@Pc(49) float local49 = (float) arg2 / (float) this.method7508();
			@Pc(56) float local56 = (float) arg3 / (float) this.method7504();
			@Pc(65) float local65 = (float) this.anInt6830 * local49 + (float) arg0;
			@Pc(74) float local74 = (float) arg1 + (float) this.anInt6833 * local56;
			@Pc(83) float local83 = local65 + (float) this.aClass161_Sub1_Sub1_2.anInt4556 * local49;
			@Pc(92) float local92 = local56 * (float) this.aClass161_Sub1_Sub1_2.anInt4558 + local74;
			if (this.aClass161_Sub1_Sub1_3 == null) {
				this.aClass144_Sub3_27.method6982(this.aClass161_Sub1_Sub1_2);
				this.aClass144_Sub3_27.method6988(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass161_Sub1_Sub1_2.aFloat72);
				OpenGL.glVertex2f(local65, local74);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local65, local92);
				OpenGL.glTexCoord2f(this.aClass161_Sub1_Sub1_2.aFloat71, 0.0F);
				OpenGL.glVertex2f(local83, local92);
				OpenGL.glTexCoord2f(this.aClass161_Sub1_Sub1_2.aFloat71, this.aClass161_Sub1_Sub1_2.aFloat72);
				OpenGL.glVertex2f(local83, local74);
				OpenGL.glEnd();
			} else {
				this.method5969(arg4);
				this.aClass161_Sub1_Sub1_3.method9173(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass161_Sub1_Sub1_2.aFloat72);
				OpenGL.glTexCoord2f(0.0F, this.aClass161_Sub1_Sub1_2.aFloat72);
				OpenGL.glVertex2f(local65, local74);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local65, local92);
				OpenGL.glMultiTexCoord2f(33985, this.aClass161_Sub1_Sub1_2.aFloat71, 0.0F);
				OpenGL.glTexCoord2f(this.aClass161_Sub1_Sub1_2.aFloat71, 0.0F);
				OpenGL.glVertex2f(local83, local92);
				OpenGL.glMultiTexCoord2f(33985, this.aClass161_Sub1_Sub1_2.aFloat71, this.aClass161_Sub1_Sub1_2.aFloat72);
				OpenGL.glTexCoord2f(this.aClass161_Sub1_Sub1_2.aFloat71, this.aClass161_Sub1_Sub1_2.aFloat72);
				OpenGL.glVertex2f(local83, local74);
				OpenGL.glEnd();
				this.method5973();
			}
		} else if (this.aClass161_Sub1_Sub1_3 == null) {
			this.aClass144_Sub3_27.method6982(this.aClass161_Sub1_Sub1_2);
			this.aClass144_Sub3_27.method6988(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass161_Sub1_Sub1_2.aFloat72);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass161_Sub1_Sub1_2.aFloat71, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass161_Sub1_Sub1_2.aFloat71, this.aClass161_Sub1_Sub1_2.aFloat72);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method5969(arg4);
			this.aClass161_Sub1_Sub1_3.method9173(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass161_Sub1_Sub1_2.aFloat72);
			OpenGL.glTexCoord2f(0.0F, this.aClass161_Sub1_Sub1_2.aFloat72);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass161_Sub1_Sub1_2.aFloat71, 0.0F);
			OpenGL.glTexCoord2f(this.aClass161_Sub1_Sub1_2.aFloat71, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg1 - -arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass161_Sub1_Sub1_2.aFloat71, this.aClass161_Sub1_Sub1_2.aFloat72);
			OpenGL.glTexCoord2f(this.aClass161_Sub1_Sub1_2.aFloat71, this.aClass161_Sub1_Sub1_2.aFloat72);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method5973();
		}
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "()I")
	@Override
	public int method7510() {
		return this.aClass161_Sub1_Sub1_2.anInt4556;
	}

	@OriginalMember(owner = "client!mt", name = "b", descriptor = "(II)V")
	private void method5969(@OriginalArg(1) int arg0) {
		this.aClass144_Sub3_27.method7028(1);
		this.aClass144_Sub3_27.method6982(this.aClass161_Sub1_Sub1_2);
		this.aClass144_Sub3_27.method7025(this.aClass144_Sub3_27.method7051(arg0), 7681);
		this.aClass144_Sub3_27.method6979(1, 768, 34167);
		this.aClass144_Sub3_27.method7021(34168, 0);
		this.aClass144_Sub3_27.method7028(0);
		this.aClass144_Sub3_27.method6982(this.aClass161_Sub1_Sub1_3);
		this.aClass144_Sub3_27.method7025(34479, 7681);
		this.aClass144_Sub3_27.method6979(1, 768, 34166);
		if (this.anInt6844 == 0) {
			this.aClass144_Sub3_27.method7039(0.0F, 1.0F, 0.5F, 0.5F);
		} else if (this.anInt6844 == 1) {
			this.aClass144_Sub3_27.method7039(0.0F, 0.5F, 1.0F, 0.5F);
		} else if (this.anInt6844 == 2) {
			this.aClass144_Sub3_27.method7039(0.0F, 0.5F, 0.5F, 1.0F);
			return;
		} else if (this.anInt6844 == 3) {
			this.aClass144_Sub3_27.method7039(0.0F, 128.5F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!mt", name = "d", descriptor = "()I")
	@Override
	public int method7501() {
		return this.aClass161_Sub1_Sub1_2.anInt4558;
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "()I")
	@Override
	public int method7504() {
		return this.anInt6833 + this.aClass161_Sub1_Sub1_2.anInt4558 + this.anInt6846;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method7503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg2;
		@Pc(9) Class161_Sub1_Sub1 local9 = local6.aClass161_Sub1_Sub1_1;
		this.aClass161_Sub1_Sub1_2.method9173(false);
		this.aClass144_Sub3_27.method7033();
		this.aClass144_Sub3_27.method6982(this.aClass161_Sub1_Sub1_2);
		this.aClass144_Sub3_27.method6988(1);
		this.aClass144_Sub3_27.method7028(1);
		this.aClass144_Sub3_27.method6982(local9);
		this.aClass144_Sub3_27.method7025(7681, 8448);
		this.aClass144_Sub3_27.method6979(0, 768, 34168);
		this.aClass144_Sub3_27.method7054(1);
		@Pc(62) int local62 = arg0 + this.anInt6830;
		@Pc(67) int local67 = arg1 + this.anInt6833;
		@Pc(74) int local74 = local62 + this.aClass161_Sub1_Sub1_2.anInt4556;
		@Pc(80) int local80 = this.aClass161_Sub1_Sub1_2.anInt4558 + local67;
		@Pc(87) float local87 = local9.aFloat71 / (float) local9.anInt4556;
		@Pc(94) float local94 = local9.aFloat72 / (float) local9.anInt4558;
		@Pc(101) float local101 = local87 * (float) (local62 - arg3);
		@Pc(109) float local109 = local87 * (float) (local74 - arg3);
		@Pc(120) float local120 = local9.aFloat72 - (float) (local67 - arg4) * local94;
		@Pc(132) float local132 = local9.aFloat72 - (float) (local80 - arg4) * local94;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass161_Sub1_Sub1_2.aFloat72);
		OpenGL.glMultiTexCoord2f(33985, local101, local120);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local132);
		OpenGL.glVertex2i(local62, local67 + this.aClass161_Sub1_Sub1_2.anInt4558);
		OpenGL.glMultiTexCoord2f(33984, this.aClass161_Sub1_Sub1_2.aFloat71, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local132);
		OpenGL.glVertex2i(local62 + this.aClass161_Sub1_Sub1_2.anInt4556, this.aClass161_Sub1_Sub1_2.anInt4558 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass161_Sub1_Sub1_2.aFloat71, this.aClass161_Sub1_Sub1_2.aFloat72);
		OpenGL.glMultiTexCoord2f(33985, local109, local120);
		OpenGL.glVertex2i(local62 + this.aClass161_Sub1_Sub1_2.anInt4556, local67);
		OpenGL.glEnd();
		this.aClass144_Sub3_27.method6979(0, 768, 5890);
		this.aClass144_Sub3_27.method6988(0);
		this.aClass144_Sub3_27.method6982((Class161) null);
		this.aClass144_Sub3_27.method7028(0);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "([I)V")
	@Override
	public void method7509(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt6833;
		arg0[2] = this.anInt6835;
		arg0[3] = this.anInt6846;
		arg0[0] = this.anInt6830;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIII[III)V")
	private void method5970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass161_Sub1_Sub1_2.method3968(arg2, arg1, arg4, arg5, arg0, arg3);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg0 + arg2;
		@Pc(14) int local14 = arg3 + arg1;
		this.aClass161_Sub1_Sub1_2.method9173(false);
		this.aClass144_Sub3_27.method7033();
		this.aClass144_Sub3_27.method6982(this.aClass161_Sub1_Sub1_2);
		this.aClass144_Sub3_27.method7054(arg6);
		this.aClass144_Sub3_27.method6988(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass161_Sub1_Sub1_2.aBoolean348 && !this.aBoolean487) {
			@Pc(363) float local363 = this.aClass161_Sub1_Sub1_2.aFloat72 * (float) arg3 / (float) this.aClass161_Sub1_Sub1_2.anInt4558;
			@Pc(375) float local375 = this.aClass161_Sub1_Sub1_2.aFloat71 * (float) arg2 / (float) this.aClass161_Sub1_Sub1_2.anInt4556;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local363);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local14);
			OpenGL.glTexCoord2f(local375, 0.0F);
			OpenGL.glVertex2i(local10, local14);
			OpenGL.glTexCoord2f(local375, local363);
			OpenGL.glVertex2i(local10, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt6830, (float) this.anInt6833, 0.0F);
		@Pc(75) int local75 = this.method7508();
		@Pc(78) int local78 = this.method7504();
		@Pc(84) int local84 = arg1 + this.aClass161_Sub1_Sub1_2.anInt4558;
		OpenGL.glBegin(7);
		@Pc(88) int local88 = arg1;
		@Pc(98) int local98;
		while (local84 <= local14) {
			local98 = this.aClass161_Sub1_Sub1_2.anInt4556 + arg0;
			@Pc(100) int local100 = arg0;
			while (local98 <= local10) {
				OpenGL.glTexCoord2f(0.0F, this.aClass161_Sub1_Sub1_2.aFloat72);
				OpenGL.glVertex2i(local100, local88);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local100, local84);
				OpenGL.glTexCoord2f(this.aClass161_Sub1_Sub1_2.aFloat71, 0.0F);
				OpenGL.glVertex2i(local98, local84);
				OpenGL.glTexCoord2f(this.aClass161_Sub1_Sub1_2.aFloat71, this.aClass161_Sub1_Sub1_2.aFloat72);
				OpenGL.glVertex2i(local98, local88);
				local100 += local75;
				local98 += local75;
			}
			if (local100 < local10) {
				@Pc(167) float local167 = (float) (local10 - local100) * this.aClass161_Sub1_Sub1_2.aFloat71 / (float) this.aClass161_Sub1_Sub1_2.anInt4556;
				OpenGL.glTexCoord2f(0.0F, this.aClass161_Sub1_Sub1_2.aFloat72);
				OpenGL.glVertex2i(local100, local88);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local100, local84);
				OpenGL.glTexCoord2f(local167, 0.0F);
				OpenGL.glVertex2i(local10, local84);
				OpenGL.glTexCoord2f(local167, this.aClass161_Sub1_Sub1_2.aFloat72);
				OpenGL.glVertex2i(local10, local88);
			}
			local88 += local78;
			local84 += local78;
		}
		if (local88 < local14) {
			@Pc(237) float local237 = this.aClass161_Sub1_Sub1_2.aFloat72 * (float) (local88 + this.aClass161_Sub1_Sub1_2.anInt4558 - local14) / (float) this.aClass161_Sub1_Sub1_2.anInt4558;
			@Pc(243) int local243 = arg0 + this.aClass161_Sub1_Sub1_2.anInt4556;
			local98 = arg0;
			while (local243 <= local10) {
				OpenGL.glTexCoord2f(0.0F, this.aClass161_Sub1_Sub1_2.aFloat72);
				OpenGL.glVertex2i(local98, local88);
				OpenGL.glTexCoord2f(0.0F, local237);
				OpenGL.glVertex2i(local98, local14);
				OpenGL.glTexCoord2f(this.aClass161_Sub1_Sub1_2.aFloat71, local237);
				OpenGL.glVertex2i(local243, local14);
				OpenGL.glTexCoord2f(this.aClass161_Sub1_Sub1_2.aFloat71, this.aClass161_Sub1_Sub1_2.aFloat72);
				OpenGL.glVertex2i(local243, local88);
				local98 += local75;
				local243 += local75;
			}
			if (local98 < local10) {
				@Pc(320) float local320 = (float) (local10 - local98) * this.aClass161_Sub1_Sub1_2.aFloat71 / (float) this.aClass161_Sub1_Sub1_2.anInt4556;
				OpenGL.glTexCoord2f(0.0F, this.aClass161_Sub1_Sub1_2.aFloat72);
				OpenGL.glVertex2i(local98, local88);
				OpenGL.glTexCoord2f(0.0F, local237);
				OpenGL.glVertex2i(local98, local14);
				OpenGL.glTexCoord2f(local320, local237);
				OpenGL.glVertex2i(local10, local14);
				OpenGL.glTexCoord2f(local320, this.aClass161_Sub1_Sub1_2.aFloat72);
				OpenGL.glVertex2i(local10, local88);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method7507(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class161_Sub1_Sub1 local7 = ((Class1_Sub3) arg6).aClass161_Sub1_Sub1_1;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(31) float local31;
		if (this.aBoolean487) {
			local14 = (float) this.method7508();
			local18 = (float) this.method7504();
			local25 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = local37 * (float) this.anInt6833;
			@Pc(56) float local56 = (float) this.anInt6833 * local44;
			@Pc(62) float local62 = (float) this.anInt6830 * local25;
			@Pc(68) float local68 = local31 * (float) this.anInt6830;
			@Pc(75) float local75 = (float) this.anInt6835 * -local25;
			@Pc(82) float local82 = -local31 * (float) this.anInt6835;
			@Pc(89) float local89 = (float) this.anInt6846 * -local37;
			arg3 = local56 + arg3 + local82;
			@Pc(102) float local102 = (float) this.anInt6846 * -local44;
			arg2 = arg2 + local75 + local50;
			arg1 = local68 + arg1 + local56;
			arg4 = arg4 + local62 + local89;
			arg0 = arg0 + local62 + local50;
			arg5 = local102 + local68 + arg5;
		}
		local14 = arg2 + arg4 - arg0;
		this.aClass161_Sub1_Sub1_2.method9173(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass144_Sub3_27.method7033();
		this.aClass144_Sub3_27.method6982(this.aClass161_Sub1_Sub1_2);
		this.aClass144_Sub3_27.method6988(1);
		this.aClass144_Sub3_27.method7028(1);
		this.aClass144_Sub3_27.method6982(local7);
		this.aClass144_Sub3_27.method7025(7681, 8448);
		this.aClass144_Sub3_27.method6979(0, 768, 34168);
		this.aClass144_Sub3_27.method7054(1);
		local25 = local7.aFloat71 / (float) local7.anInt4556;
		local31 = local7.aFloat72 / (float) local7.anInt4558;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass161_Sub1_Sub1_2.aFloat72);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg0), local7.aFloat72 - ((float) -arg8 + arg1) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg4), local7.aFloat72 - local31 * (arg5 - (float) arg8));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass161_Sub1_Sub1_2.aFloat71, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * (local14 - (float) arg7), local7.aFloat72 - ((float) -arg8 + local18) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass161_Sub1_Sub1_2.aFloat71, this.aClass161_Sub1_Sub1_2.aFloat72);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg2 - (float) arg7), local7.aFloat72 - local31 * (arg3 - (float) arg8));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass144_Sub3_27.method6979(0, 768, 5890);
		this.aClass144_Sub3_27.method6988(0);
		this.aClass144_Sub3_27.method6982((Class161) null);
		this.aClass144_Sub3_27.method7028(0);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
	private void method5973() {
		this.aClass144_Sub3_27.method7028(1);
		this.aClass144_Sub3_27.method6982((Class161) null);
		this.aClass144_Sub3_27.method7025(8448, 8448);
		this.aClass144_Sub3_27.method6979(1, 768, 34168);
		this.aClass144_Sub3_27.method7021(5890, 0);
		this.aClass144_Sub3_27.method7028(0);
		this.aClass144_Sub3_27.method6979(1, 768, 34168);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "()I")
	@Override
	public int method7508() {
		return this.aClass161_Sub1_Sub1_2.anInt4556 + this.anInt6830 + this.anInt6835;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method7491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass161_Sub1_Sub1_2.method9173(false);
		this.aClass144_Sub3_27.method7033();
		this.aClass144_Sub3_27.method7054(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt6830;
		@Pc(42) int local42 = arg1 + this.anInt6833;
		if (this.aClass161_Sub1_Sub1_3 == null) {
			this.aClass144_Sub3_27.method6982(this.aClass161_Sub1_Sub1_2);
			this.aClass144_Sub3_27.method6988(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass161_Sub1_Sub1_2.aFloat72);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass161_Sub1_Sub1_2.anInt4558 + local42);
			OpenGL.glTexCoord2f(this.aClass161_Sub1_Sub1_2.aFloat71, 0.0F);
			OpenGL.glVertex2i(this.aClass161_Sub1_Sub1_2.anInt4556 + local37, local42 - -this.aClass161_Sub1_Sub1_2.anInt4558);
			OpenGL.glTexCoord2f(this.aClass161_Sub1_Sub1_2.aFloat71, this.aClass161_Sub1_Sub1_2.aFloat72);
			OpenGL.glVertex2i(local37 + this.aClass161_Sub1_Sub1_2.anInt4556, local42);
			OpenGL.glEnd();
			return;
		}
		this.method5969(arg2);
		this.aClass161_Sub1_Sub1_3.method9173(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass161_Sub1_Sub1_2.aFloat72);
		OpenGL.glTexCoord2f(0.0F, this.aClass161_Sub1_Sub1_2.aFloat72);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, this.aClass161_Sub1_Sub1_2.anInt4558 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass161_Sub1_Sub1_2.aFloat71, 0.0F);
		OpenGL.glTexCoord2f(this.aClass161_Sub1_Sub1_2.aFloat71, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass161_Sub1_Sub1_2.anInt4556, this.aClass161_Sub1_Sub1_2.anInt4558 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass161_Sub1_Sub1_2.aFloat71, this.aClass161_Sub1_Sub1_2.aFloat72);
		OpenGL.glTexCoord2f(this.aClass161_Sub1_Sub1_2.aFloat71, this.aClass161_Sub1_Sub1_2.aFloat72);
		OpenGL.glVertex2i(local37 + this.aClass161_Sub1_Sub1_2.anInt4556, local42);
		OpenGL.glEnd();
		this.method5973();
	}
}
