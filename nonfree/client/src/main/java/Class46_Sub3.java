import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public final class Class46_Sub3 extends Class46 {

	@OriginalMember(owner = "client!nda", name = "h", descriptor = "Lclient!eba;")
	private Class85_Sub1_Sub1 aClass85_Sub1_Sub1_2;

	@OriginalMember(owner = "client!nda", name = "f", descriptor = "I")
	private int anInt7305 = 0;

	@OriginalMember(owner = "client!nda", name = "i", descriptor = "I")
	private int anInt7306 = 0;

	@OriginalMember(owner = "client!nda", name = "d", descriptor = "Z")
	private boolean aBoolean533 = false;

	@OriginalMember(owner = "client!nda", name = "w", descriptor = "I")
	private int anInt7319 = 0;

	@OriginalMember(owner = "client!nda", name = "x", descriptor = "I")
	private int anInt7320 = 0;

	@OriginalMember(owner = "client!nda", name = "z", descriptor = "I")
	private int anInt7322 = 0;

	@OriginalMember(owner = "client!nda", name = "g", descriptor = "Lclient!qo;")
	private final Class20_Sub3 aClass20_Sub3_26;

	@OriginalMember(owner = "client!nda", name = "k", descriptor = "Lclient!eba;")
	private final Class85_Sub1_Sub1 aClass85_Sub1_Sub1_3;

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lclient!qo;IIZ)V")
	public Class46_Sub3(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass20_Sub3_26 = arg0;
		this.aClass85_Sub1_Sub1_3 = Static33.method4659(arg0, arg3 ? 6408 : 6407, arg1, arg2);
	}

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lclient!qo;IIII)V")
	public Class46_Sub3(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass20_Sub3_26 = arg0;
		this.aClass85_Sub1_Sub1_3 = Static310.method5472(arg0, arg1, arg3, arg2, arg4);
	}

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lclient!qo;II[III)V")
	public Class46_Sub3(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass20_Sub3_26 = arg0;
		this.aClass85_Sub1_Sub1_3 = Static629.method9127(arg3, arg4, arg5, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method6201(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean533) {
			local10 = this.method6205();
			local14 = this.method6219();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			@Pc(26) float local26 = (arg3 - arg1) / local10;
			@Pc(33) float local33 = (arg4 - arg0) / local14;
			@Pc(40) float local40 = (arg5 - arg1) / local14;
			@Pc(46) float local46 = (float) this.anInt7319 * local33;
			@Pc(52) float local52 = (float) this.anInt7319 * local40;
			@Pc(58) float local58 = (float) this.anInt7320 * local20;
			@Pc(64) float local64 = (float) this.anInt7320 * local26;
			@Pc(71) float local71 = -local20 * (float) this.anInt7322;
			@Pc(78) float local78 = (float) this.anInt7322 * -local26;
			@Pc(85) float local85 = -local33 * (float) this.anInt7306;
			arg4 = local85 + arg4 + local58;
			arg2 = arg2 + local71 + local46;
			@Pc(104) float local104 = (float) this.anInt7306 * -local40;
			arg3 = arg3 + local78 + local52;
			arg0 = arg0 + local58 + local46;
			arg1 = local52 + local64 + arg1;
			arg5 = local104 + arg5 + local64;
		}
		local10 = arg2 + arg4 - arg0;
		local14 = arg5 + arg3 - arg1;
		this.aClass85_Sub1_Sub1_3.method9102(true);
		this.aClass20_Sub3_26.method7379();
		this.aClass20_Sub3_26.method7358(this.aClass85_Sub1_Sub1_3);
		this.aClass20_Sub3_26.method7340(1);
		this.aClass20_Sub3_26.method7348(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass85_Sub1_Sub1_3.aFloat96);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass85_Sub1_Sub1_3.aFloat95, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass85_Sub1_Sub1_3.aFloat95, this.aClass85_Sub1_Sub1_3.aFloat96);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "()I")
	@Override
	public int method6208() {
		return this.aClass85_Sub1_Sub1_3.anInt3122;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(III)V")
	@Override
	public void method6207(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass85_Sub1_Sub1_2 = Static310.method5472(this.aClass20_Sub3_26, 0, this.aClass85_Sub1_Sub1_3.anInt3123, 0, this.aClass85_Sub1_Sub1_3.anInt3122);
		this.anInt7305 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "([I)V")
	@Override
	public void method6223(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt7319;
		arg0[3] = this.anInt7306;
		arg0[0] = this.anInt7320;
		arg0[2] = this.anInt7322;
	}

	@OriginalMember(owner = "client!nda", name = "d", descriptor = "()I")
	@Override
	public int method6219() {
		return this.anInt7319 + this.aClass85_Sub1_Sub1_3.anInt3122 + this.anInt7306;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass85_Sub1_Sub1_3.method2895(arg0, arg3, arg5, arg1, arg4, arg2);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method6202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg2;
		@Pc(9) Class85_Sub1_Sub1 local9 = local6.aClass85_Sub1_Sub1_1;
		this.aClass85_Sub1_Sub1_3.method9102(false);
		this.aClass20_Sub3_26.method7379();
		this.aClass20_Sub3_26.method7358(this.aClass85_Sub1_Sub1_3);
		this.aClass20_Sub3_26.method7348(1);
		this.aClass20_Sub3_26.method7325(1);
		this.aClass20_Sub3_26.method7358(local9);
		this.aClass20_Sub3_26.method7316(7681, 8448);
		this.aClass20_Sub3_26.method7349(34168, 768, 0);
		this.aClass20_Sub3_26.method7340(1);
		@Pc(62) int local62 = arg0 + this.anInt7320;
		@Pc(67) int local67 = arg1 + this.anInt7319;
		@Pc(73) int local73 = this.aClass85_Sub1_Sub1_3.anInt3123 + local62;
		@Pc(80) int local80 = local67 + this.aClass85_Sub1_Sub1_3.anInt3122;
		@Pc(87) float local87 = local9.aFloat95 / (float) local9.anInt3123;
		@Pc(94) float local94 = local9.aFloat96 / (float) local9.anInt3122;
		@Pc(102) float local102 = local87 * (float) (local62 - arg3);
		@Pc(109) float local109 = local87 * (float) (local73 - arg3);
		@Pc(119) float local119 = local9.aFloat96 - local94 * (float) (local67 - arg4);
		@Pc(131) float local131 = local9.aFloat96 - (float) (local80 - arg4) * local94;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass85_Sub1_Sub1_3.aFloat96);
		OpenGL.glMultiTexCoord2f(33985, local102, local119);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local131);
		OpenGL.glVertex2i(local62, local67 + this.aClass85_Sub1_Sub1_3.anInt3122);
		OpenGL.glMultiTexCoord2f(33984, this.aClass85_Sub1_Sub1_3.aFloat95, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local131);
		OpenGL.glVertex2i(local62 + this.aClass85_Sub1_Sub1_3.anInt3123, this.aClass85_Sub1_Sub1_3.anInt3122 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass85_Sub1_Sub1_3.aFloat95, this.aClass85_Sub1_Sub1_3.aFloat96);
		OpenGL.glMultiTexCoord2f(33985, local109, local119);
		OpenGL.glVertex2i(this.aClass85_Sub1_Sub1_3.anInt3123 + local62, local67);
		OpenGL.glEnd();
		this.aClass20_Sub3_26.method7349(5890, 768, 0);
		this.aClass20_Sub3_26.method7348(0);
		this.aClass20_Sub3_26.method7358(null);
		this.aClass20_Sub3_26.method7325(0);
	}

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "(IIII)V")
	@Override
	public void method6224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7320 = arg0;
		this.anInt7322 = arg2;
		this.anInt7319 = arg1;
		this.anInt7306 = arg3;
		this.aBoolean533 = this.anInt7320 != 0 || this.anInt7319 != 0 || this.anInt7322 != 0 || this.anInt7306 != 0;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)V")
	private void method6226() {
		this.aClass20_Sub3_26.method7325(1);
		this.aClass20_Sub3_26.method7358(null);
		this.aClass20_Sub3_26.method7316(8448, 8448);
		this.aClass20_Sub3_26.method7349(34168, 768, 1);
		this.aClass20_Sub3_26.method7362(0, 5890);
		this.aClass20_Sub3_26.method7325(0);
		this.aClass20_Sub3_26.method7349(34168, 768, 1);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method6222(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class85_Sub1_Sub1 local7 = ((Class1_Sub1) arg6).aClass85_Sub1_Sub1_1;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(32) float local32;
		if (this.aBoolean533) {
			local14 = this.method6205();
			local18 = this.method6219();
			local25 = (arg2 - arg0) / local14;
			local32 = (arg3 - arg1) / local14;
			@Pc(39) float local39 = (arg4 - arg0) / local18;
			@Pc(46) float local46 = (arg5 - arg1) / local18;
			@Pc(52) float local52 = local39 * (float) this.anInt7319;
			@Pc(58) float local58 = local46 * (float) this.anInt7319;
			@Pc(64) float local64 = (float) this.anInt7320 * local25;
			@Pc(70) float local70 = (float) this.anInt7320 * local32;
			@Pc(77) float local77 = -local25 * (float) this.anInt7322;
			@Pc(84) float local84 = -local32 * (float) this.anInt7322;
			@Pc(91) float local91 = -local39 * (float) this.anInt7306;
			arg3 = arg3 + local84 + local58;
			arg2 = local77 + arg2 + local52;
			arg4 = local91 + local64 + arg4;
			arg0 = local64 + arg0 + local52;
			arg1 = local58 + arg1 + local70;
			@Pc(128) float local128 = -local46 * (float) this.anInt7306;
			arg5 = local70 + arg5 + local128;
		}
		local14 = arg2 + arg4 - arg0;
		this.aClass85_Sub1_Sub1_3.method9102(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass20_Sub3_26.method7379();
		this.aClass20_Sub3_26.method7358(this.aClass85_Sub1_Sub1_3);
		this.aClass20_Sub3_26.method7348(1);
		this.aClass20_Sub3_26.method7325(1);
		this.aClass20_Sub3_26.method7358(local7);
		this.aClass20_Sub3_26.method7316(7681, 8448);
		this.aClass20_Sub3_26.method7349(34168, 768, 0);
		this.aClass20_Sub3_26.method7340(1);
		local25 = local7.aFloat95 / (float) local7.anInt3123;
		local32 = local7.aFloat96 / (float) local7.anInt3122;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass85_Sub1_Sub1_3.aFloat96);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg0 - (float) arg7), local7.aFloat96 - local32 * ((float) -arg8 + arg1));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg4) * local25, local7.aFloat96 - local32 * (arg5 - (float) arg8));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass85_Sub1_Sub1_3.aFloat95, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (local14 - (float) arg7) * local25, local7.aFloat96 - local32 * (local18 - (float) arg8));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass85_Sub1_Sub1_3.aFloat95, this.aClass85_Sub1_Sub1_3.aFloat96);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg2), local7.aFloat96 - local32 * (arg3 - (float) arg8));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass20_Sub3_26.method7349(5890, 768, 0);
		this.aClass20_Sub3_26.method7348(0);
		this.aClass20_Sub3_26.method7358(null);
		this.aClass20_Sub3_26.method7325(0);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "()I")
	@Override
	public int method6205() {
		return this.anInt7320 + this.aClass85_Sub1_Sub1_3.anInt3123 + this.anInt7322;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method6203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass85_Sub1_Sub1_3.method9102(false);
		this.aClass20_Sub3_26.method7379();
		this.aClass20_Sub3_26.method7340(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt7320;
		@Pc(42) int local42 = arg1 + this.anInt7319;
		if (this.aClass85_Sub1_Sub1_2 == null) {
			this.aClass20_Sub3_26.method7358(this.aClass85_Sub1_Sub1_3);
			this.aClass20_Sub3_26.method7348(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass85_Sub1_Sub1_3.aFloat96);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, local42 + this.aClass85_Sub1_Sub1_3.anInt3122);
			OpenGL.glTexCoord2f(this.aClass85_Sub1_Sub1_3.aFloat95, 0.0F);
			OpenGL.glVertex2i(this.aClass85_Sub1_Sub1_3.anInt3123 + local37, this.aClass85_Sub1_Sub1_3.anInt3122 + local42);
			OpenGL.glTexCoord2f(this.aClass85_Sub1_Sub1_3.aFloat95, this.aClass85_Sub1_Sub1_3.aFloat96);
			OpenGL.glVertex2i(this.aClass85_Sub1_Sub1_3.anInt3123 + local37, local42);
			OpenGL.glEnd();
			return;
		}
		this.method6227(arg2);
		this.aClass85_Sub1_Sub1_2.method9102(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass85_Sub1_Sub1_3.aFloat96);
		OpenGL.glTexCoord2f(0.0F, this.aClass85_Sub1_Sub1_3.aFloat96);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, local42 + this.aClass85_Sub1_Sub1_3.anInt3122);
		OpenGL.glMultiTexCoord2f(33985, this.aClass85_Sub1_Sub1_3.aFloat95, 0.0F);
		OpenGL.glTexCoord2f(this.aClass85_Sub1_Sub1_3.aFloat95, 0.0F);
		OpenGL.glVertex2i(this.aClass85_Sub1_Sub1_3.anInt3123 + local37, this.aClass85_Sub1_Sub1_3.anInt3122 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass85_Sub1_Sub1_3.aFloat95, this.aClass85_Sub1_Sub1_3.aFloat96);
		OpenGL.glTexCoord2f(this.aClass85_Sub1_Sub1_3.aFloat95, this.aClass85_Sub1_Sub1_3.aFloat96);
		OpenGL.glVertex2i(local37 + this.aClass85_Sub1_Sub1_3.anInt3123, local42);
		OpenGL.glEnd();
		this.method6226();
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(II)V")
	private void method6227(@OriginalArg(0) int arg0) {
		this.aClass20_Sub3_26.method7325(1);
		this.aClass20_Sub3_26.method7358(this.aClass85_Sub1_Sub1_3);
		this.aClass20_Sub3_26.method7316(this.aClass20_Sub3_26.method7368(arg0), 7681);
		this.aClass20_Sub3_26.method7349(34167, 768, 1);
		this.aClass20_Sub3_26.method7362(0, 34168);
		this.aClass20_Sub3_26.method7325(0);
		this.aClass20_Sub3_26.method7358(this.aClass85_Sub1_Sub1_2);
		this.aClass20_Sub3_26.method7316(34479, 7681);
		this.aClass20_Sub3_26.method7349(34166, 768, 1);
		if (this.anInt7305 == 0) {
			this.aClass20_Sub3_26.method7336(0.0F, 1.0F, 0.5F, 0.5F);
		} else if (this.anInt7305 == 1) {
			this.aClass20_Sub3_26.method7336(0.0F, 0.5F, 0.5F, 1.0F);
		} else if (this.anInt7305 == 2) {
			this.aClass20_Sub3_26.method7336(0.0F, 0.5F, 1.0F, 0.5F);
		} else if (this.anInt7305 == 3) {
			this.aClass20_Sub3_26.method7336(0.0F, 128.5F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		@Pc(13) int local13 = arg3 + arg1;
		this.aClass85_Sub1_Sub1_3.method9102(false);
		this.aClass20_Sub3_26.method7379();
		this.aClass20_Sub3_26.method7358(this.aClass85_Sub1_Sub1_3);
		this.aClass20_Sub3_26.method7340(arg6);
		this.aClass20_Sub3_26.method7348(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass85_Sub1_Sub1_3.aBoolean246 && !this.aBoolean533) {
			@Pc(72) float local72 = this.aClass85_Sub1_Sub1_3.aFloat96 * (float) arg3 / (float) this.aClass85_Sub1_Sub1_3.anInt3122;
			@Pc(84) float local84 = (float) arg2 * this.aClass85_Sub1_Sub1_3.aFloat95 / (float) this.aClass85_Sub1_Sub1_3.anInt3123;
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
		OpenGL.glTranslatef((float) this.anInt7320, (float) this.anInt7319, 0.0F);
		@Pc(124) int local124 = this.method6205();
		@Pc(127) int local127 = this.method6219();
		@Pc(134) int local134 = arg1 + this.aClass85_Sub1_Sub1_3.anInt3122;
		OpenGL.glBegin(7);
		@Pc(138) int local138 = arg1;
		@Pc(146) int local146;
		while (local134 <= local13) {
			local146 = arg0 + this.aClass85_Sub1_Sub1_3.anInt3123;
			@Pc(148) int local148 = arg0;
			while (local9 >= local146) {
				OpenGL.glTexCoord2f(0.0F, this.aClass85_Sub1_Sub1_3.aFloat96);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(this.aClass85_Sub1_Sub1_3.aFloat95, 0.0F);
				OpenGL.glVertex2i(local146, local134);
				OpenGL.glTexCoord2f(this.aClass85_Sub1_Sub1_3.aFloat95, this.aClass85_Sub1_Sub1_3.aFloat96);
				OpenGL.glVertex2i(local146, local138);
				local148 += local124;
				local146 += local124;
			}
			if (local148 < local9) {
				@Pc(211) float local211 = (float) (local9 - local148) * this.aClass85_Sub1_Sub1_3.aFloat95 / (float) this.aClass85_Sub1_Sub1_3.anInt3123;
				OpenGL.glTexCoord2f(0.0F, this.aClass85_Sub1_Sub1_3.aFloat96);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(local211, 0.0F);
				OpenGL.glVertex2i(local9, local134);
				OpenGL.glTexCoord2f(local211, this.aClass85_Sub1_Sub1_3.aFloat96);
				OpenGL.glVertex2i(local9, local138);
			}
			local138 += local127;
			local134 += local127;
		}
		if (local13 > local138) {
			@Pc(276) float local276 = this.aClass85_Sub1_Sub1_3.aFloat96 * (float) (this.aClass85_Sub1_Sub1_3.anInt3122 + local138 - local13) / (float) this.aClass85_Sub1_Sub1_3.anInt3122;
			@Pc(282) int local282 = arg0 + this.aClass85_Sub1_Sub1_3.anInt3123;
			local146 = arg0;
			while (local282 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass85_Sub1_Sub1_3.aFloat96);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local276);
				OpenGL.glVertex2i(local146, local13);
				OpenGL.glTexCoord2f(this.aClass85_Sub1_Sub1_3.aFloat95, local276);
				OpenGL.glVertex2i(local282, local13);
				OpenGL.glTexCoord2f(this.aClass85_Sub1_Sub1_3.aFloat95, this.aClass85_Sub1_Sub1_3.aFloat96);
				OpenGL.glVertex2i(local282, local138);
				local282 += local124;
				local146 += local124;
			}
			if (local9 > local146) {
				@Pc(350) float local350 = (float) (local9 - local146) * this.aClass85_Sub1_Sub1_3.aFloat95 / (float) this.aClass85_Sub1_Sub1_3.anInt3123;
				OpenGL.glTexCoord2f(0.0F, this.aClass85_Sub1_Sub1_3.aFloat96);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local276);
				OpenGL.glVertex2i(local146, local13);
				OpenGL.glTexCoord2f(local350, local276);
				OpenGL.glVertex2i(local9, local13);
				OpenGL.glTexCoord2f(local350, this.aClass85_Sub1_Sub1_3.aFloat96);
				OpenGL.glVertex2i(local9, local138);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "()I")
	@Override
	public int method6210() {
		return this.aClass85_Sub1_Sub1_3.anInt3123;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method6221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass85_Sub1_Sub1_3.method9102(true);
		this.aClass20_Sub3_26.method7379();
		this.aClass20_Sub3_26.method7340(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean533) {
			@Pc(48) float local48 = (float) arg2 / (float) this.method6205();
			@Pc(55) float local55 = (float) arg3 / (float) this.method6219();
			@Pc(64) float local64 = (float) arg0 + local48 * (float) this.anInt7320;
			@Pc(73) float local73 = (float) this.anInt7319 * local55 + (float) arg1;
			@Pc(82) float local82 = local64 + local48 * (float) this.aClass85_Sub1_Sub1_3.anInt3123;
			@Pc(91) float local91 = local73 + (float) this.aClass85_Sub1_Sub1_3.anInt3122 * local55;
			if (this.aClass85_Sub1_Sub1_2 == null) {
				this.aClass20_Sub3_26.method7358(this.aClass85_Sub1_Sub1_3);
				this.aClass20_Sub3_26.method7348(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass85_Sub1_Sub1_3.aFloat96);
				OpenGL.glVertex2f(local64, local73);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local64, local91);
				OpenGL.glTexCoord2f(this.aClass85_Sub1_Sub1_3.aFloat95, 0.0F);
				OpenGL.glVertex2f(local82, local91);
				OpenGL.glTexCoord2f(this.aClass85_Sub1_Sub1_3.aFloat95, this.aClass85_Sub1_Sub1_3.aFloat96);
				OpenGL.glVertex2f(local82, local73);
				OpenGL.glEnd();
			} else {
				this.method6227(arg4);
				this.aClass85_Sub1_Sub1_2.method9102(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass85_Sub1_Sub1_3.aFloat96);
				OpenGL.glTexCoord2f(0.0F, this.aClass85_Sub1_Sub1_3.aFloat96);
				OpenGL.glVertex2f(local64, local73);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local64, local91);
				OpenGL.glMultiTexCoord2f(33985, this.aClass85_Sub1_Sub1_3.aFloat95, 0.0F);
				OpenGL.glTexCoord2f(this.aClass85_Sub1_Sub1_3.aFloat95, 0.0F);
				OpenGL.glVertex2f(local82, local91);
				OpenGL.glMultiTexCoord2f(33985, this.aClass85_Sub1_Sub1_3.aFloat95, this.aClass85_Sub1_Sub1_3.aFloat96);
				OpenGL.glTexCoord2f(this.aClass85_Sub1_Sub1_3.aFloat95, this.aClass85_Sub1_Sub1_3.aFloat96);
				OpenGL.glVertex2f(local82, local73);
				OpenGL.glEnd();
				this.method6226();
			}
		} else if (this.aClass85_Sub1_Sub1_2 == null) {
			this.aClass20_Sub3_26.method7358(this.aClass85_Sub1_Sub1_3);
			this.aClass20_Sub3_26.method7348(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass85_Sub1_Sub1_3.aFloat96);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass85_Sub1_Sub1_3.aFloat95, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass85_Sub1_Sub1_3.aFloat95, this.aClass85_Sub1_Sub1_3.aFloat96);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method6227(arg4);
			this.aClass85_Sub1_Sub1_2.method9102(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass85_Sub1_Sub1_3.aFloat96);
			OpenGL.glTexCoord2f(0.0F, this.aClass85_Sub1_Sub1_3.aFloat96);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass85_Sub1_Sub1_3.aFloat95, 0.0F);
			OpenGL.glTexCoord2f(this.aClass85_Sub1_Sub1_3.aFloat95, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass85_Sub1_Sub1_3.aFloat95, this.aClass85_Sub1_Sub1_3.aFloat96);
			OpenGL.glTexCoord2f(this.aClass85_Sub1_Sub1_3.aFloat95, this.aClass85_Sub1_Sub1_3.aFloat96);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method6226();
		}
	}
}
