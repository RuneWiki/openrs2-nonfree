import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!se", name = "p", descriptor = "Lclient!to;")
	private Class245_Sub2_Sub1 aClass245_Sub2_Sub1_5;

	@OriginalMember(owner = "client!se", name = "g", descriptor = "I")
	private int anInt9452 = 0;

	@OriginalMember(owner = "client!se", name = "A", descriptor = "Z")
	private boolean aBoolean687 = false;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "I")
	private int anInt9461 = 0;

	@OriginalMember(owner = "client!se", name = "w", descriptor = "I")
	private int anInt9456 = 0;

	@OriginalMember(owner = "client!se", name = "s", descriptor = "I")
	private int anInt9463 = 0;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "I")
	private int anInt9467 = 0;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "Lclient!gia;")
	private final Class67_Sub2 aClass67_Sub2_35;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "Lclient!to;")
	private final Class245_Sub2_Sub1 aClass245_Sub2_Sub1_4;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!gia;IIZ)V")
	public Class9_Sub2(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass67_Sub2_35 = arg0;
		this.aClass245_Sub2_Sub1_4 = Static324.method4817(arg3 ? 6408 : 6407, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!gia;IIII)V")
	public Class9_Sub2(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass67_Sub2_35 = arg0;
		this.aClass245_Sub2_Sub1_4 = Static626.method8476(arg2, arg4, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!gia;II[III)V")
	public Class9_Sub2(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass67_Sub2_35 = arg0;
		this.aClass245_Sub2_Sub1_4 = Static261.method4069(arg5, arg3, arg2, arg1, arg0, arg4);
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "()I")
	@Override
	public int method8619() {
		return this.anInt9461 + this.aClass245_Sub2_Sub1_4.anInt10095 + this.anInt9463;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method8615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg2;
		@Pc(9) Class245_Sub2_Sub1 local9 = local6.aClass245_Sub2_Sub1_3;
		this.aClass245_Sub2_Sub1_4.method8672(false);
		this.aClass67_Sub2_35.method3295();
		this.aClass67_Sub2_35.method3234(this.aClass245_Sub2_Sub1_4);
		this.aClass67_Sub2_35.method3255(1);
		this.aClass67_Sub2_35.method3268(1);
		this.aClass67_Sub2_35.method3234(local9);
		this.aClass67_Sub2_35.method3271(8448, 7681);
		this.aClass67_Sub2_35.method3279(34168, 768, 0);
		this.aClass67_Sub2_35.method3257(1);
		@Pc(62) int local62 = arg0 + this.anInt9461;
		@Pc(67) int local67 = arg1 + this.anInt9456;
		@Pc(73) int local73 = this.aClass245_Sub2_Sub1_4.anInt10095 + local62;
		@Pc(79) int local79 = this.aClass245_Sub2_Sub1_4.anInt10098 + local67;
		@Pc(86) float local86 = local9.aFloat189 / (float) local9.anInt10095;
		@Pc(93) float local93 = local9.aFloat190 / (float) local9.anInt10098;
		@Pc(101) float local101 = (float) (local62 - arg3) * local86;
		@Pc(109) float local109 = local86 * (float) (local73 - arg3);
		@Pc(120) float local120 = local9.aFloat190 - local93 * (float) (local67 - arg4);
		@Pc(131) float local131 = local9.aFloat190 - local93 * (float) (local79 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass245_Sub2_Sub1_4.aFloat190);
		OpenGL.glMultiTexCoord2f(33985, local101, local120);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local131);
		OpenGL.glVertex2i(local62, local67 + this.aClass245_Sub2_Sub1_4.anInt10098);
		OpenGL.glMultiTexCoord2f(33984, this.aClass245_Sub2_Sub1_4.aFloat189, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local131);
		OpenGL.glVertex2i(local62 + this.aClass245_Sub2_Sub1_4.anInt10095, this.aClass245_Sub2_Sub1_4.anInt10098 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass245_Sub2_Sub1_4.aFloat189, this.aClass245_Sub2_Sub1_4.aFloat190);
		OpenGL.glMultiTexCoord2f(33985, local109, local120);
		OpenGL.glVertex2i(this.aClass245_Sub2_Sub1_4.anInt10095 + local62, local67);
		OpenGL.glEnd();
		this.aClass67_Sub2_35.method3279(5890, 768, 0);
		this.aClass67_Sub2_35.method3255(0);
		this.aClass67_Sub2_35.method3234((Class245) null);
		this.aClass67_Sub2_35.method3268(0);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
	@Override
	public void method8605() {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass245_Sub2_Sub1_5 = Static626.method8476(0, this.aClass245_Sub2_Sub1_4.anInt10098, this.aClass245_Sub2_Sub1_4.anInt10095, this.aClass67_Sub2_35, 0);
		this.anInt9467 = 3;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([I)V")
	@Override
	public void method8616(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt9461;
		arg0[1] = this.anInt9456;
		arg0[2] = this.anInt9463;
		arg0[3] = this.anInt9452;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "()I")
	@Override
	public int method8611() {
		return this.aClass245_Sub2_Sub1_4.anInt10098;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9452 = arg3;
		this.anInt9461 = arg0;
		this.anInt9456 = arg1;
		this.anInt9463 = arg2;
		this.aBoolean687 = this.anInt9461 != 0 || this.anInt9456 != 0 || this.anInt9463 != 0 || this.anInt9452 != 0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)V")
	private void method7990(@OriginalArg(0) int arg0) {
		this.aClass67_Sub2_35.method3268(1);
		this.aClass67_Sub2_35.method3234(this.aClass245_Sub2_Sub1_4);
		this.aClass67_Sub2_35.method3271(7681, this.aClass67_Sub2_35.method3219(arg0));
		this.aClass67_Sub2_35.method3279(34167, 768, 1);
		this.aClass67_Sub2_35.method3269(34168, 0);
		this.aClass67_Sub2_35.method3268(0);
		this.aClass67_Sub2_35.method3234(this.aClass245_Sub2_Sub1_5);
		this.aClass67_Sub2_35.method3271(7681, 34479);
		this.aClass67_Sub2_35.method3279(34166, 768, 1);
		if (this.anInt9467 == 0) {
			this.aClass67_Sub2_35.method3233(1.0F, 0.0F, 0.5F, 0.5F);
		} else if (this.anInt9467 == 1) {
			this.aClass67_Sub2_35.method3233(0.5F, 0.0F, 1.0F, 0.5F);
		} else if (this.anInt9467 == 2) {
			this.aClass67_Sub2_35.method3233(0.5F, 0.0F, 0.5F, 1.0F);
			return;
		} else if (this.anInt9467 == 3) {
			this.aClass67_Sub2_35.method3233(128.5F, 0.0F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method8623(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean687) {
			local6 = (float) this.method8619();
			local10 = (float) this.method8613();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(24) float local24 = (arg3 - arg1) / local6;
			@Pc(30) float local30 = (arg4 - arg0) / local10;
			@Pc(37) float local37 = (arg5 - arg1) / local10;
			@Pc(43) float local43 = local30 * (float) this.anInt9456;
			@Pc(49) float local49 = (float) this.anInt9456 * local37;
			@Pc(55) float local55 = (float) this.anInt9461 * local17;
			@Pc(61) float local61 = (float) this.anInt9461 * local24;
			@Pc(68) float local68 = (float) this.anInt9463 * -local17;
			@Pc(75) float local75 = (float) this.anInt9463 * -local24;
			@Pc(82) float local82 = -local30 * (float) this.anInt9452;
			arg0 = local43 + arg0 + local55;
			@Pc(95) float local95 = -local37 * (float) this.anInt9452;
			arg3 = local75 + arg3 + local49;
			arg2 = local43 + local68 + arg2;
			arg4 = arg4 + local55 + local82;
			arg1 = local61 + arg1 + local49;
			arg5 = arg5 + local61 + local95;
		}
		local6 = arg4 + arg2 - arg0;
		this.aClass245_Sub2_Sub1_4.method8672(true);
		local10 = arg5 + arg3 - arg1;
		this.aClass67_Sub2_35.method3295();
		this.aClass67_Sub2_35.method3234(this.aClass245_Sub2_Sub1_4);
		this.aClass67_Sub2_35.method3257(1);
		this.aClass67_Sub2_35.method3255(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass245_Sub2_Sub1_4.aFloat190);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass245_Sub2_Sub1_4.aFloat189, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass245_Sub2_Sub1_4.aFloat189, this.aClass245_Sub2_Sub1_4.aFloat190);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII[III)V")
	private void method7991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass245_Sub2_Sub1_4.method8469(arg1, arg0, arg4, arg5, arg3, arg2);
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "()I")
	@Override
	public int method8602() {
		return this.aClass245_Sub2_Sub1_4.anInt10095;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "()I")
	@Override
	public int method8613() {
		return this.aClass245_Sub2_Sub1_4.anInt10098 + this.anInt9456 + this.anInt9452;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method8618(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class245_Sub2_Sub1 local7 = ((Class1_Sub3) arg6).aClass245_Sub2_Sub1_3;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(31) float local31;
		if (this.aBoolean687) {
			local14 = (float) this.method8619();
			local18 = (float) this.method8613();
			local24 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(43) float local43 = (arg5 - arg1) / local18;
			@Pc(49) float local49 = (float) this.anInt9456 * local37;
			@Pc(55) float local55 = (float) this.anInt9456 * local43;
			@Pc(61) float local61 = (float) this.anInt9461 * local24;
			@Pc(67) float local67 = (float) this.anInt9461 * local31;
			@Pc(74) float local74 = -local24 * (float) this.anInt9463;
			@Pc(81) float local81 = -local31 * (float) this.anInt9463;
			@Pc(88) float local88 = -local37 * (float) this.anInt9452;
			@Pc(95) float local95 = -local43 * (float) this.anInt9452;
			arg1 = local55 + arg1 + local67;
			arg3 = local81 + arg3 + local55;
			arg2 = local49 + local74 + arg2;
			arg0 = local49 + arg0 + local61;
			arg4 = local88 + arg4 + local61;
			arg5 = arg5 + local67 + local95;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass245_Sub2_Sub1_4.method8672(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass67_Sub2_35.method3295();
		this.aClass67_Sub2_35.method3234(this.aClass245_Sub2_Sub1_4);
		this.aClass67_Sub2_35.method3255(1);
		this.aClass67_Sub2_35.method3268(1);
		this.aClass67_Sub2_35.method3234(local7);
		this.aClass67_Sub2_35.method3271(8448, 7681);
		this.aClass67_Sub2_35.method3279(34168, 768, 0);
		this.aClass67_Sub2_35.method3257(1);
		local24 = local7.aFloat189 / (float) local7.anInt10095;
		local31 = local7.aFloat190 / (float) local7.anInt10098;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass245_Sub2_Sub1_4.aFloat190);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg0), local7.aFloat190 - ((float) -arg8 + arg1) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg4) * local24, local7.aFloat190 - ((float) -arg8 + arg5) * local31);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass245_Sub2_Sub1_4.aFloat189, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * (local14 - (float) arg7), local7.aFloat190 - ((float) -arg8 + local18) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass245_Sub2_Sub1_4.aFloat189, this.aClass245_Sub2_Sub1_4.aFloat190);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg2) * local24, local7.aFloat190 - (arg3 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass67_Sub2_35.method3279(5890, 768, 0);
		this.aClass67_Sub2_35.method3255(0);
		this.aClass67_Sub2_35.method3234((Class245) null);
		this.aClass67_Sub2_35.method3268(0);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method8621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass245_Sub2_Sub1_4.method8672(false);
		this.aClass67_Sub2_35.method3295();
		this.aClass67_Sub2_35.method3257(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt9461;
		@Pc(42) int local42 = arg1 + this.anInt9456;
		if (this.aClass245_Sub2_Sub1_5 == null) {
			this.aClass67_Sub2_35.method3234(this.aClass245_Sub2_Sub1_4);
			this.aClass67_Sub2_35.method3255(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass245_Sub2_Sub1_4.aFloat190);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, local42 + this.aClass245_Sub2_Sub1_4.anInt10098);
			OpenGL.glTexCoord2f(this.aClass245_Sub2_Sub1_4.aFloat189, 0.0F);
			OpenGL.glVertex2i(this.aClass245_Sub2_Sub1_4.anInt10095 + local37, local42 + this.aClass245_Sub2_Sub1_4.anInt10098);
			OpenGL.glTexCoord2f(this.aClass245_Sub2_Sub1_4.aFloat189, this.aClass245_Sub2_Sub1_4.aFloat190);
			OpenGL.glVertex2i(this.aClass245_Sub2_Sub1_4.anInt10095 + local37, local42);
			OpenGL.glEnd();
			return;
		}
		this.method7990(arg2);
		this.aClass245_Sub2_Sub1_5.method8672(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass245_Sub2_Sub1_4.aFloat190);
		OpenGL.glTexCoord2f(0.0F, this.aClass245_Sub2_Sub1_4.aFloat190);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, local42 + this.aClass245_Sub2_Sub1_4.anInt10098);
		OpenGL.glMultiTexCoord2f(33985, this.aClass245_Sub2_Sub1_4.aFloat189, 0.0F);
		OpenGL.glTexCoord2f(this.aClass245_Sub2_Sub1_4.aFloat189, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass245_Sub2_Sub1_4.anInt10095, this.aClass245_Sub2_Sub1_4.anInt10098 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass245_Sub2_Sub1_4.aFloat189, this.aClass245_Sub2_Sub1_4.aFloat190);
		OpenGL.glTexCoord2f(this.aClass245_Sub2_Sub1_4.aFloat189, this.aClass245_Sub2_Sub1_4.aFloat190);
		OpenGL.glVertex2i(this.aClass245_Sub2_Sub1_4.anInt10095 + local37, local42);
		OpenGL.glEnd();
		this.method7993();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		@Pc(13) int local13 = arg1 + arg3;
		this.aClass245_Sub2_Sub1_4.method8672(false);
		this.aClass67_Sub2_35.method3295();
		this.aClass67_Sub2_35.method3234(this.aClass245_Sub2_Sub1_4);
		this.aClass67_Sub2_35.method3257(arg6);
		this.aClass67_Sub2_35.method3255(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass245_Sub2_Sub1_4.aBoolean731 && !this.aBoolean687) {
			@Pc(74) float local74 = this.aClass245_Sub2_Sub1_4.aFloat190 * (float) arg3 / (float) this.aClass245_Sub2_Sub1_4.anInt10098;
			@Pc(86) float local86 = this.aClass245_Sub2_Sub1_4.aFloat189 * (float) arg2 / (float) this.aClass245_Sub2_Sub1_4.anInt10095;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local74);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local13);
			OpenGL.glTexCoord2f(local86, 0.0F);
			OpenGL.glVertex2i(local9, local13);
			OpenGL.glTexCoord2f(local86, local74);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt9461, (float) this.anInt9456, 0.0F);
		@Pc(126) int local126 = this.method8619();
		@Pc(129) int local129 = this.method8613();
		@Pc(135) int local135 = this.aClass245_Sub2_Sub1_4.anInt10098 + arg1;
		OpenGL.glBegin(7);
		@Pc(139) int local139 = arg1;
		@Pc(149) int local149;
		while (local13 >= local135) {
			local149 = arg0 + this.aClass245_Sub2_Sub1_4.anInt10095;
			@Pc(151) int local151 = arg0;
			while (local149 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass245_Sub2_Sub1_4.aFloat190);
				OpenGL.glVertex2i(local151, local139);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local151, local135);
				OpenGL.glTexCoord2f(this.aClass245_Sub2_Sub1_4.aFloat189, 0.0F);
				OpenGL.glVertex2i(local149, local135);
				OpenGL.glTexCoord2f(this.aClass245_Sub2_Sub1_4.aFloat189, this.aClass245_Sub2_Sub1_4.aFloat190);
				OpenGL.glVertex2i(local149, local139);
				local151 += local126;
				local149 += local126;
			}
			if (local9 > local151) {
				@Pc(225) float local225 = (float) (local9 - local151) * this.aClass245_Sub2_Sub1_4.aFloat189 / (float) this.aClass245_Sub2_Sub1_4.anInt10095;
				OpenGL.glTexCoord2f(0.0F, this.aClass245_Sub2_Sub1_4.aFloat190);
				OpenGL.glVertex2i(local151, local139);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local151, local135);
				OpenGL.glTexCoord2f(local225, 0.0F);
				OpenGL.glVertex2i(local9, local135);
				OpenGL.glTexCoord2f(local225, this.aClass245_Sub2_Sub1_4.aFloat190);
				OpenGL.glVertex2i(local9, local139);
			}
			local135 += local129;
			local139 += local129;
		}
		if (local13 > local139) {
			@Pc(294) float local294 = (float) (this.aClass245_Sub2_Sub1_4.anInt10098 + local139 - local13) * this.aClass245_Sub2_Sub1_4.aFloat190 / (float) this.aClass245_Sub2_Sub1_4.anInt10098;
			@Pc(300) int local300 = arg0 + this.aClass245_Sub2_Sub1_4.anInt10095;
			local149 = arg0;
			while (local300 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass245_Sub2_Sub1_4.aFloat190);
				OpenGL.glVertex2i(local149, local139);
				OpenGL.glTexCoord2f(0.0F, local294);
				OpenGL.glVertex2i(local149, local13);
				OpenGL.glTexCoord2f(this.aClass245_Sub2_Sub1_4.aFloat189, local294);
				OpenGL.glVertex2i(local300, local13);
				OpenGL.glTexCoord2f(this.aClass245_Sub2_Sub1_4.aFloat189, this.aClass245_Sub2_Sub1_4.aFloat190);
				OpenGL.glVertex2i(local300, local139);
				local149 += local126;
				local300 += local126;
			}
			if (local149 < local9) {
				@Pc(377) float local377 = this.aClass245_Sub2_Sub1_4.aFloat189 * (float) (local9 - local149) / (float) this.aClass245_Sub2_Sub1_4.anInt10095;
				OpenGL.glTexCoord2f(0.0F, this.aClass245_Sub2_Sub1_4.aFloat190);
				OpenGL.glVertex2i(local149, local139);
				OpenGL.glTexCoord2f(0.0F, local294);
				OpenGL.glVertex2i(local149, local13);
				OpenGL.glTexCoord2f(local377, local294);
				OpenGL.glVertex2i(local9, local13);
				OpenGL.glTexCoord2f(local377, this.aClass245_Sub2_Sub1_4.aFloat190);
				OpenGL.glVertex2i(local9, local139);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method8626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass245_Sub2_Sub1_4.method8672(true);
		this.aClass67_Sub2_35.method3295();
		this.aClass67_Sub2_35.method3257(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean687) {
			@Pc(195) float local195 = (float) arg2 / (float) this.method8619();
			@Pc(202) float local202 = (float) arg3 / (float) this.method8613();
			@Pc(211) float local211 = (float) this.anInt9461 * local195 + (float) arg0;
			@Pc(220) float local220 = (float) arg1 + local202 * (float) this.anInt9456;
			@Pc(229) float local229 = local195 * (float) this.aClass245_Sub2_Sub1_4.anInt10095 + local211;
			@Pc(238) float local238 = local220 + local202 * (float) this.aClass245_Sub2_Sub1_4.anInt10098;
			if (this.aClass245_Sub2_Sub1_5 == null) {
				this.aClass67_Sub2_35.method3234(this.aClass245_Sub2_Sub1_4);
				this.aClass67_Sub2_35.method3255(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass245_Sub2_Sub1_4.aFloat190);
				OpenGL.glVertex2f(local211, local220);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local211, local238);
				OpenGL.glTexCoord2f(this.aClass245_Sub2_Sub1_4.aFloat189, 0.0F);
				OpenGL.glVertex2f(local229, local238);
				OpenGL.glTexCoord2f(this.aClass245_Sub2_Sub1_4.aFloat189, this.aClass245_Sub2_Sub1_4.aFloat190);
				OpenGL.glVertex2f(local229, local220);
				OpenGL.glEnd();
			} else {
				this.method7990(arg4);
				this.aClass245_Sub2_Sub1_5.method8672(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass245_Sub2_Sub1_4.aFloat190);
				OpenGL.glTexCoord2f(0.0F, this.aClass245_Sub2_Sub1_4.aFloat190);
				OpenGL.glVertex2f(local211, local220);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local211, local238);
				OpenGL.glMultiTexCoord2f(33985, this.aClass245_Sub2_Sub1_4.aFloat189, 0.0F);
				OpenGL.glTexCoord2f(this.aClass245_Sub2_Sub1_4.aFloat189, 0.0F);
				OpenGL.glVertex2f(local229, local238);
				OpenGL.glMultiTexCoord2f(33985, this.aClass245_Sub2_Sub1_4.aFloat189, this.aClass245_Sub2_Sub1_4.aFloat190);
				OpenGL.glTexCoord2f(this.aClass245_Sub2_Sub1_4.aFloat189, this.aClass245_Sub2_Sub1_4.aFloat190);
				OpenGL.glVertex2f(local229, local220);
				OpenGL.glEnd();
				this.method7993();
			}
		} else if (this.aClass245_Sub2_Sub1_5 == null) {
			this.aClass67_Sub2_35.method3234(this.aClass245_Sub2_Sub1_4);
			this.aClass67_Sub2_35.method3255(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass245_Sub2_Sub1_4.aFloat190);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass245_Sub2_Sub1_4.aFloat189, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass245_Sub2_Sub1_4.aFloat189, this.aClass245_Sub2_Sub1_4.aFloat190);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method7990(arg4);
			this.aClass245_Sub2_Sub1_5.method8672(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass245_Sub2_Sub1_4.aFloat190);
			OpenGL.glTexCoord2f(0.0F, this.aClass245_Sub2_Sub1_4.aFloat190);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass245_Sub2_Sub1_4.aFloat189, 0.0F);
			OpenGL.glTexCoord2f(this.aClass245_Sub2_Sub1_4.aFloat189, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass245_Sub2_Sub1_4.aFloat189, this.aClass245_Sub2_Sub1_4.aFloat190);
			OpenGL.glTexCoord2f(this.aClass245_Sub2_Sub1_4.aFloat189, this.aClass245_Sub2_Sub1_4.aFloat190);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method7993();
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass67_Sub2_35.aBoolean325) {
			this.aClass245_Sub2_Sub1_4.method8470(arg5, arg3, arg1, arg2, arg0, arg4);
			return;
		}
		@Pc(17) int[] local17 = this.aClass67_Sub2_35.na(arg4, arg5, arg2, arg3);
		if (local17 == null) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < local17.length; local21++) {
			local17[local21] |= 0xFF000000;
		}
		this.method7991(arg0, arg1, arg2, arg3, local17, arg2);
		return;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
	private void method7993() {
		this.aClass67_Sub2_35.method3268(1);
		this.aClass67_Sub2_35.method3234((Class245) null);
		this.aClass67_Sub2_35.method3271(8448, 8448);
		this.aClass67_Sub2_35.method3279(34168, 768, 1);
		this.aClass67_Sub2_35.method3269(5890, 0);
		this.aClass67_Sub2_35.method3268(0);
		this.aClass67_Sub2_35.method3279(34168, 768, 1);
	}
}
