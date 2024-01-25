import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!kba", name = "o", descriptor = "Lclient!tb;")
	public static final Class313 aClass313_63 = new Class313(4);

	@OriginalMember(owner = "client!kba", name = "x", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_282 = new Class363(96, -2);

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(BI)V")
	public static void method7981(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub3_Sub13 local8 = Static382.method5650(6, arg0);
		local8.method6095();
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method7982(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			for (@Pc(36) long local36 = arg0; local36 != 0L; local36 /= 37L) {
				local34++;
			}
			@Pc(54) StringBuffer local54 = new StringBuffer(local34);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				local54.append(Static421.aCharArray11[(int) (local58 - arg0 * 37L)]);
			}
			return local54.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!dt;Lclient!pl;Lclient!pl;Lclient!pl;I)Z")
	public static boolean method7983(@OriginalArg(0) Class2_Sub10_Sub2 arg0, @OriginalArg(1) Class259 arg1, @OriginalArg(2) Class259 arg2, @OriginalArg(3) Class259 arg3) {
		Static396.aClass2_Sub10_Sub2_3 = arg0;
		Static444.aClass259_139 = arg1;
		Static456.aClass259_141 = arg2;
		Static314.aClass259_164 = arg3;
		return true;
	}
}
