import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class65_Sub3 extends Class65 {

	@OriginalMember(owner = "client!iq", name = "x", descriptor = "Lclient!gk;")
	private final Class75_Sub2 aClass75_Sub2_21;

	@OriginalMember(owner = "client!iq", name = "B", descriptor = "Lclient!cw;")
	private final Class42_Sub1_Sub1 aClass42_Sub1_Sub1_5;

	@OriginalMember(owner = "client!iq", name = "z", descriptor = "Z")
	private final boolean aBoolean283;

	@OriginalMember(owner = "client!iq", name = "y", descriptor = "Lclient!bf;")
	private final Class18 aClass18_2;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!gk;Lclient!ov;[Lclient!ne;Z)V")
	public Class65_Sub3(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) Class179 arg1, @OriginalArg(2) Class166[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass75_Sub2_21 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class166 local15 = arg2[local10];
			if (local15.anInt4969 > local8) {
				local8 = local15.anInt4969;
			}
			if (local15.anInt4973 > local8) {
				local8 = local15.anInt4973;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(66) int local66;
		@Pc(72) int local72;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class166 local51 = arg2[local46];
			@Pc(54) byte[] local54 = local51.aByteArray57;
			local57 = local51.anInt4969;
			local60 = local51.anInt4973;
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
		this.aClass42_Sub1_Sub1_5 = Static144.method2562(local44, local37, arg0, local37);
		this.aBoolean283 = true;
		this.aClass42_Sub1_Sub1_5.method4910(false);
		this.aClass18_2 = new Class18(arg0, 256);
		@Pc(290) float local290 = this.aClass42_Sub1_Sub1_5.aFloat17 / (float) this.aClass42_Sub1_Sub1_5.anInt1542;
		@Pc(299) float local299 = this.aClass42_Sub1_Sub1_5.aFloat18 / (float) this.aClass42_Sub1_Sub1_5.anInt1543;
		for (@Pc(301) int local301 = 0; local301 < 256; local301++) {
			@Pc(306) Class166 local306 = arg2[local301];
			local57 = local306.anInt4969;
			local60 = local306.anInt4973;
			local66 = local306.anInt4970;
			local72 = local306.anInt4971;
			@Pc(325) float local325 = (float) (local301 % 16 * local8);
			@Pc(332) float local332 = (float) (local301 / 16 * local8);
			@Pc(336) float local336 = local325 * local290;
			@Pc(340) float local340 = local332 * local299;
			@Pc(347) float local347 = (local325 + (float) local60) * local290;
			@Pc(354) float local354 = (local332 + (float) local57) * local299;
			this.aClass18_2.method718(local301);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local336, this.aClass42_Sub1_Sub1_5.aFloat18 - local340);
			OpenGL.glVertex2i(local72, local66);
			OpenGL.glTexCoord2f(local336, this.aClass42_Sub1_Sub1_5.aFloat18 - local354);
			OpenGL.glVertex2i(local72, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass42_Sub1_Sub1_5.aFloat18 - local354);
			OpenGL.glVertex2i(local72 + local60, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass42_Sub1_Sub1_5.aFloat18 - local340);
			OpenGL.glVertex2i(local72 + local60, local66);
			OpenGL.glEnd();
			this.aClass18_2.method723();
		}
	}

	@OriginalMember(owner = "client!iq", name = "B", descriptor = "(CIIIZ)V")
	@Override
	protected void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass75_Sub2_21.method2436();
		this.aClass75_Sub2_21.method2456(this.aClass42_Sub1_Sub1_5);
		if (this.aBoolean283 || arg4) {
			this.aClass75_Sub2_21.method2479(7681, 8448);
			this.aClass75_Sub2_21.method2466(34168, 0, 768);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass18_2.method720(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean283 || arg4) {
			this.aClass75_Sub2_21.method2466(5890, 0, 768);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(CIIIZLclient!ea;II)V")
	@Override
	protected void method5807(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class32 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class32_Sub2 local2 = (Class32_Sub2) arg5;
		@Pc(5) Class42_Sub1_Sub1 local5 = local2.aClass42_Sub1_Sub1_4;
		this.aClass75_Sub2_21.method2436();
		this.aClass75_Sub2_21.method2456(this.aClass42_Sub1_Sub1_5);
		if (this.aBoolean283 || arg4) {
			this.aClass75_Sub2_21.method2479(7681, 8448);
			this.aClass75_Sub2_21.method2466(34168, 0, 768);
		}
		this.aClass75_Sub2_21.method2426(1);
		this.aClass75_Sub2_21.method2456(local5);
		this.aClass75_Sub2_21.method2479(7681, 8448);
		this.aClass75_Sub2_21.method2466(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(71) float local71 = local5.aFloat17 / (float) local5.anInt1542;
		@Pc(78) float local78 = local5.aFloat18 / (float) local5.anInt1543;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local71, 0.0F, 0.0F, (float) -arg6 * local71 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local78, 0.0F, (float) -arg7 * local78 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass18_2.method720(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass75_Sub2_21.method2466(5890, 0, 768);
		this.aClass75_Sub2_21.method2479(8448, 8448);
		this.aClass75_Sub2_21.method2456(null);
		this.aClass75_Sub2_21.method2426(0);
		if (this.aBoolean283 || arg4) {
			this.aClass75_Sub2_21.method2466(5890, 0, 768);
		}
	}
}
