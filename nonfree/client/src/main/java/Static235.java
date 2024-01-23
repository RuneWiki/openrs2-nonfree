import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!rb", name = "J", descriptor = "I")
	public static int anInt4408 = 0;

	@OriginalMember(owner = "client!rb", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString155 = "scroll:";

	@OriginalMember(owner = "client!rb", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString156 = "Loaded world list data";

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)Lclient!af;")
	public static Class4_Sub1 method3787(@OriginalArg(0) int arg0) {
		return Static179.aBoolean302 && arg0 >= Static310.anInt5535 && arg0 <= Static103.anInt2199 ? Static314.aClass4_Sub1Array4[arg0 - Static310.anInt5535] : null;
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "(III)Lclient!el;")
	public static Class45 method3788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static254.aClass1_Sub16ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt2573; local13++) {
			@Pc(22) Class45 local22 = local7.aClass45Array2[local13];
			if ((local22.aLong56 >> 29 & 0x3L) == 2L && local22.anInt1360 == arg1 && local22.anInt1359 == arg2) {
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
	public static void method3789() {
		Static24.anInt490 = 0;
		Static124.anInt597 = 0;
		Static261.anInt4835 = 0;
	}

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "(B)V")
	public static void method3791() {
		Static115.aClass175_18.method4294();
		Static97.aClass175_15.method4294();
	}
}
