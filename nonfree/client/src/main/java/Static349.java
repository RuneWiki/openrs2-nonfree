import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!uf", name = "R", descriptor = "I")
	public static int anInt6420;

	@OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
	public static final int anInt6414 = 1403;

	@OriginalMember(owner = "client!uf", name = "M", descriptor = "Lclient!re;")
	public static final Class199 aClass199_7 = new Class199();

	@OriginalMember(owner = "client!uf", name = "T", descriptor = "[Lclient!fo;")
	public static final Class80[] aClass80Array1 = new Class80[50];

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "(B)V")
	public static void method5573() {
		Static350.anInt6468 = 0;
		@Pc(13) int local13 = (Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800 >> 7) + Static279.anInt5198;
		@Pc(20) int local20 = Static350.anInt6470 + (Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798 >> 7);
		if (local13 >= 3053 && local13 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static350.anInt6468 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static350.anInt6468 = 1;
		}
		if (Static350.anInt6468 == 1 && local13 >= 3139 && local13 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static350.anInt6468 = 0;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!pi;ILclient!pi;ZIIZ)I")
	public static int method5574(@OriginalArg(0) Class35_Sub1 arg0, @OriginalArg(2) Class35_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static272.method4578(arg5, arg0, arg1, arg3);
		if (local10 != 0) {
			return arg5 ? -local10 : local10;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(31) int local31 = Static272.method4578(arg2, arg0, arg1, arg4);
			return arg2 ? -local31 : local31;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIZ)I")
	public static int method5575(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub32 local14 = Static76.method1317(false, arg0);
		if (local14 == null) {
			return Static40.aClass146_1.method3775(arg0).anInt4820;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray470.length; local26++) {
			if (local14.anIntArray470[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static40.aClass146_1.method3775(arg0).anInt4820 - local14.anIntArray470.length;
	}
}
