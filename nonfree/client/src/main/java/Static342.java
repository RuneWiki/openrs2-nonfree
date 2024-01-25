import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
	public static int anInt6527;

	@OriginalMember(owner = "client!vo", name = "h", descriptor = "Lclient!ij;")
	public static Class96 aClass96_1;

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "[S")
	public static short[] aShortArray112 = new short[256];

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)V")
	public static void method5467() {
		@Pc(8) Class4_Sub4_Sub18 local8 = Static302.method4961(0, 15);
		local8.method4902();
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIII)V")
	public static void method5468(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static195.anInt4097 < arg1 || Static349.anInt6619 > arg4) {
			return;
		}
		@Pc(26) boolean local26;
		if (Static5.anInt2965 > arg2) {
			arg2 = Static5.anInt2965;
			local26 = false;
		} else if (arg2 > Static220.anInt6565) {
			local26 = false;
			arg2 = Static220.anInt6565;
		} else {
			local26 = true;
		}
		@Pc(48) boolean local48;
		if (arg0 < Static5.anInt2965) {
			local48 = false;
			arg0 = Static5.anInt2965;
		} else if (Static220.anInt6565 >= arg0) {
			local48 = true;
		} else {
			local48 = false;
			arg0 = Static220.anInt6565;
		}
		if (Static349.anInt6619 <= arg1) {
			Static135.method2878(Static223.anIntArrayArray124[arg1++], arg0, arg3, arg2);
		} else {
			arg1 = Static349.anInt6619;
		}
		if (Static195.anInt4097 < arg4) {
			arg4 = Static195.anInt4097;
		} else {
			Static135.method2878(Static223.anIntArrayArray124[arg4--], arg0, arg3, arg2);
		}
		@Pc(109) int local109;
		if (local26 && local48) {
			for (local109 = arg1; local109 <= arg4; local109++) {
				@Pc(115) int[] local115 = Static223.anIntArrayArray124[local109];
				local115[arg2] = local115[arg0] = arg3;
			}
		} else if (local26) {
			for (local109 = arg1; local109 <= arg4; local109++) {
				Static223.anIntArrayArray124[local109][arg2] = arg3;
			}
		} else if (local48) {
			for (local109 = arg1; local109 <= arg4; local109++) {
				Static223.anIntArrayArray124[local109][arg0] = arg3;
			}
		}
	}
}
