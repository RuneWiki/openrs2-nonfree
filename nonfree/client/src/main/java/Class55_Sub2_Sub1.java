import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class55_Sub2_Sub1 extends Class55_Sub2 {

	@OriginalMember(owner = "client!en", name = "y", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!en", name = "w", descriptor = "Lclient!us;")
	private final Class43_Sub3 aClass43_Sub3_14;

	@OriginalMember(owner = "client!en", name = "x", descriptor = "Lclient!mda;")
	private final Class34_Sub4 aClass34_Sub4_1;

	static {
		for (@Pc(296) int local296 = 0; local296 < 100; local296++) {
			aRectangleArray1[local296] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!us;I)V")
	public Class55_Sub2_Sub1(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass43_Sub3_14 = arg0;
		this.aClass34_Sub4_1 = new Class34_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(FLclient!mda;Lclient!mda;B)Z")
	public boolean method2506(@OriginalArg(0) float arg0, @OriginalArg(1) Class34_Sub4 arg1, @OriginalArg(2) Class34_Sub4 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class293 local11 = this.aClass43_Sub3_14.aClass293_7;
		this.aClass43_Sub3_14.oa(Static468.anIntArray593);
		this.aClass43_Sub3_14.JA();
		this.aClass43_Sub3_14.method7278();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass34_Sub4_1.anInt5777, this.aClass34_Sub4_1.anInt5777);
		this.aClass43_Sub3_14.method7248(false);
		this.aClass43_Sub3_14.method7298(false);
		this.aClass43_Sub3_14.method7245(false);
		this.aClass43_Sub3_14.method7239(false);
		this.aClass43_Sub3_14.method7294(-2);
		this.aClass43_Sub3_14.method7277(1);
		this.aClass43_Sub3_14.method7284(0.0F, arg0, 0.0F, 0.0F);
		this.aClass43_Sub3_14.method7287(34165, 34165);
		this.aClass43_Sub3_14.method7220(arg2);
		this.aClass43_Sub3_14.method7277(0);
		this.aClass43_Sub3_14.method7281(1);
		this.aClass43_Sub3_14.method7220(arg1);
		this.aClass43_Sub3_14.method7247(local11);
		for (@Pc(125) int local125 = 0; local125 < 6; local125++) {
			@Pc(132) int local132 = local125 + 34069;
			local11.method6419(this.aClass34_Sub4_1, local132);
			local11.method6412(0);
			if (!local11.method6416()) {
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
		local11.method6411(0);
		this.aClass43_Sub3_14.method7286(local11);
		this.aClass43_Sub3_14.method7277(1);
		this.aClass43_Sub3_14.method7220(null);
		this.aClass43_Sub3_14.method7287(8448, 8448);
		this.aClass43_Sub3_14.method7277(0);
		this.aClass43_Sub3_14.method7220(null);
		OpenGL.glPopAttrib();
		this.aClass43_Sub3_14.da(Static468.anIntArray593[0], Static468.anIntArray593[1], Static468.anIntArray593[2], Static468.anIntArray593[3]);
		if (local7 && !this.aClass43_Sub3_14.aBoolean686) {
			this.aClass34_Sub4_1.method4975();
		}
		return local7;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)Lclient!mda;")
	@Override
	public Class34_Sub4 method6930() {
		return this.aClass34_Sub4_1;
	}

	@OriginalMember(owner = "client!en", name = "f", descriptor = "(I)I")
	public int method2511() {
		return this.aClass34_Sub4_1.anInt5777;
	}
}
