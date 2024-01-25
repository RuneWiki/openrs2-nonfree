import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class55_Sub2 extends Class55 {

	@OriginalMember(owner = "client!ks", name = "z", descriptor = "Lclient!rs;")
	private final Class133_Sub3 aClass133_Sub3_20;

	@OriginalMember(owner = "client!ks", name = "B", descriptor = "Lclient!sb;")
	private final Class167_Sub3_Sub1 aClass167_Sub3_Sub1_3;

	@OriginalMember(owner = "client!ks", name = "A", descriptor = "Z")
	private final boolean aBoolean382;

	@OriginalMember(owner = "client!ks", name = "y", descriptor = "Lclient!iw;")
	private final Class169 aClass169_3;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lclient!rs;Lclient!pia;[Lclient!gu;Z)V")
	public Class55_Sub2(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) Class272 arg1, @OriginalArg(2) Class131[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass133_Sub3_20 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class131 local15 = arg2[local10];
			if (local15.anInt3345 > local8) {
				local8 = local15.anInt3345;
			}
			if (local15.anInt3344 > local8) {
				local8 = local15.anInt3344;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class131 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt3345;
			local57 = local51.anInt3344;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray30 == null) {
				local83 = local51.aByteArray29;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray30;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass167_Sub3_Sub1_3 = Static636.method8978(local37, arg0, local44, local37);
		this.aBoolean382 = true;
		this.aClass167_Sub3_Sub1_3.method8013(false);
		this.aClass169_3 = new Class169(arg0, 256);
		@Pc(334) float local334 = this.aClass167_Sub3_Sub1_3.aFloat171 / (float) this.aClass167_Sub3_Sub1_3.anInt8741;
		@Pc(343) float local343 = this.aClass167_Sub3_Sub1_3.aFloat170 / (float) this.aClass167_Sub3_Sub1_3.anInt8742;
		for (@Pc(345) int local345 = 0; local345 < 256; local345++) {
			@Pc(350) Class131 local350 = arg2[local345];
			local57 = local350.anInt3345;
			local63 = local350.anInt3344;
			local69 = local350.anInt3343;
			local75 = local350.anInt3341;
			@Pc(369) float local369 = (float) (local345 % 16 * local8);
			@Pc(376) float local376 = (float) (local345 / 16 * local8);
			@Pc(380) float local380 = local369 * local334;
			@Pc(384) float local384 = local376 * local343;
			@Pc(391) float local391 = (local369 + (float) local63) * local334;
			@Pc(398) float local398 = (local376 + (float) local57) * local343;
			this.aClass169_3.method4029(local345);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local380, this.aClass167_Sub3_Sub1_3.aFloat170 - local384);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local380, this.aClass167_Sub3_Sub1_3.aFloat170 - local398);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass167_Sub3_Sub1_3.aFloat170 - local398);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass167_Sub3_Sub1_3.aFloat170 - local384);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass169_3.method4027();
		}
	}

	@OriginalMember(owner = "client!ks", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass133_Sub3_20.method7392();
		this.aClass133_Sub3_20.method7375(this.aClass167_Sub3_Sub1_3);
		if (this.aBoolean382 || arg4) {
			this.aClass133_Sub3_20.method7342(8448, 7681);
			this.aClass133_Sub3_20.method7326(0, 34168, 768);
		} else {
			this.aClass133_Sub3_20.method7342(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass169_3.method4025(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean382 || arg4) {
			this.aClass133_Sub3_20.method7326(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method6007(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class1_Sub2 local2 = (Class1_Sub2) arg5;
		@Pc(5) Class167_Sub3_Sub1 local5 = local2.aClass167_Sub3_Sub1_4;
		this.aClass133_Sub3_20.method7392();
		this.aClass133_Sub3_20.method7375(this.aClass167_Sub3_Sub1_3);
		if (this.aBoolean382 || arg4) {
			this.aClass133_Sub3_20.method7342(8448, 7681);
			this.aClass133_Sub3_20.method7326(0, 34168, 768);
		} else {
			this.aClass133_Sub3_20.method7342(7681, 7681);
		}
		this.aClass133_Sub3_20.method7368(1);
		this.aClass133_Sub3_20.method7375(local5);
		this.aClass133_Sub3_20.method7342(8448, 7681);
		this.aClass133_Sub3_20.method7326(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat171 / (float) local5.anInt8741;
		@Pc(85) float local85 = local5.aFloat170 / (float) local5.anInt8742;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass169_3.method4025(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass133_Sub3_20.method7326(0, 5890, 768);
		this.aClass133_Sub3_20.method7342(8448, 8448);
		this.aClass133_Sub3_20.method7375(null);
		this.aClass133_Sub3_20.method7368(0);
		if (this.aBoolean382 || arg4) {
			this.aClass133_Sub3_20.method7326(0, 5890, 768);
		}
	}
}
