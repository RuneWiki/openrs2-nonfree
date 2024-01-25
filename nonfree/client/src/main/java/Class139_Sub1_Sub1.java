import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class139_Sub1_Sub1 extends Class139_Sub1 {

	@OriginalMember(owner = "client!po", name = "v", descriptor = "Lclient!nq;")
	private final Class167_Sub1 aClass167_Sub1_31;

	@OriginalMember(owner = "client!po", name = "s", descriptor = "Lclient!us;")
	private final Class137_Sub4 aClass137_Sub4_1;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!nq;I)V")
	public Class139_Sub1_Sub1(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass167_Sub1_31 = arg0;
		this.aClass137_Sub4_1 = new Class137_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!us;ILclient!us;F)Z")
	public boolean method4480(@OriginalArg(0) Class137_Sub4 arg0, @OriginalArg(2) Class137_Sub4 arg1, @OriginalArg(3) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class224 local11 = this.aClass167_Sub1_31.aClass224_4;
		this.aClass167_Sub1_31.p(Static23.anIntArray11);
		this.aClass167_Sub1_31.H();
		this.aClass167_Sub1_31.method3972();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass137_Sub4_1.anInt7153, this.aClass137_Sub4_1.anInt7153);
		this.aClass167_Sub1_31.method4022(false);
		this.aClass167_Sub1_31.method3971(false);
		this.aClass167_Sub1_31.method4017(false);
		this.aClass167_Sub1_31.method4036(false);
		this.aClass167_Sub1_31.method3968(-2);
		this.aClass167_Sub1_31.method3993(1);
		this.aClass167_Sub1_31.method3973(0.0F, 0.0F, arg2, 0.0F);
		this.aClass167_Sub1_31.method3983(34165, 34165);
		this.aClass167_Sub1_31.method4028(arg0);
		this.aClass167_Sub1_31.method3993(0);
		this.aClass167_Sub1_31.method3998(1);
		this.aClass167_Sub1_31.method4028(arg1);
		this.aClass167_Sub1_31.method4024(local11);
		for (@Pc(125) int local125 = 0; local125 < 6; local125++) {
			@Pc(131) int local131 = local125 + 34069;
			local11.method5229(this.aClass137_Sub4_1, local131);
			local11.method5228(0);
			if (!local11.method5230()) {
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
		local11.method5234(0);
		this.aClass167_Sub1_31.method4008(local11);
		this.aClass167_Sub1_31.method3993(1);
		this.aClass167_Sub1_31.method4028(null);
		this.aClass167_Sub1_31.method3983(8448, 8448);
		this.aClass167_Sub1_31.method3993(0);
		this.aClass167_Sub1_31.method4028(null);
		OpenGL.glPopAttrib();
		this.aClass167_Sub1_31.w(Static23.anIntArray11[0], Static23.anIntArray11[1], Static23.anIntArray11[2], Static23.anIntArray11[3]);
		if (local7 && !this.aClass167_Sub1_31.aBoolean345) {
			this.aClass137_Sub4_1.method5782();
		}
		return local7;
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(I)Lclient!us;")
	@Override
	public Class137_Sub4 method5201() {
		return this.aClass137_Sub4_1;
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(I)I")
	public int method4481() {
		return this.aClass137_Sub4_1.anInt7153;
	}
}
