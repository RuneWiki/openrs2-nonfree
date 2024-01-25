import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class80_Sub1 extends Class80 {

	@OriginalMember(owner = "client!fl", name = "l", descriptor = "Lclient!al;")
	private Class4_Sub1_Sub1 aClass4_Sub1_Sub1_4;

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
	private int anInt2365 = 0;

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
	private int anInt2372 = 0;

	@OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
	private int anInt2379 = 0;

	@OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
	private int anInt2381 = 0;

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "Z")
	private boolean aBoolean145 = false;

	@OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
	private int anInt2378 = 0;

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "Lclient!da;")
	private final Class50_Sub1 aClass50_Sub1_17;

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "Lclient!al;")
	private final Class4_Sub1_Sub1 aClass4_Sub1_Sub1_3;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!da;IIII)V")
	public Class80_Sub1(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass50_Sub1_17 = arg0;
		this.aClass4_Sub1_Sub1_3 = Static85.method6102(arg0, arg3, arg4, arg2, arg1);
	}

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!da;II[III)V")
	public Class80_Sub1(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass50_Sub1_17 = arg0;
		this.aClass4_Sub1_Sub1_3 = Static85.method6092(arg0, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!fl", name = "ya", descriptor = "(IIIIIII)V")
	@Override
	public void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass4_Sub1_Sub1_3.method4580(true);
		this.aClass50_Sub1_17.method1271();
		this.aClass50_Sub1_17.method1279(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean145) {
			@Pc(42) float local42 = (float) arg2 / (float) this.RA();
			@Pc(49) float local49 = (float) arg3 / (float) this.Q();
			@Pc(58) float local58 = (float) arg0 + local42 * (float) this.anInt2378;
			@Pc(67) float local67 = local49 * (float) this.anInt2379 + (float) arg1;
			@Pc(76) float local76 = local58 + local42 * (float) this.aClass4_Sub1_Sub1_3.anInt214;
			@Pc(85) float local85 = local67 + (float) this.aClass4_Sub1_Sub1_3.anInt216 * local49;
			if (this.aClass4_Sub1_Sub1_4 == null) {
				this.aClass50_Sub1_17.method1295(this.aClass4_Sub1_Sub1_3);
				this.aClass50_Sub1_17.method1256(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat3);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat4, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat4, this.aClass4_Sub1_Sub1_3.aFloat3);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
			} else {
				this.method2043(arg4);
				this.aClass4_Sub1_Sub1_4.method4580(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass4_Sub1_Sub1_3.aFloat3);
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat3);
				OpenGL.glVertex2f(local58, local67);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local58, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub1_Sub1_3.aFloat4, 0.0F);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat4, 0.0F);
				OpenGL.glVertex2f(local76, local85);
				OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub1_Sub1_3.aFloat4, this.aClass4_Sub1_Sub1_3.aFloat3);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat4, this.aClass4_Sub1_Sub1_3.aFloat3);
				OpenGL.glVertex2f(local76, local67);
				OpenGL.glEnd();
				this.method2048();
			}
		} else if (this.aClass4_Sub1_Sub1_4 == null) {
			this.aClass50_Sub1_17.method1295(this.aClass4_Sub1_Sub1_3);
			this.aClass50_Sub1_17.method1256(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat3);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat4, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
			OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat4, this.aClass4_Sub1_Sub1_3.aFloat3);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method2043(arg4);
			this.aClass4_Sub1_Sub1_4.method4580(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass4_Sub1_Sub1_3.aFloat3);
			OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat3);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub1_Sub1_3.aFloat4, 0.0F);
			OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat4, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub1_Sub1_3.aFloat4, this.aClass4_Sub1_Sub1_3.aFloat3);
			OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat4, this.aClass4_Sub1_Sub1_3.aFloat3);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method2048();
		}
	}

	@OriginalMember(owner = "client!fl", name = "la", descriptor = "(IIIIIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		@Pc(13) int local13 = arg3 + arg1;
		this.aClass4_Sub1_Sub1_3.method4580(false);
		this.aClass50_Sub1_17.method1271();
		this.aClass50_Sub1_17.method1295(this.aClass4_Sub1_Sub1_3);
		this.aClass50_Sub1_17.method1279(arg6);
		this.aClass50_Sub1_17.method1256(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass4_Sub1_Sub1_3.aBoolean16 && !this.aBoolean145) {
			@Pc(72) float local72 = (float) arg3 * this.aClass4_Sub1_Sub1_3.aFloat3 / (float) this.aClass4_Sub1_Sub1_3.anInt216;
			@Pc(84) float local84 = this.aClass4_Sub1_Sub1_3.aFloat4 * (float) arg2 / (float) this.aClass4_Sub1_Sub1_3.anInt214;
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
		OpenGL.glTranslatef((float) this.anInt2378, (float) this.anInt2379, 0.0F);
		@Pc(124) int local124 = this.RA();
		@Pc(127) int local127 = this.Q();
		@Pc(134) int local134 = arg1 + this.aClass4_Sub1_Sub1_3.anInt216;
		OpenGL.glBegin(7);
		@Pc(138) int local138 = arg1;
		@Pc(146) int local146;
		while (local13 >= local134) {
			local146 = this.aClass4_Sub1_Sub1_3.anInt214 + arg0;
			@Pc(148) int local148 = arg0;
			while (local146 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat3);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat4, 0.0F);
				OpenGL.glVertex2i(local146, local134);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat4, this.aClass4_Sub1_Sub1_3.aFloat3);
				OpenGL.glVertex2i(local146, local138);
				local148 += local124;
				local146 += local124;
			}
			if (local148 < local9) {
				@Pc(210) float local210 = (float) (local9 - local148) * this.aClass4_Sub1_Sub1_3.aFloat4 / (float) this.aClass4_Sub1_Sub1_3.anInt214;
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat3);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(local210, 0.0F);
				OpenGL.glVertex2i(local9, local134);
				OpenGL.glTexCoord2f(local210, this.aClass4_Sub1_Sub1_3.aFloat3);
				OpenGL.glVertex2i(local9, local138);
			}
			local134 += local127;
			local138 += local127;
		}
		if (local138 < local13) {
			@Pc(275) float local275 = (float) (this.aClass4_Sub1_Sub1_3.anInt216 + local138 - local13) * this.aClass4_Sub1_Sub1_3.aFloat3 / (float) this.aClass4_Sub1_Sub1_3.anInt216;
			@Pc(281) int local281 = arg0 + this.aClass4_Sub1_Sub1_3.anInt214;
			local146 = arg0;
			while (local9 >= local281) {
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat3);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local275);
				OpenGL.glVertex2i(local146, local13);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat4, local275);
				OpenGL.glVertex2i(local281, local13);
				OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat4, this.aClass4_Sub1_Sub1_3.aFloat3);
				OpenGL.glVertex2i(local281, local138);
				local281 += local124;
				local146 += local124;
			}
			if (local146 < local9) {
				@Pc(354) float local354 = (float) (local9 - local146) * this.aClass4_Sub1_Sub1_3.aFloat4 / (float) this.aClass4_Sub1_Sub1_3.anInt214;
				OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat3);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local275);
				OpenGL.glVertex2i(local146, local13);
				OpenGL.glTexCoord2f(local354, local275);
				OpenGL.glVertex2i(local9, local13);
				OpenGL.glTexCoord2f(local354, this.aClass4_Sub1_Sub1_3.aFloat3);
				OpenGL.glVertex2i(local9, local138);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)V")
	private void method2043(@OriginalArg(1) int arg0) {
		this.aClass50_Sub1_17.method1300(1);
		this.aClass50_Sub1_17.method1295(this.aClass4_Sub1_Sub1_3);
		this.aClass50_Sub1_17.method1316(this.aClass50_Sub1_17.method1270(arg0), 7681);
		this.aClass50_Sub1_17.method1309(1, 34167, 768);
		this.aClass50_Sub1_17.method1275(34168, 0);
		this.aClass50_Sub1_17.method1300(0);
		this.aClass50_Sub1_17.method1295(this.aClass4_Sub1_Sub1_4);
		this.aClass50_Sub1_17.method1316(34479, 7681);
		this.aClass50_Sub1_17.method1309(1, 34166, 768);
		if (this.anInt2365 == 0) {
			this.aClass50_Sub1_17.method1308(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt2365 == 1) {
			this.aClass50_Sub1_17.method1308(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt2365 == 2) {
			this.aClass50_Sub1_17.method1308(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt2365 == 3) {
			this.aClass50_Sub1_17.method1308(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!fl", name = "XA", descriptor = "(IIIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass4_Sub1_Sub1_3.method158(arg0, arg1, arg3, arg2, arg4, arg5);
	}

	@OriginalMember(owner = "client!fl", name = "W", descriptor = "(IIIII)V")
	@Override
	public void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass4_Sub1_Sub1_3.method4580(false);
		this.aClass50_Sub1_17.method1271();
		this.aClass50_Sub1_17.method1279(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt2378;
		@Pc(42) int local42 = arg1 + this.anInt2379;
		if (this.aClass4_Sub1_Sub1_4 == null) {
			this.aClass50_Sub1_17.method1295(this.aClass4_Sub1_Sub1_3);
			this.aClass50_Sub1_17.method1256(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat3);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, local42 + this.aClass4_Sub1_Sub1_3.anInt216);
			OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat4, 0.0F);
			OpenGL.glVertex2i(local37 + this.aClass4_Sub1_Sub1_3.anInt214, this.aClass4_Sub1_Sub1_3.anInt216 + local42);
			OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat4, this.aClass4_Sub1_Sub1_3.aFloat3);
			OpenGL.glVertex2i(local37 + this.aClass4_Sub1_Sub1_3.anInt214, local42);
			OpenGL.glEnd();
			return;
		}
		this.method2043(arg2);
		this.aClass4_Sub1_Sub1_4.method4580(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass4_Sub1_Sub1_3.aFloat3);
		OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat3);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, this.aClass4_Sub1_Sub1_3.anInt216 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub1_Sub1_3.aFloat4, 0.0F);
		OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat4, 0.0F);
		OpenGL.glVertex2i(local37 + this.aClass4_Sub1_Sub1_3.anInt214, local42 - -this.aClass4_Sub1_Sub1_3.anInt216);
		OpenGL.glMultiTexCoord2f(33985, this.aClass4_Sub1_Sub1_3.aFloat4, this.aClass4_Sub1_Sub1_3.aFloat3);
		OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat4, this.aClass4_Sub1_Sub1_3.aFloat3);
		OpenGL.glVertex2i(local37 + this.aClass4_Sub1_Sub1_3.anInt214, local42);
		OpenGL.glEnd();
		this.method2048();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IILclient!ta;II)V")
	@Override
	public void method5562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class49 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class49_Sub2 local6 = (Class49_Sub2) arg2;
		@Pc(9) Class4_Sub1_Sub1 local9 = local6.aClass4_Sub1_Sub1_5;
		this.aClass4_Sub1_Sub1_3.method4580(false);
		this.aClass50_Sub1_17.method1271();
		this.aClass50_Sub1_17.method1295(this.aClass4_Sub1_Sub1_3);
		this.aClass50_Sub1_17.method1256(1);
		this.aClass50_Sub1_17.method1300(1);
		this.aClass50_Sub1_17.method1295(local9);
		this.aClass50_Sub1_17.method1316(7681, 8448);
		this.aClass50_Sub1_17.method1309(0, 34168, 768);
		this.aClass50_Sub1_17.method1279(1);
		@Pc(62) int local62 = arg0 + this.anInt2378;
		@Pc(67) int local67 = arg1 + this.anInt2379;
		@Pc(73) int local73 = this.aClass4_Sub1_Sub1_3.anInt214 + local62;
		@Pc(79) int local79 = this.aClass4_Sub1_Sub1_3.anInt216 + local67;
		@Pc(86) float local86 = local9.aFloat4 / (float) local9.anInt214;
		@Pc(93) float local93 = local9.aFloat3 / (float) local9.anInt216;
		@Pc(101) float local101 = (float) (local62 - arg3) * local86;
		@Pc(108) float local108 = (float) (local73 - arg3) * local86;
		@Pc(120) float local120 = local9.aFloat3 - (float) (local67 - arg4) * local93;
		@Pc(132) float local132 = local9.aFloat3 - (float) (local79 - arg4) * local93;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass4_Sub1_Sub1_3.aFloat3);
		OpenGL.glMultiTexCoord2f(33985, local101, local120);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local132);
		OpenGL.glVertex2i(local62, local67 + this.aClass4_Sub1_Sub1_3.anInt216);
		OpenGL.glMultiTexCoord2f(33984, this.aClass4_Sub1_Sub1_3.aFloat4, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local108, local132);
		OpenGL.glVertex2i(this.aClass4_Sub1_Sub1_3.anInt214 + local62, local67 - -this.aClass4_Sub1_Sub1_3.anInt216);
		OpenGL.glMultiTexCoord2f(33984, this.aClass4_Sub1_Sub1_3.aFloat4, this.aClass4_Sub1_Sub1_3.aFloat3);
		OpenGL.glMultiTexCoord2f(33985, local108, local120);
		OpenGL.glVertex2i(local62 + this.aClass4_Sub1_Sub1_3.anInt214, local67);
		OpenGL.glEnd();
		this.aClass50_Sub1_17.method1309(0, 5890, 768);
		this.aClass50_Sub1_17.method1256(0);
		this.aClass50_Sub1_17.method1295(null);
		this.aClass50_Sub1_17.method1300(0);
	}

	@OriginalMember(owner = "client!fl", name = "H", descriptor = "(FFFFFFIII)V")
	@Override
	protected void H(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(10) float local10;
		@Pc(14) float local14;
		if (this.aBoolean145) {
			local10 = this.RA();
			local14 = this.Q();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			@Pc(26) float local26 = (arg3 - arg1) / local10;
			@Pc(33) float local33 = (arg4 - arg0) / local14;
			@Pc(40) float local40 = (arg5 - arg1) / local14;
			@Pc(46) float local46 = local33 * (float) this.anInt2379;
			@Pc(52) float local52 = local40 * (float) this.anInt2379;
			@Pc(58) float local58 = local20 * (float) this.anInt2378;
			@Pc(64) float local64 = local26 * (float) this.anInt2378;
			@Pc(71) float local71 = (float) this.anInt2381 * -local20;
			@Pc(78) float local78 = (float) this.anInt2381 * -local26;
			@Pc(85) float local85 = (float) this.anInt2372 * -local33;
			arg4 = local58 + arg4 + local85;
			arg1 = local52 + local64 + arg1;
			arg0 = local46 + arg0 + local58;
			@Pc(110) float local110 = (float) this.anInt2372 * -local40;
			arg2 = local71 + arg2 + local46;
			arg3 = arg3 + local78 + local52;
			arg5 = local110 + local64 + arg5;
		}
		local10 = arg2 + arg4 - arg0;
		local14 = arg3 + arg5 - arg1;
		this.aClass4_Sub1_Sub1_3.method4580(true);
		this.aClass50_Sub1_17.method1271();
		this.aClass50_Sub1_17.method1295(this.aClass4_Sub1_Sub1_3);
		this.aClass50_Sub1_17.method1279(arg8);
		this.aClass50_Sub1_17.method1256(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass4_Sub1_Sub1_3.aFloat3);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat4, 0.0F);
		OpenGL.glVertex2f(local10, local14);
		OpenGL.glTexCoord2f(this.aClass4_Sub1_Sub1_3.aFloat4, this.aClass4_Sub1_Sub1_3.aFloat3);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!fl", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		return this.anInt2381 + this.aClass4_Sub1_Sub1_3.anInt214 + this.anInt2378;
	}

	@OriginalMember(owner = "client!fl", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return this.aClass4_Sub1_Sub1_3.anInt214;
	}

	@OriginalMember(owner = "client!fl", name = "Q", descriptor = "()I")
	@Override
	public int Q() {
		return this.aClass4_Sub1_Sub1_3.anInt216 + this.anInt2379 + this.anInt2372;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
	private void method2048() {
		this.aClass50_Sub1_17.method1300(1);
		this.aClass50_Sub1_17.method1295(null);
		this.aClass50_Sub1_17.method1316(8448, 8448);
		this.aClass50_Sub1_17.method1309(1, 34168, 768);
		this.aClass50_Sub1_17.method1275(5890, 0);
		this.aClass50_Sub1_17.method1300(0);
		this.aClass50_Sub1_17.method1309(1, 34168, 768);
	}

	@OriginalMember(owner = "client!fl", name = "ha", descriptor = "(IIII)V")
	@Override
	public void ha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2378 = arg0;
		this.anInt2372 = arg3;
		this.anInt2379 = arg1;
		this.anInt2381 = arg2;
		this.aBoolean145 = this.anInt2378 != 0 || this.anInt2379 != 0 || this.anInt2381 != 0 || this.anInt2372 != 0;
	}

	@OriginalMember(owner = "client!fl", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		return this.aClass4_Sub1_Sub1_3.anInt216;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(FFFFFFLclient!ta;II)V")
	@Override
	protected void method5557(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class49 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class4_Sub1_Sub1 local7 = ((Class49_Sub2) arg6).aClass4_Sub1_Sub1_5;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(31) float local31;
		if (this.aBoolean145) {
			local14 = this.RA();
			local18 = this.Q();
			local25 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = local38 * (float) this.anInt2379;
			@Pc(56) float local56 = local44 * (float) this.anInt2379;
			@Pc(62) float local62 = (float) this.anInt2378 * local25;
			@Pc(68) float local68 = local31 * (float) this.anInt2378;
			@Pc(75) float local75 = -local25 * (float) this.anInt2381;
			@Pc(82) float local82 = (float) this.anInt2381 * -local31;
			@Pc(89) float local89 = -local38 * (float) this.anInt2372;
			arg3 = local56 + arg3 + local82;
			arg0 = local62 + arg0 + local50;
			@Pc(108) float local108 = -local44 * (float) this.anInt2372;
			arg4 = arg4 + local62 + local89;
			arg1 = local56 + local68 + arg1;
			arg2 = arg2 + local75 + local50;
			arg5 = local108 + arg5 + local68;
		}
		local14 = arg2 + arg4 - arg0;
		this.aClass4_Sub1_Sub1_3.method4580(true);
		local18 = arg5 + arg3 - arg1;
		this.aClass50_Sub1_17.method1271();
		this.aClass50_Sub1_17.method1295(this.aClass4_Sub1_Sub1_3);
		this.aClass50_Sub1_17.method1256(1);
		this.aClass50_Sub1_17.method1300(1);
		this.aClass50_Sub1_17.method1295(local7);
		this.aClass50_Sub1_17.method1316(7681, 8448);
		this.aClass50_Sub1_17.method1309(0, 34168, 768);
		this.aClass50_Sub1_17.method1279(1);
		local25 = local7.aFloat4 / (float) local7.anInt214;
		local31 = local7.aFloat3 / (float) local7.anInt216;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass4_Sub1_Sub1_3.aFloat3);
		OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * local25, local7.aFloat3 - local31 * (arg1 - (float) arg8));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg4) * local25, local7.aFloat3 - local31 * ((float) -arg8 + arg5));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass4_Sub1_Sub1_3.aFloat4, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + local14), local7.aFloat3 - ((float) -arg8 + local18) * local31);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass4_Sub1_Sub1_3.aFloat4, this.aClass4_Sub1_Sub1_3.aFloat3);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg2), local7.aFloat3 - (arg3 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass50_Sub1_17.method1309(0, 5890, 768);
		this.aClass50_Sub1_17.method1256(0);
		this.aClass50_Sub1_17.method1295(null);
		this.aClass50_Sub1_17.method1300(0);
	}

	@OriginalMember(owner = "client!fl", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass4_Sub1_Sub1_4 = Static85.method6102(this.aClass50_Sub1_17, this.aClass4_Sub1_Sub1_3.anInt214, this.aClass4_Sub1_Sub1_3.anInt216, arg1, arg0);
		this.anInt2365 = arg2;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}
}
