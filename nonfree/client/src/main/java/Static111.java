import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "[I")
	public static int[] anIntArray440;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1271 = Static63.method1251("Loaded sprites");

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1272 = Static63.method1251("Wen m-Ochten Sie entfernen?");

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1273 = aClass45_1271;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
	public static int anInt2905 = -1;

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
	public static int anInt2907 = 0;

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1274 = Static63.method1251("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1275 = Static63.method1251("null");

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
	public static int anInt2908 = 0;

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1276 = Static63.method1251("Loading )2 please wait)3");

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1277 = aClass45_1276;

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1278 = Static63.method1251("Weiter");

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1279 = Static63.method1251("Neuer Benutzer");

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	public static void method1987() {
		anIntArray440 = null;
		aClass45_1275 = null;
		aClass45_1276 = null;
		aClass45_1272 = null;
		aClass45_1271 = null;
		aBigInteger2 = null;
		aClass45_1279 = null;
		aClass45_1278 = null;
		aClass45_1273 = null;
		aClass45_1277 = null;
		aClass45_1274 = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIZ[B)Lclient!mb;")
	public static Class45 method1988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class45 local7 = new Class45();
		local7.anInt1925 = 0;
		local7.aByteArray27 = new byte[arg0];
		for (@Pc(25) int local25 = arg1; local25 < arg0 + arg1; local25++) {
			if (arg2[local25] != 0) {
				local7.aByteArray27[local7.anInt1925++] = arg2[local25];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)[Lclient!sc;")
	public static Class5_Sub2_Sub6_Sub4[] method1989() {
		@Pc(8) Class5_Sub2_Sub6_Sub4[] local8 = new Class5_Sub2_Sub6_Sub4[Static64.anInt1854];
		for (@Pc(10) int local10 = 0; local10 < Static64.anInt1854; local10++) {
			@Pc(29) Class5_Sub2_Sub6_Sub4 local29 = local8[local10] = new Class5_Sub2_Sub6_Sub4();
			local29.anInt2726 = Static64.anInt1855;
			local29.anInt2730 = Static45.anInt1316;
			local29.anInt2729 = Static89.anIntArray368[local10];
			local29.anInt2728 = anIntArray440[local10];
			local29.anInt2731 = Static110.anIntArray438[local10];
			local29.anInt2727 = Static104.anIntArray424[local10];
			local29.anIntArray415 = Static7.anIntArray25;
			local29.aByteArray37 = Static16.aByteArrayArray2[local10];
		}
		Static96.method1797();
		return local8;
	}
}
