import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class65_Sub2_Sub2 extends Class65_Sub2 {

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "Lclient!ap;")
	private final Class9_Sub2 aClass9_Sub2_37;

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "Lclient!ng;")
	private final Class132_Sub4 aClass132_Sub4_2;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!ap;I)V")
	public Class65_Sub2_Sub2(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass9_Sub2_37 = arg0;
		this.aClass132_Sub4_2 = new Class132_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)Lclient!ng;")
	@Override
	public Class132_Sub4 method7589() {
		return this.aClass132_Sub4_2;
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)I")
	public int method7591() {
		return this.aClass132_Sub4_2.anInt6663;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BFLclient!ng;Lclient!ng;)Z")
	public boolean method7594(@OriginalArg(1) float arg0, @OriginalArg(2) Class132_Sub4 arg1, @OriginalArg(3) Class132_Sub4 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class89 local11 = this.aClass9_Sub2_37.aClass89_1;
		this.aClass9_Sub2_37.A(Static272.anIntArray396);
		this.aClass9_Sub2_37.F();
		this.aClass9_Sub2_37.method801();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass132_Sub4_2.anInt6663, this.aClass132_Sub4_2.anInt6663);
		this.aClass9_Sub2_37.method803(false);
		this.aClass9_Sub2_37.method826(false);
		this.aClass9_Sub2_37.method812(false);
		this.aClass9_Sub2_37.method808(false);
		this.aClass9_Sub2_37.method747(-2);
		this.aClass9_Sub2_37.method806(1);
		this.aClass9_Sub2_37.method795(0.0F, arg0, 0.0F, 0.0F);
		this.aClass9_Sub2_37.method797(34165, 34165);
		this.aClass9_Sub2_37.method814(arg1);
		this.aClass9_Sub2_37.method806(0);
		this.aClass9_Sub2_37.method822(1);
		this.aClass9_Sub2_37.method814(arg2);
		this.aClass9_Sub2_37.method821(local11);
		for (@Pc(122) int local122 = 0; local122 < 6; local122++) {
			@Pc(128) int local128 = local122 + 34069;
			local11.method2379(local128, this.aClass132_Sub4_2);
			local11.method2376(0);
			if (!local11.method2370()) {
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
		local11.method2382(0);
		this.aClass9_Sub2_37.method767(local11);
		this.aClass9_Sub2_37.method806(1);
		this.aClass9_Sub2_37.method814(null);
		this.aClass9_Sub2_37.method797(8448, 8448);
		this.aClass9_Sub2_37.method806(0);
		this.aClass9_Sub2_37.method814(null);
		OpenGL.glPopAttrib();
		this.aClass9_Sub2_37.ca(Static272.anIntArray396[0], Static272.anIntArray396[1], Static272.anIntArray396[2], Static272.anIntArray396[3]);
		if (local7 && !this.aClass9_Sub2_37.aBoolean52) {
			this.aClass132_Sub4_2.method5610();
		}
		return local7;
	}
}
