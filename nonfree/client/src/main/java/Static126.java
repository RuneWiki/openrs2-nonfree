import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "Lclient!la;")
	public static Class17 aClass17_41;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "Lclient!mb;")
	public static Class4_Sub4_Sub5_Sub3_Sub1 aClass4_Sub4_Sub5_Sub3_Sub1_6;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "[I")
	public static int[] anIntArray396 = new int[100];

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "Z")
	public static boolean aBoolean156 = false;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
	public static int anInt2731 = 0;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "Lclient!v;")
	public static Class76 aClass76_1285 = Static134.method2017("gelb:");

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "[Lclient!v;")
	public static Class76[] aClass76Array27 = new Class76[1000];

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
	public static int anInt2734 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZLclient!nd;)V")
	public static void method1909(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class4_Sub14 arg1) {
		@Pc(6) int local6 = arg1.anInt1980;
		@Pc(10) int local10 = (int) arg1.aLong99;
		arg1.method2004();
		if (arg0) {
			Static34.method617(local6);
		}
		Static57.method997(local6);
		@Pc(33) Class4_Sub8 local33 = Static52.method946(local10);
		if (local33 != null) {
			Static63.method1095(local33);
		}
		Static32.aBoolean56 = false;
		Static10.anInt206 = 0;
		Static3.method1526(Static36.anInt1035, Static9.anInt175, Static13.anInt230, Static42.anInt1164);
		if (Static6.anInt132 != -1) {
			Static6.method85(1, Static6.anInt132);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([Lclient!na;IIII[BI)V")
	public static void method1910(@OriginalArg(0) Class50[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5) {
		@Pc(20) int local20;
		for (@Pc(12) int local12 = 0; local12 < 4; local12++) {
			for (@Pc(16) int local16 = 0; local16 < 64; local16++) {
				for (local20 = 0; local20 < 64; local20++) {
					if (local16 + arg5 > 0 && local16 + arg5 < 103 && arg3 + local20 > 0 && local20 + arg3 < 103) {
						arg0[local12].anIntArrayArray16[local16 + arg5][arg3 + local20] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(91) Class4_Sub10 local91 = new Class4_Sub10(arg4);
		for (local20 = 0; local20 < 4; local20++) {
			for (@Pc(97) int local97 = 0; local97 < 64; local97++) {
				for (@Pc(101) int local101 = 0; local101 < 64; local101++) {
					Static130.method1945(local91, arg2, 0, local101 + arg3, local20, arg1, arg5 + local97);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
	public static void method1911() {
		anIntArray396 = null;
		aClass76_1285 = null;
		aClass4_Sub4_Sub5_Sub3_Sub1_6 = null;
		aClass76Array27 = null;
		aClass17_41 = null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)Z")
	public static boolean method1912(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}
}
