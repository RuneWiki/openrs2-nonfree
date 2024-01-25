import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static654 {

	@OriginalMember(owner = "client!vo", name = "h", descriptor = "D")
	public static double aDouble22;

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
	public static int anInt10715;

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "[I")
	public static int[] anIntArray571;

	@OriginalMember(owner = "client!vo", name = "m", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_272 = new Class160(117, 7);

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_273 = new Class160(135, 6);

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray46 = new String[200];

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "([Ljava/lang/String;III[I)V")
	public static void method9148(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) String local14 = arg0[local8];
		arg0[local8] = arg0[arg1];
		arg0[arg1] = local14;
		@Pc(28) int local28 = arg3[local8];
		arg3[local8] = arg3[arg1];
		arg3[arg1] = local28;
		for (@Pc(40) int local40 = arg2; local40 < arg1; local40++) {
			if (local14 == null || arg0[local40] != null && (local40 & 0x1) > arg0[local40].compareTo(local14)) {
				@Pc(64) String local64 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local64;
				@Pc(78) int local78 = arg3[local40];
				arg3[local40] = arg3[local10];
				arg3[local10++] = local78;
			}
		}
		arg0[arg1] = arg0[local10];
		arg0[local10] = local14;
		arg3[arg1] = arg3[local10];
		arg3[local10] = local28;
		method9148(arg0, local10 - 1, arg2, arg3);
		method9148(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZLclient!paa;[[B)V")
	public static void method9149(@OriginalArg(1) Class49_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(10) int local10;
		@Pc(13) int local13;
		@Pc(22) int local22;
		@Pc(31) int local31;
		for (@Pc(5) int local5 = 0; local5 < arg0.anInt7594; local5++) {
			Static599.method8480();
			for (local10 = 0; local10 < Static380.anInt6689 >> 3; local10++) {
				for (local13 = 0; local13 < Static542.anInt9214 >> 3; local13++) {
					local22 = Static646.anIntArrayArrayArray20[local5][local10][local13];
					if (local22 != -1) {
						local31 = local22 >> 24 & 0x3;
						if (!arg0.aBoolean534 || local31 == 0) {
							@Pc(44) int local44 = local22 >> 1 & 0x3;
							@Pc(50) int local50 = local22 >> 14 & 0x3FF;
							@Pc(56) int local56 = local22 >> 3 & 0x7FF;
							@Pc(66) int local66 = (local50 / 8 << 8) + local56 / 8;
							for (@Pc(68) int local68 = 0; local68 < Static365.anIntArray336.length; local68++) {
								if (Static365.anIntArray336[local68] == local66 && arg1[local68] != null) {
									@Pc(91) Class14_Sub21 local91 = new Class14_Sub21(arg1[local68]);
									arg0.method6723(local10 * 8, local31, local50, local91, local5, Static40.aClass289Array1, local13 * 8, local44, local56);
									arg0.method6728(local31, Static103.aClass144_3, local13 * 8, local56, local5, local91, local50, local44, local10 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < arg0.anInt7594; local10++) {
			Static599.method8480();
			for (local13 = 0; local13 < Static380.anInt6689 >> 3; local13++) {
				for (local22 = 0; local22 < Static542.anInt9214 >> 3; local22++) {
					local31 = Static646.anIntArrayArrayArray20[local10][local13][local22];
					if (local31 == -1) {
						arg0.method6714(8, local13 * 8, local22 * 8, local10, 8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIB)Z")
	public static boolean method9150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static579.method8822(arg0, arg1) || Static63.method1036(arg1, arg0);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)[Lclient!ua;")
	public static Class358[] method9151() {
		return new Class358[] { Static307.aClass358_1, Static307.aClass358_2, Static307.aClass358_3, Static307.aClass358_4, Static307.aClass358_5, Static307.aClass358_6, Static307.aClass358_7, Static307.aClass358_8, Static307.aClass358_9, Static307.aClass358_10, Static307.aClass358_11, Static307.aClass358_12, Static307.aClass358_13 };
	}
}
