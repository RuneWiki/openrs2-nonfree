import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!be", name = "j", descriptor = "Lclient!it;")
	public static Class119 aClass119_1;

	@OriginalMember(owner = "client!be", name = "q", descriptor = "[Lclient!pl;")
	public static Class7[] aClass7Array1;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_9 = new Class244(78, 8);

	@OriginalMember(owner = "client!be", name = "h", descriptor = "I")
	public static int anInt339 = 0;

	@OriginalMember(owner = "client!be", name = "i", descriptor = "Lclient!cp;")
	public static final Class44 aClass44_5 = new Class44(8);

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)I")
	public static int method311(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	public static void method312() {
		Static310.method4763(25);
		Static137.method1433();
		System.gc();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!np;IILclient!os;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method315(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class118 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static121.aClass155_1 = arg0;
		Static142.anInt2700 = arg1;
		Static376.aClass118_7 = arg3;
		Static145.aBoolean206 = Static121.aClass155_1.method4943() > 0;
		Static12.anInt167 = arg4 >> Static187.anInt3390;
		Static327.anInt5555 = arg6 >> Static187.anInt3390;
		Static55.anInt1125 = arg4;
		Static303.anInt5264 = arg6;
		Static113.anInt2186 = arg5;
		Static264.anInt4700 = Static12.anInt167 - Static68.anInt1339;
		if (Static264.anInt4700 < 0) {
			Static107.anInt4790 = -Static264.anInt4700;
			Static264.anInt4700 = 0;
		} else {
			Static107.anInt4790 = 0;
		}
		Static270.anInt5903 = Static327.anInt5555 - Static68.anInt1339;
		if (Static270.anInt5903 < 0) {
			Static270.anInt5907 = -Static270.anInt5903;
			Static270.anInt5903 = 0;
		} else {
			Static270.anInt5907 = 0;
		}
		Static70.anInt1378 = Static12.anInt167 + Static68.anInt1339;
		if (Static70.anInt1378 > Static44.anInt791) {
			Static70.anInt1378 = Static44.anInt791;
		}
		Static72.anInt1458 = Static327.anInt5555 + Static68.anInt1339;
		if (Static72.anInt1458 > Static103.anInt2050) {
			Static72.anInt1458 = Static103.anInt2050;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static68.anInt1339 + Static68.anInt1339 + 2; local74++) {
			for (local77 = 0; local77 < Static68.anInt1339 + Static68.anInt1339 + 2; local77++) {
				local84 = Static12.anInt167 + local74 - Static68.anInt1339;
				local90 = Static327.anInt5555 + local77 - Static68.anInt1339;
				if (local84 >= 0 && local90 >= 0 && local84 < Static44.anInt791 && local90 < Static103.anInt2050) {
					@Pc(104) int local104 = local84 << Static187.anInt3390;
					@Pc(108) int local108 = local90 << Static187.anInt3390;
					@Pc(120) int local120 = Static89.aClass7Array4[Static89.aClass7Array4.length - 1].method5648(local84, local90) - 1000;
					@Pc(140) int local140 = aClass7Array1 == null ? Static89.aClass7Array4[0].method5648(local84, local90) + Static258.anInt4653 : aClass7Array1[0].method5648(local84, local90) + Static258.anInt4653;
					Static202.aBooleanArrayArray4[local74][local77] = Static121.aClass155_1.method4887(local104, local120, local108, local104, local140, local108);
				} else {
					Static202.aBooleanArrayArray4[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static68.anInt1339 + Static68.anInt1339 + 1; local77++) {
			for (local84 = 0; local84 < Static68.anInt1339 + Static68.anInt1339 + 1; local84++) {
				Static191.aBooleanArrayArray3[local77][local84] = Static202.aBooleanArrayArray4[local77][local84] || Static202.aBooleanArrayArray4[local77 + 1][local84] || Static202.aBooleanArrayArray4[local77][local84 + 1] || Static202.aBooleanArrayArray4[local77 + 1][local84 + 1];
			}
		}
		Static359.anIntArray645 = arg8;
		Static158.anIntArray303 = arg9;
		Static41.anIntArray75 = arg10;
		Static325.anIntArray605 = arg11;
		Static162.anIntArray307 = arg12;
		Static84.method1395();
		Static297.method4592();
		for (@Pc(256) Class12_Sub7 local256 = (Class12_Sub7) Static2.aClass22_1.method291(); local256 != null; local256 = (Class12_Sub7) Static2.aClass22_1.method292()) {
			local256.method5277();
			Static341.method5166(local256);
		}
		if (Static145.aBoolean206) {
			for (local90 = 0; local90 < Static104.anInt2067; local90++) {
				Static19.aClass3_Sub12_Sub1Array1[local90].method5442(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static121.aClass155_1.method4890(0);
			if (Static317.aClass137_4 == null || Static317.aClass137_4 instanceof Class137_Sub1) {
				Static317.aClass137_4 = new Class137_Sub2();
			}
		} else if (Static317.aClass137_4 == null || Static317.aClass137_4 instanceof Class137_Sub2) {
			Static317.aClass137_4 = new Class137_Sub1();
		}
		Static317.aClass137_4.method4819(arg2);
		Static317.aClass137_4.method4820();
		if (Static81.aClass48ArrayArrayArray2 != null) {
			Static126.method2021(true);
			Static317.aClass137_4.method4825(22);
			Static113.method1830(arg2, null, 0, (byte) 0, arg15, arg16);
			Static317.aClass137_4.method4820();
			Static317.aClass137_4.method4825(23);
			Static126.method2021(false);
		}
		Static113.method1830(arg2, arg7, arg13, arg14, arg15, arg16);
		Static317.aClass137_4.method4820();
		Static317.aClass137_4.method4821();
		Static317.aClass137_4.method4820();
		if (arg2 > 1) {
			Static121.aClass155_1.method4852(0);
		}
		Static121.aClass155_1.method4945(0, null);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)Z")
	public static boolean method318(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static13.aByteArrayArrayArray17[1][arg0][arg1] & 0x2) != 0;
	}
}
