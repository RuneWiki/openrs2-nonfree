import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!na", name = "C", descriptor = "[I")
	public static int[] anIntArray296;

	@OriginalMember(owner = "client!na", name = "G", descriptor = "I")
	public static int anInt3532;

	@OriginalMember(owner = "client!na", name = "I", descriptor = "I")
	public static int anInt3534;

	@OriginalMember(owner = "client!na", name = "Q", descriptor = "[S")
	public static short[] aShortArray68;

	@OriginalMember(owner = "client!na", name = "S", descriptor = "Lclient!cg;")
	public static Class22 aClass22_62;

	@OriginalMember(owner = "client!na", name = "J", descriptor = "I")
	public static int anInt3535 = 0;

	@OriginalMember(owner = "client!na", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString124 = "Loading - please wait.";

	@OriginalMember(owner = "client!na", name = "O", descriptor = "I")
	public static int anInt3538 = 0;

	@OriginalMember(owner = "client!na", name = "T", descriptor = "I")
	public static int anInt3541 = 0;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2879(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = arg0.length();
		@Pc(11) char[] local11 = new char[local4];
		@Pc(13) byte local13 = 2;
		for (@Pc(21) int local21 = 0; local21 < local4; local21++) {
			@Pc(28) char local28 = arg0.charAt(local21);
			if (local13 == 0) {
				local28 = Character.toLowerCase(local28);
			} else if (local13 == 2 || Character.isUpperCase(local28)) {
				local28 = Static94.method1562(local28);
			}
			if (Character.isLetter(local28)) {
				local13 = 0;
			} else if (local28 == '.' || local28 == '?' || local28 == '!') {
				local13 = 2;
			} else if (!Character.isSpaceChar(local28)) {
				local13 = 1;
			} else if (local13 != 2) {
				local13 = 1;
			}
			local11[local21] = local28;
		}
		return new String(local11);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!qe;I)V")
	public static void method2881(@OriginalArg(0) Class13_Sub5_Sub1 arg0) {
		@Pc(8) Class4_Sub26 local8 = (Class4_Sub26) Static5.aClass163_1.method4188(Static193.method3171(arg0.aString148));
		if (local8 == null) {
			return;
		}
		if (local8.aClass4_Sub6_Sub1_3 != null) {
			Static10.aClass4_Sub6_Sub4_1.method3730(local8.aClass4_Sub6_Sub1_3);
			local8.aClass4_Sub6_Sub1_3 = null;
		}
		local8.method4690();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!pi;)V")
	public static void method2883(@OriginalArg(1) Class4_Sub24 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static169.anInt3386; local7++) {
			@Pc(14) int local14 = arg0.method3060();
			@Pc(18) int local18 = arg0.method3085();
			if (local18 == 65535) {
				local18 = -1;
			}
			if (Static69.aClass64_Sub1Array1[local14] != null) {
				Static69.aClass64_Sub1Array1[local14].anInt4587 = local18;
			}
		}
	}
}
