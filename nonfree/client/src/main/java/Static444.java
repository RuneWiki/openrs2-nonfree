import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray14 = new int[2][][];

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "[[B")
	public static final byte[][] aByteArrayArray60 = new byte[1000][];

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "[I")
	public static final int[] anIntArray620 = new int[13];

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
	public static int anInt7234 = 0;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
	public static void method5712() {
		Static402.anInt6692 = 0;
		@Pc(19) int local19 = Static438.aClass2_Sub23_Sub2_2.method5492();
		@Pc(23) int local23 = Static438.aClass2_Sub23_Sub2_2.method5493();
		@Pc(27) int local27 = Static438.aClass2_Sub23_Sub2_2.method5464();
		@Pc(36) boolean local36 = Static438.aClass2_Sub23_Sub2_2.method5495() == 1;
		Static261.method3930(local27);
		@Pc(47) int local47 = (Static379.anInt6425 - Static438.aClass2_Sub23_Sub2_2.anInt6952) / 16;
		Static182.anIntArrayArray34 = new int[local47][4];
		@Pc(57) int local57;
		for (@Pc(53) int local53 = 0; local53 < local47; local53++) {
			for (local57 = 0; local57 < 4; local57++) {
				Static182.anIntArrayArray34[local53][local57] = Static438.aClass2_Sub23_Sub2_2.method5508();
			}
		}
		Static86.anIntArray372 = new int[local47];
		Static142.anIntArray270 = new int[local47];
		Static129.aByteArrayArray22 = new byte[local47][];
		Static182.anIntArray313 = new int[local47];
		Static98.anIntArray183 = new int[local47];
		Static334.anIntArray494 = new int[local47];
		Static450.aByteArrayArray63 = null;
		Static300.anIntArray434 = null;
		Static428.aByteArrayArray59 = new byte[local47][];
		Static248.aByteArrayArray36 = new byte[local47][];
		Static423.aByteArrayArray64 = new byte[local47][];
		local47 = 0;
		for (local57 = (local19 - (Static229.anInt4427 >> 4)) / 8; local57 <= (local19 + (Static229.anInt4427 >> 4)) / 8; local57++) {
			for (@Pc(134) int local134 = (local23 - (Static379.anInt6422 >> 4)) / 8; local134 <= ((Static379.anInt6422 >> 4) + local23) / 8; local134++) {
				Static334.anIntArray494[local47] = local134 + (local57 << 8);
				Static86.anIntArray372[local47] = Static368.aClass160_73.method3704("m" + local57 + "_" + local134);
				Static98.anIntArray183[local47] = Static368.aClass160_73.method3704("l" + local57 + "_" + local134);
				Static142.anIntArray270[local47] = Static368.aClass160_73.method3704("um" + local57 + "_" + local134);
				Static182.anIntArray313[local47] = Static368.aClass160_73.method3704("ul" + local57 + "_" + local134);
				local47++;
			}
		}
		Static187.method2965(false, local23, local19, local36);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIII)V")
	public static void method5713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static104.anInt2441; local7++) {
			@Pc(13) Rectangle local13 = Class200.aRectangleArray3[local7];
			if (local13.width + local13.x > arg2 && arg1 + arg2 > local13.x && local13.y + local13.height > arg3 && local13.y < arg0 + arg3) {
				Static243.aBooleanArray19[local7] = true;
			}
		}
	}
}
