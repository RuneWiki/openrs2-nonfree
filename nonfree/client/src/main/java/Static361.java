import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "Lclient!jba;")
	public static Class83 aClass83_4;

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "Z")
	public static final boolean aBoolean468 = false;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V")
	public static void method4889() {
		Static578.aClass341ArrayArray2 = new Class341[Static466.aClass270_99.method5674()][];
		Static294.aClass341ArrayArray1 = new Class341[Static466.aClass270_99.method5674()][];
		Static410.aBooleanArray15 = new boolean[Static466.aClass270_99.method5674()];
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public static void method4892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Class341 local8 = Static49.method751(arg1, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray17 != null) {
			@Pc(18) Class1_Sub15 local18 = new Class1_Sub15();
			local18.anObjectArray1 = local8.anObjectArray17;
			local18.aString17 = arg3;
			local18.aClass341_10 = local8;
			local18.anInt2004 = arg0;
			Static80.method1451(local18);
		}
		if (Static216.anInt4135 != 10 || !Static63.method1137(local8).method7772(arg0 - 1)) {
			return;
		}
		@Pc(60) Class1_Sub11 local60;
		if (arg0 == 1) {
			local60 = Static276.method3885(Static425.aClass70_73, Static481.aClass276_2);
			Static146.method7813(arg2, local60, arg1, local8.anInt9328);
			Static48.method743(local60);
		}
		if (arg0 == 2) {
			local60 = Static276.method3885(Static487.aClass70_86, Static481.aClass276_2);
			Static146.method7813(arg2, local60, arg1, local8.anInt9328);
			Static48.method743(local60);
		}
		if (arg0 == 3) {
			local60 = Static276.method3885(Static569.aClass70_100, Static481.aClass276_2);
			Static146.method7813(arg2, local60, arg1, local8.anInt9328);
			Static48.method743(local60);
		}
		if (arg0 == 4) {
			local60 = Static276.method3885(Static470.aClass70_82, Static481.aClass276_2);
			Static146.method7813(arg2, local60, arg1, local8.anInt9328);
			Static48.method743(local60);
		}
		if (arg0 == 5) {
			local60 = Static276.method3885(Static503.aClass70_91, Static481.aClass276_2);
			Static146.method7813(arg2, local60, arg1, local8.anInt9328);
			Static48.method743(local60);
		}
		if (arg0 == 6) {
			local60 = Static276.method3885(Static448.aClass70_79, Static481.aClass276_2);
			Static146.method7813(arg2, local60, arg1, local8.anInt9328);
			Static48.method743(local60);
		}
		if (arg0 == 7) {
			local60 = Static276.method3885(Static39.aClass70_8, Static481.aClass276_2);
			Static146.method7813(arg2, local60, arg1, local8.anInt9328);
			Static48.method743(local60);
		}
		if (arg0 == 8) {
			local60 = Static276.method3885(Static441.aClass70_89, Static481.aClass276_2);
			Static146.method7813(arg2, local60, arg1, local8.anInt9328);
			Static48.method743(local60);
		}
		if (arg0 == 9) {
			local60 = Static276.method3885(Static106.aClass70_20, Static481.aClass276_2);
			Static146.method7813(arg2, local60, arg1, local8.anInt9328);
			Static48.method743(local60);
		}
		if (arg0 == 10) {
			local60 = Static276.method3885(Static239.aClass70_47, Static481.aClass276_2);
			Static146.method7813(arg2, local60, arg1, local8.anInt9328);
			Static48.method743(local60);
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
	public static String method4896(@OriginalArg(0) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(18) String local18 = arg0[arg2];
			return local18 == null ? "null" : local18.toString();
		} else {
			@Pc(29) int local29 = arg1 + arg2;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = arg2; local33 < local29; local33++) {
				@Pc(39) String local39 = arg0[local33];
				if (local39 == null) {
					local31 += 4;
				} else {
					local31 += local39.length();
				}
			}
			@Pc(62) StringBuffer local62 = new StringBuffer(local31);
			for (@Pc(64) int local64 = arg2; local64 < local29; local64++) {
				@Pc(73) String local73 = arg0[local64];
				if (local73 == null) {
					local62.append("null");
				} else {
					local62.append(local73);
				}
			}
			return local62.toString();
		}
	}
}
