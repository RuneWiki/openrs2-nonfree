import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public final class Class134_Sub2 extends Class134 {

	@OriginalMember(owner = "client!qda", name = "y", descriptor = "Lclient!gda;")
	private Class32_Sub1_Sub1 aClass32_Sub1_Sub1_3;

	@OriginalMember(owner = "client!qda", name = "D", descriptor = "I")
	private int anInt7990 = 0;

	@OriginalMember(owner = "client!qda", name = "q", descriptor = "I")
	private int anInt7999 = 0;

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "I")
	private int anInt7997 = 0;

	@OriginalMember(owner = "client!qda", name = "x", descriptor = "I")
	private int anInt7996 = 0;

	@OriginalMember(owner = "client!qda", name = "l", descriptor = "Z")
	private boolean aBoolean598 = false;

	@OriginalMember(owner = "client!qda", name = "d", descriptor = "I")
	private int anInt8004 = 0;

	@OriginalMember(owner = "client!qda", name = "m", descriptor = "Lclient!ffa;")
	private final Class57_Sub2 aClass57_Sub2_29;

	@OriginalMember(owner = "client!qda", name = "C", descriptor = "Lclient!gda;")
	private final Class32_Sub1_Sub1 aClass32_Sub1_Sub1_4;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lclient!ffa;IIZ)V")
	public Class134_Sub2(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass57_Sub2_29 = arg0;
		this.aClass32_Sub1_Sub1_4 = Static445.method6627(arg0, arg1, arg3 ? 6408 : 6407, arg2);
	}

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lclient!ffa;IIII)V")
	public Class134_Sub2(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass57_Sub2_29 = arg0;
		this.aClass32_Sub1_Sub1_4 = Static605.method8677(arg0, arg2, arg4, arg3, arg1);
	}

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lclient!ffa;II[III)V")
	public Class134_Sub2(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass57_Sub2_29 = arg0;
		this.aClass32_Sub1_Sub1_4 = Static526.method7586(arg5, arg2, arg0, arg3, arg1, arg4);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IB)V")
	private void method6887(@OriginalArg(0) int arg0) {
		this.aClass57_Sub2_29.method2345(1);
		this.aClass57_Sub2_29.method2362(this.aClass32_Sub1_Sub1_4);
		this.aClass57_Sub2_29.method2313(7681, this.aClass57_Sub2_29.method2308(arg0));
		this.aClass57_Sub2_29.method2368(34167, 1, 768);
		this.aClass57_Sub2_29.method2312(34168, 0);
		this.aClass57_Sub2_29.method2345(0);
		this.aClass57_Sub2_29.method2362(this.aClass32_Sub1_Sub1_3);
		this.aClass57_Sub2_29.method2313(7681, 34479);
		this.aClass57_Sub2_29.method2368(34166, 1, 768);
		if (this.anInt7997 == 0) {
			this.aClass57_Sub2_29.method2352(0.5F, 0.0F, 1.0F, 0.5F);
		} else if (this.anInt7997 == 1) {
			this.aClass57_Sub2_29.method2352(0.5F, 0.0F, 0.5F, 1.0F);
		} else if (this.anInt7997 == 2) {
			this.aClass57_Sub2_29.method2352(1.0F, 0.0F, 0.5F, 0.5F);
		} else if (this.anInt7997 == 3) {
			this.aClass57_Sub2_29.method2352(128.5F, 0.0F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V")
	private void method6888() {
		this.aClass57_Sub2_29.method2345(1);
		this.aClass57_Sub2_29.method2362((Class32) null);
		this.aClass57_Sub2_29.method2313(8448, 8448);
		this.aClass57_Sub2_29.method2368(34168, 1, 768);
		this.aClass57_Sub2_29.method2312(5890, 0);
		this.aClass57_Sub2_29.method2345(0);
		this.aClass57_Sub2_29.method2368(34168, 1, 768);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "()I")
	@Override
	public int method9219() {
		return this.aClass32_Sub1_Sub1_4.anInt3112;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method9225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass57_Sub2_29.aBoolean211) {
			this.aClass32_Sub1_Sub1_4.method2719(arg5, arg0, arg2, arg3, arg1, arg4);
			return;
		}
		@Pc(27) int[] local27 = this.aClass57_Sub2_29.na(arg4, arg5, arg2, arg3);
		if (local27 != null) {
			for (@Pc(31) int local31 = 0; local31 < local27.length; local31++) {
				local27[local31] |= 0xFF000000;
			}
			this.method6891(arg0, arg1, arg2, arg3, local27, arg2);
		}
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "()I")
	@Override
	public int method9231() {
		return this.anInt7990 + this.aClass32_Sub1_Sub1_4.anInt3115 + this.anInt7996;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method9220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg2;
		@Pc(9) Class32_Sub1_Sub1 local9 = local6.aClass32_Sub1_Sub1_5;
		this.aClass32_Sub1_Sub1_4.method8430(false);
		this.aClass57_Sub2_29.method2320();
		this.aClass57_Sub2_29.method2362(this.aClass32_Sub1_Sub1_4);
		this.aClass57_Sub2_29.method2382(1);
		this.aClass57_Sub2_29.method2345(1);
		this.aClass57_Sub2_29.method2362(local9);
		this.aClass57_Sub2_29.method2313(8448, 7681);
		this.aClass57_Sub2_29.method2368(34168, 0, 768);
		this.aClass57_Sub2_29.method2372(1);
		@Pc(62) int local62 = arg0 + this.anInt7990;
		@Pc(67) int local67 = arg1 + this.anInt8004;
		@Pc(73) int local73 = this.aClass32_Sub1_Sub1_4.anInt3115 + local62;
		@Pc(79) int local79 = this.aClass32_Sub1_Sub1_4.anInt3112 + local67;
		@Pc(86) float local86 = local9.aFloat53 / (float) local9.anInt3115;
		@Pc(93) float local93 = local9.aFloat52 / (float) local9.anInt3112;
		@Pc(101) float local101 = (float) (local62 - arg3) * local86;
		@Pc(109) float local109 = (float) (local73 - arg3) * local86;
		@Pc(120) float local120 = local9.aFloat52 - local93 * (float) (local67 - arg4);
		@Pc(131) float local131 = local9.aFloat52 - local93 * (float) (local79 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass32_Sub1_Sub1_4.aFloat52);
		OpenGL.glMultiTexCoord2f(33985, local101, local120);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local131);
		OpenGL.glVertex2i(local62, local67 + this.aClass32_Sub1_Sub1_4.anInt3112);
		OpenGL.glMultiTexCoord2f(33984, this.aClass32_Sub1_Sub1_4.aFloat53, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local131);
		OpenGL.glVertex2i(local62 + this.aClass32_Sub1_Sub1_4.anInt3115, local67 + this.aClass32_Sub1_Sub1_4.anInt3112);
		OpenGL.glMultiTexCoord2f(33984, this.aClass32_Sub1_Sub1_4.aFloat53, this.aClass32_Sub1_Sub1_4.aFloat52);
		OpenGL.glMultiTexCoord2f(33985, local109, local120);
		OpenGL.glVertex2i(this.aClass32_Sub1_Sub1_4.anInt3115 + local62, local67);
		OpenGL.glEnd();
		this.aClass57_Sub2_29.method2368(5890, 0, 768);
		this.aClass57_Sub2_29.method2382(0);
		this.aClass57_Sub2_29.method2362((Class32) null);
		this.aClass57_Sub2_29.method2345(0);
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(IIII)V")
	@Override
	public void method9229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7990 = arg0;
		this.anInt7999 = arg3;
		this.anInt7996 = arg2;
		this.anInt8004 = arg1;
		this.aBoolean598 = this.anInt7990 != 0 || this.anInt8004 != 0 || this.anInt7996 != 0 || this.anInt7999 != 0;
	}

	@OriginalMember(owner = "client!qda", name = "d", descriptor = "()I")
	@Override
	public int method9236() {
		return this.aClass32_Sub1_Sub1_4.anInt3115;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)V")
	@Override
	public void method9238(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass32_Sub1_Sub1_3 = Static605.method8677(this.aClass57_Sub2_29, 0, this.aClass32_Sub1_Sub1_4.anInt3112, this.aClass32_Sub1_Sub1_4.anInt3115, 0);
		this.anInt7997 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method9218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass32_Sub1_Sub1_4.method8430(true);
		this.aClass57_Sub2_29.method2320();
		this.aClass57_Sub2_29.method2372(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean598) {
			@Pc(197) float local197 = (float) arg2 / (float) this.method9231();
			@Pc(204) float local204 = (float) arg3 / (float) this.method9232();
			@Pc(213) float local213 = (float) this.anInt7990 * local197 + (float) arg0;
			@Pc(222) float local222 = (float) this.anInt8004 * local204 + (float) arg1;
			@Pc(231) float local231 = local197 * (float) this.aClass32_Sub1_Sub1_4.anInt3115 + local213;
			@Pc(240) float local240 = (float) this.aClass32_Sub1_Sub1_4.anInt3112 * local204 + local222;
			if (this.aClass32_Sub1_Sub1_3 == null) {
				this.aClass57_Sub2_29.method2362(this.aClass32_Sub1_Sub1_4);
				this.aClass57_Sub2_29.method2382(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass32_Sub1_Sub1_4.aFloat52);
				OpenGL.glVertex2f(local213, local222);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local213, local240);
				OpenGL.glTexCoord2f(this.aClass32_Sub1_Sub1_4.aFloat53, 0.0F);
				OpenGL.glVertex2f(local231, local240);
				OpenGL.glTexCoord2f(this.aClass32_Sub1_Sub1_4.aFloat53, this.aClass32_Sub1_Sub1_4.aFloat52);
				OpenGL.glVertex2f(local231, local222);
				OpenGL.glEnd();
			} else {
				this.method6887(arg4);
				this.aClass32_Sub1_Sub1_3.method8430(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass32_Sub1_Sub1_4.aFloat52);
				OpenGL.glTexCoord2f(0.0F, this.aClass32_Sub1_Sub1_4.aFloat52);
				OpenGL.glVertex2f(local213, local222);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local213, local240);
				OpenGL.glMultiTexCoord2f(33985, this.aClass32_Sub1_Sub1_4.aFloat53, 0.0F);
				OpenGL.glTexCoord2f(this.aClass32_Sub1_Sub1_4.aFloat53, 0.0F);
				OpenGL.glVertex2f(local231, local240);
				OpenGL.glMultiTexCoord2f(33985, this.aClass32_Sub1_Sub1_4.aFloat53, this.aClass32_Sub1_Sub1_4.aFloat52);
				OpenGL.glTexCoord2f(this.aClass32_Sub1_Sub1_4.aFloat53, this.aClass32_Sub1_Sub1_4.aFloat52);
				OpenGL.glVertex2f(local231, local222);
				OpenGL.glEnd();
				this.method6888();
			}
		} else if (this.aClass32_Sub1_Sub1_3 == null) {
			this.aClass57_Sub2_29.method2362(this.aClass32_Sub1_Sub1_4);
			this.aClass57_Sub2_29.method2382(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass32_Sub1_Sub1_4.aFloat52);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass32_Sub1_Sub1_4.aFloat53, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass32_Sub1_Sub1_4.aFloat53, this.aClass32_Sub1_Sub1_4.aFloat52);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method6887(arg4);
			this.aClass32_Sub1_Sub1_3.method8430(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass32_Sub1_Sub1_4.aFloat52);
			OpenGL.glTexCoord2f(0.0F, this.aClass32_Sub1_Sub1_4.aFloat52);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass32_Sub1_Sub1_4.aFloat53, 0.0F);
			OpenGL.glTexCoord2f(this.aClass32_Sub1_Sub1_4.aFloat53, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass32_Sub1_Sub1_4.aFloat53, this.aClass32_Sub1_Sub1_4.aFloat52);
			OpenGL.glTexCoord2f(this.aClass32_Sub1_Sub1_4.aFloat53, this.aClass32_Sub1_Sub1_4.aFloat52);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method6888();
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "([I)V")
	@Override
	public void method9223(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt7999;
		arg0[0] = this.anInt7990;
		arg0[2] = this.anInt7996;
		arg0[1] = this.anInt8004;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIII[III)V")
	private void method6891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass32_Sub1_Sub1_4.method2723(arg3, arg2, arg0, arg4, arg1, arg5);
	}

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "()I")
	@Override
	public int method9232() {
		return this.aClass32_Sub1_Sub1_4.anInt3112 + this.anInt8004 + this.anInt7999;
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method9222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		@Pc(13) int local13 = arg3 + arg1;
		this.aClass32_Sub1_Sub1_4.method8430(false);
		this.aClass57_Sub2_29.method2320();
		this.aClass57_Sub2_29.method2362(this.aClass32_Sub1_Sub1_4);
		this.aClass57_Sub2_29.method2372(arg6);
		this.aClass57_Sub2_29.method2382(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass32_Sub1_Sub1_4.aBoolean256 && !this.aBoolean598) {
			@Pc(364) float local364 = (float) arg3 * this.aClass32_Sub1_Sub1_4.aFloat52 / (float) this.aClass32_Sub1_Sub1_4.anInt3112;
			@Pc(376) float local376 = this.aClass32_Sub1_Sub1_4.aFloat53 * (float) arg2 / (float) this.aClass32_Sub1_Sub1_4.anInt3115;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local364);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local13);
			OpenGL.glTexCoord2f(local376, 0.0F);
			OpenGL.glVertex2i(local9, local13);
			OpenGL.glTexCoord2f(local376, local364);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt7990, (float) this.anInt8004, 0.0F);
		@Pc(74) int local74 = this.method9231();
		@Pc(77) int local77 = this.method9232();
		@Pc(83) int local83 = arg1 + this.aClass32_Sub1_Sub1_4.anInt3112;
		OpenGL.glBegin(7);
		@Pc(87) int local87 = arg1;
		@Pc(97) int local97;
		while (local13 >= local83) {
			local97 = this.aClass32_Sub1_Sub1_4.anInt3115 + arg0;
			@Pc(99) int local99 = arg0;
			while (local9 >= local97) {
				OpenGL.glTexCoord2f(0.0F, this.aClass32_Sub1_Sub1_4.aFloat52);
				OpenGL.glVertex2i(local99, local87);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local99, local83);
				OpenGL.glTexCoord2f(this.aClass32_Sub1_Sub1_4.aFloat53, 0.0F);
				OpenGL.glVertex2i(local97, local83);
				OpenGL.glTexCoord2f(this.aClass32_Sub1_Sub1_4.aFloat53, this.aClass32_Sub1_Sub1_4.aFloat52);
				OpenGL.glVertex2i(local97, local87);
				local97 += local74;
				local99 += local74;
			}
			if (local99 < local9) {
				@Pc(165) float local165 = this.aClass32_Sub1_Sub1_4.aFloat53 * (float) (local9 - local99) / (float) this.aClass32_Sub1_Sub1_4.anInt3115;
				OpenGL.glTexCoord2f(0.0F, this.aClass32_Sub1_Sub1_4.aFloat52);
				OpenGL.glVertex2i(local99, local87);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local99, local83);
				OpenGL.glTexCoord2f(local165, 0.0F);
				OpenGL.glVertex2i(local9, local83);
				OpenGL.glTexCoord2f(local165, this.aClass32_Sub1_Sub1_4.aFloat52);
				OpenGL.glVertex2i(local9, local87);
			}
			local87 += local77;
			local83 += local77;
		}
		if (local87 < local13) {
			@Pc(238) float local238 = (float) (local87 + this.aClass32_Sub1_Sub1_4.anInt3112 - local13) * this.aClass32_Sub1_Sub1_4.aFloat52 / (float) this.aClass32_Sub1_Sub1_4.anInt3112;
			@Pc(244) int local244 = this.aClass32_Sub1_Sub1_4.anInt3115 + arg0;
			local97 = arg0;
			while (local244 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass32_Sub1_Sub1_4.aFloat52);
				OpenGL.glVertex2i(local97, local87);
				OpenGL.glTexCoord2f(0.0F, local238);
				OpenGL.glVertex2i(local97, local13);
				OpenGL.glTexCoord2f(this.aClass32_Sub1_Sub1_4.aFloat53, local238);
				OpenGL.glVertex2i(local244, local13);
				OpenGL.glTexCoord2f(this.aClass32_Sub1_Sub1_4.aFloat53, this.aClass32_Sub1_Sub1_4.aFloat52);
				OpenGL.glVertex2i(local244, local87);
				local97 += local74;
				local244 += local74;
			}
			if (local9 > local97) {
				@Pc(321) float local321 = (float) (local9 - local97) * this.aClass32_Sub1_Sub1_4.aFloat53 / (float) this.aClass32_Sub1_Sub1_4.anInt3115;
				OpenGL.glTexCoord2f(0.0F, this.aClass32_Sub1_Sub1_4.aFloat52);
				OpenGL.glVertex2i(local97, local87);
				OpenGL.glTexCoord2f(0.0F, local238);
				OpenGL.glVertex2i(local97, local13);
				OpenGL.glTexCoord2f(local321, local238);
				OpenGL.glVertex2i(local9, local13);
				OpenGL.glTexCoord2f(local321, this.aClass32_Sub1_Sub1_4.aFloat52);
				OpenGL.glVertex2i(local9, local87);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method9230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass32_Sub1_Sub1_4.method8430(false);
		this.aClass57_Sub2_29.method2320();
		this.aClass57_Sub2_29.method2372(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt8004;
		@Pc(42) int local42 = arg0 + this.anInt7990;
		if (this.aClass32_Sub1_Sub1_3 == null) {
			this.aClass57_Sub2_29.method2362(this.aClass32_Sub1_Sub1_4);
			this.aClass57_Sub2_29.method2382(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass32_Sub1_Sub1_4.aFloat52);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, this.aClass32_Sub1_Sub1_4.anInt3112 + local37);
			OpenGL.glTexCoord2f(this.aClass32_Sub1_Sub1_4.aFloat53, 0.0F);
			OpenGL.glVertex2i(local42 + this.aClass32_Sub1_Sub1_4.anInt3115, this.aClass32_Sub1_Sub1_4.anInt3112 + local37);
			OpenGL.glTexCoord2f(this.aClass32_Sub1_Sub1_4.aFloat53, this.aClass32_Sub1_Sub1_4.aFloat52);
			OpenGL.glVertex2i(local42 + this.aClass32_Sub1_Sub1_4.anInt3115, local37);
			OpenGL.glEnd();
			return;
		}
		this.method6887(arg2);
		this.aClass32_Sub1_Sub1_3.method8430(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass32_Sub1_Sub1_4.aFloat52);
		OpenGL.glTexCoord2f(0.0F, this.aClass32_Sub1_Sub1_4.aFloat52);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, this.aClass32_Sub1_Sub1_4.anInt3112 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass32_Sub1_Sub1_4.aFloat53, 0.0F);
		OpenGL.glTexCoord2f(this.aClass32_Sub1_Sub1_4.aFloat53, 0.0F);
		OpenGL.glVertex2i(local42 + this.aClass32_Sub1_Sub1_4.anInt3115, local37 - -this.aClass32_Sub1_Sub1_4.anInt3112);
		OpenGL.glMultiTexCoord2f(33985, this.aClass32_Sub1_Sub1_4.aFloat53, this.aClass32_Sub1_Sub1_4.aFloat52);
		OpenGL.glTexCoord2f(this.aClass32_Sub1_Sub1_4.aFloat53, this.aClass32_Sub1_Sub1_4.aFloat52);
		OpenGL.glVertex2i(local42 + this.aClass32_Sub1_Sub1_4.anInt3115, local37);
		OpenGL.glEnd();
		this.method6888();
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method9224(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean598) {
			local6 = (float) this.method9231();
			local10 = (float) this.method9232();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(30) float local30 = (arg4 - arg0) / local10;
			@Pc(37) float local37 = (arg5 - arg1) / local10;
			@Pc(43) float local43 = (float) this.anInt8004 * local30;
			@Pc(49) float local49 = local37 * (float) this.anInt8004;
			@Pc(55) float local55 = (float) this.anInt7990 * local17;
			@Pc(61) float local61 = (float) this.anInt7990 * local23;
			@Pc(68) float local68 = -local17 * (float) this.anInt7996;
			@Pc(75) float local75 = -local23 * (float) this.anInt7996;
			@Pc(82) float local82 = (float) this.anInt7999 * -local30;
			arg2 = local43 + arg2 + local68;
			arg0 = local43 + arg0 + local55;
			arg1 = local61 + arg1 + local49;
			arg3 = arg3 + local75 + local49;
			@Pc(113) float local113 = (float) this.anInt7999 * -local37;
			arg4 = local55 + arg4 + local82;
			arg5 = local61 + arg5 + local113;
		}
		local6 = arg4 + arg2 - arg0;
		local10 = arg3 + arg5 - arg1;
		this.aClass32_Sub1_Sub1_4.method8430(true);
		this.aClass57_Sub2_29.method2320();
		this.aClass57_Sub2_29.method2362(this.aClass32_Sub1_Sub1_4);
		this.aClass57_Sub2_29.method2372(1);
		this.aClass57_Sub2_29.method2382(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass32_Sub1_Sub1_4.aFloat52);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass32_Sub1_Sub1_4.aFloat53, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass32_Sub1_Sub1_4.aFloat53, this.aClass32_Sub1_Sub1_4.aFloat52);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method9233(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class32_Sub1_Sub1 local7 = ((Class1_Sub2) arg6).aClass32_Sub1_Sub1_5;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(32) float local32;
		if (this.aBoolean598) {
			local14 = (float) this.method9231();
			local18 = (float) this.method9232();
			local25 = (arg2 - arg0) / local14;
			local32 = (arg3 - arg1) / local14;
			@Pc(39) float local39 = (arg4 - arg0) / local18;
			@Pc(45) float local45 = (arg5 - arg1) / local18;
			@Pc(51) float local51 = (float) this.anInt8004 * local39;
			@Pc(57) float local57 = local45 * (float) this.anInt8004;
			@Pc(63) float local63 = (float) this.anInt7990 * local25;
			@Pc(69) float local69 = local32 * (float) this.anInt7990;
			@Pc(76) float local76 = (float) this.anInt7996 * -local25;
			@Pc(83) float local83 = (float) this.anInt7996 * -local32;
			@Pc(90) float local90 = -local39 * (float) this.anInt7999;
			arg4 = arg4 + local63 + local90;
			@Pc(103) float local103 = (float) this.anInt7999 * -local45;
			arg1 = local57 + local69 + arg1;
			arg2 = local76 + arg2 + local51;
			arg3 = local57 + local83 + arg3;
			arg0 = local51 + local63 + arg0;
			arg5 = local103 + arg5 + local69;
		}
		local14 = arg2 + arg4 - arg0;
		local18 = arg5 + arg3 - arg1;
		this.aClass32_Sub1_Sub1_4.method8430(true);
		this.aClass57_Sub2_29.method2320();
		this.aClass57_Sub2_29.method2362(this.aClass32_Sub1_Sub1_4);
		this.aClass57_Sub2_29.method2382(1);
		this.aClass57_Sub2_29.method2345(1);
		this.aClass57_Sub2_29.method2362(local7);
		this.aClass57_Sub2_29.method2313(8448, 7681);
		this.aClass57_Sub2_29.method2368(34168, 0, 768);
		this.aClass57_Sub2_29.method2372(1);
		local25 = local7.aFloat53 / (float) local7.anInt3115;
		local32 = local7.aFloat52 / (float) local7.anInt3112;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass32_Sub1_Sub1_4.aFloat52);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg0) * local25, local7.aFloat52 - ((float) -arg8 + arg1) * local32);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * local25, local7.aFloat52 - (arg5 - (float) arg8) * local32);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass32_Sub1_Sub1_4.aFloat53, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + local14), local7.aFloat52 - (local18 - (float) arg8) * local32);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass32_Sub1_Sub1_4.aFloat53, this.aClass32_Sub1_Sub1_4.aFloat52);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg2), local7.aFloat52 - (arg3 - (float) arg8) * local32);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass57_Sub2_29.method2368(5890, 0, 768);
		this.aClass57_Sub2_29.method2382(0);
		this.aClass57_Sub2_29.method2362((Class32) null);
		this.aClass57_Sub2_29.method2345(0);
	}
}
