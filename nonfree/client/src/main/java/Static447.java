import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!pu", name = "v", descriptor = "Lclient!kq;")
	public static final Class193 aClass193_5 = new Class193();

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZLclient!da;Ljava/lang/String;Lclient!ej;Lclient!ha;B)V")
	public static void method6682(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class93 arg3, @OriginalArg(4) Class82 arg4) {
		@Pc(19) boolean local19 = !Static273.aBoolean385 || Static20.method265();
		if (!local19) {
			return;
		}
		@Pc(41) int local41;
		@Pc(50) int local50;
		if (Static273.aBoolean385 && local19) {
			@Pc(28) Class93 local28 = Static586.aClass93_13;
			@Pc(34) Class63 local34 = arg4.method6127(local28, Static235.aClass251Array1);
			local41 = local28.method2316((Class103[]) null, arg2, 250);
			local50 = local28.method2314(250, local28.anInt2762, arg2, (Class103[]) null);
			@Pc(53) int local53 = Static228.aClass251_2.anInt7185;
			@Pc(57) int local57 = local53 + 4;
			local41 += local57 * 2;
			local50 += local57 * 2;
			if (Static100.anInt2903 > local50) {
				local50 = Static100.anInt2903;
			}
			if (Static130.anInt2750 > local41) {
				local41 = Static130.anInt2750;
			}
			@Pc(92) int local92 = Static504.aClass293_9.method7212(Static623.anInt9971, local41) + Static390.anInt6994;
			@Pc(101) int local101 = Static316.aClass15_9.method259(local50, Static269.anInt5258) + Static407.anInt7176;
			if (Static80.aBoolean118) {
				local92 += Static211.method3297();
				local101 += Static551.method7856();
			}
			arg4.method6106(Static303.aClass251_4, false).method7456(local92 + Static51.aClass251_1.anInt7185, Static51.aClass251_1.anInt7184 + local101, local41 - Static51.aClass251_1.anInt7185 * 2, -(Static51.aClass251_1.anInt7184 * 2) + local50, 1, 0, 0);
			arg4.method6106(Static51.aClass251_1, true).method7462(local92, local101);
			Static51.aClass251_1.method6332();
			arg4.method6106(Static51.aClass251_1, true).method7462(local41 + local92 - local53, local101);
			Static51.aClass251_1.method6335();
			arg4.method6106(Static51.aClass251_1, true).method7462(local92 + local41 - local53, -local53 + (local101 - -local50));
			Static51.aClass251_1.method6332();
			arg4.method6106(Static51.aClass251_1, true).method7462(local92, local50 + local101 - local53);
			Static51.aClass251_1.method6335();
			arg4.method6106(Static228.aClass251_2, true).method7455(local92, local101 + Static51.aClass251_1.anInt7184, local53, local50 - Static51.aClass251_1.anInt7184 * 2);
			Static228.aClass251_2.method6343();
			arg4.method6106(Static228.aClass251_2, true).method7455(local92 + Static51.aClass251_1.anInt7185, local101, local41 - Static51.aClass251_1.anInt7185 * 2, local53);
			Static228.aClass251_2.method6343();
			arg4.method6106(Static228.aClass251_2, true).method7455(local92 + local41 - local53, Static51.aClass251_1.anInt7184 + local101, local53, local50 - Static51.aClass251_1.anInt7184 * 2);
			Static228.aClass251_2.method6343();
			arg4.method6106(Static228.aClass251_2, true).method7455(Static51.aClass251_1.anInt7185 + local92, -local53 + local50 + local101, local41 - Static51.aClass251_1.anInt7185 * 2, local53);
			Static228.aClass251_2.method6343();
			local34.method7749(1, 1, 0, Static196.anInt3670 | 0xFF000000, (int[]) null, local50 - local57 * 2, (Class1) null, local92 + local57, arg2, 0, local41 - local57 * 2, (Class103[]) null, -1, local101 + local57, 0);
			Static283.method4602(local50, local101, local41, local92);
		} else {
			local41 = arg3.method2316((Class103[]) null, arg2, 250);
			local50 = arg3.method2318(arg2, 250, (Class103[]) null) * 13;
			arg4.aa(6, 6, local41 + 4 + 4, 4 + 4 + local50, -16777216, 0);
			arg4.method6179(6, 6, local41 + 4 + 4, local50 + 8, -1, 0);
			arg1.method7749(1, 1, 0, -1, (int[]) null, local50, (Class1) null, 10, arg2, 0, local41, (Class103[]) null, -1, 10, 0);
			Static283.method4602(local50 + 4 + 4, 6, local41 + 4 + 4, 6);
		}
		if (!arg0) {
			return;
		}
		try {
			if (Static80.aBoolean118) {
				Static568.method7086();
			} else {
				arg4.method6152();
			}
		} catch (@Pc(451) Exception_Sub1 local451) {
		}
	}

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "(B)V")
	public static void method6684() {
		if (Static638.aFileOutputStream1 != null) {
			try {
				Static638.aFileOutputStream1.close();
			} catch (@Pc(9) IOException local9) {
			}
		}
		Static638.aFileOutputStream1 = null;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIILclient!iha;II)Z")
	public static boolean method6686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class160 arg4, @OriginalArg(5) int arg5) {
		if (!Static480.aBoolean590 || !Static70.aBoolean94) {
			return false;
		} else if (Static560.anInt9310 < 100) {
			return false;
		} else if (arg3 != arg0 || arg5 != arg1) {
			for (@Pc(52) int local52 = arg3; local52 <= arg0; local52++) {
				for (@Pc(56) int local56 = arg5; local56 <= arg1; local56++) {
					if (Static454.anIntArrayArrayArray24[arg2][local52][local56] == -Static148.anInt3031) {
						return false;
					}
				}
			}
			if (Static37.method552(arg4)) {
				Static74.anInt1446++;
				return true;
			} else {
				return false;
			}
		} else if (!Static348.method5647(arg5, arg2, arg3)) {
			return false;
		} else if (Static37.method552(arg4)) {
			Static74.anInt1446++;
			return true;
		} else {
			return false;
		}
	}
}
