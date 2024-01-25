import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!hia", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray13 = new String[200];

	@OriginalMember(owner = "client!hia", name = "b", descriptor = "(B)V")
	public static void method2956() {
		if (Static88.aClass95_2 != null) {
			Static88.aClass95_2.method6930();
			Static88.aClass95_2 = null;
			Static527.aClass62_19 = null;
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void method2957(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) String local4 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(23) int local23 = arg1 ? 32768 : 0;
		@Pc(33) int local33 = (arg1 ? Static295.aClass362_2.anInt9712 : Static295.aClass362_2.anInt9716) + local23;
		for (@Pc(35) int local35 = local23; local35 < local33; local35++) {
			@Pc(42) Class2_Sub2_Sub10 local42 = Static295.aClass362_2.method8112(local35);
			if (local42.aBoolean263 && local42.method3157().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static354.aShortArray80 = null;
					Static129.anInt8997 = -1;
					return;
				}
				if (local13 >= local11.length) {
					@Pc(75) short[] local75 = new short[local11.length * 2];
					for (@Pc(77) int local77 = 0; local77 < local13; local77++) {
						local75[local77] = local11[local77];
					}
					local11 = local75;
				}
				local11[local13++] = (short) local35;
			}
		}
		Static354.aShortArray80 = local11;
		Static330.anInt6459 = 0;
		Static129.anInt8997 = local13;
		@Pc(110) String[] local110 = new String[Static129.anInt8997];
		for (@Pc(112) int local112 = 0; local112 < Static129.anInt8997; local112++) {
			local110[local112] = Static295.aClass362_2.method8112(local11[local112]).method3157();
		}
		Static51.method835(local110, Static354.aShortArray80);
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(I)I")
	public static int method2958() {
		return Static491.anInt8078 == 1 ? Static61.anInt1162 : Static325.anInt5186;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(IIB)Z")
	public static boolean method2959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg0 & 0x2000) != 0 | Static134.method1848(arg0, arg1) | Static288.method4011(arg0, arg1)) & Static437.method5993(arg0, arg1);
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(IIIZILclient!wu;I)V")
	public static void method2960(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) Class380 arg2) {
		Static33.anInt738 = arg0;
		Static74.anInt1268 = arg1;
		Static527.aClass2_Sub13_Sub3_4 = null;
		Static140.aBoolean200 = false;
		Static575.anInt9354 = 2;
		Static317.anInt5047 = 1;
		Static468.anInt7474 = 0;
		Static93.aClass380_31 = arg2;
	}
}
