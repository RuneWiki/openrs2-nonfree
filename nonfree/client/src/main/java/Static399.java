import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!u", name = "g", descriptor = "[I")
	public static final int[] anIntArray401 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!u", name = "j", descriptor = "I")
	public static int anInt6510 = 0;

	@OriginalMember(owner = "client!u", name = "q", descriptor = "[I")
	public static int[] anIntArray402 = new int[1];

	@OriginalMember(owner = "client!u", name = "v", descriptor = "[I")
	public static final int[] anIntArray403 = new int[4096];

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIILclient!ji;I)Ljava/awt/Frame;")
	public static Frame method5009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class124 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method2518()) {
			return null;
		}
		@Pc(28) Class195[] local28 = Static370.method4800(arg2);
		if (local28 == null) {
			return null;
		}
		@Pc(34) boolean local34 = false;
		for (@Pc(36) int local36 = 0; local36 < local28.length; local36++) {
			if (arg1 == local28[local36].anInt5213 && arg0 == local28[local36].anInt5212 && (!local34 || arg3 < local28[local36].anInt5216)) {
				local34 = true;
				arg3 = local28[local36].anInt5216;
			}
		}
		if (!local34) {
			return null;
		}
		@Pc(102) Class215 local102 = arg2.method2530(arg3, arg0, arg1);
		while (local102.anInt5791 == 0) {
			Static252.method2874(10L);
		}
		@Pc(114) Frame local114 = (Frame) local102.anObject10;
		if (local114 == null) {
			return null;
		} else if (local102.anInt5791 == 2) {
			Static208.method2803(arg2, local114);
			return null;
		} else {
			return local114;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZI)Z")
	public static boolean method5010(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static280.method3526(arg1, arg0)) {
			return (arg0 & 0xB000) != 0 | Static443.method4778(arg0, arg1) | Static316.method4088(arg1, arg0) ? true : (arg1 & 0x37) == 0 & (Static186.method3972(arg1, arg0) | Static290.method3790(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(IIII)Lclient!me;")
	public static Class20_Sub3_Sub3 method5014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class82 local11 = Static159.aClass82ArrayArrayArray2[arg2][arg1][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(25) Class20_Sub3_Sub3 local25 = null;
		@Pc(27) int local27 = -1;
		for (@Pc(30) Class146 local30 = local11.aClass146_1; local30 != null; local30 = local30.aClass146_3) {
			@Pc(34) Class20_Sub3 local34 = local30.aClass20_Sub3_1;
			if (local34 instanceof Class20_Sub3_Sub3) {
				@Pc(40) Class20_Sub3_Sub3 local40 = (Class20_Sub3_Sub3) local34;
				@Pc(48) int local48 = local40.method4678() * 64 - 4;
				@Pc(56) int local56 = local40.anInt6613 - local48 >> 7;
				@Pc(64) int local64 = local40.anInt6616 - local48 >> 7;
				@Pc(72) int local72 = local40.anInt6613 + local48 >> 7;
				@Pc(79) int local79 = local40.anInt6616 + local48 >> 7;
				if (local56 <= arg1 && arg0 >= local64 && local72 >= arg1 && arg0 <= local79) {
					@Pc(105) int local105 = (local72 + 1 - arg1) * (-arg0 + 1 + local79);
					if (local105 > local27) {
						local27 = local105;
						local25 = local40;
					}
				}
			}
		}
		return local25;
	}
}
