import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "Z")
	public static boolean aBoolean506 = false;

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray51 = new String[8];

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)V")
	public static void method5970(@OriginalArg(0) int arg0) {
		Static222.anInt3839 = arg0;
		@Pc(15) Class295 local15 = Static641.aClass295_68;
		synchronized (Static641.aClass295_68) {
			Static641.aClass295_68.method6464();
		}
		local15 = Static324.aClass295_30;
		synchronized (Static324.aClass295_30) {
			Static324.aClass295_30.method6464();
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIII)V")
	public static void method5971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static403.anIntArrayArray59 != null) {
			Static403.anIntArrayArray59[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static465.aShortArrayArray8 != null) {
			Static465.aShortArrayArray8[arg0][arg1] = (short) arg3;
		}
		if (Static510.aByteArrayArray12 != null) {
			Static510.aByteArrayArray12[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
	public static void method5972() {
		@Pc(9) int[] local9 = new int[Static117.aClass197_2.anInt5259];
		@Pc(11) int local11 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static117.aClass197_2.anInt5259; local17++) {
			@Pc(24) Class15 local24 = Static117.aClass197_2.method4518(local17);
			if (local24.anInt428 >= 0 || local24.anInt416 >= 0) {
				local9[local11++] = local17;
			}
		}
		Static138.anIntArray145 = new int[local11];
		for (@Pc(52) int local52 = 0; local52 < local11; local52++) {
			Static138.anIntArray145[local52] = local9[local52];
		}
	}
}
