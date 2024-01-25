import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIII)V")
	public static void method4377(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(12) int local12 = -arg1;
		Static23.method323(Static283.anIntArrayArray30[arg0], arg3 - arg1, arg2, arg3 + arg1);
		@Pc(27) int local27 = -1;
		while (local9 > local7) {
			local27 += 2;
			local12 += local27;
			local7++;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(51) int[] local51 = Static283.anIntArrayArray30[arg0 + local9];
				@Pc(58) int[] local58 = Static283.anIntArrayArray30[arg0 - local9];
				@Pc(62) int local62 = arg3 + local7;
				@Pc(67) int local67 = arg3 - local7;
				Static23.method323(local51, local67, arg2, local62);
				Static23.method323(local58, local67, arg2, local62);
			}
			@Pc(87) int local87 = local9 + arg3;
			@Pc(92) int local92 = arg3 - local9;
			@Pc(99) int[] local99 = Static283.anIntArrayArray30[arg0 + local7];
			@Pc(106) int[] local106 = Static283.anIntArrayArray30[arg0 - local7];
			Static23.method323(local99, local92, arg2, local87);
			Static23.method323(local106, local92, arg2, local87);
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V")
	public static void method4378() {
		if (Static152.anInt2736 != 0) {
			Static214.anInt6453 -= Static152.anInt2736 * 5;
			if (Static214.anInt6453 >= Static72.anInt1373) {
				Static214.anInt6453 = Static72.anInt1373 - 1;
			}
			if (Static214.anInt6453 < 0) {
				Static214.anInt6453 = 0;
			}
			Static152.anInt2736 = 0;
		}
		if (Static114.anInt2194 < 102) {
			Static114.anInt2194 += 6;
		}
		for (@Pc(52) int local52 = 0; local52 < Static64.anInt1162; local52++) {
			@Pc(60) int local60 = Static209.aClass22Array3[local52].method367();
			@Pc(66) char local66 = Static209.aClass22Array3[local52].method366();
			if (local60 == 84) {
				Static199.method3070();
			} else if (Static254.aClass10_1.method221(82) && local60 == 66) {
				if (Static218.aClipboard1 != null) {
					@Pc(345) String local345 = "";
					for (@Pc(350) int local350 = Static71.aStringArray12.length - 1; local350 >= 0; local350--) {
						if (Static71.aStringArray12[local350] != null && Static71.aStringArray12[local350].length() > 0) {
							local345 = local345 + Static71.aStringArray12[local350] + '\n';
						}
					}
					Static218.aClipboard1.setContents(new StringSelection(local345), null);
				}
			} else if (Static254.aClass10_1.method221(82) && local60 == 67) {
				if (Static218.aClipboard1 != null) {
					@Pc(91) Transferable local91 = Static218.aClipboard1.getContents(null);
					if (local91 != null) {
						try {
							@Pc(98) String local98 = (String) local91.getTransferData(DataFlavor.stringFlavor);
							if (local98 != null) {
								@Pc(105) String[] local105 = Static71.method1050('\n', local98);
								if (local105.length <= 1) {
									Static138.aString88 = Static138.aString88 + local98;
								} else {
									for (@Pc(122) int local122 = 0; local122 < local105.length; local122++) {
										Static138.aString88 = local105[local122];
										Static199.method3070();
									}
								}
							}
						} catch (@Pc(137) Exception local137) {
						}
					}
				}
			} else if (local60 == 85 && Static379.anInt6817 > 0) {
				Static138.aString88 = Static138.aString88.substring(0, Static379.anInt6817 - 1) + Static138.aString88.substring(Static379.anInt6817);
				Static379.anInt6817--;
			} else if (local60 == 101 && Static379.anInt6817 < Static138.aString88.length()) {
				Static138.aString88 = Static138.aString88.substring(0, Static379.anInt6817) + Static138.aString88.substring(Static379.anInt6817 + 1);
			} else if (local60 == 96 && Static379.anInt6817 > 0) {
				Static379.anInt6817--;
			} else if (local60 == 97 && Static379.anInt6817 < Static138.aString88.length()) {
				Static379.anInt6817++;
			} else if (local60 == 102) {
				Static379.anInt6817 = 0;
			} else if (local60 == 103) {
				Static379.anInt6817 = Static138.aString88.length();
			} else if (local60 == 104 && Static71.aStringArray12.length > Static213.anInt3819) {
				Static213.anInt3819++;
				Static361.method5152();
				Static379.anInt6817 = Static138.aString88.length();
			} else if (local60 == 105 && Static213.anInt3819 > 0) {
				Static213.anInt3819--;
				Static361.method5152();
				Static379.anInt6817 = Static138.aString88.length();
			} else if (Static204.method3113(local66) || local66 == ':' || local66 == ',' || local66 == ' ' || local66 == '_' || local66 == '-' || local66 == '+' || local66 == '[' || local66 == ']') {
				Static138.aString88 = Static138.aString88.substring(0, Static379.anInt6817) + Static209.aClass22Array3[local52].method366() + Static138.aString88.substring(Static379.anInt6817);
				Static379.anInt6817++;
			}
		}
		Static64.anInt1162 = 0;
		Static197.method3044();
	}
}
