import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
	public static int anInt5723;

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "Lclient!ug;")
	public static Class51 aClass51_7;

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
	public static int anInt5726 = 0;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IB)I")
	public static int method4921(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIII)V")
	public static void method4922(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local35);
		Static28.method5507(local35, true);
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)V")
	public static void method4924() {
		Static2.aClass43_1.method1282();
		Static301.aClass180_8.method4841();
		Static347.aClass180_10.method4841();
	}
}
