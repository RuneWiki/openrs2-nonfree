import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iea")
public final class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!iea", name = "c", descriptor = "Lclient!nea;")
	private Class46_Sub2_Sub1 aClass46_Sub2_Sub1_1;

	@OriginalMember(owner = "client!iea", name = "w", descriptor = "I")
	private int anInt3995 = 0;

	@OriginalMember(owner = "client!iea", name = "y", descriptor = "I")
	private int anInt3997 = 0;

	@OriginalMember(owner = "client!iea", name = "q", descriptor = "I")
	private int anInt3990 = 0;

	@OriginalMember(owner = "client!iea", name = "p", descriptor = "I")
	private int anInt3989 = 0;

	@OriginalMember(owner = "client!iea", name = "v", descriptor = "Z")
	private boolean aBoolean284 = false;

	@OriginalMember(owner = "client!iea", name = "F", descriptor = "I")
	private int anInt4002 = 0;

	@OriginalMember(owner = "client!iea", name = "g", descriptor = "Lclient!lj;")
	private final Class78_Sub3 aClass78_Sub3_18;

	@OriginalMember(owner = "client!iea", name = "A", descriptor = "Lclient!nea;")
	public final Class46_Sub2_Sub1 aClass46_Sub2_Sub1_2;

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lclient!lj;IIZ)V")
	public Class5_Sub3(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass78_Sub3_18 = arg0;
		this.aClass46_Sub2_Sub1_2 = Static166.method6220(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lclient!lj;IIII)V")
	public Class5_Sub3(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass78_Sub3_18 = arg0;
		this.aClass46_Sub2_Sub1_2 = Static21.method472(arg4, arg0, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lclient!lj;II[III)V")
	public Class5_Sub3(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass78_Sub3_18 = arg0;
		this.aClass46_Sub2_Sub1_2 = Static184.method2978(arg0, arg2, arg3, arg4, arg1, arg5);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V")
	private void method3257() {
		this.aClass78_Sub3_18.method4549(1);
		this.aClass78_Sub3_18.method4535(null);
		this.aClass78_Sub3_18.method4539(8448, 8448);
		this.aClass78_Sub3_18.method4493(34168, 1, 768);
		this.aClass78_Sub3_18.method4527(0, 5890);
		this.aClass78_Sub3_18.method4549(0);
		this.aClass78_Sub3_18.method4493(34168, 1, 768);
	}

	@OriginalMember(owner = "client!iea", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean284) {
			local6 = this.A();
			local10 = this.ca();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(35) float local35 = (arg5 - arg1) / local10;
			@Pc(41) float local41 = (float) this.anInt3990 * local29;
			@Pc(47) float local47 = local35 * (float) this.anInt3990;
			@Pc(53) float local53 = local17 * (float) this.anInt3995;
			@Pc(59) float local59 = local23 * (float) this.anInt3995;
			@Pc(66) float local66 = -local17 * (float) this.anInt3997;
			@Pc(73) float local73 = (float) this.anInt3997 * -local23;
			@Pc(80) float local80 = -local29 * (float) this.anInt4002;
			arg1 = arg1 + local59 + local47;
			arg4 = local80 + arg4 + local53;
			@Pc(99) float local99 = -local35 * (float) this.anInt4002;
			arg3 = local47 + arg3 + local73;
			arg2 = arg2 + local66 + local41;
			arg0 = local41 + local53 + arg0;
			arg5 = local99 + arg5 + local59;
		}
		local6 = arg2 + arg4 - arg0;
		this.aClass46_Sub2_Sub1_2.method5134(true);
		local10 = arg3 + arg5 - arg1;
		this.aClass78_Sub3_18.method4489();
		this.aClass78_Sub3_18.method4535(this.aClass46_Sub2_Sub1_2);
		this.aClass78_Sub3_18.method4566(arg8);
		this.aClass78_Sub3_18.method4534(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass46_Sub2_Sub1_2.aFloat173);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass46_Sub2_Sub1_2.aFloat174, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass46_Sub2_Sub1_2.aFloat174, this.aClass46_Sub2_Sub1_2.aFloat173);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!iea", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg0 + arg2;
		this.aClass46_Sub2_Sub1_2.method5134(false);
		@Pc(18) int local18 = arg3 + arg1;
		this.aClass78_Sub3_18.method4489();
		this.aClass78_Sub3_18.method4535(this.aClass46_Sub2_Sub1_2);
		this.aClass78_Sub3_18.method4566(arg6);
		this.aClass78_Sub3_18.method4534(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass46_Sub2_Sub1_2.aBoolean502 && !this.aBoolean284) {
			@Pc(72) float local72 = (float) arg3 * this.aClass46_Sub2_Sub1_2.aFloat173 / (float) this.aClass46_Sub2_Sub1_2.anInt6372;
			@Pc(84) float local84 = this.aClass46_Sub2_Sub1_2.aFloat174 * (float) arg2 / (float) this.aClass46_Sub2_Sub1_2.anInt6370;
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
		OpenGL.glTranslatef((float) this.anInt3995, (float) this.anInt3990, 0.0F);
		@Pc(124) int local124 = this.A();
		@Pc(127) int local127 = this.ca();
		@Pc(134) int local134 = arg1 + this.aClass46_Sub2_Sub1_2.anInt6372;
		OpenGL.glBegin(7);
		@Pc(138) int local138 = arg1;
		@Pc(146) int local146;
		while (local18 >= local134) {
			local146 = arg0 + this.aClass46_Sub2_Sub1_2.anInt6370;
			@Pc(148) int local148 = arg0;
			while (local9 >= local146) {
				OpenGL.glTexCoord2f(0.0F, this.aClass46_Sub2_Sub1_2.aFloat173);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(this.aClass46_Sub2_Sub1_2.aFloat174, 0.0F);
				OpenGL.glVertex2i(local146, local134);
				OpenGL.glTexCoord2f(this.aClass46_Sub2_Sub1_2.aFloat174, this.aClass46_Sub2_Sub1_2.aFloat173);
				OpenGL.glVertex2i(local146, local138);
				local148 += local124;
				local146 += local124;
			}
			if (local9 > local148) {
				@Pc(214) float local214 = (float) (local9 - local148) * this.aClass46_Sub2_Sub1_2.aFloat174 / (float) this.aClass46_Sub2_Sub1_2.anInt6370;
				OpenGL.glTexCoord2f(0.0F, this.aClass46_Sub2_Sub1_2.aFloat173);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(local214, 0.0F);
				OpenGL.glVertex2i(local9, local134);
				OpenGL.glTexCoord2f(local214, this.aClass46_Sub2_Sub1_2.aFloat173);
				OpenGL.glVertex2i(local9, local138);
			}
			local134 += local127;
			local138 += local127;
		}
		if (local138 < local18) {
			@Pc(274) float local274 = (float) (local138 + this.aClass46_Sub2_Sub1_2.anInt6372 - local18) * this.aClass46_Sub2_Sub1_2.aFloat173 / (float) this.aClass46_Sub2_Sub1_2.anInt6372;
			@Pc(280) int local280 = this.aClass46_Sub2_Sub1_2.anInt6370 + arg0;
			local146 = arg0;
			while (local280 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass46_Sub2_Sub1_2.aFloat173);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local274);
				OpenGL.glVertex2i(local146, local18);
				OpenGL.glTexCoord2f(this.aClass46_Sub2_Sub1_2.aFloat174, local274);
				OpenGL.glVertex2i(local280, local18);
				OpenGL.glTexCoord2f(this.aClass46_Sub2_Sub1_2.aFloat174, this.aClass46_Sub2_Sub1_2.aFloat173);
				OpenGL.glVertex2i(local280, local138);
				local146 += local124;
				local280 += local124;
			}
			if (local146 < local9) {
				@Pc(349) float local349 = this.aClass46_Sub2_Sub1_2.aFloat174 * (float) (local9 - local146) / (float) this.aClass46_Sub2_Sub1_2.anInt6370;
				OpenGL.glTexCoord2f(0.0F, this.aClass46_Sub2_Sub1_2.aFloat173);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local274);
				OpenGL.glVertex2i(local146, local18);
				OpenGL.glTexCoord2f(local349, local274);
				OpenGL.glVertex2i(local9, local18);
				OpenGL.glTexCoord2f(local349, this.aClass46_Sub2_Sub1_2.aFloat173);
				OpenGL.glVertex2i(local9, local138);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!iea", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.aClass46_Sub2_Sub1_2.anInt6370;
	}

	@OriginalMember(owner = "client!iea", name = "A", descriptor = "()I")
	@Override
	public int A() {
		return this.aClass46_Sub2_Sub1_2.anInt6370 + this.anInt3995 + this.anInt3997;
	}

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(II)V")
	private void method3261(@OriginalArg(0) int arg0) {
		this.aClass78_Sub3_18.method4549(1);
		this.aClass78_Sub3_18.method4535(this.aClass46_Sub2_Sub1_2);
		this.aClass78_Sub3_18.method4539(this.aClass78_Sub3_18.method4562(arg0), 7681);
		this.aClass78_Sub3_18.method4493(34167, 1, 768);
		this.aClass78_Sub3_18.method4527(0, 34168);
		this.aClass78_Sub3_18.method4549(0);
		this.aClass78_Sub3_18.method4535(this.aClass46_Sub2_Sub1_1);
		this.aClass78_Sub3_18.method4539(34479, 7681);
		this.aClass78_Sub3_18.method4493(34166, 1, 768);
		if (this.anInt3989 == 0) {
			this.aClass78_Sub3_18.method4500(0.5F, 0.0F, 1.0F, 0.5F);
		} else if (this.anInt3989 == 1) {
			this.aClass78_Sub3_18.method4500(1.0F, 0.0F, 0.5F, 0.5F);
		} else if (this.anInt3989 == 2) {
			this.aClass78_Sub3_18.method4500(0.5F, 0.0F, 0.5F, 1.0F);
		} else if (this.anInt3989 == 3) {
			this.aClass78_Sub3_18.method4500(128.5F, 0.0F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!iea", name = "V", descriptor = "(IIIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass46_Sub2_Sub1_2.method5134(false);
		this.aClass78_Sub3_18.method4489();
		this.aClass78_Sub3_18.method4566(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt3990;
		@Pc(42) int local42 = arg0 + this.anInt3995;
		if (this.aClass46_Sub2_Sub1_1 == null) {
			this.aClass78_Sub3_18.method4535(this.aClass46_Sub2_Sub1_2);
			this.aClass78_Sub3_18.method4534(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass46_Sub2_Sub1_2.aFloat173);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, local37 + this.aClass46_Sub2_Sub1_2.anInt6372);
			OpenGL.glTexCoord2f(this.aClass46_Sub2_Sub1_2.aFloat174, 0.0F);
			OpenGL.glVertex2i(local42 + this.aClass46_Sub2_Sub1_2.anInt6370, this.aClass46_Sub2_Sub1_2.anInt6372 + local37);
			OpenGL.glTexCoord2f(this.aClass46_Sub2_Sub1_2.aFloat174, this.aClass46_Sub2_Sub1_2.aFloat173);
			OpenGL.glVertex2i(this.aClass46_Sub2_Sub1_2.anInt6370 + local42, local37);
			OpenGL.glEnd();
			return;
		}
		this.method3261(arg2);
		this.aClass46_Sub2_Sub1_1.method5134(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass46_Sub2_Sub1_2.aFloat173);
		OpenGL.glTexCoord2f(0.0F, this.aClass46_Sub2_Sub1_2.aFloat173);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, this.aClass46_Sub2_Sub1_2.anInt6372 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass46_Sub2_Sub1_2.aFloat174, 0.0F);
		OpenGL.glTexCoord2f(this.aClass46_Sub2_Sub1_2.aFloat174, 0.0F);
		OpenGL.glVertex2i(local42 + this.aClass46_Sub2_Sub1_2.anInt6370, this.aClass46_Sub2_Sub1_2.anInt6372 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass46_Sub2_Sub1_2.aFloat174, this.aClass46_Sub2_Sub1_2.aFloat173);
		OpenGL.glTexCoord2f(this.aClass46_Sub2_Sub1_2.aFloat174, this.aClass46_Sub2_Sub1_2.aFloat173);
		OpenGL.glVertex2i(local42 + this.aClass46_Sub2_Sub1_2.anInt6370, local37);
		OpenGL.glEnd();
		this.method3257();
	}

	@OriginalMember(owner = "client!iea", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aClass46_Sub2_Sub1_2.anInt6372;
	}

	@OriginalMember(owner = "client!iea", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass46_Sub2_Sub1_1 = Static21.method472(this.aClass46_Sub2_Sub1_2.anInt6372, this.aClass78_Sub3_18, arg0, this.aClass46_Sub2_Sub1_2.anInt6370, arg1);
		this.anInt3989 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!iea", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3997 = arg2;
		this.anInt3995 = arg0;
		this.anInt3990 = arg1;
		this.anInt4002 = arg3;
		this.aBoolean284 = this.anInt3995 != 0 || this.anInt3990 != 0 || this.anInt3997 != 0 || this.anInt4002 != 0;
	}

	@OriginalMember(owner = "client!iea", name = "YA", descriptor = "(IIIIIIII)V")
	@Override
	protected void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass46_Sub2_Sub1_2.method5134(true);
		this.aClass78_Sub3_18.method4489();
		this.aClass78_Sub3_18.method4566(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean284) {
			@Pc(190) float local190 = (float) arg2 / (float) this.A();
			@Pc(197) float local197 = (float) arg3 / (float) this.ca();
			@Pc(206) float local206 = (float) this.anInt3995 * local190 + (float) arg0;
			@Pc(215) float local215 = (float) this.anInt3990 * local197 + (float) arg1;
			@Pc(224) float local224 = local190 * (float) this.aClass46_Sub2_Sub1_2.anInt6370 + local206;
			@Pc(233) float local233 = local215 + local197 * (float) this.aClass46_Sub2_Sub1_2.anInt6372;
			if (this.aClass46_Sub2_Sub1_1 == null) {
				this.aClass78_Sub3_18.method4535(this.aClass46_Sub2_Sub1_2);
				this.aClass78_Sub3_18.method4534(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass46_Sub2_Sub1_2.aFloat173);
				OpenGL.glVertex2f(local206, local215);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local206, local233);
				OpenGL.glTexCoord2f(this.aClass46_Sub2_Sub1_2.aFloat174, 0.0F);
				OpenGL.glVertex2f(local224, local233);
				OpenGL.glTexCoord2f(this.aClass46_Sub2_Sub1_2.aFloat174, this.aClass46_Sub2_Sub1_2.aFloat173);
				OpenGL.glVertex2f(local224, local215);
				OpenGL.glEnd();
			} else {
				this.method3261(arg4);
				this.aClass46_Sub2_Sub1_1.method5134(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass46_Sub2_Sub1_2.aFloat173);
				OpenGL.glTexCoord2f(0.0F, this.aClass46_Sub2_Sub1_2.aFloat173);
				OpenGL.glVertex2f(local206, local215);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local206, local233);
				OpenGL.glMultiTexCoord2f(33985, this.aClass46_Sub2_Sub1_2.aFloat174, 0.0F);
				OpenGL.glTexCoord2f(this.aClass46_Sub2_Sub1_2.aFloat174, 0.0F);
				OpenGL.glVertex2f(local224, local233);
				OpenGL.glMultiTexCoord2f(33985, this.aClass46_Sub2_Sub1_2.aFloat174, this.aClass46_Sub2_Sub1_2.aFloat173);
				OpenGL.glTexCoord2f(this.aClass46_Sub2_Sub1_2.aFloat174, this.aClass46_Sub2_Sub1_2.aFloat173);
				OpenGL.glVertex2f(local224, local215);
				OpenGL.glEnd();
				this.method3257();
			}
		} else if (this.aClass46_Sub2_Sub1_1 == null) {
			this.aClass78_Sub3_18.method4535(this.aClass46_Sub2_Sub1_2);
			this.aClass78_Sub3_18.method4534(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass46_Sub2_Sub1_2.aFloat173);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass46_Sub2_Sub1_2.aFloat174, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass46_Sub2_Sub1_2.aFloat174, this.aClass46_Sub2_Sub1_2.aFloat173);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method3261(arg4);
			this.aClass46_Sub2_Sub1_1.method5134(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass46_Sub2_Sub1_2.aFloat173);
			OpenGL.glTexCoord2f(0.0F, this.aClass46_Sub2_Sub1_2.aFloat173);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass46_Sub2_Sub1_2.aFloat174, 0.0F);
			OpenGL.glTexCoord2f(this.aClass46_Sub2_Sub1_2.aFloat174, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass46_Sub2_Sub1_2.aFloat174, this.aClass46_Sub2_Sub1_2.aFloat173);
			OpenGL.glTexCoord2f(this.aClass46_Sub2_Sub1_2.aFloat174, this.aClass46_Sub2_Sub1_2.aFloat173);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method3257();
		}
	}

	@OriginalMember(owner = "client!iea", name = "ca", descriptor = "()I")
	@Override
	public int ca() {
		return this.aClass46_Sub2_Sub1_2.anInt6372 + this.anInt3990 + this.anInt4002;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected void method7802(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class181 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class46_Sub2_Sub1 local7 = ((Class181_Sub2) arg6).aClass46_Sub2_Sub1_5;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(31) float local31;
		if (this.aBoolean284) {
			local14 = this.A();
			local18 = this.ca();
			local24 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = (float) this.anInt3990 * local37;
			@Pc(56) float local56 = local44 * (float) this.anInt3990;
			@Pc(62) float local62 = (float) this.anInt3995 * local24;
			@Pc(68) float local68 = (float) this.anInt3995 * local31;
			@Pc(75) float local75 = (float) this.anInt3997 * -local24;
			@Pc(82) float local82 = -local31 * (float) this.anInt3997;
			@Pc(89) float local89 = (float) this.anInt4002 * -local37;
			arg1 = local68 + arg1 + local56;
			@Pc(102) float local102 = -local44 * (float) this.anInt4002;
			arg4 = arg4 + local62 + local89;
			arg2 = arg2 + local75 + local50;
			arg0 = local50 + arg0 + local62;
			arg3 = local82 + arg3 + local56;
			arg5 = local102 + local68 + arg5;
		}
		local14 = arg2 + arg4 - arg0;
		this.aClass46_Sub2_Sub1_2.method5134(true);
		local18 = arg3 + arg5 - arg1;
		this.aClass78_Sub3_18.method4489();
		this.aClass78_Sub3_18.method4535(this.aClass46_Sub2_Sub1_2);
		this.aClass78_Sub3_18.method4534(1);
		this.aClass78_Sub3_18.method4549(1);
		this.aClass78_Sub3_18.method4535(local7);
		this.aClass78_Sub3_18.method4539(7681, 8448);
		this.aClass78_Sub3_18.method4493(34168, 0, 768);
		this.aClass78_Sub3_18.method4566(1);
		local24 = local7.aFloat174 / (float) local7.anInt6370;
		local31 = local7.aFloat173 / (float) local7.anInt6372;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass46_Sub2_Sub1_2.aFloat173);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg0), local7.aFloat173 - ((float) -arg8 + arg1) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * local24, local7.aFloat173 - local31 * ((float) -arg8 + arg5));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass46_Sub2_Sub1_2.aFloat174, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + local14), local7.aFloat173 - local31 * ((float) -arg8 + local18));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass46_Sub2_Sub1_2.aFloat174, this.aClass46_Sub2_Sub1_2.aFloat173);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg2), local7.aFloat173 - local31 * ((float) -arg8 + arg3));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass78_Sub3_18.method4493(5890, 0, 768);
		this.aClass78_Sub3_18.method4534(0);
		this.aClass78_Sub3_18.method4535(null);
		this.aClass78_Sub3_18.method4549(0);
	}

	@OriginalMember(owner = "client!iea", name = "da", descriptor = "(IIIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass46_Sub2_Sub1_2.method5147(arg2, arg3, arg4, arg1, arg5, arg0);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method7799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class181_Sub2 local6 = (Class181_Sub2) arg2;
		@Pc(9) Class46_Sub2_Sub1 local9 = local6.aClass46_Sub2_Sub1_5;
		this.aClass46_Sub2_Sub1_2.method5134(false);
		this.aClass78_Sub3_18.method4489();
		this.aClass78_Sub3_18.method4535(this.aClass46_Sub2_Sub1_2);
		this.aClass78_Sub3_18.method4534(1);
		this.aClass78_Sub3_18.method4549(1);
		this.aClass78_Sub3_18.method4535(local9);
		this.aClass78_Sub3_18.method4539(7681, 8448);
		this.aClass78_Sub3_18.method4493(34168, 0, 768);
		this.aClass78_Sub3_18.method4566(1);
		@Pc(62) int local62 = arg1 + this.anInt3990;
		@Pc(67) int local67 = arg0 + this.anInt3995;
		@Pc(73) int local73 = local67 + this.aClass46_Sub2_Sub1_2.anInt6370;
		@Pc(79) int local79 = local62 + this.aClass46_Sub2_Sub1_2.anInt6372;
		@Pc(86) float local86 = local9.aFloat174 / (float) local9.anInt6370;
		@Pc(93) float local93 = local9.aFloat173 / (float) local9.anInt6372;
		@Pc(101) float local101 = local86 * (float) (local67 - arg3);
		@Pc(109) float local109 = (float) (local73 - arg3) * local86;
		@Pc(121) float local121 = local9.aFloat173 - (float) (local62 - arg4) * local93;
		@Pc(132) float local132 = local9.aFloat173 - local93 * (float) (local79 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass46_Sub2_Sub1_2.aFloat173);
		OpenGL.glMultiTexCoord2f(33985, local101, local121);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local132);
		OpenGL.glVertex2i(local67, this.aClass46_Sub2_Sub1_2.anInt6372 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass46_Sub2_Sub1_2.aFloat174, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local132);
		OpenGL.glVertex2i(local67 + this.aClass46_Sub2_Sub1_2.anInt6370, this.aClass46_Sub2_Sub1_2.anInt6372 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass46_Sub2_Sub1_2.aFloat174, this.aClass46_Sub2_Sub1_2.aFloat173);
		OpenGL.glMultiTexCoord2f(33985, local109, local121);
		OpenGL.glVertex2i(this.aClass46_Sub2_Sub1_2.anInt6370 + local67, local62);
		OpenGL.glEnd();
		this.aClass78_Sub3_18.method4493(5890, 0, 768);
		this.aClass78_Sub3_18.method4534(0);
		this.aClass78_Sub3_18.method4535(null);
		this.aClass78_Sub3_18.method4549(0);
	}
}
