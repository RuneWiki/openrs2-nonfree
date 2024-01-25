import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class86_Sub1_Sub2 extends Class86_Sub1 {

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "Lclient!ih;")
	private final Class106_Sub2 aClass106_Sub2_32;

	@OriginalMember(owner = "client!lp", name = "q", descriptor = "Lclient!hg;")
	private final Class8_Sub3 aClass8_Sub3_2;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!ih;I)V")
	public Class86_Sub1_Sub2(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass106_Sub2_32 = arg0;
		this.aClass8_Sub3_2 = new Class8_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IFLclient!hg;Lclient!hg;)Z")
	public boolean method3604(@OriginalArg(1) float arg0, @OriginalArg(2) Class8_Sub3 arg1, @OriginalArg(3) Class8_Sub3 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class131 local11 = this.aClass106_Sub2_32.aClass131_1;
		this.aClass106_Sub2_32.MA(Static58.anIntArray136);
		this.aClass106_Sub2_32.va();
		this.aClass106_Sub2_32.method2849();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass8_Sub3_2.anInt3226, this.aClass8_Sub3_2.anInt3226);
		this.aClass106_Sub2_32.method2846(false);
		this.aClass106_Sub2_32.method2858(false);
		this.aClass106_Sub2_32.method2922(false);
		this.aClass106_Sub2_32.method2914(false);
		this.aClass106_Sub2_32.method2904(-2);
		this.aClass106_Sub2_32.method2881(1);
		this.aClass106_Sub2_32.method2896(0.0F, arg0, 0.0F, 0.0F);
		this.aClass106_Sub2_32.method2923(34165, 34165);
		this.aClass106_Sub2_32.method2912(arg1);
		this.aClass106_Sub2_32.method2881(0);
		this.aClass106_Sub2_32.method2851(1);
		this.aClass106_Sub2_32.method2912(arg2);
		this.aClass106_Sub2_32.method2870(local11);
		for (@Pc(125) int local125 = 0; local125 < 6; local125++) {
			@Pc(131) int local131 = local125 + 34069;
			local11.method3155(local131, this.aClass8_Sub3_2);
			local11.method3139(0);
			if (!local11.method3154()) {
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
		local11.method3146(0);
		this.aClass106_Sub2_32.method2857(local11);
		this.aClass106_Sub2_32.method2881(1);
		this.aClass106_Sub2_32.method2912(null);
		this.aClass106_Sub2_32.method2923(8448, 8448);
		this.aClass106_Sub2_32.method2881(0);
		this.aClass106_Sub2_32.method2912(null);
		OpenGL.glPopAttrib();
		this.aClass106_Sub2_32.ba(Static58.anIntArray136[0], Static58.anIntArray136[1], Static58.anIntArray136[2], Static58.anIntArray136[3]);
		if (local7 && !this.aClass106_Sub2_32.aBoolean209) {
			this.aClass8_Sub3_2.method3070();
		}
		return local7;
	}

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "(I)I")
	public int method3605() {
		return this.aClass8_Sub3_2.anInt3226;
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)Lclient!hg;")
	@Override
	public Class8_Sub3 method3600() {
		return this.aClass8_Sub3_2;
	}
}
