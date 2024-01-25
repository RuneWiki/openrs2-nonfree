import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!jr", name = "D", descriptor = "I")
	public static int anInt5374;

	@OriginalMember(owner = "client!jr", name = "H", descriptor = "I")
	public static int anInt5376;

	@OriginalMember(owner = "client!jr", name = "A", descriptor = "[I")
	public static final int[] anIntArray296 = new int[5];

	@OriginalMember(owner = "client!jr", name = "F", descriptor = "Lclient!sga;")
	public static final Class306 aClass306_2 = new Class306();

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method4561(@OriginalArg(0) String arg0) {
		return Static459.method6814(arg0);
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(II)I")
	public static int method4562(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)Lclient!uda;")
	public static Class9_Sub2_Sub4 method4563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class351 local7 = Static567.aClass351ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null || local7.aClass9_Sub2_Sub4_1 == null ? null : local7.aClass9_Sub2_Sub4_1;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZI)I")
	public static int method4565(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(30) int local30 = (local13 & 0x33333333) + (local13 >>> 2 & 0xF3333333);
		@Pc(38) int local38 = (local30 >>> 4) + local30 & 0xF0F0F0F;
		@Pc(44) int local44 = local38 + (local38 >>> 8);
		@Pc(50) int local50 = local44 + (local44 >>> 16);
		return local50 & 0xFF;
	}
}
