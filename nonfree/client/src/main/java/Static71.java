import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!dg", name = "D", descriptor = "Lclient!qe;")
	public static Class199 aClass199_3;

	@OriginalMember(owner = "client!dg", name = "B", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_25 = new Class44(24, 15);

	@OriginalMember(owner = "client!dg", name = "C", descriptor = "Lclient!ld;")
	public static final Class145 aClass145_1 = new Class145();

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIII)I")
	public static int method1293(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static372.aClass106Array11 == null) {
			return 0;
		} else if (arg2 < 3) {
			@Pc(25) int local25 = arg0 >> 7;
			@Pc(29) int local29 = arg3 >> 7;
			if (arg4 < 0 || arg1 < 0 || arg4 > Static81.anInt1950 - 1 || arg1 > Static171.anInt3288 - 1) {
				return 0;
			} else if (local25 >= 1 && local29 >= 1 && local25 <= Static81.anInt1950 - 1 && local29 <= Static171.anInt3288 - 1) {
				@Pc(101) boolean local101 = (Static367.aByteArrayArrayArray16[1][arg0 >> 7][arg3 >> 7] & 0x2) != 0;
				@Pc(123) boolean local123;
				@Pc(139) boolean local139;
				if ((arg0 & 0x7F) == 0) {
					local123 = (Static367.aByteArrayArrayArray16[1][local25 - 1][arg3 >> 7] & 0x2) != 0;
					local139 = (Static367.aByteArrayArrayArray16[1][local25][arg3 >> 7] & 0x2) != 0;
					if (local123 != local139) {
						local101 = (Static367.aByteArrayArrayArray16[1][arg4][arg1] & 0x2) != 0;
					}
				}
				if ((arg3 & 0x7F) == 0) {
					local123 = (Static367.aByteArrayArrayArray16[1][arg0 >> 7][local29 - 1] & 0x2) != 0;
					local139 = (Static367.aByteArrayArrayArray16[1][arg0 >> 7][local29] & 0x2) != 0;
					if (local123 != local139) {
						local101 = (Static367.aByteArrayArrayArray16[1][arg4][arg1] & 0x2) != 0;
					}
				}
				if (local101) {
					arg2++;
				}
				return Static372.aClass106Array11[arg2].va(arg0, arg3);
			} else {
				return 0;
			}
		} else {
			return Static372.aClass106Array11[arg2].va(arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZIIII)Lclient!ks;")
	public static Class2_Sub25 method1294(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class2_Sub25 local12 = new Class2_Sub25();
		local12.anInt4163 = arg2;
		local12.anInt4162 = arg1;
		Static398.aClass240_27.method5430((long) arg3, local12);
		Static404.method5491(arg2);
		@Pc(31) Class41 local31 = Static160.method2564(arg3);
		if (local31 != null) {
			Static168.method2616(local31);
		}
		if (Static351.aClass41_13 != null) {
			Static168.method2616(Static351.aClass41_13);
			Static351.aClass41_13 = null;
		}
		Static231.method3539();
		if (local31 != null) {
			Static115.method5068(!arg0, local31);
		}
		if (!arg0) {
			Static290.method4231(arg2);
		}
		if (!arg0 && Static108.anInt2264 != -1) {
			Static442.method5989(Static108.anInt2264, 1);
		}
		return local12;
	}
}
