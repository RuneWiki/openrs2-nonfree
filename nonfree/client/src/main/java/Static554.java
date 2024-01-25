import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "Lclient!oa;")
	public static Class90 aClass90_12;

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
	public static int anInt9644;

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
	public static int anInt9647;

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "[I")
	public static final int[] anIntArray702 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7713(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static83.method1161(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static569.anInt9840; local29++) {
			@Pc(35) String local35 = Static326.aStringArray26[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static83.method1161(local35);
			if (local35 != null && local35.equals(local20)) {
				Static569.anInt9840--;
				for (@Pc(59) int local59 = local29; local59 < Static569.anInt9840; local59++) {
					Static326.aStringArray26[local59] = Static326.aStringArray26[local59 + 1];
					Static114.aStringArray8[local59] = Static114.aStringArray8[local59 + 1];
					Static392.anIntArray501[local59] = Static392.anIntArray501[local59 + 1];
					Static125.aStringArray9[local59] = Static125.aStringArray9[local59 + 1];
					Static250.anIntArray378[local59] = Static250.anIntArray378[local59 + 1];
					Static173.aBooleanArray13[local59] = Static173.aBooleanArray13[local59 + 1];
				}
				Static83.anInt1400 = Static124.anInt2133;
				Static534.method7063(Static161.aClass316_37);
				Static340.aClass6_Sub12_Sub2_1.method6047(Static314.method4913(arg0));
				Static340.aClass6_Sub12_Sub2_1.method6009(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)V")
	public static void method7715(@OriginalArg(0) int arg0) {
		@Pc(10) Class6_Sub5_Sub8 local10 = Static49.method760(5, arg0);
		local10.method3257();
	}
}
