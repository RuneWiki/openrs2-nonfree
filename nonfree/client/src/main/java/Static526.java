import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "Lclient!at;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
	public static int anInt9182;

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "[I")
	public static final int[] anIntArray476 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([Lclient!ufa;I)V")
	public static void method7484(@OriginalArg(0) Class4[] arg0) {
		Static506.anInt8762 = arg0.length;
		Static388.aClass4Array10 = new Class4[Static506.anInt8762 + 10];
		Static92.anIntArray89 = new int[Static506.anInt8762 + 10];
		Static653.method6535(arg0, 0, Static388.aClass4Array10, 0, Static506.anInt8762);
		for (@Pc(26) int local26 = 0; local26 < Static506.anInt8762; local26++) {
			Static92.anIntArray89[local26] = Static388.aClass4Array10[local26].method7712();
		}
		for (@Pc(41) int local41 = Static506.anInt8762; local41 < Static388.aClass4Array10.length; local41++) {
			Static92.anIntArray89[local41] = 12;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILjava/lang/String;II)V")
	public static void method7485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class302 local8 = Static454.method6884(arg3, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray28 != null) {
			@Pc(18) Class6_Sub29 local18 = new Class6_Sub29();
			local18.anObjectArray1 = local8.anObjectArray28;
			local18.aClass302_7 = local8;
			local18.anInt5604 = arg0;
			local18.aString57 = arg2;
			Static435.method6669(local18);
		}
		if (Static333.anInt6626 != 10 || !Static75.method2151(local8).method8490(arg0 - 1)) {
			return;
		}
		@Pc(60) Class6_Sub17 local60;
		if (arg0 == 1) {
			local60 = Static330.method7824(Static65.aClass185_18, Static569.aClass134_2);
			Static338.method5609(arg1, arg3, local8.anInt8899, local60);
			Static452.method6867(local60);
		}
		if (arg0 == 2) {
			local60 = Static330.method7824(Static227.aClass185_49, Static569.aClass134_2);
			Static338.method5609(arg1, arg3, local8.anInt8899, local60);
			Static452.method6867(local60);
		}
		if (arg0 == 3) {
			local60 = Static330.method7824(Static145.aClass185_33, Static569.aClass134_2);
			Static338.method5609(arg1, arg3, local8.anInt8899, local60);
			Static452.method6867(local60);
		}
		if (arg0 == 4) {
			local60 = Static330.method7824(Static415.aClass185_86, Static569.aClass134_2);
			Static338.method5609(arg1, arg3, local8.anInt8899, local60);
			Static452.method6867(local60);
		}
		if (arg0 == 5) {
			local60 = Static330.method7824(Static1.aClass185_74, Static569.aClass134_2);
			Static338.method5609(arg1, arg3, local8.anInt8899, local60);
			Static452.method6867(local60);
		}
		if (arg0 == 6) {
			local60 = Static330.method7824(Static13.aClass185_6, Static569.aClass134_2);
			Static338.method5609(arg1, arg3, local8.anInt8899, local60);
			Static452.method6867(local60);
		}
		if (arg0 == 7) {
			local60 = Static330.method7824(Static39.aClass185_15, Static569.aClass134_2);
			Static338.method5609(arg1, arg3, local8.anInt8899, local60);
			Static452.method6867(local60);
		}
		if (arg0 == 8) {
			local60 = Static330.method7824(Static30.aClass185_10, Static569.aClass134_2);
			Static338.method5609(arg1, arg3, local8.anInt8899, local60);
			Static452.method6867(local60);
		}
		if (arg0 == 9) {
			local60 = Static330.method7824(Static240.aClass185_54, Static569.aClass134_2);
			Static338.method5609(arg1, arg3, local8.anInt8899, local60);
			Static452.method6867(local60);
		}
		if (arg0 == 10) {
			local60 = Static330.method7824(Static24.aClass185_9, Static569.aClass134_2);
			Static338.method5609(arg1, arg3, local8.anInt8899, local60);
			Static452.method6867(local60);
		}
	}
}
