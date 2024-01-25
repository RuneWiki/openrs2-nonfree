import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!to", name = "x", descriptor = "Lclient!lea;")
	private final Class101_Sub2 aClass101_Sub2_38;

	@OriginalMember(owner = "client!to", name = "n", descriptor = "Lclient!oh;")
	private final Class50_Sub3 aClass50_Sub3_2;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!lea;I)V")
	public Class3_Sub1_Sub2(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass101_Sub2_38 = arg0;
		this.aClass50_Sub3_2 = new Class50_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!oh;Lclient!oh;IF)Z")
	public boolean method8767(@OriginalArg(0) Class50_Sub3 arg0, @OriginalArg(1) Class50_Sub3 arg1, @OriginalArg(3) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class39 local11 = this.aClass101_Sub2_38.aClass39_2;
		this.aClass101_Sub2_38.K(Static600.anIntArray553);
		this.aClass101_Sub2_38.la();
		this.aClass101_Sub2_38.method5646();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass50_Sub3_2.anInt7870, this.aClass50_Sub3_2.anInt7870);
		this.aClass101_Sub2_38.method5632(false);
		this.aClass101_Sub2_38.method5691(false);
		this.aClass101_Sub2_38.method5693(false);
		this.aClass101_Sub2_38.method5683(false);
		this.aClass101_Sub2_38.method5670(-2);
		this.aClass101_Sub2_38.method5627(1);
		this.aClass101_Sub2_38.method5667(0.0F, 0.0F, arg2, 0.0F);
		this.aClass101_Sub2_38.method5665(34165, 34165);
		this.aClass101_Sub2_38.method5690(arg1);
		this.aClass101_Sub2_38.method5627(0);
		this.aClass101_Sub2_38.method5681(1);
		this.aClass101_Sub2_38.method5690(arg0);
		this.aClass101_Sub2_38.method5613(local11);
		for (@Pc(119) int local119 = 0; local119 < 6; local119++) {
			@Pc(125) int local125 = local119 + 34069;
			local11.method1118(this.aClass50_Sub3_2, local125);
			local11.method1109(0);
			if (!local11.method1110()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local125 == 34069) {
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
			} else if (local125 == 34070) {
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
			} else if (local125 == 34071) {
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
			} else if (local125 == 34072) {
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
			} else if (local125 == 34073) {
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
			} else if (local125 == 34074) {
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
		local11.method1114(0);
		this.aClass101_Sub2_38.method5678(local11);
		this.aClass101_Sub2_38.method5627(1);
		this.aClass101_Sub2_38.method5690((Class50) null);
		this.aClass101_Sub2_38.method5665(8448, 8448);
		this.aClass101_Sub2_38.method5627(0);
		this.aClass101_Sub2_38.method5690((Class50) null);
		OpenGL.glPopAttrib();
		this.aClass101_Sub2_38.KA(Static600.anIntArray553[0], Static600.anIntArray553[1], Static600.anIntArray553[2], Static600.anIntArray553[3]);
		if (local7 && !this.aClass101_Sub2_38.aBoolean465) {
			this.aClass50_Sub3_2.method9142();
		}
		return local7;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)I")
	public int method8770() {
		return this.aClass50_Sub3_2.anInt7870;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)Lclient!oh;")
	@Override
	public Class50_Sub3 method8765() {
		return this.aClass50_Sub3_2;
	}
}
