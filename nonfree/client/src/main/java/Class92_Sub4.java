import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class92_Sub4 extends Class92 {

	@OriginalMember(owner = "client!nw", name = "y", descriptor = "Lclient!jaa;")
	private final Class14_Sub3 aClass14_Sub3_30;

	@OriginalMember(owner = "client!nw", name = "A", descriptor = "Lclient!hq;")
	private final Class51_Sub1_Sub1 aClass51_Sub1_Sub1_4;

	@OriginalMember(owner = "client!nw", name = "z", descriptor = "Z")
	private final boolean aBoolean441;

	@OriginalMember(owner = "client!nw", name = "x", descriptor = "Lclient!qda;")
	private final Class266 aClass266_4;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!jaa;Lclient!ub;[Lclient!iba;Z)V")
	public Class92_Sub4(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) Class140[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass14_Sub3_30 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class140 local15 = arg2[local10];
			if (local15.anInt4129 > local8) {
				local8 = local15.anInt4129;
			}
			if (local15.anInt4127 > local8) {
				local8 = local15.anInt4127;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class140 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt4129;
			local57 = local51.anInt4127;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray38 == null) {
				local83 = local51.aByteArray39;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray38;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass51_Sub1_Sub1_4 = Static88.method1672(local44, local37, local37, arg0);
		this.aBoolean441 = true;
		this.aClass51_Sub1_Sub1_4.method7734(false);
		this.aClass266_4 = new Class266(arg0, 256);
		@Pc(332) float local332 = this.aClass51_Sub1_Sub1_4.aFloat80 / (float) this.aClass51_Sub1_Sub1_4.anInt4054;
		@Pc(341) float local341 = this.aClass51_Sub1_Sub1_4.aFloat79 / (float) this.aClass51_Sub1_Sub1_4.anInt4055;
		for (@Pc(343) int local343 = 0; local343 < 256; local343++) {
			@Pc(348) Class140 local348 = arg2[local343];
			local57 = local348.anInt4129;
			local63 = local348.anInt4127;
			local69 = local348.anInt4126;
			local75 = local348.anInt4125;
			@Pc(367) float local367 = (float) (local343 % 16 * local8);
			@Pc(374) float local374 = (float) (local343 / 16 * local8);
			@Pc(378) float local378 = local367 * local332;
			@Pc(382) float local382 = local374 * local341;
			@Pc(389) float local389 = (local367 + (float) local63) * local332;
			@Pc(396) float local396 = (local374 + (float) local57) * local341;
			this.aClass266_4.method5983(local343);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local378, this.aClass51_Sub1_Sub1_4.aFloat79 - local382);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local378, this.aClass51_Sub1_Sub1_4.aFloat79 - local396);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass51_Sub1_Sub1_4.aFloat79 - local396);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass51_Sub1_Sub1_4.aFloat79 - local382);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass266_4.method5989();
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(CIIIZLclient!fa;II)V")
	@Override
	protected void method6398(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class86 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class86_Sub3 local2 = (Class86_Sub3) arg5;
		@Pc(5) Class51_Sub1_Sub1 local5 = local2.aClass51_Sub1_Sub1_5;
		this.aClass14_Sub3_30.method3951();
		this.aClass14_Sub3_30.method3985(this.aClass51_Sub1_Sub1_4);
		if (this.aBoolean441 || arg4) {
			this.aClass14_Sub3_30.method3976(7681, 8448);
			this.aClass14_Sub3_30.method3966(34168, 0, 768);
		} else {
			this.aClass14_Sub3_30.method3976(7681, 7681);
		}
		this.aClass14_Sub3_30.method3917(1);
		this.aClass14_Sub3_30.method3985(local5);
		this.aClass14_Sub3_30.method3976(7681, 8448);
		this.aClass14_Sub3_30.method3966(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat80 / (float) local5.anInt4054;
		@Pc(85) float local85 = local5.aFloat79 / (float) local5.anInt4055;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass266_4.method5987(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass14_Sub3_30.method3966(5890, 0, 768);
		this.aClass14_Sub3_30.method3976(8448, 8448);
		this.aClass14_Sub3_30.method3985(null);
		this.aClass14_Sub3_30.method3917(0);
		if (this.aBoolean441 || arg4) {
			this.aClass14_Sub3_30.method3966(5890, 0, 768);
		}
	}

	@OriginalMember(owner = "client!nw", name = "q", descriptor = "(CIIIZ)V")
	@Override
	protected void q(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass14_Sub3_30.method3951();
		this.aClass14_Sub3_30.method3985(this.aClass51_Sub1_Sub1_4);
		if (this.aBoolean441 || arg4) {
			this.aClass14_Sub3_30.method3976(7681, 8448);
			this.aClass14_Sub3_30.method3966(34168, 0, 768);
		} else {
			this.aClass14_Sub3_30.method3976(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass266_4.method5987(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean441 || arg4) {
			this.aClass14_Sub3_30.method3966(5890, 0, 768);
		}
	}
}
