import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class58_Sub1_Sub1 extends Class58_Sub1 {

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "Lclient!os;")
	private final Class39_Sub3 aClass39_Sub3_18;

	@OriginalMember(owner = "client!ij", name = "o", descriptor = "Lclient!bo;")
	private final Class19_Sub1 aClass19_Sub1_1;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!os;I)V")
	public Class58_Sub1_Sub1(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass39_Sub3_18 = arg0;
		this.aClass19_Sub1_1 = new Class19_Sub1(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)Lclient!bo;")
	@Override
	public Class19_Sub1 method6988() {
		return this.aClass19_Sub1_1;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(FLclient!bo;ZLclient!bo;)Z")
	public boolean method3289(@OriginalArg(0) float arg0, @OriginalArg(1) Class19_Sub1 arg1, @OriginalArg(3) Class19_Sub1 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class293 local11 = this.aClass39_Sub3_18.aClass293_6;
		this.aClass39_Sub3_18.d(Static451.anIntArray627);
		this.aClass39_Sub3_18.n();
		this.aClass39_Sub3_18.method5741();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass19_Sub1_1.anInt815, this.aClass19_Sub1_1.anInt815);
		this.aClass39_Sub3_18.method5695(false);
		this.aClass39_Sub3_18.method5736(false);
		this.aClass39_Sub3_18.method5744(false);
		this.aClass39_Sub3_18.method5708(false);
		this.aClass39_Sub3_18.method5686(-2);
		this.aClass39_Sub3_18.method5750(1);
		this.aClass39_Sub3_18.method5745(0.0F, 0.0F, arg0, 0.0F);
		this.aClass39_Sub3_18.method5760(34165, 34165);
		this.aClass39_Sub3_18.method5719(arg1);
		this.aClass39_Sub3_18.method5750(0);
		this.aClass39_Sub3_18.method5699(1);
		this.aClass39_Sub3_18.method5719(arg2);
		this.aClass39_Sub3_18.method5697(local11);
		for (@Pc(117) int local117 = 0; local117 < 6; local117++) {
			@Pc(124) int local124 = local117 + 34069;
			local11.method7359(local124, this.aClass19_Sub1_1);
			local11.method7361(0);
			if (!local11.method7368()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local124 == 34069) {
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
			} else if (local124 == 34070) {
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
			} else if (local124 == 34071) {
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
			} else if (local124 == 34072) {
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
			} else if (local124 == 34073) {
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
			} else if (local124 == 34074) {
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
		local11.method7367(0);
		this.aClass39_Sub3_18.method5696(local11);
		this.aClass39_Sub3_18.method5750(1);
		this.aClass39_Sub3_18.method5719(null);
		this.aClass39_Sub3_18.method5760(8448, 8448);
		this.aClass39_Sub3_18.method5750(0);
		this.aClass39_Sub3_18.method5719(null);
		OpenGL.glPopAttrib();
		this.aClass39_Sub3_18.N(Static451.anIntArray627[0], Static451.anIntArray627[1], Static451.anIntArray627[2], Static451.anIntArray627[3]);
		if (local7 && !this.aClass39_Sub3_18.aBoolean501) {
			this.aClass19_Sub1_1.method4808();
		}
		return local7;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)I")
	public int method3290() {
		return this.aClass19_Sub1_1.anInt815;
	}
}
