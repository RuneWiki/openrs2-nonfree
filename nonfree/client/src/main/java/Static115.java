import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static115 {

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
	public static int anInt2987;

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Lclient!ef;")
	public static final Class80 aClass80_1 = new Class80();

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
	public static int anInt2983 = -1;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)[Lclient!afa;")
	public static Class12[] method2521() {
		return new Class12[] { Static6.aClass12_2, Static3.aClass12_1, Static432.aClass12_4 };
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)Z")
	public static boolean method2524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}
