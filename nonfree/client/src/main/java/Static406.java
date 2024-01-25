import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "Lclient!eba;")
	public static Class73 aClass73_4;

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
	public static int anInt7520;

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
	public static int anInt7522 = 0;

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
	public static int anInt7525 = 0;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)I")
	public static int method6499(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0xD5555555) + (arg0 & 0x55555555);
		@Pc(23) int local23 = (local13 >>> 2 & 0x33333333) + (local13 & 0x33333333);
		@Pc(36) int local36 = (local23 >>> 4) + local23 & 0xF0F0F0F;
		@Pc(42) int local42 = local36 + (local36 >>> 8);
		@Pc(48) int local48 = local42 + (local42 >>> 16);
		return local48 & 0xFF;
	}
}
