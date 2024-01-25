import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "Lclient!fj;")
	public static Class3_Sub8_Sub2 aClass3_Sub8_Sub2_2;

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray31 = new boolean[8];

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
	public static void method1428() {
		for (@Pc(3) int local3 = 0; local3 < Static13.aByteArrayArrayArray17.length; local3++) {
			for (@Pc(9) int local9 = 0; local9 < Static13.aByteArrayArrayArray17[0].length; local9++) {
				for (@Pc(13) int local13 = 0; local13 < Static13.aByteArrayArrayArray17[0][0].length; local13++) {
					Static13.aByteArrayArrayArray17[local3][local9][local13] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
	public static void method1433() {
		Static348.method4050(false);
		if (Static52.anInt1098 >= 0 && Static52.anInt1098 != 0) {
			Static186.method2929(Static52.anInt1098);
			Static52.anInt1098 = -1;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIILclient!bj;)V")
	public static void method1434(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class28_Sub1_Sub1 arg3) {
		Static302.method4687(arg2, 0, arg1, arg0, arg3.aByte73, arg3.anInt5766, arg3.anInt5774);
	}
}
