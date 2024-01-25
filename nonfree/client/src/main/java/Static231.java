import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!ica", name = "p", descriptor = "I")
	public static int anInt4666;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method3863(@OriginalArg(1) String arg0) {
		@Pc(16) String local16 = Static252.method4164(Static582.method8037(arg0));
		if (local16 == null) {
			local16 = "";
		}
		return local16;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(BZLjava/lang/String;Lclient!eq;)Lclient!sw;")
	public static Class313 method3866(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class97 arg2) {
		@Pc(8) int local8 = arg2.method2574(arg1);
		if (local8 == -1) {
			return new Class313(0);
		}
		@Pc(23) int[] local23 = arg2.method2571(local8);
		@Pc(29) Class313 local29 = new Class313(local23.length);
		@Pc(31) int local31 = 0;
		@Pc(38) int local38 = 0;
		while (true) {
			while (local29.anInt8902 > local31) {
				@Pc(53) Class2_Sub34 local53 = new Class2_Sub34(arg2.method2545(local23[local38++], local8));
				@Pc(57) int local57 = local53.method6865();
				@Pc(61) int local61 = local53.method6884();
				@Pc(65) int local65 = local53.method6904();
				if (!arg0 && local65 == 1) {
					local29.anInt8902--;
				} else {
					local29.anIntArray621[local31] = local57;
					local29.anIntArray622[local31] = local61;
					local31++;
				}
			}
			return local29;
		}
	}
}
