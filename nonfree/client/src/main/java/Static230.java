import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!om", name = "w", descriptor = "I")
	public static int anInt4796;

	@OriginalMember(owner = "client!om", name = "y", descriptor = "Lclient!am;")
	public static Class11 aClass11_93;

	@OriginalMember(owner = "client!om", name = "A", descriptor = "I")
	public static int anInt4799;

	@OriginalMember(owner = "client!om", name = "I", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!om", name = "M", descriptor = "Lclient!am;")
	public static Class11 aClass11_94;

	@OriginalMember(owner = "client!om", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[8];

	@OriginalMember(owner = "client!om", name = "E", descriptor = "I")
	public static final int anInt4801 = 0;

	@OriginalMember(owner = "client!om", name = "F", descriptor = "I")
	public static int anInt4802 = 0;

	@OriginalMember(owner = "client!om", name = "f", descriptor = "(I)V")
	public static void method3935() {
		@Pc(5) Class154 local5 = Static339.aClass154_103;
		synchronized (Static339.aClass154_103) {
			Static339.aClass154_103.method4212();
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)I")
	public static int method3940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = arg1 & 0xF;
		@Pc(19) int local19 = local12 >= 8 ? arg2 : arg3;
		@Pc(38) int local38 = local12 >= 4 ? (local12 == 12 || local12 == 14 ? arg3 : arg0) : arg2;
		return ((local12 & 0x1) == 0 ? local19 : -local19) + ((local12 & 0x2) == 0 ? local38 : -local38);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZB)V")
	public static void method3941(@OriginalArg(0) boolean arg0) {
		if (Static277.aBoolean496 != arg0) {
			Static277.aBoolean496 = arg0;
			Static206.method3644();
		}
	}
}
