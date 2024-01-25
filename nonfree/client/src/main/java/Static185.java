import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "Lclient!qi;")
	public static Class201 aClass201_2;

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "[S")
	public static short[] aShortArray25;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
	public static int anInt3131;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_76 = new Class211(16, 8);

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "[[S")
	public static final short[][] aShortArrayArray4 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	public static void method2537() {
		@Pc(8) int local8 = Static228.aByteArrayArray31.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static228.aByteArrayArray31[local10] != null) {
				@Pc(18) int local18 = -1;
				for (@Pc(20) int local20 = 0; local20 < Static348.anInt5919; local20++) {
					if (Static225.anIntArray310[local10] == Static141.anIntArray196[local20]) {
						local18 = local20;
						break;
					}
				}
				if (local18 == -1) {
					Static141.anIntArray196[Static348.anInt5919] = Static225.anIntArray310[local10];
					local18 = Static348.anInt5919++;
				}
				@Pc(63) Class2_Sub13 local63 = new Class2_Sub13(Static228.aByteArrayArray31[local10]);
				@Pc(65) int local65 = 0;
				while (local63.anInt4347 < Static228.aByteArrayArray31[local10].length && local65 < 511 && Static351.anInt5969 < 1023) {
					@Pc(84) int local84 = local18 | local65++ << 6;
					@Pc(88) int local88 = local63.method3555();
					@Pc(92) int local92 = local88 >> 14;
					@Pc(98) int local98 = local88 >> 7 & 0x3F;
					@Pc(102) int local102 = local88 & 0x3F;
					@Pc(115) int local115 = (Static225.anIntArray310[local10] >> 8) * 64 + local98 - Static275.anInt4506;
					@Pc(128) int local128 = (Static225.anIntArray310[local10] & 0xFF) * 64 + local102 - Static209.anInt3497;
					@Pc(135) Class245 local135 = Static155.aClass263_1.method5581(local63.method3555());
					@Pc(142) Class2_Sub28 local142 = (Class2_Sub28) Static49.aClass72_11.method1659((long) local84);
					if (local142 == null && (local135.aByte82 & 0x1) > 0 && local92 == Static280.anInt4592 && local115 >= 0 && local135.anInt6704 + local115 < Static166.anInt2852 && local128 >= 0 && local128 + local135.anInt6704 < Static426.anInt6923) {
						@Pc(187) Class3_Sub4_Sub1_Sub1 local187 = new Class3_Sub4_Sub1_Sub1();
						local187.anInt4915 = local84;
						@Pc(195) Class2_Sub28 local195 = new Class2_Sub28(local187);
						Static49.aClass72_11.method1653(local195, (long) local84);
						Static332.aClass2_Sub28Array1[Static384.anInt6329++] = local195;
						Static40.anIntArray84[Static351.anInt5969++] = local84;
						local187.anInt4942 = Static266.anInt4392;
						local187.method2629(local135);
						local187.method4008(local187.aClass245_1.anInt6704);
						local187.anInt4948 = local187.aClass245_1.anInt6705 << 3;
						local187.method3999(true, (local187.aClass245_1.aByte83 + 4 & 0x3E600007) << 11);
						local187.method2626(local92, local128, local187.method4009(), local115, true);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!tn;II)Lclient!uc;")
	public static Class241 method2538(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class241 local7;
		if (Static455.aClass241_3 == null) {
			local7 = new Class241();
		} else {
			local7 = Static455.aClass241_3;
			Static455.aClass241_3 = Static455.aClass241_3.aClass241_1;
			local7.aClass241_1 = null;
			Static308.anInt5305--;
		}
		local7.aClass3_Sub4_2 = arg0;
		local7.anInt6554 = arg1;
		return local7;
	}
}
