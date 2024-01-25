import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static179 {

	@OriginalMember(owner = "client!ip", name = "k", descriptor = "[I")
	public static int[] anIntArray373;

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "Lclient!bu;")
	public static Class31 aClass31_1 = new Class31();

	@OriginalMember(owner = "client!ip", name = "g", descriptor = "[I")
	public static final int[] anIntArray372 = new int[8];

	@OriginalMember(owner = "client!ip", name = "j", descriptor = "Lclient!os;")
	public static final Class182 aClass182_125 = new Class182("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
	public static void method2954() {
		Static232.aClient5.method981();
		Static337.aClass10_Sub8_Sub2_2.anInt2989 = 0;
		Static163.aClass217_73 = null;
		Static440.aClass217_161 = null;
		Static262.anInt4660 = 0;
		Static203.aClass10_Sub8_Sub2_1.anInt2989 = 0;
		Static326.anInt5600 = 0;
		Static116.aClass217_52 = null;
		Static320.aClass217_120 = null;
		Static146.anInt3027 = 0;
		for (@Pc(30) int local30 = 0; local30 < 100; local30++) {
			Static170.aStringArray26[local30] = null;
		}
		Static442.anInt7400 = 0;
		Static247.aClass113Array1 = null;
		Static265.anInt4693 = 0;
		Static60.anInt7169 = 0;
		Static207.anInt4058 = 0;
		Static222.aString35 = null;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIII)V")
	public static void method2955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Static168.anInt3353 + arg2;
		@Pc(13) int local13 = Static72.anInt1488 + arg1;
		if (Static309.aClass11ArrayArrayArray2 == null || arg2 < 0 || arg1 < 0 || arg2 >= Static2.anInt7 || arg1 >= Static17.anInt315) {
			return;
		}
		@Pc(45) long local45 = (long) (local9 | arg0 << 28 | local13 << 14);
		@Pc(51) Class10_Sub14 local51 = (Class10_Sub14) Static293.aClass167_21.method3709(local45);
		if (local51 == null) {
			Static177.method2947(arg0, arg2, arg1);
			return;
		}
		@Pc(65) Class10_Sub31 local65 = (Class10_Sub31) local51.aClass163_17.method3620();
		if (local65 == null) {
			Static177.method2947(arg0, arg2, arg1);
			return;
		}
		@Pc(79) Class24_Sub2_Sub1 local79 = (Class24_Sub2_Sub1) Static177.method2947(arg0, arg2, arg1);
		if (local79 == null) {
			local79 = new Class24_Sub2_Sub1();
		} else {
			local79.anInt3070 = local79.anInt3073 = -1;
		}
		local79.anInt3072 = local65.anInt4768;
		local79.anInt3067 = local65.anInt4767;
		label46: while (true) {
			@Pc(112) Class10_Sub31 local112 = (Class10_Sub31) local51.aClass163_17.method3621();
			if (local112 == null) {
				break;
			}
			if (local112.anInt4768 != local79.anInt3072) {
				local79.anInt3074 = local112.anInt4767;
				local79.anInt3070 = local112.anInt4768;
				while (true) {
					@Pc(137) Class10_Sub31 local137 = (Class10_Sub31) local51.aClass163_17.method3621();
					if (local137 == null) {
						break label46;
					}
					if (local137.anInt4768 != local79.anInt3072 && local79.anInt3070 != local137.anInt4768) {
						local79.anInt3069 = local137.anInt4767;
						local79.anInt3073 = local137.anInt4768;
					}
				}
			}
		}
		@Pc(185) int local185 = Static326.method4459(arg0, (arg2 << 7) + 64, (arg1 << 7) - -64);
		Static95.method1727(arg0, arg2, arg1, local185, local79);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method2957(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local14 > local11 && Static206.method3206(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local14 && Static206.method3206(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(50) int local50 = local14 - local11;
		if (local50 < 1 || local50 > 12) {
			return null;
		}
		@Pc(65) StringBuffer local65 = new StringBuffer(local50);
		for (@Pc(72) int local72 = local11; local72 < local14; local72++) {
			@Pc(78) char local78 = arg0.charAt(local72);
			if (Static98.method1771(local78)) {
				@Pc(88) char local88 = Static100.method1783(local78);
				if (local88 != '\u0000') {
					local65.append(local88);
				}
			}
		}
		if (local65.length() == 0) {
			return null;
		} else {
			return local65.toString();
		}
	}
}
