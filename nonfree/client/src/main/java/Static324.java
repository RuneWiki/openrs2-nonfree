import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
	public static int anInt9546 = -2;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
	public static void method8034() {
		Static626.aClass345Array2 = null;
		if (Static66.aBoolean570 && Static469.method6688() != 1) {
			Static415.method6169(Static557.method7723(), Static173.anInt3397 == 3 || Static173.anInt3397 == 7, 0, Static411.method6128(), 0);
		}
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (Static66.aBoolean570) {
			local38 = Static106.method2037();
			local40 = Static660.method8815();
		}
		Static597.method8166(Static79.anInt1140 + local40, Static84.anInt2018, local38, local40, -1, Static32.anInt510 + local38, local38, local40);
		if (Static626.aClass345Array2 != null) {
			Static416.method6170(Static550.anInt9004, Static303.aClass345_8.anInt9643, Static604.anInt9933, local38, -1412584499, Static626.aClass345Array2, local40, Static79.anInt1140 + local40, true, local38 + Static32.anInt510);
			Static626.aClass345Array2 = null;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "([Ljava/lang/Object;[JI)V")
	public static void method8035(@OriginalArg(0) Object[] arg0, @OriginalArg(1) long[] arg1) {
		Static570.method7864(0, arg1.length - 1, arg1, arg0);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!wm;Lclient!wm;[I)V")
	public static void method8036(@OriginalArg(1) Class390 arg0, @OriginalArg(2) Class390 arg1, @OriginalArg(3) int[] arg2) {
		Static504.aClass390_97 = arg0;
		if (arg2 != null) {
			Static16.anIntArray14 = arg2;
		}
		Static519.aClass390_100 = arg1;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V")
	public static void method8037() {
		@Pc(8) Class5_Sub7 local8 = (Class5_Sub7) Static223.aClass114_23.method2805();
		@Pc(23) boolean local23 = Static383.aClass345_10 != null || Static101.anInt2198 > 0;
		@Pc(27) int local27 = local8.method8703();
		@Pc(33) int local33 = local8.method8702();
		if (local23) {
			Static51.anInt735 = 1;
		}
		if (local23) {
			Static315.aClass5_Sub3_Sub20_2 = Static355.aClass5_Sub3_Sub20_3;
		} else {
			Static208.method3305(local33, local27, Static355.aClass5_Sub3_Sub20_3);
		}
	}
}
