import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!gb", name = "P", descriptor = "Lclient!ef;")
	public static Class3_Sub2_Sub3_Sub1_Sub1 aClass3_Sub2_Sub3_Sub1_Sub1_3;

	@OriginalMember(owner = "client!gb", name = "O", descriptor = "Lclient!ag;")
	public static Class3_Sub4_Sub1 aClass3_Sub4_Sub1_2 = new Class3_Sub4_Sub1(5000);

	@OriginalMember(owner = "client!gb", name = "Q", descriptor = "Lclient!kb;")
	public static Class46 aClass46_450 = Static65.method1172("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!gb", name = "T", descriptor = "[I")
	public static int[] anIntArray126 = new int[50];

	@OriginalMember(owner = "client!gb", name = "U", descriptor = "[I")
	public static int[] anIntArray127 = new int[128];

	@OriginalMember(owner = "client!gb", name = "V", descriptor = "Lclient!kb;")
	public static Class46 aClass46_451 = Static65.method1172("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!gb", name = "W", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1 = new int[4][13][13];

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIB)V")
	public static void method993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class3_Sub2_Sub11 local3 = Static31.method573(arg1);
		@Pc(6) int local6 = local3.anInt2806;
		@Pc(13) int local13 = local3.anInt2812;
		@Pc(16) int local16 = local3.anInt2808;
		@Pc(23) int local23 = Class49.anIntArray217[local13 - local16];
		if (arg0 < 0 || local23 < arg0) {
			arg0 = 0;
		}
		local23 <<= local16;
		Static41.anIntArray419[local6] = ~local23 & Static41.anIntArray419[local6] | local23 & arg0 << local16;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(Z)V")
	public static void method994() {
		aClass46_450 = null;
		anIntArrayArrayArray1 = null;
		aClass3_Sub4_Sub1_2 = null;
		anIntArray126 = null;
		aClass3_Sub2_Sub3_Sub1_Sub1_3 = null;
		aClass46_451 = null;
		anIntArray127 = null;
	}
}
