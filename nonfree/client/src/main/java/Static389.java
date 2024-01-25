import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!nda", name = "i", descriptor = "J")
	public static long aLong43;

	@OriginalMember(owner = "client!nda", name = "f", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_13 = new Class187(61, 7);

	@OriginalMember(owner = "client!nda", name = "g", descriptor = "[J")
	public static final long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!nda", name = "h", descriptor = "[Lclient!ts;")
	public static final Class41_Sub1_Sub1_Sub3_Sub2[] aClass41_Sub1_Sub1_Sub3_Sub2Array2 = new Class41_Sub1_Sub1_Sub3_Sub2[2048];

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!uo;")
	public static RuntimeException_Sub1 method570(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString108 = local9.aString108 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(17) int local17;
		if (Static175.method2576(arg4)) {
			local17 = 0;
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = 0;
			@Pc(39) int local39 = 0;
			if (Static305.aBoolean315) {
				local39 = Static244.anInt3950;
				local35 = Static623.anInt10008;
				local33 = Static677.anInt10679;
				local37 = Static85.anInt1443;
				local17 = Static160.anInt2709;
				Static244.anInt3950 = 1;
			}
			if (Static69.aClass394ArrayArray1[arg4] == null) {
				Static269.method3785(arg7, Static227.aClass394ArrayArray2[arg4], arg0 < 0, -1, arg3, arg0, arg1, arg6, arg2, arg5);
			} else {
				Static269.method3785(arg7, Static69.aClass394ArrayArray1[arg4], arg0 < 0, -1, arg3, arg0, arg1, arg6, arg2, arg5);
			}
			if (Static305.aBoolean315) {
				if (arg0 >= 0 && Static244.anInt3950 == 2) {
					Static430.method7439(Static677.anInt10679, Static85.anInt1443, Static160.anInt2709, Static623.anInt10008);
				}
				Static623.anInt10008 = local35;
				Static244.anInt3950 = local39;
				Static85.anInt1443 = local37;
				Static160.anInt2709 = local17;
				Static677.anInt10679 = local33;
			}
		} else if (arg0 == -1) {
			for (local17 = 0; local17 < 100; local17++) {
				Static425.aBooleanArray18[local17] = true;
			}
		} else {
			Static425.aBooleanArray18[arg0] = true;
		}
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(III)Z")
	public static boolean method575(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static488.method7146(arg1, arg0) | (arg0 & 0x2000) != 0 | Static443.method6610(arg1, arg0)) & Static636.method8433(arg1, arg0);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIB)Z")
	public static boolean method576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}
}
