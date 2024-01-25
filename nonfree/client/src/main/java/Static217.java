import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!l", name = "E", descriptor = "I")
	public static int anInt3768;

	@OriginalMember(owner = "client!l", name = "H", descriptor = "Ljava/lang/Object;")
	public static Object anObject5;

	@OriginalMember(owner = "client!l", name = "C", descriptor = "Lclient!po;")
	public static final Class202 aClass202_2 = new Class202();

	@OriginalMember(owner = "client!l", name = "D", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_59 = new Class186(67, 12);

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(Ljava/lang/String;I)V")
	public static void method3361(@OriginalArg(0) String arg0) {
		if (Static41.aClass85Array1 != null) {
			Static298.method4373(Static77.aClass25_20);
			Static449.aClass6_Sub15_Sub1_2.method3075(Static384.method5308(arg0));
			Static449.aClass6_Sub15_Sub1_2.method3094(arg0);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!lt;Lclient!lt;)I")
	public static int method3362(@OriginalArg(1) Class158 arg0, @OriginalArg(2) Class158 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method3686(Static77.anInt1540)) {
			local5++;
		}
		if (arg1.method3686(Static429.anInt7139)) {
			local5++;
		}
		if (arg1.method3686(Static137.anInt2448)) {
			local5++;
		}
		if (arg0.method3686(Static77.anInt1540)) {
			local5++;
		}
		if (arg0.method3686(Static429.anInt7139)) {
			local5++;
		}
		if (arg0.method3686(Static137.anInt2448)) {
			local5++;
		}
		return local5;
	}
}
