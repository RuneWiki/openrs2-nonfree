import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!ns", name = "t", descriptor = "F")
	public static float aFloat67;

	@OriginalMember(owner = "client!ns", name = "v", descriptor = "Lclient!pd;")
	public static Class182 aClass182_1;

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "Lclient!tu;")
	public static final Class229 aClass229_31 = new Class229();

	@OriginalMember(owner = "client!ns", name = "w", descriptor = "I")
	public static int anInt5077 = 0;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4071(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = 0;
		@Pc(12) int local12 = arg0.length();
		while (local9 < local12 && Static329.method4789(arg0.charAt(local9))) {
			local9++;
		}
		while (local12 > local9 && Static329.method4789(arg0.charAt(local12 - 1))) {
			local12--;
		}
		@Pc(41) int local41 = local12 - local9;
		if (local41 < 1 || local41 > 12) {
			return null;
		}
		@Pc(58) StringBuffer local58 = new StringBuffer(local41);
		for (@Pc(60) int local60 = local9; local60 < local12; local60++) {
			@Pc(65) char local65 = arg0.charAt(local60);
			if (Static397.method5362(local65)) {
				@Pc(73) char local73 = Static172.method2971(local65);
				if (local73 != '\u0000') {
					local58.append(local73);
				}
			}
		}
		if (local58.length() == 0) {
			return null;
		} else {
			return local58.toString();
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IILclient!eo;B)V")
	public static void method4072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class68 arg2) {
		@Pc(8) Class32 local8 = arg2.method1726(Static266.aClass75_7);
		if (local8 == null) {
			return;
		}
		Static266.aClass75_7.pa(arg0, arg1, arg0 + arg2.anInt2178, arg2.lb + arg1);
		if (Static103.anInt2292 < 3) {
			Static247.aClass22_11.method6067((float) arg2.anInt2178 / 2.0F + (float) arg0, (float) arg1 + (float) arg2.lb / 2.0F, ((int) -Static235.aFloat60 & 0x3FFF) << 2, local8, arg0, arg1);
		} else {
			Static266.aClass75_7.j(-16777216, local8, arg0, arg1);
		}
	}
}
