import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!gs", name = "f", descriptor = "[J")
	public static final long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V")
	public static void method2815() {
		Static167.aClipboard1 = null;
		Static259.aBoolean185 = false;
		Static190.method3102();
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZZIIIII)V")
	public static void method2819(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 >= arg4) {
			return;
		}
		@Pc(18) int local18 = (arg4 + arg5) / 2;
		@Pc(20) int local20 = arg5;
		@Pc(24) Class178_Sub1 local24 = Static386.aClass178_Sub1Array2[local18];
		Static386.aClass178_Sub1Array2[local18] = Static386.aClass178_Sub1Array2[arg4];
		Static386.aClass178_Sub1Array2[arg4] = local24;
		for (@Pc(36) int local36 = arg5; local36 < arg4; local36++) {
			if (Static394.method6282(arg1, arg0, arg2, local24, Static386.aClass178_Sub1Array2[local36], arg3) <= 0) {
				@Pc(53) Class178_Sub1 local53 = Static386.aClass178_Sub1Array2[local36];
				Static386.aClass178_Sub1Array2[local36] = Static386.aClass178_Sub1Array2[local20];
				Static386.aClass178_Sub1Array2[local20++] = local53;
			}
		}
		Static386.aClass178_Sub1Array2[arg4] = Static386.aClass178_Sub1Array2[local20];
		Static386.aClass178_Sub1Array2[local20] = local24;
		method2819(arg0, arg1, arg2, arg3, local20 - 1, arg5);
		method2819(arg0, arg1, arg2, arg3, arg4, local20 + 1);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!qa;)V")
	public static void method2820(@OriginalArg(0) Class39 arg0) {
		for (@Pc(1) int local1 = Static514.anInt8971; local1 < Static323.anInt6015; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static515.anInt3809; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static315.anInt5693; local7++) {
					@Pc(16) Class262 local16 = Static399.aClass262ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class1_Sub2 local21 = local16.aClass1_Sub2_3;
						@Pc(24) Class1_Sub2 local24 = local16.aClass1_Sub2_2;
						if (local21 != null && local21.method7671()) {
							Static279.method4413(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method7671()) {
								Static279.method4413(arg0, local24, local1, local4, local7, 1, 1);
								local24.method7672(0, arg0, 0, false, local21, 0);
								local24.method7675();
							}
							local21.method7675();
						}
						for (@Pc(70) Class187 local70 = local16.aClass187_3; local70 != null; local70 = local70.aClass187_1) {
							@Pc(74) Class1_Sub1 local74 = local70.aClass1_Sub1_1;
							if (local74 != null && local74.method7671()) {
								Static279.method4413(arg0, local74, local1, local4, local7, local74.aShort125 + 1 - local74.aShort127, local74.aShort126 - local74.aShort128 + 1);
								local74.method7675();
							}
						}
						@Pc(111) Class1_Sub4 local111 = local16.aClass1_Sub4_1;
						if (local111 != null && local111.method7671()) {
							Static479.method7145(arg0, local111, local1, local4, local7);
							local111.method7675();
						}
					}
				}
			}
		}
	}
}
