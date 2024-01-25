import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class46_Sub3 extends Class46 {

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "Lclient!dea;")
	private Class34_Sub2_Sub1 aClass34_Sub2_Sub1_1;

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
	private int anInt6515 = 0;

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
	private int anInt6522 = 0;

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "Z")
	private boolean aBoolean536 = false;

	@OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
	private int anInt6534 = 0;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
	private int anInt6517 = 0;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
	private int anInt6527 = 0;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "Lclient!us;")
	private final Class43_Sub3 aClass43_Sub3_26;

	@OriginalMember(owner = "client!oh", name = "t", descriptor = "Lclient!dea;")
	public final Class34_Sub2_Sub1 aClass34_Sub2_Sub1_2;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!us;IIZ)V")
	public Class46_Sub3(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass43_Sub3_26 = arg0;
		this.aClass34_Sub2_Sub1_2 = Static347.method5277(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!us;IIII)V")
	public Class46_Sub3(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass43_Sub3_26 = arg0;
		this.aClass34_Sub2_Sub1_2 = Static228.method1802(arg3, arg1, arg4, arg0, arg2);
	}

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!us;II[III)V")
	public Class46_Sub3(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass43_Sub3_26 = arg0;
		this.aClass34_Sub2_Sub1_2 = Static85.method1844(arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!oh", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean536) {
			local6 = this.A();
			local10 = this.ca();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(35) float local35 = (arg5 - arg1) / local10;
			@Pc(41) float local41 = local29 * (float) this.anInt6527;
			@Pc(47) float local47 = local35 * (float) this.anInt6527;
			@Pc(53) float local53 = local16 * (float) this.anInt6517;
			@Pc(59) float local59 = local22 * (float) this.anInt6517;
			@Pc(66) float local66 = (float) this.anInt6515 * -local16;
			@Pc(73) float local73 = -local22 * (float) this.anInt6515;
			@Pc(80) float local80 = (float) this.anInt6534 * -local29;
			arg4 = local80 + local53 + arg4;
			@Pc(93) float local93 = (float) this.anInt6534 * -local35;
			arg1 = arg1 + local59 + local47;
			arg3 = local73 + arg3 + local47;
			arg2 = local41 + arg2 + local66;
			arg0 = arg0 + local53 + local41;
			arg5 = local59 + arg5 + local93;
		}
		local6 = arg2 + arg4 - arg0;
		local10 = arg3 + arg5 - arg1;
		this.aClass34_Sub2_Sub1_2.method4974(true);
		this.aClass43_Sub3_26.method7283();
		this.aClass43_Sub3_26.method7220(this.aClass34_Sub2_Sub1_2);
		this.aClass43_Sub3_26.method7222(arg8);
		this.aClass43_Sub3_26.method7281(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass34_Sub2_Sub1_2.aFloat35);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass34_Sub2_Sub1_2.aFloat36, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass34_Sub2_Sub1_2.aFloat36, this.aClass34_Sub2_Sub1_2.aFloat35);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!oh", name = "da", descriptor = "(IIIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass34_Sub2_Sub1_2.method1962(arg3, arg4, arg5, arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method7610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class146 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class146_Sub3 local6 = (Class146_Sub3) arg2;
		@Pc(9) Class34_Sub2_Sub1 local9 = local6.aClass34_Sub2_Sub1_5;
		this.aClass34_Sub2_Sub1_2.method4974(false);
		this.aClass43_Sub3_26.method7283();
		this.aClass43_Sub3_26.method7220(this.aClass34_Sub2_Sub1_2);
		this.aClass43_Sub3_26.method7281(1);
		this.aClass43_Sub3_26.method7277(1);
		this.aClass43_Sub3_26.method7220(local9);
		this.aClass43_Sub3_26.method7287(8448, 7681);
		this.aClass43_Sub3_26.method7225(0, 768, 34168);
		this.aClass43_Sub3_26.method7222(1);
		@Pc(62) int local62 = arg1 + this.anInt6527;
		@Pc(67) int local67 = arg0 + this.anInt6517;
		@Pc(74) int local74 = local67 + this.aClass34_Sub2_Sub1_2.anInt2193;
		@Pc(81) int local81 = local62 + this.aClass34_Sub2_Sub1_2.anInt2189;
		@Pc(88) float local88 = local9.aFloat36 / (float) local9.anInt2193;
		@Pc(95) float local95 = local9.aFloat35 / (float) local9.anInt2189;
		@Pc(103) float local103 = (float) (local67 - arg3) * local88;
		@Pc(111) float local111 = (float) (local74 - arg3) * local88;
		@Pc(122) float local122 = local9.aFloat35 - local95 * (float) (local62 - arg4);
		@Pc(133) float local133 = local9.aFloat35 - (float) (local81 - arg4) * local95;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass34_Sub2_Sub1_2.aFloat35);
		OpenGL.glMultiTexCoord2f(33985, local103, local122);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local103, local133);
		OpenGL.glVertex2i(local67, this.aClass34_Sub2_Sub1_2.anInt2189 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass34_Sub2_Sub1_2.aFloat36, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local111, local133);
		OpenGL.glVertex2i(this.aClass34_Sub2_Sub1_2.anInt2193 + local67, this.aClass34_Sub2_Sub1_2.anInt2189 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass34_Sub2_Sub1_2.aFloat36, this.aClass34_Sub2_Sub1_2.aFloat35);
		OpenGL.glMultiTexCoord2f(33985, local111, local122);
		OpenGL.glVertex2i(this.aClass34_Sub2_Sub1_2.anInt2193 + local67, local62);
		OpenGL.glEnd();
		this.aClass43_Sub3_26.method7225(0, 768, 5890);
		this.aClass43_Sub3_26.method7281(0);
		this.aClass43_Sub3_26.method7220(null);
		this.aClass43_Sub3_26.method7277(0);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)V")
	private void method5608(@OriginalArg(1) int arg0) {
		this.aClass43_Sub3_26.method7277(1);
		this.aClass43_Sub3_26.method7220(this.aClass34_Sub2_Sub1_2);
		this.aClass43_Sub3_26.method7287(7681, this.aClass43_Sub3_26.method7270(arg0));
		this.aClass43_Sub3_26.method7225(1, 768, 34167);
		this.aClass43_Sub3_26.method7282(34168, 0);
		this.aClass43_Sub3_26.method7277(0);
		this.aClass43_Sub3_26.method7220(this.aClass34_Sub2_Sub1_1);
		this.aClass43_Sub3_26.method7287(7681, 34479);
		this.aClass43_Sub3_26.method7225(1, 768, 34166);
		if (this.anInt6522 == 0) {
			this.aClass43_Sub3_26.method7284(1.0F, 0.0F, 0.5F, 0.5F);
		} else if (this.anInt6522 == 1) {
			this.aClass43_Sub3_26.method7284(0.5F, 0.0F, 1.0F, 0.5F);
		} else if (this.anInt6522 == 2) {
			this.aClass43_Sub3_26.method7284(0.5F, 0.0F, 0.5F, 1.0F);
			return;
		} else if (this.anInt6522 == 3) {
			this.aClass43_Sub3_26.method7284(128.5F, 0.0F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected void method7608(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class146 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class34_Sub2_Sub1 local7 = ((Class146_Sub3) arg6).aClass34_Sub2_Sub1_5;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(30) float local30;
		if (this.aBoolean536) {
			local14 = this.A();
			local18 = this.ca();
			local24 = (arg2 - arg0) / local14;
			local30 = (arg3 - arg1) / local14;
			@Pc(36) float local36 = (arg4 - arg0) / local18;
			@Pc(42) float local42 = (arg5 - arg1) / local18;
			@Pc(48) float local48 = local36 * (float) this.anInt6527;
			@Pc(54) float local54 = local42 * (float) this.anInt6527;
			@Pc(60) float local60 = (float) this.anInt6517 * local24;
			@Pc(66) float local66 = (float) this.anInt6517 * local30;
			@Pc(73) float local73 = (float) this.anInt6515 * -local24;
			@Pc(80) float local80 = (float) this.anInt6515 * -local30;
			@Pc(87) float local87 = -local36 * (float) this.anInt6534;
			arg1 = local54 + local66 + arg1;
			@Pc(100) float local100 = (float) this.anInt6534 * -local42;
			arg4 = local60 + arg4 + local87;
			arg0 = local60 + arg0 + local48;
			arg2 = local48 + arg2 + local73;
			arg3 = arg3 + local80 + local54;
			arg5 = arg5 + local66 + local100;
		}
		local14 = arg2 + arg4 - arg0;
		this.aClass34_Sub2_Sub1_2.method4974(true);
		local18 = arg3 + arg5 - arg1;
		this.aClass43_Sub3_26.method7283();
		this.aClass43_Sub3_26.method7220(this.aClass34_Sub2_Sub1_2);
		this.aClass43_Sub3_26.method7281(1);
		this.aClass43_Sub3_26.method7277(1);
		this.aClass43_Sub3_26.method7220(local7);
		this.aClass43_Sub3_26.method7287(8448, 7681);
		this.aClass43_Sub3_26.method7225(0, 768, 34168);
		this.aClass43_Sub3_26.method7222(1);
		local24 = local7.aFloat36 / (float) local7.anInt2193;
		local30 = local7.aFloat35 / (float) local7.anInt2189;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass34_Sub2_Sub1_2.aFloat35);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg0) * local24, local7.aFloat35 - local30 * (arg1 - (float) arg8));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg4), local7.aFloat35 - local30 * (arg5 - (float) arg8));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass34_Sub2_Sub1_2.aFloat36, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * (local14 - (float) arg7), local7.aFloat35 - local30 * ((float) -arg8 + local18));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass34_Sub2_Sub1_2.aFloat36, this.aClass34_Sub2_Sub1_2.aFloat35);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg2 - (float) arg7), local7.aFloat35 - (arg3 - (float) arg8) * local30);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass43_Sub3_26.method7225(0, 768, 5890);
		this.aClass43_Sub3_26.method7281(0);
		this.aClass43_Sub3_26.method7220(null);
		this.aClass43_Sub3_26.method7277(0);
	}

	@OriginalMember(owner = "client!oh", name = "ca", descriptor = "()I")
	@Override
	public int ca() {
		return this.aClass34_Sub2_Sub1_2.anInt2189 + this.anInt6527 + this.anInt6534;
	}

	@OriginalMember(owner = "client!oh", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg0 + arg2;
		@Pc(14) int local14 = arg3 + arg1;
		this.aClass34_Sub2_Sub1_2.method4974(false);
		this.aClass43_Sub3_26.method7283();
		this.aClass43_Sub3_26.method7220(this.aClass34_Sub2_Sub1_2);
		this.aClass43_Sub3_26.method7222(arg6);
		this.aClass43_Sub3_26.method7281(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass34_Sub2_Sub1_2.aBoolean185 && !this.aBoolean536) {
			@Pc(73) float local73 = (float) arg3 * this.aClass34_Sub2_Sub1_2.aFloat35 / (float) this.aClass34_Sub2_Sub1_2.anInt2189;
			@Pc(85) float local85 = (float) arg2 * this.aClass34_Sub2_Sub1_2.aFloat36 / (float) this.aClass34_Sub2_Sub1_2.anInt2193;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local73);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local14);
			OpenGL.glTexCoord2f(local85, 0.0F);
			OpenGL.glVertex2i(local10, local14);
			OpenGL.glTexCoord2f(local85, local73);
			OpenGL.glVertex2i(local10, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt6517, (float) this.anInt6527, 0.0F);
		@Pc(125) int local125 = this.A();
		@Pc(128) int local128 = this.ca();
		@Pc(134) int local134 = arg1 + this.aClass34_Sub2_Sub1_2.anInt2189;
		OpenGL.glBegin(7);
		@Pc(138) int local138 = arg1;
		@Pc(146) int local146;
		while (local134 <= local14) {
			local146 = arg0 + this.aClass34_Sub2_Sub1_2.anInt2193;
			@Pc(148) int local148 = arg0;
			while (local146 <= local10) {
				OpenGL.glTexCoord2f(0.0F, this.aClass34_Sub2_Sub1_2.aFloat35);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(this.aClass34_Sub2_Sub1_2.aFloat36, 0.0F);
				OpenGL.glVertex2i(local146, local134);
				OpenGL.glTexCoord2f(this.aClass34_Sub2_Sub1_2.aFloat36, this.aClass34_Sub2_Sub1_2.aFloat35);
				OpenGL.glVertex2i(local146, local138);
				local146 += local125;
				local148 += local125;
			}
			if (local148 < local10) {
				@Pc(218) float local218 = (float) (local10 - local148) * this.aClass34_Sub2_Sub1_2.aFloat36 / (float) this.aClass34_Sub2_Sub1_2.anInt2193;
				OpenGL.glTexCoord2f(0.0F, this.aClass34_Sub2_Sub1_2.aFloat35);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(local218, 0.0F);
				OpenGL.glVertex2i(local10, local134);
				OpenGL.glTexCoord2f(local218, this.aClass34_Sub2_Sub1_2.aFloat35);
				OpenGL.glVertex2i(local10, local138);
			}
			local138 += local128;
			local134 += local128;
		}
		if (local14 > local138) {
			@Pc(283) float local283 = (float) (this.aClass34_Sub2_Sub1_2.anInt2189 + local138 - local14) * this.aClass34_Sub2_Sub1_2.aFloat35 / (float) this.aClass34_Sub2_Sub1_2.anInt2189;
			@Pc(289) int local289 = this.aClass34_Sub2_Sub1_2.anInt2193 + arg0;
			local146 = arg0;
			while (local289 <= local10) {
				OpenGL.glTexCoord2f(0.0F, this.aClass34_Sub2_Sub1_2.aFloat35);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local283);
				OpenGL.glVertex2i(local146, local14);
				OpenGL.glTexCoord2f(this.aClass34_Sub2_Sub1_2.aFloat36, local283);
				OpenGL.glVertex2i(local289, local14);
				OpenGL.glTexCoord2f(this.aClass34_Sub2_Sub1_2.aFloat36, this.aClass34_Sub2_Sub1_2.aFloat35);
				OpenGL.glVertex2i(local289, local138);
				local289 += local125;
				local146 += local125;
			}
			if (local146 < local10) {
				@Pc(361) float local361 = this.aClass34_Sub2_Sub1_2.aFloat36 * (float) (local10 - local146) / (float) this.aClass34_Sub2_Sub1_2.anInt2193;
				OpenGL.glTexCoord2f(0.0F, this.aClass34_Sub2_Sub1_2.aFloat35);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local283);
				OpenGL.glVertex2i(local146, local14);
				OpenGL.glTexCoord2f(local361, local283);
				OpenGL.glVertex2i(local10, local14);
				OpenGL.glTexCoord2f(local361, this.aClass34_Sub2_Sub1_2.aFloat35);
				OpenGL.glVertex2i(local10, local138);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!oh", name = "V", descriptor = "(IIIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass34_Sub2_Sub1_2.method4974(false);
		this.aClass43_Sub3_26.method7283();
		this.aClass43_Sub3_26.method7222(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt6527;
		@Pc(42) int local42 = arg0 + this.anInt6517;
		if (this.aClass34_Sub2_Sub1_1 == null) {
			this.aClass43_Sub3_26.method7220(this.aClass34_Sub2_Sub1_2);
			this.aClass43_Sub3_26.method7281(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass34_Sub2_Sub1_2.aFloat35);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, local37 + this.aClass34_Sub2_Sub1_2.anInt2189);
			OpenGL.glTexCoord2f(this.aClass34_Sub2_Sub1_2.aFloat36, 0.0F);
			OpenGL.glVertex2i(local42 + this.aClass34_Sub2_Sub1_2.anInt2193, this.aClass34_Sub2_Sub1_2.anInt2189 + local37);
			OpenGL.glTexCoord2f(this.aClass34_Sub2_Sub1_2.aFloat36, this.aClass34_Sub2_Sub1_2.aFloat35);
			OpenGL.glVertex2i(this.aClass34_Sub2_Sub1_2.anInt2193 + local42, local37);
			OpenGL.glEnd();
			return;
		}
		this.method5608(arg2);
		this.aClass34_Sub2_Sub1_1.method4974(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass34_Sub2_Sub1_2.aFloat35);
		OpenGL.glTexCoord2f(0.0F, this.aClass34_Sub2_Sub1_2.aFloat35);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, local37 + this.aClass34_Sub2_Sub1_2.anInt2189);
		OpenGL.glMultiTexCoord2f(33985, this.aClass34_Sub2_Sub1_2.aFloat36, 0.0F);
		OpenGL.glTexCoord2f(this.aClass34_Sub2_Sub1_2.aFloat36, 0.0F);
		OpenGL.glVertex2i(local42 + this.aClass34_Sub2_Sub1_2.anInt2193, local37 - -this.aClass34_Sub2_Sub1_2.anInt2189);
		OpenGL.glMultiTexCoord2f(33985, this.aClass34_Sub2_Sub1_2.aFloat36, this.aClass34_Sub2_Sub1_2.aFloat35);
		OpenGL.glTexCoord2f(this.aClass34_Sub2_Sub1_2.aFloat36, this.aClass34_Sub2_Sub1_2.aFloat35);
		OpenGL.glVertex2i(local42 + this.aClass34_Sub2_Sub1_2.anInt2193, local37);
		OpenGL.glEnd();
		this.method5609();
	}

	@OriginalMember(owner = "client!oh", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aClass34_Sub2_Sub1_2.anInt2189;
	}

	@OriginalMember(owner = "client!oh", name = "YA", descriptor = "(IIIIIIII)V")
	@Override
	protected void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass34_Sub2_Sub1_2.method4974(true);
		this.aClass43_Sub3_26.method7283();
		this.aClass43_Sub3_26.method7222(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean536) {
			@Pc(51) float local51 = (float) arg2 / (float) this.A();
			@Pc(58) float local58 = (float) arg3 / (float) this.ca();
			@Pc(67) float local67 = (float) arg0 + (float) this.anInt6517 * local51;
			@Pc(76) float local76 = (float) this.anInt6527 * local58 + (float) arg1;
			@Pc(85) float local85 = local51 * (float) this.aClass34_Sub2_Sub1_2.anInt2193 + local67;
			@Pc(94) float local94 = local76 + local58 * (float) this.aClass34_Sub2_Sub1_2.anInt2189;
			if (this.aClass34_Sub2_Sub1_1 == null) {
				this.aClass43_Sub3_26.method7220(this.aClass34_Sub2_Sub1_2);
				this.aClass43_Sub3_26.method7281(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass34_Sub2_Sub1_2.aFloat35);
				OpenGL.glVertex2f(local67, local76);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local67, local94);
				OpenGL.glTexCoord2f(this.aClass34_Sub2_Sub1_2.aFloat36, 0.0F);
				OpenGL.glVertex2f(local85, local94);
				OpenGL.glTexCoord2f(this.aClass34_Sub2_Sub1_2.aFloat36, this.aClass34_Sub2_Sub1_2.aFloat35);
				OpenGL.glVertex2f(local85, local76);
				OpenGL.glEnd();
			} else {
				this.method5608(arg4);
				this.aClass34_Sub2_Sub1_1.method4974(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass34_Sub2_Sub1_2.aFloat35);
				OpenGL.glTexCoord2f(0.0F, this.aClass34_Sub2_Sub1_2.aFloat35);
				OpenGL.glVertex2f(local67, local76);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local67, local94);
				OpenGL.glMultiTexCoord2f(33985, this.aClass34_Sub2_Sub1_2.aFloat36, 0.0F);
				OpenGL.glTexCoord2f(this.aClass34_Sub2_Sub1_2.aFloat36, 0.0F);
				OpenGL.glVertex2f(local85, local94);
				OpenGL.glMultiTexCoord2f(33985, this.aClass34_Sub2_Sub1_2.aFloat36, this.aClass34_Sub2_Sub1_2.aFloat35);
				OpenGL.glTexCoord2f(this.aClass34_Sub2_Sub1_2.aFloat36, this.aClass34_Sub2_Sub1_2.aFloat35);
				OpenGL.glVertex2f(local85, local76);
				OpenGL.glEnd();
				this.method5609();
			}
		} else if (this.aClass34_Sub2_Sub1_1 == null) {
			this.aClass43_Sub3_26.method7220(this.aClass34_Sub2_Sub1_2);
			this.aClass43_Sub3_26.method7281(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass34_Sub2_Sub1_2.aFloat35);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass34_Sub2_Sub1_2.aFloat36, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg1 - -arg3);
			OpenGL.glTexCoord2f(this.aClass34_Sub2_Sub1_2.aFloat36, this.aClass34_Sub2_Sub1_2.aFloat35);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method5608(arg4);
			this.aClass34_Sub2_Sub1_1.method4974(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass34_Sub2_Sub1_2.aFloat35);
			OpenGL.glTexCoord2f(0.0F, this.aClass34_Sub2_Sub1_2.aFloat35);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass34_Sub2_Sub1_2.aFloat36, 0.0F);
			OpenGL.glTexCoord2f(this.aClass34_Sub2_Sub1_2.aFloat36, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass34_Sub2_Sub1_2.aFloat36, this.aClass34_Sub2_Sub1_2.aFloat35);
			OpenGL.glTexCoord2f(this.aClass34_Sub2_Sub1_2.aFloat36, this.aClass34_Sub2_Sub1_2.aFloat35);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method5609();
		}
	}

	@OriginalMember(owner = "client!oh", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.aClass34_Sub2_Sub1_2.anInt2193;
	}

	@OriginalMember(owner = "client!oh", name = "A", descriptor = "()I")
	@Override
	public int A() {
		return this.aClass34_Sub2_Sub1_2.anInt2193 + this.anInt6517 + this.anInt6515;
	}

	@OriginalMember(owner = "client!oh", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass34_Sub2_Sub1_1 = Static228.method1802(this.aClass34_Sub2_Sub1_2.anInt2193, arg0, this.aClass34_Sub2_Sub1_2.anInt2189, this.aClass43_Sub3_26, arg1);
		this.anInt6522 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
	private void method5609() {
		this.aClass43_Sub3_26.method7277(1);
		this.aClass43_Sub3_26.method7220(null);
		this.aClass43_Sub3_26.method7287(8448, 8448);
		this.aClass43_Sub3_26.method7225(1, 768, 34168);
		this.aClass43_Sub3_26.method7282(5890, 0);
		this.aClass43_Sub3_26.method7277(0);
		this.aClass43_Sub3_26.method7225(1, 768, 34168);
	}

	@OriginalMember(owner = "client!oh", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6517 = arg0;
		this.anInt6527 = arg1;
		this.anInt6515 = arg2;
		this.anInt6534 = arg3;
		this.aBoolean536 = this.anInt6517 != 0 || this.anInt6527 != 0 || this.anInt6515 != 0 || this.anInt6534 != 0;
	}
}
