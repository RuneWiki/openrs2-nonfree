import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "Lclient!qg;")
	private final Class121_Sub2 aClass121_Sub2_2;

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "Lclient!ls;")
	private final Class21_Sub2_Sub1 aClass21_Sub2_Sub1_1;

	@OriginalMember(owner = "client!ac", name = "A", descriptor = "Z")
	private final boolean aBoolean4;

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "Lclient!cn;")
	private final Class46 aClass46_1;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!qg;Lclient!ds;[Lclient!dt;Z)V")
	public Class4_Sub1(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) Class63[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass121_Sub2_2 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class63 local15 = arg2[local10];
			if (local15.anInt1470 > local8) {
				local8 = local15.anInt1470;
			}
			if (local15.anInt1472 > local8) {
				local8 = local15.anInt1472;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(66) int local66;
		@Pc(72) int local72;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class63 local51 = arg2[local46];
			@Pc(54) byte[] local54 = local51.aByteArray11;
			local57 = local51.anInt1470;
			local60 = local51.anInt1472;
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
		this.aClass21_Sub2_Sub1_1 = Static301.method4106(arg0, local37, local37, local44);
		this.aBoolean4 = true;
		this.aClass21_Sub2_Sub1_1.method3755(false);
		this.aClass46_1 = new Class46(arg0, 256);
		@Pc(290) float local290 = this.aClass21_Sub2_Sub1_1.aFloat72 / (float) this.aClass21_Sub2_Sub1_1.anInt4204;
		@Pc(299) float local299 = this.aClass21_Sub2_Sub1_1.aFloat73 / (float) this.aClass21_Sub2_Sub1_1.anInt4202;
		for (@Pc(301) int local301 = 0; local301 < 256; local301++) {
			@Pc(306) Class63 local306 = arg2[local301];
			local57 = local306.anInt1470;
			local60 = local306.anInt1472;
			local66 = local306.anInt1468;
			local72 = local306.anInt1473;
			@Pc(325) float local325 = (float) (local301 % 16 * local8);
			@Pc(332) float local332 = (float) (local301 / 16 * local8);
			@Pc(336) float local336 = local325 * local290;
			@Pc(340) float local340 = local332 * local299;
			@Pc(347) float local347 = (local325 + (float) local60) * local290;
			@Pc(354) float local354 = (local332 + (float) local57) * local299;
			this.aClass46_1.method778(local301);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local336, this.aClass21_Sub2_Sub1_1.aFloat73 - local340);
			OpenGL.glVertex2i(local72, local66);
			OpenGL.glTexCoord2f(local336, this.aClass21_Sub2_Sub1_1.aFloat73 - local354);
			OpenGL.glVertex2i(local72, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass21_Sub2_Sub1_1.aFloat73 - local354);
			OpenGL.glVertex2i(local72 + local60, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass21_Sub2_Sub1_1.aFloat73 - local340);
			OpenGL.glVertex2i(local72 + local60, local66);
			OpenGL.glEnd();
			this.aClass46_1.method779();
		}
	}

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "(CIIIZ)V")
	@Override
	protected void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass121_Sub2_2.method4656();
		this.aClass121_Sub2_2.method4681(this.aClass21_Sub2_Sub1_1);
		if (this.aBoolean4 || arg4) {
			this.aClass121_Sub2_2.method4709(8448, 7681);
			this.aClass121_Sub2_2.method4692(0, 34168, 768);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass46_1.method781(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean4 || arg4) {
			this.aClass121_Sub2_2.method4692(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(CIIIZLclient!ea;II)V")
	@Override
	protected void method5842(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class34 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class34_Sub2 local2 = (Class34_Sub2) arg5;
		@Pc(5) Class21_Sub2_Sub1 local5 = local2.aClass21_Sub2_Sub1_2;
		this.aClass121_Sub2_2.method4656();
		this.aClass121_Sub2_2.method4681(this.aClass21_Sub2_Sub1_1);
		if (this.aBoolean4 || arg4) {
			this.aClass121_Sub2_2.method4709(8448, 7681);
			this.aClass121_Sub2_2.method4692(0, 34168, 768);
		}
		this.aClass121_Sub2_2.method4669(1);
		this.aClass121_Sub2_2.method4681(local5);
		this.aClass121_Sub2_2.method4709(8448, 7681);
		this.aClass121_Sub2_2.method4692(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(71) float local71 = local5.aFloat72 / (float) local5.anInt4204;
		@Pc(78) float local78 = local5.aFloat73 / (float) local5.anInt4202;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local71, 0.0F, 0.0F, (float) -arg6 * local71 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local78, 0.0F, (float) -arg7 * local78 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass46_1.method781(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass121_Sub2_2.method4692(0, 5890, 768);
		this.aClass121_Sub2_2.method4709(8448, 8448);
		this.aClass121_Sub2_2.method4681(null);
		this.aClass121_Sub2_2.method4669(0);
		if (this.aBoolean4 || arg4) {
			this.aClass121_Sub2_2.method4692(0, 5890, 768);
		}
	}
}
