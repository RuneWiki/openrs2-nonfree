import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static516 {

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "Lclient!vj;")
	public static final Class365 aClass365_12 = new Class365(9, 2);

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB)Z")
	public static boolean method4854(@OriginalArg(0) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)Lclient!nfa;")
	public static Class33_Sub1 method4855(@OriginalArg(0) int arg0) {
		return Static47.aBoolean59 && arg0 >= Static527.anInt9062 && arg0 <= Static511.anInt8847 ? Static51.aClass33_Sub1Array1[arg0 - Static527.anInt9062] : null;
	}
}
