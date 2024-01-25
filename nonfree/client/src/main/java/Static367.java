import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
	public static int anInt6860 = 0;

	@OriginalMember(owner = "client!pd", name = "I", descriptor = "Z")
	public static boolean aBoolean436 = false;

	@OriginalMember(owner = "client!pd", name = "L", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_119 = new Class133(2, 12);

	@OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
	public static int anInt6867 = 0;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)Z")
	public static boolean method5756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static363.method5711(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static33.anInt880;
			@Pc(14) int local14 = arg2 << Static33.anInt880;
			return Static434.method6594(local10 + 1, Static511.aClass52Array3[arg0].JA(arg1, arg2) + arg3, local14 + 1) && Static434.method6594(local10 + Static219.anInt4777 - 1, Static511.aClass52Array3[arg0].JA(arg1 + 1, arg2) + arg3, local14 + 1) && Static434.method6594(local10 + Static219.anInt4777 - 1, Static511.aClass52Array3[arg0].JA(arg1 + 1, arg2 + 1) + arg3, local14 + Static219.anInt4777 - 1) && Static434.method6594(local10 + 1, Static511.aClass52Array3[arg0].JA(arg1, arg2 + 1) + arg3, local14 + Static219.anInt4777 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!fda;I[[B)V")
	public static void method5757(@OriginalArg(0) Class85_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(8) int local8 = Static326.aByteArrayArray16.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(16) byte[] local16 = arg1[local10];
			if (local16 != null) {
				@Pc(29) int local29 = (Static467.anIntArray715[local10] >> 8) * 64 - Static223.anInt4827;
				@Pc(39) int local39 = (Static467.anIntArray715[local10] & 0xFF) * 64 - Static150.anInt3027;
				Static442.method6680();
				arg0.method2297(Static121.aClass5_7, Static95.aClass306Array1, local29, local16, local39);
			}
		}
	}
}
