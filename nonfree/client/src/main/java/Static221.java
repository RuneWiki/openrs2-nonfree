import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!kq", name = "F", descriptor = "I")
	public static int anInt4063 = 0;

	@OriginalMember(owner = "client!kq", name = "J", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIII)V")
	public static void method3182(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static182.anInt3402 < arg1 || Static142.anInt2163 > arg4) {
			return;
		}
		@Pc(35) boolean local35;
		if (arg2 < Static281.anInt4757) {
			arg2 = Static281.anInt4757;
			local35 = false;
		} else if (arg2 > Static457.anInt7264) {
			arg2 = Static457.anInt7264;
			local35 = false;
		} else {
			local35 = true;
		}
		@Pc(54) boolean local54;
		if (arg3 < Static281.anInt4757) {
			local54 = false;
			arg3 = Static281.anInt4757;
		} else if (arg3 > Static457.anInt7264) {
			arg3 = Static457.anInt7264;
			local54 = false;
		} else {
			local54 = true;
		}
		if (Static142.anInt2163 > arg1) {
			arg1 = Static142.anInt2163;
		} else {
			Static298.method3977(arg2, arg0, arg3, Static194.anIntArrayArray28[arg1++]);
		}
		if (Static182.anInt3402 < arg4) {
			arg4 = Static182.anInt3402;
		} else {
			Static298.method3977(arg2, arg0, arg3, Static194.anIntArrayArray28[arg4--]);
		}
		@Pc(115) int local115;
		if (local35 && local54) {
			for (local115 = arg1; local115 <= arg4; local115++) {
				@Pc(161) int[] local161 = Static194.anIntArrayArray28[local115];
				local161[arg2] = local161[arg3] = arg0;
			}
			return;
		}
		if (local35) {
			for (local115 = arg1; local115 <= arg4; local115++) {
				Static194.anIntArrayArray28[local115][arg2] = arg0;
			}
			return;
		}
		if (local54) {
			for (local115 = arg1; local115 <= arg4; local115++) {
				Static194.anIntArrayArray28[local115][arg3] = arg0;
			}
			return;
		}
	}
}
