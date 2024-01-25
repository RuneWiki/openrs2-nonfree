import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
	public static int anInt3051;

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "Lclient!pq;")
	public static Class251 aClass251_60;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Z")
	public static boolean method2625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!cga;IIIII)V")
	public static void method2629(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt29 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass6_Sub7Array2[local4] != null) {
				arg0.anInt29++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt29; local22++) {
			@Pc(31) long local31 = Static140.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class178 local41;
			while (local31 != 0L) {
				local41 = Static149.aClass178Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass6_Sub7_2 == arg0.aClass6_Sub7Array2[local22]) {
					continue label51;
				}
			}
			local31 = Static140.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static149.aClass178Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass6_Sub7_2 == arg0.aClass6_Sub7Array2[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt29 - 1; local93++) {
				arg0.aClass6_Sub7Array2[local93] = arg0.aClass6_Sub7Array2[local93 + 1];
			}
			arg0.anInt29--;
		}
	}
}
