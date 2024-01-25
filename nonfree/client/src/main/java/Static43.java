import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "Lclient!vb;")
	public static Class251 aClass251_3;

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_17 = new Class96("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
	public static int anInt678 = 0;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
	public static void method574() {
		Static344.method4954(Static447.aClass121_11, (long) Static123.anInt2333);
		if (Static246.anInt4292 != -1) {
			Static3.method38(Static246.anInt4292);
		}
		for (@Pc(19) int local19 = 0; local19 < Static346.anInt6355; local19++) {
			if (Static204.aBooleanArray15[local19]) {
				Static41.aBooleanArray2[local19] = true;
			}
			Static105.aBooleanArray7[local19] = Static204.aBooleanArray15[local19];
			Static204.aBooleanArray15[local19] = false;
		}
		Static260.anInt5254 = Static123.anInt2333;
		if (Static447.aClass121_11.method4605()) {
			Static81.aBoolean127 = true;
		}
		if (Static246.anInt4292 != -1) {
			Static346.anInt6355 = 0;
			Static262.method3693();
		}
		Static447.aClass121_11.va();
		Static153.method3789(Static321.anInt5593);
		Static384.anInt6843 = 0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ps;I)I")
	public static int method575(@OriginalArg(0) Class47_Sub1_Sub5_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt5459;
		@Pc(12) Class231 local12 = arg0.method4327();
		if (arg0.aBoolean432) {
			local8 = arg0.anInt5452;
		} else if (local12.anInt6975 == arg0.anInt5393 || arg0.anInt5393 == local12.anInt6972 || local12.anInt6998 == arg0.anInt5393 || arg0.anInt5393 == local12.anInt6984) {
			local8 = arg0.anInt5458;
		} else if (arg0.anInt5393 == local12.anInt7005 || arg0.anInt5393 == local12.anInt6973 || arg0.anInt5393 == local12.anInt6976 || local12.anInt7004 == arg0.anInt5393) {
			local8 = arg0.anInt5457;
		}
		return local8;
	}
}
