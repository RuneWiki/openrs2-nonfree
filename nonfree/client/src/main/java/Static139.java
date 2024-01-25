import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
	public static int anInt4699;

	@OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
	public static int anInt4713;

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
	public static int anInt4710 = 0;

	@OriginalMember(owner = "client!jh", name = "m", descriptor = "Lclient!p;")
	public static final Class159 aClass159_6 = new Class159();

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_137 = new Class34("K", "T", "K", "K");

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
	public static void method4223() {
		Static311.aClass1_Sub8_Sub1_8.method3234();
		@Pc(11) int local11 = Static311.aClass1_Sub8_Sub1_8.method3238(1);
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static311.aClass1_Sub8_Sub1_8.method3238(2);
		if (local19 == 0) {
			Static191.anIntArray373[Static125.anInt2818++] = 2047;
			return;
		}
		@Pc(41) int local41;
		@Pc(51) int local51;
		if (local19 == 1) {
			local41 = Static311.aClass1_Sub8_Sub1_8.method3238(3);
			Static198.aClass17_Sub1_Sub1_Sub1_3.method559(local41, 1);
			local51 = Static311.aClass1_Sub8_Sub1_8.method3238(1);
			if (local51 == 1) {
				Static191.anIntArray373[Static125.anInt2818++] = 2047;
			}
		} else if (local19 == 2) {
			if (Static311.aClass1_Sub8_Sub1_8.method3238(1) == 1) {
				local41 = Static311.aClass1_Sub8_Sub1_8.method3238(3);
				Static198.aClass17_Sub1_Sub1_Sub1_3.method559(local41, 2);
				local51 = Static311.aClass1_Sub8_Sub1_8.method3238(3);
				Static198.aClass17_Sub1_Sub1_Sub1_3.method559(local51, 2);
			} else {
				local41 = Static311.aClass1_Sub8_Sub1_8.method3238(3);
				Static198.aClass17_Sub1_Sub1_Sub1_3.method559(local41, 0);
			}
			local41 = Static311.aClass1_Sub8_Sub1_8.method3238(1);
			if (local41 == 1) {
				Static191.anIntArray373[Static125.anInt2818++] = 2047;
			}
		} else if (local19 == 3) {
			local41 = Static311.aClass1_Sub8_Sub1_8.method3238(7);
			local51 = Static311.aClass1_Sub8_Sub1_8.method3238(7);
			@Pc(156) int local156 = Static311.aClass1_Sub8_Sub1_8.method3238(1);
			Static242.anInt6745 = Static311.aClass1_Sub8_Sub1_8.method3238(2);
			@Pc(166) int local166 = Static311.aClass1_Sub8_Sub1_8.method3238(1);
			if (local166 == 1) {
				Static191.anIntArray373[Static125.anInt2818++] = 2047;
			}
			Static198.aClass17_Sub1_Sub1_Sub1_3.method560(local156 == 1, local51, Static242.anInt6745, local41);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)Lclient!fo;")
	public static Class1_Sub4_Sub9 method4227(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub4_Sub9 local15 = (Class1_Sub4_Sub9) Static226.aClass197_22.method5157((long) arg1 << 32 | (long) arg0);
		if (local15 == null) {
			local15 = new Class1_Sub4_Sub9(arg1, arg0);
			Static226.aClass197_22.method5166(local15, local15.aLong213);
		}
		return local15;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIII)V")
	public static void method4229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static80.anInt2078 == 0 || arg0 == 0 || Static225.anInt4698 >= 50 || arg1 == -1) {
			return;
		}
		Static235.anIntArray432[Static225.anInt4698] = arg1;
		Static9.anIntArray33[Static225.anInt4698] = arg0;
		Static67.anIntArray181[Static225.anInt4698] = arg3;
		Static289.aClass77Array2[Static225.anInt4698] = null;
		Static185.anIntArray363[Static225.anInt4698] = 0;
		Static114.anIntArray397[Static225.anInt4698] = arg2;
		Static225.anInt4698++;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILjava/lang/String;IBILjava/lang/String;ZZJIZ)V")
	public static void method4231(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) long arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(30) Class1_Sub8 local30 = new Class1_Sub8(128);
		local30.method4562(10);
		local30.method4542((arg5 ? 2 : 0) | (arg9 ? 1 : 0) | (arg6 ? 4 : 0));
		local30.method4560(arg7);
		local30.method4529(local8[0]);
		local30.method4531(arg4);
		local30.method4529(local8[1]);
		local30.method4542(Static163.anInt3550);
		local30.method4562(arg8);
		local30.method4562(arg2);
		local30.method4529(local8[2]);
		local30.method4542(arg3);
		local30.method4542(arg0);
		local30.method4529(local8[3]);
		local30.method4563(Static42.aBigInteger1, Static309.aBigInteger2);
		@Pc(126) Class1_Sub8 local126 = new Class1_Sub8(350);
		local126.method4531(arg1);
		@Pc(139) int local139 = 8 - Static321.method5243(arg1) % 8;
		for (@Pc(150) int local150 = 0; local150 < local139; local150++) {
			local126.method4562((int) (Math.random() * 255.0D));
		}
		local126.method4525(local8);
		Static342.aClass1_Sub8_Sub1_7.anInt5182 = 0;
		Static342.aClass1_Sub8_Sub1_7.method4562(22);
		Static342.aClass1_Sub8_Sub1_7.method4542(local30.anInt5182 + local126.anInt5182 + 2);
		Static342.aClass1_Sub8_Sub1_7.method4542(568);
		Static342.aClass1_Sub8_Sub1_7.method4513(local30.anInt5182, local30.aByteArray81);
		Static342.aClass1_Sub8_Sub1_7.method4513(local126.anInt5182, local126.aByteArray81);
		Static278.anInt5664 = 0;
		Static130.anInt2868 = 1;
		Static64.anInt1799 = 0;
		Static292.anInt4644 = -3;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)V")
	public static void method4232(@OriginalArg(0) boolean arg0) {
		if (Static137.aBoolean289 != arg0) {
			Static137.aBoolean289 = arg0;
			Static62.method1538();
		}
	}
}
