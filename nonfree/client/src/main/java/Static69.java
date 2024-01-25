import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
	public static int anInt1823;

	@OriginalMember(owner = "client!eb", name = "bb", descriptor = "[I")
	public static int[] anIntArray100;

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "(B)V")
	public static void method1643() {
		if (Static139.anInt3199 == 10 || Static139.anInt3199 == 28) {
			Static82.method2091(Static129.anInt3039 >> 10, Static240.anInt4829 >> 10);
		} else {
			Static82.method2091(Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0] >> 3, Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0] >> 3);
		}
		Static82.method2085();
		Static262.method4562();
		Static341.method237();
		Static64.method1349();
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)I")
	public static int method1644(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
	public static void method1645() {
		@Pc(1) Class198 local1 = Static330.aClass198_235;
		synchronized (Static330.aClass198_235) {
			Static330.aClass198_235.method5213();
		}
		local1 = Static281.aClass198_202;
		synchronized (Static281.aClass198_202) {
			Static281.aClass198_202.method5213();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V")
	public static void method1646(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4) {
		Static271.method4637(arg1, null, arg3, arg0, -1, arg4, arg2);
	}
}
