import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class143_Sub2 extends Class143 {

	@OriginalMember(owner = "client!vm", name = "l", descriptor = "Lclient!oi;")
	private Class3_Sub2_Sub1 aClass3_Sub2_Sub1_4;

	@OriginalMember(owner = "client!vm", name = "k", descriptor = "Z")
	private boolean aBoolean487 = false;

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
	private int anInt6955 = 0;

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
	private int anInt6956 = 0;

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
	private int anInt6961 = 0;

	@OriginalMember(owner = "client!vm", name = "p", descriptor = "I")
	private int anInt6965 = 0;

	@OriginalMember(owner = "client!vm", name = "z", descriptor = "I")
	private int anInt6974 = 0;

	@OriginalMember(owner = "client!vm", name = "o", descriptor = "Lclient!kd;")
	private final Class39_Sub2 aClass39_Sub2_42;

	@OriginalMember(owner = "client!vm", name = "y", descriptor = "Lclient!oi;")
	private final Class3_Sub2_Sub1 aClass3_Sub2_Sub1_5;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!kd;IIII)V")
	public Class143_Sub2(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass39_Sub2_42 = arg0;
		this.aClass3_Sub2_Sub1_5 = Static265.method3926(arg4, arg2, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!kd;II[III)V")
	public Class143_Sub2(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass39_Sub2_42 = arg0;
		this.aClass3_Sub2_Sub1_5 = Static77.method1520(arg2, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!vm", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		return this.aClass3_Sub2_Sub1_5.anInt5012;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected void a(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean487) {
			local6 = this.j();
			local10 = this.T();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(24) float local24 = (arg3 - arg1) / local6;
			@Pc(31) float local31 = (arg4 - arg0) / local10;
			@Pc(37) float local37 = (arg5 - arg1) / local10;
			@Pc(43) float local43 = local31 * (float) this.anInt6956;
			@Pc(49) float local49 = (float) this.anInt6956 * local37;
			@Pc(55) float local55 = local17 * (float) this.anInt6961;
			@Pc(61) float local61 = local24 * (float) this.anInt6961;
			@Pc(68) float local68 = -local17 * (float) this.anInt6955;
			@Pc(75) float local75 = (float) this.anInt6955 * -local24;
			@Pc(82) float local82 = (float) this.anInt6974 * -local31;
			arg0 = local55 + arg0 + local43;
			arg1 = local61 + arg1 + local49;
			arg3 = arg3 + local75 + local49;
			@Pc(107) float local107 = (float) this.anInt6974 * -local37;
			arg2 = local43 + arg2 + local68;
			arg4 = local55 + arg4 + local82;
			arg5 = local107 + local61 + arg5;
		}
		local6 = arg4 + arg2 - arg0;
		this.aClass3_Sub2_Sub1_5.method4146(true);
		local10 = arg5 + arg3 - arg1;
		this.aClass39_Sub2_42.method3228();
		this.aClass39_Sub2_42.method3203(this.aClass3_Sub2_Sub1_5);
		this.aClass39_Sub2_42.method3205(arg8);
		this.aClass39_Sub2_42.method3162(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_5.aFloat72);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat73, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat73, this.aClass3_Sub2_Sub1_5.aFloat72);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)V")
	private void method5726() {
		this.aClass39_Sub2_42.method3221(1);
		this.aClass39_Sub2_42.method3203(null);
		this.aClass39_Sub2_42.method3156(8448, 8448);
		this.aClass39_Sub2_42.method3180(768, 1, 34168);
		this.aClass39_Sub2_42.method3210(5890, 0);
		this.aClass39_Sub2_42.method3221(0);
		this.aClass39_Sub2_42.method3180(768, 1, 34168);
	}

	@OriginalMember(owner = "client!vm", name = "JA", descriptor = "(IIIIIII)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		@Pc(14) int local14 = arg1 + arg3;
		this.aClass3_Sub2_Sub1_5.method4146(false);
		this.aClass39_Sub2_42.method3228();
		this.aClass39_Sub2_42.method3203(this.aClass3_Sub2_Sub1_5);
		this.aClass39_Sub2_42.method3205(arg6);
		this.aClass39_Sub2_42.method3162(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass3_Sub2_Sub1_5.aBoolean341 && !this.aBoolean487) {
			@Pc(348) float local348 = (float) arg3 * this.aClass3_Sub2_Sub1_5.aFloat72 / (float) this.aClass3_Sub2_Sub1_5.anInt5012;
			@Pc(360) float local360 = (float) arg2 * this.aClass3_Sub2_Sub1_5.aFloat73 / (float) this.aClass3_Sub2_Sub1_5.anInt5014;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local348);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local14);
			OpenGL.glTexCoord2f(local360, 0.0F);
			OpenGL.glVertex2i(local9, local14);
			OpenGL.glTexCoord2f(local360, local348);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt6961, (float) this.anInt6956, 0.0F);
		@Pc(73) int local73 = this.j();
		@Pc(76) int local76 = this.T();
		@Pc(82) int local82 = this.aClass3_Sub2_Sub1_5.anInt5012 + arg1;
		OpenGL.glBegin(7);
		@Pc(86) int local86 = arg1;
		@Pc(95) int local95;
		while (local14 >= local82) {
			local95 = arg0 + this.aClass3_Sub2_Sub1_5.anInt5014;
			@Pc(97) int local97 = arg0;
			while (local9 >= local95) {
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_5.aFloat72);
				OpenGL.glVertex2i(local97, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local82);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat73, 0.0F);
				OpenGL.glVertex2i(local95, local82);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat73, this.aClass3_Sub2_Sub1_5.aFloat72);
				OpenGL.glVertex2i(local95, local86);
				local95 += local73;
				local97 += local73;
			}
			if (local9 > local97) {
				@Pc(168) float local168 = (float) (local9 - local97) * this.aClass3_Sub2_Sub1_5.aFloat73 / (float) this.aClass3_Sub2_Sub1_5.anInt5014;
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_5.aFloat72);
				OpenGL.glVertex2i(local97, local86);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local97, local82);
				OpenGL.glTexCoord2f(local168, 0.0F);
				OpenGL.glVertex2i(local9, local82);
				OpenGL.glTexCoord2f(local168, this.aClass3_Sub2_Sub1_5.aFloat72);
				OpenGL.glVertex2i(local9, local86);
			}
			local86 += local76;
			local82 += local76;
		}
		if (local14 > local86) {
			@Pc(230) float local230 = this.aClass3_Sub2_Sub1_5.aFloat72 * (float) (local86 + this.aClass3_Sub2_Sub1_5.anInt5012 - local14) / (float) this.aClass3_Sub2_Sub1_5.anInt5012;
			@Pc(236) int local236 = this.aClass3_Sub2_Sub1_5.anInt5014 + arg0;
			local95 = arg0;
			while (local236 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_5.aFloat72);
				OpenGL.glVertex2i(local95, local86);
				OpenGL.glTexCoord2f(0.0F, local230);
				OpenGL.glVertex2i(local95, local14);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat73, local230);
				OpenGL.glVertex2i(local236, local14);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat73, this.aClass3_Sub2_Sub1_5.aFloat72);
				OpenGL.glVertex2i(local236, local86);
				local236 += local73;
				local95 += local73;
			}
			if (local95 < local9) {
				@Pc(305) float local305 = this.aClass3_Sub2_Sub1_5.aFloat73 * (float) (local9 - local95) / (float) this.aClass3_Sub2_Sub1_5.anInt5014;
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_5.aFloat72);
				OpenGL.glVertex2i(local95, local86);
				OpenGL.glTexCoord2f(0.0F, local230);
				OpenGL.glVertex2i(local95, local14);
				OpenGL.glTexCoord2f(local305, local230);
				OpenGL.glVertex2i(local9, local14);
				OpenGL.glTexCoord2f(local305, this.aClass3_Sub2_Sub1_5.aFloat72);
				OpenGL.glVertex2i(local9, local86);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "()I")
	@Override
	public int j() {
		return this.anInt6955 + this.aClass3_Sub2_Sub1_5.anInt5014 + this.anInt6961;
	}

	@OriginalMember(owner = "client!vm", name = "t", descriptor = "(IIIIII)V")
	@Override
	public void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass3_Sub2_Sub1_5.method4161(arg1, arg5, arg2, arg3, arg0, arg4);
	}

	@OriginalMember(owner = "client!vm", name = "MA", descriptor = "(IIII)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6956 = arg1;
		this.anInt6974 = arg3;
		this.anInt6955 = arg2;
		this.anInt6961 = arg0;
		this.aBoolean487 = this.anInt6961 != 0 || this.anInt6956 != 0 || this.anInt6955 != 0 || this.anInt6974 != 0;
	}

	@OriginalMember(owner = "client!vm", name = "r", descriptor = "(IIIII)V")
	@Override
	public void r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass3_Sub2_Sub1_5.method4146(false);
		this.aClass39_Sub2_42.method3228();
		this.aClass39_Sub2_42.method3205(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt6961;
		@Pc(42) int local42 = arg1 + this.anInt6956;
		if (this.aClass3_Sub2_Sub1_4 == null) {
			this.aClass39_Sub2_42.method3203(this.aClass3_Sub2_Sub1_5);
			this.aClass39_Sub2_42.method3162(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_5.aFloat72);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass3_Sub2_Sub1_5.anInt5012 + local42);
			OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat73, 0.0F);
			OpenGL.glVertex2i(this.aClass3_Sub2_Sub1_5.anInt5014 + local37, local42 + this.aClass3_Sub2_Sub1_5.anInt5012);
			OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat73, this.aClass3_Sub2_Sub1_5.aFloat72);
			OpenGL.glVertex2i(local37 + this.aClass3_Sub2_Sub1_5.anInt5014, local42);
			OpenGL.glEnd();
			return;
		}
		this.method5729(arg2);
		this.aClass3_Sub2_Sub1_4.method4146(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass3_Sub2_Sub1_5.aFloat72);
		OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_5.aFloat72);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, this.aClass3_Sub2_Sub1_5.anInt5012 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub2_Sub1_5.aFloat73, 0.0F);
		OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat73, 0.0F);
		OpenGL.glVertex2i(this.aClass3_Sub2_Sub1_5.anInt5014 + local37, this.aClass3_Sub2_Sub1_5.anInt5012 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub2_Sub1_5.aFloat73, this.aClass3_Sub2_Sub1_5.aFloat72);
		OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat73, this.aClass3_Sub2_Sub1_5.aFloat72);
		OpenGL.glVertex2i(local37 + this.aClass3_Sub2_Sub1_5.anInt5014, local42);
		OpenGL.glEnd();
		this.method5726();
	}

	@OriginalMember(owner = "client!vm", name = "la", descriptor = "()I")
	@Override
	public int la() {
		return this.aClass3_Sub2_Sub1_5.anInt5014;
	}

	@OriginalMember(owner = "client!vm", name = "s", descriptor = "(IIIIIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass3_Sub2_Sub1_5.method4146(true);
		this.aClass39_Sub2_42.method3228();
		this.aClass39_Sub2_42.method3205(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean487) {
			@Pc(181) float local181 = (float) arg2 / (float) this.j();
			@Pc(188) float local188 = (float) arg3 / (float) this.T();
			@Pc(197) float local197 = (float) this.anInt6961 * local181 + (float) arg0;
			@Pc(206) float local206 = (float) arg1 + local188 * (float) this.anInt6956;
			@Pc(215) float local215 = local197 + local181 * (float) this.aClass3_Sub2_Sub1_5.anInt5014;
			@Pc(224) float local224 = (float) this.aClass3_Sub2_Sub1_5.anInt5012 * local188 + local206;
			if (this.aClass3_Sub2_Sub1_4 == null) {
				this.aClass39_Sub2_42.method3203(this.aClass3_Sub2_Sub1_5);
				this.aClass39_Sub2_42.method3162(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_5.aFloat72);
				OpenGL.glVertex2f(local197, local206);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local197, local224);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat73, 0.0F);
				OpenGL.glVertex2f(local215, local224);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat73, this.aClass3_Sub2_Sub1_5.aFloat72);
				OpenGL.glVertex2f(local215, local206);
				OpenGL.glEnd();
			} else {
				this.method5729(arg4);
				this.aClass3_Sub2_Sub1_4.method4146(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass3_Sub2_Sub1_5.aFloat72);
				OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_5.aFloat72);
				OpenGL.glVertex2f(local197, local206);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local197, local224);
				OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub2_Sub1_5.aFloat73, 0.0F);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat73, 0.0F);
				OpenGL.glVertex2f(local215, local224);
				OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub2_Sub1_5.aFloat73, this.aClass3_Sub2_Sub1_5.aFloat72);
				OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat73, this.aClass3_Sub2_Sub1_5.aFloat72);
				OpenGL.glVertex2f(local215, local206);
				OpenGL.glEnd();
				this.method5726();
			}
		} else if (this.aClass3_Sub2_Sub1_4 == null) {
			this.aClass39_Sub2_42.method3203(this.aClass3_Sub2_Sub1_5);
			this.aClass39_Sub2_42.method3162(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_5.aFloat72);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat73, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat73, this.aClass3_Sub2_Sub1_5.aFloat72);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method5729(arg4);
			this.aClass3_Sub2_Sub1_4.method4146(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass3_Sub2_Sub1_5.aFloat72);
			OpenGL.glTexCoord2f(0.0F, this.aClass3_Sub2_Sub1_5.aFloat72);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub2_Sub1_5.aFloat73, 0.0F);
			OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat73, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass3_Sub2_Sub1_5.aFloat73, this.aClass3_Sub2_Sub1_5.aFloat72);
			OpenGL.glTexCoord2f(this.aClass3_Sub2_Sub1_5.aFloat73, this.aClass3_Sub2_Sub1_5.aFloat72);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method5726();
		}
	}

	@OriginalMember(owner = "client!vm", name = "BA", descriptor = "(III)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass3_Sub2_Sub1_4 = Static265.method3926(this.aClass3_Sub2_Sub1_5.anInt5012, arg1, arg0, this.aClass3_Sub2_Sub1_5.anInt5014, this.aClass39_Sub2_42);
		this.anInt6965 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(FFFFFFLclient!ma;II)V")
	@Override
	protected void method5716(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class133 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class3_Sub2_Sub1 local7 = ((Class133_Sub2) arg6).aClass3_Sub2_Sub1_3;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(32) float local32;
		if (this.aBoolean487) {
			local14 = this.j();
			local18 = this.T();
			local25 = (arg2 - arg0) / local14;
			local32 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(45) float local45 = (arg5 - arg1) / local18;
			@Pc(51) float local51 = local38 * (float) this.anInt6956;
			@Pc(57) float local57 = (float) this.anInt6956 * local45;
			@Pc(63) float local63 = local25 * (float) this.anInt6961;
			@Pc(69) float local69 = (float) this.anInt6961 * local32;
			@Pc(76) float local76 = -local25 * (float) this.anInt6955;
			@Pc(83) float local83 = (float) this.anInt6955 * -local32;
			@Pc(90) float local90 = -local38 * (float) this.anInt6974;
			arg3 = local57 + local83 + arg3;
			arg1 = local57 + local69 + arg1;
			arg0 = local51 + local63 + arg0;
			arg2 = local51 + local76 + arg2;
			@Pc(121) float local121 = -local45 * (float) this.anInt6974;
			arg4 = arg4 + local63 + local90;
			arg5 = arg5 + local69 + local121;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass3_Sub2_Sub1_5.method4146(true);
		local18 = arg3 + arg5 - arg1;
		this.aClass39_Sub2_42.method3228();
		this.aClass39_Sub2_42.method3203(this.aClass3_Sub2_Sub1_5);
		this.aClass39_Sub2_42.method3162(1);
		this.aClass39_Sub2_42.method3221(1);
		this.aClass39_Sub2_42.method3203(local7);
		this.aClass39_Sub2_42.method3156(8448, 7681);
		this.aClass39_Sub2_42.method3180(768, 0, 34168);
		this.aClass39_Sub2_42.method3205(1);
		local25 = local7.aFloat73 / (float) local7.anInt5014;
		local32 = local7.aFloat72 / (float) local7.anInt5012;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass3_Sub2_Sub1_5.aFloat72);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg0), local7.aFloat72 - (arg1 - (float) arg8) * local32);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * local25, local7.aFloat72 - (arg5 - (float) arg8) * local32);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass3_Sub2_Sub1_5.aFloat73, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + local14) * local25, local7.aFloat72 - local32 * ((float) -arg8 + local18));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass3_Sub2_Sub1_5.aFloat73, this.aClass3_Sub2_Sub1_5.aFloat72);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg2 - (float) arg7), local7.aFloat72 - ((float) -arg8 + arg3) * local32);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass39_Sub2_42.method3180(768, 0, 5890);
		this.aClass39_Sub2_42.method3162(0);
		this.aClass39_Sub2_42.method3203(null);
		this.aClass39_Sub2_42.method3221(0);
	}

	@OriginalMember(owner = "client!vm", name = "T", descriptor = "()I")
	@Override
	public int T() {
		return this.aClass3_Sub2_Sub1_5.anInt5012 + this.anInt6956 + this.anInt6974;
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)V")
	private void method5729(@OriginalArg(0) int arg0) {
		this.aClass39_Sub2_42.method3221(1);
		this.aClass39_Sub2_42.method3203(this.aClass3_Sub2_Sub1_5);
		this.aClass39_Sub2_42.method3156(7681, this.aClass39_Sub2_42.method3191(arg0));
		this.aClass39_Sub2_42.method3180(768, 1, 34167);
		this.aClass39_Sub2_42.method3210(34168, 0);
		this.aClass39_Sub2_42.method3221(0);
		this.aClass39_Sub2_42.method3203(this.aClass3_Sub2_Sub1_4);
		this.aClass39_Sub2_42.method3156(7681, 34479);
		this.aClass39_Sub2_42.method3180(768, 1, 34166);
		if (this.anInt6965 == 0) {
			this.aClass39_Sub2_42.method3172(1.0F, 0.0F, 0.5F, 0.5F);
		} else if (this.anInt6965 == 1) {
			this.aClass39_Sub2_42.method3172(0.5F, 0.0F, 1.0F, 0.5F);
		} else if (this.anInt6965 == 2) {
			this.aClass39_Sub2_42.method3172(0.5F, 0.0F, 0.5F, 1.0F);
			return;
		} else if (this.anInt6965 == 3) {
			this.aClass39_Sub2_42.method3172(128.5F, 0.0F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IILclient!ma;II)V")
	@Override
	public void method5720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class133_Sub2 local6 = (Class133_Sub2) arg2;
		@Pc(9) Class3_Sub2_Sub1 local9 = local6.aClass3_Sub2_Sub1_3;
		this.aClass3_Sub2_Sub1_5.method4146(false);
		this.aClass39_Sub2_42.method3228();
		this.aClass39_Sub2_42.method3203(this.aClass3_Sub2_Sub1_5);
		this.aClass39_Sub2_42.method3162(1);
		this.aClass39_Sub2_42.method3221(1);
		this.aClass39_Sub2_42.method3203(local9);
		this.aClass39_Sub2_42.method3156(8448, 7681);
		this.aClass39_Sub2_42.method3180(768, 0, 34168);
		this.aClass39_Sub2_42.method3205(1);
		@Pc(62) int local62 = arg1 + this.anInt6956;
		@Pc(67) int local67 = arg0 + this.anInt6961;
		@Pc(74) int local74 = local67 + this.aClass3_Sub2_Sub1_5.anInt5014;
		@Pc(80) int local80 = local62 + this.aClass3_Sub2_Sub1_5.anInt5012;
		@Pc(87) float local87 = local9.aFloat73 / (float) local9.anInt5014;
		@Pc(94) float local94 = local9.aFloat72 / (float) local9.anInt5012;
		@Pc(102) float local102 = (float) (local67 - arg3) * local87;
		@Pc(110) float local110 = (float) (local74 - arg3) * local87;
		@Pc(121) float local121 = local9.aFloat72 - local94 * (float) (local62 - arg4);
		@Pc(132) float local132 = local9.aFloat72 - local94 * (float) (local80 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass3_Sub2_Sub1_5.aFloat72);
		OpenGL.glMultiTexCoord2f(33985, local102, local121);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local132);
		OpenGL.glVertex2i(local67, this.aClass3_Sub2_Sub1_5.anInt5012 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass3_Sub2_Sub1_5.aFloat73, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local132);
		OpenGL.glVertex2i(local67 + this.aClass3_Sub2_Sub1_5.anInt5014, this.aClass3_Sub2_Sub1_5.anInt5012 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass3_Sub2_Sub1_5.aFloat73, this.aClass3_Sub2_Sub1_5.aFloat72);
		OpenGL.glMultiTexCoord2f(33985, local110, local121);
		OpenGL.glVertex2i(local67 + this.aClass3_Sub2_Sub1_5.anInt5014, local62);
		OpenGL.glEnd();
		this.aClass39_Sub2_42.method3180(768, 0, 5890);
		this.aClass39_Sub2_42.method3162(0);
		this.aClass39_Sub2_42.method3203(null);
		this.aClass39_Sub2_42.method3221(0);
	}
}
