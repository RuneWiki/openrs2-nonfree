import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class66_Sub1_Sub2 extends Class66_Sub1 {

	@OriginalMember(owner = "client!mda", name = "o", descriptor = "Lclient!ad;")
	private final Class5_Sub1 aClass5_Sub1_23;

	@OriginalMember(owner = "client!mda", name = "j", descriptor = "Lclient!vda;")
	private final Class11_Sub4 aClass11_Sub4_2;

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lclient!ad;I)V")
	public Class66_Sub1_Sub2(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass5_Sub1_23 = arg0;
		this.aClass11_Sub4_2 = new Class11_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Z)Lclient!vda;")
	@Override
	public Class11_Sub4 method4936() {
		return this.aClass11_Sub4_2;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!vda;FILclient!vda;)Z")
	public boolean method4945(@OriginalArg(0) Class11_Sub4 arg0, @OriginalArg(1) float arg1, @OriginalArg(3) Class11_Sub4 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class141 local11 = this.aClass5_Sub1_23.aClass141_1;
		this.aClass5_Sub1_23.A(Static543.anIntArray778);
		this.aClass5_Sub1_23.F();
		this.aClass5_Sub1_23.method412();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass11_Sub4_2.anInt8895, this.aClass11_Sub4_2.anInt8895);
		this.aClass5_Sub1_23.method406(false);
		this.aClass5_Sub1_23.method454(false);
		this.aClass5_Sub1_23.method388(false);
		this.aClass5_Sub1_23.method413(false);
		this.aClass5_Sub1_23.method414(-2);
		this.aClass5_Sub1_23.method397(1);
		this.aClass5_Sub1_23.method450(0.0F, 0.0F, arg1, 0.0F);
		this.aClass5_Sub1_23.method448(34165, 34165);
		this.aClass5_Sub1_23.method423(arg0);
		this.aClass5_Sub1_23.method397(0);
		this.aClass5_Sub1_23.method416(1);
		this.aClass5_Sub1_23.method423(arg2);
		this.aClass5_Sub1_23.method394(local11);
		for (@Pc(117) int local117 = 0; local117 < 6; local117++) {
			@Pc(123) int local123 = local117 + 34069;
			local11.method3973(this.aClass11_Sub4_2, local123);
			local11.method3975(0);
			if (!local11.method3977()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local123 == 34069) {
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
			} else if (local123 == 34070) {
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
			} else if (local123 == 34071) {
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
			} else if (local123 == 34072) {
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
			} else if (local123 == 34073) {
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
			} else if (local123 == 34074) {
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
		local11.method3978(0);
		this.aClass5_Sub1_23.method389(local11);
		this.aClass5_Sub1_23.method397(1);
		this.aClass5_Sub1_23.method423(null);
		this.aClass5_Sub1_23.method448(8448, 8448);
		this.aClass5_Sub1_23.method397(0);
		this.aClass5_Sub1_23.method423(null);
		OpenGL.glPopAttrib();
		this.aClass5_Sub1_23.ca(Static543.anIntArray778[0], Static543.anIntArray778[1], Static543.anIntArray778[2], Static543.anIntArray778[3]);
		if (local7 && !this.aClass5_Sub1_23.aBoolean28) {
			this.aClass11_Sub4_2.method7309();
		}
		return local7;
	}

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "(I)I")
	public int method4946() {
		return this.aClass11_Sub4_2.anInt8895;
	}
}
