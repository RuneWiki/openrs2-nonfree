import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class84_Sub3 extends Class84 {

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "Lclient!es;")
	private Class79_Sub2_Sub1 aClass79_Sub2_Sub1_3;

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
	private int anInt5267 = 0;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
	private int anInt5263 = 0;

	@OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
	private int anInt5276 = 0;

	@OriginalMember(owner = "client!kq", name = "v", descriptor = "I")
	private int anInt5279 = 0;

	@OriginalMember(owner = "client!kq", name = "y", descriptor = "I")
	private int anInt5281 = 0;

	@OriginalMember(owner = "client!kq", name = "r", descriptor = "Z")
	private boolean aBoolean405 = false;

	@OriginalMember(owner = "client!kq", name = "u", descriptor = "Lclient!gi;")
	private final Class42_Sub3 aClass42_Sub3_16;

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "Lclient!es;")
	private final Class79_Sub2_Sub1 aClass79_Sub2_Sub1_2;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!gi;IIII)V")
	public Class84_Sub3(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass42_Sub3_16 = arg0;
		this.aClass79_Sub2_Sub1_2 = Static438.method6663(arg2, arg1, arg0, arg3, arg4);
	}

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!gi;II[III)V")
	public Class84_Sub3(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass42_Sub3_16 = arg0;
		this.aClass79_Sub2_Sub1_2 = Static292.method4740(arg3, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IILclient!pa;II)V")
	@Override
	public void method7490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class145 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class145_Sub2 local6 = (Class145_Sub2) arg2;
		@Pc(9) Class79_Sub2_Sub1 local9 = local6.aClass79_Sub2_Sub1_4;
		this.aClass79_Sub2_Sub1_2.method5278(false);
		this.aClass42_Sub3_16.method3247();
		this.aClass42_Sub3_16.method3219(this.aClass79_Sub2_Sub1_2);
		this.aClass42_Sub3_16.method3257(1);
		this.aClass42_Sub3_16.method3259(1);
		this.aClass42_Sub3_16.method3219(local9);
		this.aClass42_Sub3_16.method3250(7681, 8448);
		this.aClass42_Sub3_16.method3268(0, 768, 34168);
		this.aClass42_Sub3_16.method3209(1);
		@Pc(62) int local62 = arg1 + this.anInt5279;
		@Pc(67) int local67 = arg0 + this.anInt5267;
		@Pc(73) int local73 = this.aClass79_Sub2_Sub1_2.anInt2822 + local67;
		@Pc(79) int local79 = this.aClass79_Sub2_Sub1_2.anInt2824 + local62;
		@Pc(86) float local86 = local9.aFloat73 / (float) local9.anInt2822;
		@Pc(93) float local93 = local9.aFloat74 / (float) local9.anInt2824;
		@Pc(101) float local101 = local86 * (float) (local67 - arg3);
		@Pc(109) float local109 = (float) (local73 - arg3) * local86;
		@Pc(120) float local120 = local9.aFloat74 - (float) (local62 - arg4) * local93;
		@Pc(131) float local131 = local9.aFloat74 - (float) (local79 - arg4) * local93;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass79_Sub2_Sub1_2.aFloat74);
		OpenGL.glMultiTexCoord2f(33985, local101, local120);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local131);
		OpenGL.glVertex2i(local67, local62 + this.aClass79_Sub2_Sub1_2.anInt2824);
		OpenGL.glMultiTexCoord2f(33984, this.aClass79_Sub2_Sub1_2.aFloat73, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local131);
		OpenGL.glVertex2i(local67 + this.aClass79_Sub2_Sub1_2.anInt2822, local62 - -this.aClass79_Sub2_Sub1_2.anInt2824);
		OpenGL.glMultiTexCoord2f(33984, this.aClass79_Sub2_Sub1_2.aFloat73, this.aClass79_Sub2_Sub1_2.aFloat74);
		OpenGL.glMultiTexCoord2f(33985, local109, local120);
		OpenGL.glVertex2i(this.aClass79_Sub2_Sub1_2.anInt2822 + local67, local62);
		OpenGL.glEnd();
		this.aClass42_Sub3_16.method3268(0, 768, 5890);
		this.aClass42_Sub3_16.method3257(0);
		this.aClass42_Sub3_16.method3219(null);
		this.aClass42_Sub3_16.method3259(0);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(FFFFFFLclient!pa;II)V")
	@Override
	protected void method7493(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class145 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class79_Sub2_Sub1 local7 = ((Class145_Sub2) arg6).aClass79_Sub2_Sub1_4;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(32) float local32;
		if (this.aBoolean405) {
			local14 = this.EA();
			local18 = this.ma();
			local25 = (arg2 - arg0) / local14;
			local32 = (arg3 - arg1) / local14;
			@Pc(39) float local39 = (arg4 - arg0) / local18;
			@Pc(45) float local45 = (arg5 - arg1) / local18;
			@Pc(51) float local51 = (float) this.anInt5279 * local39;
			@Pc(57) float local57 = local45 * (float) this.anInt5279;
			@Pc(63) float local63 = (float) this.anInt5267 * local25;
			@Pc(69) float local69 = local32 * (float) this.anInt5267;
			@Pc(76) float local76 = -local25 * (float) this.anInt5263;
			@Pc(83) float local83 = -local32 * (float) this.anInt5263;
			@Pc(90) float local90 = -local39 * (float) this.anInt5276;
			arg4 = arg4 + local63 + local90;
			@Pc(103) float local103 = -local45 * (float) this.anInt5276;
			arg2 = local51 + local76 + arg2;
			arg1 = local69 + arg1 + local57;
			arg3 = local57 + local83 + arg3;
			arg0 = local51 + arg0 + local63;
			arg5 = local103 + arg5 + local69;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass79_Sub2_Sub1_2.method5278(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass42_Sub3_16.method3247();
		this.aClass42_Sub3_16.method3219(this.aClass79_Sub2_Sub1_2);
		this.aClass42_Sub3_16.method3257(1);
		this.aClass42_Sub3_16.method3259(1);
		this.aClass42_Sub3_16.method3219(local7);
		this.aClass42_Sub3_16.method3250(7681, 8448);
		this.aClass42_Sub3_16.method3268(0, 768, 34168);
		this.aClass42_Sub3_16.method3209(1);
		local25 = local7.aFloat73 / (float) local7.anInt2822;
		local32 = local7.aFloat74 / (float) local7.anInt2824;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass79_Sub2_Sub1_2.aFloat74);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg0 - (float) arg7), local7.aFloat74 - ((float) -arg8 + arg1) * local32);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg4 - (float) arg7), local7.aFloat74 - ((float) -arg8 + arg5) * local32);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass79_Sub2_Sub1_2.aFloat73, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * (local14 - (float) arg7), local7.aFloat74 - (local18 - (float) arg8) * local32);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass79_Sub2_Sub1_2.aFloat73, this.aClass79_Sub2_Sub1_2.aFloat74);
		OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * local25, local7.aFloat74 - local32 * ((float) -arg8 + arg3));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass42_Sub3_16.method3268(0, 768, 5890);
		this.aClass42_Sub3_16.method3257(0);
		this.aClass42_Sub3_16.method3219(null);
		this.aClass42_Sub3_16.method3259(0);
	}

	@OriginalMember(owner = "client!kq", name = "BA", descriptor = "(III)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass79_Sub2_Sub1_3 = Static438.method6663(arg1, arg0, this.aClass42_Sub3_16, this.aClass79_Sub2_Sub1_2.anInt2822, this.aClass79_Sub2_Sub1_2.anInt2824);
		this.anInt5281 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!kq", name = "ra", descriptor = "(IIIIIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass79_Sub2_Sub1_2.method5278(true);
		this.aClass42_Sub3_16.method3247();
		this.aClass42_Sub3_16.method3209(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean405) {
			@Pc(181) float local181 = (float) arg2 / (float) this.EA();
			@Pc(188) float local188 = (float) arg3 / (float) this.ma();
			@Pc(197) float local197 = local181 * (float) this.anInt5267 + (float) arg0;
			@Pc(206) float local206 = (float) arg1 + local188 * (float) this.anInt5279;
			@Pc(215) float local215 = (float) this.aClass79_Sub2_Sub1_2.anInt2822 * local181 + local197;
			@Pc(224) float local224 = local188 * (float) this.aClass79_Sub2_Sub1_2.anInt2824 + local206;
			if (this.aClass79_Sub2_Sub1_3 == null) {
				this.aClass42_Sub3_16.method3219(this.aClass79_Sub2_Sub1_2);
				this.aClass42_Sub3_16.method3257(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass79_Sub2_Sub1_2.aFloat74);
				OpenGL.glVertex2f(local197, local206);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local197, local224);
				OpenGL.glTexCoord2f(this.aClass79_Sub2_Sub1_2.aFloat73, 0.0F);
				OpenGL.glVertex2f(local215, local224);
				OpenGL.glTexCoord2f(this.aClass79_Sub2_Sub1_2.aFloat73, this.aClass79_Sub2_Sub1_2.aFloat74);
				OpenGL.glVertex2f(local215, local206);
				OpenGL.glEnd();
			} else {
				this.method4420(arg4);
				this.aClass79_Sub2_Sub1_3.method5278(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass79_Sub2_Sub1_2.aFloat74);
				OpenGL.glTexCoord2f(0.0F, this.aClass79_Sub2_Sub1_2.aFloat74);
				OpenGL.glVertex2f(local197, local206);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local197, local224);
				OpenGL.glMultiTexCoord2f(33985, this.aClass79_Sub2_Sub1_2.aFloat73, 0.0F);
				OpenGL.glTexCoord2f(this.aClass79_Sub2_Sub1_2.aFloat73, 0.0F);
				OpenGL.glVertex2f(local215, local224);
				OpenGL.glMultiTexCoord2f(33985, this.aClass79_Sub2_Sub1_2.aFloat73, this.aClass79_Sub2_Sub1_2.aFloat74);
				OpenGL.glTexCoord2f(this.aClass79_Sub2_Sub1_2.aFloat73, this.aClass79_Sub2_Sub1_2.aFloat74);
				OpenGL.glVertex2f(local215, local206);
				OpenGL.glEnd();
				this.method4421();
			}
		} else if (this.aClass79_Sub2_Sub1_3 == null) {
			this.aClass42_Sub3_16.method3219(this.aClass79_Sub2_Sub1_2);
			this.aClass42_Sub3_16.method3257(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass79_Sub2_Sub1_2.aFloat74);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass79_Sub2_Sub1_2.aFloat73, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass79_Sub2_Sub1_2.aFloat73, this.aClass79_Sub2_Sub1_2.aFloat74);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method4420(arg4);
			this.aClass79_Sub2_Sub1_3.method5278(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass79_Sub2_Sub1_2.aFloat74);
			OpenGL.glTexCoord2f(0.0F, this.aClass79_Sub2_Sub1_2.aFloat74);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass79_Sub2_Sub1_2.aFloat73, 0.0F);
			OpenGL.glTexCoord2f(this.aClass79_Sub2_Sub1_2.aFloat73, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass79_Sub2_Sub1_2.aFloat73, this.aClass79_Sub2_Sub1_2.aFloat74);
			OpenGL.glTexCoord2f(this.aClass79_Sub2_Sub1_2.aFloat73, this.aClass79_Sub2_Sub1_2.aFloat74);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method4421();
		}
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(II)V")
	private void method4420(@OriginalArg(1) int arg0) {
		this.aClass42_Sub3_16.method3259(1);
		this.aClass42_Sub3_16.method3219(this.aClass79_Sub2_Sub1_2);
		this.aClass42_Sub3_16.method3250(this.aClass42_Sub3_16.method3255(arg0), 7681);
		this.aClass42_Sub3_16.method3268(1, 768, 34167);
		this.aClass42_Sub3_16.method3201(0, 34168);
		this.aClass42_Sub3_16.method3259(0);
		this.aClass42_Sub3_16.method3219(this.aClass79_Sub2_Sub1_3);
		this.aClass42_Sub3_16.method3250(34479, 7681);
		this.aClass42_Sub3_16.method3268(1, 768, 34166);
		if (this.anInt5281 == 0) {
			this.aClass42_Sub3_16.method3221(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt5281 == 1) {
			this.aClass42_Sub3_16.method3221(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt5281 == 2) {
			this.aClass42_Sub3_16.method3221(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt5281 == 3) {
			this.aClass42_Sub3_16.method3221(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "()I")
	@Override
	public int c() {
		return this.aClass79_Sub2_Sub1_2.anInt2822;
	}

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "(IIIIIII)V")
	@Override
	public void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		@Pc(13) int local13 = arg3 + arg1;
		this.aClass79_Sub2_Sub1_2.method5278(false);
		this.aClass42_Sub3_16.method3247();
		this.aClass42_Sub3_16.method3219(this.aClass79_Sub2_Sub1_2);
		this.aClass42_Sub3_16.method3209(arg6);
		this.aClass42_Sub3_16.method3257(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass79_Sub2_Sub1_2.aBoolean229 && !this.aBoolean405) {
			@Pc(72) float local72 = this.aClass79_Sub2_Sub1_2.aFloat74 * (float) arg3 / (float) this.aClass79_Sub2_Sub1_2.anInt2824;
			@Pc(84) float local84 = this.aClass79_Sub2_Sub1_2.aFloat73 * (float) arg2 / (float) this.aClass79_Sub2_Sub1_2.anInt2822;
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
		OpenGL.glTranslatef((float) this.anInt5267, (float) this.anInt5279, 0.0F);
		@Pc(124) int local124 = this.EA();
		@Pc(127) int local127 = this.ma();
		@Pc(133) int local133 = this.aClass79_Sub2_Sub1_2.anInt2824 + arg1;
		OpenGL.glBegin(7);
		@Pc(137) int local137 = arg1;
		@Pc(145) int local145;
		while (local133 <= local13) {
			local145 = arg0 + this.aClass79_Sub2_Sub1_2.anInt2822;
			@Pc(147) int local147 = arg0;
			while (local145 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass79_Sub2_Sub1_2.aFloat74);
				OpenGL.glVertex2i(local147, local137);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local133);
				OpenGL.glTexCoord2f(this.aClass79_Sub2_Sub1_2.aFloat73, 0.0F);
				OpenGL.glVertex2i(local145, local133);
				OpenGL.glTexCoord2f(this.aClass79_Sub2_Sub1_2.aFloat73, this.aClass79_Sub2_Sub1_2.aFloat74);
				OpenGL.glVertex2i(local145, local137);
				local147 += local124;
				local145 += local124;
			}
			if (local9 > local147) {
				@Pc(210) float local210 = this.aClass79_Sub2_Sub1_2.aFloat73 * (float) (local9 - local147) / (float) this.aClass79_Sub2_Sub1_2.anInt2822;
				OpenGL.glTexCoord2f(0.0F, this.aClass79_Sub2_Sub1_2.aFloat74);
				OpenGL.glVertex2i(local147, local137);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local133);
				OpenGL.glTexCoord2f(local210, 0.0F);
				OpenGL.glVertex2i(local9, local133);
				OpenGL.glTexCoord2f(local210, this.aClass79_Sub2_Sub1_2.aFloat74);
				OpenGL.glVertex2i(local9, local137);
			}
			local137 += local127;
			local133 += local127;
		}
		if (local137 < local13) {
			@Pc(274) float local274 = this.aClass79_Sub2_Sub1_2.aFloat74 * (float) (local137 + this.aClass79_Sub2_Sub1_2.anInt2824 - local13) / (float) this.aClass79_Sub2_Sub1_2.anInt2824;
			@Pc(280) int local280 = arg0 + this.aClass79_Sub2_Sub1_2.anInt2822;
			local145 = arg0;
			while (local9 >= local280) {
				OpenGL.glTexCoord2f(0.0F, this.aClass79_Sub2_Sub1_2.aFloat74);
				OpenGL.glVertex2i(local145, local137);
				OpenGL.glTexCoord2f(0.0F, local274);
				OpenGL.glVertex2i(local145, local13);
				OpenGL.glTexCoord2f(this.aClass79_Sub2_Sub1_2.aFloat73, local274);
				OpenGL.glVertex2i(local280, local13);
				OpenGL.glTexCoord2f(this.aClass79_Sub2_Sub1_2.aFloat73, this.aClass79_Sub2_Sub1_2.aFloat74);
				OpenGL.glVertex2i(local280, local137);
				local280 += local124;
				local145 += local124;
			}
			if (local9 > local145) {
				@Pc(349) float local349 = (float) (local9 - local145) * this.aClass79_Sub2_Sub1_2.aFloat73 / (float) this.aClass79_Sub2_Sub1_2.anInt2822;
				OpenGL.glTexCoord2f(0.0F, this.aClass79_Sub2_Sub1_2.aFloat74);
				OpenGL.glVertex2i(local145, local137);
				OpenGL.glTexCoord2f(0.0F, local274);
				OpenGL.glVertex2i(local145, local13);
				OpenGL.glTexCoord2f(local349, local274);
				OpenGL.glVertex2i(local9, local13);
				OpenGL.glTexCoord2f(local349, this.aClass79_Sub2_Sub1_2.aFloat74);
				OpenGL.glVertex2i(local9, local137);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!kq", name = "DA", descriptor = "(IIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass79_Sub2_Sub1_2.method5278(false);
		this.aClass42_Sub3_16.method3247();
		this.aClass42_Sub3_16.method3209(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt5267;
		@Pc(42) int local42 = arg1 + this.anInt5279;
		if (this.aClass79_Sub2_Sub1_3 == null) {
			this.aClass42_Sub3_16.method3219(this.aClass79_Sub2_Sub1_2);
			this.aClass42_Sub3_16.method3257(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass79_Sub2_Sub1_2.aFloat74);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass79_Sub2_Sub1_2.anInt2824 + local42);
			OpenGL.glTexCoord2f(this.aClass79_Sub2_Sub1_2.aFloat73, 0.0F);
			OpenGL.glVertex2i(this.aClass79_Sub2_Sub1_2.anInt2822 + local37, this.aClass79_Sub2_Sub1_2.anInt2824 + local42);
			OpenGL.glTexCoord2f(this.aClass79_Sub2_Sub1_2.aFloat73, this.aClass79_Sub2_Sub1_2.aFloat74);
			OpenGL.glVertex2i(local37 + this.aClass79_Sub2_Sub1_2.anInt2822, local42);
			OpenGL.glEnd();
			return;
		}
		this.method4420(arg2);
		this.aClass79_Sub2_Sub1_3.method5278(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass79_Sub2_Sub1_2.aFloat74);
		OpenGL.glTexCoord2f(0.0F, this.aClass79_Sub2_Sub1_2.aFloat74);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, this.aClass79_Sub2_Sub1_2.anInt2824 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass79_Sub2_Sub1_2.aFloat73, 0.0F);
		OpenGL.glTexCoord2f(this.aClass79_Sub2_Sub1_2.aFloat73, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass79_Sub2_Sub1_2.anInt2822, this.aClass79_Sub2_Sub1_2.anInt2824 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass79_Sub2_Sub1_2.aFloat73, this.aClass79_Sub2_Sub1_2.aFloat74);
		OpenGL.glTexCoord2f(this.aClass79_Sub2_Sub1_2.aFloat73, this.aClass79_Sub2_Sub1_2.aFloat74);
		OpenGL.glVertex2i(local37 + this.aClass79_Sub2_Sub1_2.anInt2822, local42);
		OpenGL.glEnd();
		this.method4421();
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
	private void method4421() {
		this.aClass42_Sub3_16.method3259(1);
		this.aClass42_Sub3_16.method3219(null);
		this.aClass42_Sub3_16.method3250(8448, 8448);
		this.aClass42_Sub3_16.method3268(1, 768, 34168);
		this.aClass42_Sub3_16.method3201(0, 5890);
		this.aClass42_Sub3_16.method3259(0);
		this.aClass42_Sub3_16.method3268(1, 768, 34168);
	}

	@OriginalMember(owner = "client!kq", name = "CA", descriptor = "(FFFFFFIII)V")
	@Override
	protected void CA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean405) {
			local10 = this.EA();
			local14 = this.ma();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			@Pc(27) float local27 = (arg3 - arg1) / local10;
			@Pc(33) float local33 = (arg4 - arg0) / local14;
			@Pc(40) float local40 = (arg5 - arg1) / local14;
			@Pc(46) float local46 = local33 * (float) this.anInt5279;
			@Pc(52) float local52 = (float) this.anInt5279 * local40;
			@Pc(58) float local58 = local20 * (float) this.anInt5267;
			@Pc(64) float local64 = local27 * (float) this.anInt5267;
			@Pc(71) float local71 = (float) this.anInt5263 * -local20;
			@Pc(78) float local78 = (float) this.anInt5263 * -local27;
			@Pc(85) float local85 = (float) this.anInt5276 * -local33;
			arg1 = local52 + arg1 + local64;
			arg4 = local85 + arg4 + local58;
			arg2 = local46 + arg2 + local71;
			@Pc(110) float local110 = (float) this.anInt5276 * -local40;
			arg0 = arg0 + local58 + local46;
			arg3 = local52 + local78 + arg3;
			arg5 = local110 + local64 + arg5;
		}
		local10 = arg4 + arg2 - arg0;
		this.aClass79_Sub2_Sub1_2.method5278(true);
		local14 = arg3 + arg5 - arg1;
		this.aClass42_Sub3_16.method3247();
		this.aClass42_Sub3_16.method3219(this.aClass79_Sub2_Sub1_2);
		this.aClass42_Sub3_16.method3209(arg8);
		this.aClass42_Sub3_16.method3257(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass79_Sub2_Sub1_2.aFloat74);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass79_Sub2_Sub1_2.aFloat73, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass79_Sub2_Sub1_2.aFloat73, this.aClass79_Sub2_Sub1_2.aFloat74);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!kq", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		return this.anInt5279 + this.aClass79_Sub2_Sub1_2.anInt2824 + this.anInt5276;
	}

	@OriginalMember(owner = "client!kq", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		return this.anInt5267 + this.aClass79_Sub2_Sub1_2.anInt2822 + this.anInt5263;
	}

	@OriginalMember(owner = "client!kq", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass79_Sub2_Sub1_2.method2523(arg5, arg3, arg4, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!kq", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5276 = arg3;
		this.anInt5263 = arg2;
		this.anInt5279 = arg1;
		this.anInt5267 = arg0;
		this.aBoolean405 = this.anInt5267 != 0 || this.anInt5279 != 0 || this.anInt5263 != 0 || this.anInt5276 != 0;
	}

	@OriginalMember(owner = "client!kq", name = "la", descriptor = "()I")
	@Override
	public int la() {
		return this.aClass79_Sub2_Sub1_2.anInt2824;
	}
}
