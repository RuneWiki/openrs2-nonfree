import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class74_Sub2_Sub1 extends Class74_Sub2 {

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "Lclient!uja;")
	private final Class145_Sub3 aClass145_Sub3_33;

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "Lclient!el;")
	private final Class64_Sub2 aClass64_Sub2_1;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!uja;I)V")
	public Class74_Sub2_Sub1(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass145_Sub3_33 = arg0;
		this.aClass64_Sub2_1 = new Class64_Sub2(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)Lclient!el;")
	@Override
	public Class64_Sub2 method7519() {
		return this.aClass64_Sub2_1;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IFLclient!el;Lclient!el;)Z")
	public boolean method7158(@OriginalArg(1) float arg0, @OriginalArg(2) Class64_Sub2 arg1, @OriginalArg(3) Class64_Sub2 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class155 local11 = this.aClass145_Sub3_33.aClass155_7;
		this.aClass145_Sub3_33.K(Static562.anIntArray638);
		this.aClass145_Sub3_33.la();
		this.aClass145_Sub3_33.method8855();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass64_Sub2_1.anInt2502, this.aClass64_Sub2_1.anInt2502);
		this.aClass145_Sub3_33.method8885(false);
		this.aClass145_Sub3_33.method8907(false);
		this.aClass145_Sub3_33.method8844(false);
		this.aClass145_Sub3_33.method8905(false);
		this.aClass145_Sub3_33.method8881(-2);
		this.aClass145_Sub3_33.method8859(1);
		this.aClass145_Sub3_33.method8856(0.0F, 0.0F, 0.0F, arg0);
		this.aClass145_Sub3_33.method8897(34165, 34165);
		this.aClass145_Sub3_33.method8872(arg2);
		this.aClass145_Sub3_33.method8859(0);
		this.aClass145_Sub3_33.method8900(1);
		this.aClass145_Sub3_33.method8872(arg1);
		this.aClass145_Sub3_33.method8906(local11);
		for (@Pc(121) int local121 = 0; local121 < 6; local121++) {
			@Pc(131) int local131 = local121 + 34069;
			local11.method3388(this.aClass64_Sub2_1, local131);
			local11.method3389(0);
			if (!local11.method3383()) {
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
		local11.method3380(0);
		this.aClass145_Sub3_33.method8863(local11);
		this.aClass145_Sub3_33.method8859(1);
		this.aClass145_Sub3_33.method8872((Class64) null);
		this.aClass145_Sub3_33.method8897(8448, 8448);
		this.aClass145_Sub3_33.method8859(0);
		this.aClass145_Sub3_33.method8872((Class64) null);
		OpenGL.glPopAttrib();
		this.aClass145_Sub3_33.KA(Static562.anIntArray638[0], Static562.anIntArray638[1], Static562.anIntArray638[2], Static562.anIntArray638[3]);
		if (local7 && !this.aClass145_Sub3_33.aBoolean855) {
			this.aClass64_Sub2_1.method4538();
		}
		return local7;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)I")
	public int method7159() {
		return this.aClass64_Sub2_1.anInt2502;
	}
}
