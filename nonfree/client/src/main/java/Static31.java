import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!fe", name = "Jc", descriptor = "Lclient!rb;")
	public static Class2_Sub1_Sub15 aClass2_Sub1_Sub15_1;

	@OriginalMember(owner = "client!fe", name = "Qc", descriptor = "I")
	public static int anInt1222;

	@OriginalMember(owner = "client!fe", name = "Rc", descriptor = "I")
	public static int anInt1223;

	@OriginalMember(owner = "client!fe", name = "qc", descriptor = "I")
	public static int anInt1206 = 1;

	@OriginalMember(owner = "client!fe", name = "vc", descriptor = "Z")
	public static boolean aBoolean52 = false;

	@OriginalMember(owner = "client!fe", name = "xc", descriptor = "[Lclient!me;")
	public static Class39[] aClass39Array1 = new Class39[50];

	@OriginalMember(owner = "client!fe", name = "Nc", descriptor = "Lclient!a;")
	private static Class1 aClass1_1207 = Static94.method1596("Please wait)3)3)3");

	@OriginalMember(owner = "client!fe", name = "zc", descriptor = "Lclient!a;")
	public static Class1 aClass1_1205 = aClass1_1207;

	@OriginalMember(owner = "client!fe", name = "Ac", descriptor = "J")
	public static long aLong31 = 0L;

	@OriginalMember(owner = "client!fe", name = "Ec", descriptor = "Lclient!a;")
	public static Class1 aClass1_1206 = Static94.method1596("Aus");

	@OriginalMember(owner = "client!fe", name = "Gc", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger3 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!fe", name = "Hc", descriptor = "I")
	public static int anInt1216 = 0;

	@OriginalMember(owner = "client!fe", name = "Oc", descriptor = "Z")
	public static boolean aBoolean53 = false;

	@OriginalMember(owner = "client!fe", name = "Pc", descriptor = "I")
	public static int anInt1221 = 0;

	@OriginalMember(owner = "client!fe", name = "Sc", descriptor = "Lclient!a;")
	public static Class1 aClass1_1208 = Static94.method1596("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!fe", name = "Tc", descriptor = "Lclient!a;")
	public static Class1 aClass1_1209 = Static94.method1596("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!u;Lclient!sa;B)V")
	public static void method836(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1 arg1, @OriginalArg(2) Class57 arg2) {
		@Pc(3) Class2_Sub7 local3 = new Class2_Sub7();
		local3.anInt1640 = 1;
		local3.aLong96 = arg0;
		local3.aClass57_2 = arg2;
		local3.aClass8_Sub1_11 = arg1;
		@Pc(22) Class46 local22 = Static53.aClass46_4;
		synchronized (Static53.aClass46_4) {
			Static53.aClass46_4.method1437(local3);
		}
		Static43.method992();
	}

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "(I)V")
	public static void method837() {
		aClass2_Sub1_Sub15_1 = null;
		aClass1_1209 = null;
		aClass1_1207 = null;
		aBigInteger3 = null;
		aClass39Array1 = null;
		aClass1_1206 = null;
		aClass1_1205 = null;
		aClass1_1208 = null;
	}

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "(I)V")
	public static void method839() {
		Static59.aClass2_Sub3_Sub1_2.method841(176);
		if (Static56.anInt1778 != -1) {
			Static90.method1570(Static56.anInt1778);
			Static101.anInt2594 = -1;
			Static79.aBoolean115 = true;
			Static34.aBoolean60 = true;
			Static56.anInt1778 = -1;
		}
		if (Static72.anInt1978 != -1) {
			Static90.method1570(Static72.anInt1978);
			Static101.anInt2594 = -1;
			Static87.aBoolean137 = true;
			Static72.anInt1978 = -1;
		}
		if (Static37.anInt1369 != -1) {
			Static90.method1570(Static37.anInt1369);
			Static37.anInt1369 = -1;
			Static29.method759(30);
		}
		if (Static64.anInt1914 != -1) {
			Static90.method1570(Static64.anInt1914);
			Static64.anInt1914 = -1;
		}
		if (Static111.anInt2784 != -1) {
			Static90.method1570(Static111.anInt2784);
			Static111.anInt2784 = -1;
			Static101.anInt2594 = -1;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
	public static void method840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static59.aClass2_Sub3_Sub1_2.method841(132);
		Static59.aClass2_Sub3_Sub1_2.method826(arg1);
		Static59.aClass2_Sub3_Sub1_2.method809(arg0);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZBII)Lclient!a;")
	public static Class1 method844(@OriginalArg(0) boolean arg0, @OriginalArg(3) int arg1) {
		@Pc(11) int local11 = 1;
		@Pc(20) int local20 = arg1 / 10;
		while (local20 != 0) {
			local20 /= 10;
			local11++;
		}
		@Pc(35) int local35 = local11;
		if (arg1 < 0 || arg0) {
			local35 = local11 + 1;
		}
		@Pc(43) byte[] local43 = new byte[local35];
		if (arg1 < 0) {
			local43[0] = 45;
		} else if (arg0) {
			local43[0] = 43;
		}
		for (@Pc(62) int local62 = 0; local62 < local11; local62++) {
			@Pc(68) int local68 = arg1 % 10;
			arg1 /= 10;
			if (local68 < 0) {
				local68 = -local68;
			}
			if (local68 > 9) {
				local68 += 39;
			}
			local43[local35 - local62 - 1] = (byte) (local68 + 48);
		}
		@Pc(102) Class1 local102 = new Class1();
		local102.aByteArray1 = local43;
		local102.anInt23 = local35;
		return local102;
	}
}
