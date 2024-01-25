import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class40_Sub2_Sub1 extends Class40_Sub2 {

	@OriginalMember(owner = "client!cga", name = "s", descriptor = "Lclient!nv;")
	private final Class16_Sub3 aClass16_Sub3_9;

	@OriginalMember(owner = "client!cga", name = "v", descriptor = "Lclient!tc;")
	private final Class20_Sub3 aClass20_Sub3_1;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lclient!nv;I)V")
	public Class40_Sub2_Sub1(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass16_Sub3_9 = arg0;
		this.aClass20_Sub3_1 = new Class20_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!cga", name = "f", descriptor = "(I)I")
	public int method1753() {
		return this.aClass20_Sub3_1.anInt9208;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILclient!tc;FLclient!tc;)Z")
	public boolean method1754(@OriginalArg(1) Class20_Sub3 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class20_Sub3 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class89 local11 = this.aClass16_Sub3_9.aClass89_7;
		this.aClass16_Sub3_9.K(Static468.anIntArray622);
		this.aClass16_Sub3_9.la();
		this.aClass16_Sub3_9.method6010();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass20_Sub3_1.anInt9208, this.aClass20_Sub3_1.anInt9208);
		this.aClass16_Sub3_9.method5996(false);
		this.aClass16_Sub3_9.method6024(false);
		this.aClass16_Sub3_9.method5950(false);
		this.aClass16_Sub3_9.method5955(false);
		this.aClass16_Sub3_9.method6023(-2);
		this.aClass16_Sub3_9.method5944(1);
		this.aClass16_Sub3_9.method5974(0.0F, 0.0F, 0.0F, arg1);
		this.aClass16_Sub3_9.method5957(34165, 34165);
		this.aClass16_Sub3_9.method6020(arg0);
		this.aClass16_Sub3_9.method5944(0);
		this.aClass16_Sub3_9.method5972(1);
		this.aClass16_Sub3_9.method6020(arg2);
		this.aClass16_Sub3_9.method6014(local11);
		for (@Pc(126) int local126 = 0; local126 < 6; local126++) {
			@Pc(132) int local132 = local126 + 34069;
			local11.method2928(this.aClass20_Sub3_1, local132);
			local11.method2926(0);
			if (!local11.method2925()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local132 == 34069) {
				OpenGL.glTexCoord3i(65535, 65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65535, 65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65535, -65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(65535, -65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local132 == 34070) {
				OpenGL.glTexCoord3i(-65535, 65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(-65535, 65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(-65535, -65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65535, -65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local132 == 34071) {
				OpenGL.glTexCoord3i(-65534, 65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, 65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, 65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65534, 65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local132 == 34072) {
				OpenGL.glTexCoord3i(-65534, -65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, -65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, -65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65534, -65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local132 == 34073) {
				OpenGL.glTexCoord3i(-65534, 65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, 65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, -65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65534, -65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local132 == 34074) {
				OpenGL.glTexCoord3i(65534, 65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(-65534, 65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(-65534, -65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(65534, -65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
				OpenGL.glVertex2f(0.0F, 1.0F);
			}
			OpenGL.glEnd();
		}
		local11.method2932(0);
		this.aClass16_Sub3_9.method6016(local11);
		this.aClass16_Sub3_9.method5944(1);
		this.aClass16_Sub3_9.method6020(null);
		this.aClass16_Sub3_9.method5957(8448, 8448);
		this.aClass16_Sub3_9.method5944(0);
		this.aClass16_Sub3_9.method6020(null);
		OpenGL.glPopAttrib();
		this.aClass16_Sub3_9.KA(Static468.anIntArray622[0], Static468.anIntArray622[1], Static468.anIntArray622[2], Static468.anIntArray622[3]);
		if (local7 && !this.aClass16_Sub3_9.aBoolean517) {
			this.aClass20_Sub3_1.method7619();
		}
		return local7;
	}

	@OriginalMember(owner = "client!cga", name = "c", descriptor = "(I)Lclient!tc;")
	@Override
	public Class20_Sub3 method3440() {
		return this.aClass20_Sub3_1;
	}
}
