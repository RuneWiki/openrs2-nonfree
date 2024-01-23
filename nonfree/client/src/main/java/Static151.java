import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "[I")
	public static int[] anIntArray555;

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
	public static int anInt5601 = -1;

	@OriginalMember(owner = "client!lf", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString334 = "Created gameworld";

	@OriginalMember(owner = "client!lf", name = "H", descriptor = "[I")
	public static int[] anIntArray556 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	public static void method4443() {
		if (Static239.aBoolean362) {
			Static59.aClass1_Sub2_Sub11_16 = null;
			Static101.aClass12_1 = null;
			Static239.aBoolean362 = false;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)J")
	public static long method4444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub26 local7 = Static74.aClass1_Sub26ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass44_1 == null ? 0L : local7.aClass44_1.aLong55;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4451(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static101.method1899(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)Lclient!th;")
	public static Class1_Sub2_Sub18 method4457() {
		@Pc(14) Class1_Sub2_Sub18 local14 = (Class1_Sub2_Sub18) Static109.aClass140_3.method3413();
		if (local14 != null) {
			local14.method4441();
			local14.method4347();
			return local14;
		}
		do {
			local14 = (Class1_Sub2_Sub18) Static3.aClass140_1.method3413();
			if (local14 == null) {
				return null;
			}
			if (local14.method3912() > Static294.method4413()) {
				return null;
			}
			local14.method4441();
			local14.method4347();
		} while ((local14.aLong201 & Long.MIN_VALUE) == 0L);
		return local14;
	}
}
