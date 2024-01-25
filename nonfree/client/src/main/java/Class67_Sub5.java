import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class67_Sub5 extends Class67 {

	@OriginalMember(owner = "client!wn", name = "v", descriptor = "Lclient!uq;")
	private final Class122_Sub3 aClass122_Sub3_42;

	@OriginalMember(owner = "client!wn", name = "x", descriptor = "Lclient!em;")
	private final Class73_Sub1_Sub1 aClass73_Sub1_Sub1_5;

	@OriginalMember(owner = "client!wn", name = "w", descriptor = "Z")
	private final boolean aBoolean634;

	@OriginalMember(owner = "client!wn", name = "y", descriptor = "Lclient!cn;")
	private final Class51 aClass51_6;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(Lclient!uq;Lclient!pe;[Lclient!ig;Z)V")
	public Class67_Sub5(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) Class232 arg1, @OriginalArg(2) Class136[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass122_Sub3_42 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class136 local15 = arg2[local10];
			if (local15.anInt4054 > local8) {
				local8 = local15.anInt4054;
			}
			if (local15.anInt4055 > local8) {
				local8 = local15.anInt4055;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class136 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt4054;
			local57 = local51.anInt4055;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray53 == null) {
				local83 = local51.aByteArray52;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray53;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass73_Sub1_Sub1_5 = Static14.method425(local44, local37, arg0, local37);
		this.aBoolean634 = true;
		this.aClass73_Sub1_Sub1_5.method6348(false);
		this.aClass51_6 = new Class51(arg0, 256);
		@Pc(332) float local332 = this.aClass73_Sub1_Sub1_5.aFloat21 / (float) this.aClass73_Sub1_Sub1_5.anInt2345;
		@Pc(341) float local341 = this.aClass73_Sub1_Sub1_5.aFloat20 / (float) this.aClass73_Sub1_Sub1_5.anInt2344;
		for (@Pc(343) int local343 = 0; local343 < 256; local343++) {
			@Pc(348) Class136 local348 = arg2[local343];
			local57 = local348.anInt4054;
			local63 = local348.anInt4055;
			local69 = local348.anInt4053;
			local75 = local348.anInt4052;
			@Pc(367) float local367 = (float) (local343 % 16 * local8);
			@Pc(374) float local374 = (float) (local343 / 16 * local8);
			@Pc(378) float local378 = local367 * local332;
			@Pc(382) float local382 = local374 * local341;
			@Pc(389) float local389 = (local367 + (float) local63) * local332;
			@Pc(396) float local396 = (local374 + (float) local57) * local341;
			this.aClass51_6.method1250(local343);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local378, this.aClass73_Sub1_Sub1_5.aFloat20 - local382);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local378, this.aClass73_Sub1_Sub1_5.aFloat20 - local396);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass73_Sub1_Sub1_5.aFloat20 - local396);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass73_Sub1_Sub1_5.aFloat20 - local382);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass51_6.method1253();
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(CIIIZLclient!pa;II)V")
	@Override
	protected void method7494(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class40 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class40_Sub2 local2 = (Class40_Sub2) arg5;
		@Pc(5) Class73_Sub1_Sub1 local5 = local2.aClass73_Sub1_Sub1_3;
		this.aClass122_Sub3_42.method6849();
		this.aClass122_Sub3_42.method6850(this.aClass73_Sub1_Sub1_5);
		if (this.aBoolean634 || arg4) {
			this.aClass122_Sub3_42.method6853(7681, 8448);
			this.aClass122_Sub3_42.method6899(768, 0, 34168);
		} else {
			this.aClass122_Sub3_42.method6853(7681, 7681);
		}
		this.aClass122_Sub3_42.method6932(1);
		this.aClass122_Sub3_42.method6850(local5);
		this.aClass122_Sub3_42.method6853(7681, 8448);
		this.aClass122_Sub3_42.method6899(768, 0, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat21 / (float) local5.anInt2345;
		@Pc(85) float local85 = local5.aFloat20 / (float) local5.anInt2344;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass51_6.method1248(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass122_Sub3_42.method6899(768, 0, 5890);
		this.aClass122_Sub3_42.method6853(8448, 8448);
		this.aClass122_Sub3_42.method6850(null);
		this.aClass122_Sub3_42.method6932(0);
		if (this.aBoolean634 || arg4) {
			this.aClass122_Sub3_42.method6899(768, 0, 5890);
		}
	}

	@OriginalMember(owner = "client!wn", name = "HA", descriptor = "(CIIIZ)V")
	@Override
	protected void HA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass122_Sub3_42.method6849();
		this.aClass122_Sub3_42.method6850(this.aClass73_Sub1_Sub1_5);
		if (this.aBoolean634 || arg4) {
			this.aClass122_Sub3_42.method6853(7681, 8448);
			this.aClass122_Sub3_42.method6899(768, 0, 34168);
		} else {
			this.aClass122_Sub3_42.method6853(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass51_6.method1248(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean634 || arg4) {
			this.aClass122_Sub3_42.method6899(768, 0, 5890);
		}
	}
}
