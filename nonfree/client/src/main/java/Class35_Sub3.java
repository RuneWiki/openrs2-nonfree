import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class35_Sub3 extends Class35 {

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "Lclient!gg;")
	private Class19_Sub2_Sub1 aClass19_Sub2_Sub1_2;

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "Z")
	private boolean aBoolean447 = false;

	@OriginalMember(owner = "client!nk", name = "x", descriptor = "I")
	private int anInt6035 = 0;

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
	private int anInt6024 = 0;

	@OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
	private int anInt6032 = 0;

	@OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
	private int anInt6031 = 0;

	@OriginalMember(owner = "client!nk", name = "z", descriptor = "I")
	private int anInt6037 = 0;

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "Lclient!os;")
	private final Class39_Sub3 aClass39_Sub3_28;

	@OriginalMember(owner = "client!nk", name = "v", descriptor = "Lclient!gg;")
	private final Class19_Sub2_Sub1 aClass19_Sub2_Sub1_3;

	static {
		new Class202("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!os;IIII)V")
	public Class35_Sub3(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass39_Sub3_28 = arg0;
		this.aClass19_Sub2_Sub1_3 = Static81.method1585(arg1, arg4, arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!os;II[III)V")
	public Class35_Sub3(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass39_Sub3_28 = arg0;
		this.aClass19_Sub2_Sub1_3 = Static274.method4352(arg1, arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(FFFFFFLclient!pa;II)V")
	@Override
	protected void method7344(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class209 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class19_Sub2_Sub1 local7 = ((Class209_Sub1) arg6).aClass19_Sub2_Sub1_4;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(31) float local31;
		if (this.aBoolean447) {
			local14 = this.EA();
			local18 = this.ma();
			local25 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = local38 * (float) this.anInt6032;
			@Pc(56) float local56 = (float) this.anInt6032 * local44;
			@Pc(62) float local62 = (float) this.anInt6035 * local25;
			@Pc(68) float local68 = local31 * (float) this.anInt6035;
			@Pc(75) float local75 = -local25 * (float) this.anInt6031;
			@Pc(82) float local82 = (float) this.anInt6031 * -local31;
			@Pc(89) float local89 = (float) this.anInt6037 * -local38;
			arg1 = arg1 + local68 + local56;
			arg3 = local82 + arg3 + local56;
			@Pc(108) float local108 = -local44 * (float) this.anInt6037;
			arg4 = local89 + local62 + arg4;
			arg2 = arg2 + local75 + local50;
			arg0 = local50 + arg0 + local62;
			arg5 = local68 + arg5 + local108;
		}
		local14 = arg2 + arg4 - arg0;
		local18 = arg5 + arg3 - arg1;
		this.aClass19_Sub2_Sub1_3.method4799(true);
		this.aClass39_Sub3_28.method5722();
		this.aClass39_Sub3_28.method5719(this.aClass19_Sub2_Sub1_3);
		this.aClass39_Sub3_28.method5699(1);
		this.aClass39_Sub3_28.method5750(1);
		this.aClass39_Sub3_28.method5719(local7);
		this.aClass39_Sub3_28.method5760(7681, 8448);
		this.aClass39_Sub3_28.method5709(34168, 0, 768);
		this.aClass39_Sub3_28.method5704(1);
		local25 = local7.aFloat54 / (float) local7.anInt2885;
		local31 = local7.aFloat53 / (float) local7.anInt2889;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass19_Sub2_Sub1_3.aFloat53);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg0), local7.aFloat53 - ((float) -arg8 + arg1) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg4 - (float) arg7), local7.aFloat53 - local31 * ((float) -arg8 + arg5));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass19_Sub2_Sub1_3.aFloat54, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (local14 - (float) arg7) * local25, local7.aFloat53 - (local18 - (float) arg8) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass19_Sub2_Sub1_3.aFloat54, this.aClass19_Sub2_Sub1_3.aFloat53);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg2) * local25, local7.aFloat53 - local31 * (arg3 - (float) arg8));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass39_Sub3_28.method5709(5890, 0, 768);
		this.aClass39_Sub3_28.method5699(0);
		this.aClass39_Sub3_28.method5719(null);
		this.aClass39_Sub3_28.method5750(0);
	}

	@OriginalMember(owner = "client!nk", name = "CA", descriptor = "(FFFFFFIII)V")
	@Override
	protected void CA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean447) {
			local10 = this.EA();
			local14 = this.ma();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			@Pc(27) float local27 = (arg3 - arg1) / local10;
			@Pc(33) float local33 = (arg4 - arg0) / local14;
			@Pc(40) float local40 = (arg5 - arg1) / local14;
			@Pc(46) float local46 = local33 * (float) this.anInt6032;
			@Pc(52) float local52 = (float) this.anInt6032 * local40;
			@Pc(58) float local58 = (float) this.anInt6035 * local20;
			@Pc(64) float local64 = (float) this.anInt6035 * local27;
			@Pc(71) float local71 = (float) this.anInt6031 * -local20;
			@Pc(78) float local78 = -local27 * (float) this.anInt6031;
			@Pc(85) float local85 = -local33 * (float) this.anInt6037;
			arg1 = local52 + arg1 + local64;
			arg0 = arg0 + local58 + local46;
			arg4 = local85 + arg4 + local58;
			arg3 = local78 + arg3 + local52;
			@Pc(116) float local116 = -local40 * (float) this.anInt6037;
			arg2 = local71 + arg2 + local46;
			arg5 = local116 + local64 + arg5;
		}
		local10 = arg4 + arg2 - arg0;
		this.aClass19_Sub2_Sub1_3.method4799(true);
		local14 = arg3 + arg5 - arg1;
		this.aClass39_Sub3_28.method5722();
		this.aClass39_Sub3_28.method5719(this.aClass19_Sub2_Sub1_3);
		this.aClass39_Sub3_28.method5704(arg8);
		this.aClass39_Sub3_28.method5699(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass19_Sub2_Sub1_3.aFloat53);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass19_Sub2_Sub1_3.aFloat54, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass19_Sub2_Sub1_3.aFloat54, this.aClass19_Sub2_Sub1_3.aFloat53);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "()I")
	@Override
	public int c() {
		return this.aClass19_Sub2_Sub1_3.anInt2885;
	}

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "(IIIIIII)V")
	@Override
	public void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg0 + arg2;
		this.aClass19_Sub2_Sub1_3.method4799(false);
		@Pc(19) int local19 = arg1 + arg3;
		this.aClass39_Sub3_28.method5722();
		this.aClass39_Sub3_28.method5719(this.aClass19_Sub2_Sub1_3);
		this.aClass39_Sub3_28.method5704(arg6);
		this.aClass39_Sub3_28.method5699(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass19_Sub2_Sub1_3.aBoolean232 && !this.aBoolean447) {
			@Pc(73) float local73 = (float) arg3 * this.aClass19_Sub2_Sub1_3.aFloat53 / (float) this.aClass19_Sub2_Sub1_3.anInt2889;
			@Pc(85) float local85 = this.aClass19_Sub2_Sub1_3.aFloat54 * (float) arg2 / (float) this.aClass19_Sub2_Sub1_3.anInt2885;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local73);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local19);
			OpenGL.glTexCoord2f(local85, 0.0F);
			OpenGL.glVertex2i(local9, local19);
			OpenGL.glTexCoord2f(local85, local73);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt6035, (float) this.anInt6032, 0.0F);
		@Pc(125) int local125 = this.EA();
		@Pc(128) int local128 = this.ma();
		@Pc(134) int local134 = this.aClass19_Sub2_Sub1_3.anInt2889 + arg1;
		OpenGL.glBegin(7);
		@Pc(138) int local138 = arg1;
		@Pc(147) int local147;
		while (local134 <= local19) {
			local147 = arg0 + this.aClass19_Sub2_Sub1_3.anInt2885;
			@Pc(149) int local149 = arg0;
			while (local147 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass19_Sub2_Sub1_3.aFloat53);
				OpenGL.glVertex2i(local149, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local149, local134);
				OpenGL.glTexCoord2f(this.aClass19_Sub2_Sub1_3.aFloat54, 0.0F);
				OpenGL.glVertex2i(local147, local134);
				OpenGL.glTexCoord2f(this.aClass19_Sub2_Sub1_3.aFloat54, this.aClass19_Sub2_Sub1_3.aFloat53);
				OpenGL.glVertex2i(local147, local138);
				local147 += local125;
				local149 += local125;
			}
			if (local9 > local149) {
				@Pc(219) float local219 = (float) (local9 - local149) * this.aClass19_Sub2_Sub1_3.aFloat54 / (float) this.aClass19_Sub2_Sub1_3.anInt2885;
				OpenGL.glTexCoord2f(0.0F, this.aClass19_Sub2_Sub1_3.aFloat53);
				OpenGL.glVertex2i(local149, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local149, local134);
				OpenGL.glTexCoord2f(local219, 0.0F);
				OpenGL.glVertex2i(local9, local134);
				OpenGL.glTexCoord2f(local219, this.aClass19_Sub2_Sub1_3.aFloat53);
				OpenGL.glVertex2i(local9, local138);
			}
			local138 += local128;
			local134 += local128;
		}
		if (local19 > local138) {
			@Pc(280) float local280 = (float) (local138 + this.aClass19_Sub2_Sub1_3.anInt2889 - local19) * this.aClass19_Sub2_Sub1_3.aFloat53 / (float) this.aClass19_Sub2_Sub1_3.anInt2889;
			@Pc(287) int local287 = arg0 + this.aClass19_Sub2_Sub1_3.anInt2885;
			local147 = arg0;
			while (local287 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass19_Sub2_Sub1_3.aFloat53);
				OpenGL.glVertex2i(local147, local138);
				OpenGL.glTexCoord2f(0.0F, local280);
				OpenGL.glVertex2i(local147, local19);
				OpenGL.glTexCoord2f(this.aClass19_Sub2_Sub1_3.aFloat54, local280);
				OpenGL.glVertex2i(local287, local19);
				OpenGL.glTexCoord2f(this.aClass19_Sub2_Sub1_3.aFloat54, this.aClass19_Sub2_Sub1_3.aFloat53);
				OpenGL.glVertex2i(local287, local138);
				local147 += local125;
				local287 += local125;
			}
			if (local147 < local9) {
				@Pc(352) float local352 = this.aClass19_Sub2_Sub1_3.aFloat54 * (float) (local9 - local147) / (float) this.aClass19_Sub2_Sub1_3.anInt2885;
				OpenGL.glTexCoord2f(0.0F, this.aClass19_Sub2_Sub1_3.aFloat53);
				OpenGL.glVertex2i(local147, local138);
				OpenGL.glTexCoord2f(0.0F, local280);
				OpenGL.glVertex2i(local147, local19);
				OpenGL.glTexCoord2f(local352, local280);
				OpenGL.glVertex2i(local9, local19);
				OpenGL.glTexCoord2f(local352, this.aClass19_Sub2_Sub1_3.aFloat53);
				OpenGL.glVertex2i(local9, local138);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!nk", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		return this.anInt6035 + this.aClass19_Sub2_Sub1_3.anInt2885 + this.anInt6031;
	}

	@OriginalMember(owner = "client!nk", name = "BA", descriptor = "(III)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass19_Sub2_Sub1_2 = Static81.method1585(arg0, this.aClass19_Sub2_Sub1_3.anInt2889, arg1, this.aClass19_Sub2_Sub1_3.anInt2885, this.aClass39_Sub3_28);
		this.anInt6024 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!nk", name = "la", descriptor = "()I")
	@Override
	public int la() {
		return this.aClass19_Sub2_Sub1_3.anInt2889;
	}

	@OriginalMember(owner = "client!nk", name = "ra", descriptor = "(IIIIIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass19_Sub2_Sub1_3.method4799(true);
		this.aClass39_Sub3_28.method5722();
		this.aClass39_Sub3_28.method5704(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean447) {
			@Pc(183) float local183 = (float) arg2 / (float) this.EA();
			@Pc(190) float local190 = (float) arg3 / (float) this.ma();
			@Pc(199) float local199 = (float) arg0 + (float) this.anInt6035 * local183;
			@Pc(208) float local208 = (float) this.anInt6032 * local190 + (float) arg1;
			@Pc(217) float local217 = (float) this.aClass19_Sub2_Sub1_3.anInt2885 * local183 + local199;
			@Pc(226) float local226 = local208 + (float) this.aClass19_Sub2_Sub1_3.anInt2889 * local190;
			if (this.aClass19_Sub2_Sub1_2 == null) {
				this.aClass39_Sub3_28.method5719(this.aClass19_Sub2_Sub1_3);
				this.aClass39_Sub3_28.method5699(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass19_Sub2_Sub1_3.aFloat53);
				OpenGL.glVertex2f(local199, local208);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local199, local226);
				OpenGL.glTexCoord2f(this.aClass19_Sub2_Sub1_3.aFloat54, 0.0F);
				OpenGL.glVertex2f(local217, local226);
				OpenGL.glTexCoord2f(this.aClass19_Sub2_Sub1_3.aFloat54, this.aClass19_Sub2_Sub1_3.aFloat53);
				OpenGL.glVertex2f(local217, local208);
				OpenGL.glEnd();
			} else {
				this.method5152(arg4);
				this.aClass19_Sub2_Sub1_2.method4799(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass19_Sub2_Sub1_3.aFloat53);
				OpenGL.glTexCoord2f(0.0F, this.aClass19_Sub2_Sub1_3.aFloat53);
				OpenGL.glVertex2f(local199, local208);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local199, local226);
				OpenGL.glMultiTexCoord2f(33985, this.aClass19_Sub2_Sub1_3.aFloat54, 0.0F);
				OpenGL.glTexCoord2f(this.aClass19_Sub2_Sub1_3.aFloat54, 0.0F);
				OpenGL.glVertex2f(local217, local226);
				OpenGL.glMultiTexCoord2f(33985, this.aClass19_Sub2_Sub1_3.aFloat54, this.aClass19_Sub2_Sub1_3.aFloat53);
				OpenGL.glTexCoord2f(this.aClass19_Sub2_Sub1_3.aFloat54, this.aClass19_Sub2_Sub1_3.aFloat53);
				OpenGL.glVertex2f(local217, local208);
				OpenGL.glEnd();
				this.method5153();
			}
		} else if (this.aClass19_Sub2_Sub1_2 == null) {
			this.aClass39_Sub3_28.method5719(this.aClass19_Sub2_Sub1_3);
			this.aClass39_Sub3_28.method5699(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass19_Sub2_Sub1_3.aFloat53);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass19_Sub2_Sub1_3.aFloat54, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass19_Sub2_Sub1_3.aFloat54, this.aClass19_Sub2_Sub1_3.aFloat53);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method5152(arg4);
			this.aClass19_Sub2_Sub1_2.method4799(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass19_Sub2_Sub1_3.aFloat53);
			OpenGL.glTexCoord2f(0.0F, this.aClass19_Sub2_Sub1_3.aFloat53);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass19_Sub2_Sub1_3.aFloat54, 0.0F);
			OpenGL.glTexCoord2f(this.aClass19_Sub2_Sub1_3.aFloat54, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass19_Sub2_Sub1_3.aFloat54, this.aClass19_Sub2_Sub1_3.aFloat53);
			OpenGL.glTexCoord2f(this.aClass19_Sub2_Sub1_3.aFloat54, this.aClass19_Sub2_Sub1_3.aFloat53);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method5153();
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)V")
	private void method5152(@OriginalArg(1) int arg0) {
		this.aClass39_Sub3_28.method5750(1);
		this.aClass39_Sub3_28.method5719(this.aClass19_Sub2_Sub1_3);
		this.aClass39_Sub3_28.method5760(this.aClass39_Sub3_28.method5690(arg0), 7681);
		this.aClass39_Sub3_28.method5709(34167, 1, 768);
		this.aClass39_Sub3_28.method5680(34168, 0);
		this.aClass39_Sub3_28.method5750(0);
		this.aClass39_Sub3_28.method5719(this.aClass19_Sub2_Sub1_2);
		this.aClass39_Sub3_28.method5760(34479, 7681);
		this.aClass39_Sub3_28.method5709(34166, 1, 768);
		if (this.anInt6024 == 0) {
			this.aClass39_Sub3_28.method5745(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt6024 == 1) {
			this.aClass39_Sub3_28.method5745(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt6024 == 2) {
			this.aClass39_Sub3_28.method5745(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt6024 == 3) {
			this.aClass39_Sub3_28.method5745(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILclient!pa;II)V")
	@Override
	public void method7345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class209 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class209_Sub1 local6 = (Class209_Sub1) arg2;
		@Pc(9) Class19_Sub2_Sub1 local9 = local6.aClass19_Sub2_Sub1_4;
		this.aClass19_Sub2_Sub1_3.method4799(false);
		this.aClass39_Sub3_28.method5722();
		this.aClass39_Sub3_28.method5719(this.aClass19_Sub2_Sub1_3);
		this.aClass39_Sub3_28.method5699(1);
		this.aClass39_Sub3_28.method5750(1);
		this.aClass39_Sub3_28.method5719(local9);
		this.aClass39_Sub3_28.method5760(7681, 8448);
		this.aClass39_Sub3_28.method5709(34168, 0, 768);
		this.aClass39_Sub3_28.method5704(1);
		@Pc(62) int local62 = arg1 + this.anInt6032;
		@Pc(67) int local67 = arg0 + this.anInt6035;
		@Pc(73) int local73 = this.aClass19_Sub2_Sub1_3.anInt2885 + local67;
		@Pc(80) int local80 = local62 + this.aClass19_Sub2_Sub1_3.anInt2889;
		@Pc(87) float local87 = local9.aFloat54 / (float) local9.anInt2885;
		@Pc(94) float local94 = local9.aFloat53 / (float) local9.anInt2889;
		@Pc(102) float local102 = local87 * (float) (local67 - arg3);
		@Pc(110) float local110 = (float) (local73 - arg3) * local87;
		@Pc(121) float local121 = local9.aFloat53 - (float) (local62 - arg4) * local94;
		@Pc(132) float local132 = local9.aFloat53 - local94 * (float) (local80 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass19_Sub2_Sub1_3.aFloat53);
		OpenGL.glMultiTexCoord2f(33985, local102, local121);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local132);
		OpenGL.glVertex2i(local67, local62 + this.aClass19_Sub2_Sub1_3.anInt2889);
		OpenGL.glMultiTexCoord2f(33984, this.aClass19_Sub2_Sub1_3.aFloat54, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local132);
		OpenGL.glVertex2i(local67 + this.aClass19_Sub2_Sub1_3.anInt2885, this.aClass19_Sub2_Sub1_3.anInt2889 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass19_Sub2_Sub1_3.aFloat54, this.aClass19_Sub2_Sub1_3.aFloat53);
		OpenGL.glMultiTexCoord2f(33985, local110, local121);
		OpenGL.glVertex2i(local67 + this.aClass19_Sub2_Sub1_3.anInt2885, local62);
		OpenGL.glEnd();
		this.aClass39_Sub3_28.method5709(5890, 0, 768);
		this.aClass39_Sub3_28.method5699(0);
		this.aClass39_Sub3_28.method5719(null);
		this.aClass39_Sub3_28.method5750(0);
	}

	@OriginalMember(owner = "client!nk", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		return this.aClass19_Sub2_Sub1_3.anInt2889 + this.anInt6032 + this.anInt6037;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	private void method5153() {
		this.aClass39_Sub3_28.method5750(1);
		this.aClass39_Sub3_28.method5719(null);
		this.aClass39_Sub3_28.method5760(8448, 8448);
		this.aClass39_Sub3_28.method5709(34168, 1, 768);
		this.aClass39_Sub3_28.method5680(5890, 0);
		this.aClass39_Sub3_28.method5750(0);
		this.aClass39_Sub3_28.method5709(34168, 1, 768);
	}

	@OriginalMember(owner = "client!nk", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6037 = arg3;
		this.anInt6035 = arg0;
		this.anInt6031 = arg2;
		this.anInt6032 = arg1;
		this.aBoolean447 = this.anInt6035 != 0 || this.anInt6032 != 0 || this.anInt6031 != 0 || this.anInt6037 != 0;
	}

	@OriginalMember(owner = "client!nk", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass19_Sub2_Sub1_3.method2692(arg1, arg3, arg2, arg0, arg5, arg4);
	}

	@OriginalMember(owner = "client!nk", name = "DA", descriptor = "(IIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass19_Sub2_Sub1_3.method4799(false);
		this.aClass39_Sub3_28.method5722();
		this.aClass39_Sub3_28.method5704(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt6035;
		@Pc(42) int local42 = arg1 + this.anInt6032;
		if (this.aClass19_Sub2_Sub1_2 == null) {
			this.aClass39_Sub3_28.method5719(this.aClass19_Sub2_Sub1_3);
			this.aClass39_Sub3_28.method5699(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass19_Sub2_Sub1_3.aFloat53);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass19_Sub2_Sub1_3.anInt2889 + local42);
			OpenGL.glTexCoord2f(this.aClass19_Sub2_Sub1_3.aFloat54, 0.0F);
			OpenGL.glVertex2i(this.aClass19_Sub2_Sub1_3.anInt2885 + local37, this.aClass19_Sub2_Sub1_3.anInt2889 + local42);
			OpenGL.glTexCoord2f(this.aClass19_Sub2_Sub1_3.aFloat54, this.aClass19_Sub2_Sub1_3.aFloat53);
			OpenGL.glVertex2i(local37 + this.aClass19_Sub2_Sub1_3.anInt2885, local42);
			OpenGL.glEnd();
			return;
		}
		this.method5152(arg2);
		this.aClass19_Sub2_Sub1_2.method4799(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass19_Sub2_Sub1_3.aFloat53);
		OpenGL.glTexCoord2f(0.0F, this.aClass19_Sub2_Sub1_3.aFloat53);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, local42 + this.aClass19_Sub2_Sub1_3.anInt2889);
		OpenGL.glMultiTexCoord2f(33985, this.aClass19_Sub2_Sub1_3.aFloat54, 0.0F);
		OpenGL.glTexCoord2f(this.aClass19_Sub2_Sub1_3.aFloat54, 0.0F);
		OpenGL.glVertex2i(this.aClass19_Sub2_Sub1_3.anInt2885 + local37, local42 - -this.aClass19_Sub2_Sub1_3.anInt2889);
		OpenGL.glMultiTexCoord2f(33985, this.aClass19_Sub2_Sub1_3.aFloat54, this.aClass19_Sub2_Sub1_3.aFloat53);
		OpenGL.glTexCoord2f(this.aClass19_Sub2_Sub1_3.aFloat54, this.aClass19_Sub2_Sub1_3.aFloat53);
		OpenGL.glVertex2i(local37 + this.aClass19_Sub2_Sub1_3.anInt2885, local42);
		OpenGL.glEnd();
		this.method5153();
	}
}
