import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray40;

	@OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
	public static int anInt9159 = -1;

	@OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
	public static int anInt9161 = 0;

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
	public static int anInt9164 = 0;

	@OriginalMember(owner = "client!sh", name = "z", descriptor = "[S")
	public static short[] aShortArray136 = new short[256];

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method8080(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(31) int local31 = 0;
			@Pc(39) long local39 = arg0;
			while (local39 != 0L) {
				local39 /= 37L;
				local31++;
			}
			@Pc(57) StringBuffer local57 = new StringBuffer(local31);
			while (arg0 != 0L) {
				@Pc(63) long local63 = arg0;
				arg0 /= 37L;
				local57.append(Static605.aCharArray8[(int) (local63 - arg0 * 37L)]);
			}
			return local57.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
	public static void method8081() {
		if (Static380.anInterface8Array1 == null) {
			return;
		}
		@Pc(15) Interface8[] local15 = Static380.anInterface8Array1;
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Interface8 local23 = local15[local17];
			local23.method7190();
		}
	}
}
