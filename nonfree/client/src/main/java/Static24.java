import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
	public static int anInt7340;

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "Lclient!jka;")
	public static final Class5_Sub32 aClass5_Sub32_4 = new Class5_Sub32(0, 0);

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIZLjava/lang/String;)Z")
	public static boolean method6157(@OriginalArg(3) String arg0) {
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(45) char local45 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local45 == '-') {
					local31 = true;
					continue;
				}
				if (local45 == '+') {
					continue;
				}
			}
			@Pc(80) int local80;
			if (local45 >= '0' && local45 <= '9') {
				local80 = local45 - '0';
			} else if (local45 >= 'A' && local45 <= 'Z') {
				local80 = local45 - '7';
			} else if (local45 >= 'a' && local45 <= 'z') {
				local80 = local45 - 'W';
			} else {
				return false;
			}
			if (local80 >= 10) {
				return false;
			}
			if (local31) {
				local80 = -local80;
			}
			@Pc(114) int local114 = local80 + local35 * 10;
			if (local35 != local114 / 10) {
				return false;
			}
			local33 = true;
			local35 = local114;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)Z")
	public static boolean method6161(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)V")
	public static void method6162() throws IOException {
		if (Static12.aClass244_1 == null || Static29.anInt397 <= 0) {
			return;
		}
		Static508.aClass5_Sub41_10.anInt9230 = 0;
		while (true) {
			@Pc(14) Class5_Sub21 local14 = (Class5_Sub21) Static67.aClass114_9.method2805();
			if (local14 == null || local14.anInt3372 > Static508.aClass5_Sub41_10.aByteArray93.length - Static508.aClass5_Sub41_10.anInt9230) {
				Static12.aClass244_1.method5752(Static508.aClass5_Sub41_10.aByteArray93, Static508.aClass5_Sub41_10.anInt9230);
				Static106.anInt2263 += Static508.aClass5_Sub41_10.anInt9230;
				Static292.anInt5664 = 0;
				break;
			}
			Static508.aClass5_Sub41_10.method7837(0, local14.anInt3372, local14.aClass5_Sub41_Sub2_1.aByteArray93);
			Static29.anInt397 -= local14.anInt3372;
			local14.method9052();
			local14.aClass5_Sub41_Sub2_1.method7835();
			local14.method2947();
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BLclient!mc;)Lclient!qd;")
	public static Class5_Sub2 method6163(@OriginalArg(1) Class5_Sub41 arg0) {
		arg0.method7816();
		@Pc(18) int local18 = arg0.method7816();
		@Pc(22) Class5_Sub2 local22 = Static246.method3849(local18);
		local22.anInt10759 = arg0.method7816();
		@Pc(31) int local31 = arg0.method7816();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method7816();
			local22.method8944(arg0, local39);
		}
		local22.method8951();
		return local22;
	}
}
