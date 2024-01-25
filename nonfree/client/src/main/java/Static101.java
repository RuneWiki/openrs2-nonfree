import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dja", name = "c", descriptor = "Lclient!aea;")
	public static final Class10 aClass10_2 = new Class10();

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "([IILclient!rv;I[II)Lclient!ifa;")
	public static Class1_Sub3 method1474(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class126_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		@Pc(24) int local24;
		@Pc(35) int local35;
		@Pc(37) int local37;
		if (!arg1.method5453(Static385.aClass247_14, Static225.aClass281_13)) {
			@Pc(71) int[] local71 = new int[arg4 * arg2];
			for (local24 = 0; local24 < arg4; local24++) {
				local35 = arg0[local24] + local24 * arg2;
				for (local37 = 0; local37 < arg3[local24]; local37++) {
					local71[local35++] = -16777216;
				}
			}
			return new Class1_Sub3(arg1, arg2, arg4, local71);
		}
		@Pc(22) byte[] local22 = new byte[arg4 * arg2];
		for (local24 = 0; local24 < arg4; local24++) {
			local35 = arg2 * local24 + arg0[local24];
			for (local37 = 0; local37 < arg3[local24]; local37++) {
				local22[local35++] = -1;
			}
		}
		return new Class1_Sub3(arg1, arg2, arg4, local22);
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(ZBLclient!vfa;)V")
	public static void method1475(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class357 arg1) {
		@Pc(15) int local15 = arg1.anInt9879 == 0 ? arg1.anInt9852 : arg1.anInt9879;
		@Pc(24) int local24 = arg1.anInt9861 == 0 ? arg1.anInt9797 : arg1.anInt9861;
		Static487.method7152(arg1.anInt9804, Static441.aClass357ArrayArray1[arg1.anInt9804 >> 16], arg0, local15, local24);
		if (arg1.aClass357Array2 != null) {
			Static487.method7152(arg1.anInt9804, arg1.aClass357Array2, arg0, local15, local24);
		}
		@Pc(62) Class5_Sub15 local62 = (Class5_Sub15) Static183.aClass81_27.method1599((long) arg1.anInt9804);
		if (local62 != null) {
			Static143.method4228(local62.anInt2409, local15, local24, arg0);
		}
	}

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "(I)V")
	public static void method1476() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static609.aBooleanArray58[local7] = true;
		}
	}
}
