import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class78_Sub4 extends Class78 {

	@OriginalMember(owner = "client!p", name = "D", descriptor = "Lclient!ql;")
	private final Class92_Sub2 aClass92_Sub2_28;

	@OriginalMember(owner = "client!p", name = "F", descriptor = "Lclient!gn;")
	private final Class70_Sub4_Sub1 aClass70_Sub4_Sub1_1;

	@OriginalMember(owner = "client!p", name = "E", descriptor = "Z")
	private final boolean aBoolean410;

	@OriginalMember(owner = "client!p", name = "C", descriptor = "Lclient!gi;")
	private final Class81 aClass81_5;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!ql;Lclient!jp;[Lclient!v;Z)V")
	public Class78_Sub4(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) Class206[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass92_Sub2_28 = arg0;
		@Pc(9) opengl local9 = arg0.anOpengl2;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13;
		for (local13 = 0; local13 < 256; local13++) {
			@Pc(20) Class206 local20 = arg2[local13];
			if (local20.anInt6576 > local11) {
				local11 = local20.anInt6576;
			}
			if (local20.anInt6577 > local11) {
				local11 = local20.anInt6577;
			}
		}
		local13 = local11 * 16;
		@Pc(47) byte[] local47 = new byte[local13 * local13];
		@Pc(62) int local62;
		@Pc(65) int local65;
		@Pc(71) int local71;
		@Pc(77) int local77;
		for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
			@Pc(56) Class206 local56 = arg2[local49];
			@Pc(59) byte[] local59 = local56.aByteArray92;
			local62 = local56.anInt6576;
			local65 = local56.anInt6577;
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
		this.aClass70_Sub4_Sub1_1 = Static360.method1996(local13, local47, local13, arg0);
		this.aBoolean410 = true;
		this.aClass70_Sub4_Sub1_1.method1989(false);
		this.aClass81_5 = new Class81(arg0, 256);
		@Pc(293) float local293 = this.aClass70_Sub4_Sub1_1.aFloat24 / (float) this.aClass70_Sub4_Sub1_1.anInt2357;
		@Pc(302) float local302 = this.aClass70_Sub4_Sub1_1.aFloat23 / (float) this.aClass70_Sub4_Sub1_1.anInt2356;
		for (@Pc(304) int local304 = 0; local304 < 256; local304++) {
			@Pc(311) Class206 local311 = arg2[local304];
			local62 = local311.anInt6576;
			local65 = local311.anInt6577;
			local71 = local311.anInt6578;
			local77 = local311.anInt6574;
			@Pc(330) float local330 = (float) (local304 % 16 * local11);
			@Pc(337) float local337 = (float) (local304 / 16 * local11);
			@Pc(341) float local341 = local330 * local293;
			@Pc(345) float local345 = local337 * local302;
			@Pc(352) float local352 = (local330 + (float) local65) * local293;
			@Pc(359) float local359 = (local337 + (float) local62) * local302;
			this.aClass81_5.method1877(local304);
			local9.glBegin(7);
			local9.glTexCoord2f(local341, this.aClass70_Sub4_Sub1_1.aFloat23 - local345);
			local9.glVertex2i(local77, local71);
			local9.glTexCoord2f(local341, this.aClass70_Sub4_Sub1_1.aFloat23 - local359);
			local9.glVertex2i(local77, local71 + local62);
			local9.glTexCoord2f(local352, this.aClass70_Sub4_Sub1_1.aFloat23 - local359);
			local9.glVertex2i(local77 + local65, local71 + local62);
			local9.glTexCoord2f(local352, this.aClass70_Sub4_Sub1_1.aFloat23 - local345);
			local9.glVertex2i(local77 + local65, local71);
			local9.glEnd();
			this.aClass81_5.method1876();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(CIIIZLclient!go;II)V")
	@Override
	protected void method4057(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class84 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class84_Sub2 local2 = (Class84_Sub2) arg5;
		@Pc(5) Class70_Sub4_Sub1 local5 = local2.aClass70_Sub4_Sub1_5;
		@Pc(9) opengl local9 = this.aClass92_Sub2_28.anOpengl2;
		this.aClass92_Sub2_28.method4575();
		this.aClass92_Sub2_28.method4548(this.aClass70_Sub4_Sub1_1);
		if (this.aBoolean410 || arg4) {
			this.aClass92_Sub2_28.method4569(7681, 8448);
			this.aClass92_Sub2_28.method4578(0, 34168, 768);
		}
		this.aClass92_Sub2_28.method4568(1);
		this.aClass92_Sub2_28.method4548(local5);
		this.aClass92_Sub2_28.method4569(7681, 8448);
		this.aClass92_Sub2_28.method4578(0, 34168, 768);
		local9.glTexGeni(8192, 9472, 9216);
		local9.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat24 / (float) local5.anInt2357;
		@Pc(76) float local76 = local5.aFloat23 / (float) local5.anInt2356;
		local9.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		local9.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		local9.glEnable(3168);
		local9.glEnable(3169);
		local9.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local9.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass81_5.method1875(arg0);
		local9.glLoadIdentity();
		local9.glDisable(3168);
		local9.glDisable(3169);
		this.aClass92_Sub2_28.method4578(0, 5890, 768);
		this.aClass92_Sub2_28.method4569(8448, 8448);
		this.aClass92_Sub2_28.method4548(null);
		this.aClass92_Sub2_28.method4568(0);
		if (this.aBoolean410 || arg4) {
			this.aClass92_Sub2_28.method4578(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(CIIIZ)V")
	@Override
	protected void method4061(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) opengl local3 = this.aClass92_Sub2_28.anOpengl2;
		this.aClass92_Sub2_28.method4575();
		this.aClass92_Sub2_28.method4548(this.aClass70_Sub4_Sub1_1);
		if (this.aBoolean410 || arg4) {
			this.aClass92_Sub2_28.method4569(7681, 8448);
			this.aClass92_Sub2_28.method4578(0, 34168, 768);
		}
		local3.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local3.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass81_5.method1875(arg0);
		local3.glLoadIdentity();
		if (this.aBoolean410 || arg4) {
			this.aClass92_Sub2_28.method4578(0, 5890, 768);
		}
	}
}
