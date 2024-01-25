import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "[J")
	public static final long[] aLongArray7 = new long[100];

	@OriginalMember(owner = "client!bp", name = "q", descriptor = "J")
	public static long aLong204 = 0L;

	@OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
	public static int anInt7167 = 0;

	@OriginalMember(owner = "client!bp", name = "P", descriptor = "[[I")
	public static final int[][] anIntArrayArray59 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIZIIIF)[[I")
	public static int[][] method5465(@OriginalArg(8) float arg0) {
		@Pc(12) int[][] local12 = new int[256][64];
		@Pc(16) Class1_Sub8_Sub37 local16 = new Class1_Sub8_Sub37();
		local16.anInt7549 = 4;
		local16.anInt7539 = 8;
		local16.anInt7538 = (int) (arg0 * 4096.0F);
		local16.anInt7545 = 3;
		local16.aBoolean487 = false;
		local16.method6033();
		Static258.method3817(256, 64);
		for (@Pc(43) int local43 = 0; local43 < 256; local43++) {
			local16.method5759(local12[local43], local43);
		}
		return local12;
	}
}
