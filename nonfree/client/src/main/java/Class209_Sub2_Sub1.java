import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wea")
public final class Class209_Sub2_Sub1 extends Class209_Sub2 {

	@OriginalMember(owner = "client!wea", name = "n", descriptor = "[F")
	public static final float[] aFloatArray89 = new float[16384];

	@OriginalMember(owner = "client!wea", name = "o", descriptor = "[F")
	public static final float[] aFloatArray90 = new float[16384];

	@OriginalMember(owner = "client!wea", name = "p", descriptor = "Lclient!lj;")
	private final Class78_Sub3 aClass78_Sub3_43;

	@OriginalMember(owner = "client!wea", name = "s", descriptor = "Lclient!hda;")
	private final Class46_Sub4 aClass46_Sub4_1;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray89[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray90[local9] = (float) Math.cos(local7 * (double) local9);
		}
	}

	@OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lclient!lj;I)V")
	public Class209_Sub2_Sub1(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass78_Sub3_43 = arg0;
		this.aClass46_Sub4_1 = new Class46_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!wea", name = "f", descriptor = "(I)I")
	public int method7766() {
		return this.aClass46_Sub4_1.anInt3712;
	}

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "(I)Lclient!hda;")
	@Override
	public Class46_Sub4 method7881() {
		return this.aClass46_Sub4_1;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lclient!hda;FILclient!hda;)Z")
	public boolean method7768(@OriginalArg(0) Class46_Sub4 arg0, @OriginalArg(1) float arg1, @OriginalArg(3) Class46_Sub4 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class343 local11 = this.aClass78_Sub3_43.aClass343_4;
		this.aClass78_Sub3_43.oa(Static462.anIntArray507);
		this.aClass78_Sub3_43.JA();
		this.aClass78_Sub3_43.method4553();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass46_Sub4_1.anInt3712, this.aClass46_Sub4_1.anInt3712);
		this.aClass78_Sub3_43.method4506(false);
		this.aClass78_Sub3_43.method4524(false);
		this.aClass78_Sub3_43.method4547(false);
		this.aClass78_Sub3_43.method4542(false);
		this.aClass78_Sub3_43.method4567(-2);
		this.aClass78_Sub3_43.method4549(1);
		this.aClass78_Sub3_43.method4500(0.0F, arg1, 0.0F, 0.0F);
		this.aClass78_Sub3_43.method4539(34165, 34165);
		this.aClass78_Sub3_43.method4535(arg0);
		this.aClass78_Sub3_43.method4549(0);
		this.aClass78_Sub3_43.method4534(1);
		this.aClass78_Sub3_43.method4535(arg2);
		this.aClass78_Sub3_43.method4529(local11);
		for (@Pc(124) int local124 = 0; local124 < 6; local124++) {
			@Pc(130) int local130 = local124 + 34069;
			local11.method7467(local130, this.aClass46_Sub4_1);
			local11.method7464(0);
			if (!local11.method7469()) {
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
		local11.method7470(0);
		this.aClass78_Sub3_43.method4495(local11);
		this.aClass78_Sub3_43.method4549(1);
		this.aClass78_Sub3_43.method4535(null);
		this.aClass78_Sub3_43.method4539(8448, 8448);
		this.aClass78_Sub3_43.method4549(0);
		this.aClass78_Sub3_43.method4535(null);
		OpenGL.glPopAttrib();
		this.aClass78_Sub3_43.da(Static462.anIntArray507[0], Static462.anIntArray507[1], Static462.anIntArray507[2], Static462.anIntArray507[3]);
		if (local7 && !this.aClass78_Sub3_43.aBoolean437) {
			this.aClass46_Sub4_1.method5138();
		}
		return local7;
	}
}
