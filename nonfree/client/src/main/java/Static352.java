import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
	public static int anInt6601;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString79 = "";

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
	public static int anInt6599 = 0;

	@OriginalMember(owner = "client!oh", name = "s", descriptor = "[Lclient!pc;")
	public static final Class12_Sub41[] aClass12_Sub41Array1 = new Class12_Sub41[1024];

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!qa;IBI)V")
	public static void method5519(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static497.aClass42_9 = arg0;
		Static544.aClass240ArrayArray1 = new Class240[arg2][arg1];
		if (Static267.anIntArray376 != null) {
			Static500.aClass124_3 = Static172.method6605(Static267.anIntArray376[0], Static267.anIntArray376[5], Static267.anIntArray376[4], Static267.anIntArray376[3], Static267.anIntArray376[1], Static267.anIntArray376[2]);
		}
		Static283.aClass240_9 = new Class240();
		Static231.method4122();
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "([I[I[ILclient!hh;I)V")
	public static void method5521(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class30_Sub1_Sub1_Sub2 arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(9) int local9 = arg2[local3];
			@Pc(13) int local13 = arg0[local3];
			@Pc(17) int local17 = arg1[local3];
			for (@Pc(19) int local19 = 0; local13 != 0 && local19 < arg3.aClass288Array3.length; local19++) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg3.aClass288Array3[local19] = null;
					} else {
						@Pc(33) Class64 local33 = Static47.aClass41_1.method911(local9);
						@Pc(36) int local36 = local33.anInt1972;
						@Pc(41) Class288 local41 = arg3.aClass288Array3[local19];
						if (local41 != null) {
							if (local9 == local41.anInt8706) {
								if (local36 == 0) {
									local41 = arg3.aClass288Array3[local19] = null;
								} else if (local36 == 1) {
									local41.anInt8707 = local17;
									local41.anInt8701 = 0;
									local41.anInt8708 = 0;
									local41.anInt8704 = 1;
									local41.anInt8702 = 0;
									Static349.method5479(arg3.anInt9416, arg3.aByte99, false, 0, local33, arg3.anInt9418);
								} else if (local36 == 2) {
									local41.anInt8702 = 0;
								}
							} else if (local33.anInt1968 >= Static47.aClass41_1.method911(local41.anInt8706).anInt1968) {
								local41 = arg3.aClass288Array3[local19] = null;
							}
						}
						if (local41 == null) {
							local41 = arg3.aClass288Array3[local19] = new Class288();
							local41.anInt8701 = 0;
							local41.anInt8707 = local17;
							local41.anInt8708 = 0;
							local41.anInt8706 = local9;
							local41.anInt8704 = 1;
							local41.anInt8702 = 0;
							Static349.method5479(arg3.anInt9416, arg3.aByte99, false, 0, local33, arg3.anInt9418);
						}
					}
				}
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(III)Z")
	public static boolean method5522(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
