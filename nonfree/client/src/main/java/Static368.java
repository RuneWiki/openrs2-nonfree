import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
	public static int anInt6205 = 0;

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "[S")
	public static final short[] aShortArray100 = new short[] { 46, 19, 48, 45, 10, 8, 3, 6 };

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_222 = new Class103(39, 15);

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
	public static int anInt6211 = 0;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!fo;ZLjava/lang/String;I)Lclient!hl;")
	public static Class100 method4883(@OriginalArg(0) Class82 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		@Pc(10) int local10 = arg0.method1835(arg2);
		if (local10 == -1) {
			return new Class100(0);
		}
		@Pc(29) int[] local29 = arg0.method1839(local10);
		@Pc(35) Class100 local35 = new Class100(local29.length);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local35.anInt2592 > local37) {
				@Pc(55) Class1_Sub28 local55 = new Class1_Sub28(arg0.method1817(local10, local29[local39++]));
				@Pc(59) int local59 = local55.method5355();
				@Pc(63) int local63 = local55.method5335();
				@Pc(67) int local67 = local55.method5337();
				if (!arg1 && local67 == 1) {
					local35.anInt2592--;
				} else {
					local35.anIntArray177[local37] = local59;
					local35.anIntArray176[local37] = local63;
					local37++;
				}
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)V")
	public static void method4884(@OriginalArg(0) boolean arg0) {
		if (Static395.aClass131_3 != null) {
			Static395.aClass131_3.method2933();
			Static395.aClass131_3 = null;
		}
		Static58.anInt1166 = 0;
		Static417.method5509();
		Static105.method1619();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static447.aClass14Array3[local19].method288();
		}
		Static301.method4121(false);
		System.gc();
		Static241.method3474();
		Static143.anInt2345 = -1;
		Static328.aBoolean637 = false;
		Static282.method3895(true);
		Static226.anInt4010 = 0;
		Static414.anInt6796 = 0;
		Static199.anInt3480 = 0;
		Static432.anInt7295 = 0;
		Static164.anInt2731 = 0;
		for (@Pc(58) int local58 = 0; local58 < Static133.aClass135Array1.length; local58++) {
			Static133.aClass135Array1[local58] = null;
		}
		Static118.method1884();
		for (@Pc(75) int local75 = 0; local75 < 2048; local75++) {
			Static28.aClass25_Sub5_Sub1_Sub2Array1[local75] = null;
		}
		Static328.anInt5608 = 0;
		for (@Pc(89) int local89 = 0; local89 < 32768; local89++) {
			Static87.aClass25_Sub5_Sub1_Sub1Array6[local89] = null;
		}
		Static425.aClass199_179.method4385();
		Static3.method4552();
		Static8.anInt128 = 0;
		Static320.aClass249_2.method5598();
		Static218.method3187();
		Static180.method2605();
		Static195.aLong115 = 0L;
		Static247.aClass1_Sub42_1 = null;
		if (arg0) {
			Static203.method4783(11);
			return;
		}
		Static203.method4783(2);
		try {
			Static461.method3101(Static183.aClass83_2.anApplet1, "loggedout");
		} catch (@Pc(134) Throwable local134) {
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)Lclient!kf;")
	public static Class37 method4887() {
		try {
			return new Class37_Sub2();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class37) Class.forName("Class37_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(14) Throwable local14) {
				return new Class37_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)V")
	public static void method4889(@OriginalArg(0) int arg0) {
		Static224.anInt4002 = arg0;
		Static370.aClass102_46.method2271();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!ug;)V")
	public static void method4890(@OriginalArg(1) Class1_Sub28 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static363.aClass219_4 != null) {
			@Pc(20) int local20;
			try {
				Static363.aClass219_4.method4836(0L);
				Static363.aClass219_4.method4845(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(47) Exception local47) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method5387(local8, 24);
	}
}
