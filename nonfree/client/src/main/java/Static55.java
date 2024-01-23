import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "Lclient!pa;")
	public static Class86 aClass86_18;

	@OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
	public static int anInt1089;

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "Lclient!hh;")
	public static Class50 aClass50_385 = Static186.method3527("sch-Utteln:");

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "[I")
	public static int[] anIntArray92 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!ei", name = "s", descriptor = "Lclient!hh;")
	public static Class50 aClass50_386 = Static186.method3527("sl_arrows");

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BIIIIIIII)V")
	public static void method809(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(4) int local4 = arg0 - arg2;
		@Pc(21) int local21 = arg3 - arg6;
		@Pc(30) int local30 = (arg1 - arg5 << 16) / local4;
		@Pc(38) int local38 = (arg4 - arg7 << 16) / local21;
		Static58.method862(arg6, arg0, local30, local38, arg2, arg3, arg7, arg5);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
	public static void method810() {
		Static32.method462();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static22.aClass16Array1[local8].method431();
		}
		System.gc();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)I")
	public static int method811(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!pa;ZLclient!pa;Lclient!pa;)V")
	public static void method813(@OriginalArg(0) Class86 arg0, @OriginalArg(2) Class86 arg1, @OriginalArg(3) Class86 arg2) {
		Static61.aClass86_21 = arg0;
		Static112.aClass86_37 = arg1;
		Static166.aClass86_62 = arg2;
	}
}
