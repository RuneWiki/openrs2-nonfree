import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!ko", name = "u", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!ko", name = "q", descriptor = "[I")
	public static final int[] anIntArray315 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!ko", name = "T", descriptor = "I")
	public static int anInt5702 = -1;

	@OriginalMember(owner = "client!ko", name = "y", descriptor = "Lclient!vha;")
	public static final Class370 aClass370_10 = new Class370(5, 19);

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BI[Lclient!cn;)V")
	public static void method4857(@OriginalArg(1) int arg0, @OriginalArg(2) Class73[] arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1.length; local14++) {
			@Pc(20) Class73 local20 = arg1[local14];
			if (local20 != null) {
				if (local20.anInt1391 == 0) {
					if (local20.aClass73Array1 != null) {
						method4857(arg0, local20.aClass73Array1);
					}
					@Pc(47) Class5_Sub49 local47 = (Class5_Sub49) Static549.aClass291_37.method6993((long) local20.anInt1388, 1);
					if (local47 != null) {
						Static190.method2757(local47.anInt9322, arg0);
					}
				}
				@Pc(67) Class5_Sub3 local67;
				if (arg0 == 0 && local20.anObjectArray18 != null) {
					local67 = new Class5_Sub3();
					local67.aClass73_1 = local20;
					local67.anObjectArray1 = local20.anObjectArray18;
					Static173.method2520(local67);
				}
				if (arg0 == 1 && local20.anObjectArray11 != null) {
					if (local20.anInt1364 >= 0) {
						@Pc(94) Class73 local94 = Static259.method3831(local20.anInt1388);
						if (local94 == null || local94.aClass73Array1 == null || local20.anInt1364 >= local94.aClass73Array1.length || local94.aClass73Array1[local20.anInt1364] != local20) {
							continue;
						}
					}
					local67 = new Class5_Sub3();
					local67.aClass73_1 = local20;
					local67.anObjectArray1 = local20.anObjectArray11;
					Static173.method2520(local67);
				}
			}
		}
	}
}
