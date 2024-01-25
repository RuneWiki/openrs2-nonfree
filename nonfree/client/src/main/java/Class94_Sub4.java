import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class94_Sub4 extends Class94 {

	@OriginalMember(owner = "client!wm", name = "w", descriptor = "Lclient!hd;")
	private final Class89_Sub1 aClass89_Sub1_41;

	@OriginalMember(owner = "client!wm", name = "z", descriptor = "Lclient!mc;")
	private final Class92_Sub4_Sub1 aClass92_Sub4_Sub1_5;

	@OriginalMember(owner = "client!wm", name = "x", descriptor = "Z")
	private final boolean aBoolean494;

	@OriginalMember(owner = "client!wm", name = "y", descriptor = "Lclient!q;")
	private final Class168 aClass168_6;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!hd;Lclient!vm;[Lclient!dr;Z)V")
	public Class94_Sub4(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) Class208 arg1, @OriginalArg(2) Class56[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass89_Sub1_41 = arg0;
		@Pc(9) opengl local9 = arg0.anOpengl2;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13;
		for (local13 = 0; local13 < 256; local13++) {
			@Pc(20) Class56 local20 = arg2[local13];
			if (local20.anInt1622 > local11) {
				local11 = local20.anInt1622;
			}
			if (local20.anInt1621 > local11) {
				local11 = local20.anInt1621;
			}
		}
		local13 = local11 * 16;
		@Pc(47) byte[] local47 = new byte[local13 * local13];
		@Pc(62) int local62;
		@Pc(65) int local65;
		@Pc(71) int local71;
		@Pc(77) int local77;
		for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
			@Pc(56) Class56 local56 = arg2[local49];
			@Pc(59) byte[] local59 = local56.aByteArray20;
			local62 = local56.anInt1622;
			local65 = local56.anInt1621;
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
		this.aClass92_Sub4_Sub1_5 = Static363.method3534(arg0, local13, local13, local47);
		this.aBoolean494 = true;
		this.aClass92_Sub4_Sub1_5.method3517(false);
		this.aClass168_6 = new Class168(arg0, 256);
		@Pc(293) float local293 = this.aClass92_Sub4_Sub1_5.aFloat54 / (float) this.aClass92_Sub4_Sub1_5.anInt3884;
		@Pc(302) float local302 = this.aClass92_Sub4_Sub1_5.aFloat53 / (float) this.aClass92_Sub4_Sub1_5.anInt3883;
		for (@Pc(304) int local304 = 0; local304 < 256; local304++) {
			@Pc(311) Class56 local311 = arg2[local304];
			local62 = local311.anInt1622;
			local65 = local311.anInt1621;
			local71 = local311.anInt1620;
			local77 = local311.anInt1618;
			@Pc(330) float local330 = (float) (local304 % 16 * local11);
			@Pc(337) float local337 = (float) (local304 / 16 * local11);
			@Pc(341) float local341 = local330 * local293;
			@Pc(345) float local345 = local337 * local302;
			@Pc(352) float local352 = (local330 + (float) local65) * local293;
			@Pc(359) float local359 = (local337 + (float) local62) * local302;
			this.aClass168_6.method4286(local304);
			local9.glBegin(7);
			local9.glTexCoord2f(local341, this.aClass92_Sub4_Sub1_5.aFloat53 - local345);
			local9.glVertex2i(local77, local71);
			local9.glTexCoord2f(local341, this.aClass92_Sub4_Sub1_5.aFloat53 - local359);
			local9.glVertex2i(local77, local71 + local62);
			local9.glTexCoord2f(local352, this.aClass92_Sub4_Sub1_5.aFloat53 - local359);
			local9.glVertex2i(local77 + local65, local71 + local62);
			local9.glTexCoord2f(local352, this.aClass92_Sub4_Sub1_5.aFloat53 - local345);
			local9.glVertex2i(local77 + local65, local71);
			local9.glEnd();
			this.aClass168_6.method4285();
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(CIIIZLclient!vj;II)V")
	@Override
	protected void method5677(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class64 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class64_Sub2 local2 = (Class64_Sub2) arg5;
		@Pc(5) Class92_Sub4_Sub1 local5 = local2.aClass92_Sub4_Sub1_2;
		@Pc(9) opengl local9 = this.aClass89_Sub1_41.anOpengl2;
		this.aClass89_Sub1_41.method2402();
		this.aClass89_Sub1_41.method2445(this.aClass92_Sub4_Sub1_5);
		if (this.aBoolean494 || arg4) {
			this.aClass89_Sub1_41.method2419(7681, 8448);
			this.aClass89_Sub1_41.method2392(0, 34168, 768);
		}
		this.aClass89_Sub1_41.method2433(1);
		this.aClass89_Sub1_41.method2445(local5);
		this.aClass89_Sub1_41.method2419(7681, 8448);
		this.aClass89_Sub1_41.method2392(0, 34168, 768);
		local9.glTexGeni(8192, 9472, 9216);
		local9.glTexGeni(8193, 9472, 9216);
		@Pc(69) float local69 = local5.aFloat54 / (float) local5.anInt3884;
		@Pc(76) float local76 = local5.aFloat53 / (float) local5.anInt3883;
		local9.glTexGenfv(8192, 9474, new float[] { local69, 0.0F, 0.0F, (float) -arg6 * local69 }, 0);
		local9.glTexGenfv(8193, 9474, new float[] { 0.0F, local76, 0.0F, (float) -arg7 * local76 }, 0);
		local9.glEnable(3168);
		local9.glEnable(3169);
		local9.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local9.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass168_6.method4287(arg0);
		local9.glLoadIdentity();
		local9.glDisable(3168);
		local9.glDisable(3169);
		this.aClass89_Sub1_41.method2392(0, 5890, 768);
		this.aClass89_Sub1_41.method2419(8448, 8448);
		this.aClass89_Sub1_41.method2445(null);
		this.aClass89_Sub1_41.method2433(0);
		if (this.aBoolean494 || arg4) {
			this.aClass89_Sub1_41.method2392(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(CIIIZ)V")
	@Override
	protected void method5675(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) opengl local3 = this.aClass89_Sub1_41.anOpengl2;
		this.aClass89_Sub1_41.method2402();
		this.aClass89_Sub1_41.method2445(this.aClass92_Sub4_Sub1_5);
		if (this.aBoolean494 || arg4) {
			this.aClass89_Sub1_41.method2419(7681, 8448);
			this.aClass89_Sub1_41.method2392(0, 34168, 768);
		}
		local3.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		local3.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass168_6.method4287(arg0);
		local3.glLoadIdentity();
		if (this.aBoolean494 || arg4) {
			this.aClass89_Sub1_41.method2392(0, 5890, 768);
		}
	}
}
