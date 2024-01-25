import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class17_Sub2_Sub2 extends Class17_Sub2 {

	@OriginalMember(owner = "client!hm", name = "A", descriptor = "Lclient!pea;")
	private final Class121_Sub3 aClass121_Sub3_19;

	@OriginalMember(owner = "client!hm", name = "u", descriptor = "Lclient!cn;")
	private final Class35_Sub2 aClass35_Sub2_2;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!pea;I)V")
	public Class17_Sub2_Sub2(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass121_Sub3_19 = arg0;
		this.aClass35_Sub2_2 = new Class35_Sub2(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!cn;ILclient!cn;F)Z")
	public boolean method2859(@OriginalArg(0) Class35_Sub2 arg0, @OriginalArg(2) Class35_Sub2 arg1, @OriginalArg(3) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class315 local11 = this.aClass121_Sub3_19.aClass315_3;
		this.aClass121_Sub3_19.A(Static382.anIntArray556);
		this.aClass121_Sub3_19.F();
		this.aClass121_Sub3_19.method5726();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass35_Sub2_2.anInt1135, this.aClass35_Sub2_2.anInt1135);
		this.aClass121_Sub3_19.method5729(false);
		this.aClass121_Sub3_19.method5680(false);
		this.aClass121_Sub3_19.method5645(false);
		this.aClass121_Sub3_19.method5665(false);
		this.aClass121_Sub3_19.method5690(-2);
		this.aClass121_Sub3_19.method5648(1);
		this.aClass121_Sub3_19.method5675(0.0F, 0.0F, arg2, 0.0F);
		this.aClass121_Sub3_19.method5659(34165, 34165);
		this.aClass121_Sub3_19.method5713(arg1);
		this.aClass121_Sub3_19.method5648(0);
		this.aClass121_Sub3_19.method5684(1);
		this.aClass121_Sub3_19.method5713(arg0);
		this.aClass121_Sub3_19.method5701(local11);
		for (@Pc(122) int local122 = 0; local122 < 6; local122++) {
			@Pc(128) int local128 = local122 + 34069;
			local11.method7051(local128, this.aClass35_Sub2_2);
			local11.method7056(0);
			if (!local11.method7059()) {
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
		local11.method7060(0);
		this.aClass121_Sub3_19.method5682(local11);
		this.aClass121_Sub3_19.method5648(1);
		this.aClass121_Sub3_19.method5713(null);
		this.aClass121_Sub3_19.method5659(8448, 8448);
		this.aClass121_Sub3_19.method5648(0);
		this.aClass121_Sub3_19.method5713(null);
		OpenGL.glPopAttrib();
		this.aClass121_Sub3_19.ca(Static382.anIntArray556[0], Static382.anIntArray556[1], Static382.anIntArray556[2], Static382.anIntArray556[3]);
		if (local7 && !this.aClass121_Sub3_19.aBoolean478) {
			this.aClass35_Sub2_2.method5332();
		}
		return local7;
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)Lclient!cn;")
	@Override
	public Class35_Sub2 method2856() {
		return this.aClass35_Sub2_2;
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(B)I")
	public int method2861() {
		return this.aClass35_Sub2_2.anInt1135;
	}
}
