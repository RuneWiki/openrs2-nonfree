import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "Lclient!so;")
	public static final Class309 aClass309_4 = new Class309();

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "[Lclient!cfa;")
	public static final Class50[] aClass50Array1 = new Class50[16];

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILjava/lang/String;ZILjava/lang/String;ZI)V")
	public static void method3935(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		Static535.aClass270_112.anInt7161 = 1;
		@Pc(11) String local11 = arg3.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = -1;
		@Pc(18) String local18 = null;
		if (arg2 != -1) {
			@Pc(27) Class120 local27 = Static459.aClass38_2.method713(arg2);
			if (local27 == null || local27.method2384() != arg1) {
				return;
			}
			if (local27.method2384()) {
				local18 = local27.aString28;
			} else {
				local16 = local27.anInt2965;
			}
		}
		@Pc(49) int local49 = 0;
		for (@Pc(51) int local51 = 0; local51 < Static175.aClass114_4.anInt2779; local51++) {
			@Pc(58) Class245 local58 = Static175.aClass114_4.method2217(local51);
			if ((!arg4 || local58.aBoolean489) && local58.anInt6232 == -1 && local58.anInt6188 == -1 && local58.anInt6225 == 0 && local58.aString62.toLowerCase().indexOf(local11) != -1) {
				if (arg2 != -1) {
					if (arg1) {
						if (!arg0.equals(local58.method4996(local18, arg2))) {
							continue;
						}
					} else if (local58.method5000(arg2, local16) != arg5) {
						continue;
					}
				}
				if (local49 >= 250) {
					Static101.aShortArray46 = null;
					Static86.anInt1814 = -1;
					return;
				}
				if (local14.length <= local49) {
					@Pc(135) short[] local135 = new short[local14.length * 2];
					for (@Pc(137) int local137 = 0; local137 < local49; local137++) {
						local135[local137] = local14[local137];
					}
					local14 = local135;
				}
				local14[local49++] = (short) local51;
			}
		}
		Static86.anInt1814 = local49;
		Static33.anInt2652 = 0;
		Static101.aShortArray46 = local14;
		@Pc(176) String[] local176 = new String[Static86.anInt1814];
		for (@Pc(178) int local178 = 0; local178 < Static86.anInt1814; local178++) {
			local176[local178] = Static175.aClass114_4.method2217(local14[local178]).aString62;
		}
		Static458.method6320(Static101.aShortArray46, local176);
		Static535.aClass270_112.method5690();
		Static535.aClass270_112.anInt7161 = 2;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IZIIIIIII)V")
	public static void method3936(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static504.method4690(arg6)) {
			if (Static294.aClass341ArrayArray1[arg6] == null) {
				Static349.method4737(Static578.aClass341ArrayArray2[arg6], arg2, arg3, arg4, arg0, arg1, -1, arg5, arg7);
			} else {
				Static349.method4737(Static294.aClass341ArrayArray1[arg6], arg2, arg3, arg4, arg0, arg1, -1, arg5, arg7);
			}
		} else if (arg4 == -1) {
			for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
				Static166.aBooleanArray5[local15] = true;
			}
		} else {
			Static166.aBooleanArray5[arg4] = true;
		}
	}
}
