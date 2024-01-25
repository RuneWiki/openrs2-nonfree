import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class77_Sub1_Sub1 extends Class77_Sub1 {

	@OriginalMember(owner = "client!hw", name = "l", descriptor = "Lclient!gia;")
	private final Class67_Sub2 aClass67_Sub2_17;

	@OriginalMember(owner = "client!hw", name = "j", descriptor = "Lclient!mr;")
	private final Class245_Sub1 aClass245_Sub1_1;

	static {
		new Class258("", 73);
	}

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lclient!gia;I)V")
	public Class77_Sub1_Sub1(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass67_Sub2_17 = arg0;
		this.aClass245_Sub1_1 = new Class245_Sub1(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IFLclient!mr;Lclient!mr;)Z")
	public boolean method4027(@OriginalArg(1) float arg0, @OriginalArg(2) Class245_Sub1 arg1, @OriginalArg(3) Class245_Sub1 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class339 local11 = this.aClass67_Sub2_17.aClass339_4;
		this.aClass67_Sub2_17.K(Static29.anIntArray19);
		this.aClass67_Sub2_17.la();
		this.aClass67_Sub2_17.method3240();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass245_Sub1_1.anInt7222, this.aClass245_Sub1_1.anInt7222);
		this.aClass67_Sub2_17.method3243(false);
		this.aClass67_Sub2_17.method3299(false);
		this.aClass67_Sub2_17.method3270(false);
		this.aClass67_Sub2_17.method3227(false);
		this.aClass67_Sub2_17.method3245(-2);
		this.aClass67_Sub2_17.method3268(1);
		this.aClass67_Sub2_17.method3233(0.0F, arg0, 0.0F, 0.0F);
		this.aClass67_Sub2_17.method3271(34165, 34165);
		this.aClass67_Sub2_17.method3234(arg2);
		this.aClass67_Sub2_17.method3268(0);
		this.aClass67_Sub2_17.method3255(1);
		this.aClass67_Sub2_17.method3234(arg1);
		this.aClass67_Sub2_17.method3253(local11);
		for (@Pc(119) int local119 = 0; local119 < 6; local119++) {
			@Pc(127) int local127 = local119 + 34069;
			local11.method8082(local127, this.aClass245_Sub1_1);
			local11.method8083(0);
			if (!local11.method8070()) {
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
		local11.method8077(0);
		this.aClass67_Sub2_17.method3223(local11);
		this.aClass67_Sub2_17.method3268(1);
		this.aClass67_Sub2_17.method3234((Class245) null);
		this.aClass67_Sub2_17.method3271(8448, 8448);
		this.aClass67_Sub2_17.method3268(0);
		this.aClass67_Sub2_17.method3234((Class245) null);
		OpenGL.glPopAttrib();
		this.aClass67_Sub2_17.KA(Static29.anIntArray19[0], Static29.anIntArray19[1], Static29.anIntArray19[2], Static29.anIntArray19[3]);
		if (local7 && !this.aClass67_Sub2_17.aBoolean310) {
			this.aClass245_Sub1_1.method8673();
		}
		return local7;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)Lclient!mr;")
	@Override
	public Class245_Sub1 method7555() {
		return this.aClass245_Sub1_1;
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)I")
	public int method4028() {
		return this.aClass245_Sub1_1.anInt7222;
	}
}
