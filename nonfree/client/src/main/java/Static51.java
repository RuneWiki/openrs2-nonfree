import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!cs", name = "t", descriptor = "I")
	public static int anInt874;

	@OriginalMember(owner = "client!cs", name = "y", descriptor = "Lclient!p;")
	public static Class152 aClass152_1;

	@OriginalMember(owner = "client!cs", name = "z", descriptor = "[Lclient!vq;")
	public static Class210[] aClass210Array1;

	@OriginalMember(owner = "client!cs", name = "A", descriptor = "Lclient!dr;")
	public static Class37 aClass37_1;

	@OriginalMember(owner = "client!cs", name = "B", descriptor = "Lclient!wg;")
	public static Class218 aClass218_1;

	@OriginalMember(owner = "client!cs", name = "C", descriptor = "I")
	public static int anInt879;

	@OriginalMember(owner = "client!cs", name = "D", descriptor = "[Lclient!kr;")
	public static Class46[] aClass46Array5;

	@OriginalMember(owner = "client!cs", name = "s", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_19 = new Class140("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
	public static void method1022() {
		Static336.method5478();
		Static104.method2067();
		Static231.method4256();
		Static124.method2400();
		Static313.method5190();
		Static310.aClass184_2.method5045();
		Static67.method3687();
		Static336.method5481();
		Static213.method3998();
		Static124.method2401();
		Static298.method5014();
		Static355.method5675();
		Static111.method2164();
		Static97.method1897();
		Static211.method5301();
		Static69.method3475();
		Static118.method2304();
		Static100.method1992();
		Static38.method473();
		Static209.method5771();
		Static195.method3629();
		Static107.method2101();
		if (Static63.anInt1130 != 0) {
			for (@Pc(54) int local54 = 0; local54 < Static201.aByteArrayArray11.length; local54++) {
				Static201.aByteArrayArray11[local54] = null;
			}
			Static115.anInt2461 = 0;
		}
		Static302.method5085();
		Static283.method4807();
		Static182.method2436();
		Static226.method4196();
		Static182.method2438();
		Static367.aClass107_62.method3015();
		aClass37_1.method3700();
		Static263.aClass144_8.method4184();
		Static114.method2244();
		Static296.aClass104_177.method2751();
		Static327.aClass104_166.method2751();
		Static304.aClass104_159.method2751();
		Static224.aClass104_181.method2751();
		Static80.aClass104_54.method2751();
		Static63.aClass104_43.method2751();
		Static284.aClass104_149.method2751();
		Static302.aClass104_156.method2751();
		Static338.aClass104_184.method2751();
		Static156.aClass104_94.method2751();
		Static55.aClass104_40.method2751();
		Static207.aClass104_115.method2751();
		Static151.aClass104_90.method2751();
		Static283.aClass104_148.method2751();
		Static28.aClass104_22.method2751();
		Static14.aClass104_10.method2751();
		Static67.aClass104_109.method2751();
		Static304.aClass104_160.method2751();
		Static278.aClass104_146.method2751();
		Static36.aClass104_26.method2751();
		Static213.aClass104_119.method2751();
		Static24.aClass104_33.method2751();
		Static299.aClass104_153.method2751();
		Static92.aClass104_63.method2751();
		Static19.aClass104_14.method2751();
		Static309.aClass104_162.method2751();
		Static159.aClass104_78.method2751();
		Static358.aClass104_193.method2751();
		Static251.aClass104_135.method2751();
		Static288.aClass107_44.method3015();
		Static213.aClass107_28.method3015();
		Static304.aClass107_50.method3015();
		Static345.aClass107_56.method3015();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I[IBJ)Ljava/lang/String;")
	public static String method1023(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long arg2) {
		if (Static152.anInterface6_1 != null) {
			@Pc(12) String local12 = Static152.anInterface6_1.method937(arg1, arg2, arg0);
			if (local12 != null) {
				return local12;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIZ)V")
	public static void method1024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(10) Class2_Sub37 local10 = (Class2_Sub37) Static309.aClass180_41.method4919(); local10 != null; local10 = (Class2_Sub37) Static309.aClass180_41.method4916()) {
			Static336.method5476(arg0, arg2, local10, arg1, arg3);
		}
		for (@Pc(35) Class2_Sub37 local35 = (Class2_Sub37) Static120.aClass180_2.method4919(); local35 != null; local35 = (Class2_Sub37) Static120.aClass180_2.method4916()) {
			@Pc(39) byte local39 = 1;
			@Pc(44) Class142 local44 = local35.aClass1_Sub2_Sub3_Sub2_1.method5778();
			if (local35.aClass1_Sub2_Sub3_Sub2_1.aBoolean613) {
				local39 = 0;
			} else if (local44.anInt4869 == local35.aClass1_Sub2_Sub3_Sub2_1.anInt6901 || local35.aClass1_Sub2_Sub3_Sub2_1.anInt6901 == local44.anInt4870 || local35.aClass1_Sub2_Sub3_Sub2_1.anInt6901 == local44.anInt4881 || local44.anInt4873 == local35.aClass1_Sub2_Sub3_Sub2_1.anInt6901) {
				local39 = 2;
			} else if (local35.aClass1_Sub2_Sub3_Sub2_1.anInt6901 == local44.anInt4879 || local35.aClass1_Sub2_Sub3_Sub2_1.anInt6901 == local44.anInt4895 || local35.aClass1_Sub2_Sub3_Sub2_1.anInt6901 == local44.anInt4893 || local35.aClass1_Sub2_Sub3_Sub2_1.anInt6901 == local44.anInt4866) {
				local39 = 3;
			}
			if (local39 != local35.anInt5750) {
				@Pc(123) int local123 = Static57.method1228(local35.aClass1_Sub2_Sub3_Sub2_1);
				if (local123 != local35.anInt5746) {
					if (local35.aClass2_Sub11_Sub4_3 != null) {
						Static31.aClass2_Sub11_Sub3_1.method4110(local35.aClass2_Sub11_Sub4_3);
						local35.aClass2_Sub11_Sub4_3 = null;
					}
					local35.anInt5746 = local123;
				}
				local35.anInt5750 = local39;
			}
			local35.anInt5748 = local35.aClass1_Sub2_Sub3_Sub2_1.anInt6893;
			local35.anInt5741 = local35.aClass1_Sub2_Sub3_Sub2_1.anInt6893 + local35.aClass1_Sub2_Sub3_Sub2_1.method5787() * 64;
			local35.anInt5751 = local35.aClass1_Sub2_Sub3_Sub2_1.anInt6888;
			local35.anInt5752 = local35.aClass1_Sub2_Sub3_Sub2_1.anInt6888 + local35.aClass1_Sub2_Sub3_Sub2_1.method5787() * 64;
			Static336.method5476(arg0, arg2, local35, arg1, arg3);
		}
		for (@Pc(202) Class2_Sub37 local202 = (Class2_Sub37) Static13.aClass41_1.method896(); local202 != null; local202 = (Class2_Sub37) Static13.aClass41_1.method904()) {
			@Pc(206) byte local206 = 1;
			@Pc(211) Class142 local211 = local202.aClass1_Sub2_Sub3_Sub1_2.method5778();
			if (local202.aClass1_Sub2_Sub3_Sub1_2.aBoolean613) {
				local206 = 0;
			} else if (local211.anInt4869 == local202.aClass1_Sub2_Sub3_Sub1_2.anInt6901 || local202.aClass1_Sub2_Sub3_Sub1_2.anInt6901 == local211.anInt4870 || local211.anInt4881 == local202.aClass1_Sub2_Sub3_Sub1_2.anInt6901 || local211.anInt4873 == local202.aClass1_Sub2_Sub3_Sub1_2.anInt6901) {
				local206 = 2;
			} else if (local202.aClass1_Sub2_Sub3_Sub1_2.anInt6901 == local211.anInt4879 || local211.anInt4895 == local202.aClass1_Sub2_Sub3_Sub1_2.anInt6901 || local211.anInt4893 == local202.aClass1_Sub2_Sub3_Sub1_2.anInt6901 || local211.anInt4866 == local202.aClass1_Sub2_Sub3_Sub1_2.anInt6901) {
				local206 = 3;
			}
			if (local202.anInt5750 != local206) {
				@Pc(294) int local294 = Static1.method4431(local202.aClass1_Sub2_Sub3_Sub1_2);
				if (local202.anInt5746 != local294) {
					if (local202.aClass2_Sub11_Sub4_3 != null) {
						Static31.aClass2_Sub11_Sub3_1.method4110(local202.aClass2_Sub11_Sub4_3);
						local202.aClass2_Sub11_Sub4_3 = null;
					}
					local202.anInt5746 = local294;
				}
				local202.anInt5750 = local206;
			}
			local202.anInt5748 = local202.aClass1_Sub2_Sub3_Sub1_2.anInt6893;
			local202.anInt5741 = local202.aClass1_Sub2_Sub3_Sub1_2.anInt6893 + local202.aClass1_Sub2_Sub3_Sub1_2.method5787() * 64;
			local202.anInt5751 = local202.aClass1_Sub2_Sub3_Sub1_2.anInt6888;
			local202.anInt5752 = local202.aClass1_Sub2_Sub3_Sub1_2.anInt6888 + local202.aClass1_Sub2_Sub3_Sub1_2.method5787() * 64;
			Static336.method5476(arg0, arg2, local202, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)I")
	public static int method1026(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)Lclient!fb;")
	public static Class2_Sub9_Sub4 method1027() {
		@Pc(12) Class2_Sub9_Sub4 local12 = (Class2_Sub9_Sub4) Static148.aClass129_7.method3577();
		if (local12 != null) {
			local12.method5723();
			local12.method5600();
			return local12;
		}
		do {
			local12 = (Class2_Sub9_Sub4) Static77.aClass129_2.method3577();
			if (local12 == null) {
				return null;
			}
			if (local12.method1793() > Static22.method285()) {
				return null;
			}
			local12.method5723();
			local12.method5600();
		} while ((local12.aLong211 & Long.MIN_VALUE) == 0L);
		return local12;
	}
}
