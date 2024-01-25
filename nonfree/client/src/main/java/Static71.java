import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "Lclient!l;")
	public static Interface8 anInterface8_138;

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "Lclient!um;")
	public static Class243 aClass243_255;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "Lclient!sc;")
	public static final Class220 aClass220_157 = new Class220(2, 4, 4, 0);

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
	public static void method6001() {
		Static136.aClass237_27 = new Class237(8);
		Static241.anInt3926 = 0;
		for (@Pc(17) Class88_Sub6 local17 = (Class88_Sub6) Static348.aClass107_11.method2326(); local17 != null; local17 = (Class88_Sub6) Static348.aClass107_11.method2327()) {
			local17.method5049();
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)V")
	public static void method6004(@OriginalArg(1) int arg0) {
		Static337.method4359();
		@Pc(16) int local16 = Static309.aClass46_1.method1077(arg0).anInt3858;
		if (local16 == 0) {
			return;
		}
		@Pc(27) int local27 = Static408.aClass39_1.anIntArray48[arg0];
		if (local16 == 6) {
			Static58.anInt1099 = local27;
		}
		if (local16 == 5) {
			Static456.anInt7452 = local27;
		}
	}
}
