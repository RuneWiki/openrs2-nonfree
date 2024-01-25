import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class119_Sub3 extends Class119 {

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "Lclient!ah;")
	private Class11_Sub1_Sub1 aClass11_Sub1_Sub1_3;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
	private int anInt8068 = 0;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
	private int anInt8066 = 0;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "Z")
	private boolean aBoolean574 = false;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
	private int anInt8062 = 0;

	@OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
	private int anInt8082 = 0;

	@OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
	private int anInt8083 = 0;

	@OriginalMember(owner = "client!sf", name = "A", descriptor = "Lclient!ad;")
	private final Class5_Sub1 aClass5_Sub1_36;

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "Lclient!ah;")
	private final Class11_Sub1_Sub1 aClass11_Sub1_Sub1_2;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!ad;IIII)V")
	public Class119_Sub3(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass5_Sub1_36 = arg0;
		this.aClass11_Sub1_Sub1_2 = Static412.method6201(arg0, arg1, arg4, arg3, arg2);
	}

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!ad;II[III)V")
	public Class119_Sub3(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass5_Sub1_36 = arg0;
		this.aClass11_Sub1_Sub1_2 = Static296.method4947(arg3, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!sf", name = "GA", descriptor = "(IIIIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass11_Sub1_Sub1_2.method611(arg1, arg5, arg3, arg2, arg0, arg4);
	}

	@OriginalMember(owner = "client!sf", name = "KA", descriptor = "(IIIIIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass11_Sub1_Sub1_2.method7303(true);
		this.aClass5_Sub1_36.method451();
		this.aClass5_Sub1_36.method455(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean574) {
			@Pc(180) float local180 = (float) arg2 / (float) this.AA();
			@Pc(187) float local187 = (float) arg3 / (float) this.a();
			@Pc(196) float local196 = (float) this.anInt8062 * local180 + (float) arg0;
			@Pc(205) float local205 = (float) this.anInt8068 * local187 + (float) arg1;
			@Pc(214) float local214 = (float) this.aClass11_Sub1_Sub1_2.anInt580 * local180 + local196;
			@Pc(223) float local223 = local187 * (float) this.aClass11_Sub1_Sub1_2.anInt582 + local205;
			if (this.aClass11_Sub1_Sub1_3 == null) {
				this.aClass5_Sub1_36.method423(this.aClass11_Sub1_Sub1_2);
				this.aClass5_Sub1_36.method416(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass11_Sub1_Sub1_2.aFloat30);
				OpenGL.glVertex2f(local196, local205);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local196, local223);
				OpenGL.glTexCoord2f(this.aClass11_Sub1_Sub1_2.aFloat31, 0.0F);
				OpenGL.glVertex2f(local214, local223);
				OpenGL.glTexCoord2f(this.aClass11_Sub1_Sub1_2.aFloat31, this.aClass11_Sub1_Sub1_2.aFloat30);
				OpenGL.glVertex2f(local214, local205);
				OpenGL.glEnd();
			} else {
				this.method6683(arg4);
				this.aClass11_Sub1_Sub1_3.method7303(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass11_Sub1_Sub1_2.aFloat30);
				OpenGL.glTexCoord2f(0.0F, this.aClass11_Sub1_Sub1_2.aFloat30);
				OpenGL.glVertex2f(local196, local205);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local196, local223);
				OpenGL.glMultiTexCoord2f(33985, this.aClass11_Sub1_Sub1_2.aFloat31, 0.0F);
				OpenGL.glTexCoord2f(this.aClass11_Sub1_Sub1_2.aFloat31, 0.0F);
				OpenGL.glVertex2f(local214, local223);
				OpenGL.glMultiTexCoord2f(33985, this.aClass11_Sub1_Sub1_2.aFloat31, this.aClass11_Sub1_Sub1_2.aFloat30);
				OpenGL.glTexCoord2f(this.aClass11_Sub1_Sub1_2.aFloat31, this.aClass11_Sub1_Sub1_2.aFloat30);
				OpenGL.glVertex2f(local214, local205);
				OpenGL.glEnd();
				this.method6682();
			}
		} else if (this.aClass11_Sub1_Sub1_3 == null) {
			this.aClass5_Sub1_36.method423(this.aClass11_Sub1_Sub1_2);
			this.aClass5_Sub1_36.method416(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass11_Sub1_Sub1_2.aFloat30);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass11_Sub1_Sub1_2.aFloat31, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass11_Sub1_Sub1_2.aFloat31, this.aClass11_Sub1_Sub1_2.aFloat30);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method6683(arg4);
			this.aClass11_Sub1_Sub1_3.method7303(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass11_Sub1_Sub1_2.aFloat30);
			OpenGL.glTexCoord2f(0.0F, this.aClass11_Sub1_Sub1_2.aFloat30);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass11_Sub1_Sub1_2.aFloat31, 0.0F);
			OpenGL.glTexCoord2f(this.aClass11_Sub1_Sub1_2.aFloat31, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass11_Sub1_Sub1_2.aFloat31, this.aClass11_Sub1_Sub1_2.aFloat30);
			OpenGL.glTexCoord2f(this.aClass11_Sub1_Sub1_2.aFloat31, this.aClass11_Sub1_Sub1_2.aFloat30);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method6682();
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.anInt8066 + this.aClass11_Sub1_Sub1_2.anInt582 + this.anInt8068;
	}

	@OriginalMember(owner = "client!sf", name = "t", descriptor = "(III)V")
	@Override
	public void t(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass11_Sub1_Sub1_3 = Static412.method6201(this.aClass5_Sub1_36, arg0, this.aClass11_Sub1_Sub1_2.anInt582, this.aClass11_Sub1_Sub1_2.anInt580, arg1);
		this.anInt8082 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
	private void method6682() {
		this.aClass5_Sub1_36.method397(1);
		this.aClass5_Sub1_36.method423(null);
		this.aClass5_Sub1_36.method448(8448, 8448);
		this.aClass5_Sub1_36.method419(34168, 1, 768);
		this.aClass5_Sub1_36.method461(5890, 0);
		this.aClass5_Sub1_36.method397(0);
		this.aClass5_Sub1_36.method419(34168, 1, 768);
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(II)V")
	private void method6683(@OriginalArg(0) int arg0) {
		this.aClass5_Sub1_36.method397(1);
		this.aClass5_Sub1_36.method423(this.aClass11_Sub1_Sub1_2);
		this.aClass5_Sub1_36.method448(7681, this.aClass5_Sub1_36.method444(arg0));
		this.aClass5_Sub1_36.method419(34167, 1, 768);
		this.aClass5_Sub1_36.method461(34168, 0);
		this.aClass5_Sub1_36.method397(0);
		this.aClass5_Sub1_36.method423(this.aClass11_Sub1_Sub1_3);
		this.aClass5_Sub1_36.method448(7681, 34479);
		this.aClass5_Sub1_36.method419(34166, 1, 768);
		if (this.anInt8082 == 0) {
			this.aClass5_Sub1_36.method450(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt8082 == 1) {
			this.aClass5_Sub1_36.method450(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt8082 == 2) {
			this.aClass5_Sub1_36.method450(0.5F, 1.0F, 0.0F, 0.5F);
			return;
		} else if (this.anInt8082 == 3) {
			this.aClass5_Sub1_36.method450(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!sf", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt8083 + this.anInt8062 + this.aClass11_Sub1_Sub1_2.anInt580;
	}

	@OriginalMember(owner = "client!sf", name = "sa", descriptor = "(FFFFFFIII)V")
	@Override
	protected void sa(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean574) {
			local6 = this.AA();
			local10 = this.a();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(36) float local36 = (arg5 - arg1) / local10;
			@Pc(42) float local42 = local29 * (float) this.anInt8068;
			@Pc(48) float local48 = (float) this.anInt8068 * local36;
			@Pc(54) float local54 = (float) this.anInt8062 * local17;
			@Pc(60) float local60 = local23 * (float) this.anInt8062;
			@Pc(67) float local67 = -local17 * (float) this.anInt8083;
			@Pc(74) float local74 = (float) this.anInt8083 * -local23;
			@Pc(81) float local81 = -local29 * (float) this.anInt8066;
			arg1 = local60 + arg1 + local48;
			arg0 = arg0 + local54 + local42;
			arg4 = local81 + arg4 + local54;
			arg3 = local48 + arg3 + local74;
			@Pc(112) float local112 = -local36 * (float) this.anInt8066;
			arg2 = local67 + arg2 + local42;
			arg5 = local112 + local60 + arg5;
		}
		local6 = arg4 + arg2 - arg0;
		local10 = arg3 + arg5 - arg1;
		this.aClass11_Sub1_Sub1_2.method7303(true);
		this.aClass5_Sub1_36.method451();
		this.aClass5_Sub1_36.method423(this.aClass11_Sub1_Sub1_2);
		this.aClass5_Sub1_36.method455(arg8);
		this.aClass5_Sub1_36.method416(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass11_Sub1_Sub1_2.aFloat30);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass11_Sub1_Sub1_2.aFloat31, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass11_Sub1_Sub1_2.aFloat31, this.aClass11_Sub1_Sub1_2.aFloat30);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return this.aClass11_Sub1_Sub1_2.anInt582;
	}

	@OriginalMember(owner = "client!sf", name = "I", descriptor = "(IIIII)V")
	@Override
	public void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass11_Sub1_Sub1_2.method7303(false);
		this.aClass5_Sub1_36.method451();
		this.aClass5_Sub1_36.method455(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt8068;
		@Pc(42) int local42 = arg0 + this.anInt8062;
		if (this.aClass11_Sub1_Sub1_3 == null) {
			this.aClass5_Sub1_36.method423(this.aClass11_Sub1_Sub1_2);
			this.aClass5_Sub1_36.method416(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass11_Sub1_Sub1_2.aFloat30);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, local37 + this.aClass11_Sub1_Sub1_2.anInt582);
			OpenGL.glTexCoord2f(this.aClass11_Sub1_Sub1_2.aFloat31, 0.0F);
			OpenGL.glVertex2i(this.aClass11_Sub1_Sub1_2.anInt580 + local42, local37 + this.aClass11_Sub1_Sub1_2.anInt582);
			OpenGL.glTexCoord2f(this.aClass11_Sub1_Sub1_2.aFloat31, this.aClass11_Sub1_Sub1_2.aFloat30);
			OpenGL.glVertex2i(local42 + this.aClass11_Sub1_Sub1_2.anInt580, local37);
			OpenGL.glEnd();
			return;
		}
		this.method6683(arg2);
		this.aClass11_Sub1_Sub1_3.method7303(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass11_Sub1_Sub1_2.aFloat30);
		OpenGL.glTexCoord2f(0.0F, this.aClass11_Sub1_Sub1_2.aFloat30);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, local37 + this.aClass11_Sub1_Sub1_2.anInt582);
		OpenGL.glMultiTexCoord2f(33985, this.aClass11_Sub1_Sub1_2.aFloat31, 0.0F);
		OpenGL.glTexCoord2f(this.aClass11_Sub1_Sub1_2.aFloat31, 0.0F);
		OpenGL.glVertex2i(local42 + this.aClass11_Sub1_Sub1_2.anInt580, local37 - -this.aClass11_Sub1_Sub1_2.anInt582);
		OpenGL.glMultiTexCoord2f(33985, this.aClass11_Sub1_Sub1_2.aFloat31, this.aClass11_Sub1_Sub1_2.aFloat30);
		OpenGL.glTexCoord2f(this.aClass11_Sub1_Sub1_2.aFloat31, this.aClass11_Sub1_Sub1_2.aFloat30);
		OpenGL.glVertex2i(local42 + this.aClass11_Sub1_Sub1_2.anInt580, local37);
		OpenGL.glEnd();
		this.method6682();
	}

	@OriginalMember(owner = "client!sf", name = "QA", descriptor = "()I")
	@Override
	public int QA() {
		return this.aClass11_Sub1_Sub1_2.anInt580;
	}

	@OriginalMember(owner = "client!sf", name = "ba", descriptor = "(IIIIIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) int local10 = arg0 + arg2;
		this.aClass11_Sub1_Sub1_2.method7303(false);
		@Pc(19) int local19 = arg1 + arg3;
		this.aClass5_Sub1_36.method451();
		this.aClass5_Sub1_36.method423(this.aClass11_Sub1_Sub1_2);
		this.aClass5_Sub1_36.method455(arg6);
		this.aClass5_Sub1_36.method416(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass11_Sub1_Sub1_2.aBoolean55 && !this.aBoolean574) {
			@Pc(73) float local73 = (float) arg3 * this.aClass11_Sub1_Sub1_2.aFloat30 / (float) this.aClass11_Sub1_Sub1_2.anInt582;
			@Pc(85) float local85 = (float) arg2 * this.aClass11_Sub1_Sub1_2.aFloat31 / (float) this.aClass11_Sub1_Sub1_2.anInt580;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local73);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local19);
			OpenGL.glTexCoord2f(local85, 0.0F);
			OpenGL.glVertex2i(local10, local19);
			OpenGL.glTexCoord2f(local85, local73);
			OpenGL.glVertex2i(local10, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt8062, (float) this.anInt8068, 0.0F);
		@Pc(125) int local125 = this.AA();
		@Pc(128) int local128 = this.a();
		@Pc(134) int local134 = this.aClass11_Sub1_Sub1_2.anInt582 + arg1;
		OpenGL.glBegin(7);
		@Pc(138) int local138 = arg1;
		@Pc(146) int local146;
		while (local134 <= local19) {
			local146 = arg0 + this.aClass11_Sub1_Sub1_2.anInt580;
			@Pc(148) int local148 = arg0;
			while (local10 >= local146) {
				OpenGL.glTexCoord2f(0.0F, this.aClass11_Sub1_Sub1_2.aFloat30);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(this.aClass11_Sub1_Sub1_2.aFloat31, 0.0F);
				OpenGL.glVertex2i(local146, local134);
				OpenGL.glTexCoord2f(this.aClass11_Sub1_Sub1_2.aFloat31, this.aClass11_Sub1_Sub1_2.aFloat30);
				OpenGL.glVertex2i(local146, local138);
				local148 += local125;
				local146 += local125;
			}
			if (local148 < local10) {
				@Pc(219) float local219 = this.aClass11_Sub1_Sub1_2.aFloat31 * (float) (local10 - local148) / (float) this.aClass11_Sub1_Sub1_2.anInt580;
				OpenGL.glTexCoord2f(0.0F, this.aClass11_Sub1_Sub1_2.aFloat30);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(local219, 0.0F);
				OpenGL.glVertex2i(local10, local134);
				OpenGL.glTexCoord2f(local219, this.aClass11_Sub1_Sub1_2.aFloat30);
				OpenGL.glVertex2i(local10, local138);
			}
			local134 += local128;
			local138 += local128;
		}
		if (local19 > local138) {
			@Pc(285) float local285 = (float) (local138 + this.aClass11_Sub1_Sub1_2.anInt582 - local19) * this.aClass11_Sub1_Sub1_2.aFloat30 / (float) this.aClass11_Sub1_Sub1_2.anInt582;
			@Pc(292) int local292 = arg0 + this.aClass11_Sub1_Sub1_2.anInt580;
			local146 = arg0;
			while (local10 >= local292) {
				OpenGL.glTexCoord2f(0.0F, this.aClass11_Sub1_Sub1_2.aFloat30);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local285);
				OpenGL.glVertex2i(local146, local19);
				OpenGL.glTexCoord2f(this.aClass11_Sub1_Sub1_2.aFloat31, local285);
				OpenGL.glVertex2i(local292, local19);
				OpenGL.glTexCoord2f(this.aClass11_Sub1_Sub1_2.aFloat31, this.aClass11_Sub1_Sub1_2.aFloat30);
				OpenGL.glVertex2i(local292, local138);
				local146 += local125;
				local292 += local125;
			}
			if (local10 > local146) {
				@Pc(361) float local361 = (float) (local10 - local146) * this.aClass11_Sub1_Sub1_2.aFloat31 / (float) this.aClass11_Sub1_Sub1_2.anInt580;
				OpenGL.glTexCoord2f(0.0F, this.aClass11_Sub1_Sub1_2.aFloat30);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local285);
				OpenGL.glVertex2i(local146, local19);
				OpenGL.glTexCoord2f(local361, local285);
				OpenGL.glVertex2i(local10, local19);
				OpenGL.glTexCoord2f(local361, this.aClass11_Sub1_Sub1_2.aFloat30);
				OpenGL.glVertex2i(local10, local138);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(FFFFFFLclient!fa;II)V")
	@Override
	protected void method6672(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class10 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class11_Sub1_Sub1 local7 = ((Class10_Sub3) arg6).aClass11_Sub1_Sub1_5;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(31) float local31;
		if (this.aBoolean574) {
			local14 = this.AA();
			local18 = this.a();
			local25 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(43) float local43 = (arg5 - arg1) / local18;
			@Pc(49) float local49 = local37 * (float) this.anInt8068;
			@Pc(55) float local55 = local43 * (float) this.anInt8068;
			@Pc(61) float local61 = local25 * (float) this.anInt8062;
			@Pc(67) float local67 = local31 * (float) this.anInt8062;
			@Pc(74) float local74 = -local25 * (float) this.anInt8083;
			@Pc(81) float local81 = -local31 * (float) this.anInt8083;
			@Pc(88) float local88 = (float) this.anInt8066 * -local37;
			arg3 = arg3 + local81 + local55;
			arg0 = arg0 + local61 + local49;
			arg2 = arg2 + local74 + local49;
			arg4 = local88 + local61 + arg4;
			@Pc(119) float local119 = -local43 * (float) this.anInt8066;
			arg1 = arg1 + local67 + local55;
			arg5 = local119 + local67 + arg5;
		}
		local14 = arg4 + arg2 - arg0;
		local18 = arg3 + arg5 - arg1;
		this.aClass11_Sub1_Sub1_2.method7303(true);
		this.aClass5_Sub1_36.method451();
		this.aClass5_Sub1_36.method423(this.aClass11_Sub1_Sub1_2);
		this.aClass5_Sub1_36.method416(1);
		this.aClass5_Sub1_36.method397(1);
		this.aClass5_Sub1_36.method423(local7);
		this.aClass5_Sub1_36.method448(8448, 7681);
		this.aClass5_Sub1_36.method419(34168, 0, 768);
		this.aClass5_Sub1_36.method455(1);
		local25 = local7.aFloat31 / (float) local7.anInt580;
		local31 = local7.aFloat30 / (float) local7.anInt582;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass11_Sub1_Sub1_2.aFloat30);
		OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * local25, local7.aFloat30 - local31 * ((float) -arg8 + arg1));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (arg4 - (float) arg7) * local25, local7.aFloat30 - local31 * (arg5 - (float) arg8));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass11_Sub1_Sub1_2.aFloat31, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * (local14 - (float) arg7), local7.aFloat30 - local31 * (local18 - (float) arg8));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass11_Sub1_Sub1_2.aFloat31, this.aClass11_Sub1_Sub1_2.aFloat30);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg2) * local25, local7.aFloat30 - (arg3 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass5_Sub1_36.method419(5890, 0, 768);
		this.aClass5_Sub1_36.method416(0);
		this.aClass5_Sub1_36.method423(null);
		this.aClass5_Sub1_36.method397(0);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!fa;II)V")
	@Override
	public void method6677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class10_Sub3 local6 = (Class10_Sub3) arg2;
		@Pc(9) Class11_Sub1_Sub1 local9 = local6.aClass11_Sub1_Sub1_5;
		this.aClass11_Sub1_Sub1_2.method7303(false);
		this.aClass5_Sub1_36.method451();
		this.aClass5_Sub1_36.method423(this.aClass11_Sub1_Sub1_2);
		this.aClass5_Sub1_36.method416(1);
		this.aClass5_Sub1_36.method397(1);
		this.aClass5_Sub1_36.method423(local9);
		this.aClass5_Sub1_36.method448(8448, 7681);
		this.aClass5_Sub1_36.method419(34168, 0, 768);
		this.aClass5_Sub1_36.method455(1);
		@Pc(62) int local62 = arg1 + this.anInt8068;
		@Pc(67) int local67 = arg0 + this.anInt8062;
		@Pc(73) int local73 = this.aClass11_Sub1_Sub1_2.anInt580 + local67;
		@Pc(79) int local79 = this.aClass11_Sub1_Sub1_2.anInt582 + local62;
		@Pc(86) float local86 = local9.aFloat31 / (float) local9.anInt580;
		@Pc(93) float local93 = local9.aFloat30 / (float) local9.anInt582;
		@Pc(101) float local101 = local86 * (float) (local67 - arg3);
		@Pc(109) float local109 = (float) (local73 - arg3) * local86;
		@Pc(120) float local120 = local9.aFloat30 - local93 * (float) (local62 - arg4);
		@Pc(131) float local131 = local9.aFloat30 - (float) (local79 - arg4) * local93;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass11_Sub1_Sub1_2.aFloat30);
		OpenGL.glMultiTexCoord2f(33985, local101, local120);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local131);
		OpenGL.glVertex2i(local67, this.aClass11_Sub1_Sub1_2.anInt582 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass11_Sub1_Sub1_2.aFloat31, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local131);
		OpenGL.glVertex2i(this.aClass11_Sub1_Sub1_2.anInt580 + local67, this.aClass11_Sub1_Sub1_2.anInt582 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass11_Sub1_Sub1_2.aFloat31, this.aClass11_Sub1_Sub1_2.aFloat30);
		OpenGL.glMultiTexCoord2f(33985, local109, local120);
		OpenGL.glVertex2i(local67 + this.aClass11_Sub1_Sub1_2.anInt580, local62);
		OpenGL.glEnd();
		this.aClass5_Sub1_36.method419(5890, 0, 768);
		this.aClass5_Sub1_36.method416(0);
		this.aClass5_Sub1_36.method423(null);
		this.aClass5_Sub1_36.method397(0);
	}

	@OriginalMember(owner = "client!sf", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8068 = arg1;
		this.anInt8062 = arg0;
		this.anInt8066 = arg3;
		this.anInt8083 = arg2;
		this.aBoolean574 = this.anInt8062 != 0 || this.anInt8068 != 0 || this.anInt8083 != 0 || this.anInt8066 != 0;
	}
}
