import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!kp", name = "C", descriptor = "B")
	public static byte aByte88 = -6;

	@OriginalMember(owner = "client!kp", name = "F", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_82 = new Class100(50, 8);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
	public static void method4984() {
		if (Static499.anInt8832 == 0) {
			return;
		}
		if (Static258.aClass97_2 != null) {
			Static258.aClass97_2.method2286();
			Static258.aClass97_2 = null;
		}
		Static120.method7600();
		Static20.method9251();
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIII)I")
	public static int method4987(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 / arg0;
		@Pc(13) int local13 = arg0 - 1 & arg1;
		@Pc(22) int local22 = arg2 / arg0;
		@Pc(28) int local28 = arg2 & arg0 - 1;
		@Pc(33) int local33 = Static117.method9147(local22, local7);
		@Pc(40) int local40 = Static117.method9147(local22, local7 + 1);
		@Pc(47) int local47 = Static117.method9147(local22 + 1, local7);
		@Pc(56) int local56 = Static117.method9147(local22 + 1, local7 + 1);
		@Pc(63) int local63 = Static477.method6907(local40, local33, arg0, local13);
		@Pc(70) int local70 = Static477.method6907(local56, local47, arg0, local13);
		return Static477.method6907(local70, local63, arg0, local28);
	}
}
