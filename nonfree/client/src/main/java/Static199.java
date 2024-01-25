import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "[J")
	public static long[] aLongArray2;

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
	public static int anInt3913;

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "Lclient!pia;")
	public static Class272 aClass272_7;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "[Lclient!ar;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "[I")
	public static final int[] anIntArray192 = new int[32];

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
	public static int anInt3910 = 0;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	public static void method3520() {
		@Pc(7) int local7 = Static320.anInt5442;
		@Pc(9) int[] local9 = Static278.anIntArray264;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class4_Sub2_Sub1_Sub1_Sub1 local19 = Static393.aClass4_Sub2_Sub1_Sub1_Sub1Array12[local9[local11]];
			if (local19 != null && local19.anInt1253 > 0) {
				local19.anInt1253--;
				if (local19.anInt1253 == 0) {
					local19.aString20 = null;
				}
			}
		}
		for (@Pc(46) int local46 = 0; local46 < Static280.anInt4989; local46++) {
			@Pc(53) long local53 = (long) Static209.anIntArray198[local46];
			@Pc(59) Class5_Sub3 local59 = (Class5_Sub3) Static445.aClass273_29.method6581(local53);
			if (local59 != null) {
				@Pc(64) Class4_Sub2_Sub1_Sub1_Sub2 local64 = local59.aClass4_Sub2_Sub1_Sub1_Sub2_1;
				if (local64.anInt1253 > 0) {
					local64.anInt1253--;
					if (local64.anInt1253 == 0) {
						local64.aString20 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBI)Z")
	public static boolean method3522(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V")
	public static void method3523(@OriginalArg(1) int arg0) {
		@Pc(8) Class5_Sub5_Sub21 local8 = Static101.method1629(8, arg0);
		local8.method8961();
	}
}
