import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
	public static int anInt8650;

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "Lclient!hq;")
	public static final Class145 aClass145_8 = new Class145("WTRC", 1);

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZI)V")
	public static void method7051(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static332.anInt6370 != -1) {
				Static520.method7609(Static332.anInt6370);
			}
			for (@Pc(14) Class4_Sub37 local14 = (Class4_Sub37) Static189.aClass350_14.method8198(); local14 != null; local14 = (Class4_Sub37) Static189.aClass350_14.method8205()) {
				if (!local14.method8381()) {
					local14 = (Class4_Sub37) Static189.aClass350_14.method8198();
					if (local14 == null) {
						break;
					}
				}
				Static161.method525(false, true, local14);
			}
			Static332.anInt6370 = -1;
			Static189.aClass350_14 = new Class350(8);
			Static277.method4812();
			Static332.anInt6370 = Static469.anInt8688;
			Static487.method7235(false);
			Static523.method7617();
			Static388.method6115(Static332.anInt6370);
		}
		Static89.aBoolean155 = true;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method7052(@OriginalArg(2) String arg0) {
		Static574.method8209("", arg0, "", "", 4, 0);
	}
}
