import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!pba", name = "B", descriptor = "I")
	public static int anInt7781;

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(II)Z")
	public static boolean method6604(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!pba", name = "c", descriptor = "(III)V")
	public static void method6605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class5_Sub2_Sub4 local9 = Static257.method3597(17, (long) arg0);
		local9.method2438();
		local9.anInt2749 = arg1;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IZLclient!iw;)V")
	public static void method6606(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub15_Sub2 arg1) {
		Static74.anInt1181 = 0;
		Static656.aBoolean749 = false;
		Static658.method7911(arg1);
		Static573.method7839(arg1);
		if (Static656.aBoolean749) {
			System.out.println("---endgpp---");
		}
		if (arg1.anInt4144 != arg0) {
			throw new RuntimeException("gpi1 pos:" + arg1.anInt4144 + " psize:" + arg0);
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(BLclient!rv;)V")
	public static void method6607(@OriginalArg(1) Class5_Sub15 arg0) {
		if (arg0.aByteArray45.length - arg0.anInt4144 < 1) {
			return;
		}
		@Pc(17) int local17 = arg0.method3642();
		if (local17 < 0 || local17 > 1 || arg0.aByteArray45.length - arg0.anInt4144 < 2) {
			return;
		}
		@Pc(48) int local48 = arg0.method3698();
		if (arg0.aByteArray45.length - arg0.anInt4144 < local48 * 6) {
			return;
		}
		for (@Pc(66) int local66 = 0; local66 < local48; local66++) {
			@Pc(71) int local71 = arg0.method3698();
			@Pc(75) int local75 = arg0.method3671();
			if (local71 < Static205.anIntArray184.length && Static155.aBooleanArray3[local71] && (Static634.aClass144_1.method2993(local71).aChar6 != '1' || local75 >= -1 && local75 <= 1)) {
				Static205.anIntArray184[local71] = local75;
			}
		}
	}
}
