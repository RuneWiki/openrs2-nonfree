import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "[Lclient!fa;")
	public static Class1_Sub1_Sub8_Sub1[] aClass1_Sub1_Sub8_Sub1Array2;

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "Lclient!ea;")
	private static Class18 aClass18_387 = Static8.method128("white:");

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "Lclient!ea;")
	public static Class18 aClass18_388 = aClass18_387;

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
	public static int anInt1585 = 0;

	@OriginalMember(owner = "client!fh", name = "t", descriptor = "Lclient!ea;")
	private static Class18 aClass18_390 = Static8.method128("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "Lclient!ea;")
	public static Class18 aClass18_389 = aClass18_390;

	@OriginalMember(owner = "client!fh", name = "w", descriptor = "Lclient!ea;")
	public static Class18 aClass18_391 = Static8.method128("<col=ff0000>");

	@OriginalMember(owner = "client!fh", name = "C", descriptor = "Lclient!ea;")
	public static Class18 aClass18_392 = aClass18_387;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)I")
	public static int method1042() {
		return Static91.anInt2766++;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!ef;IB)Lclient!ea;")
	public static Class18 method1043(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		if (!Static80.method1789(arg1, Static36.method758(arg0)) && arg0.anObjectArray14 == null) {
			return null;
		} else if (arg0.aClass18Array8 == null || arg0.aClass18Array8.length <= arg1 || arg0.aClass18Array8[arg1] == null || arg0.aClass18Array8[arg1].method726().method747() == 0) {
			return Static33.aBoolean37 ? Static144.method2735(new Class18[] { Static143.aClass18_1006, Static132.method2564(arg1) }) : null;
		} else {
			return arg0.aClass18Array8[arg1];
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjava/util/Random;B)I")
	public static int method1046(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static4.method85(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(43) int local43 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(46) int local46;
			do {
				local46 = arg1.nextInt();
			} while (local43 <= local46);
			return Static100.method2073(local46, arg0);
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
	public static void method1050() {
		aClass18_391 = null;
		aClass18_392 = null;
		aClass18_387 = null;
		aClass1_Sub1_Sub8_Sub1Array2 = null;
		aClass18_388 = null;
		aClass18_389 = null;
		aClass18_390 = null;
	}
}
