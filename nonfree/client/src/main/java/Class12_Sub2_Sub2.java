import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class12_Sub2_Sub2 extends Class12_Sub2 {

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Lclient!ep;")
	private final Class95_Sub1 aClass95_Sub1_43;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "Lclient!rh;")
	private final Class65_Sub4 aClass65_Sub4_2;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!ep;I)V")
	public Class12_Sub2_Sub2(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass95_Sub1_43 = arg0;
		this.aClass65_Sub4_2 = new Class65_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!rh;Lclient!rh;BF)Z")
	public boolean method8329(@OriginalArg(0) Class65_Sub4 arg0, @OriginalArg(1) Class65_Sub4 arg1, @OriginalArg(3) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class333 local11 = this.aClass95_Sub1_43.aClass333_2;
		this.aClass95_Sub1_43.K(Static584.anIntArray648);
		this.aClass95_Sub1_43.la();
		this.aClass95_Sub1_43.method2056();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass65_Sub4_2.anInt8066, this.aClass65_Sub4_2.anInt8066);
		this.aClass95_Sub1_43.method2074(false);
		this.aClass95_Sub1_43.method2099(false);
		this.aClass95_Sub1_43.method2102(false);
		this.aClass95_Sub1_43.method2096(false);
		this.aClass95_Sub1_43.method2053(-2);
		this.aClass95_Sub1_43.method2098(1);
		this.aClass95_Sub1_43.method2078(0.0F, 0.0F, 0.0F, arg2);
		this.aClass95_Sub1_43.method2105(34165, 34165);
		this.aClass95_Sub1_43.method2077(arg1);
		this.aClass95_Sub1_43.method2098(0);
		this.aClass95_Sub1_43.method2106(1);
		this.aClass95_Sub1_43.method2077(arg0);
		this.aClass95_Sub1_43.method2090(local11);
		for (@Pc(125) int local125 = 0; local125 < 6; local125++) {
			@Pc(131) int local131 = local125 + 34069;
			local11.method7482(local131, this.aClass65_Sub4_2);
			local11.method7488(0);
			if (!local11.method7490()) {
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
		local11.method7485(0);
		this.aClass95_Sub1_43.method2070(local11);
		this.aClass95_Sub1_43.method2098(1);
		this.aClass95_Sub1_43.method2077(null);
		this.aClass95_Sub1_43.method2105(8448, 8448);
		this.aClass95_Sub1_43.method2098(0);
		this.aClass95_Sub1_43.method2077(null);
		OpenGL.glPopAttrib();
		this.aClass95_Sub1_43.KA(Static584.anIntArray648[0], Static584.anIntArray648[1], Static584.anIntArray648[2], Static584.anIntArray648[3]);
		if (local7 && !this.aClass95_Sub1_43.aBoolean193) {
			this.aClass65_Sub4_2.method6825();
		}
		return local7;
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(I)I")
	public int method8330() {
		return this.aClass65_Sub4_2.anInt8066;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)Lclient!rh;")
	@Override
	public Class65_Sub4 method8326() {
		return this.aClass65_Sub4_2;
	}
}
