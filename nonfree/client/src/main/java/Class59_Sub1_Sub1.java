import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class59_Sub1_Sub1 extends Class59_Sub1 {

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "Lclient!ih;")
	private final Class117_Sub1 aClass117_Sub1_20;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "Lclient!aw;")
	private final Class23_Sub1 aClass23_Sub1_1;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!ih;I)V")
	public Class59_Sub1_Sub1(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass117_Sub1_20 = arg0;
		this.aClass23_Sub1_1 = new Class23_Sub1(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)Lclient!aw;")
	@Override
	public Class23_Sub1 method3888() {
		return this.aClass23_Sub1_1;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!aw;Lclient!aw;FI)Z")
	public boolean method2776(@OriginalArg(0) Class23_Sub1 arg0, @OriginalArg(1) Class23_Sub1 arg1, @OriginalArg(2) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class90 local11 = this.aClass117_Sub1_20.aClass90_4;
		this.aClass117_Sub1_20.MA(Static28.anIntArray63);
		this.aClass117_Sub1_20.va();
		this.aClass117_Sub1_20.method2481();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass23_Sub1_1.anInt333, this.aClass23_Sub1_1.anInt333);
		this.aClass117_Sub1_20.method2513(false);
		this.aClass117_Sub1_20.method2498(false);
		this.aClass117_Sub1_20.method2462(false);
		this.aClass117_Sub1_20.method2469(false);
		this.aClass117_Sub1_20.method2531(-2);
		this.aClass117_Sub1_20.method2476(1);
		this.aClass117_Sub1_20.method2490(0.0F, 0.0F, arg2, 0.0F);
		this.aClass117_Sub1_20.method2471(34165, 34165);
		this.aClass117_Sub1_20.method2504(arg1);
		this.aClass117_Sub1_20.method2476(0);
		this.aClass117_Sub1_20.method2535(1);
		this.aClass117_Sub1_20.method2504(arg0);
		this.aClass117_Sub1_20.method2464(local11);
		for (@Pc(124) int local124 = 0; local124 < 6; local124++) {
			@Pc(130) int local130 = local124 + 34069;
			local11.method1644(this.aClass23_Sub1_1, local130);
			local11.method1658(0);
			if (!local11.method1659()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local130 == 34069) {
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
			} else if (local130 == 34070) {
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
			} else if (local130 == 34071) {
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
			} else if (local130 == 34072) {
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
			} else if (local130 == 34073) {
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
			} else if (local130 == 34074) {
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
		local11.method1649(0);
		this.aClass117_Sub1_20.method2467(local11);
		this.aClass117_Sub1_20.method2476(1);
		this.aClass117_Sub1_20.method2504(null);
		this.aClass117_Sub1_20.method2471(8448, 8448);
		this.aClass117_Sub1_20.method2476(0);
		this.aClass117_Sub1_20.method2504(null);
		OpenGL.glPopAttrib();
		this.aClass117_Sub1_20.ba(Static28.anIntArray63[0], Static28.anIntArray63[1], Static28.anIntArray63[2], Static28.anIntArray63[3]);
		if (local7 && !this.aClass117_Sub1_20.aBoolean293) {
			this.aClass23_Sub1_1.method5804();
		}
		return local7;
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)I")
	public int method2778() {
		return this.aClass23_Sub1_1.anInt333;
	}
}
