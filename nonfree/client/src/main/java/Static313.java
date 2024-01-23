import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "[[S")
	public static short[][] aShortArrayArray42;

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "Lclient!tl;")
	public static Class101 aClass101_2;

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "[[Lclient!qf;")
	public static Class146[][] aClass146ArrayArray1;

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "Lclient!th;")
	public static Class169 aClass169_165 = new Class169(200);

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
	public static int anInt5906 = -1;

	@OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
	public static int anInt5907 = 0;

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "Lclient!g;")
	public static Class58 aClass58_15 = new Class58(128);

	@OriginalMember(owner = "client!wk", name = "s", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray47 = new String[200];

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
	public static void method4647(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static122.aClass1_Sub17ArrayArrayArray3 = Static141.aClass1_Sub17ArrayArrayArray4;
			Static208.anIntArrayArrayArray11 = Static61.anIntArrayArrayArray5;
			Static141.aClass1_Sub20ArrayArray3 = Static273.aClass1_Sub20ArrayArray5;
		} else {
			Static122.aClass1_Sub17ArrayArrayArray3 = Static310.aClass1_Sub17ArrayArrayArray2;
			Static208.anIntArrayArrayArray11 = Static89.anIntArrayArrayArray6;
			Static141.aClass1_Sub20ArrayArray3 = Static232.aClass1_Sub20ArrayArray4;
		}
		Static68.anInt1350 = Static122.aClass1_Sub17ArrayArrayArray3.length;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)Lclient!tc;")
	public static Class167 method4648(@OriginalArg(0) int arg0) {
		@Pc(15) Class167 local15 = (Class167) Static44.aClass169_32.method4017((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(31) byte[] local31 = Static309.aClass138_90.method3346(Static297.method4446(arg0), Static85.method1252(arg0));
		local15 = new Class167();
		local15.anInt5119 = arg0;
		if (local31 != null) {
			local15.method3973(new Class1_Sub14(local31));
		}
		local15.method3972();
		Static44.aClass169_32.method4016(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIZII)V")
	public static void method4649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) Class146 local4 = Static300.method4492(arg0, arg1);
		if (local4 != null && local4.anObjectArray26 != null) {
			@Pc(14) Class1_Sub29 local14 = new Class1_Sub29();
			local14.anObjectArray32 = local4.anObjectArray26;
			local14.aClass146_16 = local4;
			Static171.method2886(local14);
		}
		Static81.anInt1490 = arg0;
		Static5.anInt69 = arg2;
		Static91.aBoolean136 = true;
		Static213.anInt4211 = arg5;
		Static49.anInt937 = arg3;
		Static234.anInt4733 = arg4;
		Static10.anInt180 = arg1;
		Static237.method2927(local4);
	}
}
