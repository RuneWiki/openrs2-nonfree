import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class4_Sub1_Sub2 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ip", name = "q", descriptor = "Lclient!eq;")
	private final Class33_Sub3 aClass33_Sub3_22;

	@OriginalMember(owner = "client!ip", name = "k", descriptor = "Lclient!gv;")
	private final Class121_Sub1 aClass121_Sub1_2;

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!eq;I)V")
	public Class4_Sub1_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass33_Sub3_22 = arg0;
		this.aClass121_Sub1_2 = new Class121_Sub1(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)Lclient!gv;")
	@Override
	public Class121_Sub1 method4632() {
		return this.aClass121_Sub1_2;
	}

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "(I)I")
	public int method4638() {
		return this.aClass121_Sub1_2.anInt4549;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(FLclient!gv;BLclient!gv;)Z")
	public boolean method4640(@OriginalArg(0) float arg0, @OriginalArg(1) Class121_Sub1 arg1, @OriginalArg(3) Class121_Sub1 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class324 local11 = this.aClass33_Sub3_22.aClass324_2;
		this.aClass33_Sub3_22.K(Static2.anIntArray1);
		this.aClass33_Sub3_22.la();
		this.aClass33_Sub3_22.method3085();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass121_Sub1_2.anInt4549, this.aClass121_Sub1_2.anInt4549);
		this.aClass33_Sub3_22.method3040(false);
		this.aClass33_Sub3_22.method3080(false);
		this.aClass33_Sub3_22.method3031(false);
		this.aClass33_Sub3_22.method3017(false);
		this.aClass33_Sub3_22.method3032(-2);
		this.aClass33_Sub3_22.method3027(1);
		this.aClass33_Sub3_22.method3055(0.0F, 0.0F, arg0, 0.0F);
		this.aClass33_Sub3_22.method3057(34165, 34165);
		this.aClass33_Sub3_22.method3012(arg2);
		this.aClass33_Sub3_22.method3027(0);
		this.aClass33_Sub3_22.method3045(1);
		this.aClass33_Sub3_22.method3012(arg1);
		this.aClass33_Sub3_22.method3050(local11);
		for (@Pc(125) int local125 = 0; local125 < 6; local125++) {
			@Pc(131) int local131 = local125 + 34069;
			local11.method7855(local131, this.aClass121_Sub1_2);
			local11.method7842(0);
			if (!local11.method7847()) {
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
		local11.method7845(0);
		this.aClass33_Sub3_22.method3034(local11);
		this.aClass33_Sub3_22.method3027(1);
		this.aClass33_Sub3_22.method3012(null);
		this.aClass33_Sub3_22.method3057(8448, 8448);
		this.aClass33_Sub3_22.method3027(0);
		this.aClass33_Sub3_22.method3012(null);
		OpenGL.glPopAttrib();
		this.aClass33_Sub3_22.KA(Static2.anIntArray1[0], Static2.anIntArray1[1], Static2.anIntArray1[2], Static2.anIntArray1[3]);
		if (local7 && !this.aClass33_Sub3_22.aBoolean282) {
			this.aClass121_Sub1_2.method7330();
		}
		return local7;
	}
}
