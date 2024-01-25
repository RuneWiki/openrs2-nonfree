import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static617 {

	@OriginalMember(owner = "client!v", name = "b", descriptor = "Lclient!wia;")
	public static Class386 aClass386_128;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III)I")
	public static int method8661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static8.anIntArray8[arg1 & 0x3] : Static157.anIntArray253[arg1 & 0x3];
	}
}
