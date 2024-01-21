import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ef", name = "pb", descriptor = "J")
	public static long aLong39;

	@OriginalMember(owner = "client!ef", name = "bb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_458 = Static146.method2172("Existing User");

	@OriginalMember(owner = "client!ef", name = "cb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_459 = Static146.method2172("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!ef", name = "eb", descriptor = "I")
	public static int anInt1150 = 0;

	@OriginalMember(owner = "client!ef", name = "fb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_460 = Static146.method2172("welle2:");

	@OriginalMember(owner = "client!ef", name = "gb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_461 = Static146.method2172("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!ef", name = "ib", descriptor = "Lclient!sg;")
	public static Class77 aClass77_462 = aClass77_458;

	@OriginalMember(owner = "client!ef", name = "mb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_463 = Static146.method2172("Lade Sprites )2 ");

	@OriginalMember(owner = "client!ef", name = "nb", descriptor = "I")
	public static int anInt1155 = 0;

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)I")
	public static int method796(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "(I)V")
	public static void method797() {
		aClass77_460 = null;
		aClass77_462 = null;
		aClass77_461 = null;
		aClass77_459 = null;
		aClass77_463 = null;
		aClass77_458 = null;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)Z")
	public static boolean method798(@OriginalArg(0) int arg0) {
		if (Static44.aBooleanArray5[arg0]) {
			return true;
		} else if (Static19.aClass43_6.method2209(arg0)) {
			@Pc(23) int local23 = Static19.aClass43_6.method2223(arg0);
			if (local23 == 0) {
				Static44.aBooleanArray5[arg0] = true;
				return true;
			}
			if (Static125.aClass66ArrayArray1[arg0] == null) {
				Static125.aClass66ArrayArray1[arg0] = new Class66[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static125.aClass66ArrayArray1[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static19.aClass43_6.method2205(local45, arg0);
					if (local59 != null) {
						Static125.aClass66ArrayArray1[arg0][local45] = new Class66();
						Static125.aClass66ArrayArray1[arg0][local45].anInt3229 = local45 + (arg0 << 16);
						if (local59[0] == -1) {
							Static125.aClass66ArrayArray1[arg0][local45].method2247(new Class2_Sub18(local59));
						} else {
							Static125.aClass66ArrayArray1[arg0][local45].method2252(new Class2_Sub18(local59));
						}
					}
				}
			}
			Static44.aBooleanArray5[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIB)V")
	public static void method799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static18.anInt618 < 2 && Static124.anInt3041 == 0 && !Static16.aBoolean25) {
			return;
		}
		@Pc(45) Class77 local45;
		if (Static124.anInt3041 == 1 && Static18.anInt618 < 2) {
			local45 = Static146.method2168(new Class77[] { Static64.aClass77_714, Static112.aClass77_1057, Static15.aClass77_233, Static162.aClass77_505 });
		} else if (Static16.aBoolean25 && Static18.anInt618 < 2) {
			local45 = Static146.method2168(new Class77[] { Static120.aClass77_405, Static112.aClass77_1057, Static19.aClass77_275, Static162.aClass77_505 });
		} else {
			local45 = Static129.method2202(Static18.anInt618 - 1);
		}
		if (Static18.anInt618 > 2) {
			local45 = Static146.method2168(new Class77[] { local45, Static174.aClass77_1518, Static2.method61(Static18.anInt618 - 2), Static136.aClass77_1186 });
		}
		@Pc(129) int local129 = Static86.aClass2_Sub2_Sub3_Sub4_Sub1_4.method1270(local45, arg0 + 4, arg1 + 15, Static56.aRandom1, Static127.anInt3071);
		Static5.method100(15, local129 + Static86.aClass2_Sub2_Sub3_Sub4_Sub1_4.method1276(local45), arg0 + 4, arg1);
	}
}
