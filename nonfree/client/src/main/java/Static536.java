import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
	public static int anInt9157 = 0;

	@OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
	public static int anInt9158 = 0;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V")
	public static void method7901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub5_Sub21 local8 = Static101.method1629(7, arg1);
		local8.method8958();
		local8.anInt10530 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BB)V")
	public static void method7902(@OriginalArg(0) byte arg0) {
		if (Static105.aByteArrayArrayArray3 == null) {
			Static105.aByteArrayArrayArray3 = new byte[4][Static326.anInt5541][Static448.anInt7637];
		}
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			for (@Pc(20) int local20 = 0; local20 < Static326.anInt5541; local20++) {
				for (@Pc(23) int local23 = 0; local23 < Static448.anInt7637; local23++) {
					Static105.aByteArrayArrayArray3[local17][local20][local23] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(III)I")
	public static int method7903(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg0 - 1 & arg1 >> 31;
		return ((arg1 >>> 31) + arg1) % arg0 + local17;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BIIIIIIII)Z")
	public static boolean method7904(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < arg0 + arg6 && arg0 < arg5 + arg4) {
			return arg2 < arg7 + arg1 && arg1 < arg2 + arg3;
		} else {
			return false;
		}
	}
}
