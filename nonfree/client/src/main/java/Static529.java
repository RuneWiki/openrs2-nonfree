import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method7564(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < Static74.anInt1238; local18++) {
			if (arg0.equalsIgnoreCase(Static182.aStringArray13[local18])) {
				return local18;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIZ)V")
	public static void method7565(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		if (Static587.aClass81_67.method1599((long) arg1) != null) {
			return;
		}
		if (Static489.aBoolean697) {
			@Pc(30) Class5_Sub25 local30 = new Class5_Sub25(arg1, new Class103_Sub1(4096, Static148.aClass384_60, arg1), arg0, arg2);
			local30.aClass103_Sub1_1.method6167(Static117.aStringArray10[Static321.anInt5554]);
			Static587.aClass81_67.method1607(local30, (long) arg1);
		} else {
			Static106.method1544(arg1, arg2);
		}
	}
}
