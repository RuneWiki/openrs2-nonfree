import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!vca", name = "n", descriptor = "I")
	public static int anInt9070;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method7255(@OriginalArg(1) String arg0) {
		if (!Static355.aBoolean473 || (Static277.anInt4787 & 0x18) == 0) {
			return;
		}
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = Static84.anInt9548;
		@Pc(21) int[] local21 = Static520.anIntArray555;
		for (@Pc(23) int local23 = 0; local23 < local19; local23++) {
			@Pc(31) Class12_Sub2_Sub1_Sub4_Sub1 local31 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local21[local23]];
			if (local31.aString75 != null && local31.aString75.equalsIgnoreCase(arg0) && (local31 == Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30 && (Static277.anInt4787 & 0x10) != 0 || local31 != null && (Static277.anInt4787 & 0x8) != 0)) {
				@Pc(67) Class2_Sub34 local67 = Static555.method7264(Static535.aClass154_125, Static551.aClass64_2);
				local67.aClass2_Sub7_Sub2_2.method4492(Static229.anInt3341);
				local67.aClass2_Sub7_Sub2_2.method4473(0);
				local67.aClass2_Sub7_Sub2_2.method4512(Static460.anInt7404);
				local67.aClass2_Sub7_Sub2_2.method4489(Static464.anInt7423);
				local67.aClass2_Sub7_Sub2_2.method4492(local21[local23]);
				Static100.method1508(local67);
				local17 = true;
				Static425.method5884(0, -2, local31.method6777(), local31.anIntArray565[0], local31.method6777(), true, 0, local31.anIntArray566[0]);
				break;
			}
		}
		if (!local17) {
			Static581.method7527(Static229.aClass159_23.method2776(Static261.anInt4297) + arg0);
		}
		if (Static355.aBoolean473) {
			Static5.method84();
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(III)Z")
	public static boolean method7256(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
