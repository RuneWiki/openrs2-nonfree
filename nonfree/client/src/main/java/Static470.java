import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!qn", name = "L", descriptor = "Lclient!rfa;")
	public static Class298 aClass298_1;

	@OriginalMember(owner = "client!qn", name = "H", descriptor = "Lclient!ow;")
	public static final Class260 aClass260_8 = new Class260("", 15);

	@OriginalMember(owner = "client!qn", name = "N", descriptor = "[I")
	public static final int[] anIntArray544 = new int[5];

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method6339(@OriginalArg(0) String arg0) {
		@Pc(6) Class2_Sub40 local6 = Static123.method1776();
		local6.aClass2_Sub22_Sub2_2.method8537(Static582.aClass314_14.anInt8556);
		local6.aClass2_Sub22_Sub2_2.method8500(0);
		@Pc(21) int local21 = local6.aClass2_Sub22_Sub2_2.anInt10247;
		local6.aClass2_Sub22_Sub2_2.method8500(631);
		@Pc(32) int[] local32 = Static267.method3748(local6);
		@Pc(36) int local36 = local6.aClass2_Sub22_Sub2_2.anInt10247;
		local6.aClass2_Sub22_Sub2_2.method8540(arg0);
		local6.aClass2_Sub22_Sub2_2.method8537(Static483.anInt7694);
		local6.aClass2_Sub22_Sub2_2.anInt10247 += 7;
		local6.aClass2_Sub22_Sub2_2.method8550(local32, local6.aClass2_Sub22_Sub2_2.anInt10247, local36);
		local6.aClass2_Sub22_Sub2_2.method8517(local6.aClass2_Sub22_Sub2_2.anInt10247 - local21);
		Static528.method7295(local6);
		Static483.anInt7693 = 0;
		Static304.anInt10284 = -3;
		Static514.anInt8562 = 0;
		Static66.anInt10109 = 1;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(IBI)Z")
	public static boolean method6341(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
