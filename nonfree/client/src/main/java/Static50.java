import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ei", name = "Eb", descriptor = "Ljava/lang/String;")
	public static String aString1;

	@OriginalMember(owner = "client!ei", name = "Kb", descriptor = "Lclient!pe;")
	public static Class13 aClass13_9;

	@OriginalMember(owner = "client!ei", name = "D", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_362 = Static158.method3034(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!ei", name = "sb", descriptor = "I")
	public static int anInt1552 = 0;

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)Lclient!ai;")
	public static Class2_Sub1_Sub2 method1143(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub2 local10 = (Class2_Sub1_Sub2) Static98.aClass89_36.method3437((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static164.aClass13_34.method521(Static64.method1471(arg0), Static111.method2460(arg0));
		local10 = new Class2_Sub1_Sub2();
		local10.anInt322 = arg0;
		if (local24 != null) {
			local10.method279(new Class2_Sub3(local24));
		}
		local10.method276();
		Static98.aClass89_36.method3432(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(IIIIII)V")
	public static void method1145(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static117.anInt951 < arg3 || arg2 < Static36.anInt1076) {
			return;
		}
		@Pc(25) boolean local25;
		if (arg4 < Static64.anInt1962) {
			local25 = false;
			arg4 = Static64.anInt1962;
		} else if (Static123.anInt3379 < arg4) {
			arg4 = Static123.anInt3379;
			local25 = false;
		} else {
			local25 = true;
		}
		@Pc(44) boolean local44;
		if (arg0 < Static64.anInt1962) {
			local44 = false;
			arg0 = Static64.anInt1962;
		} else if (Static123.anInt3379 < arg0) {
			arg0 = Static123.anInt3379;
			local44 = false;
		} else {
			local44 = true;
		}
		if (Static36.anInt1076 <= arg3) {
			Static163.method3070(arg0, arg4, arg1, Static42.anIntArrayArray8[arg3++]);
		} else {
			arg3 = Static36.anInt1076;
		}
		if (arg2 > Static117.anInt951) {
			arg2 = Static117.anInt951;
		} else {
			Static163.method3070(arg0, arg4, arg1, Static42.anIntArrayArray8[arg2--]);
		}
		@Pc(101) int local101;
		if (local25 && local44) {
			for (local101 = arg3; local101 <= arg2; local101++) {
				@Pc(107) int[] local107 = Static42.anIntArrayArray8[local101];
				local107[arg4] = local107[arg0] = arg1;
			}
		} else if (local25) {
			for (local101 = arg3; local101 <= arg2; local101++) {
				Static42.anIntArrayArray8[local101][arg4] = arg1;
			}
		} else if (local44) {
			for (local101 = arg3; local101 <= arg2; local101++) {
				Static42.anIntArrayArray8[local101][arg0] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(III)V")
	public static void method1147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub17 local7 = Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass74_1 = null;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILclient!pe;I)Lclient!id;")
	public static Class2_Sub10 method1150(@OriginalArg(1) Class13 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method509(arg1);
		return local8 == null ? null : new Class2_Sub10(local8);
	}
}
