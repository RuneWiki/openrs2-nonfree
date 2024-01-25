import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!nu", name = "L", descriptor = "F")
	public static float aFloat85;

	@OriginalMember(owner = "client!nu", name = "O", descriptor = "F")
	public static float aFloat86;

	@OriginalMember(owner = "client!nu", name = "z", descriptor = "I")
	public static int anInt4731 = -1;

	@OriginalMember(owner = "client!nu", name = "D", descriptor = "[B")
	public static final byte[] aByteArray62 = new byte[2048];

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "(II)I")
	public static int method4208(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local13 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local13 += 8;
		}
		if (arg0 >= 16) {
			local13 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local13 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local13++;
			arg0 >>>= 0x1;
		}
		return local13 + arg0;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V")
	public static void method4210() {
		if (Static143.anInt2575 == 2) {
			Static2.anInt8 = 96;
			return;
		}
		try {
			@Pc(29) Method local29 = Runtime.class.getMethod("maxMemory");
			if (local29 != null) {
				try {
					@Pc(33) Runtime local33 = Runtime.getRuntime();
					@Pc(39) Long local39 = (Long) local29.invoke(local33, (Object[]) null);
					Static2.anInt8 = (int) (local39 / 1048576L) + 1;
					return;
				} catch (@Pc(49) Throwable local49) {
					return;
				}
			}
		} catch (@Pc(51) Exception local51) {
			return;
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lclient!q;I[[B)V")
	public static void method4211(@OriginalArg(0) Class204_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.anInt5181; local7++) {
			Static88.method1553();
			for (@Pc(13) int local13 = 0; local13 < Static84.anInt1632 >> 3; local13++) {
				for (@Pc(17) int local17 = 0; local17 < Static261.anInt4480 >> 3; local17++) {
					@Pc(27) int local27 = Static1.anIntArrayArrayArray1[local7][local13][local17];
					if (local27 != -1) {
						@Pc(36) int local36 = local27 >> 24 & 0x3;
						if (!arg0.aBoolean359 || local36 == 0) {
							@Pc(50) int local50 = local27 >> 1 & 0x3;
							@Pc(56) int local56 = local27 >> 14 & 0x3FF;
							@Pc(62) int local62 = local27 >> 3 & 0x7FF;
							@Pc(72) int local72 = local62 / 8 + (local56 / 8 << 8);
							for (@Pc(74) int local74 = 0; local74 < Static175.anIntArray282.length; local74++) {
								if (local72 == Static175.anIntArray282[local74] && arg1[local74] != null) {
									arg0.method4544((local56 & 0x7) * 8, local13 * 8, local50, Static44.aClass28_14, local7, local17 * 8, arg1[local74], (local62 & 0x7) * 8, local36, Static254.aClass61Array2);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(III)V")
	public static void method4212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static340.anInt5720 = arg1 - Static36.anInt2243;
		Static212.anInt3671 = arg0 - Static36.anInt2246;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lclient!ha;I)Lclient!nb;")
	public static Class114_Sub3 method4213(@OriginalArg(0) Class6_Sub15 arg0) {
		return new Class114_Sub3(arg0.method3103(), arg0.method3103(), arg0.method3103(), arg0.method3103(), arg0.method3078(), arg0.method3111());
	}
}
