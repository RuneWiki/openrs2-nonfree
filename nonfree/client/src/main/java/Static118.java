import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!pb", name = "nb", descriptor = "I")
	public static int anInt3371;

	@OriginalMember(owner = "client!pb", name = "qb", descriptor = "Lclient!fa;")
	public static Class1_Sub1_Sub8_Sub1 aClass1_Sub1_Sub8_Sub1_5;

	@OriginalMember(owner = "client!pb", name = "bb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_852 = Static8.method128("::gc");

	@OriginalMember(owner = "client!pb", name = "cb", descriptor = "I")
	public static int anInt3362 = 0;

	@OriginalMember(owner = "client!pb", name = "ib", descriptor = "Lclient!ea;")
	public static Class18 aClass18_853 = Static8.method128("title)3jpg");

	@OriginalMember(owner = "client!pb", name = "kb", descriptor = "I")
	public static int anInt3368 = 0;

	@OriginalMember(owner = "client!pb", name = "pb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_854 = Static8.method128("title_mute");

	@OriginalMember(owner = "client!pb", name = "rb", descriptor = "I")
	public static int anInt3373 = 0;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "(I)V")
	public static void method2345() {
		anInt3362 = 0;
		Static76.anInt2355 = 0;
		Static164.method3042();
		Static65.method1296();
		Static17.method2480();
		Static164.method3044();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < anInt3362; local19++) {
			local25 = Static35.anIntArray48[local19];
			if (Static41.anInt1322 != Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[local25].anInt3557) {
				Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[local25] = null;
			}
		}
		if (Static12.anInt4661 != Static167.aClass1_Sub6_Sub1_3.anInt839) {
			throw new RuntimeException("gpp1 pos:" + Static167.aClass1_Sub6_Sub1_3.anInt839 + " psize:" + Static12.anInt4661);
		}
		for (local25 = 0; local25 < Static45.anInt1553; local25++) {
			if (Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[Static58.anIntArray140[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static45.anInt1553);
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)I")
	public static int method2346() {
		@Pc(14) int local14 = Static34.method728(Static9.anInt295, Static38.anInt1189, Static45.anInt1552);
		return local14 - Static178.anInt4735 >= 800 || (Static2.aByteArrayArrayArray1[Static9.anInt295][Static45.anInt1552 >> 7][Static38.anInt1189 >> 7] & 0x4) == 0 ? 3 : Static9.anInt295;
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V")
	public static void method2348() {
		aClass18_854 = null;
		aClass18_852 = null;
		aClass18_853 = null;
		aClass1_Sub1_Sub8_Sub1_5 = null;
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(III)I")
	public static int method2349(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) long local15 = (long) (arg0 + (arg1 << 16));
		return Static127.aClass1_Sub1_Sub13_1 != null && Static127.aClass1_Sub1_Sub13_1.aLong139 == local15 ? Static109.aClass1_Sub6_4.anInt839 * 99 / (Static109.aClass1_Sub6_4.aByteArray3.length - Static127.aClass1_Sub1_Sub13_1.aByte5) + 1 : 0;
	}
}
