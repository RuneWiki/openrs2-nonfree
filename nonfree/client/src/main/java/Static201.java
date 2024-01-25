import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "I")
	public static int anInt3945;

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!raa;I)Lclient!raa;")
	public static Class295 method3543(@OriginalArg(0) Class295 arg0) {
		if (arg0.anInt7944 != -1) {
			return Static107.method9049(arg0.anInt7944);
		}
		@Pc(21) int local21 = arg0.anInt8022 >>> 16;
		@Pc(26) Class83 local26 = new Class83(Static269.aClass273_11);
		for (@Pc(31) Class5_Sub27 local31 = (Class5_Sub27) local26.method1694(); local31 != null; local31 = (Class5_Sub27) local26.method1693()) {
			if (local31.anInt4270 == local21) {
				return Static107.method9049((int) local31.aLong278);
			}
		}
		return null;
	}
}
