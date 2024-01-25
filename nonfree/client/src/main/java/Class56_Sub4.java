import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class56_Sub4 extends Class56 {

	@OriginalMember(owner = "client!vba", name = "A", descriptor = "Lclient!pea;")
	private final Class121_Sub3 aClass121_Sub3_41;

	@OriginalMember(owner = "client!vba", name = "B", descriptor = "Lclient!mm;")
	private final Class35_Sub3_Sub1 aClass35_Sub3_Sub1_5;

	@OriginalMember(owner = "client!vba", name = "y", descriptor = "Z")
	private final boolean aBoolean638;

	@OriginalMember(owner = "client!vba", name = "z", descriptor = "Lclient!hea;")
	private final Class131 aClass131_6;

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lclient!pea;Lclient!il;[Lclient!me;Z)V")
	public Class56_Sub4(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) Class196[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass121_Sub3_41 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class196 local15 = arg2[local10];
			if (local15.anInt5517 > local8) {
				local8 = local15.anInt5517;
			}
			if (local15.anInt5516 > local8) {
				local8 = local15.anInt5516;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class196 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt5517;
			local57 = local51.anInt5516;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray67 == null) {
				local83 = local51.aByteArray68;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray67;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass35_Sub3_Sub1_5 = Static503.method849(local37, local37, arg0, local44);
		this.aBoolean638 = true;
		this.aClass35_Sub3_Sub1_5.method5329(false);
		this.aClass131_6 = new Class131(arg0, 256);
		@Pc(332) float local332 = this.aClass35_Sub3_Sub1_5.aFloat128 / (float) this.aClass35_Sub3_Sub1_5.anInt5653;
		@Pc(341) float local341 = this.aClass35_Sub3_Sub1_5.aFloat129 / (float) this.aClass35_Sub3_Sub1_5.anInt5654;
		for (@Pc(343) int local343 = 0; local343 < 256; local343++) {
			@Pc(348) Class196 local348 = arg2[local343];
			local57 = local348.anInt5517;
			local63 = local348.anInt5516;
			local69 = local348.anInt5515;
			local75 = local348.anInt5514;
			@Pc(367) float local367 = (float) (local343 % 16 * local8);
			@Pc(374) float local374 = (float) (local343 / 16 * local8);
			@Pc(378) float local378 = local367 * local332;
			@Pc(382) float local382 = local374 * local341;
			@Pc(389) float local389 = (local367 + (float) local63) * local332;
			@Pc(396) float local396 = (local374 + (float) local57) * local341;
			this.aClass131_6.method2755(local343);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local378, this.aClass35_Sub3_Sub1_5.aFloat129 - local382);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local378, this.aClass35_Sub3_Sub1_5.aFloat129 - local396);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass35_Sub3_Sub1_5.aFloat129 - local396);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass35_Sub3_Sub1_5.aFloat129 - local382);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass131_6.method2754();
		}
	}

	@OriginalMember(owner = "client!vba", name = "q", descriptor = "(CIIIZ)V")
	@Override
	protected void q(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass121_Sub3_41.method5706();
		this.aClass121_Sub3_41.method5713(this.aClass35_Sub3_Sub1_5);
		if (this.aBoolean638 || arg4) {
			this.aClass121_Sub3_41.method5659(8448, 7681);
			this.aClass121_Sub3_41.method5685(768, 34168, 0);
		} else {
			this.aClass121_Sub3_41.method5659(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass131_6.method2752(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean638 || arg4) {
			this.aClass121_Sub3_41.method5685(768, 5890, 0);
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(CIIIZLclient!fa;II)V")
	@Override
	protected void method7882(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class16 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class16_Sub3 local2 = (Class16_Sub3) arg5;
		@Pc(5) Class35_Sub3_Sub1 local5 = local2.aClass35_Sub3_Sub1_3;
		this.aClass121_Sub3_41.method5706();
		this.aClass121_Sub3_41.method5713(this.aClass35_Sub3_Sub1_5);
		if (this.aBoolean638 || arg4) {
			this.aClass121_Sub3_41.method5659(8448, 7681);
			this.aClass121_Sub3_41.method5685(768, 34168, 0);
		} else {
			this.aClass121_Sub3_41.method5659(7681, 7681);
		}
		this.aClass121_Sub3_41.method5648(1);
		this.aClass121_Sub3_41.method5713(local5);
		this.aClass121_Sub3_41.method5659(8448, 7681);
		this.aClass121_Sub3_41.method5685(768, 34168, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat128 / (float) local5.anInt5653;
		@Pc(85) float local85 = local5.aFloat129 / (float) local5.anInt5654;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass131_6.method2752(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass121_Sub3_41.method5685(768, 5890, 0);
		this.aClass121_Sub3_41.method5659(8448, 8448);
		this.aClass121_Sub3_41.method5713(null);
		this.aClass121_Sub3_41.method5648(0);
		if (this.aBoolean638 || arg4) {
			this.aClass121_Sub3_41.method5685(768, 5890, 0);
		}
	}
}
