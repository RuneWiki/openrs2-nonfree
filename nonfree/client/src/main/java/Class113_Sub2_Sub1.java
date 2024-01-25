import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class113_Sub2_Sub1 extends Class113_Sub2 {

	@OriginalMember(owner = "client!gm", name = "u", descriptor = "Lclient!aq;")
	private final Class22_Sub1 aClass22_Sub1_16;

	@OriginalMember(owner = "client!gm", name = "m", descriptor = "Lclient!ia;")
	private final Class125_Sub2 aClass125_Sub2_1;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!aq;I)V")
	public Class113_Sub2_Sub1(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass22_Sub1_16 = arg0;
		this.aClass125_Sub2_1 = new Class125_Sub2(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)I")
	public int method3248() {
		return this.aClass125_Sub2_1.anInt4082;
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)Lclient!ia;")
	@Override
	public Class125_Sub2 method4897() {
		return this.aClass125_Sub2_1;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(FLclient!ia;Lclient!ia;I)Z")
	public boolean method3250(@OriginalArg(0) float arg0, @OriginalArg(1) Class125_Sub2 arg1, @OriginalArg(2) Class125_Sub2 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class52 local11 = this.aClass22_Sub1_16.aClass52_2;
		this.aClass22_Sub1_16.K(Static158.anIntArray182);
		this.aClass22_Sub1_16.la();
		this.aClass22_Sub1_16.method893();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass125_Sub2_1.anInt4082, this.aClass125_Sub2_1.anInt4082);
		this.aClass22_Sub1_16.method940(false);
		this.aClass22_Sub1_16.method949(false);
		this.aClass22_Sub1_16.method912(false);
		this.aClass22_Sub1_16.method902(false);
		this.aClass22_Sub1_16.method939(-2);
		this.aClass22_Sub1_16.method931(1);
		this.aClass22_Sub1_16.method895(0.0F, arg0, 0.0F, (float) 0);
		this.aClass22_Sub1_16.method900(34165, 34165);
		this.aClass22_Sub1_16.method955(arg2);
		this.aClass22_Sub1_16.method931(0);
		this.aClass22_Sub1_16.method894(1);
		this.aClass22_Sub1_16.method955(arg1);
		this.aClass22_Sub1_16.method959(local11);
		for (@Pc(124) int local124 = 0; local124 < 6; local124++) {
			@Pc(132) int local132 = local124 + 34069;
			local11.method1519(this.aClass125_Sub2_1, local132);
			local11.method1518(0);
			if (!local11.method1510()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local132 == 34069) {
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
			} else if (local132 == 34070) {
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
			} else if (local132 == 34071) {
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
			} else if (local132 == 34072) {
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
			} else if (local132 == 34073) {
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
			} else if (local132 == 34074) {
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
		local11.method1512(0);
		this.aClass22_Sub1_16.method923(local11);
		this.aClass22_Sub1_16.method931(1);
		this.aClass22_Sub1_16.method955((Class125) null);
		this.aClass22_Sub1_16.method900(8448, 8448);
		this.aClass22_Sub1_16.method931(0);
		this.aClass22_Sub1_16.method955((Class125) null);
		OpenGL.glPopAttrib();
		this.aClass22_Sub1_16.KA(Static158.anIntArray182[0], Static158.anIntArray182[1], Static158.anIntArray182[2], Static158.anIntArray182[3]);
		if (local7 && !this.aClass22_Sub1_16.aBoolean75) {
			this.aClass125_Sub2_1.method9215();
		}
		return local7;
	}
}
