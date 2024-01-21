import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "Lclient!pa;")
	public static Class1_Sub12_Sub2 aClass1_Sub12_Sub2_1;

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray30 = new boolean[8];

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "Lclient!dd;")
	public static Class13 aClass13_729 = Static161.method2971("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "Lclient!dd;")
	public static Class13 aClass13_730 = Static161.method2971("Hidden)2use");

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
	public static int anInt2153 = -1;

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
	public static int anInt2154 = 0;

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
	public static int anInt2157 = 0;

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "Lclient!dd;")
	public static Class13 aClass13_731 = Static161.method2971("");

	@OriginalMember(owner = "client!ii", name = "v", descriptor = "Lclient!dd;")
	public static Class13 aClass13_732 = Static161.method2971("titlebox");

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "Lclient!dd;")
	public static Class13 aClass13_733 = Static161.method2971("::fps ");

	@OriginalMember(owner = "client!ii", name = "A", descriptor = "Lclient!dd;")
	public static Class13 aClass13_734 = Static161.method2971("Texturen geladen)3");

	@OriginalMember(owner = "client!ii", name = "C", descriptor = "Lclient!dd;")
	public static Class13 aClass13_735 = Static161.method2971("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
	public static void method1583() {
		aClass13_731 = null;
		aBooleanArray30 = null;
		aClass13_734 = null;
		aClass13_735 = null;
		aClass1_Sub12_Sub2_1 = null;
		aClass13_733 = null;
		aClass13_732 = null;
		aClass13_729 = null;
		aClass13_730 = null;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBILclient!ag;)[Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3[] method1584(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4 arg2) {
		return Static15.method624(arg1, arg2, arg0) ? Static84.method1798() : null;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BLclient!ag;Lclient!ae;ZLclient!ag;)V")
	public static void method1586(@OriginalArg(1) Class4 arg0, @OriginalArg(2) Class1_Sub2_Sub1_Sub1_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class4 arg3) {
		Static83.aClass4_56 = arg0;
		Static43.aClass4_42 = arg3;
		Static48.aBoolean111 = arg2;
		Static109.anInt2975 = Static43.aClass4_42.method2260(10);
		Static11.aClass1_Sub2_Sub1_Sub1_Sub1_1 = arg1;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)J")
	public static long method1587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub10 local7 = Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1544; local13++) {
			@Pc(19) Class59 local19 = local7.aClass59Array4[local13];
			if ((local19.aLong106 >> 29 & 0x3L) == 2L && local19.anInt3133 == arg1 && local19.anInt3130 == arg2) {
				return local19.aLong106;
			}
		}
		return 0L;
	}
}
