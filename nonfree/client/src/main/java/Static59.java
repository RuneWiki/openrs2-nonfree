import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!md", name = "Cb", descriptor = "I")
	public static int anInt1823;

	@OriginalMember(owner = "client!md", name = "Hb", descriptor = "J")
	public static long aLong65;

	@OriginalMember(owner = "client!md", name = "Pb", descriptor = "[I")
	public static int[] anIntArray179;

	@OriginalMember(owner = "client!md", name = "kb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_701 = Static34.method846("Offline");

	@OriginalMember(owner = "client!md", name = "wb", descriptor = "I")
	public static int anInt1819 = -1;

	@OriginalMember(owner = "client!md", name = "Bb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_702 = Static34.method846("mapback");

	@OriginalMember(owner = "client!md", name = "Fb", descriptor = "I")
	public static int anInt1826 = 0;

	@OriginalMember(owner = "client!md", name = "Ib", descriptor = "I")
	public static int anInt1828 = 1;

	@OriginalMember(owner = "client!md", name = "Kb", descriptor = "Lclient!gb;")
	public static Class24 aClass24_1 = new Class24();

	@OriginalMember(owner = "client!md", name = "Lb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_703 = aClass55_701;

	@OriginalMember(owner = "client!md", name = "Nb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_704 = Static34.method846("(X");

	@OriginalMember(owner = "client!md", name = "Ob", descriptor = "Lclient!rc;")
	public static Class55 aClass55_705 = Static34.method846("::hiddenbuttontest");

	@OriginalMember(owner = "client!md", name = "Qb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_706 = Static34.method846("k");

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	public static void method1250() {
		if (Static64.aClass4_1 != null) {
			Static64.aClass4_1.method877();
			Static64.aClass4_1 = null;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IILclient!pb;)Z")
	public static boolean method1251(@OriginalArg(0) int arg0, @OriginalArg(2) Class40 arg1) {
		@Pc(4) byte[] local4 = arg1.method1244(arg0);
		if (local4 == null) {
			return false;
		} else {
			Static61.method1315(local4);
			return true;
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
	public static void method1252() {
		aClass55_705 = null;
		aClass24_1 = null;
		aClass55_701 = null;
		aClass55_706 = null;
		aClass55_702 = null;
		anIntArray179 = null;
		aClass55_704 = null;
		aClass55_703 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(JI)V")
	public static void method1255(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < Static64.anInt1912; local19++) {
			if (Static8.aLongArray1[local19] == arg0) {
				Static64.anInt1912--;
				Static63.aBoolean89 = true;
				for (@Pc(43) int local43 = local19; local43 < Static64.anInt1912; local43++) {
					Static68.aClass55Array18[local43] = Static68.aClass55Array18[local43 + 1];
					Static102.anIntArray286[local43] = Static102.anIntArray286[local43 + 1];
					Static8.aLongArray1[local43] = Static8.aLongArray1[local43 + 1];
				}
				Static51.aClass6_Sub1_Sub1_3.method1515(67);
				Static51.aClass6_Sub1_Sub1_3.method1463(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IILclient!cb;I)V")
	public static void method1259(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub2_Sub3_Sub1_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1.anInt2717 && arg0 != -1) {
			@Pc(30) int local30 = Static4.method1608(arg0).anInt2820;
			if (local30 == 1) {
				arg1.anInt2721 = 0;
				arg1.anInt2711 = arg2;
				arg1.anInt2734 = 0;
				arg1.anInt2731 = 0;
			}
			if (local30 == 2) {
				arg1.anInt2731 = 0;
				return;
			}
		} else if (arg0 == -1 || arg1.anInt2717 == -1 || Static4.method1608(arg0).anInt2801 >= Static4.method1608(arg1.anInt2717).anInt2801) {
			arg1.anInt2717 = arg0;
			arg1.anInt2721 = 0;
			arg1.anInt2734 = 0;
			arg1.anInt2740 = arg1.anInt2737;
			arg1.anInt2731 = 0;
			arg1.anInt2711 = arg2;
		}
	}
}
