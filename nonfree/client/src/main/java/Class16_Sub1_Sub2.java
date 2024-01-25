import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class16_Sub1_Sub2 extends Class16_Sub1 {

	@OriginalMember(owner = "client!vp", name = "n", descriptor = "Lclient!kd;")
	private final Class39_Sub2 aClass39_Sub2_43;

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "Lclient!gl;")
	private final Class3_Sub3 aClass3_Sub3_2;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!kd;I)V")
	public Class16_Sub1_Sub2(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass39_Sub2_43 = arg0;
		this.aClass3_Sub3_2 = new Class3_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!gl;FLclient!gl;Z)Z")
	public boolean method5751(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class3_Sub3 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class238 local11 = this.aClass39_Sub2_43.aClass238_3;
		this.aClass39_Sub2_43.da(Static40.anIntArray66);
		this.aClass39_Sub2_43.e();
		this.aClass39_Sub2_43.method3201();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass3_Sub3_2.anInt2610, this.aClass3_Sub3_2.anInt2610);
		this.aClass39_Sub2_43.method3217(false);
		this.aClass39_Sub2_43.method3186(false);
		this.aClass39_Sub2_43.method3213(false);
		this.aClass39_Sub2_43.method3208(false);
		this.aClass39_Sub2_43.method3218(-2);
		this.aClass39_Sub2_43.method3221(1);
		this.aClass39_Sub2_43.method3172(0.0F, arg1, 0.0F, 0.0F);
		this.aClass39_Sub2_43.method3156(34165, 34165);
		this.aClass39_Sub2_43.method3203(arg0);
		this.aClass39_Sub2_43.method3221(0);
		this.aClass39_Sub2_43.method3162(1);
		this.aClass39_Sub2_43.method3203(arg2);
		this.aClass39_Sub2_43.method3198(local11);
		for (@Pc(121) int local121 = 0; local121 < 6; local121++) {
			@Pc(127) int local127 = local121 + 34069;
			local11.method5320(this.aClass3_Sub3_2, local127);
			local11.method5316(0);
			if (!local11.method5321()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local127 == 34069) {
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
			} else if (local127 == 34070) {
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
			} else if (local127 == 34071) {
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
			} else if (local127 == 34072) {
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
			} else if (local127 == 34073) {
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
			} else if (local127 == 34074) {
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
		local11.method5322(0);
		this.aClass39_Sub2_43.method3197(local11);
		this.aClass39_Sub2_43.method3221(1);
		this.aClass39_Sub2_43.method3203(null);
		this.aClass39_Sub2_43.method3156(8448, 8448);
		this.aClass39_Sub2_43.method3221(0);
		this.aClass39_Sub2_43.method3203(null);
		OpenGL.glPopAttrib();
		this.aClass39_Sub2_43.OA(Static40.anIntArray66[0], Static40.anIntArray66[1], Static40.anIntArray66[2], Static40.anIntArray66[3]);
		if (local7 && !this.aClass39_Sub2_43.aBoolean245) {
			this.aClass3_Sub3_2.method4148();
		}
		return local7;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)Lclient!gl;")
	@Override
	public Class3_Sub3 method5750() {
		return this.aClass3_Sub3_2;
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)I")
	public int method5755() {
		return this.aClass3_Sub3_2.anInt2610;
	}
}
