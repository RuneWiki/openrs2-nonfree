import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class68_Sub2 extends Class68 {

	@OriginalMember(owner = "client!lh", name = "x", descriptor = "Lclient!uja;")
	private final Class145_Sub3 aClass145_Sub3_29;

	@OriginalMember(owner = "client!lh", name = "y", descriptor = "Lclient!ke;")
	private final Class64_Sub4_Sub1 aClass64_Sub4_Sub1_2;

	@OriginalMember(owner = "client!lh", name = "z", descriptor = "Z")
	private final boolean aBoolean491;

	@OriginalMember(owner = "client!lh", name = "A", descriptor = "Lclient!pha;")
	private final Class290 aClass290_4;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!uja;Lclient!pga;[Lclient!tia;Z)V")
	public Class68_Sub2(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) Class289 arg1, @OriginalArg(2) Class355[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass145_Sub3_29 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class355 local15 = arg2[local10];
			if (local15.anInt9470 > local8) {
				local8 = local15.anInt9470;
			}
			if (local15.anInt9469 > local8) {
				local8 = local15.anInt9469;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(46) int local46;
		@Pc(51) Class355 local51;
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		@Pc(77) int local77;
		@Pc(85) int local85;
		@Pc(88) int local88;
		if (arg3) {
			@Pc(44) byte[] local44 = new byte[local37 * local37];
			for (local46 = 0; local46 < 256; local46++) {
				local51 = arg2[local46];
				@Pc(54) int local54 = local51.anInt9470;
				local57 = local51.anInt9469;
				local63 = local46 % 16 * local8;
				local69 = local46 / 16 * local8;
				local75 = local69 * local37 + local63;
				local77 = 0;
				@Pc(83) byte[] local83;
				if (local51.aByteArray106 == null) {
					local83 = local51.aByteArray107;
					for (local85 = 0; local85 < local54; local85++) {
						for (local88 = 0; local88 < local57; local88++) {
							local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
						}
						local75 += local37 - local57;
					}
				} else {
					local83 = local51.aByteArray106;
					for (local85 = 0; local85 < local54; local85++) {
						for (local88 = 0; local88 < local57; local88++) {
							local44[local75++] = local83[local77++];
						}
						local75 += local37 - local57;
					}
				}
			}
			this.aClass64_Sub4_Sub1_2 = Static431.method6279(local37, local44, local37, arg0);
			this.aBoolean491 = true;
		} else {
			@Pc(172) int[] local172 = new int[local37 * local37];
			for (local46 = 0; local46 < 256; local46++) {
				local51 = arg2[local46];
				@Pc(182) int[] local182 = local51.anIntArray689;
				@Pc(185) byte[] local185 = local51.aByteArray106;
				@Pc(188) byte[] local188 = local51.aByteArray107;
				local69 = local51.anInt9470;
				local75 = local51.anInt9469;
				local77 = local46 % 16 * local8;
				@Pc(206) int local206 = local46 / 16 * local8;
				local85 = local206 * local37 + local77;
				local88 = 0;
				@Pc(218) int local218;
				@Pc(221) int local221;
				if (local185 == null) {
					for (local218 = 0; local218 < local69; local218++) {
						for (local221 = 0; local221 < local75; local221++) {
							@Pc(267) byte local267;
							if ((local267 = local188[local88++]) == 0) {
								local85++;
							} else {
								local172[local85++] = local182[local267 & 0xFF] | 0xFF000000;
							}
						}
						local85 += local37 - local75;
					}
				} else {
					for (local218 = 0; local218 < local69; local218++) {
						for (local221 = 0; local221 < local75; local221++) {
							local172[local85++] = local185[local88] << 24 | local182[local188[local88] & 0xFF];
							local88++;
						}
						local85 += local37 - local75;
					}
				}
			}
			this.aClass64_Sub4_Sub1_2 = Static101.method7885(arg0, 0, local37, local37, 0, local172);
			this.aBoolean491 = false;
		}
		this.aClass64_Sub4_Sub1_2.method4540(false);
		this.aClass290_4 = new Class290(arg0, 256);
		@Pc(334) float local334 = this.aClass64_Sub4_Sub1_2.aFloat67 / (float) this.aClass64_Sub4_Sub1_2.anInt5009;
		@Pc(343) float local343 = this.aClass64_Sub4_Sub1_2.aFloat68 / (float) this.aClass64_Sub4_Sub1_2.anInt5010;
		for (@Pc(345) int local345 = 0; local345 < 256; local345++) {
			@Pc(350) Class355 local350 = arg2[local345];
			local57 = local350.anInt9470;
			local63 = local350.anInt9469;
			local69 = local350.anInt9472;
			local75 = local350.anInt9468;
			@Pc(369) float local369 = (float) (local345 % 16 * local8);
			@Pc(376) float local376 = (float) (local345 / 16 * local8);
			@Pc(380) float local380 = local369 * local334;
			@Pc(384) float local384 = local376 * local343;
			@Pc(391) float local391 = (local369 + (float) local63) * local334;
			@Pc(398) float local398 = (local376 + (float) local57) * local343;
			this.aClass290_4.method6989(local345);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local380, this.aClass64_Sub4_Sub1_2.aFloat68 - local384);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local380, this.aClass64_Sub4_Sub1_2.aFloat68 - local398);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass64_Sub4_Sub1_2.aFloat68 - local398);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass64_Sub4_Sub1_2.aFloat68 - local384);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass290_4.method6988();
		}
	}

	@OriginalMember(owner = "client!lh", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass145_Sub3_29.method8846();
		this.aClass145_Sub3_29.method8872(this.aClass64_Sub4_Sub1_2);
		if (this.aBoolean491 || arg4) {
			this.aClass145_Sub3_29.method8897(8448, 7681);
			this.aClass145_Sub3_29.method8854(0, 34168, 768);
		} else {
			this.aClass145_Sub3_29.method8897(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass290_4.method6987(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean491 || arg4) {
			this.aClass145_Sub3_29.method8854(0, 5890, 768);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method7894(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg5;
		@Pc(5) Class64_Sub4_Sub1 local5 = local2.aClass64_Sub4_Sub1_1;
		this.aClass145_Sub3_29.method8846();
		this.aClass145_Sub3_29.method8872(this.aClass64_Sub4_Sub1_2);
		if (this.aBoolean491 || arg4) {
			this.aClass145_Sub3_29.method8897(8448, 7681);
			this.aClass145_Sub3_29.method8854(0, 34168, 768);
		} else {
			this.aClass145_Sub3_29.method8897(7681, 7681);
		}
		this.aClass145_Sub3_29.method8859(1);
		this.aClass145_Sub3_29.method8872(local5);
		this.aClass145_Sub3_29.method8897(8448, 7681);
		this.aClass145_Sub3_29.method8854(0, 34168, 768);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat67 / (float) local5.anInt5009;
		@Pc(85) float local85 = local5.aFloat68 / (float) local5.anInt5010;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass290_4.method6987(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass145_Sub3_29.method8854(0, 5890, 768);
		this.aClass145_Sub3_29.method8897(8448, 8448);
		this.aClass145_Sub3_29.method8872((Class64) null);
		this.aClass145_Sub3_29.method8859(0);
		if (this.aBoolean491 || arg4) {
			this.aClass145_Sub3_29.method8854(0, 5890, 768);
		}
	}
}
