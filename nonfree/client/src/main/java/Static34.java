import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "[Lclient!bi;")
	public static Class4_Sub2_Sub1[] aClass4_Sub2_Sub1Array2;

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "Lclient!lc;")
	public static Class98 aClass98_18;

	@OriginalMember(owner = "client!cg", name = "A", descriptor = "Lclient!lc;")
	public static Class98 aClass98_19;

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "[I")
	public static int[] anIntArray70 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
	public static int anInt671 = 0;

	@OriginalMember(owner = "client!cg", name = "N", descriptor = "I")
	public static int anInt678 = 0;

	@OriginalMember(owner = "client!cg", name = "P", descriptor = "I")
	public static int anInt680 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZBIII)V")
	public static void method487(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static222.method3559(arg3)) {
			Static93.method1495(arg2, arg1, Static148.aClass22ArrayArray1[arg3], arg0, -1);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
	public static void method488() {
		aClass4_Sub2_Sub1Array2 = null;
		aClass98_19 = null;
		anIntArray70 = null;
		aClass98_18 = null;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BII)I")
	public static int method490(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg1 >> 31 & arg0 - 1;
		return (arg1 + (arg1 >>> 31)) % arg0 + local17;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method491(@OriginalArg(1) String arg0) {
		@Pc(12) long local12 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local12 *= 37L;
			@Pc(32) char local32 = arg0.charAt(local17);
			if (local32 >= 'A' && local32 <= 'Z') {
				local12 += local32 + 1 - 65;
			} else if (local32 >= 'a' && local32 <= 'z') {
				local12 += local32 - 96;
			} else if (local32 >= '0' && local32 <= '9') {
				local12 += local32 - 21;
			}
			if (local12 >= 177917621779460413L) {
				break;
			}
		}
		while (local12 % 37L == 0L && local12 != 0L) {
			local12 /= 37L;
		}
		return local12;
	}
}
