import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class112_Sub2_Sub2 extends Class112_Sub2 {

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "Lclient!kfa;")
	private final Class7_Sub2 aClass7_Sub2_42;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "Lclient!gfa;")
	private final Class3_Sub4 aClass3_Sub4_2;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!kfa;I)V")
	public Class112_Sub2_Sub2(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass7_Sub2_42 = arg0;
		this.aClass3_Sub4_2 = new Class3_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)I")
	public int method7401() {
		return this.aClass3_Sub4_2.anInt3459;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)Lclient!gfa;")
	@Override
	public Class3_Sub4 method7398() {
		return this.aClass3_Sub4_2;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!gfa;FLclient!gfa;Z)Z")
	public boolean method7403(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class3_Sub4 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class87 local11 = this.aClass7_Sub2_42.aClass87_2;
		this.aClass7_Sub2_42.oa(Static56.anIntArray56);
		this.aClass7_Sub2_42.JA();
		this.aClass7_Sub2_42.method4302();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass3_Sub4_2.anInt3459, this.aClass3_Sub4_2.anInt3459);
		this.aClass7_Sub2_42.method4321(false);
		this.aClass7_Sub2_42.method4290(false);
		this.aClass7_Sub2_42.method4300(false);
		this.aClass7_Sub2_42.method4293(false);
		this.aClass7_Sub2_42.method4339(-2);
		this.aClass7_Sub2_42.method4326(1);
		this.aClass7_Sub2_42.method4347(0.0F, 0.0F, 0.0F, arg1);
		this.aClass7_Sub2_42.method4346(34165, 34165);
		this.aClass7_Sub2_42.method4313(arg0);
		this.aClass7_Sub2_42.method4326(0);
		this.aClass7_Sub2_42.method4288(1);
		this.aClass7_Sub2_42.method4313(arg2);
		this.aClass7_Sub2_42.method4281(local11);
		for (@Pc(117) int local117 = 0; local117 < 6; local117++) {
			@Pc(124) int local124 = local117 + 34069;
			local11.method2064(local124, this.aClass3_Sub4_2);
			local11.method2071(0);
			if (!local11.method2072()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local124 == 34069) {
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
			} else if (local124 == 34070) {
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
			} else if (local124 == 34071) {
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
			} else if (local124 == 34072) {
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
			} else if (local124 == 34073) {
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
			} else if (local124 == 34074) {
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
		local11.method2070(0);
		this.aClass7_Sub2_42.method4358(local11);
		this.aClass7_Sub2_42.method4326(1);
		this.aClass7_Sub2_42.method4313(null);
		this.aClass7_Sub2_42.method4346(8448, 8448);
		this.aClass7_Sub2_42.method4326(0);
		this.aClass7_Sub2_42.method4313(null);
		OpenGL.glPopAttrib();
		this.aClass7_Sub2_42.da(Static56.anIntArray56[0], Static56.anIntArray56[1], Static56.anIntArray56[2], Static56.anIntArray56[3]);
		if (local7 && !this.aClass7_Sub2_42.aBoolean396) {
			this.aClass3_Sub4_2.method2747();
		}
		return local7;
	}
}
