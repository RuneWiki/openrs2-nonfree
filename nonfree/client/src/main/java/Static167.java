import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "F")
	public static float aFloat85;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	public static int anInt3497;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
	public static int anInt3493 = 0;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BIII)V")
	public static void method2958(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(32) String local32 = "::tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local32);
		Static197.method3198(local32);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!fh;I)V")
	public static void method2959(@OriginalArg(0) Class58 arg0) {
		Static48.anInt914 = arg0.method1362("p11_full");
		Static312.anInt6044 = arg0.method1362("p12_full");
		Static170.anInt3309 = arg0.method1362("b12_full");
		Static99.anInt2120 = arg0.method1362("hitmarks");
		Static227.anInt4364 = arg0.method1362("hitbar_default");
		Static221.anInt4282 = arg0.method1362("headicons_pk");
		Static85.anInt1975 = arg0.method1362("headicons_prayer");
		Static214.anInt4207 = arg0.method1362("hint_headicons");
		Static281.anInt5333 = arg0.method1362("hint_mapmarkers");
		Static275.anInt5231 = arg0.method1362("mapflag");
		Static245.anInt3786 = arg0.method1362("cross");
		Static113.anInt2296 = arg0.method1362("mapdots");
		Static212.anInt4163 = arg0.method1362("scrollbar");
		Static124.anInt2449 = arg0.method1362("name_icons");
		Static73.anInt1632 = arg0.method1362("floorshadows");
		Static9.anInt130 = arg0.method1362("compass");
		Static228.anInt4372 = arg0.method1362("hint_mapedge");
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZIIII)V")
	public static void method2960(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static27.method384(false);
		Static71.aBoolean82 = arg0;
		Static259.anInt4954 = arg2;
		Static133.anInt2571 = arg1;
		Static121.method2409(arg3);
		Static133.aClass85_10 = new Class85(8);
		Static124.aClass85_9 = new Class85(8);
	}
}
