import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "[Lclient!gd;")
	public static Class6_Sub3[] aClass6_Sub3Array1 = new Class6_Sub3[4];

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
	public static int anInt4610 = -1;

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
	public static int anInt4611 = 0;

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString148 = " ";

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "[Lclient!ec;")
	public static Class44[] aClass44Array1 = new Class44[50];

	@OriginalMember(owner = "client!qn", name = "j", descriptor = "[I")
	public static int[] anIntArray522 = new int[500];

	@OriginalMember(owner = "client!qn", name = "m", descriptor = "J")
	public static long aLong143 = 0L;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BZLjava/lang/String;)V")
	public static void method3522(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) short[] local10 = new short[16];
		@Pc(13) String local13 = arg1.toLowerCase();
		for (@Pc(15) int local15 = 0; local15 < Static54.anInt1155; local15++) {
			@Pc(22) Class120 local22 = Static183.method4458(local15);
			if ((!arg0 || local22.aBoolean245) && local22.anInt3302 == -1 && local22.anInt3314 == -1 && local22.anInt3271 == 0 && local22.aString113.toLowerCase().indexOf(local13) != -1) {
				if (local7 >= 250) {
					Static292.anInt5805 = -1;
					Static189.aShortArray83 = null;
					return;
				}
				if (local7 >= local10.length) {
					@Pc(79) short[] local79 = new short[local10.length * 2];
					for (@Pc(81) int local81 = 0; local81 < local7; local81++) {
						local79[local81] = local10[local81];
					}
					local10 = local79;
				}
				local10[local7++] = (short) local15;
			}
		}
		Static116.anInt2204 = 0;
		Static189.aShortArray83 = local10;
		Static292.anInt5805 = local7;
		@Pc(123) String[] local123 = new String[Static292.anInt5805];
		for (@Pc(125) int local125 = 0; local125 < Static292.anInt5805; local125++) {
			local123[local125] = Static183.method4458(local10[local125]).aString113;
		}
		Static297.method4542(local123, Static189.aShortArray83);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
	public static void method3523() {
		Static133.aClass31_21.method856(5);
	}
}
