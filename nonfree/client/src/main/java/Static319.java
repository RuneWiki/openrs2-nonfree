import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "[I")
	public static int[] anIntArray483;

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "F")
	public static float aFloat94;

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "[J")
	public static final long[] aLongArray8 = new long[100];

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
	public static int anInt6181 = 0;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IC)Z")
	public static boolean method5248(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;ZBI)I")
	public static int method5249(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(48) char local48 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local28 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(76) int local76;
			if (local48 >= '0' && local48 <= '9') {
				local76 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local76 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local76 = local48 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local76) {
				throw new NumberFormatException();
			}
			if (local28) {
				local76 = -local76;
			}
			@Pc(126) int local126 = local76 + arg1 * local37;
			if (local37 != local126 / arg1) {
				throw new NumberFormatException();
			}
			local30 = true;
			local37 = local126;
		}
		if (!local30) {
			throw new NumberFormatException();
		}
		return local37;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public static void method5250() {
		if (Static261.aClass35_2 != null) {
			Static261.aClass35_2.method2559();
		}
		if (Static201.aClass35_1 != null) {
			Static201.aClass35_1.method2559();
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIII)V")
	public static void method5251(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class4_Sub4_Sub18 local8 = Static302.method4961(arg1, 11);
		local8.method4908();
		local8.anInt5705 = arg2;
		local8.anInt5703 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZ)V")
	public static void method5253(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) Class4_Sub44 local16 = Static92.method531(arg1, arg0);
		if (local16 != null) {
			local16.method5687();
		}
	}
}
