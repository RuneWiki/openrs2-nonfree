import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!bl", name = "i", descriptor = "Lclient!cw;")
	private Class42_Sub1_Sub1 aClass42_Sub1_Sub1_1;

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
	private int anInt898 = 0;

	@OriginalMember(owner = "client!bl", name = "j", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
	private int anInt903 = 0;

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
	private int anInt896 = 0;

	@OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
	private int anInt911 = 0;

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
	private int anInt895 = 0;

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "Lclient!gk;")
	private final Class75_Sub2 aClass75_Sub2_2;

	@OriginalMember(owner = "client!bl", name = "q", descriptor = "Lclient!cw;")
	private final Class42_Sub1_Sub1 aClass42_Sub1_Sub1_2;

	static {
		new Class175("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!gk;IIII)V")
	public Class22_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass75_Sub2_2 = arg0;
		this.aClass42_Sub1_Sub1_2 = Static181.method3080(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!gk;II[III)V")
	public Class22_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass75_Sub2_2 = arg0;
		this.aClass42_Sub1_Sub1_2 = Static436.method5784(arg3, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!bl", name = "D", descriptor = "(IIIIIII)V")
	@Override
	public void D(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg0 + arg2;
		this.aClass42_Sub1_Sub1_2.method4910(false);
		@Pc(19) int local19 = arg3 + arg1;
		this.aClass75_Sub2_2.method2465();
		this.aClass75_Sub2_2.method2456(this.aClass42_Sub1_Sub1_2);
		this.aClass75_Sub2_2.method2445(arg6);
		this.aClass75_Sub2_2.method2424(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass42_Sub1_Sub1_2.aBoolean118 && !this.aBoolean85) {
			@Pc(73) float local73 = this.aClass42_Sub1_Sub1_2.aFloat18 * (float) arg3 / (float) this.aClass42_Sub1_Sub1_2.anInt1543;
			@Pc(85) float local85 = (float) arg2 * this.aClass42_Sub1_Sub1_2.aFloat17 / (float) this.aClass42_Sub1_Sub1_2.anInt1542;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local73);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local19);
			OpenGL.glTexCoord2f(local85, 0.0F);
			OpenGL.glVertex2i(local10, local19);
			OpenGL.glTexCoord2f(local85, local73);
			OpenGL.glVertex2i(local10, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt903, (float) this.anInt896, 0.0F);
		@Pc(125) int local125 = this.ja();
		@Pc(128) int local128 = this.JA();
		@Pc(135) int local135 = arg1 + this.aClass42_Sub1_Sub1_2.anInt1543;
		OpenGL.glBegin(7);
		@Pc(139) int local139 = arg1;
		@Pc(148) int local148;
		while (local19 >= local135) {
			local148 = arg0 + this.aClass42_Sub1_Sub1_2.anInt1542;
			@Pc(150) int local150 = arg0;
			while (local148 <= local10) {
				OpenGL.glTexCoord2f(0.0F, this.aClass42_Sub1_Sub1_2.aFloat18);
				OpenGL.glVertex2i(local150, local139);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local150, local135);
				OpenGL.glTexCoord2f(this.aClass42_Sub1_Sub1_2.aFloat17, 0.0F);
				OpenGL.glVertex2i(local148, local135);
				OpenGL.glTexCoord2f(this.aClass42_Sub1_Sub1_2.aFloat17, this.aClass42_Sub1_Sub1_2.aFloat18);
				OpenGL.glVertex2i(local148, local139);
				local150 += local125;
				local148 += local125;
			}
			if (local150 < local10) {
				@Pc(217) float local217 = this.aClass42_Sub1_Sub1_2.aFloat17 * (float) (local10 - local150) / (float) this.aClass42_Sub1_Sub1_2.anInt1542;
				OpenGL.glTexCoord2f(0.0F, this.aClass42_Sub1_Sub1_2.aFloat18);
				OpenGL.glVertex2i(local150, local139);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local150, local135);
				OpenGL.glTexCoord2f(local217, 0.0F);
				OpenGL.glVertex2i(local10, local135);
				OpenGL.glTexCoord2f(local217, this.aClass42_Sub1_Sub1_2.aFloat18);
				OpenGL.glVertex2i(local10, local139);
			}
			local139 += local128;
			local135 += local128;
		}
		if (local19 > local139) {
			@Pc(277) float local277 = (float) (local139 + this.aClass42_Sub1_Sub1_2.anInt1543 - local19) * this.aClass42_Sub1_Sub1_2.aFloat18 / (float) this.aClass42_Sub1_Sub1_2.anInt1543;
			@Pc(283) int local283 = this.aClass42_Sub1_Sub1_2.anInt1542 + arg0;
			local148 = arg0;
			while (local10 >= local283) {
				OpenGL.glTexCoord2f(0.0F, this.aClass42_Sub1_Sub1_2.aFloat18);
				OpenGL.glVertex2i(local148, local139);
				OpenGL.glTexCoord2f(0.0F, local277);
				OpenGL.glVertex2i(local148, local19);
				OpenGL.glTexCoord2f(this.aClass42_Sub1_Sub1_2.aFloat17, local277);
				OpenGL.glVertex2i(local283, local19);
				OpenGL.glTexCoord2f(this.aClass42_Sub1_Sub1_2.aFloat17, this.aClass42_Sub1_Sub1_2.aFloat18);
				OpenGL.glVertex2i(local283, local139);
				local283 += local125;
				local148 += local125;
			}
			if (local10 > local148) {
				@Pc(352) float local352 = this.aClass42_Sub1_Sub1_2.aFloat17 * (float) (local10 - local148) / (float) this.aClass42_Sub1_Sub1_2.anInt1542;
				OpenGL.glTexCoord2f(0.0F, this.aClass42_Sub1_Sub1_2.aFloat18);
				OpenGL.glVertex2i(local148, local139);
				OpenGL.glTexCoord2f(0.0F, local277);
				OpenGL.glVertex2i(local148, local19);
				OpenGL.glTexCoord2f(local352, local277);
				OpenGL.glVertex2i(local10, local19);
				OpenGL.glTexCoord2f(local352, this.aClass42_Sub1_Sub1_2.aFloat18);
				OpenGL.glVertex2i(local10, local139);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!bl", name = "YA", descriptor = "(IIIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass42_Sub1_Sub1_2.method4910(false);
		this.aClass75_Sub2_2.method2465();
		this.aClass75_Sub2_2.method2445(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt896;
		@Pc(42) int local42 = arg0 + this.anInt903;
		if (this.aClass42_Sub1_Sub1_1 == null) {
			this.aClass75_Sub2_2.method2456(this.aClass42_Sub1_Sub1_2);
			this.aClass75_Sub2_2.method2424(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass42_Sub1_Sub1_2.aFloat18);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, this.aClass42_Sub1_Sub1_2.anInt1543 + local37);
			OpenGL.glTexCoord2f(this.aClass42_Sub1_Sub1_2.aFloat17, 0.0F);
			OpenGL.glVertex2i(local42 + this.aClass42_Sub1_Sub1_2.anInt1542, this.aClass42_Sub1_Sub1_2.anInt1543 + local37);
			OpenGL.glTexCoord2f(this.aClass42_Sub1_Sub1_2.aFloat17, this.aClass42_Sub1_Sub1_2.aFloat18);
			OpenGL.glVertex2i(local42 + this.aClass42_Sub1_Sub1_2.anInt1542, local37);
			OpenGL.glEnd();
			return;
		}
		this.method814(arg2);
		this.aClass42_Sub1_Sub1_1.method4910(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass42_Sub1_Sub1_2.aFloat18);
		OpenGL.glTexCoord2f(0.0F, this.aClass42_Sub1_Sub1_2.aFloat18);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, local37 + this.aClass42_Sub1_Sub1_2.anInt1543);
		OpenGL.glMultiTexCoord2f(33985, this.aClass42_Sub1_Sub1_2.aFloat17, 0.0F);
		OpenGL.glTexCoord2f(this.aClass42_Sub1_Sub1_2.aFloat17, 0.0F);
		OpenGL.glVertex2i(local42 + this.aClass42_Sub1_Sub1_2.anInt1542, this.aClass42_Sub1_Sub1_2.anInt1543 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass42_Sub1_Sub1_2.aFloat17, this.aClass42_Sub1_Sub1_2.aFloat18);
		OpenGL.glTexCoord2f(this.aClass42_Sub1_Sub1_2.aFloat17, this.aClass42_Sub1_Sub1_2.aFloat18);
		OpenGL.glVertex2i(this.aClass42_Sub1_Sub1_2.anInt1542 + local42, local37);
		OpenGL.glEnd();
		this.method815();
	}

	@OriginalMember(owner = "client!bl", name = "M", descriptor = "(IIIIIII)V")
	@Override
	public void M(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass42_Sub1_Sub1_2.method4910(true);
		this.aClass75_Sub2_2.method2465();
		this.aClass75_Sub2_2.method2445(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean85) {
			@Pc(42) float local42 = (float) arg2 / (float) this.ja();
			@Pc(49) float local49 = (float) arg3 / (float) this.JA();
			@Pc(58) float local58 = (float) arg0 + (float) this.anInt903 * local42;
			@Pc(67) float local67 = (float) arg1 + (float) this.anInt896 * local49;
			@Pc(76) float local76 = local58 + (float) this.aClass42_Sub1_Sub1_2.anInt1542 * local42;
			@Pc(85) float local85 = local67 + local49 * (float) this.aClass42_Sub1_Sub1_2.anInt1543;
			if (this.aClass42_Sub1_Sub1_1 == null) {
				this.aClass75_Sub2_2.method2456(this.aClass42_Sub1_Sub1_2);
				this.aClass75_Sub2_2.method2424(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass42_Sub1_Sub1_2.aFloat18);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glTexCoord2f(this.aClass42_Sub1_Sub1_2.aFloat17, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glTexCoord2f(this.aClass42_Sub1_Sub1_2.aFloat17, this.aClass42_Sub1_Sub1_2.aFloat18);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
			} else {
				this.method814(arg4);
				this.aClass42_Sub1_Sub1_1.method4910(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass42_Sub1_Sub1_2.aFloat18);
				OpenGL.glTexCoord2f(0.0F, this.aClass42_Sub1_Sub1_2.aFloat18);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass42_Sub1_Sub1_2.aFloat17, 0.0F);
				OpenGL.glTexCoord2f(this.aClass42_Sub1_Sub1_2.aFloat17, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass42_Sub1_Sub1_2.aFloat17, this.aClass42_Sub1_Sub1_2.aFloat18);
				OpenGL.glTexCoord2f(this.aClass42_Sub1_Sub1_2.aFloat17, this.aClass42_Sub1_Sub1_2.aFloat18);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
				this.method815();
			}
		} else if (this.aClass42_Sub1_Sub1_1 == null) {
			this.aClass75_Sub2_2.method2456(this.aClass42_Sub1_Sub1_2);
			this.aClass75_Sub2_2.method2424(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass42_Sub1_Sub1_2.aFloat18);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass42_Sub1_Sub1_2.aFloat17, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass42_Sub1_Sub1_2.aFloat17, this.aClass42_Sub1_Sub1_2.aFloat18);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method814(arg4);
			this.aClass42_Sub1_Sub1_1.method4910(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass42_Sub1_Sub1_2.aFloat18);
			OpenGL.glTexCoord2f(0.0F, this.aClass42_Sub1_Sub1_2.aFloat18);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass42_Sub1_Sub1_2.aFloat17, 0.0F);
			OpenGL.glTexCoord2f(this.aClass42_Sub1_Sub1_2.aFloat17, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass42_Sub1_Sub1_2.aFloat17, this.aClass42_Sub1_Sub1_2.aFloat18);
			OpenGL.glTexCoord2f(this.aClass42_Sub1_Sub1_2.aFloat17, this.aClass42_Sub1_Sub1_2.aFloat18);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method815();
		}
	}

	@OriginalMember(owner = "client!bl", name = "ka", descriptor = "(IIII)V")
	@Override
	public void ka(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt895 = arg3;
		this.anInt896 = arg1;
		this.anInt898 = arg2;
		this.anInt903 = arg0;
		this.aBoolean85 = this.anInt903 != 0 || this.anInt896 != 0 || this.anInt898 != 0 || this.anInt895 != 0;
	}

	@OriginalMember(owner = "client!bl", name = "W", descriptor = "(IIIIII)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass42_Sub1_Sub1_2.method1262(arg0, arg1, arg3, arg5, arg2, arg4);
	}

	@OriginalMember(owner = "client!bl", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass42_Sub1_Sub1_1 = Static181.method3080(this.aClass75_Sub2_2, arg0, arg1, this.aClass42_Sub1_Sub1_2.anInt1542, this.aClass42_Sub1_Sub1_2.anInt1543);
		this.anInt911 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!bl", name = "ja", descriptor = "()I")
	@Override
	public int ja() {
		return this.anInt898 + this.anInt903 + this.aClass42_Sub1_Sub1_2.anInt1542;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(II)V")
	private void method814(@OriginalArg(0) int arg0) {
		this.aClass75_Sub2_2.method2426(1);
		this.aClass75_Sub2_2.method2456(this.aClass42_Sub1_Sub1_2);
		this.aClass75_Sub2_2.method2479(this.aClass75_Sub2_2.method2452(arg0), 7681);
		this.aClass75_Sub2_2.method2466(34167, 1, 768);
		this.aClass75_Sub2_2.method2460(34168, 0);
		this.aClass75_Sub2_2.method2426(0);
		this.aClass75_Sub2_2.method2456(this.aClass42_Sub1_Sub1_1);
		this.aClass75_Sub2_2.method2479(34479, 7681);
		this.aClass75_Sub2_2.method2466(34166, 1, 768);
		if (this.anInt911 == 0) {
			this.aClass75_Sub2_2.method2486(0.0F, 0.5F, 0.5F, 1.0F);
		} else if (this.anInt911 == 1) {
			this.aClass75_Sub2_2.method2486(0.0F, 0.5F, 1.0F, 0.5F);
			return;
		} else if (this.anInt911 == 2) {
			this.aClass75_Sub2_2.method2486(0.0F, 1.0F, 0.5F, 0.5F);
			return;
		} else if (this.anInt911 == 3) {
			this.aClass75_Sub2_2.method2486(0.0F, 128.5F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IILclient!ea;II)V")
	@Override
	public void method6070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class32_Sub2 local6 = (Class32_Sub2) arg2;
		@Pc(9) Class42_Sub1_Sub1 local9 = local6.aClass42_Sub1_Sub1_4;
		this.aClass42_Sub1_Sub1_2.method4910(false);
		this.aClass75_Sub2_2.method2465();
		this.aClass75_Sub2_2.method2456(this.aClass42_Sub1_Sub1_2);
		this.aClass75_Sub2_2.method2424(1);
		this.aClass75_Sub2_2.method2426(1);
		this.aClass75_Sub2_2.method2456(local9);
		this.aClass75_Sub2_2.method2479(7681, 8448);
		this.aClass75_Sub2_2.method2466(34168, 0, 768);
		this.aClass75_Sub2_2.method2445(1);
		@Pc(62) int local62 = arg0 + this.anInt903;
		@Pc(67) int local67 = arg1 + this.anInt896;
		@Pc(74) int local74 = local62 + this.aClass42_Sub1_Sub1_2.anInt1542;
		@Pc(81) int local81 = local67 + this.aClass42_Sub1_Sub1_2.anInt1543;
		@Pc(88) float local88 = local9.aFloat17 / (float) local9.anInt1542;
		@Pc(95) float local95 = local9.aFloat18 / (float) local9.anInt1543;
		@Pc(103) float local103 = local88 * (float) (local62 - arg3);
		@Pc(111) float local111 = local88 * (float) (local74 - arg3);
		@Pc(122) float local122 = local9.aFloat18 - local95 * (float) (local67 - arg4);
		@Pc(133) float local133 = local9.aFloat18 - (float) (local81 - arg4) * local95;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass42_Sub1_Sub1_2.aFloat18);
		OpenGL.glMultiTexCoord2f(33985, local103, local122);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local103, local133);
		OpenGL.glVertex2i(local62, this.aClass42_Sub1_Sub1_2.anInt1543 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass42_Sub1_Sub1_2.aFloat17, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local111, local133);
		OpenGL.glVertex2i(local62 + this.aClass42_Sub1_Sub1_2.anInt1542, local67 - -this.aClass42_Sub1_Sub1_2.anInt1543);
		OpenGL.glMultiTexCoord2f(33984, this.aClass42_Sub1_Sub1_2.aFloat17, this.aClass42_Sub1_Sub1_2.aFloat18);
		OpenGL.glMultiTexCoord2f(33985, local111, local122);
		OpenGL.glVertex2i(this.aClass42_Sub1_Sub1_2.anInt1542 + local62, local67);
		OpenGL.glEnd();
		this.aClass75_Sub2_2.method2466(5890, 0, 768);
		this.aClass75_Sub2_2.method2424(0);
		this.aClass75_Sub2_2.method2456(null);
		this.aClass75_Sub2_2.method2426(0);
	}

	@OriginalMember(owner = "client!bl", name = "JA", descriptor = "()I")
	@Override
	public int JA() {
		return this.anInt896 + this.aClass42_Sub1_Sub1_2.anInt1543 + this.anInt895;
	}

	@OriginalMember(owner = "client!bl", name = "UA", descriptor = "()I")
	@Override
	public int UA() {
		return this.aClass42_Sub1_Sub1_2.anInt1542;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(FFFFFFLclient!ea;II)V")
	@Override
	protected void method6073(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class32 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class42_Sub1_Sub1 local7 = ((Class32_Sub2) arg6).aClass42_Sub1_Sub1_4;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(32) float local32;
		if (this.aBoolean85) {
			local14 = this.ja();
			local18 = this.JA();
			local25 = (arg2 - arg0) / local14;
			local32 = (arg3 - arg1) / local14;
			@Pc(39) float local39 = (arg4 - arg0) / local18;
			@Pc(46) float local46 = (arg5 - arg1) / local18;
			@Pc(52) float local52 = local39 * (float) this.anInt896;
			@Pc(58) float local58 = local46 * (float) this.anInt896;
			@Pc(64) float local64 = local25 * (float) this.anInt903;
			@Pc(70) float local70 = local32 * (float) this.anInt903;
			@Pc(77) float local77 = -local25 * (float) this.anInt898;
			@Pc(84) float local84 = (float) this.anInt898 * -local32;
			@Pc(91) float local91 = (float) this.anInt895 * -local39;
			arg4 = local91 + local64 + arg4;
			arg0 = local52 + arg0 + local64;
			@Pc(110) float local110 = (float) this.anInt895 * -local46;
			arg1 = local58 + local70 + arg1;
			arg3 = local58 + arg3 + local84;
			arg2 = local52 + local77 + arg2;
			arg5 = local110 + local70 + arg5;
		}
		local14 = arg2 + arg4 - arg0;
		this.aClass42_Sub1_Sub1_2.method4910(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass75_Sub2_2.method2465();
		this.aClass75_Sub2_2.method2456(this.aClass42_Sub1_Sub1_2);
		this.aClass75_Sub2_2.method2424(1);
		this.aClass75_Sub2_2.method2426(1);
		this.aClass75_Sub2_2.method2456(local7);
		this.aClass75_Sub2_2.method2479(7681, 8448);
		this.aClass75_Sub2_2.method2466(34168, 0, 768);
		this.aClass75_Sub2_2.method2445(1);
		local25 = local7.aFloat17 / (float) local7.anInt1542;
		local32 = local7.aFloat18 / (float) local7.anInt1543;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass42_Sub1_Sub1_2.aFloat18);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg0 - (float) arg7), local7.aFloat18 - (arg1 - (float) arg8) * local32);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg4 - (float) arg7), local7.aFloat18 - (arg5 - (float) arg8) * local32);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass42_Sub1_Sub1_2.aFloat17, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (local14 - (float) arg7) * local25, local7.aFloat18 - (local18 - (float) arg8) * local32);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass42_Sub1_Sub1_2.aFloat17, this.aClass42_Sub1_Sub1_2.aFloat18);
		OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * local25, local7.aFloat18 - (arg3 - (float) arg8) * local32);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass75_Sub2_2.method2466(5890, 0, 768);
		this.aClass75_Sub2_2.method2424(0);
		this.aClass75_Sub2_2.method2456(null);
		this.aClass75_Sub2_2.method2426(0);
	}

	@OriginalMember(owner = "client!bl", name = "qa", descriptor = "()I")
	@Override
	public int qa() {
		return this.aClass42_Sub1_Sub1_2.anInt1543;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V")
	private void method815() {
		this.aClass75_Sub2_2.method2426(1);
		this.aClass75_Sub2_2.method2456(null);
		this.aClass75_Sub2_2.method2479(8448, 8448);
		this.aClass75_Sub2_2.method2466(34168, 1, 768);
		this.aClass75_Sub2_2.method2460(5890, 0);
		this.aClass75_Sub2_2.method2426(0);
		this.aClass75_Sub2_2.method2466(34168, 1, 768);
	}

	@OriginalMember(owner = "client!bl", name = "aa", descriptor = "(FFFFFFIII)V")
	@Override
	protected void aa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean85) {
			local10 = this.ja();
			local14 = this.JA();
			@Pc(21) float local21 = (arg2 - arg0) / local10;
			@Pc(28) float local28 = (arg3 - arg1) / local10;
			@Pc(35) float local35 = (arg4 - arg0) / local14;
			@Pc(42) float local42 = (arg5 - arg1) / local14;
			@Pc(48) float local48 = local35 * (float) this.anInt896;
			@Pc(54) float local54 = (float) this.anInt896 * local42;
			@Pc(60) float local60 = local21 * (float) this.anInt903;
			@Pc(66) float local66 = local28 * (float) this.anInt903;
			@Pc(73) float local73 = -local21 * (float) this.anInt898;
			@Pc(80) float local80 = -local28 * (float) this.anInt898;
			@Pc(87) float local87 = -local35 * (float) this.anInt895;
			arg3 = local80 + arg3 + local54;
			arg0 = local60 + arg0 + local48;
			arg1 = local54 + local66 + arg1;
			arg4 = arg4 + local60 + local87;
			@Pc(118) float local118 = -local42 * (float) this.anInt895;
			arg2 = local48 + arg2 + local73;
			arg5 = arg5 + local66 + local118;
		}
		local10 = arg2 + arg4 - arg0;
		local14 = arg3 + arg5 - arg1;
		this.aClass42_Sub1_Sub1_2.method4910(true);
		this.aClass75_Sub2_2.method2465();
		this.aClass75_Sub2_2.method2456(this.aClass42_Sub1_Sub1_2);
		this.aClass75_Sub2_2.method2445(arg8);
		this.aClass75_Sub2_2.method2424(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass42_Sub1_Sub1_2.aFloat18);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass42_Sub1_Sub1_2.aFloat17, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass42_Sub1_Sub1_2.aFloat17, this.aClass42_Sub1_Sub1_2.aFloat18);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}
}
