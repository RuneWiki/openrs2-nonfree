import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class92_Sub2 extends Class92 {

	@OriginalMember(owner = "client!hc", name = "B", descriptor = "Lclient!bl;")
	private final Class28_Sub1 aClass28_Sub1_18;

	@OriginalMember(owner = "client!hc", name = "A", descriptor = "Lclient!js;")
	private final Class40_Sub3_Sub1 aClass40_Sub3_Sub1_3;

	@OriginalMember(owner = "client!hc", name = "z", descriptor = "Z")
	private final boolean aBoolean186;

	@OriginalMember(owner = "client!hc", name = "y", descriptor = "Lclient!kq;")
	private final Class144 aClass144_2;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!bl;Lclient!pm;[Lclient!fd;Z)V")
	public Class92_Sub2(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) Class201 arg1, @OriginalArg(2) Class77[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass28_Sub1_18 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class77 local15 = arg2[local10];
			if (local15.anInt1844 > local8) {
				local8 = local15.anInt1844;
			}
			if (local15.anInt1842 > local8) {
				local8 = local15.anInt1842;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(66) int local66;
		@Pc(72) int local72;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class77 local51 = arg2[local46];
			@Pc(54) byte[] local54 = local51.aByteArray23;
			local57 = local51.anInt1844;
			local60 = local51.anInt1842;
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
		this.aClass40_Sub3_Sub1_3 = Static339.method4788(local37, local37, arg0, local44);
		this.aBoolean186 = true;
		this.aClass40_Sub3_Sub1_3.method5148(false);
		this.aClass144_2 = new Class144(arg0, 256);
		@Pc(290) float local290 = this.aClass40_Sub3_Sub1_3.aFloat61 / (float) this.aClass40_Sub3_Sub1_3.anInt3384;
		@Pc(299) float local299 = this.aClass40_Sub3_Sub1_3.aFloat62 / (float) this.aClass40_Sub3_Sub1_3.anInt3385;
		for (@Pc(301) int local301 = 0; local301 < 256; local301++) {
			@Pc(306) Class77 local306 = arg2[local301];
			local57 = local306.anInt1844;
			local60 = local306.anInt1842;
			local66 = local306.anInt1846;
			local72 = local306.anInt1845;
			@Pc(325) float local325 = (float) (local301 % 16 * local8);
			@Pc(332) float local332 = (float) (local301 / 16 * local8);
			@Pc(336) float local336 = local325 * local290;
			@Pc(340) float local340 = local332 * local299;
			@Pc(347) float local347 = (local325 + (float) local60) * local290;
			@Pc(354) float local354 = (local332 + (float) local57) * local299;
			this.aClass144_2.method3283(local301);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local336, this.aClass40_Sub3_Sub1_3.aFloat62 - local340);
			OpenGL.glVertex2i(local72, local66);
			OpenGL.glTexCoord2f(local336, this.aClass40_Sub3_Sub1_3.aFloat62 - local354);
			OpenGL.glVertex2i(local72, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass40_Sub3_Sub1_3.aFloat62 - local354);
			OpenGL.glVertex2i(local72 + local60, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass40_Sub3_Sub1_3.aFloat62 - local340);
			OpenGL.glVertex2i(local72 + local60, local66);
			OpenGL.glEnd();
			this.aClass144_2.method3284();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(CIIIZLclient!be;II)V")
	@Override
	protected void method5640(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class24 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class24_Sub2 local2 = (Class24_Sub2) arg5;
		@Pc(5) Class40_Sub3_Sub1 local5 = local2.aClass40_Sub3_Sub1_2;
		this.aClass28_Sub1_18.method701();
		this.aClass28_Sub1_18.method654(this.aClass40_Sub3_Sub1_3);
		if (this.aBoolean186 || arg4) {
			this.aClass28_Sub1_18.method692(8448, 7681);
			this.aClass28_Sub1_18.method665(34168, 768, 0);
		}
		this.aClass28_Sub1_18.method650(1);
		this.aClass28_Sub1_18.method654(local5);
		this.aClass28_Sub1_18.method692(8448, 7681);
		this.aClass28_Sub1_18.method665(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(71) float local71 = local5.aFloat61 / (float) local5.anInt3384;
		@Pc(78) float local78 = local5.aFloat62 / (float) local5.anInt3385;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local71, 0.0F, 0.0F, (float) -arg6 * local71 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local78, 0.0F, (float) -arg7 * local78 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass144_2.method3285(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass28_Sub1_18.method665(5890, 768, 0);
		this.aClass28_Sub1_18.method692(8448, 8448);
		this.aClass28_Sub1_18.method654(null);
		this.aClass28_Sub1_18.method650(0);
		if (this.aBoolean186 || arg4) {
			this.aClass28_Sub1_18.method665(5890, 768, 0);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(CIIIZ)V")
	@Override
	protected void method5649(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass28_Sub1_18.method701();
		this.aClass28_Sub1_18.method654(this.aClass40_Sub3_Sub1_3);
		if (this.aBoolean186 || arg4) {
			this.aClass28_Sub1_18.method692(8448, 7681);
			this.aClass28_Sub1_18.method665(34168, 768, 0);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass144_2.method3285(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean186 || arg4) {
			this.aClass28_Sub1_18.method665(5890, 768, 0);
		}
	}
}
