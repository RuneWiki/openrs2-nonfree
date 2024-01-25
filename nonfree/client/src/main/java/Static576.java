import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!sda", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!sda", name = "c", descriptor = "Z")
	public static boolean aBoolean686 = false;

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_166 = new Class186(33, 20);

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;CI)Ljava/lang/String;")
	public static String method7961(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		@Pc(8) int local8 = arg1.length();
		@Pc(19) int local19 = arg0.length();
		@Pc(21) int local21 = local8;
		@Pc(25) int local25 = local19 - 1;
		if (local25 != 0) {
			@Pc(32) int local32 = 0;
			while (true) {
				local32 = arg1.indexOf(13, local32);
				if (local32 < 0) {
					break;
				}
				local32++;
				local21 += local25;
			}
		}
		@Pc(54) StringBuffer local54 = new StringBuffer(local21);
		@Pc(56) int local56 = 0;
		while (true) {
			@Pc(61) int local61 = arg1.indexOf(13, local56);
			if (local61 < 0) {
				local54.append(arg1.substring(local56));
				return local54.toString();
			}
			local54.append(arg1.substring(local56, local61));
			local54.append(arg0);
			local56 = local61 + 1;
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(BII)Z")
	public static boolean method7962(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x40000) != 0 | Static189.method2879(arg0, arg1) || Static161.method2562(arg1, arg0);
	}
}
