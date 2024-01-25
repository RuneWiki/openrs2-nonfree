import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
	public static void method1770() {
		for (@Pc(16) Class4_Sub21 local16 = (Class4_Sub21) Static126.aClass258_19.method5538(); local16 != null; local16 = (Class4_Sub21) Static126.aClass258_19.method5528()) {
			if (Static386.method5221(local16.anInt3041)) {
				Static284.method3970(local16);
			}
		}
		if (Static83.anInt1893 == 1) {
			Static346.aBoolean427 = false;
			Static436.method5629(Static346.anInt6292, Static171.anInt3173, Static434.anInt7227, Static104.anInt2229);
			return;
		}
		Static436.method5629(Static346.anInt6292, Static171.anInt3173, Static434.anInt7227, Static104.anInt2229);
		@Pc(52) int local52 = Static266.aClass215_8.method4976(Static379.aClass242_95.method5320(Static139.anInt2670));
		for (@Pc(57) Class4_Sub21 local57 = (Class4_Sub21) Static126.aClass258_19.method5538(); local57 != null; local57 = (Class4_Sub21) Static126.aClass258_19.method5528()) {
			@Pc(63) int local63 = Static68.method3473(local57);
			if (local52 < local63) {
				local52 = local63;
			}
		}
		Static346.anInt6292 = local52 + 8;
		Static434.anInt7227 = (Static60.aBoolean103 ? 26 : 22) + Static83.anInt1893 * 16;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)V")
	public static void method1771(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static416.method5456(arg0, 1);
		local8.method2761();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIII)V")
	public static void method1772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1012) {
			Static172.method2509(Static440.aClass93_10, arg1, arg2);
		} else if (arg0 == 1011) {
			Static172.method2509(Static15.aClass93_1, arg1, arg2);
		} else if (arg0 == 1001) {
			Static172.method2509(Static387.aClass93_8, arg1, arg2);
			return;
		} else if (arg0 == 1010) {
			Static172.method2509(Static226.aClass93_3, arg1, arg2);
			return;
		} else if (arg0 == 1002) {
			Static172.method2509(Static354.aClass93_7, arg1, arg2);
			return;
		}
	}
}
