import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "[I")
	public static final int[] anIntArray549 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
	public static int anInt6972 = 0;

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString68 = "";

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)I")
	public static int method5666(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(24) int local24 = (local10 >>> 2 & 0x33333333) + (local10 & 0x33333333);
		@Pc(37) int local37 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(43) int local43 = local37 + (local37 >>> 8);
		@Pc(49) int local49 = local43 + (local43 >>> 16);
		return local49 & 0xFF;
	}
}
