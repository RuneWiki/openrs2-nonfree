import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
	public static int anInt29;

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
	public static int anInt32;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Lclient!m;")
	public static Class49 aClass49_1 = new Class49();

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "[I")
	public static int[] anIntArray2 = new int[1000];

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "Lclient!ic;")
	public static Class34 aClass34_3 = Static56.method816(" weitere Optionen");

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
	public static int anInt33 = -1;

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "Lclient!ic;")
	private static Class34 aClass34_4 = Static56.method816("skill)2");

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "Lclient!ic;")
	public static Class34 aClass34_6 = aClass34_4;

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "Lclient!ic;")
	public static Class34 aClass34_7 = Static56.method816("me");

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "[I")
	public static int[] anIntArray3 = new int[100];

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "Lclient!ic;")
	private static Class34 aClass34_9 = Static56.method816("Malformed login packet)3");

	@OriginalMember(owner = "client!aa", name = "u", descriptor = "Lclient!ic;")
	public static Class34 aClass34_8 = aClass34_9;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public static void method8() {
		aClass34_9 = null;
		aClass34_6 = null;
		aClass34_3 = null;
		aClass34_7 = null;
		aClass49_1 = null;
		anIntArray2 = null;
		aClass34_4 = null;
		aClass34_8 = null;
		anIntArray3 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Lclient!bb;")
	public static Class8_Sub1_Sub2 method9(@OriginalArg(1) int arg0) {
		@Pc(8) Class8_Sub1_Sub2 local8 = (Class8_Sub1_Sub2) Static123.aClass48_55.method1100((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(22) byte[] local22 = Static129.aClass14_Sub1_19.method1156(0, arg0);
		if (local22 == null) {
			return null;
		}
		@Pc(28) int local28 = 0;
		local8 = new Class8_Sub1_Sub2();
		@Pc(37) Class8_Sub20 local37 = new Class8_Sub20(local22);
		local37.anInt2853 = local37.aByteArray44.length - 12;
		@Pc(53) int local53 = local37.method1853();
		local8.anInt222 = local37.method1839();
		local8.anInt227 = local37.method1839();
		local8.anInt224 = local37.method1839();
		local8.anInt228 = local37.method1839();
		local37.anInt2853 = 0;
		local8.aClass34_132 = local37.method1854();
		local8.aClass34Array4 = new Class34[local53];
		local8.anIntArray25 = new int[local53];
		local8.anIntArray28 = new int[local53];
		while (local37.aByteArray44.length - 12 > local37.anInt2853) {
			@Pc(99) int local99 = local37.method1839();
			if (local99 == 3) {
				local8.aClass34Array4[local28] = local37.method1892();
			} else if (local99 >= 100 || local99 == 21 || local99 == 38 || local99 == 39) {
				local8.anIntArray28[local28] = local37.method1872();
			} else {
				local8.anIntArray28[local28] = local37.method1853();
			}
			local8.anIntArray25[local28++] = local99;
		}
		Static123.aClass48_55.method1097(local8, (long) arg0);
		return local8;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public static void method10() {
		Static19.anIntArray65 = null;
		Static92.anIntArray307 = null;
		Static13.anIntArray47 = null;
		Static32.anIntArray110 = null;
		Static115.aByteArrayArray57 = null;
		Static42.anIntArray135 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIB)Z")
	public static boolean method11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		@Pc(19) Class8_Sub1_Sub4 local19 = Static50.method752(arg0);
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		return local19.method264(arg1);
	}
}
