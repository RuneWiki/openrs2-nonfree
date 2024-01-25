import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static606 {

	@OriginalMember(owner = "client!uj", name = "T", descriptor = "[I")
	public static int[] anIntArray556;

	@OriginalMember(owner = "client!uj", name = "P", descriptor = "Z")
	public static boolean aBoolean772 = false;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(CI)Z")
	public static boolean method9084(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(26) char[] local26 = Static506.aCharArray7;
			for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
				@Pc(34) char local34 = local26[local28];
				if (local34 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(II)I")
	public static int method9085(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
	public static void method9086(@OriginalArg(0) Canvas arg0) {
		@Pc(10) Dimension local10 = arg0.getSize();
		Static474.method7543(local10.height, local10.width);
		if (Static255.anInt4904 == 1) {
			Static435.aClass101_11.method8092(arg0, Static488.anInt8751, Static307.anInt5554);
		} else {
			Static435.aClass101_11.method8092(arg0, Static506.anInt8995, Static588.anInt10265);
		}
	}
}
