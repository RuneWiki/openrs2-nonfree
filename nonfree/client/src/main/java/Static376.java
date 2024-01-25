import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!po", name = "a", descriptor = "I")
	public static int anInt6601 = 500;

	@OriginalMember(owner = "client!po", name = "f", descriptor = "[S")
	public static final short[] aShortArray117 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(I)I")
	public static int method5717() {
		@Pc(13) Class316 local13 = Static505.aClass316_61;
		synchronized (Static505.aClass316_61) {
			return Static505.aClass316_61.method7795();
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "([SI)[S")
	public static short[] method5719(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static555.method5091(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V")
	public static void method5720() {
		if (Static198.anInt4113 == 1 || Static198.anInt4113 == 3 || Static198.anInt4113 != Static492.anInt8390 && (Static198.anInt4113 == 0 || Static492.anInt8390 == 0)) {
			Static457.anInt7857 = 0;
			Static198.anInt4112 = 0;
			Static258.aClass174_15.method4423();
		}
		Static492.anInt8390 = Static198.anInt4113;
	}
}
