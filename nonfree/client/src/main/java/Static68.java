import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!la", name = "E", descriptor = "Lclient!pb;")
	public static Class1_Sub1_Sub4_Sub4 aClass1_Sub1_Sub4_Sub4_5;

	@OriginalMember(owner = "client!la", name = "O", descriptor = "Z")
	public static boolean aBoolean150;

	@OriginalMember(owner = "client!la", name = "P", descriptor = "Lclient!ua;")
	public static Class62_Sub1 aClass62_Sub1_47;

	@OriginalMember(owner = "client!la", name = "A", descriptor = "Lclient!kd;")
	private static Class39 aClass39_866 = Static108.method1915("Report abuse");

	@OriginalMember(owner = "client!la", name = "D", descriptor = "Lclient!kd;")
	public static Class39 aClass39_867 = aClass39_866;

	@OriginalMember(owner = "client!la", name = "G", descriptor = "Lclient!kd;")
	private static Class39 aClass39_868 = Static108.method1915("No matching objects found)1 please shorten search");

	@OriginalMember(owner = "client!la", name = "K", descriptor = "I")
	public static int anInt1752 = 0;

	@OriginalMember(owner = "client!la", name = "M", descriptor = "Lclient!kd;")
	public static Class39 aClass39_869 = aClass39_868;

	@OriginalMember(owner = "client!la", name = "N", descriptor = "Z")
	public static boolean aBoolean149 = false;

	@OriginalMember(owner = "client!la", name = "U", descriptor = "[Lclient!kd;")
	public static Class39[] aClass39Array20 = new Class39[100];

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!q;ILclient!q;)I")
	public static int method1214(@OriginalArg(0) Class62 arg0, @OriginalArg(2) Class62 arg1) {
		@Pc(1) int local1 = 0;
		if (arg0.method2007(Static38.aClass39_540, Static75.aClass39_929)) {
			local1++;
		}
		if (arg1.method2007(Static38.aClass39_540, Static98.aClass39_1190)) {
			local1++;
		}
		if (arg1.method2007(Static38.aClass39_540, Static11.aClass39_222)) {
			local1++;
		}
		if (arg1.method2007(Static38.aClass39_540, Static74.aClass39_921)) {
			local1++;
		}
		if (arg1.method2007(Static38.aClass39_540, Static56.aClass39_745)) {
			local1++;
		}
		if (arg1.method2007(Static38.aClass39_540, Static1.aClass39_31)) {
			local1++;
		}
		arg1.method2007(Static38.aClass39_540, Static64.aClass39_825);
		arg1.method2007(Static38.aClass39_540, Static29.aClass39_451);
		arg1.method2007(Static38.aClass39_540, Static87.aClass39_1010);
		arg1.method2007(Static38.aClass39_540, Static88.aClass39_1063);
		arg1.method2007(Static38.aClass39_540, Static110.aClass39_1341);
		return local1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLclient!a;)Lclient!kd;")
	public static Class39 method1215(@OriginalArg(1) Class1_Sub1_Sub1 arg0) {
		if (Static54.method989(Static129.method2213(arg0)) == 0) {
			return null;
		} else if (arg0.aClass39_37 == null || arg0.aClass39_37.method1183().method1175() == 0) {
			return Static120.aBoolean252 ? Static38.aClass39_545 : null;
		} else {
			return arg0.aClass39_37;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)Z")
	public static boolean method1216(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class1_Sub1_Sub18 local14 = Static104.method1862(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local14.method2120(arg0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public static void method1217() {
		while (true) {
			if (Static79.aClass1_Sub18_Sub1_3.method2191(Static72.anInt1801) >= 11) {
				@Pc(21) int local21 = Static79.aClass1_Sub18_Sub1_3.method2199(11);
				if (local21 != 2047) {
					@Pc(28) boolean local28 = false;
					if (Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local21] == null) {
						local28 = true;
						Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local21] = new Class1_Sub1_Sub2_Sub1_Sub2();
						if (Static35.aClass1_Sub18Array1[local21] != null) {
							Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local21].method1804(Static35.aClass1_Sub18Array1[local21]);
						}
					}
					Static12.anIntArray91[Static57.anInt1547++] = local21;
					@Pc(64) Class1_Sub1_Sub2_Sub1_Sub2 local64 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local21];
					local64.anInt2514 = Static45.anInt1256;
					@Pc(72) int local72 = Static79.aClass1_Sub18_Sub1_3.method2199(1);
					if (local72 == 1) {
						Static117.anIntArray460[Static94.anInt2224++] = local21;
					}
					@Pc(90) int local90 = Static11.anIntArray89[Static79.aClass1_Sub18_Sub1_3.method2199(3)];
					if (local28) {
						local64.anInt2509 = local90;
					}
					@Pc(100) int local100 = Static79.aClass1_Sub18_Sub1_3.method2199(1);
					@Pc(105) int local105 = Static79.aClass1_Sub18_Sub1_3.method2199(5);
					if (local105 > 15) {
						local105 -= 32;
					}
					@Pc(114) int local114 = Static79.aClass1_Sub18_Sub1_3.method2199(5);
					if (local114 > 15) {
						local114 -= 32;
					}
					local64.method1803(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0] + local105, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0] + local114, local100 == 1);
					continue;
				}
			}
			Static79.aClass1_Sub18_Sub1_3.method2198();
			return;
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	public static void method1218() {
		aClass62_Sub1_47 = null;
		aClass39Array20 = null;
		aClass39_866 = null;
		aClass39_869 = null;
		aClass39_868 = null;
		aClass39_867 = null;
		aClass1_Sub1_Sub4_Sub4_5 = null;
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(I)V")
	public static void method1219() {
		if (aBoolean149 && Static9.anInt2983 != Static94.anInt2217) {
			Static98.method1724(Static8.anInt430, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray389[0], Static124.anInt2999, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray387[0], Static9.anInt2983);
		} else if (Static9.anInt2983 != Static117.anInt2909) {
			Static117.anInt2909 = Static9.anInt2983;
			Static112.method1960(Static9.anInt2983);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IBI)I")
	public static int method1220(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 >>> 31;
		return (arg0 + local8) / arg1 - local8;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILclient!q;)[Lclient!pb;")
	public static Class1_Sub1_Sub4_Sub4[] method1221(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2) {
		return Static119.method2054(arg0, arg1, arg2) ? Static11.method271() : null;
	}
}
