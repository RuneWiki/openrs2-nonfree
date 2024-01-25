import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class24_Sub1_Sub1 extends Class24_Sub1 {

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "Lclient!tt;")
	private final Class200_Sub2 aClass200_Sub2_23;

	@OriginalMember(owner = "client!ib", name = "r", descriptor = "Lclient!rh;")
	private final Class31_Sub4 aClass31_Sub4_1;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!tt;I)V")
	public Class24_Sub1_Sub1(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass200_Sub2_23 = arg0;
		this.aClass31_Sub4_1 = new Class31_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)Lclient!rh;")
	@Override
	public Class31_Sub4 method3334() {
		return this.aClass31_Sub4_1;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)I")
	public int method2350() {
		return this.aClass31_Sub4_1.anInt5796;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!rh;FLclient!rh;I)Z")
	public boolean method2351(@OriginalArg(0) Class31_Sub4 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class31_Sub4 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class11 local11 = this.aClass200_Sub2_23.aClass11_3;
		this.aClass200_Sub2_23.MA(Static363.anIntArray420);
		this.aClass200_Sub2_23.va();
		this.aClass200_Sub2_23.method5347();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, (double) 1);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass31_Sub4_1.anInt5796, this.aClass31_Sub4_1.anInt5796);
		this.aClass200_Sub2_23.method5338(false);
		this.aClass200_Sub2_23.method5271(false);
		this.aClass200_Sub2_23.method5302(false);
		this.aClass200_Sub2_23.method5269(false);
		this.aClass200_Sub2_23.method5288(-2);
		this.aClass200_Sub2_23.method5319(1);
		this.aClass200_Sub2_23.method5272(0.0F, 0.0F, arg1, 0.0F);
		this.aClass200_Sub2_23.method5304(34165, 34165);
		this.aClass200_Sub2_23.method5312(arg2);
		this.aClass200_Sub2_23.method5319(0);
		this.aClass200_Sub2_23.method5297(1);
		this.aClass200_Sub2_23.method5312(arg0);
		this.aClass200_Sub2_23.method5328(local11);
		for (@Pc(124) int local124 = 0; local124 < 6; local124++) {
			@Pc(130) int local130 = local124 + 34069;
			local11.method189(this.aClass31_Sub4_1, local130);
			local11.method191(0);
			if (!local11.method195()) {
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
		local11.method203(0);
		this.aClass200_Sub2_23.method5345(local11);
		this.aClass200_Sub2_23.method5319(1);
		this.aClass200_Sub2_23.method5312(null);
		this.aClass200_Sub2_23.method5304(8448, 8448);
		this.aClass200_Sub2_23.method5319(0);
		this.aClass200_Sub2_23.method5312(null);
		OpenGL.glPopAttrib();
		this.aClass200_Sub2_23.ba(Static363.anIntArray420[0], Static363.anIntArray420[1], Static363.anIntArray420[2], Static363.anIntArray420[3]);
		if (local7 && !this.aClass200_Sub2_23.bf) {
			this.aClass31_Sub4_1.method4588();
		}
		return local7;
	}
}
