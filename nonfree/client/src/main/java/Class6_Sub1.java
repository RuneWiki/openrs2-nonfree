import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!aea", name = "k", descriptor = "Lclient!fu;")
	private Class10_Sub2_Sub1 aClass10_Sub2_Sub1_2;

	@OriginalMember(owner = "client!aea", name = "h", descriptor = "I")
	private int anInt114 = 0;

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "Z")
	private boolean aBoolean7 = false;

	@OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
	private int anInt112 = 0;

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "I")
	private int anInt109 = 0;

	@OriginalMember(owner = "client!aea", name = "i", descriptor = "I")
	private int anInt115 = 0;

	@OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
	private int anInt116 = 0;

	@OriginalMember(owner = "client!aea", name = "t", descriptor = "Lclient!lf;")
	private final Class95_Sub3 aClass95_Sub3_1;

	@OriginalMember(owner = "client!aea", name = "F", descriptor = "Lclient!fu;")
	private final Class10_Sub2_Sub1 aClass10_Sub2_Sub1_3;

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lclient!lf;IIZ)V")
	public Class6_Sub1(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass95_Sub3_1 = arg0;
		this.aClass10_Sub2_Sub1_3 = Static61.method1132(arg2, arg3 ? 6408 : 6407, arg1, arg0);
	}

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lclient!lf;IIII)V")
	public Class6_Sub1(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass95_Sub3_1 = arg0;
		this.aClass10_Sub2_Sub1_3 = Static321.method8421(arg3, arg0, arg1, arg2, arg4);
	}

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lclient!lf;II[III)V")
	public Class6_Sub1(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass95_Sub3_1 = arg0;
		this.aClass10_Sub2_Sub1_3 = Static166.method2622(arg0, arg5, arg2, arg3, arg1, arg4);
	}

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "()I")
	@Override
	public int method5134() {
		return this.anInt114 + this.aClass10_Sub2_Sub1_3.anInt3361 + this.anInt115;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass95_Sub3_1.aBoolean368) {
			this.aClass10_Sub2_Sub1_3.method2855(arg2, arg5, arg1, arg0, arg3, arg4);
			return;
		}
		@Pc(13) int[] local13 = this.aClass95_Sub3_1.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method170(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method5124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass10_Sub2_Sub1_3.method6097(true);
		this.aClass95_Sub3_1.method4867();
		this.aClass95_Sub3_1.method4833(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean7) {
			@Pc(190) float local190 = (float) arg2 / (float) this.method5130();
			@Pc(197) float local197 = (float) arg3 / (float) this.method5134();
			@Pc(206) float local206 = local190 * (float) this.anInt116 + (float) arg0;
			@Pc(215) float local215 = (float) arg1 + (float) this.anInt115 * local197;
			@Pc(224) float local224 = local190 * (float) this.aClass10_Sub2_Sub1_3.anInt3366 + local206;
			@Pc(233) float local233 = local215 + local197 * (float) this.aClass10_Sub2_Sub1_3.anInt3361;
			if (this.aClass10_Sub2_Sub1_2 == null) {
				this.aClass95_Sub3_1.method4864(this.aClass10_Sub2_Sub1_3);
				this.aClass95_Sub3_1.method4870(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub2_Sub1_3.aFloat59);
				OpenGL.glVertex2f(local206, local215);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local206, local233);
				OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_3.aFloat58, 0.0F);
				OpenGL.glVertex2f(local224, local233);
				OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_3.aFloat58, this.aClass10_Sub2_Sub1_3.aFloat59);
				OpenGL.glVertex2f(local224, local215);
				OpenGL.glEnd();
			} else {
				this.method171(arg4);
				this.aClass10_Sub2_Sub1_2.method6097(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass10_Sub2_Sub1_3.aFloat59);
				OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub2_Sub1_3.aFloat59);
				OpenGL.glVertex2f(local206, local215);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local206, local233);
				OpenGL.glMultiTexCoord2f(33985, this.aClass10_Sub2_Sub1_3.aFloat58, 0.0F);
				OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_3.aFloat58, 0.0F);
				OpenGL.glVertex2f(local224, local233);
				OpenGL.glMultiTexCoord2f(33985, this.aClass10_Sub2_Sub1_3.aFloat58, this.aClass10_Sub2_Sub1_3.aFloat59);
				OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_3.aFloat58, this.aClass10_Sub2_Sub1_3.aFloat59);
				OpenGL.glVertex2f(local224, local215);
				OpenGL.glEnd();
				this.method176();
			}
		} else if (this.aClass10_Sub2_Sub1_2 == null) {
			this.aClass95_Sub3_1.method4864(this.aClass10_Sub2_Sub1_3);
			this.aClass95_Sub3_1.method4870(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub2_Sub1_3.aFloat59);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_3.aFloat58, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_3.aFloat58, this.aClass10_Sub2_Sub1_3.aFloat59);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method171(arg4);
			this.aClass10_Sub2_Sub1_2.method6097(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass10_Sub2_Sub1_3.aFloat59);
			OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub2_Sub1_3.aFloat59);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass10_Sub2_Sub1_3.aFloat58, 0.0F);
			OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_3.aFloat58, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass10_Sub2_Sub1_3.aFloat58, this.aClass10_Sub2_Sub1_3.aFloat59);
			OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_3.aFloat58, this.aClass10_Sub2_Sub1_3.aFloat59);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method176();
		}
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "()I")
	@Override
	public int method5130() {
		return this.anInt116 + this.aClass10_Sub2_Sub1_3.anInt3366 + this.anInt112;
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method5137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg0 + arg2;
		this.aClass10_Sub2_Sub1_3.method6097(false);
		@Pc(20) int local20 = arg1 + arg3;
		this.aClass95_Sub3_1.method4867();
		this.aClass95_Sub3_1.method4864(this.aClass10_Sub2_Sub1_3);
		this.aClass95_Sub3_1.method4833(arg6);
		this.aClass95_Sub3_1.method4870(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass10_Sub2_Sub1_3.aBoolean245 && !this.aBoolean7) {
			@Pc(348) float local348 = (float) arg3 * this.aClass10_Sub2_Sub1_3.aFloat59 / (float) this.aClass10_Sub2_Sub1_3.anInt3361;
			@Pc(360) float local360 = (float) arg2 * this.aClass10_Sub2_Sub1_3.aFloat58 / (float) this.aClass10_Sub2_Sub1_3.anInt3366;
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
		OpenGL.glTranslatef((float) this.anInt116, (float) this.anInt115, 0.0F);
		@Pc(74) int local74 = this.method5130();
		@Pc(77) int local77 = this.method5134();
		@Pc(83) int local83 = arg1 + this.aClass10_Sub2_Sub1_3.anInt3361;
		OpenGL.glBegin(7);
		@Pc(87) int local87 = arg1;
		@Pc(96) int local96;
		while (local20 >= local83) {
			local96 = arg0 + this.aClass10_Sub2_Sub1_3.anInt3366;
			@Pc(98) int local98 = arg0;
			while (local96 <= local10) {
				OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub2_Sub1_3.aFloat59);
				OpenGL.glVertex2i(local98, local87);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local98, local83);
				OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_3.aFloat58, 0.0F);
				OpenGL.glVertex2i(local96, local83);
				OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_3.aFloat58, this.aClass10_Sub2_Sub1_3.aFloat59);
				OpenGL.glVertex2i(local96, local87);
				local98 += local74;
				local96 += local74;
			}
			if (local10 > local98) {
				@Pc(165) float local165 = (float) (local10 - local98) * this.aClass10_Sub2_Sub1_3.aFloat58 / (float) this.aClass10_Sub2_Sub1_3.anInt3366;
				OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub2_Sub1_3.aFloat59);
				OpenGL.glVertex2i(local98, local87);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local98, local83);
				OpenGL.glTexCoord2f(local165, 0.0F);
				OpenGL.glVertex2i(local10, local83);
				OpenGL.glTexCoord2f(local165, this.aClass10_Sub2_Sub1_3.aFloat59);
				OpenGL.glVertex2i(local10, local87);
			}
			local83 += local77;
			local87 += local77;
		}
		if (local87 < local20) {
			@Pc(230) float local230 = (float) (this.aClass10_Sub2_Sub1_3.anInt3361 + local87 - local20) * this.aClass10_Sub2_Sub1_3.aFloat59 / (float) this.aClass10_Sub2_Sub1_3.anInt3361;
			@Pc(237) int local237 = arg0 + this.aClass10_Sub2_Sub1_3.anInt3366;
			local96 = arg0;
			while (local237 <= local10) {
				OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub2_Sub1_3.aFloat59);
				OpenGL.glVertex2i(local96, local87);
				OpenGL.glTexCoord2f(0.0F, local230);
				OpenGL.glVertex2i(local96, local20);
				OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_3.aFloat58, local230);
				OpenGL.glVertex2i(local237, local20);
				OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_3.aFloat58, this.aClass10_Sub2_Sub1_3.aFloat59);
				OpenGL.glVertex2i(local237, local87);
				local237 += local74;
				local96 += local74;
			}
			if (local96 < local10) {
				@Pc(305) float local305 = (float) (local10 - local96) * this.aClass10_Sub2_Sub1_3.aFloat58 / (float) this.aClass10_Sub2_Sub1_3.anInt3366;
				OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub2_Sub1_3.aFloat59);
				OpenGL.glVertex2i(local96, local87);
				OpenGL.glTexCoord2f(0.0F, local230);
				OpenGL.glVertex2i(local96, local20);
				OpenGL.glTexCoord2f(local305, local230);
				OpenGL.glVertex2i(local10, local20);
				OpenGL.glTexCoord2f(local305, this.aClass10_Sub2_Sub1_3.aFloat59);
				OpenGL.glVertex2i(local10, local87);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)V")
	@Override
	public void method5120(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass10_Sub2_Sub1_2 = Static321.method8421(this.aClass10_Sub2_Sub1_3.anInt3366, this.aClass95_Sub3_1, 0, 0, this.aClass10_Sub2_Sub1_3.anInt3361);
		this.anInt109 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "([I)V")
	@Override
	public void method5118(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt115;
		arg0[3] = this.anInt114;
		arg0[0] = this.anInt116;
		arg0[2] = this.anInt112;
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt112 = arg2;
		this.anInt116 = arg0;
		this.anInt114 = arg3;
		this.anInt115 = arg1;
		this.aBoolean7 = this.anInt116 != 0 || this.anInt115 != 0 || this.anInt112 != 0 || this.anInt114 != 0;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIII[III)V")
	private void method170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass10_Sub2_Sub1_3.method2860(arg2, arg0, arg1, arg5, arg3, arg4);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IZ)V")
	private void method171(@OriginalArg(0) int arg0) {
		this.aClass95_Sub3_1.method4900(1);
		this.aClass95_Sub3_1.method4864(this.aClass10_Sub2_Sub1_3);
		this.aClass95_Sub3_1.method4899(this.aClass95_Sub3_1.method4895(arg0), 7681);
		this.aClass95_Sub3_1.method4869(34167, 1, 768);
		this.aClass95_Sub3_1.method4850(0, 34168);
		this.aClass95_Sub3_1.method4900(0);
		this.aClass95_Sub3_1.method4864(this.aClass10_Sub2_Sub1_2);
		this.aClass95_Sub3_1.method4899(34479, 7681);
		this.aClass95_Sub3_1.method4869(34166, 1, 768);
		if (this.anInt109 == 0) {
			this.aClass95_Sub3_1.method4896(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt109 == 1) {
			this.aClass95_Sub3_1.method4896(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt109 == 2) {
			this.aClass95_Sub3_1.method4896(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt109 == 3) {
			this.aClass95_Sub3_1.method4896(128.5F, 128.5F, 0.0F, 128.5F);
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "()I")
	@Override
	public int method5119() {
		return this.aClass10_Sub2_Sub1_3.anInt3366;
	}

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "()I")
	@Override
	public int method5136() {
		return this.aClass10_Sub2_Sub1_3.anInt3361;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method5131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg2;
		@Pc(9) Class10_Sub2_Sub1 local9 = local6.aClass10_Sub2_Sub1_1;
		this.aClass10_Sub2_Sub1_3.method6097(false);
		this.aClass95_Sub3_1.method4867();
		this.aClass95_Sub3_1.method4864(this.aClass10_Sub2_Sub1_3);
		this.aClass95_Sub3_1.method4870(1);
		this.aClass95_Sub3_1.method4900(1);
		this.aClass95_Sub3_1.method4864(local9);
		this.aClass95_Sub3_1.method4899(7681, 8448);
		this.aClass95_Sub3_1.method4869(34168, 0, 768);
		this.aClass95_Sub3_1.method4833(1);
		@Pc(62) int local62 = arg1 + this.anInt115;
		@Pc(67) int local67 = arg0 + this.anInt116;
		@Pc(73) int local73 = local67 + this.aClass10_Sub2_Sub1_3.anInt3366;
		@Pc(79) int local79 = local62 + this.aClass10_Sub2_Sub1_3.anInt3361;
		@Pc(86) float local86 = local9.aFloat58 / (float) local9.anInt3366;
		@Pc(93) float local93 = local9.aFloat59 / (float) local9.anInt3361;
		@Pc(101) float local101 = local86 * (float) (local67 - arg3);
		@Pc(109) float local109 = (float) (local73 - arg3) * local86;
		@Pc(120) float local120 = local9.aFloat59 - local93 * (float) (local62 - arg4);
		@Pc(131) float local131 = local9.aFloat59 - (float) (local79 - arg4) * local93;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass10_Sub2_Sub1_3.aFloat59);
		OpenGL.glMultiTexCoord2f(33985, local101, local120);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local131);
		OpenGL.glVertex2i(local67, this.aClass10_Sub2_Sub1_3.anInt3361 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass10_Sub2_Sub1_3.aFloat58, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local131);
		OpenGL.glVertex2i(local67 + this.aClass10_Sub2_Sub1_3.anInt3366, this.aClass10_Sub2_Sub1_3.anInt3361 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass10_Sub2_Sub1_3.aFloat58, this.aClass10_Sub2_Sub1_3.aFloat59);
		OpenGL.glMultiTexCoord2f(33985, local109, local120);
		OpenGL.glVertex2i(local67 + this.aClass10_Sub2_Sub1_3.anInt3366, local62);
		OpenGL.glEnd();
		this.aClass95_Sub3_1.method4869(5890, 0, 768);
		this.aClass95_Sub3_1.method4870(0);
		this.aClass95_Sub3_1.method4864((Class10) null);
		this.aClass95_Sub3_1.method4900(0);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method5127(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean7) {
			local10 = (float) this.method5130();
			local14 = (float) this.method5134();
			@Pc(21) float local21 = (arg2 - arg0) / local10;
			@Pc(28) float local28 = (arg3 - arg1) / local10;
			@Pc(35) float local35 = (arg4 - arg0) / local14;
			@Pc(42) float local42 = (arg5 - arg1) / local14;
			@Pc(48) float local48 = local35 * (float) this.anInt115;
			@Pc(54) float local54 = (float) this.anInt115 * local42;
			@Pc(60) float local60 = (float) this.anInt116 * local21;
			@Pc(66) float local66 = local28 * (float) this.anInt116;
			@Pc(73) float local73 = (float) this.anInt112 * -local21;
			@Pc(80) float local80 = -local28 * (float) this.anInt112;
			@Pc(87) float local87 = -local35 * (float) this.anInt114;
			arg1 = arg1 + local66 + local54;
			arg3 = local54 + local80 + arg3;
			arg2 = arg2 + local73 + local48;
			arg0 = local48 + arg0 + local60;
			arg4 = local87 + local60 + arg4;
			@Pc(124) float local124 = -local42 * (float) this.anInt114;
			arg5 = local66 + arg5 + local124;
		}
		local10 = arg2 + arg4 - arg0;
		local14 = arg5 + arg3 - arg1;
		this.aClass10_Sub2_Sub1_3.method6097(true);
		this.aClass95_Sub3_1.method4867();
		this.aClass95_Sub3_1.method4864(this.aClass10_Sub2_Sub1_3);
		this.aClass95_Sub3_1.method4833(1);
		this.aClass95_Sub3_1.method4870(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub2_Sub1_3.aFloat59);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_3.aFloat58, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_3.aFloat58, this.aClass10_Sub2_Sub1_3.aFloat59);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method5128(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class10_Sub2_Sub1 local7 = ((Class1_Sub1) arg6).aClass10_Sub2_Sub1_1;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(31) float local31;
		if (this.aBoolean7) {
			local14 = (float) this.method5130();
			local18 = (float) this.method5134();
			local24 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = (float) this.anInt115 * local37;
			@Pc(56) float local56 = (float) this.anInt115 * local44;
			@Pc(62) float local62 = (float) this.anInt116 * local24;
			@Pc(68) float local68 = local31 * (float) this.anInt116;
			@Pc(75) float local75 = (float) this.anInt112 * -local24;
			@Pc(82) float local82 = -local31 * (float) this.anInt112;
			@Pc(89) float local89 = -local37 * (float) this.anInt114;
			arg4 = local89 + arg4 + local62;
			arg1 = local68 + arg1 + local56;
			@Pc(108) float local108 = -local44 * (float) this.anInt114;
			arg2 = arg2 + local75 + local50;
			arg0 = local50 + local62 + arg0;
			arg3 = local56 + local82 + arg3;
			arg5 = local108 + arg5 + local68;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass10_Sub2_Sub1_3.method6097(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass95_Sub3_1.method4867();
		this.aClass95_Sub3_1.method4864(this.aClass10_Sub2_Sub1_3);
		this.aClass95_Sub3_1.method4870(1);
		this.aClass95_Sub3_1.method4900(1);
		this.aClass95_Sub3_1.method4864(local7);
		this.aClass95_Sub3_1.method4899(7681, 8448);
		this.aClass95_Sub3_1.method4869(34168, 0, 768);
		this.aClass95_Sub3_1.method4833(1);
		local24 = local7.aFloat58 / (float) local7.anInt3366;
		local31 = local7.aFloat59 / (float) local7.anInt3361;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass10_Sub2_Sub1_3.aFloat59);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg0) * local24, local7.aFloat59 - (arg1 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg4 - (float) arg7), local7.aFloat59 - local31 * ((float) -arg8 + arg5));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass10_Sub2_Sub1_3.aFloat58, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + local14), local7.aFloat59 - (local18 - (float) arg8) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass10_Sub2_Sub1_3.aFloat58, this.aClass10_Sub2_Sub1_3.aFloat59);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg2) * local24, local7.aFloat59 - local31 * ((float) -arg8 + arg3));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass95_Sub3_1.method4869(5890, 0, 768);
		this.aClass95_Sub3_1.method4870(0);
		this.aClass95_Sub3_1.method4864((Class10) null);
		this.aClass95_Sub3_1.method4900(0);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method5133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass10_Sub2_Sub1_3.method6097(false);
		this.aClass95_Sub3_1.method4867();
		this.aClass95_Sub3_1.method4833(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt116;
		@Pc(42) int local42 = arg1 + this.anInt115;
		if (this.aClass10_Sub2_Sub1_2 == null) {
			this.aClass95_Sub3_1.method4864(this.aClass10_Sub2_Sub1_3);
			this.aClass95_Sub3_1.method4870(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub2_Sub1_3.aFloat59);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass10_Sub2_Sub1_3.anInt3361 + local42);
			OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_3.aFloat58, 0.0F);
			OpenGL.glVertex2i(local37 + this.aClass10_Sub2_Sub1_3.anInt3366, this.aClass10_Sub2_Sub1_3.anInt3361 + local42);
			OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_3.aFloat58, this.aClass10_Sub2_Sub1_3.aFloat59);
			OpenGL.glVertex2i(this.aClass10_Sub2_Sub1_3.anInt3366 + local37, local42);
			OpenGL.glEnd();
			return;
		}
		this.method171(arg2);
		this.aClass10_Sub2_Sub1_2.method6097(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass10_Sub2_Sub1_3.aFloat59);
		OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub2_Sub1_3.aFloat59);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, this.aClass10_Sub2_Sub1_3.anInt3361 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass10_Sub2_Sub1_3.aFloat58, 0.0F);
		OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_3.aFloat58, 0.0F);
		OpenGL.glVertex2i(this.aClass10_Sub2_Sub1_3.anInt3366 + local37, this.aClass10_Sub2_Sub1_3.anInt3361 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass10_Sub2_Sub1_3.aFloat58, this.aClass10_Sub2_Sub1_3.aFloat59);
		OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_3.aFloat58, this.aClass10_Sub2_Sub1_3.aFloat59);
		OpenGL.glVertex2i(local37 + this.aClass10_Sub2_Sub1_3.anInt3366, local42);
		OpenGL.glEnd();
		this.method176();
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)V")
	private void method176() {
		this.aClass95_Sub3_1.method4900(1);
		this.aClass95_Sub3_1.method4864((Class10) null);
		this.aClass95_Sub3_1.method4899(8448, 8448);
		this.aClass95_Sub3_1.method4869(34168, 1, 768);
		this.aClass95_Sub3_1.method4850(0, 5890);
		this.aClass95_Sub3_1.method4900(0);
		this.aClass95_Sub3_1.method4869(34168, 1, 768);
	}
}
