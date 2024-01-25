import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class30_Sub1_Sub1 extends Class30_Sub1 {

	@OriginalMember(owner = "client!br", name = "n", descriptor = "Lclient!da;")
	private final Class50_Sub1 aClass50_Sub1_8;

	@OriginalMember(owner = "client!br", name = "x", descriptor = "Lclient!dl;")
	private final Class4_Sub2 aClass4_Sub2_1;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!da;I)V")
	public Class30_Sub1_Sub1(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass50_Sub1_8 = arg0;
		this.aClass4_Sub2_1 = new Class4_Sub2(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(B)Lclient!dl;")
	@Override
	public Class4_Sub2 method3802() {
		return this.aClass4_Sub2_1;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(Z)I")
	public int method558() {
		return this.aClass4_Sub2_1.anInt1545;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILclient!dl;Lclient!dl;F)Z")
	public boolean method559(@OriginalArg(1) Class4_Sub2 arg0, @OriginalArg(2) Class4_Sub2 arg1, @OriginalArg(3) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class260 local11 = this.aClass50_Sub1_8.aClass260_3;
		this.aClass50_Sub1_8.MA(Static93.anIntArray750);
		this.aClass50_Sub1_8.va();
		this.aClass50_Sub1_8.method1323();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass4_Sub2_1.anInt1545, this.aClass4_Sub2_1.anInt1545);
		this.aClass50_Sub1_8.method1273(false);
		this.aClass50_Sub1_8.method1298(false);
		this.aClass50_Sub1_8.method1293(false);
		this.aClass50_Sub1_8.method1331(false);
		this.aClass50_Sub1_8.method1318(-2);
		this.aClass50_Sub1_8.method1300(1);
		this.aClass50_Sub1_8.method1308(0.0F, 0.0F, arg2, 0.0F);
		this.aClass50_Sub1_8.method1316(34165, 34165);
		this.aClass50_Sub1_8.method1295(arg0);
		this.aClass50_Sub1_8.method1300(0);
		this.aClass50_Sub1_8.method1256(1);
		this.aClass50_Sub1_8.method1295(arg1);
		this.aClass50_Sub1_8.method1320(local11);
		for (@Pc(124) int local124 = 0; local124 < 6; local124++) {
			@Pc(130) int local130 = local124 + 34069;
			local11.method5740(local130, this.aClass4_Sub2_1);
			local11.method5731(0);
			if (!local11.method5736()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local130 == 34069) {
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
			} else if (local130 == 34070) {
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
			} else if (local130 == 34071) {
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
			} else if (local130 == 34072) {
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
			} else if (local130 == 34073) {
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
			} else if (local130 == 34074) {
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
		local11.method5732(0);
		this.aClass50_Sub1_8.method1284(local11);
		this.aClass50_Sub1_8.method1300(1);
		this.aClass50_Sub1_8.method1295(null);
		this.aClass50_Sub1_8.method1316(8448, 8448);
		this.aClass50_Sub1_8.method1300(0);
		this.aClass50_Sub1_8.method1295(null);
		OpenGL.glPopAttrib();
		this.aClass50_Sub1_8.ba(Static93.anIntArray750[0], Static93.anIntArray750[1], Static93.anIntArray750[2], Static93.anIntArray750[3]);
		if (local7 && !this.aClass50_Sub1_8.aBoolean86) {
			this.aClass4_Sub2_1.method4583();
		}
		return local7;
	}
}
