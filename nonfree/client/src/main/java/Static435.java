import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!ov", name = "h", descriptor = "Lclient!sha;")
	public static Class321 aClass321_34 = null;

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "Lclient!af;")
	public static final Class10 aClass10_43 = new Class10(128, 4);

	@OriginalMember(owner = "client!ov", name = "l", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ov", name = "m", descriptor = "Lclient!iga;")
	public static final Class159 aClass159_12 = new Class159(11, 4);

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)V")
	public static void method6424() {
		if (Static546.aClass132_13 == null) {
			return;
		}
		if (Static594.aBoolean693) {
			Static555.method7833();
		}
		Static663.aClass115_12.method2465();
		Static609.method8408();
		Static187.method2662();
		Static172.method2461();
		Static83.method1463();
		Static605.method8306();
		if (Static312.aClass93_2 != null) {
			Static312.aClass93_2.method2058();
		}
		Static465.method6879();
		Static274.method4045();
		Static254.method3660();
		Static653.method8883();
		Static617.method8513(false);
		for (@Pc(44) int local44 = 0; local44 < 2048; local44++) {
			@Pc(50) Class2_Sub1_Sub1_Sub3_Sub1 local50 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local44];
			if (local50 != null) {
				for (@Pc(54) int local54 = 0; local54 < local50.aClass184Array3.length; local54++) {
					local50.aClass184Array3[local54] = null;
				}
			}
		}
		for (@Pc(79) int local79 = 0; local79 < Static490.anInt8336; local79++) {
			@Pc(86) Class2_Sub1_Sub1_Sub3_Sub2 local86 = Static84.aClass6_Sub44Array1[local79].aClass2_Sub1_Sub1_Sub3_Sub2_2;
			if (local86 != null) {
				for (@Pc(90) int local90 = 0; local90 < local86.aClass184Array3.length; local90++) {
					local86.aClass184Array3[local90] = null;
				}
			}
		}
		Static347.aClass207_39 = null;
		Static185.aClass207_13 = null;
		Static546.aClass132_13.method7491();
		Static546.aClass132_13 = null;
	}
}
