import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class83_Sub2_Sub2 extends Class83_Sub2 {

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "Lclient!ok;")
	private final Class134_Sub2 aClass134_Sub2_34;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "Lclient!qe;")
	private final Class40_Sub4 aClass40_Sub4_2;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!ok;I)V")
	public Class83_Sub2_Sub2(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass134_Sub2_34 = arg0;
		this.aClass40_Sub4_2 = new Class40_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZFLclient!qe;Lclient!qe;)Z")
	public boolean method6438(@OriginalArg(1) float arg0, @OriginalArg(2) Class40_Sub4 arg1, @OriginalArg(3) Class40_Sub4 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class98 local11 = this.aClass134_Sub2_34.aClass98_7;
		this.aClass134_Sub2_34.oa(Static478.anIntArray680);
		this.aClass134_Sub2_34.JA();
		this.aClass134_Sub2_34.method5225();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass40_Sub4_2.anInt7369, this.aClass40_Sub4_2.anInt7369);
		this.aClass134_Sub2_34.method5236(false);
		this.aClass134_Sub2_34.method5190(false);
		this.aClass134_Sub2_34.method5268(false);
		this.aClass134_Sub2_34.method5231(false);
		this.aClass134_Sub2_34.method5207(-2);
		this.aClass134_Sub2_34.method5197(1);
		this.aClass134_Sub2_34.method5247(0.0F, 0.0F, arg0, 0.0F);
		this.aClass134_Sub2_34.method5224(34165, 34165);
		this.aClass134_Sub2_34.method5202(arg1);
		this.aClass134_Sub2_34.method5197(0);
		this.aClass134_Sub2_34.method5194(1);
		this.aClass134_Sub2_34.method5202(arg2);
		this.aClass134_Sub2_34.method5275(local11);
		for (@Pc(121) int local121 = 0; local121 < 6; local121++) {
			@Pc(127) int local127 = local121 + 34069;
			local11.method1974(local127, this.aClass40_Sub4_2);
			local11.method1979(0);
			if (!local11.method1975()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local127 == 34069) {
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
			} else if (local127 == 34070) {
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
			} else if (local127 == 34071) {
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
			} else if (local127 == 34072) {
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
			} else if (local127 == 34073) {
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
			} else if (local127 == 34074) {
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
		local11.method1973(0);
		this.aClass134_Sub2_34.method5262(local11);
		this.aClass134_Sub2_34.method5197(1);
		this.aClass134_Sub2_34.method5202(null);
		this.aClass134_Sub2_34.method5224(8448, 8448);
		this.aClass134_Sub2_34.method5197(0);
		this.aClass134_Sub2_34.method5202(null);
		OpenGL.glPopAttrib();
		this.aClass134_Sub2_34.da(Static478.anIntArray680[0], Static478.anIntArray680[1], Static478.anIntArray680[2], Static478.anIntArray680[3]);
		if (local7 && !this.aClass134_Sub2_34.aBoolean516) {
			this.aClass40_Sub4_2.method5878();
		}
		return local7;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)I")
	public int method6440() {
		return this.aClass40_Sub4_2.anInt7369;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)Lclient!qe;")
	@Override
	public Class40_Sub4 method6437() {
		return this.aClass40_Sub4_2;
	}
}
