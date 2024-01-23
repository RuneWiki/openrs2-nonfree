import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
	public static int anInt5136 = 0;

	@OriginalMember(owner = "client!rm", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString161 = " has logged out.";

	@OriginalMember(owner = "client!rm", name = "A", descriptor = "I")
	public static int anInt5141 = 1;

	@OriginalMember(owner = "client!rm", name = "E", descriptor = "I")
	public static int anInt5145 = 0;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!im;Ljava/lang/String;)I")
	public static int method4050(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) String arg1) {
		@Pc(11) int local11 = arg0.anInt3328;
		@Pc(15) byte[] local15 = Static220.method3907(arg1);
		arg0.method2605(local15.length);
		arg0.anInt3328 += Static24.aClass96_1.method2884(arg0.anInt3328, 0, local15, local15.length, arg0.aByteArray39);
		return arg0.anInt3328 - local11;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "([Ljava/lang/String;B[S)V")
	public static void method4051(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static280.method4652(0, arg1, arg0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZI)V")
	public static void method4052(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static104.method831(arg0, 2);
		local8.method1189();
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)V")
	public static void method4054() {
		for (@Pc(13) int local13 = 0; local13 < Static111.anInt2390; local13++) {
			@Pc(24) int local24 = Static95.anIntArray220[local13];
			@Pc(28) Class25_Sub1_Sub1 local28 = Static271.aClass25_Sub1_Sub1Array1[local24];
			@Pc(32) int local32 = Static222.aClass1_Sub16_Sub1_3.method2655();
			if ((local32 & 0x4) != 0) {
				local32 += Static222.aClass1_Sub16_Sub1_3.method2655() << 8;
			}
			Static59.method1157(local32, local24, local28);
		}
	}
}
