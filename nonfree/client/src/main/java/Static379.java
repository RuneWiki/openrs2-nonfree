import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "Lclient!cm;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
	public static int anInt6616;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)I")
	public static int method5668(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(23) int local23 = (local13 & 0x33333333) + ((local13 & 0xCCCCCCCD) >>> 2);
		@Pc(32) int local32 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(44) int local44 = local38 + (local38 >>> 16);
		return local44 & 0xFF;
	}
}
