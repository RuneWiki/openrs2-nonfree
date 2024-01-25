import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!jt", name = "i", descriptor = "I")
	public static int anInt7190;

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "Lclient!ni;")
	public static final Class178 aClass178_19 = new Class178("WTRC", 1);

	@OriginalMember(owner = "client!jt", name = "j", descriptor = "[I")
	public static final int[] anIntArray544 = new int[4096];

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IB)Lclient!ud;")
	public static Class245 method5770(@OriginalArg(0) int arg0) {
		@Pc(13) Class245[] local13 = Static439.method5854();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			if (local13[local15].anInt6544 == arg0) {
				return local13[local15];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)V")
	public static void method5772() {
		for (@Pc(1) int local1 = 0; local1 < 100; local1++) {
			Static72.aBooleanArray7[local1] = true;
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)V")
	public static void method5773() {
		@Pc(7) int local7 = Static438.anInt2796;
		@Pc(9) int[] local9 = Static78.anIntArray114;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class8_Sub3_Sub1_Sub1 local19 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local9[local11]];
			if (local19 != null && local19.anInt7424 > 0) {
				local19.anInt7424--;
				if (local19.anInt7424 == 0) {
					local19.aString74 = null;
				}
			}
		}
		for (@Pc(48) int local48 = 0; local48 < Static148.anInt2692; local48++) {
			@Pc(54) int local54 = Static106.anIntArray150[local48];
			@Pc(58) Class8_Sub3_Sub1_Sub2 local58 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local54];
			if (local58 != null && local58.anInt7424 > 0) {
				local58.anInt7424--;
				if (local58.anInt7424 == 0) {
					local58.aString74 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "(I)V")
	public static void method5775() {
		if (Static89.aBoolean120) {
			Static65.aClass95_9 = null;
			Static223.aClass95_10 = null;
			Static89.aBoolean120 = false;
		}
	}
}
