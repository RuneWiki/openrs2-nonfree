import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!le", name = "p", descriptor = "Lclient!en;")
	private final Class90_Sub1 aClass90_Sub1_24;

	@OriginalMember(owner = "client!le", name = "q", descriptor = "Lclient!wg;")
	private final Class16_Sub4 aClass16_Sub4_1;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!en;I)V")
	public Class3_Sub1_Sub1(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass90_Sub1_24 = arg0;
		this.aClass16_Sub4_1 = new Class16_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(B)Lclient!wg;")
	@Override
	public Class16_Sub4 method5662() {
		return this.aClass16_Sub4_1;
	}

	@OriginalMember(owner = "client!le", name = "e", descriptor = "(B)I")
	public int method4400() {
		return this.aClass16_Sub4_1.anInt9867;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!wg;Lclient!wg;IF)Z")
	public boolean method4402(@OriginalArg(0) Class16_Sub4 arg0, @OriginalArg(1) Class16_Sub4 arg1, @OriginalArg(3) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class319 local11 = this.aClass90_Sub1_24.aClass319_1;
		this.aClass90_Sub1_24.A(Static42.anIntArray33);
		this.aClass90_Sub1_24.F();
		this.aClass90_Sub1_24.method2071();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass16_Sub4_1.anInt9867, this.aClass16_Sub4_1.anInt9867);
		this.aClass90_Sub1_24.method2100(false);
		this.aClass90_Sub1_24.method2099(false);
		this.aClass90_Sub1_24.method2101(false);
		this.aClass90_Sub1_24.method2127(false);
		this.aClass90_Sub1_24.method2111(-2);
		this.aClass90_Sub1_24.method2069(1);
		this.aClass90_Sub1_24.method2134(0.0F, 0.0F, 0.0F, arg2);
		this.aClass90_Sub1_24.method2120(34165, 34165);
		this.aClass90_Sub1_24.method2126(arg1);
		this.aClass90_Sub1_24.method2069(0);
		this.aClass90_Sub1_24.method2123(1);
		this.aClass90_Sub1_24.method2126(arg0);
		this.aClass90_Sub1_24.method2139(local11);
		for (@Pc(119) int local119 = 0; local119 < 6; local119++) {
			@Pc(126) int local126 = local119 + 34069;
			local11.method7191(this.aClass16_Sub4_1, local126);
			local11.method7201(0);
			if (!local11.method7196()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local126 == 34069) {
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
			} else if (local126 == 34070) {
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
			} else if (local126 == 34071) {
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
			} else if (local126 == 34072) {
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
			} else if (local126 == 34073) {
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
			} else if (local126 == 34074) {
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
		local11.method7190(0);
		this.aClass90_Sub1_24.method2107(local11);
		this.aClass90_Sub1_24.method2069(1);
		this.aClass90_Sub1_24.method2126(null);
		this.aClass90_Sub1_24.method2120(8448, 8448);
		this.aClass90_Sub1_24.method2069(0);
		this.aClass90_Sub1_24.method2126(null);
		OpenGL.glPopAttrib();
		this.aClass90_Sub1_24.ca(Static42.anIntArray33[0], Static42.anIntArray33[1], Static42.anIntArray33[2], Static42.anIntArray33[3]);
		if (local7 && !this.aClass90_Sub1_24.aBoolean172) {
			this.aClass16_Sub4_1.method7842();
		}
		return local7;
	}
}
