import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static557 {

	@OriginalMember(owner = "client!vv", name = "e", descriptor = "I")
	public static int anInt9492;

	@OriginalMember(owner = "client!vv", name = "g", descriptor = "I")
	public static int anInt9494;

	@OriginalMember(owner = "client!vv", name = "f", descriptor = "I")
	public static int anInt9493 = -1;

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "(I)J")
	public static long method7936() {
		return Static360.aClass78_1.method6575();
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(III)I")
	public static int method7937(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static120.anIntArray206[arg0 & 0x3] : 256;
	}
}
