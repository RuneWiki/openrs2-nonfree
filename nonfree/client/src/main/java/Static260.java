import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "I")
	public static int anInt5718;

	@OriginalMember(owner = "client!jga", name = "d", descriptor = "Lclient!kha;")
	public static Class181 aClass181_56;

	@OriginalMember(owner = "client!jga", name = "f", descriptor = "I")
	public static int anInt5721;

	@OriginalMember(owner = "client!jga", name = "e", descriptor = "[I")
	public static final int[] anIntArray330 = new int[5];

	@OriginalMember(owner = "client!jga", name = "r", descriptor = "Lclient!us;")
	public static final Class344 aClass344_64 = new Class344(74, 3);

	@OriginalMember(owner = "client!jga", name = "x", descriptor = "J")
	public static final long aLong134 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(BLclient!tn;)V")
	public static void method4854(@OriginalArg(1) Class3_Sub15 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static72.anInt1911; local7++) {
			@Pc(13) int local13 = arg0.method8465();
			@Pc(17) int local17 = arg0.method8414();
			if (local17 == 65535) {
				local17 = -1;
			}
			if (Static539.aClass153_Sub1Array2[local13] != null) {
				Static539.aClass153_Sub1Array2[local13].anInt5574 = local17;
			}
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)V")
	public static void method4859() {
		Static171.aClass5_23 = null;
		Static24.aClass5_1 = null;
		Static333.aClass5_27 = null;
		Static548.aClass5_37 = null;
		Static603.aClass5Array20 = null;
		Static185.aClass5_24 = null;
		Static644.aClass5_39 = null;
		Static166.aClass5_22 = null;
		Static462.aClass5_34 = null;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ILclient!dfa;)V")
	public static void method4860(@OriginalArg(1) Class3_Sub15_Sub1 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static420.anInt7818; local3++) {
			@Pc(9) int local9 = Static448.anIntArray508[local3];
			@Pc(13) Class2_Sub3_Sub1_Sub2_Sub2 local13 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local9];
			@Pc(17) int local17 = arg0.method8401();
			if ((local17 & 0x20) != 0) {
				local17 += arg0.method8401() << 8;
			}
			if ((local17 & 0x1000) != 0) {
				local17 += arg0.method8401() << 16;
			}
			Static251.method4758(local17, local13, local9, arg0);
		}
	}
}
