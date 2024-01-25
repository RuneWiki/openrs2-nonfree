import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
	public static int anInt618;

	@OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
	public static int anInt615 = 0;

	@OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
	public static int anInt622 = 0;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZII)I")
	public static int method518(@OriginalArg(1) int arg0) {
		@Pc(14) Class5_Sub26 local14 = Static176.method2415(false, arg0);
		if (local14 == null) {
			return Static430.aClass232_1.method5107(arg0).anInt5494;
		}
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local14.anIntArray247.length; local26++) {
			if (local14.anIntArray247[local26] == -1) {
				local24++;
			}
		}
		return local24 + Static430.aClass232_1.method5107(arg0).anInt5494 - local14.anIntArray247.length;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(IBLjava/lang/String;)V")
	public static void method519(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class5_Sub2_Sub9 local8 = Static72.method1073(3, arg0);
		local8.method3026();
		local8.aString42 = arg1;
	}
}
