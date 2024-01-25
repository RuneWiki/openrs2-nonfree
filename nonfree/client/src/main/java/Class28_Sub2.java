import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class28_Sub2 extends Class28 {

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "Lclient!sb;")
	private Class167_Sub3_Sub1 aClass167_Sub3_Sub1_1;

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "I")
	private int anInt1848 = 0;

	@OriginalMember(owner = "client!dda", name = "k", descriptor = "Z")
	private boolean aBoolean133 = false;

	@OriginalMember(owner = "client!dda", name = "l", descriptor = "I")
	private int anInt1852 = 0;

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "I")
	private int anInt1847 = 0;

	@OriginalMember(owner = "client!dda", name = "x", descriptor = "I")
	private int anInt1864 = 0;

	@OriginalMember(owner = "client!dda", name = "s", descriptor = "I")
	private int anInt1859 = 0;

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "Lclient!rs;")
	private final Class133_Sub3 aClass133_Sub3_4;

	@OriginalMember(owner = "client!dda", name = "A", descriptor = "Lclient!sb;")
	private final Class167_Sub3_Sub1 aClass167_Sub3_Sub1_2;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!rs;IIZ)V")
	public Class28_Sub2(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass133_Sub3_4 = arg0;
		this.aClass167_Sub3_Sub1_2 = Static159.method8530(arg0, arg2, arg3 ? 6408 : 6407, arg1);
	}

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!rs;IIII)V")
	public Class28_Sub2(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass133_Sub3_4 = arg0;
		this.aClass167_Sub3_Sub1_2 = Static152.method2231(arg4, arg1, arg2, arg0, arg3);
	}

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!rs;II[III)V")
	public Class28_Sub2(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass133_Sub3_4 = arg0;
		this.aClass167_Sub3_Sub1_2 = Static218.method3709(arg2, arg1, arg3, arg0, arg5, arg4);
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(II)V")
	private void method1538(@OriginalArg(0) int arg0) {
		this.aClass133_Sub3_4.method7368(1);
		this.aClass133_Sub3_4.method7375(this.aClass167_Sub3_Sub1_2);
		this.aClass133_Sub3_4.method7342(7681, this.aClass133_Sub3_4.method7324(arg0));
		this.aClass133_Sub3_4.method7326(1, 34167, 768);
		this.aClass133_Sub3_4.method7347(34168, 0);
		this.aClass133_Sub3_4.method7368(0);
		this.aClass133_Sub3_4.method7375(this.aClass167_Sub3_Sub1_1);
		this.aClass133_Sub3_4.method7342(7681, 34479);
		this.aClass133_Sub3_4.method7326(1, 34166, 768);
		if (this.anInt1859 == 0) {
			this.aClass133_Sub3_4.method7397(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt1859 == 1) {
			this.aClass133_Sub3_4.method7397(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt1859 == 2) {
			this.aClass133_Sub3_4.method7397(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt1859 == 3) {
			this.aClass133_Sub3_4.method7397(128.5F, 128.5F, 128.5F, 0.0F);
			return;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass167_Sub3_Sub1_2.method8013(false);
		this.aClass133_Sub3_4.method7369();
		this.aClass133_Sub3_4.method7388(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt1848;
		@Pc(42) int local42 = arg0 + this.anInt1852;
		if (this.aClass167_Sub3_Sub1_1 == null) {
			this.aClass133_Sub3_4.method7375(this.aClass167_Sub3_Sub1_2);
			this.aClass133_Sub3_4.method7401(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass167_Sub3_Sub1_2.aFloat170);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, local37 + this.aClass167_Sub3_Sub1_2.anInt8742);
			OpenGL.glTexCoord2f(this.aClass167_Sub3_Sub1_2.aFloat171, 0.0F);
			OpenGL.glVertex2i(local42 + this.aClass167_Sub3_Sub1_2.anInt8741, this.aClass167_Sub3_Sub1_2.anInt8742 + local37);
			OpenGL.glTexCoord2f(this.aClass167_Sub3_Sub1_2.aFloat171, this.aClass167_Sub3_Sub1_2.aFloat170);
			OpenGL.glVertex2i(this.aClass167_Sub3_Sub1_2.anInt8741 + local42, local37);
			OpenGL.glEnd();
			return;
		}
		this.method1538(arg2);
		this.aClass167_Sub3_Sub1_1.method8013(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass167_Sub3_Sub1_2.aFloat170);
		OpenGL.glTexCoord2f(0.0F, this.aClass167_Sub3_Sub1_2.aFloat170);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, this.aClass167_Sub3_Sub1_2.anInt8742 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass167_Sub3_Sub1_2.aFloat171, 0.0F);
		OpenGL.glTexCoord2f(this.aClass167_Sub3_Sub1_2.aFloat171, 0.0F);
		OpenGL.glVertex2i(this.aClass167_Sub3_Sub1_2.anInt8741 + local42, this.aClass167_Sub3_Sub1_2.anInt8742 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass167_Sub3_Sub1_2.aFloat171, this.aClass167_Sub3_Sub1_2.aFloat170);
		OpenGL.glTexCoord2f(this.aClass167_Sub3_Sub1_2.aFloat171, this.aClass167_Sub3_Sub1_2.aFloat170);
		OpenGL.glVertex2i(local42 + this.aClass167_Sub3_Sub1_2.anInt8741, local37);
		OpenGL.glEnd();
		this.method1540();
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		this.aClass167_Sub3_Sub1_2.method8013(false);
		@Pc(19) int local19 = arg1 + arg3;
		this.aClass133_Sub3_4.method7369();
		this.aClass133_Sub3_4.method7375(this.aClass167_Sub3_Sub1_2);
		this.aClass133_Sub3_4.method7388(arg6);
		this.aClass133_Sub3_4.method7401(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass167_Sub3_Sub1_2.aBoolean644 && !this.aBoolean133) {
			@Pc(73) float local73 = (float) arg3 * this.aClass167_Sub3_Sub1_2.aFloat170 / (float) this.aClass167_Sub3_Sub1_2.anInt8742;
			@Pc(85) float local85 = this.aClass167_Sub3_Sub1_2.aFloat171 * (float) arg2 / (float) this.aClass167_Sub3_Sub1_2.anInt8741;
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
		OpenGL.glTranslatef((float) this.anInt1852, (float) this.anInt1848, 0.0F);
		@Pc(125) int local125 = this.method4035();
		@Pc(128) int local128 = this.method4042();
		@Pc(134) int local134 = this.aClass167_Sub3_Sub1_2.anInt8742 + arg1;
		OpenGL.glBegin(7);
		@Pc(138) int local138 = arg1;
		@Pc(146) int local146;
		while (local134 <= local19) {
			local146 = this.aClass167_Sub3_Sub1_2.anInt8741 + arg0;
			@Pc(148) int local148 = arg0;
			while (local146 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass167_Sub3_Sub1_2.aFloat170);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(this.aClass167_Sub3_Sub1_2.aFloat171, 0.0F);
				OpenGL.glVertex2i(local146, local134);
				OpenGL.glTexCoord2f(this.aClass167_Sub3_Sub1_2.aFloat171, this.aClass167_Sub3_Sub1_2.aFloat170);
				OpenGL.glVertex2i(local146, local138);
				local146 += local125;
				local148 += local125;
			}
			if (local9 > local148) {
				@Pc(219) float local219 = this.aClass167_Sub3_Sub1_2.aFloat171 * (float) (local9 - local148) / (float) this.aClass167_Sub3_Sub1_2.anInt8741;
				OpenGL.glTexCoord2f(0.0F, this.aClass167_Sub3_Sub1_2.aFloat170);
				OpenGL.glVertex2i(local148, local138);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local148, local134);
				OpenGL.glTexCoord2f(local219, 0.0F);
				OpenGL.glVertex2i(local9, local134);
				OpenGL.glTexCoord2f(local219, this.aClass167_Sub3_Sub1_2.aFloat170);
				OpenGL.glVertex2i(local9, local138);
			}
			local134 += local128;
			local138 += local128;
		}
		if (local19 > local138) {
			@Pc(281) float local281 = (float) (local138 + this.aClass167_Sub3_Sub1_2.anInt8742 - local19) * this.aClass167_Sub3_Sub1_2.aFloat170 / (float) this.aClass167_Sub3_Sub1_2.anInt8742;
			@Pc(288) int local288 = arg0 + this.aClass167_Sub3_Sub1_2.anInt8741;
			local146 = arg0;
			while (local288 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass167_Sub3_Sub1_2.aFloat170);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local281);
				OpenGL.glVertex2i(local146, local19);
				OpenGL.glTexCoord2f(this.aClass167_Sub3_Sub1_2.aFloat171, local281);
				OpenGL.glVertex2i(local288, local19);
				OpenGL.glTexCoord2f(this.aClass167_Sub3_Sub1_2.aFloat171, this.aClass167_Sub3_Sub1_2.aFloat170);
				OpenGL.glVertex2i(local288, local138);
				local146 += local125;
				local288 += local125;
			}
			if (local146 < local9) {
				@Pc(357) float local357 = this.aClass167_Sub3_Sub1_2.aFloat171 * (float) (local9 - local146) / (float) this.aClass167_Sub3_Sub1_2.anInt8741;
				OpenGL.glTexCoord2f(0.0F, this.aClass167_Sub3_Sub1_2.aFloat170);
				OpenGL.glVertex2i(local146, local138);
				OpenGL.glTexCoord2f(0.0F, local281);
				OpenGL.glVertex2i(local146, local19);
				OpenGL.glTexCoord2f(local357, local281);
				OpenGL.glVertex2i(local9, local19);
				OpenGL.glTexCoord2f(local357, this.aClass167_Sub3_Sub1_2.aFloat170);
				OpenGL.glVertex2i(local9, local138);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method4045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass167_Sub3_Sub1_2.method8013(true);
		this.aClass133_Sub3_4.method7369();
		this.aClass133_Sub3_4.method7388(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean133) {
			@Pc(48) float local48 = (float) arg2 / (float) this.method4035();
			@Pc(55) float local55 = (float) arg3 / (float) this.method4042();
			@Pc(64) float local64 = (float) this.anInt1852 * local48 + (float) arg0;
			@Pc(73) float local73 = (float) arg1 + local55 * (float) this.anInt1848;
			@Pc(82) float local82 = local64 + (float) this.aClass167_Sub3_Sub1_2.anInt8741 * local48;
			@Pc(91) float local91 = local73 + local55 * (float) this.aClass167_Sub3_Sub1_2.anInt8742;
			if (this.aClass167_Sub3_Sub1_1 == null) {
				this.aClass133_Sub3_4.method7375(this.aClass167_Sub3_Sub1_2);
				this.aClass133_Sub3_4.method7401(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass167_Sub3_Sub1_2.aFloat170);
				OpenGL.glVertex2f(local64, local73);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local64, local91);
				OpenGL.glTexCoord2f(this.aClass167_Sub3_Sub1_2.aFloat171, 0.0F);
				OpenGL.glVertex2f(local82, local91);
				OpenGL.glTexCoord2f(this.aClass167_Sub3_Sub1_2.aFloat171, this.aClass167_Sub3_Sub1_2.aFloat170);
				OpenGL.glVertex2f(local82, local73);
				OpenGL.glEnd();
			} else {
				this.method1538(arg4);
				this.aClass167_Sub3_Sub1_1.method8013(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass167_Sub3_Sub1_2.aFloat170);
				OpenGL.glTexCoord2f(0.0F, this.aClass167_Sub3_Sub1_2.aFloat170);
				OpenGL.glVertex2f(local64, local73);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local64, local91);
				OpenGL.glMultiTexCoord2f(33985, this.aClass167_Sub3_Sub1_2.aFloat171, 0.0F);
				OpenGL.glTexCoord2f(this.aClass167_Sub3_Sub1_2.aFloat171, 0.0F);
				OpenGL.glVertex2f(local82, local91);
				OpenGL.glMultiTexCoord2f(33985, this.aClass167_Sub3_Sub1_2.aFloat171, this.aClass167_Sub3_Sub1_2.aFloat170);
				OpenGL.glTexCoord2f(this.aClass167_Sub3_Sub1_2.aFloat171, this.aClass167_Sub3_Sub1_2.aFloat170);
				OpenGL.glVertex2f(local82, local73);
				OpenGL.glEnd();
				this.method1540();
			}
		} else if (this.aClass167_Sub3_Sub1_1 == null) {
			this.aClass133_Sub3_4.method7375(this.aClass167_Sub3_Sub1_2);
			this.aClass133_Sub3_4.method7401(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass167_Sub3_Sub1_2.aFloat170);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass167_Sub3_Sub1_2.aFloat171, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg1 - -arg3);
			OpenGL.glTexCoord2f(this.aClass167_Sub3_Sub1_2.aFloat171, this.aClass167_Sub3_Sub1_2.aFloat170);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method1538(arg4);
			this.aClass167_Sub3_Sub1_1.method8013(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass167_Sub3_Sub1_2.aFloat170);
			OpenGL.glTexCoord2f(0.0F, this.aClass167_Sub3_Sub1_2.aFloat170);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass167_Sub3_Sub1_2.aFloat171, 0.0F);
			OpenGL.glTexCoord2f(this.aClass167_Sub3_Sub1_2.aFloat171, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass167_Sub3_Sub1_2.aFloat171, this.aClass167_Sub3_Sub1_2.aFloat170);
			OpenGL.glTexCoord2f(this.aClass167_Sub3_Sub1_2.aFloat171, this.aClass167_Sub3_Sub1_2.aFloat170);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
			this.method1540();
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass133_Sub3_4.aBoolean632) {
			this.aClass167_Sub3_Sub1_2.method7525(arg2, arg3, arg0, arg1, arg4, arg5);
			return;
		}
		@Pc(17) int[] local17 = this.aClass133_Sub3_4.na(arg4, arg5, arg2, arg3);
		if (local17 == null) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < local17.length; local21++) {
			local17[local21] |= 0xFF000000;
		}
		this.method1541(arg0, arg1, arg2, arg3, local17, arg2);
		return;
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)V")
	private void method1540() {
		this.aClass133_Sub3_4.method7368(1);
		this.aClass133_Sub3_4.method7375(null);
		this.aClass133_Sub3_4.method7342(8448, 8448);
		this.aClass133_Sub3_4.method7326(1, 34168, 768);
		this.aClass133_Sub3_4.method7347(5890, 0);
		this.aClass133_Sub3_4.method7368(0);
		this.aClass133_Sub3_4.method7326(1, 34168, 768);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method4030(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean133) {
			local6 = this.method4035();
			local10 = this.method4042();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(24) float local24 = (arg3 - arg1) / local6;
			@Pc(31) float local31 = (arg4 - arg0) / local10;
			@Pc(37) float local37 = (arg5 - arg1) / local10;
			@Pc(43) float local43 = (float) this.anInt1848 * local31;
			@Pc(49) float local49 = (float) this.anInt1848 * local37;
			@Pc(55) float local55 = local17 * (float) this.anInt1852;
			@Pc(61) float local61 = local24 * (float) this.anInt1852;
			@Pc(68) float local68 = -local17 * (float) this.anInt1864;
			@Pc(75) float local75 = -local24 * (float) this.anInt1864;
			@Pc(82) float local82 = -local31 * (float) this.anInt1847;
			arg1 = arg1 + local61 + local49;
			@Pc(95) float local95 = -local37 * (float) this.anInt1847;
			arg0 = local43 + arg0 + local55;
			arg2 = local68 + arg2 + local43;
			arg3 = arg3 + local75 + local49;
			arg4 = local55 + arg4 + local82;
			arg5 = local95 + arg5 + local61;
		}
		local6 = arg4 + arg2 - arg0;
		local10 = arg5 + arg3 - arg1;
		this.aClass167_Sub3_Sub1_2.method8013(true);
		this.aClass133_Sub3_4.method7369();
		this.aClass133_Sub3_4.method7375(this.aClass167_Sub3_Sub1_2);
		this.aClass133_Sub3_4.method7388(1);
		this.aClass133_Sub3_4.method7401(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass167_Sub3_Sub1_2.aFloat170);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass167_Sub3_Sub1_2.aFloat171, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass167_Sub3_Sub1_2.aFloat171, this.aClass167_Sub3_Sub1_2.aFloat170);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIII[III)V")
	private void method1541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass167_Sub3_Sub1_2.method7522(arg1, arg2, arg0, arg4, arg5, arg3);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method4038(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class167_Sub3_Sub1 local7 = ((Class1_Sub2) arg6).aClass167_Sub3_Sub1_4;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(31) float local31;
		if (this.aBoolean133) {
			local14 = this.method4035();
			local18 = this.method4042();
			local25 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(38) float local38 = (arg4 - arg0) / local18;
			@Pc(44) float local44 = (arg5 - arg1) / local18;
			@Pc(50) float local50 = local38 * (float) this.anInt1848;
			@Pc(56) float local56 = local44 * (float) this.anInt1848;
			@Pc(62) float local62 = local25 * (float) this.anInt1852;
			@Pc(68) float local68 = (float) this.anInt1852 * local31;
			@Pc(75) float local75 = (float) this.anInt1864 * -local25;
			@Pc(82) float local82 = -local31 * (float) this.anInt1864;
			@Pc(89) float local89 = -local38 * (float) this.anInt1847;
			arg0 = local62 + arg0 + local50;
			arg2 = arg2 + local75 + local50;
			arg3 = local56 + local82 + arg3;
			@Pc(114) float local114 = -local44 * (float) this.anInt1847;
			arg1 = local56 + local68 + arg1;
			arg4 = local89 + local62 + arg4;
			arg5 = local68 + arg5 + local114;
		}
		local14 = arg2 + arg4 - arg0;
		this.aClass167_Sub3_Sub1_2.method8013(true);
		local18 = arg3 + arg5 - arg1;
		this.aClass133_Sub3_4.method7369();
		this.aClass133_Sub3_4.method7375(this.aClass167_Sub3_Sub1_2);
		this.aClass133_Sub3_4.method7401(1);
		this.aClass133_Sub3_4.method7368(1);
		this.aClass133_Sub3_4.method7375(local7);
		this.aClass133_Sub3_4.method7342(8448, 7681);
		this.aClass133_Sub3_4.method7326(0, 34168, 768);
		this.aClass133_Sub3_4.method7388(1);
		local25 = local7.aFloat171 / (float) local7.anInt8741;
		local31 = local7.aFloat170 / (float) local7.anInt8742;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass167_Sub3_Sub1_2.aFloat170);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg0), local7.aFloat170 - local31 * (arg1 - (float) arg8));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg4 - (float) arg7), local7.aFloat170 - ((float) -arg8 + arg5) * local31);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass167_Sub3_Sub1_2.aFloat171, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (local14 - (float) arg7) * local25, local7.aFloat170 - local31 * (local18 - (float) arg8));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass167_Sub3_Sub1_2.aFloat171, this.aClass167_Sub3_Sub1_2.aFloat170);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg2) * local25, local7.aFloat170 - (arg3 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass133_Sub3_4.method7326(0, 5890, 768);
		this.aClass133_Sub3_4.method7401(0);
		this.aClass133_Sub3_4.method7375(null);
		this.aClass133_Sub3_4.method7368(0);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1852 = arg0;
		this.anInt1864 = arg2;
		this.anInt1848 = arg1;
		this.anInt1847 = arg3;
		this.aBoolean133 = this.anInt1852 != 0 || this.anInt1848 != 0 || this.anInt1864 != 0 || this.anInt1847 != 0;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "([I)V")
	@Override
	public void method4044(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt1864;
		arg0[1] = this.anInt1848;
		arg0[3] = this.anInt1847;
		arg0[0] = this.anInt1852;
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "()I")
	@Override
	public int method4035() {
		return this.aClass167_Sub3_Sub1_2.anInt8741 + this.anInt1852 + this.anInt1864;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "()I")
	@Override
	public int method4032() {
		return this.aClass167_Sub3_Sub1_2.anInt8741;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(III)V")
	@Override
	public void method4050(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass167_Sub3_Sub1_1 = Static152.method2231(this.aClass167_Sub3_Sub1_2.anInt8742, 0, 0, this.aClass133_Sub3_4, this.aClass167_Sub3_Sub1_2.anInt8741);
		this.anInt1859 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method4053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg2;
		@Pc(9) Class167_Sub3_Sub1 local9 = local6.aClass167_Sub3_Sub1_4;
		this.aClass167_Sub3_Sub1_2.method8013(false);
		this.aClass133_Sub3_4.method7369();
		this.aClass133_Sub3_4.method7375(this.aClass167_Sub3_Sub1_2);
		this.aClass133_Sub3_4.method7401(1);
		this.aClass133_Sub3_4.method7368(1);
		this.aClass133_Sub3_4.method7375(local9);
		this.aClass133_Sub3_4.method7342(8448, 7681);
		this.aClass133_Sub3_4.method7326(0, 34168, 768);
		this.aClass133_Sub3_4.method7388(1);
		@Pc(62) int local62 = arg0 + this.anInt1852;
		@Pc(67) int local67 = arg1 + this.anInt1848;
		@Pc(73) int local73 = local62 + this.aClass167_Sub3_Sub1_2.anInt8741;
		@Pc(79) int local79 = this.aClass167_Sub3_Sub1_2.anInt8742 + local67;
		@Pc(86) float local86 = local9.aFloat171 / (float) local9.anInt8741;
		@Pc(93) float local93 = local9.aFloat170 / (float) local9.anInt8742;
		@Pc(101) float local101 = local86 * (float) (local62 - arg3);
		@Pc(109) float local109 = local86 * (float) (local73 - arg3);
		@Pc(121) float local121 = local9.aFloat170 - (float) (local67 - arg4) * local93;
		@Pc(132) float local132 = local9.aFloat170 - (float) (local79 - arg4) * local93;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass167_Sub3_Sub1_2.aFloat170);
		OpenGL.glMultiTexCoord2f(33985, local101, local121);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local132);
		OpenGL.glVertex2i(local62, local67 + this.aClass167_Sub3_Sub1_2.anInt8742);
		OpenGL.glMultiTexCoord2f(33984, this.aClass167_Sub3_Sub1_2.aFloat171, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local132);
		OpenGL.glVertex2i(local62 + this.aClass167_Sub3_Sub1_2.anInt8741, local67 - -this.aClass167_Sub3_Sub1_2.anInt8742);
		OpenGL.glMultiTexCoord2f(33984, this.aClass167_Sub3_Sub1_2.aFloat171, this.aClass167_Sub3_Sub1_2.aFloat170);
		OpenGL.glMultiTexCoord2f(33985, local109, local121);
		OpenGL.glVertex2i(this.aClass167_Sub3_Sub1_2.anInt8741 + local62, local67);
		OpenGL.glEnd();
		this.aClass133_Sub3_4.method7326(0, 5890, 768);
		this.aClass133_Sub3_4.method7401(0);
		this.aClass133_Sub3_4.method7375(null);
		this.aClass133_Sub3_4.method7368(0);
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "()I")
	@Override
	public int method4037() {
		return this.aClass167_Sub3_Sub1_2.anInt8742;
	}

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "()I")
	@Override
	public int method4042() {
		return this.anInt1847 + this.anInt1848 + this.aClass167_Sub3_Sub1_2.anInt8742;
	}
}
