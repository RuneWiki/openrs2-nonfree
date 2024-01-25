import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class9_Sub3 extends Class9 {

	@OriginalMember(owner = "client!ml", name = "A", descriptor = "Lclient!tb;")
	private final Class129_Sub2 aClass129_Sub2_29;

	@OriginalMember(owner = "client!ml", name = "C", descriptor = "Lclient!kf;")
	private final Class56_Sub4_Sub1 aClass56_Sub4_Sub1_3;

	@OriginalMember(owner = "client!ml", name = "z", descriptor = "Z")
	private final boolean aBoolean251;

	@OriginalMember(owner = "client!ml", name = "B", descriptor = "Lclient!bb;")
	private final Class20 aClass20_4;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!tb;Lclient!k;[Lclient!lg;Z)V")
	public Class9_Sub3(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) Class125[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass129_Sub2_29 = arg0;
		@Pc(9) opengl local9 = arg0.anOpengl2;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13;
		for (local13 = 0; local13 < 256; local13++) {
			@Pc(20) Class125 local20 = arg2[local13];
			if (local20.anInt3501 > local11) {
				local11 = local20.anInt3501;
			}
			if (local20.anInt3499 > local11) {
				local11 = local20.anInt3499;
			}
		}
		local13 = local11 * 16;
		@Pc(47) byte[] local47 = new byte[local13 * local13];
		@Pc(62) int local62;
		@Pc(65) int local65;
		@Pc(71) int local71;
		@Pc(77) int local77;
		for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
			@Pc(56) Class125 local56 = arg2[local49];
			@Pc(59) byte[] local59 = local56.aByteArray49;
			local62 = local56.anInt3501;
			local65 = local56.anInt3499;
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
		this.aClass56_Sub4_Sub1_3 = Static366.method2556(arg0, local13, local47, local13);
		this.aBoolean251 = true;
		this.aClass56_Sub4_Sub1_3.method2542(false);
		this.aClass20_4 = new Class20(arg0, 256);
		@Pc(292) float local292 = this.aClass56_Sub4_Sub1_3.aFloat22 / (float) this.aClass56_Sub4_Sub1_3.anInt3015;
		@Pc(301) float local301 = this.aClass56_Sub4_Sub1_3.aFloat21 / (float) this.aClass56_Sub4_Sub1_3.anInt3016;
		for (@Pc(303) int local303 = 0; local303 < 256; local303++) {
			@Pc(310) Class125 local310 = arg2[local303];
			local62 = local310.anInt3501;
			local65 = local310.anInt3499;
			local71 = local310.anInt3498;
			local77 = local310.anInt3496;
			@Pc(329) float local329 = (float) (local303 % 16 * local11);
			@Pc(336) float local336 = (float) (local303 / 16 * local11);
			@Pc(340) float local340 = local329 * local292;
			@Pc(344) float local344 = local336 * local301;
			@Pc(351) float local351 = (local329 + (float) local65) * local292;
			@Pc(358) float local358 = (local336 + (float) local62) * local301;
			this.aClass20_4.method222(local303);
			local9.glBegin(7);
			local9.glTexCoord2f(local340, this.aClass56_Sub4_Sub1_3.aFloat21 - local344);
			local9.glVertex2i(local77, local71);
			local9.glTexCoord2f(local340, this.aClass56_Sub4_Sub1_3.aFloat21 - local358);
			local9.glVertex2i(local77, local71 + local62);
			local9.glTexCoord2f(local351, this.aClass56_Sub4_Sub1_3.aFloat21 - local358);
			local9.glVertex2i(local77 + local65, local71 + local62);
			local9.glTexCoord2f(local351, this.aClass56_Sub4_Sub1_3.aFloat21 - local344);
			local9.glVertex2i(local77 + local65, local71);
			local9.glEnd();
			this.aClass20_4.method221();
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(CIIIZLclient!ep;II)V")
	@Override
	protected void method3580(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class66 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class66_Sub2 local2 = (Class66_Sub2) arg5;
		@Pc(5) Class56_Sub4_Sub1 local5 = local2.aClass56_Sub4_Sub1_5;
		@Pc(9) opengl local9 = this.aClass129_Sub2_29.anOpengl2;
		this.aClass129_Sub2_29.method5046();
		this.aClass129_Sub2_29.method5084(this.aClass56_Sub4_Sub1_3);
		if (this.aBoolean251 || arg4) {
			this.aClass129_Sub2_29.method5067(7681, 8448);
			this.aClass129_Sub2_29.method5037(0, 34168, 768);
		}
		this.aClass129_Sub2_29.method5091(1);
		this.aClass129_Sub2_29.method5084(local5);
		this.aClass129_Sub2_29.method5067(7681, 8448);
		this.aClass129_Sub2_29.method5037(0, 34168, 768);
		local9.glTexGeni(8192, 9472, 9216);
		local9.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat22 / (float) local5.anInt3015;
		@Pc(76) float local76 = local5.aFloat21 / (float) local5.anInt3016;
		local9.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		local9.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		local9.glEnable(3168);
		local9.glEnable(3169);
		local9.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local9.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass20_4.method223(arg0);
		local9.glLoadIdentity();
		local9.glDisable(3168);
		local9.glDisable(3169);
		this.aClass129_Sub2_29.method5037(0, 5890, 768);
		this.aClass129_Sub2_29.method5067(8448, 8448);
		this.aClass129_Sub2_29.method5084(null);
		this.aClass129_Sub2_29.method5091(0);
		if (this.aBoolean251 || arg4) {
			this.aClass129_Sub2_29.method5037(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(CIIIZ)V")
	@Override
	protected void method3588(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) opengl local3 = this.aClass129_Sub2_29.anOpengl2;
		this.aClass129_Sub2_29.method5046();
		this.aClass129_Sub2_29.method5084(this.aClass56_Sub4_Sub1_3);
		if (this.aBoolean251 || arg4) {
			this.aClass129_Sub2_29.method5067(7681, 8448);
			this.aClass129_Sub2_29.method5037(0, 34168, 768);
		}
		local3.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local3.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass20_4.method223(arg0);
		local3.glLoadIdentity();
		if (this.aBoolean251 || arg4) {
			this.aClass129_Sub2_29.method5037(0, 5890, 768);
		}
	}
}
