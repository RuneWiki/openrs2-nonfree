import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
	public static int anInt6017;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZIILclient!go;Lclient!go;ZI)I")
	public static int method5035(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class91_Sub1 arg2, @OriginalArg(4) Class91_Sub1 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = Static396.method5296(arg3, arg5, arg0, arg2);
		if (local10 != 0) {
			return arg0 ? -local10 : local10;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(31) int local31 = Static396.method5296(arg3, arg1, arg4, arg2);
			return arg4 ? -local31 : local31;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B[BZ)V")
	public static void method5036(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1) {
		if (Static101.aClass1_Sub5_3 == null) {
			Static101.aClass1_Sub5_3 = new Class1_Sub5(20000);
		}
		Static101.aClass1_Sub5_3.method5367(arg0, arg0.length);
		if (!arg1) {
			return;
		}
		Static443.method5834(Static101.aClass1_Sub5_3.aByteArray89);
		Static260.aClass91_Sub1Array1 = new Class91_Sub1[Static210.anInt3953];
		@Pc(39) int local39 = 0;
		for (@Pc(41) int local41 = Static18.anInt3463; local41 <= Static204.anInt7303; local41++) {
			@Pc(47) Class91_Sub1 local47 = Static89.method1639(local41);
			if (local47 != null) {
				Static260.aClass91_Sub1Array1[local39++] = local47;
			}
		}
		Static28.aBoolean28 = false;
		Static69.aLong45 = Static279.method4058();
		Static101.aClass1_Sub5_3 = null;
	}
}
