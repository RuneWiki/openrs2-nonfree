import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static573 {

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	public static int anInt9429;

	// $FF: synthetic field
	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Ljava/lang/Class;")
	private static Class aClass21;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Lclient!br;")
	public static final Class37 aClass37_3 = new Class37();

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIILclient!au;Lclient!au;)V")
	public static void method7944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19_Sub1_Sub1 arg3, @OriginalArg(4) Class19_Sub1_Sub1 arg4) {
		@Pc(4) Class262 local4 = Static512.method7319(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass19_Sub1_Sub1_2 = arg3;
		local4.aClass19_Sub1_Sub1_1 = arg4;
		@Pc(22) int local22 = Static639.aClass313Array2 == Static711.aClass313Array3 ? 1 : 0;
		if (!arg3.method9366()) {
			arg3.aClass19_Sub1_25 = Static634.aClass19_Sub1Array4[local22];
			Static634.aClass19_Sub1Array4[local22] = arg3;
		} else if (arg3.method9360()) {
			arg3.aClass19_Sub1_25 = Static358.aClass19_Sub1Array2[local22];
			Static358.aClass19_Sub1Array2[local22] = arg3;
		} else {
			arg3.aClass19_Sub1_25 = Static660.aClass19_Sub1Array5[local22];
			Static660.aClass19_Sub1Array5[local22] = arg3;
			Static70.aBoolean89 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method9366()) {
			if (arg4.method9360()) {
				arg4.aClass19_Sub1_25 = Static358.aClass19_Sub1Array2[local22];
				Static358.aClass19_Sub1Array2[local22] = arg4;
				return;
			}
			arg4.aClass19_Sub1_25 = Static660.aClass19_Sub1Array5[local22];
			Static660.aClass19_Sub1Array5[local22] = arg4;
			Static70.aBoolean89 = true;
			return;
		}
		arg4.aClass19_Sub1_25 = Static634.aClass19_Sub1Array4[local22];
		Static634.aClass19_Sub1Array4[local22] = arg4;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIII)Lclient!wka;")
	public static Class19_Sub1_Sub3_Sub2 method7945(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) Class262 local19 = Static584.aClass262ArrayArrayArray2[arg1][arg0][arg2];
		if (local19 == null) {
			return null;
		}
		@Pc(26) Class19_Sub1_Sub3_Sub2 local26 = null;
		@Pc(28) int local28 = -1;
		for (@Pc(31) Class343 local31 = local19.aClass343_2; local31 != null; local31 = local31.aClass343_4) {
			@Pc(35) Class19_Sub1_Sub3 local35 = local31.aClass19_Sub1_Sub3_1;
			if (local35 instanceof Class19_Sub1_Sub3_Sub2) {
				@Pc(41) Class19_Sub1_Sub3_Sub2 local41 = (Class19_Sub1_Sub3_Sub2) local35;
				@Pc(51) int local51 = (local41.method6592() - 1) * 256 + 252;
				@Pc(58) int local58 = local41.anInt11204 - local51 >> 9;
				@Pc(66) int local66 = local41.anInt11211 - local51 >> 9;
				@Pc(73) int local73 = local41.anInt11204 + local51 >> 9;
				@Pc(81) int local81 = local41.anInt11211 + local51 >> 9;
				if (arg0 >= local58 && arg2 >= local66 && local73 >= arg0 && local81 >= arg2) {
					@Pc(128) int local128 = (local81 + 1 - arg2) * (local73 + 1 + -arg0);
					if (local128 > local28) {
						local28 = local128;
						local26 = local41;
					}
				}
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZILjava/awt/Component;)Lclient!ht;")
	public static Class161 method7946(@OriginalArg(2) Component arg0) {
		try {
			@Pc(33) Constructor local33 = Class.forName("oja").getDeclaredConstructor(aClass21 == null ? (aClass21 = Class331.a("java.awt.Component")) : aClass21, Boolean.TYPE);
			return (Class161) local33.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(51) Throwable local51) {
			return new Class161_Sub2(arg0, true);
		}
	}
}
