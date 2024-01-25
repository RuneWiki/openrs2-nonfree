import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
	public static int anInt2532;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "Lclient!fc;")
	public static Class71 aClass71_28;

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray55;

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_96 = new Class221("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "Lclient!mq;")
	public static final Class154 aClass154_12 = new Class154(200);

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "Z")
	public static boolean aBoolean194 = true;

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "[I")
	public static final int[] anIntArray287 = new int[3];

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
	public static final int anInt2538 = 1400;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)V")
	public static void method2376(@OriginalArg(0) int arg0) {
		for (@Pc(9) Class2 local9 = Static360.aClass214_31.method5060(); local9 != null; local9 = Static360.aClass214_31.method5064()) {
			if ((long) arg0 == (local9.aLong208 >> 48 & 0xFFFFL)) {
				local9.method5745();
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)Z")
	public static boolean method2377() {
		return Static371.aBoolean486;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIZZ)I")
	public static int method2379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class2_Sub16 local8 = Static108.method2083(arg2, arg1);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local8.anIntArray273.length) {
			return local8.anIntArray273[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IJ)V")
	public static void method2380(@OriginalArg(1) long arg0) {
		Static39.aClass2_Sub13_Sub2_4.anInt4788 = 0;
		Static39.aClass2_Sub13_Sub2_4.method4207(Static74.aClass101_17.anInt2534);
		Static39.aClass2_Sub13_Sub2_4.method4208(arg0);
		Static343.anInt6052 = 0;
		Static289.anInt5127 = 1;
		Static304.anInt2193 = -3;
		Static265.anInt4677 = 0;
	}
}
