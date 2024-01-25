import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class150_Sub2 extends Class150 {

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "Lclient!mi;")
	private final Class155_Sub1 aClass155_Sub1_31;

	@OriginalMember(owner = "client!pa", name = "x", descriptor = "Lclient!rh;")
	private final Class30_Sub3_Sub1 aClass30_Sub3_Sub1_4;

	@OriginalMember(owner = "client!pa", name = "v", descriptor = "Z")
	private final boolean aBoolean362;

	@OriginalMember(owner = "client!pa", name = "u", descriptor = "Lclient!ma;")
	private final Class151 aClass151_3;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lclient!mi;Lclient!qb;[Lclient!ju;Z)V")
	public Class150_Sub2(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) Class190 arg1, @OriginalArg(2) Class127[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass155_Sub1_31 = arg0;
		@Pc(9) opengl local9 = arg0.anOpengl1;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13;
		for (local13 = 0; local13 < 256; local13++) {
			@Pc(20) Class127 local20 = arg2[local13];
			if (local20.anInt3171 > local11) {
				local11 = local20.anInt3171;
			}
			if (local20.anInt3167 > local11) {
				local11 = local20.anInt3167;
			}
		}
		local13 = local11 * 16;
		@Pc(47) byte[] local47 = new byte[local13 * local13];
		@Pc(62) int local62;
		@Pc(65) int local65;
		@Pc(71) int local71;
		@Pc(77) int local77;
		for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
			@Pc(56) Class127 local56 = arg2[local49];
			@Pc(59) byte[] local59 = local56.aByteArray44;
			local62 = local56.anInt3171;
			local65 = local56.anInt3167;
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
		this.aClass30_Sub3_Sub1_4 = Static406.method4618(local13, local13, local47, arg0);
		this.aBoolean362 = true;
		this.aClass30_Sub3_Sub1_4.method4607(false);
		this.aClass151_3 = new Class151(arg0, 256);
		@Pc(292) float local292 = this.aClass30_Sub3_Sub1_4.aFloat60 / (float) this.aClass30_Sub3_Sub1_4.anInt5160;
		@Pc(301) float local301 = this.aClass30_Sub3_Sub1_4.aFloat61 / (float) this.aClass30_Sub3_Sub1_4.anInt5161;
		for (@Pc(303) int local303 = 0; local303 < 256; local303++) {
			@Pc(310) Class127 local310 = arg2[local303];
			local62 = local310.anInt3171;
			local65 = local310.anInt3167;
			local71 = local310.anInt3166;
			local77 = local310.anInt3170;
			@Pc(329) float local329 = (float) (local303 % 16 * local11);
			@Pc(336) float local336 = (float) (local303 / 16 * local11);
			@Pc(340) float local340 = local329 * local292;
			@Pc(344) float local344 = local336 * local301;
			@Pc(351) float local351 = (local329 + (float) local65) * local292;
			@Pc(358) float local358 = (local336 + (float) local62) * local301;
			this.aClass151_3.method3281(local303);
			local9.glBegin(7);
			local9.glTexCoord2f(local340, this.aClass30_Sub3_Sub1_4.aFloat61 - local344);
			local9.glVertex2i(local77, local71);
			local9.glTexCoord2f(local340, this.aClass30_Sub3_Sub1_4.aFloat61 - local358);
			local9.glVertex2i(local77, local71 + local62);
			local9.glTexCoord2f(local351, this.aClass30_Sub3_Sub1_4.aFloat61 - local358);
			local9.glVertex2i(local77 + local65, local71 + local62);
			local9.glTexCoord2f(local351, this.aClass30_Sub3_Sub1_4.aFloat61 - local344);
			local9.glVertex2i(local77 + local65, local71);
			local9.glEnd();
			this.aClass151_3.method3280();
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(CIIIZLclient!sm;II)V")
	@Override
	protected void method5731(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class38 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class38_Sub2 local2 = (Class38_Sub2) arg5;
		@Pc(5) Class30_Sub3_Sub1 local5 = local2.aClass30_Sub3_Sub1_1;
		@Pc(9) opengl local9 = this.aClass155_Sub1_31.anOpengl1;
		this.aClass155_Sub1_31.method3570();
		this.aClass155_Sub1_31.method3585(this.aClass30_Sub3_Sub1_4);
		if (this.aBoolean362 || arg4) {
			this.aClass155_Sub1_31.method3610(7681, 8448);
			this.aClass155_Sub1_31.method3624(0, 34168, 768);
		}
		this.aClass155_Sub1_31.method3590(1);
		this.aClass155_Sub1_31.method3585(local5);
		this.aClass155_Sub1_31.method3610(7681, 8448);
		this.aClass155_Sub1_31.method3624(0, 34168, 768);
		local9.glTexGeni(8192, 9472, 9216);
		local9.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat60 / (float) local5.anInt5160;
		@Pc(76) float local76 = local5.aFloat61 / (float) local5.anInt5161;
		local9.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		local9.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		local9.glEnable(3168);
		local9.glEnable(3169);
		local9.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local9.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass151_3.method3279(arg0);
		local9.glLoadIdentity();
		local9.glDisable(3168);
		local9.glDisable(3169);
		this.aClass155_Sub1_31.method3624(0, 5890, 768);
		this.aClass155_Sub1_31.method3610(8448, 8448);
		this.aClass155_Sub1_31.method3585(null);
		this.aClass155_Sub1_31.method3590(0);
		if (this.aBoolean362 || arg4) {
			this.aClass155_Sub1_31.method3624(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(CIIIZ)V")
	@Override
	protected void method5733(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) opengl local3 = this.aClass155_Sub1_31.anOpengl1;
		this.aClass155_Sub1_31.method3570();
		this.aClass155_Sub1_31.method3585(this.aClass30_Sub3_Sub1_4);
		if (this.aBoolean362 || arg4) {
			this.aClass155_Sub1_31.method3610(7681, 8448);
			this.aClass155_Sub1_31.method3624(0, 34168, 768);
		}
		local3.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local3.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass151_3.method3279(arg0);
		local3.glLoadIdentity();
		if (this.aBoolean362 || arg4) {
			this.aClass155_Sub1_31.method3624(0, 5890, 768);
		}
	}
}
