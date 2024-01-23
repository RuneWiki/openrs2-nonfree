import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
	public static int anInt2417;

	@OriginalMember(owner = "client!ja", name = "G", descriptor = "Lclient!ee;")
	public static Class41 aClass41_1 = new Class41();

	@OriginalMember(owner = "client!ja", name = "J", descriptor = "I")
	public static int anInt2421 = 0;

	@OriginalMember(owner = "client!ja", name = "K", descriptor = "[I")
	public static int[] anIntArray288 = new int[100];

	@OriginalMember(owner = "client!ja", name = "L", descriptor = "J")
	public static long aLong99 = 0L;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!rg;B)V")
	public static void method2164(@OriginalArg(0) Class151 arg0) {
		@Pc(8) int local8 = arg0.anInt4797;
		if (local8 == 324) {
			if (Static255.anInt5255 == -1) {
				Static231.anInt4498 = arg0.anInt4750;
				Static255.anInt5255 = arg0.anInt4772;
			}
			if (Static44.aClass131_1.aBoolean282) {
				arg0.anInt4772 = Static255.anInt5255;
			} else {
				arg0.anInt4772 = Static231.anInt4498;
			}
		} else if (local8 == 325) {
			if (Static255.anInt5255 == -1) {
				Static255.anInt5255 = arg0.anInt4772;
				Static231.anInt4498 = arg0.anInt4750;
			}
			if (Static44.aClass131_1.aBoolean282) {
				arg0.anInt4772 = Static231.anInt4498;
			} else {
				arg0.anInt4772 = Static255.anInt5255;
			}
		} else if (local8 == 327) {
			arg0.anInt4729 = 150;
			arg0.anInt4801 = (int) (Math.sin((double) Static124.anInt2371 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt4737 = 5;
			arg0.anInt4806 = -1;
		} else if (local8 == 328) {
			if (Static136.aClass10_Sub5_Sub1_1.aString124 == null) {
				arg0.anInt4767 = 0;
				arg0.anInt4806 = 0;
			} else {
				arg0.anInt4729 = 150;
				arg0.anInt4801 = (int) (Math.sin((double) Static124.anInt2371 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt4737 = 5;
				arg0.anInt4806 = 2047;
				arg0.anInt4767 = Static113.method1827(Static136.aClass10_Sub5_Sub1_1.aString124);
				arg0.anInt4768 = Static136.aClass10_Sub5_Sub1_1.anInt5020;
				arg0.anInt4805 = Static136.aClass10_Sub5_Sub1_1.anInt5066;
				arg0.anInt4765 = Static136.aClass10_Sub5_Sub1_1.anInt5025;
				arg0.anInt4736 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
	public static void method2165() {
		Static274.aClass98_44.method2572();
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "([BB)Z")
	public static boolean method2166(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class3_Sub26 local14 = new Class3_Sub26(arg0);
		@Pc(18) int local18 = local14.method3915();
		if (local18 != 1) {
			return false;
		}
		@Pc(35) boolean local35 = local14.method3915() == 1;
		if (local35) {
			Static239.method4065(local14);
		}
		Static10.method157(local14);
		return true;
	}

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
	public static void method2168() {
		Static153.aClass98_21.method2572();
		Static304.aClass98_46.method2572();
	}
}
