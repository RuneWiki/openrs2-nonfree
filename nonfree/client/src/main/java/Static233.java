import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!ls", name = "C", descriptor = "Lclient!a;")
	public static Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!ls", name = "N", descriptor = "Lclient!ul;")
	public static Class246 aClass246_38;

	@OriginalMember(owner = "client!ls", name = "O", descriptor = "F")
	public static float aFloat11;

	@OriginalMember(owner = "client!ls", name = "Q", descriptor = "I")
	private static int anInt1395;

	@OriginalMember(owner = "client!ls", name = "R", descriptor = "Z")
	private static boolean aBoolean82;

	@OriginalMember(owner = "client!ls", name = "S", descriptor = "Z")
	private static boolean aBoolean83;

	@OriginalMember(owner = "client!ls", name = "T", descriptor = "Z")
	private static boolean aBoolean84;

	@OriginalMember(owner = "client!ls", name = "J", descriptor = "Lclient!mn;")
	public static final Class162 aClass162_2 = new Class162();

	@OriginalMember(owner = "client!ls", name = "M", descriptor = "Z")
	public static boolean aBoolean81 = false;

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1216(@OriginalArg(1) String arg0) {
		if (!Static355.aBoolean412) {
			return;
		}
		@Pc(12) boolean local12 = false;
		@Pc(14) int local14 = Static155.anInt2952;
		@Pc(16) int[] local16 = Static381.anIntArray619;
		for (@Pc(18) int local18 = 0; local18 < local14; local18++) {
			@Pc(25) Class31_Sub2_Sub1_Sub1 local25 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local16[local18]];
			if (local25 != null && Static452.aClass31_Sub2_Sub1_Sub1_2 != local25 && local25.aString10 != null && local25.aString10.equalsIgnoreCase(arg0)) {
				Static193.method2984(Static94.aClass179_21);
				Static92.aClass1_Sub5_Sub1_1.method5396(0);
				Static92.aClass1_Sub5_Sub1_1.method5359(local16[local18]);
				Static92.aClass1_Sub5_Sub1_1.method5390(Static135.anInt2708);
				Static92.aClass1_Sub5_Sub1_1.method5359(Static92.anInt1948);
				Static92.aClass1_Sub5_Sub1_1.method5388(Static314.anInt5418);
				Static394.method5261(local25.anIntArray657[0], true, local25.method5989(), -2, local25.method5989(), 0, local25.anIntArray658[0], 0);
				local12 = true;
				break;
			}
		}
		if (!local12) {
			Static135.method2324(Static81.aClass7_42.method331(Static341.anInt5770) + arg0);
		}
		if (Static355.aBoolean412) {
			Static61.method1293();
		}
	}

	@OriginalMember(owner = "client!ls", name = "providesignlink", descriptor = "(Lclient!od;)V")
	private static void method1217(@OriginalArg(0) Class180 arg0) {
		Static77.aClass180_1 = arg0;
		Static455.aClass180_5 = arg0;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)Z")
	public static boolean method1220(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(III[B)I")
	public static int method1221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(12) int local12 = arg0; local12 < arg1; local12++) {
			local5 = local5 >>> 8 ^ Class31_Sub1_Sub3.anIntArray300[(local5 ^ arg2[local12]) & 0xFF];
		}
		return ~local5;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IBI)B")
	public static byte method1228(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
