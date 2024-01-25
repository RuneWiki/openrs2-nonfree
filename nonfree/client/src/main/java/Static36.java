import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "Lclient!ld;")
	public static Class140 aClass140_1;

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
	public static int anInt1022;

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "Lclient!uf;")
	public static Class242 aClass242_1;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_17 = new Class119(71, -1);

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
	public static int anInt1021 = -2;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIII)I")
	public static int method724(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg2) {
			return arg2;
		}
		@Pc(13) int local13 = 128 - arg0;
		@Pc(28) int local28 = (arg2 & 0x7F) * local13 + (arg1 & 0x7F) * arg0 >> 7;
		@Pc(42) int local42 = arg0 * (arg1 & 0x380) + (arg2 & 0x380) * local13 >> 7;
		@Pc(57) int local57 = local13 * (arg2 & 0xFC00) + (arg1 & 0xFC00) * arg0 >> 7;
		return local28 & 0x7F | local57 & 0xFC00 | local42 & 0x380;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	public static void method725() {
		for (@Pc(10) int local10 = 0; local10 < 100; local10++) {
			Static55.aBooleanArray8[local10] = true;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IB)Lclient!fi;")
	public static Class77 method726(@OriginalArg(0) int arg0) {
		@Pc(14) Class77[] local14 = Static436.method5723();
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(21) Class77 local21 = local14[local16];
			if (local21.anInt2451 == arg0) {
				return local21;
			}
		}
		return null;
	}
}
