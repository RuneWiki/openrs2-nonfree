import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class29_Sub3 extends Class29 {

	@OriginalMember(owner = "client!ph", name = "D", descriptor = "Lclient!qj;")
	private final Class100_Sub3 aClass100_Sub3_34;

	@OriginalMember(owner = "client!ph", name = "E", descriptor = "Lclient!ar;")
	private final Class23_Sub1_Sub1 aClass23_Sub1_Sub1_4;

	@OriginalMember(owner = "client!ph", name = "C", descriptor = "Z")
	private final boolean aBoolean551;

	@OriginalMember(owner = "client!ph", name = "B", descriptor = "Lclient!fb;")
	private final Class106 aClass106_4;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!qj;Lclient!sa;[Lclient!aga;Z)V")
	public Class29_Sub3(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class294 arg1, @OriginalArg(2) Class13[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass100_Sub3_34 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class13 local15 = arg2[local10];
			if (local15.anInt428 > local8) {
				local8 = local15.anInt428;
			}
			if (local15.anInt427 > local8) {
				local8 = local15.anInt427;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class13 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt428;
			local57 = local51.anInt427;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray4 == null) {
				local83 = local51.aByteArray3;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray4;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass23_Sub1_Sub1_4 = Static407.method5923(local37, arg0, local44, local37);
		this.aBoolean551 = true;
		this.aClass23_Sub1_Sub1_4.method7783(false);
		this.aClass106_4 = new Class106(arg0, 256);
		@Pc(332) float local332 = this.aClass23_Sub1_Sub1_4.aFloat16 / (float) this.aClass23_Sub1_Sub1_4.anInt586;
		@Pc(341) float local341 = this.aClass23_Sub1_Sub1_4.aFloat15 / (float) this.aClass23_Sub1_Sub1_4.anInt583;
		for (@Pc(343) int local343 = 0; local343 < 256; local343++) {
			@Pc(348) Class13 local348 = arg2[local343];
			local57 = local348.anInt428;
			local63 = local348.anInt427;
			local69 = local348.anInt430;
			local75 = local348.anInt429;
			@Pc(367) float local367 = (float) (local343 % 16 * local8);
			@Pc(374) float local374 = (float) (local343 / 16 * local8);
			@Pc(378) float local378 = local367 * local332;
			@Pc(382) float local382 = local374 * local341;
			@Pc(389) float local389 = (local367 + (float) local63) * local332;
			@Pc(396) float local396 = (local374 + (float) local57) * local341;
			this.aClass106_4.method2292(local343);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local378, this.aClass23_Sub1_Sub1_4.aFloat15 - local382);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local378, this.aClass23_Sub1_Sub1_4.aFloat15 - local396);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass23_Sub1_Sub1_4.aFloat15 - local396);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass23_Sub1_Sub1_4.aFloat15 - local382);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass106_4.method2293();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	@Override
	protected void method7122(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class20 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class20_Sub2 local2 = (Class20_Sub2) arg5;
		@Pc(5) Class23_Sub1_Sub1 local5 = local2.aClass23_Sub1_Sub1_3;
		this.aClass100_Sub3_34.method6312();
		this.aClass100_Sub3_34.method6277(this.aClass23_Sub1_Sub1_4);
		if (this.aBoolean551 || arg4) {
			this.aClass100_Sub3_34.method6300(7681, 8448);
			this.aClass100_Sub3_34.method6283(0, 768, 34168);
		} else {
			this.aClass100_Sub3_34.method6300(7681, 7681);
		}
		this.aClass100_Sub3_34.method6344(1);
		this.aClass100_Sub3_34.method6277(local5);
		this.aClass100_Sub3_34.method6300(7681, 8448);
		this.aClass100_Sub3_34.method6283(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat16 / (float) local5.anInt586;
		@Pc(85) float local85 = local5.aFloat15 / (float) local5.anInt583;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass106_4.method2294(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass100_Sub3_34.method6283(0, 768, 5890);
		this.aClass100_Sub3_34.method6300(8448, 8448);
		this.aClass100_Sub3_34.method6277(null);
		this.aClass100_Sub3_34.method6344(0);
		if (this.aBoolean551 || arg4) {
			this.aClass100_Sub3_34.method6283(0, 768, 5890);
		}
	}

	@OriginalMember(owner = "client!ph", name = "OA", descriptor = "(CIIIZ)V")
	@Override
	protected void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass100_Sub3_34.method6312();
		this.aClass100_Sub3_34.method6277(this.aClass23_Sub1_Sub1_4);
		if (this.aBoolean551 || arg4) {
			this.aClass100_Sub3_34.method6300(7681, 8448);
			this.aClass100_Sub3_34.method6283(0, 768, 34168);
		} else {
			this.aClass100_Sub3_34.method6300(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass106_4.method2294(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean551 || arg4) {
			this.aClass100_Sub3_34.method6283(0, 768, 5890);
		}
	}
}
