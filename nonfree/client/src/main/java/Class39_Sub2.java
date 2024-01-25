import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!eca", name = "g", descriptor = "Lclient!ar;")
	private Class23_Sub1_Sub1 aClass23_Sub1_Sub1_1;

	@OriginalMember(owner = "client!eca", name = "i", descriptor = "I")
	private int anInt2263 = 0;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!eca", name = "q", descriptor = "I")
	private int anInt2269 = 0;

	@OriginalMember(owner = "client!eca", name = "v", descriptor = "I")
	private int anInt2274 = 0;

	@OriginalMember(owner = "client!eca", name = "p", descriptor = "I")
	private int anInt2268 = 0;

	@OriginalMember(owner = "client!eca", name = "s", descriptor = "I")
	private int anInt2271 = 0;

	@OriginalMember(owner = "client!eca", name = "o", descriptor = "Lclient!qj;")
	private final Class100_Sub3 aClass100_Sub3_16;

	@OriginalMember(owner = "client!eca", name = "m", descriptor = "Lclient!ar;")
	public final Class23_Sub1_Sub1 aClass23_Sub1_Sub1_2;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!qj;IIZ)V")
	public Class39_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass100_Sub3_16 = arg0;
		this.aClass23_Sub1_Sub1_2 = Static366.method5436(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!qj;IIII)V")
	public Class39_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass100_Sub3_16 = arg0;
		this.aClass23_Sub1_Sub1_2 = Static500.method6976(arg0, arg3, arg2, arg4, arg1);
	}

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lclient!qj;II[III)V")
	public Class39_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass100_Sub3_16 = arg0;
		this.aClass23_Sub1_Sub1_2 = Static137.method2317(arg1, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(II)V")
	private void method1675(@OriginalArg(0) int arg0) {
		this.aClass100_Sub3_16.method6344(1);
		this.aClass100_Sub3_16.method6277(this.aClass23_Sub1_Sub1_2);
		this.aClass100_Sub3_16.method6300(this.aClass100_Sub3_16.method6265(arg0), 7681);
		this.aClass100_Sub3_16.method6283(1, 768, 34167);
		this.aClass100_Sub3_16.method6332(34168, 0);
		this.aClass100_Sub3_16.method6344(0);
		this.aClass100_Sub3_16.method6277(this.aClass23_Sub1_Sub1_1);
		this.aClass100_Sub3_16.method6300(34479, 7681);
		this.aClass100_Sub3_16.method6283(1, 768, 34166);
		if (this.anInt2268 == 0) {
			this.aClass100_Sub3_16.method6299(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt2268 == 1) {
			this.aClass100_Sub3_16.method6299(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt2268 == 2) {
			this.aClass100_Sub3_16.method6299(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt2268 == 3) {
			this.aClass100_Sub3_16.method6299(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!eca", name = "A", descriptor = "()I")
	@Override
	public int A() {
		return this.aClass23_Sub1_Sub1_2.anInt586 + this.anInt2274 + this.anInt2263;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method7859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class20_Sub2 local6 = (Class20_Sub2) arg2;
		@Pc(9) Class23_Sub1_Sub1 local9 = local6.aClass23_Sub1_Sub1_3;
		this.aClass23_Sub1_Sub1_2.method7783(false);
		this.aClass100_Sub3_16.method6339();
		this.aClass100_Sub3_16.method6277(this.aClass23_Sub1_Sub1_2);
		this.aClass100_Sub3_16.method6322(1);
		this.aClass100_Sub3_16.method6344(1);
		this.aClass100_Sub3_16.method6277(local9);
		this.aClass100_Sub3_16.method6300(7681, 8448);
		this.aClass100_Sub3_16.method6283(0, 768, 34168);
		this.aClass100_Sub3_16.method6334(1);
		@Pc(62) int local62 = arg0 + this.anInt2274;
		@Pc(67) int local67 = arg1 + this.anInt2269;
		@Pc(74) int local74 = local62 + this.aClass23_Sub1_Sub1_2.anInt586;
		@Pc(80) int local80 = this.aClass23_Sub1_Sub1_2.anInt583 + local67;
		@Pc(87) float local87 = local9.aFloat16 / (float) local9.anInt586;
		@Pc(94) float local94 = local9.aFloat15 / (float) local9.anInt583;
		@Pc(102) float local102 = local87 * (float) (local62 - arg3);
		@Pc(110) float local110 = local87 * (float) (local74 - arg3);
		@Pc(121) float local121 = local9.aFloat15 - (float) (local67 - arg4) * local94;
		@Pc(133) float local133 = local9.aFloat15 - local94 * (float) (local80 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass23_Sub1_Sub1_2.aFloat15);
		OpenGL.glMultiTexCoord2f(33985, local102, local121);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local133);
		OpenGL.glVertex2i(local62, local67 + this.aClass23_Sub1_Sub1_2.anInt583);
		OpenGL.glMultiTexCoord2f(33984, this.aClass23_Sub1_Sub1_2.aFloat16, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local133);
		OpenGL.glVertex2i(local62 + this.aClass23_Sub1_Sub1_2.anInt586, local67 - -this.aClass23_Sub1_Sub1_2.anInt583);
		OpenGL.glMultiTexCoord2f(33984, this.aClass23_Sub1_Sub1_2.aFloat16, this.aClass23_Sub1_Sub1_2.aFloat15);
		OpenGL.glMultiTexCoord2f(33985, local110, local121);
		OpenGL.glVertex2i(this.aClass23_Sub1_Sub1_2.anInt586 + local62, local67);
		OpenGL.glEnd();
		this.aClass100_Sub3_16.method6283(0, 768, 5890);
		this.aClass100_Sub3_16.method6322(0);
		this.aClass100_Sub3_16.method6277(null);
		this.aClass100_Sub3_16.method6344(0);
	}

	@OriginalMember(owner = "client!eca", name = "YA", descriptor = "(IIIIIIII)V")
	@Override
	protected void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass23_Sub1_Sub1_2.method7783(true);
		this.aClass100_Sub3_16.method6339();
		this.aClass100_Sub3_16.method6334(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean204) {
			@Pc(48) float local48 = (float) arg2 / (float) this.A();
			@Pc(55) float local55 = (float) arg3 / (float) this.ca();
			@Pc(64) float local64 = (float) arg0 + (float) this.anInt2274 * local48;
			@Pc(73) float local73 = (float) arg1 + local55 * (float) this.anInt2269;
			@Pc(82) float local82 = local48 * (float) this.aClass23_Sub1_Sub1_2.anInt586 + local64;
			@Pc(91) float local91 = local73 + local55 * (float) this.aClass23_Sub1_Sub1_2.anInt583;
			if (this.aClass23_Sub1_Sub1_1 == null) {
				this.aClass100_Sub3_16.method6277(this.aClass23_Sub1_Sub1_2);
				this.aClass100_Sub3_16.method6322(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass23_Sub1_Sub1_2.aFloat15);
				OpenGL.glVertex2f(local64, local73);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local64, local91);
				OpenGL.glTexCoord2f(this.aClass23_Sub1_Sub1_2.aFloat16, 0.0F);
				OpenGL.glVertex2f(local82, local91);
				OpenGL.glTexCoord2f(this.aClass23_Sub1_Sub1_2.aFloat16, this.aClass23_Sub1_Sub1_2.aFloat15);
				OpenGL.glVertex2f(local82, local73);
				OpenGL.glEnd();
			} else {
				this.method1675(arg4);
				this.aClass23_Sub1_Sub1_1.method7783(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass23_Sub1_Sub1_2.aFloat15);
				OpenGL.glTexCoord2f(0.0F, this.aClass23_Sub1_Sub1_2.aFloat15);
				OpenGL.glVertex2f(local64, local73);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local64, local91);
				OpenGL.glMultiTexCoord2f(33985, this.aClass23_Sub1_Sub1_2.aFloat16, 0.0F);
				OpenGL.glTexCoord2f(this.aClass23_Sub1_Sub1_2.aFloat16, 0.0F);
				OpenGL.glVertex2f(local82, local91);
				OpenGL.glMultiTexCoord2f(33985, this.aClass23_Sub1_Sub1_2.aFloat16, this.aClass23_Sub1_Sub1_2.aFloat15);
				OpenGL.glTexCoord2f(this.aClass23_Sub1_Sub1_2.aFloat16, this.aClass23_Sub1_Sub1_2.aFloat15);
				OpenGL.glVertex2f(local82, local73);
				OpenGL.glEnd();
				this.method1677();
			}
		} else if (this.aClass23_Sub1_Sub1_1 == null) {
			this.aClass100_Sub3_16.method6277(this.aClass23_Sub1_Sub1_2);
			this.aClass100_Sub3_16.method6322(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass23_Sub1_Sub1_2.aFloat15);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass23_Sub1_Sub1_2.aFloat16, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass23_Sub1_Sub1_2.aFloat16, this.aClass23_Sub1_Sub1_2.aFloat15);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method1675(arg4);
			this.aClass23_Sub1_Sub1_1.method7783(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass23_Sub1_Sub1_2.aFloat15);
			OpenGL.glTexCoord2f(0.0F, this.aClass23_Sub1_Sub1_2.aFloat15);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass23_Sub1_Sub1_2.aFloat16, 0.0F);
			OpenGL.glTexCoord2f(this.aClass23_Sub1_Sub1_2.aFloat16, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass23_Sub1_Sub1_2.aFloat16, this.aClass23_Sub1_Sub1_2.aFloat15);
			OpenGL.glTexCoord2f(this.aClass23_Sub1_Sub1_2.aFloat16, this.aClass23_Sub1_Sub1_2.aFloat15);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method1677();
		}
	}

	@OriginalMember(owner = "client!eca", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aClass23_Sub1_Sub1_2.anInt583;
	}

	@OriginalMember(owner = "client!eca", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg0 + arg2;
		this.aClass23_Sub1_Sub1_2.method7783(false);
		@Pc(20) int local20 = arg1 + arg3;
		this.aClass100_Sub3_16.method6339();
		this.aClass100_Sub3_16.method6277(this.aClass23_Sub1_Sub1_2);
		this.aClass100_Sub3_16.method6334(arg6);
		this.aClass100_Sub3_16.method6322(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass23_Sub1_Sub1_2.aBoolean30 && !this.aBoolean204) {
			@Pc(348) float local348 = (float) arg3 * this.aClass23_Sub1_Sub1_2.aFloat15 / (float) this.aClass23_Sub1_Sub1_2.anInt583;
			@Pc(360) float local360 = (float) arg2 * this.aClass23_Sub1_Sub1_2.aFloat16 / (float) this.aClass23_Sub1_Sub1_2.anInt586;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local348);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local20);
			OpenGL.glTexCoord2f(local360, 0.0F);
			OpenGL.glVertex2i(local10, local20);
			OpenGL.glTexCoord2f(local360, local348);
			OpenGL.glVertex2i(local10, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt2274, (float) this.anInt2269, 0.0F);
		@Pc(74) int local74 = this.A();
		@Pc(77) int local77 = this.ca();
		@Pc(83) int local83 = this.aClass23_Sub1_Sub1_2.anInt583 + arg1;
		OpenGL.glBegin(7);
		@Pc(87) int local87 = arg1;
		@Pc(95) int local95;
		while (local20 >= local83) {
			local95 = arg0 + this.aClass23_Sub1_Sub1_2.anInt586;
			@Pc(97) int local97 = arg0;
			while (local95 <= local10) {
				OpenGL.glTexCoord2f(0.0F, this.aClass23_Sub1_Sub1_2.aFloat15);
				OpenGL.glVertex2i(local97, local87);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local83);
				OpenGL.glTexCoord2f(this.aClass23_Sub1_Sub1_2.aFloat16, 0.0F);
				OpenGL.glVertex2i(local95, local83);
				OpenGL.glTexCoord2f(this.aClass23_Sub1_Sub1_2.aFloat16, this.aClass23_Sub1_Sub1_2.aFloat15);
				OpenGL.glVertex2i(local95, local87);
				local95 += local74;
				local97 += local74;
			}
			if (local10 > local97) {
				@Pc(168) float local168 = this.aClass23_Sub1_Sub1_2.aFloat16 * (float) (local10 - local97) / (float) this.aClass23_Sub1_Sub1_2.anInt586;
				OpenGL.glTexCoord2f(0.0F, this.aClass23_Sub1_Sub1_2.aFloat15);
				OpenGL.glVertex2i(local97, local87);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local83);
				OpenGL.glTexCoord2f(local168, 0.0F);
				OpenGL.glVertex2i(local10, local83);
				OpenGL.glTexCoord2f(local168, this.aClass23_Sub1_Sub1_2.aFloat15);
				OpenGL.glVertex2i(local10, local87);
			}
			local83 += local77;
			local87 += local77;
		}
		if (local20 > local87) {
			@Pc(233) float local233 = (float) (local87 + this.aClass23_Sub1_Sub1_2.anInt583 - local20) * this.aClass23_Sub1_Sub1_2.aFloat15 / (float) this.aClass23_Sub1_Sub1_2.anInt583;
			@Pc(240) int local240 = arg0 + this.aClass23_Sub1_Sub1_2.anInt586;
			local95 = arg0;
			while (local10 >= local240) {
				OpenGL.glTexCoord2f(0.0F, this.aClass23_Sub1_Sub1_2.aFloat15);
				OpenGL.glVertex2i(local95, local87);
				OpenGL.glTexCoord2f(0.0F, local233);
				OpenGL.glVertex2i(local95, local20);
				OpenGL.glTexCoord2f(this.aClass23_Sub1_Sub1_2.aFloat16, local233);
				OpenGL.glVertex2i(local240, local20);
				OpenGL.glTexCoord2f(this.aClass23_Sub1_Sub1_2.aFloat16, this.aClass23_Sub1_Sub1_2.aFloat15);
				OpenGL.glVertex2i(local240, local87);
				local240 += local74;
				local95 += local74;
			}
			if (local95 < local10) {
				@Pc(305) float local305 = (float) (local10 - local95) * this.aClass23_Sub1_Sub1_2.aFloat16 / (float) this.aClass23_Sub1_Sub1_2.anInt586;
				OpenGL.glTexCoord2f(0.0F, this.aClass23_Sub1_Sub1_2.aFloat15);
				OpenGL.glVertex2i(local95, local87);
				OpenGL.glTexCoord2f(0.0F, local233);
				OpenGL.glVertex2i(local95, local20);
				OpenGL.glTexCoord2f(local305, local233);
				OpenGL.glVertex2i(local10, local20);
				OpenGL.glTexCoord2f(local305, this.aClass23_Sub1_Sub1_2.aFloat15);
				OpenGL.glVertex2i(local10, local87);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected void method7856(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class20 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class23_Sub1_Sub1 local7 = ((Class20_Sub2) arg6).aClass23_Sub1_Sub1_3;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(31) float local31;
		if (this.aBoolean204) {
			local14 = this.A();
			local18 = this.ca();
			local24 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = local37 * (float) this.anInt2269;
			@Pc(56) float local56 = local44 * (float) this.anInt2269;
			@Pc(62) float local62 = local24 * (float) this.anInt2274;
			@Pc(68) float local68 = local31 * (float) this.anInt2274;
			@Pc(75) float local75 = -local24 * (float) this.anInt2263;
			@Pc(82) float local82 = -local31 * (float) this.anInt2263;
			@Pc(89) float local89 = -local37 * (float) this.anInt2271;
			arg3 = local56 + local82 + arg3;
			arg4 = arg4 + local62 + local89;
			@Pc(108) float local108 = -local44 * (float) this.anInt2271;
			arg2 = local50 + local75 + arg2;
			arg0 = local50 + arg0 + local62;
			arg1 = local56 + local68 + arg1;
			arg5 = local108 + local68 + arg5;
		}
		local14 = arg2 + arg4 - arg0;
		local18 = arg3 + arg5 - arg1;
		this.aClass23_Sub1_Sub1_2.method7783(true);
		this.aClass100_Sub3_16.method6339();
		this.aClass100_Sub3_16.method6277(this.aClass23_Sub1_Sub1_2);
		this.aClass100_Sub3_16.method6322(1);
		this.aClass100_Sub3_16.method6344(1);
		this.aClass100_Sub3_16.method6277(local7);
		this.aClass100_Sub3_16.method6300(7681, 8448);
		this.aClass100_Sub3_16.method6283(0, 768, 34168);
		this.aClass100_Sub3_16.method6334(1);
		local24 = local7.aFloat16 / (float) local7.anInt586;
		local31 = local7.aFloat15 / (float) local7.anInt583;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass23_Sub1_Sub1_2.aFloat15);
		OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * local24, local7.aFloat15 - local31 * (arg1 - (float) arg8));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg4 - (float) arg7), local7.aFloat15 - (arg5 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass23_Sub1_Sub1_2.aFloat16, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + local14) * local24, local7.aFloat15 - ((float) -arg8 + local18) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass23_Sub1_Sub1_2.aFloat16, this.aClass23_Sub1_Sub1_2.aFloat15);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg2), local7.aFloat15 - ((float) -arg8 + arg3) * local31);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass100_Sub3_16.method6283(0, 768, 5890);
		this.aClass100_Sub3_16.method6322(0);
		this.aClass100_Sub3_16.method6277(null);
		this.aClass100_Sub3_16.method6344(0);
	}

	@OriginalMember(owner = "client!eca", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass23_Sub1_Sub1_1 = Static500.method6976(this.aClass100_Sub3_16, this.aClass23_Sub1_Sub1_2.anInt586, arg1, this.aClass23_Sub1_Sub1_2.anInt583, arg0);
		this.anInt2268 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!eca", name = "da", descriptor = "(IIIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass23_Sub1_Sub1_2.method372(arg0, arg5, arg4, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)V")
	private void method1677() {
		this.aClass100_Sub3_16.method6344(1);
		this.aClass100_Sub3_16.method6277(null);
		this.aClass100_Sub3_16.method6300(8448, 8448);
		this.aClass100_Sub3_16.method6283(1, 768, 34168);
		this.aClass100_Sub3_16.method6332(5890, 0);
		this.aClass100_Sub3_16.method6344(0);
		this.aClass100_Sub3_16.method6283(1, 768, 34168);
	}

	@OriginalMember(owner = "client!eca", name = "ca", descriptor = "()I")
	@Override
	public int ca() {
		return this.anInt2269 + this.aClass23_Sub1_Sub1_2.anInt583 + this.anInt2271;
	}

	@OriginalMember(owner = "client!eca", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2274 = arg0;
		this.anInt2271 = arg3;
		this.anInt2269 = arg1;
		this.anInt2263 = arg2;
		this.aBoolean204 = this.anInt2274 != 0 || this.anInt2269 != 0 || this.anInt2263 != 0 || this.anInt2271 != 0;
	}

	@OriginalMember(owner = "client!eca", name = "V", descriptor = "(IIIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass23_Sub1_Sub1_2.method7783(false);
		this.aClass100_Sub3_16.method6339();
		this.aClass100_Sub3_16.method6334(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt2269;
		@Pc(42) int local42 = arg0 + this.anInt2274;
		if (this.aClass23_Sub1_Sub1_1 == null) {
			this.aClass100_Sub3_16.method6277(this.aClass23_Sub1_Sub1_2);
			this.aClass100_Sub3_16.method6322(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass23_Sub1_Sub1_2.aFloat15);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, local37 + this.aClass23_Sub1_Sub1_2.anInt583);
			OpenGL.glTexCoord2f(this.aClass23_Sub1_Sub1_2.aFloat16, 0.0F);
			OpenGL.glVertex2i(local42 + this.aClass23_Sub1_Sub1_2.anInt586, local37 - -this.aClass23_Sub1_Sub1_2.anInt583);
			OpenGL.glTexCoord2f(this.aClass23_Sub1_Sub1_2.aFloat16, this.aClass23_Sub1_Sub1_2.aFloat15);
			OpenGL.glVertex2i(this.aClass23_Sub1_Sub1_2.anInt586 + local42, local37);
			OpenGL.glEnd();
			return;
		}
		this.method1675(arg2);
		this.aClass23_Sub1_Sub1_1.method7783(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass23_Sub1_Sub1_2.aFloat15);
		OpenGL.glTexCoord2f(0.0F, this.aClass23_Sub1_Sub1_2.aFloat15);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, this.aClass23_Sub1_Sub1_2.anInt583 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass23_Sub1_Sub1_2.aFloat16, 0.0F);
		OpenGL.glTexCoord2f(this.aClass23_Sub1_Sub1_2.aFloat16, 0.0F);
		OpenGL.glVertex2i(local42 + this.aClass23_Sub1_Sub1_2.anInt586, local37 - -this.aClass23_Sub1_Sub1_2.anInt583);
		OpenGL.glMultiTexCoord2f(33985, this.aClass23_Sub1_Sub1_2.aFloat16, this.aClass23_Sub1_Sub1_2.aFloat15);
		OpenGL.glTexCoord2f(this.aClass23_Sub1_Sub1_2.aFloat16, this.aClass23_Sub1_Sub1_2.aFloat15);
		OpenGL.glVertex2i(this.aClass23_Sub1_Sub1_2.anInt586 + local42, local37);
		OpenGL.glEnd();
		this.method1677();
	}

	@OriginalMember(owner = "client!eca", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.aClass23_Sub1_Sub1_2.anInt586;
	}

	@OriginalMember(owner = "client!eca", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean204) {
			local10 = this.A();
			local14 = this.ca();
			@Pc(21) float local21 = (arg2 - arg0) / local10;
			@Pc(27) float local27 = (arg3 - arg1) / local10;
			@Pc(33) float local33 = (arg4 - arg0) / local14;
			@Pc(39) float local39 = (arg5 - arg1) / local14;
			@Pc(45) float local45 = (float) this.anInt2269 * local33;
			@Pc(51) float local51 = local39 * (float) this.anInt2269;
			@Pc(57) float local57 = local21 * (float) this.anInt2274;
			@Pc(63) float local63 = local27 * (float) this.anInt2274;
			@Pc(70) float local70 = (float) this.anInt2263 * -local21;
			@Pc(77) float local77 = -local27 * (float) this.anInt2263;
			@Pc(84) float local84 = (float) this.anInt2271 * -local33;
			arg1 = arg1 + local63 + local51;
			@Pc(97) float local97 = -local39 * (float) this.anInt2271;
			arg3 = local51 + arg3 + local77;
			arg0 = arg0 + local57 + local45;
			arg4 = arg4 + local57 + local84;
			arg2 = arg2 + local70 + local45;
			arg5 = local97 + local63 + arg5;
		}
		local10 = arg4 + arg2 - arg0;
		local14 = arg3 + arg5 - arg1;
		this.aClass23_Sub1_Sub1_2.method7783(true);
		this.aClass100_Sub3_16.method6339();
		this.aClass100_Sub3_16.method6277(this.aClass23_Sub1_Sub1_2);
		this.aClass100_Sub3_16.method6334(arg8);
		this.aClass100_Sub3_16.method6322(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass23_Sub1_Sub1_2.aFloat15);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass23_Sub1_Sub1_2.aFloat16, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass23_Sub1_Sub1_2.aFloat16, this.aClass23_Sub1_Sub1_2.aFloat15);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}
}
