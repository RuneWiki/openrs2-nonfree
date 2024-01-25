import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class71_Sub2 extends Class71 {

	@OriginalMember(owner = "client!je", name = "v", descriptor = "Lclient!kd;")
	private final Class39_Sub2 aClass39_Sub2_22;

	@OriginalMember(owner = "client!je", name = "w", descriptor = "Lclient!oi;")
	private final Class3_Sub2_Sub1 aClass3_Sub2_Sub1_1;

	@OriginalMember(owner = "client!je", name = "x", descriptor = "Z")
	private final boolean aBoolean198;

	@OriginalMember(owner = "client!je", name = "u", descriptor = "Lclient!rn;")
	private final Class213 aClass213_4;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!kd;Lclient!lm;[Lclient!di;Z)V")
	public Class71_Sub2(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) Class151 arg1, @OriginalArg(2) Class51[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass39_Sub2_22 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class51 local15 = arg2[local10];
			if (local15.anInt1638 > local8) {
				local8 = local15.anInt1638;
			}
			if (local15.anInt1635 > local8) {
				local8 = local15.anInt1635;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(66) int local66;
		@Pc(72) int local72;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class51 local51 = arg2[local46];
			@Pc(54) byte[] local54 = local51.aByteArray42;
			local57 = local51.anInt1638;
			local60 = local51.anInt1635;
			local66 = local46 % 16 * local8;
			local72 = local46 / 16 * local8;
			@Pc(78) int local78 = local72 * local37 + local66;
			@Pc(80) int local80 = 0;
			for (@Pc(82) int local82 = 0; local82 < local57; local82++) {
				for (@Pc(85) int local85 = 0; local85 < local60; local85++) {
					local44[local78++] = (byte) (local54[local80++] == 0 ? 0 : -1);
				}
				local78 += local37 - local60;
			}
		}
		this.aClass3_Sub2_Sub1_1 = Static64.method1316(local37, local37, arg0, local44);
		this.aBoolean198 = true;
		this.aClass3_Sub2_Sub1_1.method4146(false);
		this.aClass213_4 = new Class213(arg0, 256);
		@Pc(290) float local290 = this.aClass3_Sub2_Sub1_1.aFloat73 / (float) this.aClass3_Sub2_Sub1_1.anInt5014;
		@Pc(299) float local299 = this.aClass3_Sub2_Sub1_1.aFloat72 / (float) this.aClass3_Sub2_Sub1_1.anInt5012;
		for (@Pc(301) int local301 = 0; local301 < 256; local301++) {
			@Pc(306) Class51 local306 = arg2[local301];
			local57 = local306.anInt1638;
			local60 = local306.anInt1635;
			local66 = local306.anInt1639;
			local72 = local306.anInt1636;
			@Pc(325) float local325 = (float) (local301 % 16 * local8);
			@Pc(332) float local332 = (float) (local301 / 16 * local8);
			@Pc(336) float local336 = local325 * local290;
			@Pc(340) float local340 = local332 * local299;
			@Pc(347) float local347 = (local325 + (float) local60) * local290;
			@Pc(354) float local354 = (local332 + (float) local57) * local299;
			this.aClass213_4.method4858(local301);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local336, this.aClass3_Sub2_Sub1_1.aFloat72 - local340);
			OpenGL.glVertex2i(local72, local66);
			OpenGL.glTexCoord2f(local336, this.aClass3_Sub2_Sub1_1.aFloat72 - local354);
			OpenGL.glVertex2i(local72, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass3_Sub2_Sub1_1.aFloat72 - local354);
			OpenGL.glVertex2i(local72 + local60, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass3_Sub2_Sub1_1.aFloat72 - local340);
			OpenGL.glVertex2i(local72 + local60, local66);
			OpenGL.glEnd();
			this.aClass213_4.method4862();
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(CIIIZLclient!ma;II)V")
	@Override
	protected void method5444(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class133 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class133_Sub2 local2 = (Class133_Sub2) arg5;
		@Pc(5) Class3_Sub2_Sub1 local5 = local2.aClass3_Sub2_Sub1_3;
		this.aClass39_Sub2_22.method3236();
		this.aClass39_Sub2_22.method3203(this.aClass3_Sub2_Sub1_1);
		if (this.aBoolean198 || arg4) {
			this.aClass39_Sub2_22.method3156(8448, 7681);
			this.aClass39_Sub2_22.method3180(768, 0, 34168);
		}
		this.aClass39_Sub2_22.method3221(1);
		this.aClass39_Sub2_22.method3203(local5);
		this.aClass39_Sub2_22.method3156(8448, 7681);
		this.aClass39_Sub2_22.method3180(768, 0, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(71) float local71 = local5.aFloat73 / (float) local5.anInt5014;
		@Pc(78) float local78 = local5.aFloat72 / (float) local5.anInt5012;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local71, 0.0F, 0.0F, (float) -arg6 * local71 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local78, 0.0F, (float) -arg7 * local78 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass213_4.method4857(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass39_Sub2_22.method3180(768, 0, 5890);
		this.aClass39_Sub2_22.method3156(8448, 8448);
		this.aClass39_Sub2_22.method3203(null);
		this.aClass39_Sub2_22.method3221(0);
		if (this.aBoolean198 || arg4) {
			this.aClass39_Sub2_22.method3180(768, 0, 5890);
		}
	}

	@OriginalMember(owner = "client!je", name = "OA", descriptor = "(CIIIZ)V")
	@Override
	protected void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass39_Sub2_22.method3236();
		this.aClass39_Sub2_22.method3203(this.aClass3_Sub2_Sub1_1);
		if (this.aBoolean198 || arg4) {
			this.aClass39_Sub2_22.method3156(8448, 7681);
			this.aClass39_Sub2_22.method3180(768, 0, 34168);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass213_4.method4857(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean198 || arg4) {
			this.aClass39_Sub2_22.method3180(768, 0, 5890);
		}
	}
}
