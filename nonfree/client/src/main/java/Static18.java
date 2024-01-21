import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "[I")
	public static int[] anIntArray48;

	@OriginalMember(owner = "client!bg", name = "z", descriptor = "Lclient!jh;")
	public static Class1_Sub2_Sub5_Sub4_Sub1 aClass1_Sub2_Sub5_Sub4_Sub1_1;

	@OriginalMember(owner = "client!bg", name = "q", descriptor = "Z")
	public static boolean aBoolean22 = false;

	@OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
	public static int anInt456 = 0;

	@OriginalMember(owner = "client!bg", name = "C", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_375 = Static118.method2249("k");

	@OriginalMember(owner = "client!bg", name = "H", descriptor = "[Z")
	public static final boolean[] aBooleanArray1 = new boolean[5];

	@OriginalMember(owner = "client!bg", name = "I", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_376 = Static118.method2249(": ");

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)V")
	public static void method344() {
		for (@Pc(1) int local1 = 0; local1 < Static95.anInt2376; local1++) {
			@Pc(14) int local14 = Static191.anIntArray474[local1];
			@Pc(18) Class6_Sub4_Sub1 local18 = Static158.aClass6_Sub4_Sub1Array1[local14];
			@Pc(22) int local22 = Static1.aClass1_Sub14_Sub1_43.method1738();
			if ((local22 & 0x20) != 0) {
				local22 += Static1.aClass1_Sub14_Sub1_43.method1738() << 8;
			}
			Static61.method1071(local14, local22, local18);
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)Lclient!eg;")
	public static Class1_Sub2_Sub9 method345(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub9 local10 = (Class1_Sub2_Sub9) Static205.aClass87_74.method3062((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static176.aClass60_36.method2340(Static34.method661(arg0), Static71.method1211(arg0));
		local10 = new Class1_Sub2_Sub9();
		local10.anInt1267 = arg0;
		if (local28 != null) {
			local10.method825(new Class1_Sub14(local28));
		}
		Static205.aClass87_74.method3068(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(II)Lclient!bd;")
	public static Class1_Sub2_Sub3 method346(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub3 local10 = (Class1_Sub2_Sub3) Static97.aClass87_42.method3062((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static195.aClass60_Sub1_160.method2340(0, arg0);
		if (local20 == null) {
			return null;
		}
		local10 = new Class1_Sub2_Sub3();
		@Pc(33) Class1_Sub14 local33 = new Class1_Sub14(local20);
		local33.anInt2306 = local33.aByteArray29.length - 2;
		@Pc(44) int local44 = local33.method1753();
		@Pc(54) int local54 = local33.aByteArray29.length - local44 - 12 - 2;
		local33.anInt2306 = local54;
		@Pc(63) int local63 = local33.method1700();
		local10.anInt435 = local33.method1753();
		local10.anInt436 = local33.method1753();
		local10.anInt441 = local33.method1753();
		local10.anInt443 = local33.method1753();
		@Pc(89) int local89 = local33.method1738();
		@Pc(97) int local97;
		@Pc(102) int local102;
		if (local89 > 0) {
			local10.aClass99Array1 = new Class99[local89];
			for (local97 = 0; local97 < local89; local97++) {
				local102 = local33.method1753();
				@Pc(109) Class99 local109 = new Class99(Static50.method921(local102));
				local10.aClass99Array1[local97] = local109;
				while (local102-- > 0) {
					@Pc(121) int local121 = local33.method1700();
					@Pc(125) int local125 = local33.method1700();
					local109.method3290(new Class1_Sub21(local125), (long) local121);
				}
			}
		}
		local33.anInt2306 = 0;
		local97 = 0;
		local10.aClass65_322 = local33.method1735();
		local10.anIntArray43 = new int[local63];
		local10.aClass65Array7 = new Class65[local63];
		local10.anIntArray45 = new int[local63];
		while (local54 > local33.anInt2306) {
			local102 = local33.method1753();
			if (local102 == 3) {
				local10.aClass65Array7[local97] = local33.method1706();
			} else if (local102 >= 100 || local102 == 21 || local102 == 38 || local102 == 39) {
				local10.anIntArray45[local97] = local33.method1738();
			} else {
				local10.anIntArray45[local97] = local33.method1700();
			}
			local10.anIntArray43[local97++] = local102;
		}
		Static97.aClass87_42.method3068(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!kg;IIZII)V")
	public static void method348(@OriginalArg(0) Class1_Sub2_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (Static161.anInt3642 >= 50 || (arg0.anIntArray283 == null || arg4 >= arg0.anIntArray283.length)) {
			return;
		}
		@Pc(34) int local34 = arg0.anIntArray283[arg4];
		if (local34 == 0) {
			return;
		}
		@Pc(44) int local44 = local34 >> 8;
		@Pc(50) int local50 = local34 >> 4 & 0x7;
		@Pc(54) int local54 = local34 & 0xF;
		if (local54 == 0) {
			if (arg3) {
				Static184.method3067(local44, local50, 0);
			}
		} else if (Static53.anInt1436 != 0) {
			@Pc(78) int local78 = (arg2 - 64) / 128;
			@Pc(84) int local84 = (arg1 - 64) / 128;
			Static111.anIntArray309[Static161.anInt3642] = local44;
			Static104.anIntArray292[Static161.anInt3642] = local50;
			Static134.anIntArray377[Static161.anInt3642] = 0;
			Static122.aClass84Array2[Static161.anInt3642] = null;
			Static53.anIntArray130[Static161.anInt3642] = (local84 << 8) + (local78 << 16) + local54;
			Static161.anInt3642++;
		}
	}
}
