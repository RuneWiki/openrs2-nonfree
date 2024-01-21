import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!c", name = "b", descriptor = "[I")
	public static int[] anIntArray38;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_136 = Static151.method2243("Error connecting to server)3");

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Lclient!mb;")
	public static Class62 aClass62_137 = aClass62_136;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "I")
	public static int anInt451 = 0;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_138 = Static151.method2243("Ok");

	@OriginalMember(owner = "client!c", name = "i", descriptor = "[I")
	public static final int[] anIntArray39 = new int[] { 2, 2, 4, 2, 1, 8, 4 };

	@OriginalMember(owner = "client!c", name = "j", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_139 = Static151.method2243("scrollbar");

	@OriginalMember(owner = "client!c", name = "k", descriptor = "Lclient!mb;")
	public static Class62 aClass62_140 = aClass62_138;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
	public static void method343() {
		for (@Pc(10) Class2_Sub8 local10 = (Class2_Sub8) Static82.aClass13_4.method303(); local10 != null; local10 = (Class2_Sub8) Static82.aClass13_4.method309()) {
			if (local10.aClass2_Sub2_Sub4_1 != null) {
				Static32.aClass2_Sub2_Sub3_1.method2609(local10.aClass2_Sub2_Sub4_1);
				local10.aClass2_Sub2_Sub4_1 = null;
			}
			if (local10.aClass2_Sub2_Sub4_2 != null) {
				Static32.aClass2_Sub2_Sub3_1.method2609(local10.aClass2_Sub2_Sub4_2);
				local10.aClass2_Sub2_Sub4_2 = null;
			}
		}
		Static82.aClass13_4.method314();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)Lclient!aa;")
	public static Class2_Sub1_Sub1 method344(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub1_Sub1 local6 = (Class2_Sub1_Sub1) Static117.aClass53_13.method1648((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static135.aClass71_27.method2130(1, arg0);
		local6 = new Class2_Sub1_Sub1();
		if (local20 != null) {
			local6.method53(arg0, new Class2_Sub11(local20));
		}
		Static117.aClass53_13.method1645((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I[IZII)V")
	public static void method345(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg2--;
		@Pc(8) int local8 = arg3 - 1;
		@Pc(11) int local11 = local8 - 7;
		while (arg2 < local11) {
			@Pc(15) int local15 = arg2 + 1;
			arg1[local15] = arg0;
			@Pc(20) int local20 = local15 + 1;
			arg1[local20] = arg0;
			@Pc(25) int local25 = local20 + 1;
			arg1[local25] = arg0;
			@Pc(30) int local30 = local25 + 1;
			arg1[local30] = arg0;
			@Pc(35) int local35 = local30 + 1;
			arg1[local35] = arg0;
			@Pc(40) int local40 = local35 + 1;
			arg1[local40] = arg0;
			@Pc(45) int local45 = local40 + 1;
			arg1[local45] = arg0;
			arg2 = local45 + 1;
			arg1[arg2] = arg0;
		}
		while (local8 > arg2) {
			arg2++;
			arg1[arg2] = arg0;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()V")
	public static void method346() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < Static204.anInt4231; local1++) {
			for (local4 = 0; local4 < Static198.anInt4147; local4++) {
				for (local7 = 0; local7 < Static12.anInt319; local7++) {
					Static92.aClass2_Sub18ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static123.anInt4484; local4++) {
			for (local7 = 0; local7 < Static123.anIntArray402[local4]; local7++) {
				Static123.aClass84ArrayArray11[local4][local7] = null;
			}
			Static123.anIntArray402[local4] = 0;
		}
		for (local7 = 0; local7 < Static133.anInt2867; local7++) {
			Static192.aClass39Array3[local7] = null;
		}
		Static133.anInt2867 = 0;
		for (@Pc(69) int local69 = 0; local69 < Static64.aClass39Array1.length; local69++) {
			Static64.aClass39Array1[local69] = null;
		}
	}
}
