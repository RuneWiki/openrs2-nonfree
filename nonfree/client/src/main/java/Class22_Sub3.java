import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class22_Sub3 extends Class22 {

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "Lclient!ot;")
	private Class40_Sub3_Sub1 aClass40_Sub3_Sub1_2;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
	private int anInt2702 = 0;

	@OriginalMember(owner = "client!fn", name = "j", descriptor = "Z")
	private boolean aBoolean202 = false;

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
	private int anInt2706 = 0;

	@OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
	private int anInt2717 = 0;

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
	private int anInt2710 = 0;

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "I")
	private int anInt2712 = 0;

	@OriginalMember(owner = "client!fn", name = "p", descriptor = "Lclient!ok;")
	private final Class134_Sub2 aClass134_Sub2_11;

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "Lclient!ot;")
	public final Class40_Sub3_Sub1 aClass40_Sub3_Sub1_1;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!ok;IIZ)V")
	public Class22_Sub3(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass134_Sub2_11 = arg0;
		this.aClass40_Sub3_Sub1_1 = Static320.method3904(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!ok;IIII)V")
	public Class22_Sub3(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass134_Sub2_11 = arg0;
		this.aClass40_Sub3_Sub1_1 = Static163.method2382(arg2, arg1, arg3, arg0, arg4);
	}

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!ok;II[III)V")
	public Class22_Sub3(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass134_Sub2_11 = arg0;
		this.aClass40_Sub3_Sub1_1 = Static341.method2572(arg2, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!fn", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		this.aClass40_Sub3_Sub1_1.method5874(false);
		@Pc(19) int local19 = arg1 + arg3;
		this.aClass134_Sub2_11.method5191();
		this.aClass134_Sub2_11.method5202(this.aClass40_Sub3_Sub1_1);
		this.aClass134_Sub2_11.method5233(arg6);
		this.aClass134_Sub2_11.method5194(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass40_Sub3_Sub1_1.aBoolean548 && !this.aBoolean202) {
			@Pc(341) float local341 = (float) arg3 * this.aClass40_Sub3_Sub1_1.aFloat162 / (float) this.aClass40_Sub3_Sub1_1.anInt6748;
			@Pc(353) float local353 = (float) arg2 * this.aClass40_Sub3_Sub1_1.aFloat161 / (float) this.aClass40_Sub3_Sub1_1.anInt6751;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local341);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local19);
			OpenGL.glTexCoord2f(local353, 0.0F);
			OpenGL.glVertex2i(local9, local19);
			OpenGL.glTexCoord2f(local353, local341);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt2712, (float) this.anInt2706, 0.0F);
		@Pc(73) int local73 = this.A();
		@Pc(76) int local76 = this.ca();
		@Pc(82) int local82 = this.aClass40_Sub3_Sub1_1.anInt6748 + arg1;
		OpenGL.glBegin(7);
		@Pc(86) int local86 = arg1;
		@Pc(94) int local94;
		while (local19 >= local82) {
			local94 = this.aClass40_Sub3_Sub1_1.anInt6751 + arg0;
			@Pc(96) int local96 = arg0;
			while (local9 >= local94) {
				OpenGL.glTexCoord2f(0.0F, this.aClass40_Sub3_Sub1_1.aFloat162);
				OpenGL.glVertex2i(local96, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local96, local82);
				OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_1.aFloat161, 0.0F);
				OpenGL.glVertex2i(local94, local82);
				OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_1.aFloat161, this.aClass40_Sub3_Sub1_1.aFloat162);
				OpenGL.glVertex2i(local94, local86);
				local96 += local73;
				local94 += local73;
			}
			if (local96 < local9) {
				@Pc(162) float local162 = this.aClass40_Sub3_Sub1_1.aFloat161 * (float) (local9 - local96) / (float) this.aClass40_Sub3_Sub1_1.anInt6751;
				OpenGL.glTexCoord2f(0.0F, this.aClass40_Sub3_Sub1_1.aFloat162);
				OpenGL.glVertex2i(local96, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local96, local82);
				OpenGL.glTexCoord2f(local162, 0.0F);
				OpenGL.glVertex2i(local9, local82);
				OpenGL.glTexCoord2f(local162, this.aClass40_Sub3_Sub1_1.aFloat162);
				OpenGL.glVertex2i(local9, local86);
			}
			local82 += local76;
			local86 += local76;
		}
		if (local86 < local19) {
			@Pc(226) float local226 = (float) (local86 + this.aClass40_Sub3_Sub1_1.anInt6748 - local19) * this.aClass40_Sub3_Sub1_1.aFloat162 / (float) this.aClass40_Sub3_Sub1_1.anInt6748;
			@Pc(233) int local233 = arg0 + this.aClass40_Sub3_Sub1_1.anInt6751;
			local94 = arg0;
			while (local9 >= local233) {
				OpenGL.glTexCoord2f(0.0F, this.aClass40_Sub3_Sub1_1.aFloat162);
				OpenGL.glVertex2i(local94, local86);
				OpenGL.glTexCoord2f(0.0F, local226);
				OpenGL.glVertex2i(local94, local19);
				OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_1.aFloat161, local226);
				OpenGL.glVertex2i(local233, local19);
				OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_1.aFloat161, this.aClass40_Sub3_Sub1_1.aFloat162);
				OpenGL.glVertex2i(local233, local86);
				local233 += local73;
				local94 += local73;
			}
			if (local9 > local94) {
				@Pc(298) float local298 = (float) (local9 - local94) * this.aClass40_Sub3_Sub1_1.aFloat161 / (float) this.aClass40_Sub3_Sub1_1.anInt6751;
				OpenGL.glTexCoord2f(0.0F, this.aClass40_Sub3_Sub1_1.aFloat162);
				OpenGL.glVertex2i(local94, local86);
				OpenGL.glTexCoord2f(0.0F, local226);
				OpenGL.glVertex2i(local94, local19);
				OpenGL.glTexCoord2f(local298, local226);
				OpenGL.glVertex2i(local9, local19);
				OpenGL.glTexCoord2f(local298, this.aClass40_Sub3_Sub1_1.aFloat162);
				OpenGL.glVertex2i(local9, local86);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!fn", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.aClass40_Sub3_Sub1_1.anInt6751;
	}

	@OriginalMember(owner = "client!fn", name = "V", descriptor = "(IIIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass40_Sub3_Sub1_1.method5874(false);
		this.aClass134_Sub2_11.method5191();
		this.aClass134_Sub2_11.method5233(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt2712;
		@Pc(42) int local42 = arg1 + this.anInt2706;
		if (this.aClass40_Sub3_Sub1_2 == null) {
			this.aClass134_Sub2_11.method5202(this.aClass40_Sub3_Sub1_1);
			this.aClass134_Sub2_11.method5194(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass40_Sub3_Sub1_1.aFloat162);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass40_Sub3_Sub1_1.anInt6748 + local42);
			OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_1.aFloat161, 0.0F);
			OpenGL.glVertex2i(local37 + this.aClass40_Sub3_Sub1_1.anInt6751, local42 + this.aClass40_Sub3_Sub1_1.anInt6748);
			OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_1.aFloat161, this.aClass40_Sub3_Sub1_1.aFloat162);
			OpenGL.glVertex2i(local37 + this.aClass40_Sub3_Sub1_1.anInt6751, local42);
			OpenGL.glEnd();
			return;
		}
		this.method2154(arg2);
		this.aClass40_Sub3_Sub1_2.method5874(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass40_Sub3_Sub1_1.aFloat162);
		OpenGL.glTexCoord2f(0.0F, this.aClass40_Sub3_Sub1_1.aFloat162);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, this.aClass40_Sub3_Sub1_1.anInt6748 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass40_Sub3_Sub1_1.aFloat161, 0.0F);
		OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_1.aFloat161, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass40_Sub3_Sub1_1.anInt6751, this.aClass40_Sub3_Sub1_1.anInt6748 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass40_Sub3_Sub1_1.aFloat161, this.aClass40_Sub3_Sub1_1.aFloat162);
		OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_1.aFloat161, this.aClass40_Sub3_Sub1_1.aFloat162);
		OpenGL.glVertex2i(local37 + this.aClass40_Sub3_Sub1_1.anInt6751, local42);
		OpenGL.glEnd();
		this.method2155();
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected void method7655(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class204 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class40_Sub3_Sub1 local7 = ((Class204_Sub1) arg6).aClass40_Sub3_Sub1_4;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(31) float local31;
		if (this.aBoolean202) {
			local14 = this.A();
			local18 = this.ca();
			local25 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(45) float local45 = (arg5 - arg1) / local18;
			@Pc(51) float local51 = local38 * (float) this.anInt2706;
			@Pc(57) float local57 = local45 * (float) this.anInt2706;
			@Pc(63) float local63 = local25 * (float) this.anInt2712;
			@Pc(69) float local69 = local31 * (float) this.anInt2712;
			@Pc(76) float local76 = (float) this.anInt2702 * -local25;
			@Pc(83) float local83 = -local31 * (float) this.anInt2702;
			@Pc(90) float local90 = (float) this.anInt2710 * -local38;
			@Pc(97) float local97 = -local45 * (float) this.anInt2710;
			arg3 = arg3 + local83 + local57;
			arg2 = local76 + arg2 + local51;
			arg0 = local51 + local63 + arg0;
			arg1 = arg1 + local69 + local57;
			arg4 = local90 + arg4 + local63;
			arg5 = local97 + arg5 + local69;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass40_Sub3_Sub1_1.method5874(true);
		local18 = arg3 + arg5 - arg1;
		this.aClass134_Sub2_11.method5191();
		this.aClass134_Sub2_11.method5202(this.aClass40_Sub3_Sub1_1);
		this.aClass134_Sub2_11.method5194(1);
		this.aClass134_Sub2_11.method5197(1);
		this.aClass134_Sub2_11.method5202(local7);
		this.aClass134_Sub2_11.method5224(7681, 8448);
		this.aClass134_Sub2_11.method5200(0, 34168, 768);
		this.aClass134_Sub2_11.method5233(1);
		local25 = local7.aFloat161 / (float) local7.anInt6751;
		local31 = local7.aFloat162 / (float) local7.anInt6748;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass40_Sub3_Sub1_1.aFloat162);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg0 - (float) arg7), local7.aFloat162 - ((float) -arg8 + arg1) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg4) * local25, local7.aFloat162 - local31 * (arg5 - (float) arg8));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass40_Sub3_Sub1_1.aFloat161, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * (local14 - (float) arg7), local7.aFloat162 - ((float) -arg8 + local18) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass40_Sub3_Sub1_1.aFloat161, this.aClass40_Sub3_Sub1_1.aFloat162);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg2 - (float) arg7), local7.aFloat162 - local31 * (arg3 - (float) arg8));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass134_Sub2_11.method5200(0, 5890, 768);
		this.aClass134_Sub2_11.method5194(0);
		this.aClass134_Sub2_11.method5202(null);
		this.aClass134_Sub2_11.method5197(0);
	}

	@OriginalMember(owner = "client!fn", name = "A", descriptor = "()I")
	@Override
	public int A() {
		return this.anInt2702 + this.anInt2712 + this.aClass40_Sub3_Sub1_1.anInt6751;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB)V")
	private void method2154(@OriginalArg(0) int arg0) {
		this.aClass134_Sub2_11.method5197(1);
		this.aClass134_Sub2_11.method5202(this.aClass40_Sub3_Sub1_1);
		this.aClass134_Sub2_11.method5224(this.aClass134_Sub2_11.method5205(arg0), 7681);
		this.aClass134_Sub2_11.method5200(1, 34167, 768);
		this.aClass134_Sub2_11.method5271(34168, 0);
		this.aClass134_Sub2_11.method5197(0);
		this.aClass134_Sub2_11.method5202(this.aClass40_Sub3_Sub1_2);
		this.aClass134_Sub2_11.method5224(34479, 7681);
		this.aClass134_Sub2_11.method5200(1, 34166, 768);
		if (this.anInt2717 == 0) {
			this.aClass134_Sub2_11.method5247(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt2717 == 1) {
			this.aClass134_Sub2_11.method5247(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt2717 == 2) {
			this.aClass134_Sub2_11.method5247(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt2717 == 3) {
			this.aClass134_Sub2_11.method5247(128.5F, 128.5F, 0.0F, 128.5F);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method7663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class204 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class204_Sub1 local6 = (Class204_Sub1) arg2;
		@Pc(9) Class40_Sub3_Sub1 local9 = local6.aClass40_Sub3_Sub1_4;
		this.aClass40_Sub3_Sub1_1.method5874(false);
		this.aClass134_Sub2_11.method5191();
		this.aClass134_Sub2_11.method5202(this.aClass40_Sub3_Sub1_1);
		this.aClass134_Sub2_11.method5194(1);
		this.aClass134_Sub2_11.method5197(1);
		this.aClass134_Sub2_11.method5202(local9);
		this.aClass134_Sub2_11.method5224(7681, 8448);
		this.aClass134_Sub2_11.method5200(0, 34168, 768);
		this.aClass134_Sub2_11.method5233(1);
		@Pc(62) int local62 = arg1 + this.anInt2706;
		@Pc(67) int local67 = arg0 + this.anInt2712;
		@Pc(73) int local73 = local67 + this.aClass40_Sub3_Sub1_1.anInt6751;
		@Pc(79) int local79 = this.aClass40_Sub3_Sub1_1.anInt6748 + local62;
		@Pc(86) float local86 = local9.aFloat161 / (float) local9.anInt6751;
		@Pc(93) float local93 = local9.aFloat162 / (float) local9.anInt6748;
		@Pc(100) float local100 = (float) (local67 - arg3) * local86;
		@Pc(108) float local108 = (float) (local73 - arg3) * local86;
		@Pc(119) float local119 = local9.aFloat162 - local93 * (float) (local62 - arg4);
		@Pc(131) float local131 = local9.aFloat162 - (float) (local79 - arg4) * local93;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass40_Sub3_Sub1_1.aFloat162);
		OpenGL.glMultiTexCoord2f(33985, local100, local119);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local100, local131);
		OpenGL.glVertex2i(local67, local62 + this.aClass40_Sub3_Sub1_1.anInt6748);
		OpenGL.glMultiTexCoord2f(33984, this.aClass40_Sub3_Sub1_1.aFloat161, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local108, local131);
		OpenGL.glVertex2i(this.aClass40_Sub3_Sub1_1.anInt6751 + local67, this.aClass40_Sub3_Sub1_1.anInt6748 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass40_Sub3_Sub1_1.aFloat161, this.aClass40_Sub3_Sub1_1.aFloat162);
		OpenGL.glMultiTexCoord2f(33985, local108, local119);
		OpenGL.glVertex2i(this.aClass40_Sub3_Sub1_1.anInt6751 + local67, local62);
		OpenGL.glEnd();
		this.aClass134_Sub2_11.method5200(0, 5890, 768);
		this.aClass134_Sub2_11.method5194(0);
		this.aClass134_Sub2_11.method5202(null);
		this.aClass134_Sub2_11.method5197(0);
	}

	@OriginalMember(owner = "client!fn", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass40_Sub3_Sub1_2 = Static163.method2382(arg1, arg0, this.aClass40_Sub3_Sub1_1.anInt6751, this.aClass134_Sub2_11, this.aClass40_Sub3_Sub1_1.anInt6748);
		this.anInt2717 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!fn", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2712 = arg0;
		this.anInt2702 = arg2;
		this.anInt2710 = arg3;
		this.anInt2706 = arg1;
		this.aBoolean202 = this.anInt2712 != 0 || this.anInt2706 != 0 || this.anInt2702 != 0 || this.anInt2710 != 0;
	}

	@OriginalMember(owner = "client!fn", name = "ca", descriptor = "()I")
	@Override
	public int ca() {
		return this.anInt2710 + this.anInt2706 + this.aClass40_Sub3_Sub1_1.anInt6748;
	}

	@OriginalMember(owner = "client!fn", name = "YA", descriptor = "(IIIIIIII)V")
	@Override
	protected void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass40_Sub3_Sub1_1.method5874(true);
		this.aClass134_Sub2_11.method5191();
		this.aClass134_Sub2_11.method5233(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean202) {
			@Pc(48) float local48 = (float) arg2 / (float) this.A();
			@Pc(55) float local55 = (float) arg3 / (float) this.ca();
			@Pc(64) float local64 = (float) arg0 + local48 * (float) this.anInt2712;
			@Pc(73) float local73 = local55 * (float) this.anInt2706 + (float) arg1;
			@Pc(82) float local82 = local64 + local48 * (float) this.aClass40_Sub3_Sub1_1.anInt6751;
			@Pc(91) float local91 = local73 + (float) this.aClass40_Sub3_Sub1_1.anInt6748 * local55;
			if (this.aClass40_Sub3_Sub1_2 == null) {
				this.aClass134_Sub2_11.method5202(this.aClass40_Sub3_Sub1_1);
				this.aClass134_Sub2_11.method5194(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass40_Sub3_Sub1_1.aFloat162);
				OpenGL.glVertex2f(local64, local73);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local64, local91);
				OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_1.aFloat161, 0.0F);
				OpenGL.glVertex2f(local82, local91);
				OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_1.aFloat161, this.aClass40_Sub3_Sub1_1.aFloat162);
				OpenGL.glVertex2f(local82, local73);
				OpenGL.glEnd();
			} else {
				this.method2154(arg4);
				this.aClass40_Sub3_Sub1_2.method5874(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass40_Sub3_Sub1_1.aFloat162);
				OpenGL.glTexCoord2f(0.0F, this.aClass40_Sub3_Sub1_1.aFloat162);
				OpenGL.glVertex2f(local64, local73);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local64, local91);
				OpenGL.glMultiTexCoord2f(33985, this.aClass40_Sub3_Sub1_1.aFloat161, 0.0F);
				OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_1.aFloat161, 0.0F);
				OpenGL.glVertex2f(local82, local91);
				OpenGL.glMultiTexCoord2f(33985, this.aClass40_Sub3_Sub1_1.aFloat161, this.aClass40_Sub3_Sub1_1.aFloat162);
				OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_1.aFloat161, this.aClass40_Sub3_Sub1_1.aFloat162);
				OpenGL.glVertex2f(local82, local73);
				OpenGL.glEnd();
				this.method2155();
			}
		} else if (this.aClass40_Sub3_Sub1_2 == null) {
			this.aClass134_Sub2_11.method5202(this.aClass40_Sub3_Sub1_1);
			this.aClass134_Sub2_11.method5194(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass40_Sub3_Sub1_1.aFloat162);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_1.aFloat161, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
			OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_1.aFloat161, this.aClass40_Sub3_Sub1_1.aFloat162);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method2154(arg4);
			this.aClass40_Sub3_Sub1_2.method5874(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass40_Sub3_Sub1_1.aFloat162);
			OpenGL.glTexCoord2f(0.0F, this.aClass40_Sub3_Sub1_1.aFloat162);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass40_Sub3_Sub1_1.aFloat161, 0.0F);
			OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_1.aFloat161, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass40_Sub3_Sub1_1.aFloat161, this.aClass40_Sub3_Sub1_1.aFloat162);
			OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_1.aFloat161, this.aClass40_Sub3_Sub1_1.aFloat162);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method2155();
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
	private void method2155() {
		this.aClass134_Sub2_11.method5197(1);
		this.aClass134_Sub2_11.method5202(null);
		this.aClass134_Sub2_11.method5224(8448, 8448);
		this.aClass134_Sub2_11.method5200(1, 34168, 768);
		this.aClass134_Sub2_11.method5271(5890, 0);
		this.aClass134_Sub2_11.method5197(0);
		this.aClass134_Sub2_11.method5200(1, 34168, 768);
	}

	@OriginalMember(owner = "client!fn", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aClass40_Sub3_Sub1_1.anInt6748;
	}

	@OriginalMember(owner = "client!fn", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean202) {
			local6 = this.A();
			local10 = this.ca();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(24) float local24 = (arg3 - arg1) / local6;
			@Pc(31) float local31 = (arg4 - arg0) / local10;
			@Pc(38) float local38 = (arg5 - arg1) / local10;
			@Pc(44) float local44 = local31 * (float) this.anInt2706;
			@Pc(50) float local50 = local38 * (float) this.anInt2706;
			@Pc(56) float local56 = (float) this.anInt2712 * local17;
			@Pc(62) float local62 = local24 * (float) this.anInt2712;
			@Pc(69) float local69 = -local17 * (float) this.anInt2702;
			@Pc(76) float local76 = -local24 * (float) this.anInt2702;
			@Pc(83) float local83 = -local31 * (float) this.anInt2710;
			arg3 = local76 + arg3 + local50;
			arg0 = local44 + arg0 + local56;
			arg4 = local83 + local56 + arg4;
			arg1 = arg1 + local62 + local50;
			@Pc(114) float local114 = (float) this.anInt2710 * -local38;
			arg2 = local44 + local69 + arg2;
			arg5 = local62 + arg5 + local114;
		}
		local6 = arg2 + arg4 - arg0;
		local10 = arg5 + arg3 - arg1;
		this.aClass40_Sub3_Sub1_1.method5874(true);
		this.aClass134_Sub2_11.method5191();
		this.aClass134_Sub2_11.method5202(this.aClass40_Sub3_Sub1_1);
		this.aClass134_Sub2_11.method5233(arg8);
		this.aClass134_Sub2_11.method5194(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass40_Sub3_Sub1_1.aFloat162);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_1.aFloat161, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass40_Sub3_Sub1_1.aFloat161, this.aClass40_Sub3_Sub1_1.aFloat162);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!fn", name = "da", descriptor = "(IIIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass40_Sub3_Sub1_1.method5392(arg0, arg1, arg2, arg5, arg3, arg4);
	}
}
