import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static600 {

	@OriginalMember(owner = "client!ue", name = "B", descriptor = "Lclient!gda;")
	public static Class126 aClass126_275;

	@OriginalMember(owner = "client!ue", name = "S", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_250 = new Class381(23, -1);

	@OriginalMember(owner = "client!ue", name = "z", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[100];

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
	public static final int anInt9671 = 1;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILclient!ha;)Lclient!kaa;")
	public static Class196 method8236(@OriginalArg(1) int arg0, @OriginalArg(2) Class100 arg1) {
		@Pc(9) Class194 local9 = Static574.method7722(arg1, arg0, true);
		return local9 == null ? null : local9.aClass196_20;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method8238(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(42) int local42 = 0;
			@Pc(44) long local44 = arg0;
			while (local44 != 0L) {
				local44 /= 37L;
				local42++;
			}
			@Pc(60) StringBuffer local60 = new StringBuffer(local42);
			while (arg0 != 0L) {
				@Pc(66) long local66 = arg0;
				arg0 /= 37L;
				@Pc(80) char local80 = Static580.aCharArray12[(int) (local66 - arg0 * 37L)];
				if (local80 == '_') {
					@Pc(90) int local90 = local60.length() - 1;
					local80 = ' ';
					local60.setCharAt(local90, Character.toUpperCase(local60.charAt(local90)));
				}
				local60.append(local80);
			}
			local60.reverse();
			local60.setCharAt(0, Character.toUpperCase(local60.charAt(0)));
			return local60.toString();
		}
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
	public static void method8242() {
		for (@Pc(7) int local7 = 0; local7 < Static58.anInt7090; local7++) {
			@Pc(20) int local20 = Static461.method6497(Static58.anInt7090, Static488.anInt7901 + local7) * Static492.anInt7974;
			for (@Pc(22) int local22 = 0; local22 < Static492.anInt7974; local22++) {
				@Pc(34) int local34 = local20 + Static461.method6497(Static492.anInt7974, local22 + Static111.anInt1795);
				if (Static483.anIntArray454[local34] == Static662.anInt10762) {
					Static111.anInterface24Array1[local34].method8997(0, 0, Static659.anInt10729, Static122.anInt2024, Static659.anInt10729 * local22, Static122.anInt2024 * local7);
				}
			}
		}
	}
}
