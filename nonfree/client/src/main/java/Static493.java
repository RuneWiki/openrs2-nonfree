import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
	public static int anInt8236;

	@OriginalMember(owner = "client!qt", name = "f", descriptor = "Lclient!el;")
	public static Class109 aClass109_175 = null;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)V")
	public static void method7097(@OriginalArg(0) int arg0) {
		@Pc(9) Class5_Sub5_Sub6 local9 = Static478.method6972((long) arg0, 12);
		local9.method2686();
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIZIIIII)V")
	public static void method7098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static637.aClass5_Sub20_31.aClass24_Sub12_4.method3413() != 0 && arg3 != 0 && Static21.anInt322 < 50 && arg1 != -1) {
			Static377.aClass50Array1[Static21.anInt322++] = new Class50((byte) 2, arg1, arg3, arg4, arg5, arg2, arg0, (Class8_Sub1) null);
		}
	}
}
