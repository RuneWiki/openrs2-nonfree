import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
	public static int anInt4207;

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "Lclient!sc;")
	public static Class153 aClass153_5;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
	public static int anInt4209 = 0;

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "Lclient!il;")
	public static Class86 aClass86_27 = new Class86(8);

	@OriginalMember(owner = "client!qe", name = "o", descriptor = "[F")
	public static float[] aFloatArray28 = new float[4];

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Z)V")
	public static void method3620(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		Static261.anInt4828 = arg0;
		Static98.aString72 = arg1;
		Static124.aString23 = arg2;
		if (Static124.aString23.equals("") || Static98.aString72.equals("")) {
			Static13.anInt282 = 3;
		} else if (Static124.anInt596 == -1) {
			Static231.anInt4320 = 0;
			Static100.anInt5570 = 0;
			Static13.anInt282 = -3;
			Static189.anInt3669 = 1;
			@Pc(43) Class1_Sub13 local43 = new Class1_Sub13(128);
			local43.method1822(10);
			local43.method1851((int) (Math.random() * 9.9999999E7D));
			local43.method1857(Static282.method4276(Static124.aString23));
			local43.method1851((int) (Math.random() * 9.9999999E7D));
			local43.method1852(Static98.aString72);
			local43.method1851((int) (Math.random() * 9.9999999E7D));
			local43.method1854(Static299.aBigInteger2, Static265.aBigInteger1);
			Static116.aClass1_Sub13_Sub1_48.anInt2018 = 0;
			Static116.aClass1_Sub13_Sub1_48.method1822(24);
			Static116.aClass1_Sub13_Sub1_48.method1822(local43.anInt2018 + 2);
			Static116.aClass1_Sub13_Sub1_48.method1835(548);
			Static116.aClass1_Sub13_Sub1_48.method1864(local43.aByteArray63, local43.anInt2018);
		} else {
			Static19.method319();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLclient!si;)V")
	public static void method3621(@OriginalArg(1) Class157 arg0) {
		if (Static101.anInt2153 == arg0.anInt4723) {
			Static166.aBooleanArray11[arg0.anInt4752] = true;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!nm;I)V")
	public static void method3622(@OriginalArg(0) Class119 arg0) {
		Static69.aClass119_23 = arg0;
	}
}
