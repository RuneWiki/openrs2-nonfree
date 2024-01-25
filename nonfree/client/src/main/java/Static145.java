import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
	public static int anInt2656;

	@OriginalMember(owner = "client!jh", name = "K", descriptor = "[Lclient!sg;")
	public static Class97[] aClass97Array10;

	@OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
	public static int anInt2660 = 0;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "(B)V")
	public static void method2209() {
		for (@Pc(7) int local7 = 0; local7 < Static247.aClass214ArrayArray1.length; local7++) {
			for (@Pc(18) int local18 = 0; local18 < Static247.aClass214ArrayArray1[local7].length; local18++) {
				Static247.aClass214ArrayArray1[local7][local18] = Static217.aClass214_2;
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIII)V")
	public static void method2210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= Static280.anInt212 && Static346.anInt6607 >= arg1) {
			@Pc(19) int local19 = Static61.method917(Static240.anInt4829, arg0, Static166.anInt3315);
			@Pc(25) int local25 = Static61.method917(Static240.anInt4829, arg3, Static166.anInt3315);
			Static222.method3979(arg1, local19, local25, arg2);
		}
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(III)V")
	public static void method2211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static195.anIntArray342[arg0] = arg1;
		@Pc(18) Class11_Sub16 local18 = (Class11_Sub16) Static37.aClass58_7.method1009((long) arg0);
		if (local18 == null) {
			local18 = new Class11_Sub16(4611686018427387905L);
			Static37.aClass58_7.method1006((long) arg0, local18);
		} else if (local18.aLong74 != 4611686018427387905L) {
			local18.aLong74 = Static268.method4627() + 500L | 0x4000000000000000L;
			return;
		}
	}
}
