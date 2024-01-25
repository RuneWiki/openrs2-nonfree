import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static448 {

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Lclient!hi;")
	public static Class157 aClass157_1;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
	public static int anInt7755;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "[Lclient!tb;")
	public static Class49[] aClass49Array12;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "[I")
	public static final int[] anIntArray490 = new int[1000];

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZII)I")
	public static int method6917(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static430.anIntArray206[arg1 & 0x3] : Static686.anIntArray698[arg1 & 0x3];
	}
}
