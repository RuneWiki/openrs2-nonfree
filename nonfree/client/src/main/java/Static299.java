import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "J")
	public static long aLong233;

	@OriginalMember(owner = "client!vl", name = "h", descriptor = "[I")
	public static int[] anIntArray611;

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray40 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II[Lclient!rg;)V")
	public static void method4831(@OriginalArg(0) int arg0, @OriginalArg(2) Class151[] arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg1.length; local13++) {
			@Pc(21) Class151 local21 = arg1[local13];
			if (local21 != null) {
				if (local21.anInt4721 == 0) {
					if (local21.aClass151Array2 != null) {
						method4831(arg0, local21.aClass151Array2);
					}
					@Pc(50) Class3_Sub3 local50 = (Class3_Sub3) Static205.aClass30_23.method663((long) local21.anInt4800);
					if (local50 != null) {
						Static88.method1354(arg0, local50.anInt183);
					}
				}
				@Pc(66) Class3_Sub24 local66;
				if (arg0 == 0 && local21.anObjectArray9 != null) {
					local66 = new Class3_Sub24();
					local66.anObjectArray1 = local21.anObjectArray9;
					local66.aClass151_13 = local21;
					Static161.method2653(local66);
				}
				if (arg0 == 1 && local21.anObjectArray11 != null) {
					if (local21.anInt4776 >= 0) {
						@Pc(99) Class151 local99 = Static243.method4115(local21.anInt4800);
						if (local99 == null || local99.aClass151Array2 == null || local21.anInt4776 >= local99.aClass151Array2.length || local99.aClass151Array2[local21.anInt4776] != local21) {
							continue;
						}
					}
					local66 = new Class3_Sub24();
					local66.aClass151_13 = local21;
					local66.anObjectArray1 = local21.anObjectArray11;
					Static161.method2653(local66);
				}
			}
		}
	}
}
