import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!hn", name = "P", descriptor = "Lclient!ph;")
	public static Class138 aClass138_36;

	@OriginalMember(owner = "client!hn", name = "Q", descriptor = "Lclient!qf;")
	public static Class146 aClass146_9;

	@OriginalMember(owner = "client!hn", name = "V", descriptor = "I")
	public static int anInt2119;

	@OriginalMember(owner = "client!hn", name = "Z", descriptor = "I")
	public static int anInt2121;

	@OriginalMember(owner = "client!hn", name = "T", descriptor = "I")
	public static int anInt2117 = 0;

	@OriginalMember(owner = "client!hn", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString83 = " is already on your friend list.";

	@OriginalMember(owner = "client!hn", name = "Y", descriptor = "Z")
	public static boolean aBoolean159 = true;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!sb;Z)Lclient!al;")
	public static Class12_Sub1 method1766(@OriginalArg(0) Class1_Sub14 arg0) {
		return new Class12_Sub1(arg0.method2623(), arg0.method2623(), arg0.method2623(), arg0.method2623(), arg0.method2588(), arg0.method2588(), arg0.method2595());
	}

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "(B)[Lclient!ln;")
	public static Class1_Sub1_Sub3_Sub2[] method1767() {
		@Pc(14) Class1_Sub1_Sub3_Sub2[] local14 = new Class1_Sub1_Sub3_Sub2[Static194.anInt3940];
		for (@Pc(16) int local16 = 0; local16 < Static194.anInt3940; local16++) {
			@Pc(27) int local27 = Static134.anIntArray220[local16] * Static255.anIntArray450[local16];
			@Pc(31) byte[] local31 = Static255.aByteArrayArray15[local16];
			@Pc(34) int[] local34 = new int[local27];
			for (@Pc(36) int local36 = 0; local36 < local27; local36++) {
				local34[local36] = Static40.anIntArray59[local31[local36] & 0xFF];
			}
			local14[local16] = new Class1_Sub1_Sub3_Sub2(Static268.anInt5936, Static110.anInt2184, Static201.anIntArray327[local16], Static148.anIntArray242[local16], Static134.anIntArray220[local16], Static255.anIntArray450[local16], local34);
		}
		Static295.method4395();
		return local14;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)Lclient!tg;")
	public static Class1_Sub1_Sub21 method1768(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub1_Sub21 local12 = (Class1_Sub1_Sub21) Static69.aClass58_4.method1233((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(35) byte[] local35;
		if (arg0 >= 32768) {
			local35 = Static290.aClass138_80.method3346(0, arg0 & 0x7FFF);
		} else {
			local35 = Static195.aClass138_52.method3346(0, arg0);
		}
		local12 = new Class1_Sub1_Sub21();
		if (local35 != null) {
			local12.method4011(new Class1_Sub14(local35));
		}
		if (arg0 >= 32768) {
			local12.method4001();
		}
		Static69.aClass58_4.method1229((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "(I)V")
	public static void method1769() {
		Static137.aClass1_Sub14_Sub1_6.method2661(64);
		Static137.aClass1_Sub14_Sub1_6.method2631(0);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method1770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}
}
