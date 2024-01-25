import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
	public static int anInt915;

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "[I")
	public static int[] anIntArray73 = new int[1];

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILjava/lang/String;)Lclient!cc;")
	public static Class47 method961(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class47 local13;
		try {
			local13 = (Class47) Class.forName("Class47_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			local13 = new Class47_Sub1();
		}
		local13.anInt3113 = arg0;
		local13.aString52 = arg1;
		return local13;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!wu;)V")
	public static void method962(@OriginalArg(1) Class384 arg0) {
		Static211.aClass384_51 = arg0;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(Z)V")
	public static void method963() {
		if (!Static371.method4028()) {
			return;
		}
		if (Static276.aStringArray39 == null) {
			Static562.method7904();
		}
		Static109.anInt1732 = 0;
		Static449.aBoolean627 = true;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method964(@OriginalArg(0) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static586.method8223(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(36) int local36 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(39) int local39;
			do {
				local39 = arg1.nextInt();
			} while (local39 >= local36);
			return Static561.method7890(arg0, local39);
		}
	}
}
