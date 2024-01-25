import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!wj", name = "s", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_150 = new Class90(81, 6);

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIBIII)V")
	public static void method8144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 > Static160.anInt3347 || Static289.anInt5872 > arg2) {
			return;
		}
		@Pc(19) boolean local19;
		if (arg1 < Static292.anInt5983) {
			local19 = false;
			arg1 = Static292.anInt5983;
		} else if (arg1 > Static61.anInt1627) {
			local19 = false;
			arg1 = Static61.anInt1627;
		} else {
			local19 = true;
		}
		@Pc(36) boolean local36;
		if (Static292.anInt5983 > arg3) {
			local36 = false;
			arg3 = Static292.anInt5983;
		} else if (Static61.anInt1627 < arg3) {
			arg3 = Static61.anInt1627;
			local36 = false;
		} else {
			local36 = true;
		}
		if (arg4 >= Static289.anInt5872) {
			Static238.method3886(Static442.anIntArrayArray48[arg4++], arg3, arg0, arg1);
		} else {
			arg4 = Static289.anInt5872;
		}
		if (arg2 > Static160.anInt3347) {
			arg2 = Static160.anInt3347;
		} else {
			Static238.method3886(Static442.anIntArrayArray48[arg2--], arg3, arg0, arg1);
		}
		@Pc(101) int local101;
		if (local19 && local36) {
			for (local101 = arg4; local101 <= arg2; local101++) {
				@Pc(139) int[] local139 = Static442.anIntArrayArray48[local101];
				local139[arg1] = local139[arg3] = arg0;
			}
		} else if (local19) {
			for (local101 = arg4; local101 <= arg2; local101++) {
				Static442.anIntArrayArray48[local101][arg1] = arg0;
			}
		} else if (local36) {
			for (local101 = arg4; local101 <= arg2; local101++) {
				Static442.anIntArrayArray48[local101][arg3] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)V")
	public static void method8145(@OriginalArg(0) int arg0) {
		if (Static274.anInt5755 == 1) {
			Static410.anInt8174 = arg0;
		} else if (Static274.anInt5755 == 2 || Static274.anInt5755 == 3) {
			Static229.anInt4849 = arg0;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BII)Z")
	public static boolean method8146(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
