import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class46_Sub2 extends Class46 {

	@OriginalMember(owner = "client!fm", name = "y", descriptor = "Lclient!fd;")
	private final Class19_Sub2 aClass19_Sub2_17;

	@OriginalMember(owner = "client!fm", name = "x", descriptor = "Lclient!ps;")
	private final Class6_Sub1_Sub1 aClass6_Sub1_Sub1_2;

	@OriginalMember(owner = "client!fm", name = "w", descriptor = "Z")
	private final boolean aBoolean225;

	@OriginalMember(owner = "client!fm", name = "z", descriptor = "Lclient!ct;")
	private final Class43 aClass43_3;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!fd;Lclient!gt;[Lclient!bb;Z)V")
	public Class46_Sub2(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(2) Class18[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass19_Sub2_17 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class18 local15 = arg2[local10];
			if (local15.anInt366 > local8) {
				local8 = local15.anInt366;
			}
			if (local15.anInt367 > local8) {
				local8 = local15.anInt367;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(66) int local66;
		@Pc(72) int local72;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class18 local51 = arg2[local46];
			@Pc(54) byte[] local54 = local51.aByteArray4;
			local57 = local51.anInt366;
			local60 = local51.anInt367;
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
		this.aClass6_Sub1_Sub1_2 = Static38.method671(local44, arg0, local37, local37);
		this.aBoolean225 = true;
		this.aClass6_Sub1_Sub1_2.method4181(false);
		this.aClass43_3 = new Class43(arg0, 256);
		@Pc(290) float local290 = this.aClass6_Sub1_Sub1_2.aFloat172 / (float) this.aClass6_Sub1_Sub1_2.anInt5470;
		@Pc(299) float local299 = this.aClass6_Sub1_Sub1_2.aFloat171 / (float) this.aClass6_Sub1_Sub1_2.anInt5474;
		for (@Pc(301) int local301 = 0; local301 < 256; local301++) {
			@Pc(306) Class18 local306 = arg2[local301];
			local57 = local306.anInt366;
			local60 = local306.anInt367;
			local66 = local306.anInt370;
			local72 = local306.anInt368;
			@Pc(325) float local325 = (float) (local301 % 16 * local8);
			@Pc(332) float local332 = (float) (local301 / 16 * local8);
			@Pc(336) float local336 = local325 * local290;
			@Pc(340) float local340 = local332 * local299;
			@Pc(347) float local347 = (local325 + (float) local60) * local290;
			@Pc(354) float local354 = (local332 + (float) local57) * local299;
			this.aClass43_3.method990(local301);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local336, this.aClass6_Sub1_Sub1_2.aFloat171 - local340);
			OpenGL.glVertex2i(local72, local66);
			OpenGL.glTexCoord2f(local336, this.aClass6_Sub1_Sub1_2.aFloat171 - local354);
			OpenGL.glVertex2i(local72, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass6_Sub1_Sub1_2.aFloat171 - local354);
			OpenGL.glVertex2i(local72 + local60, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass6_Sub1_Sub1_2.aFloat171 - local340);
			OpenGL.glVertex2i(local72 + local60, local66);
			OpenGL.glEnd();
			this.aClass43_3.method991();
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(CIIIZLclient!ma;II)V")
	@Override
	protected void method5051(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class145 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class145_Sub1 local2 = (Class145_Sub1) arg5;
		@Pc(5) Class6_Sub1_Sub1 local5 = local2.aClass6_Sub1_Sub1_5;
		this.aClass19_Sub2_17.method1929();
		this.aClass19_Sub2_17.method1905(this.aClass6_Sub1_Sub1_2);
		if (this.aBoolean225 || arg4) {
			this.aClass19_Sub2_17.method1912(7681, 8448);
			this.aClass19_Sub2_17.method1945(0, 768, 34168);
		}
		this.aClass19_Sub2_17.method1936(1);
		this.aClass19_Sub2_17.method1905(local5);
		this.aClass19_Sub2_17.method1912(7681, 8448);
		this.aClass19_Sub2_17.method1945(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(71) float local71 = local5.aFloat172 / (float) local5.anInt5470;
		@Pc(78) float local78 = local5.aFloat171 / (float) local5.anInt5474;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local71, 0.0F, 0.0F, (float) -arg6 * local71 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local78, 0.0F, (float) -arg7 * local78 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass43_3.method989(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass19_Sub2_17.method1945(0, 768, 5890);
		this.aClass19_Sub2_17.method1912(8448, 8448);
		this.aClass19_Sub2_17.method1905(null);
		this.aClass19_Sub2_17.method1936(0);
		if (this.aBoolean225 || arg4) {
			this.aClass19_Sub2_17.method1945(0, 768, 5890);
		}
	}

	@OriginalMember(owner = "client!fm", name = "OA", descriptor = "(CIIIZ)V")
	@Override
	protected void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass19_Sub2_17.method1929();
		this.aClass19_Sub2_17.method1905(this.aClass6_Sub1_Sub1_2);
		if (this.aBoolean225 || arg4) {
			this.aClass19_Sub2_17.method1912(7681, 8448);
			this.aClass19_Sub2_17.method1945(0, 768, 34168);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass43_3.method989(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean225 || arg4) {
			this.aClass19_Sub2_17.method1945(0, 768, 5890);
		}
	}
}
