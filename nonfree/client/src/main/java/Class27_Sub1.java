import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class27_Sub1 extends Class27 {

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "Lclient!nv;")
	private final Class16_Sub3 aClass16_Sub3_6;

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "Lclient!tea;")
	private final Class20_Sub4_Sub1 aClass20_Sub4_Sub1_3;

	@OriginalMember(owner = "client!bc", name = "A", descriptor = "Z")
	private final boolean aBoolean107;

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "Lclient!qha;")
	private final Class273 aClass273_2;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!nv;Lclient!ur;[Lclient!g;Z)V")
	public Class27_Sub1(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) Class345 arg1, @OriginalArg(2) Class111[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass16_Sub3_6 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class111 local15 = arg2[local10];
			if (local15.anInt4053 > local8) {
				local8 = local15.anInt4053;
			}
			if (local15.anInt4054 > local8) {
				local8 = local15.anInt4054;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class111 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt4053;
			local57 = local51.anInt4054;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray28 == null) {
				local83 = local51.aByteArray27;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray28;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass20_Sub4_Sub1_3 = Static383.method6154(local37, local37, local44, arg0);
		this.aBoolean107 = true;
		this.aClass20_Sub4_Sub1_3.method7620(false);
		this.aClass273_2 = new Class273(arg0, 256);
		@Pc(334) float local334 = this.aClass20_Sub4_Sub1_3.aFloat188 / (float) this.aClass20_Sub4_Sub1_3.anInt9361;
		@Pc(343) float local343 = this.aClass20_Sub4_Sub1_3.aFloat189 / (float) this.aClass20_Sub4_Sub1_3.anInt9362;
		for (@Pc(345) int local345 = 0; local345 < 256; local345++) {
			@Pc(350) Class111 local350 = arg2[local345];
			local57 = local350.anInt4053;
			local63 = local350.anInt4054;
			local69 = local350.anInt4050;
			local75 = local350.anInt4055;
			@Pc(369) float local369 = (float) (local345 % 16 * local8);
			@Pc(376) float local376 = (float) (local345 / 16 * local8);
			@Pc(380) float local380 = local369 * local334;
			@Pc(384) float local384 = local376 * local343;
			@Pc(391) float local391 = (local369 + (float) local63) * local334;
			@Pc(398) float local398 = (local376 + (float) local57) * local343;
			this.aClass273_2.method6909(local345);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local380, this.aClass20_Sub4_Sub1_3.aFloat189 - local384);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local380, this.aClass20_Sub4_Sub1_3.aFloat189 - local398);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass20_Sub4_Sub1_3.aFloat189 - local398);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass20_Sub4_Sub1_3.aFloat189 - local384);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass273_2.method6915();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method6998(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg5;
		@Pc(5) Class20_Sub4_Sub1 local5 = local2.aClass20_Sub4_Sub1_4;
		this.aClass16_Sub3_6.method5946();
		this.aClass16_Sub3_6.method6020(this.aClass20_Sub4_Sub1_3);
		if (this.aBoolean107 || arg4) {
			this.aClass16_Sub3_6.method5957(7681, 8448);
			this.aClass16_Sub3_6.method6025(768, 0, 34168);
		} else {
			this.aClass16_Sub3_6.method5957(7681, 7681);
		}
		this.aClass16_Sub3_6.method5944(1);
		this.aClass16_Sub3_6.method6020(local5);
		this.aClass16_Sub3_6.method5957(7681, 8448);
		this.aClass16_Sub3_6.method6025(768, 0, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat188 / (float) local5.anInt9361;
		@Pc(85) float local85 = local5.aFloat189 / (float) local5.anInt9362;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass273_2.method6916(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass16_Sub3_6.method6025(768, 0, 5890);
		this.aClass16_Sub3_6.method5957(8448, 8448);
		this.aClass16_Sub3_6.method6020(null);
		this.aClass16_Sub3_6.method5944(0);
		if (this.aBoolean107 || arg4) {
			this.aClass16_Sub3_6.method6025(768, 0, 5890);
		}
	}

	@OriginalMember(owner = "client!bc", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass16_Sub3_6.method5946();
		this.aClass16_Sub3_6.method6020(this.aClass20_Sub4_Sub1_3);
		if (this.aBoolean107 || arg4) {
			this.aClass16_Sub3_6.method5957(7681, 8448);
			this.aClass16_Sub3_6.method6025(768, 0, 34168);
		} else {
			this.aClass16_Sub3_6.method5957(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass273_2.method6916(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean107 || arg4) {
			this.aClass16_Sub3_6.method6025(768, 0, 5890);
		}
	}
}
