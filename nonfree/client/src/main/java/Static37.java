import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!br", name = "c", descriptor = "Lclient!fk;")
	public static Class80 aClass80_1;

	@OriginalMember(owner = "client!br", name = "g", descriptor = "Lclient!pt;")
	public static Class201 aClass201_3;

	@OriginalMember(owner = "client!br", name = "h", descriptor = "I")
	public static int anInt611;

	@OriginalMember(owner = "client!br", name = "f", descriptor = "F")
	public static float aFloat9 = 0.0F;

	@OriginalMember(owner = "client!br", name = "k", descriptor = "I")
	public static int anInt614 = 0;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(III)I")
	public static int method581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static186.anIntArray270[arg0 & 0x3] : Static463.anIntArray636[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
	public static void method583() {
		@Pc(9) Class188 local9 = Static288.aClass188_42;
		synchronized (Static288.aClass188_42) {
			Static288.aClass188_42.method4154();
		}
	}
}
