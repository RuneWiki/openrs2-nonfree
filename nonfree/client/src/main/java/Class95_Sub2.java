import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class95_Sub2 extends Class95 {

	@OriginalMember(owner = "client!nl", name = "x", descriptor = "Lclient!nq;")
	private Class65_Sub2_Sub1 aClass65_Sub2_Sub1_4;

	@OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
	private int anInt4388 = 0;

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
	private int anInt4379 = 0;

	@OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
	private int anInt4390 = 0;

	@OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
	private int anInt4394 = 0;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
	private int anInt4378 = 0;

	@OriginalMember(owner = "client!nl", name = "t", descriptor = "Z")
	private boolean aBoolean326 = false;

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "Lclient!ug;")
	private final Class135_Sub2 aClass135_Sub2_22;

	@OriginalMember(owner = "client!nl", name = "s", descriptor = "Lclient!nq;")
	private final Class65_Sub2_Sub1 aClass65_Sub2_Sub1_3;

	static {
		new Class15("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!ug;IIII)V")
	public Class95_Sub2(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass135_Sub2_22 = arg0;
		this.aClass65_Sub2_Sub1_3 = Static163.method2286(arg0, arg3, arg2, arg1, arg4);
	}

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!ug;II[III)V")
	public Class95_Sub2(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass135_Sub2_22 = arg0;
		this.aClass65_Sub2_Sub1_3 = Static65.method2874(arg1, arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IILclient!ma;II)V")
	@Override
	public void method5820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class71_Sub1 local6 = (Class71_Sub1) arg2;
		@Pc(9) Class65_Sub2_Sub1 local9 = local6.aClass65_Sub2_Sub1_1;
		this.aClass65_Sub2_Sub1_3.method4771(false);
		this.aClass135_Sub2_22.method5454();
		this.aClass135_Sub2_22.method5458(this.aClass65_Sub2_Sub1_3);
		this.aClass135_Sub2_22.method5441(1);
		this.aClass135_Sub2_22.method5457(1);
		this.aClass135_Sub2_22.method5458(local9);
		this.aClass135_Sub2_22.method5407(7681, 8448);
		this.aClass135_Sub2_22.method5474(34168, 0, 768);
		this.aClass135_Sub2_22.method5426(1);
		@Pc(62) int local62 = arg0 + this.anInt4378;
		@Pc(67) int local67 = arg1 + this.anInt4388;
		@Pc(73) int local73 = this.aClass65_Sub2_Sub1_3.anInt4507 + local62;
		@Pc(80) int local80 = local67 + this.aClass65_Sub2_Sub1_3.anInt4511;
		@Pc(87) float local87 = local9.aFloat49 / (float) local9.anInt4507;
		@Pc(94) float local94 = local9.aFloat50 / (float) local9.anInt4511;
		@Pc(102) float local102 = local87 * (float) (local62 - arg3);
		@Pc(110) float local110 = (float) (local73 - arg3) * local87;
		@Pc(120) float local120 = local9.aFloat50 - local94 * (float) (local67 - arg4);
		@Pc(131) float local131 = local9.aFloat50 - (float) (local80 - arg4) * local94;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass65_Sub2_Sub1_3.aFloat50);
		OpenGL.glMultiTexCoord2f(33985, local102, local120);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local131);
		OpenGL.glVertex2i(local62, this.aClass65_Sub2_Sub1_3.anInt4511 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass65_Sub2_Sub1_3.aFloat49, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local131);
		OpenGL.glVertex2i(local62 + this.aClass65_Sub2_Sub1_3.anInt4507, local67 - -this.aClass65_Sub2_Sub1_3.anInt4511);
		OpenGL.glMultiTexCoord2f(33984, this.aClass65_Sub2_Sub1_3.aFloat49, this.aClass65_Sub2_Sub1_3.aFloat50);
		OpenGL.glMultiTexCoord2f(33985, local110, local120);
		OpenGL.glVertex2i(this.aClass65_Sub2_Sub1_3.anInt4507 + local62, local67);
		OpenGL.glEnd();
		this.aClass135_Sub2_22.method5474(5890, 0, 768);
		this.aClass135_Sub2_22.method5441(0);
		this.aClass135_Sub2_22.method5458(null);
		this.aClass135_Sub2_22.method5457(0);
	}

	@OriginalMember(owner = "client!nl", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		return this.aClass65_Sub2_Sub1_3.anInt4511;
	}

	@OriginalMember(owner = "client!nl", name = "s", descriptor = "(IIIIIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass65_Sub2_Sub1_3.method4771(true);
		this.aClass135_Sub2_22.method5454();
		this.aClass135_Sub2_22.method5426(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean326) {
			@Pc(42) float local42 = (float) arg2 / (float) this.j();
			@Pc(49) float local49 = (float) arg3 / (float) this.T();
			@Pc(58) float local58 = local42 * (float) this.anInt4378 + (float) arg0;
			@Pc(67) float local67 = (float) arg1 + local49 * (float) this.anInt4388;
			@Pc(76) float local76 = local42 * (float) this.aClass65_Sub2_Sub1_3.anInt4507 + local58;
			@Pc(85) float local85 = (float) this.aClass65_Sub2_Sub1_3.anInt4511 * local49 + local67;
			if (this.aClass65_Sub2_Sub1_4 == null) {
				this.aClass135_Sub2_22.method5458(this.aClass65_Sub2_Sub1_3);
				this.aClass135_Sub2_22.method5441(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub2_Sub1_3.aFloat50);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glTexCoord2f(this.aClass65_Sub2_Sub1_3.aFloat49, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glTexCoord2f(this.aClass65_Sub2_Sub1_3.aFloat49, this.aClass65_Sub2_Sub1_3.aFloat50);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
			} else {
				this.method3510(arg4);
				this.aClass65_Sub2_Sub1_4.method4771(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass65_Sub2_Sub1_3.aFloat50);
				OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub2_Sub1_3.aFloat50);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass65_Sub2_Sub1_3.aFloat49, 0.0F);
				OpenGL.glTexCoord2f(this.aClass65_Sub2_Sub1_3.aFloat49, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass65_Sub2_Sub1_3.aFloat49, this.aClass65_Sub2_Sub1_3.aFloat50);
				OpenGL.glTexCoord2f(this.aClass65_Sub2_Sub1_3.aFloat49, this.aClass65_Sub2_Sub1_3.aFloat50);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
				this.method3512();
			}
		} else if (this.aClass65_Sub2_Sub1_4 == null) {
			this.aClass135_Sub2_22.method5458(this.aClass65_Sub2_Sub1_3);
			this.aClass135_Sub2_22.method5441(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub2_Sub1_3.aFloat50);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass65_Sub2_Sub1_3.aFloat49, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass65_Sub2_Sub1_3.aFloat49, this.aClass65_Sub2_Sub1_3.aFloat50);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method3510(arg4);
			this.aClass65_Sub2_Sub1_4.method4771(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass65_Sub2_Sub1_3.aFloat50);
			OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub2_Sub1_3.aFloat50);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass65_Sub2_Sub1_3.aFloat49, 0.0F);
			OpenGL.glTexCoord2f(this.aClass65_Sub2_Sub1_3.aFloat49, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass65_Sub2_Sub1_3.aFloat49, this.aClass65_Sub2_Sub1_3.aFloat50);
			OpenGL.glTexCoord2f(this.aClass65_Sub2_Sub1_3.aFloat49, this.aClass65_Sub2_Sub1_3.aFloat50);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method3512();
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected void a(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean326) {
			local6 = this.j();
			local10 = this.T();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(30) float local30 = (arg4 - arg0) / local10;
			@Pc(36) float local36 = (arg5 - arg1) / local10;
			@Pc(42) float local42 = local30 * (float) this.anInt4388;
			@Pc(48) float local48 = local36 * (float) this.anInt4388;
			@Pc(54) float local54 = (float) this.anInt4378 * local16;
			@Pc(60) float local60 = (float) this.anInt4378 * local23;
			@Pc(67) float local67 = (float) this.anInt4379 * -local16;
			@Pc(74) float local74 = -local23 * (float) this.anInt4379;
			@Pc(81) float local81 = (float) this.anInt4394 * -local30;
			arg3 = arg3 + local74 + local48;
			@Pc(94) float local94 = -local36 * (float) this.anInt4394;
			arg2 = local67 + arg2 + local42;
			arg1 = local48 + arg1 + local60;
			arg0 = local42 + local54 + arg0;
			arg4 = local54 + arg4 + local81;
			arg5 = local94 + local60 + arg5;
		}
		local6 = arg4 + arg2 - arg0;
		local10 = arg5 + arg3 - arg1;
		this.aClass65_Sub2_Sub1_3.method4771(true);
		this.aClass135_Sub2_22.method5454();
		this.aClass135_Sub2_22.method5458(this.aClass65_Sub2_Sub1_3);
		this.aClass135_Sub2_22.method5426(arg8);
		this.aClass135_Sub2_22.method5441(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub2_Sub1_3.aFloat50);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass65_Sub2_Sub1_3.aFloat49, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass65_Sub2_Sub1_3.aFloat49, this.aClass65_Sub2_Sub1_3.aFloat50);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!nl", name = "BA", descriptor = "(III)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass65_Sub2_Sub1_4 = Static163.method2286(this.aClass135_Sub2_22, this.aClass65_Sub2_Sub1_3.anInt4507, arg1, arg0, this.aClass65_Sub2_Sub1_3.anInt4511);
		this.anInt4390 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!nl", name = "T", descriptor = "()I")
	@Override
	public int T() {
		return this.aClass65_Sub2_Sub1_3.anInt4511 + this.anInt4388 + this.anInt4394;
	}

	@OriginalMember(owner = "client!nl", name = "la", descriptor = "()I")
	@Override
	public int la() {
		return this.aClass65_Sub2_Sub1_3.anInt4507;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)V")
	private void method3510(@OriginalArg(0) int arg0) {
		this.aClass135_Sub2_22.method5457(1);
		this.aClass135_Sub2_22.method5458(this.aClass65_Sub2_Sub1_3);
		this.aClass135_Sub2_22.method5407(this.aClass135_Sub2_22.method5483(arg0), 7681);
		this.aClass135_Sub2_22.method5474(34167, 1, 768);
		this.aClass135_Sub2_22.method5425(0, 34168);
		this.aClass135_Sub2_22.method5457(0);
		this.aClass135_Sub2_22.method5458(this.aClass65_Sub2_Sub1_4);
		this.aClass135_Sub2_22.method5407(34479, 7681);
		this.aClass135_Sub2_22.method5474(34166, 1, 768);
		if (this.anInt4390 == 0) {
			this.aClass135_Sub2_22.method5409(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt4390 == 1) {
			this.aClass135_Sub2_22.method5409(0.5F, 1.0F, 0.0F, 0.5F);
			return;
		} else if (this.anInt4390 == 2) {
			this.aClass135_Sub2_22.method5409(0.5F, 0.5F, 0.0F, 1.0F);
			return;
		} else if (this.anInt4390 == 3) {
			this.aClass135_Sub2_22.method5409(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!nl", name = "r", descriptor = "(IIIII)V")
	@Override
	public void r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass65_Sub2_Sub1_3.method4771(false);
		this.aClass135_Sub2_22.method5454();
		this.aClass135_Sub2_22.method5426(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt4378;
		@Pc(42) int local42 = arg1 + this.anInt4388;
		if (this.aClass65_Sub2_Sub1_4 == null) {
			this.aClass135_Sub2_22.method5458(this.aClass65_Sub2_Sub1_3);
			this.aClass135_Sub2_22.method5441(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub2_Sub1_3.aFloat50);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass65_Sub2_Sub1_3.anInt4511 + local42);
			OpenGL.glTexCoord2f(this.aClass65_Sub2_Sub1_3.aFloat49, 0.0F);
			OpenGL.glVertex2i(this.aClass65_Sub2_Sub1_3.anInt4507 + local37, local42 - -this.aClass65_Sub2_Sub1_3.anInt4511);
			OpenGL.glTexCoord2f(this.aClass65_Sub2_Sub1_3.aFloat49, this.aClass65_Sub2_Sub1_3.aFloat50);
			OpenGL.glVertex2i(this.aClass65_Sub2_Sub1_3.anInt4507 + local37, local42);
			OpenGL.glEnd();
			return;
		}
		this.method3510(arg2);
		this.aClass65_Sub2_Sub1_4.method4771(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass65_Sub2_Sub1_3.aFloat50);
		OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub2_Sub1_3.aFloat50);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, local42 + this.aClass65_Sub2_Sub1_3.anInt4511);
		OpenGL.glMultiTexCoord2f(33985, this.aClass65_Sub2_Sub1_3.aFloat49, 0.0F);
		OpenGL.glTexCoord2f(this.aClass65_Sub2_Sub1_3.aFloat49, 0.0F);
		OpenGL.glVertex2i(this.aClass65_Sub2_Sub1_3.anInt4507 + local37, local42 + this.aClass65_Sub2_Sub1_3.anInt4511);
		OpenGL.glMultiTexCoord2f(33985, this.aClass65_Sub2_Sub1_3.aFloat49, this.aClass65_Sub2_Sub1_3.aFloat50);
		OpenGL.glTexCoord2f(this.aClass65_Sub2_Sub1_3.aFloat49, this.aClass65_Sub2_Sub1_3.aFloat50);
		OpenGL.glVertex2i(this.aClass65_Sub2_Sub1_3.anInt4507 + local37, local42);
		OpenGL.glEnd();
		this.method3512();
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(FFFFFFLclient!ma;II)V")
	@Override
	protected void method5822(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class71 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class65_Sub2_Sub1 local7 = ((Class71_Sub1) arg6).aClass65_Sub2_Sub1_1;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(30) float local30;
		if (this.aBoolean326) {
			local14 = this.j();
			local18 = this.T();
			local24 = (arg2 - arg0) / local14;
			local30 = (arg3 - arg1) / local14;
			@Pc(36) float local36 = (arg4 - arg0) / local18;
			@Pc(43) float local43 = (arg5 - arg1) / local18;
			@Pc(49) float local49 = (float) this.anInt4388 * local36;
			@Pc(55) float local55 = local43 * (float) this.anInt4388;
			@Pc(61) float local61 = local24 * (float) this.anInt4378;
			@Pc(67) float local67 = local30 * (float) this.anInt4378;
			@Pc(74) float local74 = (float) this.anInt4379 * -local24;
			@Pc(81) float local81 = (float) this.anInt4379 * -local30;
			@Pc(88) float local88 = (float) this.anInt4394 * -local36;
			arg0 = local61 + arg0 + local49;
			@Pc(101) float local101 = -local43 * (float) this.anInt4394;
			arg3 = arg3 + local81 + local55;
			arg4 = local88 + arg4 + local61;
			arg2 = local74 + arg2 + local49;
			arg1 = local55 + local67 + arg1;
			arg5 = local67 + arg5 + local101;
		}
		local14 = arg2 + arg4 - arg0;
		this.aClass65_Sub2_Sub1_3.method4771(true);
		local18 = arg3 + arg5 - arg1;
		this.aClass135_Sub2_22.method5454();
		this.aClass135_Sub2_22.method5458(this.aClass65_Sub2_Sub1_3);
		this.aClass135_Sub2_22.method5441(1);
		this.aClass135_Sub2_22.method5457(1);
		this.aClass135_Sub2_22.method5458(local7);
		this.aClass135_Sub2_22.method5407(7681, 8448);
		this.aClass135_Sub2_22.method5474(34168, 0, 768);
		this.aClass135_Sub2_22.method5426(1);
		local24 = local7.aFloat49 / (float) local7.anInt4507;
		local30 = local7.aFloat50 / (float) local7.anInt4511;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass65_Sub2_Sub1_3.aFloat50);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg0 - (float) arg7), local7.aFloat50 - ((float) -arg8 + arg1) * local30);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg4), local7.aFloat50 - local30 * ((float) -arg8 + arg5));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass65_Sub2_Sub1_3.aFloat49, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * (local14 - (float) arg7), local7.aFloat50 - local30 * (local18 - (float) arg8));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass65_Sub2_Sub1_3.aFloat49, this.aClass65_Sub2_Sub1_3.aFloat50);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg2) * local24, local7.aFloat50 - local30 * (arg3 - (float) arg8));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass135_Sub2_22.method5474(5890, 0, 768);
		this.aClass135_Sub2_22.method5441(0);
		this.aClass135_Sub2_22.method5458(null);
		this.aClass135_Sub2_22.method5457(0);
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(Z)V")
	private void method3512() {
		this.aClass135_Sub2_22.method5457(1);
		this.aClass135_Sub2_22.method5458(null);
		this.aClass135_Sub2_22.method5407(8448, 8448);
		this.aClass135_Sub2_22.method5474(34168, 1, 768);
		this.aClass135_Sub2_22.method5425(0, 5890);
		this.aClass135_Sub2_22.method5457(0);
		this.aClass135_Sub2_22.method5474(34168, 1, 768);
	}

	@OriginalMember(owner = "client!nl", name = "t", descriptor = "(IIIIII)V")
	@Override
	public void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass65_Sub2_Sub1_3.method3588(arg2, arg3, arg1, arg5, arg0, arg4);
	}

	@OriginalMember(owner = "client!nl", name = "JA", descriptor = "(IIIIIII)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		this.aClass65_Sub2_Sub1_3.method4771(false);
		@Pc(18) int local18 = arg1 + arg3;
		this.aClass135_Sub2_22.method5454();
		this.aClass135_Sub2_22.method5458(this.aClass65_Sub2_Sub1_3);
		this.aClass135_Sub2_22.method5426(arg6);
		this.aClass135_Sub2_22.method5441(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass65_Sub2_Sub1_3.aBoolean334 && !this.aBoolean326) {
			@Pc(344) float local344 = (float) arg3 * this.aClass65_Sub2_Sub1_3.aFloat50 / (float) this.aClass65_Sub2_Sub1_3.anInt4511;
			@Pc(356) float local356 = this.aClass65_Sub2_Sub1_3.aFloat49 * (float) arg2 / (float) this.aClass65_Sub2_Sub1_3.anInt4507;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local344);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local18);
			OpenGL.glTexCoord2f(local356, 0.0F);
			OpenGL.glVertex2i(local9, local18);
			OpenGL.glTexCoord2f(local356, local344);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt4378, (float) this.anInt4388, 0.0F);
		@Pc(72) int local72 = this.j();
		@Pc(75) int local75 = this.T();
		@Pc(82) int local82 = arg1 + this.aClass65_Sub2_Sub1_3.anInt4511;
		OpenGL.glBegin(7);
		@Pc(86) int local86 = arg1;
		@Pc(94) int local94;
		while (local18 >= local82) {
			local94 = this.aClass65_Sub2_Sub1_3.anInt4507 + arg0;
			@Pc(96) int local96 = arg0;
			while (local9 >= local94) {
				OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub2_Sub1_3.aFloat50);
				OpenGL.glVertex2i(local96, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local96, local82);
				OpenGL.glTexCoord2f(this.aClass65_Sub2_Sub1_3.aFloat49, 0.0F);
				OpenGL.glVertex2i(local94, local82);
				OpenGL.glTexCoord2f(this.aClass65_Sub2_Sub1_3.aFloat49, this.aClass65_Sub2_Sub1_3.aFloat50);
				OpenGL.glVertex2i(local94, local86);
				local94 += local72;
				local96 += local72;
			}
			if (local96 < local9) {
				@Pc(159) float local159 = (float) (local9 - local96) * this.aClass65_Sub2_Sub1_3.aFloat49 / (float) this.aClass65_Sub2_Sub1_3.anInt4507;
				OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub2_Sub1_3.aFloat50);
				OpenGL.glVertex2i(local96, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local96, local82);
				OpenGL.glTexCoord2f(local159, 0.0F);
				OpenGL.glVertex2i(local9, local82);
				OpenGL.glTexCoord2f(local159, this.aClass65_Sub2_Sub1_3.aFloat50);
				OpenGL.glVertex2i(local9, local86);
			}
			local86 += local75;
			local82 += local75;
		}
		if (local86 < local18) {
			@Pc(225) float local225 = (float) (local86 + this.aClass65_Sub2_Sub1_3.anInt4511 - local18) * this.aClass65_Sub2_Sub1_3.aFloat50 / (float) this.aClass65_Sub2_Sub1_3.anInt4511;
			@Pc(232) int local232 = arg0 + this.aClass65_Sub2_Sub1_3.anInt4507;
			local94 = arg0;
			while (local232 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub2_Sub1_3.aFloat50);
				OpenGL.glVertex2i(local94, local86);
				OpenGL.glTexCoord2f(0.0F, local225);
				OpenGL.glVertex2i(local94, local18);
				OpenGL.glTexCoord2f(this.aClass65_Sub2_Sub1_3.aFloat49, local225);
				OpenGL.glVertex2i(local232, local18);
				OpenGL.glTexCoord2f(this.aClass65_Sub2_Sub1_3.aFloat49, this.aClass65_Sub2_Sub1_3.aFloat50);
				OpenGL.glVertex2i(local232, local86);
				local94 += local72;
				local232 += local72;
			}
			if (local94 < local9) {
				@Pc(301) float local301 = this.aClass65_Sub2_Sub1_3.aFloat49 * (float) (local9 - local94) / (float) this.aClass65_Sub2_Sub1_3.anInt4507;
				OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub2_Sub1_3.aFloat50);
				OpenGL.glVertex2i(local94, local86);
				OpenGL.glTexCoord2f(0.0F, local225);
				OpenGL.glVertex2i(local94, local18);
				OpenGL.glTexCoord2f(local301, local225);
				OpenGL.glVertex2i(local9, local18);
				OpenGL.glTexCoord2f(local301, this.aClass65_Sub2_Sub1_3.aFloat50);
				OpenGL.glVertex2i(local9, local86);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!nl", name = "j", descriptor = "()I")
	@Override
	public int j() {
		return this.anInt4379 + this.anInt4378 + this.aClass65_Sub2_Sub1_3.anInt4507;
	}

	@OriginalMember(owner = "client!nl", name = "MA", descriptor = "(IIII)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4379 = arg2;
		this.anInt4394 = arg3;
		this.anInt4388 = arg1;
		this.anInt4378 = arg0;
		this.aBoolean326 = this.anInt4378 != 0 || this.anInt4388 != 0 || this.anInt4379 != 0 || this.anInt4394 != 0;
	}
}
