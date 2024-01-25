import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class58_Sub5 extends Class58 {

	@OriginalMember(owner = "client!vv", name = "x", descriptor = "Lclient!kga;")
	private final Class44_Sub3 aClass44_Sub3_44;

	@OriginalMember(owner = "client!vv", name = "B", descriptor = "Lclient!eb;")
	private final Class77_Sub1_Sub1 aClass77_Sub1_Sub1_5;

	@OriginalMember(owner = "client!vv", name = "y", descriptor = "Z")
	private final boolean aBoolean706;

	@OriginalMember(owner = "client!vv", name = "z", descriptor = "Lclient!qt;")
	private final Class279 aClass279_6;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lclient!kga;Lclient!gda;[Lclient!pga;Z)V")
	public Class58_Sub5(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) Class261[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass44_Sub3_44 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class261 local15 = arg2[local10];
			if (local15.anInt7660 > local8) {
				local8 = local15.anInt7660;
			}
			if (local15.anInt7655 > local8) {
				local8 = local15.anInt7655;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class261 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt7660;
			local57 = local51.anInt7655;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray89 == null) {
				local83 = local51.aByteArray90;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray89;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass77_Sub1_Sub1_5 = Static108.method2381(local37, local37, arg0, local44);
		this.aBoolean706 = true;
		this.aClass77_Sub1_Sub1_5.method7076(false);
		this.aClass279_6 = new Class279(arg0, 256);
		@Pc(332) float local332 = this.aClass77_Sub1_Sub1_5.aFloat88 / (float) this.aClass77_Sub1_Sub1_5.anInt2401;
		@Pc(341) float local341 = this.aClass77_Sub1_Sub1_5.aFloat89 / (float) this.aClass77_Sub1_Sub1_5.anInt2403;
		for (@Pc(343) int local343 = 0; local343 < 256; local343++) {
			@Pc(348) Class261 local348 = arg2[local343];
			local57 = local348.anInt7660;
			local63 = local348.anInt7655;
			local69 = local348.anInt7656;
			local75 = local348.anInt7657;
			@Pc(367) float local367 = (float) (local343 % 16 * local8);
			@Pc(374) float local374 = (float) (local343 / 16 * local8);
			@Pc(378) float local378 = local367 * local332;
			@Pc(382) float local382 = local374 * local341;
			@Pc(389) float local389 = (local367 + (float) local63) * local332;
			@Pc(396) float local396 = (local374 + (float) local57) * local341;
			this.aClass279_6.method6794(local343);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local378, this.aClass77_Sub1_Sub1_5.aFloat89 - local382);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local378, this.aClass77_Sub1_Sub1_5.aFloat89 - local396);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass77_Sub1_Sub1_5.aFloat89 - local396);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass77_Sub1_Sub1_5.aFloat89 - local382);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass279_6.method6799();
		}
	}

	@OriginalMember(owner = "client!vv", name = "OA", descriptor = "(CIIIZ)V")
	@Override
	protected void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass44_Sub3_44.method4654();
		this.aClass44_Sub3_44.method4605(this.aClass77_Sub1_Sub1_5);
		if (this.aBoolean706 || arg4) {
			this.aClass44_Sub3_44.method4621(7681, 8448);
			this.aClass44_Sub3_44.method4641(768, 0, 34168);
		} else {
			this.aClass44_Sub3_44.method4621(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass279_6.method6798(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean706 || arg4) {
			this.aClass44_Sub3_44.method4641(768, 0, 5890);
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	@Override
	protected void method8163(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class6 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class6_Sub3 local2 = (Class6_Sub3) arg5;
		@Pc(5) Class77_Sub1_Sub1 local5 = local2.aClass77_Sub1_Sub1_4;
		this.aClass44_Sub3_44.method4654();
		this.aClass44_Sub3_44.method4605(this.aClass77_Sub1_Sub1_5);
		if (this.aBoolean706 || arg4) {
			this.aClass44_Sub3_44.method4621(7681, 8448);
			this.aClass44_Sub3_44.method4641(768, 0, 34168);
		} else {
			this.aClass44_Sub3_44.method4621(7681, 7681);
		}
		this.aClass44_Sub3_44.method4648(1);
		this.aClass44_Sub3_44.method4605(local5);
		this.aClass44_Sub3_44.method4621(7681, 8448);
		this.aClass44_Sub3_44.method4641(768, 0, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat88 / (float) local5.anInt2401;
		@Pc(85) float local85 = local5.aFloat89 / (float) local5.anInt2403;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass279_6.method6798(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass44_Sub3_44.method4641(768, 0, 5890);
		this.aClass44_Sub3_44.method4621(8448, 8448);
		this.aClass44_Sub3_44.method4605(null);
		this.aClass44_Sub3_44.method4648(0);
		if (this.aBoolean706 || arg4) {
			this.aClass44_Sub3_44.method4641(768, 0, 5890);
		}
	}
}
