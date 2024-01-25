import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jt")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "Lclient!al;")
	private Class10_Sub1_Sub1 aClass10_Sub1_Sub1_3;

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
	private int anInt3542 = 0;

	@OriginalMember(owner = "client!jt", name = "o", descriptor = "I")
	private int anInt3551 = 0;

	@OriginalMember(owner = "client!jt", name = "m", descriptor = "I")
	private int anInt3549 = 0;

	@OriginalMember(owner = "client!jt", name = "n", descriptor = "I")
	private int anInt3550 = 0;

	@OriginalMember(owner = "client!jt", name = "p", descriptor = "I")
	private int anInt3552 = 0;

	@OriginalMember(owner = "client!jt", name = "t", descriptor = "Z")
	private boolean aBoolean409 = false;

	@OriginalMember(owner = "client!jt", name = "A", descriptor = "Lclient!ur;")
	private final Class34_Sub2 aClass34_Sub2_22;

	@OriginalMember(owner = "client!jt", name = "l", descriptor = "Lclient!al;")
	private final Class10_Sub1_Sub1 aClass10_Sub1_Sub1_4;

	static {
		new Class119("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lclient!ur;IIII)V")
	public Class6_Sub2(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass34_Sub2_22 = arg0;
		this.aClass10_Sub1_Sub1_4 = Static18.method285(arg3, arg4, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lclient!ur;II[III)V")
	public Class6_Sub2(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass34_Sub2_22 = arg0;
		this.aClass10_Sub1_Sub1_4 = Static3.method4548(arg3, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!jt", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		return this.anInt3550 + this.aClass10_Sub1_Sub1_4.anInt262 + this.anInt3551;
	}

	@OriginalMember(owner = "client!jt", name = "ha", descriptor = "(IIII)V")
	@Override
	public void ha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3550 = arg2;
		this.anInt3552 = arg3;
		this.anInt3551 = arg0;
		this.anInt3542 = arg1;
		this.aBoolean409 = this.anInt3551 != 0 || this.anInt3542 != 0 || this.anInt3550 != 0 || this.anInt3552 != 0;
	}

	@OriginalMember(owner = "client!jt", name = "ya", descriptor = "(IIIIIII)V")
	@Override
	public void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass10_Sub1_Sub1_4.method5928(true);
		this.aClass34_Sub2_22.method5530();
		this.aClass34_Sub2_22.method5536(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean409) {
			@Pc(181) float local181 = (float) arg2 / (float) this.RA();
			@Pc(188) float local188 = (float) arg3 / (float) this.Q();
			@Pc(197) float local197 = (float) arg0 + (float) this.anInt3551 * local181;
			@Pc(206) float local206 = (float) this.anInt3542 * local188 + (float) arg1;
			@Pc(215) float local215 = (float) this.aClass10_Sub1_Sub1_4.anInt262 * local181 + local197;
			@Pc(224) float local224 = local206 + (float) this.aClass10_Sub1_Sub1_4.anInt263 * local188;
			if (this.aClass10_Sub1_Sub1_3 == null) {
				this.aClass34_Sub2_22.method5493(this.aClass10_Sub1_Sub1_4);
				this.aClass34_Sub2_22.method5517(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub1_Sub1_4.aFloat6);
				OpenGL.glVertex2f(local197, local206);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local197, local224);
				OpenGL.glTexCoord2f(this.aClass10_Sub1_Sub1_4.aFloat7, 0.0F);
				OpenGL.glVertex2f(local215, local224);
				OpenGL.glTexCoord2f(this.aClass10_Sub1_Sub1_4.aFloat7, this.aClass10_Sub1_Sub1_4.aFloat6);
				OpenGL.glVertex2f(local215, local206);
				OpenGL.glEnd();
			} else {
				this.method2883(arg4);
				this.aClass10_Sub1_Sub1_3.method5928(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass10_Sub1_Sub1_4.aFloat6);
				OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub1_Sub1_4.aFloat6);
				OpenGL.glVertex2f(local197, local206);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local197, local224);
				OpenGL.glMultiTexCoord2f(33985, this.aClass10_Sub1_Sub1_4.aFloat7, 0.0F);
				OpenGL.glTexCoord2f(this.aClass10_Sub1_Sub1_4.aFloat7, 0.0F);
				OpenGL.glVertex2f(local215, local224);
				OpenGL.glMultiTexCoord2f(33985, this.aClass10_Sub1_Sub1_4.aFloat7, this.aClass10_Sub1_Sub1_4.aFloat6);
				OpenGL.glTexCoord2f(this.aClass10_Sub1_Sub1_4.aFloat7, this.aClass10_Sub1_Sub1_4.aFloat6);
				OpenGL.glVertex2f(local215, local206);
				OpenGL.glEnd();
				this.method2881();
			}
		} else if (this.aClass10_Sub1_Sub1_3 == null) {
			this.aClass34_Sub2_22.method5493(this.aClass10_Sub1_Sub1_4);
			this.aClass34_Sub2_22.method5517(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub1_Sub1_4.aFloat6);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass10_Sub1_Sub1_4.aFloat7, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass10_Sub1_Sub1_4.aFloat7, this.aClass10_Sub1_Sub1_4.aFloat6);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method2883(arg4);
			this.aClass10_Sub1_Sub1_3.method5928(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass10_Sub1_Sub1_4.aFloat6);
			OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub1_Sub1_4.aFloat6);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass10_Sub1_Sub1_4.aFloat7, 0.0F);
			OpenGL.glTexCoord2f(this.aClass10_Sub1_Sub1_4.aFloat7, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass10_Sub1_Sub1_4.aFloat7, this.aClass10_Sub1_Sub1_4.aFloat6);
			OpenGL.glTexCoord2f(this.aClass10_Sub1_Sub1_4.aFloat7, this.aClass10_Sub1_Sub1_4.aFloat6);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method2881();
		}
	}

	@OriginalMember(owner = "client!jt", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass10_Sub1_Sub1_3 = Static18.method285(this.aClass10_Sub1_Sub1_4.anInt262, this.aClass10_Sub1_Sub1_4.anInt263, arg1, arg0, this.aClass34_Sub2_22);
		this.anInt3549 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!jt", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return this.aClass10_Sub1_Sub1_4.anInt262;
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)V")
	private void method2881() {
		this.aClass34_Sub2_22.method5507(1);
		this.aClass34_Sub2_22.method5493(null);
		this.aClass34_Sub2_22.method5526(8448, 8448);
		this.aClass34_Sub2_22.method5486(34168, 1, 768);
		this.aClass34_Sub2_22.method5534(0, 5890);
		this.aClass34_Sub2_22.method5507(0);
		this.aClass34_Sub2_22.method5486(34168, 1, 768);
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(FFFFFFLclient!ta;II)V")
	@Override
	protected void method5897(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class104 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class10_Sub1_Sub1 local7 = ((Class104_Sub2) arg6).aClass10_Sub1_Sub1_2;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(31) float local31;
		if (this.aBoolean409) {
			local14 = this.RA();
			local18 = this.Q();
			local24 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = local37 * (float) this.anInt3542;
			@Pc(56) float local56 = (float) this.anInt3542 * local44;
			@Pc(62) float local62 = local24 * (float) this.anInt3551;
			@Pc(68) float local68 = (float) this.anInt3551 * local31;
			@Pc(75) float local75 = (float) this.anInt3550 * -local24;
			@Pc(82) float local82 = -local31 * (float) this.anInt3550;
			@Pc(89) float local89 = -local37 * (float) this.anInt3552;
			arg3 = local82 + arg3 + local56;
			arg0 = arg0 + local62 + local50;
			@Pc(108) float local108 = -local44 * (float) this.anInt3552;
			arg1 = local68 + arg1 + local56;
			arg4 = local89 + local62 + arg4;
			arg2 = local75 + arg2 + local50;
			arg5 = local108 + arg5 + local68;
		}
		local14 = arg2 + arg4 - arg0;
		this.aClass10_Sub1_Sub1_4.method5928(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass34_Sub2_22.method5530();
		this.aClass34_Sub2_22.method5493(this.aClass10_Sub1_Sub1_4);
		this.aClass34_Sub2_22.method5517(1);
		this.aClass34_Sub2_22.method5507(1);
		this.aClass34_Sub2_22.method5493(local7);
		this.aClass34_Sub2_22.method5526(7681, 8448);
		this.aClass34_Sub2_22.method5486(34168, 0, 768);
		this.aClass34_Sub2_22.method5536(1);
		local24 = local7.aFloat7 / (float) local7.anInt262;
		local31 = local7.aFloat6 / (float) local7.anInt263;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass10_Sub1_Sub1_4.aFloat6);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg0) * local24, local7.aFloat6 - local31 * (arg1 - (float) arg8));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg4) * local24, local7.aFloat6 - local31 * (arg5 - (float) arg8));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass10_Sub1_Sub1_4.aFloat7, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + local14) * local24, local7.aFloat6 - local31 * (local18 - (float) arg8));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass10_Sub1_Sub1_4.aFloat7, this.aClass10_Sub1_Sub1_4.aFloat6);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg2) * local24, local7.aFloat6 - (arg3 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass34_Sub2_22.method5486(5890, 0, 768);
		this.aClass34_Sub2_22.method5517(0);
		this.aClass34_Sub2_22.method5493(null);
		this.aClass34_Sub2_22.method5507(0);
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(II)V")
	private void method2883(@OriginalArg(0) int arg0) {
		this.aClass34_Sub2_22.method5507(1);
		this.aClass34_Sub2_22.method5493(this.aClass10_Sub1_Sub1_4);
		this.aClass34_Sub2_22.method5526(this.aClass34_Sub2_22.method5549(arg0), 7681);
		this.aClass34_Sub2_22.method5486(34167, 1, 768);
		this.aClass34_Sub2_22.method5534(0, 34168);
		this.aClass34_Sub2_22.method5507(0);
		this.aClass34_Sub2_22.method5493(this.aClass10_Sub1_Sub1_3);
		this.aClass34_Sub2_22.method5526(34479, 7681);
		this.aClass34_Sub2_22.method5486(34166, 1, 768);
		if (this.anInt3549 == 0) {
			this.aClass34_Sub2_22.method5503(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt3549 == 1) {
			this.aClass34_Sub2_22.method5503(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt3549 == 2) {
			this.aClass34_Sub2_22.method5503(1.0F, 0.5F, 0.5F, 0.0F);
			return;
		} else if (this.anInt3549 == 3) {
			this.aClass34_Sub2_22.method5503(128.5F, 128.5F, 128.5F, 0.0F);
			return;
		}
	}

	@OriginalMember(owner = "client!jt", name = "la", descriptor = "(IIIIIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		this.aClass10_Sub1_Sub1_4.method5928(false);
		@Pc(19) int local19 = arg1 + arg3;
		this.aClass34_Sub2_22.method5530();
		this.aClass34_Sub2_22.method5493(this.aClass10_Sub1_Sub1_4);
		this.aClass34_Sub2_22.method5536(arg6);
		this.aClass34_Sub2_22.method5517(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass10_Sub1_Sub1_4.aBoolean27 && !this.aBoolean409) {
			@Pc(339) float local339 = this.aClass10_Sub1_Sub1_4.aFloat6 * (float) arg3 / (float) this.aClass10_Sub1_Sub1_4.anInt263;
			@Pc(351) float local351 = (float) arg2 * this.aClass10_Sub1_Sub1_4.aFloat7 / (float) this.aClass10_Sub1_Sub1_4.anInt262;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local339);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local19);
			OpenGL.glTexCoord2f(local351, 0.0F);
			OpenGL.glVertex2i(local9, local19);
			OpenGL.glTexCoord2f(local351, local339);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt3551, (float) this.anInt3542, 0.0F);
		@Pc(73) int local73 = this.RA();
		@Pc(76) int local76 = this.Q();
		@Pc(82) int local82 = this.aClass10_Sub1_Sub1_4.anInt263 + arg1;
		OpenGL.glBegin(7);
		@Pc(86) int local86 = arg1;
		@Pc(94) int local94;
		while (local82 <= local19) {
			local94 = this.aClass10_Sub1_Sub1_4.anInt262 + arg0;
			@Pc(96) int local96 = arg0;
			while (local94 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub1_Sub1_4.aFloat6);
				OpenGL.glVertex2i(local96, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local96, local82);
				OpenGL.glTexCoord2f(this.aClass10_Sub1_Sub1_4.aFloat7, 0.0F);
				OpenGL.glVertex2i(local94, local82);
				OpenGL.glTexCoord2f(this.aClass10_Sub1_Sub1_4.aFloat7, this.aClass10_Sub1_Sub1_4.aFloat6);
				OpenGL.glVertex2i(local94, local86);
				local96 += local73;
				local94 += local73;
			}
			if (local9 > local96) {
				@Pc(159) float local159 = this.aClass10_Sub1_Sub1_4.aFloat7 * (float) (local9 - local96) / (float) this.aClass10_Sub1_Sub1_4.anInt262;
				OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub1_Sub1_4.aFloat6);
				OpenGL.glVertex2i(local96, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local96, local82);
				OpenGL.glTexCoord2f(local159, 0.0F);
				OpenGL.glVertex2i(local9, local82);
				OpenGL.glTexCoord2f(local159, this.aClass10_Sub1_Sub1_4.aFloat6);
				OpenGL.glVertex2i(local9, local86);
			}
			local86 += local76;
			local82 += local76;
		}
		if (local86 < local19) {
			@Pc(221) float local221 = (float) (local86 + this.aClass10_Sub1_Sub1_4.anInt263 - local19) * this.aClass10_Sub1_Sub1_4.aFloat6 / (float) this.aClass10_Sub1_Sub1_4.anInt263;
			@Pc(227) int local227 = arg0 + this.aClass10_Sub1_Sub1_4.anInt262;
			local94 = arg0;
			while (local9 >= local227) {
				OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub1_Sub1_4.aFloat6);
				OpenGL.glVertex2i(local94, local86);
				OpenGL.glTexCoord2f(0.0F, local221);
				OpenGL.glVertex2i(local94, local19);
				OpenGL.glTexCoord2f(this.aClass10_Sub1_Sub1_4.aFloat7, local221);
				OpenGL.glVertex2i(local227, local19);
				OpenGL.glTexCoord2f(this.aClass10_Sub1_Sub1_4.aFloat7, this.aClass10_Sub1_Sub1_4.aFloat6);
				OpenGL.glVertex2i(local227, local86);
				local227 += local73;
				local94 += local73;
			}
			if (local9 > local94) {
				@Pc(296) float local296 = (float) (local9 - local94) * this.aClass10_Sub1_Sub1_4.aFloat7 / (float) this.aClass10_Sub1_Sub1_4.anInt262;
				OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub1_Sub1_4.aFloat6);
				OpenGL.glVertex2i(local94, local86);
				OpenGL.glTexCoord2f(0.0F, local221);
				OpenGL.glVertex2i(local94, local19);
				OpenGL.glTexCoord2f(local296, local221);
				OpenGL.glVertex2i(local9, local19);
				OpenGL.glTexCoord2f(local296, this.aClass10_Sub1_Sub1_4.aFloat6);
				OpenGL.glVertex2i(local9, local86);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!jt", name = "W", descriptor = "(IIIII)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass10_Sub1_Sub1_4.method5928(false);
		this.aClass34_Sub2_22.method5530();
		this.aClass34_Sub2_22.method5536(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt3551;
		@Pc(42) int local42 = arg1 + this.anInt3542;
		if (this.aClass10_Sub1_Sub1_3 == null) {
			this.aClass34_Sub2_22.method5493(this.aClass10_Sub1_Sub1_4);
			this.aClass34_Sub2_22.method5517(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub1_Sub1_4.aFloat6);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass10_Sub1_Sub1_4.anInt263 + local42);
			OpenGL.glTexCoord2f(this.aClass10_Sub1_Sub1_4.aFloat7, 0.0F);
			OpenGL.glVertex2i(this.aClass10_Sub1_Sub1_4.anInt262 + local37, local42 + this.aClass10_Sub1_Sub1_4.anInt263);
			OpenGL.glTexCoord2f(this.aClass10_Sub1_Sub1_4.aFloat7, this.aClass10_Sub1_Sub1_4.aFloat6);
			OpenGL.glVertex2i(this.aClass10_Sub1_Sub1_4.anInt262 + local37, local42);
			OpenGL.glEnd();
			return;
		}
		this.method2883(arg2);
		this.aClass10_Sub1_Sub1_3.method5928(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass10_Sub1_Sub1_4.aFloat6);
		OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub1_Sub1_4.aFloat6);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, this.aClass10_Sub1_Sub1_4.anInt263 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass10_Sub1_Sub1_4.aFloat7, 0.0F);
		OpenGL.glTexCoord2f(this.aClass10_Sub1_Sub1_4.aFloat7, 0.0F);
		OpenGL.glVertex2i(this.aClass10_Sub1_Sub1_4.anInt262 + local37, local42 + this.aClass10_Sub1_Sub1_4.anInt263);
		OpenGL.glMultiTexCoord2f(33985, this.aClass10_Sub1_Sub1_4.aFloat7, this.aClass10_Sub1_Sub1_4.aFloat6);
		OpenGL.glTexCoord2f(this.aClass10_Sub1_Sub1_4.aFloat7, this.aClass10_Sub1_Sub1_4.aFloat6);
		OpenGL.glVertex2i(local37 + this.aClass10_Sub1_Sub1_4.anInt262, local42);
		OpenGL.glEnd();
		this.method2881();
	}

	@OriginalMember(owner = "client!jt", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		return this.anInt3552 + this.anInt3542 + this.aClass10_Sub1_Sub1_4.anInt263;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IILclient!ta;II)V")
	@Override
	public void method5892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class104 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class104_Sub2 local6 = (Class104_Sub2) arg2;
		@Pc(9) Class10_Sub1_Sub1 local9 = local6.aClass10_Sub1_Sub1_2;
		this.aClass10_Sub1_Sub1_4.method5928(false);
		this.aClass34_Sub2_22.method5530();
		this.aClass34_Sub2_22.method5493(this.aClass10_Sub1_Sub1_4);
		this.aClass34_Sub2_22.method5517(1);
		this.aClass34_Sub2_22.method5507(1);
		this.aClass34_Sub2_22.method5493(local9);
		this.aClass34_Sub2_22.method5526(7681, 8448);
		this.aClass34_Sub2_22.method5486(34168, 0, 768);
		this.aClass34_Sub2_22.method5536(1);
		@Pc(62) int local62 = arg0 + this.anInt3551;
		@Pc(67) int local67 = arg1 + this.anInt3542;
		@Pc(73) int local73 = local62 + this.aClass10_Sub1_Sub1_4.anInt262;
		@Pc(79) int local79 = local67 + this.aClass10_Sub1_Sub1_4.anInt263;
		@Pc(86) float local86 = local9.aFloat7 / (float) local9.anInt262;
		@Pc(93) float local93 = local9.aFloat6 / (float) local9.anInt263;
		@Pc(100) float local100 = local86 * (float) (local62 - arg3);
		@Pc(108) float local108 = (float) (local73 - arg3) * local86;
		@Pc(119) float local119 = local9.aFloat6 - local93 * (float) (local67 - arg4);
		@Pc(131) float local131 = local9.aFloat6 - local93 * (float) (local79 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass10_Sub1_Sub1_4.aFloat6);
		OpenGL.glMultiTexCoord2f(33985, local100, local119);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local100, local131);
		OpenGL.glVertex2i(local62, this.aClass10_Sub1_Sub1_4.anInt263 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass10_Sub1_Sub1_4.aFloat7, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local108, local131);
		OpenGL.glVertex2i(local62 + this.aClass10_Sub1_Sub1_4.anInt262, this.aClass10_Sub1_Sub1_4.anInt263 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass10_Sub1_Sub1_4.aFloat7, this.aClass10_Sub1_Sub1_4.aFloat6);
		OpenGL.glMultiTexCoord2f(33985, local108, local119);
		OpenGL.glVertex2i(this.aClass10_Sub1_Sub1_4.anInt262 + local62, local67);
		OpenGL.glEnd();
		this.aClass34_Sub2_22.method5486(5890, 0, 768);
		this.aClass34_Sub2_22.method5517(0);
		this.aClass34_Sub2_22.method5493(null);
		this.aClass34_Sub2_22.method5507(0);
	}

	@OriginalMember(owner = "client!jt", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		return this.aClass10_Sub1_Sub1_4.anInt263;
	}

	@OriginalMember(owner = "client!jt", name = "H", descriptor = "(FFFFFFIII)V")
	@Override
	protected void H(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean409) {
			local6 = this.RA();
			local10 = this.Q();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(24) float local24 = (arg3 - arg1) / local6;
			@Pc(30) float local30 = (arg4 - arg0) / local10;
			@Pc(36) float local36 = (arg5 - arg1) / local10;
			@Pc(42) float local42 = (float) this.anInt3542 * local30;
			@Pc(48) float local48 = local36 * (float) this.anInt3542;
			@Pc(54) float local54 = local17 * (float) this.anInt3551;
			@Pc(60) float local60 = (float) this.anInt3551 * local24;
			@Pc(67) float local67 = (float) this.anInt3550 * -local17;
			@Pc(74) float local74 = (float) this.anInt3550 * -local24;
			@Pc(81) float local81 = (float) this.anInt3552 * -local30;
			@Pc(88) float local88 = -local36 * (float) this.anInt3552;
			arg0 = arg0 + local54 + local42;
			arg3 = local48 + arg3 + local74;
			arg1 = local48 + arg1 + local60;
			arg4 = local81 + arg4 + local54;
			arg2 = arg2 + local67 + local42;
			arg5 = arg5 + local60 + local88;
		}
		local6 = arg4 + arg2 - arg0;
		this.aClass10_Sub1_Sub1_4.method5928(true);
		local10 = arg5 + arg3 - arg1;
		this.aClass34_Sub2_22.method5530();
		this.aClass34_Sub2_22.method5493(this.aClass10_Sub1_Sub1_4);
		this.aClass34_Sub2_22.method5536(arg8);
		this.aClass34_Sub2_22.method5517(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub1_Sub1_4.aFloat6);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass10_Sub1_Sub1_4.aFloat7, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass10_Sub1_Sub1_4.aFloat7, this.aClass10_Sub1_Sub1_4.aFloat6);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!jt", name = "XA", descriptor = "(IIIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass10_Sub1_Sub1_4.method198(arg0, arg1, arg4, arg5, arg2, arg3);
	}
}
