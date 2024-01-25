import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static313 {

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
	public static int anInt5847 = 0;

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "[I")
	public static final int[] anIntArray547 = new int[50];

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)Z")
	public static boolean method4479(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)Z")
	public static boolean method4480() {
		return Static314.aClass248_7 != Static59.aClass248_1 || Static41.anInt1052 >= 2;
	}
}
