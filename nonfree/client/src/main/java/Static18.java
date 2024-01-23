import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "[Lclient!pd;")
	public static Class132[] aClass132Array1;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
	public static int anInt416 = 0;

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "Lclient!ug;")
	public static Class163 aClass163_1 = new Class163();

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "Lclient!db;")
	public static Class31 aClass31_4 = new Class31(30);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
	public static void method322() {
		for (@Pc(15) int local15 = -1; local15 < Static241.anInt4977; local15++) {
			@Pc(28) int local28;
			if (local15 == -1) {
				local28 = 2047;
			} else {
				local28 = Static143.anIntArray331[local15];
			}
			@Pc(38) Class6_Sub6_Sub2 local38 = Static77.aClass6_Sub6_Sub2Array1[local28];
			if (local38 != null) {
				Static19.method327(local38, local38.method3509());
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method323(@OriginalArg(0) String arg0) {
		if (Static32.aClass1_Sub16Array1 == null) {
			return;
		}
		@Pc(18) long local18 = Static136.method2158(arg0);
		@Pc(20) int local20 = 0;
		if (local18 == 0L) {
			return;
		}
		while (Static32.aClass1_Sub16Array1.length > local20 && local18 != Static32.aClass1_Sub16Array1[local20].aLong202) {
			local20++;
		}
		if (local20 < Static32.aClass1_Sub16Array1.length && Static32.aClass1_Sub16Array1[local20] != null) {
			Static270.aClass1_Sub18_Sub1_3.method3130(130);
			Static270.aClass1_Sub18_Sub1_3.method3091(Static32.aClass1_Sub16Array1[local20].aLong202);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIILclient!j;JLclient!j;Lclient!j;)V")
	public static void method324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class6 arg6, @OriginalArg(7) Class6 arg7) {
		@Pc(3) Class5 local3 = new Class5();
		local3.aClass6_1 = arg4;
		local3.anInt249 = arg1 * 128 + 64;
		local3.anInt242 = arg2 * 128 + 64;
		local3.anInt241 = arg3;
		local3.aLong12 = arg5;
		local3.aClass6_2 = arg6;
		local3.aClass6_3 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class1_Sub19 local42 = Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt2570; local46++) {
				@Pc(55) Class124 local55 = local42.aClass124Array2[local46];
				if ((local55.aLong114 & 0x400000L) == 4194304L) {
					@Pc(66) int local66 = local55.aClass6_6.method3833();
					if (local66 != -32768 && local66 < local34) {
						local34 = local66;
					}
				}
			}
		}
		local3.anInt247 = -local34;
		if (Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub19(arg0, arg1, arg2);
		}
		Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass5_1 = local3;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
	public static void method325() {
		Static63.aClass1_Sub18_Sub1_1.method3126();
		@Pc(11) int local11 = Static63.aClass1_Sub18_Sub1_1.method3129(1);
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static63.aClass1_Sub18_Sub1_1.method3129(2);
		if (local22 == 0) {
			Static294.anIntArray687[Static101.anInt1926++] = 2047;
			return;
		}
		@Pc(45) int local45;
		@Pc(55) int local55;
		if (local22 == 1) {
			local45 = Static63.aClass1_Sub18_Sub1_1.method3129(3);
			Static28.aClass6_Sub6_Sub2_1.method3513(1, local45);
			local55 = Static63.aClass1_Sub18_Sub1_1.method3129(1);
			if (local55 == 1) {
				Static294.anIntArray687[Static101.anInt1926++] = 2047;
			}
		} else if (local22 == 2) {
			if (Static63.aClass1_Sub18_Sub1_1.method3129(1) == 1) {
				local45 = Static63.aClass1_Sub18_Sub1_1.method3129(3);
				Static28.aClass6_Sub6_Sub2_1.method3513(2, local45);
				local55 = Static63.aClass1_Sub18_Sub1_1.method3129(3);
				Static28.aClass6_Sub6_Sub2_1.method3513(2, local55);
			} else {
				local45 = Static63.aClass1_Sub18_Sub1_1.method3129(3);
				Static28.aClass6_Sub6_Sub2_1.method3513(0, local45);
			}
			local45 = Static63.aClass1_Sub18_Sub1_1.method3129(1);
			if (local45 == 1) {
				Static294.anIntArray687[Static101.anInt1926++] = 2047;
			}
		} else if (local22 == 3) {
			Static159.anInt2978 = Static63.aClass1_Sub18_Sub1_1.method3129(2);
			local45 = Static63.aClass1_Sub18_Sub1_1.method3129(7);
			local55 = Static63.aClass1_Sub18_Sub1_1.method3129(1);
			@Pc(157) int local157 = Static63.aClass1_Sub18_Sub1_1.method3129(1);
			if (local157 == 1) {
				Static294.anIntArray687[Static101.anInt1926++] = 2047;
			}
			@Pc(176) int local176 = Static63.aClass1_Sub18_Sub1_1.method3129(7);
			Static28.aClass6_Sub6_Sub2_1.method3519(local176, local45, local55 == 1);
		}
	}
}
