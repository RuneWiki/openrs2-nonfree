import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!nv", name = "n", descriptor = "Z")
	public static boolean aBoolean461;

	@OriginalMember(owner = "client!nv", name = "i", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray8;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II[J[II)V")
	public static void method5953(@OriginalArg(1) int arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg0 + arg3) / 2;
		@Pc(12) int local12 = arg0;
		@Pc(16) long local16 = arg1[local10];
		arg1[local10] = arg1[arg3];
		arg1[arg3] = local16;
		@Pc(30) int local30 = arg2[local10];
		arg2[local10] = arg2[arg3];
		arg2[arg3] = local30;
		@Pc(51) int local51 = ~local16 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(53) int local53 = arg0; local53 < arg3; local53++) {
			if ((long) (local53 & local51) + local16 > arg1[local53]) {
				@Pc(72) long local72 = arg1[local53];
				arg1[local53] = arg1[local12];
				arg1[local12] = local72;
				@Pc(86) int local86 = arg2[local53];
				arg2[local53] = arg2[local12];
				arg2[local12++] = local86;
			}
		}
		arg1[arg3] = arg1[local12];
		arg1[local12] = local16;
		arg2[arg3] = arg2[local12];
		arg2[local12] = local30;
		method5953(arg0, arg1, arg2, local12 - 1);
		method5953(local12 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(III)Z")
	public static boolean method5954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static294.method4655(arg1, arg0) || Static111.method1653(arg1, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method5956(@OriginalArg(1) String arg0) {
		return Static181.method3134(10, arg0);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZII)Ljava/lang/String;")
	public static String method5957(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (10 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + 10);
		} else if (arg1 && arg0 >= 0) {
			@Pc(45) int local45 = 2;
			@Pc(49) int local49 = arg0 / 10;
			while (local49 != 0) {
				local49 /= 10;
				local45++;
			}
			if (87 != 87) {
				return null;
			}
			@Pc(76) char[] local76 = new char[local45];
			local76[0] = '+';
			for (@Pc(84) int local84 = local45 - 1; local84 > 0; local84--) {
				@Pc(88) int local88 = arg0;
				arg0 /= 10;
				@Pc(99) int local99 = local88 - arg0 * 10;
				if (local99 < 10) {
					local76[local84] = (char) (local99 + 48);
				} else {
					local76[local84] = (char) (local99 + 87);
				}
			}
			return new String(local76);
		} else {
			return Integer.toString(arg0, 10);
		}
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(III)Z")
	public static boolean method5958(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
