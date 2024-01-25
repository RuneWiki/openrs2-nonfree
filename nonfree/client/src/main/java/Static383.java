import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "Lclient!iv;")
	public static Class4_Sub12 aClass4_Sub12_7 = new Class4_Sub12(1);

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "[I")
	public static final int[] anIntArray496 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5070(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(24) String local24 = Static123.method4868(arg0);
		if (local24 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static49.anInt2346; local29++) {
			@Pc(35) String local35 = Static194.aStringArray14[local29];
			if (local35.startsWith("*")) {
				local35 = local35.substring(1);
			}
			local35 = Static123.method4868(local35);
			if (local35 != null && local35.equals(local24)) {
				Static49.anInt2346--;
				for (@Pc(59) int local59 = local29; local59 < Static49.anInt2346; local59++) {
					Static194.aStringArray14[local59] = Static194.aStringArray14[local59 + 1];
					Static57.aStringArray6[local59] = Static57.aStringArray6[local59 + 1];
					Static71.anIntArray536[local59] = Static71.anIntArray536[local59 + 1];
					Static433.aStringArray38[local59] = Static433.aStringArray38[local59 + 1];
					Static280.anIntArray339[local59] = Static280.anIntArray339[local59 + 1];
					Static424.aBooleanArray23[local59] = Static424.aBooleanArray23[local59 + 1];
				}
				Static244.anInt3027 = Static325.anInt5640;
				Static429.method5476(Static132.aClass215_36);
				Static3.aClass4_Sub12_Sub1_5.method2551(Static269.method3856(arg0));
				Static3.aClass4_Sub12_Sub1_5.method2518(arg0);
				return;
			}
		}
	}
}
