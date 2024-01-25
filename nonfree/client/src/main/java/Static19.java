import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
	public static int anInt432;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray3 = new boolean[100];

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "Z")
	public static boolean aBoolean57 = false;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "[I")
	public static final int[] anIntArray27 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BII)V")
	public static void method673(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg1 * Static287.anInt5818 >> 8;
		if (arg0 == -1 && !Static8.aBoolean11) {
			Static69.method1568();
		} else if (arg0 != -1 && (Static216.anInt4152 != arg0 || !Static185.method3334()) && local5 != 0 && !Static8.aBoolean11) {
			Static114.method5713(arg0, Static91.aClass191_59, local5);
		}
		Static216.anInt4152 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	public static void method674() {
		Static214.aClass4_9.method4216(Static346.aFloat78 * ((float) Static316.anInt6385 * 0.1F + 0.7F));
		Static214.aClass4_9.method4223(anInt432, Static254.aFloat69, Static109.aFloat38, (float) Static349.anInt6922, (float) Static131.anInt2733, (float) Static258.anInt5134);
		Static214.aClass4_9.method4243(Static293.aClass22_3);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	public static void method675() {
		if (Static210.anInt4066 < 0) {
			Static210.anInt4066 = 0;
			Static120.anInt2601 = -1;
			Static2.anInt62 = -1;
		}
		if (Static210.anInt4066 > Static127.anInt1564) {
			Static120.anInt2601 = -1;
			Static2.anInt62 = -1;
			Static210.anInt4066 = Static127.anInt1564;
		}
		if (Static109.anInt2412 < 0) {
			Static109.anInt2412 = 0;
			Static2.anInt62 = -1;
			Static120.anInt2601 = -1;
		}
		if (Static109.anInt2412 > Static127.anInt1566) {
			Static120.anInt2601 = -1;
			Static109.anInt2412 = Static127.anInt1566;
			Static2.anInt62 = -1;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)Lclient!or;")
	public static Class150 method676(@OriginalArg(0) int arg0) {
		@Pc(10) Class150 local10 = (Class150) Static221.aClass119_132.method3311((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static105.aClass191_69.method5459(4, arg0);
		local10 = new Class150();
		if (local20 != null) {
			local10.method4080(new Class2_Sub10(local20), arg0);
		}
		local10.method4081(arg0);
		Static221.aClass119_132.method3308(local10, (long) arg0);
		return local10;
	}
}
