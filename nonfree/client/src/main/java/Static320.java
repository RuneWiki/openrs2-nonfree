import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!q", name = "i", descriptor = "F")
	public static float aFloat78;

	@OriginalMember(owner = "client!q", name = "j", descriptor = "I")
	public static int anInt5295;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "I")
	public static int anInt5290 = 0;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!ic;Lclient!m;I)V")
	public static void method4120(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Interface8 arg1) {
		Static234.anInterface8_7 = arg1;
		Static281.aClass113_86 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)I")
	public static int method4122(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return arg0 & ~local42;
	}
}
