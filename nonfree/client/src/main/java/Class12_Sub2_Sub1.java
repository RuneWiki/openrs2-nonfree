import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class12_Sub2_Sub1 extends Class12_Sub2 {

	@OriginalMember(owner = "client!cca", name = "x", descriptor = "Lclient!vj;")
	private final Class45_Sub3 aClass45_Sub3_9;

	@OriginalMember(owner = "client!cca", name = "r", descriptor = "Lclient!fca;")
	private final Class24_Sub3 aClass24_Sub3_1;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lclient!vj;I)V")
	public Class12_Sub2_Sub1(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass45_Sub3_9 = arg0;
		this.aClass24_Sub3_1 = new Class24_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(FLclient!fca;ILclient!fca;)Z")
	public boolean method1198(@OriginalArg(0) float arg0, @OriginalArg(1) Class24_Sub3 arg1, @OriginalArg(3) Class24_Sub3 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class364 local11 = this.aClass45_Sub3_9.aClass364_7;
		this.aClass45_Sub3_9.oa(Static521.anIntArray542);
		this.aClass45_Sub3_9.JA();
		this.aClass45_Sub3_9.method7519();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass24_Sub3_1.anInt3022, this.aClass24_Sub3_1.anInt3022);
		this.aClass45_Sub3_9.method7481(false);
		this.aClass45_Sub3_9.method7489(false);
		this.aClass45_Sub3_9.method7461(false);
		this.aClass45_Sub3_9.method7437(false);
		this.aClass45_Sub3_9.method7505(-2);
		this.aClass45_Sub3_9.method7510(1);
		this.aClass45_Sub3_9.method7440(0.0F, 0.0F, arg0, 0.0F);
		this.aClass45_Sub3_9.method7491(34165, 34165);
		this.aClass45_Sub3_9.method7475(arg1);
		this.aClass45_Sub3_9.method7510(0);
		this.aClass45_Sub3_9.method7500(1);
		this.aClass45_Sub3_9.method7475(arg2);
		this.aClass45_Sub3_9.method7443(local11);
		for (@Pc(126) int local126 = 0; local126 < 6; local126++) {
			@Pc(133) int local133 = local126 + 34069;
			local11.method7932(local133, this.aClass24_Sub3_1);
			local11.method7925(0);
			if (!local11.method7934()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local133 == 34069) {
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
			} else if (local133 == 34070) {
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
			} else if (local133 == 34071) {
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
			} else if (local133 == 34072) {
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
			} else if (local133 == 34073) {
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
			} else if (local133 == 34074) {
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
		local11.method7935(0);
		this.aClass45_Sub3_9.method7508(local11);
		this.aClass45_Sub3_9.method7510(1);
		this.aClass45_Sub3_9.method7475(null);
		this.aClass45_Sub3_9.method7491(8448, 8448);
		this.aClass45_Sub3_9.method7510(0);
		this.aClass45_Sub3_9.method7475(null);
		OpenGL.glPopAttrib();
		this.aClass45_Sub3_9.da(Static521.anIntArray542[0], Static521.anIntArray542[1], Static521.anIntArray542[2], Static521.anIntArray542[3]);
		if (local7 && !this.aClass45_Sub3_9.aBoolean692) {
			this.aClass24_Sub3_1.method2799();
		}
		return local7;
	}

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "(I)I")
	public int method1199() {
		return this.aClass24_Sub3_1.anInt3022;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)Lclient!fca;")
	@Override
	public Class24_Sub3 method3734() {
		return this.aClass24_Sub3_1;
	}
}
