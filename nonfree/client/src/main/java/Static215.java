import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
	public static int anInt4657;

	@OriginalMember(owner = "client!pk", name = "U", descriptor = "I")
	public static int anInt4665;

	@OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
	public static int anInt4656 = 0;

	@OriginalMember(owner = "client!pk", name = "K", descriptor = "Lclient!jl;")
	public static Class89 aClass89_33 = new Class89(4);

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)V")
	public static void method3443() {
		Static10.aClass89_2.method2273(5);
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(Z)V")
	public static void method3444() {
		if (Static316.anInt6316 != -1) {
			Static261.method3999(false, Static316.anInt6316, -1, -1);
			Static316.anInt6316 = -1;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIII)V")
	public static void method3445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static188.anInt4166 == 1) {
			Static40.aClass1_Sub3_Sub13Array4[Static173.anInt3891 / 100].method4204(Static95.anInt2197 - 8, Static77.anInt1763 - 8);
		}
		if (Static188.anInt4166 == 2) {
			Static40.aClass1_Sub3_Sub13Array4[Static173.anInt3891 / 100 + 4].method4204(Static95.anInt2197 - 8, Static77.anInt1763 + -8);
		}
		Static289.method4434();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V")
	public static void method3446(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static269.anIntArray482[local3] = Static269.anIntArray482[local3 - 1];
			Static273.anIntArray490[local3] = Static273.anIntArray490[local3 - 1];
			Static35.aStringArray5[local3] = Static35.aStringArray5[local3 - 1];
			Static251.aStringArray42[local3] = Static251.aStringArray42[local3 - 1];
			Static302.aStringArray48[local3] = Static302.aStringArray48[local3 - 1];
			Static5.aStringArray31[local3] = Static5.aStringArray31[local3 - 1];
			Static142.anIntArray302[local3] = Static142.anIntArray302[local3 - 1];
		}
		Static44.anInt1072 = Static12.anInt4023;
		Static269.anIntArray482[0] = arg4;
		Static35.aStringArray5[0] = arg0;
		Static53.anInt1200++;
		Static273.anIntArray490[0] = arg6;
		Static251.aStringArray42[0] = arg3;
		Static302.aStringArray48[0] = arg1;
		Static142.anIntArray302[0] = arg5;
		Static5.aStringArray31[0] = arg2;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)V")
	public static void method3448(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub3_Sub22 local8 = Static271.method4108(9, arg0);
		local8.method4464();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZZ)V")
	public static void method3449(@OriginalArg(1) boolean arg0) {
		Static248.method3834();
		if (Static96.anInt2212 != 30 && Static96.anInt2212 != 25) {
			return;
		}
		Static196.anInt4273++;
		if (Static196.anInt4273 < 50 && !arg0) {
			return;
		}
		Static196.anInt4273 = 0;
		if (!Static139.aBoolean195 && Static5.aClass104_5 != null) {
			Static2.aClass1_Sub14_Sub1_1.method2252(218);
			try {
				Static5.aClass104_5.method2579(Static2.aClass1_Sub14_Sub1_1.aByteArray55, Static2.aClass1_Sub14_Sub1_1.anInt3000);
				Static2.aClass1_Sub14_Sub1_1.anInt3000 = 0;
			} catch (@Pc(52) IOException local52) {
				Static139.aBoolean195 = true;
			}
		}
		Static248.method3834();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)Lclient!im;")
	public static Class80_Sub1 method3450(@OriginalArg(0) int arg0) {
		return Static155.aBoolean224 && Static8.anInt228 <= arg0 && arg0 <= Static145.anInt6068 ? Static259.aClass80_Sub1Array1[arg0 - Static8.anInt228] : null;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(III)Lclient!ob;")
	public static Class119 method3451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub2 local7 = Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass119_1 == null ? null : local7.aClass119_1;
	}
}
