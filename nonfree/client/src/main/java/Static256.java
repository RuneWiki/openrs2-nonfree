import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "Lclient!pv;")
	public static Class78 aClass78_3;

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "I")
	public static int anInt4583 = 765;

	@OriginalMember(owner = "client!mr", name = "r", descriptor = "[I")
	public static final int[] anIntArray370 = new int[2048];

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B[[BLclient!mi;)V")
	public static void method3766(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class155_Sub1 arg1) {
		@Pc(17) int[] local17 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20 = arg0.length;
		@Pc(41) int local41;
		for (@Pc(22) int local22 = 0; local22 < local20; local22++) {
			@Pc(28) byte[] local28 = arg0[local22];
			if (local28 != null) {
				@Pc(35) Class1_Sub1 local35 = new Class1_Sub1(local28);
				local41 = Static157.anIntArray255[local22] >> 8;
				@Pc(47) int local47 = Static157.anIntArray255[local22] & 0xFF;
				@Pc(53) int local53 = local41 * 64 - Static437.anInt7555;
				@Pc(59) int local59 = local47 * 64 - Static134.anInt5502;
				Static81.method1403();
				arg1.method3650(local59, Static437.anInt7555, local35, Static170.aClass112Array1, Static134.anInt5502, local53);
				arg1.method3662(local17, local53, local59, Static276.aClass109_10, local35);
				if (!arg1.aBoolean304 && local41 == Static13.anInt330 / 8 && local47 == Static138.anInt2346 / 8 && local17[0] != -1) {
					Static58.aClass154_1 = Static141.aClass168_1.method3938(Static199.aClass134_1, local17[1], local17[2], local17[3], local17[0]);
					Static263.anInt4705 = local17[4];
				}
			}
		}
		for (@Pc(126) int local126 = 0; local126 < local20; local126++) {
			@Pc(138) int local138 = (Static157.anIntArray255[local126] >> 8) * 64 - Static437.anInt7555;
			local41 = (Static157.anIntArray255[local126] & 0xFF) * 64 - Static134.anInt5502;
			@Pc(152) byte[] local152 = arg0[local126];
			if (local152 == null && Static138.anInt2346 < 800) {
				Static81.method1403();
				arg1.method3653(local41, local138);
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIZ)V")
	public static void method3767(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class1_Sub45 local10 = Static193.method906(arg1, arg0);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray680.length; local15++) {
				local10.anIntArray680[local15] = -1;
				local10.anIntArray681[local15] = 0;
			}
		}
	}
}
