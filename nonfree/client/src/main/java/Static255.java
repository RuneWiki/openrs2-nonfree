import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
	public static int anInt5144;

	@OriginalMember(owner = "client!qb", name = "W", descriptor = "Lclient!ng;")
	public static Class160 aClass160_1;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 137)
	public static int method4723(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = Static217.method4100(arg0.charAt(local12)) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V", line = 157)
	public static void method4724(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub2_Sub7 local12 = Static293.method5414(6, arg0);
		local12.method2314();
	}
}
