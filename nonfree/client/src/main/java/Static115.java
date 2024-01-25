import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
	public static int anInt2673;

	@OriginalMember(owner = "client!ei", name = "S", descriptor = "Lclient!an;")
	public static Class16 aClass16_29;

	@OriginalMember(owner = "client!ei", name = "J", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_67 = new Class88(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!ei", name = "R", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZI)V")
	public static void method2382() {
		Static3.aClass125_1.method3447(5);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIBI)I")
	public static int method2383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg1 & 0xF;
		@Pc(14) int local14 = local7 >= 8 ? arg3 : arg2;
		@Pc(40) int local40 = local7 < 4 ? arg3 : local7 == 12 || local7 == 14 ? arg2 : arg0;
		return ((local7 & 0x1) == 0 ? local14 : -local14) + ((local7 & 0x2) == 0 ? local40 : -local40);
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(B)V")
	public static void method2384() {
		Static175.aClass12_Sub20_1 = new Class12_Sub20(Static124.aClass88_73.method2391(Static345.anInt6495), "", Static4.anInt69, 1002, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "([BI)Z")
	public static boolean method2385(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class12_Sub8 local8 = new Class12_Sub8(arg0);
		@Pc(12) int local12 = local8.method5216();
		if (local12 != 2) {
			return false;
		}
		@Pc(31) boolean local31 = local8.method5216() == 1;
		if (local31) {
			Static116.method2388(local8);
		}
		Static69.method7539(local8);
		return true;
	}
}
