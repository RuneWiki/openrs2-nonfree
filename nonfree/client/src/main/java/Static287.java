import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static287 {

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
	public static int anInt5209;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_173 = new Class186(87, -1);

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)V")
	public static void method4003(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static97.anInt2094 = arg1 - Static137.anInt5584;
		Static367.anInt6516 = arg0 - Static137.anInt5581;
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(III)Z")
	public static boolean method4005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}
}
