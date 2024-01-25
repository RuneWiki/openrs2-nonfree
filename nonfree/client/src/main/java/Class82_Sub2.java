import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eea")
public final class Class82_Sub2 extends Class82 {

	@OriginalMember(owner = "client!eea", name = "z", descriptor = "Lclient!en;")
	private final Class90_Sub1 aClass90_Sub1_9;

	@OriginalMember(owner = "client!eea", name = "B", descriptor = "Lclient!an;")
	private final Class16_Sub1_Sub1 aClass16_Sub1_Sub1_2;

	@OriginalMember(owner = "client!eea", name = "y", descriptor = "Z")
	private final boolean aBoolean138;

	@OriginalMember(owner = "client!eea", name = "A", descriptor = "Lclient!ml;")
	private final Class204 aClass204_2;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Lclient!en;Lclient!mj;[Lclient!kq;Z)V")
	public Class82_Sub2(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) Class202 arg1, @OriginalArg(2) Class177[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass90_Sub1_9 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class177 local15 = arg2[local10];
			if (local15.anInt4884 > local8) {
				local8 = local15.anInt4884;
			}
			if (local15.anInt4887 > local8) {
				local8 = local15.anInt4887;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class177 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt4884;
			local57 = local51.anInt4887;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray67 == null) {
				local83 = local51.aByteArray66;
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
		this.aClass16_Sub1_Sub1_2 = Static238.method3727(local37, local44, local37, arg0);
		this.aBoolean138 = true;
		this.aClass16_Sub1_Sub1_2.method7843(false);
		this.aClass204_2 = new Class204(arg0, 256);
		@Pc(332) float local332 = this.aClass16_Sub1_Sub1_2.aFloat15 / (float) this.aClass16_Sub1_Sub1_2.anInt356;
		@Pc(341) float local341 = this.aClass16_Sub1_Sub1_2.aFloat16 / (float) this.aClass16_Sub1_Sub1_2.anInt355;
		for (@Pc(343) int local343 = 0; local343 < 256; local343++) {
			@Pc(348) Class177 local348 = arg2[local343];
			local57 = local348.anInt4884;
			local63 = local348.anInt4887;
			local69 = local348.anInt4885;
			local75 = local348.anInt4886;
			@Pc(367) float local367 = (float) (local343 % 16 * local8);
			@Pc(374) float local374 = (float) (local343 / 16 * local8);
			@Pc(378) float local378 = local367 * local332;
			@Pc(382) float local382 = local374 * local341;
			@Pc(389) float local389 = (local367 + (float) local63) * local332;
			@Pc(396) float local396 = (local374 + (float) local57) * local341;
			this.aClass204_2.method4985(local343);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local378, this.aClass16_Sub1_Sub1_2.aFloat16 - local382);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local378, this.aClass16_Sub1_Sub1_2.aFloat16 - local396);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass16_Sub1_Sub1_2.aFloat16 - local396);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass16_Sub1_Sub1_2.aFloat16 - local382);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass204_2.method4987();
		}
	}

	@OriginalMember(owner = "client!eea", name = "q", descriptor = "(CIIIZ)V")
	@Override
	protected void q(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass90_Sub1_9.method2087();
		this.aClass90_Sub1_9.method2126(this.aClass16_Sub1_Sub1_2);
		if (this.aBoolean138 || arg4) {
			this.aClass90_Sub1_9.method2120(8448, 7681);
			this.aClass90_Sub1_9.method2119(0, 768, 34168);
		} else {
			this.aClass90_Sub1_9.method2120(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass204_2.method4982(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean138 || arg4) {
			this.aClass90_Sub1_9.method2119(0, 768, 5890);
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(CIIIZLclient!fa;II)V")
	@Override
	protected void method7879(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class17 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class17_Sub1 local2 = (Class17_Sub1) arg5;
		@Pc(5) Class16_Sub1_Sub1 local5 = local2.aClass16_Sub1_Sub1_1;
		this.aClass90_Sub1_9.method2087();
		this.aClass90_Sub1_9.method2126(this.aClass16_Sub1_Sub1_2);
		if (this.aBoolean138 || arg4) {
			this.aClass90_Sub1_9.method2120(8448, 7681);
			this.aClass90_Sub1_9.method2119(0, 768, 34168);
		} else {
			this.aClass90_Sub1_9.method2120(7681, 7681);
		}
		this.aClass90_Sub1_9.method2069(1);
		this.aClass90_Sub1_9.method2126(local5);
		this.aClass90_Sub1_9.method2120(8448, 7681);
		this.aClass90_Sub1_9.method2119(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat15 / (float) local5.anInt356;
		@Pc(85) float local85 = local5.aFloat16 / (float) local5.anInt355;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass204_2.method4982(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass90_Sub1_9.method2119(0, 768, 5890);
		this.aClass90_Sub1_9.method2120(8448, 8448);
		this.aClass90_Sub1_9.method2126(null);
		this.aClass90_Sub1_9.method2069(0);
		if (this.aBoolean138 || arg4) {
			this.aClass90_Sub1_9.method2119(0, 768, 5890);
		}
	}
}
