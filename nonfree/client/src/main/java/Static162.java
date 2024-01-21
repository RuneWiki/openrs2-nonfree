import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1045 = Static81.method1507("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!re", name = "b", descriptor = "I")
	public static int anInt3573 = 1;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1046 = Static81.method1507("Please try again)3");

	@OriginalMember(owner = "client!re", name = "d", descriptor = "Lclient!ri;")
	public static final Class86 aClass86_52 = new Class86(64);

	@OriginalMember(owner = "client!re", name = "e", descriptor = "I")
	public static int anInt3574 = 0;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1047 = aClass24_1045;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1048 = aClass24_1046;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "Lclient!l;")
	public static final Class57 aClass57_36 = new Class57(4096);

	@OriginalMember(owner = "client!re", name = "i", descriptor = "J")
	public static volatile long aLong115 = 0L;

	@OriginalMember(owner = "client!re", name = "j", descriptor = "Lclient!s;")
	public static final Class87 aClass87_23 = new Class87();

	@OriginalMember(owner = "client!re", name = "k", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1049 = Static81.method1507("(U0a )2 via: ");

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!jh;)V")
	public static void method2730(@OriginalArg(0) Class51 arg0) {
		for (@Pc(2) int local2 = arg0.anInt2213; local2 <= arg0.anInt2208; local2++) {
			for (@Pc(6) int local6 = arg0.anInt2218; local6 <= arg0.anInt2205; local6++) {
				@Pc(16) Class1_Sub8 local16 = Static29.aClass1_Sub8ArrayArrayArray1[arg0.anInt2217][local2][local6];
				if (local16 != null) {
					@Pc(35) int local35;
					for (@Pc(20) int local20 = 0; local20 < local16.anInt1550; local20++) {
						if (local16.aClass51Array1[local20] == arg0) {
							local16.anInt1550--;
							for (local35 = local20; local35 < local16.anInt1550; local35++) {
								local16.aClass51Array1[local35] = local16.aClass51Array1[local35 + 1];
								local16.anIntArray131[local35] = local16.anIntArray131[local35 + 1];
							}
							local16.aClass51Array1[local16.anInt1550] = null;
							break;
						}
					}
					local16.anInt1546 = 0;
					for (local35 = 0; local35 < local16.anInt1550; local35++) {
						local16.anInt1546 |= local16.anIntArray131[local35];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static148.anIntArrayArrayArray9[arg0][local16][local20] == -Static164.anInt3660) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static181.anIntArrayArrayArray10[arg0][arg1][arg3] + arg5;
			if (!Static52.method1042(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static52.method1042(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static52.method1042(local20, local156, local182)) {
				return false;
			} else if (Static52.method1042(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static85.method2618(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static52.method1042(local16 + 1, Static181.anIntArrayArrayArray10[arg0][arg1][arg3] + arg5, local20 + 1) && Static52.method1042(local16 + 128 - 1, Static181.anIntArrayArrayArray10[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static52.method1042(local16 + 128 - 1, Static181.anIntArrayArrayArray10[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static52.method1042(local16 + 1, Static181.anIntArrayArrayArray10[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}
}
