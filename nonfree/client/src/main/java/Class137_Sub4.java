import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class137_Sub4 extends Class137 {

	@OriginalMember(owner = "client!vd", name = "C", descriptor = "Lclient!nm;")
	private final Class164_Sub1 aClass164_Sub1_41;

	@OriginalMember(owner = "client!vd", name = "A", descriptor = "Lclient!up;")
	private final Class15_Sub2_Sub1 aClass15_Sub2_Sub1_4;

	@OriginalMember(owner = "client!vd", name = "B", descriptor = "Z")
	private final boolean aBoolean554;

	@OriginalMember(owner = "client!vd", name = "z", descriptor = "Lclient!p;")
	private final Class178 aClass178_6;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!nm;Lclient!is;[Lclient!ff;Z)V")
	public Class137_Sub4(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) Class110 arg1, @OriginalArg(2) Class80[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass164_Sub1_41 = arg0;
		@Pc(9) opengl local9 = arg0.anOpengl1;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13;
		for (local13 = 0; local13 < 256; local13++) {
			@Pc(20) Class80 local20 = arg2[local13];
			if (local20.anInt1751 > local11) {
				local11 = local20.anInt1751;
			}
			if (local20.anInt1753 > local11) {
				local11 = local20.anInt1753;
			}
		}
		local13 = local11 * 16;
		@Pc(47) byte[] local47 = new byte[local13 * local13];
		@Pc(62) int local62;
		@Pc(65) int local65;
		@Pc(71) int local71;
		@Pc(77) int local77;
		for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
			@Pc(56) Class80 local56 = arg2[local49];
			@Pc(59) byte[] local59 = local56.aByteArray33;
			local62 = local56.anInt1751;
			local65 = local56.anInt1753;
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
		this.aClass15_Sub2_Sub1_4 = Static406.method5044(local47, local13, arg0, local13);
		this.aBoolean554 = true;
		this.aClass15_Sub2_Sub1_4.method5556(false);
		this.aClass178_6 = new Class178(arg0, 256);
		@Pc(292) float local292 = this.aClass15_Sub2_Sub1_4.aFloat65 / (float) this.aClass15_Sub2_Sub1_4.anInt5857;
		@Pc(301) float local301 = this.aClass15_Sub2_Sub1_4.aFloat66 / (float) this.aClass15_Sub2_Sub1_4.anInt5856;
		for (@Pc(303) int local303 = 0; local303 < 256; local303++) {
			@Pc(310) Class80 local310 = arg2[local303];
			local62 = local310.anInt1751;
			local65 = local310.anInt1753;
			local71 = local310.anInt1748;
			local77 = local310.anInt1752;
			@Pc(329) float local329 = (float) (local303 % 16 * local11);
			@Pc(336) float local336 = (float) (local303 / 16 * local11);
			@Pc(340) float local340 = local329 * local292;
			@Pc(344) float local344 = local336 * local301;
			@Pc(351) float local351 = (local329 + (float) local65) * local292;
			@Pc(358) float local358 = (local336 + (float) local62) * local301;
			this.aClass178_6.method4028(local303);
			local9.glBegin(7);
			local9.glTexCoord2f(local340, this.aClass15_Sub2_Sub1_4.aFloat66 - local344);
			local9.glVertex2i(local77, local71);
			local9.glTexCoord2f(local340, this.aClass15_Sub2_Sub1_4.aFloat66 - local358);
			local9.glVertex2i(local77, local71 + local62);
			local9.glTexCoord2f(local351, this.aClass15_Sub2_Sub1_4.aFloat66 - local358);
			local9.glVertex2i(local77 + local65, local71 + local62);
			local9.glTexCoord2f(local351, this.aClass15_Sub2_Sub1_4.aFloat66 - local344);
			local9.glVertex2i(local77 + local65, local71);
			local9.glEnd();
			this.aClass178_6.method4030();
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(CIIIZ)V")
	@Override
	protected void method5089(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) opengl local3 = this.aClass164_Sub1_41.anOpengl1;
		this.aClass164_Sub1_41.method3587();
		this.aClass164_Sub1_41.method3603(this.aClass15_Sub2_Sub1_4);
		if (this.aBoolean554 || arg4) {
			this.aClass164_Sub1_41.method3629(7681, 8448);
			this.aClass164_Sub1_41.method3571(0, 34168, 768);
		}
		local3.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local3.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass178_6.method4029(arg0);
		local3.glLoadIdentity();
		if (this.aBoolean554 || arg4) {
			this.aClass164_Sub1_41.method3571(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(CIIIZLclient!us;II)V")
	@Override
	protected void method5105(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class34 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class34_Sub2 local2 = (Class34_Sub2) arg5;
		@Pc(5) Class15_Sub2_Sub1 local5 = local2.aClass15_Sub2_Sub1_5;
		@Pc(9) opengl local9 = this.aClass164_Sub1_41.anOpengl1;
		this.aClass164_Sub1_41.method3587();
		this.aClass164_Sub1_41.method3603(this.aClass15_Sub2_Sub1_4);
		if (this.aBoolean554 || arg4) {
			this.aClass164_Sub1_41.method3629(7681, 8448);
			this.aClass164_Sub1_41.method3571(0, 34168, 768);
		}
		this.aClass164_Sub1_41.method3584(1);
		this.aClass164_Sub1_41.method3603(local5);
		this.aClass164_Sub1_41.method3629(7681, 8448);
		this.aClass164_Sub1_41.method3571(0, 34168, 768);
		local9.glTexGeni(8192, 9472, 9216);
		local9.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat65 / (float) local5.anInt5857;
		@Pc(76) float local76 = local5.aFloat66 / (float) local5.anInt5856;
		local9.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		local9.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		local9.glEnable(3168);
		local9.glEnable(3169);
		local9.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local9.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass178_6.method4029(arg0);
		local9.glLoadIdentity();
		local9.glDisable(3168);
		local9.glDisable(3169);
		this.aClass164_Sub1_41.method3571(0, 5890, 768);
		this.aClass164_Sub1_41.method3629(8448, 8448);
		this.aClass164_Sub1_41.method3603(null);
		this.aClass164_Sub1_41.method3584(0);
		if (this.aBoolean554 || arg4) {
			this.aClass164_Sub1_41.method3571(0, 5890, 768);
		}
	}
}
