import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class102_Sub2 extends Class102 {

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "Lclient!vq;")
	private Class39_Sub4_Sub1 aClass39_Sub4_Sub1_3;

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
	private int anInt4456 = 0;

	@OriginalMember(owner = "client!hs", name = "o", descriptor = "Z")
	private boolean aBoolean346 = false;

	@OriginalMember(owner = "client!hs", name = "x", descriptor = "I")
	private int anInt4469 = 0;

	@OriginalMember(owner = "client!hs", name = "A", descriptor = "I")
	private int anInt4471 = 0;

	@OriginalMember(owner = "client!hs", name = "E", descriptor = "I")
	private int anInt4475 = 0;

	@OriginalMember(owner = "client!hs", name = "u", descriptor = "I")
	private int anInt4467 = 0;

	@OriginalMember(owner = "client!hs", name = "s", descriptor = "Lclient!hk;")
	private final Class16_Sub2 aClass16_Sub2_20;

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "Lclient!vq;")
	private final Class39_Sub4_Sub1 aClass39_Sub4_Sub1_2;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!hk;IIZ)V")
	public Class102_Sub2(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass16_Sub2_20 = arg0;
		this.aClass39_Sub4_Sub1_2 = Static264.method4142(arg0, arg3 ? 6408 : 6407, arg2, arg1);
	}

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!hk;IIII)V")
	public Class102_Sub2(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass16_Sub2_20 = arg0;
		this.aClass39_Sub4_Sub1_2 = Static305.method4696(arg0, arg4, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!hk;II[III)V")
	public Class102_Sub2(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass16_Sub2_20 = arg0;
		this.aClass39_Sub4_Sub1_2 = Static5.method54(arg2, arg4, arg0, arg5, arg1, arg3);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)V")
	private void method3802() {
		this.aClass16_Sub2_20.method3683(1);
		this.aClass16_Sub2_20.method3620((Class39) null);
		this.aClass16_Sub2_20.method3671(8448, 8448);
		this.aClass16_Sub2_20.method3669(34168, 1, 768);
		this.aClass16_Sub2_20.method3661(0, 5890);
		this.aClass16_Sub2_20.method3683(0);
		this.aClass16_Sub2_20.method3669(34168, 1, 768);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		@Pc(13) int local13 = arg3 + arg1;
		this.aClass39_Sub4_Sub1_2.method8465(false);
		this.aClass16_Sub2_20.method3633();
		this.aClass16_Sub2_20.method3620(this.aClass39_Sub4_Sub1_2);
		this.aClass16_Sub2_20.method3654(arg6);
		this.aClass16_Sub2_20.method3680(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass39_Sub4_Sub1_2.aBoolean732 && !this.aBoolean346) {
			@Pc(72) float local72 = (float) arg3 * this.aClass39_Sub4_Sub1_2.aFloat196 / (float) this.aClass39_Sub4_Sub1_2.anInt9955;
			@Pc(84) float local84 = this.aClass39_Sub4_Sub1_2.aFloat195 * (float) arg2 / (float) this.aClass39_Sub4_Sub1_2.anInt9958;
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
		OpenGL.glTranslatef((float) this.anInt4467, (float) this.anInt4471, 0.0F);
		@Pc(124) int local124 = this.method6951();
		@Pc(127) int local127 = this.method6958();
		@Pc(134) int local134 = arg1 + this.aClass39_Sub4_Sub1_2.anInt9955;
		OpenGL.glBegin(7);
		@Pc(138) int local138 = arg1;
		@Pc(146) int local146;
		while (local134 <= local13) {
			local146 = arg0 + this.aClass39_Sub4_Sub1_2.anInt9958;
			@Pc(148) int local148 = arg0;
			while (local9 >= local146) {
				OpenGL.glTexCoord2f(0.0F, this.aClass39_Sub4_Sub1_2.aFloat196);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(this.aClass39_Sub4_Sub1_2.aFloat195, 0.0F);
				OpenGL.glVertex2i(local146, local134);
				OpenGL.glTexCoord2f(this.aClass39_Sub4_Sub1_2.aFloat195, this.aClass39_Sub4_Sub1_2.aFloat196);
				OpenGL.glVertex2i(local146, local138);
				local148 += local124;
				local146 += local124;
			}
			if (local9 > local148) {
				@Pc(215) float local215 = (float) (local9 - local148) * this.aClass39_Sub4_Sub1_2.aFloat195 / (float) this.aClass39_Sub4_Sub1_2.anInt9958;
				OpenGL.glTexCoord2f(0.0F, this.aClass39_Sub4_Sub1_2.aFloat196);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(local215, 0.0F);
				OpenGL.glVertex2i(local9, local134);
				OpenGL.glTexCoord2f(local215, this.aClass39_Sub4_Sub1_2.aFloat196);
				OpenGL.glVertex2i(local9, local138);
			}
			local134 += local127;
			local138 += local127;
		}
		if (local13 > local138) {
			@Pc(280) float local280 = (float) (this.aClass39_Sub4_Sub1_2.anInt9955 + local138 - local13) * this.aClass39_Sub4_Sub1_2.aFloat196 / (float) this.aClass39_Sub4_Sub1_2.anInt9955;
			@Pc(287) int local287 = arg0 + this.aClass39_Sub4_Sub1_2.anInt9958;
			local146 = arg0;
			while (local9 >= local287) {
				OpenGL.glTexCoord2f(0.0F, this.aClass39_Sub4_Sub1_2.aFloat196);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local280);
				OpenGL.glVertex2i(local146, local13);
				OpenGL.glTexCoord2f(this.aClass39_Sub4_Sub1_2.aFloat195, local280);
				OpenGL.glVertex2i(local287, local13);
				OpenGL.glTexCoord2f(this.aClass39_Sub4_Sub1_2.aFloat195, this.aClass39_Sub4_Sub1_2.aFloat196);
				OpenGL.glVertex2i(local287, local138);
				local146 += local124;
				local287 += local124;
			}
			if (local9 > local146) {
				@Pc(351) float local351 = this.aClass39_Sub4_Sub1_2.aFloat195 * (float) (local9 - local146) / (float) this.aClass39_Sub4_Sub1_2.anInt9958;
				OpenGL.glTexCoord2f(0.0F, this.aClass39_Sub4_Sub1_2.aFloat196);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local280);
				OpenGL.glVertex2i(local146, local13);
				OpenGL.glTexCoord2f(local351, local280);
				OpenGL.glVertex2i(local9, local13);
				OpenGL.glTexCoord2f(local351, this.aClass39_Sub4_Sub1_2.aFloat196);
				OpenGL.glVertex2i(local9, local138);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method6966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg2;
		@Pc(9) Class39_Sub4_Sub1 local9 = local6.aClass39_Sub4_Sub1_5;
		this.aClass39_Sub4_Sub1_2.method8465(false);
		this.aClass16_Sub2_20.method3633();
		this.aClass16_Sub2_20.method3620(this.aClass39_Sub4_Sub1_2);
		this.aClass16_Sub2_20.method3680(1);
		this.aClass16_Sub2_20.method3683(1);
		this.aClass16_Sub2_20.method3620(local9);
		this.aClass16_Sub2_20.method3671(7681, 8448);
		this.aClass16_Sub2_20.method3669(34168, 0, 768);
		this.aClass16_Sub2_20.method3654(1);
		@Pc(62) int local62 = arg1 + this.anInt4471;
		@Pc(67) int local67 = arg0 + this.anInt4467;
		@Pc(73) int local73 = this.aClass39_Sub4_Sub1_2.anInt9958 + local67;
		@Pc(79) int local79 = this.aClass39_Sub4_Sub1_2.anInt9955 + local62;
		@Pc(86) float local86 = local9.aFloat195 / (float) local9.anInt9958;
		@Pc(93) float local93 = local9.aFloat196 / (float) local9.anInt9955;
		@Pc(101) float local101 = local86 * (float) (local67 - arg3);
		@Pc(109) float local109 = local86 * (float) (local73 - arg3);
		@Pc(121) float local121 = local9.aFloat196 - (float) (local62 - arg4) * local93;
		@Pc(132) float local132 = local9.aFloat196 - (float) (local79 - arg4) * local93;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass39_Sub4_Sub1_2.aFloat196);
		OpenGL.glMultiTexCoord2f(33985, local101, local121);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local132);
		OpenGL.glVertex2i(local67, local62 + this.aClass39_Sub4_Sub1_2.anInt9955);
		OpenGL.glMultiTexCoord2f(33984, this.aClass39_Sub4_Sub1_2.aFloat195, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local132);
		OpenGL.glVertex2i(this.aClass39_Sub4_Sub1_2.anInt9958 + local67, this.aClass39_Sub4_Sub1_2.anInt9955 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass39_Sub4_Sub1_2.aFloat195, this.aClass39_Sub4_Sub1_2.aFloat196);
		OpenGL.glMultiTexCoord2f(33985, local109, local121);
		OpenGL.glVertex2i(this.aClass39_Sub4_Sub1_2.anInt9958 + local67, local62);
		OpenGL.glEnd();
		this.aClass16_Sub2_20.method3669(5890, 0, 768);
		this.aClass16_Sub2_20.method3680(0);
		this.aClass16_Sub2_20.method3620((Class39) null);
		this.aClass16_Sub2_20.method3683(0);
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(IIII)V")
	@Override
	public void method6959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4471 = arg1;
		this.anInt4469 = arg2;
		this.anInt4467 = arg0;
		this.anInt4475 = arg3;
		this.aBoolean346 = this.anInt4467 != 0 || this.anInt4471 != 0 || this.anInt4469 != 0 || this.anInt4475 != 0;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method6960(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class39_Sub4_Sub1 local7 = ((Class1_Sub2) arg6).aClass39_Sub4_Sub1_5;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(31) float local31;
		if (this.aBoolean346) {
			local14 = (float) this.method6951();
			local18 = (float) this.method6958();
			local24 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(45) float local45 = (arg5 - arg1) / local18;
			@Pc(51) float local51 = (float) this.anInt4471 * local38;
			@Pc(57) float local57 = (float) this.anInt4471 * local45;
			@Pc(63) float local63 = local24 * (float) this.anInt4467;
			@Pc(69) float local69 = local31 * (float) this.anInt4467;
			@Pc(76) float local76 = -local24 * (float) this.anInt4469;
			@Pc(83) float local83 = -local31 * (float) this.anInt4469;
			@Pc(90) float local90 = (float) this.anInt4475 * -local38;
			arg4 = local90 + arg4 + local63;
			@Pc(103) float local103 = (float) this.anInt4475 * -local45;
			arg1 = local57 + local69 + arg1;
			arg0 = local63 + arg0 + local51;
			arg2 = local51 + local76 + arg2;
			arg3 = local83 + arg3 + local57;
			arg5 = arg5 + local69 + local103;
		}
		local14 = arg2 + arg4 - arg0;
		local18 = arg5 + arg3 - arg1;
		this.aClass39_Sub4_Sub1_2.method8465(true);
		this.aClass16_Sub2_20.method3633();
		this.aClass16_Sub2_20.method3620(this.aClass39_Sub4_Sub1_2);
		this.aClass16_Sub2_20.method3680(1);
		this.aClass16_Sub2_20.method3683(1);
		this.aClass16_Sub2_20.method3620(local7);
		this.aClass16_Sub2_20.method3671(7681, 8448);
		this.aClass16_Sub2_20.method3669(34168, 0, 768);
		this.aClass16_Sub2_20.method3654(1);
		local24 = local7.aFloat195 / (float) local7.anInt9958;
		local31 = local7.aFloat196 / (float) local7.anInt9955;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass39_Sub4_Sub1_2.aFloat196);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg0), local7.aFloat196 - (arg1 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg4 - (float) arg7), local7.aFloat196 - (arg5 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass39_Sub4_Sub1_2.aFloat195, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + local14), local7.aFloat196 - (local18 - (float) arg8) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass39_Sub4_Sub1_2.aFloat195, this.aClass39_Sub4_Sub1_2.aFloat196);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg2), local7.aFloat196 - (arg3 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass16_Sub2_20.method3669(5890, 0, 768);
		this.aClass16_Sub2_20.method3680(0);
		this.aClass16_Sub2_20.method3620((Class39) null);
		this.aClass16_Sub2_20.method3683(0);
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "()I")
	@Override
	public int method6957() {
		return this.aClass39_Sub4_Sub1_2.anInt9958;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIII[III)V")
	private void method3803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass39_Sub4_Sub1_2.method8473(arg2, arg0, arg1, arg5, arg4, arg3);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method6955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass39_Sub4_Sub1_2.method8465(false);
		this.aClass16_Sub2_20.method3633();
		this.aClass16_Sub2_20.method3654(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt4467;
		@Pc(42) int local42 = arg1 + this.anInt4471;
		if (this.aClass39_Sub4_Sub1_3 == null) {
			this.aClass16_Sub2_20.method3620(this.aClass39_Sub4_Sub1_2);
			this.aClass16_Sub2_20.method3680(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass39_Sub4_Sub1_2.aFloat196);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass39_Sub4_Sub1_2.anInt9955 + local42);
			OpenGL.glTexCoord2f(this.aClass39_Sub4_Sub1_2.aFloat195, 0.0F);
			OpenGL.glVertex2i(this.aClass39_Sub4_Sub1_2.anInt9958 + local37, this.aClass39_Sub4_Sub1_2.anInt9955 + local42);
			OpenGL.glTexCoord2f(this.aClass39_Sub4_Sub1_2.aFloat195, this.aClass39_Sub4_Sub1_2.aFloat196);
			OpenGL.glVertex2i(local37 + this.aClass39_Sub4_Sub1_2.anInt9958, local42);
			OpenGL.glEnd();
			return;
		}
		this.method3806(arg2);
		this.aClass39_Sub4_Sub1_3.method8465(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass39_Sub4_Sub1_2.aFloat196);
		OpenGL.glTexCoord2f(0.0F, this.aClass39_Sub4_Sub1_2.aFloat196);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, this.aClass39_Sub4_Sub1_2.anInt9955 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass39_Sub4_Sub1_2.aFloat195, 0.0F);
		OpenGL.glTexCoord2f(this.aClass39_Sub4_Sub1_2.aFloat195, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass39_Sub4_Sub1_2.anInt9958, local42 + this.aClass39_Sub4_Sub1_2.anInt9955);
		OpenGL.glMultiTexCoord2f(33985, this.aClass39_Sub4_Sub1_2.aFloat195, this.aClass39_Sub4_Sub1_2.aFloat196);
		OpenGL.glTexCoord2f(this.aClass39_Sub4_Sub1_2.aFloat195, this.aClass39_Sub4_Sub1_2.aFloat196);
		OpenGL.glVertex2i(this.aClass39_Sub4_Sub1_2.anInt9958 + local37, local42);
		OpenGL.glEnd();
		this.method3802();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "([I)V")
	@Override
	public void method6953(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt4469;
		arg0[1] = this.anInt4471;
		arg0[3] = this.anInt4475;
		arg0[0] = this.anInt4467;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass16_Sub2_20.aBoolean338) {
			this.aClass39_Sub4_Sub1_2.method8472(arg3, arg2, arg5, arg4, arg0, arg1);
			return;
		}
		@Pc(25) int[] local25 = this.aClass16_Sub2_20.na(arg4, arg5, arg2, arg3);
		if (local25 != null) {
			for (@Pc(29) int local29 = 0; local29 < local25.length; local29++) {
				local25[local29] |= 0xFF000000;
			}
			this.method3803(arg0, arg1, arg2, arg3, local25, arg2);
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)V")
	@Override
	public void method6967(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass39_Sub4_Sub1_3 = Static305.method4696(this.aClass16_Sub2_20, this.aClass39_Sub4_Sub1_2.anInt9955, this.aClass39_Sub4_Sub1_2.anInt9958, 0, 0);
		this.anInt4456 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method6968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass39_Sub4_Sub1_2.method8465(true);
		this.aClass16_Sub2_20.method3633();
		this.aClass16_Sub2_20.method3654(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean346) {
			@Pc(48) float local48 = (float) arg2 / (float) this.method6951();
			@Pc(55) float local55 = (float) arg3 / (float) this.method6958();
			@Pc(64) float local64 = (float) arg0 + (float) this.anInt4467 * local48;
			@Pc(73) float local73 = (float) arg1 + (float) this.anInt4471 * local55;
			@Pc(82) float local82 = local48 * (float) this.aClass39_Sub4_Sub1_2.anInt9958 + local64;
			@Pc(91) float local91 = local55 * (float) this.aClass39_Sub4_Sub1_2.anInt9955 + local73;
			if (this.aClass39_Sub4_Sub1_3 == null) {
				this.aClass16_Sub2_20.method3620(this.aClass39_Sub4_Sub1_2);
				this.aClass16_Sub2_20.method3680(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass39_Sub4_Sub1_2.aFloat196);
				OpenGL.glVertex2f(local64, local73);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local64, local91);
				OpenGL.glTexCoord2f(this.aClass39_Sub4_Sub1_2.aFloat195, 0.0F);
				OpenGL.glVertex2f(local82, local91);
				OpenGL.glTexCoord2f(this.aClass39_Sub4_Sub1_2.aFloat195, this.aClass39_Sub4_Sub1_2.aFloat196);
				OpenGL.glVertex2f(local82, local73);
				OpenGL.glEnd();
			} else {
				this.method3806(arg4);
				this.aClass39_Sub4_Sub1_3.method8465(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass39_Sub4_Sub1_2.aFloat196);
				OpenGL.glTexCoord2f(0.0F, this.aClass39_Sub4_Sub1_2.aFloat196);
				OpenGL.glVertex2f(local64, local73);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local64, local91);
				OpenGL.glMultiTexCoord2f(33985, this.aClass39_Sub4_Sub1_2.aFloat195, 0.0F);
				OpenGL.glTexCoord2f(this.aClass39_Sub4_Sub1_2.aFloat195, 0.0F);
				OpenGL.glVertex2f(local82, local91);
				OpenGL.glMultiTexCoord2f(33985, this.aClass39_Sub4_Sub1_2.aFloat195, this.aClass39_Sub4_Sub1_2.aFloat196);
				OpenGL.glTexCoord2f(this.aClass39_Sub4_Sub1_2.aFloat195, this.aClass39_Sub4_Sub1_2.aFloat196);
				OpenGL.glVertex2f(local82, local73);
				OpenGL.glEnd();
				this.method3802();
			}
		} else if (this.aClass39_Sub4_Sub1_3 == null) {
			this.aClass16_Sub2_20.method3620(this.aClass39_Sub4_Sub1_2);
			this.aClass16_Sub2_20.method3680(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass39_Sub4_Sub1_2.aFloat196);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass39_Sub4_Sub1_2.aFloat195, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass39_Sub4_Sub1_2.aFloat195, this.aClass39_Sub4_Sub1_2.aFloat196);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method3806(arg4);
			this.aClass39_Sub4_Sub1_3.method8465(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass39_Sub4_Sub1_2.aFloat196);
			OpenGL.glTexCoord2f(0.0F, this.aClass39_Sub4_Sub1_2.aFloat196);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass39_Sub4_Sub1_2.aFloat195, 0.0F);
			OpenGL.glTexCoord2f(this.aClass39_Sub4_Sub1_2.aFloat195, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass39_Sub4_Sub1_2.aFloat195, this.aClass39_Sub4_Sub1_2.aFloat196);
			OpenGL.glTexCoord2f(this.aClass39_Sub4_Sub1_2.aFloat195, this.aClass39_Sub4_Sub1_2.aFloat196);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method3802();
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "()I")
	@Override
	public int method6951() {
		return this.anInt4469 + this.aClass39_Sub4_Sub1_2.anInt9958 + this.anInt4467;
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "()I")
	@Override
	public int method6958() {
		return this.aClass39_Sub4_Sub1_2.anInt9955 + this.anInt4471 + this.anInt4475;
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "()I")
	@Override
	public int method6962() {
		return this.aClass39_Sub4_Sub1_2.anInt9955;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method6965(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean346) {
			local6 = (float) this.method6951();
			local10 = (float) this.method6958();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(36) float local36 = (arg5 - arg1) / local10;
			@Pc(42) float local42 = local29 * (float) this.anInt4471;
			@Pc(48) float local48 = local36 * (float) this.anInt4471;
			@Pc(54) float local54 = local16 * (float) this.anInt4467;
			@Pc(60) float local60 = (float) this.anInt4467 * local23;
			@Pc(67) float local67 = (float) this.anInt4469 * -local16;
			@Pc(74) float local74 = -local23 * (float) this.anInt4469;
			@Pc(81) float local81 = (float) this.anInt4475 * -local29;
			arg0 = local54 + arg0 + local42;
			arg1 = local60 + arg1 + local48;
			arg2 = local67 + arg2 + local42;
			arg4 = local81 + local54 + arg4;
			arg3 = local48 + arg3 + local74;
			@Pc(118) float local118 = -local36 * (float) this.anInt4475;
			arg5 = local60 + arg5 + local118;
		}
		local6 = arg4 + arg2 - arg0;
		local10 = arg3 + arg5 - arg1;
		this.aClass39_Sub4_Sub1_2.method8465(true);
		this.aClass16_Sub2_20.method3633();
		this.aClass16_Sub2_20.method3620(this.aClass39_Sub4_Sub1_2);
		this.aClass16_Sub2_20.method3654(1);
		this.aClass16_Sub2_20.method3680(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass39_Sub4_Sub1_2.aFloat196);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass39_Sub4_Sub1_2.aFloat195, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass39_Sub4_Sub1_2.aFloat195, this.aClass39_Sub4_Sub1_2.aFloat196);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BI)V")
	private void method3806(@OriginalArg(1) int arg0) {
		this.aClass16_Sub2_20.method3683(1);
		this.aClass16_Sub2_20.method3620(this.aClass39_Sub4_Sub1_2);
		this.aClass16_Sub2_20.method3671(this.aClass16_Sub2_20.method3677(arg0), 7681);
		this.aClass16_Sub2_20.method3669(34167, 1, 768);
		this.aClass16_Sub2_20.method3661(0, 34168);
		this.aClass16_Sub2_20.method3683(0);
		this.aClass16_Sub2_20.method3620(this.aClass39_Sub4_Sub1_3);
		this.aClass16_Sub2_20.method3671(34479, 7681);
		this.aClass16_Sub2_20.method3669(34166, 1, 768);
		if (this.anInt4456 == 0) {
			this.aClass16_Sub2_20.method3651(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt4456 == 1) {
			this.aClass16_Sub2_20.method3651(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt4456 == 2) {
			this.aClass16_Sub2_20.method3651(0.5F, 0.5F, 1.0F, 0.0F);
			return;
		} else if (this.anInt4456 == 3) {
			this.aClass16_Sub2_20.method3651(128.5F, 128.5F, 128.5F, 0.0F);
			return;
		}
	}
}
