import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class49_Sub2 extends Class49 {

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "Lclient!we;")
	private Class5_Sub1_Sub1 aClass5_Sub1_Sub1_5;

	@OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
	private int anInt7088 = 0;

	@OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
	private int anInt7091 = 0;

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
	private int anInt7094 = 0;

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
	private int anInt7086 = 0;

	@OriginalMember(owner = "client!vi", name = "w", descriptor = "Z")
	private boolean aBoolean588 = false;

	@OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
	private int anInt7093 = 0;

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "Lclient!od;")
	private final Class128_Sub2 aClass128_Sub2_41;

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "Lclient!we;")
	private final Class5_Sub1_Sub1 aClass5_Sub1_Sub1_4;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!od;IIII)V")
	public Class49_Sub2(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass128_Sub2_41 = arg0;
		this.aClass5_Sub1_Sub1_4 = Static37.method638(arg3, arg4, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!od;II[III)V")
	public Class49_Sub2(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass128_Sub2_41 = arg0;
		this.aClass5_Sub1_Sub1_4 = Static265.method3385(arg2, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IILclient!ea;II)V")
	@Override
	public void method5638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class59 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class59_Sub1 local6 = (Class59_Sub1) arg2;
		@Pc(9) Class5_Sub1_Sub1 local9 = local6.aClass5_Sub1_Sub1_1;
		this.aClass5_Sub1_Sub1_4.method5540(false);
		this.aClass128_Sub2_41.method3672();
		this.aClass128_Sub2_41.method3691(this.aClass5_Sub1_Sub1_4);
		this.aClass128_Sub2_41.method3677(1);
		this.aClass128_Sub2_41.method3667(1);
		this.aClass128_Sub2_41.method3691(local9);
		this.aClass128_Sub2_41.method3622(8448, 7681);
		this.aClass128_Sub2_41.method3647(34168, 768, 0);
		this.aClass128_Sub2_41.method3653(1);
		@Pc(62) int local62 = arg1 + this.anInt7094;
		@Pc(67) int local67 = arg0 + this.anInt7086;
		@Pc(73) int local73 = local67 + this.aClass5_Sub1_Sub1_4.anInt7347;
		@Pc(79) int local79 = local62 + this.aClass5_Sub1_Sub1_4.anInt7346;
		@Pc(86) float local86 = local9.aFloat98 / (float) local9.anInt7347;
		@Pc(93) float local93 = local9.aFloat100 / (float) local9.anInt7346;
		@Pc(101) float local101 = local86 * (float) (local67 - arg3);
		@Pc(109) float local109 = (float) (local73 - arg3) * local86;
		@Pc(121) float local121 = local9.aFloat100 - (float) (local62 - arg4) * local93;
		@Pc(132) float local132 = local9.aFloat100 - local93 * (float) (local79 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass5_Sub1_Sub1_4.aFloat100);
		OpenGL.glMultiTexCoord2f(33985, local101, local121);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local132);
		OpenGL.glVertex2i(local67, this.aClass5_Sub1_Sub1_4.anInt7346 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass5_Sub1_Sub1_4.aFloat98, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local132);
		OpenGL.glVertex2i(local67 + this.aClass5_Sub1_Sub1_4.anInt7347, local62 - -this.aClass5_Sub1_Sub1_4.anInt7346);
		OpenGL.glMultiTexCoord2f(33984, this.aClass5_Sub1_Sub1_4.aFloat98, this.aClass5_Sub1_Sub1_4.aFloat100);
		OpenGL.glMultiTexCoord2f(33985, local109, local121);
		OpenGL.glVertex2i(this.aClass5_Sub1_Sub1_4.anInt7347 + local67, local62);
		OpenGL.glEnd();
		this.aClass128_Sub2_41.method3647(5890, 768, 0);
		this.aClass128_Sub2_41.method3677(0);
		this.aClass128_Sub2_41.method3691(null);
		this.aClass128_Sub2_41.method3667(0);
	}

	@OriginalMember(owner = "client!vi", name = "qa", descriptor = "()I")
	@Override
	public int qa() {
		return this.aClass5_Sub1_Sub1_4.anInt7346;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)V")
	private void method5375(@OriginalArg(1) int arg0) {
		this.aClass128_Sub2_41.method3667(1);
		this.aClass128_Sub2_41.method3691(this.aClass5_Sub1_Sub1_4);
		this.aClass128_Sub2_41.method3622(7681, this.aClass128_Sub2_41.method3684(arg0));
		this.aClass128_Sub2_41.method3647(34167, 768, 1);
		this.aClass128_Sub2_41.method3626(0, 34168);
		this.aClass128_Sub2_41.method3667(0);
		this.aClass128_Sub2_41.method3691(this.aClass5_Sub1_Sub1_5);
		this.aClass128_Sub2_41.method3622(7681, 34479);
		this.aClass128_Sub2_41.method3647(34166, 768, 1);
		if (this.anInt7093 == 0) {
			this.aClass128_Sub2_41.method3661(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt7093 == 1) {
			this.aClass128_Sub2_41.method3661(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt7093 == 2) {
			this.aClass128_Sub2_41.method3661(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt7093 == 3) {
			this.aClass128_Sub2_41.method3661(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!vi", name = "UA", descriptor = "()I")
	@Override
	public int UA() {
		return this.aClass5_Sub1_Sub1_4.anInt7347;
	}

	@OriginalMember(owner = "client!vi", name = "M", descriptor = "(IIIIIII)V")
	@Override
	public void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass5_Sub1_Sub1_4.method5540(true);
		this.aClass128_Sub2_41.method3672();
		this.aClass128_Sub2_41.method3653(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean588) {
			@Pc(42) float local42 = (float) arg2 / (float) this.ja();
			@Pc(49) float local49 = (float) arg3 / (float) this.JA();
			@Pc(58) float local58 = (float) this.anInt7086 * local42 + (float) arg0;
			@Pc(67) float local67 = local49 * (float) this.anInt7094 + (float) arg1;
			@Pc(76) float local76 = (float) this.aClass5_Sub1_Sub1_4.anInt7347 * local42 + local58;
			@Pc(85) float local85 = local67 + (float) this.aClass5_Sub1_Sub1_4.anInt7346 * local49;
			if (this.aClass5_Sub1_Sub1_5 == null) {
				this.aClass128_Sub2_41.method3691(this.aClass5_Sub1_Sub1_4);
				this.aClass128_Sub2_41.method3677(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass5_Sub1_Sub1_4.aFloat100);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glTexCoord2f(this.aClass5_Sub1_Sub1_4.aFloat98, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glTexCoord2f(this.aClass5_Sub1_Sub1_4.aFloat98, this.aClass5_Sub1_Sub1_4.aFloat100);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
			} else {
				this.method5375(arg4);
				this.aClass5_Sub1_Sub1_5.method5540(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass5_Sub1_Sub1_4.aFloat100);
				OpenGL.glTexCoord2f(0.0F, this.aClass5_Sub1_Sub1_4.aFloat100);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass5_Sub1_Sub1_4.aFloat98, 0.0F);
				OpenGL.glTexCoord2f(this.aClass5_Sub1_Sub1_4.aFloat98, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass5_Sub1_Sub1_4.aFloat98, this.aClass5_Sub1_Sub1_4.aFloat100);
				OpenGL.glTexCoord2f(this.aClass5_Sub1_Sub1_4.aFloat98, this.aClass5_Sub1_Sub1_4.aFloat100);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
				this.method5378();
			}
		} else if (this.aClass5_Sub1_Sub1_5 == null) {
			this.aClass128_Sub2_41.method3691(this.aClass5_Sub1_Sub1_4);
			this.aClass128_Sub2_41.method3677(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass5_Sub1_Sub1_4.aFloat100);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass5_Sub1_Sub1_4.aFloat98, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass5_Sub1_Sub1_4.aFloat98, this.aClass5_Sub1_Sub1_4.aFloat100);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method5375(arg4);
			this.aClass5_Sub1_Sub1_5.method5540(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass5_Sub1_Sub1_4.aFloat100);
			OpenGL.glTexCoord2f(0.0F, this.aClass5_Sub1_Sub1_4.aFloat100);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass5_Sub1_Sub1_4.aFloat98, 0.0F);
			OpenGL.glTexCoord2f(this.aClass5_Sub1_Sub1_4.aFloat98, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass5_Sub1_Sub1_4.aFloat98, this.aClass5_Sub1_Sub1_4.aFloat100);
			OpenGL.glTexCoord2f(this.aClass5_Sub1_Sub1_4.aFloat98, this.aClass5_Sub1_Sub1_4.aFloat100);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method5378();
		}
	}

	@OriginalMember(owner = "client!vi", name = "aa", descriptor = "(FFFFFFIII)V")
	@Override
	protected void aa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean588) {
			local10 = this.ja();
			local14 = this.JA();
			@Pc(21) float local21 = (arg2 - arg0) / local10;
			@Pc(28) float local28 = (arg3 - arg1) / local10;
			@Pc(34) float local34 = (arg4 - arg0) / local14;
			@Pc(40) float local40 = (arg5 - arg1) / local14;
			@Pc(46) float local46 = (float) this.anInt7094 * local34;
			@Pc(52) float local52 = local40 * (float) this.anInt7094;
			@Pc(58) float local58 = local21 * (float) this.anInt7086;
			@Pc(64) float local64 = local28 * (float) this.anInt7086;
			@Pc(71) float local71 = (float) this.anInt7091 * -local21;
			@Pc(78) float local78 = (float) this.anInt7091 * -local28;
			@Pc(85) float local85 = -local34 * (float) this.anInt7088;
			arg1 = arg1 + local64 + local52;
			arg0 = local46 + local58 + arg0;
			arg3 = arg3 + local78 + local52;
			@Pc(110) float local110 = (float) this.anInt7088 * -local40;
			arg4 = local85 + local58 + arg4;
			arg2 = local46 + local71 + arg2;
			arg5 = local110 + arg5 + local64;
		}
		local10 = arg4 + arg2 - arg0;
		this.aClass5_Sub1_Sub1_4.method5540(true);
		local14 = arg5 + arg3 - arg1;
		this.aClass128_Sub2_41.method3672();
		this.aClass128_Sub2_41.method3691(this.aClass5_Sub1_Sub1_4);
		this.aClass128_Sub2_41.method3653(arg8);
		this.aClass128_Sub2_41.method3677(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass5_Sub1_Sub1_4.aFloat100);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass5_Sub1_Sub1_4.aFloat98, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass5_Sub1_Sub1_4.aFloat98, this.aClass5_Sub1_Sub1_4.aFloat100);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!vi", name = "ka", descriptor = "(IIII)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7086 = arg0;
		this.anInt7091 = arg2;
		this.anInt7094 = arg1;
		this.anInt7088 = arg3;
		this.aBoolean588 = this.anInt7086 != 0 || this.anInt7094 != 0 || this.anInt7091 != 0 || this.anInt7088 != 0;
	}

	@OriginalMember(owner = "client!vi", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass5_Sub1_Sub1_5 = Static37.method638(this.aClass5_Sub1_Sub1_4.anInt7347, this.aClass5_Sub1_Sub1_4.anInt7346, this.aClass128_Sub2_41, arg0, arg1);
		this.anInt7093 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!vi", name = "D", descriptor = "(IIIIIII)V")
	@Override
	public void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg0 + arg2;
		@Pc(14) int local14 = arg1 + arg3;
		this.aClass5_Sub1_Sub1_4.method5540(false);
		this.aClass128_Sub2_41.method3672();
		this.aClass128_Sub2_41.method3691(this.aClass5_Sub1_Sub1_4);
		this.aClass128_Sub2_41.method3653(arg6);
		this.aClass128_Sub2_41.method3677(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass5_Sub1_Sub1_4.aBoolean602 && !this.aBoolean588) {
			@Pc(73) float local73 = this.aClass5_Sub1_Sub1_4.aFloat100 * (float) arg3 / (float) this.aClass5_Sub1_Sub1_4.anInt7346;
			@Pc(85) float local85 = this.aClass5_Sub1_Sub1_4.aFloat98 * (float) arg2 / (float) this.aClass5_Sub1_Sub1_4.anInt7347;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local73);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local14);
			OpenGL.glTexCoord2f(local85, 0.0F);
			OpenGL.glVertex2i(local9, local14);
			OpenGL.glTexCoord2f(local85, local73);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt7086, (float) this.anInt7094, 0.0F);
		@Pc(125) int local125 = this.ja();
		@Pc(128) int local128 = this.JA();
		@Pc(135) int local135 = arg1 + this.aClass5_Sub1_Sub1_4.anInt7346;
		OpenGL.glBegin(7);
		@Pc(139) int local139 = arg1;
		@Pc(147) int local147;
		while (local135 <= local14) {
			local147 = this.aClass5_Sub1_Sub1_4.anInt7347 + arg0;
			@Pc(149) int local149 = arg0;
			while (local9 >= local147) {
				OpenGL.glTexCoord2f(0.0F, this.aClass5_Sub1_Sub1_4.aFloat100);
				OpenGL.glVertex2i(local149, local139);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local149, local135);
				OpenGL.glTexCoord2f(this.aClass5_Sub1_Sub1_4.aFloat98, 0.0F);
				OpenGL.glVertex2i(local147, local135);
				OpenGL.glTexCoord2f(this.aClass5_Sub1_Sub1_4.aFloat98, this.aClass5_Sub1_Sub1_4.aFloat100);
				OpenGL.glVertex2i(local147, local139);
				local147 += local125;
				local149 += local125;
			}
			if (local9 > local149) {
				@Pc(220) float local220 = (float) (local9 - local149) * this.aClass5_Sub1_Sub1_4.aFloat98 / (float) this.aClass5_Sub1_Sub1_4.anInt7347;
				OpenGL.glTexCoord2f(0.0F, this.aClass5_Sub1_Sub1_4.aFloat100);
				OpenGL.glVertex2i(local149, local139);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local149, local135);
				OpenGL.glTexCoord2f(local220, 0.0F);
				OpenGL.glVertex2i(local9, local135);
				OpenGL.glTexCoord2f(local220, this.aClass5_Sub1_Sub1_4.aFloat100);
				OpenGL.glVertex2i(local9, local139);
			}
			local139 += local128;
			local135 += local128;
		}
		if (local14 > local139) {
			@Pc(288) float local288 = this.aClass5_Sub1_Sub1_4.aFloat100 * (float) (local139 + this.aClass5_Sub1_Sub1_4.anInt7346 - local14) / (float) this.aClass5_Sub1_Sub1_4.anInt7346;
			@Pc(294) int local294 = this.aClass5_Sub1_Sub1_4.anInt7347 + arg0;
			local147 = arg0;
			while (local9 >= local294) {
				OpenGL.glTexCoord2f(0.0F, this.aClass5_Sub1_Sub1_4.aFloat100);
				OpenGL.glVertex2i(local147, local139);
				OpenGL.glTexCoord2f(0.0F, local288);
				OpenGL.glVertex2i(local147, local14);
				OpenGL.glTexCoord2f(this.aClass5_Sub1_Sub1_4.aFloat98, local288);
				OpenGL.glVertex2i(local294, local14);
				OpenGL.glTexCoord2f(this.aClass5_Sub1_Sub1_4.aFloat98, this.aClass5_Sub1_Sub1_4.aFloat100);
				OpenGL.glVertex2i(local294, local139);
				local294 += local125;
				local147 += local125;
			}
			if (local147 < local9) {
				@Pc(362) float local362 = (float) (local9 - local147) * this.aClass5_Sub1_Sub1_4.aFloat98 / (float) this.aClass5_Sub1_Sub1_4.anInt7347;
				OpenGL.glTexCoord2f(0.0F, this.aClass5_Sub1_Sub1_4.aFloat100);
				OpenGL.glVertex2i(local147, local139);
				OpenGL.glTexCoord2f(0.0F, local288);
				OpenGL.glVertex2i(local147, local14);
				OpenGL.glTexCoord2f(local362, local288);
				OpenGL.glVertex2i(local9, local14);
				OpenGL.glTexCoord2f(local362, this.aClass5_Sub1_Sub1_4.aFloat100);
				OpenGL.glVertex2i(local9, local139);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	private void method5378() {
		this.aClass128_Sub2_41.method3667(1);
		this.aClass128_Sub2_41.method3691(null);
		this.aClass128_Sub2_41.method3622(8448, 8448);
		this.aClass128_Sub2_41.method3647(34168, 768, 1);
		this.aClass128_Sub2_41.method3626(0, 5890);
		this.aClass128_Sub2_41.method3667(0);
		this.aClass128_Sub2_41.method3647(34168, 768, 1);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(FFFFFFLclient!ea;II)V")
	@Override
	protected void method5639(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class59 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class5_Sub1_Sub1 local7 = ((Class59_Sub1) arg6).aClass5_Sub1_Sub1_1;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(31) float local31;
		if (this.aBoolean588) {
			local14 = this.ja();
			local18 = this.JA();
			local24 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = local38 * (float) this.anInt7094;
			@Pc(56) float local56 = local44 * (float) this.anInt7094;
			@Pc(62) float local62 = local24 * (float) this.anInt7086;
			@Pc(68) float local68 = (float) this.anInt7086 * local31;
			@Pc(75) float local75 = -local24 * (float) this.anInt7091;
			@Pc(82) float local82 = -local31 * (float) this.anInt7091;
			@Pc(89) float local89 = (float) this.anInt7088 * -local38;
			arg1 = arg1 + local68 + local56;
			@Pc(102) float local102 = (float) this.anInt7088 * -local44;
			arg2 = local50 + arg2 + local75;
			arg4 = local89 + arg4 + local62;
			arg0 = local62 + arg0 + local50;
			arg3 = local56 + arg3 + local82;
			arg5 = arg5 + local68 + local102;
		}
		local14 = arg4 + arg2 - arg0;
		local18 = arg5 + arg3 - arg1;
		this.aClass5_Sub1_Sub1_4.method5540(true);
		this.aClass128_Sub2_41.method3672();
		this.aClass128_Sub2_41.method3691(this.aClass5_Sub1_Sub1_4);
		this.aClass128_Sub2_41.method3677(1);
		this.aClass128_Sub2_41.method3667(1);
		this.aClass128_Sub2_41.method3691(local7);
		this.aClass128_Sub2_41.method3622(8448, 7681);
		this.aClass128_Sub2_41.method3647(34168, 768, 0);
		this.aClass128_Sub2_41.method3653(1);
		local24 = local7.aFloat98 / (float) local7.anInt7347;
		local31 = local7.aFloat100 / (float) local7.anInt7346;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass5_Sub1_Sub1_4.aFloat100);
		OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * local24, local7.aFloat100 - (arg1 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * local24, local7.aFloat100 - local31 * (arg5 - (float) arg8));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass5_Sub1_Sub1_4.aFloat98, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (local14 - (float) arg7) * local24, local7.aFloat100 - local31 * (local18 - (float) arg8));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass5_Sub1_Sub1_4.aFloat98, this.aClass5_Sub1_Sub1_4.aFloat100);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg2 - (float) arg7), local7.aFloat100 - ((float) -arg8 + arg3) * local31);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass128_Sub2_41.method3647(5890, 768, 0);
		this.aClass128_Sub2_41.method3677(0);
		this.aClass128_Sub2_41.method3691(null);
		this.aClass128_Sub2_41.method3667(0);
	}

	@OriginalMember(owner = "client!vi", name = "ja", descriptor = "()I")
	@Override
	public int ja() {
		return this.anInt7091 + this.aClass5_Sub1_Sub1_4.anInt7347 + this.anInt7086;
	}

	@OriginalMember(owner = "client!vi", name = "W", descriptor = "(IIIIII)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass5_Sub1_Sub1_4.method5543(arg0, arg5, arg4, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!vi", name = "YA", descriptor = "(IIIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass5_Sub1_Sub1_4.method5540(false);
		this.aClass128_Sub2_41.method3672();
		this.aClass128_Sub2_41.method3653(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt7094;
		@Pc(42) int local42 = arg0 + this.anInt7086;
		if (this.aClass5_Sub1_Sub1_5 == null) {
			this.aClass128_Sub2_41.method3691(this.aClass5_Sub1_Sub1_4);
			this.aClass128_Sub2_41.method3677(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass5_Sub1_Sub1_4.aFloat100);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, local37 + this.aClass5_Sub1_Sub1_4.anInt7346);
			OpenGL.glTexCoord2f(this.aClass5_Sub1_Sub1_4.aFloat98, 0.0F);
			OpenGL.glVertex2i(this.aClass5_Sub1_Sub1_4.anInt7347 + local42, local37 + this.aClass5_Sub1_Sub1_4.anInt7346);
			OpenGL.glTexCoord2f(this.aClass5_Sub1_Sub1_4.aFloat98, this.aClass5_Sub1_Sub1_4.aFloat100);
			OpenGL.glVertex2i(local42 + this.aClass5_Sub1_Sub1_4.anInt7347, local37);
			OpenGL.glEnd();
			return;
		}
		this.method5375(arg2);
		this.aClass5_Sub1_Sub1_5.method5540(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass5_Sub1_Sub1_4.aFloat100);
		OpenGL.glTexCoord2f(0.0F, this.aClass5_Sub1_Sub1_4.aFloat100);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, local37 + this.aClass5_Sub1_Sub1_4.anInt7346);
		OpenGL.glMultiTexCoord2f(33985, this.aClass5_Sub1_Sub1_4.aFloat98, 0.0F);
		OpenGL.glTexCoord2f(this.aClass5_Sub1_Sub1_4.aFloat98, 0.0F);
		OpenGL.glVertex2i(local42 + this.aClass5_Sub1_Sub1_4.anInt7347, this.aClass5_Sub1_Sub1_4.anInt7346 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass5_Sub1_Sub1_4.aFloat98, this.aClass5_Sub1_Sub1_4.aFloat100);
		OpenGL.glTexCoord2f(this.aClass5_Sub1_Sub1_4.aFloat98, this.aClass5_Sub1_Sub1_4.aFloat100);
		OpenGL.glVertex2i(local42 + this.aClass5_Sub1_Sub1_4.anInt7347, local37);
		OpenGL.glEnd();
		this.method5378();
	}

	@OriginalMember(owner = "client!vi", name = "JA", descriptor = "()I")
	@Override
	public int JA() {
		return this.aClass5_Sub1_Sub1_4.anInt7346 + this.anInt7094 + this.anInt7088;
	}
}
