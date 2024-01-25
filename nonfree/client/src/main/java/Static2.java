import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "Lclient!lp;")
	public static Class148_Sub1 aClass148_Sub1_1;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
	public static int anInt4;

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString2;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_1 = new Class134("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[100];

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)V")
	public static void method5(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub5_Sub11 local16 = Static316.method4316(6, arg0);
		local16.method3101();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public static void method6() {
		Static354.aClass132_55.method2708();
		Static264.aClass132_40.method2708();
		Static327.aClass132_52.method2708();
		Static209.aClass132_27.method2708();
		Static234.aClass132_30.method2708();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I")
	public static int method8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static116.aShortArrayArray2 == null ? 0 : Static116.aShortArrayArray2[arg0][arg1] & 0xFFFF;
	}
}
