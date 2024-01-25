import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static280 {

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "Lclient!fea;")
	public static Class111 aClass111_1;

	@OriginalMember(owner = "client!jq", name = "v", descriptor = "Lclient!hk;")
	public static Class155 aClass155_13;

	@OriginalMember(owner = "client!jq", name = "B", descriptor = "Lclient!eh;")
	public static final Class94 aClass94_2 = new Class94();

	@OriginalMember(owner = "client!jq", name = "E", descriptor = "I")
	public static int anInt4976 = -1;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
	public static void method4497() {
		if (Static139.anInt2749 == 1 || Static139.anInt2749 == 3 || Static527.anInt8398 != Static139.anInt2749 && (Static139.anInt2749 == 0 || Static527.anInt8398 == 0)) {
			Static438.anInt7239 = 0;
			Static259.anInt4657 = 0;
			Static677.aClass306_37.method6936();
		}
		Static527.anInt8398 = Static139.anInt2749;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIB)Z")
	public static boolean method4500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 | Static683.method9225(arg0, arg1) || Static226.method3581(arg1, arg0);
	}
}
