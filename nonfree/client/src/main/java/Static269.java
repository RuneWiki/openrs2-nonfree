import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!re", name = "w", descriptor = "[I")
	public static final int[] anIntArray404 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!re", name = "I", descriptor = "[S")
	public static final short[] aShortArray79 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!re", name = "K", descriptor = "Lclient!fi;")
	public static final Class2_Sub10_Sub1 aClass2_Sub10_Sub1_3 = new Class2_Sub10_Sub1(5000);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!tq;Lclient!tq;I)V")
	public static void method4864(@OriginalArg(0) Class191 arg0, @OriginalArg(1) Class191 arg1) {
		Static196.aClass191_126 = arg1;
		Static98.aClass191_63 = arg0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III)Z")
	public static boolean method4865(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class96 local12 = Static234.method4051(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local12.method2948(arg0);
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(B)I")
	public static int method4868() {
		return ((Static287.anInt5818 == 0 ? 0 : 1) << 21) + ((Static2.anInt65 == 0 ? 0 : 1) << 20) + (Static114.anInt6585 << 17) + ((Static209.aBoolean435 ? 1 : 0) << 16) + ((Static304.aBoolean545 ? 1 : 0) << 15) + ((Static348.aBoolean606 ? 1 : 0) << 13) + ((Static322.anInt6490 & 0x3) << 11) + ((Static21.aBoolean59 ? 1 : 0) << 6) + ((Static148.aBoolean262 ? 1 : 0) << 4) + (Static316.anInt6385 & 0x7) + (((Static25.aBoolean123 ? 1 : 0) << 3) - -((Static89.aBoolean169 ? 1 : 0) << 5) - (-((Static40.aBoolean79 ? 1 : 0) << 8) + -((Static315.aBoolean563 ? 1 : 0) << 9))) + ((Static201.aBoolean337 ? 1 : 0) << 10) + ((Static103.aBoolean202 ? 1 : 0) << 19) + ((Static303.anInt6082 == 0 ? 0 : 1) << 22) + (Static185.method3335() << 23) + (Static326.anInt6624 << 25) + ((Static32.aBoolean70 ? 1 : 0) << 27) + (Static84.anInt1829 << 28);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!tq;)V")
	public static void method4873(@OriginalArg(1) Class191 arg0) {
		Static197.aClass191_128 = arg0;
		Static197.aClass191_128.method5443(35);
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
	public static void method4874() {
		@Pc(1) Class119 local1 = Static139.aClass119_90;
		synchronized (Static139.aClass119_90) {
			Static139.aClass119_90.method3304();
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!dn;)Ljava/lang/String;")
	public static String method4875(@OriginalArg(1) Class2_Sub13 arg0) {
		return arg0.aString12 == null || arg0.aString12.length() <= 0 ? arg0.aString13 : arg0.aString13 + Static321.aClass93_112.method2819(Static21.anInt455) + arg0.aString12;
	}
}
