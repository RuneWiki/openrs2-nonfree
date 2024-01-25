import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class92_Sub1_Sub2 extends Class92_Sub1 {

	@OriginalMember(owner = "client!uf", name = "l", descriptor = "Lclient!jj;")
	private final Class62_Sub3 aClass62_Sub3_40;

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "Lclient!oj;")
	private final Class4_Sub4 aClass4_Sub4_2;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!jj;I)V")
	public Class92_Sub1_Sub2(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass62_Sub3_40 = arg0;
		this.aClass4_Sub4_2 = new Class4_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)I")
	public int method6808() {
		return this.aClass4_Sub4_2.anInt6710;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(FLclient!oj;Lclient!oj;I)Z")
	public boolean method6809(@OriginalArg(0) float arg0, @OriginalArg(1) Class4_Sub4 arg1, @OriginalArg(2) Class4_Sub4 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class103 local11 = this.aClass62_Sub3_40.aClass103_1;
		this.aClass62_Sub3_40.d(Static297.anIntArray551);
		this.aClass62_Sub3_40.n();
		this.aClass62_Sub3_40.method3955();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass4_Sub4_2.anInt6710, this.aClass4_Sub4_2.anInt6710);
		this.aClass62_Sub3_40.method3942(false);
		this.aClass62_Sub3_40.method3970(false);
		this.aClass62_Sub3_40.method3961(false);
		this.aClass62_Sub3_40.method3989(false);
		this.aClass62_Sub3_40.method3933(-2);
		this.aClass62_Sub3_40.method4009(1);
		this.aClass62_Sub3_40.method3941(0.0F, 0.0F, arg0, 0.0F);
		this.aClass62_Sub3_40.method4011(34165, 34165);
		this.aClass62_Sub3_40.method4007(arg1);
		this.aClass62_Sub3_40.method4009(0);
		this.aClass62_Sub3_40.method3999(1);
		this.aClass62_Sub3_40.method4007(arg2);
		this.aClass62_Sub3_40.method3948(local11);
		for (@Pc(126) int local126 = 0; local126 < 6; local126++) {
			@Pc(132) int local132 = local126 + 34069;
			local11.method2745(local132, this.aClass4_Sub4_2);
			local11.method2737(0);
			if (!local11.method2741()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local132 == 34069) {
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
			} else if (local132 == 34070) {
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
			} else if (local132 == 34071) {
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
			} else if (local132 == 34072) {
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
			} else if (local132 == 34073) {
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
			} else if (local132 == 34074) {
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
		local11.method2746(0);
		this.aClass62_Sub3_40.method3962(local11);
		this.aClass62_Sub3_40.method4009(1);
		this.aClass62_Sub3_40.method4007(null);
		this.aClass62_Sub3_40.method4011(8448, 8448);
		this.aClass62_Sub3_40.method4009(0);
		this.aClass62_Sub3_40.method4007(null);
		OpenGL.glPopAttrib();
		this.aClass62_Sub3_40.N(Static297.anIntArray551[0], Static297.anIntArray551[1], Static297.anIntArray551[2], Static297.anIntArray551[3]);
		if (local7 && !this.aClass62_Sub3_40.aBoolean284) {
			this.aClass4_Sub4_2.method5491();
		}
		return local7;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)Lclient!oj;")
	@Override
	public Class4_Sub4 method6804() {
		return this.aClass4_Sub4_2;
	}
}
