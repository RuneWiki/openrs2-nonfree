import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class22_Sub1_Sub2 extends Class22_Sub1 {

	@OriginalMember(owner = "client!wp", name = "s", descriptor = "Lclient!oea;")
	private final Class87_Sub2 aClass87_Sub2_43;

	@OriginalMember(owner = "client!wp", name = "t", descriptor = "Lclient!ni;")
	private final Class88_Sub3 aClass88_Sub3_2;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lclient!oea;I)V")
	public Class22_Sub1_Sub2(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass87_Sub2_43 = arg0;
		this.aClass88_Sub3_2 = new Class88_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)Lclient!ni;")
	@Override
	public Class88_Sub3 method8508() {
		return this.aClass88_Sub3_2;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z)I")
	public int method8512() {
		return this.aClass88_Sub3_2.anInt6803;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZFLclient!ni;Lclient!ni;)Z")
	public boolean method8513(@OriginalArg(1) float arg0, @OriginalArg(2) Class88_Sub3 arg1, @OriginalArg(3) Class88_Sub3 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class161 local11 = this.aClass87_Sub2_43.aClass161_2;
		this.aClass87_Sub2_43.K(Static182.anIntArray277);
		this.aClass87_Sub2_43.la();
		this.aClass87_Sub2_43.method6181();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass88_Sub3_2.anInt6803, this.aClass88_Sub3_2.anInt6803);
		this.aClass87_Sub2_43.method6156(false);
		this.aClass87_Sub2_43.method6205(false);
		this.aClass87_Sub2_43.method6217(false);
		this.aClass87_Sub2_43.method6225(false);
		this.aClass87_Sub2_43.method6228(-2);
		this.aClass87_Sub2_43.method6155(1);
		this.aClass87_Sub2_43.method6185(0.0F, 0.0F, arg0, 0.0F);
		this.aClass87_Sub2_43.method6227(34165, 34165);
		this.aClass87_Sub2_43.method6167(arg2);
		this.aClass87_Sub2_43.method6155(0);
		this.aClass87_Sub2_43.method6159(1);
		this.aClass87_Sub2_43.method6167(arg1);
		this.aClass87_Sub2_43.method6188(local11);
		for (@Pc(117) int local117 = 0; local117 < 6; local117++) {
			@Pc(123) int local123 = local117 + 34069;
			local11.method3954(local123, this.aClass88_Sub3_2);
			local11.method3968(0);
			if (!local11.method3960()) {
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
		local11.method3958(0);
		this.aClass87_Sub2_43.method6184(local11);
		this.aClass87_Sub2_43.method6155(1);
		this.aClass87_Sub2_43.method6167(null);
		this.aClass87_Sub2_43.method6227(8448, 8448);
		this.aClass87_Sub2_43.method6155(0);
		this.aClass87_Sub2_43.method6167(null);
		OpenGL.glPopAttrib();
		this.aClass87_Sub2_43.KA(Static182.anIntArray277[0], Static182.anIntArray277[1], Static182.anIntArray277[2], Static182.anIntArray277[3]);
		if (local7 && !this.aClass87_Sub2_43.aBoolean548) {
			this.aClass88_Sub3_2.method6983();
		}
		return local7;
	}
}
