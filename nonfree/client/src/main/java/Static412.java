import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
	public static int anInt7717;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray71 = new int[128][128];

	@OriginalMember(owner = "client!qt", name = "h", descriptor = "[I")
	public static final int[] anIntArray553 = new int[2];

	@OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
	public static final int anInt7723 = 1406;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZIZII)Lclient!an;")
	public static Class16 method6423(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(12) Class224 local12 = null;
		if (Static294.aClass38_2 != null) {
			local12 = new Class224(arg2, Static294.aClass38_2, Static165.aClass38Array1[arg2], 1000000);
		}
		Static426.aClass117_Sub1Array4[arg2] = Static215.aClass276_1.method6857(local12, arg2, Static161.aClass224_2);
		if (arg1) {
			Static426.aClass117_Sub1Array4[arg2].method4006();
		}
		return new Class16(Static426.aClass117_Sub1Array4[arg2], arg0, 1);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIB)Z")
	public static boolean method6427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(III)V")
	public static void method6428(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class12_Sub4_Sub1 local8 = Static389.method6156(14, arg0);
		local8.method820();
		local8.anInt806 = arg1;
	}
}
