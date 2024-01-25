import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
	public static int anInt9805;

	@OriginalMember(owner = "client!vd", name = "J", descriptor = "Lclient!la;")
	public static Class58 aClass58_14;

	@OriginalMember(owner = "client!vd", name = "B", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_117 = new Class173(1, 2);

	@OriginalMember(owner = "client!vd", name = "G", descriptor = "Z")
	public static boolean aBoolean689 = false;

	@OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
	public static int anInt9807 = 0;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BZ)Z")
	public static boolean method8001(@OriginalArg(0) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			return false;
		} else {
			return local12 < 128 || local12 >= 160 || Static298.aCharArray4[local12 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "([BIIIIIZI[B)V")
	public static void method8002(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg4 >> 2);
		@Pc(15) int local15 = -(arg4 & 0x3);
		for (@Pc(18) int local18 = -arg2; local18 < 0; local18++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg1++;
				arg0[local31] = (byte) (arg0[local31] - arg7[arg6++]);
				@Pc(44) int local44 = arg1++;
				arg0[local44] = (byte) (arg0[local44] - arg7[arg6++]);
				@Pc(57) int local57 = arg1++;
				arg0[local57] = (byte) (arg0[local57] - arg7[arg6++]);
				@Pc(70) int local70 = arg1++;
				arg0[local70] = (byte) (arg0[local70] - arg7[arg6++]);
			}
			for (@Pc(86) int local86 = local15; local86 < 0; local86++) {
				local31 = arg1++;
				arg0[local31] = (byte) (arg0[local31] - arg7[arg6++]);
			}
			arg6 += arg5;
			arg1 += arg3;
		}
	}

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "(I)V")
	public static void method8003() {
		Static69.aClass244_7.method5962();
		Static563.aClass244_60.method5962();
		@Pc(21) int local21;
		for (@Pc(16) Class4_Sub39 local16 = (Class4_Sub39) Static40.aClass244_4.method5963(); local16 != null; local16 = (Class4_Sub39) Static40.aClass244_4.method5965()) {
			local21 = local16.anInt8541;
			if (local21 < 1000) {
				local16.method8379();
				if (local21 == 57 || local21 == 44 || local21 == 20 || local21 == 58 || local21 == 16 || local21 == 50 || local21 == 3) {
					Static563.aClass244_60.method5960(local16);
				} else {
					Static69.aClass244_7.method5960(local16);
				}
			}
		}
		Static69.aClass244_7.method5969(Static40.aClass244_4);
		Static563.aClass244_60.method5969(Static40.aClass244_4);
		if (Static339.anInt6583 <= 1) {
			Static577.aClass4_Sub39_3 = null;
		} else if (Static89.aBoolean156 && Static584.aClass154_1.method3569(81) && Static339.anInt6583 > 2) {
			Static577.aClass4_Sub39_3 = (Class4_Sub39) Static40.aClass244_4.aClass4_185.aClass4_286.aClass4_286;
		} else {
			Static577.aClass4_Sub39_3 = (Class4_Sub39) Static40.aClass244_4.aClass4_185.aClass4_286;
		}
		local21 = -1;
		@Pc(131) Class4_Sub15 local131 = (Class4_Sub15) Static222.aClass244_35.method5963();
		if (local131 != null) {
			local21 = local131.method3496();
		}
		if (!Static49.aBoolean36) {
			if (local21 == 0 && (Static297.anInt6005 == 1 && Static339.anInt6583 > 2 || Static400.method6306())) {
				local21 = 2;
			}
			if (local21 == 2 && Static339.anInt6583 > 0 && local131 != null) {
				if (Static317.aClass225_54 == null && Static116.anInt2677 == 0) {
					Static225.method3672(local131.method3498(), local131.method3495());
				} else {
					Static190.anInt3736 = 2;
				}
			}
			if (local21 == 0 && Static339.anInt6583 > 0) {
				Static34.method456();
			}
			if (Static317.aClass225_54 != null || Static116.anInt2677 != 0) {
				return;
			}
			Static190.anInt3736 = 0;
			Static201.aClass4_Sub39_1 = null;
			return;
		}
		@Pc(146) int local146;
		@Pc(150) int local150;
		if (local21 == -1) {
			local146 = Static172.aClass135_1.method6370();
			local150 = Static172.aClass135_1.method6378();
			if (local146 < Static19.anInt285 - 10 || Static179.anInt3618 + Static19.anInt285 + 10 < local146 || Static543.anInt9642 - 10 > local150 || local150 > Static17.anInt279 + Static543.anInt9642 + 10) {
				Static222.method3622();
			}
		}
		if (local21 != 0) {
			return;
		}
		local146 = Static19.anInt285;
		local150 = Static543.anInt9642;
		@Pc(195) int local195 = Static179.anInt3618;
		@Pc(199) int local199 = local131.method3495();
		@Pc(203) int local203 = local131.method3498();
		@Pc(205) int local205 = -1;
		@Pc(224) int local224;
		for (@Pc(207) int local207 = 0; local207 < Static339.anInt6583; local207++) {
			if (Static567.aBoolean701) {
				local224 = local150 + (Static339.anInt6583 - local207 + -1) * 16 + 33;
				if (local199 > local146 && local199 < local146 + local195 && local203 > local224 - 13 && local203 < local224 + 4) {
					local205 = local207;
				}
			} else {
				local224 = (Static339.anInt6583 - local207 - 1) * 16 + local150 + 31;
				if (local146 < local199 && local146 + local195 > local199 && local203 > local224 - 13 && local203 < local224 + 3) {
					local205 = local207;
				}
			}
		}
		if (local205 != -1) {
			local224 = 0;
			@Pc(306) Class89 local306 = new Class89(Static40.aClass244_4);
			for (@Pc(311) Class4_Sub39 local311 = (Class4_Sub39) local306.method2483(); local311 != null; local311 = (Class4_Sub39) local306.method2481()) {
				if (local205 == local224) {
					Static525.method7623(local199, local311, local203);
				}
				local224++;
			}
		}
		Static222.method3622();
		return;
	}
}
