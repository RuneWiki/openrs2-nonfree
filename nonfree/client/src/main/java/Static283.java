import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
	public static int anInt1548;

	@OriginalMember(owner = "client!oi", name = "T", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard2;

	@OriginalMember(owner = "client!oi", name = "I", descriptor = "I")
	public static final int anInt1545 = 205;

	@OriginalMember(owner = "client!oi", name = "S", descriptor = "[I")
	public static final int[] anIntArray134 = new int[500];

	@OriginalMember(owner = "client!oi", name = "V", descriptor = "[I")
	public static final int[] anIntArray135 = new int[3];

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)Z")
	public static boolean method1317() {
		return Static237.anInt4548 == 0 ? Static335.aClass2_Sub3_Sub4_2.method4628() : true;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!dw;I)I")
	public static int method1318(@OriginalArg(0) Class3_Sub2_Sub1_Sub1 arg0) {
		@Pc(8) Class65 local8 = arg0.aClass65_1;
		if (local8.anIntArray155 != null) {
			local8 = local8.method1710(Static344.aClass108_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(28) int local28 = local8.anInt2119;
		@Pc(32) Class156 local32 = arg0.method4925();
		if (arg0.aBoolean429) {
			local28 = local8.anInt2120;
		} else if (local32.anInt4438 == arg0.anInt6177 || local32.anInt4469 == arg0.anInt6177 || arg0.anInt6177 == local32.anInt4441 || arg0.anInt6177 == local32.anInt4433) {
			local28 = local8.anInt2113;
		} else if (local32.anInt4454 == arg0.anInt6177 || local32.anInt4452 == arg0.anInt6177 || arg0.anInt6177 == local32.anInt4449 || local32.anInt4470 == arg0.anInt6177) {
			local28 = local8.anInt2135;
		}
		return local28;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)C")
	public static char method1319(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(45) char local45 = Static407.aCharArray6[local7 - 128];
			if (local45 == '\u0000') {
				local45 = '?';
			}
			local7 = local45;
		}
		return (char) local7;
	}
}
