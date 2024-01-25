import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ct", name = "i", descriptor = "F")
	public static float aFloat17;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
	public static int anInt1459 = 0;

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "I")
	public static int anInt1460 = -1;

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
	public static int anInt1463 = 2;

	@OriginalMember(owner = "client!ct", name = "j", descriptor = "I")
	public static int anInt1467 = 0;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(BILclient!wk;ILclient!wk;IIIII)V")
	public static void method1287(@OriginalArg(1) int arg0, @OriginalArg(2) Class25_Sub5_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class25_Sub5_Sub1 arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg3.method3423();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class6 local20 = (Class6) Static316.aClass102_44.method2258((long) local7);
		if (local20 == null) {
			@Pc(27) Class72[] local27 = Static460.method1579(Static448.aClass82_104, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static185.aClass34_7.method5756(local27[0]);
			Static316.aClass102_44.method2272((long) local7, local20);
		}
		Static216.method3149(arg0 >> 1, 0, arg1.aByte94, arg1.anInt5518, arg2 >> 1, arg1.method3427() * 64, arg1.anInt5514);
		@Pc(74) int local74 = arg6 + Static224.anIntArray240[0] - 18;
		@Pc(85) int local85 = arg5 + Static224.anIntArray240[1] - 16 - 54;
		@Pc(93) int local93 = local74 + arg4 / 4 * 18;
		@Pc(109) int local109 = local85 + arg4 % 4 * 18;
		local20.method5894(local93, local109);
		if (arg3 == arg1) {
			Static185.aClass34_7.method5767(local93 - 1, 18, local109 - 1, -256, 18);
		}
		@Pc(131) Class4_Sub6 local131 = Static332.method4480();
		local131.anInt6520 = local93 + 16;
		local131.aClass25_Sub5_Sub1_1 = arg3;
		local131.anInt6522 = local109 + 16;
		local131.anInt6519 = local109;
		local131.anInt6525 = local93;
		Static384.aClass262_12.method5815(local131);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(BIILjava/awt/Component;Lclient!fq;)Lclient!jl;")
	public static Class125 method1289(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) Class83 arg3) {
		if (Static228.anInt4846 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(30) Class125 local30 = (Class125) Class.forName("Class125_Sub2").getDeclaredConstructor().newInstance();
			local30.anInt7413 = arg1;
			local30.anIntArray508 = new int[(Static166.aBoolean323 ? 2 : 1) * 256];
			local30.method5868(arg2);
			local30.anInt7415 = (-1024 & arg1) + 1024;
			if (local30.anInt7415 > 16384) {
				local30.anInt7415 = 16384;
			}
			local30.method5858(local30.anInt7415);
			if (Static45.anInt5486 > 0 && Static138.aClass118_1 == null) {
				Static138.aClass118_1 = new Class118();
				Static138.aClass118_1.aClass83_3 = arg3;
				arg3.method1865(Static138.aClass118_1, Static45.anInt5486);
			}
			if (Static138.aClass118_1 != null) {
				if (Static138.aClass118_1.aClass125Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static138.aClass118_1.aClass125Array1[arg0] = local30;
			}
			return local30;
		} catch (@Pc(103) Throwable local103) {
			try {
				@Pc(123) Class125_Sub1 local123 = new Class125_Sub1(arg3, arg0);
				local123.anInt7413 = arg1;
				local123.anIntArray508 = new int[(Static166.aBoolean323 ? 2 : 1) * 256];
				local123.method5868(arg2);
				local123.anInt7415 = 16384;
				local123.method5858(local123.anInt7415);
				if (Static45.anInt5486 > 0 && Static138.aClass118_1 == null) {
					Static138.aClass118_1 = new Class118();
					Static138.aClass118_1.aClass83_3 = arg3;
					arg3.method1865(Static138.aClass118_1, Static45.anInt5486);
				}
				if (Static138.aClass118_1 != null) {
					if (Static138.aClass118_1.aClass125Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static138.aClass118_1.aClass125Array1[arg0] = local123;
				}
				return local123;
			} catch (@Pc(182) Throwable local182) {
				return new Class125();
			}
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIZLclient!fo;)Lclient!tv;")
	public static Class1_Sub5_Sub18 method1290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class82 arg2) {
		@Pc(14) Class1_Sub28 local14 = new Class1_Sub28(arg2.method1817(arg0, arg1));
		@Pc(45) Class1_Sub5_Sub18 local45 = new Class1_Sub5_Sub18(arg1, local14.method5381(), local14.method5381(), local14.method5355(), local14.method5355(), local14.method5337() == 1, local14.method5337(), local14.method5337());
		@Pc(49) int local49 = local14.method5337();
		for (@Pc(56) int local56 = 0; local56 < local49; local56++) {
			local45.aClass227_42.method4972(new Class1_Sub45(local14.method5337(), local14.method5335(), local14.method5335(), local14.method5335(), local14.method5335(), local14.method5335(), local14.method5335(), local14.method5335(), local14.method5335()));
		}
		local45.method5203();
		return local45;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lclient!lr;B)V")
	public static void method1291(@OriginalArg(0) Class25_Sub5_Sub1_Sub2 arg0) {
		@Pc(19) Class1_Sub10 local19 = (Class1_Sub10) Static38.aClass199_25.method4387((long) arg0.anInt4284);
		if (local19 == null) {
			return;
		}
		if (local19.aClass1_Sub6_Sub3_1 != null) {
			Static355.aClass1_Sub6_Sub4_2.method5179(local19.aClass1_Sub6_Sub3_1);
			local19.aClass1_Sub6_Sub3_1 = null;
		}
		local19.method5915();
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)V")
	public static void method1293(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub5_Sub11 local8 = Static188.method2688(arg0, 6);
		local8.method2667();
	}
}
