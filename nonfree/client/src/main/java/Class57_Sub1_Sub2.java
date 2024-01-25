import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class57_Sub1_Sub2 extends Class57_Sub1 {

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "Lclient!wh;")
	private final Class100_Sub3 aClass100_Sub3_17;

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "Lclient!nc;")
	private final Class3_Sub4 aClass3_Sub4_2;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lclient!wh;I)V")
	public Class57_Sub1_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass100_Sub3_17 = arg0;
		this.aClass3_Sub4_2 = new Class3_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(FLclient!nc;Lclient!nc;I)Z")
	public boolean method1537(@OriginalArg(0) float arg0, @OriginalArg(1) Class3_Sub4 arg1, @OriginalArg(2) Class3_Sub4 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class149 local11 = this.aClass100_Sub3_17.aClass149_7;
		this.aClass100_Sub3_17.K(Static27.anIntArray33);
		this.aClass100_Sub3_17.la();
		this.aClass100_Sub3_17.method8907();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, (double) 1, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass3_Sub4_2.anInt6748, this.aClass3_Sub4_2.anInt6748);
		this.aClass100_Sub3_17.method8863(false);
		this.aClass100_Sub3_17.method8926(false);
		this.aClass100_Sub3_17.method8858(false);
		this.aClass100_Sub3_17.method8864(false);
		this.aClass100_Sub3_17.method8895(-2);
		this.aClass100_Sub3_17.method8861(1);
		this.aClass100_Sub3_17.method8922(0.0F, 0.0F, 0.0F, arg0);
		this.aClass100_Sub3_17.method8880(34165, 34165);
		this.aClass100_Sub3_17.method8925(arg2);
		this.aClass100_Sub3_17.method8861(0);
		this.aClass100_Sub3_17.method8903(1);
		this.aClass100_Sub3_17.method8925(arg1);
		this.aClass100_Sub3_17.method8935(local11);
		for (@Pc(122) int local122 = 0; local122 < 6; local122++) {
			@Pc(128) int local128 = local122 + 34069;
			local11.method4094(local128, this.aClass3_Sub4_2);
			local11.method4097(0);
			if (!local11.method4101()) {
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
		local11.method4104(0);
		this.aClass100_Sub3_17.method8896(local11);
		this.aClass100_Sub3_17.method8861(1);
		this.aClass100_Sub3_17.method8925((Class3) null);
		this.aClass100_Sub3_17.method8880(8448, 8448);
		this.aClass100_Sub3_17.method8861(0);
		this.aClass100_Sub3_17.method8925((Class3) null);
		OpenGL.glPopAttrib();
		this.aClass100_Sub3_17.KA(Static27.anIntArray33[0], Static27.anIntArray33[1], Static27.anIntArray33[2], Static27.anIntArray33[3]);
		if (local7 && !this.aClass100_Sub3_17.aBoolean705) {
			this.aClass3_Sub4_2.method5777();
		}
		return local7;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)Lclient!nc;")
	@Override
	public Class3_Sub4 method1534() {
		return this.aClass3_Sub4_2;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)I")
	public int method1541() {
		return this.aClass3_Sub4_2.anInt6748;
	}
}
