import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public final class Class78_Sub1_Sub2 extends Class78_Sub1 {

	@OriginalMember(owner = "client!qda", name = "q", descriptor = "Lclient!qo;")
	private final Class20_Sub3 aClass20_Sub3_30;

	@OriginalMember(owner = "client!qda", name = "k", descriptor = "Lclient!q;")
	private final Class85_Sub3 aClass85_Sub3_2;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lclient!qo;I)V")
	public Class78_Sub1_Sub2(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass20_Sub3_30 = arg0;
		this.aClass85_Sub3_2 = new Class85_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!q;FILclient!q;)Z")
	public boolean method7095(@OriginalArg(0) Class85_Sub3 arg0, @OriginalArg(1) float arg1, @OriginalArg(3) Class85_Sub3 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class295 local11 = this.aClass20_Sub3_30.aClass295_5;
		this.aClass20_Sub3_30.K(Static173.anIntArray214);
		this.aClass20_Sub3_30.la();
		this.aClass20_Sub3_30.method7342();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass85_Sub3_2.anInt8238, this.aClass85_Sub3_2.anInt8238);
		this.aClass20_Sub3_30.method7394(false);
		this.aClass20_Sub3_30.method7315(false);
		this.aClass20_Sub3_30.method7339(false);
		this.aClass20_Sub3_30.method7335(false);
		this.aClass20_Sub3_30.method7344(-2);
		this.aClass20_Sub3_30.method7325(1);
		this.aClass20_Sub3_30.method7336(arg1, 0.0F, 0.0F, 0.0F);
		this.aClass20_Sub3_30.method7316(34165, 34165);
		this.aClass20_Sub3_30.method7358(arg2);
		this.aClass20_Sub3_30.method7325(0);
		this.aClass20_Sub3_30.method7348(1);
		this.aClass20_Sub3_30.method7358(arg0);
		this.aClass20_Sub3_30.method7360(local11);
		for (@Pc(125) int local125 = 0; local125 < 6; local125++) {
			@Pc(131) int local131 = local125 + 34069;
			local11.method7560(local131, this.aClass85_Sub3_2);
			local11.method7565(0);
			if (!local11.method7569()) {
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
		local11.method7562(0);
		this.aClass20_Sub3_30.method7357(local11);
		this.aClass20_Sub3_30.method7325(1);
		this.aClass20_Sub3_30.method7358(null);
		this.aClass20_Sub3_30.method7316(8448, 8448);
		this.aClass20_Sub3_30.method7325(0);
		this.aClass20_Sub3_30.method7358(null);
		OpenGL.glPopAttrib();
		this.aClass20_Sub3_30.KA(Static173.anIntArray214[0], Static173.anIntArray214[1], Static173.anIntArray214[2], Static173.anIntArray214[3]);
		if (local7 && !this.aClass20_Sub3_30.aBoolean633) {
			this.aClass85_Sub3_2.method9095();
		}
		return local7;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)Lclient!q;")
	@Override
	public Class85_Sub3 method7091() {
		return this.aClass85_Sub3_2;
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)I")
	public int method7096() {
		return this.aClass85_Sub3_2.anInt8238;
	}
}
