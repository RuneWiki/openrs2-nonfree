import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!te", name = "s", descriptor = "[I")
	public static int[] anIntArray603;

	@OriginalMember(owner = "client!te", name = "y", descriptor = "I")
	public static int anInt8878 = 0;

	@OriginalMember(owner = "client!te", name = "z", descriptor = "Lclient!tb;")
	public static final Class328 aClass328_10 = new Class328();

	@OriginalMember(owner = "client!te", name = "B", descriptor = "I")
	public static int anInt8880 = 0;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!paa;IZ)Ljava/lang/String;")
	public static String method7470(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1) {
		if (!Static76.method1071(arg0).method6882(arg1) && arg0.anObjectArray4 == null) {
			return null;
		} else if (arg0.aStringArray35 == null || arg1 >= arg0.aStringArray35.length || arg0.aStringArray35[arg1] == null || arg0.aStringArray35[arg1].trim().length() == 0) {
			return Static488.aBoolean602 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray35[arg1];
		}
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)I")
	public static int method7471() {
		return Static343.method4362(false);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	public static void method7472() {
		Static17.method248();
		@Pc(12) int local12 = Static234.aClass2_Sub5_48.aClass6_Sub27_1.method8300();
		if (local12 == 2) {
			Static288.method4008(Static153.anInt2747, Static192.aClass95_4, Static511.anInt8548);
		} else if (local12 == 3) {
			Static181.method2640(Static153.anInt2747, Static511.anInt8548, Static555.anInt9085, Static514.anInt8567, Static192.aClass95_4);
		}
		if (Static234.aClass2_Sub5_48.aClass6_Sub27_1.method8297()) {
			Static203.method2860(Static504.aCanvas11);
		}
		if (Static192.aClass95_4 != null) {
			Static130.method1833();
		}
		Static449.aBoolean538 = Static234.aClass2_Sub5_48.aClass6_Sub27_1.method8300() != 0;
		Static319.aBoolean356 = Static234.aClass2_Sub5_48.aClass6_Sub27_1.method8297();
	}
}
