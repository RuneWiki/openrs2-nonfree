import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "Z")
	public static boolean aBoolean71 = false;

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "J")
	public static long aLong44 = 0L;

	@OriginalMember(owner = "client!dh", name = "u", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray6 = new String[100];

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method809(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static175.anInt3635 >= 100 && !Static302.aBoolean420 || Static175.anInt3635 >= 200) {
			Static199.method3219(Static33.aString22);
			return;
		}
		@Pc(32) String local32 = Static136.method2200(arg0);
		if (local32 == null) {
			return;
		}
		@Pc(38) int local38;
		@Pc(51) String local51;
		@Pc(81) String local81;
		for (local38 = 0; local38 < Static175.anInt3635; local38++) {
			local51 = Static136.method2200(Static279.aStringArray44[local38]);
			if (local51 != null && local51.equals(local32)) {
				Static199.method3219(arg0 + Static106.aString83);
				return;
			}
			if (Static263.aStringArray43[local38] != null) {
				local81 = Static136.method2200(Static263.aStringArray43[local38]);
				if (local81 != null && local81.equals(local32)) {
					Static199.method3219(arg0 + Static106.aString83);
					return;
				}
			}
		}
		for (local38 = 0; local38 < Static268.anInt5931; local38++) {
			local51 = Static136.method2200(Static57.aStringArray8[local38]);
			if (local51 != null && local51.equals(local32)) {
				Static199.method3219(Static101.aString67 + arg0 + Static5.aString2);
				return;
			}
			if (Static172.aStringArray3[local38] != null) {
				local81 = Static136.method2200(Static172.aStringArray3[local38]);
				if (local81 != null && local81.equals(local32)) {
					Static199.method3219(Static101.aString67 + arg0 + Static5.aString2);
					return;
				}
			}
		}
		if (Static136.method2200(Static229.aClass22_Sub3_Sub2_2.aString153).equals(local32)) {
			Static199.method3219(Static289.aString183);
		} else {
			Static137.aClass1_Sub14_Sub1_6.method2661(105);
			Static137.aClass1_Sub14_Sub1_6.method2631(Static255.method3873(arg0));
			Static137.aClass1_Sub14_Sub1_6.method2619(arg0);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
	public static void method810(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub8 local12 = (Class1_Sub8) Static247.aClass156_23.method3821((long) arg0);
		if (local12 != null) {
			for (@Pc(31) int local31 = 0; local31 < local12.anIntArray57.length; local31++) {
				local12.anIntArray57[local31] = -1;
				local12.anIntArray58[local31] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "([BZB)Ljava/lang/Object;")
	public static Object method811(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static75.aBoolean116) {
			try {
				@Pc(25) Class11 local25 = (Class11) Class.forName("Class11_Sub1").getDeclaredConstructor().newInstance();
				local25.method128(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static75.aBoolean116 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!ph;IIIIIZ)V")
	public static void method812(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static59.anInt1191 = arg1;
		Static78.anInt1449 = 1;
		Static97.anInt1804 = 0;
		Static177.anInt2083 = 2;
		Static185.anInt3720 = arg2;
		Static86.aBoolean123 = false;
		Static75.aClass138_21 = arg0;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZLclient!qf;I)V")
	public static void method813(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class146 arg1) {
		@Pc(15) int local15 = arg1.anInt4383 == 0 ? arg1.anInt4371 : arg1.anInt4383;
		@Pc(27) int local27 = arg1.anInt4419 == 0 ? arg1.anInt4345 : arg1.anInt4419;
		Static288.method4284(local15, arg1.anInt4355, arg0, local27, Static313.aClass146ArrayArray1[arg1.anInt4355 >> 16]);
		if (arg1.aClass146Array2 != null) {
			Static288.method4284(local15, arg1.anInt4355, arg0, local27, arg1.aClass146Array2);
		}
		@Pc(60) Class1_Sub32 local60 = (Class1_Sub32) Static69.aClass156_6.method3821((long) arg1.anInt4355);
		if (local60 != null) {
			Static12.method174(arg0, local60.anInt5722, local27, local15);
		}
	}
}
