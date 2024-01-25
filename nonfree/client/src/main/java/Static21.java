import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!at", name = "J", descriptor = "Lclient!rc;")
	public static Class279 aClass279_4;

	@OriginalMember(owner = "client!at", name = "I", descriptor = "Lclient!ki;")
	public static final Class190 aClass190_1 = new Class190();

	@OriginalMember(owner = "client!at", name = "K", descriptor = "[Lclient!wa;")
	public static final Class2_Sub3_Sub19[] aClass2_Sub3_Sub19Array1 = new Class2_Sub3_Sub19[14];

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;BLjava/lang/String;)V")
	public static void method417(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) String arg6, @OriginalArg(8) String arg7) {
		@Pc(14) Class295 local14 = Static192.aClass295Array2[99];
		for (@Pc(16) int local16 = 99; local16 > 0; local16--) {
			Static192.aClass295Array2[local16] = Static192.aClass295Array2[local16 - 1];
		}
		if (local14 == null) {
			local14 = new Class295(arg2, arg3, arg7, arg5, arg0, arg6, arg4, arg1);
		} else {
			local14.method6773(arg6, arg1, arg7, arg5, arg2, arg3, arg4, arg0);
		}
		Static411.anInt7120++;
		Static9.anInt415 = Static500.anInt8403;
		Static192.aClass295Array2[0] = local14;
	}

	@OriginalMember(owner = "client!at", name = "f", descriptor = "(B)V")
	public static void method419() {
		Static312.aClass100_7.ra(Static97.aFloat54 * ((float) Static72.aClass2_Sub12_Sub1_1.anInt1929 * 0.1F + 0.7F));
		Static312.aClass100_7.VA(Static293.anInt5314, Static289.aFloat145, Static45.aFloat24, (float) (Static42.anInt1024 << 2), (float) (Static204.anInt3988 << 2), (float) (Static211.anInt8112 << 2));
		Static312.aClass100_7.method6252(Static101.aClass37_2);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IB)Z")
	public static boolean method420(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIILclient!dfa;)V")
	public static void method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6_Sub1_Sub2 arg3) {
		@Pc(4) Class346 local4 = Static308.method4598(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass6_Sub1_Sub2_1 = arg3;
		@Pc(16) int local16 = Static421.aClass67Array7 == Static592.aClass67Array4 ? 1 : 0;
		if (arg3.method7329()) {
			if (arg3.method7318()) {
				Static312.aClass6_Sub1ArrayArray3[local16][Static142.anIntArray179[local16]++] = arg3;
				return;
			}
			Static3.aClass6_Sub1ArrayArray1[local16][Static26.anIntArray39[local16]++] = arg3;
			return;
		}
		Static54.aClass6_Sub1ArrayArray2[local16][Static53.anIntArray64[local16]++] = arg3;
	}
}
