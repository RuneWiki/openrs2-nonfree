import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class68_Sub5 extends Class68 {

	@OriginalMember(owner = "client!th", name = "v", descriptor = "Lclient!qo;")
	private final Class20_Sub3 aClass20_Sub3_37;

	@OriginalMember(owner = "client!th", name = "x", descriptor = "Lclient!eba;")
	private final Class85_Sub1_Sub1 aClass85_Sub1_Sub1_5;

	@OriginalMember(owner = "client!th", name = "y", descriptor = "Z")
	private final boolean aBoolean679;

	@OriginalMember(owner = "client!th", name = "w", descriptor = "Lclient!jv;")
	private final Class170 aClass170_3;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!qo;Lclient!oea;[Lclient!rh;Z)V")
	public Class68_Sub5(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) Class239 arg1, @OriginalArg(2) Class296[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass20_Sub3_37 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class296 local15 = arg2[local10];
			if (local15.anInt9024 > local8) {
				local8 = local15.anInt9024;
			}
			if (local15.anInt9028 > local8) {
				local8 = local15.anInt9028;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class296 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt9024;
			local57 = local51.anInt9028;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray116 == null) {
				local83 = local51.aByteArray117;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray116;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass85_Sub1_Sub1_5 = Static163.method3529(local44, local37, arg0, local37);
		this.aBoolean679 = true;
		this.aClass85_Sub1_Sub1_5.method9102(false);
		this.aClass170_3 = new Class170(arg0, 256);
		@Pc(334) float local334 = this.aClass85_Sub1_Sub1_5.aFloat95 / (float) this.aClass85_Sub1_Sub1_5.anInt3123;
		@Pc(343) float local343 = this.aClass85_Sub1_Sub1_5.aFloat96 / (float) this.aClass85_Sub1_Sub1_5.anInt3122;
		for (@Pc(345) int local345 = 0; local345 < 256; local345++) {
			@Pc(350) Class296 local350 = arg2[local345];
			local57 = local350.anInt9024;
			local63 = local350.anInt9028;
			local69 = local350.anInt9026;
			local75 = local350.anInt9029;
			@Pc(369) float local369 = (float) (local345 % 16 * local8);
			@Pc(376) float local376 = (float) (local345 / 16 * local8);
			@Pc(380) float local380 = local369 * local334;
			@Pc(384) float local384 = local376 * local343;
			@Pc(391) float local391 = (local369 + (float) local63) * local334;
			@Pc(398) float local398 = (local376 + (float) local57) * local343;
			this.aClass170_3.method5087(local345);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local380, this.aClass85_Sub1_Sub1_5.aFloat96 - local384);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local380, this.aClass85_Sub1_Sub1_5.aFloat96 - local398);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass85_Sub1_Sub1_5.aFloat96 - local398);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass85_Sub1_Sub1_5.aFloat96 - local384);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass170_3.method5083();
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method8109(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg5;
		@Pc(5) Class85_Sub1_Sub1 local5 = local2.aClass85_Sub1_Sub1_1;
		this.aClass20_Sub3_37.method7322();
		this.aClass20_Sub3_37.method7358(this.aClass85_Sub1_Sub1_5);
		if (this.aBoolean679 || arg4) {
			this.aClass20_Sub3_37.method7316(7681, 8448);
			this.aClass20_Sub3_37.method7349(34168, 768, 0);
		} else {
			this.aClass20_Sub3_37.method7316(7681, 7681);
		}
		this.aClass20_Sub3_37.method7325(1);
		this.aClass20_Sub3_37.method7358(local5);
		this.aClass20_Sub3_37.method7316(7681, 8448);
		this.aClass20_Sub3_37.method7349(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat95 / (float) local5.anInt3123;
		@Pc(85) float local85 = local5.aFloat96 / (float) local5.anInt3122;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass170_3.method5086(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass20_Sub3_37.method7349(5890, 768, 0);
		this.aClass20_Sub3_37.method7316(8448, 8448);
		this.aClass20_Sub3_37.method7358(null);
		this.aClass20_Sub3_37.method7325(0);
		if (this.aBoolean679 || arg4) {
			this.aClass20_Sub3_37.method7349(5890, 768, 0);
		}
	}

	@OriginalMember(owner = "client!th", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass20_Sub3_37.method7322();
		this.aClass20_Sub3_37.method7358(this.aClass85_Sub1_Sub1_5);
		if (this.aBoolean679 || arg4) {
			this.aClass20_Sub3_37.method7316(7681, 8448);
			this.aClass20_Sub3_37.method7349(34168, 768, 0);
		} else {
			this.aClass20_Sub3_37.method7316(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass170_3.method5086(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean679 || arg4) {
			this.aClass20_Sub3_37.method7349(5890, 768, 0);
		}
	}
}
