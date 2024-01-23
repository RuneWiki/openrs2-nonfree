import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!nf", name = "gb", descriptor = "[I")
	public static int[] anIntArray276;

	@OriginalMember(owner = "client!nf", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString240 = " is already on your friend list.";

	@OriginalMember(owner = "client!nf", name = "S", descriptor = "J")
	public static long aLong118 = 0L;

	@OriginalMember(owner = "client!nf", name = "Z", descriptor = "Lclient!t;")
	public static Class1_Sub27 aClass1_Sub27_1 = new Class1_Sub27(0, -1);

	@OriginalMember(owner = "client!nf", name = "fb", descriptor = "Lclient!lc;")
	public static Class79 aClass79_20 = new Class79(260);

	@OriginalMember(owner = "client!nf", name = "hb", descriptor = "[Lclient!j;")
	public static Class17_Sub1[] aClass17_Sub1Array1 = new Class17_Sub1[29];

	@OriginalMember(owner = "client!nf", name = "ib", descriptor = "I")
	public static int anInt3784 = 0;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)Z")
	public static boolean method2799(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && Static167.aBooleanArray14.length > arg0 ? Static167.aBooleanArray14[arg0] : false;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I[Lclient!se;I)V")
	public static void method2801(@OriginalArg(1) Class122[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class122 local9 = arg0[local3];
			if (local9 != null) {
				if (local9.anInt4656 == 0) {
					if (local9.aClass122Array2 != null) {
						method2801(local9.aClass122Array2, arg1);
					}
					@Pc(33) Class1_Sub5 local33 = (Class1_Sub5) Static204.aClass140_13.method4014((long) local9.anInt4686);
					if (local33 != null) {
						Static146.method2662(arg1, local33.anInt1358);
					}
				}
				@Pc(49) Class1_Sub30 local49;
				if (arg1 == 0 && local9.anObjectArray20 != null) {
					local49 = new Class1_Sub30();
					local49.anObjectArray32 = local9.anObjectArray20;
					local49.aClass122_18 = local9;
					Static153.method2746(local49);
				}
				if (arg1 == 1 && local9.anObjectArray22 != null) {
					if (local9.anInt4662 >= 0) {
						@Pc(76) Class122 local76 = Static206.method3444(local9.anInt4686);
						if (local76 == null || local76.aClass122Array2 == null || local9.anInt4662 >= local76.aClass122Array2.length || local76.aClass122Array2[local9.anInt4662] != local9) {
							continue;
						}
					}
					local49 = new Class1_Sub30();
					local49.anObjectArray32 = local9.anObjectArray22;
					local49.aClass122_18 = local9;
					Static153.method2746(local49);
				}
			}
		}
	}
}
