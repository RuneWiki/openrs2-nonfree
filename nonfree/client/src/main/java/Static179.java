import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!lm", name = "M", descriptor = "[[B")
	public static byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!lm", name = "Q", descriptor = "Lclient!dp;")
	public static Class53 aClass53_93;

	@OriginalMember(owner = "client!lm", name = "R", descriptor = "I")
	public static int anInt3361;

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
	public static void method3442() {
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < Static153.anInt2883; local23++) {
			for (@Pc(27) int local27 = 0; local27 < Static246.anInt4606; local27++) {
				if (Static329.method5490(local23, local27, Static39.aClass187ArrayArrayArray1, true, local21)) {
					local21++;
				}
				if (local21 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)V")
	public static void method3444() {
		@Pc(1) Class70 local1 = Static184.aClass70_62;
		synchronized (Static184.aClass70_62) {
			Static184.aClass70_62.method1397(5);
		}
		local1 = Static80.aClass70_97;
		synchronized (Static80.aClass70_97) {
			Static80.aClass70_97.method1397(5);
		}
		local1 = Static206.aClass70_66;
		synchronized (Static206.aClass70_66) {
			Static206.aClass70_66.method1397(5);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method3448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static311.anInt5837 <= arg1 && Static265.anInt4933 >= arg1 && Static311.anInt5837 <= arg8 && Static265.anInt4933 >= arg8 && arg4 >= Static311.anInt5837 && Static265.anInt4933 >= arg4 && Static311.anInt5837 <= arg3 && Static265.anInt4933 >= arg3 && Static327.anInt3039 <= arg6 && Static230.anInt4308 >= arg6 && Static327.anInt3039 <= arg0 && Static230.anInt4308 >= arg0 && Static327.anInt3039 <= arg7 && Static230.anInt4308 >= arg7 && arg5 >= Static327.anInt3039 && arg5 <= Static230.anInt4308) {
			Static318.method5320(arg2, arg5, arg3, arg4, arg1, arg8, arg7, arg6, arg0);
		} else {
			Static46.method772(arg6, arg5, arg4, arg0, arg8, arg1, arg7, arg3, arg2);
		}
	}
}
