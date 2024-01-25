import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
	public static int anInt2656;

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "[I")
	public static int[] anIntArray146;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "Lclient!tca;")
	public static final Class333 aClass333_12 = new Class333(16);

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "[F")
	public static final float[] aFloatArray19 = new float[2];

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZLjava/lang/String;BI)Z")
	public static boolean method2325(@OriginalArg(1) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) char local41 = arg0.charAt(local35);
			if (local35 == 0) {
				if (local41 == '-') {
					local26 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(70) int local70;
			if (local41 >= '0' && local41 <= '9') {
				local70 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local70 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local70 = local41 - 'W';
			} else {
				return false;
			}
			if (local70 >= 10) {
				return false;
			}
			if (local26) {
				local70 = -local70;
			}
			@Pc(110) int local110 = local70 + local30 * 10;
			if (local110 / 10 != local30) {
				return false;
			}
			local30 = local110;
			local28 = true;
		}
		return local28;
	}
}
