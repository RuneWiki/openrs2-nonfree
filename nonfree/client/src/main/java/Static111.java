import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ke", name = "fb", descriptor = "I")
	public static int anInt2473;

	@OriginalMember(owner = "client!ke", name = "bb", descriptor = "S")
	public static short aShort25 = 32767;

	@OriginalMember(owner = "client!ke", name = "eb", descriptor = "I")
	public static int anInt2472 = 0;

	@OriginalMember(owner = "client!ke", name = "hb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_667 = Static231.method3737("Spieler");

	@OriginalMember(owner = "client!ke", name = "ib", descriptor = "Lclient!sc;")
	public static Class107 aClass107_668 = Static231.method3737("gelb:");

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)V")
	public static void method1944() {
		Static23.aByteArrayArrayArray2 = null;
		Static114.anIntArray233 = null;
		Static129.aByteArrayArrayArray9 = null;
		Static38.anIntArray83 = null;
		Static203.anIntArray10 = null;
		Static213.aByteArrayArrayArray13 = null;
		Static141.anIntArray265 = null;
		Static16.anIntArray37 = null;
		Static13.anIntArrayArrayArray1 = null;
		Static140.aByteArrayArrayArray4 = null;
		Static88.aByteArrayArrayArray8 = null;
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(B)V")
	public static void method1945() {
		Static96.aClass50_14.method1360();
		Static171.aClass85_5.method2427();
		Static100.aClass85_3.method2427();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!rh;Lclient!rh;)V")
	public static void method1946(@OriginalArg(1) Class1_Sub2 arg0, @OriginalArg(2) Class1_Sub2 arg1) {
		if (arg1.aClass1_Sub2_53 != null) {
			arg1.method3682();
		}
		arg1.aClass1_Sub2_52 = arg0.aClass1_Sub2_52;
		arg1.aClass1_Sub2_53 = arg0;
		arg1.aClass1_Sub2_53.aClass1_Sub2_52 = arg1;
		arg1.aClass1_Sub2_52.aClass1_Sub2_53 = arg1;
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(III)J")
	public static long method1949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub9 local7 = Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1416; local13++) {
			@Pc(19) Class99 local19 = local7.aClass99Array2[local13];
			if ((local19.aLong140 >> 29 & 0x3L) == 2L && local19.anInt3819 == arg1 && local19.anInt3808 == arg2) {
				return local19.aLong140;
			}
		}
		return 0L;
	}
}
