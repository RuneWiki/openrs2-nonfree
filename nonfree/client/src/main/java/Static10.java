import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "[Lclient!kr;")
	public static Class46[] aClass46Array1;

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "[I")
	public static final int[] anIntArray24 = new int[1000];

	@OriginalMember(owner = "client!aj", name = "j", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_18 = new Class221(58, -1);

	@OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
	public static int anInt184 = 0;

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
	public static int anInt185 = 0;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lclient!fh;IB)Ljava/lang/String;")
	public static String method151(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1) {
		if (!Static46.method890(arg0).method5642(arg1) && arg0.anObjectArray18 == null) {
			return null;
		} else if (arg0.aStringArray10 == null || arg0.aStringArray10.length <= arg1 || arg0.aStringArray10[arg1] == null || arg0.aStringArray10[arg1].trim().length() == 0) {
			return Static334.aBoolean581 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray10[arg1];
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B[S[Ljava/lang/String;)V")
	public static void method152(@OriginalArg(1) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static142.method2732(0, arg0, arg1.length - 1, arg1);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
	public static void method153() {
		Static41.aClass107_41.method3012();
		Static84.aClass107_9.method3012();
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V")
	public static void method154() {
		@Pc(12) int local12 = Static177.method3423();
		if (local12 == 0) {
			Static332.aByteArrayArrayArray12 = null;
			Static272.method4032(0);
		} else if (local12 == 1) {
			Static190.method5239((byte) 0);
			Static272.method4032(512);
			if (Static243.aByteArrayArrayArray10 != null) {
				Static359.method5732();
			}
		} else {
			Static190.method5239((byte) (Static31.anInt512 - 4 & 0xFF));
			Static272.method4032(2);
		}
		Static76.anInt1437 = Static291.anInt5263;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B[B)Lclient!mb;")
	public static Class2_Sub9_Sub13 method155(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class2_Sub9_Sub13 local9 = new Class2_Sub9_Sub13();
		@Pc(14) Class2_Sub12 local14 = new Class2_Sub12(arg0);
		local14.anInt3606 = local14.aByteArray30.length - 2;
		@Pc(25) int local25 = local14.method3104();
		@Pc(36) int local36 = local14.aByteArray30.length - local25 - 12 - 2;
		local14.anInt3606 = local36;
		@Pc(43) int local43 = local14.method3135();
		local9.anInt4280 = local14.method3104();
		local9.anInt4282 = local14.method3104();
		local9.anInt4277 = local14.method3104();
		local9.anInt4278 = local14.method3104();
		@Pc(67) int local67 = local14.method3124();
		@Pc(78) int local78;
		@Pc(84) int local84;
		if (local67 > 0) {
			local9.aClass41Array1 = new Class41[local67];
			for (local78 = 0; local78 < local67; local78++) {
				local84 = local14.method3104();
				@Pc(91) Class41 local91 = new Class41(Static51.method1026(local84));
				local9.aClass41Array1[local78] = local91;
				while (local84-- > 0) {
					@Pc(102) int local102 = local14.method3135();
					@Pc(106) int local106 = local14.method3135();
					local91.method901(new Class2_Sub23(local106), (long) local102);
				}
			}
		}
		local14.anInt3606 = 0;
		local9.aString41 = local14.method3101();
		local9.anIntArray319 = new int[local43];
		local9.anIntArray320 = new int[local43];
		local9.aStringArray30 = new String[local43];
		local78 = 0;
		while (local36 > local14.anInt3606) {
			local84 = local14.method3104();
			if (local84 == 3) {
				local9.aStringArray30[local78] = local14.method3113().intern();
			} else if (local84 >= 100 || local84 == 21 || local84 == 38 || local84 == 39) {
				local9.anIntArray319[local78] = local14.method3124();
			} else {
				local9.anIntArray319[local78] = local14.method3135();
			}
			local9.anIntArray320[local78++] = local84;
		}
		return local9;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Lclient!jn;")
	public static Class2_Sub9_Sub11 method156(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub9_Sub11 local10 = (Class2_Sub9_Sub11) Static331.aClass144_10.method4186((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28;
		if (arg0 < 32768) {
			local28 = Static6.aClass104_1.method2756(0, arg0);
		} else {
			local28 = Static272.aClass104_121.method2756(0, arg0 & 0x7FFF);
		}
		local10 = new Class2_Sub9_Sub11();
		if (local28 != null) {
			local10.method3219(new Class2_Sub12(local28));
		}
		if (arg0 >= 32768) {
			local10.method3212();
		}
		Static331.aClass144_10.method4188((long) arg0, local10);
		return local10;
	}
}
