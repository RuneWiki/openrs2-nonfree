import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!iha", name = "O", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_81 = new Class73(65, -1);

	@OriginalMember(owner = "client!iha", name = "bb", descriptor = "Lclient!lga;")
	public static Class185 aClass185_54 = new Class185(73, 8);

	@OriginalMember(owner = "client!iha", name = "hb", descriptor = "I")
	public static int anInt5322 = 0;

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Ljava/lang/String;II)Lclient!cda;")
	public static Class45 method4372(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class45 local8;
		try {
			local8 = (Class45) Class.forName("Class45_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(10) Throwable local10) {
			local8 = new Class45_Sub1();
		}
		local8.anInt10756 = arg1;
		local8.aString116 = arg0;
		return local8;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IIB)Z")
	public static boolean method4373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | Static151.method3035(arg0, arg1) || Static405.method6339(arg0, arg1);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(B)V")
	public static void method4374() {
		@Pc(5) Class94 local5 = Static521.aClass94_62;
		synchronized (Static521.aClass94_62) {
			Static521.aClass94_62.method2964();
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(ILclient!em;IIIIILclient!ha;IIII)V")
	public static void method4375(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub5_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class5 arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg6 > arg10 && arg6 < arg3 + arg10 && arg8 > arg4 - 13 && arg8 < arg4 + 3 && arg1.aBoolean253) {
			arg9 = arg2;
		}
		@Pc(32) int[] local32 = null;
		if (Static578.method8033(arg1.anInt3240)) {
			local32 = Static356.aClass221_1.method5923((int) arg1.aLong78).anIntArray469;
		} else if (arg1.anInt3239 != -1) {
			local32 = Static356.aClass221_1.method5923(arg1.anInt3239).anIntArray469;
		} else if (Static74.method2090(arg1.anInt3240)) {
			@Pc(101) Class6_Sub42 local101 = (Class6_Sub42) Static461.aClass380_35.method8747((long) (int) arg1.aLong78);
			if (local101 != null) {
				@Pc(106) Class9_Sub4_Sub2_Sub1_Sub1 local106 = local101.aClass9_Sub4_Sub2_Sub1_Sub1_1;
				@Pc(109) Class158 local109 = local106.aClass158_1;
				if (local109.anIntArray260 != null) {
					local109 = local109.method4867(Static140.aClass157_1);
				}
				if (local109 != null) {
					local32 = local109.anIntArray262;
				}
			}
		} else if (Static340.method5667(arg1.anInt3240)) {
			@Pc(66) Class356 local66;
			if (arg1.anInt3240 == 1009) {
				local66 = Static249.aClass310_1.method7474((int) arg1.aLong78);
			} else {
				local66 = Static249.aClass310_1.method7474((int) (arg1.aLong78 >>> 32 & 0x7FFFFFFFL));
			}
			if (local66.anIntArray545 != null) {
				local66 = local66.method8322(Static140.aClass157_1);
			}
			if (local66 != null) {
				local32 = local66.anIntArray546;
			}
		}
		@Pc(143) String local143 = Static159.method3114(arg1);
		if (local32 != null) {
			local143 = local143 + Static591.method8148(local32);
		}
		Static537.aClass34_12.method8600(arg4, Static92.anIntArray89, local143, arg9, arg10 + 3, Static388.aClass4Array10);
		if (arg1.aBoolean252) {
			Static295.aClass4_14.method7698(Static2.aClass213_9.method5831(local143) + arg10 + 5, arg4 + -12);
		}
	}
}
