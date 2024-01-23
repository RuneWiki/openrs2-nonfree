import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "Z")
	public static boolean aBoolean10 = false;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString7 = "white:";

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
	public static int anInt192 = 0;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BZIII)V")
	public static void method174(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static183.method3031(arg1)) {
			Static288.method4284(arg3, -1, arg0, arg2, Static313.aClass146ArrayArray1[arg1]);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	public static void method175() {
		Static136.anInt2697 = -1;
		Static127.anInt2540 = 0;
		Static128.anInt2551 = 0;
		Static167.aByte11 = 0;
		Static263.aBoolean357 = false;
		Static62.anInt1244 = 0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BLclient!no;)V")
	public static void method177(@OriginalArg(1) Class22_Sub3_Sub1 arg0) {
		for (@Pc(15) Class1_Sub10 local15 = (Class1_Sub10) Static213.aClass24_22.method460(); local15 != null; local15 = (Class1_Sub10) Static213.aClass24_22.method464()) {
			if (local15.aClass22_Sub3_Sub1_1 == arg0) {
				if (local15.aClass1_Sub4_Sub1_2 != null) {
					Static303.aClass1_Sub4_Sub2_2.method774(local15.aClass1_Sub4_Sub1_2);
					local15.aClass1_Sub4_Sub1_2 = null;
				}
				local15.method4616();
				return;
			}
		}
	}
}
