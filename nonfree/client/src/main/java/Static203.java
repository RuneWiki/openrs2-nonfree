import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!nd", name = "p", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BII)I")
	public static int method3792(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static112.anIntArray479[arg0 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!qj;)V")
	public static void method3793(@OriginalArg(1) Class165 arg0) {
		Static185.aClass165_18 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3794(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLclient!eb;)Lclient!fm;")
	public static Class1_Sub2 method3795(@OriginalArg(1) Class1_Sub7 arg0) {
		arg0.method3141();
		@Pc(18) int local18 = arg0.method3141();
		@Pc(22) Class1_Sub2 local22 = Static194.method3680(local18);
		local22.anInt6479 = arg0.method3141();
		@Pc(31) int local31 = arg0.method3141();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method3141();
			local22.method5660(local39, arg0);
		}
		local22.method5661();
		return local22;
	}
}
