import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class59_Sub5 extends Class59 {

	@OriginalMember(owner = "client!vc", name = "y", descriptor = "Lclient!ad;")
	private final Class5_Sub1 aClass5_Sub1_42;

	@OriginalMember(owner = "client!vc", name = "z", descriptor = "Lclient!ah;")
	private final Class11_Sub1_Sub1 aClass11_Sub1_Sub1_4;

	@OriginalMember(owner = "client!vc", name = "w", descriptor = "Z")
	private final boolean aBoolean660;

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "Lclient!ub;")
	private final Class291 aClass291_6;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lclient!ad;Lclient!cq;[Lclient!af;Z)V")
	public Class59_Sub5(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) Class9[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass5_Sub1_42 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class9 local15 = arg2[local10];
			if (local15.anInt481 > local8) {
				local8 = local15.anInt481;
			}
			if (local15.anInt478 > local8) {
				local8 = local15.anInt478;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class9 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt481;
			local57 = local51.anInt478;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray12 == null) {
				local83 = local51.aByteArray13;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray12;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass11_Sub1_Sub1_4 = Static236.method1277(arg0, local44, local37, local37);
		this.aBoolean660 = true;
		this.aClass11_Sub1_Sub1_4.method7303(false);
		this.aClass291_6 = new Class291(arg0, 256);
		@Pc(332) float local332 = this.aClass11_Sub1_Sub1_4.aFloat31 / (float) this.aClass11_Sub1_Sub1_4.anInt580;
		@Pc(341) float local341 = this.aClass11_Sub1_Sub1_4.aFloat30 / (float) this.aClass11_Sub1_Sub1_4.anInt582;
		for (@Pc(343) int local343 = 0; local343 < 256; local343++) {
			@Pc(348) Class9 local348 = arg2[local343];
			local57 = local348.anInt481;
			local63 = local348.anInt478;
			local69 = local348.anInt477;
			local75 = local348.anInt476;
			@Pc(367) float local367 = (float) (local343 % 16 * local8);
			@Pc(374) float local374 = (float) (local343 / 16 * local8);
			@Pc(378) float local378 = local367 * local332;
			@Pc(382) float local382 = local374 * local341;
			@Pc(389) float local389 = (local367 + (float) local63) * local332;
			@Pc(396) float local396 = (local374 + (float) local57) * local341;
			this.aClass291_6.method7121(local343);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local378, this.aClass11_Sub1_Sub1_4.aFloat30 - local382);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local378, this.aClass11_Sub1_Sub1_4.aFloat30 - local396);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass11_Sub1_Sub1_4.aFloat30 - local396);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass11_Sub1_Sub1_4.aFloat30 - local382);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass291_6.method7124();
		}
	}

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "(CIIIZ)V")
	@Override
	protected void q(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass5_Sub1_42.method418();
		this.aClass5_Sub1_42.method423(this.aClass11_Sub1_Sub1_4);
		if (this.aBoolean660 || arg4) {
			this.aClass5_Sub1_42.method448(8448, 7681);
			this.aClass5_Sub1_42.method419(34168, 0, 768);
		} else {
			this.aClass5_Sub1_42.method448(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass291_6.method7122(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean660 || arg4) {
			this.aClass5_Sub1_42.method419(5890, 0, 768);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(CIIIZLclient!fa;II)V")
	@Override
	protected void method7273(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class10 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class10_Sub3 local2 = (Class10_Sub3) arg5;
		@Pc(5) Class11_Sub1_Sub1 local5 = local2.aClass11_Sub1_Sub1_5;
		this.aClass5_Sub1_42.method418();
		this.aClass5_Sub1_42.method423(this.aClass11_Sub1_Sub1_4);
		if (this.aBoolean660 || arg4) {
			this.aClass5_Sub1_42.method448(8448, 7681);
			this.aClass5_Sub1_42.method419(34168, 0, 768);
		} else {
			this.aClass5_Sub1_42.method448(7681, 7681);
		}
		this.aClass5_Sub1_42.method397(1);
		this.aClass5_Sub1_42.method423(local5);
		this.aClass5_Sub1_42.method448(8448, 7681);
		this.aClass5_Sub1_42.method419(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat31 / (float) local5.anInt580;
		@Pc(85) float local85 = local5.aFloat30 / (float) local5.anInt582;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass291_6.method7122(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass5_Sub1_42.method419(5890, 0, 768);
		this.aClass5_Sub1_42.method448(8448, 8448);
		this.aClass5_Sub1_42.method423(null);
		this.aClass5_Sub1_42.method397(0);
		if (this.aBoolean660 || arg4) {
			this.aClass5_Sub1_42.method419(5890, 0, 768);
		}
	}
}
