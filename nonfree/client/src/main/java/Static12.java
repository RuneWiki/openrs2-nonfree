import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ag", name = "I", descriptor = "Z")
	public static boolean aBoolean81 = true;

	@OriginalMember(owner = "client!ag", name = "L", descriptor = "[I")
	public static final int[] anIntArray12 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!ag", name = "O", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[200];

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIBII)V")
	public static void method738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class4_Sub6_Sub5 local13 = Static396.method6079(arg0, 10);
		local13.method2303();
		local13.anInt2871 = arg3;
		local13.anInt2872 = arg1;
		local13.anInt2865 = arg2;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)I")
	public static int method740(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZI)V")
	public static void method741(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class4_Sub6_Sub5 local15 = Static396.method6079(arg0, 16);
		local15.method2303();
		local15.anInt2865 = arg1;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)I")
	public static int method742(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static313.method4937(arg0);
	}
}
