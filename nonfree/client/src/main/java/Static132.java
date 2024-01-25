import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!gp", name = "l", descriptor = "F")
	public static float aFloat55;

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "Lclient!di;")
	public static final Class54 aClass54_43 = new Class54(51, -1);

	@OriginalMember(owner = "client!gp", name = "k", descriptor = "Lclient!mn;")
	public static Class163 aClass163_13 = new Class163(64);

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)V")
	public static void method2246(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub5_Sub13 local13 = Static208.method3306(arg0, 4);
		local13.method4545();
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(BILclient!vc;)V")
	public static void method2247(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub23_Sub2 arg1) {
		Static17.aBoolean14 = false;
		Static404.anInt6735 = 0;
		Static367.method4997(arg1);
		Static413.method5434(arg1);
		if (Static17.aBoolean14) {
			System.out.println("---endgpp---");
		}
		if (arg0 != arg1.anInt6952) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt6952 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!eo;III)V")
	public static void method2251(@OriginalArg(0) Class69 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static351.aLongArrayArrayArray2[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt3075 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass2_Sub20Array3[arg0.anInt3075++] = Static140.aClass170Array1[local21 - 1].aClass2_Sub20_1;
			local9 += 16L;
		}
		for (local21 = arg0.anInt3075; local21 < 4; local21++) {
			arg0.aClass2_Sub20Array3[local21] = null;
		}
	}
}
