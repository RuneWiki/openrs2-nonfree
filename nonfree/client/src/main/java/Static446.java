import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "Lclient!ob;")
	public static Class4_Sub30 aClass4_Sub30_2;

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "Lclient!qn;")
	public static Class211 aClass211_97;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIBIIIII)V")
	public static void method5929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(16) int local16 = arg5 + arg1;
		@Pc(21) int local21 = arg4 - arg5;
		for (@Pc(23) int local23 = arg1; local23 < local16; local23++) {
			Static249.method6044(Static267.anIntArrayArray50[local23], arg0, arg2, arg3);
		}
		@Pc(46) int local46 = arg2 - arg5;
		@Pc(50) int local50 = arg5 + arg3;
		for (@Pc(52) int local52 = arg4; local52 > local21; local52--) {
			Static249.method6044(Static267.anIntArrayArray50[local52], arg0, arg2, arg3);
		}
		for (@Pc(72) int local72 = local16; local72 <= local21; local72++) {
			@Pc(78) int[] local78 = Static267.anIntArrayArray50[local72];
			Static249.method6044(local78, arg0, local50, arg3);
			Static249.method6044(local78, arg6, local46, local50);
			Static249.method6044(local78, arg0, arg2, local46);
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(B[B)[B")
	public static byte[] method5930(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class4_Sub9 local8 = new Class4_Sub9(arg0);
		@Pc(17) int local17 = local8.method5007();
		@Pc(21) int local21 = local8.method4997();
		if (local21 < 0 || Static71.anInt7225 != 0 && Static71.anInt7225 < local21) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(40) byte[] local40 = new byte[local21];
			local8.method5005(local40, local21);
			return local40;
		} else {
			@Pc(52) int local52 = local8.method4997();
			if (local52 < 0 || Static71.anInt7225 != 0 && local52 > Static71.anInt7225) {
				throw new RuntimeException();
			}
			@Pc(69) byte[] local69 = new byte[local52];
			if (local17 == 1) {
				Static227.method3073(local69, local52, arg0, local21);
			} else {
				Static191.aClass63_1.method1350(local8, local69);
			}
			return local69;
		}
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V")
	public static void method5931() {
		if (Static406.aString70.length() == 0) {
			return;
		}
		Static385.method5096("--> " + Static406.aString70);
		Static70.method1164(Static406.aString70, false);
		Static330.anInt5369 = 0;
		Static406.aString70 = "";
		Static396.anInt6462 = 0;
	}
}
