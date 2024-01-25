import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!q", name = "y", descriptor = "Lclient!ug;")
	private final Class135_Sub2 aClass135_Sub2_29;

	@OriginalMember(owner = "client!q", name = "z", descriptor = "Lclient!nn;")
	private final Class65_Sub3 aClass65_Sub3_2;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!ug;I)V")
	public Class3_Sub1_Sub2(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass135_Sub2_29 = arg0;
		this.aClass65_Sub3_2 = new Class65_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(B)Lclient!nn;")
	@Override
	public Class65_Sub3 method4133() {
		return this.aClass65_Sub3_2;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILclient!nn;FLclient!nn;)Z")
	public boolean method4136(@OriginalArg(1) Class65_Sub3 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class65_Sub3 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class183 local11 = this.aClass135_Sub2_29.aClass183_6;
		this.aClass135_Sub2_29.da(Static320.anIntArray426);
		this.aClass135_Sub2_29.e();
		this.aClass135_Sub2_29.method5469();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass65_Sub3_2.anInt4432, this.aClass65_Sub3_2.anInt4432);
		this.aClass135_Sub2_29.method5480(false);
		this.aClass135_Sub2_29.method5461(false);
		this.aClass135_Sub2_29.method5447(false);
		this.aClass135_Sub2_29.method5473(false);
		this.aClass135_Sub2_29.method5485(-2);
		this.aClass135_Sub2_29.method5457(1);
		this.aClass135_Sub2_29.method5409(0.0F, 0.0F, arg1, 0.0F);
		this.aClass135_Sub2_29.method5407(34165, 34165);
		this.aClass135_Sub2_29.method5458(arg0);
		this.aClass135_Sub2_29.method5457(0);
		this.aClass135_Sub2_29.method5441(1);
		this.aClass135_Sub2_29.method5458(arg2);
		this.aClass135_Sub2_29.method5439(local11);
		for (@Pc(126) int local126 = 0; local126 < 6; local126++) {
			@Pc(132) int local132 = local126 + 34069;
			local11.method3609(local132, this.aClass65_Sub3_2);
			local11.method3607(0);
			if (!local11.method3616()) {
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
		local11.method3605(0);
		this.aClass135_Sub2_29.method5419(local11);
		this.aClass135_Sub2_29.method5457(1);
		this.aClass135_Sub2_29.method5458(null);
		this.aClass135_Sub2_29.method5407(8448, 8448);
		this.aClass135_Sub2_29.method5457(0);
		this.aClass135_Sub2_29.method5458(null);
		OpenGL.glPopAttrib();
		this.aClass135_Sub2_29.OA(Static320.anIntArray426[0], Static320.anIntArray426[1], Static320.anIntArray426[2], Static320.anIntArray426[3]);
		if (local7 && !this.aClass135_Sub2_29.aBoolean475) {
			this.aClass65_Sub3_2.method4769();
		}
		return local7;
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(I)I")
	public int method4140() {
		return this.aClass65_Sub3_2.anInt4432;
	}
}
