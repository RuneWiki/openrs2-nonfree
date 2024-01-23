import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!q", name = "s", descriptor = "Lclient!vh;")
	public static Class187 aClass187_114 = new Class187(100);

	@OriginalMember(owner = "client!q", name = "y", descriptor = "I")
	public static int anInt4161 = 1;

	@OriginalMember(owner = "client!q", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString234 = "yellow:";

	@OriginalMember(owner = "client!q", name = "C", descriptor = "I")
	public static int anInt4164 = 0;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(IB)V")
	public static void method3510(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub11 local8 = Static5.method35(arg0, 9);
		local8.method2873();
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V")
	public static void method3511() {
		@Pc(12) Class1_Sub8 local12;
		for (local12 = (Class1_Sub8) Static75.aClass59_18.method1704(); local12 != null; local12 = (Class1_Sub8) Static75.aClass59_18.method1701()) {
			if (local12.aBoolean20) {
				local12.method471();
			}
		}
		for (local12 = (Class1_Sub8) Static93.aClass59_20.method1704(); local12 != null; local12 = (Class1_Sub8) Static93.aClass59_20.method1701()) {
			if (local12.aBoolean20) {
				local12.method471();
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIII)I")
	public static int method3512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg1 <= arg0 ? (arg2 >= arg0 ? arg0 : arg2) : arg1;
	}
}
