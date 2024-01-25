import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class137_Sub2 extends Class137 {

	@OriginalMember(owner = "client!qu", name = "y", descriptor = "Lclient!ih;")
	private final Class117_Sub1 aClass117_Sub1_33;

	@OriginalMember(owner = "client!qu", name = "x", descriptor = "Lclient!wh;")
	private final Class23_Sub3_Sub1 aClass23_Sub3_Sub1_5;

	@OriginalMember(owner = "client!qu", name = "A", descriptor = "Z")
	private final boolean aBoolean506;

	@OriginalMember(owner = "client!qu", name = "z", descriptor = "Lclient!gk;")
	private final Class94 aClass94_3;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lclient!ih;Lclient!ul;[Lclient!dd;Z)V")
	public Class137_Sub2(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) Class252 arg1, @OriginalArg(2) Class52[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass117_Sub1_33 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class52 local15 = arg2[local10];
			if (local15.anInt1015 > local8) {
				local8 = local15.anInt1015;
			}
			if (local15.anInt1019 > local8) {
				local8 = local15.anInt1019;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(66) int local66;
		@Pc(72) int local72;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class52 local51 = arg2[local46];
			@Pc(54) byte[] local54 = local51.aByteArray13;
			local57 = local51.anInt1015;
			local60 = local51.anInt1019;
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
		this.aClass23_Sub3_Sub1_5 = Static165.method2163(arg0, local37, local37, local44);
		this.aBoolean506 = true;
		this.aClass23_Sub3_Sub1_5.method5805(false);
		this.aClass94_3 = new Class94(arg0, 256);
		@Pc(290) float local290 = this.aClass23_Sub3_Sub1_5.aFloat89 / (float) this.aClass23_Sub3_Sub1_5.anInt7184;
		@Pc(299) float local299 = this.aClass23_Sub3_Sub1_5.aFloat88 / (float) this.aClass23_Sub3_Sub1_5.anInt7183;
		for (@Pc(301) int local301 = 0; local301 < 256; local301++) {
			@Pc(306) Class52 local306 = arg2[local301];
			local57 = local306.anInt1015;
			local60 = local306.anInt1019;
			local66 = local306.anInt1017;
			local72 = local306.anInt1020;
			@Pc(325) float local325 = (float) (local301 % 16 * local8);
			@Pc(332) float local332 = (float) (local301 / 16 * local8);
			@Pc(336) float local336 = local325 * local290;
			@Pc(340) float local340 = local332 * local299;
			@Pc(347) float local347 = (local325 + (float) local60) * local290;
			@Pc(354) float local354 = (local332 + (float) local57) * local299;
			this.aClass94_3.method1744(local301);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local336, this.aClass23_Sub3_Sub1_5.aFloat88 - local340);
			OpenGL.glVertex2i(local72, local66);
			OpenGL.glTexCoord2f(local336, this.aClass23_Sub3_Sub1_5.aFloat88 - local354);
			OpenGL.glVertex2i(local72, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass23_Sub3_Sub1_5.aFloat88 - local354);
			OpenGL.glVertex2i(local72 + local60, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass23_Sub3_Sub1_5.aFloat88 - local340);
			OpenGL.glVertex2i(local72 + local60, local66);
			OpenGL.glEnd();
			this.aClass94_3.method1745();
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(CIIIZLclient!ta;II)V")
	@Override
	protected void method4597(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class73 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class73_Sub1 local2 = (Class73_Sub1) arg5;
		@Pc(5) Class23_Sub3_Sub1 local5 = local2.aClass23_Sub3_Sub1_1;
		this.aClass117_Sub1_33.method2515();
		this.aClass117_Sub1_33.method2504(this.aClass23_Sub3_Sub1_5);
		if (this.aBoolean506 || arg4) {
			this.aClass117_Sub1_33.method2471(8448, 7681);
			this.aClass117_Sub1_33.method2505(0, 34168, 768);
		}
		this.aClass117_Sub1_33.method2476(1);
		this.aClass117_Sub1_33.method2504(local5);
		this.aClass117_Sub1_33.method2471(8448, 7681);
		this.aClass117_Sub1_33.method2505(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(71) float local71 = local5.aFloat89 / (float) local5.anInt7184;
		@Pc(78) float local78 = local5.aFloat88 / (float) local5.anInt7183;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local71, 0.0F, 0.0F, (float) -arg6 * local71 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local78, 0.0F, (float) -arg7 * local78 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass94_3.method1738(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass117_Sub1_33.method2505(0, 5890, 768);
		this.aClass117_Sub1_33.method2471(8448, 8448);
		this.aClass117_Sub1_33.method2504(null);
		this.aClass117_Sub1_33.method2476(0);
		if (this.aBoolean506 || arg4) {
			this.aClass117_Sub1_33.method2505(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!qu", name = "B", descriptor = "(CIIIZ)V")
	@Override
	protected void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass117_Sub1_33.method2515();
		this.aClass117_Sub1_33.method2504(this.aClass23_Sub3_Sub1_5);
		if (this.aBoolean506 || arg4) {
			this.aClass117_Sub1_33.method2471(8448, 7681);
			this.aClass117_Sub1_33.method2505(0, 34168, 768);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass94_3.method1738(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean506 || arg4) {
			this.aClass117_Sub1_33.method2505(0, 5890, 768);
		}
	}
}
