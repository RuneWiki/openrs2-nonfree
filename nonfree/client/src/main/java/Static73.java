import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "Lclient!ae;")
	public static Class5_Sub1 aClass5_Sub1_21;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
	public static int anInt2120;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Lclient!jd;")
	public static Class34 aClass34_4;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "Lclient!ia;")
	public static Class1_Sub9_Sub2 aClass1_Sub9_Sub2_3;

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "[Lclient!hb;")
	public static Class1_Sub1_Sub1_Sub5_Sub1[] aClass1_Sub1_Sub1_Sub5_Sub1Array3 = new Class1_Sub1_Sub1_Sub5_Sub1[32768];

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "[J")
	public static long[] aLongArray8 = new long[100];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([BLclient!fa;BI)V")
	public static void method1455(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) Class1_Sub18 local7 = new Class1_Sub18();
		local7.anInt2185 = 0;
		local7.aLong130 = arg2;
		local7.aClass22_12 = arg1;
		local7.aByteArray21 = arg0;
		@Pc(26) Class61 local26 = Static108.aClass61_3;
		synchronized (Static108.aClass61_3) {
			Static108.aClass61_3.method1754(local7);
		}
		Static94.method1713();
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)Z")
	public static boolean method1459() {
		try {
			if (Static20.anInt622 == 2) {
				if (Static67.aClass1_Sub23_2 == null) {
					Static67.aClass1_Sub23_2 = Static141.method1972(Static15.aClass5_93, Static103.anInt2540, Static23.anInt684);
					if (Static67.aClass1_Sub23_2 == null) {
						return false;
					}
				}
				if (Static90.aClass54_2 == null) {
					Static90.aClass54_2 = new Class54(Static29.aClass5_25, Static35.aClass5_27);
				}
				if (Static38.aClass1_Sub9_Sub1_33.method846(Static67.aClass1_Sub23_2, Static3.aClass5_6, Static90.aClass54_2)) {
					Static38.aClass1_Sub9_Sub1_33.method818();
					Static38.aClass1_Sub9_Sub1_33.method829(Static39.anInt988);
					Static38.aClass1_Sub9_Sub1_33.method847(Static67.aClass1_Sub23_2, Static3.aBoolean3);
					Static90.aClass54_2 = null;
					Static67.aClass1_Sub23_2 = null;
					Static20.anInt622 = 0;
					Static15.aClass5_93 = null;
					return true;
				}
			}
		} catch (@Pc(66) Exception local66) {
			local66.printStackTrace();
			Static38.aClass1_Sub9_Sub1_33.method848();
			Static15.aClass5_93 = null;
			Static67.aClass1_Sub23_2 = null;
			Static20.anInt622 = 0;
			Static90.aClass54_2 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method1462() {
		aClass5_Sub1_21 = null;
		aLongArray8 = null;
		aClass1_Sub1_Sub1_Sub5_Sub1Array3 = null;
		aClass34_4 = null;
		aClass1_Sub9_Sub2_3 = null;
	}
}
