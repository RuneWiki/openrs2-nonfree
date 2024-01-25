import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!ri", name = "r", descriptor = "Lclient!hf;")
	private Class62_Sub2_Sub1 aClass62_Sub2_Sub1_4;

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
	private int anInt6207 = 0;

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
	private int anInt6219 = 0;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
	private int anInt6211 = 0;

	@OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
	private int anInt6217 = 0;

	@OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
	private int anInt6225 = 0;

	@OriginalMember(owner = "client!ri", name = "E", descriptor = "Z")
	private boolean aBoolean463 = false;

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "Lclient!bt;")
	private final Class30_Sub1 aClass30_Sub1_38;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "Lclient!hf;")
	private final Class62_Sub2_Sub1 aClass62_Sub2_Sub1_3;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!bt;IIII)V")
	public Class2_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass30_Sub1_38 = arg0;
		this.aClass62_Sub2_Sub1_3 = Static452.method6177(arg4, arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!bt;II[III)V")
	public Class2_Sub2(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass30_Sub1_38 = arg0;
		this.aClass62_Sub2_Sub1_3 = Static91.method1812(arg0, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "(IIII)V")
	@Override
	public void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6211 = arg3;
		this.anInt6217 = arg1;
		this.anInt6207 = arg2;
		this.anInt6219 = arg0;
		this.aBoolean463 = this.anInt6219 != 0 || this.anInt6217 != 0 || this.anInt6207 != 0 || this.anInt6211 != 0;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)V")
	private void method5113(@OriginalArg(1) int arg0) {
		this.aClass30_Sub1_38.method726(1);
		this.aClass30_Sub1_38.method730(this.aClass62_Sub2_Sub1_3);
		this.aClass30_Sub1_38.method724(this.aClass30_Sub1_38.method720(arg0), 7681);
		this.aClass30_Sub1_38.method752(34167, 768, 1);
		this.aClass30_Sub1_38.method690(34168, 0);
		this.aClass30_Sub1_38.method726(0);
		this.aClass30_Sub1_38.method730(this.aClass62_Sub2_Sub1_4);
		this.aClass30_Sub1_38.method724(34479, 7681);
		this.aClass30_Sub1_38.method752(34166, 768, 1);
		if (this.anInt6225 == 0) {
			this.aClass30_Sub1_38.method745(0.5F, 0.0F, 0.5F, 1.0F);
		} else if (this.anInt6225 == 1) {
			this.aClass30_Sub1_38.method745(0.5F, 0.0F, 1.0F, 0.5F);
			return;
		} else if (this.anInt6225 == 2) {
			this.aClass30_Sub1_38.method745(1.0F, 0.0F, 0.5F, 0.5F);
			return;
		} else if (this.anInt6225 == 3) {
			this.aClass30_Sub1_38.method745(128.5F, 0.0F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!ri", name = "XA", descriptor = "(IIIIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass62_Sub2_Sub1_3.method5349(true);
		this.aClass30_Sub1_38.method727();
		this.aClass30_Sub1_38.method703(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean463) {
			@Pc(42) float local42 = (float) arg2 / (float) this.d();
			@Pc(49) float local49 = (float) arg3 / (float) this.ga();
			@Pc(58) float local58 = (float) arg0 + (float) this.anInt6219 * local42;
			@Pc(67) float local67 = local49 * (float) this.anInt6217 + (float) arg1;
			@Pc(76) float local76 = local58 + local42 * (float) this.aClass62_Sub2_Sub1_3.anInt3025;
			@Pc(85) float local85 = local49 * (float) this.aClass62_Sub2_Sub1_3.anInt3028 + local67;
			if (this.aClass62_Sub2_Sub1_4 == null) {
				this.aClass30_Sub1_38.method730(this.aClass62_Sub2_Sub1_3);
				this.aClass30_Sub1_38.method713(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass62_Sub2_Sub1_3.aFloat60);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glTexCoord2f(this.aClass62_Sub2_Sub1_3.aFloat61, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glTexCoord2f(this.aClass62_Sub2_Sub1_3.aFloat61, this.aClass62_Sub2_Sub1_3.aFloat60);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
			} else {
				this.method5113(arg4);
				this.aClass62_Sub2_Sub1_4.method5349(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass62_Sub2_Sub1_3.aFloat60);
				OpenGL.glTexCoord2f(0.0F, this.aClass62_Sub2_Sub1_3.aFloat60);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass62_Sub2_Sub1_3.aFloat61, 0.0F);
				OpenGL.glTexCoord2f(this.aClass62_Sub2_Sub1_3.aFloat61, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass62_Sub2_Sub1_3.aFloat61, this.aClass62_Sub2_Sub1_3.aFloat60);
				OpenGL.glTexCoord2f(this.aClass62_Sub2_Sub1_3.aFloat61, this.aClass62_Sub2_Sub1_3.aFloat60);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
				this.method5116();
			}
		} else if (this.aClass62_Sub2_Sub1_4 == null) {
			this.aClass30_Sub1_38.method730(this.aClass62_Sub2_Sub1_3);
			this.aClass30_Sub1_38.method713(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass62_Sub2_Sub1_3.aFloat60);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass62_Sub2_Sub1_3.aFloat61, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass62_Sub2_Sub1_3.aFloat61, this.aClass62_Sub2_Sub1_3.aFloat60);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method5113(arg4);
			this.aClass62_Sub2_Sub1_4.method5349(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass62_Sub2_Sub1_3.aFloat60);
			OpenGL.glTexCoord2f(0.0F, this.aClass62_Sub2_Sub1_3.aFloat60);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass62_Sub2_Sub1_3.aFloat61, 0.0F);
			OpenGL.glTexCoord2f(this.aClass62_Sub2_Sub1_3.aFloat61, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass62_Sub2_Sub1_3.aFloat61, this.aClass62_Sub2_Sub1_3.aFloat60);
			OpenGL.glTexCoord2f(this.aClass62_Sub2_Sub1_3.aFloat61, this.aClass62_Sub2_Sub1_3.aFloat60);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method5116();
		}
	}

	@OriginalMember(owner = "client!ri", name = "J", descriptor = "(III)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass62_Sub2_Sub1_4 = Static452.method6177(this.aClass62_Sub2_Sub1_3.anInt3028, arg1, this.aClass62_Sub2_Sub1_3.anInt3025, this.aClass30_Sub1_38, arg0);
		this.anInt6225 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILclient!i;II)V")
	@Override
	public void method5916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class74 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class74_Sub2 local6 = (Class74_Sub2) arg2;
		@Pc(9) Class62_Sub2_Sub1 local9 = local6.aClass62_Sub2_Sub1_5;
		this.aClass62_Sub2_Sub1_3.method5349(false);
		this.aClass30_Sub1_38.method727();
		this.aClass30_Sub1_38.method730(this.aClass62_Sub2_Sub1_3);
		this.aClass30_Sub1_38.method713(1);
		this.aClass30_Sub1_38.method726(1);
		this.aClass30_Sub1_38.method730(local9);
		this.aClass30_Sub1_38.method724(7681, 8448);
		this.aClass30_Sub1_38.method752(34168, 768, 0);
		this.aClass30_Sub1_38.method703(1);
		@Pc(62) int local62 = arg0 + this.anInt6219;
		@Pc(67) int local67 = arg1 + this.anInt6217;
		@Pc(74) int local74 = local62 + this.aClass62_Sub2_Sub1_3.anInt3025;
		@Pc(81) int local81 = local67 + this.aClass62_Sub2_Sub1_3.anInt3028;
		@Pc(88) float local88 = local9.aFloat61 / (float) local9.anInt3025;
		@Pc(95) float local95 = local9.aFloat60 / (float) local9.anInt3028;
		@Pc(102) float local102 = (float) (local62 - arg3) * local88;
		@Pc(110) float local110 = local88 * (float) (local74 - arg3);
		@Pc(121) float local121 = local9.aFloat60 - (float) (local67 - arg4) * local95;
		@Pc(132) float local132 = local9.aFloat60 - (float) (local81 - arg4) * local95;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass62_Sub2_Sub1_3.aFloat60);
		OpenGL.glMultiTexCoord2f(33985, local102, local121);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local132);
		OpenGL.glVertex2i(local62, this.aClass62_Sub2_Sub1_3.anInt3028 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass62_Sub2_Sub1_3.aFloat61, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local132);
		OpenGL.glVertex2i(this.aClass62_Sub2_Sub1_3.anInt3025 + local62, local67 + this.aClass62_Sub2_Sub1_3.anInt3028);
		OpenGL.glMultiTexCoord2f(33984, this.aClass62_Sub2_Sub1_3.aFloat61, this.aClass62_Sub2_Sub1_3.aFloat60);
		OpenGL.glMultiTexCoord2f(33985, local110, local121);
		OpenGL.glVertex2i(this.aClass62_Sub2_Sub1_3.anInt3025 + local62, local67);
		OpenGL.glEnd();
		this.aClass30_Sub1_38.method752(5890, 768, 0);
		this.aClass30_Sub1_38.method713(0);
		this.aClass30_Sub1_38.method730(null);
		this.aClass30_Sub1_38.method726(0);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(FFFFFFLclient!i;II)V")
	@Override
	protected void method5913(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class74 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class62_Sub2_Sub1 local7 = ((Class74_Sub2) arg6).aClass62_Sub2_Sub1_5;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(32) float local32;
		if (this.aBoolean463) {
			local14 = this.d();
			local18 = this.ga();
			local25 = (arg2 - arg0) / local14;
			local32 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(45) float local45 = (arg5 - arg1) / local18;
			@Pc(51) float local51 = (float) this.anInt6217 * local38;
			@Pc(57) float local57 = local45 * (float) this.anInt6217;
			@Pc(63) float local63 = local25 * (float) this.anInt6219;
			@Pc(69) float local69 = (float) this.anInt6219 * local32;
			@Pc(76) float local76 = -local25 * (float) this.anInt6207;
			@Pc(83) float local83 = -local32 * (float) this.anInt6207;
			@Pc(90) float local90 = -local38 * (float) this.anInt6211;
			@Pc(97) float local97 = -local45 * (float) this.anInt6211;
			arg0 = local51 + local63 + arg0;
			arg3 = local83 + arg3 + local57;
			arg2 = arg2 + local76 + local51;
			arg1 = local57 + arg1 + local69;
			arg4 = local63 + arg4 + local90;
			arg5 = local97 + local69 + arg5;
		}
		local14 = arg2 + arg4 - arg0;
		local18 = arg5 + arg3 - arg1;
		this.aClass62_Sub2_Sub1_3.method5349(true);
		this.aClass30_Sub1_38.method727();
		this.aClass30_Sub1_38.method730(this.aClass62_Sub2_Sub1_3);
		this.aClass30_Sub1_38.method713(1);
		this.aClass30_Sub1_38.method726(1);
		this.aClass30_Sub1_38.method730(local7);
		this.aClass30_Sub1_38.method724(7681, 8448);
		this.aClass30_Sub1_38.method752(34168, 768, 0);
		this.aClass30_Sub1_38.method703(1);
		local25 = local7.aFloat61 / (float) local7.anInt3025;
		local32 = local7.aFloat60 / (float) local7.anInt3028;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass62_Sub2_Sub1_3.aFloat60);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg0 - (float) arg7), local7.aFloat60 - (arg1 - (float) arg8) * local32);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg4) * local25, local7.aFloat60 - ((float) -arg8 + arg5) * local32);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass62_Sub2_Sub1_3.aFloat61, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (local14 - (float) arg7) * local25, local7.aFloat60 - (local18 - (float) arg8) * local32);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass62_Sub2_Sub1_3.aFloat61, this.aClass62_Sub2_Sub1_3.aFloat60);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg2 - (float) arg7), local7.aFloat60 - ((float) -arg8 + arg3) * local32);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass30_Sub1_38.method752(5890, 768, 0);
		this.aClass30_Sub1_38.method713(0);
		this.aClass30_Sub1_38.method730(null);
		this.aClass30_Sub1_38.method726(0);
	}

	@OriginalMember(owner = "client!ri", name = "D", descriptor = "(IIIIII)V")
	@Override
	public void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass62_Sub2_Sub1_3.method2684(arg3, arg5, arg2, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!ri", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		return this.aClass62_Sub2_Sub1_3.anInt3025;
	}

	@OriginalMember(owner = "client!ri", name = "V", descriptor = "()I")
	@Override
	public int V() {
		return this.aClass62_Sub2_Sub1_3.anInt3028;
	}

	@OriginalMember(owner = "client!ri", name = "ga", descriptor = "()I")
	@Override
	public int ga() {
		return this.anInt6217 + this.aClass62_Sub2_Sub1_3.anInt3028 + this.anInt6211;
	}

	@OriginalMember(owner = "client!ri", name = "E", descriptor = "(IIIII)V")
	@Override
	public void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass62_Sub2_Sub1_3.method5349(false);
		this.aClass30_Sub1_38.method727();
		this.aClass30_Sub1_38.method703(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt6217;
		@Pc(42) int local42 = arg0 + this.anInt6219;
		if (this.aClass62_Sub2_Sub1_4 == null) {
			this.aClass30_Sub1_38.method730(this.aClass62_Sub2_Sub1_3);
			this.aClass30_Sub1_38.method713(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass62_Sub2_Sub1_3.aFloat60);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, local37 + this.aClass62_Sub2_Sub1_3.anInt3028);
			OpenGL.glTexCoord2f(this.aClass62_Sub2_Sub1_3.aFloat61, 0.0F);
			OpenGL.glVertex2i(local42 + this.aClass62_Sub2_Sub1_3.anInt3025, local37 - -this.aClass62_Sub2_Sub1_3.anInt3028);
			OpenGL.glTexCoord2f(this.aClass62_Sub2_Sub1_3.aFloat61, this.aClass62_Sub2_Sub1_3.aFloat60);
			OpenGL.glVertex2i(this.aClass62_Sub2_Sub1_3.anInt3025 + local42, local37);
			OpenGL.glEnd();
			return;
		}
		this.method5113(arg2);
		this.aClass62_Sub2_Sub1_4.method5349(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass62_Sub2_Sub1_3.aFloat60);
		OpenGL.glTexCoord2f(0.0F, this.aClass62_Sub2_Sub1_3.aFloat60);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, local37 + this.aClass62_Sub2_Sub1_3.anInt3028);
		OpenGL.glMultiTexCoord2f(33985, this.aClass62_Sub2_Sub1_3.aFloat61, 0.0F);
		OpenGL.glTexCoord2f(this.aClass62_Sub2_Sub1_3.aFloat61, 0.0F);
		OpenGL.glVertex2i(local42 + this.aClass62_Sub2_Sub1_3.anInt3025, local37 - -this.aClass62_Sub2_Sub1_3.anInt3028);
		OpenGL.glMultiTexCoord2f(33985, this.aClass62_Sub2_Sub1_3.aFloat61, this.aClass62_Sub2_Sub1_3.aFloat60);
		OpenGL.glTexCoord2f(this.aClass62_Sub2_Sub1_3.aFloat61, this.aClass62_Sub2_Sub1_3.aFloat60);
		OpenGL.glVertex2i(local42 + this.aClass62_Sub2_Sub1_3.anInt3025, local37);
		OpenGL.glEnd();
		this.method5116();
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V")
	private void method5116() {
		this.aClass30_Sub1_38.method726(1);
		this.aClass30_Sub1_38.method730(null);
		this.aClass30_Sub1_38.method724(8448, 8448);
		this.aClass30_Sub1_38.method752(34168, 768, 1);
		this.aClass30_Sub1_38.method690(5890, 0);
		this.aClass30_Sub1_38.method726(0);
		this.aClass30_Sub1_38.method752(34168, 768, 1);
	}

	@OriginalMember(owner = "client!ri", name = "ta", descriptor = "(FFFFFFIII)V")
	@Override
	protected void ta(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean463) {
			local10 = this.d();
			local14 = this.ga();
			@Pc(21) float local21 = (arg2 - arg0) / local10;
			@Pc(27) float local27 = (arg3 - arg1) / local10;
			@Pc(34) float local34 = (arg4 - arg0) / local14;
			@Pc(41) float local41 = (arg5 - arg1) / local14;
			@Pc(47) float local47 = local34 * (float) this.anInt6217;
			@Pc(53) float local53 = local41 * (float) this.anInt6217;
			@Pc(59) float local59 = local21 * (float) this.anInt6219;
			@Pc(65) float local65 = local27 * (float) this.anInt6219;
			@Pc(72) float local72 = (float) this.anInt6207 * -local21;
			@Pc(79) float local79 = (float) this.anInt6207 * -local27;
			@Pc(86) float local86 = -local34 * (float) this.anInt6211;
			arg0 = arg0 + local59 + local47;
			@Pc(99) float local99 = -local41 * (float) this.anInt6211;
			arg4 = local86 + arg4 + local59;
			arg1 = local53 + arg1 + local65;
			arg3 = local53 + local79 + arg3;
			arg2 = local47 + arg2 + local72;
			arg5 = arg5 + local65 + local99;
		}
		local10 = arg4 + arg2 - arg0;
		local14 = arg5 + arg3 - arg1;
		this.aClass62_Sub2_Sub1_3.method5349(true);
		this.aClass30_Sub1_38.method727();
		this.aClass30_Sub1_38.method730(this.aClass62_Sub2_Sub1_3);
		this.aClass30_Sub1_38.method703(arg8);
		this.aClass30_Sub1_38.method713(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass62_Sub2_Sub1_3.aFloat60);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass62_Sub2_Sub1_3.aFloat61, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass62_Sub2_Sub1_3.aFloat61, this.aClass62_Sub2_Sub1_3.aFloat60);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "()I")
	@Override
	public int d() {
		return this.anInt6219 + this.aClass62_Sub2_Sub1_3.anInt3025 + this.anInt6207;
	}

	@OriginalMember(owner = "client!ri", name = "PA", descriptor = "(IIIIIII)V")
	@Override
	public void PA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg0 + arg2;
		this.aClass62_Sub2_Sub1_3.method5349(false);
		@Pc(18) int local18 = arg3 + arg1;
		this.aClass30_Sub1_38.method727();
		this.aClass30_Sub1_38.method730(this.aClass62_Sub2_Sub1_3);
		this.aClass30_Sub1_38.method703(arg6);
		this.aClass30_Sub1_38.method713(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass62_Sub2_Sub1_3.aBoolean198 && !this.aBoolean463) {
			@Pc(72) float local72 = (float) arg3 * this.aClass62_Sub2_Sub1_3.aFloat60 / (float) this.aClass62_Sub2_Sub1_3.anInt3028;
			@Pc(84) float local84 = this.aClass62_Sub2_Sub1_3.aFloat61 * (float) arg2 / (float) this.aClass62_Sub2_Sub1_3.anInt3025;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local72);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local18);
			OpenGL.glTexCoord2f(local84, 0.0F);
			OpenGL.glVertex2i(local9, local18);
			OpenGL.glTexCoord2f(local84, local72);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt6219, (float) this.anInt6217, 0.0F);
		@Pc(124) int local124 = this.d();
		@Pc(127) int local127 = this.ga();
		@Pc(134) int local134 = arg1 + this.aClass62_Sub2_Sub1_3.anInt3028;
		OpenGL.glBegin(7);
		@Pc(138) int local138 = arg1;
		@Pc(146) int local146;
		while (local134 <= local18) {
			local146 = this.aClass62_Sub2_Sub1_3.anInt3025 + arg0;
			@Pc(148) int local148 = arg0;
			while (local9 >= local146) {
				OpenGL.glTexCoord2f(0.0F, this.aClass62_Sub2_Sub1_3.aFloat60);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(this.aClass62_Sub2_Sub1_3.aFloat61, 0.0F);
				OpenGL.glVertex2i(local146, local134);
				OpenGL.glTexCoord2f(this.aClass62_Sub2_Sub1_3.aFloat61, this.aClass62_Sub2_Sub1_3.aFloat60);
				OpenGL.glVertex2i(local146, local138);
				local148 += local124;
				local146 += local124;
			}
			if (local148 < local9) {
				@Pc(211) float local211 = this.aClass62_Sub2_Sub1_3.aFloat61 * (float) (local9 - local148) / (float) this.aClass62_Sub2_Sub1_3.anInt3025;
				OpenGL.glTexCoord2f(0.0F, this.aClass62_Sub2_Sub1_3.aFloat60);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(local211, 0.0F);
				OpenGL.glVertex2i(local9, local134);
				OpenGL.glTexCoord2f(local211, this.aClass62_Sub2_Sub1_3.aFloat60);
				OpenGL.glVertex2i(local9, local138);
			}
			local138 += local127;
			local134 += local127;
		}
		if (local18 > local138) {
			@Pc(272) float local272 = (float) (this.aClass62_Sub2_Sub1_3.anInt3028 + local138 - local18) * this.aClass62_Sub2_Sub1_3.aFloat60 / (float) this.aClass62_Sub2_Sub1_3.anInt3028;
			@Pc(279) int local279 = arg0 + this.aClass62_Sub2_Sub1_3.anInt3025;
			local146 = arg0;
			while (local279 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass62_Sub2_Sub1_3.aFloat60);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local272);
				OpenGL.glVertex2i(local146, local18);
				OpenGL.glTexCoord2f(this.aClass62_Sub2_Sub1_3.aFloat61, local272);
				OpenGL.glVertex2i(local279, local18);
				OpenGL.glTexCoord2f(this.aClass62_Sub2_Sub1_3.aFloat61, this.aClass62_Sub2_Sub1_3.aFloat60);
				OpenGL.glVertex2i(local279, local138);
				local146 += local124;
				local279 += local124;
			}
			if (local146 < local9) {
				@Pc(347) float local347 = this.aClass62_Sub2_Sub1_3.aFloat61 * (float) (local9 - local146) / (float) this.aClass62_Sub2_Sub1_3.anInt3025;
				OpenGL.glTexCoord2f(0.0F, this.aClass62_Sub2_Sub1_3.aFloat60);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local272);
				OpenGL.glVertex2i(local146, local18);
				OpenGL.glTexCoord2f(local347, local272);
				OpenGL.glVertex2i(local9, local18);
				OpenGL.glTexCoord2f(local347, this.aClass62_Sub2_Sub1_3.aFloat60);
				OpenGL.glVertex2i(local9, local138);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}
}
