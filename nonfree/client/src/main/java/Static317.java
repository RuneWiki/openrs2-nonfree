import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "F")
	public static float aFloat168;

	@OriginalMember(owner = "client!lr", name = "k", descriptor = "Lclient!br;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_156 = new Class363(111, 6);

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "I")
	public static int anInt5928 = 0;

	@OriginalMember(owner = "client!lr", name = "l", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_103 = new Class286(66, -1);

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)Lclient!dfa;")
	public static Class6_Sub1_Sub2 method4928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class346 local7 = Static389.aClass346ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass6_Sub1_Sub2_1 == null ? null : local7.aClass6_Sub1_Sub2_1;
	}
}
