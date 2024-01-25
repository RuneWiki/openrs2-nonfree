import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "Lclient!jca;")
	public static Class76 aClass76_6;

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "[I")
	public static int[] anIntArray183;

	@OriginalMember(owner = "client!hh", name = "r", descriptor = "Lclient!sea;")
	public static Class308 aClass308_80;

	@OriginalMember(owner = "client!hh", name = "o", descriptor = "Lclient!em;")
	public static final Class83 aClass83_80 = new Class83(84, -2);

	@OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
	public static int anInt3787 = 0;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method3073(@OriginalArg(2) String arg0) {
		Static308.method4624("", 0, 4, "", arg0, "");
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
	public static void method3074() {
		if (!Static563.aBoolean697) {
			return;
		}
		@Pc(11) Class160 local11 = Static420.method5959(Static594.anInt9808, Static299.anInt5617);
		if (local11 != null && local11.anObjectArray10 != null) {
			@Pc(20) Class1_Sub22 local20 = new Class1_Sub22();
			local20.aClass160_10 = local11;
			local20.anObjectArray1 = local11.anObjectArray10;
			Static451.method6311(local20);
		}
		Static563.aBoolean697 = false;
		Static422.anInt7430 = -1;
		Static253.anInt4623 = -1;
		if (local11 != null) {
			Static415.method5900(local11);
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
	public static void method3075() {
		@Pc(16) int local16 = (int) ((double) Static458.anInt9736 * 34.46D);
		local16 <<= 0x2;
		if (Static31.aClass78_18.method6831()) {
			local16 += 512;
		}
		Static31.aClass78_18.GA(200, local16);
	}
}
