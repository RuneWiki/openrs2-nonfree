import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
	public static int anInt6364;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)V", line = 6)
	public static void method5768(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static307.aClass67ArrayArrayArray3 = Static84.aClass67ArrayArrayArray4;
			Static340.aClass6Array4 = Static174.aClass6Array2;
		} else {
			Static307.aClass67ArrayArrayArray3 = Static364.aClass67ArrayArrayArray5;
			Static340.aClass6Array4 = Static307.aClass6Array3;
		}
		Static86.anInt1912 = Static307.aClass67ArrayArrayArray3.length;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)I", line = 23)
	public static int method5769(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBLjava/lang/String;)V", line = 36)
	public static void method5770(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Class28.anInt751;
		@Pc(9) int[] local9 = Class64.anIntArray121;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class11_Sub5_Sub2_Sub1 local21 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local9[local13]];
			if (local21 != null && Static17.aClass11_Sub5_Sub2_Sub1_3 != local21 && local21.aString41 != null && local21.aString41.equalsIgnoreCase(arg1)) {
				if (arg0 == 1) {
					Static85.method1962(Class2.aClass145_267);
					Class14.aClass2_Sub4_Sub2_4.method4843(0);
					Class14.aClass2_Sub4_Sub2_4.method4839(local9[local13]);
				} else if (arg0 == 4) {
					Static85.method1962(Class3.aClass145_7);
					Class14.aClass2_Sub4_Sub2_4.method4815(0);
					Class14.aClass2_Sub4_Sub2_4.method4831(local9[local13]);
				} else if (arg0 == 5) {
					Static85.method1962(RuntimeException_Sub1.aClass145_92);
					Class14.aClass2_Sub4_Sub2_4.method4831(local9[local13]);
					Class14.aClass2_Sub4_Sub2_4.method4820(0);
				} else if (arg0 == 6) {
					Static85.method1962(Class2_Sub18.aClass145_102);
					Class14.aClass2_Sub4_Sub2_4.method4831(local9[local13]);
					Class14.aClass2_Sub4_Sub2_4.method4828(0);
				} else if (arg0 == 7) {
					Static85.method1962(Class18.aClass145_25);
					Class14.aClass2_Sub4_Sub2_4.method4820(0);
					Class14.aClass2_Sub4_Sub2_4.method4839(local9[local13]);
				}
				local11 = true;
				break;
			}
		}
		if (!local11) {
			Static193.method3701(Class97.aClass79_60.method2269(Class197.anInt5569) + arg1);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I[IIJ)Ljava/lang/String;", line = 117)
	public static String method5771(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		if (Class218.anInterface9_1 != null) {
			@Pc(17) String local17 = Class218.anInterface9_1.method2362(arg2, arg0, arg1);
			if (local17 != null) {
				return local17;
			}
		}
		return Long.toString(arg2);
	}
}
