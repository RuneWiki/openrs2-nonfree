import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!me", name = "t", descriptor = "Lclient!ai;")
	public static Class7 aClass7_21;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "Lclient!eh;")
	public static Class27 aClass27_68 = new Class27(30);

	@OriginalMember(owner = "client!me", name = "s", descriptor = "Lclient!kh;")
	public static Class60 aClass60_888 = Static200.method3116("b12_full");

	@OriginalMember(owner = "client!me", name = "u", descriptor = "Lclient!ff;")
	public static Class33 aClass33_7 = new Class33(32);

	@OriginalMember(owner = "client!me", name = "D", descriptor = "Lclient!kh;")
	public static Class60 aClass60_889 = Static200.method3116("Ausw-=hlen");

	@OriginalMember(owner = "client!me", name = "E", descriptor = "Lclient!kh;")
	public static Class60 aClass60_890 = Static200.method3116("");

	@OriginalMember(owner = "client!me", name = "F", descriptor = "Lclient!kh;")
	private static Class60 aClass60_891 = Static200.method3116("Connecting to update server");

	@OriginalMember(owner = "client!me", name = "G", descriptor = "Lclient!kh;")
	public static Class60 aClass60_892 = Static200.method3116("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!me", name = "H", descriptor = "Lclient!kh;")
	public static Class60 aClass60_893 = aClass60_891;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!ai;Lclient!ai;IBI)Lclient!mg;")
	public static Class1_Sub1_Sub14 method2029(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		return Static87.method1515(arg2, arg3, arg1) ? Static156.method2637(arg0.method3242(arg3, arg2)) : null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIILclient!dd;JZ)V")
	public static void method2031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class9 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class16 local6 = new Class16();
		local6.aClass9_2 = arg4;
		local6.anInt592 = arg1 * 128 + 64;
		local6.anInt588 = arg2 * 128 + 64;
		local6.anInt593 = arg3;
		local6.aLong22 = arg5;
		if (Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2] == null) {
			Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2] = new Class1_Sub22(arg0, arg1, arg2);
		}
		Static100.aClass1_Sub22ArrayArrayArray3[arg0][arg1][arg2].aClass16_1 = local6;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
	public static void method2033() {
		while (true) {
			if (Static16.aClass1_Sub9_Sub1_1.method951(Static27.anInt644) >= 11) {
				@Pc(14) int local14 = Static16.aClass1_Sub9_Sub1_1.method949(11);
				if (local14 != 2047) {
					@Pc(21) boolean local21 = false;
					if (Static41.aClass9_Sub4_Sub1Array2[local14] == null) {
						local21 = true;
						Static41.aClass9_Sub4_Sub1Array2[local14] = new Class9_Sub4_Sub1();
						if (Static104.aClass1_Sub9Array1[local14] != null) {
							Static41.aClass9_Sub4_Sub1Array2[local14].method1015(Static104.aClass1_Sub9Array1[local14]);
						}
					}
					Static124.anIntArray353[Static205.anInt4356++] = local14;
					@Pc(57) Class9_Sub4_Sub1 local57 = Static41.aClass9_Sub4_Sub1Array2[local14];
					local57.anInt3907 = Static42.anInt910;
					@Pc(67) int local67 = Static23.anIntArray334[Static16.aClass1_Sub9_Sub1_1.method949(3)];
					if (local21) {
						local57.anInt3930 = local57.anInt3913 = local67;
					}
					@Pc(80) int local80 = Static16.aClass1_Sub9_Sub1_1.method949(1);
					if (local80 == 1) {
						Static180.anIntArray502[Static192.anInt4121++] = local14;
					}
					@Pc(96) int local96 = Static16.aClass1_Sub9_Sub1_1.method949(5);
					if (local96 > 15) {
						local96 -= 32;
					}
					@Pc(107) int local107 = Static16.aClass1_Sub9_Sub1_1.method949(5);
					if (local107 > 15) {
						local107 -= 32;
					}
					@Pc(116) int local116 = Static16.aClass1_Sub9_Sub1_1.method949(1);
					local57.method2909(local96 + Static84.aClass9_Sub4_Sub1_2.anIntArray511[0], Static84.aClass9_Sub4_Sub1_2.anIntArray510[0] - -local107, local116 == 1);
					continue;
				}
			}
			Static16.aClass1_Sub9_Sub1_1.method950();
			return;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IILclient!tc;III)V")
	public static void method2036(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub23 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub17 local7 = new Class1_Sub17();
		local7.anInt2561 = arg1.anInt4034 * 128;
		local7.anIntArray323 = arg1.anIntArray525;
		@Pc(20) int local20 = arg1.anInt4024;
		local7.anInt2566 = arg0 * 128;
		local7.anInt2567 = arg1.anInt4002;
		local7.anInt2569 = arg1.anInt4010;
		local7.anInt2559 = arg3 * 128;
		local7.anInt2558 = arg2;
		local7.anInt2564 = arg1.anInt4000;
		@Pc(53) int local53 = arg1.anInt4018;
		if (arg4 == 1 || arg4 == 3) {
			local53 = arg1.anInt4024;
			local20 = arg1.anInt4018;
		}
		local7.anInt2565 = (arg3 + local53) * 128;
		local7.anInt2562 = (arg0 + local20) * 128;
		if (arg1.anIntArray526 != null) {
			local7.aClass1_Sub1_Sub23_1 = arg1;
			local7.method1927();
		}
		Static16.aClass19_2.method620(local7);
		if (local7.anIntArray323 != null) {
			local7.anInt2568 = local7.anInt2567 + (int) ((double) (local7.anInt2564 - local7.anInt2567) * Math.random());
		}
	}
}
