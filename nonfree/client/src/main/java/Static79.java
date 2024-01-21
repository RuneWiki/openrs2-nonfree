import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!pe", name = "xb", descriptor = "Lclient!wa;")
	public static Class67 aClass67_1;

	@OriginalMember(owner = "client!pe", name = "Mb", descriptor = "I")
	public static int anInt2102;

	@OriginalMember(owner = "client!pe", name = "Qb", descriptor = "Lclient!u;")
	public static Class8_Sub1 aClass8_Sub1_18;

	@OriginalMember(owner = "client!pe", name = "Yb", descriptor = "Z")
	public static boolean aBoolean117;

	@OriginalMember(owner = "client!pe", name = "Cb", descriptor = "Lclient!a;")
	private static Class1 aClass1_2216 = Static94.method1596("K");

	@OriginalMember(owner = "client!pe", name = "ub", descriptor = "Lclient!a;")
	public static Class1 aClass1_2212 = aClass1_2216;

	@OriginalMember(owner = "client!pe", name = "vb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2213 = Static94.method1596("backvmid2");

	@OriginalMember(owner = "client!pe", name = "yb", descriptor = "I")
	public static int anInt2096 = 0;

	@OriginalMember(owner = "client!pe", name = "zb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2214 = Static94.method1596("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!pe", name = "Ab", descriptor = "Lclient!a;")
	public static Class1 aClass1_2215 = aClass1_2216;

	@OriginalMember(owner = "client!pe", name = "Eb", descriptor = "Z")
	public static boolean aBoolean115 = false;

	@OriginalMember(owner = "client!pe", name = "Fb", descriptor = "I")
	public static int anInt2098 = 0;

	@OriginalMember(owner = "client!pe", name = "Jb", descriptor = "[I")
	public static int[] anIntArray271 = new int[50];

	@OriginalMember(owner = "client!pe", name = "Lb", descriptor = "Lclient!pb;")
	public static Class46 aClass46_8 = new Class46();

	@OriginalMember(owner = "client!pe", name = "Sb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2217 = Static94.method1596("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!pe", name = "Ub", descriptor = "I")
	public static int anInt2106 = 0;

	@OriginalMember(owner = "client!pe", name = "Vb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2218 = Static94.method1596("Wen m-Ochten Sie entfernen?");

	@OriginalMember(owner = "client!pe", name = "Xb", descriptor = "Lclient!a;")
	private static Class1 aClass1_2220 = Static94.method1596("Bad session id)3");

	@OriginalMember(owner = "client!pe", name = "Wb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2219 = aClass1_2220;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V")
	public static void method1461() {
		aClass1_2216 = null;
		aClass1_2219 = null;
		aClass1_2217 = null;
		aClass1_2213 = null;
		aClass8_Sub1_18 = null;
		aClass67_1 = null;
		aClass1_2220 = null;
		aClass1_2218 = null;
		aClass1_2214 = null;
		aClass1_2212 = null;
		aClass46_8 = null;
		anIntArray271 = null;
		aClass1_2215 = null;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Lclient!cc;")
	public static Class2_Sub1_Sub3 method1462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) long local8 = (long) (arg0 + (arg1 << 16));
		@Pc(18) Class2_Sub1_Sub3 local18 = (Class2_Sub1_Sub3) Static27.aClass11_8.method431(local8);
		if (local18 != null) {
			return local18;
		}
		@Pc(47) byte[] local47 = Static91.aClass8_Sub1_21.method1682(Static48.aClass1_1574, Static97.method1655(new Class1[] { Static43.method994(arg1), Static39.aClass1_2855, Static43.method994(arg0) }));
		@Pc(57) Class2_Sub3 local57 = new Class2_Sub3(local47);
		local18 = new Class2_Sub1_Sub3();
		local57.anInt1168 = local57.aByteArray7.length - 12;
		@Pc(72) int local72 = local57.method814();
		@Pc(74) int local74 = 0;
		local18.anInt679 = local57.method792();
		local18.anInt677 = local57.method792();
		local18.anInt673 = local57.method792();
		local18.anInt676 = local57.method792();
		local18.aClass1Array7 = new Class1[local72];
		local18.anIntArray65 = new int[local72];
		local57.anInt1168 = 0;
		local18.anIntArray66 = new int[local72];
		while (local57.anInt1168 < local57.aByteArray7.length - 12) {
			@Pc(115) int local115 = local57.method792();
			if (local115 == 3) {
				local18.aClass1Array7[local74] = local57.method787();
			} else if (local115 >= 100 || local115 == 21 || local115 == 38 || local115 == 39) {
				local18.anIntArray65[local74] = local57.method791();
			} else {
				local18.anIntArray65[local74] = local57.method814();
			}
			local18.anIntArray66[local74++] = local115;
		}
		Static27.aClass11_8.method430(local8, local18);
		return local18;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III[Lclient!a;)Lclient!a;")
	public static Class1 method1463(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1[] arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			if (arg2[arg1 + local17] == null) {
				arg2[local17 + arg1] = Static55.aClass1_669;
			}
			local7 += arg2[local17 + arg1].anInt23;
		}
		@Pc(48) byte[] local48 = new byte[local7];
		@Pc(50) int local50 = 0;
		@Pc(60) Class1 local60;
		for (@Pc(52) int local52 = 0; local52 < arg0; local52++) {
			local60 = arg2[arg1 + local52];
			Static116.method742(local60.aByteArray1, 0, local48, local50, local60.anInt23);
			local50 += local60.anInt23;
		}
		local60 = new Class1();
		local60.anInt23 = local7;
		local60.aByteArray1 = local48;
		return local60;
	}
}
