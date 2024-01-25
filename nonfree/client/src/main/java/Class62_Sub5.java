import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class62_Sub5 extends Class62 {

	@OriginalMember(owner = "client!vf", name = "x", descriptor = "Lclient!kw;")
	private final Class5_Sub2 aClass5_Sub2_41;

	@OriginalMember(owner = "client!vf", name = "v", descriptor = "Lclient!of;")
	private final Class76_Sub3_Sub1 aClass76_Sub3_Sub1_5;

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "Z")
	private final boolean aBoolean705;

	@OriginalMember(owner = "client!vf", name = "u", descriptor = "Lclient!tw;")
	private final Class329 aClass329_5;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!kw;Lclient!qt;[Lclient!ffa;Z)V")
	public Class62_Sub5(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) Class282 arg1, @OriginalArg(2) Class107[] arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1);
		this.aClass5_Sub2_41 = arg0;
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(15) Class107 local15 = arg2[local10];
			if (local15.anInt3008 > local8) {
				local8 = local15.anInt3008;
			}
			if (local15.anInt3006 > local8) {
				local8 = local15.anInt3006;
			}
		}
		@Pc(37) int local37 = local8 * 16;
		@Pc(44) byte[] local44 = new byte[local37 * local37];
		@Pc(57) int local57;
		@Pc(63) int local63;
		@Pc(69) int local69;
		@Pc(75) int local75;
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			@Pc(51) Class107 local51 = arg2[local46];
			@Pc(54) int local54 = local51.anInt3008;
			local57 = local51.anInt3006;
			local63 = local46 % 16 * local8;
			local69 = local46 / 16 * local8;
			local75 = local69 * local37 + local63;
			@Pc(77) int local77 = 0;
			@Pc(83) byte[] local83;
			@Pc(85) int local85;
			@Pc(88) int local88;
			if (local51.aByteArray29 == null) {
				local83 = local51.aByteArray28;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = (byte) (local83[local77++] == 0 ? 0 : -1);
					}
					local75 += local37 - local57;
				}
			} else {
				local83 = local51.aByteArray29;
				for (local85 = 0; local85 < local54; local85++) {
					for (local88 = 0; local88 < local57; local88++) {
						local44[local75++] = local83[local77++];
					}
					local75 += local37 - local57;
				}
			}
		}
		this.aClass76_Sub3_Sub1_5 = Static485.method7223(arg0, local37, local44, local37);
		this.aBoolean705 = true;
		this.aClass76_Sub3_Sub1_5.method7930(false);
		this.aClass329_5 = new Class329(arg0, 256);
		@Pc(334) float local334 = this.aClass76_Sub3_Sub1_5.aFloat162 / (float) this.aClass76_Sub3_Sub1_5.anInt7375;
		@Pc(343) float local343 = this.aClass76_Sub3_Sub1_5.aFloat163 / (float) this.aClass76_Sub3_Sub1_5.anInt7373;
		for (@Pc(345) int local345 = 0; local345 < 256; local345++) {
			@Pc(350) Class107 local350 = arg2[local345];
			local57 = local350.anInt3008;
			local63 = local350.anInt3006;
			local69 = local350.anInt3003;
			local75 = local350.anInt3005;
			@Pc(369) float local369 = (float) (local345 % 16 * local8);
			@Pc(376) float local376 = (float) (local345 / 16 * local8);
			@Pc(380) float local380 = local369 * local334;
			@Pc(384) float local384 = local376 * local343;
			@Pc(391) float local391 = (local369 + (float) local63) * local334;
			@Pc(398) float local398 = (local376 + (float) local57) * local343;
			this.aClass329_5.method8097(local345);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(local380, this.aClass76_Sub3_Sub1_5.aFloat163 - local384);
			OpenGL.glVertex2i(local75, local69);
			OpenGL.glTexCoord2f(local380, this.aClass76_Sub3_Sub1_5.aFloat163 - local398);
			OpenGL.glVertex2i(local75, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass76_Sub3_Sub1_5.aFloat163 - local398);
			OpenGL.glVertex2i(local75 + local63, local69 + local57);
			OpenGL.glTexCoord2f(local391, this.aClass76_Sub3_Sub1_5.aFloat163 - local384);
			OpenGL.glVertex2i(local75 + local63, local69);
			OpenGL.glEnd();
			this.aClass329_5.method8094();
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(CIIIZLclient!aa;II)V")
	@Override
	protected void method8371(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(2) Class1_Sub2 local2 = (Class1_Sub2) arg5;
		@Pc(5) Class76_Sub3_Sub1 local5 = local2.aClass76_Sub3_Sub1_4;
		this.aClass5_Sub2_41.method5029();
		this.aClass5_Sub2_41.method4997(this.aClass76_Sub3_Sub1_5);
		if (this.aBoolean705 || arg4) {
			this.aClass5_Sub2_41.method4982(8448, 7681);
			this.aClass5_Sub2_41.method5000(34168, 768, 0);
		} else {
			this.aClass5_Sub2_41.method4982(7681, 7681);
		}
		this.aClass5_Sub2_41.method5004(1);
		this.aClass5_Sub2_41.method4997(local5);
		this.aClass5_Sub2_41.method4982(8448, 7681);
		this.aClass5_Sub2_41.method5000(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		@Pc(78) float local78 = local5.aFloat162 / (float) local5.anInt7375;
		@Pc(85) float local85 = local5.aFloat163 / (float) local5.anInt7373;
		OpenGL.glTexGenfv(8192, 9474, new float[] { local78, 0.0F, 0.0F, (float) -arg6 * local78 }, 0);
		OpenGL.glTexGenfv(8193, 9474, new float[] { 0.0F, local85, 0.0F, (float) -arg7 * local85 }, 0);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass329_5.method8098(arg0);
		OpenGL.glLoadIdentity();
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		this.aClass5_Sub2_41.method5000(5890, 768, 0);
		this.aClass5_Sub2_41.method4982(8448, 8448);
		this.aClass5_Sub2_41.method4997(null);
		this.aClass5_Sub2_41.method5004(0);
		if (this.aBoolean705 || arg4) {
			this.aClass5_Sub2_41.method5000(5890, 768, 0);
		}
	}

	@OriginalMember(owner = "client!vf", name = "fa", descriptor = "(CIIIZ)V")
	@Override
	protected void fa(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass5_Sub2_41.method5029();
		this.aClass5_Sub2_41.method4997(this.aClass76_Sub3_Sub1_5);
		if (this.aBoolean705 || arg4) {
			this.aClass5_Sub2_41.method4982(8448, 7681);
			this.aClass5_Sub2_41.method5000(34168, 768, 0);
		} else {
			this.aClass5_Sub2_41.method4982(7681, 7681);
		}
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		OpenGL.glTranslatef((float) arg1, (float) arg2, 0.0F);
		this.aClass329_5.method8098(arg0);
		OpenGL.glLoadIdentity();
		if (this.aBoolean705 || arg4) {
			this.aClass5_Sub2_41.method5000(5890, 768, 0);
		}
	}
}
