import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "F")
	public static float aFloat155;

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
	public static int anInt5441;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "Z")
	public static boolean aBoolean365 = false;

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
	public static int anInt5438 = 0;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "Z")
	public static boolean aBoolean366 = false;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
	public static void method4326() {
		Static137.aBoolean176 = false;
		Static185.anInt3683 = -1;
		Static11.anInt280 = -1;
		Static175.aClass4_Sub24_Sub1_1.anInt3822 = 0;
		Static138.anInt2729 = -1;
		Static31.anInt653 = 0;
		Static169.anInt3385 = 0;
		Static286.anInt5602 = 0;
		Static11.anInt279 = 0;
		Static181.anInt5855 = -1;
		Static137.anInt2703 = 0;
		Static218.anInt4197 = 0;
		Static256.aClass4_Sub24_Sub1_3.anInt3822 = 0;
		@Pc(35) int local35;
		for (local35 = 0; local35 < Static100.aClass13_Sub5_Sub1Array1.length; local35++) {
			if (Static100.aClass13_Sub5_Sub1Array1[local35] != null) {
				Static100.aClass13_Sub5_Sub1Array1[local35].anInt5256 = -1;
			}
		}
		for (local35 = 0; local35 < Static260.aClass13_Sub5_Sub2Array114.length; local35++) {
			if (Static260.aClass13_Sub5_Sub2Array114[local35] != null) {
				Static260.aClass13_Sub5_Sub2Array114[local35].anInt5256 = -1;
			}
		}
		Static214.method4434();
		Static99.anInt1946 = 1;
		Static123.method2035(30);
		for (@Pc(92) int local92 = 0; local92 < 100; local92++) {
			Static48.aBooleanArray14[local92] = true;
		}
		Static195.method3184();
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)V")
	public static void method4327() {
		Static297.aClass172_44.method4349(5);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)I")
	public static int method4329(@OriginalArg(1) int arg0) {
		@Pc(14) Class149 local14 = Static194.method3177(arg0);
		@Pc(17) int local17 = local14.anInt4771;
		@Pc(20) int local20 = local14.anInt4772;
		@Pc(23) int local23 = local14.anInt4768;
		@Pc(30) int local30 = Class13_Sub2.anIntArray71[local17 - local23];
		return Static298.anIntArray414[local20] >> local23 & local30;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
	public static void method4330() {
		if (Static136.anInt2689 != -1) {
			Static199.method2419(Static136.anInt2689, -1, -1);
			Static136.anInt2689 = -1;
		}
	}
}
