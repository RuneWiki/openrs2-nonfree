import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static449 {

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "[I")
	public static final int[] anIntArray395 = new int[3];

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
	public static int anInt7237 = -1;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)Z")
	public static boolean method6087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static26.method590(arg0, arg1) | (arg1 & 0x70000) != 0 || Static371.method5293(arg0, arg1);
	}
}
