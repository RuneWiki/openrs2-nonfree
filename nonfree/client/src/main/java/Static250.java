import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!ki", name = "i", descriptor = "[Lclient!taa;")
	public static Class266[] aClass266Array1;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_145 = new Class202("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
	public static int anInt4568 = 0;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BI)V")
	public static void method3960(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static485.anInt8595 = arg0;
		Static16.aClass6_Sub7Array1 = new Class6_Sub7[Static538.anIntArray759[Static485.anInt8595] + 1];
		Static386.anInt7085 = 0;
		anInt4568 = 0;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIBILclient!aba;ZI)V")
	public static void method3962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class4 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (Static374.anInt6954 >= 50 || (arg3 == null || arg3.anIntArrayArray1 == null || arg0 >= arg3.anIntArrayArray1.length || arg3.anIntArrayArray1[arg0] == null)) {
			return;
		}
		@Pc(34) int local34 = arg3.anIntArrayArray1[arg0][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		if (arg3.anIntArrayArray1[arg0].length > 1) {
			@Pc(63) int local63 = (int) ((double) arg3.anIntArrayArray1[arg0].length * Math.random());
			if (local63 > 0) {
				local38 = arg3.anIntArrayArray1[arg0][local63];
			}
		}
		@Pc(79) int local79 = local34 & 0x1F;
		if (local79 == 0) {
			if (arg4) {
				Static484.method7208(local44, 255, 0, local38);
			}
		} else if (Static281.aClass2_Sub19_Sub1_1.anInt2202 != 0) {
			@Pc(111) int local111 = arg5 - 64 >> 7;
			@Pc(117) int local117 = arg1 - 64 >> 7;
			Static469.aClass141Array1[Static374.anInt6954++] = new Class141((byte) 1, local38, local44, 0, 255, local79 + (local117 << 8) + (arg2 << 24) + (local111 << 16));
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)V")
	public static void method3963(@OriginalArg(0) int arg0) {
		Static276.anInt5003 = -1;
		Static25.anInt1756 = arg0;
		Static277.anInt5015 = 3;
		Static533.anInt9264 = 100;
	}
}
