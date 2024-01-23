import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ej", name = "L", descriptor = "I")
	public static int anInt1466 = 0;

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "(I)V")
	public static void method1070() {
		if (Static192.aBoolean316) {
			return;
		}
		Static192.aBoolean316 = true;
		Static93.aBoolean139 = true;
		if (Static109.aBoolean177) {
			Static201.aFloat36 = (int) Static201.aFloat36 - 17 & 0xFFFFFFF0;
		} else {
			Static228.aFloat48 += (-Static228.aFloat48 - 12.0F) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILclient!aj;I)V")
	public static void method1071(@OriginalArg(1) Class8_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (Static115.aClass57_2 == null) {
			return;
		}
		try {
			Static115.aClass57_2.method1347(0L);
			Static115.aClass57_2.method1344(24, arg0.aByteArray24, arg1);
		} catch (@Pc(22) Exception local22) {
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)Z")
	public static boolean method1072(@OriginalArg(1) int arg0) {
		Static141.aBoolean231 = true;
		Static182.anInt3573 = arg0 + 1 & 0xFFFF;
		return true;
	}
}
