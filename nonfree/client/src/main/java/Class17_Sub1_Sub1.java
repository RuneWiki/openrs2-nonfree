import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class17_Sub1_Sub1 extends Class17_Sub1 {

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "Lclient!uca;")
	private final Class162_Sub3 aClass162_Sub3_3;

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "Lclient!eg;")
	private final Class3_Sub3 aClass3_Sub3_1;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lclient!uca;I)V")
	public Class17_Sub1_Sub1(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass162_Sub3_3 = arg0;
		this.aClass3_Sub3_1 = new Class3_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)I")
	public int method286() {
		return this.aClass3_Sub3_1.anInt2042;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!eg;FLclient!eg;B)Z")
	public boolean method289(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class3_Sub3 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class105 local11 = this.aClass162_Sub3_3.aClass105_7;
		this.aClass162_Sub3_3.oa(Static157.anIntArray211);
		this.aClass162_Sub3_3.JA();
		this.aClass162_Sub3_3.method6905();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass3_Sub3_1.anInt2042, this.aClass3_Sub3_1.anInt2042);
		this.aClass162_Sub3_3.method6972(false);
		this.aClass162_Sub3_3.method6907(false);
		this.aClass162_Sub3_3.method6895(false);
		this.aClass162_Sub3_3.method6896(false);
		this.aClass162_Sub3_3.method6963(-2);
		this.aClass162_Sub3_3.method6947(1);
		this.aClass162_Sub3_3.method6952(0.0F, 0.0F, arg1, 0.0F);
		this.aClass162_Sub3_3.method6903(34165, 34165);
		this.aClass162_Sub3_3.method6911(arg2);
		this.aClass162_Sub3_3.method6947(0);
		this.aClass162_Sub3_3.method6953(1);
		this.aClass162_Sub3_3.method6911(arg0);
		this.aClass162_Sub3_3.method6942(local11);
		for (@Pc(122) int local122 = 0; local122 < 6; local122++) {
			@Pc(128) int local128 = local122 + 34069;
			local11.method1941(this.aClass3_Sub3_1, local128);
			local11.method1950(0);
			if (!local11.method1943()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local128 == 34069) {
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
			} else if (local128 == 34070) {
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
			} else if (local128 == 34071) {
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
			} else if (local128 == 34072) {
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
			} else if (local128 == 34073) {
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
			} else if (local128 == 34074) {
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
		local11.method1949(0);
		this.aClass162_Sub3_3.method6897(local11);
		this.aClass162_Sub3_3.method6947(1);
		this.aClass162_Sub3_3.method6911(null);
		this.aClass162_Sub3_3.method6903(8448, 8448);
		this.aClass162_Sub3_3.method6947(0);
		this.aClass162_Sub3_3.method6911(null);
		OpenGL.glPopAttrib();
		this.aClass162_Sub3_3.da(Static157.anIntArray211[0], Static157.anIntArray211[1], Static157.anIntArray211[2], Static157.anIntArray211[3]);
		if (local7 && !this.aClass162_Sub3_3.aBoolean744) {
			this.aClass3_Sub3_1.method5573();
		}
		return local7;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)Lclient!eg;")
	@Override
	public Class3_Sub3 method6601() {
		return this.aClass3_Sub3_1;
	}
}
