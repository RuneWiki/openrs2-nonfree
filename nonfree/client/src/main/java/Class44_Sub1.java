import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cba")
public final class Class44_Sub1 extends Class44 {

	@OriginalMember(owner = "client!cba", name = "u", descriptor = "Lclient!gia;")
	private final Class67_Sub2 aClass67_Sub2_4;

	@OriginalMember(owner = "client!cba", name = "w", descriptor = "Lclient!to;")
	private final Class245_Sub2_Sub1 aClass245_Sub2_Sub1_1;

	@OriginalMember(owner = "client!cba", name = "x", descriptor = "Z")
	private final boolean aBoolean88;

	@OriginalMember(owner = "client!cba", name = "v", descriptor = "Lclient!nda;")
	private final Class251 aClass251_1;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lclient!gia;Lclient!saa;[Lclient!jr;Z)V")
	public Class44_Sub1(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(2) Class194[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass67_Sub2_4 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class194 local15 = arg2[local10];
			if (local15.anInt5595 > local8) {
				local8 = local15.anInt5595;
			}
			if (local15.anInt5596 > local8) {
				local8 = local15.anInt5596;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(46) int local46;
		@Pc(51) Class194 local51;
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
				@Pc(54) int local54 = local51.anInt5595;
				local57 = local51.anInt5596;
				local63 = local46 % 16 * local8;
				local69 = local46 / 16 * local8;
				local75 = local69 * local37 + local63;
				local77 = 0;
				@Pc(83) byte[] local83;
				if (local51.aByteArray45 == null) {
					local83 = local51.aByteArray46;
					for (local85 = 0; local85 < local54; local85++) {
						for (local88 = 0; local88 < local57; local88++) {
							local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
						}
						local75 += local37 - local57;
					}
				} else {
					local83 = local51.aByteArray45;
					for (local85 = 0; local85 < local54; local85++) {
						for (local88 = 0; local88 < local57; local88++) {
							local44[local75++] = local83[local77++];
						}
						local75 += local37 - local57;
					}
				}
			}
			this.aClass245_Sub2_Sub1_1 = Static305.method4657(arg0, local37, local37, local44);
			this.aBoolean88 = true;
		} else {
			@Pc(172) int[] local172 = new int[local37 * local37];
			for (local46 = 0; local46 < 256; local46++) {
				local51 = arg2[local46];
				@Pc(182) int[] local182 = local51.anIntArray319;
				@Pc(185) byte[] local185 = local51.aByteArray45;
				@Pc(188) byte[] local188 = local51.aByteArray46;
				local69 = local51.anInt5595;
				local75 = local51.anInt5596;
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
			this.aClass245_Sub2_Sub1_1 = Static261.method4069(0, local172, local37, local37, arg0, 0);
			this.aBoolean88 = false;
		}
		this.aClass245_Sub2_Sub1_1.method8672(false);
		this.aClass251_1 = new Class251(arg0, 256);
		@Pc(334) float local334 = this.aClass245_Sub2_Sub1_1.aFloat189 / (float) this.aClass245_Sub2_Sub1_1.anInt10095;
		@Pc(343) float local343 = this.aClass245_Sub2_Sub1_1.aFloat190 / (float) this.aClass245_Sub2_Sub1_1.anInt10098;
		for (@Pc(345) int local345 = 0; local345 < 256; local345++) {
			@Pc(350) Class194 local350 = arg2[local345];
			local57 = local350.anInt5595;
			local63 = local350.anInt5596;
			local69 = local350.anInt5597;
			local75 = local350.anInt5594;
			@Pc(369) float local369 = (float) (local345 % 16 * local8);
			@Pc(376) float local376 = (float) (local345 / 16 * local8);
			@Pc(380) float local380 = local369 * local334;
			@Pc(384) float local384 = local376 * local343;
			@Pc(391) float local391 = (local369 + (float) local63) * local334;
			@Pc(398) float local398 = (local376 + (float) local57) * local343;
			this.aClass251_1.method6187(local345);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local380, this.aClass245_Sub2_Sub1_1.aFloat190 - local384);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local380, this.aClass245_Sub2_Sub1_1.aFloat190 - local398);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass245_Sub2_Sub1_1.aFloat190 - local398);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass245_Sub2_Sub1_1.aFloat190 - local384);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass251_1.method6183();
		}
	}

	@OriginalMember(owner = "client!cba", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass67_Sub2_4.method3285();
		this.aClass67_Sub2_4.method3234(this.aClass245_Sub2_Sub1_1);
		if (this.aBoolean88 || arg4) {
			this.aClass67_Sub2_4.method3271(8448, 7681);
			this.aClass67_Sub2_4.method3279(34168, 768, 0);
		} else {
			this.aClass67_Sub2_4.method3271(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass251_1.method6186(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean88 || arg4) {
			this.aClass67_Sub2_4.method3279(5890, 768, 0);
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method8130(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class1_Sub3 local2 = (Class1_Sub3) arg5;
		@Pc(5) Class245_Sub2_Sub1 local5 = local2.aClass245_Sub2_Sub1_3;
		this.aClass67_Sub2_4.method3285();
		this.aClass67_Sub2_4.method3234(this.aClass245_Sub2_Sub1_1);
		if (this.aBoolean88 || arg4) {
			this.aClass67_Sub2_4.method3271(8448, 7681);
			this.aClass67_Sub2_4.method3279(34168, 768, 0);
		} else {
			this.aClass67_Sub2_4.method3271(7681, 7681);
		}
		this.aClass67_Sub2_4.method3268(1);
		this.aClass67_Sub2_4.method3234(local5);
		this.aClass67_Sub2_4.method3271(8448, 7681);
		this.aClass67_Sub2_4.method3279(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat189 / (float) local5.anInt10095;
		@Pc(85) float local85 = local5.aFloat190 / (float) local5.anInt10098;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass251_1.method6186(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass67_Sub2_4.method3279(5890, 768, 0);
		this.aClass67_Sub2_4.method3271(8448, 8448);
		this.aClass67_Sub2_4.method3234((Class245) null);
		this.aClass67_Sub2_4.method3268(0);
		if (this.aBoolean88 || arg4) {
			this.aClass67_Sub2_4.method3279(5890, 768, 0);
		}
	}
}
