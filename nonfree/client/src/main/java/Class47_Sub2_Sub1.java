import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class47_Sub2_Sub1 extends Class47_Sub2 {

	@OriginalMember(owner = "client!em", name = "q", descriptor = "Lclient!er;")
	private final Class31_Sub2 aClass31_Sub2_15;

	@OriginalMember(owner = "client!em", name = "k", descriptor = "Lclient!qn;")
	private final Class50_Sub4 aClass50_Sub4_1;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!er;I)V")
	public Class47_Sub2_Sub1(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass31_Sub2_15 = arg0;
		this.aClass50_Sub4_1 = new Class50_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!em", name = "d", descriptor = "(I)Lclient!qn;")
	@Override
	public Class50_Sub4 method3299() {
		return this.aClass50_Sub4_1;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(B)I")
	public int method2386() {
		return this.aClass50_Sub4_1.anInt7847;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ILclient!qn;Lclient!qn;F)Z")
	public boolean method2387(@OriginalArg(1) Class50_Sub4 arg0, @OriginalArg(2) Class50_Sub4 arg1, @OriginalArg(3) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class219 local11 = this.aClass31_Sub2_15.aClass219_2;
		this.aClass31_Sub2_15.oa(Static521.anIntArray534);
		this.aClass31_Sub2_15.JA();
		this.aClass31_Sub2_15.method2547();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass50_Sub4_1.anInt7847, this.aClass50_Sub4_1.anInt7847);
		this.aClass31_Sub2_15.method2561(false);
		this.aClass31_Sub2_15.method2545(false);
		this.aClass31_Sub2_15.method2548(false);
		this.aClass31_Sub2_15.method2556(false);
		this.aClass31_Sub2_15.method2566(-2);
		this.aClass31_Sub2_15.method2513(1);
		this.aClass31_Sub2_15.method2524(0.0F, arg2, 0.0F, 0.0F);
		this.aClass31_Sub2_15.method2536(34165, 34165);
		this.aClass31_Sub2_15.method2535(arg0);
		this.aClass31_Sub2_15.method2513(0);
		this.aClass31_Sub2_15.method2495(1);
		this.aClass31_Sub2_15.method2535(arg1);
		this.aClass31_Sub2_15.method2560(local11);
		for (@Pc(129) int local129 = 0; local129 < 6; local129++) {
			@Pc(135) int local135 = local129 + 34069;
			local11.method5050(this.aClass50_Sub4_1, local135);
			local11.method5043(0);
			if (!local11.method5046()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local135 == 34069) {
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
			} else if (local135 == 34070) {
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
			} else if (local135 == 34071) {
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
			} else if (local135 == 34072) {
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
			} else if (local135 == 34073) {
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
			} else if (local135 == 34074) {
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
		local11.method5042(0);
		this.aClass31_Sub2_15.method2507(local11);
		this.aClass31_Sub2_15.method2513(1);
		this.aClass31_Sub2_15.method2535(null);
		this.aClass31_Sub2_15.method2536(8448, 8448);
		this.aClass31_Sub2_15.method2513(0);
		this.aClass31_Sub2_15.method2535(null);
		OpenGL.glPopAttrib();
		this.aClass31_Sub2_15.da(Static521.anIntArray534[0], Static521.anIntArray534[1], Static521.anIntArray534[2], Static521.anIntArray534[3]);
		if (local7 && !this.aClass31_Sub2_15.aBoolean210) {
			this.aClass50_Sub4_1.method6152();
		}
		return local7;
	}
}
