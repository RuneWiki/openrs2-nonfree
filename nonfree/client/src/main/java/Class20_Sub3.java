import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rea")
public final class Class20_Sub3 extends Class20 {

	@OriginalMember(owner = "client!rea", name = "t", descriptor = "Lclient!cw;")
	private Class66_Sub1_Sub1 aClass66_Sub1_Sub1_4;

	@OriginalMember(owner = "client!rea", name = "d", descriptor = "I")
	private int anInt8936 = 0;

	@OriginalMember(owner = "client!rea", name = "k", descriptor = "I")
	private int anInt8942 = 0;

	@OriginalMember(owner = "client!rea", name = "i", descriptor = "Z")
	private boolean aBoolean630 = false;

	@OriginalMember(owner = "client!rea", name = "v", descriptor = "I")
	private int anInt8952 = 0;

	@OriginalMember(owner = "client!rea", name = "j", descriptor = "I")
	private int anInt8941 = 0;

	@OriginalMember(owner = "client!rea", name = "m", descriptor = "I")
	private int anInt8944 = 0;

	@OriginalMember(owner = "client!rea", name = "B", descriptor = "Lclient!qfa;")
	private final Class137_Sub3 aClass137_Sub3_38;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "Lclient!cw;")
	private final Class66_Sub1_Sub1 aClass66_Sub1_Sub1_3;

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lclient!qfa;IIZ)V")
	public Class20_Sub3(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass137_Sub3_38 = arg0;
		this.aClass66_Sub1_Sub1_3 = Static132.method2131(arg0, arg3 ? 6408 : 6407, arg2, arg1);
	}

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lclient!qfa;IIII)V")
	public Class20_Sub3(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass137_Sub3_38 = arg0;
		this.aClass66_Sub1_Sub1_3 = Static175.method2818(arg3, arg4, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lclient!qfa;II[III)V")
	public Class20_Sub3(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass137_Sub3_38 = arg0;
		this.aClass66_Sub1_Sub1_3 = Static581.method8292(arg5, arg2, arg4, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method7404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub3 local6 = (Class1_Sub3) arg2;
		@Pc(9) Class66_Sub1_Sub1 local9 = local6.aClass66_Sub1_Sub1_5;
		this.aClass66_Sub1_Sub1_3.method6848(false);
		this.aClass137_Sub3_38.method7091();
		this.aClass137_Sub3_38.method7090(this.aClass66_Sub1_Sub1_3);
		this.aClass137_Sub3_38.method7077(1);
		this.aClass137_Sub3_38.method7095(1);
		this.aClass137_Sub3_38.method7090(local9);
		this.aClass137_Sub3_38.method7084(8448, 7681);
		this.aClass137_Sub3_38.method7071(34168, 768, 0);
		this.aClass137_Sub3_38.method7082(1);
		@Pc(62) int local62 = arg0 + this.anInt8944;
		@Pc(67) int local67 = arg1 + this.anInt8941;
		@Pc(74) int local74 = local62 + this.aClass66_Sub1_Sub1_3.anInt1954;
		@Pc(80) int local80 = this.aClass66_Sub1_Sub1_3.anInt1950 + local67;
		@Pc(87) float local87 = local9.aFloat52 / (float) local9.anInt1954;
		@Pc(94) float local94 = local9.aFloat53 / (float) local9.anInt1950;
		@Pc(101) float local101 = local87 * (float) (local62 - arg3);
		@Pc(108) float local108 = (float) (local74 - arg3) * local87;
		@Pc(119) float local119 = local9.aFloat53 - local94 * (float) (local67 - arg4);
		@Pc(131) float local131 = local9.aFloat53 - local94 * (float) (local80 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass66_Sub1_Sub1_3.aFloat53);
		OpenGL.glMultiTexCoord2f(33985, local101, local119);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local131);
		OpenGL.glVertex2i(local62, this.aClass66_Sub1_Sub1_3.anInt1950 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass66_Sub1_Sub1_3.aFloat52, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local108, local131);
		OpenGL.glVertex2i(local62 + this.aClass66_Sub1_Sub1_3.anInt1954, local67 - -this.aClass66_Sub1_Sub1_3.anInt1950);
		OpenGL.glMultiTexCoord2f(33984, this.aClass66_Sub1_Sub1_3.aFloat52, this.aClass66_Sub1_Sub1_3.aFloat53);
		OpenGL.glMultiTexCoord2f(33985, local108, local119);
		OpenGL.glVertex2i(this.aClass66_Sub1_Sub1_3.anInt1954 + local62, local67);
		OpenGL.glEnd();
		this.aClass137_Sub3_38.method7071(5890, 768, 0);
		this.aClass137_Sub3_38.method7077(0);
		this.aClass137_Sub3_38.method7090((Class66) null);
		this.aClass137_Sub3_38.method7095(0);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "([I)V")
	@Override
	public void method7411(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt8936;
		arg0[1] = this.anInt8941;
		arg0[0] = this.anInt8944;
		arg0[3] = this.anInt8942;
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(II)V")
	private void method7418(@OriginalArg(0) int arg0) {
		this.aClass137_Sub3_38.method7095(1);
		this.aClass137_Sub3_38.method7090(this.aClass66_Sub1_Sub1_3);
		this.aClass137_Sub3_38.method7084(7681, this.aClass137_Sub3_38.method7066(arg0));
		this.aClass137_Sub3_38.method7071(34167, 768, 1);
		this.aClass137_Sub3_38.method7027(34168, 0);
		this.aClass137_Sub3_38.method7095(0);
		this.aClass137_Sub3_38.method7090(this.aClass66_Sub1_Sub1_4);
		this.aClass137_Sub3_38.method7084(7681, 34479);
		this.aClass137_Sub3_38.method7071(34166, 768, 1);
		if (this.anInt8952 == 0) {
			this.aClass137_Sub3_38.method7051(0.0F, 1.0F, 0.5F, 0.5F);
		} else if (this.anInt8952 == 1) {
			this.aClass137_Sub3_38.method7051(0.0F, 0.5F, 1.0F, 0.5F);
		} else if (this.anInt8952 == 2) {
			this.aClass137_Sub3_38.method7051(0.0F, 0.5F, 0.5F, 1.0F);
		} else if (this.anInt8952 == 3) {
			this.aClass137_Sub3_38.method7051(0.0F, 128.5F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method7417(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class66_Sub1_Sub1 local7 = ((Class1_Sub3) arg6).aClass66_Sub1_Sub1_5;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(32) float local32;
		if (this.aBoolean630) {
			local14 = (float) this.method7394();
			local18 = (float) this.method7408();
			local25 = (arg2 - arg0) / local14;
			local32 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = local38 * (float) this.anInt8941;
			@Pc(56) float local56 = (float) this.anInt8941 * local44;
			@Pc(62) float local62 = (float) this.anInt8944 * local25;
			@Pc(68) float local68 = (float) this.anInt8944 * local32;
			@Pc(75) float local75 = (float) this.anInt8936 * -local25;
			@Pc(82) float local82 = (float) this.anInt8936 * -local32;
			@Pc(89) float local89 = -local38 * (float) this.anInt8942;
			arg2 = local75 + arg2 + local50;
			arg4 = local89 + arg4 + local62;
			arg3 = local82 + arg3 + local56;
			arg1 = local56 + arg1 + local68;
			@Pc(120) float local120 = -local44 * (float) this.anInt8942;
			arg0 = local50 + arg0 + local62;
			arg5 = local68 + arg5 + local120;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass66_Sub1_Sub1_3.method6848(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass137_Sub3_38.method7091();
		this.aClass137_Sub3_38.method7090(this.aClass66_Sub1_Sub1_3);
		this.aClass137_Sub3_38.method7077(1);
		this.aClass137_Sub3_38.method7095(1);
		this.aClass137_Sub3_38.method7090(local7);
		this.aClass137_Sub3_38.method7084(8448, 7681);
		this.aClass137_Sub3_38.method7071(34168, 768, 0);
		this.aClass137_Sub3_38.method7082(1);
		local25 = local7.aFloat52 / (float) local7.anInt1954;
		local32 = local7.aFloat53 / (float) local7.anInt1950;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass66_Sub1_Sub1_3.aFloat53);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg0), local7.aFloat53 - local32 * ((float) -arg8 + arg1));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg4) * local25, local7.aFloat53 - ((float) -arg8 + arg5) * local32);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass66_Sub1_Sub1_3.aFloat52, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + local14) * local25, local7.aFloat53 - local32 * ((float) -arg8 + local18));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass66_Sub1_Sub1_3.aFloat52, this.aClass66_Sub1_Sub1_3.aFloat53);
		OpenGL.glMultiTexCoord2f(33985, (arg2 - (float) arg7) * local25, local7.aFloat53 - (arg3 - (float) arg8) * local32);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass137_Sub3_38.method7071(5890, 768, 0);
		this.aClass137_Sub3_38.method7077(0);
		this.aClass137_Sub3_38.method7090((Class66) null);
		this.aClass137_Sub3_38.method7095(0);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method7397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass66_Sub1_Sub1_3.method6848(true);
		this.aClass137_Sub3_38.method7091();
		this.aClass137_Sub3_38.method7082(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean630) {
			@Pc(191) float local191 = (float) arg2 / (float) this.method7394();
			@Pc(198) float local198 = (float) arg3 / (float) this.method7408();
			@Pc(207) float local207 = (float) arg0 + (float) this.anInt8944 * local191;
			@Pc(216) float local216 = (float) arg1 + (float) this.anInt8941 * local198;
			@Pc(225) float local225 = (float) this.aClass66_Sub1_Sub1_3.anInt1954 * local191 + local207;
			@Pc(234) float local234 = local216 + (float) this.aClass66_Sub1_Sub1_3.anInt1950 * local198;
			if (this.aClass66_Sub1_Sub1_4 == null) {
				this.aClass137_Sub3_38.method7090(this.aClass66_Sub1_Sub1_3);
				this.aClass137_Sub3_38.method7077(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass66_Sub1_Sub1_3.aFloat53);
				OpenGL.glVertex2f(local207, local216);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local207, local234);
				OpenGL.glTexCoord2f(this.aClass66_Sub1_Sub1_3.aFloat52, 0.0F);
				OpenGL.glVertex2f(local225, local234);
				OpenGL.glTexCoord2f(this.aClass66_Sub1_Sub1_3.aFloat52, this.aClass66_Sub1_Sub1_3.aFloat53);
				OpenGL.glVertex2f(local225, local216);
				OpenGL.glEnd();
			} else {
				this.method7418(arg4);
				this.aClass66_Sub1_Sub1_4.method6848(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass66_Sub1_Sub1_3.aFloat53);
				OpenGL.glTexCoord2f(0.0F, this.aClass66_Sub1_Sub1_3.aFloat53);
				OpenGL.glVertex2f(local207, local216);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local207, local234);
				OpenGL.glMultiTexCoord2f(33985, this.aClass66_Sub1_Sub1_3.aFloat52, 0.0F);
				OpenGL.glTexCoord2f(this.aClass66_Sub1_Sub1_3.aFloat52, 0.0F);
				OpenGL.glVertex2f(local225, local234);
				OpenGL.glMultiTexCoord2f(33985, this.aClass66_Sub1_Sub1_3.aFloat52, this.aClass66_Sub1_Sub1_3.aFloat53);
				OpenGL.glTexCoord2f(this.aClass66_Sub1_Sub1_3.aFloat52, this.aClass66_Sub1_Sub1_3.aFloat53);
				OpenGL.glVertex2f(local225, local216);
				OpenGL.glEnd();
				this.method7419();
			}
		} else if (this.aClass66_Sub1_Sub1_4 == null) {
			this.aClass137_Sub3_38.method7090(this.aClass66_Sub1_Sub1_3);
			this.aClass137_Sub3_38.method7077(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass66_Sub1_Sub1_3.aFloat53);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass66_Sub1_Sub1_3.aFloat52, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass66_Sub1_Sub1_3.aFloat52, this.aClass66_Sub1_Sub1_3.aFloat53);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method7418(arg4);
			this.aClass66_Sub1_Sub1_4.method6848(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass66_Sub1_Sub1_3.aFloat53);
			OpenGL.glTexCoord2f(0.0F, this.aClass66_Sub1_Sub1_3.aFloat53);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass66_Sub1_Sub1_3.aFloat52, 0.0F);
			OpenGL.glTexCoord2f(this.aClass66_Sub1_Sub1_3.aFloat52, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass66_Sub1_Sub1_3.aFloat52, this.aClass66_Sub1_Sub1_3.aFloat53);
			OpenGL.glTexCoord2f(this.aClass66_Sub1_Sub1_3.aFloat52, this.aClass66_Sub1_Sub1_3.aFloat53);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method7419();
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "()I")
	@Override
	public int method7393() {
		return this.aClass66_Sub1_Sub1_3.anInt1950;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass137_Sub3_38.aBoolean597) {
			this.aClass66_Sub1_Sub1_3.method1671(arg4, arg2, arg1, arg3, arg0, arg5);
			return;
		}
		@Pc(25) int[] local25 = this.aClass137_Sub3_38.na(arg4, arg5, arg2, arg3);
		if (local25 != null) {
			for (@Pc(29) int local29 = 0; local29 < local25.length; local29++) {
				local25[local29] |= 0xFF000000;
			}
			this.method7420(arg0, arg1, arg2, arg3, local25, arg2);
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method7403(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean630) {
			local6 = (float) this.method7394();
			local10 = (float) this.method7408();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(36) float local36 = (arg5 - arg1) / local10;
			@Pc(42) float local42 = local29 * (float) this.anInt8941;
			@Pc(48) float local48 = (float) this.anInt8941 * local36;
			@Pc(54) float local54 = local17 * (float) this.anInt8944;
			@Pc(60) float local60 = (float) this.anInt8944 * local23;
			@Pc(67) float local67 = (float) this.anInt8936 * -local17;
			@Pc(74) float local74 = (float) this.anInt8936 * -local23;
			@Pc(81) float local81 = -local29 * (float) this.anInt8942;
			arg4 = local81 + local54 + arg4;
			arg3 = local48 + local74 + arg3;
			arg0 = arg0 + local54 + local42;
			@Pc(106) float local106 = -local36 * (float) this.anInt8942;
			arg2 = local42 + arg2 + local67;
			arg1 = local48 + local60 + arg1;
			arg5 = local106 + arg5 + local60;
		}
		local6 = arg2 + arg4 - arg0;
		local10 = arg3 + arg5 - arg1;
		this.aClass66_Sub1_Sub1_3.method6848(true);
		this.aClass137_Sub3_38.method7091();
		this.aClass137_Sub3_38.method7090(this.aClass66_Sub1_Sub1_3);
		this.aClass137_Sub3_38.method7082(1);
		this.aClass137_Sub3_38.method7077(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass66_Sub1_Sub1_3.aFloat53);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass66_Sub1_Sub1_3.aFloat52, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass66_Sub1_Sub1_3.aFloat52, this.aClass66_Sub1_Sub1_3.aFloat53);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(B)V")
	private void method7419() {
		this.aClass137_Sub3_38.method7095(1);
		this.aClass137_Sub3_38.method7090((Class66) null);
		this.aClass137_Sub3_38.method7084(8448, 8448);
		this.aClass137_Sub3_38.method7071(34168, 768, 1);
		this.aClass137_Sub3_38.method7027(5890, 0);
		this.aClass137_Sub3_38.method7095(0);
		this.aClass137_Sub3_38.method7071(34168, 768, 1);
	}

	@OriginalMember(owner = "client!rea", name = "c", descriptor = "()I")
	@Override
	public int method7408() {
		return this.aClass66_Sub1_Sub1_3.anInt1950 + this.anInt8941 + this.anInt8942;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(III)V")
	@Override
	public void method7410(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass66_Sub1_Sub1_4 = Static175.method2818(this.aClass66_Sub1_Sub1_3.anInt1954, this.aClass66_Sub1_Sub1_3.anInt1950, this.aClass137_Sub3_38, 0, 0);
		this.anInt8952 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(IIII)V")
	@Override
	public void method7409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8944 = arg0;
		this.anInt8941 = arg1;
		this.anInt8942 = arg3;
		this.anInt8936 = arg2;
		this.aBoolean630 = this.anInt8944 != 0 || this.anInt8941 != 0 || this.anInt8936 != 0 || this.anInt8942 != 0;
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "()I")
	@Override
	public int method7394() {
		return this.aClass66_Sub1_Sub1_3.anInt1954 + this.anInt8944 + this.anInt8936;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method7402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass66_Sub1_Sub1_3.method6848(false);
		this.aClass137_Sub3_38.method7091();
		this.aClass137_Sub3_38.method7082(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt8941;
		@Pc(42) int local42 = arg0 + this.anInt8944;
		if (this.aClass66_Sub1_Sub1_4 == null) {
			this.aClass137_Sub3_38.method7090(this.aClass66_Sub1_Sub1_3);
			this.aClass137_Sub3_38.method7077(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass66_Sub1_Sub1_3.aFloat53);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, local37 + this.aClass66_Sub1_Sub1_3.anInt1950);
			OpenGL.glTexCoord2f(this.aClass66_Sub1_Sub1_3.aFloat52, 0.0F);
			OpenGL.glVertex2i(this.aClass66_Sub1_Sub1_3.anInt1954 + local42, this.aClass66_Sub1_Sub1_3.anInt1950 + local37);
			OpenGL.glTexCoord2f(this.aClass66_Sub1_Sub1_3.aFloat52, this.aClass66_Sub1_Sub1_3.aFloat53);
			OpenGL.glVertex2i(local42 + this.aClass66_Sub1_Sub1_3.anInt1954, local37);
			OpenGL.glEnd();
			return;
		}
		this.method7418(arg2);
		this.aClass66_Sub1_Sub1_4.method6848(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass66_Sub1_Sub1_3.aFloat53);
		OpenGL.glTexCoord2f(0.0F, this.aClass66_Sub1_Sub1_3.aFloat53);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, this.aClass66_Sub1_Sub1_3.anInt1950 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass66_Sub1_Sub1_3.aFloat52, 0.0F);
		OpenGL.glTexCoord2f(this.aClass66_Sub1_Sub1_3.aFloat52, 0.0F);
		OpenGL.glVertex2i(this.aClass66_Sub1_Sub1_3.anInt1954 + local42, this.aClass66_Sub1_Sub1_3.anInt1950 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass66_Sub1_Sub1_3.aFloat52, this.aClass66_Sub1_Sub1_3.aFloat53);
		OpenGL.glTexCoord2f(this.aClass66_Sub1_Sub1_3.aFloat52, this.aClass66_Sub1_Sub1_3.aFloat53);
		OpenGL.glVertex2i(local42 + this.aClass66_Sub1_Sub1_3.anInt1954, local37);
		OpenGL.glEnd();
		this.method7419();
	}

	@OriginalMember(owner = "client!rea", name = "d", descriptor = "()I")
	@Override
	public int method7412() {
		return this.aClass66_Sub1_Sub1_3.anInt1954;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIII[III)V")
	private void method7420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass66_Sub1_Sub1_3.method1670(arg5, arg4, arg0, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method7406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		this.aClass66_Sub1_Sub1_3.method6848(false);
		@Pc(18) int local18 = arg3 + arg1;
		this.aClass137_Sub3_38.method7091();
		this.aClass137_Sub3_38.method7090(this.aClass66_Sub1_Sub1_3);
		this.aClass137_Sub3_38.method7082(arg6);
		this.aClass137_Sub3_38.method7077(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass66_Sub1_Sub1_3.aBoolean165 && !this.aBoolean630) {
			@Pc(72) float local72 = this.aClass66_Sub1_Sub1_3.aFloat53 * (float) arg3 / (float) this.aClass66_Sub1_Sub1_3.anInt1950;
			@Pc(84) float local84 = this.aClass66_Sub1_Sub1_3.aFloat52 * (float) arg2 / (float) this.aClass66_Sub1_Sub1_3.anInt1954;
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
		OpenGL.glTranslatef((float) this.anInt8944, (float) this.anInt8941, 0.0F);
		@Pc(124) int local124 = this.method7394();
		@Pc(127) int local127 = this.method7408();
		@Pc(133) int local133 = arg1 + this.aClass66_Sub1_Sub1_3.anInt1950;
		OpenGL.glBegin(7);
		@Pc(137) int local137 = arg1;
		@Pc(146) int local146;
		while (local133 <= local18) {
			local146 = arg0 + this.aClass66_Sub1_Sub1_3.anInt1954;
			@Pc(148) int local148 = arg0;
			while (local146 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass66_Sub1_Sub1_3.aFloat53);
				OpenGL.glVertex2i(local148, local137);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local133);
				OpenGL.glTexCoord2f(this.aClass66_Sub1_Sub1_3.aFloat52, 0.0F);
				OpenGL.glVertex2i(local146, local133);
				OpenGL.glTexCoord2f(this.aClass66_Sub1_Sub1_3.aFloat52, this.aClass66_Sub1_Sub1_3.aFloat53);
				OpenGL.glVertex2i(local146, local137);
				local148 += local124;
				local146 += local124;
			}
			if (local9 > local148) {
				@Pc(215) float local215 = this.aClass66_Sub1_Sub1_3.aFloat52 * (float) (local9 - local148) / (float) this.aClass66_Sub1_Sub1_3.anInt1954;
				OpenGL.glTexCoord2f(0.0F, this.aClass66_Sub1_Sub1_3.aFloat53);
				OpenGL.glVertex2i(local148, local137);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local133);
				OpenGL.glTexCoord2f(local215, 0.0F);
				OpenGL.glVertex2i(local9, local133);
				OpenGL.glTexCoord2f(local215, this.aClass66_Sub1_Sub1_3.aFloat53);
				OpenGL.glVertex2i(local9, local137);
			}
			local137 += local127;
			local133 += local127;
		}
		if (local137 < local18) {
			@Pc(279) float local279 = (float) (local137 + this.aClass66_Sub1_Sub1_3.anInt1950 - local18) * this.aClass66_Sub1_Sub1_3.aFloat53 / (float) this.aClass66_Sub1_Sub1_3.anInt1950;
			@Pc(285) int local285 = this.aClass66_Sub1_Sub1_3.anInt1954 + arg0;
			local146 = arg0;
			while (local285 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass66_Sub1_Sub1_3.aFloat53);
				OpenGL.glVertex2i(local146, local137);
				OpenGL.glTexCoord2f(0.0F, local279);
				OpenGL.glVertex2i(local146, local18);
				OpenGL.glTexCoord2f(this.aClass66_Sub1_Sub1_3.aFloat52, local279);
				OpenGL.glVertex2i(local285, local18);
				OpenGL.glTexCoord2f(this.aClass66_Sub1_Sub1_3.aFloat52, this.aClass66_Sub1_Sub1_3.aFloat53);
				OpenGL.glVertex2i(local285, local137);
				local285 += local124;
				local146 += local124;
			}
			if (local9 > local146) {
				@Pc(354) float local354 = (float) (local9 - local146) * this.aClass66_Sub1_Sub1_3.aFloat52 / (float) this.aClass66_Sub1_Sub1_3.anInt1954;
				OpenGL.glTexCoord2f(0.0F, this.aClass66_Sub1_Sub1_3.aFloat53);
				OpenGL.glVertex2i(local146, local137);
				OpenGL.glTexCoord2f(0.0F, local279);
				OpenGL.glVertex2i(local146, local18);
				OpenGL.glTexCoord2f(local354, local279);
				OpenGL.glVertex2i(local9, local18);
				OpenGL.glTexCoord2f(local354, this.aClass66_Sub1_Sub1_3.aFloat53);
				OpenGL.glVertex2i(local9, local137);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}
}
