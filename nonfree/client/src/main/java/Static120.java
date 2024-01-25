import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
	public static int anInt2729;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIILclient!sp;)V")
	public static void method2178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class21_Sub1_Sub5 arg3) {
		@Pc(4) Class182 local4 = Static560.method7938(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass21_Sub1_Sub5_1 = arg3;
		@Pc(16) int local16 = Static255.aClass115Array2 == Static140.aClass115Array1 ? 1 : 0;
		if (arg3.method8235()) {
			if (arg3.method8229()) {
				Static338.aClass21_Sub1ArrayArray2[local16][Static254.anIntArray281[local16]++] = arg3;
				return;
			}
			Static48.aClass21_Sub1ArrayArray4[local16][Static137.anIntArray143[local16]++] = arg3;
			return;
		}
		Static375.aClass21_Sub1ArrayArray3[local16][Static27.anIntArray195[local16]++] = arg3;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method2179(@OriginalArg(0) Class7 arg0) {
		if (Static70.aBoolean150) {
			Static504.method7254(arg0);
		} else {
			Static7.method642(arg0);
		}
	}
}
