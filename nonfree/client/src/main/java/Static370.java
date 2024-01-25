import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "Lclient!lp;")
	public static Class2_Sub8_Sub2 aClass2_Sub8_Sub2_5;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "Lclient!mn;")
	public static Class171 aClass171_85;

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_157 = new Class25(38, 9);

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean443 = true;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIILclient!kj;ILclient!kj;IIII)V")
	public static void method5161(@OriginalArg(1) int arg0, @OriginalArg(3) Class11_Sub5_Sub2 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class11_Sub5_Sub2 arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg1.method6217();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class41 local20 = (Class41) Static452.aClass188_10.method4158((long) local7);
		if (local20 == null) {
			@Pc(27) Class190[] local27 = Static470.method4237(Static446.aClass171_101, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static257.aClass75_8.method5986(local27[0]);
			Static452.aClass188_10.method4155((long) local7, local20);
		}
		Static66.method1057(arg3.anInt7626, arg3.method6215() * 64, arg3.anInt7622, 0, arg0 >> 1, arg3.aByte101, arg6 >> 1);
		@Pc(81) int local81 = Static242.anIntArray380[0] + arg4 - 18;
		@Pc(91) int local91 = Static242.anIntArray380[1] + arg2 - 54 - 16;
		@Pc(99) int local99 = local81 + arg5 / 4 * 18;
		@Pc(107) int local107 = local91 + arg5 % 4 * 18;
		local20.method6090(local99, local107);
		if (arg1 == arg3) {
			Static257.aClass75_8.method5993(-256, 18, local107 - 1, local99 + -1, 18);
		}
		@Pc(129) Class28_Sub3 local129 = Static249.method3444();
		local129.aClass11_Sub5_Sub2_1 = arg1;
		local129.anInt1847 = local99;
		local129.anInt1844 = local99 + 16;
		local129.anInt1845 = local107 + 16;
		local129.anInt1843 = local107;
		Static155.aClass97_3.method2154(local129);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)I")
	public static int method5163(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(17) int local17 = (arg0 & 0x7F) * 96 >> 7;
		if (local17 < 2) {
			local17 = 2;
		} else if (local17 > 126) {
			local17 = 126;
		}
		return (arg0 & 0xFF80) + local17;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
	public static void method5164() {
		Static170.aClass188_31.method4169(5);
	}
}
