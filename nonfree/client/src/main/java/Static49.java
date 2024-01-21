import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "Lclient!jf;")
	public static Class26_Sub1 aClass26_Sub1_9;

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "Lclient!jf;")
	public static Class26_Sub1 aClass26_Sub1_10;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Lclient!r;")
	private static Class61 aClass61_383 = Static129.method2060("Select");

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "Lclient!r;")
	private static Class61 aClass61_385 = Static129.method2060("Existing User");

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "Lclient!r;")
	public static Class61 aClass61_384 = aClass61_385;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "Lclient!r;")
	public static Class61 aClass61_386 = aClass61_383;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "Lclient!r;")
	public static Class61 aClass61_387 = Static129.method2060("huffman");

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "Lclient!r;")
	public static Class61 aClass61_388 = Static129.method2060("(Udns");

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "Lclient!r;")
	public static Class61 aClass61_389 = Static129.method2060("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "Lclient!r;")
	public static Class61 aClass61_390 = Static129.method2060("(U5");

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public static void method883() {
		while (true) {
			if (Static47.aClass5_Sub14_Sub1_2.method1495(Static80.anInt2057) >= 11) {
				@Pc(14) int local14 = Static47.aClass5_Sub14_Sub1_2.method1492(11);
				if (local14 != 2047) {
					@Pc(19) boolean local19 = false;
					if (Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local14] == null) {
						local19 = true;
						Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local14] = new Class5_Sub2_Sub2_Sub3_Sub2();
						if (Static40.aClass5_Sub14Array1[local14] != null) {
							Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local14].method1866(Static40.aClass5_Sub14Array1[local14]);
						}
					}
					Static66.anIntArray236[Static92.anInt2219++] = local14;
					@Pc(57) Class5_Sub2_Sub2_Sub3_Sub2 local57 = Static95.aClass5_Sub2_Sub2_Sub3_Sub2Array1[local14];
					local57.anInt2900 = Static58.anInt1422;
					@Pc(65) int local65 = Static47.aClass5_Sub14_Sub1_2.method1492(1);
					if (local65 == 1) {
						Static132.anIntArray445[Static83.anInt2281++] = local14;
					}
					@Pc(81) int local81 = Static47.aClass5_Sub14_Sub1_2.method1492(1);
					@Pc(90) int local90 = Static115.anIntArray353[Static47.aClass5_Sub14_Sub1_2.method1492(3)];
					if (local19) {
						local57.anInt2909 = local57.anInt2919 = local90;
					}
					@Pc(103) int local103 = Static47.aClass5_Sub14_Sub1_2.method1492(5);
					if (local103 > 15) {
						local103 -= 32;
					}
					@Pc(114) int local114 = Static47.aClass5_Sub14_Sub1_2.method1492(5);
					if (local114 > 15) {
						local114 -= 32;
					}
					local57.method1857(Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0] + local114, local103 + Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0], local81 == 1);
					continue;
				}
			}
			Static47.aClass5_Sub14_Sub1_2.method1499();
			return;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZZI)I")
	public static int method884() {
		return Static50.anInt1257 + Static25.anInt735;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIIIIIB)V")
	public static void method885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class5_Sub4 local7 = null;
		for (@Pc(12) Class5_Sub4 local12 = (Class5_Sub4) Static97.aClass58_57.method1669(); local12 != null; local12 = (Class5_Sub4) Static97.aClass58_57.method1664()) {
			if (local12.anInt261 == arg8 && arg3 == local12.anInt263 && arg5 == local12.anInt260 && local12.anInt268 == arg0) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class5_Sub4();
			local7.anInt260 = arg5;
			local7.anInt261 = arg8;
			local7.anInt263 = arg3;
			local7.anInt268 = arg0;
			Static77.method1250(local7);
			Static97.aClass58_57.method1663(local7);
		}
		local7.anInt266 = arg1;
		local7.anInt258 = arg6;
		local7.anInt271 = arg2;
		local7.anInt257 = arg4;
		local7.anInt264 = arg7;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public static void method886() {
		aClass61_389 = null;
		aClass61_384 = null;
		aClass26_Sub1_9 = null;
		aClass61_386 = null;
		aClass61_390 = null;
		aClass26_Sub1_10 = null;
		aClass61_388 = null;
		aClass61_383 = null;
		aClass61_387 = null;
		aClass61_385 = null;
	}
}
