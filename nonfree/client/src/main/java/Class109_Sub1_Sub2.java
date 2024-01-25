import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class109_Sub1_Sub2 extends Class109_Sub1 {

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "Lclient!pg;")
	private final Class163_Sub2 aClass163_Sub2_37;

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "Lclient!gi;")
	private final Class20_Sub3 aClass20_Sub3_2;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lclient!pg;I)V")
	public Class109_Sub1_Sub2(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass163_Sub2_37 = arg0;
		this.aClass20_Sub3_2 = new Class20_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)I")
	public int method4790() {
		return this.aClass20_Sub3_2.anInt2389;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(FBLclient!gi;Lclient!gi;)Z")
	public boolean method4792(@OriginalArg(0) float arg0, @OriginalArg(2) Class20_Sub3 arg1, @OriginalArg(3) Class20_Sub3 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class61 local11 = this.aClass163_Sub2_37.aClass61_6;
		this.aClass163_Sub2_37.MA(Static140.anIntArray195);
		this.aClass163_Sub2_37.va();
		this.aClass163_Sub2_37.method4179();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass20_Sub3_2.anInt2389, this.aClass20_Sub3_2.anInt2389);
		this.aClass163_Sub2_37.method4161(false);
		this.aClass163_Sub2_37.method4177(false);
		this.aClass163_Sub2_37.method4157(false);
		this.aClass163_Sub2_37.method4166(false);
		this.aClass163_Sub2_37.method4139(-2);
		this.aClass163_Sub2_37.method4131(1);
		this.aClass163_Sub2_37.method4148(0.0F, 0.0F, arg0, 0.0F);
		this.aClass163_Sub2_37.method4164(34165, 34165);
		this.aClass163_Sub2_37.method4118(arg2);
		this.aClass163_Sub2_37.method4131(0);
		this.aClass163_Sub2_37.method4107(1);
		this.aClass163_Sub2_37.method4118(arg1);
		this.aClass163_Sub2_37.method4142(local11);
		for (@Pc(122) int local122 = 0; local122 < 6; local122++) {
			@Pc(128) int local128 = local122 + 34069;
			local11.method1408(local128, this.aClass20_Sub3_2);
			local11.method1402(0);
			if (!local11.method1410()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local128 == 34069) {
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
			} else if (local128 == 34070) {
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
			} else if (local128 == 34071) {
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
			} else if (local128 == 34072) {
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
			} else if (local128 == 34073) {
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
			} else if (local128 == 34074) {
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
		local11.method1407(0);
		this.aClass163_Sub2_37.method4111(local11);
		this.aClass163_Sub2_37.method4131(1);
		this.aClass163_Sub2_37.method4118(null);
		this.aClass163_Sub2_37.method4164(8448, 8448);
		this.aClass163_Sub2_37.method4131(0);
		this.aClass163_Sub2_37.method4118(null);
		OpenGL.glPopAttrib();
		this.aClass163_Sub2_37.ba(Static140.anIntArray195[0], Static140.anIntArray195[1], Static140.anIntArray195[2], Static140.anIntArray195[3]);
		if (local7 && !this.aClass163_Sub2_37.aBoolean371) {
			this.aClass20_Sub3_2.method3110();
		}
		return local7;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)Lclient!gi;")
	@Override
	public Class20_Sub3 method4787() {
		return this.aClass20_Sub3_2;
	}
}
