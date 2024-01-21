import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!df", name = "k", descriptor = "[Lclient!h;")
	public static Class4_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub2_Sub2Array5;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "Lclient!ec;")
	private static Class22 aClass22_162 = Static60.method1113("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!df", name = "b", descriptor = "I")
	public static int anInt557 = 0;

	@OriginalMember(owner = "client!df", name = "i", descriptor = "Lclient!ec;")
	private static Class22 aClass22_166 = Static60.method1113("Take");

	@OriginalMember(owner = "client!df", name = "c", descriptor = "Lclient!ec;")
	public static Class22 aClass22_163 = aClass22_166;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "Lclient!ec;")
	public static Class22 aClass22_164 = aClass22_162;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "Lclient!ec;")
	public static Class22 aClass22_165 = aClass22_162;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "[I")
	public static int[] anIntArray62 = new int[100];

	@OriginalMember(owner = "client!df", name = "l", descriptor = "Lclient!ec;")
	public static Class22 aClass22_167 = Static60.method1113("leuchten3:");

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)Lclient!ec;")
	public static Class22 method395(@OriginalArg(1) int arg0) {
		return Static44.method856(new Class22[] { Static134.method2042(arg0 >> 24 & 0xFF), Static53.aClass22_373, Static134.method2042(arg0 >> 16 & 0xFF), Static53.aClass22_373, Static134.method2042(arg0 >> 8 & 0xFF), Static53.aClass22_373, Static134.method2042(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(II)Z")
	public static boolean method396(@OriginalArg(0) int arg0) {
		if (Static76.aBooleanArray14[arg0]) {
			return true;
		} else if (Static71.aClass20_35.method594(arg0)) {
			@Pc(30) int local30 = Static71.aClass20_35.method591(arg0);
			if (local30 == 0) {
				Static76.aBooleanArray14[arg0] = true;
				return true;
			}
			if (Static65.aClass4_Sub7ArrayArray1[arg0] == null) {
				Static65.aClass4_Sub7ArrayArray1[arg0] = new Class4_Sub7[local30];
			}
			for (@Pc(52) int local52 = 0; local52 < local30; local52++) {
				if (Static65.aClass4_Sub7ArrayArray1[arg0][local52] == null) {
					@Pc(66) byte[] local66 = Static71.aClass20_35.method597(arg0, local52);
					if (local66 != null) {
						Static65.aClass4_Sub7ArrayArray1[arg0][local52] = new Class4_Sub7();
						Static65.aClass4_Sub7ArrayArray1[arg0][local52].anInt738 = (arg0 << 16) + local52;
						if (local66[0] == -1) {
							Static65.aClass4_Sub7ArrayArray1[arg0][local52].method534(new Class4_Sub11(local66));
						} else {
							Static65.aClass4_Sub7ArrayArray1[arg0][local52].method531(new Class4_Sub11(local66));
						}
					}
				}
			}
			Static76.aBooleanArray14[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ILclient!ea;II)Z")
	public static boolean method397(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) byte[] local16 = arg1.method597(arg0, arg2);
		if (local16 == null) {
			return false;
		} else {
			Static46.method890(local16);
			return true;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public static void method398() {
		aClass22_165 = null;
		aClass22_164 = null;
		aClass4_Sub1_Sub2_Sub2Array5 = null;
		anIntArray62 = null;
		aClass22_162 = null;
		aClass22_167 = null;
		aClass22_163 = null;
		aClass22_166 = null;
	}
}
