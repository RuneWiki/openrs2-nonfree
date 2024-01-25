import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class13_Sub3 extends Class13 {

	@OriginalMember(owner = "client!taa", name = "x", descriptor = "Lclient!jj;")
	private final Class62_Sub3 aClass62_Sub3_37;

	@OriginalMember(owner = "client!taa", name = "w", descriptor = "Lclient!og;")
	private final Class4_Sub2_Sub1 aClass4_Sub2_Sub1_5;

	@OriginalMember(owner = "client!taa", name = "v", descriptor = "Z")
	private final boolean aBoolean569;

	@OriginalMember(owner = "client!taa", name = "y", descriptor = "Lclient!ab;")
	private final Class3 aClass3_6;

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Lclient!jj;Lclient!rl;[Lclient!fba;Z)V")
	public Class13_Sub3(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) Class256 arg1, @OriginalArg(2) Class96[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass62_Sub3_37 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class96 local15 = arg2[local10];
			if (local15.anInt2718 > local8) {
				local8 = local15.anInt2718;
			}
			if (local15.anInt2722 > local8) {
				local8 = local15.anInt2722;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class96 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt2718;
			local57 = local51.anInt2722;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray41 == null) {
				local83 = local51.aByteArray42;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray41;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass4_Sub2_Sub1_5 = Static302.method4982(arg0, local37, local44, local37);
		this.aBoolean569 = true;
		this.aClass4_Sub2_Sub1_5.method5502(false);
		this.aClass3_6 = new Class3(arg0, 256);
		@Pc(332) float local332 = this.aClass4_Sub2_Sub1_5.aFloat278 / (float) this.aClass4_Sub2_Sub1_5.anInt6596;
		@Pc(341) float local341 = this.aClass4_Sub2_Sub1_5.aFloat277 / (float) this.aClass4_Sub2_Sub1_5.anInt6595;
		for (@Pc(343) int local343 = 0; local343 < 256; local343++) {
			@Pc(348) Class96 local348 = arg2[local343];
			local57 = local348.anInt2718;
			local63 = local348.anInt2722;
			local69 = local348.anInt2720;
			local75 = local348.anInt2719;
			@Pc(367) float local367 = (float) (local343 % 16 * local8);
			@Pc(374) float local374 = (float) (local343 / 16 * local8);
			@Pc(378) float local378 = local367 * local332;
			@Pc(382) float local382 = local374 * local341;
			@Pc(389) float local389 = (local367 + (float) local63) * local332;
			@Pc(396) float local396 = (local374 + (float) local57) * local341;
			this.aClass3_6.method205(local343);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local378, this.aClass4_Sub2_Sub1_5.aFloat277 - local382);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local378, this.aClass4_Sub2_Sub1_5.aFloat277 - local396);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass4_Sub2_Sub1_5.aFloat277 - local396);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local389, this.aClass4_Sub2_Sub1_5.aFloat277 - local382);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass3_6.method210();
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(CIIIZLclient!pa;II)V")
	@Override
	protected void method7218(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class87 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class87_Sub1 local2 = (Class87_Sub1) arg5;
		@Pc(5) Class4_Sub2_Sub1 local5 = local2.aClass4_Sub2_Sub1_1;
		this.aClass62_Sub3_37.method3994();
		this.aClass62_Sub3_37.method4007(this.aClass4_Sub2_Sub1_5);
		if (this.aBoolean569 || arg4) {
			this.aClass62_Sub3_37.method4011(8448, 7681);
			this.aClass62_Sub3_37.method3984(34168, 0, 768);
		} else {
			this.aClass62_Sub3_37.method4011(7681, 7681);
		}
		this.aClass62_Sub3_37.method4009(1);
		this.aClass62_Sub3_37.method4007(local5);
		this.aClass62_Sub3_37.method4011(8448, 7681);
		this.aClass62_Sub3_37.method3984(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat278 / (float) local5.anInt6596;
		@Pc(85) float local85 = local5.aFloat277 / (float) local5.anInt6595;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass3_6.method207(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass62_Sub3_37.method3984(5890, 0, 768);
		this.aClass62_Sub3_37.method4011(8448, 8448);
		this.aClass62_Sub3_37.method4007(null);
		this.aClass62_Sub3_37.method4009(0);
		if (this.aBoolean569 || arg4) {
			this.aClass62_Sub3_37.method3984(5890, 0, 768);
		}
	}

	@OriginalMember(owner = "client!taa", name = "HA", descriptor = "(CIIIZ)V")
	@Override
	protected void HA(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass62_Sub3_37.method3994();
		this.aClass62_Sub3_37.method4007(this.aClass4_Sub2_Sub1_5);
		if (this.aBoolean569 || arg4) {
			this.aClass62_Sub3_37.method4011(8448, 7681);
			this.aClass62_Sub3_37.method3984(34168, 0, 768);
		} else {
			this.aClass62_Sub3_37.method4011(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass3_6.method207(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean569 || arg4) {
			this.aClass62_Sub3_37.method3984(5890, 0, 768);
		}
	}
}
