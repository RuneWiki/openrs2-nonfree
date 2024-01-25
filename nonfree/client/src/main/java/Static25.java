import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!at", name = "i", descriptor = "[I")
	public static final int[] anIntArray133 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!at", name = "k", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_22 = new Class243(76, 2);

	@OriginalMember(owner = "client!at", name = "s", descriptor = "[Z")
	public static final boolean[] aBooleanArray8 = new boolean[8];

	@OriginalMember(owner = "client!at", name = "w", descriptor = "I")
	public static int anInt1756 = -1;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!no;I)V")
	public static void method1661(@OriginalArg(0) Class2_Sub29_Sub2 arg0) {
		arg0.method5244();
		@Pc(10) int local10 = 0;
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(12) int local12 = 0; local12 < Static16.anInt362; local12++) {
			local18 = Static325.anIntArray473[local12];
			if ((Static408.aByteArray119[local18] & 0x1) == 0) {
				if (local10 > 0) {
					Static408.aByteArray119[local18] = (byte) (Static408.aByteArray119[local18] | 0x2);
					local10--;
				} else {
					local46 = arg0.method5248(1);
					if (local46 == 0) {
						local10 = Static409.method6414(arg0);
						Static408.aByteArray119[local18] = (byte) (Static408.aByteArray119[local18] | 0x2);
					} else {
						Static388.method6236(local18, arg0);
					}
				}
			}
		}
		arg0.method5241();
		if (local10 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method5244();
		@Pc(123) int local123;
		for (local18 = 0; local18 < Static16.anInt362; local18++) {
			local46 = Static325.anIntArray473[local18];
			if ((Static408.aByteArray119[local46] & 0x1) != 0) {
				if (local10 > 0) {
					local10--;
					Static408.aByteArray119[local46] = (byte) (Static408.aByteArray119[local46] | 0x2);
				} else {
					local123 = arg0.method5248(1);
					if (local123 == 0) {
						local10 = Static409.method6414(arg0);
						Static408.aByteArray119[local46] = (byte) (Static408.aByteArray119[local46] | 0x2);
					} else {
						Static388.method6236(local46, arg0);
					}
				}
			}
		}
		arg0.method5241();
		if (local10 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method5244();
		@Pc(199) int local199;
		for (local46 = 0; local46 < Static179.anInt3323; local46++) {
			local123 = Static537.anIntArray757[local46];
			if ((Static408.aByteArray119[local123] & 0x1) != 0) {
				if (local10 > 0) {
					Static408.aByteArray119[local123] = (byte) (Static408.aByteArray119[local123] | 0x2);
					local10--;
				} else {
					local199 = arg0.method5248(1);
					if (local199 == 0) {
						local10 = Static409.method6414(arg0);
						Static408.aByteArray119[local123] = (byte) (Static408.aByteArray119[local123] | 0x2);
					} else if (Static45.method835(arg0, local123)) {
						Static408.aByteArray119[local123] = (byte) (Static408.aByteArray119[local123] | 0x2);
					}
				}
			}
		}
		arg0.method5241();
		if (local10 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method5244();
		for (local123 = 0; local123 < Static179.anInt3323; local123++) {
			local199 = Static537.anIntArray757[local123];
			if ((Static408.aByteArray119[local199] & 0x1) == 0) {
				if (local10 > 0) {
					Static408.aByteArray119[local199] = (byte) (Static408.aByteArray119[local199] | 0x2);
					local10--;
				} else {
					@Pc(287) int local287 = arg0.method5248(1);
					if (local287 == 0) {
						local10 = Static409.method6414(arg0);
						Static408.aByteArray119[local199] = (byte) (Static408.aByteArray119[local199] | 0x2);
					} else if (Static45.method835(arg0, local199)) {
						Static408.aByteArray119[local199] = (byte) (Static408.aByteArray119[local199] | 0x2);
					}
				}
			}
		}
		arg0.method5241();
		if (local10 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static16.anInt362 = 0;
		Static179.anInt3323 = 0;
		for (local199 = 1; local199 < 2048; local199++) {
			Static408.aByteArray119[local199] = (byte) (Static408.aByteArray119[local199] >> 1);
			@Pc(354) Class1_Sub1_Sub2_Sub1 local354 = Static278.aClass1_Sub1_Sub2_Sub1Array1[local199];
			if (local354 == null) {
				Static537.anIntArray757[Static179.anInt3323++] = local199;
			} else {
				Static325.anIntArray473[Static16.anInt362++] = local199;
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)Lclient!jf;")
	public static Class46 method1664() {
		try {
			return (Class46) Class.forName("Class46_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method1668(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class2_Sub13_Sub15 local16 = Static370.method5893(arg1, 3);
		local16.method6968();
		local16.aString172 = arg0;
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(B)I")
	public static int method1670() {
		return Static58.anInt1114++;
	}
}
