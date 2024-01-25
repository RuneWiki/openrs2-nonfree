import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_96 = new Class12(75, 2);

	@OriginalMember(owner = "client!ja", name = "E", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_93 = new Class119("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!ja", name = "F", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_97 = new Class12(50, -1);

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILjava/lang/String;ILclient!ta;Lclient!jk;BLclient!gf;IILclient!la;II)V")
	public static void method2665(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class104 arg3, @OriginalArg(4) Class124 arg4, @OriginalArg(6) Class89 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class76 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		if (Static333.anInt5693 == 4) {
			local11 = (int) Static98.aFloat20 & 0x3FFF;
		} else {
			local11 = (int) Static98.aFloat20 + Static378.anInt2798 & 0x3FFF;
		}
		@Pc(33) int local33 = Math.max(arg4.anInt3376 / 2, arg4.anInt3356 / 2) + 10;
		@Pc(41) int local41 = arg0 * arg0 + arg10 * arg10;
		if (local33 * local33 < local41) {
			return;
		}
		@Pc(55) int local55 = Class1_Sub4_Sub8_Sub1.anIntArray50[local11];
		@Pc(59) int local59 = Class1_Sub4_Sub8_Sub1.anIntArray49[local11];
		if (Static333.anInt5693 != 4) {
			local59 = local59 * 256 / (Static435.anInt7311 + 256);
			local55 = local55 * 256 / (Static435.anInt7311 + 256);
		}
		@Pc(90) int local90 = arg0 * local55 + arg10 * local59 >> 15;
		@Pc(101) int local101 = arg0 * local59 - arg10 * local55 >> 15;
		@Pc(108) int local108 = arg5.method1997(arg1, 100, null);
		@Pc(116) int local116 = arg5.method1988(arg1, null);
		@Pc(122) int local122 = local90 - local108 / 2;
		if (local122 >= -arg4.anInt3376 && local122 <= arg4.anInt3376 && local101 >= -arg4.anInt3356 && local101 <= arg4.anInt3356) {
			arg8.method4585(50, local122 + arg2 + arg4.anInt3376 / 2, null, null, arg2, arg3, 0, local108, 0, arg9, arg1, arg9 + arg4.anInt3356 / 2 - local116 - arg7 - local101, arg6);
		}
	}
}
