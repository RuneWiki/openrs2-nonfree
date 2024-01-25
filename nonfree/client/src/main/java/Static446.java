import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "F")
	public static float aFloat212;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)Lclient!tg;")
	public static Class2_Sub13_Sub15 method6780() {
		@Pc(14) Class2_Sub13_Sub15 local14 = (Class2_Sub13_Sub15) Static178.aClass185_9.method4623();
		if (local14 != null) {
			local14.method7802();
			local14.method7527();
			return local14;
		}
		do {
			local14 = (Class2_Sub13_Sub15) Static163.aClass185_8.method4623();
			if (local14 == null) {
				return null;
			}
			if (local14.method6970() > Static143.method2502()) {
				return null;
			}
			local14.method7802();
			local14.method7527();
		} while ((Long.MIN_VALUE & local14.aLong230) == 0L);
		return local14;
	}
}
