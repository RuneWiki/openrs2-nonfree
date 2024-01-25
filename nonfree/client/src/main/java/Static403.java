import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!qk", name = "hb", descriptor = "I")
	public static int anInt7574 = 0;

	@OriginalMember(owner = "client!qk", name = "kb", descriptor = "J")
	public static long aLong193 = -1L;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)Z")
	public static boolean method6321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)V")
	public static void method6323() {
		Static30.aClass89_2.method6696();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static488.aLongArray20[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static63.aLongArray18[local24] = 0L;
		}
		Static306.anInt5967 = 0;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(III)I")
	public static int method6324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg0 - 1 & arg1 >> 31;
		return ((arg1 >>> 31) + arg1) % arg0 + local16;
	}
}
