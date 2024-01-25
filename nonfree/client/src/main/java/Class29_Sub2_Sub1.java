import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class29_Sub2_Sub1 extends Class29_Sub2 {

	@OriginalMember(owner = "client!ru", name = "h", descriptor = "Lclient!ffa;")
	private Class57_Sub2 aClass57_Sub2_32;

	@OriginalMember(owner = "client!ru", name = "p", descriptor = "Lclient!od;")
	private final Class32_Sub3 aClass32_Sub3_1;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!ffa;I)V")
	public Class29_Sub2_Sub1(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass57_Sub2_32 = arg0;
		this.aClass32_Sub3_1 = new Class32_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!od;BFLclient!od;)Z")
	public boolean method7558(@OriginalArg(0) Class32_Sub3 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class32_Sub3 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class76 local11 = this.aClass57_Sub2_32.aClass76_2;
		this.aClass57_Sub2_32.K(Static593.anIntArray551);
		this.aClass57_Sub2_32.la();
		this.aClass57_Sub2_32.method2314();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass32_Sub3_1.anInt7191, this.aClass32_Sub3_1.anInt7191);
		this.aClass57_Sub2_32.method2327(false);
		this.aClass57_Sub2_32.method2335(false);
		this.aClass57_Sub2_32.method2310(false);
		this.aClass57_Sub2_32.method2309(false);
		this.aClass57_Sub2_32.method2358(-2);
		this.aClass57_Sub2_32.method2345(1);
		this.aClass57_Sub2_32.method2352(0.0F, arg1, 0.0F, 0.0F);
		this.aClass57_Sub2_32.method2313(34165, 34165);
		this.aClass57_Sub2_32.method2362(arg2);
		this.aClass57_Sub2_32.method2345(0);
		this.aClass57_Sub2_32.method2382(1);
		this.aClass57_Sub2_32.method2362(arg0);
		this.aClass57_Sub2_32.method2384(local11);
		for (@Pc(123) int local123 = 0; local123 < 6; local123++) {
			@Pc(131) int local131 = local123 + 34069;
			local11.method1343(local131, this.aClass32_Sub3_1);
			local11.method1340(0);
			if (!local11.method1346()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local131 == 34069) {
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
			} else if (local131 == 34070) {
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
			} else if (local131 == 34071) {
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
			} else if (local131 == 34072) {
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
			} else if (local131 == 34073) {
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
			} else if (local131 == 34074) {
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
		local11.method1338(0);
		if (112 != 112) {
			this.aClass57_Sub2_32 = null;
		}
		this.aClass57_Sub2_32.method2375(local11);
		this.aClass57_Sub2_32.method2345(1);
		this.aClass57_Sub2_32.method2362((Class32) null);
		this.aClass57_Sub2_32.method2313(8448, 8448);
		this.aClass57_Sub2_32.method2345(0);
		this.aClass57_Sub2_32.method2362((Class32) null);
		OpenGL.glPopAttrib();
		this.aClass57_Sub2_32.KA(Static593.anIntArray551[0], Static593.anIntArray551[1], Static593.anIntArray551[2], Static593.anIntArray551[3]);
		if (local7 && !this.aClass57_Sub2_32.aBoolean215) {
			this.aClass32_Sub3_1.method8435();
		}
		return local7;
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)Lclient!od;")
	@Override
	public Class32_Sub3 method9316() {
		return this.aClass32_Sub3_1;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)I")
	public int method7561() {
		return this.aClass32_Sub3_1.anInt7191;
	}
}
