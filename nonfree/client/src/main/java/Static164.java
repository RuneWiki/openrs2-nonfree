import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "F")
	public static float aFloat41;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "[I")
	public static int[] anIntArray290;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_88 = new Class140("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Lclient!ns;")
	public static final Class143 aClass143_10 = new Class143(4, 3);

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "[I")
	public static final int[] anIntArray289 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "[Lclient!je;")
	public static final Class1_Sub2_Sub3_Sub1[] aClass1_Sub2_Sub3_Sub1Array1 = new Class1_Sub2_Sub3_Sub1[2048];

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Z")
	public static boolean aBoolean325 = true;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_123 = new Class221(71, 8);

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)Lclient!mb;")
	public static Class2_Sub9_Sub13 method3269(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub9_Sub13 local10 = (Class2_Sub9_Sub13) Static263.aClass144_8.method4186((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static151.aClass104_90.method2756(arg0, 0);
		if (local25 == null || local25.length <= 1) {
			return null;
		} else {
			local10 = Static10.method155(local25);
			Static263.aClass144_8.method4188((long) arg0, local10);
			return local10;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)J")
	public static long method3270() {
		return Static356.aClass6_1.method4867();
	}
}
