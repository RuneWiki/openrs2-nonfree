import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class29_Sub4 extends Class29 {

	@OriginalMember(owner = "client!qu", name = "E", descriptor = "Lclient!rl;")
	private final Class66_Sub2 aClass66_Sub2_33;

	@OriginalMember(owner = "client!qu", name = "z", descriptor = "Lclient!oc;")
	private final Class19_Sub4_Sub1 aClass19_Sub4_Sub1_4;

	@OriginalMember(owner = "client!qu", name = "B", descriptor = "Z")
	private final boolean aBoolean356;

	@OriginalMember(owner = "client!qu", name = "C", descriptor = "Lclient!hu;")
	private final Class110 aClass110_4;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lclient!rl;Lclient!mo;[Lclient!pi;Z)V")
	public Class29_Sub4(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) Class166 arg1, @OriginalArg(2) Class194[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass66_Sub2_33 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class194 local15 = arg2[local10];
			if (local15.anInt5386 > local8) {
				local8 = local15.anInt5386;
			}
			if (local15.anInt5383 > local8) {
				local8 = local15.anInt5383;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(66) int local66;
		@Pc(72) int local72;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class194 local51 = arg2[local46];
			@Pc(54) byte[] local54 = local51.aByteArray69;
			local57 = local51.anInt5386;
			local60 = local51.anInt5383;
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
		this.aClass19_Sub4_Sub1_4 = Static203.method3130(arg0, local44, local37, local37);
		this.aBoolean356 = true;
		this.aClass19_Sub4_Sub1_4.method4238(false);
		this.aClass110_4 = new Class110(arg0, 256);
		@Pc(290) float local290 = this.aClass19_Sub4_Sub1_4.aFloat54 / (float) this.aClass19_Sub4_Sub1_4.anInt5085;
		@Pc(299) float local299 = this.aClass19_Sub4_Sub1_4.aFloat55 / (float) this.aClass19_Sub4_Sub1_4.anInt5086;
		for (@Pc(301) int local301 = 0; local301 < 256; local301++) {
			@Pc(306) Class194 local306 = arg2[local301];
			local57 = local306.anInt5386;
			local60 = local306.anInt5383;
			local66 = local306.anInt5388;
			local72 = local306.anInt5385;
			@Pc(325) float local325 = (float) (local301 % 16 * local8);
			@Pc(332) float local332 = (float) (local301 / 16 * local8);
			@Pc(336) float local336 = local325 * local290;
			@Pc(340) float local340 = local332 * local299;
			@Pc(347) float local347 = (local325 + (float) local60) * local290;
			@Pc(354) float local354 = (local332 + (float) local57) * local299;
			this.aClass110_4.method2674(local301);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local336, this.aClass19_Sub4_Sub1_4.aFloat55 - local340);
			OpenGL.glVertex2i(local72, local66);
			OpenGL.glTexCoord2f(local336, this.aClass19_Sub4_Sub1_4.aFloat55 - local354);
			OpenGL.glVertex2i(local72, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass19_Sub4_Sub1_4.aFloat55 - local354);
			OpenGL.glVertex2i(local72 + local60, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass19_Sub4_Sub1_4.aFloat55 - local340);
			OpenGL.glVertex2i(local72 + local60, local66);
			OpenGL.glEnd();
			this.aClass110_4.method2676();
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(CIIIZ)V")
	@Override
	protected void method4787(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass66_Sub2_33.method5105();
		this.aClass66_Sub2_33.method5109(this.aClass19_Sub4_Sub1_4);
		if (this.aBoolean356 || arg4) {
			this.aClass66_Sub2_33.method5145(8448, 7681);
			this.aClass66_Sub2_33.method5081(0, 34168, 768);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass110_4.method2677(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean356 || arg4) {
			this.aClass66_Sub2_33.method5081(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(CIIIZLclient!fs;II)V")
	@Override
	protected void method4794(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class22 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class22_Sub1 local2 = (Class22_Sub1) arg5;
		@Pc(5) Class19_Sub4_Sub1 local5 = local2.aClass19_Sub4_Sub1_1;
		this.aClass66_Sub2_33.method5105();
		this.aClass66_Sub2_33.method5109(this.aClass19_Sub4_Sub1_4);
		if (this.aBoolean356 || arg4) {
			this.aClass66_Sub2_33.method5145(8448, 7681);
			this.aClass66_Sub2_33.method5081(0, 34168, 768);
		}
		this.aClass66_Sub2_33.method5075(1);
		this.aClass66_Sub2_33.method5109(local5);
		this.aClass66_Sub2_33.method5145(8448, 7681);
		this.aClass66_Sub2_33.method5081(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(71) float local71 = local5.aFloat54 / (float) local5.anInt5085;
		@Pc(78) float local78 = local5.aFloat55 / (float) local5.anInt5086;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local71, 0.0F, 0.0F, (float) -arg6 * local71 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local78, 0.0F, (float) -arg7 * local78 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass110_4.method2677(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass66_Sub2_33.method5081(0, 5890, 768);
		this.aClass66_Sub2_33.method5145(8448, 8448);
		this.aClass66_Sub2_33.method5109(null);
		this.aClass66_Sub2_33.method5075(0);
		if (this.aBoolean356 || arg4) {
			this.aClass66_Sub2_33.method5081(0, 5890, 768);
		}
	}
}
