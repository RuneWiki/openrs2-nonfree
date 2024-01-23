import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!ai;")
	public static Class7 aClass7_9;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!nb;")
	public static Class1_Sub1_Sub6_Sub1 aClass1_Sub1_Sub6_Sub1_2;

	@OriginalMember(owner = "client!client", name = "W", descriptor = "I")
	public static int anInt799 = 0;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!kh;")
	public static Class60 aClass60_264 = Static200.method3116("Fps:");

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!kh;")
	public static Class60 aClass60_265 = Static200.method3116("");

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_266 = Static200.method3116(" loggt sich aus)3");

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLclient!kh;)V")
	public static void method589(@OriginalArg(1) Class60 arg0) {
		Static166.aClass60_1241 = arg0;
		Static49.method958();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZIII)V")
	public static void method590(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static141.anInt3163 && arg0 <= Static200.anInt4273) {
			@Pc(24) int local24 = Static107.method1863(Static214.anInt4572, arg2, Static130.anInt2847);
			@Pc(30) int local30 = Static107.method1863(Static214.anInt4572, arg3, Static130.anInt2847);
			Static26.method430(local24, arg0, arg1, local30);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)J")
	public static long method593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub22 local7 = Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt3358; local13++) {
			@Pc(19) Class29 local19 = local7.aClass29Array3[local13];
			if ((local19.aLong43 >> 29 & 0x3L) == 2L && local19.anInt1437 == arg1 && local19.anInt1423 == arg2) {
				return local19.aLong43;
			}
		}
		return 0L;
	}
}
