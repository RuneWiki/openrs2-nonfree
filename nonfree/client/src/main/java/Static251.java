import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "Lclient!jt;")
	public static Class136 aClass136_14;

	@OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
	public static int anInt6446;

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_339 = new Class123(60, 5);

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)V")
	public static void method5355(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static212.method3218(arg1, 6);
		local8.method3088();
		local8.anInt3749 = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIB)Lclient!ts;")
	public static Class239 method5357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class239 local7 = Static121.method2092(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass239Array2 == null || local7.aClass239Array2.length <= arg0) {
			return null;
		} else {
			return local7.aClass239Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BIIIIII)V")
	public static void method5358(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg4 + arg1;
		@Pc(15) int local15 = arg2 - arg1;
		for (@Pc(17) int local17 = arg4; local17 < local10; local17++) {
			Static298.method4405(Static62.anIntArrayArray7[local17], arg3, arg0, arg5);
		}
		@Pc(35) int local35 = arg1 + arg5;
		@Pc(40) int local40 = arg0 - arg1;
		for (@Pc(42) int local42 = arg2; local42 > local15; local42--) {
			Static298.method4405(Static62.anIntArrayArray7[local42], arg3, arg0, arg5);
		}
		for (@Pc(58) int local58 = local10; local58 <= local15; local58++) {
			@Pc(64) int[] local64 = Static62.anIntArrayArray7[local58];
			Static298.method4405(local64, arg3, local35, arg5);
			Static298.method4405(local64, arg3, arg0, local40);
		}
	}
}
