import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class103_Sub2_Sub1 extends Class103_Sub2 {

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "Lclient!mh;")
	private final Class4_Sub3 aClass4_Sub3_19;

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "Lclient!kh;")
	private final Class164_Sub1 aClass164_Sub1_1;

	static {
		new Class45("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	}

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!mh;I)V")
	public Class103_Sub2_Sub1(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass4_Sub3_19 = arg0;
		this.aClass164_Sub1_1 = new Class164_Sub1(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)I")
	public int method4052() {
		return this.aClass164_Sub1_1.anInt4799;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)Lclient!kh;")
	@Override
	public Class164_Sub1 method4825() {
		return this.aClass164_Sub1_1;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(FBLclient!kh;Lclient!kh;)Z")
	public boolean method4054(@OriginalArg(0) float arg0, @OriginalArg(2) Class164_Sub1 arg1, @OriginalArg(3) Class164_Sub1 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class89 local11 = this.aClass4_Sub3_19.aClass89_6;
		this.aClass4_Sub3_19.d(Static446.anIntArray726);
		this.aClass4_Sub3_19.n();
		this.aClass4_Sub3_19.method5246();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass164_Sub1_1.anInt4799, this.aClass164_Sub1_1.anInt4799);
		this.aClass4_Sub3_19.method5270(false);
		this.aClass4_Sub3_19.method5273(false);
		this.aClass4_Sub3_19.method5241(false);
		this.aClass4_Sub3_19.method5268(false);
		this.aClass4_Sub3_19.method5238(-2);
		this.aClass4_Sub3_19.method5245(1);
		this.aClass4_Sub3_19.method5296(arg0, 0.0F, 0.0F, 0.0F);
		this.aClass4_Sub3_19.method5266(34165, 34165);
		this.aClass4_Sub3_19.method5250(arg1);
		this.aClass4_Sub3_19.method5245(0);
		this.aClass4_Sub3_19.method5230(1);
		this.aClass4_Sub3_19.method5250(arg2);
		this.aClass4_Sub3_19.method5263(local11);
		for (@Pc(126) int local126 = 0; local126 < 6; local126++) {
			@Pc(132) int local132 = local126 + 34069;
			local11.method2265(local132, this.aClass164_Sub1_1);
			local11.method2258(0);
			if (!local11.method2261()) {
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
		local11.method2253(0);
		this.aClass4_Sub3_19.method5276(local11);
		this.aClass4_Sub3_19.method5245(1);
		this.aClass4_Sub3_19.method5250(null);
		this.aClass4_Sub3_19.method5266(8448, 8448);
		this.aClass4_Sub3_19.method5245(0);
		this.aClass4_Sub3_19.method5250(null);
		OpenGL.glPopAttrib();
		this.aClass4_Sub3_19.N(Static446.anIntArray726[0], Static446.anIntArray726[1], Static446.anIntArray726[2], Static446.anIntArray726[3]);
		if (local7 && !this.aClass4_Sub3_19.aBoolean437) {
			this.aClass164_Sub1_1.method8145();
		}
		return local7;
	}
}
