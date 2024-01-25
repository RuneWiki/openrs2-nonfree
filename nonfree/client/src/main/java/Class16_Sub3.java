import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class16_Sub3 extends Class16 {

	@OriginalMember(owner = "client!pr", name = "v", descriptor = "Lclient!od;")
	private final Class128_Sub2 aClass128_Sub2_33;

	@OriginalMember(owner = "client!pr", name = "x", descriptor = "Lclient!we;")
	private final Class5_Sub1_Sub1 aClass5_Sub1_Sub1_3;

	@OriginalMember(owner = "client!pr", name = "y", descriptor = "Z")
	private final boolean aBoolean421;

	@OriginalMember(owner = "client!pr", name = "w", descriptor = "Lclient!bw;")
	private final Class32 aClass32_4;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!od;Lclient!je;[Lclient!gu;Z)V")
	public Class16_Sub3(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) Class100[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass128_Sub2_33 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class100 local15 = arg2[local10];
			if (local15.anInt2454 > local8) {
				local8 = local15.anInt2454;
			}
			if (local15.anInt2451 > local8) {
				local8 = local15.anInt2451;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(66) int local66;
		@Pc(72) int local72;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class100 local51 = arg2[local46];
			@Pc(54) byte[] local54 = local51.aByteArray22;
			local57 = local51.anInt2454;
			local60 = local51.anInt2451;
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
		this.aClass5_Sub1_Sub1_3 = Static16.method2731(arg0, local37, local37, local44);
		this.aBoolean421 = true;
		this.aClass5_Sub1_Sub1_3.method5540(false);
		this.aClass32_4 = new Class32(arg0, 256);
		@Pc(290) float local290 = this.aClass5_Sub1_Sub1_3.aFloat98 / (float) this.aClass5_Sub1_Sub1_3.anInt7347;
		@Pc(299) float local299 = this.aClass5_Sub1_Sub1_3.aFloat100 / (float) this.aClass5_Sub1_Sub1_3.anInt7346;
		for (@Pc(301) int local301 = 0; local301 < 256; local301++) {
			@Pc(306) Class100 local306 = arg2[local301];
			local57 = local306.anInt2454;
			local60 = local306.anInt2451;
			local66 = local306.anInt2449;
			local72 = local306.anInt2452;
			@Pc(325) float local325 = (float) (local301 % 16 * local8);
			@Pc(332) float local332 = (float) (local301 / 16 * local8);
			@Pc(336) float local336 = local325 * local290;
			@Pc(340) float local340 = local332 * local299;
			@Pc(347) float local347 = (local325 + (float) local60) * local290;
			@Pc(354) float local354 = (local332 + (float) local57) * local299;
			this.aClass32_4.method657(local301);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local336, this.aClass5_Sub1_Sub1_3.aFloat100 - local340);
			OpenGL.glVertex2i(local72, local66);
			OpenGL.glTexCoord2f(local336, this.aClass5_Sub1_Sub1_3.aFloat100 - local354);
			OpenGL.glVertex2i(local72, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass5_Sub1_Sub1_3.aFloat100 - local354);
			OpenGL.glVertex2i(local72 + local60, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass5_Sub1_Sub1_3.aFloat100 - local340);
			OpenGL.glVertex2i(local72 + local60, local66);
			OpenGL.glEnd();
			this.aClass32_4.method658();
		}
	}

	@OriginalMember(owner = "client!pr", name = "B", descriptor = "(CIIIZ)V")
	@Override
	protected void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass128_Sub2_33.method3639();
		this.aClass128_Sub2_33.method3691(this.aClass5_Sub1_Sub1_3);
		if (this.aBoolean421 || arg4) {
			this.aClass128_Sub2_33.method3622(8448, 7681);
			this.aClass128_Sub2_33.method3647(34168, 768, 0);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass32_4.method651(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean421 || arg4) {
			this.aClass128_Sub2_33.method3647(5890, 768, 0);
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(CIIIZLclient!ea;II)V")
	@Override
	protected void method5482(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class59 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class59_Sub1 local2 = (Class59_Sub1) arg5;
		@Pc(5) Class5_Sub1_Sub1 local5 = local2.aClass5_Sub1_Sub1_1;
		this.aClass128_Sub2_33.method3639();
		this.aClass128_Sub2_33.method3691(this.aClass5_Sub1_Sub1_3);
		if (this.aBoolean421 || arg4) {
			this.aClass128_Sub2_33.method3622(8448, 7681);
			this.aClass128_Sub2_33.method3647(34168, 768, 0);
		}
		this.aClass128_Sub2_33.method3667(1);
		this.aClass128_Sub2_33.method3691(local5);
		this.aClass128_Sub2_33.method3622(8448, 7681);
		this.aClass128_Sub2_33.method3647(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(71) float local71 = local5.aFloat98 / (float) local5.anInt7347;
		@Pc(78) float local78 = local5.aFloat100 / (float) local5.anInt7346;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local71, 0.0F, 0.0F, (float) -arg6 * local71 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local78, 0.0F, (float) -arg7 * local78 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass32_4.method651(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass128_Sub2_33.method3647(5890, 768, 0);
		this.aClass128_Sub2_33.method3622(8448, 8448);
		this.aClass128_Sub2_33.method3691(null);
		this.aClass128_Sub2_33.method3667(0);
		if (this.aBoolean421 || arg4) {
			this.aClass128_Sub2_33.method3647(5890, 768, 0);
		}
	}
}
