import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class23_Sub4 extends Class23 {

	@OriginalMember(owner = "client!vn", name = "x", descriptor = "Lclient!tt;")
	private final Class200_Sub2 aClass200_Sub2_43;

	@OriginalMember(owner = "client!vn", name = "y", descriptor = "Lclient!f;")
	private final Class31_Sub1_Sub1 aClass31_Sub1_Sub1_5;

	@OriginalMember(owner = "client!vn", name = "z", descriptor = "Z")
	private final boolean aBoolean485;

	@OriginalMember(owner = "client!vn", name = "B", descriptor = "Lclient!gw;")
	private final Class94 aClass94_6;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!tt;Lclient!ap;[Lclient!rr;Z)V")
	public Class23_Sub4(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class214[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass200_Sub2_43 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class214 local15 = arg2[local10];
			if (local15.anInt5885 > local8) {
				local8 = local15.anInt5885;
			}
			if (local15.anInt5882 > local8) {
				local8 = local15.anInt5882;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(66) int local66;
		@Pc(72) int local72;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class214 local51 = arg2[local46];
			@Pc(54) byte[] local54 = local51.aByteArray75;
			local57 = local51.anInt5885;
			local60 = local51.anInt5882;
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
		this.aClass31_Sub1_Sub1_5 = Static21.method353(arg0, local37, local44, local37);
		this.aBoolean485 = true;
		this.aClass31_Sub1_Sub1_5.method4591(false);
		this.aClass94_6 = new Class94(arg0, 256);
		@Pc(290) float local290 = this.aClass31_Sub1_Sub1_5.aFloat39 / (float) this.aClass31_Sub1_Sub1_5.anInt1876;
		@Pc(299) float local299 = this.aClass31_Sub1_Sub1_5.aFloat38 / (float) this.aClass31_Sub1_Sub1_5.anInt1877;
		for (@Pc(301) int local301 = 0; local301 < 256; local301++) {
			@Pc(306) Class214 local306 = arg2[local301];
			local57 = local306.anInt5885;
			local60 = local306.anInt5882;
			local66 = local306.anInt5881;
			local72 = local306.anInt5884;
			@Pc(325) float local325 = (float) (local301 % 16 * local8);
			@Pc(332) float local332 = (float) (local301 / 16 * local8);
			@Pc(336) float local336 = local325 * local290;
			@Pc(340) float local340 = local332 * local299;
			@Pc(347) float local347 = (local325 + (float) local60) * local290;
			@Pc(354) float local354 = (local332 + (float) local57) * local299;
			this.aClass94_6.method2130(local301);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local336, this.aClass31_Sub1_Sub1_5.aFloat38 - local340);
			OpenGL.glVertex2i(local72, local66);
			OpenGL.glTexCoord2f(local336, this.aClass31_Sub1_Sub1_5.aFloat38 - local354);
			OpenGL.glVertex2i(local72, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass31_Sub1_Sub1_5.aFloat38 - local354);
			OpenGL.glVertex2i(local72 + local60, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass31_Sub1_Sub1_5.aFloat38 - local340);
			OpenGL.glVertex2i(local72 + local60, local66);
			OpenGL.glEnd();
			this.aClass94_6.method2133();
		}
	}

	@OriginalMember(owner = "client!vn", name = "B", descriptor = "(CIIIZ)V")
	@Override
	protected void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass200_Sub2_43.method5283();
		this.aClass200_Sub2_43.method5312(this.aClass31_Sub1_Sub1_5);
		if (this.aBoolean485 || arg4) {
			this.aClass200_Sub2_43.method5304(7681, 8448);
			this.aClass200_Sub2_43.method5343(768, 34168, 0);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass94_6.method2132(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean485 || arg4) {
			this.aClass200_Sub2_43.method5343(768, 5890, 0);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(CIIIZLclient!ta;II)V")
	@Override
	protected void method5748(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class97 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class97_Sub2 local2 = (Class97_Sub2) arg5;
		@Pc(5) Class31_Sub1_Sub1 local5 = local2.aClass31_Sub1_Sub1_1;
		this.aClass200_Sub2_43.method5283();
		this.aClass200_Sub2_43.method5312(this.aClass31_Sub1_Sub1_5);
		if (this.aBoolean485 || arg4) {
			this.aClass200_Sub2_43.method5304(7681, 8448);
			this.aClass200_Sub2_43.method5343(768, 34168, 0);
		}
		this.aClass200_Sub2_43.method5319(1);
		this.aClass200_Sub2_43.method5312(local5);
		this.aClass200_Sub2_43.method5304(7681, 8448);
		this.aClass200_Sub2_43.method5343(768, 34168, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(71) float local71 = local5.aFloat39 / (float) local5.anInt1876;
		@Pc(78) float local78 = local5.aFloat38 / (float) local5.anInt1877;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local71, 0.0F, 0.0F, (float) -arg6 * local71 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local78, 0.0F, (float) -arg7 * local78 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass94_6.method2132(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass200_Sub2_43.method5343(768, 5890, 0);
		this.aClass200_Sub2_43.method5304(8448, 8448);
		this.aClass200_Sub2_43.method5312(null);
		this.aClass200_Sub2_43.method5319(0);
		if (this.aBoolean485 || arg4) {
			this.aClass200_Sub2_43.method5343(768, 5890, 0);
		}
	}
}
