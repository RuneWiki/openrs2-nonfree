import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class106_Sub2_Sub1 extends Class106_Sub2 {

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "Lclient!hk;")
	private final Class16_Sub2 aClass16_Sub2_19;

	@OriginalMember(owner = "client!hg", name = "j", descriptor = "Lclient!bja;")
	private final Class39_Sub1 aClass39_Sub1_1;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!hk;I)V")
	public Class106_Sub2_Sub1(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass16_Sub2_19 = arg0;
		this.aClass39_Sub1_1 = new Class39_Sub1(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)I")
	public int method3455() {
		return this.aClass39_Sub1_1.anInt1312;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!bja;Lclient!bja;IF)Z")
	public boolean method3456(@OriginalArg(0) Class39_Sub1 arg0, @OriginalArg(1) Class39_Sub1 arg1, @OriginalArg(3) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class109 local11 = this.aClass16_Sub2_19.aClass109_2;
		this.aClass16_Sub2_19.K(Static665.anIntArray663);
		this.aClass16_Sub2_19.la();
		this.aClass16_Sub2_19.method3665();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass39_Sub1_1.anInt1312, this.aClass39_Sub1_1.anInt1312);
		this.aClass16_Sub2_19.method3681(false);
		this.aClass16_Sub2_19.method3637(false);
		this.aClass16_Sub2_19.method3631(false);
		this.aClass16_Sub2_19.method3617(false);
		this.aClass16_Sub2_19.method3687(-2);
		this.aClass16_Sub2_19.method3683(1);
		this.aClass16_Sub2_19.method3651(0.0F, 0.0F, 0.0F, arg2);
		this.aClass16_Sub2_19.method3671(34165, 34165);
		this.aClass16_Sub2_19.method3620(arg0);
		this.aClass16_Sub2_19.method3683(0);
		this.aClass16_Sub2_19.method3680(1);
		this.aClass16_Sub2_19.method3620(arg1);
		this.aClass16_Sub2_19.method3615(local11);
		for (@Pc(125) int local125 = 0; local125 < 6; local125++) {
			@Pc(131) int local131 = local125 + 34069;
			local11.method2555(local131, this.aClass39_Sub1_1);
			local11.method2556(0);
			if (!local11.method2549()) {
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
		local11.method2552(0);
		this.aClass16_Sub2_19.method3635(local11);
		this.aClass16_Sub2_19.method3683(1);
		this.aClass16_Sub2_19.method3620((Class39) null);
		this.aClass16_Sub2_19.method3671(8448, 8448);
		this.aClass16_Sub2_19.method3683(0);
		this.aClass16_Sub2_19.method3620((Class39) null);
		OpenGL.glPopAttrib();
		this.aClass16_Sub2_19.KA(Static665.anIntArray663[0], Static665.anIntArray663[1], Static665.anIntArray663[2], Static665.anIntArray663[3]);
		if (local7 && !this.aClass16_Sub2_19.aBoolean321) {
			this.aClass39_Sub1_1.method8458();
		}
		return local7;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)Lclient!bja;")
	@Override
	public Class39_Sub1 method4441() {
		return this.aClass39_Sub1_1;
	}
}
