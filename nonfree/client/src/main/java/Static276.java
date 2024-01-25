import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!kda", name = "e", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_48 = new Class257(70, -1);

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(BCLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method4705(@OriginalArg(2) String arg0, @OriginalArg(3) String arg1) {
		@Pc(8) int local8 = arg0.length();
		@Pc(16) int local16 = arg1.length();
		@Pc(18) int local18 = local8;
		@Pc(22) int local22 = local16 - 1;
		if (local22 != 0) {
			@Pc(26) int local26 = 0;
			while (true) {
				local26 = arg0.indexOf(13, local26);
				if (local26 < 0) {
					break;
				}
				local18 += local22;
				local26++;
			}
		}
		@Pc(48) StringBuffer local48 = new StringBuffer(local18);
		@Pc(50) int local50 = 0;
		while (true) {
			@Pc(55) int local55 = arg0.indexOf(13, local50);
			if (local55 < 0) {
				local48.append(arg0.substring(local50));
				return local48.toString();
			}
			local48.append(arg0.substring(local50, local55));
			local48.append(arg1);
			local50 = local55 + 1;
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IB)V")
	public static void method4708(@OriginalArg(0) int arg0) {
		@Pc(8) Class8_Sub5_Sub8 local8 = Static509.method7344(8, arg0);
		local8.method3512();
	}
}
