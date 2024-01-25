import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "[I")
	public static final int[] anIntArray299 = new int[6];

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public static void method2714() {
		Static29.method451(Static124.aClass102_38);
		Static456.aClass2_Sub13_Sub2_2.method3602(0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(CBLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method2715(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = Static137.method5151(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10; local26++) {
			@Pc(30) int local30;
			for (local30 = local24; arg0 != arg1.charAt(local30); local30++) {
			}
			local15[local17++] = arg1.substring(local24, local30);
			local24 = local30 + 1;
		}
		local15[local10] = arg1.substring(local24);
		return local15;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public static void method2716() {
		if (Static38.aBoolean63) {
			return;
		}
		Static357.method4499(Static192.aClass270ArrayArrayArray2);
		if (Static65.aClass270ArrayArrayArray1 != null) {
			Static357.method4499(Static65.aClass270ArrayArrayArray1);
		}
		Static38.aBoolean63 = true;
	}
}
