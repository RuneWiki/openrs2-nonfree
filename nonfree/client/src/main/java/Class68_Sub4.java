import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vfa")
public final class Class68_Sub4 extends Class68 {

	@OriginalMember(owner = "client!vfa", name = "z", descriptor = "Lclient!pi;")
	private final Class144_Sub3 aClass144_Sub3_40;

	@OriginalMember(owner = "client!vfa", name = "y", descriptor = "Lclient!hr;")
	private final Class161_Sub1_Sub1 aClass161_Sub1_Sub1_5;

	@OriginalMember(owner = "client!vfa", name = "B", descriptor = "Z")
	private final boolean aBoolean735;

	@OriginalMember(owner = "client!vfa", name = "A", descriptor = "Lclient!vb;")
	private final Class371 aClass371_5;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lclient!pi;Lclient!tja;[Lclient!oe;Z)V")
	public Class68_Sub4(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) Class350 arg1, @OriginalArg(2) Class266[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass144_Sub3_40 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class266 local15 = arg2[local10];
			if (local15.anInt7305 > local8) {
				local8 = local15.anInt7305;
			}
			if (local15.anInt7303 > local8) {
				local8 = local15.anInt7303;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(46) int local46;
		@Pc(51) Class266 local51;
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
				@Pc(54) int local54 = local51.anInt7305;
				local57 = local51.anInt7303;
				local63 = local46 % 16 * local8;
				local69 = local46 / 16 * local8;
				local75 = local69 * local37 + local63;
				local77 = 0;
				@Pc(83) byte[] local83;
				if (local51.aByteArray80 == null) {
					local83 = local51.aByteArray79;
					for (local85 = 0; local85 < local54; local85++) {
						for (local88 = 0; local88 < local57; local88++) {
							local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
						}
						local75 += local37 - local57;
					}
				} else {
					local83 = local51.aByteArray80;
					for (local85 = 0; local85 < local54; local85++) {
						for (local88 = 0; local88 < local57; local88++) {
							local44[local75++] = local83[local77++];
						}
						local75 += local37 - local57;
					}
				}
			}
			this.aClass161_Sub1_Sub1_5 = Static27.method384(arg0, local44, local37, local37);
			this.aBoolean735 = true;
		} else {
			@Pc(172) int[] local172 = new int[local37 * local37];
			for (local46 = 0; local46 < 256; local46++) {
				local51 = arg2[local46];
				@Pc(182) int[] local182 = local51.anIntArray386;
				@Pc(185) byte[] local185 = local51.aByteArray80;
				@Pc(188) byte[] local188 = local51.aByteArray79;
				local69 = local51.anInt7305;
				local75 = local51.anInt7303;
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
			this.aClass161_Sub1_Sub1_5 = Static158.method2256(local37, local37, arg0, local172, 0, 0);
			this.aBoolean735 = false;
		}
		this.aClass161_Sub1_Sub1_5.method9173(false);
		this.aClass371_5 = new Class371(arg0, 256);
		@Pc(334) float local334 = this.aClass161_Sub1_Sub1_5.aFloat71 / (float) this.aClass161_Sub1_Sub1_5.anInt4556;
		@Pc(343) float local343 = this.aClass161_Sub1_Sub1_5.aFloat72 / (float) this.aClass161_Sub1_Sub1_5.anInt4558;
		for (@Pc(345) int local345 = 0; local345 < 256; local345++) {
			@Pc(350) Class266 local350 = arg2[local345];
			local57 = local350.anInt7305;
			local63 = local350.anInt7303;
			local69 = local350.anInt7308;
			local75 = local350.anInt7304;
			@Pc(369) float local369 = (float) (local345 % 16 * local8);
			@Pc(376) float local376 = (float) (local345 / 16 * local8);
			@Pc(380) float local380 = local369 * local334;
			@Pc(384) float local384 = local376 * local343;
			@Pc(391) float local391 = (local369 + (float) local63) * local334;
			@Pc(398) float local398 = (local376 + (float) local57) * local343;
			this.aClass371_5.method8902(local345);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local380, this.aClass161_Sub1_Sub1_5.aFloat72 - local384);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local380, this.aClass161_Sub1_Sub1_5.aFloat72 - local398);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass161_Sub1_Sub1_5.aFloat72 - local398);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass161_Sub1_Sub1_5.aFloat72 - local384);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass371_5.method8904();
		}
	}

	@OriginalMember(owner = "client!vfa", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass144_Sub3_40.method7000();
		this.aClass144_Sub3_40.method6982(this.aClass161_Sub1_Sub1_5);
		if (this.aBoolean735 || arg4) {
			this.aClass144_Sub3_40.method7025(7681, 8448);
			this.aClass144_Sub3_40.method6979(0, 768, 34168);
		} else {
			this.aClass144_Sub3_40.method7025(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass371_5.method8907(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean735 || arg4) {
			this.aClass144_Sub3_40.method6979(0, 768, 5890);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method9434(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class1_Sub3 local2 = (Class1_Sub3) arg5;
		@Pc(5) Class161_Sub1_Sub1 local5 = local2.aClass161_Sub1_Sub1_1;
		this.aClass144_Sub3_40.method7000();
		this.aClass144_Sub3_40.method6982(this.aClass161_Sub1_Sub1_5);
		if (this.aBoolean735 || arg4) {
			this.aClass144_Sub3_40.method7025(7681, 8448);
			this.aClass144_Sub3_40.method6979(0, 768, 34168);
		} else {
			this.aClass144_Sub3_40.method7025(7681, 7681);
		}
		this.aClass144_Sub3_40.method7028(1);
		this.aClass144_Sub3_40.method6982(local5);
		this.aClass144_Sub3_40.method7025(7681, 8448);
		this.aClass144_Sub3_40.method6979(0, 768, 34168);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat71 / (float) local5.anInt4556;
		@Pc(85) float local85 = local5.aFloat72 / (float) local5.anInt4558;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass371_5.method8907(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass144_Sub3_40.method6979(0, 768, 5890);
		this.aClass144_Sub3_40.method7025(8448, 8448);
		this.aClass144_Sub3_40.method6982((Class161) null);
		this.aClass144_Sub3_40.method7028(0);
		if (this.aBoolean735 || arg4) {
			this.aClass144_Sub3_40.method6979(0, 768, 5890);
		}
	}
}
