import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "Z")
	public static boolean aBoolean34;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
	public static int anInt1128;

	@OriginalMember(owner = "client!gf", name = "H", descriptor = "Z")
	public static boolean aBoolean37;

	@OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
	public static int anInt1142;

	@OriginalMember(owner = "client!gf", name = "C", descriptor = "Lclient!r;")
	private static Class61 aClass61_349 = Static129.method2060("Please try using a different world)3");

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "Lclient!r;")
	public static Class61 aClass61_342 = aClass61_349;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "Lclient!r;")
	public static Class61 aClass61_343 = aClass61_349;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
	public static int anInt1129 = 0;

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "Lclient!r;")
	public static Class61 aClass61_344 = aClass61_349;

	@OriginalMember(owner = "client!gf", name = "o", descriptor = "Lclient!r;")
	public static Class61 aClass61_345 = Static129.method2060("<br>(X");

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "Lclient!r;")
	public static Class61 aClass61_346 = Static129.method2060("::clientdrop");

	@OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
	public static int anInt1133 = -1;

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
	public static int anInt1134 = 500;

	@OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
	public static int anInt1136 = 0;

	@OriginalMember(owner = "client!gf", name = "y", descriptor = "Lclient!r;")
	public static Class61 aClass61_347 = aClass61_349;

	@OriginalMember(owner = "client!gf", name = "A", descriptor = "Lclient!r;")
	public static Class61 aClass61_348 = Static129.method2060(")3runescape)3com");

	@OriginalMember(owner = "client!gf", name = "L", descriptor = "Lclient!r;")
	public static Class61 aClass61_350 = aClass61_349;

	@OriginalMember(owner = "client!gf", name = "M", descriptor = "Lclient!r;")
	public static Class61 aClass61_351 = aClass61_349;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI)V")
	public static void method772(@OriginalArg(1) int arg0) {
		for (@Pc(6) Class5_Sub6 local6 = (Class5_Sub6) Static97.aClass20_9.method655(); local6 != null; local6 = (Class5_Sub6) Static97.aClass20_9.method649()) {
			if ((local6.aLong100 >> 48 & 0xFFFFL) == (long) arg0) {
				local6.method2189();
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!ke;)Lclient!ke;")
	public static Class5_Sub11 method774(@OriginalArg(1) Class5_Sub11 arg0) {
		@Pc(12) Class5_Sub11 local12 = Static31.method643(arg0);
		if (local12 == null) {
			local12 = arg0.aClass5_Sub11_5;
		}
		return local12;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	public static void method775() {
		aClass61_344 = null;
		aClass61_346 = null;
		aClass61_342 = null;
		aClass61_349 = null;
		aClass61_348 = null;
		aClass61_351 = null;
		aClass61_350 = null;
		aClass61_345 = null;
		aClass61_343 = null;
		aClass61_347 = null;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	public static void method776() {
		for (@Pc(6) Class5_Sub4 local6 = (Class5_Sub4) Static97.aClass58_57.method1669(); local6 != null; local6 = (Class5_Sub4) Static97.aClass58_57.method1664()) {
			if (local6.anInt257 > 0) {
				local6.anInt257--;
			}
			if (local6.anInt257 != 0) {
				if (local6.anInt264 > 0) {
					local6.anInt264--;
				}
				if (local6.anInt264 == 0 && local6.anInt263 >= 1 && local6.anInt260 >= 1 && local6.anInt263 <= 102 && local6.anInt260 <= 102 && (local6.anInt258 < 0 || Static116.method1887(local6.anInt266, local6.anInt258))) {
					Static23.method493(local6.anInt263, local6.anInt266, local6.anInt258, local6.anInt261, local6.anInt271, local6.anInt268, local6.anInt260);
					local6.anInt264 = -1;
					if (local6.anInt267 == local6.anInt258 && local6.anInt267 == -1) {
						local6.method2189();
					} else if (local6.anInt258 == local6.anInt267 && local6.anInt271 == local6.anInt265 && local6.anInt266 == local6.anInt259) {
						local6.method2189();
					}
				}
			} else if (local6.anInt267 < 0 || Static116.method1887(local6.anInt259, local6.anInt267)) {
				Static23.method493(local6.anInt263, local6.anInt259, local6.anInt267, local6.anInt261, local6.anInt265, local6.anInt268, local6.anInt260);
				local6.method2189();
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)I")
	public static int method778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(37) int local37 = Static92.method1460(arg0 - 1, arg1 + -1) + Static92.method1460(arg0 - 1, arg1 + 1) + Static92.method1460(arg0 + 1, arg1 - 1) + Static92.method1460(arg0 + 1, arg1 + 1);
		@Pc(66) int local66 = Static92.method1460(arg0, arg1 - 1) + Static92.method1460(arg0, arg1 + 1) + Static92.method1460(arg0 + -1, arg1) + Static92.method1460(arg0 + 1, arg1);
		@Pc(75) int local75 = Static92.method1460(arg0, arg1);
		return local66 / 8 + local37 / 16 + local75 / 4;
	}
}
