import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "[I")
	public static int[] anIntArray177;

	@OriginalMember(owner = "client!ih", name = "x", descriptor = "Lclient!wa;")
	public static Class23 aClass23_33;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_665 = Static161.method2452(")3runescape)3com");

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
	public static int anInt1813 = -1;

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
	public static volatile int anInt1814 = 0;

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "I")
	public static int anInt1815 = 0;

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "Lclient!gg;")
	public static Class37 aClass37_1 = new Class37();

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_666 = Static161.method2452("Checking for updates )2 ");

	@OriginalMember(owner = "client!ih", name = "u", descriptor = "Lclient!dc;")
	public static Class20 aClass20_667 = aClass20_666;

	@OriginalMember(owner = "client!ih", name = "w", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_668 = Static161.method2452("");

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIILclient!ia;JLclient!ia;Lclient!ia;)V")
	public static void method1414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class1 arg6, @OriginalArg(7) Class1 arg7) {
		@Pc(3) Class50 local3 = new Class50();
		local3.aClass1_6 = arg4;
		local3.anInt1961 = arg1 * 128 + 64;
		local3.anInt1962 = arg2 * 128 + 64;
		local3.anInt1960 = arg3;
		local3.aLong112 = arg5;
		local3.aClass1_5 = arg6;
		local3.aClass1_7 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class5_Sub3 local42 = Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt333; local46++) {
				@Pc(52) Class43 local52 = local42.aClass43Array1[local46];
				if ((local52.aLong102 & 0x400000L) == 4194304L) {
					@Pc(63) int local63 = local52.aClass1_4.method2449();
					if (local63 != -32768 && local63 < local34) {
						local34 = local63;
					}
				}
			}
		}
		local3.anInt1964 = -local34;
		if (Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2] = new Class5_Sub3(arg0, arg1, arg2);
		}
		Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2].aClass50_1 = local3;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)V")
	public static void method1415(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub17 local10 = (Class5_Sub17) Static38.aClass75_5.method2072((long) arg0);
		if (local10 != null) {
			local10.method3207();
		}
	}
}
