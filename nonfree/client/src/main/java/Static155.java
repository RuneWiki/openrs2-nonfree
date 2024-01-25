import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!fj", name = "Q", descriptor = "Lclient!oh;")
	public static Class237 aClass237_48;

	@OriginalMember(owner = "client!fj", name = "S", descriptor = "Lclient!gn;")
	public static Class8_Sub25 aClass8_Sub25_6;

	@OriginalMember(owner = "client!fj", name = "N", descriptor = "Z")
	public static boolean aBoolean282 = false;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V")
	public static void method3150(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static99.anInt2642 = arg1;
		Static475.anInt8512 = 2;
		Static252.method4534(arg2, false, arg0);
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)Z")
	public static boolean method3152(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(II)Lclient!sq;")
	public static Class316 method3154(@OriginalArg(1) int arg0) {
		@Pc(8) Class316[] local8 = Static285.method4810();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].anInt9106 == arg0) {
				return local8[local10];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(JB)V")
	public static void method3155(@OriginalArg(0) long arg0) {
		if (Static405.aClass56ArrayArrayArray2 != null) {
			if (Static427.anInt8005 == 1 || Static427.anInt8005 == 5) {
				Static533.method7513(arg0);
			} else if (Static427.anInt8005 == 4) {
				Static571.method7933(arg0);
			}
		}
		Static14.method6445(Static171.aClass16_5, (long) Static435.anInt8192);
		if (Static212.anInt4965 != -1) {
			Static414.method6511(Static212.anInt4965);
		}
		for (@Pc(48) int local48 = 0; local48 < Static259.anInt5574; local48++) {
			if (Static620.aBooleanArray29[local48]) {
				Static10.aBooleanArray1[local48] = true;
			}
			Static373.aBooleanArray26[local48] = Static620.aBooleanArray29[local48];
			Static620.aBooleanArray29[local48] = false;
		}
		Static32.anInt1302 = Static435.anInt8192;
		Static385.method8094(-1, -1, null);
		Static570.method7927(null, -1, -1);
		if (Static212.anInt4965 != -1) {
			Static259.anInt5574 = 0;
			Static522.method7444();
		}
		Static171.aClass16_5.la();
		Static38.method1272(Static171.aClass16_5);
		@Pc(101) int local101 = Static84.method2096();
		if (local101 == -1) {
			local101 = Static341.anInt6662;
		}
		if (local101 == -1) {
			local101 = Static553.anInt9618;
		}
		Static30.method1110(local101);
		@Pc(124) int local124 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.method6692() << 8;
		Static376.method5848(Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124, Static77.anInt2367, local124 + Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301, local124 + Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298);
		Static77.anInt2367 = 0;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!oh;)V")
	public static void method3156(@OriginalArg(1) Class237 arg0) {
		Static241.anInt5385 = arg0.method6307("p11_full");
		Static19.anInt3643 = arg0.method6307("p12_full");
		Static25.anInt1036 = arg0.method6307("b12_full");
	}
}
