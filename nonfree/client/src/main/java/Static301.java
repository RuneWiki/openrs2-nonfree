import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "[Lclient!gh;")
	public static Class73[] aClass73Array31;

	@OriginalMember(owner = "client!tf", name = "w", descriptor = "I")
	public static int anInt5009;

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "Lclient!lg;")
	public static Class119 aClass119_156 = new Class119(64);

	@OriginalMember(owner = "client!tf", name = "y", descriptor = "Z")
	public static boolean aBoolean460 = false;

	@OriginalMember(owner = "client!tf", name = "A", descriptor = "[I")
	public static final int[] anIntArray382 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
	public static int anInt5012 = -1;

	@OriginalMember(owner = "client!tf", name = "E", descriptor = "[I")
	public static final int[] anIntArray383 = new int[14];

	@OriginalMember(owner = "client!tf", name = "F", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
	public static int anInt5016 = 0;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)I")
	public static int method4605(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)I")
	public static int method4607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg0 - 1 & arg1 >> 31;
		return ((arg1 >>> 31) + arg1) % arg0 + local11;
	}
}
