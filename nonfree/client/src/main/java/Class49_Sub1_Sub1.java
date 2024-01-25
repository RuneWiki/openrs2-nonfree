import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public final class Class49_Sub1_Sub1 extends Class49_Sub1 {

	@OriginalMember(owner = "client!qda", name = "s", descriptor = "Lclient!bi;")
	private final Class13_Sub2 aClass13_Sub2_35;

	@OriginalMember(owner = "client!qda", name = "k", descriptor = "Lclient!kk;")
	private final Class10_Sub3 aClass10_Sub3_1;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lclient!bi;I)V")
	public Class49_Sub1_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass13_Sub2_35 = arg0;
		this.aClass10_Sub3_1 = new Class10_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "(I)I")
	public int method6508() {
		return this.aClass10_Sub3_1.anInt5379;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)Lclient!kk;")
	@Override
	public Class10_Sub3 method7566() {
		return this.aClass10_Sub3_1;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!kk;BLclient!kk;F)Z")
	public boolean method6511(@OriginalArg(0) Class10_Sub3 arg0, @OriginalArg(2) Class10_Sub3 arg1, @OriginalArg(3) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class227 local11 = this.aClass13_Sub2_35.aClass227_2;
		this.aClass13_Sub2_35.K(Static321.anIntArray352);
		this.aClass13_Sub2_35.la();
		this.aClass13_Sub2_35.method1031();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass10_Sub3_1.anInt5379, this.aClass10_Sub3_1.anInt5379);
		this.aClass13_Sub2_35.method1035(false);
		this.aClass13_Sub2_35.method1022(false);
		this.aClass13_Sub2_35.method1047(false);
		this.aClass13_Sub2_35.method1062(false);
		this.aClass13_Sub2_35.method1023(-2);
		this.aClass13_Sub2_35.method1093(1);
		this.aClass13_Sub2_35.method1071(0.0F, arg2, 0.0F, 0.0F);
		this.aClass13_Sub2_35.method1045(34165, 34165);
		this.aClass13_Sub2_35.method1096(arg1);
		this.aClass13_Sub2_35.method1093(0);
		this.aClass13_Sub2_35.method1046(1);
		this.aClass13_Sub2_35.method1096(arg0);
		this.aClass13_Sub2_35.method1061(local11);
		for (@Pc(121) int local121 = 0; local121 < 6; local121++) {
			@Pc(127) int local127 = local121 + 34069;
			local11.method5344(this.aClass10_Sub3_1, local127);
			local11.method5343(0);
			if (!local11.method5351()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local127 == 34069) {
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
			} else if (local127 == 34070) {
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
			} else if (local127 == 34071) {
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
			} else if (local127 == 34072) {
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
			} else if (local127 == 34073) {
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
			} else if (local127 == 34074) {
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
		local11.method5342(0);
		this.aClass13_Sub2_35.method1097(local11);
		this.aClass13_Sub2_35.method1093(1);
		this.aClass13_Sub2_35.method1096((Class10) null);
		this.aClass13_Sub2_35.method1045(8448, 8448);
		this.aClass13_Sub2_35.method1093(0);
		this.aClass13_Sub2_35.method1096((Class10) null);
		OpenGL.glPopAttrib();
		this.aClass13_Sub2_35.KA(Static321.anIntArray352[0], Static321.anIntArray352[1], Static321.anIntArray352[2], Static321.anIntArray352[3]);
		if (local7 && !this.aClass13_Sub2_35.aBoolean87) {
			this.aClass10_Sub3_1.method7258();
		}
		return local7;
	}
}
