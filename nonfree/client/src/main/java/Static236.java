import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
	public static int anInt4597;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
	public static int anInt4598;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!vm;")
	public static Class1_Sub2_Sub21 aClass1_Sub2_Sub21_2;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Z")
	public static boolean aBoolean353 = true;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString271 = "";

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZZLclient!km;III)V")
	public static void method3627(@OriginalArg(2) Class91 arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2) {
		Static299.anInt5641 = 1;
		Static244.anInt4854 = arg2;
		Static200.anInt4074 = 10000;
		Static139.aBoolean224 = false;
		Static14.aClass91_14 = arg0;
		Static237.anInt4708 = arg1;
		Static59.anInt3983 = 0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)[Lclient!tj;")
	public static Class12_Sub2[] method3628() {
		@Pc(8) Class12_Sub2[] local8 = new Class12_Sub2[Static199.anInt4056];
		for (@Pc(10) int local10 = 0; local10 < Static199.anInt4056; local10++) {
			local8[local10] = new Class12_Sub2(Static60.anInt1268, Static267.anInt5199, Static268.anIntArray461[local10], Static289.anIntArray543[local10], Static31.anIntArray78[local10], Static44.anIntArray97[local10], Static268.aByteArrayArray13[local10], Static133.anIntArray266);
		}
		Static91.method1595();
		return local8;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(JZ)V")
	public static void method3629(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			Static283.aClass1_Sub11_Sub1_3.method2697(76);
			Static283.aClass1_Sub11_Sub1_3.method2673(arg0);
		}
	}
}
