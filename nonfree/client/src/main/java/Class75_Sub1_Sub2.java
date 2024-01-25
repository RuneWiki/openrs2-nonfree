import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class75_Sub1_Sub2 extends Class75_Sub1 {

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "Lclient!no;")
	private final Class66_Sub3 aClass66_Sub3_43;

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "Lclient!jk;")
	private final Class114_Sub3 aClass114_Sub3_2;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!no;I)V")
	public Class75_Sub1_Sub2(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass66_Sub3_43 = arg0;
		this.aClass114_Sub3_2 = new Class114_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!jk;ZFLclient!jk;)Z")
	public boolean method7909(@OriginalArg(0) Class114_Sub3 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class114_Sub3 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class347 local11 = this.aClass66_Sub3_43.aClass347_4;
		this.aClass66_Sub3_43.A(Static47.anIntArray136);
		this.aClass66_Sub3_43.F();
		this.aClass66_Sub3_43.method5365();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass114_Sub3_2.anInt4933, this.aClass114_Sub3_2.anInt4933);
		this.aClass66_Sub3_43.method5371(false);
		this.aClass66_Sub3_43.method5405(false);
		this.aClass66_Sub3_43.method5384(false);
		this.aClass66_Sub3_43.method5432(false);
		this.aClass66_Sub3_43.method5431(-2);
		this.aClass66_Sub3_43.method5381(1);
		this.aClass66_Sub3_43.method5437(arg1, 0.0F, 0.0F, 0.0F);
		this.aClass66_Sub3_43.method5396(34165, 34165);
		this.aClass66_Sub3_43.method5382(arg0);
		this.aClass66_Sub3_43.method5381(0);
		this.aClass66_Sub3_43.method5355(1);
		this.aClass66_Sub3_43.method5382(arg2);
		this.aClass66_Sub3_43.method5391(local11);
		for (@Pc(117) int local117 = 0; local117 < 6; local117++) {
			@Pc(124) int local124 = local117 + 34069;
			local11.method7685(this.aClass114_Sub3_2, local124);
			local11.method7691(0);
			if (!local11.method7689()) {
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
		local11.method7686(0);
		this.aClass66_Sub3_43.method5410(local11);
		this.aClass66_Sub3_43.method5381(1);
		this.aClass66_Sub3_43.method5382(null);
		this.aClass66_Sub3_43.method5396(8448, 8448);
		this.aClass66_Sub3_43.method5381(0);
		this.aClass66_Sub3_43.method5382(null);
		OpenGL.glPopAttrib();
		this.aClass66_Sub3_43.ca(Static47.anIntArray136[0], Static47.anIntArray136[1], Static47.anIntArray136[2], Static47.anIntArray136[3]);
		if (local7 && !this.aClass66_Sub3_43.aBoolean491) {
			this.aClass114_Sub3_2.method5003();
		}
		return local7;
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)I")
	public int method7910() {
		return this.aClass114_Sub3_2.anInt4933;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)Lclient!jk;")
	@Override
	public Class114_Sub3 method7904() {
		return this.aClass114_Sub3_2;
	}
}
