import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "[I")
	public static final int[] anIntArray359 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "Lclient!sm;")
	public static final Class210 aClass210_23 = new Class210();

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZ)V")
	public static void method2928(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub1_Sub2 local12 = Static323.method4982(arg0, 9);
		local12.method412();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2930(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(22) String local22 = Static236.method3861(arg0);
		if (local22 == null) {
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < Static244.anInt1014; local27++) {
			@Pc(33) String local33 = Static340.aStringArray38[local27];
			if (local33.startsWith("*")) {
				local33 = local33.substring(1);
			}
			local33 = Static236.method3861(local33);
			if (local33 != null && local33.equals(local22)) {
				Static244.anInt1014--;
				for (@Pc(59) int local59 = local27; local59 < Static244.anInt1014; local59++) {
					Static340.aStringArray38[local59] = Static340.aStringArray38[local59 + 1];
					Static278.aStringArray8[local59] = Static278.aStringArray8[local59 + 1];
					Static249.anIntArray557[local59] = Static249.anIntArray557[local59 + 1];
					Static337.aStringArray36[local59] = Static337.aStringArray36[local59 + 1];
					Static147.anIntArray307[local59] = Static147.anIntArray307[local59 + 1];
					Static295.aBooleanArray119[local59] = Static295.aBooleanArray119[local59 + 1];
				}
				Static357.anInt882 = Static180.anInt3216;
				Static19.method552(Static193.aClass41_205);
				Static39.aClass2_Sub13_Sub2_4.method4207(Static346.method5273(arg0));
				Static39.aClass2_Sub13_Sub2_4.method4230(arg0);
				break;
			}
		}
	}
}
