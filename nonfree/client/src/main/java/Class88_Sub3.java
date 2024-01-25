import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class88_Sub3 extends Class88 {

	@OriginalMember(owner = "client!rk", name = "E", descriptor = "Lclient!bb;")
	private Class3_Sub2_Sub1 aClass3_Sub2_Sub1_4;

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
	private int anInt8746 = 0;

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "Z")
	private boolean aBoolean615 = false;

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
	private int anInt8742 = 0;

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
	private int anInt8753 = 0;

	@OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
	private int anInt8755 = 0;

	@OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
	private int anInt8756 = 0;

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "Lclient!kfa;")
	private final Class7_Sub2 aClass7_Sub2_37;

	@OriginalMember(owner = "client!rk", name = "F", descriptor = "Lclient!bb;")
	public final Class3_Sub2_Sub1 aClass3_Sub2_Sub1_5;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!kfa;IIZ)V")
	public Class88_Sub3(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass7_Sub2_37 = arg0;
		this.aClass3_Sub2_Sub1_5 = Static30.method969(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!kfa;IIII)V")
	public Class88_Sub3(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass7_Sub2_37 = arg0;
		this.aClass3_Sub2_Sub1_5 = Static132.method2398(arg4, arg0, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!kfa;II[III)V")
	public Class88_Sub3(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass7_Sub2_37 = arg0;
		this.aClass3_Sub2_Sub1_5 = Static333.method5095(arg3, arg0, arg4, arg1, arg5, arg2);
	}

	@OriginalMember(owner = "client!rk", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aClass3_Sub2_Sub1_5.anInt1112;
	}

	@OriginalMember(owner = "client!rk", name = "A", descriptor = "()I")
	@Override
	public int A() {
		return this.anInt8753 + this.anInt8746 + this.aClass3_Sub2_Sub1_5.anInt1110;
	}

	@OriginalMember(owner = "client!rk", name = "da", descriptor = "(IIIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass3_Sub2_Sub1_5.method955(arg0, arg3, arg5, arg1, arg4, arg2);
	}

	@OriginalMember(owner = "client!rk", name = "YA", descriptor = "(IIIIIIII)V")
	@Override
	protected void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass3_Sub2_Sub1_5.method2739(true);
		this.aClass7_Sub2_37.method4355();
		this.aClass7_Sub2_37.method4343(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean615) {
			@Pc(188) float local188 = (float) arg2 / (float) this.A();
			@Pc(195) float local195 = (float) arg3 / (float) this.ca();
			@Pc(204) float local204 = (float) this.anInt8746 * local188 + (float) arg0;
			@Pc(213) float local213 = (float) arg1 + (float) this.anInt8756 * local195;
			@Pc(222) float local222 = local188 * (float) this.aClass3_Sub2_Sub1_5.anInt1110 + local204;
			@Pc(231) float local231 = local213 + local195 * (float) this.aClass3_Sub2_Sub1_5.anInt1112;
			if (this.aClass3_Sub2_Sub1_4 == null) {
				this.aClass7_Sub2_37.method4313(this.aClass3_Sub2_Sub1_5);
				this.aClass7_Sub2_37.method4288(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_5.aFloat43);
				OpenGL.glVertex2f(local204, local213);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local204, local231);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat42, 0.0F);
				OpenGL.glVertex2f(local222, local231);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat42, this.aClass3_Sub2_Sub1_5.aFloat43);
				OpenGL.glVertex2f(local222, local213);
				OpenGL.glEnd();
			} else {
				this.method6739(arg4);
				this.aClass3_Sub2_Sub1_4.method2739(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass3_Sub2_Sub1_5.aFloat43);
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_5.aFloat43);
				OpenGL.glVertex2f(local204, local213);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local204, local231);
				OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub2_Sub1_5.aFloat42, 0.0F);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat42, 0.0F);
				OpenGL.glVertex2f(local222, local231);
				OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub2_Sub1_5.aFloat42, this.aClass3_Sub2_Sub1_5.aFloat43);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat42, this.aClass3_Sub2_Sub1_5.aFloat43);
				OpenGL.glVertex2f(local222, local213);
				OpenGL.glEnd();
				this.method6737();
			}
		} else if (this.aClass3_Sub2_Sub1_4 == null) {
			this.aClass7_Sub2_37.method4313(this.aClass3_Sub2_Sub1_5);
			this.aClass7_Sub2_37.method4288(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_5.aFloat43);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat42, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat42, this.aClass3_Sub2_Sub1_5.aFloat43);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method6739(arg4);
			this.aClass3_Sub2_Sub1_4.method2739(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass3_Sub2_Sub1_5.aFloat43);
			OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_5.aFloat43);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub2_Sub1_5.aFloat42, 0.0F);
			OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat42, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub2_Sub1_5.aFloat42, this.aClass3_Sub2_Sub1_5.aFloat43);
			OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat42, this.aClass3_Sub2_Sub1_5.aFloat43);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method6737();
		}
	}

	@OriginalMember(owner = "client!rk", name = "DA", descriptor = "(IIIIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg0 + arg2;
		@Pc(14) int local14 = arg1 + arg3;
		this.aClass3_Sub2_Sub1_5.method2739(false);
		this.aClass7_Sub2_37.method4355();
		this.aClass7_Sub2_37.method4313(this.aClass3_Sub2_Sub1_5);
		this.aClass7_Sub2_37.method4343(arg6);
		this.aClass7_Sub2_37.method4288(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass3_Sub2_Sub1_5.aBoolean101 && !this.aBoolean615) {
			@Pc(346) float local346 = (float) arg3 * this.aClass3_Sub2_Sub1_5.aFloat43 / (float) this.aClass3_Sub2_Sub1_5.anInt1112;
			@Pc(358) float local358 = (float) arg2 * this.aClass3_Sub2_Sub1_5.aFloat42 / (float) this.aClass3_Sub2_Sub1_5.anInt1110;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local346);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local14);
			OpenGL.glTexCoord2f(local358, 0.0F);
			OpenGL.glVertex2i(local10, local14);
			OpenGL.glTexCoord2f(local358, local346);
			OpenGL.glVertex2i(local10, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt8746, (float) this.anInt8756, 0.0F);
		@Pc(73) int local73 = this.A();
		@Pc(76) int local76 = this.ca();
		@Pc(82) int local82 = this.aClass3_Sub2_Sub1_5.anInt1112 + arg1;
		OpenGL.glBegin(7);
		@Pc(86) int local86 = arg1;
		@Pc(95) int local95;
		while (local82 <= local14) {
			local95 = arg0 + this.aClass3_Sub2_Sub1_5.anInt1110;
			@Pc(97) int local97 = arg0;
			while (local95 <= local10) {
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_5.aFloat43);
				OpenGL.glVertex2i(local97, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local82);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat42, 0.0F);
				OpenGL.glVertex2i(local95, local82);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat42, this.aClass3_Sub2_Sub1_5.aFloat43);
				OpenGL.glVertex2i(local95, local86);
				local95 += local73;
				local97 += local73;
			}
			if (local10 > local97) {
				@Pc(163) float local163 = this.aClass3_Sub2_Sub1_5.aFloat42 * (float) (local10 - local97) / (float) this.aClass3_Sub2_Sub1_5.anInt1110;
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_5.aFloat43);
				OpenGL.glVertex2i(local97, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local82);
				OpenGL.glTexCoord2f(local163, 0.0F);
				OpenGL.glVertex2i(local10, local82);
				OpenGL.glTexCoord2f(local163, this.aClass3_Sub2_Sub1_5.aFloat43);
				OpenGL.glVertex2i(local10, local86);
			}
			local86 += local76;
			local82 += local76;
		}
		if (local14 > local86) {
			@Pc(228) float local228 = (float) (this.aClass3_Sub2_Sub1_5.anInt1112 + local86 - local14) * this.aClass3_Sub2_Sub1_5.aFloat43 / (float) this.aClass3_Sub2_Sub1_5.anInt1112;
			@Pc(234) int local234 = this.aClass3_Sub2_Sub1_5.anInt1110 + arg0;
			local95 = arg0;
			while (local10 >= local234) {
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_5.aFloat43);
				OpenGL.glVertex2i(local95, local86);
				OpenGL.glTexCoord2f(0.0F, local228);
				OpenGL.glVertex2i(local95, local14);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat42, local228);
				OpenGL.glVertex2i(local234, local14);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat42, this.aClass3_Sub2_Sub1_5.aFloat43);
				OpenGL.glVertex2i(local234, local86);
				local95 += local73;
				local234 += local73;
			}
			if (local10 > local95) {
				@Pc(303) float local303 = (float) (local10 - local95) * this.aClass3_Sub2_Sub1_5.aFloat42 / (float) this.aClass3_Sub2_Sub1_5.anInt1110;
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_5.aFloat43);
				OpenGL.glVertex2i(local95, local86);
				OpenGL.glTexCoord2f(0.0F, local228);
				OpenGL.glVertex2i(local95, local14);
				OpenGL.glTexCoord2f(local303, local228);
				OpenGL.glVertex2i(local10, local14);
				OpenGL.glTexCoord2f(local303, this.aClass3_Sub2_Sub1_5.aFloat43);
				OpenGL.glVertex2i(local10, local86);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(FFFFFFILclient!ua;II)V")
	@Override
	protected void method8048(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class67 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class3_Sub2_Sub1 local7 = ((Class67_Sub1) arg6).aClass3_Sub2_Sub1_1;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(32) float local32;
		if (this.aBoolean615) {
			local14 = this.A();
			local18 = this.ca();
			local25 = (arg2 - arg0) / local14;
			local32 = (arg3 - arg1) / local14;
			@Pc(39) float local39 = (arg4 - arg0) / local18;
			@Pc(46) float local46 = (arg5 - arg1) / local18;
			@Pc(52) float local52 = (float) this.anInt8756 * local39;
			@Pc(58) float local58 = local46 * (float) this.anInt8756;
			@Pc(64) float local64 = local25 * (float) this.anInt8746;
			@Pc(70) float local70 = (float) this.anInt8746 * local32;
			@Pc(77) float local77 = -local25 * (float) this.anInt8753;
			@Pc(84) float local84 = -local32 * (float) this.anInt8753;
			@Pc(91) float local91 = (float) this.anInt8742 * -local39;
			arg3 = local84 + arg3 + local58;
			@Pc(104) float local104 = (float) this.anInt8742 * -local46;
			arg4 = local91 + arg4 + local64;
			arg0 = local64 + arg0 + local52;
			arg1 = local58 + local70 + arg1;
			arg2 = local52 + local77 + arg2;
			arg5 = local70 + arg5 + local104;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass3_Sub2_Sub1_5.method2739(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass7_Sub2_37.method4355();
		this.aClass7_Sub2_37.method4313(this.aClass3_Sub2_Sub1_5);
		this.aClass7_Sub2_37.method4288(1);
		this.aClass7_Sub2_37.method4326(1);
		this.aClass7_Sub2_37.method4313(local7);
		this.aClass7_Sub2_37.method4346(7681, 8448);
		this.aClass7_Sub2_37.method4280(34168, 0, 768);
		this.aClass7_Sub2_37.method4343(1);
		local25 = local7.aFloat42 / (float) local7.anInt1110;
		local32 = local7.aFloat43 / (float) local7.anInt1112;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass3_Sub2_Sub1_5.aFloat43);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg0), local7.aFloat43 - (arg1 - (float) arg8) * local32);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * local25, local7.aFloat43 - local32 * (arg5 - (float) arg8));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass3_Sub2_Sub1_5.aFloat42, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (local14 - (float) arg7) * local25, local7.aFloat43 - local32 * (local18 - (float) arg8));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass3_Sub2_Sub1_5.aFloat42, this.aClass3_Sub2_Sub1_5.aFloat43);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg2), local7.aFloat43 - local32 * (arg3 - (float) arg8));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass7_Sub2_37.method4280(5890, 0, 768);
		this.aClass7_Sub2_37.method4288(0);
		this.aClass7_Sub2_37.method4313(null);
		this.aClass7_Sub2_37.method4326(0);
	}

	@OriginalMember(owner = "client!rk", name = "Q", descriptor = "(IIII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8746 = arg0;
		this.anInt8756 = arg1;
		this.anInt8753 = arg2;
		this.anInt8742 = arg3;
		this.aBoolean615 = this.anInt8746 != 0 || this.anInt8756 != 0 || this.anInt8753 != 0 || this.anInt8742 != 0;
	}

	@OriginalMember(owner = "client!rk", name = "xa", descriptor = "(III)V")
	@Override
	public void xa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass3_Sub2_Sub1_4 = Static132.method2398(this.aClass3_Sub2_Sub1_5.anInt1112, this.aClass7_Sub2_37, this.aClass3_Sub2_Sub1_5.anInt1110, arg0, arg1);
		this.anInt8755 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!rk", name = "qa", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void qa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean615) {
			local10 = this.A();
			local14 = this.ca();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			@Pc(27) float local27 = (arg3 - arg1) / local10;
			@Pc(34) float local34 = (arg4 - arg0) / local14;
			@Pc(41) float local41 = (arg5 - arg1) / local14;
			@Pc(47) float local47 = (float) this.anInt8756 * local34;
			@Pc(53) float local53 = (float) this.anInt8756 * local41;
			@Pc(59) float local59 = local20 * (float) this.anInt8746;
			@Pc(65) float local65 = (float) this.anInt8746 * local27;
			@Pc(72) float local72 = -local20 * (float) this.anInt8753;
			@Pc(79) float local79 = -local27 * (float) this.anInt8753;
			@Pc(86) float local86 = (float) this.anInt8742 * -local34;
			arg2 = local72 + arg2 + local47;
			@Pc(99) float local99 = -local41 * (float) this.anInt8742;
			arg4 = local86 + local59 + arg4;
			arg0 = arg0 + local59 + local47;
			arg3 = local53 + local79 + arg3;
			arg1 = local53 + local65 + arg1;
			arg5 = local99 + local65 + arg5;
		}
		local10 = arg2 + arg4 - arg0;
		this.aClass3_Sub2_Sub1_5.method2739(true);
		local14 = arg3 + arg5 - arg1;
		this.aClass7_Sub2_37.method4355();
		this.aClass7_Sub2_37.method4313(this.aClass3_Sub2_Sub1_5);
		this.aClass7_Sub2_37.method4343(arg8);
		this.aClass7_Sub2_37.method4288(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_5.aFloat43);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat42, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat42, this.aClass3_Sub2_Sub1_5.aFloat43);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
	private void method6737() {
		this.aClass7_Sub2_37.method4326(1);
		this.aClass7_Sub2_37.method4313(null);
		this.aClass7_Sub2_37.method4346(8448, 8448);
		this.aClass7_Sub2_37.method4280(34168, 1, 768);
		this.aClass7_Sub2_37.method4276(5890, 0);
		this.aClass7_Sub2_37.method4326(0);
		this.aClass7_Sub2_37.method4280(34168, 1, 768);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)V")
	private void method6739(@OriginalArg(0) int arg0) {
		this.aClass7_Sub2_37.method4326(1);
		this.aClass7_Sub2_37.method4313(this.aClass3_Sub2_Sub1_5);
		this.aClass7_Sub2_37.method4346(this.aClass7_Sub2_37.method4306(arg0), 7681);
		this.aClass7_Sub2_37.method4280(34167, 1, 768);
		this.aClass7_Sub2_37.method4276(34168, 0);
		this.aClass7_Sub2_37.method4326(0);
		this.aClass7_Sub2_37.method4313(this.aClass3_Sub2_Sub1_4);
		this.aClass7_Sub2_37.method4346(34479, 7681);
		this.aClass7_Sub2_37.method4280(34166, 1, 768);
		if (this.anInt8755 == 0) {
			this.aClass7_Sub2_37.method4347(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt8755 == 1) {
			this.aClass7_Sub2_37.method4347(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt8755 == 2) {
			this.aClass7_Sub2_37.method4347(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt8755 == 3) {
			this.aClass7_Sub2_37.method4347(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!rk", name = "ca", descriptor = "()I")
	@Override
	public int ca() {
		return this.anInt8756 + this.aClass3_Sub2_Sub1_5.anInt1112 + this.anInt8742;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILclient!ua;II)V")
	@Override
	public void method8045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class67_Sub1 local6 = (Class67_Sub1) arg2;
		@Pc(9) Class3_Sub2_Sub1 local9 = local6.aClass3_Sub2_Sub1_1;
		this.aClass3_Sub2_Sub1_5.method2739(false);
		this.aClass7_Sub2_37.method4355();
		this.aClass7_Sub2_37.method4313(this.aClass3_Sub2_Sub1_5);
		this.aClass7_Sub2_37.method4288(1);
		this.aClass7_Sub2_37.method4326(1);
		this.aClass7_Sub2_37.method4313(local9);
		this.aClass7_Sub2_37.method4346(7681, 8448);
		this.aClass7_Sub2_37.method4280(34168, 0, 768);
		this.aClass7_Sub2_37.method4343(1);
		@Pc(62) int local62 = arg1 + this.anInt8756;
		@Pc(67) int local67 = arg0 + this.anInt8746;
		@Pc(73) int local73 = this.aClass3_Sub2_Sub1_5.anInt1110 + local67;
		@Pc(79) int local79 = local62 + this.aClass3_Sub2_Sub1_5.anInt1112;
		@Pc(86) float local86 = local9.aFloat42 / (float) local9.anInt1110;
		@Pc(93) float local93 = local9.aFloat43 / (float) local9.anInt1112;
		@Pc(101) float local101 = local86 * (float) (local67 - arg3);
		@Pc(108) float local108 = local86 * (float) (local73 - arg3);
		@Pc(119) float local119 = local9.aFloat43 - (float) (local62 - arg4) * local93;
		@Pc(130) float local130 = local9.aFloat43 - local93 * (float) (local79 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass3_Sub2_Sub1_5.aFloat43);
		OpenGL.glMultiTexCoord2f(33985, local101, local119);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local130);
		OpenGL.glVertex2i(local67, this.aClass3_Sub2_Sub1_5.anInt1112 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass3_Sub2_Sub1_5.aFloat42, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local108, local130);
		OpenGL.glVertex2i(this.aClass3_Sub2_Sub1_5.anInt1110 + local67, this.aClass3_Sub2_Sub1_5.anInt1112 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass3_Sub2_Sub1_5.aFloat42, this.aClass3_Sub2_Sub1_5.aFloat43);
		OpenGL.glMultiTexCoord2f(33985, local108, local119);
		OpenGL.glVertex2i(this.aClass3_Sub2_Sub1_5.anInt1110 + local67, local62);
		OpenGL.glEnd();
		this.aClass7_Sub2_37.method4280(5890, 0, 768);
		this.aClass7_Sub2_37.method4288(0);
		this.aClass7_Sub2_37.method4313(null);
		this.aClass7_Sub2_37.method4326(0);
	}

	@OriginalMember(owner = "client!rk", name = "V", descriptor = "(IIIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass3_Sub2_Sub1_5.method2739(false);
		this.aClass7_Sub2_37.method4355();
		this.aClass7_Sub2_37.method4343(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt8756;
		@Pc(42) int local42 = arg0 + this.anInt8746;
		if (this.aClass3_Sub2_Sub1_4 == null) {
			this.aClass7_Sub2_37.method4313(this.aClass3_Sub2_Sub1_5);
			this.aClass7_Sub2_37.method4288(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_5.aFloat43);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, local37 + this.aClass3_Sub2_Sub1_5.anInt1112);
			OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat42, 0.0F);
			OpenGL.glVertex2i(this.aClass3_Sub2_Sub1_5.anInt1110 + local42, this.aClass3_Sub2_Sub1_5.anInt1112 + local37);
			OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat42, this.aClass3_Sub2_Sub1_5.aFloat43);
			OpenGL.glVertex2i(local42 + this.aClass3_Sub2_Sub1_5.anInt1110, local37);
			OpenGL.glEnd();
			return;
		}
		this.method6739(arg2);
		this.aClass3_Sub2_Sub1_4.method2739(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass3_Sub2_Sub1_5.aFloat43);
		OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_5.aFloat43);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, this.aClass3_Sub2_Sub1_5.anInt1112 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub2_Sub1_5.aFloat42, 0.0F);
		OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat42, 0.0F);
		OpenGL.glVertex2i(this.aClass3_Sub2_Sub1_5.anInt1110 + local42, local37 - -this.aClass3_Sub2_Sub1_5.anInt1112);
		OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub2_Sub1_5.aFloat42, this.aClass3_Sub2_Sub1_5.aFloat43);
		OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat42, this.aClass3_Sub2_Sub1_5.aFloat43);
		OpenGL.glVertex2i(this.aClass3_Sub2_Sub1_5.anInt1110 + local42, local37);
		OpenGL.glEnd();
		this.method6737();
	}

	@OriginalMember(owner = "client!rk", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return this.aClass3_Sub2_Sub1_5.anInt1110;
	}
}
