import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class57_Sub2_Sub2 extends Class57_Sub2 {

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "Lclient!ck;")
	private final Class65_Sub1 aClass65_Sub1_21;

	@OriginalMember(owner = "client!nf", name = "r", descriptor = "Lclient!maa;")
	private final Class80_Sub4 aClass80_Sub4_2;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!ck;I)V")
	public Class57_Sub2_Sub2(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass65_Sub1_21 = arg0;
		this.aClass80_Sub4_2 = new Class80_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(B)I")
	public int method5801() {
		return this.aClass80_Sub4_2.anInt6519;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)Lclient!maa;")
	@Override
	public Class80_Sub4 method5798() {
		return this.aClass80_Sub4_2;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IFLclient!maa;Lclient!maa;)Z")
	public boolean method5804(@OriginalArg(1) float arg0, @OriginalArg(2) Class80_Sub4 arg1, @OriginalArg(3) Class80_Sub4 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class363 local11 = this.aClass65_Sub1_21.aClass363_2;
		this.aClass65_Sub1_21.K(Static3.anIntArray2);
		this.aClass65_Sub1_21.la();
		this.aClass65_Sub1_21.method1238();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass80_Sub4_2.anInt6519, this.aClass80_Sub4_2.anInt6519);
		this.aClass65_Sub1_21.method1234(false);
		this.aClass65_Sub1_21.method1285(false);
		this.aClass65_Sub1_21.method1289(false);
		this.aClass65_Sub1_21.method1297(false);
		this.aClass65_Sub1_21.method1246(-2);
		this.aClass65_Sub1_21.method1256(1);
		this.aClass65_Sub1_21.method1276(0.0F, 0.0F, arg0, 0.0F);
		this.aClass65_Sub1_21.method1228(34165, 34165);
		this.aClass65_Sub1_21.method1286(arg1);
		this.aClass65_Sub1_21.method1256(0);
		this.aClass65_Sub1_21.method1290(1);
		this.aClass65_Sub1_21.method1286(arg2);
		this.aClass65_Sub1_21.method1299(local11);
		for (@Pc(121) int local121 = 0; local121 < 6; local121++) {
			@Pc(127) int local127 = local121 + 34069;
			local11.method8453(this.aClass80_Sub4_2, local127);
			local11.method8447(0);
			if (!local11.method8445()) {
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
		local11.method8446(0);
		this.aClass65_Sub1_21.method1229(local11);
		this.aClass65_Sub1_21.method1256(1);
		this.aClass65_Sub1_21.method1286((Class80) null);
		this.aClass65_Sub1_21.method1228(8448, 8448);
		this.aClass65_Sub1_21.method1256(0);
		this.aClass65_Sub1_21.method1286((Class80) null);
		OpenGL.glPopAttrib();
		this.aClass65_Sub1_21.KA(Static3.anIntArray2[0], Static3.anIntArray2[1], Static3.anIntArray2[2], Static3.anIntArray2[3]);
		if (local7 && !this.aClass65_Sub1_21.aBoolean107) {
			this.aClass80_Sub4_2.method7135();
		}
		return local7;
	}
}
