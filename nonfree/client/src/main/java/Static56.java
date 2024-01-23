import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!di", name = "b", descriptor = "I")
	public static int anInt1176;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "I")
	public static int anInt1177;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "I")
	public static int anInt1175 = 1;

	@OriginalMember(owner = "client!di", name = "f", descriptor = "I")
	public static int anInt1180 = 0;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
	public static void method932(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static224.anIntArray535[arg0] = arg1;
		@Pc(14) Class1_Sub9 local14 = (Class1_Sub9) Static278.aClass22_21.method633((long) arg0);
		if (local14 == null) {
			local14 = new Class1_Sub9(Static252.method3964() + 500L);
			Static278.aClass22_21.method643((long) arg0, local14);
		} else {
			local14.aLong51 = Static252.method3964() + 500L;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)I")
	public static int method933(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
