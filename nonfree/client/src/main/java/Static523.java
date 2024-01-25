import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
	public static int anInt8091;

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "[I")
	public static final int[] anIntArray556 = new int[25];

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "Z")
	public static boolean aBoolean633 = false;

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)I")
	public static int method7043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static50.aByteArrayArray2 == null ? 0 : Static50.aByteArrayArray2[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIII)V")
	public static void method7044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) Class4_Sub5_Sub11 local18 = Static652.method8695((long) arg0 | (long) arg3 << 32, 19);
		local18.method3955();
		local18.anInt4427 = arg2;
		local18.anInt4425 = arg1;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILclient!bt;)V")
	public static void method7046(@OriginalArg(1) Class34 arg0) {
		Static389.anInt5686 = arg0.method1252("hitmarks");
		Static114.anInt2222 = arg0.method1252("hitbar_default");
		Static312.anInt4876 = arg0.method1252("timerbar_default");
		Static41.anInt850 = arg0.method1252("headicons_pk");
		Static110.anInt2179 = arg0.method1252("headicons_prayer");
		Static206.anInt3355 = arg0.method1252("hint_headicons");
		Static148.anInt2698 = arg0.method1252("hint_mapmarkers");
		Static416.anInt5990 = arg0.method1252("mapflag");
		Static201.anInt3303 = arg0.method1252("cross");
		Static303.anInt4791 = arg0.method1252("mapdots");
		Static6.anInt87 = arg0.method1252("scrollbar");
		Static220.anInt3540 = arg0.method1252("name_icons");
		Static633.anInt9786 = arg0.method1252("floorshadows");
		Static654.anInt10323 = arg0.method1252("compass");
		Static36.anInt795 = arg0.method1252("otherlevel");
		Static128.anInt2407 = arg0.method1252("hint_mapedge");
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
	public static void method7047() {
		Static85.anIntArray116 = Static281.method4067(0.4F);
	}
}
