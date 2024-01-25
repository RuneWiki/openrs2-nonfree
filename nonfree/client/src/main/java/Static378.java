import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!ni", name = "F", descriptor = "Z")
	public static boolean aBoolean511 = true;

	@OriginalMember(owner = "client!ni", name = "Q", descriptor = "[I")
	public static final int[] anIntArray421 = new int[1000];

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method6099(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static22.method978(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < Static68.anInt1696; local33++) {
			@Pc(39) String local39 = Static422.aStringArray29[local33];
			if (local39.startsWith("*")) {
				local39 = local39.substring(1);
			}
			local39 = Static22.method978(local39);
			if (local39 != null && local39.equals(local20)) {
				Static68.anInt1696--;
				for (@Pc(63) int local63 = local33; local63 < Static68.anInt1696; local63++) {
					Static422.aStringArray29[local63] = Static422.aStringArray29[local63 + 1];
					Static159.aStringArray13[local63] = Static159.aStringArray13[local63 + 1];
					Static117.anIntArray105[local63] = Static117.anIntArray105[local63 + 1];
					Static159.aStringArray14[local63] = Static159.aStringArray14[local63 + 1];
					Static153.anIntArray145[local63] = Static153.anIntArray145[local63 + 1];
					Static301.aBooleanArray15[local63] = Static301.aBooleanArray15[local63 + 1];
				}
				Static258.anInt4764 = Static371.anInt7006;
				@Pc(132) Class3_Sub14 local132 = Static139.method2308(Static216.aClass130_64, Static24.aClass233_1);
				local132.aClass3_Sub3_Sub2_2.method4220(Static161.method2888(arg0));
				local132.aClass3_Sub3_Sub2_2.method4241(arg0);
				Static562.method8096(local132);
				return;
			}
		}
	}
}
