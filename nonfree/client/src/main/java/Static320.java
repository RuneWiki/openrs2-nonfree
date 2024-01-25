import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "Lclient!kh;")
	public static Class54 aClass54_22;

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
	public static int anInt6059;

	@OriginalMember(owner = "client!uk", name = "g", descriptor = "Lclient!ra;")
	public static Class170 aClass170_113;

	@OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
	public static int anInt6060;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	public static void method5395() {
		Static335.aClass5_Sub1_Sub1_3.anInt2029 = 0;
		Static161.anInt3248 = -1;
		Static1.anInt4 = -1;
		Static6.aClass5_Sub1_Sub1_1.anInt2029 = 0;
		Static179.anInt3568 = 0;
		Static269.anInt5162 = 0;
		Static335.anInt6325 = -1;
		Static12.anInt371 = 0;
		Static316.anInt6045 = -1;
		Static353.method5825();
		Static206.method3682();
		for (@Pc(33) int local33 = 0; local33 < Static312.aClass25_Sub1_Sub1_Sub1Array1.length; local33++) {
			if (Static312.aClass25_Sub1_Sub1_Sub1Array1[local33] != null) {
				Static312.aClass25_Sub1_Sub1_Sub1Array1[local33].anInt5332 = -1;
			}
		}
		for (@Pc(51) int local51 = 0; local51 < Static188.aClass25_Sub1_Sub1_Sub2Array1.length; local51++) {
			if (Static188.aClass25_Sub1_Sub1_Sub2Array1[local51] != null) {
				Static188.aClass25_Sub1_Sub1_Sub2Array1[local51].anInt5332 = -1;
			}
		}
		Static102.method2048();
		Static215.anInt4279 = 1;
		Static293.method4971(30);
		for (@Pc(80) int local80 = 0; local80 < 100; local80++) {
			Static293.aBooleanArray25[local80] = true;
		}
		Static125.method2419();
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)V")
	public static void method5397(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub9_Sub16 local8 = Static239.method4052(12, arg0);
		local8.method4140();
		local8.anInt4723 = arg1;
	}
}
