import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!db", name = "t", descriptor = "[I")
	public static final int[] anIntArray120 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
	public static void method1311() {
		Static271.anIntArray461 = Static260.method4791(0.4F);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)I")
	public static int method1312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg0 & arg1 - 1;
		@Pc(17) int local17 = arg2 / arg1;
		@Pc(23) int local23 = arg1 - 1 & arg2;
		@Pc(28) int local28 = Static49.method1300(local7, local17);
		@Pc(37) int local37 = Static49.method1300(local7 + 1, local17);
		@Pc(44) int local44 = Static49.method1300(local7, local17 + 1);
		@Pc(53) int local53 = Static49.method1300(local7 + 1, local17 + 1);
		@Pc(67) int local67 = Static59.method1513(local28, local37, arg1, local13);
		@Pc(76) int local76 = Static59.method1513(local44, local53, arg1, local13);
		return Static59.method1513(local67, local76, arg1, local23);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
	public static void method1313(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub4_Sub9 local8 = Static139.method4227(arg0, 1);
		local8.method1868();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lclient!hh;")
	public static Class84 method1315(@OriginalArg(0) Component arg0) {
		return new Class84_Sub1(arg0, true);
	}
}
