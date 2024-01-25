import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "Lclient!vo;")
	public static Class348 aClass348_91;

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "Z")
	public static boolean aBoolean553 = false;

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "Lclient!uea;")
	public static final Class326 aClass326_7 = new Class326("LIVE", 0);

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBI)Z")
	public static boolean method5933(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class233 local13 = Static103.aClass298_1.method6822(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local13.method5281(arg0);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIILclient!bda;Lclient!bda;)V")
	public static void method5935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class21_Sub1_Sub2 arg3, @OriginalArg(4) Class21_Sub1_Sub2 arg4) {
		@Pc(4) Class182 local4 = Static560.method7938(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass21_Sub1_Sub2_1 = arg3;
		local4.aClass21_Sub1_Sub2_2 = arg4;
		@Pc(19) int local19 = Static255.aClass115Array2 == Static140.aClass115Array1 ? 1 : 0;
		if (!arg3.method8235()) {
			Static375.aClass21_Sub1ArrayArray3[local19][Static27.anIntArray195[local19]++] = arg3;
		} else if (arg3.method8229()) {
			Static338.aClass21_Sub1ArrayArray2[local19][Static254.anIntArray281[local19]++] = arg3;
		} else {
			Static48.aClass21_Sub1ArrayArray4[local19][Static137.anIntArray143[local19]++] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8235()) {
			if (arg4.method8229()) {
				Static338.aClass21_Sub1ArrayArray2[local19][Static254.anIntArray281[local19]++] = arg4;
				return;
			}
			Static48.aClass21_Sub1ArrayArray4[local19][Static137.anIntArray143[local19]++] = arg4;
			return;
		}
		Static375.aClass21_Sub1ArrayArray3[local19][Static27.anIntArray195[local19]++] = arg4;
	}
}
