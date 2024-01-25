import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!hv", name = "t", descriptor = "F")
	public static float aFloat88;

	@OriginalMember(owner = "client!hv", name = "G", descriptor = "F")
	public static float aFloat89;

	@OriginalMember(owner = "client!hv", name = "M", descriptor = "[[I")
	public static int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!hv", name = "N", descriptor = "[Lclient!it;")
	public static Class28[] aClass28Array9;

	@OriginalMember(owner = "client!hv", name = "O", descriptor = "Lclient!la;")
	public static Class207 aClass207_53;

	@OriginalMember(owner = "client!hv", name = "F", descriptor = "[[I")
	public static final int[][] anIntArrayArray19 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!hv", name = "L", descriptor = "[I")
	public static final int[] anIntArray209 = new int[8];

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!vp;")
	public static Class4_Sub2_Sub1 method3700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class217 local7 = Static421.aClass217ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class290 local14 = local7.aClass290_2; local14 != null; local14 = local14.aClass290_3) {
			@Pc(18) Class4_Sub2_Sub1 local18 = local14.aClass4_Sub2_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort107 == arg1 && local18.aShort108 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(II)I")
	public static int method3703(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!ofa;I)Lclient!ge;")
	public static Class119_Sub1_Sub1 method3706(@OriginalArg(0) Class5_Sub22 arg0) {
		@Pc(15) Class119_Sub1 local15 = Static443.method6695(arg0);
		@Pc(19) int local19 = arg0.method5956();
		return new Class119_Sub1_Sub1(local15.aClass245_14, local15.aClass183_12, local15.anInt10375, local15.anInt10374, local15.anInt10371, local15.anInt10373, local15.anInt10367, local15.anInt10370, local15.anInt10369, local15.anInt3102, local15.anInt3097, local15.anInt3096, local15.anInt3098, local15.anInt3100, local15.anInt3095, local19);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILjava/lang/String;IIZ)V")
	public static void method3707(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static267.method4303(arg0, null, arg3, false, arg1, arg2);
	}
}
