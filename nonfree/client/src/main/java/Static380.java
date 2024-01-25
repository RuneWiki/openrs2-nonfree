import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!t", name = "e", descriptor = "I")
	public static int anInt6896;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_181 = new Class158("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!t", name = "d", descriptor = "I")
	public static int anInt6895 = 0;

	@OriginalMember(owner = "client!t", name = "i", descriptor = "[I")
	public static final int[] anIntArray636 = new int[64];

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([BIIIII)Z")
	public static boolean method5245(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) boolean local5 = true;
		@Pc(10) Class1_Sub3 local10 = new Class1_Sub3(arg0);
		@Pc(12) int local12 = -1;
		label68: while (true) {
			@Pc(16) int local16 = local10.method1224();
			if (local16 == 0) {
				return local5;
			}
			local12 += local16;
			@Pc(24) int local24 = 0;
			@Pc(26) boolean local26 = false;
			while (true) {
				@Pc(59) int local59;
				@Pc(94) Class192 local94;
				do {
					@Pc(64) int local64;
					@Pc(68) int local68;
					do {
						do {
							do {
								do {
									@Pc(32) int local32;
									while (local26) {
										local32 = local10.method1168();
										if (local32 == 0) {
											continue label68;
										}
										local10.method1171();
									}
									local32 = local10.method1168();
									if (local32 == 0) {
										continue label68;
									}
									local24 += local32 - 1;
									@Pc(47) int local47 = local24 & 0x3F;
									@Pc(53) int local53 = local24 >> 6 & 0x3F;
									local59 = local10.method1171() >> 2;
									local64 = local53 + arg2;
									local68 = arg4 + local47;
								} while (local64 <= 0);
							} while (local68 <= 0);
						} while (local64 >= arg3 - 1);
					} while (local68 >= arg1 - 1);
					local94 = Static455.aClass161_4.method3628(local12);
				} while (local59 == 22 && !Static12.aClass34_Sub1_1.aBoolean455 && local94.anInt5666 == 0 && local94.anInt5664 != 1 && !local94.aBoolean356);
				local26 = true;
				if (!local94.method4361()) {
					Static169.anInt3489++;
					local5 = false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BI)I")
	public static int method5247(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
