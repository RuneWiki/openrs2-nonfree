import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!mf", name = "T", descriptor = "Lclient!ae;")
	public static Class1_Sub2_Sub1_Sub1_Sub1 aClass1_Sub2_Sub1_Sub1_Sub1_6;

	@OriginalMember(owner = "client!mf", name = "lb", descriptor = "Lclient!ag;")
	public static Class4 aClass4_73;

	@OriginalMember(owner = "client!mf", name = "Z", descriptor = "Lclient!dd;")
	private static Class13 aClass13_997 = Static161.method2971("Loaded sprites");

	@OriginalMember(owner = "client!mf", name = "P", descriptor = "Lclient!dd;")
	public static Class13 aClass13_996 = aClass13_997;

	@OriginalMember(owner = "client!mf", name = "R", descriptor = "Z")
	public static boolean aBoolean222 = true;

	@OriginalMember(owner = "client!mf", name = "V", descriptor = "[I")
	public static int[] anIntArray294 = new int[5];

	@OriginalMember(owner = "client!mf", name = "W", descriptor = "Lclient!fd;")
	public static Class20 aClass20_8 = null;

	@OriginalMember(owner = "client!mf", name = "eb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_998 = Static161.method2971("sl_arrows");

	@OriginalMember(owner = "client!mf", name = "nb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1001 = Static161.method2971("flash3:");

	@OriginalMember(owner = "client!mf", name = "ib", descriptor = "Lclient!dd;")
	public static Class13 aClass13_999 = aClass13_1001;

	@OriginalMember(owner = "client!mf", name = "jb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1000 = aClass13_1001;

	@OriginalMember(owner = "client!mf", name = "kb", descriptor = "I")
	public static int anInt3013 = 0;

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)V")
	public static void method2152() {
		aClass13_1000 = null;
		aClass20_8 = null;
		aClass13_999 = null;
		aClass1_Sub2_Sub1_Sub1_Sub1_6 = null;
		anIntArray294 = null;
		aClass13_997 = null;
		aClass13_996 = null;
		aClass13_998 = null;
		aClass13_1001 = null;
		aClass4_73 = null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(JI)Lclient!dd;")
	public static Class13 method2154(@OriginalArg(0) long arg0) {
		return Static171.method2896(arg0);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I[B)[B")
	public static byte[] method2156(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local6];
		Static193.method2480(arg0, 0, local14, 0, local6);
		return local14;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!ce;Lclient!dd;)I")
	public static int method2157(@OriginalArg(1) Class1_Sub8 arg0, @OriginalArg(2) Class13 arg1) {
		@Pc(7) int local7 = arg0.anInt2195;
		arg0.method1630(arg1.anInt1080);
		arg0.anInt2195 += Static113.aClass24_1.method1348(0, arg0.anInt2195, arg1.anInt1080, arg1.aByteArray19, arg0.aByteArray27);
		return arg0.anInt2195 - local7;
	}
}
