import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!co", name = "f", descriptor = "Lclient!g;")
	public static Class83 aClass83_31;

	@OriginalMember(owner = "client!co", name = "h", descriptor = "[S")
	public static short[] aShortArray9;

	@OriginalMember(owner = "client!co", name = "k", descriptor = "Lclient!ws;")
	public static Class2_Sub43 aClass2_Sub43_1;

	@OriginalMember(owner = "client!co", name = "i", descriptor = "[I")
	public static final int[] anIntArray84 = new int[2048];

	@OriginalMember(owner = "client!co", name = "x", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_35 = new Class62("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!co", name = "y", descriptor = "Lclient!ss;")
	public static final Class213 aClass213_5 = new Class213(8, 6);

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(B)V")
	public static void method830() {
		if (Static390.aBoolean507) {
			return;
		}
		Static390.aBoolean507 = true;
		if (Static260.aBoolean369) {
			Static350.aFloat74 = (int) Static350.aFloat74 - 65 & 0xFFFFFF80;
		} else {
			Static335.aFloat72 += (-24.0F - Static335.aFloat72) / 2.0F;
		}
		Static221.aBoolean480 = true;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!kt;I[[B)V")
	public static void method831(@OriginalArg(0) Class133_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int local12 = Static227.aByteArrayArray15.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(20) byte[] local20 = arg1[local14];
			if (local20 != null) {
				@Pc(33) int local33 = (Static71.anIntArray118[local14] >> 8) * 64 - Static279.anInt5198;
				@Pc(44) int local44 = (Static71.anIntArray118[local14] & 0xFF) * 64 - Static350.anInt6470;
				Static131.method2293();
				arg0.method3478(local33, Static383.aClass48_9, local44, local20, Static165.aClass178Array1);
			}
		}
	}
}
