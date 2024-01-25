import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!bo", name = "z", descriptor = "Lclient!ag;")
	private final Class12_Sub1 aClass12_Sub1_9;

	@OriginalMember(owner = "client!bo", name = "x", descriptor = "Lclient!ck;")
	private final Class52_Sub1_Sub1 aClass52_Sub1_Sub1_4;

	@OriginalMember(owner = "client!bo", name = "y", descriptor = "Z")
	private final boolean aBoolean91;

	@OriginalMember(owner = "client!bo", name = "A", descriptor = "Lclient!cl;")
	private final Class53 aClass53_2;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!ag;Lclient!aga;[Lclient!tq;Z)V")
	public Class35_Sub1(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) Class318[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass12_Sub1_9 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class318 local15 = arg2[local10];
			if (local15.anInt8535 > local8) {
				local8 = local15.anInt8535;
			}
			if (local15.anInt8537 > local8) {
				local8 = local15.anInt8537;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class318 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt8535;
			local57 = local51.anInt8537;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray93 == null) {
				local83 = local51.aByteArray94;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray93;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass52_Sub1_Sub1_4 = Static463.method6577(local44, local37, local37, arg0);
		this.aBoolean91 = true;
		this.aClass52_Sub1_Sub1_4.method5644(false);
		this.aClass53_2 = new Class53(arg0, 256);
		@Pc(332) float local332 = this.aClass52_Sub1_Sub1_4.aFloat36 / (float) this.aClass52_Sub1_Sub1_4.anInt1673;
		@Pc(341) float local341 = this.aClass52_Sub1_Sub1_4.aFloat35 / (float) this.aClass52_Sub1_Sub1_4.anInt1672;
		for (@Pc(343) int local343 = 0; local343 < 256; local343++) {
			@Pc(348) Class318 local348 = arg2[local343];
			local57 = local348.anInt8535;
			local63 = local348.anInt8537;
			local69 = local348.anInt8534;
			local75 = local348.anInt8533;
			@Pc(367) float local367 = (float) (local343 % 16 * local8);
			@Pc(374) float local374 = (float) (local343 / 16 * local8);
			@Pc(378) float local378 = local367 * local332;
			@Pc(382) float local382 = local374 * local341;
			@Pc(389) float local389 = (local367 + (float) local63) * local332;
			@Pc(396) float local396 = (local374 + (float) local57) * local341;
			this.aClass53_2.method1513(local343);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local378, this.aClass52_Sub1_Sub1_4.aFloat35 - local382);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local378, this.aClass52_Sub1_Sub1_4.aFloat35 - local396);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass52_Sub1_Sub1_4.aFloat35 - local396);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass52_Sub1_Sub1_4.aFloat35 - local382);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass53_2.method1514();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(CIIIZLclient!ua;II)V")
	@Override
	protected void method4950(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class200 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class200_Sub3 local2 = (Class200_Sub3) arg5;
		@Pc(5) Class52_Sub1_Sub1 local5 = local2.aClass52_Sub1_Sub1_5;
		this.aClass12_Sub1_9.method443();
		this.aClass12_Sub1_9.method378(this.aClass52_Sub1_Sub1_4);
		if (this.aBoolean91 || arg4) {
			this.aClass12_Sub1_9.method420(8448, 7681);
			this.aClass12_Sub1_9.method387(0, 768, 34168);
		} else {
			this.aClass12_Sub1_9.method420(7681, 7681);
		}
		this.aClass12_Sub1_9.method376(1);
		this.aClass12_Sub1_9.method378(local5);
		this.aClass12_Sub1_9.method420(8448, 7681);
		this.aClass12_Sub1_9.method387(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat36 / (float) local5.anInt1673;
		@Pc(85) float local85 = local5.aFloat35 / (float) local5.anInt1672;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass53_2.method1511(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass12_Sub1_9.method387(0, 768, 5890);
		this.aClass12_Sub1_9.method420(8448, 8448);
		this.aClass12_Sub1_9.method378(null);
		this.aClass12_Sub1_9.method376(0);
		if (this.aBoolean91 || arg4) {
			this.aClass12_Sub1_9.method387(0, 768, 5890);
		}
	}

	@OriginalMember(owner = "client!bo", name = "OA", descriptor = "(CIIIZ)V")
	@Override
	protected void OA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass12_Sub1_9.method443();
		this.aClass12_Sub1_9.method378(this.aClass52_Sub1_Sub1_4);
		if (this.aBoolean91 || arg4) {
			this.aClass12_Sub1_9.method420(8448, 7681);
			this.aClass12_Sub1_9.method387(0, 768, 34168);
		} else {
			this.aClass12_Sub1_9.method420(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass53_2.method1511(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean91 || arg4) {
			this.aClass12_Sub1_9.method387(0, 768, 5890);
		}
	}
}
