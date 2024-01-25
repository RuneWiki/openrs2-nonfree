import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZIII)V")
	public static void method442(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1012) {
			Static301.method4845(Static178.aClass275_14, arg0, arg2);
		} else if (arg1 == 1011) {
			Static301.method4845(Static136.aClass275_7, arg0, arg2);
		} else if (arg1 == 1004) {
			Static301.method4845(Static276.aClass275_10, arg0, arg2);
		} else if (arg1 == 1001) {
			Static301.method4845(Static43.aClass275_3, arg0, arg2);
		} else if (arg1 == 1010) {
			Static301.method4845(Static143.aClass275_2, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(III)V")
	public static void method443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class6_Sub2_Sub4 local14 = Static602.method8315((long) arg0, 16);
		local14.method2040();
		local14.anInt2111 = arg1;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IBI)V")
	public static void method444(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class6_Sub2_Sub4 local17 = Static602.method8315((long) arg0, 13);
		local17.method2040();
		local17.anInt2111 = arg1;
	}
}
