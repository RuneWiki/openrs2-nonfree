import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
	public static int anInt1796 = -1;

	@OriginalMember(owner = "client!ga", name = "S", descriptor = "Lclient!dd;")
	public static Class13 aClass13_606 = Static161.method2971("<)4col>");

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
	public static void method1340() {
		Static153.aClass82_15 = new Class82();
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(Z)V")
	public static void method1341() {
		aClass13_606 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZII)I")
	public static int method1342(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) Class1_Sub24 local6 = (Class1_Sub24) Static30.aClass45_6.method1988((long) arg1);
		if (local6 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local6.anIntArray453.length) {
			return local6.anIntArray453[arg0];
		} else {
			return -1;
		}
	}
}
