import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
	public static int anInt3788;

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "[I")
	public static final int[] anIntArray266 = new int[32];

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZLclient!tc;)V")
	public static void method3313(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class305 arg1) {
		@Pc(17) int local17 = arg1.anInt9161 == 0 ? arg1.anInt9242 : arg1.anInt9161;
		@Pc(26) int local26 = arg1.anInt9178 == 0 ? arg1.anInt9160 : arg1.anInt9178;
		Static93.method2101(Static108.aClass305ArrayArray1[arg1.anInt9167 >> 16], local17, arg1.anInt9167, local26, arg0);
		if (arg1.aClass305Array2 != null) {
			Static93.method2101(arg1.aClass305Array2, local17, arg1.anInt9167, local26, arg0);
		}
		@Pc(59) Class3_Sub18 local59 = (Class3_Sub18) Static283.aClass25_23.method946((long) arg1.anInt9167);
		if (local59 != null) {
			Static301.method5007(local59.anInt3962, arg0, local26, local17);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIILclient!lga;Lclient!lga;)V")
	public static void method3314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub4 arg3, @OriginalArg(4) Class2_Sub4 arg4) {
		@Pc(4) Class125 local4 = Static188.method3288(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass2_Sub4_1 = arg3;
			local4.aClass2_Sub4_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)Z")
	public static boolean method3316(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static576.aByteArrayArrayArray21[0][arg3][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static576.aByteArrayArrayArray21[arg0][arg3][arg2] & 0x10) == 0) {
			return arg1 == Static496.method7512(arg3, arg0, arg2);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!pe;I)V")
	public static void method3318(@OriginalArg(0) Class254 arg0) {
		Static475.aClass254_121 = arg0;
	}
}
