import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class31_Sub3 extends Class31 {

	@OriginalMember(owner = "client!re", name = "A", descriptor = "Lclient!baa;")
	private Class10_Sub2_Sub1 aClass10_Sub2_Sub1_5;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "I")
	private int anInt7854 = 0;

	@OriginalMember(owner = "client!re", name = "t", descriptor = "I")
	private int anInt7864 = 0;

	@OriginalMember(owner = "client!re", name = "w", descriptor = "I")
	private int anInt7866 = 0;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "Z")
	private boolean aBoolean560 = false;

	@OriginalMember(owner = "client!re", name = "s", descriptor = "I")
	private int anInt7863 = 0;

	@OriginalMember(owner = "client!re", name = "F", descriptor = "I")
	private int anInt7874 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!bi;")
	private final Class13_Sub2 aClass13_Sub2_38;

	@OriginalMember(owner = "client!re", name = "v", descriptor = "Lclient!baa;")
	private final Class10_Sub2_Sub1 aClass10_Sub2_Sub1_4;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!bi;IIZ)V")
	public Class31_Sub3(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass13_Sub2_38 = arg0;
		this.aClass10_Sub2_Sub1_4 = Static533.method7370(arg1, arg3 ? 6408 : 6407, arg0, arg2);
	}

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!bi;IIII)V")
	public Class31_Sub3(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass13_Sub2_38 = arg0;
		this.aClass10_Sub2_Sub1_4 = Static602.method8470(arg4, arg2, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!bi;II[III)V")
	public Class31_Sub3(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass13_Sub2_38 = arg0;
		this.aClass10_Sub2_Sub1_4 = Static111.method2004(arg3, arg4, arg5, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII[III)V")
	private void method6902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass10_Sub2_Sub1_4.method721(arg0, arg3, arg5, arg1, arg2, arg4);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III)V")
	@Override
	public void method8794(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass10_Sub2_Sub1_5 = Static602.method8470(this.aClass10_Sub2_Sub1_4.anInt649, 0, 0, this.aClass10_Sub2_Sub1_4.anInt648, this.aClass13_Sub2_38);
		this.anInt7864 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method8796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass10_Sub2_Sub1_4.method7260(false);
		this.aClass13_Sub2_38.method1050();
		this.aClass13_Sub2_38.method1090(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt7874;
		@Pc(42) int local42 = arg1 + this.anInt7866;
		if (this.aClass10_Sub2_Sub1_5 == null) {
			this.aClass13_Sub2_38.method1096(this.aClass10_Sub2_Sub1_4);
			this.aClass13_Sub2_38.method1046(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub2_Sub1_4.aFloat5);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, local42 + this.aClass10_Sub2_Sub1_4.anInt649);
			OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_4.aFloat6, 0.0F);
			OpenGL.glVertex2i(this.aClass10_Sub2_Sub1_4.anInt648 + local37, this.aClass10_Sub2_Sub1_4.anInt649 + local42);
			OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_4.aFloat6, this.aClass10_Sub2_Sub1_4.aFloat5);
			OpenGL.glVertex2i(local37 + this.aClass10_Sub2_Sub1_4.anInt648, local42);
			OpenGL.glEnd();
			return;
		}
		this.method6905(arg2);
		this.aClass10_Sub2_Sub1_5.method7260(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass10_Sub2_Sub1_4.aFloat5);
		OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub2_Sub1_4.aFloat5);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, this.aClass10_Sub2_Sub1_4.anInt649 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass10_Sub2_Sub1_4.aFloat6, 0.0F);
		OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_4.aFloat6, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass10_Sub2_Sub1_4.anInt648, local42 + this.aClass10_Sub2_Sub1_4.anInt649);
		OpenGL.glMultiTexCoord2f(33985, this.aClass10_Sub2_Sub1_4.aFloat6, this.aClass10_Sub2_Sub1_4.aFloat5);
		OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_4.aFloat6, this.aClass10_Sub2_Sub1_4.aFloat5);
		OpenGL.glVertex2i(local37 + this.aClass10_Sub2_Sub1_4.anInt648, local42);
		OpenGL.glEnd();
		this.method6906();
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method8808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg0 + arg2;
		@Pc(13) int local13 = arg3 + arg1;
		this.aClass10_Sub2_Sub1_4.method7260(false);
		this.aClass13_Sub2_38.method1050();
		this.aClass13_Sub2_38.method1096(this.aClass10_Sub2_Sub1_4);
		this.aClass13_Sub2_38.method1090(arg6);
		this.aClass13_Sub2_38.method1046(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass10_Sub2_Sub1_4.aBoolean66 && !this.aBoolean560) {
			@Pc(72) float local72 = this.aClass10_Sub2_Sub1_4.aFloat5 * (float) arg3 / (float) this.aClass10_Sub2_Sub1_4.anInt649;
			@Pc(84) float local84 = this.aClass10_Sub2_Sub1_4.aFloat6 * (float) arg2 / (float) this.aClass10_Sub2_Sub1_4.anInt648;
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
		OpenGL.glTranslatef((float) this.anInt7874, (float) this.anInt7866, 0.0F);
		@Pc(124) int local124 = this.method8788();
		@Pc(127) int local127 = this.method8807();
		@Pc(134) int local134 = arg1 + this.aClass10_Sub2_Sub1_4.anInt649;
		OpenGL.glBegin(7);
		@Pc(138) int local138 = arg1;
		@Pc(146) int local146;
		while (local13 >= local134) {
			local146 = arg0 + this.aClass10_Sub2_Sub1_4.anInt648;
			@Pc(148) int local148 = arg0;
			while (local146 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub2_Sub1_4.aFloat5);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_4.aFloat6, 0.0F);
				OpenGL.glVertex2i(local146, local134);
				OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_4.aFloat6, this.aClass10_Sub2_Sub1_4.aFloat5);
				OpenGL.glVertex2i(local146, local138);
				local148 += local124;
				local146 += local124;
			}
			if (local9 > local148) {
				@Pc(211) float local211 = (float) (local9 - local148) * this.aClass10_Sub2_Sub1_4.aFloat6 / (float) this.aClass10_Sub2_Sub1_4.anInt648;
				OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub2_Sub1_4.aFloat5);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(local211, 0.0F);
				OpenGL.glVertex2i(local9, local134);
				OpenGL.glTexCoord2f(local211, this.aClass10_Sub2_Sub1_4.aFloat5);
				OpenGL.glVertex2i(local9, local138);
			}
			local138 += local127;
			local134 += local127;
		}
		if (local138 < local13) {
			@Pc(272) float local272 = this.aClass10_Sub2_Sub1_4.aFloat5 * (float) (this.aClass10_Sub2_Sub1_4.anInt649 + local138 - local13) / (float) this.aClass10_Sub2_Sub1_4.anInt649;
			@Pc(278) int local278 = this.aClass10_Sub2_Sub1_4.anInt648 + arg0;
			local146 = arg0;
			while (local9 >= local278) {
				OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub2_Sub1_4.aFloat5);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local272);
				OpenGL.glVertex2i(local146, local13);
				OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_4.aFloat6, local272);
				OpenGL.glVertex2i(local278, local13);
				OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_4.aFloat6, this.aClass10_Sub2_Sub1_4.aFloat5);
				OpenGL.glVertex2i(local278, local138);
				local146 += local124;
				local278 += local124;
			}
			if (local146 < local9) {
				@Pc(343) float local343 = this.aClass10_Sub2_Sub1_4.aFloat6 * (float) (local9 - local146) / (float) this.aClass10_Sub2_Sub1_4.anInt648;
				OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub2_Sub1_4.aFloat5);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local272);
				OpenGL.glVertex2i(local146, local13);
				OpenGL.glTexCoord2f(local343, local272);
				OpenGL.glVertex2i(local9, local13);
				OpenGL.glTexCoord2f(local343, this.aClass10_Sub2_Sub1_4.aFloat5);
				OpenGL.glVertex2i(local9, local138);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method8803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass10_Sub2_Sub1_4.method7260(true);
		this.aClass13_Sub2_38.method1050();
		this.aClass13_Sub2_38.method1090(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean560) {
			@Pc(190) float local190 = (float) arg2 / (float) this.method8788();
			@Pc(197) float local197 = (float) arg3 / (float) this.method8807();
			@Pc(206) float local206 = local190 * (float) this.anInt7874 + (float) arg0;
			@Pc(215) float local215 = (float) this.anInt7866 * local197 + (float) arg1;
			@Pc(224) float local224 = (float) this.aClass10_Sub2_Sub1_4.anInt648 * local190 + local206;
			@Pc(233) float local233 = local215 + local197 * (float) this.aClass10_Sub2_Sub1_4.anInt649;
			if (this.aClass10_Sub2_Sub1_5 == null) {
				this.aClass13_Sub2_38.method1096(this.aClass10_Sub2_Sub1_4);
				this.aClass13_Sub2_38.method1046(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub2_Sub1_4.aFloat5);
				OpenGL.glVertex2f(local206, local215);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local206, local233);
				OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_4.aFloat6, 0.0F);
				OpenGL.glVertex2f(local224, local233);
				OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_4.aFloat6, this.aClass10_Sub2_Sub1_4.aFloat5);
				OpenGL.glVertex2f(local224, local215);
				OpenGL.glEnd();
			} else {
				this.method6905(arg4);
				this.aClass10_Sub2_Sub1_5.method7260(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass10_Sub2_Sub1_4.aFloat5);
				OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub2_Sub1_4.aFloat5);
				OpenGL.glVertex2f(local206, local215);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local206, local233);
				OpenGL.glMultiTexCoord2f(33985, this.aClass10_Sub2_Sub1_4.aFloat6, 0.0F);
				OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_4.aFloat6, 0.0F);
				OpenGL.glVertex2f(local224, local233);
				OpenGL.glMultiTexCoord2f(33985, this.aClass10_Sub2_Sub1_4.aFloat6, this.aClass10_Sub2_Sub1_4.aFloat5);
				OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_4.aFloat6, this.aClass10_Sub2_Sub1_4.aFloat5);
				OpenGL.glVertex2f(local224, local215);
				OpenGL.glEnd();
				this.method6906();
			}
		} else if (this.aClass10_Sub2_Sub1_5 == null) {
			this.aClass13_Sub2_38.method1096(this.aClass10_Sub2_Sub1_4);
			this.aClass13_Sub2_38.method1046(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub2_Sub1_4.aFloat5);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_4.aFloat6, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_4.aFloat6, this.aClass10_Sub2_Sub1_4.aFloat5);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method6905(arg4);
			this.aClass10_Sub2_Sub1_5.method7260(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass10_Sub2_Sub1_4.aFloat5);
			OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub2_Sub1_4.aFloat5);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass10_Sub2_Sub1_4.aFloat6, 0.0F);
			OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_4.aFloat6, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass10_Sub2_Sub1_4.aFloat6, this.aClass10_Sub2_Sub1_4.aFloat5);
			OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_4.aFloat6, this.aClass10_Sub2_Sub1_4.aFloat5);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method6906();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method8805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg2;
		@Pc(9) Class10_Sub2_Sub1 local9 = local6.aClass10_Sub2_Sub1_3;
		this.aClass10_Sub2_Sub1_4.method7260(false);
		this.aClass13_Sub2_38.method1050();
		this.aClass13_Sub2_38.method1096(this.aClass10_Sub2_Sub1_4);
		this.aClass13_Sub2_38.method1046(1);
		this.aClass13_Sub2_38.method1093(1);
		this.aClass13_Sub2_38.method1096(local9);
		this.aClass13_Sub2_38.method1045(7681, 8448);
		this.aClass13_Sub2_38.method1021(34168, 768, 0);
		this.aClass13_Sub2_38.method1090(1);
		@Pc(62) int local62 = arg1 + this.anInt7866;
		@Pc(67) int local67 = arg0 + this.anInt7874;
		@Pc(73) int local73 = local67 + this.aClass10_Sub2_Sub1_4.anInt648;
		@Pc(79) int local79 = this.aClass10_Sub2_Sub1_4.anInt649 + local62;
		@Pc(86) float local86 = local9.aFloat6 / (float) local9.anInt648;
		@Pc(93) float local93 = local9.aFloat5 / (float) local9.anInt649;
		@Pc(100) float local100 = (float) (local67 - arg3) * local86;
		@Pc(108) float local108 = (float) (local73 - arg3) * local86;
		@Pc(119) float local119 = local9.aFloat5 - local93 * (float) (local62 - arg4);
		@Pc(131) float local131 = local9.aFloat5 - (float) (local79 - arg4) * local93;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass10_Sub2_Sub1_4.aFloat5);
		OpenGL.glMultiTexCoord2f(33985, local100, local119);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local100, local131);
		OpenGL.glVertex2i(local67, this.aClass10_Sub2_Sub1_4.anInt649 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass10_Sub2_Sub1_4.aFloat6, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local108, local131);
		OpenGL.glVertex2i(this.aClass10_Sub2_Sub1_4.anInt648 + local67, local62 - -this.aClass10_Sub2_Sub1_4.anInt649);
		OpenGL.glMultiTexCoord2f(33984, this.aClass10_Sub2_Sub1_4.aFloat6, this.aClass10_Sub2_Sub1_4.aFloat5);
		OpenGL.glMultiTexCoord2f(33985, local108, local119);
		OpenGL.glVertex2i(this.aClass10_Sub2_Sub1_4.anInt648 + local67, local62);
		OpenGL.glEnd();
		this.aClass13_Sub2_38.method1021(5890, 768, 0);
		this.aClass13_Sub2_38.method1046(0);
		this.aClass13_Sub2_38.method1096((Class10) null);
		this.aClass13_Sub2_38.method1093(0);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method8791(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean560) {
			local6 = (float) this.method8788();
			local10 = (float) this.method8807();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(35) float local35 = (arg5 - arg1) / local10;
			@Pc(41) float local41 = local29 * (float) this.anInt7866;
			@Pc(47) float local47 = (float) this.anInt7866 * local35;
			@Pc(53) float local53 = local16 * (float) this.anInt7874;
			@Pc(59) float local59 = local23 * (float) this.anInt7874;
			@Pc(66) float local66 = (float) this.anInt7863 * -local16;
			@Pc(73) float local73 = (float) this.anInt7863 * -local23;
			@Pc(80) float local80 = -local29 * (float) this.anInt7854;
			arg1 = local47 + arg1 + local59;
			arg2 = local41 + arg2 + local66;
			@Pc(99) float local99 = -local35 * (float) this.anInt7854;
			arg3 = arg3 + local73 + local47;
			arg4 = local80 + arg4 + local53;
			arg0 = arg0 + local53 + local41;
			arg5 = local99 + arg5 + local59;
		}
		local6 = arg2 + arg4 - arg0;
		this.aClass10_Sub2_Sub1_4.method7260(true);
		local10 = arg3 + arg5 - arg1;
		this.aClass13_Sub2_38.method1050();
		this.aClass13_Sub2_38.method1096(this.aClass10_Sub2_Sub1_4);
		this.aClass13_Sub2_38.method1090(1);
		this.aClass13_Sub2_38.method1046(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass10_Sub2_Sub1_4.aFloat5);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_4.aFloat6, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass10_Sub2_Sub1_4.aFloat6, this.aClass10_Sub2_Sub1_4.aFloat5);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([I)V")
	@Override
	public void method8799(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt7854;
		arg0[2] = this.anInt7863;
		arg0[1] = this.anInt7866;
		arg0[0] = this.anInt7874;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "()I")
	@Override
	public int method8788() {
		return this.anInt7863 + this.aClass10_Sub2_Sub1_4.anInt648 + this.anInt7874;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method8800(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class10_Sub2_Sub1 local7 = ((Class1_Sub2) arg6).aClass10_Sub2_Sub1_3;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(30) float local30;
		if (this.aBoolean560) {
			local14 = (float) this.method8788();
			local18 = (float) this.method8807();
			local24 = (arg2 - arg0) / local14;
			local30 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = (float) this.anInt7866 * local37;
			@Pc(56) float local56 = (float) this.anInt7866 * local44;
			@Pc(62) float local62 = (float) this.anInt7874 * local24;
			@Pc(68) float local68 = (float) this.anInt7874 * local30;
			@Pc(75) float local75 = -local24 * (float) this.anInt7863;
			@Pc(82) float local82 = (float) this.anInt7863 * -local30;
			@Pc(89) float local89 = -local37 * (float) this.anInt7854;
			arg2 = arg2 + local75 + local50;
			arg4 = local89 + arg4 + local62;
			@Pc(108) float local108 = (float) this.anInt7854 * -local44;
			arg1 = local56 + local68 + arg1;
			arg3 = arg3 + local82 + local56;
			arg0 = arg0 + local62 + local50;
			arg5 = local108 + arg5 + local68;
		}
		local14 = arg2 + arg4 - arg0;
		this.aClass10_Sub2_Sub1_4.method7260(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass13_Sub2_38.method1050();
		this.aClass13_Sub2_38.method1096(this.aClass10_Sub2_Sub1_4);
		this.aClass13_Sub2_38.method1046(1);
		this.aClass13_Sub2_38.method1093(1);
		this.aClass13_Sub2_38.method1096(local7);
		this.aClass13_Sub2_38.method1045(7681, 8448);
		this.aClass13_Sub2_38.method1021(34168, 768, 0);
		this.aClass13_Sub2_38.method1090(1);
		local24 = local7.aFloat6 / (float) local7.anInt648;
		local30 = local7.aFloat5 / (float) local7.anInt649;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass10_Sub2_Sub1_4.aFloat5);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg0) * local24, local7.aFloat5 - ((float) -arg8 + arg1) * local30);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * local24, local7.aFloat5 - local30 * ((float) -arg8 + arg5));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass10_Sub2_Sub1_4.aFloat6, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local24 * (local14 - (float) arg7), local7.aFloat5 - local30 * ((float) -arg8 + local18));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass10_Sub2_Sub1_4.aFloat6, this.aClass10_Sub2_Sub1_4.aFloat5);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg2) * local24, local7.aFloat5 - local30 * (arg3 - (float) arg8));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass13_Sub2_38.method1021(5890, 768, 0);
		this.aClass13_Sub2_38.method1046(0);
		this.aClass13_Sub2_38.method1096((Class10) null);
		this.aClass13_Sub2_38.method1093(0);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "()I")
	@Override
	public int method8789() {
		return this.aClass10_Sub2_Sub1_4.anInt649;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7854 = arg3;
		this.anInt7874 = arg0;
		this.anInt7863 = arg2;
		this.anInt7866 = arg1;
		this.aBoolean560 = this.anInt7874 != 0 || this.anInt7866 != 0 || this.anInt7863 != 0 || this.anInt7854 != 0;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(II)V")
	private void method6905(@OriginalArg(0) int arg0) {
		this.aClass13_Sub2_38.method1093(1);
		this.aClass13_Sub2_38.method1096(this.aClass10_Sub2_Sub1_4);
		this.aClass13_Sub2_38.method1045(this.aClass13_Sub2_38.method1063(arg0), 7681);
		this.aClass13_Sub2_38.method1021(34167, 768, 1);
		this.aClass13_Sub2_38.method1034(34168, 0);
		this.aClass13_Sub2_38.method1093(0);
		this.aClass13_Sub2_38.method1096(this.aClass10_Sub2_Sub1_5);
		this.aClass13_Sub2_38.method1045(34479, 7681);
		this.aClass13_Sub2_38.method1021(34166, 768, 1);
		if (this.anInt7864 == 0) {
			this.aClass13_Sub2_38.method1071(0.5F, 0.0F, 1.0F, 0.5F);
		} else if (this.anInt7864 == 1) {
			this.aClass13_Sub2_38.method1071(1.0F, 0.0F, 0.5F, 0.5F);
		} else if (this.anInt7864 == 2) {
			this.aClass13_Sub2_38.method1071(0.5F, 0.0F, 0.5F, 1.0F);
		} else if (this.anInt7864 == 3) {
			this.aClass13_Sub2_38.method1071(128.5F, 0.0F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass13_Sub2_38.aBoolean84) {
			this.aClass10_Sub2_Sub1_4.method725(arg1, arg3, arg2, arg4, arg5, arg0);
			return;
		}
		@Pc(15) int[] local15 = this.aClass13_Sub2_38.na(arg4, arg5, arg2, arg3);
		if (local15 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
			local15[local19] |= 0xFF000000;
		}
		this.method6902(arg0, arg1, arg2, arg3, local15, arg2);
		return;
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "()I")
	@Override
	public int method8801() {
		return this.aClass10_Sub2_Sub1_4.anInt648;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	private void method6906() {
		this.aClass13_Sub2_38.method1093(1);
		this.aClass13_Sub2_38.method1096((Class10) null);
		this.aClass13_Sub2_38.method1045(8448, 8448);
		this.aClass13_Sub2_38.method1021(34168, 768, 1);
		this.aClass13_Sub2_38.method1034(5890, 0);
		this.aClass13_Sub2_38.method1093(0);
		this.aClass13_Sub2_38.method1021(34168, 768, 1);
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "()I")
	@Override
	public int method8807() {
		return this.anInt7854 + this.aClass10_Sub2_Sub1_4.anInt649 + this.anInt7866;
	}
}
