import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static509 {

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
	public static int anInt8774 = 0;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method7221(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)I")
	public static int method7222(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static532.anIntArray684[arg0 & 0x3] : Static315.anIntArray468[arg0 & 0x3];
	}
}
