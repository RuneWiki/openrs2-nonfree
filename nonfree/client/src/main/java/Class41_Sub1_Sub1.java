import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public final class Class41_Sub1_Sub1 extends Class41_Sub1 {

	@OriginalMember(owner = "client!cs", name = "v", descriptor = "Lclient!bt;")
	private final Class30_Sub1 aClass30_Sub1_5;

	@OriginalMember(owner = "client!cs", name = "q", descriptor = "Lclient!hp;")
	private final Class62_Sub3 aClass62_Sub3_1;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!bt;I)V")
	public Class41_Sub1_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass30_Sub1_5 = arg0;
		this.aClass62_Sub3_1 = new Class62_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)Lclient!hp;")
	@Override
	public Class62_Sub3 method3949() {
		return this.aClass62_Sub3_1;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(FLclient!hp;Lclient!hp;B)Z")
	public boolean method1246(@OriginalArg(0) float arg0, @OriginalArg(1) Class62_Sub3 arg1, @OriginalArg(2) Class62_Sub3 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class172 local11 = this.aClass30_Sub1_5.aClass172_1;
		this.aClass30_Sub1_5.p(Static184.anIntArray292);
		this.aClass30_Sub1_5.H();
		this.aClass30_Sub1_5.method761();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass62_Sub3_1.anInt3200, this.aClass62_Sub3_1.anInt3200);
		this.aClass30_Sub1_5.method760(false);
		this.aClass30_Sub1_5.method704(false);
		this.aClass30_Sub1_5.method738(false);
		this.aClass30_Sub1_5.method731(false);
		this.aClass30_Sub1_5.method693(-2);
		this.aClass30_Sub1_5.method726(1);
		this.aClass30_Sub1_5.method745(0.0F, arg0, 0.0F, 0.0F);
		this.aClass30_Sub1_5.method724(34165, 34165);
		this.aClass30_Sub1_5.method730(arg2);
		this.aClass30_Sub1_5.method726(0);
		this.aClass30_Sub1_5.method713(1);
		this.aClass30_Sub1_5.method730(arg1);
		this.aClass30_Sub1_5.method734(local11);
		for (@Pc(125) int local125 = 0; local125 < 6; local125++) {
			@Pc(131) int local131 = local125 + 34069;
			local11.method4329(local131, this.aClass62_Sub3_1);
			local11.method4328(0);
			if (!local11.method4326()) {
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
		local11.method4334(0);
		this.aClass30_Sub1_5.method728(local11);
		this.aClass30_Sub1_5.method726(1);
		this.aClass30_Sub1_5.method730(null);
		this.aClass30_Sub1_5.method724(8448, 8448);
		this.aClass30_Sub1_5.method726(0);
		this.aClass30_Sub1_5.method730(null);
		OpenGL.glPopAttrib();
		this.aClass30_Sub1_5.w(Static184.anIntArray292[0], Static184.anIntArray292[1], Static184.anIntArray292[2], Static184.anIntArray292[3]);
		if (local7 && !this.aClass30_Sub1_5.aBoolean38) {
			this.aClass62_Sub3_1.method5352();
		}
		return local7;
	}

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "(I)I")
	public int method1249() {
		return this.aClass62_Sub3_1.anInt3200;
	}
}
