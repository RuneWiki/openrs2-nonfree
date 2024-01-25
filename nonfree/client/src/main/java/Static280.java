import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!jv", name = "o", descriptor = "[Lclient!re;")
	public static Class291[] aClass291Array1;

	@OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
	public static int anInt5017 = 0;

	@OriginalMember(owner = "client!jv", name = "k", descriptor = "[I")
	public static final int[] anIntArray272 = new int[13];

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(BZI)I")
	public static int method4531(@OriginalArg(2) int arg0) {
		@Pc(14) Class3_Sub32 local14 = Static210.method3568(false, arg0);
		if (local14 == null) {
			return Static465.aClass125_1.method3116(arg0).anInt7662;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(31) int local31 = 0; local31 < local14.anIntArray268.length; local31++) {
			if (local14.anIntArray268[local31] == -1) {
				local24++;
			}
		}
		return local24 + Static465.aClass125_1.method3116(arg0).anInt7662 - local14.anIntArray268.length;
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(II)Z")
	public static boolean method4532(@OriginalArg(1) int arg0) {
		return arg0 == 45 || arg0 == 25 || arg0 == 1002 || arg0 == 16 || arg0 == 4;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!aj;B)V")
	public static void method4535(@OriginalArg(0) Class3_Sub4_Sub1 arg0) {
		arg0.method8732();
		@Pc(10) boolean local10 = false;
		for (@Pc(15) Class3_Sub4_Sub1 local15 = (Class3_Sub4_Sub1) Static226.aClass15_3.method897(); local15 != null; local15 = (Class3_Sub4_Sub1) Static226.aClass15_3.method898()) {
			if (Static181.method3130(arg0.method892(), local15.method892())) {
				local10 = true;
				Static257.method4282(local15, arg0);
				break;
			}
		}
		if (!local10) {
			Static226.aClass15_3.method901(arg0);
		}
	}
}
