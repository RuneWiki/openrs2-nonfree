import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!du", name = "j", descriptor = "Lclient!m;")
	public static Interface5 anInterface5_18;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "Z")
	public static boolean aBoolean532 = false;

	@OriginalMember(owner = "client!du", name = "b", descriptor = "[I")
	public static final int[] anIntArray483 = new int[14];

	@OriginalMember(owner = "client!du", name = "c", descriptor = "I")
	public static int anInt6557 = 0;

	@OriginalMember(owner = "client!du", name = "d", descriptor = "Z")
	public static final boolean aBoolean533 = false;

	@OriginalMember(owner = "client!du", name = "f", descriptor = "I")
	public static int anInt6558 = 104;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)Z")
	public static boolean method5129() {
		try {
			return Static169.method2633();
		} catch (@Pc(14) IOException local14) {
			Static205.method4048();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static397.aClass12_345 == null ? -1 : Static397.aClass12_345.method235()) + "," + (Static84.aClass12_300 == null ? -1 : Static84.aClass12_300.method235()) + "," + (Static133.aClass12_129 == null ? -1 : Static133.aClass12_129.method235()) + " - " + Static282.anInt4732 + "," + (Static190.anInt3507 + Static255.aClass47_Sub1_Sub5_Sub2_2.anIntArray407[0]) + "," + (Static255.aClass47_Sub1_Sub5_Sub2_2.anIntArray408[0] + Static331.anInt6034) + " - ";
			for (@Pc(79) int local79 = 0; local79 < Static282.anInt4732 && local79 < 50; local79++) {
				local77 = local77 + Static116.aClass1_Sub14_Sub2_1.aByteArray65[local79] + ",";
			}
			Static101.method1630(local77, local19);
			Static261.method3691();
			return true;
		}
	}
}
