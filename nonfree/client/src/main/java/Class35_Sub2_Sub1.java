import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class35_Sub2_Sub1 extends Class35_Sub2 {

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "Lclient!dia;")
	private final Class13_Sub2 aClass13_Sub2_7;

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "Lclient!efa;")
	private final Class85_Sub1 aClass85_Sub1_1;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!dia;I)V")
	public Class35_Sub2_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass13_Sub2_7 = arg0;
		this.aClass85_Sub1_1 = new Class85_Sub1(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)I")
	public int method1837() {
		return this.aClass85_Sub1_1.anInt2641;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILclient!efa;Lclient!efa;F)Z")
	public boolean method1838(@OriginalArg(1) Class85_Sub1 arg0, @OriginalArg(2) Class85_Sub1 arg1, @OriginalArg(3) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class221 local11 = this.aClass13_Sub2_7.aClass221_4;
		this.aClass13_Sub2_7.K(Static628.anIntArray871);
		this.aClass13_Sub2_7.la();
		this.aClass13_Sub2_7.method2000();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass85_Sub1_1.anInt2641, this.aClass85_Sub1_1.anInt2641);
		this.aClass13_Sub2_7.method2013(false);
		this.aClass13_Sub2_7.method1988(false);
		this.aClass13_Sub2_7.method1958(false);
		this.aClass13_Sub2_7.method1954(false);
		this.aClass13_Sub2_7.method2011(-2);
		this.aClass13_Sub2_7.method2008(1);
		this.aClass13_Sub2_7.method1983(0.0F, 0.0F, arg2, 0.0F);
		this.aClass13_Sub2_7.method1993(34165, 34165);
		this.aClass13_Sub2_7.method2024(arg0);
		this.aClass13_Sub2_7.method2008(0);
		this.aClass13_Sub2_7.method1960(1);
		this.aClass13_Sub2_7.method2024(arg1);
		this.aClass13_Sub2_7.method2009(local11);
		for (@Pc(124) int local124 = 0; local124 < 6; local124++) {
			@Pc(131) int local131 = local124 + 34069;
			local11.method5431(this.aClass85_Sub1_1, local131);
			local11.method5436(0);
			if (!local11.method5428()) {
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
		local11.method5433(0);
		this.aClass13_Sub2_7.method1992(local11);
		this.aClass13_Sub2_7.method2008(1);
		this.aClass13_Sub2_7.method2024((Class85) null);
		this.aClass13_Sub2_7.method1993(8448, 8448);
		this.aClass13_Sub2_7.method2008(0);
		this.aClass13_Sub2_7.method2024((Class85) null);
		OpenGL.glPopAttrib();
		this.aClass13_Sub2_7.KA(Static628.anIntArray871[0], Static628.anIntArray871[1], Static628.anIntArray871[2], Static628.anIntArray871[3]);
		if (local7 && !this.aClass13_Sub2_7.aBoolean183) {
			this.aClass85_Sub1_1.method7878();
		}
		return local7;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)Lclient!efa;")
	@Override
	public Class85_Sub1 method5092() {
		return this.aClass85_Sub1_1;
	}
}
