import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class57_Sub1 extends Class57 {

	@OriginalMember(owner = "client!dm", name = "z", descriptor = "Lclient!da;")
	private final Class50_Sub1 aClass50_Sub1_13;

	@OriginalMember(owner = "client!dm", name = "A", descriptor = "Lclient!al;")
	private final Class4_Sub1_Sub1 aClass4_Sub1_Sub1_2;

	@OriginalMember(owner = "client!dm", name = "x", descriptor = "Z")
	private final boolean aBoolean110;

	@OriginalMember(owner = "client!dm", name = "y", descriptor = "Lclient!tm;")
	private final Class239 aClass239_2;

	@OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lclient!da;Lclient!fj;[Lclient!ef;Z)V")
	public Class57_Sub1(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) Class66[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass50_Sub1_13 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class66 local15 = arg2[local10];
			if (local15.anInt1862 > local8) {
				local8 = local15.anInt1862;
			}
			if (local15.anInt1861 > local8) {
				local8 = local15.anInt1861;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(66) int local66;
		@Pc(72) int local72;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class66 local51 = arg2[local46];
			@Pc(54) byte[] local54 = local51.aByteArray15;
			local57 = local51.anInt1862;
			local60 = local51.anInt1861;
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
		this.aClass4_Sub1_Sub1_2 = Static141.method2403(local37, arg0, local44, local37);
		this.aBoolean110 = true;
		this.aClass4_Sub1_Sub1_2.method4580(false);
		this.aClass239_2 = new Class239(arg0, 256);
		@Pc(290) float local290 = this.aClass4_Sub1_Sub1_2.aFloat4 / (float) this.aClass4_Sub1_Sub1_2.anInt214;
		@Pc(299) float local299 = this.aClass4_Sub1_Sub1_2.aFloat3 / (float) this.aClass4_Sub1_Sub1_2.anInt216;
		for (@Pc(301) int local301 = 0; local301 < 256; local301++) {
			@Pc(306) Class66 local306 = arg2[local301];
			local57 = local306.anInt1862;
			local60 = local306.anInt1861;
			local66 = local306.anInt1864;
			local72 = local306.anInt1865;
			@Pc(325) float local325 = (float) (local301 % 16 * local8);
			@Pc(332) float local332 = (float) (local301 / 16 * local8);
			@Pc(336) float local336 = local325 * local290;
			@Pc(340) float local340 = local332 * local299;
			@Pc(347) float local347 = (local325 + (float) local60) * local290;
			@Pc(354) float local354 = (local332 + (float) local57) * local299;
			this.aClass239_2.method5221(local301);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local336, this.aClass4_Sub1_Sub1_2.aFloat3 - local340);
			OpenGL.glVertex2i(local72, local66);
			OpenGL.glTexCoord2f(local336, this.aClass4_Sub1_Sub1_2.aFloat3 - local354);
			OpenGL.glVertex2i(local72, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass4_Sub1_Sub1_2.aFloat3 - local354);
			OpenGL.glVertex2i(local72 + local60, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass4_Sub1_Sub1_2.aFloat3 - local340);
			OpenGL.glVertex2i(local72 + local60, local66);
			OpenGL.glEnd();
			this.aClass239_2.method5222();
		}
	}

	@OriginalMember(owner = "client!dm", name = "B", descriptor = "(CIIIZ)V")
	@Override
	protected void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass50_Sub1_13.method1260();
		this.aClass50_Sub1_13.method1295(this.aClass4_Sub1_Sub1_2);
		if (this.aBoolean110 || arg4) {
			this.aClass50_Sub1_13.method1316(7681, 8448);
			this.aClass50_Sub1_13.method1309(0, 34168, 768);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass239_2.method5224(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean110 || arg4) {
			this.aClass50_Sub1_13.method1309(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(CIIIZLclient!ta;II)V")
	@Override
	protected void method5945(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class49 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class49_Sub2 local2 = (Class49_Sub2) arg5;
		@Pc(5) Class4_Sub1_Sub1 local5 = local2.aClass4_Sub1_Sub1_5;
		this.aClass50_Sub1_13.method1260();
		this.aClass50_Sub1_13.method1295(this.aClass4_Sub1_Sub1_2);
		if (this.aBoolean110 || arg4) {
			this.aClass50_Sub1_13.method1316(7681, 8448);
			this.aClass50_Sub1_13.method1309(0, 34168, 768);
		}
		this.aClass50_Sub1_13.method1300(1);
		this.aClass50_Sub1_13.method1295(local5);
		this.aClass50_Sub1_13.method1316(7681, 8448);
		this.aClass50_Sub1_13.method1309(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(71) float local71 = local5.aFloat4 / (float) local5.anInt214;
		@Pc(78) float local78 = local5.aFloat3 / (float) local5.anInt216;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local71, 0.0F, 0.0F, (float) -arg6 * local71 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local78, 0.0F, (float) -arg7 * local78 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass239_2.method5224(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass50_Sub1_13.method1309(0, 5890, 768);
		this.aClass50_Sub1_13.method1316(8448, 8448);
		this.aClass50_Sub1_13.method1295(null);
		this.aClass50_Sub1_13.method1300(0);
		if (this.aBoolean110 || arg4) {
			this.aClass50_Sub1_13.method1309(0, 5890, 768);
		}
	}
}
