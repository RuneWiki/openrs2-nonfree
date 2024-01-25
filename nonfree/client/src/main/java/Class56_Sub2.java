import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class56_Sub2 extends Class56 {

	@OriginalMember(owner = "client!kj", name = "x", descriptor = "Lclient!bo;")
	private final Class26_Sub1 aClass26_Sub1_20;

	@OriginalMember(owner = "client!kj", name = "y", descriptor = "Lclient!gk;")
	private final Class65_Sub3_Sub1 aClass65_Sub3_Sub1_3;

	@OriginalMember(owner = "client!kj", name = "A", descriptor = "Z")
	private final boolean aBoolean323;

	@OriginalMember(owner = "client!kj", name = "z", descriptor = "Lclient!iq;")
	private final Class120 aClass120_2;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!bo;Lclient!re;[Lclient!fq;Z)V")
	public Class56_Sub2(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) Class89[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass26_Sub1_20 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class89 local15 = arg2[local10];
			if (local15.anInt2412 > local8) {
				local8 = local15.anInt2412;
			}
			if (local15.anInt2413 > local8) {
				local8 = local15.anInt2413;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(66) int local66;
		@Pc(72) int local72;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class89 local51 = arg2[local46];
			@Pc(54) byte[] local54 = local51.aByteArray66;
			local57 = local51.anInt2412;
			local60 = local51.anInt2413;
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
		this.aClass65_Sub3_Sub1_3 = Static329.method4700(local44, arg0, local37, local37);
		this.aBoolean323 = true;
		this.aClass65_Sub3_Sub1_3.method4263(false);
		this.aClass120_2 = new Class120(arg0, 256);
		@Pc(290) float local290 = this.aClass65_Sub3_Sub1_3.aFloat84 / (float) this.aClass65_Sub3_Sub1_3.anInt2650;
		@Pc(299) float local299 = this.aClass65_Sub3_Sub1_3.aFloat85 / (float) this.aClass65_Sub3_Sub1_3.anInt2651;
		for (@Pc(301) int local301 = 0; local301 < 256; local301++) {
			@Pc(306) Class89 local306 = arg2[local301];
			local57 = local306.anInt2412;
			local60 = local306.anInt2413;
			local66 = local306.anInt2410;
			local72 = local306.anInt2409;
			@Pc(325) float local325 = (float) (local301 % 16 * local8);
			@Pc(332) float local332 = (float) (local301 / 16 * local8);
			@Pc(336) float local336 = local325 * local290;
			@Pc(340) float local340 = local332 * local299;
			@Pc(347) float local347 = (local325 + (float) local60) * local290;
			@Pc(354) float local354 = (local332 + (float) local57) * local299;
			this.aClass120_2.method2784(local301);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local336, this.aClass65_Sub3_Sub1_3.aFloat85 - local340);
			OpenGL.glVertex2i(local72, local66);
			OpenGL.glTexCoord2f(local336, this.aClass65_Sub3_Sub1_3.aFloat85 - local354);
			OpenGL.glVertex2i(local72, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass65_Sub3_Sub1_3.aFloat85 - local354);
			OpenGL.glVertex2i(local72 + local60, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass65_Sub3_Sub1_3.aFloat85 - local340);
			OpenGL.glVertex2i(local72 + local60, local66);
			OpenGL.glEnd();
			this.aClass120_2.method2781();
		}
	}

	@OriginalMember(owner = "client!kj", name = "B", descriptor = "(CIIIZ)V")
	@Override
	protected void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass26_Sub1_20.method683();
		this.aClass26_Sub1_20.method673(this.aClass65_Sub3_Sub1_3);
		if (this.aBoolean323 || arg4) {
			this.aClass26_Sub1_20.method695(7681, 8448);
			this.aClass26_Sub1_20.method646(0, 768, 34168);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass120_2.method2782(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean323 || arg4) {
			this.aClass26_Sub1_20.method646(0, 768, 5890);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(CIIIZLclient!ea;II)V")
	@Override
	protected void method5850(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class14 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class14_Sub2 local2 = (Class14_Sub2) arg5;
		@Pc(5) Class65_Sub3_Sub1 local5 = local2.aClass65_Sub3_Sub1_2;
		this.aClass26_Sub1_20.method683();
		this.aClass26_Sub1_20.method673(this.aClass65_Sub3_Sub1_3);
		if (this.aBoolean323 || arg4) {
			this.aClass26_Sub1_20.method695(7681, 8448);
			this.aClass26_Sub1_20.method646(0, 768, 34168);
		}
		this.aClass26_Sub1_20.method696(1);
		this.aClass26_Sub1_20.method673(local5);
		this.aClass26_Sub1_20.method695(7681, 8448);
		this.aClass26_Sub1_20.method646(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(71) float local71 = local5.aFloat84 / (float) local5.anInt2650;
		@Pc(78) float local78 = local5.aFloat85 / (float) local5.anInt2651;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local71, 0.0F, 0.0F, (float) -arg6 * local71 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local78, 0.0F, (float) -arg7 * local78 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass120_2.method2782(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass26_Sub1_20.method646(0, 768, 5890);
		this.aClass26_Sub1_20.method695(8448, 8448);
		this.aClass26_Sub1_20.method673(null);
		this.aClass26_Sub1_20.method696(0);
		if (this.aBoolean323 || arg4) {
			this.aClass26_Sub1_20.method646(0, 768, 5890);
		}
	}
}
