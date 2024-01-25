import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class43_Sub3 extends Class43 {

	@OriginalMember(owner = "client!td", name = "b", descriptor = "Lclient!ke;")
	private Class64_Sub4_Sub1 aClass64_Sub4_Sub1_4;

	@OriginalMember(owner = "client!td", name = "q", descriptor = "I")
	private int anInt9404 = 0;

	@OriginalMember(owner = "client!td", name = "B", descriptor = "Z")
	private boolean aBoolean810 = false;

	@OriginalMember(owner = "client!td", name = "e", descriptor = "I")
	private int anInt9407 = 0;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "I")
	private int anInt9414 = 0;

	@OriginalMember(owner = "client!td", name = "o", descriptor = "I")
	private int anInt9422 = 0;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "I")
	private int anInt9419 = 0;

	@OriginalMember(owner = "client!td", name = "j", descriptor = "Lclient!uja;")
	private final Class145_Sub3 aClass145_Sub3_42;

	@OriginalMember(owner = "client!td", name = "u", descriptor = "Lclient!ke;")
	private final Class64_Sub4_Sub1 aClass64_Sub4_Sub1_3;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!uja;IIZ)V")
	public Class43_Sub3(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass145_Sub3_42 = arg0;
		this.aClass64_Sub4_Sub1_3 = Static655.method8993(arg3 ? 6408 : 6407, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!uja;IIII)V")
	public Class43_Sub3(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass145_Sub3_42 = arg0;
		this.aClass64_Sub4_Sub1_3 = Static97.method1515(arg1, arg3, arg4, arg2, arg0);
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!uja;II[III)V")
	public Class43_Sub3(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass145_Sub3_42 = arg0;
		this.aClass64_Sub4_Sub1_3 = Static101.method7885(arg0, arg4, arg1, arg2, arg5, arg3);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method9591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass64_Sub4_Sub1_3.method4540(true);
		this.aClass145_Sub3_42.method8894();
		this.aClass145_Sub3_42.method8847(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean810) {
			@Pc(193) float local193 = (float) arg2 / (float) this.method9587();
			@Pc(200) float local200 = (float) arg3 / (float) this.method9600();
			@Pc(209) float local209 = (float) this.anInt9422 * local193 + (float) arg0;
			@Pc(218) float local218 = (float) this.anInt9414 * local200 + (float) arg1;
			@Pc(227) float local227 = local209 + local193 * (float) this.aClass64_Sub4_Sub1_3.anInt5009;
			@Pc(236) float local236 = local218 + local200 * (float) this.aClass64_Sub4_Sub1_3.anInt5010;
			if (this.aClass64_Sub4_Sub1_4 == null) {
				this.aClass145_Sub3_42.method8872(this.aClass64_Sub4_Sub1_3);
				this.aClass145_Sub3_42.method8900(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass64_Sub4_Sub1_3.aFloat68);
				OpenGL.glVertex2f(local209, local218);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local209, local236);
				OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_3.aFloat67, 0.0F);
				OpenGL.glVertex2f(local227, local236);
				OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_3.aFloat67, this.aClass64_Sub4_Sub1_3.aFloat68);
				OpenGL.glVertex2f(local227, local218);
				OpenGL.glEnd();
			} else {
				this.method8321(arg4);
				this.aClass64_Sub4_Sub1_4.method4540(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass64_Sub4_Sub1_3.aFloat68);
				OpenGL.glTexCoord2f(0.0F, this.aClass64_Sub4_Sub1_3.aFloat68);
				OpenGL.glVertex2f(local209, local218);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local209, local236);
				OpenGL.glMultiTexCoord2f(33985, this.aClass64_Sub4_Sub1_3.aFloat67, 0.0F);
				OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_3.aFloat67, 0.0F);
				OpenGL.glVertex2f(local227, local236);
				OpenGL.glMultiTexCoord2f(33985, this.aClass64_Sub4_Sub1_3.aFloat67, this.aClass64_Sub4_Sub1_3.aFloat68);
				OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_3.aFloat67, this.aClass64_Sub4_Sub1_3.aFloat68);
				OpenGL.glVertex2f(local227, local218);
				OpenGL.glEnd();
				this.method8319();
			}
		} else if (this.aClass64_Sub4_Sub1_4 == null) {
			this.aClass145_Sub3_42.method8872(this.aClass64_Sub4_Sub1_3);
			this.aClass145_Sub3_42.method8900(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass64_Sub4_Sub1_3.aFloat68);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_3.aFloat67, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_3.aFloat67, this.aClass64_Sub4_Sub1_3.aFloat68);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method8321(arg4);
			this.aClass64_Sub4_Sub1_4.method4540(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass64_Sub4_Sub1_3.aFloat68);
			OpenGL.glTexCoord2f(0.0F, this.aClass64_Sub4_Sub1_3.aFloat68);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass64_Sub4_Sub1_3.aFloat67, 0.0F);
			OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_3.aFloat67, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass64_Sub4_Sub1_3.aFloat67, this.aClass64_Sub4_Sub1_3.aFloat68);
			OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_3.aFloat67, this.aClass64_Sub4_Sub1_3.aFloat68);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method8319();
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method9606(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class64_Sub4_Sub1 local7 = ((Class1_Sub1) arg6).aClass64_Sub4_Sub1_1;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(31) float local31;
		if (this.aBoolean810) {
			local14 = (float) this.method9587();
			local18 = (float) this.method9600();
			local25 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = (float) this.anInt9414 * local38;
			@Pc(56) float local56 = local44 * (float) this.anInt9414;
			@Pc(62) float local62 = (float) this.anInt9422 * local25;
			@Pc(68) float local68 = local31 * (float) this.anInt9422;
			@Pc(75) float local75 = (float) this.anInt9404 * -local25;
			@Pc(82) float local82 = -local31 * (float) this.anInt9404;
			@Pc(89) float local89 = (float) this.anInt9407 * -local38;
			arg2 = local50 + local75 + arg2;
			arg3 = local82 + arg3 + local56;
			arg1 = arg1 + local68 + local56;
			arg4 = local89 + arg4 + local62;
			@Pc(120) float local120 = (float) this.anInt9407 * -local44;
			arg0 = local62 + arg0 + local50;
			arg5 = local120 + arg5 + local68;
		}
		local14 = arg2 + arg4 - arg0;
		this.aClass64_Sub4_Sub1_3.method4540(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass145_Sub3_42.method8894();
		this.aClass145_Sub3_42.method8872(this.aClass64_Sub4_Sub1_3);
		this.aClass145_Sub3_42.method8900(1);
		this.aClass145_Sub3_42.method8859(1);
		this.aClass145_Sub3_42.method8872(local7);
		this.aClass145_Sub3_42.method8897(8448, 7681);
		this.aClass145_Sub3_42.method8854(0, 34168, 768);
		this.aClass145_Sub3_42.method8847(1);
		local25 = local7.aFloat67 / (float) local7.anInt5009;
		local31 = local7.aFloat68 / (float) local7.anInt5010;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass64_Sub4_Sub1_3.aFloat68);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg0) * local25, local7.aFloat68 - ((float) -arg8 + arg1) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg4 - (float) arg7), local7.aFloat68 - local31 * ((float) -arg8 + arg5));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass64_Sub4_Sub1_3.aFloat67, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + local14), local7.aFloat68 - (local18 - (float) arg8) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass64_Sub4_Sub1_3.aFloat67, this.aClass64_Sub4_Sub1_3.aFloat68);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg2 - (float) arg7), local7.aFloat68 - (arg3 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass145_Sub3_42.method8854(0, 5890, 768);
		this.aClass145_Sub3_42.method8900(0);
		this.aClass145_Sub3_42.method8872((Class64) null);
		this.aClass145_Sub3_42.method8859(0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method9583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass64_Sub4_Sub1_3.method4540(false);
		this.aClass145_Sub3_42.method8894();
		this.aClass145_Sub3_42.method8847(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt9422;
		@Pc(42) int local42 = arg1 + this.anInt9414;
		if (this.aClass64_Sub4_Sub1_4 == null) {
			this.aClass145_Sub3_42.method8872(this.aClass64_Sub4_Sub1_3);
			this.aClass145_Sub3_42.method8900(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass64_Sub4_Sub1_3.aFloat68);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass64_Sub4_Sub1_3.anInt5010 + local42);
			OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_3.aFloat67, 0.0F);
			OpenGL.glVertex2i(this.aClass64_Sub4_Sub1_3.anInt5009 + local37, this.aClass64_Sub4_Sub1_3.anInt5010 + local42);
			OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_3.aFloat67, this.aClass64_Sub4_Sub1_3.aFloat68);
			OpenGL.glVertex2i(this.aClass64_Sub4_Sub1_3.anInt5009 + local37, local42);
			OpenGL.glEnd();
			return;
		}
		this.method8321(arg2);
		this.aClass64_Sub4_Sub1_4.method4540(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass64_Sub4_Sub1_3.aFloat68);
		OpenGL.glTexCoord2f(0.0F, this.aClass64_Sub4_Sub1_3.aFloat68);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, local42 + this.aClass64_Sub4_Sub1_3.anInt5010);
		OpenGL.glMultiTexCoord2f(33985, this.aClass64_Sub4_Sub1_3.aFloat67, 0.0F);
		OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_3.aFloat67, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass64_Sub4_Sub1_3.anInt5009, local42 - -this.aClass64_Sub4_Sub1_3.anInt5010);
		OpenGL.glMultiTexCoord2f(33985, this.aClass64_Sub4_Sub1_3.aFloat67, this.aClass64_Sub4_Sub1_3.aFloat68);
		OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_3.aFloat67, this.aClass64_Sub4_Sub1_3.aFloat68);
		OpenGL.glVertex2i(this.aClass64_Sub4_Sub1_3.anInt5009 + local37, local42);
		OpenGL.glEnd();
		this.method8319();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method9585(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean810) {
			local6 = (float) this.method9587();
			local10 = (float) this.method9600();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(24) float local24 = (arg3 - arg1) / local6;
			@Pc(30) float local30 = (arg4 - arg0) / local10;
			@Pc(36) float local36 = (arg5 - arg1) / local10;
			@Pc(42) float local42 = local30 * (float) this.anInt9414;
			@Pc(48) float local48 = local36 * (float) this.anInt9414;
			@Pc(54) float local54 = local17 * (float) this.anInt9422;
			@Pc(60) float local60 = (float) this.anInt9422 * local24;
			@Pc(67) float local67 = -local17 * (float) this.anInt9404;
			@Pc(74) float local74 = -local24 * (float) this.anInt9404;
			@Pc(81) float local81 = (float) this.anInt9407 * -local30;
			arg4 = arg4 + local54 + local81;
			arg2 = local42 + arg2 + local67;
			arg3 = local74 + arg3 + local48;
			arg1 = local60 + arg1 + local48;
			@Pc(112) float local112 = (float) this.anInt9407 * -local36;
			arg0 = local42 + local54 + arg0;
			arg5 = local112 + local60 + arg5;
		}
		local6 = arg4 + arg2 - arg0;
		local10 = arg5 + arg3 - arg1;
		this.aClass64_Sub4_Sub1_3.method4540(true);
		this.aClass145_Sub3_42.method8894();
		this.aClass145_Sub3_42.method8872(this.aClass64_Sub4_Sub1_3);
		this.aClass145_Sub3_42.method8847(1);
		this.aClass145_Sub3_42.method8900(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass64_Sub4_Sub1_3.aFloat68);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_3.aFloat67, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_3.aFloat67, this.aClass64_Sub4_Sub1_3.aFloat68);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V")
	@Override
	public void method9598() {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass64_Sub4_Sub1_4 = Static97.method1515(0, this.aClass64_Sub4_Sub1_3.anInt5009, this.aClass64_Sub4_Sub1_3.anInt5010, 0, this.aClass145_Sub3_42);
		this.anInt9419 = 3;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "()I")
	@Override
	public int method9600() {
		return this.anInt9407 + this.anInt9414 + this.aClass64_Sub4_Sub1_3.anInt5010;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "()I")
	@Override
	public int method9592() {
		return this.aClass64_Sub4_Sub1_3.anInt5010;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([I)V")
	@Override
	public void method9599(@OriginalArg(0) int[] arg0) {
		arg0[1] = this.anInt9414;
		arg0[0] = this.anInt9422;
		arg0[2] = this.anInt9404;
		arg0[3] = this.anInt9407;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	private void method8319() {
		this.aClass145_Sub3_42.method8859(1);
		this.aClass145_Sub3_42.method8872((Class64) null);
		this.aClass145_Sub3_42.method8897(8448, 8448);
		this.aClass145_Sub3_42.method8854(1, 34168, 768);
		this.aClass145_Sub3_42.method8857(5890, 0);
		this.aClass145_Sub3_42.method8859(0);
		this.aClass145_Sub3_42.method8854(1, 34168, 768);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "()I")
	@Override
	public int method9601() {
		return this.aClass64_Sub4_Sub1_3.anInt5009;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(IIII)V")
	@Override
	public void method9586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9404 = arg2;
		this.anInt9414 = arg1;
		this.anInt9407 = arg3;
		this.anInt9422 = arg0;
		this.aBoolean810 = this.anInt9422 != 0 || this.anInt9414 != 0 || this.anInt9404 != 0 || this.anInt9407 != 0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method9603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg0 + arg2;
		this.aClass64_Sub4_Sub1_3.method4540(false);
		@Pc(19) int local19 = arg1 + arg3;
		this.aClass145_Sub3_42.method8894();
		this.aClass145_Sub3_42.method8872(this.aClass64_Sub4_Sub1_3);
		this.aClass145_Sub3_42.method8847(arg6);
		this.aClass145_Sub3_42.method8900(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass64_Sub4_Sub1_3.aBoolean428 && !this.aBoolean810) {
			@Pc(75) float local75 = (float) arg3 * this.aClass64_Sub4_Sub1_3.aFloat68 / (float) this.aClass64_Sub4_Sub1_3.anInt5010;
			@Pc(87) float local87 = this.aClass64_Sub4_Sub1_3.aFloat67 * (float) arg2 / (float) this.aClass64_Sub4_Sub1_3.anInt5009;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local75);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local19);
			OpenGL.glTexCoord2f(local87, 0.0F);
			OpenGL.glVertex2i(local10, local19);
			OpenGL.glTexCoord2f(local87, local75);
			OpenGL.glVertex2i(local10, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt9422, (float) this.anInt9414, 0.0F);
		@Pc(127) int local127 = this.method9587();
		@Pc(130) int local130 = this.method9600();
		@Pc(136) int local136 = this.aClass64_Sub4_Sub1_3.anInt5010 + arg1;
		OpenGL.glBegin(7);
		@Pc(140) int local140 = arg1;
		@Pc(150) int local150;
		while (local19 >= local136) {
			local150 = this.aClass64_Sub4_Sub1_3.anInt5009 + arg0;
			@Pc(152) int local152 = arg0;
			while (local150 <= local10) {
				OpenGL.glTexCoord2f(0.0F, this.aClass64_Sub4_Sub1_3.aFloat68);
				OpenGL.glVertex2i(local152, local140);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local152, local136);
				OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_3.aFloat67, 0.0F);
				OpenGL.glVertex2i(local150, local136);
				OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_3.aFloat67, this.aClass64_Sub4_Sub1_3.aFloat68);
				OpenGL.glVertex2i(local150, local140);
				local150 += local127;
				local152 += local127;
			}
			if (local152 < local10) {
				@Pc(219) float local219 = this.aClass64_Sub4_Sub1_3.aFloat67 * (float) (local10 - local152) / (float) this.aClass64_Sub4_Sub1_3.anInt5009;
				OpenGL.glTexCoord2f(0.0F, this.aClass64_Sub4_Sub1_3.aFloat68);
				OpenGL.glVertex2i(local152, local140);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local152, local136);
				OpenGL.glTexCoord2f(local219, 0.0F);
				OpenGL.glVertex2i(local10, local136);
				OpenGL.glTexCoord2f(local219, this.aClass64_Sub4_Sub1_3.aFloat68);
				OpenGL.glVertex2i(local10, local140);
			}
			local140 += local130;
			local136 += local130;
		}
		if (local19 > local140) {
			@Pc(292) float local292 = this.aClass64_Sub4_Sub1_3.aFloat68 * (float) (local140 + this.aClass64_Sub4_Sub1_3.anInt5010 - local19) / (float) this.aClass64_Sub4_Sub1_3.anInt5010;
			@Pc(299) int local299 = arg0 + this.aClass64_Sub4_Sub1_3.anInt5009;
			local150 = arg0;
			while (local10 >= local299) {
				OpenGL.glTexCoord2f(0.0F, this.aClass64_Sub4_Sub1_3.aFloat68);
				OpenGL.glVertex2i(local150, local140);
				OpenGL.glTexCoord2f(0.0F, local292);
				OpenGL.glVertex2i(local150, local19);
				OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_3.aFloat67, local292);
				OpenGL.glVertex2i(local299, local19);
				OpenGL.glTexCoord2f(this.aClass64_Sub4_Sub1_3.aFloat67, this.aClass64_Sub4_Sub1_3.aFloat68);
				OpenGL.glVertex2i(local299, local140);
				local299 += local127;
				local150 += local127;
			}
			if (local10 > local150) {
				@Pc(368) float local368 = (float) (local10 - local150) * this.aClass64_Sub4_Sub1_3.aFloat67 / (float) this.aClass64_Sub4_Sub1_3.anInt5009;
				OpenGL.glTexCoord2f(0.0F, this.aClass64_Sub4_Sub1_3.aFloat68);
				OpenGL.glVertex2i(local150, local140);
				OpenGL.glTexCoord2f(0.0F, local292);
				OpenGL.glVertex2i(local150, local19);
				OpenGL.glTexCoord2f(local368, local292);
				OpenGL.glVertex2i(local10, local19);
				OpenGL.glTexCoord2f(local368, this.aClass64_Sub4_Sub1_3.aFloat68);
				OpenGL.glVertex2i(local10, local140);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "()I")
	@Override
	public int method9587() {
		return this.anInt9404 + this.aClass64_Sub4_Sub1_3.anInt5009 + this.anInt9422;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method9593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg2;
		@Pc(9) Class64_Sub4_Sub1 local9 = local6.aClass64_Sub4_Sub1_1;
		this.aClass64_Sub4_Sub1_3.method4540(false);
		this.aClass145_Sub3_42.method8894();
		this.aClass145_Sub3_42.method8872(this.aClass64_Sub4_Sub1_3);
		this.aClass145_Sub3_42.method8900(1);
		this.aClass145_Sub3_42.method8859(1);
		this.aClass145_Sub3_42.method8872(local9);
		this.aClass145_Sub3_42.method8897(8448, 7681);
		this.aClass145_Sub3_42.method8854(0, 34168, 768);
		this.aClass145_Sub3_42.method8847(1);
		@Pc(62) int local62 = arg0 + this.anInt9422;
		@Pc(67) int local67 = arg1 + this.anInt9414;
		@Pc(73) int local73 = this.aClass64_Sub4_Sub1_3.anInt5009 + local62;
		@Pc(79) int local79 = local67 + this.aClass64_Sub4_Sub1_3.anInt5010;
		@Pc(86) float local86 = local9.aFloat67 / (float) local9.anInt5009;
		@Pc(93) float local93 = local9.aFloat68 / (float) local9.anInt5010;
		@Pc(100) float local100 = (float) (local62 - arg3) * local86;
		@Pc(107) float local107 = local86 * (float) (local73 - arg3);
		@Pc(118) float local118 = local9.aFloat68 - local93 * (float) (local67 - arg4);
		@Pc(129) float local129 = local9.aFloat68 - (float) (local79 - arg4) * local93;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass64_Sub4_Sub1_3.aFloat68);
		OpenGL.glMultiTexCoord2f(33985, local100, local118);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local100, local129);
		OpenGL.glVertex2i(local62, this.aClass64_Sub4_Sub1_3.anInt5010 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass64_Sub4_Sub1_3.aFloat67, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local107, local129);
		OpenGL.glVertex2i(this.aClass64_Sub4_Sub1_3.anInt5009 + local62, local67 - -this.aClass64_Sub4_Sub1_3.anInt5010);
		OpenGL.glMultiTexCoord2f(33984, this.aClass64_Sub4_Sub1_3.aFloat67, this.aClass64_Sub4_Sub1_3.aFloat68);
		OpenGL.glMultiTexCoord2f(33985, local107, local118);
		OpenGL.glVertex2i(local62 + this.aClass64_Sub4_Sub1_3.anInt5009, local67);
		OpenGL.glEnd();
		this.aClass145_Sub3_42.method8854(0, 5890, 768);
		this.aClass145_Sub3_42.method8900(0);
		this.aClass145_Sub3_42.method8872((Class64) null);
		this.aClass145_Sub3_42.method8859(0);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIII[III)V")
	private void method8320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass64_Sub4_Sub1_3.method4552(arg3, arg0, arg5, arg1, arg2, arg4);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)V")
	private void method8321(@OriginalArg(0) int arg0) {
		this.aClass145_Sub3_42.method8859(1);
		this.aClass145_Sub3_42.method8872(this.aClass64_Sub4_Sub1_3);
		this.aClass145_Sub3_42.method8897(7681, this.aClass145_Sub3_42.method8913(arg0));
		this.aClass145_Sub3_42.method8854(1, 34167, 768);
		this.aClass145_Sub3_42.method8857(34168, 0);
		this.aClass145_Sub3_42.method8859(0);
		this.aClass145_Sub3_42.method8872(this.aClass64_Sub4_Sub1_4);
		this.aClass145_Sub3_42.method8897(7681, 34479);
		this.aClass145_Sub3_42.method8854(1, 34166, 768);
		if (this.anInt9419 == 0) {
			this.aClass145_Sub3_42.method8856(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt9419 == 1) {
			this.aClass145_Sub3_42.method8856(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt9419 == 2) {
			this.aClass145_Sub3_42.method8856(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt9419 == 3) {
			this.aClass145_Sub3_42.method8856(128.5F, 128.5F, 128.5F, 0.0F);
			return;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method9597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass145_Sub3_42.aBoolean857) {
			this.aClass64_Sub4_Sub1_3.method4550(arg4, arg2, arg5, arg3, arg0, arg1);
			return;
		}
		@Pc(27) int[] local27 = this.aClass145_Sub3_42.na(arg4, arg5, arg2, arg3);
		if (local27 != null) {
			for (@Pc(31) int local31 = 0; local31 < local27.length; local31++) {
				local27[local31] |= 0xFF000000;
			}
			this.method8320(arg0, arg1, arg2, arg3, local27, arg2);
		}
	}
}
