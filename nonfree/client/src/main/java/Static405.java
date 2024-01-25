import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_347 = new Class12(100, 3);

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "Lclient!tn;")
	public static Class229 aClass229_12 = null;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
	public static void method5502() {
		if (Static48.anInt770 == 2) {
			Static188.anInt3481 = 96;
			return;
		}
		try {
			@Pc(25) Method local25 = Runtime.class.getMethod("maxMemory");
			if (local25 != null) {
				try {
					@Pc(29) Runtime local29 = Runtime.getRuntime();
					@Pc(35) Long local35 = (Long) local25.invoke(local29, (Object[]) null);
					Static188.anInt3481 = (int) (local35 / 1048576L) + 1;
				} catch (@Pc(45) Throwable local45) {
				}
			}
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)V")
	public static void method5509() {
		Static50.aClass142_9 = new Class142();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIII)I")
	public static int method5510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static256.aClass70Array2 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg1 >> 7;
		@Pc(15) int local15 = arg0 >> 7;
		if (local11 < 0 || local15 < 0 || Static80.anInt6558 - 1 < local11 || local15 > Static104.anInt2048 - 1) {
			return 0;
		}
		@Pc(52) int local52 = arg2;
		if (arg2 < 3 && (Static228.aByteArrayArrayArray8[1][local11][local15] & 0x2) != 0) {
			local52 = arg2 + 1;
		}
		return Static256.aClass70Array2[local52].va(arg1, arg0);
	}
}
