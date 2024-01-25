import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public final class Class91_Sub2 extends Class91 {

	@OriginalMember(owner = "client!nda", name = "z", descriptor = "Lclient!no;")
	private final Class66_Sub3 aClass66_Sub3_30;

	@OriginalMember(owner = "client!nda", name = "y", descriptor = "Lclient!mn;")
	private final Class114_Sub1_Sub1 aClass114_Sub1_Sub1_3;

	@OriginalMember(owner = "client!nda", name = "x", descriptor = "Z")
	private final boolean aBoolean455;

	@OriginalMember(owner = "client!nda", name = "A", descriptor = "Lclient!u;")
	private final Class326 aClass326_5;

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lclient!no;Lclient!kga;[Lclient!pga;Z)V")
	public Class91_Sub2(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) Class196 arg1, @OriginalArg(2) Class268[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass66_Sub3_30 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class268 local15 = arg2[local10];
			if (local15.anInt7060 > local8) {
				local8 = local15.anInt7060;
			}
			if (local15.anInt7058 > local8) {
				local8 = local15.anInt7058;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class268 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt7060;
			local57 = local51.anInt7058;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray92 == null) {
				local83 = local51.aByteArray93;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray92;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass114_Sub1_Sub1_3 = Static443.method6271(local37, local37, arg0, local44);
		this.aBoolean455 = true;
		this.aClass114_Sub1_Sub1_3.method4999(false);
		this.aClass326_5 = new Class326(arg0, 256);
		@Pc(332) float local332 = this.aClass114_Sub1_Sub1_3.aFloat103 / (float) this.aClass114_Sub1_Sub1_3.anInt5922;
		@Pc(341) float local341 = this.aClass114_Sub1_Sub1_3.aFloat104 / (float) this.aClass114_Sub1_Sub1_3.anInt5924;
		for (@Pc(343) int local343 = 0; local343 < 256; local343++) {
			@Pc(348) Class268 local348 = arg2[local343];
			local57 = local348.anInt7060;
			local63 = local348.anInt7058;
			local69 = local348.anInt7059;
			local75 = local348.anInt7057;
			@Pc(367) float local367 = (float) (local343 % 16 * local8);
			@Pc(374) float local374 = (float) (local343 / 16 * local8);
			@Pc(378) float local378 = local367 * local332;
			@Pc(382) float local382 = local374 * local341;
			@Pc(389) float local389 = (local367 + (float) local63) * local332;
			@Pc(396) float local396 = (local374 + (float) local57) * local341;
			this.aClass326_5.method7293(local343);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local378, this.aClass114_Sub1_Sub1_3.aFloat104 - local382);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local378, this.aClass114_Sub1_Sub1_3.aFloat104 - local396);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass114_Sub1_Sub1_3.aFloat104 - local396);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass114_Sub1_Sub1_3.aFloat104 - local382);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass326_5.method7295();
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(CIIIZLclient!fa;II)V")
	@Override
	protected void method7459(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class98_Sub3 local2 = (Class98_Sub3) arg5;
		@Pc(5) Class114_Sub1_Sub1 local5 = local2.aClass114_Sub1_Sub1_5;
		this.aClass66_Sub3_30.method5375();
		this.aClass66_Sub3_30.method5382(this.aClass114_Sub1_Sub1_3);
		if (this.aBoolean455 || arg4) {
			this.aClass66_Sub3_30.method5396(8448, 7681);
			this.aClass66_Sub3_30.method5361(768, 0, 34168);
		} else {
			this.aClass66_Sub3_30.method5396(7681, 7681);
		}
		this.aClass66_Sub3_30.method5381(1);
		this.aClass66_Sub3_30.method5382(local5);
		this.aClass66_Sub3_30.method5396(8448, 7681);
		this.aClass66_Sub3_30.method5361(768, 0, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat103 / (float) local5.anInt5922;
		@Pc(85) float local85 = local5.aFloat104 / (float) local5.anInt5924;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass326_5.method7292(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass66_Sub3_30.method5361(768, 0, 5890);
		this.aClass66_Sub3_30.method5396(8448, 8448);
		this.aClass66_Sub3_30.method5382(null);
		this.aClass66_Sub3_30.method5381(0);
		if (this.aBoolean455 || arg4) {
			this.aClass66_Sub3_30.method5361(768, 0, 5890);
		}
	}

	@OriginalMember(owner = "client!nda", name = "q", descriptor = "(CIIIZ)V")
	@Override
	protected void q(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass66_Sub3_30.method5375();
		this.aClass66_Sub3_30.method5382(this.aClass114_Sub1_Sub1_3);
		if (this.aBoolean455 || arg4) {
			this.aClass66_Sub3_30.method5396(8448, 7681);
			this.aClass66_Sub3_30.method5361(768, 0, 34168);
		} else {
			this.aClass66_Sub3_30.method5396(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass326_5.method7292(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean455 || arg4) {
			this.aClass66_Sub3_30.method5361(768, 0, 5890);
		}
	}
}
