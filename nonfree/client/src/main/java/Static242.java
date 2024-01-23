import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!rj", name = "D", descriptor = "Lclient!rk;")
	public static Class62 aClass62_1;

	@OriginalMember(owner = "client!rj", name = "F", descriptor = "Lclient!ph;")
	public static Class138 aClass138_65;

	@OriginalMember(owner = "client!rj", name = "G", descriptor = "Lclient!of;")
	public static Class1_Sub1_Sub16 aClass1_Sub1_Sub16_7;

	@OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
	public static int anInt4865;

	@OriginalMember(owner = "client!rj", name = "L", descriptor = "[I")
	public static int[] anIntArray439;

	@OriginalMember(owner = "client!rj", name = "M", descriptor = "Lclient!ph;")
	public static Class138 aClass138_66;

	@OriginalMember(owner = "client!rj", name = "z", descriptor = "Lclient!th;")
	public static Class169 aClass169_131 = new Class169(64);

	@OriginalMember(owner = "client!rj", name = "C", descriptor = "Z")
	public static boolean aBoolean347 = false;

	@OriginalMember(owner = "client!rj", name = "I", descriptor = "[I")
	public static int[] anIntArray438 = new int[2];

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBI)V")
	public static void method3781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub1_Sub2 local15 = Static46.method824(14, arg1);
		local15.method294();
		local15.anInt293 = arg0;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!ph;)V")
	public static void method3783(@OriginalArg(1) Class138 arg0) {
		Static37.anInt758 = arg0.method3331("p11_full");
		Static73.anInt1413 = arg0.method3331("p12_full");
		Static177.anInt2086 = arg0.method3331("b12_full");
		Static255.anInt4978 = arg0.method3331("hitmarks");
		Static274.anInt5246 = arg0.method3331("hitbar_default");
		Static91.anInt1744 = arg0.method3331("headicons_pk");
		Static164.anInt3445 = arg0.method3331("headicons_prayer");
		Static247.anInt4897 = arg0.method3331("hint_headicons");
		Static110.anInt2183 = arg0.method3331("hint_mapmarkers");
		Static297.anInt5627 = arg0.method3331("mapflag");
		Static207.anInt4077 = arg0.method3331("cross");
		Static199.anInt4004 = arg0.method3331("mapdots");
		Static55.anInt1098 = arg0.method3331("scrollbar");
		anInt4865 = arg0.method3331("name_icons");
		Static200.anInt5632 = arg0.method3331("floorshadows");
		Static191.anInt3920 = arg0.method3331("compass");
		Static39.anInt792 = arg0.method3331("hint_mapedge");
	}
}
