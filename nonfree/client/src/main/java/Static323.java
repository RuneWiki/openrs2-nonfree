import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!st", name = "D", descriptor = "[Lclient!tr;")
	public static Class110[] aClass110Array12;

	@OriginalMember(owner = "client!st", name = "A", descriptor = "[Lclient!ue;")
	public static final Class229[] aClass229Array1 = new Class229[8];

	@OriginalMember(owner = "client!st", name = "E", descriptor = "[I")
	public static final int[] anIntArray602 = new int[1000];

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!b;IIZI)V")
	public static void method4975(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(3) int arg2) {
		Static48.aClass20_16 = arg1;
		Static249.aBoolean503 = false;
		Static83.anInt1721 = arg0;
		Static317.anInt4554 = 0;
		Static113.anInt2187 = arg2;
		Static175.anInt3065 = 1;
		Static120.anInt2268 = 10000;
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(Z)V")
	public static void method4976() {
		Static45.anInt803 = Static366.aClass190_7.anInt4829 + Static366.aClass190_7.anInt4834 + 2;
		Static361.aStringArray42 = new String[500];
		Static272.anInt4752 = Static61.aClass190_1.anInt4834 + Static61.aClass190_1.anInt4829 + 2;
		for (@Pc(30) int local30 = 0; local30 < Static361.aStringArray42.length; local30++) {
			Static361.aStringArray42[local30] = "";
		}
	}
}
