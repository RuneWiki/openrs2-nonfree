import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
	public static int anInt6030;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_73 = new Class306("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)I")
	public static int method5101(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIB)Z")
	public static boolean method5103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)I")
	public static int method5104() {
		if (Static15.aBoolean16) {
			return 6;
		} else if (Static46.aClass1_Sub24_1 == null) {
			return 0;
		} else {
			@Pc(22) int local22 = Static46.aClass1_Sub24_1.anInt3161;
			if (Static156.method2464(local22)) {
				return 1;
			} else if (Static268.method4415(local22)) {
				return 2;
			} else if (Static174.method2615(local22)) {
				return 3;
			} else if (Static295.method4713(local22)) {
				return 4;
			} else {
				return 5;
			}
		}
	}
}
