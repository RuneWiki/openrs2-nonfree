import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class111_Sub5 extends Class111 {

	@OriginalMember(owner = "client!pt", name = "F", descriptor = "Lclient!ji;")
	private final Class15_Sub3 aClass15_Sub3_26;

	@OriginalMember(owner = "client!pt", name = "E", descriptor = "Lclient!ch;")
	private final Class11_Sub2_Sub1 aClass11_Sub2_Sub1_3;

	@OriginalMember(owner = "client!pt", name = "G", descriptor = "Z")
	private final boolean aBoolean667;

	@OriginalMember(owner = "client!pt", name = "C", descriptor = "Lclient!uj;")
	private final Class328 aClass328_2;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!ji;Lclient!sga;[Lclient!aw;Z)V")
	public Class111_Sub5(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) Class297 arg1, @OriginalArg(2) Class20[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass15_Sub3_26 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class20 local15 = arg2[local10];
			if (local15.anInt706 > local8) {
				local8 = local15.anInt706;
			}
			if (local15.anInt707 > local8) {
				local8 = local15.anInt707;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class20 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt706;
			local57 = local51.anInt707;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray6 == null) {
				local83 = local51.aByteArray5;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray6;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass11_Sub2_Sub1_3 = Static273.method4777(arg0, local44, local37, local37);
		this.aBoolean667 = true;
		this.aClass11_Sub2_Sub1_3.method7412(false);
		this.aClass328_2 = new Class328(arg0, 256);
		@Pc(332) float local332 = this.aClass11_Sub2_Sub1_3.aFloat19 / (float) this.aClass11_Sub2_Sub1_3.anInt1697;
		@Pc(341) float local341 = this.aClass11_Sub2_Sub1_3.aFloat18 / (float) this.aClass11_Sub2_Sub1_3.anInt1695;
		for (@Pc(343) int local343 = 0; local343 < 256; local343++) {
			@Pc(348) Class20 local348 = arg2[local343];
			local57 = local348.anInt706;
			local63 = local348.anInt707;
			local69 = local348.anInt708;
			local75 = local348.anInt705;
			@Pc(367) float local367 = (float) (local343 % 16 * local8);
			@Pc(374) float local374 = (float) (local343 / 16 * local8);
			@Pc(378) float local378 = local367 * local332;
			@Pc(382) float local382 = local374 * local341;
			@Pc(389) float local389 = (local367 + (float) local63) * local332;
			@Pc(396) float local396 = (local374 + (float) local57) * local341;
			this.aClass328_2.method7870(local343);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local378, this.aClass11_Sub2_Sub1_3.aFloat18 - local382);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local378, this.aClass11_Sub2_Sub1_3.aFloat18 - local396);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass11_Sub2_Sub1_3.aFloat18 - local396);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass11_Sub2_Sub1_3.aFloat18 - local382);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass328_2.method7868();
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(CIIIZLclient!fa;II)V")
	@Override
	protected void method6671(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class93 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class93_Sub1 local2 = (Class93_Sub1) arg5;
		@Pc(5) Class11_Sub2_Sub1 local5 = local2.aClass11_Sub2_Sub1_2;
		this.aClass15_Sub3_26.method4435();
		this.aClass15_Sub3_26.method4377(this.aClass11_Sub2_Sub1_3);
		if (this.aBoolean667 || arg4) {
			this.aClass15_Sub3_26.method4451(8448, 7681);
			this.aClass15_Sub3_26.method4442(768, 34168, 0);
		} else {
			this.aClass15_Sub3_26.method4451(7681, 7681);
		}
		this.aClass15_Sub3_26.method4458(1);
		this.aClass15_Sub3_26.method4377(local5);
		this.aClass15_Sub3_26.method4451(8448, 7681);
		this.aClass15_Sub3_26.method4442(768, 34168, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat19 / (float) local5.anInt1697;
		@Pc(85) float local85 = local5.aFloat18 / (float) local5.anInt1695;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass328_2.method7872(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass15_Sub3_26.method4442(768, 5890, 0);
		this.aClass15_Sub3_26.method4451(8448, 8448);
		this.aClass15_Sub3_26.method4377(null);
		this.aClass15_Sub3_26.method4458(0);
		if (this.aBoolean667 || arg4) {
			this.aClass15_Sub3_26.method4442(768, 5890, 0);
		}
	}

	@OriginalMember(owner = "client!pt", name = "q", descriptor = "(CIIIZ)V")
	@Override
	protected void q(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass15_Sub3_26.method4435();
		this.aClass15_Sub3_26.method4377(this.aClass11_Sub2_Sub1_3);
		if (this.aBoolean667 || arg4) {
			this.aClass15_Sub3_26.method4451(8448, 7681);
			this.aClass15_Sub3_26.method4442(768, 34168, 0);
		} else {
			this.aClass15_Sub3_26.method4451(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass328_2.method7872(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean667 || arg4) {
			this.aClass15_Sub3_26.method4442(768, 5890, 0);
		}
	}
}
