import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!lf", name = "Sb", descriptor = "J")
	public static long aLong122;

	@OriginalMember(owner = "client!lf", name = "Qb", descriptor = "Lclient!uh;")
	public static Class176 aClass176_1 = new Class176();

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "([BI)[B")
	public static byte[] method2653(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub14 local8 = new Class1_Sub14(arg0);
		@Pc(18) int local18 = local8.method2595();
		@Pc(22) int local22 = local8.method2647();
		if (local22 < 0 || Static114.anInt2249 != 0 && local22 > Static114.anInt2249) {
			throw new RuntimeException();
		} else if (local18 == 0) {
			@Pc(43) byte[] local43 = new byte[local22];
			local8.method2585(local22, local43);
			return local43;
		} else {
			@Pc(55) int local55 = local8.method2647();
			if (local55 < 0 || Static114.anInt2249 != 0 && Static114.anInt2249 < local55) {
				throw new RuntimeException();
			}
			@Pc(77) byte[] local77 = new byte[local55];
			if (local18 == 1) {
				Static100.method1509(local77, local55, arg0, local22);
			} else {
				Static68.aClass142_1.method3490(local8, local77);
			}
			return local77;
		}
	}

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "(B)Z")
	public static boolean method2655() {
		@Pc(6) Class176 local6 = aClass176_1;
		synchronized (aClass176_1) {
			if (Static299.anInt5671 == Static110.anInt2187) {
				return false;
			} else {
				Static137.anInt2718 = Static136.anIntArray222[Static299.anInt5671];
				Static243.aChar6 = Static295.aCharArray9[Static299.anInt5671];
				Static299.anInt5671 = Static299.anInt5671 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)V")
	public static void method2660(@OriginalArg(0) boolean arg0) {
		if (arg0 != Static124.aBoolean189) {
			Static124.aBoolean189 = arg0;
			Static293.method4622();
		}
	}
}
