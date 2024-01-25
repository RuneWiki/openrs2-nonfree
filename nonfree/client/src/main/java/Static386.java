import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "[Lclient!it;")
	public static Class28[] aClass28Array18;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V")
	public static void method5642() throws IOException {
		if (Static495.aClass170_2 == null || Static80.anInt1677 <= 0) {
			return;
		}
		@Pc(14) int local14 = 0;
		while (true) {
			@Pc(19) Class5_Sub48 local19 = (Class5_Sub48) Static170.aClass330_13.method7908();
			if (local19 == null) {
				Static152.anInt2629 = 0;
				Static284.anInt5007 += local14;
				return;
			}
			Static495.aClass170_2.method8116(local19.anInt8986, local19.aClass5_Sub22_Sub1_2.aByteArray71);
			local14 += local19.anInt8986;
			Static80.anInt1677 -= local19.anInt8986;
			local19.method9047();
			local19.aClass5_Sub22_Sub1_2.method5946();
			local19.method7726();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IBIIII[B)Z")
	public static boolean method5644(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(9) int local9 = arg3 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg2 + 8 - 1) / 8);
		@Pc(42) int local42 = -((arg3 + 7) / 8);
		for (@Pc(44) int local44 = local32; local44 < 0; local44++) {
			for (@Pc(48) int local48 = local42; local48 < 0; local48++) {
				if (arg4[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local16;
			if (arg4[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIILclient!la;Z)V")
	public static void method5645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class207 arg3) {
		if (arg2 <= 0) {
			Static308.method6299(arg0, arg1, arg3);
			return;
		}
		Static72.anInt1497 = 1;
		Static591.aClass5_Sub1_Sub5_4 = null;
		Static134.aBoolean181 = false;
		Static212.anInt4042 = 0;
		Static217.aClass207_53 = arg3;
		Static522.anInt8987 = arg1;
		Static207.anInt3986 = arg0;
		Static172.anInt3051 = Static404.aClass5_Sub1_Sub5_2.method8320() / arg2;
		if (Static172.anInt3051 < 1) {
			Static172.anInt3051 = 1;
		}
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)V")
	public static void method5646() {
		for (@Pc(7) int local7 = 0; local7 < Static305.aByteArrayArrayArray18.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static305.aByteArrayArrayArray18[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static305.aByteArrayArrayArray18[0][0].length; local15++) {
					Static305.aByteArrayArrayArray18[local7][local11][local15] = 0;
				}
			}
		}
	}
}
