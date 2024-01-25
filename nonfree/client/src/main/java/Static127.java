import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_72 = new Class158("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_41 = new Class177(5, -1);

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
	public static int anInt2832 = 0;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method2083(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % (long) 37 == 0L) {
			return null;
		} else {
			@Pc(30) int local30 = 0;
			for (@Pc(32) long local32 = arg0; local32 != 0L; local32 /= 37L) {
				local30++;
			}
			@Pc(47) StringBuffer local47 = new StringBuffer(local30);
			while (arg0 != 0L) {
				@Pc(50) long local50 = arg0;
				arg0 /= 37L;
				@Pc(64) char local64 = Static32.aCharArray1[(int) (local50 - arg0 * 37L)];
				if (local64 == '_') {
					@Pc(74) int local74 = local47.length() - 1;
					local47.setCharAt(local74, Character.toUpperCase(local47.charAt(local74)));
					local64 = ' ';
				}
				local47.append(local64);
			}
			local47.reverse();
			local47.setCharAt(0, Character.toUpperCase(local47.charAt(0)));
			return local47.toString();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IC)Z")
	public static boolean method2085(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIIIBI)V")
	public static void method2086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		if (arg6 < 128 || arg5 < 128 || arg6 > Static209.anInt4283 * 128 - 256 || arg5 > Static211.anInt4295 * 128 - 256) {
			Static156.anIntArray346[0] = Static156.anIntArray346[1] = -1;
			return;
		}
		@Pc(49) int local49 = Static227.method3475(arg6, arg5, arg2) - arg1;
		Static343.aClass40_4.W(arg0, 0, 0);
		Static30.aClass106_3.SA(Static343.aClass40_4);
		Static30.aClass106_3.v(arg6, local49, arg5, Static156.anIntArray346);
		Static343.aClass40_4.W(-arg0, 0, 0);
		Static30.aClass106_3.SA(Static343.aClass40_4);
	}
}
