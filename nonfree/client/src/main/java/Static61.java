import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "[Lclient!mf;")
	public static Class69[] aClass69Array1;

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
	public static int anInt1351;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_461 = Static161.method2452("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_462 = Static161.method2452("Attack");

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "[Lclient!g;")
	public static final Class1_Sub2_Sub1[] aClass1_Sub2_Sub1Array1 = new Class1_Sub2_Sub1[32768];

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_463 = Static161.method2452("");

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "Lclient!dc;")
	public static Class20 aClass20_464 = aClass20_462;

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "[S")
	public static final short[] aShortArray20 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_465 = Static161.method2452("red:");

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_466 = aClass20_465;

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "Lclient!dc;")
	public static Class20 aClass20_467 = aClass20_465;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIILclient!ia;Lclient!ia;IIJ)V")
	public static void method1022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(5) Class1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class86 local8 = new Class86();
		local8.aLong190 = arg8;
		local8.anInt3232 = arg1 * 128 + 64;
		local8.anInt3235 = arg2 * 128 + 64;
		local8.anInt3238 = arg3;
		local8.aClass1_9 = arg4;
		local8.aClass1_10 = arg5;
		local8.anInt3234 = arg6;
		local8.anInt3240 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static157.aClass5_Sub3ArrayArrayArray2[local42][arg1][arg2] == null) {
				Static157.aClass5_Sub3ArrayArrayArray2[local42][arg1][arg2] = new Class5_Sub3(local42, arg1, arg2);
			}
		}
		Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2].aClass86_1 = local8;
	}
}
