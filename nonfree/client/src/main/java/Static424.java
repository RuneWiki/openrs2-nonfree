import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!qg", name = "u", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_175 = new Class362(105, 12);

	@OriginalMember(owner = "client!qg", name = "x", descriptor = "I")
	public static int anInt7961 = 0;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method6614(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 <= '\u007f') {
				local10++;
			} else if (local18 <= '\u07ff') {
				local10 += 2;
			} else {
				local10 += 3;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method6617(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < local6; local10++) {
			local8 = (local8 << 5) + Static558.method8030(arg0.charAt(local10)) - local8;
		}
		return local8;
	}
}
