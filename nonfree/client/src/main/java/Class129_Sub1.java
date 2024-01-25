import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class129_Sub1 extends Class129 {

	@OriginalMember(owner = "client!jk", name = "u", descriptor = "Lclient!ht;")
	private final Class109_Sub1 aClass109_Sub1_23;

	@OriginalMember(owner = "client!jk", name = "w", descriptor = "Lclient!cq;")
	private final Class13_Sub1_Sub1 aClass13_Sub1_Sub1_2;

	@OriginalMember(owner = "client!jk", name = "x", descriptor = "Z")
	private final boolean aBoolean249;

	@OriginalMember(owner = "client!jk", name = "v", descriptor = "Lclient!wu;")
	private final Class269 aClass269_5;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!ht;Lclient!gv;[Lclient!mp;Z)V")
	public Class129_Sub1(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) Class159[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass109_Sub1_23 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class159 local15 = arg2[local10];
			if (local15.anInt4569 > local8) {
				local8 = local15.anInt4569;
			}
			if (local15.anInt4573 > local8) {
				local8 = local15.anInt4573;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(66) int local66;
		@Pc(72) int local72;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class159 local51 = arg2[local46];
			@Pc(54) byte[] local54 = local51.aByteArray58;
			local57 = local51.anInt4569;
			local60 = local51.anInt4573;
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
		this.aClass13_Sub1_Sub1_2 = Static96.method1521(local37, local44, arg0, local37);
		this.aBoolean249 = true;
		this.aClass13_Sub1_Sub1_2.method2745(false);
		this.aClass269_5 = new Class269(arg0, 256);
		@Pc(290) float local290 = this.aClass13_Sub1_Sub1_2.aFloat28 / (float) this.aClass13_Sub1_Sub1_2.anInt1249;
		@Pc(299) float local299 = this.aClass13_Sub1_Sub1_2.aFloat27 / (float) this.aClass13_Sub1_Sub1_2.anInt1252;
		for (@Pc(301) int local301 = 0; local301 < 256; local301++) {
			@Pc(306) Class159 local306 = arg2[local301];
			local57 = local306.anInt4569;
			local60 = local306.anInt4573;
			local66 = local306.anInt4572;
			local72 = local306.anInt4568;
			@Pc(325) float local325 = (float) (local301 % 16 * local8);
			@Pc(332) float local332 = (float) (local301 / 16 * local8);
			@Pc(336) float local336 = local325 * local290;
			@Pc(340) float local340 = local332 * local299;
			@Pc(347) float local347 = (local325 + (float) local60) * local290;
			@Pc(354) float local354 = (local332 + (float) local57) * local299;
			this.aClass269_5.method6086(local301);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local336, this.aClass13_Sub1_Sub1_2.aFloat27 - local340);
			OpenGL.glVertex2i(local72, local66);
			OpenGL.glTexCoord2f(local336, this.aClass13_Sub1_Sub1_2.aFloat27 - local354);
			OpenGL.glVertex2i(local72, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass13_Sub1_Sub1_2.aFloat27 - local354);
			OpenGL.glVertex2i(local72 + local60, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass13_Sub1_Sub1_2.aFloat27 - local340);
			OpenGL.glVertex2i(local72 + local60, local66);
			OpenGL.glEnd();
			this.aClass269_5.method6090();
		}
	}

	@OriginalMember(owner = "client!jk", name = "B", descriptor = "(CIIIZ)V")
	@Override
	protected void B(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass109_Sub1_23.method2572();
		this.aClass109_Sub1_23.method2578(this.aClass13_Sub1_Sub1_2);
		if (this.aBoolean249 || arg4) {
			this.aClass109_Sub1_23.method2549(7681, 8448);
			this.aClass109_Sub1_23.method2528(34168, 768, 0);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass269_5.method6088(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean249 || arg4) {
			this.aClass109_Sub1_23.method2528(5890, 768, 0);
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(CIIIZLclient!ea;II)V")
	@Override
	protected void method5824(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class62 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class62_Sub2 local2 = (Class62_Sub2) arg5;
		@Pc(5) Class13_Sub1_Sub1 local5 = local2.aClass13_Sub1_Sub1_5;
		this.aClass109_Sub1_23.method2572();
		this.aClass109_Sub1_23.method2578(this.aClass13_Sub1_Sub1_2);
		if (this.aBoolean249 || arg4) {
			this.aClass109_Sub1_23.method2549(7681, 8448);
			this.aClass109_Sub1_23.method2528(34168, 768, 0);
		}
		this.aClass109_Sub1_23.method2564(1);
		this.aClass109_Sub1_23.method2578(local5);
		this.aClass109_Sub1_23.method2549(7681, 8448);
		this.aClass109_Sub1_23.method2528(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(71) float local71 = local5.aFloat28 / (float) local5.anInt1249;
		@Pc(78) float local78 = local5.aFloat27 / (float) local5.anInt1252;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local71, 0.0F, 0.0F, (float) -arg6 * local71 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local78, 0.0F, (float) -arg7 * local78 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass269_5.method6088(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass109_Sub1_23.method2528(5890, 768, 0);
		this.aClass109_Sub1_23.method2549(8448, 8448);
		this.aClass109_Sub1_23.method2578(null);
		this.aClass109_Sub1_23.method2564(0);
		if (this.aBoolean249 || arg4) {
			this.aClass109_Sub1_23.method2528(5890, 768, 0);
		}
	}
}
