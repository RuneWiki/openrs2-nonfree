import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!al", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString4;

	@OriginalMember(owner = "client!al", name = "m", descriptor = "I")
	public static int anInt178;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIII)I")
	public static int method135(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static417.aClass65Array4 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg0 >> 7;
		@Pc(15) int local15 = arg2 >> 7;
		if (local11 < 0 || local15 < 0 || Static326.anInt5666 - 1 < local11 || Static283.anInt5187 - 1 < local15) {
			return 0;
		}
		@Pc(43) int local43 = arg1;
		if (arg1 < 3 && (Static79.aByteArrayArrayArray2[1][local11][local15] & 0x2) != 0) {
			local43 = arg1 + 1;
		}
		return Static417.aClass65Array4[local43].a(arg0, arg2);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)V")
	public static void method136(@OriginalArg(0) int arg0) {
		Static243.anInt4535 = 1000 / arg0;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III)Z")
	public static boolean method137(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static44.method760(arg0, arg1)) {
			return (arg1 & 0xB000) != 0 | Static93.method1643(arg0, arg1) | Static55.method934(arg1, arg0) ? true : (Static72.method1353(arg0, arg1) | Static183.method2904(arg0, arg1)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method140(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static437.method4044("\n", "%0a", arg0));
	}
}
