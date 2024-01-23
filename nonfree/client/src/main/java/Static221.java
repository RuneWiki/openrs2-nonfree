import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!r", name = "r", descriptor = "I")
	public static int anInt4539;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString160 = "glow3:";

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
	public static void method3444() {
		try {
			@Pc(20) Method local20 = Runtime.class.getMethod("maxMemory");
			if (local20 != null) {
				try {
					@Pc(26) Runtime local26 = Runtime.getRuntime();
					@Pc(33) Long local33 = (Long) local20.invoke(local26, (Object[]) null);
					Static16.anInt3524 = (int) (local33 / 1048576L) + 1;
				} catch (@Pc(43) Throwable local43) {
				}
			}
		} catch (@Pc(45) Exception local45) {
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)V")
	public static void method3445() {
		Static4.aClass61_1.method1381(5);
		Static260.aClass61_49.method1381(5);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIBIIIIIII)V")
	public static void method3454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg4 && arg2 == arg3 && arg1 == arg6 && arg5 == arg7) {
			Static197.method3038(arg0, arg2, arg7, arg1, arg8);
			return;
		}
		@Pc(44) int local44 = arg8;
		@Pc(48) int local48 = arg8 * 3;
		@Pc(52) int local52 = arg2 * 3;
		@Pc(56) int local56 = arg4 * 3;
		@Pc(58) int local58 = arg2;
		@Pc(62) int local62 = arg5 * 3;
		@Pc(66) int local66 = arg6 * 3;
		@Pc(70) int local70 = arg3 * 3;
		@Pc(81) int local81 = arg7 + local70 - arg2 - local62;
		@Pc(90) int local90 = arg1 + local56 - local66 - arg8;
		@Pc(99) int local99 = local48 + local66 - local56 - local56;
		@Pc(104) int local104 = local70 - local52;
		@Pc(109) int local109 = local56 - local48;
		@Pc(119) int local119 = local52 + local62 - local70 - local70;
		for (@Pc(121) int local121 = 128; local121 <= 4096; local121 += 128) {
			@Pc(130) int local130 = local121 * local121 >> 12;
			@Pc(136) int local136 = local130 * local121 >> 12;
			@Pc(140) int local140 = local136 * local81;
			@Pc(144) int local144 = local90 * local136;
			@Pc(148) int local148 = local130 * local99;
			@Pc(152) int local152 = local130 * local119;
			@Pc(156) int local156 = local121 * local109;
			@Pc(167) int local167 = arg8 + (local148 + local144 + local156 >> 12);
			@Pc(171) int local171 = local104 * local121;
			@Pc(181) int local181 = (local171 + local152 + local140 >> 12) + arg2;
			Static197.method3038(arg0, local58, local181, local167, local44);
			local58 = local181;
			local44 = local167;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method3455(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(25) int local25 = 0; local25 < Static30.anInt728; local25++) {
			if (arg0.equalsIgnoreCase(Static48.aStringArray17[local25])) {
				return true;
			}
		}
		return false;
	}
}
