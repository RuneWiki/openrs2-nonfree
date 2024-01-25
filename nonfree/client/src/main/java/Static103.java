import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
	public static int anInt1865;

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "Lclient!aa;")
	public static Class2 aClass2_4;

	@OriginalMember(owner = "client!gh", name = "s", descriptor = "Z")
	public static boolean aBoolean113 = false;

	@OriginalMember(owner = "client!gh", name = "V", descriptor = "I")
	public static int anInt1883 = 2;

	@OriginalMember(owner = "client!gh", name = "Y", descriptor = "Z")
	public static boolean aBoolean118 = false;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ae;")
	public static RuntimeException_Sub1 method1566(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString1 = local12.aString1 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BII)V")
	public static void method1568(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class208 local12 = Static66.method1708(arg0);
		@Pc(15) int local15 = local12.anInt6542;
		@Pc(18) int local18 = local12.anInt6544;
		@Pc(21) int local21 = local12.anInt6548;
		@Pc(28) int local28 = Class174.anIntArray413[local21 - local18];
		if (arg1 < 0 || arg1 > local28) {
			arg1 = 0;
		}
		local28 <<= local18;
		Static297.method4917(Static198.anIntArray311[local15] & ~local28 | local28 & arg1 << local18, local15);
	}
}
