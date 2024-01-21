import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ma", name = "db", descriptor = "Lclient!wc;")
	public static Class4 aClass4_42;

	@OriginalMember(owner = "client!ma", name = "kb", descriptor = "Lclient!a;")
	private static Class1 aClass1_1904 = Static94.method1596("Loaded update list");

	@OriginalMember(owner = "client!ma", name = "fb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1900 = aClass1_1904;

	@OriginalMember(owner = "client!ma", name = "hb", descriptor = "Lclient!a;")
	private static Class1 aClass1_1901 = Static94.method1596("Loading interfaces )2 ");

	@OriginalMember(owner = "client!ma", name = "ib", descriptor = "Lclient!a;")
	public static Class1 aClass1_1902 = Static94.method1596("Fertigkeit)2");

	@OriginalMember(owner = "client!ma", name = "jb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1903 = Static94.method1596("Mem:");

	@OriginalMember(owner = "client!ma", name = "lb", descriptor = "[I")
	public static int[] anIntArray197 = new int[200];

	@OriginalMember(owner = "client!ma", name = "mb", descriptor = "Lclient!a;")
	public static Class1 aClass1_1905 = aClass1_1901;

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	public static void method1294() {
		aClass4_42 = null;
		aClass1_1905 = null;
		anIntArray197 = null;
		aClass1_1902 = null;
		aClass1_1903 = null;
		aClass1_1901 = null;
		aClass1_1904 = null;
		aClass1_1900 = null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(B[BII)Z")
	public static boolean method1295(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class2_Sub3 local12 = new Class2_Sub3(arg0);
		@Pc(14) int local14 = -1;
		label52: while (true) {
			@Pc(23) int local23 = local12.method825();
			if (local23 == 0) {
				return local7;
			}
			local14 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(39) int local39;
				while (!local33) {
					local39 = local12.method825();
					if (local39 == 0) {
						continue label52;
					}
					local31 += local39 - 1;
					@Pc(66) int local66 = local31 & 0x3F;
					@Pc(72) int local72 = local12.method791() >> 2;
					@Pc(78) int local78 = local31 >> 6 & 0x3F;
					@Pc(83) int local83 = local78 + arg1;
					@Pc(88) int local88 = local66 + arg2;
					if (local83 > 0 && local88 > 0 && local83 < 103 && local88 < 103) {
						@Pc(107) Class2_Sub1_Sub10 local107 = Static28.method739(local14);
						if (local72 != 22 || !Static77.aBoolean113 || local107.anInt1508 != 0 || local107.aBoolean82) {
							local33 = true;
							if (!local107.method1019()) {
								local7 = false;
								Static79.anInt2096++;
							}
						}
					}
				}
				local39 = local12.method825();
				if (local39 == 0) {
					break;
				}
				local12.method791();
			}
		}
	}
}
