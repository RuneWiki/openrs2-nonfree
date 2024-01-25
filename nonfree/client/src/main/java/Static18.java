import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!at", name = "e", descriptor = "Lclient!c;")
	public static Class34 aClass34_4;

	@OriginalMember(owner = "client!at", name = "g", descriptor = "Lclient!oi;")
	public static Class185 aClass185_67;

	@OriginalMember(owner = "client!at", name = "c", descriptor = "[I")
	public static final int[] anIntArray314 = new int[14];

	@OriginalMember(owner = "client!at", name = "d", descriptor = "Lclient!ha;")
	public static Class1_Sub17 aClass1_Sub17_4 = null;

	@OriginalMember(owner = "client!at", name = "f", descriptor = "J")
	public static long aLong142 = -1L;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IB)I")
	public static int method3400(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
	public static void method3402() {
		for (@Pc(10) Class111_Sub2 local10 = (Class111_Sub2) Static57.aClass63_1.method1016(); local10 != null; local10 = (Class111_Sub2) Static57.aClass63_1.method1016()) {
			Static299.method3983(local10);
		}
		@Pc(31) int local31;
		@Pc(30) int local30;
		if (Static126.aClass19_Sub1_1.method3353(Static214.anInt3968)) {
			local30 = 3;
			local31 = 0;
		} else {
			local30 = Static130.anInt2040;
			local31 = Static130.anInt2040;
		}
		Static55.method762();
		for (@Pc(44) int local44 = local31; local44 <= local30; local44++) {
			Static55.method757();
			Static55.method760(local44);
			Static55.method750(local44);
		}
		Static55.method768();
		Static55.method766();
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(III)I")
	public static int method3406(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static366.anIntArray449[arg1 & 0x3] : Static100.anIntArray135[arg1 & 0x3];
	}
}
