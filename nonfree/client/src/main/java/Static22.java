import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bf", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString173 = "Drop";

	@OriginalMember(owner = "client!bf", name = "Q", descriptor = "[I")
	public static int[] anIntArray597 = new int[200];

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "()V")
	public static void method3915() {
		for (@Pc(1) int local1 = 0; local1 < Static289.anInt5737; local1++) {
			@Pc(8) Class124 local8 = Static189.aClass124Array3[local1];
			Static166.method2528(local8);
			Static189.aClass124Array3[local1] = null;
		}
		Static289.anInt5737 = 0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method3916(@OriginalArg(1) String arg0) {
		if (Static166.aClass50_2 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(25) int local25 = 0; local25 < Static166.aClass50_2.anInt1409; local25++) {
			if (Static115.method1775(" ", "<br>", Static166.aClass50_2.aStringArray6[local25]).equals(arg0)) {
				return local25;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIB)I")
	public static int method3918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg0 >> 31 & arg1 - 1;
		return (arg0 + (arg0 >>> 31)) % arg1 + local11;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!vk;ZB)V")
	public static void method3920(@OriginalArg(0) Class1_Sub32 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(9) int local9 = (int) arg0.aLong202;
		@Pc(16) int local16 = arg0.anInt5665;
		arg0.method4534();
		if (arg1) {
			Static23.method4490(local16);
		}
		Static52.method904(local16);
		@Pc(32) Class127 local32 = Static75.method1287(local9);
		if (local32 != null) {
			Static155.method2392(local32);
		}
		@Pc(40) int local40 = Static29.anInt626;
		@Pc(42) int local42;
		for (local42 = 0; local42 < local40; local42++) {
			if (Static17.method317(Static276.aShortArray92[local42])) {
				Static292.method4476(local42);
			}
		}
		if (Static29.anInt626 == 1) {
			Static192.aBoolean414 = false;
			Static198.method3031(Static210.anInt4223, Static275.anInt5486, Static229.anInt4793, Static112.anInt2084);
		} else {
			Static198.method3031(Static210.anInt4223, Static275.anInt5486, Static229.anInt4793, Static112.anInt2084);
			local42 = Static10.aClass1_Sub2_Sub12_1.method4390(Static167.aString104);
			for (@Pc(88) int local88 = 0; local88 < Static29.anInt626; local88++) {
				@Pc(97) int local97 = Static10.aClass1_Sub2_Sub12_1.method4390(Static242.method3843(local88));
				if (local97 > local42) {
					local42 = local97;
				}
			}
			Static229.anInt4793 = Static29.anInt626 * 15 + (Static91.aBoolean128 ? 26 : 22);
			Static210.anInt4223 = local42 + 8;
		}
		if (Static121.anInt2350 != -1) {
			Static244.method3859(1, Static121.anInt2350);
		}
	}
}
