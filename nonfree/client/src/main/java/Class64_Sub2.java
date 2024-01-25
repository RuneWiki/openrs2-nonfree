import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class64_Sub2 extends Class64 {

	@OriginalMember(owner = "client!gt", name = "y", descriptor = "Lclient!ok;")
	private final Class134_Sub2 aClass134_Sub2_13;

	@OriginalMember(owner = "client!gt", name = "B", descriptor = "Lclient!ot;")
	private final Class40_Sub3_Sub1 aClass40_Sub3_Sub1_3;

	@OriginalMember(owner = "client!gt", name = "A", descriptor = "Z")
	private final boolean aBoolean236;

	@OriginalMember(owner = "client!gt", name = "z", descriptor = "Lclient!hg;")
	private final Class136 aClass136_2;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lclient!ok;Lclient!uq;[Lclient!fg;Z)V")
	public Class64_Sub2(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) Class334 arg1, @OriginalArg(2) Class102[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass134_Sub2_13 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class102 local15 = arg2[local10];
			if (local15.anInt2626 > local8) {
				local8 = local15.anInt2626;
			}
			if (local15.anInt2624 > local8) {
				local8 = local15.anInt2624;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class102 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt2626;
			local57 = local51.anInt2624;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray31 == null) {
				local83 = local51.aByteArray32;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray31;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass40_Sub3_Sub1_3 = Static295.method4129(local37, local37, local44, arg0);
		this.aBoolean236 = true;
		this.aClass40_Sub3_Sub1_3.method5874(false);
		this.aClass136_2 = new Class136(arg0, 256);
		@Pc(332) float local332 = this.aClass40_Sub3_Sub1_3.aFloat161 / (float) this.aClass40_Sub3_Sub1_3.anInt6751;
		@Pc(341) float local341 = this.aClass40_Sub3_Sub1_3.aFloat162 / (float) this.aClass40_Sub3_Sub1_3.anInt6748;
		for (@Pc(343) int local343 = 0; local343 < 256; local343++) {
			@Pc(348) Class102 local348 = arg2[local343];
			local57 = local348.anInt2626;
			local63 = local348.anInt2624;
			local69 = local348.anInt2625;
			local75 = local348.anInt2622;
			@Pc(367) float local367 = (float) (local343 % 16 * local8);
			@Pc(374) float local374 = (float) (local343 / 16 * local8);
			@Pc(378) float local378 = local367 * local332;
			@Pc(382) float local382 = local374 * local341;
			@Pc(389) float local389 = (local367 + (float) local63) * local332;
			@Pc(396) float local396 = (local374 + (float) local57) * local341;
			this.aClass136_2.method2920(local343);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local378, this.aClass40_Sub3_Sub1_3.aFloat162 - local382);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local378, this.aClass40_Sub3_Sub1_3.aFloat162 - local396);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass40_Sub3_Sub1_3.aFloat162 - local396);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass40_Sub3_Sub1_3.aFloat162 - local382);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass136_2.method2918();
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	@Override
	protected void method6603(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class204 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class204_Sub1 local2 = (Class204_Sub1) arg5;
		@Pc(5) Class40_Sub3_Sub1 local5 = local2.aClass40_Sub3_Sub1_4;
		this.aClass134_Sub2_13.method5237();
		this.aClass134_Sub2_13.method5202(this.aClass40_Sub3_Sub1_3);
		if (this.aBoolean236 || arg4) {
			this.aClass134_Sub2_13.method5224(7681, 8448);
			this.aClass134_Sub2_13.method5200(0, 34168, 768);
		} else {
			this.aClass134_Sub2_13.method5224(7681, 7681);
		}
		this.aClass134_Sub2_13.method5197(1);
		this.aClass134_Sub2_13.method5202(local5);
		this.aClass134_Sub2_13.method5224(7681, 8448);
		this.aClass134_Sub2_13.method5200(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat161 / (float) local5.anInt6751;
		@Pc(85) float local85 = local5.aFloat162 / (float) local5.anInt6748;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass136_2.method2915(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass134_Sub2_13.method5200(0, 5890, 768);
		this.aClass134_Sub2_13.method5224(8448, 8448);
		this.aClass134_Sub2_13.method5202(null);
		this.aClass134_Sub2_13.method5197(0);
		if (this.aBoolean236 || arg4) {
			this.aClass134_Sub2_13.method5200(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!gt", name = "OA", descriptor = "(CIIIZ)V")
	@Override
	protected void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass134_Sub2_13.method5237();
		this.aClass134_Sub2_13.method5202(this.aClass40_Sub3_Sub1_3);
		if (this.aBoolean236 || arg4) {
			this.aClass134_Sub2_13.method5224(7681, 8448);
			this.aClass134_Sub2_13.method5200(0, 34168, 768);
		} else {
			this.aClass134_Sub2_13.method5224(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass136_2.method2915(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean236 || arg4) {
			this.aClass134_Sub2_13.method5200(0, 5890, 768);
		}
	}
}
