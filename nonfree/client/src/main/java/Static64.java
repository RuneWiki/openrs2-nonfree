import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!h", name = "e", descriptor = "[S")
	public static short[] aShortArray17;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "Lclient!gg;")
	public static Class28 aClass28_983 = Static107.method1838(":chalreq:");

	@OriginalMember(owner = "client!h", name = "d", descriptor = "I")
	public static int anInt1756 = 0;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "Lclient!gg;")
	private static Class28 aClass28_985 = Static107.method1838("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!h", name = "g", descriptor = "Lclient!gg;")
	public static Class28 aClass28_984 = aClass28_985;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
	public static void method1170() {
		aShortArray17 = null;
		aClass28_984 = null;
		aClass28_985 = null;
		aClass28_983 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IILclient!gg;)V")
	public static void method1171(@OriginalArg(1) int arg0, @OriginalArg(2) Class28 arg1) {
		@Pc(7) Class28 local7 = arg1.method1133().method1115();
		@Pc(13) boolean local13 = false;
		for (@Pc(23) int local23 = 0; local23 < Static35.anInt973; local23++) {
			@Pc(31) Class2_Sub4_Sub1_Sub1_Sub2 local31 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[Static160.anIntArray327[local23]];
			if (local31 != null && local31.aClass28_953 != null && local31.aClass28_953.method1140(local7)) {
				local13 = true;
				Static146.method2284(0, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0], 0, 1, 1, 2, local31.anIntArray139[0], Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0], local31.anIntArray142[0], false, 0);
				if (arg0 == 1) {
					Static128.aClass2_Sub2_Sub1_2.method1711(210);
					Static128.aClass2_Sub2_Sub1_2.method1658(Static160.anIntArray327[local23]);
				} else if (arg0 == 4) {
					Static128.aClass2_Sub2_Sub1_2.method1711(250);
					Static128.aClass2_Sub2_Sub1_2.method1658(Static160.anIntArray327[local23]);
				} else if (arg0 == 6) {
					Static128.aClass2_Sub2_Sub1_2.method1711(60);
					Static128.aClass2_Sub2_Sub1_2.method1681(Static160.anIntArray327[local23]);
				} else if (arg0 == 7) {
					Static128.aClass2_Sub2_Sub1_2.method1711(195);
					Static128.aClass2_Sub2_Sub1_2.method1658(Static160.anIntArray327[local23]);
				}
				break;
			}
		}
		if (!local13) {
			Static93.method1632(0, Static136.aClass28_1828, Static83.method1481(new Class28[] { Static177.aClass28_2332, local7 }));
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!jc;Lclient!gg;Lclient!gg;B)Lclient!wb;")
	public static Class2_Sub4_Sub3_Sub4 method1172(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class28 arg2) {
		@Pc(4) int local4 = arg0.method1777(arg1);
		@Pc(18) int local18 = arg0.method1774(arg2, local4);
		return Static124.method2018(local18, local4, arg0);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IBI)Z")
	public static boolean method1173(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([BI)[B")
	public static byte[] method1174(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class2_Sub2 local13 = new Class2_Sub2(arg0);
		@Pc(19) int local19 = local13.method1698();
		@Pc(23) int local23 = local13.method1690();
		if (local23 < 0 || Static11.anInt532 != 0 && Static11.anInt532 < local23) {
			throw new RuntimeException();
		} else if (local19 == 0) {
			@Pc(94) byte[] local94 = new byte[local23];
			local13.method1705(local23, local94);
			return local94;
		} else {
			@Pc(52) int local52 = local13.method1690();
			if (local52 < 0 || Static11.anInt532 != 0 && Static11.anInt532 < local52) {
				throw new RuntimeException();
			}
			@Pc(72) byte[] local72 = new byte[local52];
			if (local19 == 1) {
				Static32.method636(local72, local52, arg0, local23);
			} else {
				Static71.aClass74_1.method2282(local13, local72);
			}
			return local72;
		}
	}
}
