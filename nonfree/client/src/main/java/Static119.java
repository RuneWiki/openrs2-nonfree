import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
	public static int anInt2754;

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
	public static int anInt2755 = -1;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!eh;B)Lclient!qp;")
	public static Class4_Sub4 method2426(@OriginalArg(0) Class4_Sub9 arg0) {
		arg0.method6015();
		@Pc(13) int local13 = arg0.method6015();
		@Pc(17) Class4_Sub4 local17 = Static496.method7065(local13);
		local17.anInt9616 = arg0.method6015();
		@Pc(26) int local26 = arg0.method6015();
		for (@Pc(33) int local33 = 0; local33 < local26; local33++) {
			@Pc(39) int local39 = arg0.method6015();
			local17.method7886(local39, arg0);
		}
		local17.method7894();
		return local17;
	}
}
