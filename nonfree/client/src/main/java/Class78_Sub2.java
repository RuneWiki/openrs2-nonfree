import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class78_Sub2 extends Class78 {

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "Lclient!ls;")
	private Class21_Sub2_Sub1 aClass21_Sub2_Sub1_5;

	@OriginalMember(owner = "client!qv", name = "i", descriptor = "I")
	private int anInt6125 = 0;

	@OriginalMember(owner = "client!qv", name = "s", descriptor = "Z")
	private boolean aBoolean493 = false;

	@OriginalMember(owner = "client!qv", name = "y", descriptor = "I")
	private int anInt6138 = 0;

	@OriginalMember(owner = "client!qv", name = "r", descriptor = "I")
	private int anInt6132 = 0;

	@OriginalMember(owner = "client!qv", name = "A", descriptor = "I")
	private int anInt6140 = 0;

	@OriginalMember(owner = "client!qv", name = "m", descriptor = "I")
	private int anInt6129 = 0;

	@OriginalMember(owner = "client!qv", name = "p", descriptor = "Lclient!qg;")
	private final Class121_Sub2 aClass121_Sub2_31;

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "Lclient!ls;")
	private final Class21_Sub2_Sub1 aClass21_Sub2_Sub1_4;

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lclient!qg;IIII)V")
	public Class78_Sub2(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass121_Sub2_31 = arg0;
		this.aClass21_Sub2_Sub1_4 = Static2.method33(arg4, arg2, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lclient!qg;II[III)V")
	public Class78_Sub2(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass121_Sub2_31 = arg0;
		this.aClass21_Sub2_Sub1_4 = Static130.method3750(arg1, arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!qv", name = "ka", descriptor = "(IIII)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6138 = arg3;
		this.anInt6125 = arg1;
		this.anInt6129 = arg0;
		this.anInt6132 = arg2;
		this.aBoolean493 = this.anInt6129 != 0 || this.anInt6125 != 0 || this.anInt6132 != 0 || this.anInt6138 != 0;
	}

	@OriginalMember(owner = "client!qv", name = "ja", descriptor = "()I")
	@Override
	public int ja() {
		return this.anInt6132 + this.anInt6129 + this.aClass21_Sub2_Sub1_4.anInt4204;
	}

	@OriginalMember(owner = "client!qv", name = "qa", descriptor = "()I")
	@Override
	public int qa() {
		return this.aClass21_Sub2_Sub1_4.anInt4202;
	}

	@OriginalMember(owner = "client!qv", name = "M", descriptor = "(IIIIIII)V")
	@Override
	public void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass21_Sub2_Sub1_4.method3755(true);
		this.aClass121_Sub2_31.method4674();
		this.aClass121_Sub2_31.method4700(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean493) {
			@Pc(42) float local42 = (float) arg2 / (float) this.ja();
			@Pc(49) float local49 = (float) arg3 / (float) this.JA();
			@Pc(58) float local58 = (float) arg0 + (float) this.anInt6129 * local42;
			@Pc(67) float local67 = (float) this.anInt6125 * local49 + (float) arg1;
			@Pc(76) float local76 = local58 + local42 * (float) this.aClass21_Sub2_Sub1_4.anInt4204;
			@Pc(85) float local85 = local67 + (float) this.aClass21_Sub2_Sub1_4.anInt4202 * local49;
			if (this.aClass21_Sub2_Sub1_5 == null) {
				this.aClass121_Sub2_31.method4681(this.aClass21_Sub2_Sub1_4);
				this.aClass121_Sub2_31.method4707(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass21_Sub2_Sub1_4.aFloat73);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glTexCoord2f(this.aClass21_Sub2_Sub1_4.aFloat72, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glTexCoord2f(this.aClass21_Sub2_Sub1_4.aFloat72, this.aClass21_Sub2_Sub1_4.aFloat73);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
			} else {
				this.method4858(arg4);
				this.aClass21_Sub2_Sub1_5.method3755(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass21_Sub2_Sub1_4.aFloat73);
				OpenGL.glTexCoord2f(0.0F, this.aClass21_Sub2_Sub1_4.aFloat73);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass21_Sub2_Sub1_4.aFloat72, 0.0F);
				OpenGL.glTexCoord2f(this.aClass21_Sub2_Sub1_4.aFloat72, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass21_Sub2_Sub1_4.aFloat72, this.aClass21_Sub2_Sub1_4.aFloat73);
				OpenGL.glTexCoord2f(this.aClass21_Sub2_Sub1_4.aFloat72, this.aClass21_Sub2_Sub1_4.aFloat73);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
				this.method4860();
			}
		} else if (this.aClass21_Sub2_Sub1_5 == null) {
			this.aClass121_Sub2_31.method4681(this.aClass21_Sub2_Sub1_4);
			this.aClass121_Sub2_31.method4707(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass21_Sub2_Sub1_4.aFloat73);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass21_Sub2_Sub1_4.aFloat72, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass21_Sub2_Sub1_4.aFloat72, this.aClass21_Sub2_Sub1_4.aFloat73);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method4858(arg4);
			this.aClass21_Sub2_Sub1_5.method3755(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass21_Sub2_Sub1_4.aFloat73);
			OpenGL.glTexCoord2f(0.0F, this.aClass21_Sub2_Sub1_4.aFloat73);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass21_Sub2_Sub1_4.aFloat72, 0.0F);
			OpenGL.glTexCoord2f(this.aClass21_Sub2_Sub1_4.aFloat72, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass21_Sub2_Sub1_4.aFloat72, this.aClass21_Sub2_Sub1_4.aFloat73);
			OpenGL.glTexCoord2f(this.aClass21_Sub2_Sub1_4.aFloat72, this.aClass21_Sub2_Sub1_4.aFloat73);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method4860();
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IILclient!ea;II)V")
	@Override
	public void method6000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class34_Sub2 local6 = (Class34_Sub2) arg2;
		@Pc(9) Class21_Sub2_Sub1 local9 = local6.aClass21_Sub2_Sub1_2;
		this.aClass21_Sub2_Sub1_4.method3755(false);
		this.aClass121_Sub2_31.method4674();
		this.aClass121_Sub2_31.method4681(this.aClass21_Sub2_Sub1_4);
		this.aClass121_Sub2_31.method4707(1);
		this.aClass121_Sub2_31.method4669(1);
		this.aClass121_Sub2_31.method4681(local9);
		this.aClass121_Sub2_31.method4709(8448, 7681);
		this.aClass121_Sub2_31.method4692(0, 34168, 768);
		this.aClass121_Sub2_31.method4700(1);
		@Pc(62) int local62 = arg1 + this.anInt6125;
		@Pc(67) int local67 = arg0 + this.anInt6129;
		@Pc(73) int local73 = this.aClass21_Sub2_Sub1_4.anInt4204 + local67;
		@Pc(79) int local79 = local62 + this.aClass21_Sub2_Sub1_4.anInt4202;
		@Pc(86) float local86 = local9.aFloat72 / (float) local9.anInt4204;
		@Pc(93) float local93 = local9.aFloat73 / (float) local9.anInt4202;
		@Pc(101) float local101 = local86 * (float) (local67 - arg3);
		@Pc(109) float local109 = (float) (local73 - arg3) * local86;
		@Pc(121) float local121 = local9.aFloat73 - local93 * (float) (local62 - arg4);
		@Pc(133) float local133 = local9.aFloat73 - local93 * (float) (local79 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass21_Sub2_Sub1_4.aFloat73);
		OpenGL.glMultiTexCoord2f(33985, local101, local121);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local133);
		OpenGL.glVertex2i(local67, this.aClass21_Sub2_Sub1_4.anInt4202 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass21_Sub2_Sub1_4.aFloat72, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local133);
		OpenGL.glVertex2i(local67 + this.aClass21_Sub2_Sub1_4.anInt4204, this.aClass21_Sub2_Sub1_4.anInt4202 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass21_Sub2_Sub1_4.aFloat72, this.aClass21_Sub2_Sub1_4.aFloat73);
		OpenGL.glMultiTexCoord2f(33985, local109, local121);
		OpenGL.glVertex2i(local67 + this.aClass21_Sub2_Sub1_4.anInt4204, local62);
		OpenGL.glEnd();
		this.aClass121_Sub2_31.method4692(0, 5890, 768);
		this.aClass121_Sub2_31.method4707(0);
		this.aClass121_Sub2_31.method4681(null);
		this.aClass121_Sub2_31.method4669(0);
	}

	@OriginalMember(owner = "client!qv", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass21_Sub2_Sub1_5 = Static2.method33(this.aClass21_Sub2_Sub1_4.anInt4202, arg1, this.aClass21_Sub2_Sub1_4.anInt4204, arg0, this.aClass121_Sub2_31);
		this.anInt6140 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!qv", name = "aa", descriptor = "(FFFFFFIII)V")
	@Override
	protected void aa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean493) {
			local6 = this.ja();
			local10 = this.JA();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(24) float local24 = (arg3 - arg1) / local6;
			@Pc(31) float local31 = (arg4 - arg0) / local10;
			@Pc(37) float local37 = (arg5 - arg1) / local10;
			@Pc(43) float local43 = local31 * (float) this.anInt6125;
			@Pc(49) float local49 = local37 * (float) this.anInt6125;
			@Pc(55) float local55 = local17 * (float) this.anInt6129;
			@Pc(61) float local61 = local24 * (float) this.anInt6129;
			@Pc(68) float local68 = (float) this.anInt6132 * -local17;
			@Pc(75) float local75 = -local24 * (float) this.anInt6132;
			@Pc(82) float local82 = -local31 * (float) this.anInt6138;
			@Pc(89) float local89 = (float) this.anInt6138 * -local37;
			arg1 = local49 + arg1 + local61;
			arg0 = local43 + local55 + arg0;
			arg3 = local75 + arg3 + local49;
			arg2 = local68 + arg2 + local43;
			arg4 = local82 + local55 + arg4;
			arg5 = arg5 + local61 + local89;
		}
		local6 = arg2 + arg4 - arg0;
		this.aClass21_Sub2_Sub1_4.method3755(true);
		local10 = arg3 + arg5 - arg1;
		this.aClass121_Sub2_31.method4674();
		this.aClass121_Sub2_31.method4681(this.aClass21_Sub2_Sub1_4);
		this.aClass121_Sub2_31.method4700(arg8);
		this.aClass121_Sub2_31.method4707(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass21_Sub2_Sub1_4.aFloat73);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass21_Sub2_Sub1_4.aFloat72, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass21_Sub2_Sub1_4.aFloat72, this.aClass21_Sub2_Sub1_4.aFloat73);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!qv", name = "UA", descriptor = "()I")
	@Override
	public int UA() {
		return this.aClass21_Sub2_Sub1_4.anInt4204;
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(II)V")
	private void method4858(@OriginalArg(1) int arg0) {
		this.aClass121_Sub2_31.method4669(1);
		this.aClass121_Sub2_31.method4681(this.aClass21_Sub2_Sub1_4);
		this.aClass121_Sub2_31.method4709(7681, this.aClass121_Sub2_31.method4712(arg0));
		this.aClass121_Sub2_31.method4692(1, 34167, 768);
		this.aClass121_Sub2_31.method4673(0, 34168);
		this.aClass121_Sub2_31.method4669(0);
		this.aClass121_Sub2_31.method4681(this.aClass21_Sub2_Sub1_5);
		this.aClass121_Sub2_31.method4709(7681, 34479);
		this.aClass121_Sub2_31.method4692(1, 34166, 768);
		if (this.anInt6140 == 0) {
			this.aClass121_Sub2_31.method4713(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt6140 == 1) {
			this.aClass121_Sub2_31.method4713(0.5F, 1.0F, 0.0F, 0.5F);
			return;
		} else if (this.anInt6140 == 2) {
			this.aClass121_Sub2_31.method4713(1.0F, 0.5F, 0.0F, 0.5F);
			return;
		} else if (this.anInt6140 == 3) {
			this.aClass121_Sub2_31.method4713(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!qv", name = "JA", descriptor = "()I")
	@Override
	public int JA() {
		return this.aClass21_Sub2_Sub1_4.anInt4202 + this.anInt6125 + this.anInt6138;
	}

	@OriginalMember(owner = "client!qv", name = "D", descriptor = "(IIIIIII)V")
	@Override
	public void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg0 + arg2;
		this.aClass21_Sub2_Sub1_4.method3755(false);
		@Pc(20) int local20 = arg1 + arg3;
		this.aClass121_Sub2_31.method4674();
		this.aClass121_Sub2_31.method4681(this.aClass21_Sub2_Sub1_4);
		this.aClass121_Sub2_31.method4700(arg6);
		this.aClass121_Sub2_31.method4707(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass21_Sub2_Sub1_4.aBoolean331 && !this.aBoolean493) {
			@Pc(342) float local342 = this.aClass21_Sub2_Sub1_4.aFloat73 * (float) arg3 / (float) this.aClass21_Sub2_Sub1_4.anInt4202;
			@Pc(354) float local354 = this.aClass21_Sub2_Sub1_4.aFloat72 * (float) arg2 / (float) this.aClass21_Sub2_Sub1_4.anInt4204;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local342);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local20);
			OpenGL.glTexCoord2f(local354, 0.0F);
			OpenGL.glVertex2i(local10, local20);
			OpenGL.glTexCoord2f(local354, local342);
			OpenGL.glVertex2i(local10, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt6129, (float) this.anInt6125, 0.0F);
		@Pc(74) int local74 = this.ja();
		@Pc(77) int local77 = this.JA();
		@Pc(83) int local83 = this.aClass21_Sub2_Sub1_4.anInt4202 + arg1;
		OpenGL.glBegin(7);
		@Pc(87) int local87 = arg1;
		@Pc(95) int local95;
		while (local83 <= local20) {
			local95 = this.aClass21_Sub2_Sub1_4.anInt4204 + arg0;
			@Pc(97) int local97 = arg0;
			while (local10 >= local95) {
				OpenGL.glTexCoord2f(0.0F, this.aClass21_Sub2_Sub1_4.aFloat73);
				OpenGL.glVertex2i(local97, local87);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local83);
				OpenGL.glTexCoord2f(this.aClass21_Sub2_Sub1_4.aFloat72, 0.0F);
				OpenGL.glVertex2i(local95, local83);
				OpenGL.glTexCoord2f(this.aClass21_Sub2_Sub1_4.aFloat72, this.aClass21_Sub2_Sub1_4.aFloat73);
				OpenGL.glVertex2i(local95, local87);
				local97 += local74;
				local95 += local74;
			}
			if (local10 > local97) {
				@Pc(160) float local160 = this.aClass21_Sub2_Sub1_4.aFloat72 * (float) (local10 - local97) / (float) this.aClass21_Sub2_Sub1_4.anInt4204;
				OpenGL.glTexCoord2f(0.0F, this.aClass21_Sub2_Sub1_4.aFloat73);
				OpenGL.glVertex2i(local97, local87);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local83);
				OpenGL.glTexCoord2f(local160, 0.0F);
				OpenGL.glVertex2i(local10, local83);
				OpenGL.glTexCoord2f(local160, this.aClass21_Sub2_Sub1_4.aFloat73);
				OpenGL.glVertex2i(local10, local87);
			}
			local87 += local77;
			local83 += local77;
		}
		if (local20 > local87) {
			@Pc(229) float local229 = (float) (this.aClass21_Sub2_Sub1_4.anInt4202 + local87 - local20) * this.aClass21_Sub2_Sub1_4.aFloat73 / (float) this.aClass21_Sub2_Sub1_4.anInt4202;
			@Pc(235) int local235 = arg0 + this.aClass21_Sub2_Sub1_4.anInt4204;
			local95 = arg0;
			while (local235 <= local10) {
				OpenGL.glTexCoord2f(0.0F, this.aClass21_Sub2_Sub1_4.aFloat73);
				OpenGL.glVertex2i(local95, local87);
				OpenGL.glTexCoord2f(0.0F, local229);
				OpenGL.glVertex2i(local95, local20);
				OpenGL.glTexCoord2f(this.aClass21_Sub2_Sub1_4.aFloat72, local229);
				OpenGL.glVertex2i(local235, local20);
				OpenGL.glTexCoord2f(this.aClass21_Sub2_Sub1_4.aFloat72, this.aClass21_Sub2_Sub1_4.aFloat73);
				OpenGL.glVertex2i(local235, local87);
				local235 += local74;
				local95 += local74;
			}
			if (local10 > local95) {
				@Pc(299) float local299 = (float) (local10 - local95) * this.aClass21_Sub2_Sub1_4.aFloat72 / (float) this.aClass21_Sub2_Sub1_4.anInt4204;
				OpenGL.glTexCoord2f(0.0F, this.aClass21_Sub2_Sub1_4.aFloat73);
				OpenGL.glVertex2i(local95, local87);
				OpenGL.glTexCoord2f(0.0F, local229);
				OpenGL.glVertex2i(local95, local20);
				OpenGL.glTexCoord2f(local299, local229);
				OpenGL.glVertex2i(local10, local20);
				OpenGL.glTexCoord2f(local299, this.aClass21_Sub2_Sub1_4.aFloat73);
				OpenGL.glVertex2i(local10, local87);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!qv", name = "W", descriptor = "(IIIIII)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass21_Sub2_Sub1_4.method3484(arg3, arg1, arg5, arg4, arg0, arg2);
	}

	@OriginalMember(owner = "client!qv", name = "YA", descriptor = "(IIIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass21_Sub2_Sub1_4.method3755(false);
		this.aClass121_Sub2_31.method4674();
		this.aClass121_Sub2_31.method4700(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt6125;
		@Pc(42) int local42 = arg0 + this.anInt6129;
		if (this.aClass21_Sub2_Sub1_5 == null) {
			this.aClass121_Sub2_31.method4681(this.aClass21_Sub2_Sub1_4);
			this.aClass121_Sub2_31.method4707(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass21_Sub2_Sub1_4.aFloat73);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, local37 + this.aClass21_Sub2_Sub1_4.anInt4202);
			OpenGL.glTexCoord2f(this.aClass21_Sub2_Sub1_4.aFloat72, 0.0F);
			OpenGL.glVertex2i(local42 + this.aClass21_Sub2_Sub1_4.anInt4204, local37 - -this.aClass21_Sub2_Sub1_4.anInt4202);
			OpenGL.glTexCoord2f(this.aClass21_Sub2_Sub1_4.aFloat72, this.aClass21_Sub2_Sub1_4.aFloat73);
			OpenGL.glVertex2i(local42 + this.aClass21_Sub2_Sub1_4.anInt4204, local37);
			OpenGL.glEnd();
			return;
		}
		this.method4858(arg2);
		this.aClass21_Sub2_Sub1_5.method3755(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass21_Sub2_Sub1_4.aFloat73);
		OpenGL.glTexCoord2f(0.0F, this.aClass21_Sub2_Sub1_4.aFloat73);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, this.aClass21_Sub2_Sub1_4.anInt4202 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass21_Sub2_Sub1_4.aFloat72, 0.0F);
		OpenGL.glTexCoord2f(this.aClass21_Sub2_Sub1_4.aFloat72, 0.0F);
		OpenGL.glVertex2i(this.aClass21_Sub2_Sub1_4.anInt4204 + local42, local37 + this.aClass21_Sub2_Sub1_4.anInt4202);
		OpenGL.glMultiTexCoord2f(33985, this.aClass21_Sub2_Sub1_4.aFloat72, this.aClass21_Sub2_Sub1_4.aFloat73);
		OpenGL.glTexCoord2f(this.aClass21_Sub2_Sub1_4.aFloat72, this.aClass21_Sub2_Sub1_4.aFloat73);
		OpenGL.glVertex2i(this.aClass21_Sub2_Sub1_4.anInt4204 + local42, local37);
		OpenGL.glEnd();
		this.method4860();
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(B)V")
	private void method4860() {
		this.aClass121_Sub2_31.method4669(1);
		this.aClass121_Sub2_31.method4681(null);
		this.aClass121_Sub2_31.method4709(8448, 8448);
		this.aClass121_Sub2_31.method4692(1, 34168, 768);
		this.aClass121_Sub2_31.method4673(0, 5890);
		this.aClass121_Sub2_31.method4669(0);
		this.aClass121_Sub2_31.method4692(1, 34168, 768);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(FFFFFFLclient!ea;II)V")
	@Override
	protected void method6008(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class34 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class21_Sub2_Sub1 local7 = ((Class34_Sub2) arg6).aClass21_Sub2_Sub1_2;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(30) float local30;
		if (this.aBoolean493) {
			local14 = this.ja();
			local18 = this.JA();
			local24 = (arg2 - arg0) / local14;
			local30 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(43) float local43 = (arg5 - arg1) / local18;
			@Pc(49) float local49 = (float) this.anInt6125 * local37;
			@Pc(55) float local55 = local43 * (float) this.anInt6125;
			@Pc(61) float local61 = local24 * (float) this.anInt6129;
			@Pc(67) float local67 = (float) this.anInt6129 * local30;
			@Pc(74) float local74 = -local24 * (float) this.anInt6132;
			@Pc(81) float local81 = (float) this.anInt6132 * -local30;
			@Pc(88) float local88 = -local37 * (float) this.anInt6138;
			arg0 = arg0 + local61 + local49;
			arg1 = local67 + arg1 + local55;
			@Pc(107) float local107 = (float) this.anInt6138 * -local43;
			arg4 = local61 + arg4 + local88;
			arg3 = arg3 + local81 + local55;
			arg2 = arg2 + local74 + local49;
			arg5 = arg5 + local67 + local107;
		}
		local14 = arg2 + arg4 - arg0;
		this.aClass21_Sub2_Sub1_4.method3755(true);
		local18 = arg3 + arg5 - arg1;
		this.aClass121_Sub2_31.method4674();
		this.aClass121_Sub2_31.method4681(this.aClass21_Sub2_Sub1_4);
		this.aClass121_Sub2_31.method4707(1);
		this.aClass121_Sub2_31.method4669(1);
		this.aClass121_Sub2_31.method4681(local7);
		this.aClass121_Sub2_31.method4709(8448, 7681);
		this.aClass121_Sub2_31.method4692(0, 34168, 768);
		this.aClass121_Sub2_31.method4700(1);
		local24 = local7.aFloat72 / (float) local7.anInt4204;
		local30 = local7.aFloat73 / (float) local7.anInt4202;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass21_Sub2_Sub1_4.aFloat73);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg0) * local24, local7.aFloat73 - ((float) -arg8 + arg1) * local30);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg4) * local24, local7.aFloat73 - local30 * (arg5 - (float) arg8));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass21_Sub2_Sub1_4.aFloat72, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * (local14 - (float) arg7), local7.aFloat73 - local30 * ((float) -arg8 + local18));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass21_Sub2_Sub1_4.aFloat72, this.aClass21_Sub2_Sub1_4.aFloat73);
		OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * local24, local7.aFloat73 - ((float) -arg8 + arg3) * local30);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass121_Sub2_31.method4692(0, 5890, 768);
		this.aClass121_Sub2_31.method4707(0);
		this.aClass121_Sub2_31.method4681(null);
		this.aClass121_Sub2_31.method4669(0);
	}
}
