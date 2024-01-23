import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "Lclient!mb;")
	public static Class70 aClass70_30;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "[I")
	public static int[] anIntArray208;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "[I")
	public static int[] anIntArray206 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "[I")
	public static int[] anIntArray207 = new int[2];

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "J")
	public static long aLong110 = 0L;

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1086 = Static64.method1101("cookiehost");

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "Lclient!fe;")
	public static Class41_Sub1 aClass41_Sub1_1 = null;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static148.anIntArrayArrayArray7[arg0][local16][local20] == -Static134.anInt3026) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static20.anIntArrayArrayArray2[arg0][arg1][arg3] + arg5;
			if (!Static181.method3050(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static181.method3050(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static181.method3050(local20, local156, local182)) {
				return false;
			} else if (Static181.method3050(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static77.method1327(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static181.method3050(local16 + 1, Static20.anIntArrayArrayArray2[arg0][arg1][arg3] + arg5, local20 + 1) && Static181.method3050(local16 + 128 - 1, Static20.anIntArrayArrayArray2[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static181.method3050(local16 + 128 - 1, Static20.anIntArrayArrayArray2[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static181.method3050(local16 + 1, Static20.anIntArrayArrayArray2[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIII)I")
	public static int method2458(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg0 >> 5 << 7) + (arg1 >> 2 << 10) + (arg2 >> 1);
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)Lclient!pb;")
	public static Class83 method2460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static22.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt1124; local13++) {
			@Pc(19) Class83 local19 = local7.aClass83Array3[local13];
			if ((local19.aLong118 >> 29 & 0x3L) == 2L && local19.anInt3340 == arg1 && local19.anInt3336 == arg2) {
				return local19;
			}
		}
		return null;
	}
}
