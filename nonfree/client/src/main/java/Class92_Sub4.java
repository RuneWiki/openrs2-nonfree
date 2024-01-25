import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class92_Sub4 extends Class92 {

	@OriginalMember(owner = "client!pq", name = "A", descriptor = "Lclient!pg;")
	private final Class163_Sub2 aClass163_Sub2_33;

	@OriginalMember(owner = "client!pq", name = "C", descriptor = "Lclient!gq;")
	private final Class20_Sub1_Sub1 aClass20_Sub1_Sub1_4;

	@OriginalMember(owner = "client!pq", name = "B", descriptor = "Z")
	private final boolean aBoolean407;

	@OriginalMember(owner = "client!pq", name = "z", descriptor = "Lclient!lo;")
	private final Class147 aClass147_5;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!pg;Lclient!kt;[Lclient!au;Z)V")
	public Class92_Sub4(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) Class17[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass163_Sub2_33 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class17 local15 = arg2[local10];
			if (local15.anInt345 > local8) {
				local8 = local15.anInt345;
			}
			if (local15.anInt342 > local8) {
				local8 = local15.anInt342;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(66) int local66;
		@Pc(72) int local72;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class17 local51 = arg2[local46];
			@Pc(54) byte[] local54 = local51.aByteArray4;
			local57 = local51.anInt345;
			local60 = local51.anInt342;
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
		this.aClass20_Sub1_Sub1_4 = Static348.method4629(local37, arg0, local37, local44);
		this.aBoolean407 = true;
		this.aClass20_Sub1_Sub1_4.method3113(false);
		this.aClass147_5 = new Class147(arg0, 256);
		@Pc(290) float local290 = this.aClass20_Sub1_Sub1_4.aFloat26 / (float) this.aClass20_Sub1_Sub1_4.anInt2477;
		@Pc(299) float local299 = this.aClass20_Sub1_Sub1_4.aFloat25 / (float) this.aClass20_Sub1_Sub1_4.anInt2476;
		for (@Pc(301) int local301 = 0; local301 < 256; local301++) {
			@Pc(306) Class17 local306 = arg2[local301];
			local57 = local306.anInt345;
			local60 = local306.anInt342;
			local66 = local306.anInt344;
			local72 = local306.anInt341;
			@Pc(325) float local325 = (float) (local301 % 16 * local8);
			@Pc(332) float local332 = (float) (local301 / 16 * local8);
			@Pc(336) float local336 = local325 * local290;
			@Pc(340) float local340 = local332 * local299;
			@Pc(347) float local347 = (local325 + (float) local60) * local290;
			@Pc(354) float local354 = (local332 + (float) local57) * local299;
			this.aClass147_5.method3028(local301);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local336, this.aClass20_Sub1_Sub1_4.aFloat25 - local340);
			OpenGL.glVertex2i(local72, local66);
			OpenGL.glTexCoord2f(local336, this.aClass20_Sub1_Sub1_4.aFloat25 - local354);
			OpenGL.glVertex2i(local72, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass20_Sub1_Sub1_4.aFloat25 - local354);
			OpenGL.glVertex2i(local72 + local60, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass20_Sub1_Sub1_4.aFloat25 - local340);
			OpenGL.glVertex2i(local72 + local60, local66);
			OpenGL.glEnd();
			this.aClass147_5.method3029();
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(CIIIZLclient!ta;II)V")
	@Override
	protected void method4518(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class35 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class35_Sub2 local2 = (Class35_Sub2) arg5;
		@Pc(5) Class20_Sub1_Sub1 local5 = local2.aClass20_Sub1_Sub1_5;
		this.aClass163_Sub2_33.method4134();
		this.aClass163_Sub2_33.method4118(this.aClass20_Sub1_Sub1_4);
		if (this.aBoolean407 || arg4) {
			this.aClass163_Sub2_33.method4164(7681, 8448);
			this.aClass163_Sub2_33.method4181(0, 768, 34168);
		}
		this.aClass163_Sub2_33.method4131(1);
		this.aClass163_Sub2_33.method4118(local5);
		this.aClass163_Sub2_33.method4164(7681, 8448);
		this.aClass163_Sub2_33.method4181(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(71) float local71 = local5.aFloat26 / (float) local5.anInt2477;
		@Pc(78) float local78 = local5.aFloat25 / (float) local5.anInt2476;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local71, 0.0F, 0.0F, (float) -arg6 * local71 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local78, 0.0F, (float) -arg7 * local78 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass147_5.method3026(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass163_Sub2_33.method4181(0, 768, 5890);
		this.aClass163_Sub2_33.method4164(8448, 8448);
		this.aClass163_Sub2_33.method4118(null);
		this.aClass163_Sub2_33.method4131(0);
		if (this.aBoolean407 || arg4) {
			this.aClass163_Sub2_33.method4181(0, 768, 5890);
		}
	}

	@OriginalMember(owner = "client!pq", name = "B", descriptor = "(CIIIZ)V")
	@Override
	protected void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass163_Sub2_33.method4134();
		this.aClass163_Sub2_33.method4118(this.aClass20_Sub1_Sub1_4);
		if (this.aBoolean407 || arg4) {
			this.aClass163_Sub2_33.method4164(7681, 8448);
			this.aClass163_Sub2_33.method4181(0, 768, 34168);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass147_5.method3026(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean407 || arg4) {
			this.aClass163_Sub2_33.method4181(0, 768, 5890);
		}
	}
}
