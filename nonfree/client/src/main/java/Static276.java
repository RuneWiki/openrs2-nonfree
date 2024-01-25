import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "[I")
	public static int[] anIntArray719;

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray39;

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "Lclient!wu;")
	public static Class384 aClass384_126;

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "[I")
	public static final int[] anIntArray718 = new int[32];

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "Lclient!kha;")
	public static final Class189 aClass189_15 = new Class189();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!bw;)V")
	public static void method7932(@OriginalArg(0) Class43 arg0) {
		Static599.aClass43_3 = arg0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Ljava/lang/String;IZI)Z")
	public static boolean method7943(@OriginalArg(0) String arg0) {
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(48) char local48 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local33 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(75) int local75;
			if (local48 >= '0' && local48 <= '9') {
				local75 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local75 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local75 = local48 - 'W';
			} else {
				return false;
			}
			if (local75 >= 10) {
				return false;
			}
			if (local33) {
				local75 = -local75;
			}
			@Pc(123) int local123 = local37 * 10 + local75;
			if (local123 / 10 != local37) {
				return false;
			}
			local35 = true;
			local37 = local123;
		}
		return local35;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!kn;IIIIII)V")
	public static void method7948(@OriginalArg(0) Class14_Sub1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static530.method7584(arg1, arg3, arg0.aByte125, arg0.anInt9317, arg0.anInt9315, arg2, 0);
	}
}
