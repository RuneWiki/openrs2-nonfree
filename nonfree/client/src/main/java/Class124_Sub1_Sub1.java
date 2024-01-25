import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public final class Class124_Sub1_Sub1 extends Class124_Sub1 {

	@OriginalMember(owner = "client!rba", name = "u", descriptor = "Lclient!gi;")
	private final Class42_Sub3 aClass42_Sub3_33;

	@OriginalMember(owner = "client!rba", name = "v", descriptor = "Lclient!nm;")
	private final Class79_Sub4 aClass79_Sub4_1;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!gi;I)V")
	public Class124_Sub1_Sub1(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass42_Sub3_33 = arg0;
		this.aClass79_Sub4_1 = new Class79_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)Lclient!nm;")
	@Override
	public Class79_Sub4 method6602() {
		return this.aClass79_Sub4_1;
	}

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "(I)I")
	public int method6495() {
		return this.aClass79_Sub4_1.anInt6309;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!nm;BFLclient!nm;)Z")
	public boolean method6497(@OriginalArg(0) Class79_Sub4 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class79_Sub4 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class9 local11 = this.aClass42_Sub3_33.aClass9_4;
		this.aClass42_Sub3_33.d(Static303.anIntArray412);
		this.aClass42_Sub3_33.n();
		this.aClass42_Sub3_33.method3238();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass79_Sub4_1.anInt6309, this.aClass79_Sub4_1.anInt6309);
		this.aClass42_Sub3_33.method3263(false);
		this.aClass42_Sub3_33.method3191(false);
		this.aClass42_Sub3_33.method3236(false);
		this.aClass42_Sub3_33.method3192(false);
		this.aClass42_Sub3_33.method3269(-2);
		this.aClass42_Sub3_33.method3259(1);
		this.aClass42_Sub3_33.method3221(0.0F, 0.0F, arg1, 0.0F);
		this.aClass42_Sub3_33.method3250(34165, 34165);
		this.aClass42_Sub3_33.method3219(arg0);
		this.aClass42_Sub3_33.method3259(0);
		this.aClass42_Sub3_33.method3257(1);
		this.aClass42_Sub3_33.method3219(arg2);
		this.aClass42_Sub3_33.method3211(local11);
		for (@Pc(124) int local124 = 0; local124 < 6; local124++) {
			@Pc(131) int local131 = local124 + 34069;
			local11.method279(local131, this.aClass79_Sub4_1);
			local11.method288(0);
			if (!local11.method284()) {
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
		local11.method287(0);
		this.aClass42_Sub3_33.method3256(local11);
		this.aClass42_Sub3_33.method3259(1);
		this.aClass42_Sub3_33.method3219(null);
		this.aClass42_Sub3_33.method3250(8448, 8448);
		this.aClass42_Sub3_33.method3259(0);
		this.aClass42_Sub3_33.method3219(null);
		OpenGL.glPopAttrib();
		this.aClass42_Sub3_33.N(Static303.anIntArray412[0], Static303.anIntArray412[1], Static303.anIntArray412[2], Static303.anIntArray412[3]);
		if (local7 && !this.aClass42_Sub3_33.aBoolean287) {
			this.aClass79_Sub4_1.method5275();
		}
		return local7;
	}
}
