import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!qc", name = "A", descriptor = "Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3 aClass1_Sub2_Sub1_Sub3_7;

	@OriginalMember(owner = "client!qc", name = "E", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1178 = Static161.method2971("::gc");

	@OriginalMember(owner = "client!qc", name = "G", descriptor = "Z")
	public static boolean aBoolean265 = false;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!ag;I)Lclient!bg;")
	public static Class1_Sub2_Sub1_Sub4 method2473(@OriginalArg(1) int arg0, @OriginalArg(2) Class4 arg1) {
		return Static15.method624(0, arg1, arg0) ? Static66.method1447() : null;
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V")
	public static void method2475() {
		aClass1_Sub2_Sub1_Sub3_7 = null;
		aClass13_1178 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZZ)V")
	public static void method2477(@OriginalArg(0) boolean arg0) {
		if (Static25.aClass62_2 == null) {
			return;
		}
		try {
			@Pc(11) Class1_Sub8 local11 = new Class1_Sub8(4);
			local11.method1643(arg0 ? 2 : 3);
			local11.method1620(0);
			Static25.aClass62_2.method2281(4, local11.aByteArray27);
		} catch (@Pc(32) IOException local32) {
			try {
				Static25.aClass62_2.method2277();
			} catch (@Pc(37) Exception local37) {
			}
			Static25.aClass62_2 = null;
			Static30.anInt1095++;
		}
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)V")
	public static void method2478() {
		Static62.aClass47_18.method1995();
		Static166.aClass47_28.method1995();
		Static166.aClass47_30.method1995();
		Static58.aClass47_13.method1995();
		Static159.aClass47_27.method1995();
	}
}
