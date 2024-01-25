import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class141_Sub1_Sub1 extends Class141_Sub1 {

	@OriginalMember(owner = "client!jv", name = "q", descriptor = "Lclient!na;")
	private final Class75_Sub2 aClass75_Sub2_18;

	@OriginalMember(owner = "client!jv", name = "x", descriptor = "Lclient!ea;")
	private final Class64_Sub1 aClass64_Sub1_1;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!na;I)V")
	public Class141_Sub1_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass75_Sub2_18 = arg0;
		this.aClass64_Sub1_1 = new Class64_Sub1(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!ea;BLclient!ea;F)Z")
	public boolean method2911(@OriginalArg(0) Class64_Sub1 arg0, @OriginalArg(2) Class64_Sub1 arg1, @OriginalArg(3) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class51 local11 = this.aClass75_Sub2_18.aClass51_6;
		this.aClass75_Sub2_18.MA(Static10.anIntArray16);
		this.aClass75_Sub2_18.va();
		this.aClass75_Sub2_18.method3865();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass64_Sub1_1.anInt1424, this.aClass64_Sub1_1.anInt1424);
		this.aClass75_Sub2_18.method3867(false);
		this.aClass75_Sub2_18.method3808(false);
		this.aClass75_Sub2_18.method3876(false);
		this.aClass75_Sub2_18.method3875(false);
		this.aClass75_Sub2_18.method3857(-2);
		this.aClass75_Sub2_18.method3811(1);
		this.aClass75_Sub2_18.method3877(0.0F, 0.0F, 0.0F, arg2);
		this.aClass75_Sub2_18.method3872(34165, 34165);
		this.aClass75_Sub2_18.method3844(arg1);
		this.aClass75_Sub2_18.method3811(0);
		this.aClass75_Sub2_18.method3798(1);
		this.aClass75_Sub2_18.method3844(arg0);
		this.aClass75_Sub2_18.method3826(local11);
		for (@Pc(122) int local122 = 0; local122 < 6; local122++) {
			@Pc(129) int local129 = local122 + 34069;
			local11.method1092(this.aClass64_Sub1_1, local129);
			local11.method1078(0);
			if (!local11.method1089()) {
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
		local11.method1081(0);
		this.aClass75_Sub2_18.method3807(local11);
		this.aClass75_Sub2_18.method3811(1);
		this.aClass75_Sub2_18.method3844(null);
		this.aClass75_Sub2_18.method3872(8448, 8448);
		this.aClass75_Sub2_18.method3811(0);
		this.aClass75_Sub2_18.method3844(null);
		OpenGL.glPopAttrib();
		this.aClass75_Sub2_18.ba(Static10.anIntArray16[0], Static10.anIntArray16[1], Static10.anIntArray16[2], Static10.anIntArray16[3]);
		if (local7 && !this.aClass75_Sub2_18.aBoolean358) {
			this.aClass64_Sub1_1.method3521();
		}
		return local7;
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)Lclient!ea;")
	@Override
	public Class64_Sub1 method3562() {
		return this.aClass64_Sub1_1;
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(Z)I")
	public int method2914() {
		return this.aClass64_Sub1_1.anInt1424;
	}
}
