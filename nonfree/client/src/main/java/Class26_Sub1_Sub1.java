import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class26_Sub1_Sub1 extends Class26_Sub1 {

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "Lclient!jaa;")
	private final Class14_Sub3 aClass14_Sub3_2;

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "Lclient!gda;")
	private final Class51_Sub3 aClass51_Sub3_1;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!jaa;I)V")
	public Class26_Sub1_Sub1(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass14_Sub3_2 = arg0;
		this.aClass51_Sub3_1 = new Class51_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)I")
	public int method1259() {
		return this.aClass51_Sub3_1.anInt3337;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(FLclient!gda;Lclient!gda;Z)Z")
	public boolean method1260(@OriginalArg(0) float arg0, @OriginalArg(1) Class51_Sub3 arg1, @OriginalArg(2) Class51_Sub3 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class74 local11 = this.aClass14_Sub3_2.aClass74_4;
		this.aClass14_Sub3_2.A(Static466.anIntArray594);
		this.aClass14_Sub3_2.F();
		this.aClass14_Sub3_2.method3983();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass51_Sub3_1.anInt3337, this.aClass51_Sub3_1.anInt3337);
		this.aClass14_Sub3_2.method3945(false);
		this.aClass14_Sub3_2.method3921(false);
		this.aClass14_Sub3_2.method3959(false);
		this.aClass14_Sub3_2.method3965(false);
		this.aClass14_Sub3_2.method3962(-2);
		this.aClass14_Sub3_2.method3917(1);
		this.aClass14_Sub3_2.method3982(arg0, 0.0F, 0.0F, 0.0F);
		this.aClass14_Sub3_2.method3976(34165, 34165);
		this.aClass14_Sub3_2.method3985(arg1);
		this.aClass14_Sub3_2.method3917(0);
		this.aClass14_Sub3_2.method3925(1);
		this.aClass14_Sub3_2.method3985(arg2);
		this.aClass14_Sub3_2.method3910(local11);
		for (@Pc(117) int local117 = 0; local117 < 6; local117++) {
			@Pc(123) int local123 = local117 + 34069;
			local11.method1770(local123, this.aClass51_Sub3_1);
			local11.method1767(0);
			if (!local11.method1766()) {
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
		local11.method1777(0);
		this.aClass14_Sub3_2.method3955(local11);
		this.aClass14_Sub3_2.method3917(1);
		this.aClass14_Sub3_2.method3985(null);
		this.aClass14_Sub3_2.method3976(8448, 8448);
		this.aClass14_Sub3_2.method3917(0);
		this.aClass14_Sub3_2.method3985(null);
		OpenGL.glPopAttrib();
		this.aClass14_Sub3_2.ca(Static466.anIntArray594[0], Static466.anIntArray594[1], Static466.anIntArray594[2], Static466.anIntArray594[3]);
		if (local7 && !this.aClass14_Sub3_2.aBoolean303) {
			this.aClass51_Sub3_1.method7736();
		}
		return local7;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)Lclient!gda;")
	@Override
	public Class51_Sub3 method4021() {
		return this.aClass51_Sub3_1;
	}
}
