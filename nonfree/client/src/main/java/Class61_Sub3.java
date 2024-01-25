import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class61_Sub3 extends Class61 {

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "Lclient!dd;")
	private Class65_Sub1_Sub1 aClass65_Sub1_Sub1_3;

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "Z")
	private boolean aBoolean354 = false;

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
	private int anInt4886 = 0;

	@OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
	private int anInt4887 = 0;

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
	private int anInt4880 = 0;

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
	private int anInt4884 = 0;

	@OriginalMember(owner = "client!kn", name = "t", descriptor = "I")
	private int anInt4891 = 0;

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "Lclient!ep;")
	private final Class95_Sub1 aClass95_Sub1_24;

	@OriginalMember(owner = "client!kn", name = "r", descriptor = "Lclient!dd;")
	private final Class65_Sub1_Sub1 aClass65_Sub1_Sub1_4;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lclient!ep;IIZ)V")
	public Class61_Sub3(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass95_Sub1_24 = arg0;
		this.aClass65_Sub1_Sub1_4 = Static557.method7635(arg0, arg2, arg3 ? 6408 : 6407, arg1);
	}

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lclient!ep;IIII)V")
	public Class61_Sub3(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass95_Sub1_24 = arg0;
		this.aClass65_Sub1_Sub1_4 = Static76.method1076(arg3, arg1, arg4, arg2, arg0);
	}

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lclient!ep;II[III)V")
	public Class61_Sub3(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass95_Sub1_24 = arg0;
		this.aClass65_Sub1_Sub1_4 = Static100.method1530(arg5, arg4, arg0, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(IIII)V")
	@Override
	public void method6436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4884 = arg3;
		this.anInt4880 = arg1;
		this.anInt4887 = arg0;
		this.anInt4891 = arg2;
		this.aBoolean354 = this.anInt4887 != 0 || this.anInt4880 != 0 || this.anInt4891 != 0 || this.anInt4884 != 0;
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "()I")
	@Override
	public int method6445() {
		return this.aClass65_Sub1_Sub1_4.anInt1699;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method6437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass65_Sub1_Sub1_4.method6836(true);
		this.aClass95_Sub1_24.method2093();
		this.aClass95_Sub1_24.method2062(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean354) {
			@Pc(51) float local51 = (float) arg2 / (float) this.method6446();
			@Pc(58) float local58 = (float) arg3 / (float) this.method6438();
			@Pc(67) float local67 = (float) this.anInt4887 * local51 + (float) arg0;
			@Pc(76) float local76 = (float) arg1 + (float) this.anInt4880 * local58;
			@Pc(85) float local85 = local67 + (float) this.aClass65_Sub1_Sub1_4.anInt1699 * local51;
			@Pc(94) float local94 = local76 + (float) this.aClass65_Sub1_Sub1_4.anInt1700 * local58;
			if (this.aClass65_Sub1_Sub1_3 == null) {
				this.aClass95_Sub1_24.method2077(this.aClass65_Sub1_Sub1_4);
				this.aClass95_Sub1_24.method2106(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub1_Sub1_4.aFloat18);
				OpenGL.glVertex2f(local67, local76);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local67, local94);
				OpenGL.glTexCoord2f(this.aClass65_Sub1_Sub1_4.aFloat19, 0.0F);
				OpenGL.glVertex2f(local85, local94);
				OpenGL.glTexCoord2f(this.aClass65_Sub1_Sub1_4.aFloat19, this.aClass65_Sub1_Sub1_4.aFloat18);
				OpenGL.glVertex2f(local85, local76);
				OpenGL.glEnd();
			} else {
				this.method4131(arg4);
				this.aClass65_Sub1_Sub1_3.method6836(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass65_Sub1_Sub1_4.aFloat18);
				OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub1_Sub1_4.aFloat18);
				OpenGL.glVertex2f(local67, local76);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local67, local94);
				OpenGL.glMultiTexCoord2f(33985, this.aClass65_Sub1_Sub1_4.aFloat19, 0.0F);
				OpenGL.glTexCoord2f(this.aClass65_Sub1_Sub1_4.aFloat19, 0.0F);
				OpenGL.glVertex2f(local85, local94);
				OpenGL.glMultiTexCoord2f(33985, this.aClass65_Sub1_Sub1_4.aFloat19, this.aClass65_Sub1_Sub1_4.aFloat18);
				OpenGL.glTexCoord2f(this.aClass65_Sub1_Sub1_4.aFloat19, this.aClass65_Sub1_Sub1_4.aFloat18);
				OpenGL.glVertex2f(local85, local76);
				OpenGL.glEnd();
				this.method4133();
			}
		} else if (this.aClass65_Sub1_Sub1_3 == null) {
			this.aClass95_Sub1_24.method2077(this.aClass65_Sub1_Sub1_4);
			this.aClass95_Sub1_24.method2106(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub1_Sub1_4.aFloat18);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass65_Sub1_Sub1_4.aFloat19, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass65_Sub1_Sub1_4.aFloat19, this.aClass65_Sub1_Sub1_4.aFloat18);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method4131(arg4);
			this.aClass65_Sub1_Sub1_3.method6836(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass65_Sub1_Sub1_4.aFloat18);
			OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub1_Sub1_4.aFloat18);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass65_Sub1_Sub1_4.aFloat19, 0.0F);
			OpenGL.glTexCoord2f(this.aClass65_Sub1_Sub1_4.aFloat19, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass65_Sub1_Sub1_4.aFloat19, this.aClass65_Sub1_Sub1_4.aFloat18);
			OpenGL.glTexCoord2f(this.aClass65_Sub1_Sub1_4.aFloat19, this.aClass65_Sub1_Sub1_4.aFloat18);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method4133();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method6453(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean354) {
			local10 = this.method6446();
			local14 = this.method6438();
			@Pc(21) float local21 = (arg2 - arg0) / local10;
			@Pc(28) float local28 = (arg3 - arg1) / local10;
			@Pc(34) float local34 = (arg4 - arg0) / local14;
			@Pc(41) float local41 = (arg5 - arg1) / local14;
			@Pc(47) float local47 = local34 * (float) this.anInt4880;
			@Pc(53) float local53 = (float) this.anInt4880 * local41;
			@Pc(59) float local59 = local21 * (float) this.anInt4887;
			@Pc(65) float local65 = (float) this.anInt4887 * local28;
			@Pc(72) float local72 = (float) this.anInt4891 * -local21;
			@Pc(79) float local79 = -local28 * (float) this.anInt4891;
			@Pc(86) float local86 = -local34 * (float) this.anInt4884;
			arg3 = local53 + local79 + arg3;
			arg4 = local86 + arg4 + local59;
			arg0 = local59 + arg0 + local47;
			arg2 = local72 + arg2 + local47;
			arg1 = local65 + arg1 + local53;
			@Pc(123) float local123 = (float) this.anInt4884 * -local41;
			arg5 = local123 + local65 + arg5;
		}
		local10 = arg4 + arg2 - arg0;
		local14 = arg3 + arg5 - arg1;
		this.aClass65_Sub1_Sub1_4.method6836(true);
		this.aClass95_Sub1_24.method2093();
		this.aClass95_Sub1_24.method2077(this.aClass65_Sub1_Sub1_4);
		this.aClass95_Sub1_24.method2062(1);
		this.aClass95_Sub1_24.method2106(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub1_Sub1_4.aFloat18);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass65_Sub1_Sub1_4.aFloat19, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass65_Sub1_Sub1_4.aFloat19, this.aClass65_Sub1_Sub1_4.aFloat18);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(II)V")
	private void method4131(@OriginalArg(0) int arg0) {
		this.aClass95_Sub1_24.method2098(1);
		this.aClass95_Sub1_24.method2077(this.aClass65_Sub1_Sub1_4);
		this.aClass95_Sub1_24.method2105(this.aClass95_Sub1_24.method2108(arg0), 7681);
		this.aClass95_Sub1_24.method2101(768, 34167, 1);
		this.aClass95_Sub1_24.method2095(0, 34168);
		this.aClass95_Sub1_24.method2098(0);
		this.aClass95_Sub1_24.method2077(this.aClass65_Sub1_Sub1_3);
		this.aClass95_Sub1_24.method2105(34479, 7681);
		this.aClass95_Sub1_24.method2101(768, 34166, 1);
		if (this.anInt4886 == 0) {
			this.aClass95_Sub1_24.method2078(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt4886 == 1) {
			this.aClass95_Sub1_24.method2078(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt4886 == 2) {
			this.aClass95_Sub1_24.method2078(0.5F, 0.5F, 1.0F, 0.0F);
			return;
		} else if (this.anInt4886 == 3) {
			this.aClass95_Sub1_24.method2078(128.5F, 128.5F, 128.5F, 0.0F);
			return;
		}
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "()I")
	@Override
	public int method6446() {
		return this.aClass65_Sub1_Sub1_4.anInt1699 + this.anInt4887 + this.anInt4891;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		@Pc(13) int local13 = arg1 + arg3;
		this.aClass65_Sub1_Sub1_4.method6836(false);
		this.aClass95_Sub1_24.method2093();
		this.aClass95_Sub1_24.method2077(this.aClass65_Sub1_Sub1_4);
		this.aClass95_Sub1_24.method2062(arg6);
		this.aClass95_Sub1_24.method2106(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass65_Sub1_Sub1_4.aBoolean133 && !this.aBoolean354) {
			@Pc(350) float local350 = this.aClass65_Sub1_Sub1_4.aFloat18 * (float) arg3 / (float) this.aClass65_Sub1_Sub1_4.anInt1700;
			@Pc(362) float local362 = (float) arg2 * this.aClass65_Sub1_Sub1_4.aFloat19 / (float) this.aClass65_Sub1_Sub1_4.anInt1699;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local350);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local13);
			OpenGL.glTexCoord2f(local362, 0.0F);
			OpenGL.glVertex2i(local9, local13);
			OpenGL.glTexCoord2f(local362, local350);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt4887, (float) this.anInt4880, 0.0F);
		@Pc(72) int local72 = this.method6446();
		@Pc(75) int local75 = this.method6438();
		@Pc(82) int local82 = arg1 + this.aClass65_Sub1_Sub1_4.anInt1700;
		OpenGL.glBegin(7);
		@Pc(86) int local86 = arg1;
		@Pc(94) int local94;
		while (local82 <= local13) {
			local94 = this.aClass65_Sub1_Sub1_4.anInt1699 + arg0;
			@Pc(96) int local96 = arg0;
			while (local9 >= local94) {
				OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub1_Sub1_4.aFloat18);
				OpenGL.glVertex2i(local96, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local96, local82);
				OpenGL.glTexCoord2f(this.aClass65_Sub1_Sub1_4.aFloat19, 0.0F);
				OpenGL.glVertex2i(local94, local82);
				OpenGL.glTexCoord2f(this.aClass65_Sub1_Sub1_4.aFloat19, this.aClass65_Sub1_Sub1_4.aFloat18);
				OpenGL.glVertex2i(local94, local86);
				local94 += local72;
				local96 += local72;
			}
			if (local9 > local96) {
				@Pc(162) float local162 = (float) (local9 - local96) * this.aClass65_Sub1_Sub1_4.aFloat19 / (float) this.aClass65_Sub1_Sub1_4.anInt1699;
				OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub1_Sub1_4.aFloat18);
				OpenGL.glVertex2i(local96, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local96, local82);
				OpenGL.glTexCoord2f(local162, 0.0F);
				OpenGL.glVertex2i(local9, local82);
				OpenGL.glTexCoord2f(local162, this.aClass65_Sub1_Sub1_4.aFloat18);
				OpenGL.glVertex2i(local9, local86);
			}
			local86 += local75;
			local82 += local75;
		}
		if (local86 < local13) {
			@Pc(231) float local231 = (float) (this.aClass65_Sub1_Sub1_4.anInt1700 + local86 - local13) * this.aClass65_Sub1_Sub1_4.aFloat18 / (float) this.aClass65_Sub1_Sub1_4.anInt1700;
			@Pc(238) int local238 = arg0 + this.aClass65_Sub1_Sub1_4.anInt1699;
			local94 = arg0;
			while (local238 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub1_Sub1_4.aFloat18);
				OpenGL.glVertex2i(local94, local86);
				OpenGL.glTexCoord2f(0.0F, local231);
				OpenGL.glVertex2i(local94, local13);
				OpenGL.glTexCoord2f(this.aClass65_Sub1_Sub1_4.aFloat19, local231);
				OpenGL.glVertex2i(local238, local13);
				OpenGL.glTexCoord2f(this.aClass65_Sub1_Sub1_4.aFloat19, this.aClass65_Sub1_Sub1_4.aFloat18);
				OpenGL.glVertex2i(local238, local86);
				local94 += local72;
				local238 += local72;
			}
			if (local9 > local94) {
				@Pc(307) float local307 = (float) (local9 - local94) * this.aClass65_Sub1_Sub1_4.aFloat19 / (float) this.aClass65_Sub1_Sub1_4.anInt1699;
				OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub1_Sub1_4.aFloat18);
				OpenGL.glVertex2i(local94, local86);
				OpenGL.glTexCoord2f(0.0F, local231);
				OpenGL.glVertex2i(local94, local13);
				OpenGL.glTexCoord2f(local307, local231);
				OpenGL.glVertex2i(local9, local13);
				OpenGL.glTexCoord2f(local307, this.aClass65_Sub1_Sub1_4.aFloat18);
				OpenGL.glVertex2i(local9, local86);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V")
	private void method4133() {
		this.aClass95_Sub1_24.method2098(1);
		this.aClass95_Sub1_24.method2077(null);
		this.aClass95_Sub1_24.method2105(8448, 8448);
		this.aClass95_Sub1_24.method2101(768, 34168, 1);
		this.aClass95_Sub1_24.method2095(0, 5890);
		this.aClass95_Sub1_24.method2098(0);
		this.aClass95_Sub1_24.method2101(768, 34168, 1);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)V")
	@Override
	public void method6450(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass65_Sub1_Sub1_3 = Static76.method1076(this.aClass65_Sub1_Sub1_4.anInt1699, 0, this.aClass65_Sub1_Sub1_4.anInt1700, 0, this.aClass95_Sub1_24);
		this.anInt4886 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method6434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass65_Sub1_Sub1_4.method6836(false);
		this.aClass95_Sub1_24.method2093();
		this.aClass95_Sub1_24.method2062(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt4887;
		@Pc(42) int local42 = arg1 + this.anInt4880;
		if (this.aClass65_Sub1_Sub1_3 == null) {
			this.aClass95_Sub1_24.method2077(this.aClass65_Sub1_Sub1_4);
			this.aClass95_Sub1_24.method2106(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub1_Sub1_4.aFloat18);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, local42 + this.aClass65_Sub1_Sub1_4.anInt1700);
			OpenGL.glTexCoord2f(this.aClass65_Sub1_Sub1_4.aFloat19, 0.0F);
			OpenGL.glVertex2i(this.aClass65_Sub1_Sub1_4.anInt1699 + local37, this.aClass65_Sub1_Sub1_4.anInt1700 + local42);
			OpenGL.glTexCoord2f(this.aClass65_Sub1_Sub1_4.aFloat19, this.aClass65_Sub1_Sub1_4.aFloat18);
			OpenGL.glVertex2i(local37 + this.aClass65_Sub1_Sub1_4.anInt1699, local42);
			OpenGL.glEnd();
			return;
		}
		this.method4131(arg2);
		this.aClass65_Sub1_Sub1_3.method6836(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass65_Sub1_Sub1_4.aFloat18);
		OpenGL.glTexCoord2f(0.0F, this.aClass65_Sub1_Sub1_4.aFloat18);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, this.aClass65_Sub1_Sub1_4.anInt1700 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass65_Sub1_Sub1_4.aFloat19, 0.0F);
		OpenGL.glTexCoord2f(this.aClass65_Sub1_Sub1_4.aFloat19, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass65_Sub1_Sub1_4.anInt1699, this.aClass65_Sub1_Sub1_4.anInt1700 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass65_Sub1_Sub1_4.aFloat19, this.aClass65_Sub1_Sub1_4.aFloat18);
		OpenGL.glTexCoord2f(this.aClass65_Sub1_Sub1_4.aFloat19, this.aClass65_Sub1_Sub1_4.aFloat18);
		OpenGL.glVertex2i(local37 + this.aClass65_Sub1_Sub1_4.anInt1699, local42);
		OpenGL.glEnd();
		this.method4133();
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "()I")
	@Override
	public int method6447() {
		return this.aClass65_Sub1_Sub1_4.anInt1700;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method6433(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class65_Sub1_Sub1 local7 = ((Class1_Sub2) arg6).aClass65_Sub1_Sub1_2;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(31) float local31;
		if (this.aBoolean354) {
			local14 = this.method6446();
			local18 = this.method6438();
			local25 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = (float) this.anInt4880 * local38;
			@Pc(56) float local56 = local44 * (float) this.anInt4880;
			@Pc(62) float local62 = (float) this.anInt4887 * local25;
			@Pc(68) float local68 = (float) this.anInt4887 * local31;
			@Pc(75) float local75 = -local25 * (float) this.anInt4891;
			@Pc(82) float local82 = -local31 * (float) this.anInt4891;
			@Pc(89) float local89 = (float) this.anInt4884 * -local38;
			arg4 = local89 + local62 + arg4;
			arg3 = local82 + arg3 + local56;
			arg0 = local50 + local62 + arg0;
			arg1 = local68 + arg1 + local56;
			@Pc(120) float local120 = (float) this.anInt4884 * -local44;
			arg2 = local75 + arg2 + local50;
			arg5 = arg5 + local68 + local120;
		}
		local14 = arg4 + arg2 - arg0;
		local18 = arg3 + arg5 - arg1;
		this.aClass65_Sub1_Sub1_4.method6836(true);
		this.aClass95_Sub1_24.method2093();
		this.aClass95_Sub1_24.method2077(this.aClass65_Sub1_Sub1_4);
		this.aClass95_Sub1_24.method2106(1);
		this.aClass95_Sub1_24.method2098(1);
		this.aClass95_Sub1_24.method2077(local7);
		this.aClass95_Sub1_24.method2105(7681, 8448);
		this.aClass95_Sub1_24.method2101(768, 34168, 0);
		this.aClass95_Sub1_24.method2062(1);
		local25 = local7.aFloat19 / (float) local7.anInt1699;
		local31 = local7.aFloat18 / (float) local7.anInt1700;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass65_Sub1_Sub1_4.aFloat18);
		OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * local25, local7.aFloat18 - ((float) -arg8 + arg1) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * local25, local7.aFloat18 - local31 * ((float) -arg8 + arg5));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass65_Sub1_Sub1_4.aFloat19, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + local14) * local25, local7.aFloat18 - local31 * ((float) -arg8 + local18));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass65_Sub1_Sub1_4.aFloat19, this.aClass65_Sub1_Sub1_4.aFloat18);
		OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * local25, local7.aFloat18 - local31 * (arg3 - (float) arg8));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass95_Sub1_24.method2101(768, 5890, 0);
		this.aClass95_Sub1_24.method2106(0);
		this.aClass95_Sub1_24.method2077(null);
		this.aClass95_Sub1_24.method2098(0);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "()I")
	@Override
	public int method6438() {
		return this.aClass65_Sub1_Sub1_4.anInt1700 + this.anInt4880 + this.anInt4884;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method6449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg2;
		@Pc(9) Class65_Sub1_Sub1 local9 = local6.aClass65_Sub1_Sub1_2;
		this.aClass65_Sub1_Sub1_4.method6836(false);
		this.aClass95_Sub1_24.method2093();
		this.aClass95_Sub1_24.method2077(this.aClass65_Sub1_Sub1_4);
		this.aClass95_Sub1_24.method2106(1);
		this.aClass95_Sub1_24.method2098(1);
		this.aClass95_Sub1_24.method2077(local9);
		this.aClass95_Sub1_24.method2105(7681, 8448);
		this.aClass95_Sub1_24.method2101(768, 34168, 0);
		this.aClass95_Sub1_24.method2062(1);
		@Pc(62) int local62 = arg1 + this.anInt4880;
		@Pc(67) int local67 = arg0 + this.anInt4887;
		@Pc(73) int local73 = this.aClass65_Sub1_Sub1_4.anInt1699 + local67;
		@Pc(79) int local79 = this.aClass65_Sub1_Sub1_4.anInt1700 + local62;
		@Pc(86) float local86 = local9.aFloat19 / (float) local9.anInt1699;
		@Pc(93) float local93 = local9.aFloat18 / (float) local9.anInt1700;
		@Pc(100) float local100 = local86 * (float) (local67 - arg3);
		@Pc(107) float local107 = local86 * (float) (local73 - arg3);
		@Pc(119) float local119 = local9.aFloat18 - local93 * (float) (local62 - arg4);
		@Pc(130) float local130 = local9.aFloat18 - (float) (local79 - arg4) * local93;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass65_Sub1_Sub1_4.aFloat18);
		OpenGL.glMultiTexCoord2f(33985, local100, local119);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local100, local130);
		OpenGL.glVertex2i(local67, this.aClass65_Sub1_Sub1_4.anInt1700 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass65_Sub1_Sub1_4.aFloat19, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local107, local130);
		OpenGL.glVertex2i(this.aClass65_Sub1_Sub1_4.anInt1699 + local67, this.aClass65_Sub1_Sub1_4.anInt1700 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass65_Sub1_Sub1_4.aFloat19, this.aClass65_Sub1_Sub1_4.aFloat18);
		OpenGL.glMultiTexCoord2f(33985, local107, local119);
		OpenGL.glVertex2i(this.aClass65_Sub1_Sub1_4.anInt1699 + local67, local62);
		OpenGL.glEnd();
		this.aClass95_Sub1_24.method2101(768, 5890, 0);
		this.aClass95_Sub1_24.method2106(0);
		this.aClass95_Sub1_24.method2077(null);
		this.aClass95_Sub1_24.method2098(0);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass65_Sub1_Sub1_4.method1423(arg0, arg2, arg3, arg4, arg5, arg1);
	}
}
