import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class30_Sub3 extends Class30 {

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "Lclient!sq;")
	private final Class46_Sub2 aClass46_Sub2_39;

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "Lclient!l;")
	private final Class8_Sub1_Sub1 aClass8_Sub1_Sub1_5;

	@OriginalMember(owner = "client!uc", name = "A", descriptor = "Z")
	private final boolean aBoolean421;

	@OriginalMember(owner = "client!uc", name = "B", descriptor = "Lclient!km;")
	private final Class119 aClass119_6;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!sq;Lclient!gh;[Lclient!vp;Z)V")
	public Class30_Sub3(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) Class207[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass46_Sub2_39 = arg0;
		@Pc(9) opengl local9 = arg0.anOpengl1;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13;
		for (local13 = 0; local13 < 256; local13++) {
			@Pc(20) Class207 local20 = arg2[local13];
			if (local20.anInt6508 > local11) {
				local11 = local20.anInt6508;
			}
			if (local20.anInt6509 > local11) {
				local11 = local20.anInt6509;
			}
		}
		local13 = local11 * 16;
		@Pc(47) byte[] local47 = new byte[local13 * local13];
		@Pc(62) int local62;
		@Pc(65) int local65;
		@Pc(71) int local71;
		@Pc(77) int local77;
		for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
			@Pc(56) Class207 local56 = arg2[local49];
			@Pc(59) byte[] local59 = local56.aByteArray208;
			local62 = local56.anInt6508;
			local65 = local56.anInt6509;
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
		this.aClass8_Sub1_Sub1_5 = Static360.method3374(arg0, local47, local13, local13);
		this.aBoolean421 = true;
		this.aClass8_Sub1_Sub1_5.method4741(false);
		this.aClass119_6 = new Class119(arg0, 256);
		@Pc(292) float local292 = this.aClass8_Sub1_Sub1_5.aFloat63 / (float) this.aClass8_Sub1_Sub1_5.anInt3576;
		@Pc(301) float local301 = this.aClass8_Sub1_Sub1_5.aFloat64 / (float) this.aClass8_Sub1_Sub1_5.anInt3577;
		for (@Pc(303) int local303 = 0; local303 < 256; local303++) {
			@Pc(310) Class207 local310 = arg2[local303];
			local62 = local310.anInt6508;
			local65 = local310.anInt6509;
			local71 = local310.anInt6510;
			local77 = local310.anInt6507;
			@Pc(329) float local329 = (float) (local303 % 16 * local11);
			@Pc(336) float local336 = (float) (local303 / 16 * local11);
			@Pc(340) float local340 = local329 * local292;
			@Pc(344) float local344 = local336 * local301;
			@Pc(351) float local351 = (local329 + (float) local65) * local292;
			@Pc(358) float local358 = (local336 + (float) local62) * local301;
			this.aClass119_6.method3303(local303);
			local9.glBegin(7);
			local9.glTexCoord2f(local340, this.aClass8_Sub1_Sub1_5.aFloat64 - local344);
			local9.glVertex2i(local77, local71);
			local9.glTexCoord2f(local340, this.aClass8_Sub1_Sub1_5.aFloat64 - local358);
			local9.glVertex2i(local77, local71 + local62);
			local9.glTexCoord2f(local351, this.aClass8_Sub1_Sub1_5.aFloat64 - local358);
			local9.glVertex2i(local77 + local65, local71 + local62);
			local9.glTexCoord2f(local351, this.aClass8_Sub1_Sub1_5.aFloat64 - local344);
			local9.glVertex2i(local77 + local65, local71);
			local9.glEnd();
			this.aClass119_6.method3302();
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(CIIIZLclient!q;II)V")
	@Override
	protected void method5581(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class156 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class156_Sub1 local2 = (Class156_Sub1) arg5;
		@Pc(5) Class8_Sub1_Sub1 local5 = local2.aClass8_Sub1_Sub1_3;
		@Pc(9) opengl local9 = this.aClass46_Sub2_39.anOpengl1;
		this.aClass46_Sub2_39.method5240();
		this.aClass46_Sub2_39.method5251(this.aClass8_Sub1_Sub1_5);
		if (this.aBoolean421 || arg4) {
			this.aClass46_Sub2_39.method5248(7681, 8448);
			this.aClass46_Sub2_39.method5261(0, 34168, 768);
		}
		this.aClass46_Sub2_39.method5225(1);
		this.aClass46_Sub2_39.method5251(local5);
		this.aClass46_Sub2_39.method5248(7681, 8448);
		this.aClass46_Sub2_39.method5261(0, 34168, 768);
		local9.glTexGeni(8192, 9472, 9216);
		local9.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat63 / (float) local5.anInt3576;
		@Pc(76) float local76 = local5.aFloat64 / (float) local5.anInt3577;
		local9.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		local9.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		local9.glEnable(3168);
		local9.glEnable(3169);
		local9.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local9.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass119_6.method3301(arg0);
		local9.glLoadIdentity();
		local9.glDisable(3168);
		local9.glDisable(3169);
		this.aClass46_Sub2_39.method5261(0, 5890, 768);
		this.aClass46_Sub2_39.method5248(8448, 8448);
		this.aClass46_Sub2_39.method5251(null);
		this.aClass46_Sub2_39.method5225(0);
		if (this.aBoolean421 || arg4) {
			this.aClass46_Sub2_39.method5261(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(CIIIZ)V")
	@Override
	protected void method5582(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) opengl local3 = this.aClass46_Sub2_39.anOpengl1;
		this.aClass46_Sub2_39.method5240();
		this.aClass46_Sub2_39.method5251(this.aClass8_Sub1_Sub1_5);
		if (this.aBoolean421 || arg4) {
			this.aClass46_Sub2_39.method5248(7681, 8448);
			this.aClass46_Sub2_39.method5261(0, 34168, 768);
		}
		local3.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local3.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass119_6.method3301(arg0);
		local3.glLoadIdentity();
		if (this.aBoolean421 || arg4) {
			this.aClass46_Sub2_39.method5261(0, 5890, 768);
		}
	}
}
