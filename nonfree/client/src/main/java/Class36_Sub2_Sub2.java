import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class36_Sub2_Sub2 extends Class36_Sub2 {

	@OriginalMember(owner = "client!mw", name = "y", descriptor = "Lclient!ag;")
	private final Class12_Sub1 aClass12_Sub1_26;

	@OriginalMember(owner = "client!mw", name = "w", descriptor = "Lclient!d;")
	private final Class52_Sub2 aClass52_Sub2_2;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!ag;I)V")
	public Class36_Sub2_Sub2(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass12_Sub1_26 = arg0;
		this.aClass52_Sub2_2 = new Class52_Sub2(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "(I)Lclient!d;")
	@Override
	public Class52_Sub2 method5045() {
		return this.aClass52_Sub2_2;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(FLclient!d;Lclient!d;Z)Z")
	public boolean method5049(@OriginalArg(0) float arg0, @OriginalArg(1) Class52_Sub2 arg1, @OriginalArg(2) Class52_Sub2 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class161 local11 = this.aClass12_Sub1_26.aClass161_2;
		this.aClass12_Sub1_26.oa(Static429.anIntArray498);
		this.aClass12_Sub1_26.JA();
		this.aClass12_Sub1_26.method429();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass52_Sub2_2.anInt1904, this.aClass52_Sub2_2.anInt1904);
		this.aClass12_Sub1_26.method381(false);
		this.aClass12_Sub1_26.method454(false);
		this.aClass12_Sub1_26.method390(false);
		this.aClass12_Sub1_26.method404(false);
		this.aClass12_Sub1_26.method444(-2);
		this.aClass12_Sub1_26.method376(1);
		this.aClass12_Sub1_26.method431(arg0, 0.0F, 0.0F, 0.0F);
		this.aClass12_Sub1_26.method420(34165, 34165);
		this.aClass12_Sub1_26.method378(arg2);
		this.aClass12_Sub1_26.method376(0);
		this.aClass12_Sub1_26.method401(1);
		this.aClass12_Sub1_26.method378(arg1);
		this.aClass12_Sub1_26.method424(local11);
		for (@Pc(117) int local117 = 0; local117 < 6; local117++) {
			@Pc(123) int local123 = local117 + 34069;
			local11.method3785(local123, this.aClass52_Sub2_2);
			local11.method3786(0);
			if (!local11.method3792()) {
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
		local11.method3784(0);
		this.aClass12_Sub1_26.method372(local11);
		this.aClass12_Sub1_26.method376(1);
		this.aClass12_Sub1_26.method378(null);
		this.aClass12_Sub1_26.method420(8448, 8448);
		this.aClass12_Sub1_26.method376(0);
		this.aClass12_Sub1_26.method378(null);
		OpenGL.glPopAttrib();
		this.aClass12_Sub1_26.da(Static429.anIntArray498[0], Static429.anIntArray498[1], Static429.anIntArray498[2], Static429.anIntArray498[3]);
		if (local7 && !this.aClass12_Sub1_26.aBoolean16) {
			this.aClass52_Sub2_2.method5639();
		}
		return local7;
	}

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "(B)I")
	public int method5053() {
		return this.aClass52_Sub2_2.anInt1904;
	}
}
