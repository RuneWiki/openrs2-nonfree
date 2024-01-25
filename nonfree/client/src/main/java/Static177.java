import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!hca", name = "t", descriptor = "Lclient!kr;")
	public static Class171 aClass171_70;

	@OriginalMember(owner = "client!hca", name = "u", descriptor = "Lclient!ha;")
	public static Class2 aClass2_25;

	@OriginalMember(owner = "client!hca", name = "n", descriptor = "Lclient!paa;")
	public static final Class229 aClass229_10 = new Class229(11, 7);

	@OriginalMember(owner = "client!hca", name = "r", descriptor = "[Lclient!ff;")
	public static final Class1_Sub17[] aClass1_Sub17Array3 = new Class1_Sub17[1024];

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)Lclient!hn;")
	public static Class125 method2903(@OriginalArg(1) int arg0) {
		@Pc(10) Class125 local10 = (Class125) Static250.aClass313_30.method7406((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static290.aClass171_148.method4339(0, arg0);
		local10 = new Class125();
		if (local20 != null) {
			local10.method2928(new Class1_Sub6(local20), arg0);
		}
		Static250.aClass313_30.method7399((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILclient!sa;)V")
	public static void method2905(@OriginalArg(0) int arg0, @OriginalArg(1) Class205 arg1) {
		Static544.aClass205Array3[arg0] = arg1;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)Z")
	public static boolean method2906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(B)Z")
	public static boolean method2907() {
		@Pc(7) Class1 local7 = Static248.aClass37_30.aClass1_47.aClass1_283;
		if (local7 == null || Static248.aClass37_30.aClass1_47 == local7) {
			return false;
		}
		@Pc(23) Class1_Sub24 local23 = (Class1_Sub24) local7;
		if (local23.anInt3161 >= 2000) {
			local23.anInt3161 -= 2000;
		}
		return local23.anInt3161 == 1009;
	}

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "(B)V")
	public static void method2911() {
		for (@Pc(8) int local8 = 0; local8 < Static530.aByteArrayArrayArray17.length; local8++) {
			for (@Pc(12) int local12 = 0; local12 < Static530.aByteArrayArrayArray17[0].length; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static530.aByteArrayArrayArray17[0][0].length; local16++) {
					Static530.aByteArrayArrayArray17[local8][local12][local16] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIIII)V")
	public static void method2912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static118.anInt816 / (float) Static118.anInt818;
		@Pc(11) int local11 = arg0;
		@Pc(13) int local13 = arg2;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg0);
		} else {
			local11 = (int) ((float) arg2 / local9);
		}
		@Pc(40) int local40 = arg3 - (arg2 - local13) / 2;
		@Pc(49) int local49 = arg1 - (arg0 - local11) / 2;
		Static214.anInt2191 = Static118.anInt816 - local40 * Static118.anInt816 / local13;
		Static340.anInt6093 = -1;
		Static351.anInt6257 = -1;
		Static103.anInt2070 = local49 * Static118.anInt818 / local11;
		Static64.method1152();
	}
}
