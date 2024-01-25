import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
	public static int anInt9689;

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_336 = new Class288(59, 4);

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "[I")
	public static final int[] anIntArray663 = new int[5];

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(CLjava/lang/String;ILjava/lang/String;)Ljava/lang/String;")
	public static String method8094(@OriginalArg(1) String arg0, @OriginalArg(3) String arg1) {
		@Pc(16) int local16 = arg0.length();
		@Pc(19) int local19 = arg1.length();
		@Pc(21) int local21 = local16;
		@Pc(25) int local25 = local19 - 1;
		if (local25 != 0) {
			@Pc(32) int local32 = 0;
			while (true) {
				local32 = arg0.indexOf(13, local32);
				if (local32 < 0) {
					break;
				}
				local32++;
				local21 += local25;
			}
		}
		@Pc(51) StringBuffer local51 = new StringBuffer(local21);
		@Pc(53) int local53 = 0;
		while (true) {
			@Pc(58) int local58 = arg0.indexOf(13, local53);
			if (local58 < 0) {
				local51.append(arg0.substring(local53));
				return local51.toString();
			}
			local51.append(arg0.substring(local53, local58));
			local51.append(arg1);
			local53 = local58 + 1;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!wu;B)V")
	public static void method8097(@OriginalArg(0) Class380 arg0) {
		Static6.aClass380_2 = arg0;
	}
}
