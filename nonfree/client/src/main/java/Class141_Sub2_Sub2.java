import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class141_Sub2_Sub2 extends Class141_Sub2 {

	@OriginalMember(owner = "client!pr", name = "r", descriptor = "Lclient!dw;")
	private final Class82_Sub1 aClass82_Sub1_33;

	@OriginalMember(owner = "client!pr", name = "o", descriptor = "Lclient!ifa;")
	private final Class94_Sub4 aClass94_Sub4_2;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!dw;I)V")
	public Class141_Sub2_Sub2(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass82_Sub1_33 = arg0;
		this.aClass94_Sub4_2 = new Class94_Sub4(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!ifa;FILclient!ifa;)Z")
	public boolean method6658(@OriginalArg(0) Class94_Sub4 arg0, @OriginalArg(1) float arg1, @OriginalArg(3) Class94_Sub4 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class85 local11 = this.aClass82_Sub1_33.aClass85_2;
		this.aClass82_Sub1_33.K(Static33.anIntArray37);
		this.aClass82_Sub1_33.la();
		this.aClass82_Sub1_33.method2062();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass94_Sub4_2.anInt4689, this.aClass94_Sub4_2.anInt4689);
		this.aClass82_Sub1_33.method2051(false);
		this.aClass82_Sub1_33.method2028(false);
		this.aClass82_Sub1_33.method2055(false);
		this.aClass82_Sub1_33.method2032(false);
		this.aClass82_Sub1_33.method2057(-2);
		this.aClass82_Sub1_33.method2086(1);
		this.aClass82_Sub1_33.method2087(0.0F, arg1, 0.0F, 0.0F);
		this.aClass82_Sub1_33.method2077(34165, 34165);
		this.aClass82_Sub1_33.method2029(arg0);
		this.aClass82_Sub1_33.method2086(0);
		this.aClass82_Sub1_33.method2068(1);
		this.aClass82_Sub1_33.method2029(arg2);
		this.aClass82_Sub1_33.method2043(local11);
		for (@Pc(119) int local119 = 0; local119 < 6; local119++) {
			@Pc(126) int local126 = local119 + 34069;
			local11.method2146(local126, this.aClass94_Sub4_2);
			local11.method2149(0);
			if (!local11.method2143()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local126 == 34069) {
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
			} else if (local126 == 34070) {
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
			} else if (local126 == 34071) {
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
			} else if (local126 == 34072) {
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
			} else if (local126 == 34073) {
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
			} else if (local126 == 34074) {
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
		local11.method2145(0);
		this.aClass82_Sub1_33.method2042(local11);
		this.aClass82_Sub1_33.method2086(1);
		this.aClass82_Sub1_33.method2029((Class94) null);
		this.aClass82_Sub1_33.method2077(8448, 8448);
		this.aClass82_Sub1_33.method2086(0);
		this.aClass82_Sub1_33.method2029((Class94) null);
		OpenGL.glPopAttrib();
		this.aClass82_Sub1_33.KA(Static33.anIntArray37[0], Static33.anIntArray37[1], Static33.anIntArray37[2], Static33.anIntArray37[3]);
		if (local7 && !this.aClass82_Sub1_33.aBoolean196) {
			this.aClass94_Sub4_2.method4011();
		}
		return local7;
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)I")
	public int method6659() {
		return this.aClass94_Sub4_2.anInt4689;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)Lclient!ifa;")
	@Override
	public Class94_Sub4 method6654() {
		return this.aClass94_Sub4_2;
	}
}
