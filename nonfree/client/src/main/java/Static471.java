import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!sda", name = "h", descriptor = "I")
	public static int anInt8014;

	@OriginalMember(owner = "client!sda", name = "j", descriptor = "I")
	public static int anInt8015;

	@OriginalMember(owner = "client!sda", name = "l", descriptor = "[[Lclient!rga;")
	public static Class8_Sub3[][] aClass8_Sub3ArrayArray3;

	@OriginalMember(owner = "client!sda", name = "e", descriptor = "I")
	public static int anInt8012 = 104;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IIIIIII)V")
	public static void method6442(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(6) Class8_Sub1 local6 = (Class8_Sub1) Static500.aClass209_10.method4194(); local6 != null; local6 = (Class8_Sub1) Static500.aClass209_10.method4191()) {
			if (local6.anInt147 <= Static301.anInt5197) {
				local6.method7615();
			} else {
				Static142.method2138((local6.anInt144 << 9) + 256, (local6.anInt145 << 9) - -256, local6.anInt141, arg1 >> 1, arg3 >> 1, local6.anInt143 * 2);
				Static418.aClass64_11.method6605(0, local6.anInt146 | 0xFF000000, Static348.anIntArray473[0] + arg2, local6.aString4, Static348.anIntArray473[1] + arg0);
			}
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IIILclient!uc;)Lclient!mp;")
	public static Class1_Sub6_Sub10 method6444(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class324 arg2) {
		@Pc(10) int local10 = arg0 << 10 | arg2.anInt8834;
		@Pc(19) Class1_Sub6_Sub10 local19 = (Class1_Sub6_Sub10) Static374.aClass137_3.method2930((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static410.aClass270_83.method5691(Static410.aClass270_83.method5672(local10));
		if (local31 == null) {
			local10 = arg1 + 65536 << 10 | arg2.anInt8834;
			local19 = (Class1_Sub6_Sub10) Static374.aClass137_3.method2930((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static410.aClass270_83.method5691(Static410.aClass270_83.method5672(local10));
			if (local31 == null) {
				local10 = arg2.anInt8834 | 0x3FFFC00;
				local19 = (Class1_Sub6_Sub10) Static374.aClass137_3.method2930((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static410.aClass270_83.method5691(Static410.aClass270_83.method5672(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					local19 = Static355.method4848(local31);
					local19.aClass324_31 = arg2;
					Static374.aClass137_3.method2928((long) local10 << 16, local19);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				local19 = Static355.method4848(local31);
				local19.aClass324_31 = arg2;
				Static374.aClass137_3.method2928((long) local10 << 16, local19);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			local19 = Static355.method4848(local31);
			local19.aClass324_31 = arg2;
			Static374.aClass137_3.method2928((long) local10 << 16, local19);
			return local19;
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Lclient!pu;Lclient!pu;ILclient!pu;Lclient!pu;)V")
	public static void method6445(@OriginalArg(0) Class270 arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(3) Class270 arg2, @OriginalArg(4) Class270 arg3) {
		Static577.aClass270_121 = arg0;
		Static348.aClass270_67 = arg1;
		Static466.aClass270_99 = arg3;
		Static578.aClass341ArrayArray2 = new Class341[Static466.aClass270_99.method5674()][];
		Static410.aBooleanArray15 = new boolean[Static466.aClass270_99.method5674()];
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IB)Z")
	public static boolean method6446(@OriginalArg(0) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}
}
