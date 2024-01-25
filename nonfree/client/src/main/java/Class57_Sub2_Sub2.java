import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class57_Sub2_Sub2 extends Class57_Sub2 {

	@OriginalMember(owner = "client!us", name = "m", descriptor = "Lclient!lf;")
	private final Class95_Sub3 aClass95_Sub3_40;

	@OriginalMember(owner = "client!us", name = "n", descriptor = "Lclient!iv;")
	private final Class10_Sub3 aClass10_Sub3_2;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lclient!lf;I)V")
	public Class57_Sub2_Sub2(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass95_Sub3_40 = arg0;
		this.aClass10_Sub3_2 = new Class10_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(I)Lclient!iv;")
	@Override
	public Class10_Sub3 method8388() {
		return this.aClass10_Sub3_2;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Z)I")
	public int method8390() {
		return this.aClass10_Sub3_2.anInt4633;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!iv;ILclient!iv;F)Z")
	public boolean method8391(@OriginalArg(0) Class10_Sub3 arg0, @OriginalArg(2) Class10_Sub3 arg1, @OriginalArg(3) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class127 local11 = this.aClass95_Sub3_40.aClass127_5;
		this.aClass95_Sub3_40.K(Static125.anIntArray133);
		this.aClass95_Sub3_40.la();
		this.aClass95_Sub3_40.method4844();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass10_Sub3_2.anInt4633, this.aClass10_Sub3_2.anInt4633);
		this.aClass95_Sub3_40.method4839(false);
		this.aClass95_Sub3_40.method4908(false);
		this.aClass95_Sub3_40.method4862(false);
		this.aClass95_Sub3_40.method4841(false);
		this.aClass95_Sub3_40.method4849(-2);
		this.aClass95_Sub3_40.method4900(1);
		this.aClass95_Sub3_40.method4896(0.0F, 0.0F, arg2, 0.0F);
		this.aClass95_Sub3_40.method4899(34165, 34165);
		this.aClass95_Sub3_40.method4864(arg0);
		this.aClass95_Sub3_40.method4900(0);
		this.aClass95_Sub3_40.method4870(1);
		this.aClass95_Sub3_40.method4864(arg1);
		this.aClass95_Sub3_40.method4863(local11);
		for (@Pc(124) int local124 = 0; local124 < 6; local124++) {
			@Pc(130) int local130 = local124 + 34069;
			local11.method2980(this.aClass10_Sub3_2, local130);
			local11.method2987(0);
			if (!local11.method2988()) {
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
		local11.method2983(0);
		this.aClass95_Sub3_40.method4836(local11);
		this.aClass95_Sub3_40.method4900(1);
		this.aClass95_Sub3_40.method4864((Class10) null);
		this.aClass95_Sub3_40.method4899(8448, 8448);
		this.aClass95_Sub3_40.method4900(0);
		this.aClass95_Sub3_40.method4864((Class10) null);
		OpenGL.glPopAttrib();
		this.aClass95_Sub3_40.KA(Static125.anIntArray133[0], Static125.anIntArray133[1], Static125.anIntArray133[2], Static125.anIntArray133[3]);
		if (local7 && !this.aClass95_Sub3_40.aBoolean391) {
			this.aClass10_Sub3_2.method6096();
		}
		return local7;
	}
}
