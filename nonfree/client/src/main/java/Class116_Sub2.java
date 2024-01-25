import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class116_Sub2 extends Class116 {

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "Lclient!ef;")
	private final Class49_Sub2 aClass49_Sub2_24;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "Lclient!tq;")
	private final Class55_Sub3_Sub1 aClass55_Sub3_Sub1_4;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "Z")
	private final boolean aBoolean305;

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "Lclient!ih;")
	private final Class117 aClass117_2;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!ef;Lclient!dq;[Lclient!ft;Z)V")
	public Class116_Sub2(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) Class58 arg1, @OriginalArg(2) Class85[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass49_Sub2_24 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class85 local15 = arg2[local10];
			if (local15.anInt2649 > local8) {
				local8 = local15.anInt2649;
			}
			if (local15.anInt2652 > local8) {
				local8 = local15.anInt2652;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(66) int local66;
		@Pc(72) int local72;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class85 local51 = arg2[local46];
			@Pc(54) byte[] local54 = local51.aByteArray51;
			local57 = local51.anInt2649;
			local60 = local51.anInt2652;
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
		this.aClass55_Sub3_Sub1_4 = Static205.method3256(local37, arg0, local37, local44);
		this.aBoolean305 = true;
		this.aClass55_Sub3_Sub1_4.method5553(false);
		this.aClass117_2 = new Class117(arg0, 256);
		@Pc(290) float local290 = this.aClass55_Sub3_Sub1_4.aFloat100 / (float) this.aClass55_Sub3_Sub1_4.anInt6500;
		@Pc(299) float local299 = this.aClass55_Sub3_Sub1_4.aFloat101 / (float) this.aClass55_Sub3_Sub1_4.anInt6503;
		for (@Pc(301) int local301 = 0; local301 < 256; local301++) {
			@Pc(306) Class85 local306 = arg2[local301];
			local57 = local306.anInt2649;
			local60 = local306.anInt2652;
			local66 = local306.anInt2647;
			local72 = local306.anInt2650;
			@Pc(325) float local325 = (float) (local301 % 16 * local8);
			@Pc(332) float local332 = (float) (local301 / 16 * local8);
			@Pc(336) float local336 = local325 * local290;
			@Pc(340) float local340 = local332 * local299;
			@Pc(347) float local347 = (local325 + (float) local60) * local290;
			@Pc(354) float local354 = (local332 + (float) local57) * local299;
			this.aClass117_2.method2648(local301);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local336, this.aClass55_Sub3_Sub1_4.aFloat101 - local340);
			OpenGL.glVertex2i(local72, local66);
			OpenGL.glTexCoord2f(local336, this.aClass55_Sub3_Sub1_4.aFloat101 - local354);
			OpenGL.glVertex2i(local72, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass55_Sub3_Sub1_4.aFloat101 - local354);
			OpenGL.glVertex2i(local72 + local60, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass55_Sub3_Sub1_4.aFloat101 - local340);
			OpenGL.glVertex2i(local72 + local60, local66);
			OpenGL.glEnd();
			this.aClass117_2.method2647();
		}
	}

	@OriginalMember(owner = "client!lb", name = "OA", descriptor = "(CIIIZ)V")
	@Override
	protected void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass49_Sub2_24.method1630();
		this.aClass49_Sub2_24.method1646(this.aClass55_Sub3_Sub1_4);
		if (this.aBoolean305 || arg4) {
			this.aClass49_Sub2_24.method1613(7681, 8448);
			this.aClass49_Sub2_24.method1625(34168, 768, 0);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass117_2.method2645(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean305 || arg4) {
			this.aClass49_Sub2_24.method1625(5890, 768, 0);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(CIIIZLclient!ma;II)V")
	@Override
	protected void method4809(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class73 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class73_Sub2 local2 = (Class73_Sub2) arg5;
		@Pc(5) Class55_Sub3_Sub1 local5 = local2.aClass55_Sub3_Sub1_5;
		this.aClass49_Sub2_24.method1630();
		this.aClass49_Sub2_24.method1646(this.aClass55_Sub3_Sub1_4);
		if (this.aBoolean305 || arg4) {
			this.aClass49_Sub2_24.method1613(7681, 8448);
			this.aClass49_Sub2_24.method1625(34168, 768, 0);
		}
		this.aClass49_Sub2_24.method1600(1);
		this.aClass49_Sub2_24.method1646(local5);
		this.aClass49_Sub2_24.method1613(7681, 8448);
		this.aClass49_Sub2_24.method1625(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(71) float local71 = local5.aFloat100 / (float) local5.anInt6500;
		@Pc(78) float local78 = local5.aFloat101 / (float) local5.anInt6503;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local71, 0.0F, 0.0F, (float) -arg6 * local71 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local78, 0.0F, (float) -arg7 * local78 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass117_2.method2645(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass49_Sub2_24.method1625(5890, 768, 0);
		this.aClass49_Sub2_24.method1613(8448, 8448);
		this.aClass49_Sub2_24.method1646(null);
		this.aClass49_Sub2_24.method1600(0);
		if (this.aBoolean305 || arg4) {
			this.aClass49_Sub2_24.method1625(5890, 768, 0);
		}
	}
}
