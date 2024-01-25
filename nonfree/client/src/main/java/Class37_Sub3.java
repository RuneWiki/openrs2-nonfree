import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class37_Sub3 extends Class37 {

	@OriginalMember(owner = "client!kc", name = "v", descriptor = "Lclient!ao;")
	private final Class4_Sub1 aClass4_Sub1_18;

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "Lclient!rn;")
	private final Class124_Sub2_Sub1 aClass124_Sub2_Sub1_4;

	@OriginalMember(owner = "client!kc", name = "x", descriptor = "Z")
	private final boolean aBoolean295;

	@OriginalMember(owner = "client!kc", name = "y", descriptor = "Lclient!eq;")
	private final Class57 aClass57_4;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!ao;Lclient!th;[Lclient!go;Z)V")
	public Class37_Sub3(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) Class188 arg1, @OriginalArg(2) Class76[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass4_Sub1_18 = arg0;
		@Pc(9) opengl local9 = arg0.anOpengl1;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13;
		for (local13 = 0; local13 < 256; local13++) {
			@Pc(20) Class76 local20 = arg2[local13];
			if (local20.anInt2415 > local11) {
				local11 = local20.anInt2415;
			}
			if (local20.anInt2414 > local11) {
				local11 = local20.anInt2414;
			}
		}
		local13 = local11 * 16;
		@Pc(47) byte[] local47 = new byte[local13 * local13];
		@Pc(62) int local62;
		@Pc(65) int local65;
		@Pc(71) int local71;
		@Pc(77) int local77;
		for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
			@Pc(56) Class76 local56 = arg2[local49];
			@Pc(59) byte[] local59 = local56.aByteArray41;
			local62 = local56.anInt2415;
			local65 = local56.anInt2414;
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
		this.aClass124_Sub2_Sub1_4 = Static370.method4996(local13, arg0, local47, local13);
		this.aBoolean295 = true;
		this.aClass124_Sub2_Sub1_4.method5896(false);
		this.aClass57_4 = new Class57(arg0, 256);
		@Pc(292) float local292 = this.aClass124_Sub2_Sub1_4.aFloat73 / (float) this.aClass124_Sub2_Sub1_4.anInt5595;
		@Pc(301) float local301 = this.aClass124_Sub2_Sub1_4.aFloat72 / (float) this.aClass124_Sub2_Sub1_4.anInt5594;
		for (@Pc(303) int local303 = 0; local303 < 256; local303++) {
			@Pc(310) Class76 local310 = arg2[local303];
			local62 = local310.anInt2415;
			local65 = local310.anInt2414;
			local71 = local310.anInt2413;
			local77 = local310.anInt2416;
			@Pc(329) float local329 = (float) (local303 % 16 * local11);
			@Pc(336) float local336 = (float) (local303 / 16 * local11);
			@Pc(340) float local340 = local329 * local292;
			@Pc(344) float local344 = local336 * local301;
			@Pc(351) float local351 = (local329 + (float) local65) * local292;
			@Pc(358) float local358 = (local336 + (float) local62) * local301;
			this.aClass57_4.method1811(local303);
			local9.glBegin(7);
			local9.glTexCoord2f(local340, this.aClass124_Sub2_Sub1_4.aFloat72 - local344);
			local9.glVertex2i(local77, local71);
			local9.glTexCoord2f(local340, this.aClass124_Sub2_Sub1_4.aFloat72 - local358);
			local9.glVertex2i(local77, local71 + local62);
			local9.glTexCoord2f(local351, this.aClass124_Sub2_Sub1_4.aFloat72 - local358);
			local9.glVertex2i(local77 + local65, local71 + local62);
			local9.glTexCoord2f(local351, this.aClass124_Sub2_Sub1_4.aFloat72 - local344);
			local9.glVertex2i(local77 + local65, local71);
			local9.glEnd();
			this.aClass57_4.method1810();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(CIIIZLclient!hb;II)V")
	@Override
	protected void method5248(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class77 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class77_Sub2 local2 = (Class77_Sub2) arg5;
		@Pc(5) Class124_Sub2_Sub1 local5 = local2.aClass124_Sub2_Sub1_5;
		@Pc(9) opengl local9 = this.aClass4_Sub1_18.anOpengl1;
		this.aClass4_Sub1_18.method586();
		this.aClass4_Sub1_18.method602(this.aClass124_Sub2_Sub1_4);
		if (this.aBoolean295 || arg4) {
			this.aClass4_Sub1_18.method580(7681, 8448);
			this.aClass4_Sub1_18.method590(0, 34168, 768);
		}
		this.aClass4_Sub1_18.method600(1);
		this.aClass4_Sub1_18.method602(local5);
		this.aClass4_Sub1_18.method580(7681, 8448);
		this.aClass4_Sub1_18.method590(0, 34168, 768);
		local9.glTexGeni(8192, 9472, 9216);
		local9.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat73 / (float) local5.anInt5595;
		@Pc(76) float local76 = local5.aFloat72 / (float) local5.anInt5594;
		local9.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		local9.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		local9.glEnable(3168);
		local9.glEnable(3169);
		local9.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local9.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass57_4.method1809(arg0);
		local9.glLoadIdentity();
		local9.glDisable(3168);
		local9.glDisable(3169);
		this.aClass4_Sub1_18.method590(0, 5890, 768);
		this.aClass4_Sub1_18.method580(8448, 8448);
		this.aClass4_Sub1_18.method602(null);
		this.aClass4_Sub1_18.method600(0);
		if (this.aBoolean295 || arg4) {
			this.aClass4_Sub1_18.method590(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(CIIIZ)V")
	@Override
	protected void method5253(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) opengl local3 = this.aClass4_Sub1_18.anOpengl1;
		this.aClass4_Sub1_18.method586();
		this.aClass4_Sub1_18.method602(this.aClass124_Sub2_Sub1_4);
		if (this.aBoolean295 || arg4) {
			this.aClass4_Sub1_18.method580(7681, 8448);
			this.aClass4_Sub1_18.method590(0, 34168, 768);
		}
		local3.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local3.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass57_4.method1809(arg0);
		local3.glLoadIdentity();
		if (this.aBoolean295 || arg4) {
			this.aClass4_Sub1_18.method590(0, 5890, 768);
		}
	}
}
