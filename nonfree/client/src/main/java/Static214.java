import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
	public static int anInt3819;

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "[B")
	public static final byte[] aByteArray48 = new byte[520];

	@OriginalMember(owner = "client!kn", name = "o", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_153 = new Class103(23, 7);

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lclient!ie;IB)V")
	public static void method3137(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1) {
		if (Static286.aBoolean570) {
			Static286.aBoolean570 = false;
			arg1 = 0;
		}
		if (Static119.aClass109_1 != null && Static119.aClass109_1.method2387(arg0)) {
			return;
		}
		Static119.aClass109_1 = arg0;
		Static397.aLong206 = Static27.method359();
		Static61.anInt1460 = arg1;
		Static288.anInt5049 = arg1;
		if (Static288.anInt5049 != 0) {
			Static1.aFloat1 = Static290.aFloat65;
			Static289.anInt5059 = Static459.anInt7336;
			Static236.aFloat59 = Static442.aFloat104;
			Static357.aFloat73 = Static62.aFloat14;
			Static217.aFloat43 = Static408.aFloat80;
			Static450.anInt7436 = Static176.anInt1041;
			Static346.anInt5943 = Static56.anInt1065;
			Static415.aFloat81 = Static149.aFloat29;
			Static392.aClass3_3 = Static456.aClass3_4;
			Static226.aFloat57 = Static287.aFloat64;
			return;
		}
		Static125.method1990();
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II[BIIII[BI)V")
	public static void method3139(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(15) int local15 = -(arg7 & 0x3);
		for (@Pc(18) int local18 = -arg4; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg5++;
				arg1[local26] += arg6[arg0++];
				@Pc(38) int local38 = arg5++;
				arg1[local38] += arg6[arg0++];
				@Pc(50) int local50 = arg5++;
				arg1[local50] += arg6[arg0++];
				@Pc(62) int local62 = arg5++;
				arg1[local62] += arg6[arg0++];
			}
			for (@Pc(80) int local80 = local15; local80 < 0; local80++) {
				local26 = arg5++;
				arg1[local26] += arg6[arg0++];
			}
			arg0 += arg2;
			arg5 += arg3;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZZ)V")
	public static void method3140(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static207.anInt6026 != -1) {
				Static453.method5913(Static207.anInt6026);
			}
			for (@Pc(15) Class1_Sub14 local15 = (Class1_Sub14) Static94.aClass199_54.method4392(); local15 != null; local15 = (Class1_Sub14) Static94.aClass199_54.method4393()) {
				if (!local15.method5914()) {
					local15 = (Class1_Sub14) Static94.aClass199_54.method4392();
					if (local15 == null) {
						break;
					}
				}
				Static452.method5911(false, true, local15);
			}
			Static207.anInt6026 = -1;
			Static94.aClass199_54 = new Class199(8);
			Static326.method4381();
			Static207.anInt6026 = Static228.anInt4845;
			Static336.method4513(false);
			Static65.method1072();
			Static298.method4073(Static207.anInt6026);
		}
		Static145.aBoolean233 = false;
		Static47.aString8 = "";
		Static109.aString58 = "";
		Static348.method4712();
		Static33.anInt530 = -1;
		Static46.method622(Static54.anInt973);
		Static447.aClass25_Sub5_Sub1_Sub2_4 = new Class25_Sub5_Sub1_Sub2();
		Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514 = Static206.anInt3607 * 128 / 2;
		Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518 = Static296.anInt5187 * 128 / 2;
		Static447.aClass25_Sub5_Sub1_Sub2_4.anIntArray283[0] = Static296.anInt5187 / 2;
		Static447.aClass25_Sub5_Sub1_Sub2_4.anIntArray284[0] = Static206.anInt3607 / 2;
		Static360.anInt6145 = 0;
		Static213.anInt258 = 0;
		if (Static333.anInt5693 == 2) {
			Static213.anInt258 = Static312.anInt5418 << 7;
			Static360.anInt6145 = Static207.anInt6028 << 7;
		} else {
			Static409.method5275();
		}
		Static129.method2031();
	}
}
