import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!tga", name = "J", descriptor = "F")
	public static float aFloat179;

	@OriginalMember(owner = "client!tga", name = "N", descriptor = "[[I")
	public static int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!tga", name = "O", descriptor = "Lclient!fs;")
	public static Class115 aClass115_1;

	@OriginalMember(owner = "client!tga", name = "G", descriptor = "Lclient!wn;")
	public static final Class379 aClass379_10 = new Class379("", 16);

	@OriginalMember(owner = "client!tga", name = "K", descriptor = "I")
	public static int anInt9105 = 0;

	@OriginalMember(owner = "client!tga", name = "P", descriptor = "Z")
	public static boolean aBoolean676 = false;

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(BIII)I")
	public static int method7813(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return ((arg0 >> 2 & 0x3F) << 10) + (arg1 >> 5 << 7) + (arg2 >> 1);
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(B)V")
	public static void method7818() {
		@Pc(1) Class136 local1 = Static40.aClass136_9;
		synchronized (Static40.aClass136_9) {
			Static40.aClass136_9.method3142();
		}
		local1 = Static309.aClass136_36;
		synchronized (Static309.aClass136_36) {
			Static309.aClass136_36.method3142();
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILclient!ha;BI)V")
	public static void method7819(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(3) int arg2) {
		Static511.aClass82_16 = arg1;
		Static133.aClass291ArrayArray30 = new Class291[arg0][arg2];
		if (Static589.anIntArray607 != null) {
			Static429.aClass141_2 = Static636.method8569(Static589.anIntArray607[2], Static589.anIntArray607[4], Static589.anIntArray607[0], Static589.anIntArray607[3], Static589.anIntArray607[1], Static589.anIntArray607[5]);
		}
		Static304.aClass291_5 = new Class291();
		Static247.method4167();
	}
}
