import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!ui", name = "S", descriptor = "Lclient!ee;")
	public static Class28_Sub1 aClass28_Sub1_25;

	@OriginalMember(owner = "client!ui", name = "db", descriptor = "I")
	public static int anInt3926;

	@OriginalMember(owner = "client!ui", name = "fb", descriptor = "[I")
	public static int[] anIntArray377;

	@OriginalMember(owner = "client!ui", name = "N", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1127 = Static181.method2795("; Expires=");

	@OriginalMember(owner = "client!ui", name = "P", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_1128 = Static181.method2795("level)2");

	@OriginalMember(owner = "client!ui", name = "Y", descriptor = "Lclient!q;")
	public static final Class2_Sub21 aClass2_Sub21_1 = new Class2_Sub21(0, 0);

	@OriginalMember(owner = "client!ui", name = "bb", descriptor = "Lclient!qe;")
	public static Class83 aClass83_1129 = aClass83_1128;

	@OriginalMember(owner = "client!ui", name = "eb", descriptor = "I")
	public static int anInt3927 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIB)I")
	public static int method2967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 7 - arg2;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II[B)I")
	public static int method2969(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static208.method3144(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III[Lclient!qe;)Lclient!qe;")
	public static Class83 method2970(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class83[] arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg0; local9++) {
			if (arg2[arg1 + local9] == null) {
				arg2[local9 + arg1] = Static214.aClass83_1216;
			}
			local7 += arg2[local9 + arg1].anInt3158;
		}
		@Pc(39) byte[] local39 = new byte[local7];
		@Pc(46) int local46 = 0;
		@Pc(56) Class83 local56;
		for (@Pc(48) int local48 = 0; local48 < arg0; local48++) {
			local56 = arg2[arg1 + local48];
			Static222.method2224(local56.aByteArray36, 0, local39, local46, local56.anInt3158);
			local46 += local56.anInt3158;
		}
		local56 = new Class83();
		local56.aByteArray36 = local39;
		local56.anInt3158 = local7;
		return local56;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLclient!eh;)V")
	public static void method2971(@OriginalArg(1) Class28 arg0) {
		Static64.aClass28_72 = arg0;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)V")
	public static void method2972(@OriginalArg(1) int arg0) {
		if (Static68.anInt1625 == arg0) {
			return;
		}
		if (Static68.anInt1625 == 0) {
			Static41.method807();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static176.anInt3611 = 0;
			Static213.anInt4246 = 0;
			Static146.anInt3034 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static36.aClass25_3 != null) {
			Static36.aClass25_3.method796();
			Static36.aClass25_3 = null;
		}
		if (Static68.anInt1625 == 25) {
			Static6.anInt166 = 1;
			Static41.anInt1038 = 0;
			Static105.anInt2425 = 1;
			Static53.anInt1353 = 0;
			Static82.anInt1838 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static3.method60(Static113.aClass28_Sub1_18, Static69.aCanvas1, aClass28_Sub1_25);
		} else {
			Static130.method2181();
		}
		Static68.anInt1625 = arg0;
	}
}
