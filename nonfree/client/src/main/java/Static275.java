import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "[Lclient!rp;")
	public static Class182[] aClass182Array1;

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "Z")
	public static boolean aBoolean463 = false;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
	public static void method4781() {
		@Pc(5) byte local5 = 0;
		if (Static44.aBoolean87) {
			local5 = 55;
		}
		Static8.method286(local5);
		Static79.method3436(local5);
		Static127.method2424(local5);
		Static160.method3022(local5);
		Static180.method3544(local5);
		Static63.method1323(local5);
		Static210.method3852(local5);
		Static1.method47(local5);
		Static20.method450(local5);
		if (Static239.anInt4649 == 10) {
			Static72.method1427(28);
		} else if (Static239.anInt4649 == 30) {
			Static72.method1427(25);
			return;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
	public static void method4782() {
		@Pc(8) Class140 local8 = Static122.aClass140_66;
		synchronized (Static122.aClass140_66) {
			Static122.aClass140_66.method3819();
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZC)Z")
	public static boolean method4783(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBILclient!rg;IIII)V")
	public static void method4784(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class177 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2.anInt5208 == 2) {
			@Pc(15) int local15 = 99999;
			@Pc(17) int local17 = 0;
			@Pc(19) int local19 = 0;
			for (@Pc(21) int local21 = 0; local21 < arg2.anInt5191; local21++) {
				for (@Pc(25) int local25 = 0; local25 < arg2.anInt5211; local25++) {
					@Pc(36) int local36 = local25 * (arg2.anInt5175 + 32) + arg4;
					@Pc(46) int local46 = arg6 + (arg2.anInt5263 + 32) * local21;
					if (local19 < 20) {
						local46 += arg2.anIntArray656[local19];
						local36 += arg2.anIntArray654[local19];
					}
					if (arg2.anIntArray668[local19] > 0 && (arg1 < local36 + 32 && local36 < arg5 && local46 + 32 > arg0 && arg3 > local46 || arg2 == Static46.aClass177_2 && local19 == Static255.anInt5009)) {
						if (local19 < local15) {
							local15 = local19;
						}
						if (local19 > local17) {
							local17 = local19;
						}
					}
					local19++;
				}
			}
			Static47.method1081(local15, Static34.aClass2_6, local17, arg2);
		} else if (arg2.anInt5208 == 5 && arg2.anInt5252 != -1) {
			Static125.method2402(Static34.aClass2_6, arg2);
		}
	}
}
