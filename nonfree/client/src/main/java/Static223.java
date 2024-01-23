import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "Lclient!re;")
	public static Class130 aClass130_1;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
	public static int anInt4439;

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
	public static int anInt4427 = 0;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "[I")
	public static int[] anIntArray395 = new int[14];

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
	public static Object method3566(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static68.aBoolean94) {
			try {
				@Pc(27) Class20 local27 = (Class20) Class.forName("Class20_Sub1").getDeclaredConstructor().newInstance();
				local27.method445(arg0);
				return local27;
			} catch (@Pc(34) Throwable local34) {
				Static68.aBoolean94 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	public static void method3567() {
		aClass130_1 = null;
		anIntArray395 = null;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(III)I")
	public static int method3572(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(29) int local29 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local29;
		}
		return arg0;
	}
}
