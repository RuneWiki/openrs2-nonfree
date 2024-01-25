import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static44 {

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
	public static int anInt881;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
	public static int anInt879 = -1;

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString36 = "green:";

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V")
	public static void method762(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static39.aClass187ArrayArrayArray1 = Static287.aClass187ArrayArrayArray2;
			Static203.aClass106Array3 = Static84.aClass106Array1;
		} else {
			Static39.aClass187ArrayArrayArray1 = Static321.aClass187ArrayArrayArray3;
			Static203.aClass106Array3 = Static99.aClass106Array4;
		}
		Static131.anInt2392 = Static39.aClass187ArrayArrayArray1.length;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)I")
	public static int method763() {
		if (Static15.aBoolean24) {
			return 0;
		} else if (Static16.method287()) {
			return Static14.aBoolean22 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!mb;IBI)V")
	public static void method765(@OriginalArg(0) Class132 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static139.anInt2513 = arg1;
		Static214.anInt3933 = arg2;
		Static7.aClass132_1 = arg0;
	}
}
