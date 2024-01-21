import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!h", name = "A", descriptor = "I")
	public static int anInt1002;

	@OriginalMember(owner = "client!h", name = "N", descriptor = "[Lclient!bc;")
	public static Class10_Sub1_Sub1_Sub1[] aClass10_Sub1_Sub1_Sub1Array4;

	@OriginalMember(owner = "client!h", name = "u", descriptor = "[I")
	public static int[] anIntArray114 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!h", name = "Y", descriptor = "Lclient!va;")
	private static Class61 aClass61_408 = Static88.method1421(" more options");

	@OriginalMember(owner = "client!h", name = "x", descriptor = "Lclient!va;")
	private static Class61 aClass61_405 = aClass61_408;

	@OriginalMember(owner = "client!h", name = "C", descriptor = "I")
	public static int anInt1004 = 0;

	@OriginalMember(owner = "client!h", name = "D", descriptor = "I")
	public static int anInt1005 = 0;

	@OriginalMember(owner = "client!h", name = "E", descriptor = "I")
	public static int anInt1006 = 0;

	@OriginalMember(owner = "client!h", name = "F", descriptor = "I")
	public static int anInt1007 = 0;

	@OriginalMember(owner = "client!h", name = "M", descriptor = "I")
	public static final int anInt1013 = 7759444;

	@OriginalMember(owner = "client!h", name = "O", descriptor = "I")
	public static int anInt1014 = 0;

	@OriginalMember(owner = "client!h", name = "P", descriptor = "I")
	public static int anInt1015 = 0;

	@OriginalMember(owner = "client!h", name = "Q", descriptor = "[I")
	public static int[] anIntArray115 = new int[1000];

	@OriginalMember(owner = "client!h", name = "S", descriptor = "Lclient!va;")
	private static Class61 aClass61_406 = Static88.method1421("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!h", name = "V", descriptor = "Lclient!va;")
	public static Class61 aClass61_407 = aClass61_406;

	@OriginalMember(owner = "client!h", name = "X", descriptor = "I")
	public static int anInt1019 = -1;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public static void method598() {
		anIntArray114 = null;
		aClass61_408 = null;
		aClass61_407 = null;
		aClass61_405 = null;
		anIntArray115 = null;
		aClass61_406 = null;
		aClass10_Sub1_Sub1_Sub1Array4 = null;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
	public static void method599() {
		if (Static23.anInt747 < 2 && Static94.anInt2408 == 0 && Static20.anInt2651 == 0) {
			return;
		}
		@Pc(48) Class61 local48;
		if (Static94.anInt2408 == 1 && Static23.anInt747 < 2) {
			local48 = Static93.method1156(new Class61[] { Static101.aClass61_1035, Static24.aClass61_925, Static37.aClass61_435, Static30.aClass61_364 });
		} else if (Static20.anInt2651 == 1 && Static23.anInt747 < 2) {
			local48 = Static93.method1156(new Class61[] { Static49.aClass61_568, Static30.aClass61_364 });
		} else {
			local48 = Static19.aClass61Array7[Static23.anInt747 - 1];
		}
		if (Static23.anInt747 > 2) {
			local48 = Static93.method1156(new Class61[] { local48, Static88.aClass61_917, Static29.method529(Static23.anInt747 - 2), aClass61_405 });
		}
		Static50.aClass10_Sub1_Sub1_Sub4_3.method1556(local48, 4, 16777215, Static95.anInt2442 / 1000);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!le;Lclient!be;I)V")
	public static void method601(@OriginalArg(0) int arg0, @OriginalArg(1) Class38 arg1, @OriginalArg(2) Class11_Sub1 arg2) {
		@Pc(7) Class10_Sub11 local7 = new Class10_Sub11();
		local7.aClass11_Sub1_12 = arg2;
		local7.aClass38_3 = arg1;
		local7.anInt2223 = 1;
		local7.aLong81 = arg0;
		@Pc(22) Class9 local22 = Static12.aClass9_2;
		synchronized (Static12.aClass9_2) {
			Static12.aClass9_2.method79(local7);
		}
		Static39.method205();
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(B)V")
	public static void method602() {
		Static76.anInt2030 = 0;
		Static15.anInt449 = 0;
		Static38.method632();
		Static95.method1511();
		Static47.method739();
		Static10.method245();
		@Pc(33) int local33;
		for (@Pc(27) int local27 = 0; local27 < Static15.anInt449; local27++) {
			local33 = Static93.anIntArray232[local27];
			if (Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local33].anInt1631 != Static95.anInt2442) {
				Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local33] = null;
			}
		}
		if (Static5.anInt34 != Static55.aClass10_Sub10_Sub1_4.anInt1957) {
			throw new RuntimeException("gpp1 pos:" + Static55.aClass10_Sub10_Sub1_4.anInt1957 + " psize:" + Static5.anInt34);
		}
		for (local33 = 0; local33 < Static10.anInt305; local33++) {
			if (Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[Static58.anIntArray170[local33]] == null) {
				throw new RuntimeException("gpp2 pos:" + local33 + " size:" + Static10.anInt305);
			}
		}
	}
}
