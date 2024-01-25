import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class120_Sub3 extends Class120 {

	@OriginalMember(owner = "client!oe", name = "E", descriptor = "Lclient!se;")
	private final Class122_Sub2 aClass122_Sub2_31;

	@OriginalMember(owner = "client!oe", name = "H", descriptor = "Lclient!fj;")
	private final Class66_Sub1_Sub1 aClass66_Sub1_Sub1_4;

	@OriginalMember(owner = "client!oe", name = "F", descriptor = "Z")
	private final boolean aBoolean254;

	@OriginalMember(owner = "client!oe", name = "G", descriptor = "Lclient!ns;")
	private final Class147 aClass147_4;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!se;Lclient!vn;[Lclient!ok;Z)V")
	public Class120_Sub3(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) Class149[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass122_Sub2_31 = arg0;
		@Pc(9) opengl local9 = arg0.anOpengl2;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13;
		for (local13 = 0; local13 < 256; local13++) {
			@Pc(20) Class149 local20 = arg2[local13];
			if (local20.anInt4572 > local11) {
				local11 = local20.anInt4572;
			}
			if (local20.anInt4569 > local11) {
				local11 = local20.anInt4569;
			}
		}
		local13 = local11 * 16;
		@Pc(47) byte[] local47 = new byte[local13 * local13];
		@Pc(62) int local62;
		@Pc(65) int local65;
		@Pc(71) int local71;
		@Pc(77) int local77;
		for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
			@Pc(56) Class149 local56 = arg2[local49];
			@Pc(59) byte[] local59 = local56.aByteArray72;
			local62 = local56.anInt4572;
			local65 = local56.anInt4569;
			local71 = local49 % 16 * local11;
			local77 = local49 / 16 * local11;
			@Pc(83) int local83 = local77 * local13 + local71;
			@Pc(85) int local85 = 0;
			for (@Pc(87) int local87 = 0; local87 < local62; local87++) {
				for (@Pc(92) int local92 = 0; local92 < local65; local92++) {
					local47[local83++] = (byte) (local59[local85++] == 0 ? 0 : -1);
				}
				local83 += local13 - local65;
			}
		}
		this.aClass66_Sub1_Sub1_4 = Static358.method1519(local47, local13, arg0, local13);
		this.aBoolean254 = true;
		this.aClass66_Sub1_Sub1_4.method4044(false);
		this.aClass147_4 = new Class147(arg0, 256);
		@Pc(293) float local293 = this.aClass66_Sub1_Sub1_4.aFloat6 / (float) this.aClass66_Sub1_Sub1_4.anInt1845;
		@Pc(302) float local302 = this.aClass66_Sub1_Sub1_4.aFloat7 / (float) this.aClass66_Sub1_Sub1_4.anInt1846;
		for (@Pc(304) int local304 = 0; local304 < 256; local304++) {
			@Pc(311) Class149 local311 = arg2[local304];
			local62 = local311.anInt4572;
			local65 = local311.anInt4569;
			local71 = local311.anInt4573;
			local77 = local311.anInt4571;
			@Pc(330) float local330 = (float) (local304 % 16 * local11);
			@Pc(337) float local337 = (float) (local304 / 16 * local11);
			@Pc(341) float local341 = local330 * local293;
			@Pc(345) float local345 = local337 * local302;
			@Pc(352) float local352 = (local330 + (float) local65) * local293;
			@Pc(359) float local359 = (local337 + (float) local62) * local302;
			this.aClass147_4.method3752(local304);
			local9.glBegin(7);
			local9.glTexCoord2f(local341, this.aClass66_Sub1_Sub1_4.aFloat7 - local345);
			local9.glVertex2i(local77, local71);
			local9.glTexCoord2f(local341, this.aClass66_Sub1_Sub1_4.aFloat7 - local359);
			local9.glVertex2i(local77, local71 + local62);
			local9.glTexCoord2f(local352, this.aClass66_Sub1_Sub1_4.aFloat7 - local359);
			local9.glVertex2i(local77 + local65, local71 + local62);
			local9.glTexCoord2f(local352, this.aClass66_Sub1_Sub1_4.aFloat7 - local345);
			local9.glVertex2i(local77 + local65, local71);
			local9.glEnd();
			this.aClass147_4.method3753();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(CIIIZLclient!sf;II)V")
	@Override
	protected void method5533(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class74 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class74_Sub1 local2 = (Class74_Sub1) arg5;
		@Pc(5) Class66_Sub1_Sub1 local5 = local2.aClass66_Sub1_Sub1_3;
		@Pc(9) opengl local9 = this.aClass122_Sub2_31.anOpengl2;
		this.aClass122_Sub2_31.method4817();
		this.aClass122_Sub2_31.method4864(this.aClass66_Sub1_Sub1_4);
		if (this.aBoolean254 || arg4) {
			this.aClass122_Sub2_31.method4860(7681, 8448);
			this.aClass122_Sub2_31.method4815(0, 34168, 768);
		}
		this.aClass122_Sub2_31.method4811(1);
		this.aClass122_Sub2_31.method4864(local5);
		this.aClass122_Sub2_31.method4860(7681, 8448);
		this.aClass122_Sub2_31.method4815(0, 34168, 768);
		local9.glTexGeni(8192, 9472, 9216);
		local9.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat6 / (float) local5.anInt1845;
		@Pc(76) float local76 = local5.aFloat7 / (float) local5.anInt1846;
		local9.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		local9.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		local9.glEnable(3168);
		local9.glEnable(3169);
		local9.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local9.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass147_4.method3754(arg0);
		local9.glLoadIdentity();
		local9.glDisable(3168);
		local9.glDisable(3169);
		this.aClass122_Sub2_31.method4815(0, 5890, 768);
		this.aClass122_Sub2_31.method4860(8448, 8448);
		this.aClass122_Sub2_31.method4864(null);
		this.aClass122_Sub2_31.method4811(0);
		if (this.aBoolean254 || arg4) {
			this.aClass122_Sub2_31.method4815(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(CIIIZ)V")
	@Override
	protected void method5525(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) opengl local3 = this.aClass122_Sub2_31.anOpengl2;
		this.aClass122_Sub2_31.method4817();
		this.aClass122_Sub2_31.method4864(this.aClass66_Sub1_Sub1_4);
		if (this.aBoolean254 || arg4) {
			this.aClass122_Sub2_31.method4860(7681, 8448);
			this.aClass122_Sub2_31.method4815(0, 34168, 768);
		}
		local3.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local3.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass147_4.method3754(arg0);
		local3.glLoadIdentity();
		if (this.aBoolean254 || arg4) {
			this.aClass122_Sub2_31.method4815(0, 5890, 768);
		}
	}
}
