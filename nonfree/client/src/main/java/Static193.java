import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!gia", name = "m", descriptor = "Lclient!eja;")
	public static Class93 aClass93_1;

	@OriginalMember(owner = "client!gia", name = "o", descriptor = "I")
	public static int anInt4099;

	@OriginalMember(owner = "client!gia", name = "r", descriptor = "I")
	public static int anInt4102;

	@OriginalMember(owner = "client!gia", name = "z", descriptor = "[[[Lclient!q;")
	public static Class291[][][] aClass291ArrayArrayArray2;

	@OriginalMember(owner = "client!gia", name = "s", descriptor = "I")
	public static int anInt4103 = 0;

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method3740(@OriginalArg(1) String arg0) {
		return Static609.aHashtable7.containsKey(arg0);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(II)I")
	public static int method3741(@OriginalArg(1) int arg0) {
		@Pc(17) byte local17;
		if (arg0 > 12000) {
			local17 = 4;
			Static380.method6434();
		} else if (arg0 > 5000) {
			Static481.method7650();
			local17 = 3;
		} else if (arg0 > 2000) {
			Static631.method9340();
			local17 = 2;
		} else {
			Static520.method8043();
			local17 = 1;
		}
		if (Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907() != 2) {
			Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub16_1, 2);
			Static389.method6560(false, 2);
		}
		Static482.method7663();
		return local17;
	}
}
