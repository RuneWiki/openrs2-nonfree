import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
	public static int anInt6500;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_101 = new Class32("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray59 = new int[128][128];

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
	public static int anInt6498 = 0;

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
	public static int anInt6501 = 0;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V")
	public static void method5580(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub10_Sub2 local8 = Static217.method3611(arg0, 8);
		local8.method859();
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
	public static void method5581() {
		@Pc(7) int local7 = Static335.anInt5738;
		@Pc(9) int[] local9 = Static242.anIntArray933;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(24) Class1_Sub5_Sub1_Sub1 local24 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local9[local11]];
			if (local24 != null && local24.anInt6449 > 0) {
				local24.anInt6449--;
				if (local24.anInt6449 == 0) {
					local24.aString66 = null;
				}
			}
		}
		for (@Pc(47) int local47 = 0; local47 < Static171.anInt3311; local47++) {
			@Pc(53) int local53 = Static143.anIntArray583[local47];
			@Pc(57) Class1_Sub5_Sub1_Sub2 local57 = Static299.aClass1_Sub5_Sub1_Sub2Array1[local53];
			if (local57 != null && local57.anInt6449 > 0) {
				local57.anInt6449--;
				if (local57.anInt6449 == 0) {
					local57.aString66 = null;
				}
			}
		}
	}
}
