import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!st", name = "b", descriptor = "Lclient!an;")
	public static Class16 aClass16_106;

	@OriginalMember(owner = "client!st", name = "q", descriptor = "Lclient!ci;")
	public static Class55 aClass55_8;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_79 = new Class77(5, -1);

	@OriginalMember(owner = "client!st", name = "l", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_244 = new Class88("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!st", name = "n", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_80 = new Class77(20, -1);

	@OriginalMember(owner = "client!st", name = "o", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_245 = new Class88("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!st", name = "p", descriptor = "I")
	public static int anInt8335 = 64;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IBILclient!mc;)V")
	public static void method6891(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class198 arg2) {
		if (Static73.aBoolean136) {
			@Pc(14) Class213 local14 = Static147.anInt3219 == -1 ? null : Static453.aClass258_2.method6426(Static147.anInt3219);
			if (Static67.method1529(arg2).method5779() && (Static266.anInt5318 & 0x20) != 0 && (local14 == null || arg2.method4818(Static147.anInt3219, local14.anInt6063) != local14.anInt6063)) {
				Static160.method3297(Static497.aString104 + " -> " + arg2.aString65, arg2.anInt5739, arg2.anInt5705, 51, arg2.anInt5726, true, 0L, Static274.aString59, Static156.anInt3411, false);
			}
			return;
		}
		@Pc(78) String local78;
		for (@Pc(71) int local71 = 9; local71 >= 5; local71--) {
			local78 = Static163.method3345(local71, arg2);
			if (local78 != null) {
				Static160.method3297(arg2.aString65, arg2.anInt5739, arg2.anInt5705, 1009, arg2.anInt5726, true, (long) (local71 + 1), local78, Static143.method2855(local71, arg2), false);
			}
		}
		local78 = Static14.method356(arg2);
		if (local78 != null) {
			Static160.method3297(arg2.aString65, arg2.anInt5739, arg2.anInt5705, 3, arg2.anInt5726, true, 0L, local78, arg2.anInt5706, false);
		}
		for (@Pc(139) int local139 = 4; local139 >= 0; local139--) {
			@Pc(146) String local146 = Static163.method3345(local139, arg2);
			if (local146 != null) {
				Static160.method3297(arg2.aString65, arg2.anInt5739, arg2.anInt5705, 25, arg2.anInt5726, true, (long) (local139 + 1), local146, Static143.method2855(local139, arg2), false);
			}
		}
		if (!Static67.method1529(arg2).method5781()) {
			return;
		}
		if (arg2.aString64 == null) {
			Static160.method3297("", arg2.anInt5739, arg2.anInt5705, 47, arg2.anInt5726, true, 0L, Static372.aClass88_202.method2391(Static345.anInt6495), -1, false);
		} else {
			Static160.method3297("", arg2.anInt5739, arg2.anInt5705, 47, arg2.anInt5726, true, 0L, arg2.aString64, -1, false);
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method6893(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(19) int local19 = arg0.length();
		while (local11 < local19 && Static496.method5624(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local19 && Static496.method5624(arg0.charAt(local19 - 1))) {
			local19--;
		}
		@Pc(58) int local58 = local19 - local11;
		if (local58 < 1 || local58 > 12) {
			return null;
		}
		@Pc(73) StringBuffer local73 = new StringBuffer(local58);
		for (@Pc(75) int local75 = local11; local75 < local19; local75++) {
			@Pc(81) char local81 = arg0.charAt(local75);
			if (Static416.method7996(local81)) {
				@Pc(89) char local89 = Static381.method6034(local81);
				if (local89 != '\u0000') {
					local73.append(local89);
				}
			}
		}
		if (local73.length() == 0) {
			return null;
		} else {
			return local73.toString();
		}
	}
}
