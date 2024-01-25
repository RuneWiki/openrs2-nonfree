import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_16 = new Class179(23, 3);

	@OriginalMember(owner = "client!cq", name = "o", descriptor = "I")
	public static final int anInt1419 = 50;

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "[I")
	public static final int[] anIntArray112 = new int[anInt1419];

	@OriginalMember(owner = "client!cq", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[anInt1419];

	@OriginalMember(owner = "client!cq", name = "i", descriptor = "Z")
	public static boolean aBoolean117 = false;

	@OriginalMember(owner = "client!cq", name = "j", descriptor = "[I")
	public static final int[] anIntArray113 = new int[anInt1419];

	@OriginalMember(owner = "client!cq", name = "k", descriptor = "[I")
	public static final int[] anIntArray114 = new int[anInt1419];

	@OriginalMember(owner = "client!cq", name = "l", descriptor = "[I")
	public static final int[] anIntArray115 = new int[anInt1419];

	@OriginalMember(owner = "client!cq", name = "n", descriptor = "[I")
	public static final int[] anIntArray116 = new int[anInt1419];

	@OriginalMember(owner = "client!cq", name = "p", descriptor = "[I")
	public static final int[] anIntArray117 = new int[anInt1419];

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;II)V")
	public static void method1109(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub40 local8 = Static123.method1776();
		local8.aClass2_Sub22_Sub2_2.method8537(Static582.aClass314_9.anInt8556);
		local8.aClass2_Sub22_Sub2_2.method8500(0);
		@Pc(23) int local23 = local8.aClass2_Sub22_Sub2_2.anInt10247;
		local8.aClass2_Sub22_Sub2_2.method8500(631);
		@Pc(32) int[] local32 = Static267.method3748(local8);
		@Pc(36) int local36 = local8.aClass2_Sub22_Sub2_2.anInt10247;
		local8.aClass2_Sub22_Sub2_2.method8540(arg0);
		local8.aClass2_Sub22_Sub2_2.method8500(Static380.anInt5916);
		local8.aClass2_Sub22_Sub2_2.method8540(arg2);
		local8.aClass2_Sub22_Sub2_2.method8509(Static528.aLong234);
		local8.aClass2_Sub22_Sub2_2.method8537(Static483.anInt7694);
		local8.aClass2_Sub22_Sub2_2.method8537(Static189.aClass375_5.anInt10144);
		Static316.method4248(local8.aClass2_Sub22_Sub2_2);
		@Pc(77) String local77 = Static322.aString56;
		local8.aClass2_Sub22_Sub2_2.method8537(local77 == null ? 0 : 1);
		if (local77 != null) {
			local8.aClass2_Sub22_Sub2_2.method8540(local77);
		}
		local8.aClass2_Sub22_Sub2_2.method8537(arg3);
		local8.aClass2_Sub22_Sub2_2.method8537(arg1 ? 1 : 0);
		local8.aClass2_Sub22_Sub2_2.anInt10247 += 7;
		local8.aClass2_Sub22_Sub2_2.method8550(local32, local8.aClass2_Sub22_Sub2_2.anInt10247, local36);
		local8.aClass2_Sub22_Sub2_2.method8517(local8.aClass2_Sub22_Sub2_2.anInt10247 - local23);
		Static528.method7295(local8);
		Static514.anInt8562 = 0;
		Static66.anInt10109 = 1;
		Static304.anInt10284 = -3;
		Static483.anInt7693 = 0;
		if (arg3 < 13) {
			Static340.aBoolean387 = true;
			Static251.method3442();
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method1111(@OriginalArg(1) Class95 arg0) {
		if (Static349.anInt5482 != Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127 && (Static28.aClass53ArrayArrayArray1 != null && Static509.method7175(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127, arg0))) {
			Static349.anInt5482 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127;
		}
	}
}
