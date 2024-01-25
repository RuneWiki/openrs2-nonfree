import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_64 = new Class119(88, 10);

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V")
	public static void method2410() {
		if (Static440.aBoolean641) {
			return;
		}
		if (Static374.aClass20_Sub1_1.aBoolean186) {
			Static180.aFloat27 = (int) Static180.aFloat27 + 47 & 0xFFFFFFF0;
		} else {
			Static300.aFloat57 += (12.0F - Static300.aFloat57) / 2.0F;
		}
		Static224.aBoolean359 = true;
		Static440.aBoolean641 = true;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method2412(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(18) String local18 = Static40.method777(arg0);
		if (local18 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < Static415.anInt6805; local23++) {
			@Pc(28) String local28 = Static82.aStringArray32[local23];
			if (local28.startsWith("*")) {
				local28 = local28.substring(1);
			}
			local28 = Static40.method777(local28);
			if (local28 != null && local28.equals(local18)) {
				Static415.anInt6805--;
				for (@Pc(52) int local52 = local23; local52 < Static415.anInt6805; local52++) {
					Static82.aStringArray32[local52] = Static82.aStringArray32[local52 + 1];
					Static67.aStringArray10[local52] = Static67.aStringArray10[local52 + 1];
					Static135.aStringArray29[local52] = Static135.aStringArray29[local52 + 1];
					Static44.aStringArray51[local52] = Static44.aStringArray51[local52 + 1];
					Static217.aBooleanArray18[local52] = Static217.aBooleanArray18[local52 + 1];
				}
				Static161.anInt3318 = Static301.anInt2459;
				Static30.method641(Static10.aClass217_2);
				Static302.aClass3_Sub7_Sub1_2.method2628(Static24.method582(arg0));
				Static302.aClass3_Sub7_Sub1_2.method2608(arg0);
				break;
			}
		}
	}
}
