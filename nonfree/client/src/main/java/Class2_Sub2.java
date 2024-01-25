import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "Lclient!ld;")
	private Class137_Sub1_Sub1 aClass137_Sub1_Sub1_3;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
	private int anInt4060 = 0;

	@OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
	private int anInt4074 = 0;

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
	private int anInt4073 = 0;

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
	private int anInt4065 = 0;

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
	private int anInt4079 = 0;

	@OriginalMember(owner = "client!lm", name = "C", descriptor = "Z")
	private boolean aBoolean296 = false;

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "Lclient!nq;")
	private final Class167_Sub1 aClass167_Sub1_24;

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "Lclient!ld;")
	private final Class137_Sub1_Sub1 aClass137_Sub1_Sub1_4;

	static {
		new Class174("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!nq;IIII)V")
	public Class2_Sub2(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass167_Sub1_24 = arg0;
		this.aClass137_Sub1_Sub1_4 = Static137.method2093(arg3, arg2, arg0, arg1, arg4);
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!nq;II[III)V")
	public Class2_Sub2(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass167_Sub1_24 = arg0;
		this.aClass137_Sub1_Sub1_4 = Static10.method146(arg1, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!lm", name = "V", descriptor = "()I")
	@Override
	public int V() {
		return this.aClass137_Sub1_Sub1_4.anInt3919;
	}

	@OriginalMember(owner = "client!lm", name = "ta", descriptor = "(FFFFFFIII)V")
	@Override
	protected void ta(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean296) {
			local10 = this.d();
			local14 = this.ga();
			@Pc(21) float local21 = (arg2 - arg0) / local10;
			@Pc(27) float local27 = (arg3 - arg1) / local10;
			@Pc(34) float local34 = (arg4 - arg0) / local14;
			@Pc(41) float local41 = (arg5 - arg1) / local14;
			@Pc(47) float local47 = (float) this.anInt4073 * local34;
			@Pc(53) float local53 = (float) this.anInt4073 * local41;
			@Pc(59) float local59 = local21 * (float) this.anInt4060;
			@Pc(65) float local65 = (float) this.anInt4060 * local27;
			@Pc(72) float local72 = -local21 * (float) this.anInt4079;
			@Pc(79) float local79 = -local27 * (float) this.anInt4079;
			@Pc(86) float local86 = -local34 * (float) this.anInt4065;
			arg4 = arg4 + local59 + local86;
			arg0 = local47 + local59 + arg0;
			arg3 = local53 + local79 + arg3;
			arg2 = local72 + arg2 + local47;
			@Pc(117) float local117 = (float) this.anInt4065 * -local41;
			arg1 = local53 + local65 + arg1;
			arg5 = local117 + arg5 + local65;
		}
		local10 = arg2 + arg4 - arg0;
		this.aClass137_Sub1_Sub1_4.method5783(true);
		local14 = arg3 + arg5 - arg1;
		this.aClass167_Sub1_24.method4049();
		this.aClass167_Sub1_24.method4028(this.aClass137_Sub1_Sub1_4);
		this.aClass167_Sub1_24.method4040(arg8);
		this.aClass167_Sub1_24.method3998(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_4.aFloat57);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_4.aFloat58, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_4.aFloat58, this.aClass137_Sub1_Sub1_4.aFloat57);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)V")
	private void method3457(@OriginalArg(1) int arg0) {
		this.aClass167_Sub1_24.method3993(1);
		this.aClass167_Sub1_24.method4028(this.aClass137_Sub1_Sub1_4);
		this.aClass167_Sub1_24.method3983(this.aClass167_Sub1_24.method4023(arg0), 7681);
		this.aClass167_Sub1_24.method4012(34167, 768, 1);
		this.aClass167_Sub1_24.method3997(0, 34168);
		this.aClass167_Sub1_24.method3993(0);
		this.aClass167_Sub1_24.method4028(this.aClass137_Sub1_Sub1_3);
		this.aClass167_Sub1_24.method3983(34479, 7681);
		this.aClass167_Sub1_24.method4012(34166, 768, 1);
		if (this.anInt4074 == 0) {
			this.aClass167_Sub1_24.method3973(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt4074 == 1) {
			this.aClass167_Sub1_24.method3973(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt4074 == 2) {
			this.aClass167_Sub1_24.method3973(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt4074 == 3) {
			this.aClass167_Sub1_24.method3973(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!lm", name = "PA", descriptor = "(IIIIIII)V")
	@Override
	public void PA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		@Pc(13) int local13 = arg3 + arg1;
		this.aClass137_Sub1_Sub1_4.method5783(false);
		this.aClass167_Sub1_24.method4049();
		this.aClass167_Sub1_24.method4028(this.aClass137_Sub1_Sub1_4);
		this.aClass167_Sub1_24.method4040(arg6);
		this.aClass167_Sub1_24.method3998(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass137_Sub1_Sub1_4.aBoolean289 && !this.aBoolean296) {
			@Pc(72) float local72 = (float) arg3 * this.aClass137_Sub1_Sub1_4.aFloat57 / (float) this.aClass137_Sub1_Sub1_4.anInt3919;
			@Pc(84) float local84 = this.aClass137_Sub1_Sub1_4.aFloat58 * (float) arg2 / (float) this.aClass137_Sub1_Sub1_4.anInt3918;
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
		OpenGL.glTranslatef((float) this.anInt4060, (float) this.anInt4073, 0.0F);
		@Pc(124) int local124 = this.d();
		@Pc(127) int local127 = this.ga();
		@Pc(133) int local133 = arg1 + this.aClass137_Sub1_Sub1_4.anInt3919;
		OpenGL.glBegin(7);
		@Pc(137) int local137 = arg1;
		@Pc(145) int local145;
		while (local133 <= local13) {
			local145 = this.aClass137_Sub1_Sub1_4.anInt3918 + arg0;
			@Pc(147) int local147 = arg0;
			while (local145 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_4.aFloat57);
				OpenGL.glVertex2i(local147, local137);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local133);
				OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_4.aFloat58, 0.0F);
				OpenGL.glVertex2i(local145, local133);
				OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_4.aFloat58, this.aClass137_Sub1_Sub1_4.aFloat57);
				OpenGL.glVertex2i(local145, local137);
				local147 += local124;
				local145 += local124;
			}
			if (local147 < local9) {
				@Pc(210) float local210 = (float) (local9 - local147) * this.aClass137_Sub1_Sub1_4.aFloat58 / (float) this.aClass137_Sub1_Sub1_4.anInt3918;
				OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_4.aFloat57);
				OpenGL.glVertex2i(local147, local137);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local133);
				OpenGL.glTexCoord2f(local210, 0.0F);
				OpenGL.glVertex2i(local9, local133);
				OpenGL.glTexCoord2f(local210, this.aClass137_Sub1_Sub1_4.aFloat57);
				OpenGL.glVertex2i(local9, local137);
			}
			local137 += local127;
			local133 += local127;
		}
		if (local137 < local13) {
			@Pc(275) float local275 = (float) (this.aClass137_Sub1_Sub1_4.anInt3919 + local137 - local13) * this.aClass137_Sub1_Sub1_4.aFloat57 / (float) this.aClass137_Sub1_Sub1_4.anInt3919;
			@Pc(281) int local281 = arg0 + this.aClass137_Sub1_Sub1_4.anInt3918;
			local145 = arg0;
			while (local9 >= local281) {
				OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_4.aFloat57);
				OpenGL.glVertex2i(local145, local137);
				OpenGL.glTexCoord2f(0.0F, local275);
				OpenGL.glVertex2i(local145, local13);
				OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_4.aFloat58, local275);
				OpenGL.glVertex2i(local281, local13);
				OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_4.aFloat58, this.aClass137_Sub1_Sub1_4.aFloat57);
				OpenGL.glVertex2i(local281, local137);
				local145 += local124;
				local281 += local124;
			}
			if (local9 > local145) {
				@Pc(349) float local349 = (float) (local9 - local145) * this.aClass137_Sub1_Sub1_4.aFloat58 / (float) this.aClass137_Sub1_Sub1_4.anInt3918;
				OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_4.aFloat57);
				OpenGL.glVertex2i(local145, local137);
				OpenGL.glTexCoord2f(0.0F, local275);
				OpenGL.glVertex2i(local145, local13);
				OpenGL.glTexCoord2f(local349, local275);
				OpenGL.glVertex2i(local9, local13);
				OpenGL.glTexCoord2f(local349, this.aClass137_Sub1_Sub1_4.aFloat57);
				OpenGL.glVertex2i(local9, local137);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!lm", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		return this.aClass137_Sub1_Sub1_4.anInt3918;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(FFFFFFLclient!i;II)V")
	@Override
	protected void method5836(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class14 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class137_Sub1_Sub1 local7 = ((Class14_Sub1) arg6).aClass137_Sub1_Sub1_1;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(32) float local32;
		if (this.aBoolean296) {
			local14 = this.d();
			local18 = this.ga();
			local25 = (arg2 - arg0) / local14;
			local32 = (arg3 - arg1) / local14;
			@Pc(39) float local39 = (arg4 - arg0) / local18;
			@Pc(45) float local45 = (arg5 - arg1) / local18;
			@Pc(51) float local51 = local39 * (float) this.anInt4073;
			@Pc(57) float local57 = local45 * (float) this.anInt4073;
			@Pc(63) float local63 = local25 * (float) this.anInt4060;
			@Pc(69) float local69 = local32 * (float) this.anInt4060;
			@Pc(76) float local76 = (float) this.anInt4079 * -local25;
			@Pc(83) float local83 = -local32 * (float) this.anInt4079;
			@Pc(90) float local90 = (float) this.anInt4065 * -local39;
			arg0 = local51 + local63 + arg0;
			arg4 = local63 + arg4 + local90;
			arg2 = local51 + local76 + arg2;
			@Pc(115) float local115 = -local45 * (float) this.anInt4065;
			arg3 = arg3 + local83 + local57;
			arg1 = local57 + arg1 + local69;
			arg5 = local115 + local69 + arg5;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass137_Sub1_Sub1_4.method5783(true);
		local18 = arg3 + arg5 - arg1;
		this.aClass167_Sub1_24.method4049();
		this.aClass167_Sub1_24.method4028(this.aClass137_Sub1_Sub1_4);
		this.aClass167_Sub1_24.method3998(1);
		this.aClass167_Sub1_24.method3993(1);
		this.aClass167_Sub1_24.method4028(local7);
		this.aClass167_Sub1_24.method3983(7681, 8448);
		this.aClass167_Sub1_24.method4012(34168, 768, 0);
		this.aClass167_Sub1_24.method4040(1);
		local25 = local7.aFloat58 / (float) local7.anInt3918;
		local32 = local7.aFloat57 / (float) local7.anInt3919;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass137_Sub1_Sub1_4.aFloat57);
		OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * local25, local7.aFloat57 - (arg1 - (float) arg8) * local32);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg4), local7.aFloat57 - local32 * ((float) -arg8 + arg5));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass137_Sub1_Sub1_4.aFloat58, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (local14 - (float) arg7) * local25, local7.aFloat57 - local32 * (local18 - (float) arg8));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass137_Sub1_Sub1_4.aFloat58, this.aClass137_Sub1_Sub1_4.aFloat57);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg2) * local25, local7.aFloat57 - ((float) -arg8 + arg3) * local32);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass167_Sub1_24.method4012(5890, 768, 0);
		this.aClass167_Sub1_24.method3998(0);
		this.aClass167_Sub1_24.method4028(null);
		this.aClass167_Sub1_24.method3993(0);
	}

	@OriginalMember(owner = "client!lm", name = "E", descriptor = "(IIIII)V")
	@Override
	public void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass137_Sub1_Sub1_4.method5783(false);
		this.aClass167_Sub1_24.method4049();
		this.aClass167_Sub1_24.method4040(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt4060;
		@Pc(42) int local42 = arg1 + this.anInt4073;
		if (this.aClass137_Sub1_Sub1_3 == null) {
			this.aClass167_Sub1_24.method4028(this.aClass137_Sub1_Sub1_4);
			this.aClass167_Sub1_24.method3998(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_4.aFloat57);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass137_Sub1_Sub1_4.anInt3919 + local42);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_4.aFloat58, 0.0F);
			OpenGL.glVertex2i(this.aClass137_Sub1_Sub1_4.anInt3918 + local37, local42 + this.aClass137_Sub1_Sub1_4.anInt3919);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_4.aFloat58, this.aClass137_Sub1_Sub1_4.aFloat57);
			OpenGL.glVertex2i(local37 + this.aClass137_Sub1_Sub1_4.anInt3918, local42);
			OpenGL.glEnd();
			return;
		}
		this.method3457(arg2);
		this.aClass137_Sub1_Sub1_3.method5783(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass137_Sub1_Sub1_4.aFloat57);
		OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_4.aFloat57);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, local42 + this.aClass137_Sub1_Sub1_4.anInt3919);
		OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_4.aFloat58, 0.0F);
		OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_4.aFloat58, 0.0F);
		OpenGL.glVertex2i(this.aClass137_Sub1_Sub1_4.anInt3918 + local37, local42 + this.aClass137_Sub1_Sub1_4.anInt3919);
		OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_4.aFloat58, this.aClass137_Sub1_Sub1_4.aFloat57);
		OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_4.aFloat58, this.aClass137_Sub1_Sub1_4.aFloat57);
		OpenGL.glVertex2i(local37 + this.aClass137_Sub1_Sub1_4.anInt3918, local42);
		OpenGL.glEnd();
		this.method3460();
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "()I")
	@Override
	public int d() {
		return this.anInt4079 + this.anInt4060 + this.aClass137_Sub1_Sub1_4.anInt3918;
	}

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "(IIII)V")
	@Override
	public void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4079 = arg2;
		this.anInt4065 = arg3;
		this.anInt4073 = arg1;
		this.anInt4060 = arg0;
		this.aBoolean296 = this.anInt4060 != 0 || this.anInt4073 != 0 || this.anInt4079 != 0 || this.anInt4065 != 0;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
	private void method3460() {
		this.aClass167_Sub1_24.method3993(1);
		this.aClass167_Sub1_24.method4028(null);
		this.aClass167_Sub1_24.method3983(8448, 8448);
		this.aClass167_Sub1_24.method4012(34168, 768, 1);
		this.aClass167_Sub1_24.method3997(0, 5890);
		this.aClass167_Sub1_24.method3993(0);
		this.aClass167_Sub1_24.method4012(34168, 768, 1);
	}

	@OriginalMember(owner = "client!lm", name = "D", descriptor = "(IIIIII)V")
	@Override
	public void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass137_Sub1_Sub1_4.method3349(arg4, arg0, arg3, arg1, arg5, arg2);
	}

	@OriginalMember(owner = "client!lm", name = "XA", descriptor = "(IIIIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass137_Sub1_Sub1_4.method5783(true);
		this.aClass167_Sub1_24.method4049();
		this.aClass167_Sub1_24.method4040(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean296) {
			@Pc(183) float local183 = (float) arg2 / (float) this.d();
			@Pc(190) float local190 = (float) arg3 / (float) this.ga();
			@Pc(199) float local199 = local183 * (float) this.anInt4060 + (float) arg0;
			@Pc(208) float local208 = (float) arg1 + (float) this.anInt4073 * local190;
			@Pc(217) float local217 = local199 + local183 * (float) this.aClass137_Sub1_Sub1_4.anInt3918;
			@Pc(226) float local226 = local190 * (float) this.aClass137_Sub1_Sub1_4.anInt3919 + local208;
			if (this.aClass137_Sub1_Sub1_3 == null) {
				this.aClass167_Sub1_24.method4028(this.aClass137_Sub1_Sub1_4);
				this.aClass167_Sub1_24.method3998(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_4.aFloat57);
				OpenGL.glVertex2f(local199, local208);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local199, local226);
				OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_4.aFloat58, 0.0F);
				OpenGL.glVertex2f(local217, local226);
				OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_4.aFloat58, this.aClass137_Sub1_Sub1_4.aFloat57);
				OpenGL.glVertex2f(local217, local208);
				OpenGL.glEnd();
			} else {
				this.method3457(arg4);
				this.aClass137_Sub1_Sub1_3.method5783(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass137_Sub1_Sub1_4.aFloat57);
				OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_4.aFloat57);
				OpenGL.glVertex2f(local199, local208);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local199, local226);
				OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_4.aFloat58, 0.0F);
				OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_4.aFloat58, 0.0F);
				OpenGL.glVertex2f(local217, local226);
				OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_4.aFloat58, this.aClass137_Sub1_Sub1_4.aFloat57);
				OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_4.aFloat58, this.aClass137_Sub1_Sub1_4.aFloat57);
				OpenGL.glVertex2f(local217, local208);
				OpenGL.glEnd();
				this.method3460();
			}
		} else if (this.aClass137_Sub1_Sub1_3 == null) {
			this.aClass167_Sub1_24.method4028(this.aClass137_Sub1_Sub1_4);
			this.aClass167_Sub1_24.method3998(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_4.aFloat57);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_4.aFloat58, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_4.aFloat58, this.aClass137_Sub1_Sub1_4.aFloat57);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method3457(arg4);
			this.aClass137_Sub1_Sub1_3.method5783(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass137_Sub1_Sub1_4.aFloat57);
			OpenGL.glTexCoord2f(0.0F, this.aClass137_Sub1_Sub1_4.aFloat57);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_4.aFloat58, 0.0F);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_4.aFloat58, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass137_Sub1_Sub1_4.aFloat58, this.aClass137_Sub1_Sub1_4.aFloat57);
			OpenGL.glTexCoord2f(this.aClass137_Sub1_Sub1_4.aFloat58, this.aClass137_Sub1_Sub1_4.aFloat57);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method3460();
		}
	}

	@OriginalMember(owner = "client!lm", name = "ga", descriptor = "()I")
	@Override
	public int ga() {
		return this.anInt4073 + this.aClass137_Sub1_Sub1_4.anInt3919 + this.anInt4065;
	}

	@OriginalMember(owner = "client!lm", name = "J", descriptor = "(III)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass137_Sub1_Sub1_3 = Static137.method2093(this.aClass137_Sub1_Sub1_4.anInt3918, arg1, this.aClass167_Sub1_24, arg0, this.aClass137_Sub1_Sub1_4.anInt3919);
		this.anInt4074 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILclient!i;II)V")
	@Override
	public void method5833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class14_Sub1 local6 = (Class14_Sub1) arg2;
		@Pc(9) Class137_Sub1_Sub1 local9 = local6.aClass137_Sub1_Sub1_1;
		this.aClass137_Sub1_Sub1_4.method5783(false);
		this.aClass167_Sub1_24.method4049();
		this.aClass167_Sub1_24.method4028(this.aClass137_Sub1_Sub1_4);
		this.aClass167_Sub1_24.method3998(1);
		this.aClass167_Sub1_24.method3993(1);
		this.aClass167_Sub1_24.method4028(local9);
		this.aClass167_Sub1_24.method3983(7681, 8448);
		this.aClass167_Sub1_24.method4012(34168, 768, 0);
		this.aClass167_Sub1_24.method4040(1);
		@Pc(62) int local62 = arg1 + this.anInt4073;
		@Pc(67) int local67 = arg0 + this.anInt4060;
		@Pc(74) int local74 = local67 + this.aClass137_Sub1_Sub1_4.anInt3918;
		@Pc(80) int local80 = local62 + this.aClass137_Sub1_Sub1_4.anInt3919;
		@Pc(87) float local87 = local9.aFloat58 / (float) local9.anInt3918;
		@Pc(94) float local94 = local9.aFloat57 / (float) local9.anInt3919;
		@Pc(102) float local102 = local87 * (float) (local67 - arg3);
		@Pc(110) float local110 = local87 * (float) (local74 - arg3);
		@Pc(121) float local121 = local9.aFloat57 - (float) (local62 - arg4) * local94;
		@Pc(132) float local132 = local9.aFloat57 - (float) (local80 - arg4) * local94;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass137_Sub1_Sub1_4.aFloat57);
		OpenGL.glMultiTexCoord2f(33985, local102, local121);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local132);
		OpenGL.glVertex2i(local67, this.aClass137_Sub1_Sub1_4.anInt3919 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass137_Sub1_Sub1_4.aFloat58, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local132);
		OpenGL.glVertex2i(this.aClass137_Sub1_Sub1_4.anInt3918 + local67, this.aClass137_Sub1_Sub1_4.anInt3919 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass137_Sub1_Sub1_4.aFloat58, this.aClass137_Sub1_Sub1_4.aFloat57);
		OpenGL.glMultiTexCoord2f(33985, local110, local121);
		OpenGL.glVertex2i(local67 + this.aClass137_Sub1_Sub1_4.anInt3918, local62);
		OpenGL.glEnd();
		this.aClass167_Sub1_24.method4012(5890, 768, 0);
		this.aClass167_Sub1_24.method3998(0);
		this.aClass167_Sub1_24.method4028(null);
		this.aClass167_Sub1_24.method3993(0);
	}
}
