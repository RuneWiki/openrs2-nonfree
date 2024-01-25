import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static508 {

	@OriginalMember(owner = "client!raa", name = "N", descriptor = "I")
	public static int anInt8006;

	@OriginalMember(owner = "client!raa", name = "M", descriptor = "Lclient!tq;")
	public static final Class343 aClass343_12 = new Class343("", 14);

	@OriginalMember(owner = "client!raa", name = "O", descriptor = "Z")
	public static final boolean aBoolean558 = false;

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IIII)I")
	public static int method6633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static315.aByteArrayArrayArray13[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static315.aByteArrayArrayArray13[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}
}
