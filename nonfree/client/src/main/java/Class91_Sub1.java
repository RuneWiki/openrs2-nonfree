import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class91_Sub1 extends Class91 {

	@OriginalMember(owner = "client!ih", name = "C", descriptor = "Lclient!po;")
	private final Class59_Sub1 aClass59_Sub1_18;

	@OriginalMember(owner = "client!ih", name = "z", descriptor = "Lclient!an;")
	private final Class11_Sub1_Sub1 aClass11_Sub1_Sub1_2;

	@OriginalMember(owner = "client!ih", name = "A", descriptor = "Z")
	private final boolean aBoolean182;

	@OriginalMember(owner = "client!ih", name = "B", descriptor = "Lclient!el;")
	private final Class57 aClass57_2;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lclient!po;Lclient!nm;[Lclient!cl;Z)V")
	public Class91_Sub1(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) Class37[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass59_Sub1_18 = arg0;
		@Pc(9) opengl local9 = arg0.anOpengl2;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13;
		for (local13 = 0; local13 < 256; local13++) {
			@Pc(20) Class37 local20 = arg2[local13];
			if (local20.anInt1008 > local11) {
				local11 = local20.anInt1008;
			}
			if (local20.anInt1012 > local11) {
				local11 = local20.anInt1012;
			}
		}
		local13 = local11 * 16;
		@Pc(47) byte[] local47 = new byte[local13 * local13];
		@Pc(62) int local62;
		@Pc(65) int local65;
		@Pc(71) int local71;
		@Pc(77) int local77;
		for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
			@Pc(56) Class37 local56 = arg2[local49];
			@Pc(59) byte[] local59 = local56.aByteArray11;
			local62 = local56.anInt1008;
			local65 = local56.anInt1012;
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
		this.aClass11_Sub1_Sub1_2 = Static356.method390(arg0, local13, local47, local13);
		this.aBoolean182 = true;
		this.aClass11_Sub1_Sub1_2.method3575(false);
		this.aClass57_2 = new Class57(arg0, 256);
		@Pc(293) float local293 = this.aClass11_Sub1_Sub1_2.aFloat10 / (float) this.aClass11_Sub1_Sub1_2.anInt369;
		@Pc(302) float local302 = this.aClass11_Sub1_Sub1_2.aFloat9 / (float) this.aClass11_Sub1_Sub1_2.anInt368;
		for (@Pc(304) int local304 = 0; local304 < 256; local304++) {
			@Pc(311) Class37 local311 = arg2[local304];
			local62 = local311.anInt1008;
			local65 = local311.anInt1012;
			local71 = local311.anInt1013;
			local77 = local311.anInt1011;
			@Pc(330) float local330 = (float) (local304 % 16 * local11);
			@Pc(337) float local337 = (float) (local304 / 16 * local11);
			@Pc(341) float local341 = local330 * local293;
			@Pc(345) float local345 = local337 * local302;
			@Pc(352) float local352 = (local330 + (float) local65) * local293;
			@Pc(359) float local359 = (local337 + (float) local62) * local302;
			this.aClass57_2.method1600(local304);
			local9.glBegin(7);
			local9.glTexCoord2f(local341, this.aClass11_Sub1_Sub1_2.aFloat9 - local345);
			local9.glVertex2i(local77, local71);
			local9.glTexCoord2f(local341, this.aClass11_Sub1_Sub1_2.aFloat9 - local359);
			local9.glVertex2i(local77, local71 + local62);
			local9.glTexCoord2f(local352, this.aClass11_Sub1_Sub1_2.aFloat9 - local359);
			local9.glVertex2i(local77 + local65, local71 + local62);
			local9.glTexCoord2f(local352, this.aClass11_Sub1_Sub1_2.aFloat9 - local345);
			local9.glVertex2i(local77 + local65, local71);
			local9.glEnd();
			this.aClass57_2.method1599();
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(CIIIZLclient!hm;II)V")
	@Override
	protected void method5316(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class15 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class15_Sub1 local2 = (Class15_Sub1) arg5;
		@Pc(5) Class11_Sub1_Sub1 local5 = local2.aClass11_Sub1_Sub1_1;
		@Pc(9) opengl local9 = this.aClass59_Sub1_18.anOpengl2;
		this.aClass59_Sub1_18.method4308();
		this.aClass59_Sub1_18.method4296(this.aClass11_Sub1_Sub1_2);
		if (this.aBoolean182 || arg4) {
			this.aClass59_Sub1_18.method4311(7681, 8448);
			this.aClass59_Sub1_18.method4297(0, 34168, 768);
		}
		this.aClass59_Sub1_18.method4273(1);
		this.aClass59_Sub1_18.method4296(local5);
		this.aClass59_Sub1_18.method4311(7681, 8448);
		this.aClass59_Sub1_18.method4297(0, 34168, 768);
		local9.glTexGeni(8192, 9472, 9216);
		local9.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat10 / (float) local5.anInt369;
		@Pc(76) float local76 = local5.aFloat9 / (float) local5.anInt368;
		local9.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		local9.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		local9.glEnable(3168);
		local9.glEnable(3169);
		local9.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local9.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass57_2.method1598(arg0);
		local9.glLoadIdentity();
		local9.glDisable(3168);
		local9.glDisable(3169);
		this.aClass59_Sub1_18.method4297(0, 5890, 768);
		this.aClass59_Sub1_18.method4311(8448, 8448);
		this.aClass59_Sub1_18.method4296(null);
		this.aClass59_Sub1_18.method4273(0);
		if (this.aBoolean182 || arg4) {
			this.aClass59_Sub1_18.method4297(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(CIIIZ)V")
	@Override
	protected void method5309(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) opengl local3 = this.aClass59_Sub1_18.anOpengl2;
		this.aClass59_Sub1_18.method4308();
		this.aClass59_Sub1_18.method4296(this.aClass11_Sub1_Sub1_2);
		if (this.aBoolean182 || arg4) {
			this.aClass59_Sub1_18.method4311(7681, 8448);
			this.aClass59_Sub1_18.method4297(0, 34168, 768);
		}
		local3.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local3.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass57_2.method1598(arg0);
		local3.glLoadIdentity();
		if (this.aBoolean182 || arg4) {
			this.aClass59_Sub1_18.method4297(0, 5890, 768);
		}
	}
}
