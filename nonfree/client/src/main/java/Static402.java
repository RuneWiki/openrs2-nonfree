import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static402 {

	@OriginalMember(owner = "client!nr", name = "k", descriptor = "Lclient!el;")
	public static final Class109 aClass109_149 = new Class109(47, 11);

	@OriginalMember(owner = "client!nr", name = "l", descriptor = "Z")
	public static boolean aBoolean531 = false;

	@OriginalMember(owner = "client!nr", name = "n", descriptor = "Lclient!el;")
	public static final Class109 aClass109_150 = new Class109(134, -2);

	@OriginalMember(owner = "client!nr", name = "o", descriptor = "Lclient!eu;")
	public static final Class114 aClass114_14 = new Class114(1);

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)J")
	public static long method5908() {
		return Static451.aClass67_1.method5453();
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BII)Z")
	public static boolean method5909(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x18) != 0 | (arg1 & 0x220) == 544;
	}
}
