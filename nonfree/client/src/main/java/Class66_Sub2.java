import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class66_Sub2 extends Class66 {

	@OriginalMember(owner = "client!nh", name = "r", descriptor = "Lclient!hea;")
	private Class132_Sub1_Sub1 aClass132_Sub1_Sub1_4;

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
	private int anInt6674 = 0;

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
	private int anInt6676 = 0;

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
	private int anInt6680 = 0;

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "Z")
	private boolean aBoolean504 = false;

	@OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
	private int anInt6689 = 0;

	@OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
	private int anInt6690 = 0;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "Lclient!ap;")
	private final Class9_Sub2 aClass9_Sub2_25;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "Lclient!hea;")
	private final Class132_Sub1_Sub1 aClass132_Sub1_Sub1_3;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!ap;IIII)V")
	public Class66_Sub2(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass9_Sub2_25 = arg0;
		this.aClass132_Sub1_Sub1_3 = Static443.method6791(arg4, arg2, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!ap;II[III)V")
	public Class66_Sub2(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass9_Sub2_25 = arg0;
		this.aClass132_Sub1_Sub1_3 = Static98.method2102(arg0, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!nh", name = "ba", descriptor = "(IIIIIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg0 + arg2;
		this.aClass132_Sub1_Sub1_3.method5614(false);
		@Pc(18) int local18 = arg3 + arg1;
		this.aClass9_Sub2_25.method817();
		this.aClass9_Sub2_25.method814(this.aClass132_Sub1_Sub1_3);
		this.aClass9_Sub2_25.method804(arg6);
		this.aClass9_Sub2_25.method822(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass132_Sub1_Sub1_3.aBoolean340 && !this.aBoolean504) {
			@Pc(72) float local72 = this.aClass132_Sub1_Sub1_3.aFloat99 * (float) arg3 / (float) this.aClass132_Sub1_Sub1_3.anInt4227;
			@Pc(84) float local84 = this.aClass132_Sub1_Sub1_3.aFloat98 * (float) arg2 / (float) this.aClass132_Sub1_Sub1_3.anInt4225;
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
		OpenGL.glTranslatef((float) this.anInt6689, (float) this.anInt6676, 0.0F);
		@Pc(124) int local124 = this.AA();
		@Pc(127) int local127 = this.a();
		@Pc(133) int local133 = this.aClass132_Sub1_Sub1_3.anInt4227 + arg1;
		OpenGL.glBegin(7);
		@Pc(137) int local137 = arg1;
		@Pc(145) int local145;
		while (local133 <= local18) {
			local145 = this.aClass132_Sub1_Sub1_3.anInt4225 + arg0;
			@Pc(147) int local147 = arg0;
			while (local9 >= local145) {
				OpenGL.glTexCoord2f(0.0F, this.aClass132_Sub1_Sub1_3.aFloat99);
				OpenGL.glVertex2i(local147, local137);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local133);
				OpenGL.glTexCoord2f(this.aClass132_Sub1_Sub1_3.aFloat98, 0.0F);
				OpenGL.glVertex2i(local145, local133);
				OpenGL.glTexCoord2f(this.aClass132_Sub1_Sub1_3.aFloat98, this.aClass132_Sub1_Sub1_3.aFloat99);
				OpenGL.glVertex2i(local145, local137);
				local147 += local124;
				local145 += local124;
			}
			if (local9 > local147) {
				@Pc(214) float local214 = this.aClass132_Sub1_Sub1_3.aFloat98 * (float) (local9 - local147) / (float) this.aClass132_Sub1_Sub1_3.anInt4225;
				OpenGL.glTexCoord2f(0.0F, this.aClass132_Sub1_Sub1_3.aFloat99);
				OpenGL.glVertex2i(local147, local137);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local133);
				OpenGL.glTexCoord2f(local214, 0.0F);
				OpenGL.glVertex2i(local9, local133);
				OpenGL.glTexCoord2f(local214, this.aClass132_Sub1_Sub1_3.aFloat99);
				OpenGL.glVertex2i(local9, local137);
			}
			local133 += local127;
			local137 += local127;
		}
		if (local18 > local137) {
			@Pc(278) float local278 = (float) (local137 + this.aClass132_Sub1_Sub1_3.anInt4227 - local18) * this.aClass132_Sub1_Sub1_3.aFloat99 / (float) this.aClass132_Sub1_Sub1_3.anInt4227;
			@Pc(285) int local285 = arg0 + this.aClass132_Sub1_Sub1_3.anInt4225;
			local145 = arg0;
			while (local9 >= local285) {
				OpenGL.glTexCoord2f(0.0F, this.aClass132_Sub1_Sub1_3.aFloat99);
				OpenGL.glVertex2i(local145, local137);
				OpenGL.glTexCoord2f(0.0F, local278);
				OpenGL.glVertex2i(local145, local18);
				OpenGL.glTexCoord2f(this.aClass132_Sub1_Sub1_3.aFloat98, local278);
				OpenGL.glVertex2i(local285, local18);
				OpenGL.glTexCoord2f(this.aClass132_Sub1_Sub1_3.aFloat98, this.aClass132_Sub1_Sub1_3.aFloat99);
				OpenGL.glVertex2i(local285, local137);
				local285 += local124;
				local145 += local124;
			}
			if (local145 < local9) {
				@Pc(350) float local350 = this.aClass132_Sub1_Sub1_3.aFloat98 * (float) (local9 - local145) / (float) this.aClass132_Sub1_Sub1_3.anInt4225;
				OpenGL.glTexCoord2f(0.0F, this.aClass132_Sub1_Sub1_3.aFloat99);
				OpenGL.glVertex2i(local145, local137);
				OpenGL.glTexCoord2f(0.0F, local278);
				OpenGL.glVertex2i(local145, local18);
				OpenGL.glTexCoord2f(local350, local278);
				OpenGL.glVertex2i(local9, local18);
				OpenGL.glTexCoord2f(local350, this.aClass132_Sub1_Sub1_3.aFloat99);
				OpenGL.glVertex2i(local9, local137);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.aClass132_Sub1_Sub1_3.anInt4227 + this.anInt6676 + this.anInt6674;
	}

	@OriginalMember(owner = "client!nh", name = "t", descriptor = "(III)V")
	@Override
	public void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass132_Sub1_Sub1_4 = Static443.method6791(this.aClass132_Sub1_Sub1_3.anInt4227, arg1, arg0, this.aClass132_Sub1_Sub1_3.anInt4225, this.aClass9_Sub2_25);
		this.anInt6680 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!nh", name = "KA", descriptor = "(IIIIIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass132_Sub1_Sub1_3.method5614(true);
		this.aClass9_Sub2_25.method817();
		this.aClass9_Sub2_25.method804(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean504) {
			@Pc(181) float local181 = (float) arg2 / (float) this.AA();
			@Pc(188) float local188 = (float) arg3 / (float) this.a();
			@Pc(197) float local197 = (float) arg0 + local181 * (float) this.anInt6689;
			@Pc(206) float local206 = (float) this.anInt6676 * local188 + (float) arg1;
			@Pc(215) float local215 = local197 + (float) this.aClass132_Sub1_Sub1_3.anInt4225 * local181;
			@Pc(224) float local224 = local206 + local188 * (float) this.aClass132_Sub1_Sub1_3.anInt4227;
			if (this.aClass132_Sub1_Sub1_4 == null) {
				this.aClass9_Sub2_25.method814(this.aClass132_Sub1_Sub1_3);
				this.aClass9_Sub2_25.method822(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass132_Sub1_Sub1_3.aFloat99);
				OpenGL.glVertex2f(local197, local206);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local197, local224);
				OpenGL.glTexCoord2f(this.aClass132_Sub1_Sub1_3.aFloat98, 0.0F);
				OpenGL.glVertex2f(local215, local224);
				OpenGL.glTexCoord2f(this.aClass132_Sub1_Sub1_3.aFloat98, this.aClass132_Sub1_Sub1_3.aFloat99);
				OpenGL.glVertex2f(local215, local206);
				OpenGL.glEnd();
			} else {
				this.method5632(arg4);
				this.aClass132_Sub1_Sub1_4.method5614(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass132_Sub1_Sub1_3.aFloat99);
				OpenGL.glTexCoord2f(0.0F, this.aClass132_Sub1_Sub1_3.aFloat99);
				OpenGL.glVertex2f(local197, local206);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local197, local224);
				OpenGL.glMultiTexCoord2f(33985, this.aClass132_Sub1_Sub1_3.aFloat98, 0.0F);
				OpenGL.glTexCoord2f(this.aClass132_Sub1_Sub1_3.aFloat98, 0.0F);
				OpenGL.glVertex2f(local215, local224);
				OpenGL.glMultiTexCoord2f(33985, this.aClass132_Sub1_Sub1_3.aFloat98, this.aClass132_Sub1_Sub1_3.aFloat99);
				OpenGL.glTexCoord2f(this.aClass132_Sub1_Sub1_3.aFloat98, this.aClass132_Sub1_Sub1_3.aFloat99);
				OpenGL.glVertex2f(local215, local206);
				OpenGL.glEnd();
				this.method5635();
			}
		} else if (this.aClass132_Sub1_Sub1_4 == null) {
			this.aClass9_Sub2_25.method814(this.aClass132_Sub1_Sub1_3);
			this.aClass9_Sub2_25.method822(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass132_Sub1_Sub1_3.aFloat99);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass132_Sub1_Sub1_3.aFloat98, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass132_Sub1_Sub1_3.aFloat98, this.aClass132_Sub1_Sub1_3.aFloat99);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method5632(arg4);
			this.aClass132_Sub1_Sub1_4.method5614(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass132_Sub1_Sub1_3.aFloat99);
			OpenGL.glTexCoord2f(0.0F, this.aClass132_Sub1_Sub1_3.aFloat99);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass132_Sub1_Sub1_3.aFloat98, 0.0F);
			OpenGL.glTexCoord2f(this.aClass132_Sub1_Sub1_3.aFloat98, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass132_Sub1_Sub1_3.aFloat98, this.aClass132_Sub1_Sub1_3.aFloat99);
			OpenGL.glTexCoord2f(this.aClass132_Sub1_Sub1_3.aFloat98, this.aClass132_Sub1_Sub1_3.aFloat99);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method5635();
		}
	}

	@OriginalMember(owner = "client!nh", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.aClass132_Sub1_Sub1_3.anInt4225 + this.anInt6689 + this.anInt6690;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)V")
	private void method5632(@OriginalArg(0) int arg0) {
		this.aClass9_Sub2_25.method806(1);
		this.aClass9_Sub2_25.method814(this.aClass132_Sub1_Sub1_3);
		this.aClass9_Sub2_25.method797(this.aClass9_Sub2_25.method802(arg0), 7681);
		this.aClass9_Sub2_25.method798(1, 768, 34167);
		this.aClass9_Sub2_25.method816(34168, 0);
		this.aClass9_Sub2_25.method806(0);
		this.aClass9_Sub2_25.method814(this.aClass132_Sub1_Sub1_4);
		this.aClass9_Sub2_25.method797(34479, 7681);
		this.aClass9_Sub2_25.method798(1, 768, 34166);
		if (this.anInt6680 == 0) {
			this.aClass9_Sub2_25.method795(1.0F, 0.0F, 0.5F, 0.5F);
		} else if (this.anInt6680 == 1) {
			this.aClass9_Sub2_25.method795(0.5F, 0.0F, 0.5F, 1.0F);
		} else if (this.anInt6680 == 2) {
			this.aClass9_Sub2_25.method795(0.5F, 0.0F, 1.0F, 0.5F);
		} else if (this.anInt6680 == 3) {
			this.aClass9_Sub2_25.method795(128.5F, 0.0F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.aClass132_Sub1_Sub1_3.anInt4227;
	}

	@OriginalMember(owner = "client!nh", name = "sa", descriptor = "(FFFFFFIII)V")
	@Override
	protected void sa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean504) {
			local6 = this.AA();
			local10 = this.a();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(35) float local35 = (arg5 - arg1) / local10;
			@Pc(41) float local41 = local29 * (float) this.anInt6676;
			@Pc(47) float local47 = (float) this.anInt6676 * local35;
			@Pc(53) float local53 = (float) this.anInt6689 * local17;
			@Pc(59) float local59 = (float) this.anInt6689 * local23;
			@Pc(66) float local66 = (float) this.anInt6690 * -local17;
			@Pc(73) float local73 = -local23 * (float) this.anInt6690;
			@Pc(80) float local80 = -local29 * (float) this.anInt6674;
			arg4 = local53 + arg4 + local80;
			arg3 = arg3 + local73 + local47;
			arg1 = arg1 + local59 + local47;
			arg0 = local53 + arg0 + local41;
			@Pc(111) float local111 = (float) this.anInt6674 * -local35;
			arg2 = local41 + arg2 + local66;
			arg5 = local59 + arg5 + local111;
		}
		local6 = arg2 + arg4 - arg0;
		this.aClass132_Sub1_Sub1_3.method5614(true);
		local10 = arg3 + arg5 - arg1;
		this.aClass9_Sub2_25.method817();
		this.aClass9_Sub2_25.method814(this.aClass132_Sub1_Sub1_3);
		this.aClass9_Sub2_25.method804(arg8);
		this.aClass9_Sub2_25.method822(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass132_Sub1_Sub1_3.aFloat99);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass132_Sub1_Sub1_3.aFloat98, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass132_Sub1_Sub1_3.aFloat98, this.aClass132_Sub1_Sub1_3.aFloat99);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!nh", name = "I", descriptor = "(IIIII)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass132_Sub1_Sub1_3.method5614(false);
		this.aClass9_Sub2_25.method817();
		this.aClass9_Sub2_25.method804(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt6689;
		@Pc(42) int local42 = arg1 + this.anInt6676;
		if (this.aClass132_Sub1_Sub1_4 == null) {
			this.aClass9_Sub2_25.method814(this.aClass132_Sub1_Sub1_3);
			this.aClass9_Sub2_25.method822(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass132_Sub1_Sub1_3.aFloat99);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, local42 + this.aClass132_Sub1_Sub1_3.anInt4227);
			OpenGL.glTexCoord2f(this.aClass132_Sub1_Sub1_3.aFloat98, 0.0F);
			OpenGL.glVertex2i(local37 + this.aClass132_Sub1_Sub1_3.anInt4225, local42 + this.aClass132_Sub1_Sub1_3.anInt4227);
			OpenGL.glTexCoord2f(this.aClass132_Sub1_Sub1_3.aFloat98, this.aClass132_Sub1_Sub1_3.aFloat99);
			OpenGL.glVertex2i(this.aClass132_Sub1_Sub1_3.anInt4225 + local37, local42);
			OpenGL.glEnd();
			return;
		}
		this.method5632(arg2);
		this.aClass132_Sub1_Sub1_4.method5614(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass132_Sub1_Sub1_3.aFloat99);
		OpenGL.glTexCoord2f(0.0F, this.aClass132_Sub1_Sub1_3.aFloat99);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, this.aClass132_Sub1_Sub1_3.anInt4227 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass132_Sub1_Sub1_3.aFloat98, 0.0F);
		OpenGL.glTexCoord2f(this.aClass132_Sub1_Sub1_3.aFloat98, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass132_Sub1_Sub1_3.anInt4225, this.aClass132_Sub1_Sub1_3.anInt4227 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass132_Sub1_Sub1_3.aFloat98, this.aClass132_Sub1_Sub1_3.aFloat99);
		OpenGL.glTexCoord2f(this.aClass132_Sub1_Sub1_3.aFloat98, this.aClass132_Sub1_Sub1_3.aFloat99);
		OpenGL.glVertex2i(local37 + this.aClass132_Sub1_Sub1_3.anInt4225, local42);
		OpenGL.glEnd();
		this.method5635();
	}

	@OriginalMember(owner = "client!nh", name = "GA", descriptor = "(IIIIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass132_Sub1_Sub1_3.method3697(arg5, arg0, arg3, arg1, arg2, arg4);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(FFFFFFLclient!fa;II)V")
	@Override
	protected void method8064(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class19 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class132_Sub1_Sub1 local7 = ((Class19_Sub2) arg6).aClass132_Sub1_Sub1_2;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(31) float local31;
		if (this.aBoolean504) {
			local14 = this.AA();
			local18 = this.a();
			local25 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(45) float local45 = (arg5 - arg1) / local18;
			@Pc(51) float local51 = local38 * (float) this.anInt6676;
			@Pc(57) float local57 = (float) this.anInt6676 * local45;
			@Pc(63) float local63 = local25 * (float) this.anInt6689;
			@Pc(69) float local69 = (float) this.anInt6689 * local31;
			@Pc(76) float local76 = (float) this.anInt6690 * -local25;
			@Pc(83) float local83 = (float) this.anInt6690 * -local31;
			@Pc(90) float local90 = (float) this.anInt6674 * -local38;
			arg2 = arg2 + local76 + local51;
			arg0 = local51 + local63 + arg0;
			arg3 = arg3 + local83 + local57;
			arg1 = arg1 + local69 + local57;
			arg4 = local90 + arg4 + local63;
			@Pc(127) float local127 = -local45 * (float) this.anInt6674;
			arg5 = local127 + arg5 + local69;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass132_Sub1_Sub1_3.method5614(true);
		local18 = arg3 + arg5 - arg1;
		this.aClass9_Sub2_25.method817();
		this.aClass9_Sub2_25.method814(this.aClass132_Sub1_Sub1_3);
		this.aClass9_Sub2_25.method822(1);
		this.aClass9_Sub2_25.method806(1);
		this.aClass9_Sub2_25.method814(local7);
		this.aClass9_Sub2_25.method797(7681, 8448);
		this.aClass9_Sub2_25.method798(0, 768, 34168);
		this.aClass9_Sub2_25.method804(1);
		local25 = local7.aFloat98 / (float) local7.anInt4225;
		local31 = local7.aFloat99 / (float) local7.anInt4227;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass132_Sub1_Sub1_3.aFloat99);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg0 - (float) arg7), local7.aFloat99 - local31 * (arg1 - (float) arg8));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * local25, local7.aFloat99 - ((float) -arg8 + arg5) * local31);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass132_Sub1_Sub1_3.aFloat98, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * (local14 - (float) arg7), local7.aFloat99 - ((float) -arg8 + local18) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass132_Sub1_Sub1_3.aFloat98, this.aClass132_Sub1_Sub1_3.aFloat99);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg2) * local25, local7.aFloat99 - local31 * (arg3 - (float) arg8));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass9_Sub2_25.method798(0, 768, 5890);
		this.aClass9_Sub2_25.method822(0);
		this.aClass9_Sub2_25.method814(null);
		this.aClass9_Sub2_25.method806(0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!fa;II)V")
	@Override
	public void method8063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class19_Sub2 local6 = (Class19_Sub2) arg2;
		@Pc(9) Class132_Sub1_Sub1 local9 = local6.aClass132_Sub1_Sub1_2;
		this.aClass132_Sub1_Sub1_3.method5614(false);
		this.aClass9_Sub2_25.method817();
		this.aClass9_Sub2_25.method814(this.aClass132_Sub1_Sub1_3);
		this.aClass9_Sub2_25.method822(1);
		this.aClass9_Sub2_25.method806(1);
		this.aClass9_Sub2_25.method814(local9);
		this.aClass9_Sub2_25.method797(7681, 8448);
		this.aClass9_Sub2_25.method798(0, 768, 34168);
		this.aClass9_Sub2_25.method804(1);
		@Pc(62) int local62 = arg1 + this.anInt6676;
		@Pc(67) int local67 = arg0 + this.anInt6689;
		@Pc(73) int local73 = local67 + this.aClass132_Sub1_Sub1_3.anInt4225;
		@Pc(79) int local79 = this.aClass132_Sub1_Sub1_3.anInt4227 + local62;
		@Pc(86) float local86 = local9.aFloat98 / (float) local9.anInt4225;
		@Pc(93) float local93 = local9.aFloat99 / (float) local9.anInt4227;
		@Pc(101) float local101 = local86 * (float) (local67 - arg3);
		@Pc(109) float local109 = local86 * (float) (local73 - arg3);
		@Pc(120) float local120 = local9.aFloat99 - (float) (local62 - arg4) * local93;
		@Pc(130) float local130 = local9.aFloat99 - (float) (local79 - arg4) * local93;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass132_Sub1_Sub1_3.aFloat99);
		OpenGL.glMultiTexCoord2f(33985, local101, local120);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local130);
		OpenGL.glVertex2i(local67, this.aClass132_Sub1_Sub1_3.anInt4227 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass132_Sub1_Sub1_3.aFloat98, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local130);
		OpenGL.glVertex2i(local67 + this.aClass132_Sub1_Sub1_3.anInt4225, local62 - -this.aClass132_Sub1_Sub1_3.anInt4227);
		OpenGL.glMultiTexCoord2f(33984, this.aClass132_Sub1_Sub1_3.aFloat98, this.aClass132_Sub1_Sub1_3.aFloat99);
		OpenGL.glMultiTexCoord2f(33985, local109, local120);
		OpenGL.glVertex2i(this.aClass132_Sub1_Sub1_3.anInt4225 + local67, local62);
		OpenGL.glEnd();
		this.aClass9_Sub2_25.method798(0, 768, 5890);
		this.aClass9_Sub2_25.method822(0);
		this.aClass9_Sub2_25.method814(null);
		this.aClass9_Sub2_25.method806(0);
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
	private void method5635() {
		this.aClass9_Sub2_25.method806(1);
		this.aClass9_Sub2_25.method814(null);
		this.aClass9_Sub2_25.method797(8448, 8448);
		this.aClass9_Sub2_25.method798(1, 768, 34168);
		this.aClass9_Sub2_25.method816(5890, 0);
		this.aClass9_Sub2_25.method806(0);
		this.aClass9_Sub2_25.method798(1, 768, 34168);
	}

	@OriginalMember(owner = "client!nh", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6690 = arg2;
		this.anInt6689 = arg0;
		this.anInt6674 = arg3;
		this.anInt6676 = arg1;
		this.aBoolean504 = this.anInt6689 != 0 || this.anInt6676 != 0 || this.anInt6690 != 0 || this.anInt6674 != 0;
	}

	@OriginalMember(owner = "client!nh", name = "QA", descriptor = "()I")
	@Override
	public int QA() {
		return this.aClass132_Sub1_Sub1_3.anInt4225;
	}
}
