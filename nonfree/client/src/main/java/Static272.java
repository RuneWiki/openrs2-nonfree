import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static272 {

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "Lclient!mo;")
	public static Class143 aClass143_96;

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
	public static int anInt5167 = 0;

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString194 = "red:";

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
	public static int anInt5173 = 0;

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "Lclient!pq;")
	public static final Class14_Sub25 aClass14_Sub25_1 = new Class14_Sub25(0, 0);

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
	public static int anInt5176 = 0;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
	public static int anInt5177 = -50;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ff;ILclient!ff;)V")
	public static void method4613(@OriginalArg(0) Class14_Sub2 arg0, @OriginalArg(2) Class14_Sub2 arg1) {
		if (arg0.aClass14_Sub2_62 != null) {
			arg0.method5760();
		}
		arg0.aClass14_Sub2_62 = arg1;
		arg0.aClass14_Sub2_61 = arg1.aClass14_Sub2_61;
		arg0.aClass14_Sub2_62.aClass14_Sub2_61 = arg0;
		arg0.aClass14_Sub2_61.aClass14_Sub2_62 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BILclient!ah;Ljava/awt/Canvas;)Lclient!e;")
	public static Class46 method4616(@OriginalArg(1) int arg0, @OriginalArg(2) Interface2 arg1, @OriginalArg(3) Canvas arg2) {
		return new Class46_Sub1(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	public static void method4617() {
		Static145.aClass2_21 = null;
		Static3.aClass2_1 = null;
		Static191.aClass2_16 = null;
		Static140.aClass2_14 = null;
		Static63.aClass2_2 = null;
		Static85.aClass2_7 = null;
		Static94.aClass2_11 = null;
		Static339.aClass2_13 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)I")
	public static int method4618(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;I)I")
	public static int method4619(@OriginalArg(1) String arg0) {
		return Static93.method2166(16, arg0);
	}
}
