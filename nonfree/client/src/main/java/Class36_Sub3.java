import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class36_Sub3 extends Class36 {

	@OriginalMember(owner = "client!gi", name = "v", descriptor = "Lclient!mh;")
	private final Class4_Sub3 aClass4_Sub3_13;

	@OriginalMember(owner = "client!gi", name = "y", descriptor = "Lclient!wo;")
	private final Class164_Sub3_Sub1 aClass164_Sub3_Sub1_2;

	@OriginalMember(owner = "client!gi", name = "x", descriptor = "Z")
	private final boolean aBoolean272;

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "Lclient!am;")
	private final Class11 aClass11_2;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!mh;Lclient!fc;[Lclient!dp;Z)V")
	public Class36_Sub3(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) Class70[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass4_Sub3_13 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class70 local15 = arg2[local10];
			if (local15.anInt2012 > local8) {
				local8 = local15.anInt2012;
			}
			if (local15.anInt2013 > local8) {
				local8 = local15.anInt2013;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class70 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt2012;
			local57 = local51.anInt2013;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray18 == null) {
				local83 = local51.aByteArray19;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray18;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass164_Sub3_Sub1_2 = Static281.method4925(arg0, local37, local44, local37);
		this.aBoolean272 = true;
		this.aClass164_Sub3_Sub1_2.method8154(false);
		this.aClass11_2 = new Class11(arg0, 256);
		@Pc(332) float local332 = this.aClass164_Sub3_Sub1_2.aFloat191 / (float) this.aClass164_Sub3_Sub1_2.anInt9484;
		@Pc(341) float local341 = this.aClass164_Sub3_Sub1_2.aFloat192 / (float) this.aClass164_Sub3_Sub1_2.anInt9477;
		for (@Pc(343) int local343 = 0; local343 < 256; local343++) {
			@Pc(348) Class70 local348 = arg2[local343];
			local57 = local348.anInt2012;
			local63 = local348.anInt2013;
			local69 = local348.anInt2010;
			local75 = local348.anInt2011;
			@Pc(367) float local367 = (float) (local343 % 16 * local8);
			@Pc(374) float local374 = (float) (local343 / 16 * local8);
			@Pc(378) float local378 = local367 * local332;
			@Pc(382) float local382 = local374 * local341;
			@Pc(389) float local389 = (local367 + (float) local63) * local332;
			@Pc(396) float local396 = (local374 + (float) local57) * local341;
			this.aClass11_2.method532(local343);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local378, this.aClass164_Sub3_Sub1_2.aFloat192 - local382);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local378, this.aClass164_Sub3_Sub1_2.aFloat192 - local396);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass164_Sub3_Sub1_2.aFloat192 - local396);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass164_Sub3_Sub1_2.aFloat192 - local382);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass11_2.method537();
		}
	}

	@OriginalMember(owner = "client!gi", name = "HA", descriptor = "(CIIIZ)V")
	@Override
	protected void HA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass4_Sub3_13.method5249();
		this.aClass4_Sub3_13.method5250(this.aClass164_Sub3_Sub1_2);
		if (this.aBoolean272 || arg4) {
			this.aClass4_Sub3_13.method5266(8448, 7681);
			this.aClass4_Sub3_13.method5293(0, 768, 34168);
		} else {
			this.aClass4_Sub3_13.method5266(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass11_2.method534(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean272 || arg4) {
			this.aClass4_Sub3_13.method5293(0, 768, 5890);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(CIIIZLclient!pa;II)V")
	@Override
	protected void method7956(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class28 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class28_Sub1 local2 = (Class28_Sub1) arg5;
		@Pc(5) Class164_Sub3_Sub1 local5 = local2.aClass164_Sub3_Sub1_1;
		this.aClass4_Sub3_13.method5249();
		this.aClass4_Sub3_13.method5250(this.aClass164_Sub3_Sub1_2);
		if (this.aBoolean272 || arg4) {
			this.aClass4_Sub3_13.method5266(8448, 7681);
			this.aClass4_Sub3_13.method5293(0, 768, 34168);
		} else {
			this.aClass4_Sub3_13.method5266(7681, 7681);
		}
		this.aClass4_Sub3_13.method5245(1);
		this.aClass4_Sub3_13.method5250(local5);
		this.aClass4_Sub3_13.method5266(8448, 7681);
		this.aClass4_Sub3_13.method5293(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat191 / (float) local5.anInt9484;
		@Pc(85) float local85 = local5.aFloat192 / (float) local5.anInt9477;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass11_2.method534(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass4_Sub3_13.method5293(0, 768, 5890);
		this.aClass4_Sub3_13.method5266(8448, 8448);
		this.aClass4_Sub3_13.method5250(null);
		this.aClass4_Sub3_13.method5245(0);
		if (this.aBoolean272 || arg4) {
			this.aClass4_Sub3_13.method5293(0, 768, 5890);
		}
	}
}
