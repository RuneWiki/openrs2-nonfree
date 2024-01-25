import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class104_Sub2 extends Class104 {

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "Lclient!wo;")
	private Class164_Sub3_Sub1 aClass164_Sub3_Sub1_3;

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
	private int anInt4895 = 0;

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
	private int anInt4902 = 0;

	@OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
	private int anInt4905 = 0;

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
	private int anInt4907 = 0;

	@OriginalMember(owner = "client!kk", name = "z", descriptor = "Z")
	private boolean aBoolean370 = false;

	@OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
	private int anInt4914 = 0;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "Lclient!mh;")
	private final Class4_Sub3 aClass4_Sub3_23;

	@OriginalMember(owner = "client!kk", name = "x", descriptor = "Lclient!wo;")
	private final Class164_Sub3_Sub1 aClass164_Sub3_Sub1_4;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!mh;IIII)V")
	public Class104_Sub2(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass4_Sub3_23 = arg0;
		this.aClass164_Sub3_Sub1_4 = Static277.method4871(arg0, arg4, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!mh;II[III)V")
	public Class104_Sub2(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass4_Sub3_23 = arg0;
		this.aClass164_Sub3_Sub1_4 = Static413.method6509(arg1, arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!kk", name = "BA", descriptor = "(III)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass164_Sub3_Sub1_3 = Static277.method4871(this.aClass4_Sub3_23, this.aClass164_Sub3_Sub1_4.anInt9477, arg0, arg1, this.aClass164_Sub3_Sub1_4.anInt9484);
		this.anInt4907 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!kk", name = "ra", descriptor = "(IIIIIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass164_Sub3_Sub1_4.method8154(true);
		this.aClass4_Sub3_23.method5267();
		this.aClass4_Sub3_23.method5225(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean370) {
			@Pc(180) float local180 = (float) arg2 / (float) this.EA();
			@Pc(187) float local187 = (float) arg3 / (float) this.ma();
			@Pc(196) float local196 = local180 * (float) this.anInt4905 + (float) arg0;
			@Pc(205) float local205 = (float) arg1 + local187 * (float) this.anInt4902;
			@Pc(214) float local214 = local196 + local180 * (float) this.aClass164_Sub3_Sub1_4.anInt9484;
			@Pc(223) float local223 = local187 * (float) this.aClass164_Sub3_Sub1_4.anInt9477 + local205;
			if (this.aClass164_Sub3_Sub1_3 == null) {
				this.aClass4_Sub3_23.method5250(this.aClass164_Sub3_Sub1_4);
				this.aClass4_Sub3_23.method5230(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass164_Sub3_Sub1_4.aFloat192);
				OpenGL.glVertex2f(local196, local205);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local196, local223);
				OpenGL.glTexCoord2f(this.aClass164_Sub3_Sub1_4.aFloat191, 0.0F);
				OpenGL.glVertex2f(local214, local223);
				OpenGL.glTexCoord2f(this.aClass164_Sub3_Sub1_4.aFloat191, this.aClass164_Sub3_Sub1_4.aFloat192);
				OpenGL.glVertex2f(local214, local205);
				OpenGL.glEnd();
			} else {
				this.method4531(arg4);
				this.aClass164_Sub3_Sub1_3.method8154(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass164_Sub3_Sub1_4.aFloat192);
				OpenGL.glTexCoord2f(0.0F, this.aClass164_Sub3_Sub1_4.aFloat192);
				OpenGL.glVertex2f(local196, local205);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local196, local223);
				OpenGL.glMultiTexCoord2f(33985, this.aClass164_Sub3_Sub1_4.aFloat191, 0.0F);
				OpenGL.glTexCoord2f(this.aClass164_Sub3_Sub1_4.aFloat191, 0.0F);
				OpenGL.glVertex2f(local214, local223);
				OpenGL.glMultiTexCoord2f(33985, this.aClass164_Sub3_Sub1_4.aFloat191, this.aClass164_Sub3_Sub1_4.aFloat192);
				OpenGL.glTexCoord2f(this.aClass164_Sub3_Sub1_4.aFloat191, this.aClass164_Sub3_Sub1_4.aFloat192);
				OpenGL.glVertex2f(local214, local205);
				OpenGL.glEnd();
				this.method4530();
			}
		} else if (this.aClass164_Sub3_Sub1_3 == null) {
			this.aClass4_Sub3_23.method5250(this.aClass164_Sub3_Sub1_4);
			this.aClass4_Sub3_23.method5230(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass164_Sub3_Sub1_4.aFloat192);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass164_Sub3_Sub1_4.aFloat191, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass164_Sub3_Sub1_4.aFloat191, this.aClass164_Sub3_Sub1_4.aFloat192);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method4531(arg4);
			this.aClass164_Sub3_Sub1_3.method8154(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass164_Sub3_Sub1_4.aFloat192);
			OpenGL.glTexCoord2f(0.0F, this.aClass164_Sub3_Sub1_4.aFloat192);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass164_Sub3_Sub1_4.aFloat191, 0.0F);
			OpenGL.glTexCoord2f(this.aClass164_Sub3_Sub1_4.aFloat191, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass164_Sub3_Sub1_4.aFloat191, this.aClass164_Sub3_Sub1_4.aFloat192);
			OpenGL.glTexCoord2f(this.aClass164_Sub3_Sub1_4.aFloat191, this.aClass164_Sub3_Sub1_4.aFloat192);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method4530();
		}
	}

	@OriginalMember(owner = "client!kk", name = "DA", descriptor = "(IIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass164_Sub3_Sub1_4.method8154(false);
		this.aClass4_Sub3_23.method5267();
		this.aClass4_Sub3_23.method5225(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt4905;
		@Pc(42) int local42 = arg1 + this.anInt4902;
		if (this.aClass164_Sub3_Sub1_3 == null) {
			this.aClass4_Sub3_23.method5250(this.aClass164_Sub3_Sub1_4);
			this.aClass4_Sub3_23.method5230(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass164_Sub3_Sub1_4.aFloat192);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass164_Sub3_Sub1_4.anInt9477 + local42);
			OpenGL.glTexCoord2f(this.aClass164_Sub3_Sub1_4.aFloat191, 0.0F);
			OpenGL.glVertex2i(this.aClass164_Sub3_Sub1_4.anInt9484 + local37, this.aClass164_Sub3_Sub1_4.anInt9477 + local42);
			OpenGL.glTexCoord2f(this.aClass164_Sub3_Sub1_4.aFloat191, this.aClass164_Sub3_Sub1_4.aFloat192);
			OpenGL.glVertex2i(this.aClass164_Sub3_Sub1_4.anInt9484 + local37, local42);
			OpenGL.glEnd();
			return;
		}
		this.method4531(arg2);
		this.aClass164_Sub3_Sub1_3.method8154(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass164_Sub3_Sub1_4.aFloat192);
		OpenGL.glTexCoord2f(0.0F, this.aClass164_Sub3_Sub1_4.aFloat192);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, local42 + this.aClass164_Sub3_Sub1_4.anInt9477);
		OpenGL.glMultiTexCoord2f(33985, this.aClass164_Sub3_Sub1_4.aFloat191, 0.0F);
		OpenGL.glTexCoord2f(this.aClass164_Sub3_Sub1_4.aFloat191, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass164_Sub3_Sub1_4.anInt9484, this.aClass164_Sub3_Sub1_4.anInt9477 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass164_Sub3_Sub1_4.aFloat191, this.aClass164_Sub3_Sub1_4.aFloat192);
		OpenGL.glTexCoord2f(this.aClass164_Sub3_Sub1_4.aFloat191, this.aClass164_Sub3_Sub1_4.aFloat192);
		OpenGL.glVertex2i(this.aClass164_Sub3_Sub1_4.anInt9484 + local37, local42);
		OpenGL.glEnd();
		this.method4530();
	}

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "(IIIIIII)V")
	@Override
	public void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		this.aClass164_Sub3_Sub1_4.method8154(false);
		@Pc(18) int local18 = arg3 + arg1;
		this.aClass4_Sub3_23.method5267();
		this.aClass4_Sub3_23.method5250(this.aClass164_Sub3_Sub1_4);
		this.aClass4_Sub3_23.method5225(arg6);
		this.aClass4_Sub3_23.method5230(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass164_Sub3_Sub1_4.aBoolean707 && !this.aBoolean370) {
			@Pc(344) float local344 = (float) arg3 * this.aClass164_Sub3_Sub1_4.aFloat192 / (float) this.aClass164_Sub3_Sub1_4.anInt9477;
			@Pc(356) float local356 = (float) arg2 * this.aClass164_Sub3_Sub1_4.aFloat191 / (float) this.aClass164_Sub3_Sub1_4.anInt9484;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local344);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local18);
			OpenGL.glTexCoord2f(local356, 0.0F);
			OpenGL.glVertex2i(local9, local18);
			OpenGL.glTexCoord2f(local356, local344);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt4905, (float) this.anInt4902, 0.0F);
		@Pc(72) int local72 = this.EA();
		@Pc(75) int local75 = this.ma();
		@Pc(81) int local81 = this.aClass164_Sub3_Sub1_4.anInt9477 + arg1;
		OpenGL.glBegin(7);
		@Pc(85) int local85 = arg1;
		@Pc(93) int local93;
		while (local18 >= local81) {
			local93 = this.aClass164_Sub3_Sub1_4.anInt9484 + arg0;
			@Pc(95) int local95 = arg0;
			while (local9 >= local93) {
				OpenGL.glTexCoord2f(0.0F, this.aClass164_Sub3_Sub1_4.aFloat192);
				OpenGL.glVertex2i(local95, local85);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local95, local81);
				OpenGL.glTexCoord2f(this.aClass164_Sub3_Sub1_4.aFloat191, 0.0F);
				OpenGL.glVertex2i(local93, local81);
				OpenGL.glTexCoord2f(this.aClass164_Sub3_Sub1_4.aFloat191, this.aClass164_Sub3_Sub1_4.aFloat192);
				OpenGL.glVertex2i(local93, local85);
				local93 += local72;
				local95 += local72;
			}
			if (local95 < local9) {
				@Pc(165) float local165 = (float) (local9 - local95) * this.aClass164_Sub3_Sub1_4.aFloat191 / (float) this.aClass164_Sub3_Sub1_4.anInt9484;
				OpenGL.glTexCoord2f(0.0F, this.aClass164_Sub3_Sub1_4.aFloat192);
				OpenGL.glVertex2i(local95, local85);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local95, local81);
				OpenGL.glTexCoord2f(local165, 0.0F);
				OpenGL.glVertex2i(local9, local81);
				OpenGL.glTexCoord2f(local165, this.aClass164_Sub3_Sub1_4.aFloat192);
				OpenGL.glVertex2i(local9, local85);
			}
			local81 += local75;
			local85 += local75;
		}
		if (local85 < local18) {
			@Pc(226) float local226 = (float) (this.aClass164_Sub3_Sub1_4.anInt9477 + local85 - local18) * this.aClass164_Sub3_Sub1_4.aFloat192 / (float) this.aClass164_Sub3_Sub1_4.anInt9477;
			@Pc(232) int local232 = this.aClass164_Sub3_Sub1_4.anInt9484 + arg0;
			local93 = arg0;
			while (local232 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass164_Sub3_Sub1_4.aFloat192);
				OpenGL.glVertex2i(local93, local85);
				OpenGL.glTexCoord2f(0.0F, local226);
				OpenGL.glVertex2i(local93, local18);
				OpenGL.glTexCoord2f(this.aClass164_Sub3_Sub1_4.aFloat191, local226);
				OpenGL.glVertex2i(local232, local18);
				OpenGL.glTexCoord2f(this.aClass164_Sub3_Sub1_4.aFloat191, this.aClass164_Sub3_Sub1_4.aFloat192);
				OpenGL.glVertex2i(local232, local85);
				local93 += local72;
				local232 += local72;
			}
			if (local9 > local93) {
				@Pc(301) float local301 = (float) (local9 - local93) * this.aClass164_Sub3_Sub1_4.aFloat191 / (float) this.aClass164_Sub3_Sub1_4.anInt9484;
				OpenGL.glTexCoord2f(0.0F, this.aClass164_Sub3_Sub1_4.aFloat192);
				OpenGL.glVertex2i(local93, local85);
				OpenGL.glTexCoord2f(0.0F, local226);
				OpenGL.glVertex2i(local93, local18);
				OpenGL.glTexCoord2f(local301, local226);
				OpenGL.glVertex2i(local9, local18);
				OpenGL.glTexCoord2f(local301, this.aClass164_Sub3_Sub1_4.aFloat192);
				OpenGL.glVertex2i(local9, local85);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V")
	private void method4530() {
		this.aClass4_Sub3_23.method5245(1);
		this.aClass4_Sub3_23.method5250(null);
		this.aClass4_Sub3_23.method5266(8448, 8448);
		this.aClass4_Sub3_23.method5293(1, 768, 34168);
		this.aClass4_Sub3_23.method5265(0, 5890);
		this.aClass4_Sub3_23.method5245(0);
		this.aClass4_Sub3_23.method5293(1, 768, 34168);
	}

	@OriginalMember(owner = "client!kk", name = "CA", descriptor = "(FFFFFFIII)V")
	@Override
	protected void CA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean370) {
			local6 = this.EA();
			local10 = this.ma();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(35) float local35 = (arg5 - arg1) / local10;
			@Pc(41) float local41 = local29 * (float) this.anInt4902;
			@Pc(47) float local47 = (float) this.anInt4902 * local35;
			@Pc(53) float local53 = local17 * (float) this.anInt4905;
			@Pc(59) float local59 = local23 * (float) this.anInt4905;
			@Pc(66) float local66 = -local17 * (float) this.anInt4895;
			@Pc(73) float local73 = (float) this.anInt4895 * -local23;
			@Pc(80) float local80 = (float) this.anInt4914 * -local29;
			arg4 = local80 + local53 + arg4;
			arg0 = local53 + arg0 + local41;
			arg1 = local47 + arg1 + local59;
			@Pc(105) float local105 = -local35 * (float) this.anInt4914;
			arg3 = local47 + arg3 + local73;
			arg2 = local41 + arg2 + local66;
			arg5 = local105 + local59 + arg5;
		}
		local6 = arg2 + arg4 - arg0;
		this.aClass164_Sub3_Sub1_4.method8154(true);
		local10 = arg5 + arg3 - arg1;
		this.aClass4_Sub3_23.method5267();
		this.aClass4_Sub3_23.method5250(this.aClass164_Sub3_Sub1_4);
		this.aClass4_Sub3_23.method5225(arg8);
		this.aClass4_Sub3_23.method5230(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass164_Sub3_Sub1_4.aFloat192);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass164_Sub3_Sub1_4.aFloat191, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass164_Sub3_Sub1_4.aFloat191, this.aClass164_Sub3_Sub1_4.aFloat192);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)V")
	private void method4531(@OriginalArg(0) int arg0) {
		this.aClass4_Sub3_23.method5245(1);
		this.aClass4_Sub3_23.method5250(this.aClass164_Sub3_Sub1_4);
		this.aClass4_Sub3_23.method5266(7681, this.aClass4_Sub3_23.method5300(arg0));
		this.aClass4_Sub3_23.method5293(1, 768, 34167);
		this.aClass4_Sub3_23.method5265(0, 34168);
		this.aClass4_Sub3_23.method5245(0);
		this.aClass4_Sub3_23.method5250(this.aClass164_Sub3_Sub1_3);
		this.aClass4_Sub3_23.method5266(7681, 34479);
		this.aClass4_Sub3_23.method5293(1, 768, 34166);
		if (this.anInt4907 == 0) {
			this.aClass4_Sub3_23.method5296(0.0F, 1.0F, 0.5F, 0.5F);
		} else if (this.anInt4907 == 1) {
			this.aClass4_Sub3_23.method5296(0.0F, 0.5F, 0.5F, 1.0F);
		} else if (this.anInt4907 == 2) {
			this.aClass4_Sub3_23.method5296(0.0F, 0.5F, 1.0F, 0.5F);
		} else if (this.anInt4907 == 3) {
			this.aClass4_Sub3_23.method5296(0.0F, 128.5F, 128.5F, 128.5F);
		}
	}

	@OriginalMember(owner = "client!kk", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		return this.aClass164_Sub3_Sub1_4.anInt9477 + this.anInt4902 + this.anInt4914;
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "()I")
	@Override
	public int c() {
		return this.aClass164_Sub3_Sub1_4.anInt9484;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(FFFFFFLclient!pa;II)V")
	@Override
	protected void method7715(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class28 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class164_Sub3_Sub1 local7 = ((Class28_Sub1) arg6).aClass164_Sub3_Sub1_1;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(32) float local32;
		if (this.aBoolean370) {
			local14 = this.EA();
			local18 = this.ma();
			local25 = (arg2 - arg0) / local14;
			local32 = (arg3 - arg1) / local14;
			@Pc(39) float local39 = (arg4 - arg0) / local18;
			@Pc(46) float local46 = (arg5 - arg1) / local18;
			@Pc(52) float local52 = local39 * (float) this.anInt4902;
			@Pc(58) float local58 = (float) this.anInt4902 * local46;
			@Pc(64) float local64 = local25 * (float) this.anInt4905;
			@Pc(70) float local70 = (float) this.anInt4905 * local32;
			@Pc(77) float local77 = -local25 * (float) this.anInt4895;
			@Pc(84) float local84 = (float) this.anInt4895 * -local32;
			@Pc(91) float local91 = -local39 * (float) this.anInt4914;
			@Pc(98) float local98 = (float) this.anInt4914 * -local46;
			arg3 = local84 + arg3 + local58;
			arg1 = local58 + arg1 + local70;
			arg4 = local91 + arg4 + local64;
			arg2 = local77 + arg2 + local52;
			arg0 = local64 + arg0 + local52;
			arg5 = local98 + arg5 + local70;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass164_Sub3_Sub1_4.method8154(true);
		local18 = arg3 + arg5 - arg1;
		this.aClass4_Sub3_23.method5267();
		this.aClass4_Sub3_23.method5250(this.aClass164_Sub3_Sub1_4);
		this.aClass4_Sub3_23.method5230(1);
		this.aClass4_Sub3_23.method5245(1);
		this.aClass4_Sub3_23.method5250(local7);
		this.aClass4_Sub3_23.method5266(8448, 7681);
		this.aClass4_Sub3_23.method5293(0, 768, 34168);
		this.aClass4_Sub3_23.method5225(1);
		local25 = local7.aFloat191 / (float) local7.anInt9484;
		local32 = local7.aFloat192 / (float) local7.anInt9477;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass164_Sub3_Sub1_4.aFloat192);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg0), local7.aFloat192 - (arg1 - (float) arg8) * local32);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg4 - (float) arg7), local7.aFloat192 - local32 * (arg5 - (float) arg8));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass164_Sub3_Sub1_4.aFloat191, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * (local14 - (float) arg7), local7.aFloat192 - (local18 - (float) arg8) * local32);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass164_Sub3_Sub1_4.aFloat191, this.aClass164_Sub3_Sub1_4.aFloat192);
		OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * local25, local7.aFloat192 - local32 * (arg3 - (float) arg8));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass4_Sub3_23.method5293(0, 768, 5890);
		this.aClass4_Sub3_23.method5230(0);
		this.aClass4_Sub3_23.method5250(null);
		this.aClass4_Sub3_23.method5245(0);
	}

	@OriginalMember(owner = "client!kk", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass164_Sub3_Sub1_4.method8160(arg2, arg0, arg5, arg1, arg4, arg3);
	}

	@OriginalMember(owner = "client!kk", name = "la", descriptor = "()I")
	@Override
	public int la() {
		return this.aClass164_Sub3_Sub1_4.anInt9477;
	}

	@OriginalMember(owner = "client!kk", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4902 = arg1;
		this.anInt4895 = arg2;
		this.anInt4905 = arg0;
		this.anInt4914 = arg3;
		this.aBoolean370 = this.anInt4905 != 0 || this.anInt4902 != 0 || this.anInt4895 != 0 || this.anInt4914 != 0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILclient!pa;II)V")
	@Override
	public void method7711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class28 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class28_Sub1 local6 = (Class28_Sub1) arg2;
		@Pc(9) Class164_Sub3_Sub1 local9 = local6.aClass164_Sub3_Sub1_1;
		this.aClass164_Sub3_Sub1_4.method8154(false);
		this.aClass4_Sub3_23.method5267();
		this.aClass4_Sub3_23.method5250(this.aClass164_Sub3_Sub1_4);
		this.aClass4_Sub3_23.method5230(1);
		this.aClass4_Sub3_23.method5245(1);
		this.aClass4_Sub3_23.method5250(local9);
		this.aClass4_Sub3_23.method5266(8448, 7681);
		this.aClass4_Sub3_23.method5293(0, 768, 34168);
		this.aClass4_Sub3_23.method5225(1);
		@Pc(62) int local62 = arg0 + this.anInt4905;
		@Pc(67) int local67 = arg1 + this.anInt4902;
		@Pc(73) int local73 = this.aClass164_Sub3_Sub1_4.anInt9484 + local62;
		@Pc(79) int local79 = this.aClass164_Sub3_Sub1_4.anInt9477 + local67;
		@Pc(86) float local86 = local9.aFloat191 / (float) local9.anInt9484;
		@Pc(93) float local93 = local9.aFloat192 / (float) local9.anInt9477;
		@Pc(101) float local101 = local86 * (float) (local62 - arg3);
		@Pc(108) float local108 = local86 * (float) (local73 - arg3);
		@Pc(120) float local120 = local9.aFloat192 - local93 * (float) (local67 - arg4);
		@Pc(132) float local132 = local9.aFloat192 - local93 * (float) (local79 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass164_Sub3_Sub1_4.aFloat192);
		OpenGL.glMultiTexCoord2f(33985, local101, local120);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local132);
		OpenGL.glVertex2i(local62, local67 + this.aClass164_Sub3_Sub1_4.anInt9477);
		OpenGL.glMultiTexCoord2f(33984, this.aClass164_Sub3_Sub1_4.aFloat191, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local108, local132);
		OpenGL.glVertex2i(this.aClass164_Sub3_Sub1_4.anInt9484 + local62, this.aClass164_Sub3_Sub1_4.anInt9477 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass164_Sub3_Sub1_4.aFloat191, this.aClass164_Sub3_Sub1_4.aFloat192);
		OpenGL.glMultiTexCoord2f(33985, local108, local120);
		OpenGL.glVertex2i(this.aClass164_Sub3_Sub1_4.anInt9484 + local62, local67);
		OpenGL.glEnd();
		this.aClass4_Sub3_23.method5293(0, 768, 5890);
		this.aClass4_Sub3_23.method5230(0);
		this.aClass4_Sub3_23.method5250(null);
		this.aClass4_Sub3_23.method5245(0);
	}

	@OriginalMember(owner = "client!kk", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		return this.anInt4895 + this.anInt4905 + this.aClass164_Sub3_Sub1_4.anInt9484;
	}
}
