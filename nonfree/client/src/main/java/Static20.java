import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!aka", name = "d", descriptor = "I")
	public static int anInt267;

	@OriginalMember(owner = "client!aka", name = "e", descriptor = "I")
	public static int anInt270;

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_7 = new Class349(82, 3);

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(I)Z")
	public static boolean method276() {
		try {
			if (Static39.anInt535 == 2) {
				if (Static156.aClass2_Sub21_2 == null) {
					Static156.aClass2_Sub21_2 = Static729.method2358(Static24.aClass254_16, Static450.anInt7299, Static403.anInt6656);
					if (Static156.aClass2_Sub21_2 == null) {
						return false;
					}
				}
				if (Static314.aClass6_1 == null) {
					Static314.aClass6_1 = new Class6(Static60.aClass254_34, Static59.aClass254_33);
				}
				@Pc(42) Class2_Sub23_Sub5 local42 = Static442.aClass2_Sub23_Sub5_3;
				if (Static478.aClass2_Sub23_Sub5_4 != null) {
					local42 = Static478.aClass2_Sub23_Sub5_4;
				}
				if (local42.method7686(Static156.aClass2_Sub21_2, Static357.aClass254_101, Static314.aClass6_1)) {
					Static442.aClass2_Sub23_Sub5_3 = local42;
					Static442.aClass2_Sub23_Sub5_3.method7693();
					@Pc(79) int local79;
					if (Static84.anInt1426 > 0) {
						Static39.anInt535 = 3;
						Static442.aClass2_Sub23_Sub5_3.method7682(Static515.anInt8213 < Static84.anInt1426 ? Static515.anInt8213 : Static84.anInt1426);
						for (local79 = 0; local79 < Static160.anIntArray200.length; local79++) {
							Static442.aClass2_Sub23_Sub5_3.method7711(local79, Static160.anIntArray200[local79]);
							Static160.anIntArray200[local79] = 255;
						}
					} else {
						Static39.anInt535 = 0;
						Static442.aClass2_Sub23_Sub5_3.method7682(Static515.anInt8213);
						for (local79 = 0; local79 < Static160.anIntArray200.length; local79++) {
							Static442.aClass2_Sub23_Sub5_3.method7711(local79, Static160.anIntArray200[local79]);
							Static160.anIntArray200[local79] = 255;
						}
					}
					if (Static478.aClass2_Sub23_Sub5_4 == null) {
						if (Static383.aLong10 > 0L) {
							Static442.aClass2_Sub23_Sub5_3.method7694(Static112.aBoolean215, Static383.aLong10, Static156.aClass2_Sub21_2);
						} else {
							Static442.aClass2_Sub23_Sub5_3.method7685(Static112.aBoolean215, Static156.aClass2_Sub21_2);
						}
					}
					if (Static161.aClass70_1 != null) {
						Static161.aClass70_1.method9365(Static442.aClass2_Sub23_Sub5_3);
					}
					Static383.aLong10 = 0L;
					Static478.aClass2_Sub23_Sub5_4 = null;
					Static24.aClass254_16 = null;
					Static156.aClass2_Sub21_2 = null;
					Static314.aClass6_1 = null;
					return true;
				}
			}
		} catch (@Pc(194) Exception local194) {
			local194.printStackTrace();
			Static442.aClass2_Sub23_Sub5_3.method7681();
			Static39.anInt535 = 0;
			Static24.aClass254_16 = null;
			Static314.aClass6_1 = null;
			Static478.aClass2_Sub23_Sub5_4 = null;
			Static156.aClass2_Sub21_2 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(B)Z")
	public static boolean method277() {
		return Static359.aBoolean487;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(II)V")
	public static void method278(@OriginalArg(1) int arg0) {
		Static537.anInt5296 = -1;
		Static704.anInt10775 = arg0;
		Static537.anInt5296 = -1;
		Static360.method5164();
	}
}
