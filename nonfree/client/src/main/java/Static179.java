import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!we", name = "c", descriptor = "Lclient!cb;")
	public static Class13_Sub1 aClass13_Sub1_20;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Lclient!f;")
	public static Class13 aClass13_35;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "I")
	public static int anInt3897 = 0;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2077 = Static122.method531("::rect_debug");

	@OriginalMember(owner = "client!we", name = "g", descriptor = "Lclient!b;")
	public static Class7 aClass7_28 = new Class7(30);

	@OriginalMember(owner = "client!we", name = "h", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2078 = Static122.method531("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Lclient!sd;")
	private static Class73 aClass73_2080 = Static122.method531("Type");

	@OriginalMember(owner = "client!we", name = "k", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2079 = aClass73_2080;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public static void method2755() {
		for (@Pc(15) Class3_Sub1_Sub4_Sub1 local15 = (Class3_Sub1_Sub4_Sub1) Static94.aClass72_29.method2401(); local15 != null; local15 = (Class3_Sub1_Sub4_Sub1) Static94.aClass72_29.method2407()) {
			if (Static147.anInt3309 != local15.anInt432 || Static44.anInt1024 > local15.anInt429) {
				local15.method2783();
			} else if (local15.anInt419 <= Static44.anInt1024) {
				if (local15.anInt416 > 0) {
					@Pc(46) Class3_Sub1_Sub4_Sub7_Sub2 local46 = Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local15.anInt416 - 1];
					if (local46 != null && local46.anInt3169 >= 0 && local46.anInt3169 < 13312 && local46.anInt3159 >= 0 && local46.anInt3159 < 13312) {
						local15.method300(local46.anInt3159, local46.anInt3169, Static107.method1922(local46.anInt3169, local46.anInt3159, local15.anInt432) - local15.anInt430, Static44.anInt1024);
					}
				}
				if (local15.anInt416 < 0) {
					@Pc(99) int local99 = -local15.anInt416 - 1;
					@Pc(108) Class3_Sub1_Sub4_Sub7_Sub1 local108;
					if (Static61.anInt1455 == local99) {
						local108 = Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1;
					} else {
						local108 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local99];
					}
					if (local108 != null && local108.anInt3169 >= 0 && local108.anInt3169 < 13312 && local108.anInt3159 >= 0 && local108.anInt3159 < 13312) {
						local15.method300(local108.anInt3159, local108.anInt3169, Static107.method1922(local108.anInt3169, local108.anInt3159, local15.anInt432) - local15.anInt430, Static44.anInt1024);
					}
				}
				local15.method294(Static165.anInt320);
				Static119.aClass35_1.method1144(Static147.anInt3309, (int) local15.aDouble4, (int) local15.aDouble3, (int) local15.aDouble8, 60, local15, local15.anInt431, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 1 || arg3 < 1 || arg0 > 102 || arg3 > 102) {
			return;
		}
		if (Static85.aBoolean127 && arg2 != Static147.anInt3309) {
			return;
		}
		@Pc(33) int local33 = 0;
		if (arg4 == 0) {
			local33 = Static119.aClass35_1.method1149(arg2, arg0, arg3);
		}
		if (arg4 == 1) {
			local33 = Static119.aClass35_1.method1176(arg2, arg0, arg3);
		}
		if (arg4 == 2) {
			local33 = Static119.aClass35_1.method1174(arg2, arg0, arg3);
		}
		if (arg4 == 3) {
			local33 = Static119.aClass35_1.method1154(arg2, arg0, arg3);
		}
		@Pc(95) int local95;
		if (local33 != 0) {
			@Pc(88) int local88 = local33 >> 14 & 0x7FFF;
			local95 = Static119.aClass35_1.method1130(arg2, arg0, arg3, local33);
			@Pc(99) int local99 = local95 & 0x1F;
			@Pc(105) int local105 = local95 >> 6 & 0x3;
			@Pc(119) Class3_Sub1_Sub15 local119;
			if (arg4 == 0) {
				Static119.aClass35_1.method1159(arg2, arg0, arg3);
				local119 = Static151.method2466(local88);
				if (local119.anInt3008 != 0) {
					Static41.aClass60Array1[arg2].method2149(local105, local99, local119.aBoolean205, arg3, arg0);
				}
			}
			if (arg4 == 1) {
				Static119.aClass35_1.method1139(arg2, arg0, arg3);
			}
			if (arg4 == 2) {
				Static119.aClass35_1.method1164(arg2, arg0, arg3);
				local119 = Static151.method2466(local88);
				if (arg0 + local119.anInt3012 > 103 || local119.anInt3012 + arg3 > 103 || local119.anInt3014 + arg0 > 103 || arg3 + local119.anInt3014 > 103) {
					return;
				}
				if (local119.anInt3008 != 0) {
					Static41.aClass60Array1[arg2].method2156(local119.aBoolean205, local105, arg3, local119.anInt3014, local119.anInt3012, arg0);
				}
			}
			if (arg4 == 3) {
				Static119.aClass35_1.method1140(arg2, arg0, arg3);
				local119 = Static151.method2466(local88);
				if (local119.anInt3008 == 1) {
					Static41.aClass60Array1[arg2].method2157(arg3, arg0);
				}
			}
		}
		if (arg5 < 0) {
			return;
		}
		local95 = arg2;
		if (arg2 < 3 && (Static110.aByteArrayArrayArray5[1][arg0][arg3] & 0x2) == 2) {
			local95 = arg2 + 1;
		}
		Static17.method2687(Static119.aClass35_1, arg2, local95, arg6, arg3, Static41.aClass60Array1[arg2], arg5, arg1, arg0);
		return;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
	public static void method2757() {
		aClass73_2080 = null;
		aClass73_2078 = null;
		aClass73_2077 = null;
		aClass73_2079 = null;
		aClass7_28 = null;
		aClass13_35 = null;
		aClass13_Sub1_20 = null;
	}
}
