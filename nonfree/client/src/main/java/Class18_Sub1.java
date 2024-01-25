import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class18_Sub1 extends Class18 {

	@OriginalMember(owner = "client!be", name = "y", descriptor = "Lclient!mm;")
	private final Class55_Sub1 aClass55_Sub1_6;

	@OriginalMember(owner = "client!be", name = "x", descriptor = "Lclient!vj;")
	private final Class60_Sub4_Sub1 aClass60_Sub4_Sub1_1;

	@OriginalMember(owner = "client!be", name = "w", descriptor = "Z")
	private final boolean aBoolean31;

	@OriginalMember(owner = "client!be", name = "v", descriptor = "Lclient!hi;")
	private final Class86 aClass86_1;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!mm;Lclient!ci;[Lclient!jf;Z)V")
	public Class18_Sub1(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) Class100[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass55_Sub1_6 = arg0;
		@Pc(9) opengl local9 = arg0.anOpengl1;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13;
		for (local13 = 0; local13 < 256; local13++) {
			@Pc(20) Class100 local20 = arg2[local13];
			if (local20.anInt2901 > local11) {
				local11 = local20.anInt2901;
			}
			if (local20.anInt2902 > local11) {
				local11 = local20.anInt2902;
			}
		}
		local13 = local11 * 16;
		@Pc(47) byte[] local47 = new byte[local13 * local13];
		@Pc(62) int local62;
		@Pc(65) int local65;
		@Pc(71) int local71;
		@Pc(77) int local77;
		for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
			@Pc(56) Class100 local56 = arg2[local49];
			@Pc(59) byte[] local59 = local56.aByteArray38;
			local62 = local56.anInt2901;
			local65 = local56.anInt2902;
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
		this.aClass60_Sub4_Sub1_1 = Static369.method5854(local13, local47, local13, arg0);
		this.aBoolean31 = true;
		this.aClass60_Sub4_Sub1_1.method5836(false);
		this.aClass86_1 = new Class86(arg0, 256);
		@Pc(292) float local292 = this.aClass60_Sub4_Sub1_1.aFloat79 / (float) this.aClass60_Sub4_Sub1_1.anInt6577;
		@Pc(301) float local301 = this.aClass60_Sub4_Sub1_1.aFloat78 / (float) this.aClass60_Sub4_Sub1_1.anInt6576;
		for (@Pc(303) int local303 = 0; local303 < 256; local303++) {
			@Pc(310) Class100 local310 = arg2[local303];
			local62 = local310.anInt2901;
			local65 = local310.anInt2902;
			local71 = local310.anInt2899;
			local77 = local310.anInt2897;
			@Pc(329) float local329 = (float) (local303 % 16 * local11);
			@Pc(336) float local336 = (float) (local303 / 16 * local11);
			@Pc(340) float local340 = local329 * local292;
			@Pc(344) float local344 = local336 * local301;
			@Pc(351) float local351 = (local329 + (float) local65) * local292;
			@Pc(358) float local358 = (local336 + (float) local62) * local301;
			this.aClass86_1.method2104(local303);
			local9.glBegin(7);
			local9.glTexCoord2f(local340, this.aClass60_Sub4_Sub1_1.aFloat78 - local344);
			local9.glVertex2i(local77, local71);
			local9.glTexCoord2f(local340, this.aClass60_Sub4_Sub1_1.aFloat78 - local358);
			local9.glVertex2i(local77, local71 + local62);
			local9.glTexCoord2f(local351, this.aClass60_Sub4_Sub1_1.aFloat78 - local358);
			local9.glVertex2i(local77 + local65, local71 + local62);
			local9.glTexCoord2f(local351, this.aClass60_Sub4_Sub1_1.aFloat78 - local344);
			local9.glVertex2i(local77 + local65, local71);
			local9.glEnd();
			this.aClass86_1.method2105();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(CIIIZLclient!de;II)V")
	@Override
	protected void method4179(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class46 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class46_Sub2 local2 = (Class46_Sub2) arg5;
		@Pc(5) Class60_Sub4_Sub1 local5 = local2.aClass60_Sub4_Sub1_5;
		@Pc(9) opengl local9 = this.aClass55_Sub1_6.anOpengl1;
		this.aClass55_Sub1_6.method3654();
		this.aClass55_Sub1_6.method3677(this.aClass60_Sub4_Sub1_1);
		if (this.aBoolean31 || arg4) {
			this.aClass55_Sub1_6.method3709(7681, 8448);
			this.aClass55_Sub1_6.method3684(0, 34168, 768);
		}
		this.aClass55_Sub1_6.method3693(1);
		this.aClass55_Sub1_6.method3677(local5);
		this.aClass55_Sub1_6.method3709(7681, 8448);
		this.aClass55_Sub1_6.method3684(0, 34168, 768);
		local9.glTexGeni(8192, 9472, 9216);
		local9.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat79 / (float) local5.anInt6577;
		@Pc(76) float local76 = local5.aFloat78 / (float) local5.anInt6576;
		local9.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		local9.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		local9.glEnable(3168);
		local9.glEnable(3169);
		local9.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local9.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass86_1.method2106(arg0);
		local9.glLoadIdentity();
		local9.glDisable(3168);
		local9.glDisable(3169);
		this.aClass55_Sub1_6.method3684(0, 5890, 768);
		this.aClass55_Sub1_6.method3709(8448, 8448);
		this.aClass55_Sub1_6.method3677(null);
		this.aClass55_Sub1_6.method3693(0);
		if (this.aBoolean31 || arg4) {
			this.aClass55_Sub1_6.method3684(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(CIIIZ)V")
	@Override
	protected void method4190(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) opengl local3 = this.aClass55_Sub1_6.anOpengl1;
		this.aClass55_Sub1_6.method3654();
		this.aClass55_Sub1_6.method3677(this.aClass60_Sub4_Sub1_1);
		if (this.aBoolean31 || arg4) {
			this.aClass55_Sub1_6.method3709(7681, 8448);
			this.aClass55_Sub1_6.method3684(0, 34168, 768);
		}
		local3.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local3.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass86_1.method2106(arg0);
		local3.glLoadIdentity();
		if (this.aBoolean31 || arg4) {
			this.aClass55_Sub1_6.method3684(0, 5890, 768);
		}
	}
}
