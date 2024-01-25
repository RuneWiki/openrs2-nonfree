import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!eea", name = "d", descriptor = "[I")
	public static final int[] anIntArray136 = new int[3];

	@OriginalMember(owner = "client!eea", name = "e", descriptor = "[Lclient!pba;")
	public static final Class264[] aClass264Array1 = new Class264[2048];

	@OriginalMember(owner = "client!eea", name = "g", descriptor = "[I")
	public static final int[] anIntArray137 = new int[4096];

	@OriginalMember(owner = "client!eea", name = "h", descriptor = "[I")
	public static final int[] anIntArray138 = new int[32];

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IILclient!tw;I)J")
	public static long method1839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface22 arg2) {
		@Pc(10) long local10 = 4194304L;
		@Pc(12) long local12 = Long.MIN_VALUE;
		@Pc(19) Class181 local19 = Static61.aClass246_7.method5497(arg2.method8490());
		@Pc(42) long local42 = (long) ((arg2.method8493() | 0x10000) << 14 | arg0 << 7 | arg1 | arg2.method8488() << 20);
		if (local19.anInt4779 == 0) {
			local42 |= local12;
		}
		if (local19.anInt4733 == 1) {
			local42 |= local10;
		}
		return local42 | (long) arg2.method8490() << 32;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIII)I")
	public static int method1840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg2) {
			return arg2;
		}
		@Pc(22) int local22 = 128 - arg1;
		@Pc(36) int local36 = local22 * (arg2 & 0x7F) + arg1 * (arg0 & 0x7F) >> 7;
		@Pc(50) int local50 = (arg2 & 0x380) * local22 + (arg0 & 0x380) * arg1 >> 7;
		@Pc(65) int local65 = (arg2 & 0xFC00) * local22 + (arg0 & 0xFC00) * arg1 >> 7;
		return local50 & 0x380 | local65 & 0xFC00 | local36 & 0x7F;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(II)V")
	public static void method1841(@OriginalArg(0) int arg0) {
		if (Static72.anInt1497 == 0) {
			Static404.aClass5_Sub1_Sub5_2.method8316(arg0);
		} else {
			Static522.anInt8987 = arg0;
		}
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(I)V")
	public static void method1843() {
		if (Static20.aClass48ArrayArray1 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < Static20.aClass48ArrayArray1.length; local5++) {
			for (@Pc(9) int local9 = 0; local9 < Static20.aClass48ArrayArray1[local5].length; local9++) {
				Static20.aClass48ArrayArray1[local5][local9] = Static484.aClass48_1;
			}
		}
	}
}
