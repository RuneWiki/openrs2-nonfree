import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class18_Sub3 extends Class18 {

	@OriginalMember(owner = "client!lm", name = "C", descriptor = "Lclient!bt;")
	private final Class30_Sub1 aClass30_Sub1_28;

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "Lclient!hf;")
	private final Class62_Sub2_Sub1 aClass62_Sub2_Sub1_2;

	@OriginalMember(owner = "client!lm", name = "A", descriptor = "Z")
	private final boolean aBoolean294;

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "Lclient!uv;")
	private final Class260 aClass260_2;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!bt;Lclient!gg;[Lclient!ho;Z)V")
	public Class18_Sub3(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class98[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass30_Sub1_28 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class98 local15 = arg2[local10];
			if (local15.anInt3175 > local8) {
				local8 = local15.anInt3175;
			}
			if (local15.anInt3171 > local8) {
				local8 = local15.anInt3171;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(60) int local60;
		@Pc(66) int local66;
		@Pc(72) int local72;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class98 local51 = arg2[local46];
			@Pc(54) byte[] local54 = local51.aByteArray33;
			local57 = local51.anInt3175;
			local60 = local51.anInt3171;
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
		this.aClass62_Sub2_Sub1_2 = Static274.method4386(local44, local37, arg0, local37);
		this.aBoolean294 = true;
		this.aClass62_Sub2_Sub1_2.method5349(false);
		this.aClass260_2 = new Class260(arg0, 256);
		@Pc(290) float local290 = this.aClass62_Sub2_Sub1_2.aFloat61 / (float) this.aClass62_Sub2_Sub1_2.anInt3025;
		@Pc(299) float local299 = this.aClass62_Sub2_Sub1_2.aFloat60 / (float) this.aClass62_Sub2_Sub1_2.anInt3028;
		for (@Pc(301) int local301 = 0; local301 < 256; local301++) {
			@Pc(306) Class98 local306 = arg2[local301];
			local57 = local306.anInt3175;
			local60 = local306.anInt3171;
			local66 = local306.anInt3176;
			local72 = local306.anInt3173;
			@Pc(325) float local325 = (float) (local301 % 16 * local8);
			@Pc(332) float local332 = (float) (local301 / 16 * local8);
			@Pc(336) float local336 = local325 * local290;
			@Pc(340) float local340 = local332 * local299;
			@Pc(347) float local347 = (local325 + (float) local60) * local290;
			@Pc(354) float local354 = (local332 + (float) local57) * local299;
			this.aClass260_2.method5892(local301);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local336, this.aClass62_Sub2_Sub1_2.aFloat60 - local340);
			OpenGL.glVertex2i(local72, local66);
			OpenGL.glTexCoord2f(local336, this.aClass62_Sub2_Sub1_2.aFloat60 - local354);
			OpenGL.glVertex2i(local72, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass62_Sub2_Sub1_2.aFloat60 - local354);
			OpenGL.glVertex2i(local72 + local60, local66 + local57);
			OpenGL.glTexCoord2f(local347, this.aClass62_Sub2_Sub1_2.aFloat60 - local340);
			OpenGL.glVertex2i(local72 + local60, local66);
			OpenGL.glEnd();
			this.aClass260_2.method5894();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(CIIIZLclient!i;II)V")
	@Override
	protected void method5756(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class74 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class74_Sub2 local2 = (Class74_Sub2) arg5;
		@Pc(5) Class62_Sub2_Sub1 local5 = local2.aClass62_Sub2_Sub1_5;
		this.aClass30_Sub1_28.method747();
		this.aClass30_Sub1_28.method730(this.aClass62_Sub2_Sub1_2);
		if (this.aBoolean294 || arg4) {
			this.aClass30_Sub1_28.method724(7681, 8448);
			this.aClass30_Sub1_28.method752(34168, 768, 0);
		}
		this.aClass30_Sub1_28.method726(1);
		this.aClass30_Sub1_28.method730(local5);
		this.aClass30_Sub1_28.method724(7681, 8448);
		this.aClass30_Sub1_28.method752(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(71) float local71 = local5.aFloat61 / (float) local5.anInt3025;
		@Pc(78) float local78 = local5.aFloat60 / (float) local5.anInt3028;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local71, 0.0F, 0.0F, (float) -arg6 * local71 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local78, 0.0F, (float) -arg7 * local78 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass260_2.method5895(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass30_Sub1_28.method752(5890, 768, 0);
		this.aClass30_Sub1_28.method724(8448, 8448);
		this.aClass30_Sub1_28.method730(null);
		this.aClass30_Sub1_28.method726(0);
		if (this.aBoolean294 || arg4) {
			this.aClass30_Sub1_28.method752(5890, 768, 0);
		}
	}

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "(CIIIZ)V")
	@Override
	protected void g(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass30_Sub1_28.method747();
		this.aClass30_Sub1_28.method730(this.aClass62_Sub2_Sub1_2);
		if (this.aBoolean294 || arg4) {
			this.aClass30_Sub1_28.method724(7681, 8448);
			this.aClass30_Sub1_28.method752(34168, 768, 0);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass260_2.method5895(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean294 || arg4) {
			this.aClass30_Sub1_28.method752(5890, 768, 0);
		}
	}
}
