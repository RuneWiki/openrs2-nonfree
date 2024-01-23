import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Lclient!ie;")
	public static Class53 aClass53_3;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "[J")
	public static long[] aLongArray6 = new long[200];

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
	public static int anInt2543 = 0;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
	public static int anInt2544 = 0;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "Z")
	public static boolean aBoolean113 = true;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Lclient!hh;")
	public static Class50 aClass50_892 = Static186.method3527(")3");

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "Lclient!hh;")
	public static Class50 aClass50_893 = Static186.method3527(")4");

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "[I")
	public static int[] anIntArray286 = new int[128];

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "Lclient!hh;")
	public static Class50 aClass50_894 = Static186.method3527("rect_debug=");

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Lclient!qi;")
	public static Class94 method2045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub11 local7 = Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1072; local13++) {
			@Pc(19) Class94 local19 = local7.aClass94Array1[local13];
			if ((local19.aLong143 >> 29 & 0x3L) == 2L && local19.anInt3686 == arg1 && local19.anInt3683 == arg2) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	public static void method2046() {
		Static150.aClass84_25.method2585();
		Static111.aClass84_22.method2585();
		Static199.aClass84_33.method2585();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
	public static void method2047() {
		Static128.aByteArrayArrayArray8 = null;
		Static6.anInt110 = 0;
		Static114.anIntArray256 = null;
		Static109.anIntArrayArrayArray9 = null;
		Static60.aByteArrayArrayArray4 = null;
		Static183.aByteArrayArrayArray11 = null;
		Static182.aByteArrayArrayArray10 = null;
		Static124.aClass93_73 = null;
		Static173.aShortArrayArrayArray1 = null;
		Static172.anIntArrayArrayArray11 = null;
		Static132.aClass1_Sub1_Sub6_1 = null;
		Static26.aByteArrayArrayArray3 = null;
		Static223.aClass75_22.method2243();
		Static225.aClass27_8 = null;
		Static5.aClass27_1 = null;
		Static131.aClass27_4 = null;
		Static131.aClass62_2 = null;
		Static190.aClass27_7 = null;
		Static189.aClass27_6 = null;
		Static43.aClass27_2 = null;
		Static102.aClass27_3 = null;
		Static233.aClass1_Sub1_Sub8_6 = null;
		Static132.aClass27_5 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZZIZ)Lclient!v;")
	public static Class86_Sub1 method2048(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) Class123 local10 = null;
		if (Static85.aClass53_1 != null) {
			local10 = new Class123(arg2, Static85.aClass53_1, Static116.aClass53Array1[arg2], 1000000);
		}
		return new Class86_Sub1(local10, Static52.aClass123_5, arg2, arg1, arg3, arg0);
	}
}
