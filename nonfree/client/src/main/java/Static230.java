import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "B")
	public static byte aByte12;

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "Lclient!client;")
	public static client aClient2;

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_17 = new Class306("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZBLclient!kr;Ljava/lang/String;)Lclient!cq;")
	public static Class53 method1103(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class171 arg1, @OriginalArg(3) String arg2) {
		@Pc(10) int local10 = arg1.method4338(arg2);
		if (local10 == -1) {
			return new Class53(0);
		}
		@Pc(23) int[] local23 = arg1.method4353(local10);
		@Pc(34) Class53 local34 = new Class53(local23.length);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		while (true) {
			while (local36 < local34.anInt1356) {
				@Pc(52) Class1_Sub6 local52 = new Class1_Sub6(arg1.method4339(local10, local23[local38++]));
				@Pc(56) int local56 = local52.method3925();
				@Pc(60) int local60 = local52.method3967();
				@Pc(64) int local64 = local52.method3922();
				if (!arg0 && local64 == 1) {
					local34.anInt1356--;
				} else {
					local34.anIntArray154[local36] = local56;
					local34.anIntArray153[local36] = local60;
					local36++;
				}
			}
			return local34;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
	public static void method1104(@OriginalArg(1) int arg0) {
		Static20.method501();
		@Pc(11) int local11 = Static463.aClass108_1.method2494(arg0).anInt7026;
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static251.aClass119_1.anIntArray292[arg0];
		if (local11 == 5) {
			Static329.anInt5978 = local22;
		}
		if (local11 == 6) {
			Static479.anInt8664 = local22;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!qa;IIIII[[[BIIIBII)V")
	public static void method1105(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[][][] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg9 == 0 || arg5 == 0) {
			return;
		}
		if (arg9 == 9) {
			arg8 = arg8 + 1 & 0x3;
			arg9 = 1;
		}
		if (arg9 == 10) {
			arg8 = arg8 + 3 & 0x3;
			arg9 = 1;
		}
		if (arg9 == 11) {
			arg9 = 8;
			arg8 = arg8 + 3 & 0x3;
		}
		arg0.za(arg2, arg7, arg4, arg11, arg3, arg10, arg6[arg9 - 1][arg8], arg5, arg1);
	}
}
