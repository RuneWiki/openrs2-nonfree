import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "Lclient!em;")
	private Class73_Sub1_Sub1 aClass73_Sub1_Sub1_2;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
	private int anInt83 = 0;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "Z")
	private boolean aBoolean6 = false;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
	private int anInt85 = 0;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
	private int anInt84 = 0;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
	private int anInt92 = 0;

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
	private int anInt100 = 0;

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "Lclient!uq;")
	private final Class122_Sub3 aClass122_Sub3_1;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "Lclient!em;")
	private final Class73_Sub1_Sub1 aClass73_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!uq;IIII)V")
	public Class2_Sub1(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass122_Sub3_1 = arg0;
		this.aClass73_Sub1_Sub1_1 = Static72.method1277(arg2, arg1, arg3, arg0, arg4);
	}

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!uq;II[III)V")
	public Class2_Sub1(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass122_Sub3_1 = arg0;
		this.aClass73_Sub1_Sub1_1 = Static526.method7301(arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!ab", name = "ra", descriptor = "(IIIIIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass73_Sub1_Sub1_1.method6348(true);
		this.aClass122_Sub3_1.method6864();
		this.aClass122_Sub3_1.method6871(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean6) {
			@Pc(42) float local42 = (float) arg2 / (float) this.EA();
			@Pc(49) float local49 = (float) arg3 / (float) this.ma();
			@Pc(58) float local58 = (float) this.anInt84 * local42 + (float) arg0;
			@Pc(67) float local67 = (float) arg1 + local49 * (float) this.anInt92;
			@Pc(76) float local76 = local58 + (float) this.aClass73_Sub1_Sub1_1.anInt2345 * local42;
			@Pc(85) float local85 = local49 * (float) this.aClass73_Sub1_Sub1_1.anInt2344 + local67;
			if (this.aClass73_Sub1_Sub1_2 == null) {
				this.aClass122_Sub3_1.method6850(this.aClass73_Sub1_Sub1_1);
				this.aClass122_Sub3_1.method6875(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass73_Sub1_Sub1_1.aFloat20);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glTexCoord2f(this.aClass73_Sub1_Sub1_1.aFloat21, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glTexCoord2f(this.aClass73_Sub1_Sub1_1.aFloat21, this.aClass73_Sub1_Sub1_1.aFloat20);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
			} else {
				this.method238(arg4);
				this.aClass73_Sub1_Sub1_2.method6348(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass73_Sub1_Sub1_1.aFloat20);
				OpenGL.glTexCoord2f(0.0F, this.aClass73_Sub1_Sub1_1.aFloat20);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass73_Sub1_Sub1_1.aFloat21, 0.0F);
				OpenGL.glTexCoord2f(this.aClass73_Sub1_Sub1_1.aFloat21, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass73_Sub1_Sub1_1.aFloat21, this.aClass73_Sub1_Sub1_1.aFloat20);
				OpenGL.glTexCoord2f(this.aClass73_Sub1_Sub1_1.aFloat21, this.aClass73_Sub1_Sub1_1.aFloat20);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
				this.method236();
			}
		} else if (this.aClass73_Sub1_Sub1_2 == null) {
			this.aClass122_Sub3_1.method6850(this.aClass73_Sub1_Sub1_1);
			this.aClass122_Sub3_1.method6875(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass73_Sub1_Sub1_1.aFloat20);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass73_Sub1_Sub1_1.aFloat21, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass73_Sub1_Sub1_1.aFloat21, this.aClass73_Sub1_Sub1_1.aFloat20);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method238(arg4);
			this.aClass73_Sub1_Sub1_2.method6348(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass73_Sub1_Sub1_1.aFloat20);
			OpenGL.glTexCoord2f(0.0F, this.aClass73_Sub1_Sub1_1.aFloat20);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass73_Sub1_Sub1_1.aFloat21, 0.0F);
			OpenGL.glTexCoord2f(this.aClass73_Sub1_Sub1_1.aFloat21, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass73_Sub1_Sub1_1.aFloat21, this.aClass73_Sub1_Sub1_1.aFloat20);
			OpenGL.glTexCoord2f(this.aClass73_Sub1_Sub1_1.aFloat21, this.aClass73_Sub1_Sub1_1.aFloat20);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method236();
		}
	}

	@OriginalMember(owner = "client!ab", name = "DA", descriptor = "(IIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass73_Sub1_Sub1_1.method6348(false);
		this.aClass122_Sub3_1.method6864();
		this.aClass122_Sub3_1.method6871(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt84;
		@Pc(42) int local42 = arg1 + this.anInt92;
		if (this.aClass73_Sub1_Sub1_2 == null) {
			this.aClass122_Sub3_1.method6850(this.aClass73_Sub1_Sub1_1);
			this.aClass122_Sub3_1.method6875(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass73_Sub1_Sub1_1.aFloat20);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, local42 + this.aClass73_Sub1_Sub1_1.anInt2344);
			OpenGL.glTexCoord2f(this.aClass73_Sub1_Sub1_1.aFloat21, 0.0F);
			OpenGL.glVertex2i(this.aClass73_Sub1_Sub1_1.anInt2345 + local37, local42 - -this.aClass73_Sub1_Sub1_1.anInt2344);
			OpenGL.glTexCoord2f(this.aClass73_Sub1_Sub1_1.aFloat21, this.aClass73_Sub1_Sub1_1.aFloat20);
			OpenGL.glVertex2i(local37 + this.aClass73_Sub1_Sub1_1.anInt2345, local42);
			OpenGL.glEnd();
			return;
		}
		this.method238(arg2);
		this.aClass73_Sub1_Sub1_2.method6348(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass73_Sub1_Sub1_1.aFloat20);
		OpenGL.glTexCoord2f(0.0F, this.aClass73_Sub1_Sub1_1.aFloat20);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, local42 + this.aClass73_Sub1_Sub1_1.anInt2344);
		OpenGL.glMultiTexCoord2f(33985, this.aClass73_Sub1_Sub1_1.aFloat21, 0.0F);
		OpenGL.glTexCoord2f(this.aClass73_Sub1_Sub1_1.aFloat21, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass73_Sub1_Sub1_1.anInt2345, this.aClass73_Sub1_Sub1_1.anInt2344 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass73_Sub1_Sub1_1.aFloat21, this.aClass73_Sub1_Sub1_1.aFloat20);
		OpenGL.glTexCoord2f(this.aClass73_Sub1_Sub1_1.aFloat21, this.aClass73_Sub1_Sub1_1.aFloat20);
		OpenGL.glVertex2i(this.aClass73_Sub1_Sub1_1.anInt2345 + local37, local42);
		OpenGL.glEnd();
		this.method236();
	}

	@OriginalMember(owner = "client!ab", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt83 = arg3;
		this.anInt92 = arg1;
		this.anInt84 = arg0;
		this.anInt100 = arg2;
		this.aBoolean6 = this.anInt84 != 0 || this.anInt92 != 0 || this.anInt100 != 0 || this.anInt83 != 0;
	}

	@OriginalMember(owner = "client!ab", name = "la", descriptor = "()I")
	@Override
	public int la() {
		return this.aClass73_Sub1_Sub1_1.anInt2344;
	}

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "(IIIIIII)V")
	@Override
	public void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		@Pc(13) int local13 = arg1 + arg3;
		this.aClass73_Sub1_Sub1_1.method6348(false);
		this.aClass122_Sub3_1.method6864();
		this.aClass122_Sub3_1.method6850(this.aClass73_Sub1_Sub1_1);
		this.aClass122_Sub3_1.method6871(arg6);
		this.aClass122_Sub3_1.method6875(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass73_Sub1_Sub1_1.aBoolean149 && !this.aBoolean6) {
			@Pc(72) float local72 = this.aClass73_Sub1_Sub1_1.aFloat20 * (float) arg3 / (float) this.aClass73_Sub1_Sub1_1.anInt2344;
			@Pc(84) float local84 = (float) arg2 * this.aClass73_Sub1_Sub1_1.aFloat21 / (float) this.aClass73_Sub1_Sub1_1.anInt2345;
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
		OpenGL.glTranslatef((float) this.anInt84, (float) this.anInt92, 0.0F);
		@Pc(124) int local124 = this.EA();
		@Pc(127) int local127 = this.ma();
		@Pc(134) int local134 = arg1 + this.aClass73_Sub1_Sub1_1.anInt2344;
		OpenGL.glBegin(7);
		@Pc(138) int local138 = arg1;
		@Pc(146) int local146;
		while (local13 >= local134) {
			local146 = this.aClass73_Sub1_Sub1_1.anInt2345 + arg0;
			@Pc(148) int local148 = arg0;
			while (local9 >= local146) {
				OpenGL.glTexCoord2f(0.0F, this.aClass73_Sub1_Sub1_1.aFloat20);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(this.aClass73_Sub1_Sub1_1.aFloat21, 0.0F);
				OpenGL.glVertex2i(local146, local134);
				OpenGL.glTexCoord2f(this.aClass73_Sub1_Sub1_1.aFloat21, this.aClass73_Sub1_Sub1_1.aFloat20);
				OpenGL.glVertex2i(local146, local138);
				local148 += local124;
				local146 += local124;
			}
			if (local9 > local148) {
				@Pc(214) float local214 = (float) (local9 - local148) * this.aClass73_Sub1_Sub1_1.aFloat21 / (float) this.aClass73_Sub1_Sub1_1.anInt2345;
				OpenGL.glTexCoord2f(0.0F, this.aClass73_Sub1_Sub1_1.aFloat20);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(local214, 0.0F);
				OpenGL.glVertex2i(local9, local134);
				OpenGL.glTexCoord2f(local214, this.aClass73_Sub1_Sub1_1.aFloat20);
				OpenGL.glVertex2i(local9, local138);
			}
			local134 += local127;
			local138 += local127;
		}
		if (local13 > local138) {
			@Pc(279) float local279 = this.aClass73_Sub1_Sub1_1.aFloat20 * (float) (local138 + this.aClass73_Sub1_Sub1_1.anInt2344 - local13) / (float) this.aClass73_Sub1_Sub1_1.anInt2344;
			@Pc(285) int local285 = this.aClass73_Sub1_Sub1_1.anInt2345 + arg0;
			local146 = arg0;
			while (local285 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass73_Sub1_Sub1_1.aFloat20);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local279);
				OpenGL.glVertex2i(local146, local13);
				OpenGL.glTexCoord2f(this.aClass73_Sub1_Sub1_1.aFloat21, local279);
				OpenGL.glVertex2i(local285, local13);
				OpenGL.glTexCoord2f(this.aClass73_Sub1_Sub1_1.aFloat21, this.aClass73_Sub1_Sub1_1.aFloat20);
				OpenGL.glVertex2i(local285, local138);
				local285 += local124;
				local146 += local124;
			}
			if (local146 < local9) {
				@Pc(358) float local358 = (float) (local9 - local146) * this.aClass73_Sub1_Sub1_1.aFloat21 / (float) this.aClass73_Sub1_Sub1_1.anInt2345;
				OpenGL.glTexCoord2f(0.0F, this.aClass73_Sub1_Sub1_1.aFloat20);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local279);
				OpenGL.glVertex2i(local146, local13);
				OpenGL.glTexCoord2f(local358, local279);
				OpenGL.glVertex2i(local9, local13);
				OpenGL.glTexCoord2f(local358, this.aClass73_Sub1_Sub1_1.aFloat20);
				OpenGL.glVertex2i(local9, local138);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILclient!pa;II)V")
	@Override
	public void method7365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class40_Sub2 local6 = (Class40_Sub2) arg2;
		@Pc(9) Class73_Sub1_Sub1 local9 = local6.aClass73_Sub1_Sub1_3;
		this.aClass73_Sub1_Sub1_1.method6348(false);
		this.aClass122_Sub3_1.method6864();
		this.aClass122_Sub3_1.method6850(this.aClass73_Sub1_Sub1_1);
		this.aClass122_Sub3_1.method6875(1);
		this.aClass122_Sub3_1.method6932(1);
		this.aClass122_Sub3_1.method6850(local9);
		this.aClass122_Sub3_1.method6853(7681, 8448);
		this.aClass122_Sub3_1.method6899(768, 0, 34168);
		this.aClass122_Sub3_1.method6871(1);
		@Pc(62) int local62 = arg1 + this.anInt92;
		@Pc(67) int local67 = arg0 + this.anInt84;
		@Pc(73) int local73 = this.aClass73_Sub1_Sub1_1.anInt2345 + local67;
		@Pc(79) int local79 = local62 + this.aClass73_Sub1_Sub1_1.anInt2344;
		@Pc(86) float local86 = local9.aFloat21 / (float) local9.anInt2345;
		@Pc(93) float local93 = local9.aFloat20 / (float) local9.anInt2344;
		@Pc(101) float local101 = local86 * (float) (local67 - arg3);
		@Pc(109) float local109 = (float) (local73 - arg3) * local86;
		@Pc(119) float local119 = local9.aFloat20 - local93 * (float) (local62 - arg4);
		@Pc(130) float local130 = local9.aFloat20 - (float) (local79 - arg4) * local93;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass73_Sub1_Sub1_1.aFloat20);
		OpenGL.glMultiTexCoord2f(33985, local101, local119);
		OpenGL.glVertex2i(local67, local62);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local130);
		OpenGL.glVertex2i(local67, local62 + this.aClass73_Sub1_Sub1_1.anInt2344);
		OpenGL.glMultiTexCoord2f(33984, this.aClass73_Sub1_Sub1_1.aFloat21, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local130);
		OpenGL.glVertex2i(local67 + this.aClass73_Sub1_Sub1_1.anInt2345, this.aClass73_Sub1_Sub1_1.anInt2344 + local62);
		OpenGL.glMultiTexCoord2f(33984, this.aClass73_Sub1_Sub1_1.aFloat21, this.aClass73_Sub1_Sub1_1.aFloat20);
		OpenGL.glMultiTexCoord2f(33985, local109, local119);
		OpenGL.glVertex2i(local67 + this.aClass73_Sub1_Sub1_1.anInt2345, local62);
		OpenGL.glEnd();
		this.aClass122_Sub3_1.method6899(768, 0, 5890);
		this.aClass122_Sub3_1.method6875(0);
		this.aClass122_Sub3_1.method6850(null);
		this.aClass122_Sub3_1.method6932(0);
	}

	@OriginalMember(owner = "client!ab", name = "BA", descriptor = "(III)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass73_Sub1_Sub1_2 = Static72.method1277(arg1, arg0, this.aClass73_Sub1_Sub1_1.anInt2345, this.aClass122_Sub3_1, this.aClass73_Sub1_Sub1_1.anInt2344);
		this.anInt85 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	private void method236() {
		this.aClass122_Sub3_1.method6932(1);
		this.aClass122_Sub3_1.method6850(null);
		this.aClass122_Sub3_1.method6853(8448, 8448);
		this.aClass122_Sub3_1.method6899(768, 1, 34168);
		this.aClass122_Sub3_1.method6913(5890, 0);
		this.aClass122_Sub3_1.method6932(0);
		this.aClass122_Sub3_1.method6899(768, 1, 34168);
	}

	@OriginalMember(owner = "client!ab", name = "CA", descriptor = "(FFFFFFIII)V")
	@Override
	protected void CA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean6) {
			local6 = this.EA();
			local10 = this.ma();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = (float) this.anInt92 * local28;
			@Pc(46) float local46 = (float) this.anInt92 * local34;
			@Pc(52) float local52 = (float) this.anInt84 * local16;
			@Pc(58) float local58 = (float) this.anInt84 * local22;
			@Pc(65) float local65 = -local16 * (float) this.anInt100;
			@Pc(72) float local72 = -local22 * (float) this.anInt100;
			@Pc(79) float local79 = (float) this.anInt83 * -local28;
			@Pc(86) float local86 = (float) this.anInt83 * -local34;
			arg3 = local46 + arg3 + local72;
			arg4 = local79 + arg4 + local52;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = local65 + arg2 + local40;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg2 + arg4 - arg0;
		this.aClass73_Sub1_Sub1_1.method6348(true);
		local10 = arg5 + arg3 - arg1;
		this.aClass122_Sub3_1.method6864();
		this.aClass122_Sub3_1.method6850(this.aClass73_Sub1_Sub1_1);
		this.aClass122_Sub3_1.method6871(arg8);
		this.aClass122_Sub3_1.method6875(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass73_Sub1_Sub1_1.aFloat20);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass73_Sub1_Sub1_1.aFloat21, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass73_Sub1_Sub1_1.aFloat21, this.aClass73_Sub1_Sub1_1.aFloat20);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(FFFFFFLclient!pa;II)V")
	@Override
	protected void method7362(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class40 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class73_Sub1_Sub1 local7 = ((Class40_Sub2) arg6).aClass73_Sub1_Sub1_3;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(24) float local24;
		@Pc(31) float local31;
		if (this.aBoolean6) {
			local14 = this.EA();
			local18 = this.ma();
			local24 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = (float) this.anInt92 * local38;
			@Pc(56) float local56 = local44 * (float) this.anInt92;
			@Pc(62) float local62 = (float) this.anInt84 * local24;
			@Pc(68) float local68 = (float) this.anInt84 * local31;
			@Pc(75) float local75 = (float) this.anInt100 * -local24;
			@Pc(82) float local82 = (float) this.anInt100 * -local31;
			@Pc(89) float local89 = -local38 * (float) this.anInt83;
			arg2 = arg2 + local75 + local50;
			arg1 = arg1 + local68 + local56;
			arg3 = arg3 + local82 + local56;
			@Pc(114) float local114 = (float) this.anInt83 * -local44;
			arg0 = local62 + arg0 + local50;
			arg4 = local62 + arg4 + local89;
			arg5 = local114 + local68 + arg5;
		}
		local14 = arg4 + arg2 - arg0;
		local18 = arg3 + arg5 - arg1;
		this.aClass73_Sub1_Sub1_1.method6348(true);
		this.aClass122_Sub3_1.method6864();
		this.aClass122_Sub3_1.method6850(this.aClass73_Sub1_Sub1_1);
		this.aClass122_Sub3_1.method6875(1);
		this.aClass122_Sub3_1.method6932(1);
		this.aClass122_Sub3_1.method6850(local7);
		this.aClass122_Sub3_1.method6853(7681, 8448);
		this.aClass122_Sub3_1.method6899(768, 0, 34168);
		this.aClass122_Sub3_1.method6871(1);
		local24 = local7.aFloat21 / (float) local7.anInt2345;
		local31 = local7.aFloat20 / (float) local7.anInt2344;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass73_Sub1_Sub1_1.aFloat20);
		OpenGL.glMultiTexCoord2f(33985, local24 * (arg0 - (float) arg7), local7.aFloat20 - (arg1 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg4) * local24, local7.aFloat20 - ((float) -arg8 + arg5) * local31);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass73_Sub1_Sub1_1.aFloat21, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (local14 - (float) arg7) * local24, local7.aFloat20 - ((float) -arg8 + local18) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass73_Sub1_Sub1_1.aFloat21, this.aClass73_Sub1_Sub1_1.aFloat20);
		OpenGL.glMultiTexCoord2f(33985, local24 * ((float) -arg7 + arg2), local7.aFloat20 - local31 * (arg3 - (float) arg8));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass122_Sub3_1.method6899(768, 0, 5890);
		this.aClass122_Sub3_1.method6875(0);
		this.aClass122_Sub3_1.method6850(null);
		this.aClass122_Sub3_1.method6932(0);
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "()I")
	@Override
	public int c() {
		return this.aClass73_Sub1_Sub1_1.anInt2345;
	}

	@OriginalMember(owner = "client!ab", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass73_Sub1_Sub1_1.method1955(arg0, arg2, arg1, arg5, arg4, arg3);
	}

	@OriginalMember(owner = "client!ab", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		return this.aClass73_Sub1_Sub1_1.anInt2344 + this.anInt92 + this.anInt83;
	}

	@OriginalMember(owner = "client!ab", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		return this.aClass73_Sub1_Sub1_1.anInt2345 + this.anInt84 + this.anInt100;
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(II)V")
	private void method238(@OriginalArg(0) int arg0) {
		this.aClass122_Sub3_1.method6932(1);
		this.aClass122_Sub3_1.method6850(this.aClass73_Sub1_Sub1_1);
		this.aClass122_Sub3_1.method6853(this.aClass122_Sub3_1.method6886(arg0), 7681);
		this.aClass122_Sub3_1.method6899(768, 1, 34167);
		this.aClass122_Sub3_1.method6913(34168, 0);
		this.aClass122_Sub3_1.method6932(0);
		this.aClass122_Sub3_1.method6850(this.aClass73_Sub1_Sub1_2);
		this.aClass122_Sub3_1.method6853(34479, 7681);
		this.aClass122_Sub3_1.method6899(768, 1, 34166);
		if (this.anInt85 == 0) {
			this.aClass122_Sub3_1.method6887(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt85 == 1) {
			this.aClass122_Sub3_1.method6887(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt85 == 2) {
			this.aClass122_Sub3_1.method6887(0.5F, 0.5F, 0.0F, 1.0F);
			return;
		} else if (this.anInt85 == 3) {
			this.aClass122_Sub3_1.method6887(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}
}
