import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
	public static int anInt1327;

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
	public static int anInt1328;

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString12 = "";

	@OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
	public static int anInt1331 = 2;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILjava/lang/String;IIIII)V")
	public static void method1249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class72_Sub8 local7 = new Class72_Sub8();
		local7.anInt7660 = arg6;
		local7.anInt7657 = arg3;
		local7.anInt7656 = arg4 + Static436.anInt6850;
		local7.aString70 = arg2;
		local7.anInt7659 = arg5;
		local7.anInt7661 = arg0;
		local7.anInt7655 = arg1;
		Static265.aClass299_4.method7027(local7);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIII)I")
	public static int method1251(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 4095 - arg0;
		} else if (local3 == 2) {
			return 4095 - arg2;
		} else {
			return arg0;
		}
	}
}
