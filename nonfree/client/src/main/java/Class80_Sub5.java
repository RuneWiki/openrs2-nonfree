import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class80_Sub5 extends Class80 {

	@OriginalMember(owner = "client!vm", name = "y", descriptor = "Lclient!gi;")
	private final Class42_Sub3 aClass42_Sub3_41;

	@OriginalMember(owner = "client!vm", name = "x", descriptor = "Lclient!es;")
	private final Class79_Sub2_Sub1 aClass79_Sub2_Sub1_5;

	@OriginalMember(owner = "client!vm", name = "z", descriptor = "Z")
	private final boolean aBoolean657;

	@OriginalMember(owner = "client!vm", name = "A", descriptor = "Lclient!ud;")
	private final Class294 aClass294_6;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!gi;Lclient!pu;[Lclient!bt;Z)V")
	public Class80_Sub5(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) Class244 arg1, @OriginalArg(2) Class40[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass42_Sub3_41 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class40 local15 = arg2[local10];
			if (local15.anInt894 > local8) {
				local8 = local15.anInt894;
			}
			if (local15.anInt895 > local8) {
				local8 = local15.anInt895;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class40 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt894;
			local57 = local51.anInt895;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray22 == null) {
				local83 = local51.aByteArray21;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray22;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass79_Sub2_Sub1_5 = Static95.method2003(local44, arg0, local37, local37);
		this.aBoolean657 = true;
		this.aClass79_Sub2_Sub1_5.method5278(false);
		this.aClass294_6 = new Class294(arg0, 256);
		@Pc(332) float local332 = this.aClass79_Sub2_Sub1_5.aFloat73 / (float) this.aClass79_Sub2_Sub1_5.anInt2822;
		@Pc(341) float local341 = this.aClass79_Sub2_Sub1_5.aFloat74 / (float) this.aClass79_Sub2_Sub1_5.anInt2824;
		for (@Pc(343) int local343 = 0; local343 < 256; local343++) {
			@Pc(348) Class40 local348 = arg2[local343];
			local57 = local348.anInt894;
			local63 = local348.anInt895;
			local69 = local348.anInt896;
			local75 = local348.anInt897;
			@Pc(367) float local367 = (float) (local343 % 16 * local8);
			@Pc(374) float local374 = (float) (local343 / 16 * local8);
			@Pc(378) float local378 = local367 * local332;
			@Pc(382) float local382 = local374 * local341;
			@Pc(389) float local389 = (local367 + (float) local63) * local332;
			@Pc(396) float local396 = (local374 + (float) local57) * local341;
			this.aClass294_6.method7287(local343);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local378, this.aClass79_Sub2_Sub1_5.aFloat74 - local382);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local378, this.aClass79_Sub2_Sub1_5.aFloat74 - local396);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass79_Sub2_Sub1_5.aFloat74 - local396);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass79_Sub2_Sub1_5.aFloat74 - local382);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass294_6.method7288();
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(CIIIZLclient!pa;II)V")
	@Override
	protected void method7777(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class145 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class145_Sub2 local2 = (Class145_Sub2) arg5;
		@Pc(5) Class79_Sub2_Sub1 local5 = local2.aClass79_Sub2_Sub1_4;
		this.aClass42_Sub3_41.method3254();
		this.aClass42_Sub3_41.method3219(this.aClass79_Sub2_Sub1_5);
		if (this.aBoolean657 || arg4) {
			this.aClass42_Sub3_41.method3250(7681, 8448);
			this.aClass42_Sub3_41.method3268(0, 768, 34168);
		} else {
			this.aClass42_Sub3_41.method3250(7681, 7681);
		}
		this.aClass42_Sub3_41.method3259(1);
		this.aClass42_Sub3_41.method3219(local5);
		this.aClass42_Sub3_41.method3250(7681, 8448);
		this.aClass42_Sub3_41.method3268(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat73 / (float) local5.anInt2822;
		@Pc(85) float local85 = local5.aFloat74 / (float) local5.anInt2824;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass294_6.method7284(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass42_Sub3_41.method3268(0, 768, 5890);
		this.aClass42_Sub3_41.method3250(8448, 8448);
		this.aClass42_Sub3_41.method3219(null);
		this.aClass42_Sub3_41.method3259(0);
		if (this.aBoolean657 || arg4) {
			this.aClass42_Sub3_41.method3268(0, 768, 5890);
		}
	}

	@OriginalMember(owner = "client!vm", name = "HA", descriptor = "(CIIIZ)V")
	@Override
	protected void HA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass42_Sub3_41.method3254();
		this.aClass42_Sub3_41.method3219(this.aClass79_Sub2_Sub1_5);
		if (this.aBoolean657 || arg4) {
			this.aClass42_Sub3_41.method3250(7681, 8448);
			this.aClass42_Sub3_41.method3268(0, 768, 34168);
		} else {
			this.aClass42_Sub3_41.method3250(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass294_6.method7284(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean657 || arg4) {
			this.aClass42_Sub3_41.method3268(0, 768, 5890);
		}
	}
}
