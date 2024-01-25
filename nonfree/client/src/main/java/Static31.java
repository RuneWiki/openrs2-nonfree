import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bca", name = "l", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_8 = new Class45(94, 6);

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(II)V")
	public static void method678(@OriginalArg(0) int arg0) {
		Static122.anInt2825 = arg0;
		Static445.anInt8114 = 2;
		if (Static258.aString53 == null) {
			Static269.method4556(35);
		} else {
			@Pc(28) Class12_Sub8 local28 = new Class12_Sub8(Static204.method3820(Static47.method886(Static258.aString53)));
			@Pc(32) long local32 = local28.method5191();
			Static148.aLong180 = local28.method5191();
			Static331.method5281(true, "", Static104.method2138(local32));
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(III)I")
	public static int method679(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(24) int local24 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local24;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method680(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = arg0.length();
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			local17 = Static253.method4366(arg0.charAt(local19)) + (local17 << 5) - local17;
		}
		return local17;
	}
}
