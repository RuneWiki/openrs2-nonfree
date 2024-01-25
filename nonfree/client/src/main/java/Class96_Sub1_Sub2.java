import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class96_Sub1_Sub2 extends Class96_Sub1 {

	@OriginalMember(owner = "client!jh", name = "F", descriptor = "Lclient!vd;")
	private final Class51_Sub2 aClass51_Sub2_26;

	@OriginalMember(owner = "client!jh", name = "z", descriptor = "Lclient!ui;")
	private final Class59_Sub4 aClass59_Sub4_2;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!vd;I)V")
	public Class96_Sub1_Sub2(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass51_Sub2_26 = arg0;
		this.aClass59_Sub4_2 = new Class59_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)I")
	public int method2757() {
		return this.aClass59_Sub4_2.anInt6451;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)Lclient!ui;")
	@Override
	public Class59_Sub4 method2755() {
		return this.aClass59_Sub4_2;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!ui;IFLclient!ui;)Z")
	public boolean method2759(@OriginalArg(0) Class59_Sub4 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class59_Sub4 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class73 local11 = this.aClass51_Sub2_26.aClass73_6;
		this.aClass51_Sub2_26.da(Static61.anIntArray89);
		this.aClass51_Sub2_26.e();
		this.aClass51_Sub2_26.method5362();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass59_Sub4_2.anInt6451, this.aClass59_Sub4_2.anInt6451);
		this.aClass51_Sub2_26.method5414(false);
		this.aClass51_Sub2_26.method5392(false);
		this.aClass51_Sub2_26.method5389(false);
		this.aClass51_Sub2_26.method5375(false);
		this.aClass51_Sub2_26.method5431(-2);
		this.aClass51_Sub2_26.method5371(1);
		this.aClass51_Sub2_26.method5368(arg1, 0.0F, 0.0F, 0.0F);
		this.aClass51_Sub2_26.method5394(34165, 34165);
		this.aClass51_Sub2_26.method5364(arg2);
		this.aClass51_Sub2_26.method5371(0);
		this.aClass51_Sub2_26.method5400(1);
		this.aClass51_Sub2_26.method5364(arg0);
		this.aClass51_Sub2_26.method5386(local11);
		for (@Pc(123) int local123 = 0; local123 < 6; local123++) {
			@Pc(130) int local130 = local123 + 34069;
			local11.method1745(local130, this.aClass59_Sub4_2);
			local11.method1741(0);
			if (!local11.method1739()) {
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
		local11.method1740(0);
		this.aClass51_Sub2_26.method5372(local11);
		this.aClass51_Sub2_26.method5371(1);
		this.aClass51_Sub2_26.method5364(null);
		this.aClass51_Sub2_26.method5394(8448, 8448);
		this.aClass51_Sub2_26.method5371(0);
		this.aClass51_Sub2_26.method5364(null);
		OpenGL.glPopAttrib();
		this.aClass51_Sub2_26.OA(Static61.anIntArray89[0], Static61.anIntArray89[1], Static61.anIntArray89[2], Static61.anIntArray89[3]);
		if (local7 && !this.aClass51_Sub2_26.aBoolean448) {
			this.aClass59_Sub4_2.method5761();
		}
		return local7;
	}
}
