import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class37_Sub1_Sub1 extends Class37_Sub1 {

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "Lclient!qj;")
	private final Class100_Sub3 aClass100_Sub3_15;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Lclient!waa;")
	private final Class23_Sub4 aClass23_Sub4_1;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!qj;I)V")
	public Class37_Sub1_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass100_Sub3_15 = arg0;
		this.aClass23_Sub4_1 = new Class23_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)I")
	public int method1639() {
		return this.aClass23_Sub4_1.anInt9361;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZLclient!waa;Lclient!waa;F)Z")
	public boolean method1640(@OriginalArg(1) Class23_Sub4 arg0, @OriginalArg(2) Class23_Sub4 arg1, @OriginalArg(3) float arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(16) Class271 local16 = this.aClass100_Sub3_15.aClass271_7;
		this.aClass100_Sub3_15.oa(Static78.anIntArray655);
		this.aClass100_Sub3_15.JA();
		this.aClass100_Sub3_15.method6333();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass23_Sub4_1.anInt9361, this.aClass23_Sub4_1.anInt9361);
		this.aClass100_Sub3_15.method6288(false);
		this.aClass100_Sub3_15.method6327(false);
		this.aClass100_Sub3_15.method6324(false);
		this.aClass100_Sub3_15.method6270(false);
		this.aClass100_Sub3_15.method6278(-2);
		this.aClass100_Sub3_15.method6344(1);
		this.aClass100_Sub3_15.method6299(0.0F, 0.0F, arg2, 0.0F);
		this.aClass100_Sub3_15.method6300(34165, 34165);
		this.aClass100_Sub3_15.method6277(arg0);
		this.aClass100_Sub3_15.method6344(0);
		this.aClass100_Sub3_15.method6322(1);
		this.aClass100_Sub3_15.method6277(arg1);
		this.aClass100_Sub3_15.method6343(local16);
		for (@Pc(122) int local122 = 0; local122 < 6; local122++) {
			@Pc(128) int local128 = local122 + 34069;
			local16.method6360(this.aClass23_Sub4_1, local128);
			local16.method6356(0);
			if (!local16.method6357()) {
				local12 = false;
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
		local16.method6352(0);
		this.aClass100_Sub3_15.method6298(local16);
		this.aClass100_Sub3_15.method6344(1);
		this.aClass100_Sub3_15.method6277(null);
		this.aClass100_Sub3_15.method6300(8448, 8448);
		this.aClass100_Sub3_15.method6344(0);
		this.aClass100_Sub3_15.method6277(null);
		OpenGL.glPopAttrib();
		this.aClass100_Sub3_15.da(Static78.anIntArray655[0], Static78.anIntArray655[1], Static78.anIntArray655[2], Static78.anIntArray655[3]);
		if (local12 && !this.aClass100_Sub3_15.aBoolean584) {
			this.aClass23_Sub4_1.method7781();
		}
		return local12;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)Lclient!waa;")
	@Override
	public Class23_Sub4 method6514() {
		return this.aClass23_Sub4_1;
	}
}
