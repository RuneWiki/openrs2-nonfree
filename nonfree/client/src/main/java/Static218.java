import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!iea", name = "x", descriptor = "I")
	public static int anInt3996;

	@OriginalMember(owner = "client!iea", name = "C", descriptor = "Lclient!sea;")
	public static Class308 aClass308_86;

	@OriginalMember(owner = "client!iea", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[5];

	@OriginalMember(owner = "client!iea", name = "j", descriptor = "I")
	public static int anInt3983 = 0;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIILclient!ml;Lclient!ml;)V")
	public static void method3256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub1_Sub5 arg3, @OriginalArg(4) Class11_Sub1_Sub5 arg4) {
		@Pc(4) Class360 local4 = Static570.method7679(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass11_Sub1_Sub5_2 = arg3;
		local4.aClass11_Sub1_Sub5_1 = arg4;
		@Pc(19) int local19 = Static310.aClass129Array5 == Static150.aClass129Array4 ? 1 : 0;
		if (!arg3.method7209()) {
			Static176.aClass11_Sub1ArrayArray1[local19][Static275.anIntArray276[local19]++] = arg3;
		} else if (arg3.method7217()) {
			Static267.aClass11_Sub1ArrayArray2[local19][Static512.anIntArray540[local19]++] = arg3;
		} else {
			Static319.aClass11_Sub1ArrayArray3[local19][Static420.anIntArray440[local19]++] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method7209()) {
			if (arg4.method7217()) {
				Static267.aClass11_Sub1ArrayArray2[local19][Static512.anIntArray540[local19]++] = arg4;
				return;
			}
			Static319.aClass11_Sub1ArrayArray3[local19][Static420.anIntArray440[local19]++] = arg4;
			return;
		}
		Static176.aClass11_Sub1ArrayArray1[local19][Static275.anIntArray276[local19]++] = arg4;
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZIJZLclient!sea;II)V")
	public static void method3258(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(4) Class308 arg2, @OriginalArg(5) int arg3) {
		Static52.method6275(arg2, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIBI)Z")
	public static boolean method3260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static368.aClass34_5.method6216(arg2, arg1, arg0, Static174.anIntArray148);
		@Pc(13) int local13 = Static174.anIntArray148[2];
		if (local13 < 50) {
			return false;
		} else {
			Static174.anIntArray148[1] = Static350.anInt6430 + Static174.anIntArray148[1] * Static489.anInt8325 / local13;
			Static174.anIntArray148[0] = Static467.anInt6044 + Static174.anIntArray148[0] * Static326.anInt4968 / local13;
			Static174.anIntArray148[2] = local13;
			return true;
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static575.method7748(arg0, arg1) | (arg1 & 0x70000) != 0 || Static324.method4819(arg0, arg1);
	}

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "(I)V")
	public static void method3263() {
		Static242.anImage12 = null;
		Static437.aFont2 = null;
	}
}
