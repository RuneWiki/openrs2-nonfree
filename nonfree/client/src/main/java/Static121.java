import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!md", name = "x", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1;

	@OriginalMember(owner = "client!md", name = "A", descriptor = "Lclient!s;")
	public static Class87 aClass87_18 = new Class87();

	@OriginalMember(owner = "client!md", name = "F", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_793 = Static81.method1507("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!md", name = "M", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_795 = Static81.method1507("wishes to trade with you)3");

	@OriginalMember(owner = "client!md", name = "I", descriptor = "Lclient!dj;")
	public static Class24 aClass24_794 = aClass24_795;

	@OriginalMember(owner = "client!md", name = "K", descriptor = "I")
	public static int anInt2692 = -1;

	@OriginalMember(owner = "client!md", name = "L", descriptor = "I")
	public static int anInt2693 = 0;

	@OriginalMember(owner = "client!md", name = "N", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_796 = Static81.method1507("Members only world");

	@OriginalMember(owner = "client!md", name = "O", descriptor = "Lclient!dj;")
	public static Class24 aClass24_797 = aClass24_796;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)V")
	public static void method2047(@OriginalArg(1) boolean arg0) {
		if (Static174.anInt3879 == Static87.aClass5_Sub2_Sub1_1.anInt2501 >> 7 && Static35.anInt4154 == Static87.aClass5_Sub2_Sub1_1.anInt2448 >> 7) {
			Static174.anInt3879 = 0;
		}
		@Pc(29) int local29 = Static82.anInt1956;
		if (arg0) {
			local29 = 1;
		}
		for (@Pc(35) int local35 = 0; local35 < local29; local35++) {
			@Pc(52) Class5_Sub2_Sub1 local52;
			@Pc(46) long local46;
			if (arg0) {
				local52 = Static87.aClass5_Sub2_Sub1_1;
				local46 = 8791798054912L;
			} else {
				local46 = (long) Static41.anIntArray115[local35] << 32;
				local52 = Static110.aClass5_Sub2_Sub1Array1[Static41.anIntArray115[local35]];
			}
			if (local52 != null && local52.method1894()) {
				local52.aBoolean25 = false;
				@Pc(72) int local72 = local52.anInt2501 >> 7;
				@Pc(77) int local77 = local52.anInt2448 >> 7;
				if ((Static30.aBoolean35 && Static82.anInt1956 > 50 || Static82.anInt1956 > 200) && !arg0 && local52.anInt2504 == local52.anInt2449) {
					local52.aBoolean25 = true;
				}
				if (local72 >= 0 && local72 < 104 && local77 >= 0 && local77 < 104) {
					if (local52.aClass5_Sub1_1 == null || local52.anInt621 > Static42.anInt1100 || local52.anInt628 <= Static42.anInt1100) {
						if ((local52.anInt2501 & 0x7F) == 64 && (local52.anInt2448 & 0x7F) == 64) {
							if (Static39.anInt1032 == Static53.anIntArrayArray10[local72][local77]) {
								continue;
							}
							Static53.anIntArrayArray10[local72][local77] = Static39.anInt1032;
						}
						local52.anInt2459 = Static37.method699(local52.anInt2448, Static170.anInt3799, local52.anInt2501);
						Static160.method3564(Static170.anInt3799, local52.anInt2501, local52.anInt2448, local52.anInt2459, 60, local52, local52.anInt2474, local46, local52.aBoolean116);
					} else {
						local52.aBoolean25 = false;
						local52.anInt2459 = Static37.method699(local52.anInt2448, Static170.anInt3799, local52.anInt2501);
						Static99.method1720(Static170.anInt3799, local52.anInt2501, local52.anInt2448, local52.anInt2459, local52, local52.anInt2474, local46, local52.anInt613, local52.anInt618, local52.anInt625, local52.anInt616);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(JIII)Z")
	public static boolean method2051(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = (int) arg0 >> 20 & 0x3;
		@Pc(27) int local27 = (int) arg0 >> 14 & 0x1F;
		@Pc(34) int local34 = Integer.MAX_VALUE & (int) (arg0 >>> 32);
		if (local27 == 10 || local27 == 11 || local27 == 22) {
			@Pc(51) Class1_Sub2_Sub5 local51 = Static37.method702(local34);
			@Pc(62) int local62;
			@Pc(59) int local59;
			if (local20 == 0 || local20 == 2) {
				local62 = local51.anInt976;
				local59 = local51.anInt958;
			} else {
				local59 = local51.anInt976;
				local62 = local51.anInt958;
			}
			@Pc(73) int local73 = local51.anInt955;
			if (local20 != 0) {
				local73 = (local73 << local20 & 0xF) + (local73 >> 4 - local20);
			}
			Static115.method1988(local73, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], true, arg2, arg1, 0, local62, local59);
		} else {
			Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 2, local27 + 1, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], true, arg2, arg1, local20, 0, 0);
		}
		Static178.anInt3964 = 0;
		Static1.anInt63 = 2;
		Static79.anInt1889 = Static92.anInt2141;
		Static192.anInt4305 = Static157.anInt3462;
		return true;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)I")
	public static int method2052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 65536 - Class1_Sub2_Sub8_Sub4.anIntArray355[arg2 * 1024 / arg3] >> 1;
		return (arg0 * (65536 - local15) >> 16) + (local15 * arg1 >> 16);
	}
}
