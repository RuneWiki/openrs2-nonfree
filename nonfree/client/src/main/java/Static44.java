import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!co", name = "p", descriptor = "[Lclient!sk;")
	public static Class214[] aClass214Array1;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I[BII)Ljava/lang/String;", line = 42)
	public static String method1464(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg2; local17++) {
			@Pc(28) int local28 = arg1[arg0 + local17] & 0xFF;
			if (local28 != 0) {
				if (local28 >= 128 && local28 < 160) {
					@Pc(44) char local44 = Class2_Sub3_Sub19.aCharArray2[local28 - 128];
					if (local44 == '\u0000') {
						local44 = '?';
					}
					local28 = local44;
				}
				local8[local15++] = (char) local28;
			}
		}
		return new String(local8, 0, local15);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)Ljava/lang/String;", line = 114)
	public static String method1466(@OriginalArg(1) int arg0) {
		@Pc(12) String local12 = Integer.toString(arg0);
		for (@Pc(17) int local17 = local12.length() - 3; local17 > 0; local17 -= 3) {
			local12 = local12.substring(0, local17) + "," + local12.substring(local17);
		}
		if (local12.length() > 9) {
			return " <col=00ff80>" + local12.substring(0, local12.length() - 8) + Class55.aClass79_37.method2269(Class197.anInt5569) + " (" + local12 + ")</col>";
		} else if (local12.length() > 6) {
			return " <col=ffffff>" + local12.substring(0, local12.length() - 4) + Class2_Sub3_Sub31.aClass79_124.method2269(Class197.anInt5569) + " (" + local12 + ")</col>";
		} else {
			return " <col=ffff00>" + local12 + "</col>";
		}
	}
}
