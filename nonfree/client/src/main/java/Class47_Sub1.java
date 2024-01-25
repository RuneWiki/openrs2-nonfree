import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class47_Sub1 extends Class47 {

	@OriginalMember(owner = "client!d", name = "x", descriptor = "Lclient!os;")
	private final Class39_Sub3 aClass39_Sub3_6;

	@OriginalMember(owner = "client!d", name = "z", descriptor = "Lclient!gg;")
	private final Class19_Sub2_Sub1 aClass19_Sub2_Sub1_1;

	@OriginalMember(owner = "client!d", name = "y", descriptor = "Z")
	private final boolean aBoolean115;

	@OriginalMember(owner = "client!d", name = "A", descriptor = "Lclient!ni;")
	private final Class201 aClass201_1;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!os;Lclient!dd;[Lclient!qr;Z)V")
	public Class47_Sub1(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(2) Class241[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass39_Sub3_6 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class241 local15 = arg2[local10];
			if (local15.anInt7604 > local8) {
				local8 = local15.anInt7604;
			}
			if (local15.anInt7606 > local8) {
				local8 = local15.anInt7606;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class241 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt7604;
			local57 = local51.anInt7606;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray101 == null) {
				local83 = local51.aByteArray102;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray101;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass19_Sub2_Sub1_1 = Static538.method7756(local44, local37, arg0, local37);
		this.aBoolean115 = true;
		this.aClass19_Sub2_Sub1_1.method4799(false);
		this.aClass201_1 = new Class201(arg0, 256);
		@Pc(332) float local332 = this.aClass19_Sub2_Sub1_1.aFloat54 / (float) this.aClass19_Sub2_Sub1_1.anInt2885;
		@Pc(341) float local341 = this.aClass19_Sub2_Sub1_1.aFloat53 / (float) this.aClass19_Sub2_Sub1_1.anInt2889;
		for (@Pc(343) int local343 = 0; local343 < 256; local343++) {
			@Pc(348) Class241 local348 = arg2[local343];
			local57 = local348.anInt7604;
			local63 = local348.anInt7606;
			local69 = local348.anInt7605;
			local75 = local348.anInt7603;
			@Pc(367) float local367 = (float) (local343 % 16 * local8);
			@Pc(374) float local374 = (float) (local343 / 16 * local8);
			@Pc(378) float local378 = local367 * local332;
			@Pc(382) float local382 = local374 * local341;
			@Pc(389) float local389 = (local367 + (float) local63) * local332;
			@Pc(396) float local396 = (local374 + (float) local57) * local341;
			this.aClass201_1.method5135(local343);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local378, this.aClass19_Sub2_Sub1_1.aFloat53 - local382);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local378, this.aClass19_Sub2_Sub1_1.aFloat53 - local396);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass19_Sub2_Sub1_1.aFloat53 - local396);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass19_Sub2_Sub1_1.aFloat53 - local382);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass201_1.method5136();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(CIIIZLclient!pa;II)V")
	@Override
	protected void method7615(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class209 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class209_Sub1 local2 = (Class209_Sub1) arg5;
		@Pc(5) Class19_Sub2_Sub1 local5 = local2.aClass19_Sub2_Sub1_4;
		this.aClass39_Sub3_6.method5728();
		this.aClass39_Sub3_6.method5719(this.aClass19_Sub2_Sub1_1);
		if (this.aBoolean115 || arg4) {
			this.aClass39_Sub3_6.method5760(7681, 8448);
			this.aClass39_Sub3_6.method5709(34168, 0, 768);
		} else {
			this.aClass39_Sub3_6.method5760(7681, 7681);
		}
		this.aClass39_Sub3_6.method5750(1);
		this.aClass39_Sub3_6.method5719(local5);
		this.aClass39_Sub3_6.method5760(7681, 8448);
		this.aClass39_Sub3_6.method5709(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat54 / (float) local5.anInt2885;
		@Pc(85) float local85 = local5.aFloat53 / (float) local5.anInt2889;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass201_1.method5132(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass39_Sub3_6.method5709(5890, 0, 768);
		this.aClass39_Sub3_6.method5760(8448, 8448);
		this.aClass39_Sub3_6.method5719(null);
		this.aClass39_Sub3_6.method5750(0);
		if (this.aBoolean115 || arg4) {
			this.aClass39_Sub3_6.method5709(5890, 0, 768);
		}
	}

	@OriginalMember(owner = "client!d", name = "HA", descriptor = "(CIIIZ)V")
	@Override
	protected void HA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass39_Sub3_6.method5728();
		this.aClass39_Sub3_6.method5719(this.aClass19_Sub2_Sub1_1);
		if (this.aBoolean115 || arg4) {
			this.aClass39_Sub3_6.method5760(7681, 8448);
			this.aClass39_Sub3_6.method5709(34168, 0, 768);
		} else {
			this.aClass39_Sub3_6.method5760(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass201_1.method5132(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean115 || arg4) {
			this.aClass39_Sub3_6.method5709(5890, 0, 768);
		}
	}
}
