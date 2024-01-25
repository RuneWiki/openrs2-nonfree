import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "Lclient!wq;")
	private Class59_Sub3_Sub1 aClass59_Sub3_Sub1_1;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
	private int anInt692 = 0;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	private int anInt693 = 0;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
	private int anInt708 = 0;

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
	private int anInt703 = 0;

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
	private int anInt707 = 0;

	@OriginalMember(owner = "client!cc", name = "A", descriptor = "Lclient!vd;")
	private final Class51_Sub2 aClass51_Sub2_8;

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "Lclient!wq;")
	private final Class59_Sub3_Sub1 aClass59_Sub3_Sub1_2;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!vd;IIII)V")
	public Class11_Sub2(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass51_Sub2_8 = arg0;
		this.aClass59_Sub3_Sub1_2 = Static173.method2511(arg0, arg4, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!vd;II[III)V")
	public Class11_Sub2(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass51_Sub2_8 = arg0;
		this.aClass59_Sub3_Sub1_2 = Static355.method2951(arg0, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V")
	private void method587(@OriginalArg(1) int arg0) {
		this.aClass51_Sub2_8.method5371(1);
		this.aClass51_Sub2_8.method5364(this.aClass59_Sub3_Sub1_2);
		this.aClass51_Sub2_8.method5394(this.aClass51_Sub2_8.method5363(arg0), 7681);
		this.aClass51_Sub2_8.method5408(768, 34167, 1);
		this.aClass51_Sub2_8.method5374(34168, 0);
		this.aClass51_Sub2_8.method5371(0);
		this.aClass51_Sub2_8.method5364(this.aClass59_Sub3_Sub1_1);
		this.aClass51_Sub2_8.method5394(34479, 7681);
		this.aClass51_Sub2_8.method5408(768, 34166, 1);
		if (this.anInt703 == 0) {
			this.aClass51_Sub2_8.method5368(0.0F, 0.5F, 1.0F, 0.5F);
		} else if (this.anInt703 == 1) {
			this.aClass51_Sub2_8.method5368(0.0F, 0.5F, 0.5F, 1.0F);
		} else if (this.anInt703 == 2) {
			this.aClass51_Sub2_8.method5368(0.0F, 1.0F, 0.5F, 0.5F);
		} else if (this.anInt703 == 3) {
			this.aClass51_Sub2_8.method5368(0.0F, 128.5F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!cc", name = "JA", descriptor = "(IIIIIII)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg0 + arg2;
		@Pc(14) int local14 = arg1 + arg3;
		this.aClass59_Sub3_Sub1_2.method5760(false);
		this.aClass51_Sub2_8.method5379();
		this.aClass51_Sub2_8.method5364(this.aClass59_Sub3_Sub1_2);
		this.aClass51_Sub2_8.method5412(arg6);
		this.aClass51_Sub2_8.method5400(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass59_Sub3_Sub1_2.aBoolean508 && !this.aBoolean36) {
			@Pc(342) float local342 = (float) arg3 * this.aClass59_Sub3_Sub1_2.aFloat221 / (float) this.aClass59_Sub3_Sub1_2.anInt7494;
			@Pc(354) float local354 = this.aClass59_Sub3_Sub1_2.aFloat220 * (float) arg2 / (float) this.aClass59_Sub3_Sub1_2.anInt7491;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local342);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local14);
			OpenGL.glTexCoord2f(local354, 0.0F);
			OpenGL.glVertex2i(local9, local14);
			OpenGL.glTexCoord2f(local354, local342);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt708, (float) this.anInt692, 0.0F);
		@Pc(73) int local73 = this.j();
		@Pc(76) int local76 = this.T();
		@Pc(82) int local82 = this.aClass59_Sub3_Sub1_2.anInt7494 + arg1;
		OpenGL.glBegin(7);
		@Pc(86) int local86 = arg1;
		@Pc(94) int local94;
		while (local82 <= local14) {
			local94 = arg0 + this.aClass59_Sub3_Sub1_2.anInt7491;
			@Pc(96) int local96 = arg0;
			while (local94 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass59_Sub3_Sub1_2.aFloat221);
				OpenGL.glVertex2i(local96, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local96, local82);
				OpenGL.glTexCoord2f(this.aClass59_Sub3_Sub1_2.aFloat220, 0.0F);
				OpenGL.glVertex2i(local94, local82);
				OpenGL.glTexCoord2f(this.aClass59_Sub3_Sub1_2.aFloat220, this.aClass59_Sub3_Sub1_2.aFloat221);
				OpenGL.glVertex2i(local94, local86);
				local94 += local73;
				local96 += local73;
			}
			if (local9 > local96) {
				@Pc(163) float local163 = (float) (local9 - local96) * this.aClass59_Sub3_Sub1_2.aFloat220 / (float) this.aClass59_Sub3_Sub1_2.anInt7491;
				OpenGL.glTexCoord2f(0.0F, this.aClass59_Sub3_Sub1_2.aFloat221);
				OpenGL.glVertex2i(local96, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local96, local82);
				OpenGL.glTexCoord2f(local163, 0.0F);
				OpenGL.glVertex2i(local9, local82);
				OpenGL.glTexCoord2f(local163, this.aClass59_Sub3_Sub1_2.aFloat221);
				OpenGL.glVertex2i(local9, local86);
			}
			local86 += local76;
			local82 += local76;
		}
		if (local14 > local86) {
			@Pc(228) float local228 = (float) (this.aClass59_Sub3_Sub1_2.anInt7494 + local86 - local14) * this.aClass59_Sub3_Sub1_2.aFloat221 / (float) this.aClass59_Sub3_Sub1_2.anInt7494;
			@Pc(234) int local234 = this.aClass59_Sub3_Sub1_2.anInt7491 + arg0;
			local94 = arg0;
			while (local234 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass59_Sub3_Sub1_2.aFloat221);
				OpenGL.glVertex2i(local94, local86);
				OpenGL.glTexCoord2f(0.0F, local228);
				OpenGL.glVertex2i(local94, local14);
				OpenGL.glTexCoord2f(this.aClass59_Sub3_Sub1_2.aFloat220, local228);
				OpenGL.glVertex2i(local234, local14);
				OpenGL.glTexCoord2f(this.aClass59_Sub3_Sub1_2.aFloat220, this.aClass59_Sub3_Sub1_2.aFloat221);
				OpenGL.glVertex2i(local234, local86);
				local94 += local73;
				local234 += local73;
			}
			if (local9 > local94) {
				@Pc(299) float local299 = (float) (local9 - local94) * this.aClass59_Sub3_Sub1_2.aFloat220 / (float) this.aClass59_Sub3_Sub1_2.anInt7491;
				OpenGL.glTexCoord2f(0.0F, this.aClass59_Sub3_Sub1_2.aFloat221);
				OpenGL.glVertex2i(local94, local86);
				OpenGL.glTexCoord2f(0.0F, local228);
				OpenGL.glVertex2i(local94, local14);
				OpenGL.glTexCoord2f(local299, local228);
				OpenGL.glVertex2i(local9, local14);
				OpenGL.glTexCoord2f(local299, this.aClass59_Sub3_Sub1_2.aFloat221);
				OpenGL.glVertex2i(local9, local86);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!cc", name = "la", descriptor = "()I")
	@Override
	public int la() {
		return this.aClass59_Sub3_Sub1_2.anInt7491;
	}

	@OriginalMember(owner = "client!cc", name = "BA", descriptor = "(III)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass59_Sub3_Sub1_1 = Static173.method2511(this.aClass51_Sub2_8, this.aClass59_Sub3_Sub1_2.anInt7494, arg1, arg0, this.aClass59_Sub3_Sub1_2.anInt7491);
		this.anInt703 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(FFFFFFLclient!ma;II)V")
	@Override
	protected void method4395(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class119 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class59_Sub3_Sub1 local7 = ((Class119_Sub2) arg6).aClass59_Sub3_Sub1_3;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(32) float local32;
		if (this.aBoolean36) {
			local14 = this.j();
			local18 = this.T();
			local25 = (arg2 - arg0) / local14;
			local32 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = (float) this.anInt692 * local38;
			@Pc(56) float local56 = local44 * (float) this.anInt692;
			@Pc(62) float local62 = (float) this.anInt708 * local25;
			@Pc(68) float local68 = (float) this.anInt708 * local32;
			@Pc(75) float local75 = (float) this.anInt707 * -local25;
			@Pc(82) float local82 = -local32 * (float) this.anInt707;
			@Pc(89) float local89 = (float) this.anInt693 * -local38;
			arg3 = local56 + arg3 + local82;
			arg2 = local75 + arg2 + local50;
			arg4 = arg4 + local62 + local89;
			@Pc(114) float local114 = (float) this.anInt693 * -local44;
			arg0 = arg0 + local62 + local50;
			arg1 = local68 + arg1 + local56;
			arg5 = local114 + arg5 + local68;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass59_Sub3_Sub1_2.method5760(true);
		local18 = arg3 + arg5 - arg1;
		this.aClass51_Sub2_8.method5379();
		this.aClass51_Sub2_8.method5364(this.aClass59_Sub3_Sub1_2);
		this.aClass51_Sub2_8.method5400(1);
		this.aClass51_Sub2_8.method5371(1);
		this.aClass51_Sub2_8.method5364(local7);
		this.aClass51_Sub2_8.method5394(7681, 8448);
		this.aClass51_Sub2_8.method5408(768, 34168, 0);
		this.aClass51_Sub2_8.method5412(1);
		local25 = local7.aFloat220 / (float) local7.anInt7491;
		local32 = local7.aFloat221 / (float) local7.anInt7494;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass59_Sub3_Sub1_2.aFloat221);
		OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * local25, local7.aFloat221 - local32 * ((float) -arg8 + arg1));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg4) * local25, local7.aFloat221 - local32 * ((float) -arg8 + arg5));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass59_Sub3_Sub1_2.aFloat220, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + local14) * local25, local7.aFloat221 - ((float) -arg8 + local18) * local32);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass59_Sub3_Sub1_2.aFloat220, this.aClass59_Sub3_Sub1_2.aFloat221);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg2 - (float) arg7), local7.aFloat221 - ((float) -arg8 + arg3) * local32);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass51_Sub2_8.method5408(768, 5890, 0);
		this.aClass51_Sub2_8.method5400(0);
		this.aClass51_Sub2_8.method5364(null);
		this.aClass51_Sub2_8.method5371(0);
	}

	@OriginalMember(owner = "client!cc", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		return this.aClass59_Sub3_Sub1_2.anInt7494;
	}

	@OriginalMember(owner = "client!cc", name = "MA", descriptor = "(IIII)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt693 = arg3;
		this.anInt708 = arg0;
		this.anInt707 = arg2;
		this.anInt692 = arg1;
		this.aBoolean36 = this.anInt708 != 0 || this.anInt692 != 0 || this.anInt707 != 0 || this.anInt693 != 0;
	}

	@OriginalMember(owner = "client!cc", name = "T", descriptor = "()I")
	@Override
	public int T() {
		return this.aClass59_Sub3_Sub1_2.anInt7494 + this.anInt692 + this.anInt693;
	}

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "()I")
	@Override
	public int j() {
		return this.anInt707 + this.aClass59_Sub3_Sub1_2.anInt7491 + this.anInt708;
	}

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "(IIIIIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass59_Sub3_Sub1_2.method5760(true);
		this.aClass51_Sub2_8.method5379();
		this.aClass51_Sub2_8.method5412(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean36) {
			@Pc(42) float local42 = (float) arg2 / (float) this.j();
			@Pc(49) float local49 = (float) arg3 / (float) this.T();
			@Pc(58) float local58 = (float) this.anInt708 * local42 + (float) arg0;
			@Pc(67) float local67 = local49 * (float) this.anInt692 + (float) arg1;
			@Pc(76) float local76 = local42 * (float) this.aClass59_Sub3_Sub1_2.anInt7491 + local58;
			@Pc(85) float local85 = local67 + local49 * (float) this.aClass59_Sub3_Sub1_2.anInt7494;
			if (this.aClass59_Sub3_Sub1_1 == null) {
				this.aClass51_Sub2_8.method5364(this.aClass59_Sub3_Sub1_2);
				this.aClass51_Sub2_8.method5400(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass59_Sub3_Sub1_2.aFloat221);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glTexCoord2f(this.aClass59_Sub3_Sub1_2.aFloat220, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glTexCoord2f(this.aClass59_Sub3_Sub1_2.aFloat220, this.aClass59_Sub3_Sub1_2.aFloat221);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
			} else {
				this.method587(arg4);
				this.aClass59_Sub3_Sub1_1.method5760(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass59_Sub3_Sub1_2.aFloat221);
				OpenGL.glTexCoord2f(0.0F, this.aClass59_Sub3_Sub1_2.aFloat221);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass59_Sub3_Sub1_2.aFloat220, 0.0F);
				OpenGL.glTexCoord2f(this.aClass59_Sub3_Sub1_2.aFloat220, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass59_Sub3_Sub1_2.aFloat220, this.aClass59_Sub3_Sub1_2.aFloat221);
				OpenGL.glTexCoord2f(this.aClass59_Sub3_Sub1_2.aFloat220, this.aClass59_Sub3_Sub1_2.aFloat221);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
				this.method590();
			}
		} else if (this.aClass59_Sub3_Sub1_1 == null) {
			this.aClass51_Sub2_8.method5364(this.aClass59_Sub3_Sub1_2);
			this.aClass51_Sub2_8.method5400(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass59_Sub3_Sub1_2.aFloat221);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass59_Sub3_Sub1_2.aFloat220, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass59_Sub3_Sub1_2.aFloat220, this.aClass59_Sub3_Sub1_2.aFloat221);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method587(arg4);
			this.aClass59_Sub3_Sub1_1.method5760(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass59_Sub3_Sub1_2.aFloat221);
			OpenGL.glTexCoord2f(0.0F, this.aClass59_Sub3_Sub1_2.aFloat221);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass59_Sub3_Sub1_2.aFloat220, 0.0F);
			OpenGL.glTexCoord2f(this.aClass59_Sub3_Sub1_2.aFloat220, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg1 - -arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass59_Sub3_Sub1_2.aFloat220, this.aClass59_Sub3_Sub1_2.aFloat221);
			OpenGL.glTexCoord2f(this.aClass59_Sub3_Sub1_2.aFloat220, this.aClass59_Sub3_Sub1_2.aFloat221);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method590();
		}
	}

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "(IIIIII)V")
	@Override
	public void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass59_Sub3_Sub1_2.method5766(arg1, arg2, arg4, arg0, arg5, arg3);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected void a(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean36) {
			local10 = this.j();
			local14 = this.T();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			@Pc(26) float local26 = (arg3 - arg1) / local10;
			@Pc(32) float local32 = (arg4 - arg0) / local14;
			@Pc(38) float local38 = (arg5 - arg1) / local14;
			@Pc(44) float local44 = (float) this.anInt692 * local32;
			@Pc(50) float local50 = local38 * (float) this.anInt692;
			@Pc(56) float local56 = local20 * (float) this.anInt708;
			@Pc(62) float local62 = (float) this.anInt708 * local26;
			@Pc(69) float local69 = -local20 * (float) this.anInt707;
			@Pc(76) float local76 = (float) this.anInt707 * -local26;
			@Pc(83) float local83 = -local32 * (float) this.anInt693;
			@Pc(90) float local90 = -local38 * (float) this.anInt693;
			arg1 = local62 + arg1 + local50;
			arg3 = local50 + arg3 + local76;
			arg4 = local83 + arg4 + local56;
			arg2 = local44 + arg2 + local69;
			arg0 = local44 + local56 + arg0;
			arg5 = arg5 + local62 + local90;
		}
		local10 = arg2 + arg4 - arg0;
		local14 = arg5 + arg3 - arg1;
		this.aClass59_Sub3_Sub1_2.method5760(true);
		this.aClass51_Sub2_8.method5379();
		this.aClass51_Sub2_8.method5364(this.aClass59_Sub3_Sub1_2);
		this.aClass51_Sub2_8.method5412(arg8);
		this.aClass51_Sub2_8.method5400(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass59_Sub3_Sub1_2.aFloat221);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass59_Sub3_Sub1_2.aFloat220, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass59_Sub3_Sub1_2.aFloat220, this.aClass59_Sub3_Sub1_2.aFloat221);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILclient!ma;II)V")
	@Override
	public void method4396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class119 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class119_Sub2 local6 = (Class119_Sub2) arg2;
		@Pc(9) Class59_Sub3_Sub1 local9 = local6.aClass59_Sub3_Sub1_3;
		this.aClass59_Sub3_Sub1_2.method5760(false);
		this.aClass51_Sub2_8.method5379();
		this.aClass51_Sub2_8.method5364(this.aClass59_Sub3_Sub1_2);
		this.aClass51_Sub2_8.method5400(1);
		this.aClass51_Sub2_8.method5371(1);
		this.aClass51_Sub2_8.method5364(local9);
		this.aClass51_Sub2_8.method5394(7681, 8448);
		this.aClass51_Sub2_8.method5408(768, 34168, 0);
		this.aClass51_Sub2_8.method5412(1);
		@Pc(62) int local62 = arg0 + this.anInt708;
		@Pc(67) int local67 = arg1 + this.anInt692;
		@Pc(73) int local73 = local62 + this.aClass59_Sub3_Sub1_2.anInt7491;
		@Pc(80) int local80 = local67 + this.aClass59_Sub3_Sub1_2.anInt7494;
		@Pc(87) float local87 = local9.aFloat220 / (float) local9.anInt7491;
		@Pc(94) float local94 = local9.aFloat221 / (float) local9.anInt7494;
		@Pc(102) float local102 = (float) (local62 - arg3) * local87;
		@Pc(110) float local110 = local87 * (float) (local73 - arg3);
		@Pc(120) float local120 = local9.aFloat221 - local94 * (float) (local67 - arg4);
		@Pc(131) float local131 = local9.aFloat221 - local94 * (float) (local80 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass59_Sub3_Sub1_2.aFloat221);
		OpenGL.glMultiTexCoord2f(33985, local102, local120);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local131);
		OpenGL.glVertex2i(local62, this.aClass59_Sub3_Sub1_2.anInt7494 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass59_Sub3_Sub1_2.aFloat220, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local131);
		OpenGL.glVertex2i(local62 + this.aClass59_Sub3_Sub1_2.anInt7491, local67 - -this.aClass59_Sub3_Sub1_2.anInt7494);
		OpenGL.glMultiTexCoord2f(33984, this.aClass59_Sub3_Sub1_2.aFloat220, this.aClass59_Sub3_Sub1_2.aFloat221);
		OpenGL.glMultiTexCoord2f(33985, local110, local120);
		OpenGL.glVertex2i(this.aClass59_Sub3_Sub1_2.anInt7491 + local62, local67);
		OpenGL.glEnd();
		this.aClass51_Sub2_8.method5408(768, 5890, 0);
		this.aClass51_Sub2_8.method5400(0);
		this.aClass51_Sub2_8.method5364(null);
		this.aClass51_Sub2_8.method5371(0);
	}

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "(IIIII)V")
	@Override
	public void r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass59_Sub3_Sub1_2.method5760(false);
		this.aClass51_Sub2_8.method5379();
		this.aClass51_Sub2_8.method5412(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt708;
		@Pc(42) int local42 = arg1 + this.anInt692;
		if (this.aClass59_Sub3_Sub1_1 == null) {
			this.aClass51_Sub2_8.method5364(this.aClass59_Sub3_Sub1_2);
			this.aClass51_Sub2_8.method5400(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass59_Sub3_Sub1_2.aFloat221);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass59_Sub3_Sub1_2.anInt7494 + local42);
			OpenGL.glTexCoord2f(this.aClass59_Sub3_Sub1_2.aFloat220, 0.0F);
			OpenGL.glVertex2i(this.aClass59_Sub3_Sub1_2.anInt7491 + local37, local42 + this.aClass59_Sub3_Sub1_2.anInt7494);
			OpenGL.glTexCoord2f(this.aClass59_Sub3_Sub1_2.aFloat220, this.aClass59_Sub3_Sub1_2.aFloat221);
			OpenGL.glVertex2i(local37 + this.aClass59_Sub3_Sub1_2.anInt7491, local42);
			OpenGL.glEnd();
			return;
		}
		this.method587(arg2);
		this.aClass59_Sub3_Sub1_1.method5760(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass59_Sub3_Sub1_2.aFloat221);
		OpenGL.glTexCoord2f(0.0F, this.aClass59_Sub3_Sub1_2.aFloat221);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, local42 + this.aClass59_Sub3_Sub1_2.anInt7494);
		OpenGL.glMultiTexCoord2f(33985, this.aClass59_Sub3_Sub1_2.aFloat220, 0.0F);
		OpenGL.glTexCoord2f(this.aClass59_Sub3_Sub1_2.aFloat220, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass59_Sub3_Sub1_2.anInt7491, local42 + this.aClass59_Sub3_Sub1_2.anInt7494);
		OpenGL.glMultiTexCoord2f(33985, this.aClass59_Sub3_Sub1_2.aFloat220, this.aClass59_Sub3_Sub1_2.aFloat221);
		OpenGL.glTexCoord2f(this.aClass59_Sub3_Sub1_2.aFloat220, this.aClass59_Sub3_Sub1_2.aFloat221);
		OpenGL.glVertex2i(local37 + this.aClass59_Sub3_Sub1_2.anInt7491, local42);
		OpenGL.glEnd();
		this.method590();
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
	private void method590() {
		this.aClass51_Sub2_8.method5371(1);
		this.aClass51_Sub2_8.method5364(null);
		this.aClass51_Sub2_8.method5394(8448, 8448);
		this.aClass51_Sub2_8.method5408(768, 34168, 1);
		this.aClass51_Sub2_8.method5374(5890, 0);
		this.aClass51_Sub2_8.method5371(0);
		this.aClass51_Sub2_8.method5408(768, 34168, 1);
	}
}
