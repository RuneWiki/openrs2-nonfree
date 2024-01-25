import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class25_Sub5 extends Class25 {

	@OriginalMember(owner = "client!mda", name = "B", descriptor = "Lclient!eq;")
	private final Class33_Sub3 aClass33_Sub3_29;

	@OriginalMember(owner = "client!mda", name = "D", descriptor = "Lclient!mba;")
	private final Class121_Sub2_Sub1 aClass121_Sub2_Sub1_4;

	@OriginalMember(owner = "client!mda", name = "A", descriptor = "Z")
	private final boolean aBoolean570;

	@OriginalMember(owner = "client!mda", name = "E", descriptor = "Lclient!bp;")
	private final Class36 aClass36_4;

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lclient!eq;Lclient!tba;[Lclient!be;Z)V")
	public Class25_Sub5(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Class315 arg1, @OriginalArg(2) Class28[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass33_Sub3_29 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class28 local15 = arg2[local10];
			if (local15.anInt616 > local8) {
				local8 = local15.anInt616;
			}
			if (local15.anInt618 > local8) {
				local8 = local15.anInt618;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class28 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt616;
			local57 = local51.anInt618;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray3 == null) {
				local83 = local51.aByteArray2;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray3;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass121_Sub2_Sub1_4 = Static370.method5905(local37, local44, local37, arg0);
		this.aBoolean570 = true;
		this.aClass121_Sub2_Sub1_4.method7326(false);
		this.aClass36_4 = new Class36(arg0, 256);
		@Pc(334) float local334 = this.aClass121_Sub2_Sub1_4.aFloat185 / (float) this.aClass121_Sub2_Sub1_4.anInt6665;
		@Pc(343) float local343 = this.aClass121_Sub2_Sub1_4.aFloat187 / (float) this.aClass121_Sub2_Sub1_4.anInt6660;
		for (@Pc(345) int local345 = 0; local345 < 256; local345++) {
			@Pc(350) Class28 local350 = arg2[local345];
			local57 = local350.anInt616;
			local63 = local350.anInt618;
			local69 = local350.anInt614;
			local75 = local350.anInt617;
			@Pc(369) float local369 = (float) (local345 % 16 * local8);
			@Pc(376) float local376 = (float) (local345 / 16 * local8);
			@Pc(380) float local380 = local369 * local334;
			@Pc(384) float local384 = local376 * local343;
			@Pc(391) float local391 = (local369 + (float) local63) * local334;
			@Pc(398) float local398 = (local376 + (float) local57) * local343;
			this.aClass36_4.method1116(local345);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local380, this.aClass121_Sub2_Sub1_4.aFloat187 - local384);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local380, this.aClass121_Sub2_Sub1_4.aFloat187 - local398);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass121_Sub2_Sub1_4.aFloat187 - local398);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass121_Sub2_Sub1_4.aFloat187 - local384);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass36_4.method1115();
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method5845(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class1_Sub3 local2 = (Class1_Sub3) arg5;
		@Pc(5) Class121_Sub2_Sub1 local5 = local2.aClass121_Sub2_Sub1_5;
		this.aClass33_Sub3_29.method3013();
		this.aClass33_Sub3_29.method3012(this.aClass121_Sub2_Sub1_4);
		if (this.aBoolean570 || arg4) {
			this.aClass33_Sub3_29.method3057(8448, 7681);
			this.aClass33_Sub3_29.method3024(768, 34168, 0);
		} else {
			this.aClass33_Sub3_29.method3057(7681, 7681);
		}
		this.aClass33_Sub3_29.method3027(1);
		this.aClass33_Sub3_29.method3012(local5);
		this.aClass33_Sub3_29.method3057(8448, 7681);
		this.aClass33_Sub3_29.method3024(768, 34168, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat185 / (float) local5.anInt6665;
		@Pc(85) float local85 = local5.aFloat187 / (float) local5.anInt6660;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass36_4.method1112(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass33_Sub3_29.method3024(768, 5890, 0);
		this.aClass33_Sub3_29.method3057(8448, 8448);
		this.aClass33_Sub3_29.method3012(null);
		this.aClass33_Sub3_29.method3027(0);
		if (this.aBoolean570 || arg4) {
			this.aClass33_Sub3_29.method3024(768, 5890, 0);
		}
	}

	@OriginalMember(owner = "client!mda", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass33_Sub3_29.method3013();
		this.aClass33_Sub3_29.method3012(this.aClass121_Sub2_Sub1_4);
		if (this.aBoolean570 || arg4) {
			this.aClass33_Sub3_29.method3057(8448, 7681);
			this.aClass33_Sub3_29.method3024(768, 34168, 0);
		} else {
			this.aClass33_Sub3_29.method3057(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass36_4.method1112(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean570 || arg4) {
			this.aClass33_Sub3_29.method3024(768, 5890, 0);
		}
	}
}
