import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!qi", name = "mc", descriptor = "Lclient!ak;")
	public static Class7 aClass7_178;

	@OriginalMember(owner = "client!qi", name = "pc", descriptor = "I")
	public static int anInt4441;

	@OriginalMember(owner = "client!qi", name = "yc", descriptor = "[Lclient!bf;")
	public static Class1_Sub2_Sub2[] aClass1_Sub2_Sub2Array11;

	@OriginalMember(owner = "client!qi", name = "sc", descriptor = "Lclient!gi;")
	public static Class64 aClass64_18 = new Class64(16);

	@OriginalMember(owner = "client!qi", name = "wc", descriptor = "I")
	public static int anInt4446 = -1;

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)V")
	public static void method3453() {
		Static14.aClass31_3.method850();
		Static11.aClass31_1.method850();
		Static134.aClass31_22.method850();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BI)V")
	public static void method3454(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub10 local10 = (Class1_Sub10) Static39.aClass22_2.method633((long) arg0);
		if (local10 != null) {
			local10.method4534();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIB)V")
	public static void method3455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(15) int local15 = 0; local15 < Static166.anInt3059; local15++) {
			if (arg0 < Static174.anIntArray383[local15] + Static171.anIntArray380[local15] && Static174.anIntArray383[local15] < arg0 + arg3 && Static217.anIntArray514[local15] + Static38.anIntArray118[local15] > arg2 && Static217.anIntArray514[local15] < arg2 + arg1) {
				Static260.aBooleanArray24[local15] = true;
			}
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!ak;)V")
	public static void method3457(@OriginalArg(1) Class7 arg0) {
		Static37.anInt2944 = arg0.method264("runes");
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIILclient!ei;III)Lclient!ei;")
	public static Class6_Sub2 method3459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6_Sub2 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(14) long local14 = (long) arg1;
		@Pc(20) Class6_Sub2 local20 = (Class6_Sub2) Static264.aClass31_20.method852(local14);
		if (local20 == null) {
			@Pc(28) Class6_Sub3 local28 = Static85.method1434(Static27.aClass7_29, arg1);
			if (local28 == null) {
				return null;
			}
			local20 = local28.method1425(64, 768, -50, -10, -50);
			Static264.aClass31_20.method851(local20, local14);
		}
		@Pc(50) int local50 = arg3.method2092();
		@Pc(53) int local53 = arg3.method2097();
		@Pc(56) int local56 = arg3.method2083();
		@Pc(59) int local59 = arg3.method2093();
		local20 = local20.method2094(true, true, true);
		if (arg4 != 0) {
			local20.method2072(arg4);
		}
		@Pc(102) int local102;
		if (Static240.aBoolean369) {
			@Pc(145) Class6_Sub2_Sub2 local145 = (Class6_Sub2_Sub2) local20;
			if (Static124.method1919(Static159.anInt2978, arg2 + local50, local56 + arg0) != arg5 || Static124.method1919(Static159.anInt2978, arg2 + local53, arg0 - -local59) != arg5) {
				for (local102 = 0; local102 < local145.anInt2527; local102++) {
					local145.anIntArray300[local102] += Static124.method1919(Static159.anInt2978, arg2 + local145.anIntArray295[local102], arg0 + local145.anIntArray298[local102]) - arg5;
				}
				local145.aClass96_1.aBoolean187 = false;
				local145.aClass110_3.aBoolean224 = false;
			}
		} else {
			@Pc(76) Class6_Sub2_Sub1 local76 = (Class6_Sub2_Sub1) local20;
			if (Static124.method1919(Static159.anInt2978, arg2 + local50, local56 + arg0) != arg5 || arg5 != Static124.method1919(Static159.anInt2978, arg2 + local53, arg0 + local59)) {
				for (local102 = 0; local102 < local76.anInt690; local102++) {
					local76.anIntArray70[local102] += Static124.method1919(Static159.anInt2978, local76.anIntArray76[local102] + arg2, arg0 + local76.anIntArray74[local102]) - arg5;
				}
				local76.aBoolean66 = false;
			}
		}
		return local20;
	}
}
