import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class24_Sub2 extends Class24 {

	@OriginalMember(owner = "client!mf", name = "z", descriptor = "Lclient!of;")
	private Class76_Sub3_Sub1 aClass76_Sub3_Sub1_3;

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
	private int anInt6703 = 0;

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "Z")
	private boolean aBoolean490 = false;

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
	private int anInt6713 = 0;

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
	private int anInt6714 = 0;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
	private int anInt6712 = 0;

	@OriginalMember(owner = "client!mf", name = "A", descriptor = "I")
	private int anInt6723 = 0;

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "Lclient!kw;")
	private final Class5_Sub2 aClass5_Sub2_27;

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "Lclient!of;")
	private final Class76_Sub3_Sub1 aClass76_Sub3_Sub1_2;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!kw;IIZ)V")
	public Class24_Sub2(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass5_Sub2_27 = arg0;
		this.aClass76_Sub3_Sub1_2 = Static480.method7172(arg3 ? 6408 : 6407, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!kw;IIII)V")
	public Class24_Sub2(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass5_Sub2_27 = arg0;
		this.aClass76_Sub3_Sub1_2 = Static436.method6807(arg4, arg3, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lclient!kw;II[III)V")
	public Class24_Sub2(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass5_Sub2_27 = arg0;
		this.aClass76_Sub3_Sub1_2 = Static67.method1695(arg1, arg5, arg2, arg4, arg3, arg0);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method8567(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean490) {
			local10 = this.method8576();
			local14 = this.method8573();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			@Pc(26) float local26 = (arg3 - arg1) / local10;
			@Pc(32) float local32 = (arg4 - arg0) / local14;
			@Pc(38) float local38 = (arg5 - arg1) / local14;
			@Pc(44) float local44 = (float) this.anInt6713 * local32;
			@Pc(50) float local50 = (float) this.anInt6713 * local38;
			@Pc(56) float local56 = local20 * (float) this.anInt6712;
			@Pc(62) float local62 = (float) this.anInt6712 * local26;
			@Pc(69) float local69 = (float) this.anInt6723 * -local20;
			@Pc(76) float local76 = -local26 * (float) this.anInt6723;
			@Pc(83) float local83 = (float) this.anInt6714 * -local32;
			arg4 = local83 + arg4 + local56;
			@Pc(96) float local96 = (float) this.anInt6714 * -local38;
			arg3 = local76 + arg3 + local50;
			arg0 = local44 + local56 + arg0;
			arg2 = local44 + arg2 + local69;
			arg1 = local50 + arg1 + local62;
			arg5 = local96 + arg5 + local62;
		}
		local10 = arg4 + arg2 - arg0;
		this.aClass76_Sub3_Sub1_2.method7930(true);
		local14 = arg3 + arg5 - arg1;
		this.aClass5_Sub2_27.method5005();
		this.aClass5_Sub2_27.method4997(this.aClass76_Sub3_Sub1_2);
		this.aClass5_Sub2_27.method4971(1);
		this.aClass5_Sub2_27.method4953(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass76_Sub3_Sub1_2.aFloat163);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass76_Sub3_Sub1_2.aFloat162, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass76_Sub3_Sub1_2.aFloat162, this.aClass76_Sub3_Sub1_2.aFloat163);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "()I")
	@Override
	public int method8573() {
		return this.anInt6714 + this.anInt6713 + this.aClass76_Sub3_Sub1_2.anInt7373;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(IIII)V")
	@Override
	public void method8569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6714 = arg3;
		this.anInt6723 = arg2;
		this.anInt6712 = arg0;
		this.anInt6713 = arg1;
		this.aBoolean490 = this.anInt6712 != 0 || this.anInt6713 != 0 || this.anInt6723 != 0 || this.anInt6714 != 0;
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "()I")
	@Override
	public int method8576() {
		return this.anInt6723 + this.anInt6712 + this.aClass76_Sub3_Sub1_2.anInt7375;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass76_Sub3_Sub1_2.method6413(arg5, arg1, arg3, arg0, arg4, arg2);
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method8572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg0 + arg2;
		@Pc(15) int local15 = arg1 + arg3;
		this.aClass76_Sub3_Sub1_2.method7930(false);
		this.aClass5_Sub2_27.method5005();
		this.aClass5_Sub2_27.method4997(this.aClass76_Sub3_Sub1_2);
		this.aClass5_Sub2_27.method4971(arg6);
		this.aClass5_Sub2_27.method4953(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass76_Sub3_Sub1_2.aBoolean528 && !this.aBoolean490) {
			@Pc(74) float local74 = this.aClass76_Sub3_Sub1_2.aFloat163 * (float) arg3 / (float) this.aClass76_Sub3_Sub1_2.anInt7373;
			@Pc(86) float local86 = (float) arg2 * this.aClass76_Sub3_Sub1_2.aFloat162 / (float) this.aClass76_Sub3_Sub1_2.anInt7375;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local74);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local15);
			OpenGL.glTexCoord2f(local86, 0.0F);
			OpenGL.glVertex2i(local10, local15);
			OpenGL.glTexCoord2f(local86, local74);
			OpenGL.glVertex2i(local10, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt6712, (float) this.anInt6713, 0.0F);
		@Pc(126) int local126 = this.method8576();
		@Pc(129) int local129 = this.method8573();
		@Pc(135) int local135 = this.aClass76_Sub3_Sub1_2.anInt7373 + arg1;
		OpenGL.glBegin(7);
		@Pc(139) int local139 = arg1;
		@Pc(147) int local147;
		while (local15 >= local135) {
			local147 = this.aClass76_Sub3_Sub1_2.anInt7375 + arg0;
			@Pc(149) int local149 = arg0;
			while (local10 >= local147) {
				OpenGL.glTexCoord2f(0.0F, this.aClass76_Sub3_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local149, local139);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local149, local135);
				OpenGL.glTexCoord2f(this.aClass76_Sub3_Sub1_2.aFloat162, 0.0F);
				OpenGL.glVertex2i(local147, local135);
				OpenGL.glTexCoord2f(this.aClass76_Sub3_Sub1_2.aFloat162, this.aClass76_Sub3_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local147, local139);
				local149 += local126;
				local147 += local126;
			}
			if (local149 < local10) {
				@Pc(212) float local212 = (float) (local10 - local149) * this.aClass76_Sub3_Sub1_2.aFloat162 / (float) this.aClass76_Sub3_Sub1_2.anInt7375;
				OpenGL.glTexCoord2f(0.0F, this.aClass76_Sub3_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local149, local139);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local149, local135);
				OpenGL.glTexCoord2f(local212, 0.0F);
				OpenGL.glVertex2i(local10, local135);
				OpenGL.glTexCoord2f(local212, this.aClass76_Sub3_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local10, local139);
			}
			local139 += local129;
			local135 += local129;
		}
		if (local15 > local139) {
			@Pc(277) float local277 = this.aClass76_Sub3_Sub1_2.aFloat163 * (float) (this.aClass76_Sub3_Sub1_2.anInt7373 + local139 - local15) / (float) this.aClass76_Sub3_Sub1_2.anInt7373;
			@Pc(283) int local283 = arg0 + this.aClass76_Sub3_Sub1_2.anInt7375;
			local147 = arg0;
			while (local283 <= local10) {
				OpenGL.glTexCoord2f(0.0F, this.aClass76_Sub3_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local147, local139);
				OpenGL.glTexCoord2f(0.0F, local277);
				OpenGL.glVertex2i(local147, local15);
				OpenGL.glTexCoord2f(this.aClass76_Sub3_Sub1_2.aFloat162, local277);
				OpenGL.glVertex2i(local283, local15);
				OpenGL.glTexCoord2f(this.aClass76_Sub3_Sub1_2.aFloat162, this.aClass76_Sub3_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local283, local139);
				local283 += local126;
				local147 += local126;
			}
			if (local147 < local10) {
				@Pc(348) float local348 = this.aClass76_Sub3_Sub1_2.aFloat162 * (float) (local10 - local147) / (float) this.aClass76_Sub3_Sub1_2.anInt7375;
				OpenGL.glTexCoord2f(0.0F, this.aClass76_Sub3_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local147, local139);
				OpenGL.glTexCoord2f(0.0F, local277);
				OpenGL.glVertex2i(local147, local15);
				OpenGL.glTexCoord2f(local348, local277);
				OpenGL.glVertex2i(local10, local15);
				OpenGL.glTexCoord2f(local348, this.aClass76_Sub3_Sub1_2.aFloat163);
				OpenGL.glVertex2i(local10, local139);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method8570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass76_Sub3_Sub1_2.method7930(false);
		this.aClass5_Sub2_27.method5005();
		this.aClass5_Sub2_27.method4971(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt6712;
		@Pc(42) int local42 = arg1 + this.anInt6713;
		if (this.aClass76_Sub3_Sub1_3 == null) {
			this.aClass5_Sub2_27.method4997(this.aClass76_Sub3_Sub1_2);
			this.aClass5_Sub2_27.method4953(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass76_Sub3_Sub1_2.aFloat163);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass76_Sub3_Sub1_2.anInt7373 + local42);
			OpenGL.glTexCoord2f(this.aClass76_Sub3_Sub1_2.aFloat162, 0.0F);
			OpenGL.glVertex2i(local37 + this.aClass76_Sub3_Sub1_2.anInt7375, local42 - -this.aClass76_Sub3_Sub1_2.anInt7373);
			OpenGL.glTexCoord2f(this.aClass76_Sub3_Sub1_2.aFloat162, this.aClass76_Sub3_Sub1_2.aFloat163);
			OpenGL.glVertex2i(local37 + this.aClass76_Sub3_Sub1_2.anInt7375, local42);
			OpenGL.glEnd();
			return;
		}
		this.method5777(arg2);
		this.aClass76_Sub3_Sub1_3.method7930(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass76_Sub3_Sub1_2.aFloat163);
		OpenGL.glTexCoord2f(0.0F, this.aClass76_Sub3_Sub1_2.aFloat163);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, local42 + this.aClass76_Sub3_Sub1_2.anInt7373);
		OpenGL.glMultiTexCoord2f(33985, this.aClass76_Sub3_Sub1_2.aFloat162, 0.0F);
		OpenGL.glTexCoord2f(this.aClass76_Sub3_Sub1_2.aFloat162, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass76_Sub3_Sub1_2.anInt7375, local42 - -this.aClass76_Sub3_Sub1_2.anInt7373);
		OpenGL.glMultiTexCoord2f(33985, this.aClass76_Sub3_Sub1_2.aFloat162, this.aClass76_Sub3_Sub1_2.aFloat163);
		OpenGL.glTexCoord2f(this.aClass76_Sub3_Sub1_2.aFloat162, this.aClass76_Sub3_Sub1_2.aFloat163);
		OpenGL.glVertex2i(this.aClass76_Sub3_Sub1_2.anInt7375 + local37, local42);
		OpenGL.glEnd();
		this.method5776();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	private void method5776() {
		this.aClass5_Sub2_27.method5004(1);
		this.aClass5_Sub2_27.method4997(null);
		this.aClass5_Sub2_27.method4982(8448, 8448);
		this.aClass5_Sub2_27.method5000(34168, 768, 1);
		this.aClass5_Sub2_27.method4969(5890, 0);
		this.aClass5_Sub2_27.method5004(0);
		this.aClass5_Sub2_27.method5000(34168, 768, 1);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "()I")
	@Override
	public int method8558() {
		return this.aClass76_Sub3_Sub1_2.anInt7375;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ)V")
	private void method5777(@OriginalArg(0) int arg0) {
		this.aClass5_Sub2_27.method5004(1);
		this.aClass5_Sub2_27.method4997(this.aClass76_Sub3_Sub1_2);
		this.aClass5_Sub2_27.method4982(7681, this.aClass5_Sub2_27.method4985(arg0));
		this.aClass5_Sub2_27.method5000(34167, 768, 1);
		this.aClass5_Sub2_27.method4969(34168, 0);
		this.aClass5_Sub2_27.method5004(0);
		this.aClass5_Sub2_27.method4997(this.aClass76_Sub3_Sub1_3);
		this.aClass5_Sub2_27.method4982(7681, 34479);
		this.aClass5_Sub2_27.method5000(34166, 768, 1);
		if (this.anInt6703 == 0) {
			this.aClass5_Sub2_27.method4973(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt6703 == 1) {
			this.aClass5_Sub2_27.method4973(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt6703 == 2) {
			this.aClass5_Sub2_27.method4973(0.5F, 1.0F, 0.5F, 0.0F);
			return;
		} else if (this.anInt6703 == 3) {
			this.aClass5_Sub2_27.method4973(128.5F, 128.5F, 128.5F, 0.0F);
			return;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method8557(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class76_Sub3_Sub1 local7 = ((Class1_Sub2) arg6).aClass76_Sub3_Sub1_4;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(30) float local30;
		if (this.aBoolean490) {
			local14 = this.method8576();
			local18 = this.method8573();
			local24 = (arg2 - arg0) / local14;
			local30 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(43) float local43 = (arg5 - arg1) / local18;
			@Pc(49) float local49 = (float) this.anInt6713 * local37;
			@Pc(55) float local55 = (float) this.anInt6713 * local43;
			@Pc(61) float local61 = local24 * (float) this.anInt6712;
			@Pc(67) float local67 = local30 * (float) this.anInt6712;
			@Pc(74) float local74 = (float) this.anInt6723 * -local24;
			@Pc(81) float local81 = -local30 * (float) this.anInt6723;
			@Pc(88) float local88 = (float) this.anInt6714 * -local37;
			arg3 = local81 + arg3 + local55;
			@Pc(101) float local101 = (float) this.anInt6714 * -local43;
			arg1 = local55 + arg1 + local67;
			arg4 = local88 + arg4 + local61;
			arg2 = local49 + local74 + arg2;
			arg0 = local61 + arg0 + local49;
			arg5 = arg5 + local67 + local101;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass76_Sub3_Sub1_2.method7930(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass5_Sub2_27.method5005();
		this.aClass5_Sub2_27.method4997(this.aClass76_Sub3_Sub1_2);
		this.aClass5_Sub2_27.method4953(1);
		this.aClass5_Sub2_27.method5004(1);
		this.aClass5_Sub2_27.method4997(local7);
		this.aClass5_Sub2_27.method4982(8448, 7681);
		this.aClass5_Sub2_27.method5000(34168, 768, 0);
		this.aClass5_Sub2_27.method4971(1);
		local24 = local7.aFloat162 / (float) local7.anInt7375;
		local30 = local7.aFloat163 / (float) local7.anInt7373;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass76_Sub3_Sub1_2.aFloat163);
		OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * local24, local7.aFloat163 - ((float) -arg8 + arg1) * local30);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg4), local7.aFloat163 - ((float) -arg8 + arg5) * local30);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass76_Sub3_Sub1_2.aFloat162, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + local14) * local24, local7.aFloat163 - local30 * (local18 - (float) arg8));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass76_Sub3_Sub1_2.aFloat162, this.aClass76_Sub3_Sub1_2.aFloat163);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg2), local7.aFloat163 - ((float) -arg8 + arg3) * local30);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass5_Sub2_27.method5000(5890, 768, 0);
		this.aClass5_Sub2_27.method4953(0);
		this.aClass5_Sub2_27.method4997(null);
		this.aClass5_Sub2_27.method5004(0);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method8579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass76_Sub3_Sub1_2.method7930(true);
		this.aClass5_Sub2_27.method5005();
		this.aClass5_Sub2_27.method4971(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean490) {
			@Pc(51) float local51 = (float) arg2 / (float) this.method8576();
			@Pc(58) float local58 = (float) arg3 / (float) this.method8573();
			@Pc(67) float local67 = (float) arg0 + (float) this.anInt6712 * local51;
			@Pc(76) float local76 = (float) this.anInt6713 * local58 + (float) arg1;
			@Pc(85) float local85 = local67 + (float) this.aClass76_Sub3_Sub1_2.anInt7375 * local51;
			@Pc(94) float local94 = local58 * (float) this.aClass76_Sub3_Sub1_2.anInt7373 + local76;
			if (this.aClass76_Sub3_Sub1_3 == null) {
				this.aClass5_Sub2_27.method4997(this.aClass76_Sub3_Sub1_2);
				this.aClass5_Sub2_27.method4953(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass76_Sub3_Sub1_2.aFloat163);
				OpenGL.glVertex2f(local67, local76);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local67, local94);
				OpenGL.glTexCoord2f(this.aClass76_Sub3_Sub1_2.aFloat162, 0.0F);
				OpenGL.glVertex2f(local85, local94);
				OpenGL.glTexCoord2f(this.aClass76_Sub3_Sub1_2.aFloat162, this.aClass76_Sub3_Sub1_2.aFloat163);
				OpenGL.glVertex2f(local85, local76);
				OpenGL.glEnd();
			} else {
				this.method5777(arg4);
				this.aClass76_Sub3_Sub1_3.method7930(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass76_Sub3_Sub1_2.aFloat163);
				OpenGL.glTexCoord2f(0.0F, this.aClass76_Sub3_Sub1_2.aFloat163);
				OpenGL.glVertex2f(local67, local76);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local67, local94);
				OpenGL.glMultiTexCoord2f(33985, this.aClass76_Sub3_Sub1_2.aFloat162, 0.0F);
				OpenGL.glTexCoord2f(this.aClass76_Sub3_Sub1_2.aFloat162, 0.0F);
				OpenGL.glVertex2f(local85, local94);
				OpenGL.glMultiTexCoord2f(33985, this.aClass76_Sub3_Sub1_2.aFloat162, this.aClass76_Sub3_Sub1_2.aFloat163);
				OpenGL.glTexCoord2f(this.aClass76_Sub3_Sub1_2.aFloat162, this.aClass76_Sub3_Sub1_2.aFloat163);
				OpenGL.glVertex2f(local85, local76);
				OpenGL.glEnd();
				this.method5776();
			}
		} else if (this.aClass76_Sub3_Sub1_3 == null) {
			this.aClass5_Sub2_27.method4997(this.aClass76_Sub3_Sub1_2);
			this.aClass5_Sub2_27.method4953(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass76_Sub3_Sub1_2.aFloat163);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass76_Sub3_Sub1_2.aFloat162, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass76_Sub3_Sub1_2.aFloat162, this.aClass76_Sub3_Sub1_2.aFloat163);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method5777(arg4);
			this.aClass76_Sub3_Sub1_3.method7930(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass76_Sub3_Sub1_2.aFloat163);
			OpenGL.glTexCoord2f(0.0F, this.aClass76_Sub3_Sub1_2.aFloat163);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass76_Sub3_Sub1_2.aFloat162, 0.0F);
			OpenGL.glTexCoord2f(this.aClass76_Sub3_Sub1_2.aFloat162, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass76_Sub3_Sub1_2.aFloat162, this.aClass76_Sub3_Sub1_2.aFloat163);
			OpenGL.glTexCoord2f(this.aClass76_Sub3_Sub1_2.aFloat162, this.aClass76_Sub3_Sub1_2.aFloat163);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method5776();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method8574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg2;
		@Pc(9) Class76_Sub3_Sub1 local9 = local6.aClass76_Sub3_Sub1_4;
		this.aClass76_Sub3_Sub1_2.method7930(false);
		this.aClass5_Sub2_27.method5005();
		this.aClass5_Sub2_27.method4997(this.aClass76_Sub3_Sub1_2);
		this.aClass5_Sub2_27.method4953(1);
		this.aClass5_Sub2_27.method5004(1);
		this.aClass5_Sub2_27.method4997(local9);
		this.aClass5_Sub2_27.method4982(8448, 7681);
		this.aClass5_Sub2_27.method5000(34168, 768, 0);
		this.aClass5_Sub2_27.method4971(1);
		@Pc(62) int local62 = arg1 + this.anInt6713;
		@Pc(67) int local67 = arg0 + this.anInt6712;
		@Pc(73) int local73 = local67 + this.aClass76_Sub3_Sub1_2.anInt7375;
		@Pc(79) int local79 = this.aClass76_Sub3_Sub1_2.anInt7373 + local62;
		@Pc(86) float local86 = local9.aFloat162 / (float) local9.anInt7375;
		@Pc(93) float local93 = local9.aFloat163 / (float) local9.anInt7373;
		@Pc(101) float local101 = (float) (local67 - arg3) * local86;
		@Pc(109) float local109 = (float) (local73 - arg3) * local86;
		@Pc(120) float local120 = local9.aFloat163 - (float) (local62 - arg4) * local93;
		@Pc(132) float local132 = local9.aFloat163 - local93 * (float) (local79 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass76_Sub3_Sub1_2.aFloat163);
		OpenGL.glMultiTexCoord2f(33985, local101, local120);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local132);
		OpenGL.glVertex2i(local67, this.aClass76_Sub3_Sub1_2.anInt7373 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass76_Sub3_Sub1_2.aFloat162, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local132);
		OpenGL.glVertex2i(local67 + this.aClass76_Sub3_Sub1_2.anInt7375, local62 - -this.aClass76_Sub3_Sub1_2.anInt7373);
		OpenGL.glMultiTexCoord2f(33984, this.aClass76_Sub3_Sub1_2.aFloat162, this.aClass76_Sub3_Sub1_2.aFloat163);
		OpenGL.glMultiTexCoord2f(33985, local109, local120);
		OpenGL.glVertex2i(this.aClass76_Sub3_Sub1_2.anInt7375 + local67, local62);
		OpenGL.glEnd();
		this.aClass5_Sub2_27.method5000(5890, 768, 0);
		this.aClass5_Sub2_27.method4953(0);
		this.aClass5_Sub2_27.method4997(null);
		this.aClass5_Sub2_27.method5004(0);
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "()I")
	@Override
	public int method8578() {
		return this.aClass76_Sub3_Sub1_2.anInt7373;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)V")
	@Override
	public void method8561(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass76_Sub3_Sub1_3 = Static436.method6807(this.aClass76_Sub3_Sub1_2.anInt7373, this.aClass76_Sub3_Sub1_2.anInt7375, this.aClass5_Sub2_27, 0, 0);
		this.anInt6703 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}
}
