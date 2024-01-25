import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class41_Sub2 extends Class41 {

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "Lclient!me;")
	private Class64_Sub4_Sub1 aClass64_Sub4_Sub1_3;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
	private int anInt4423 = 0;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
	private int anInt4420 = 0;

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "Z")
	private boolean aBoolean323 = false;

	@OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
	private int anInt4434 = 0;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
	private int anInt4421 = 0;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
	private int anInt4426 = 0;

	@OriginalMember(owner = "client!mf", name = "w", descriptor = "Lclient!na;")
	private final Class75_Sub2 aClass75_Sub2_25;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "Lclient!me;")
	private final Class64_Sub4_Sub1 aClass64_Sub4_Sub1_2;

	static {
		new Class231("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!na;IIII)V")
	public Class41_Sub2(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass75_Sub2_25 = arg0;
		this.aClass64_Sub4_Sub1_2 = Static378.method5925(arg0, arg1, arg2, arg4, arg3);
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!na;II[III)V")
	public Class41_Sub2(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass75_Sub2_25 = arg0;
		this.aClass64_Sub4_Sub1_2 = Static353.method4957(arg0, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)V")
	private void method3551(@OriginalArg(1) int arg0) {
		this.aClass75_Sub2_25.method3811(1);
		this.aClass75_Sub2_25.method3844(this.aClass64_Sub4_Sub1_2);
		this.aClass75_Sub2_25.method3872(7681, this.aClass75_Sub2_25.method3838(arg0));
		this.aClass75_Sub2_25.method3802(1, 34167, 768);
		this.aClass75_Sub2_25.method3843(0, 34168);
		this.aClass75_Sub2_25.method3811(0);
		this.aClass75_Sub2_25.method3844(this.aClass64_Sub4_Sub1_3);
		this.aClass75_Sub2_25.method3872(7681, 34479);
		this.aClass75_Sub2_25.method3802(1, 34166, 768);
		if (this.anInt4420 == 0) {
			this.aClass75_Sub2_25.method3877(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt4420 == 1) {
			this.aClass75_Sub2_25.method3877(0.5F, 0.5F, 1.0F, 0.0F);
			return;
		} else if (this.anInt4420 == 2) {
			this.aClass75_Sub2_25.method3877(1.0F, 0.5F, 0.5F, 0.0F);
			return;
		} else if (this.anInt4420 == 3) {
			this.aClass75_Sub2_25.method3877(128.5F, 128.5F, 128.5F, 0.0F);
			return;
		}
	}

	@OriginalMember(owner = "client!mf", name = "la", descriptor = "(IIIIIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		this.aClass64_Sub4_Sub1_2.method3523(false);
		@Pc(18) int local18 = arg3 + arg1;
		this.aClass75_Sub2_25.method3833();
		this.aClass75_Sub2_25.method3844(this.aClass64_Sub4_Sub1_2);
		this.aClass75_Sub2_25.method3870(arg6);
		this.aClass75_Sub2_25.method3798(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass64_Sub4_Sub1_2.aBoolean322 && !this.aBoolean323) {
			@Pc(72) float local72 = (float) arg3 * this.aClass64_Sub4_Sub1_2.aFloat37 / (float) this.aClass64_Sub4_Sub1_2.anInt4416;
			@Pc(84) float local84 = this.aClass64_Sub4_Sub1_2.aFloat36 * (float) arg2 / (float) this.aClass64_Sub4_Sub1_2.anInt4413;
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
		OpenGL.glTranslatef((float) this.anInt4434, (float) this.anInt4426, 0.0F);
		@Pc(124) int local124 = this.RA();
		@Pc(127) int local127 = this.Q();
		@Pc(133) int local133 = arg1 + this.aClass64_Sub4_Sub1_2.anInt4416;
		OpenGL.glBegin(7);
		@Pc(137) int local137 = arg1;
		@Pc(145) int local145;
		while (local133 <= local18) {
			local145 = arg0 + this.aClass64_Sub4_Sub1_2.anInt4413;
			@Pc(147) int local147 = arg0;
			while (local9 >= local145) {
				OpenGL.glTexCoord2f(0.0F, this.aClass64_Sub4_Sub1_2.aFloat37);
				OpenGL.glVertex2i(local147, local137);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local133);
				OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_2.aFloat36, 0.0F);
				OpenGL.glVertex2i(local145, local133);
				OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_2.aFloat36, this.aClass64_Sub4_Sub1_2.aFloat37);
				OpenGL.glVertex2i(local145, local137);
				local145 += local124;
				local147 += local124;
			}
			if (local147 < local9) {
				@Pc(214) float local214 = (float) (local9 - local147) * this.aClass64_Sub4_Sub1_2.aFloat36 / (float) this.aClass64_Sub4_Sub1_2.anInt4413;
				OpenGL.glTexCoord2f(0.0F, this.aClass64_Sub4_Sub1_2.aFloat37);
				OpenGL.glVertex2i(local147, local137);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local147, local133);
				OpenGL.glTexCoord2f(local214, 0.0F);
				OpenGL.glVertex2i(local9, local133);
				OpenGL.glTexCoord2f(local214, this.aClass64_Sub4_Sub1_2.aFloat37);
				OpenGL.glVertex2i(local9, local137);
			}
			local137 += local127;
			local133 += local127;
		}
		if (local18 > local137) {
			@Pc(275) float local275 = (float) (local137 + this.aClass64_Sub4_Sub1_2.anInt4416 - local18) * this.aClass64_Sub4_Sub1_2.aFloat37 / (float) this.aClass64_Sub4_Sub1_2.anInt4416;
			@Pc(281) int local281 = arg0 + this.aClass64_Sub4_Sub1_2.anInt4413;
			local145 = arg0;
			while (local281 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass64_Sub4_Sub1_2.aFloat37);
				OpenGL.glVertex2i(local145, local137);
				OpenGL.glTexCoord2f(0.0F, local275);
				OpenGL.glVertex2i(local145, local18);
				OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_2.aFloat36, local275);
				OpenGL.glVertex2i(local281, local18);
				OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_2.aFloat36, this.aClass64_Sub4_Sub1_2.aFloat37);
				OpenGL.glVertex2i(local281, local137);
				local281 += local124;
				local145 += local124;
			}
			if (local145 < local9) {
				@Pc(346) float local346 = this.aClass64_Sub4_Sub1_2.aFloat36 * (float) (local9 - local145) / (float) this.aClass64_Sub4_Sub1_2.anInt4413;
				OpenGL.glTexCoord2f(0.0F, this.aClass64_Sub4_Sub1_2.aFloat37);
				OpenGL.glVertex2i(local145, local137);
				OpenGL.glTexCoord2f(0.0F, local275);
				OpenGL.glVertex2i(local145, local18);
				OpenGL.glTexCoord2f(local346, local275);
				OpenGL.glVertex2i(local9, local18);
				OpenGL.glTexCoord2f(local346, this.aClass64_Sub4_Sub1_2.aFloat37);
				OpenGL.glVertex2i(local9, local137);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!mf", name = "ha", descriptor = "(IIII)V")
	@Override
	public void ha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4426 = arg1;
		this.anInt4434 = arg0;
		this.anInt4423 = arg3;
		this.anInt4421 = arg2;
		this.aBoolean323 = this.anInt4434 != 0 || this.anInt4426 != 0 || this.anInt4421 != 0 || this.anInt4423 != 0;
	}

	@OriginalMember(owner = "client!mf", name = "H", descriptor = "(FFFFFFIII)V")
	@Override
	protected void H(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean323) {
			local10 = this.RA();
			local14 = this.Q();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			@Pc(26) float local26 = (arg3 - arg1) / local10;
			@Pc(33) float local33 = (arg4 - arg0) / local14;
			@Pc(39) float local39 = (arg5 - arg1) / local14;
			@Pc(45) float local45 = local33 * (float) this.anInt4426;
			@Pc(51) float local51 = local39 * (float) this.anInt4426;
			@Pc(57) float local57 = local20 * (float) this.anInt4434;
			@Pc(63) float local63 = local26 * (float) this.anInt4434;
			@Pc(70) float local70 = -local20 * (float) this.anInt4421;
			@Pc(77) float local77 = -local26 * (float) this.anInt4421;
			@Pc(84) float local84 = (float) this.anInt4423 * -local33;
			arg4 = arg4 + local57 + local84;
			arg2 = local45 + arg2 + local70;
			@Pc(103) float local103 = -local39 * (float) this.anInt4423;
			arg3 = local51 + arg3 + local77;
			arg1 = arg1 + local63 + local51;
			arg0 = arg0 + local57 + local45;
			arg5 = arg5 + local63 + local103;
		}
		local10 = arg2 + arg4 - arg0;
		this.aClass64_Sub4_Sub1_2.method3523(true);
		local14 = arg5 + arg3 - arg1;
		this.aClass75_Sub2_25.method3833();
		this.aClass75_Sub2_25.method3844(this.aClass64_Sub4_Sub1_2);
		this.aClass75_Sub2_25.method3870(arg8);
		this.aClass75_Sub2_25.method3798(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass64_Sub4_Sub1_2.aFloat37);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_2.aFloat36, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_2.aFloat36, this.aClass64_Sub4_Sub1_2.aFloat37);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!mf", name = "ya", descriptor = "(IIIIIII)V")
	@Override
	public void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass64_Sub4_Sub1_2.method3523(true);
		this.aClass75_Sub2_25.method3833();
		this.aClass75_Sub2_25.method3870(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean323) {
			@Pc(181) float local181 = (float) arg2 / (float) this.RA();
			@Pc(188) float local188 = (float) arg3 / (float) this.Q();
			@Pc(197) float local197 = (float) this.anInt4434 * local181 + (float) arg0;
			@Pc(206) float local206 = (float) arg1 + local188 * (float) this.anInt4426;
			@Pc(215) float local215 = local181 * (float) this.aClass64_Sub4_Sub1_2.anInt4413 + local197;
			@Pc(224) float local224 = local188 * (float) this.aClass64_Sub4_Sub1_2.anInt4416 + local206;
			if (this.aClass64_Sub4_Sub1_3 == null) {
				this.aClass75_Sub2_25.method3844(this.aClass64_Sub4_Sub1_2);
				this.aClass75_Sub2_25.method3798(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass64_Sub4_Sub1_2.aFloat37);
				OpenGL.glVertex2f(local197, local206);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local197, local224);
				OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_2.aFloat36, 0.0F);
				OpenGL.glVertex2f(local215, local224);
				OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_2.aFloat36, this.aClass64_Sub4_Sub1_2.aFloat37);
				OpenGL.glVertex2f(local215, local206);
				OpenGL.glEnd();
			} else {
				this.method3551(arg4);
				this.aClass64_Sub4_Sub1_3.method3523(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass64_Sub4_Sub1_2.aFloat37);
				OpenGL.glTexCoord2f(0.0F, this.aClass64_Sub4_Sub1_2.aFloat37);
				OpenGL.glVertex2f(local197, local206);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local197, local224);
				OpenGL.glMultiTexCoord2f(33985, this.aClass64_Sub4_Sub1_2.aFloat36, 0.0F);
				OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_2.aFloat36, 0.0F);
				OpenGL.glVertex2f(local215, local224);
				OpenGL.glMultiTexCoord2f(33985, this.aClass64_Sub4_Sub1_2.aFloat36, this.aClass64_Sub4_Sub1_2.aFloat37);
				OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_2.aFloat36, this.aClass64_Sub4_Sub1_2.aFloat37);
				OpenGL.glVertex2f(local215, local206);
				OpenGL.glEnd();
				this.method3554();
			}
		} else if (this.aClass64_Sub4_Sub1_3 == null) {
			this.aClass75_Sub2_25.method3844(this.aClass64_Sub4_Sub1_2);
			this.aClass75_Sub2_25.method3798(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass64_Sub4_Sub1_2.aFloat37);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_2.aFloat36, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_2.aFloat36, this.aClass64_Sub4_Sub1_2.aFloat37);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method3551(arg4);
			this.aClass64_Sub4_Sub1_3.method3523(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass64_Sub4_Sub1_2.aFloat37);
			OpenGL.glTexCoord2f(0.0F, this.aClass64_Sub4_Sub1_2.aFloat37);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass64_Sub4_Sub1_2.aFloat36, 0.0F);
			OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_2.aFloat36, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass64_Sub4_Sub1_2.aFloat36, this.aClass64_Sub4_Sub1_2.aFloat37);
			OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_2.aFloat36, this.aClass64_Sub4_Sub1_2.aFloat37);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method3554();
		}
	}

	@OriginalMember(owner = "client!mf", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		return this.aClass64_Sub4_Sub1_2.anInt4416 + this.anInt4426 + this.anInt4423;
	}

	@OriginalMember(owner = "client!mf", name = "W", descriptor = "(IIIII)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass64_Sub4_Sub1_2.method3523(false);
		this.aClass75_Sub2_25.method3833();
		this.aClass75_Sub2_25.method3870(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt4426;
		@Pc(42) int local42 = arg0 + this.anInt4434;
		if (this.aClass64_Sub4_Sub1_3 == null) {
			this.aClass75_Sub2_25.method3844(this.aClass64_Sub4_Sub1_2);
			this.aClass75_Sub2_25.method3798(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass64_Sub4_Sub1_2.aFloat37);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, this.aClass64_Sub4_Sub1_2.anInt4416 + local37);
			OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_2.aFloat36, 0.0F);
			OpenGL.glVertex2i(local42 + this.aClass64_Sub4_Sub1_2.anInt4413, this.aClass64_Sub4_Sub1_2.anInt4416 + local37);
			OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_2.aFloat36, this.aClass64_Sub4_Sub1_2.aFloat37);
			OpenGL.glVertex2i(local42 + this.aClass64_Sub4_Sub1_2.anInt4413, local37);
			OpenGL.glEnd();
			return;
		}
		this.method3551(arg2);
		this.aClass64_Sub4_Sub1_3.method3523(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass64_Sub4_Sub1_2.aFloat37);
		OpenGL.glTexCoord2f(0.0F, this.aClass64_Sub4_Sub1_2.aFloat37);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, this.aClass64_Sub4_Sub1_2.anInt4416 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass64_Sub4_Sub1_2.aFloat36, 0.0F);
		OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_2.aFloat36, 0.0F);
		OpenGL.glVertex2i(this.aClass64_Sub4_Sub1_2.anInt4413 + local42, local37 - -this.aClass64_Sub4_Sub1_2.anInt4416);
		OpenGL.glMultiTexCoord2f(33985, this.aClass64_Sub4_Sub1_2.aFloat36, this.aClass64_Sub4_Sub1_2.aFloat37);
		OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_2.aFloat36, this.aClass64_Sub4_Sub1_2.aFloat37);
		OpenGL.glVertex2i(this.aClass64_Sub4_Sub1_2.anInt4413 + local42, local37);
		OpenGL.glEnd();
		this.method3554();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	private void method3554() {
		this.aClass75_Sub2_25.method3811(1);
		this.aClass75_Sub2_25.method3844(null);
		this.aClass75_Sub2_25.method3872(8448, 8448);
		this.aClass75_Sub2_25.method3802(1, 34168, 768);
		this.aClass75_Sub2_25.method3843(0, 5890);
		this.aClass75_Sub2_25.method3811(0);
		this.aClass75_Sub2_25.method3802(1, 34168, 768);
	}

	@OriginalMember(owner = "client!mf", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass64_Sub4_Sub1_3 = Static378.method5925(this.aClass75_Sub2_25, arg0, arg1, this.aClass64_Sub4_Sub1_2.anInt4416, this.aClass64_Sub4_Sub1_2.anInt4413);
		this.anInt4420 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!mf", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return this.aClass64_Sub4_Sub1_2.anInt4413;
	}

	@OriginalMember(owner = "client!mf", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		return this.aClass64_Sub4_Sub1_2.anInt4416;
	}

	@OriginalMember(owner = "client!mf", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		return this.anInt4421 + this.anInt4434 + this.aClass64_Sub4_Sub1_2.anInt4413;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(FFFFFFLclient!ta;II)V")
	@Override
	protected void method6091(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class102 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class64_Sub4_Sub1 local7 = ((Class102_Sub1) arg6).aClass64_Sub4_Sub1_1;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(31) float local31;
		if (this.aBoolean323) {
			local14 = this.RA();
			local18 = this.Q();
			local25 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = local38 * (float) this.anInt4426;
			@Pc(56) float local56 = local44 * (float) this.anInt4426;
			@Pc(62) float local62 = local25 * (float) this.anInt4434;
			@Pc(68) float local68 = local31 * (float) this.anInt4434;
			@Pc(75) float local75 = (float) this.anInt4421 * -local25;
			@Pc(82) float local82 = -local31 * (float) this.anInt4421;
			@Pc(89) float local89 = -local38 * (float) this.anInt4423;
			arg1 = arg1 + local68 + local56;
			arg2 = local75 + arg2 + local50;
			arg0 = local62 + arg0 + local50;
			arg4 = local62 + arg4 + local89;
			@Pc(120) float local120 = (float) this.anInt4423 * -local44;
			arg3 = local82 + arg3 + local56;
			arg5 = local68 + arg5 + local120;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass64_Sub4_Sub1_2.method3523(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass75_Sub2_25.method3833();
		this.aClass75_Sub2_25.method3844(this.aClass64_Sub4_Sub1_2);
		this.aClass75_Sub2_25.method3798(1);
		this.aClass75_Sub2_25.method3811(1);
		this.aClass75_Sub2_25.method3844(local7);
		this.aClass75_Sub2_25.method3872(8448, 7681);
		this.aClass75_Sub2_25.method3802(0, 34168, 768);
		this.aClass75_Sub2_25.method3870(1);
		local25 = local7.aFloat36 / (float) local7.anInt4413;
		local31 = local7.aFloat37 / (float) local7.anInt4416;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass64_Sub4_Sub1_2.aFloat37);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg0 - (float) arg7), local7.aFloat37 - ((float) -arg8 + arg1) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * local25, local7.aFloat37 - ((float) -arg8 + arg5) * local31);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass64_Sub4_Sub1_2.aFloat36, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * (local14 - (float) arg7), local7.aFloat37 - ((float) -arg8 + local18) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass64_Sub4_Sub1_2.aFloat36, this.aClass64_Sub4_Sub1_2.aFloat37);
		OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * local25, local7.aFloat37 - local31 * ((float) -arg8 + arg3));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass75_Sub2_25.method3802(0, 5890, 768);
		this.aClass75_Sub2_25.method3798(0);
		this.aClass75_Sub2_25.method3844(null);
		this.aClass75_Sub2_25.method3811(0);
	}

	@OriginalMember(owner = "client!mf", name = "XA", descriptor = "(IIIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass64_Sub4_Sub1_2.method3529(arg0, arg3, arg5, arg2, arg1, arg4);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILclient!ta;II)V")
	@Override
	public void method6082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class102 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class102_Sub1 local6 = (Class102_Sub1) arg2;
		@Pc(9) Class64_Sub4_Sub1 local9 = local6.aClass64_Sub4_Sub1_1;
		this.aClass64_Sub4_Sub1_2.method3523(false);
		this.aClass75_Sub2_25.method3833();
		this.aClass75_Sub2_25.method3844(this.aClass64_Sub4_Sub1_2);
		this.aClass75_Sub2_25.method3798(1);
		this.aClass75_Sub2_25.method3811(1);
		this.aClass75_Sub2_25.method3844(local9);
		this.aClass75_Sub2_25.method3872(8448, 7681);
		this.aClass75_Sub2_25.method3802(0, 34168, 768);
		this.aClass75_Sub2_25.method3870(1);
		@Pc(62) int local62 = arg0 + this.anInt4434;
		@Pc(67) int local67 = arg1 + this.anInt4426;
		@Pc(73) int local73 = this.aClass64_Sub4_Sub1_2.anInt4413 + local62;
		@Pc(79) int local79 = local67 + this.aClass64_Sub4_Sub1_2.anInt4416;
		@Pc(86) float local86 = local9.aFloat36 / (float) local9.anInt4413;
		@Pc(93) float local93 = local9.aFloat37 / (float) local9.anInt4416;
		@Pc(100) float local100 = (float) (local62 - arg3) * local86;
		@Pc(108) float local108 = local86 * (float) (local73 - arg3);
		@Pc(120) float local120 = local9.aFloat37 - (float) (local67 - arg4) * local93;
		@Pc(132) float local132 = local9.aFloat37 - (float) (local79 - arg4) * local93;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass64_Sub4_Sub1_2.aFloat37);
		OpenGL.glMultiTexCoord2f(33985, local100, local120);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local100, local132);
		OpenGL.glVertex2i(local62, this.aClass64_Sub4_Sub1_2.anInt4416 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass64_Sub4_Sub1_2.aFloat36, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local108, local132);
		OpenGL.glVertex2i(local62 + this.aClass64_Sub4_Sub1_2.anInt4413, local67 + this.aClass64_Sub4_Sub1_2.anInt4416);
		OpenGL.glMultiTexCoord2f(33984, this.aClass64_Sub4_Sub1_2.aFloat36, this.aClass64_Sub4_Sub1_2.aFloat37);
		OpenGL.glMultiTexCoord2f(33985, local108, local120);
		OpenGL.glVertex2i(this.aClass64_Sub4_Sub1_2.anInt4413 + local62, local67);
		OpenGL.glEnd();
		this.aClass75_Sub2_25.method3802(0, 5890, 768);
		this.aClass75_Sub2_25.method3798(0);
		this.aClass75_Sub2_25.method3844(null);
		this.aClass75_Sub2_25.method3811(0);
	}
}
