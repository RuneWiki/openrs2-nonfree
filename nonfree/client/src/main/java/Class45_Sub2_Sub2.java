import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class45_Sub2_Sub2 extends Class45_Sub2 {

	@OriginalMember(owner = "client!rj", name = "l", descriptor = "Lclient!uq;")
	private final Class122_Sub3 aClass122_Sub3_33;

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "Lclient!sk;")
	private final Class73_Sub4 aClass73_Sub4_2;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!uq;I)V")
	public Class45_Sub2_Sub2(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass122_Sub3_33 = arg0;
		this.aClass73_Sub4_2 = new Class73_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)I")
	public int method6136() {
		return this.aClass73_Sub4_2.anInt7639;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(FBLclient!sk;Lclient!sk;)Z")
	public boolean method6137(@OriginalArg(0) float arg0, @OriginalArg(2) Class73_Sub4 arg1, @OriginalArg(3) Class73_Sub4 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class311 local11 = this.aClass122_Sub3_33.aClass311_6;
		this.aClass122_Sub3_33.d(Static484.anIntArray749);
		this.aClass122_Sub3_33.n();
		this.aClass122_Sub3_33.method6881();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass73_Sub4_2.anInt7639, this.aClass73_Sub4_2.anInt7639);
		this.aClass122_Sub3_33.method6928(false);
		this.aClass122_Sub3_33.method6896(false);
		this.aClass122_Sub3_33.method6916(false);
		this.aClass122_Sub3_33.method6915(false);
		this.aClass122_Sub3_33.method6926(-2);
		this.aClass122_Sub3_33.method6932(1);
		this.aClass122_Sub3_33.method6887(0.0F, 0.0F, arg0, 0.0F);
		this.aClass122_Sub3_33.method6853(34165, 34165);
		this.aClass122_Sub3_33.method6850(arg2);
		this.aClass122_Sub3_33.method6932(0);
		this.aClass122_Sub3_33.method6875(1);
		this.aClass122_Sub3_33.method6850(arg1);
		this.aClass122_Sub3_33.method6884(local11);
		for (@Pc(117) int local117 = 0; local117 < 6; local117++) {
			@Pc(123) int local123 = local117 + 34069;
			local11.method7348(local123, this.aClass73_Sub4_2);
			local11.method7350(0);
			if (!local11.method7354()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local123 == 34069) {
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
			} else if (local123 == 34070) {
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
			} else if (local123 == 34071) {
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
			} else if (local123 == 34072) {
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
			} else if (local123 == 34073) {
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
			} else if (local123 == 34074) {
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
		local11.method7356(0);
		this.aClass122_Sub3_33.method6883(local11);
		this.aClass122_Sub3_33.method6932(1);
		this.aClass122_Sub3_33.method6850(null);
		this.aClass122_Sub3_33.method6853(8448, 8448);
		this.aClass122_Sub3_33.method6932(0);
		this.aClass122_Sub3_33.method6850(null);
		OpenGL.glPopAttrib();
		this.aClass122_Sub3_33.N(Static484.anIntArray749[0], Static484.anIntArray749[1], Static484.anIntArray749[2], Static484.anIntArray749[3]);
		if (local7 && !this.aClass122_Sub3_33.aBoolean582) {
			this.aClass73_Sub4_2.method6353();
		}
		return local7;
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)Lclient!sk;")
	@Override
	public Class73_Sub4 method6134() {
		return this.aClass73_Sub4_2;
	}
}
