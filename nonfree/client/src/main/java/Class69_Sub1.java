import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iha")
public final class Class69_Sub1 extends Class69 {

	@OriginalMember(owner = "client!iha", name = "z", descriptor = "Lclient!hk;")
	private final Class16_Sub2 aClass16_Sub2_23;

	@OriginalMember(owner = "client!iha", name = "x", descriptor = "Lclient!vq;")
	private final Class39_Sub4_Sub1 aClass39_Sub4_Sub1_4;

	@OriginalMember(owner = "client!iha", name = "w", descriptor = "Z")
	private final boolean aBoolean373;

	@OriginalMember(owner = "client!iha", name = "y", descriptor = "Lclient!cga;")
	private final Class58 aClass58_2;

	@OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(Lclient!hk;Lclient!kc;[Lclient!gs;Z)V")
	public Class69_Sub1(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) Class202 arg1, @OriginalArg(2) Class150[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass16_Sub2_23 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class150 local15 = arg2[local10];
			if (local15.anInt3828 > local8) {
				local8 = local15.anInt3828;
			}
			if (local15.anInt3831 > local8) {
				local8 = local15.anInt3831;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class150 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt3828;
			local57 = local51.anInt3831;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray33 == null) {
				local83 = local51.aByteArray34;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray33;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass39_Sub4_Sub1_4 = Static608.method8045(local37, local37, arg0, local44);
		this.aBoolean373 = true;
		this.aClass39_Sub4_Sub1_4.method8465(false);
		this.aClass58_2 = new Class58(arg0, 256);
		@Pc(334) float local334 = this.aClass39_Sub4_Sub1_4.aFloat195 / (float) this.aClass39_Sub4_Sub1_4.anInt9958;
		@Pc(343) float local343 = this.aClass39_Sub4_Sub1_4.aFloat196 / (float) this.aClass39_Sub4_Sub1_4.anInt9955;
		for (@Pc(345) int local345 = 0; local345 < 256; local345++) {
			@Pc(350) Class150 local350 = arg2[local345];
			local57 = local350.anInt3828;
			local63 = local350.anInt3831;
			local69 = local350.anInt3826;
			local75 = local350.anInt3830;
			@Pc(369) float local369 = (float) (local345 % 16 * local8);
			@Pc(376) float local376 = (float) (local345 / 16 * local8);
			@Pc(380) float local380 = local369 * local334;
			@Pc(384) float local384 = local376 * local343;
			@Pc(391) float local391 = (local369 + (float) local63) * local334;
			@Pc(398) float local398 = (local376 + (float) local57) * local343;
			this.aClass58_2.method1621(local345);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local380, this.aClass39_Sub4_Sub1_4.aFloat196 - local384);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local380, this.aClass39_Sub4_Sub1_4.aFloat196 - local398);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass39_Sub4_Sub1_4.aFloat196 - local398);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass39_Sub4_Sub1_4.aFloat196 - local384);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass58_2.method1620();
		}
	}

	@OriginalMember(owner = "client!iha", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass16_Sub2_23.method3627();
		this.aClass16_Sub2_23.method3620(this.aClass39_Sub4_Sub1_4);
		if (this.aBoolean373 || arg4) {
			this.aClass16_Sub2_23.method3671(7681, 8448);
			this.aClass16_Sub2_23.method3669(34168, 0, 768);
		} else {
			this.aClass16_Sub2_23.method3671(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass58_2.method1625(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean373 || arg4) {
			this.aClass16_Sub2_23.method3669(5890, 0, 768);
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method7459(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class1_Sub2 local2 = (Class1_Sub2) arg5;
		@Pc(5) Class39_Sub4_Sub1 local5 = local2.aClass39_Sub4_Sub1_5;
		this.aClass16_Sub2_23.method3627();
		this.aClass16_Sub2_23.method3620(this.aClass39_Sub4_Sub1_4);
		if (this.aBoolean373 || arg4) {
			this.aClass16_Sub2_23.method3671(7681, 8448);
			this.aClass16_Sub2_23.method3669(34168, 0, 768);
		} else {
			this.aClass16_Sub2_23.method3671(7681, 7681);
		}
		this.aClass16_Sub2_23.method3683(1);
		this.aClass16_Sub2_23.method3620(local5);
		this.aClass16_Sub2_23.method3671(7681, 8448);
		this.aClass16_Sub2_23.method3669(34168, 0, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat195 / (float) local5.anInt9958;
		@Pc(85) float local85 = local5.aFloat196 / (float) local5.anInt9955;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass58_2.method1625(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass16_Sub2_23.method3669(5890, 0, 768);
		this.aClass16_Sub2_23.method3671(8448, 8448);
		this.aClass16_Sub2_23.method3620((Class39) null);
		this.aClass16_Sub2_23.method3683(0);
		if (this.aBoolean373 || arg4) {
			this.aClass16_Sub2_23.method3669(5890, 0, 768);
		}
	}
}
