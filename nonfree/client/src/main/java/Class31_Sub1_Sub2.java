import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class31_Sub1_Sub2 extends Class31_Sub1 {

	@OriginalMember(owner = "client!cv", name = "o", descriptor = "Lclient!ac;")
	private final Class5_Sub1 aClass5_Sub1_11;

	@OriginalMember(owner = "client!cv", name = "l", descriptor = "Lclient!hw;")
	private final Class2_Sub2 aClass2_Sub2_2;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lclient!ac;I)V")
	public Class31_Sub1_Sub2(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass5_Sub1_11 = arg0;
		this.aClass2_Sub2_2 = new Class2_Sub2(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)Lclient!hw;")
	@Override
	public Class2_Sub2 method2212() {
		return this.aClass2_Sub2_2;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(BLclient!hw;FLclient!hw;)Z")
	public boolean method2216(@OriginalArg(1) Class2_Sub2 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class2_Sub2 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class297 local11 = this.aClass5_Sub1_11.aClass297_2;
		this.aClass5_Sub1_11.K(Static45.anIntArray568);
		this.aClass5_Sub1_11.la();
		this.aClass5_Sub1_11.method356();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass2_Sub2_2.anInt5072, this.aClass2_Sub2_2.anInt5072);
		this.aClass5_Sub1_11.method345(false);
		this.aClass5_Sub1_11.method340(false);
		this.aClass5_Sub1_11.method370(false);
		this.aClass5_Sub1_11.method364(false);
		this.aClass5_Sub1_11.method323(-2);
		this.aClass5_Sub1_11.method334(1);
		this.aClass5_Sub1_11.method347(0.0F, 0.0F, 0.0F, arg1);
		this.aClass5_Sub1_11.method388(34165, 34165);
		this.aClass5_Sub1_11.method352(arg2);
		this.aClass5_Sub1_11.method334(0);
		this.aClass5_Sub1_11.method385(1);
		this.aClass5_Sub1_11.method352(arg0);
		this.aClass5_Sub1_11.method387(local11);
		for (@Pc(123) int local123 = 0; local123 < 6; local123++) {
			@Pc(129) int local129 = local123 + 34069;
			local11.method7264(local129, this.aClass2_Sub2_2);
			local11.method7266(0);
			if (!local11.method7265()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local129 == 34069) {
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
			} else if (local129 == 34070) {
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
			} else if (local129 == 34071) {
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
			} else if (local129 == 34072) {
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
			} else if (local129 == 34073) {
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
			} else if (local129 == 34074) {
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
		local11.method7263(0);
		this.aClass5_Sub1_11.method396(local11);
		this.aClass5_Sub1_11.method334(1);
		this.aClass5_Sub1_11.method352((Class2) null);
		this.aClass5_Sub1_11.method388(8448, 8448);
		this.aClass5_Sub1_11.method334(0);
		this.aClass5_Sub1_11.method352((Class2) null);
		OpenGL.glPopAttrib();
		this.aClass5_Sub1_11.KA(Static45.anIntArray568[0], Static45.anIntArray568[1], Static45.anIntArray568[2], Static45.anIntArray568[3]);
		if (local7 && !this.aClass5_Sub1_11.aBoolean27) {
			this.aClass2_Sub2_2.method6975();
		}
		return local7;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)I")
	public int method2217() {
		return this.aClass2_Sub2_2.anInt5072;
	}
}
