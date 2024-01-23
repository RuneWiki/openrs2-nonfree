import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!d", name = "w", descriptor = "I")
	public static int anInt1933;

	@OriginalMember(owner = "client!d", name = "C", descriptor = "Lclient!lc;")
	public static Class90 aClass90_3;

	@OriginalMember(owner = "client!d", name = "J", descriptor = "[Lclient!ug;")
	public static Class1_Sub2_Sub14[] aClass1_Sub2_Sub14Array10;

	@OriginalMember(owner = "client!d", name = "A", descriptor = "[I")
	public static int[] anIntArray202 = new int[50];

	@OriginalMember(owner = "client!d", name = "B", descriptor = "Z")
	public static boolean aBoolean105 = false;

	@OriginalMember(owner = "client!d", name = "F", descriptor = "[I")
	public static int[] anIntArray203 = new int[1000];

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)I")
	public static int method1449(@OriginalArg(0) int arg0) {
		@Pc(9) Class88 local9 = Static249.method4265(arg0);
		@Pc(12) int local12 = local9.anInt3279;
		@Pc(15) int local15 = local9.anInt3277;
		@Pc(22) int local22 = local9.anInt3285;
		@Pc(28) int local28 = Class1_Sub1_Sub29.anIntArray464[local22 - local15];
		return local28 & Static170.anIntArray601[local12] >> local15;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(I)Z")
	public static boolean method1450() {
		return Static296.aBoolean335 ? true : Static138.aBoolean162;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method1451(@OriginalArg(0) String[] arg0) {
		@Pc(14) String[] local14 = new String[5];
		for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
			local14[local16] = local16 + ": ";
			if (arg0 != null && arg0[local16] != null) {
				local14[local16] = local14[local16] + arg0[local16];
			}
		}
		return local14;
	}
}
