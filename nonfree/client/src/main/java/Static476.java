import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static476 {

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
	public static int anInt8259;

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
	public static int anInt8265;

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
	public static int anInt8267;

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "[I")
	public static final int[] anIntArray456 = new int[13];

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
	public static int anInt8263 = 0;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)Z")
	public static boolean method7022(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
