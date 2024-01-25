import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!gt", name = "n", descriptor = "Lclient!ge;")
	public static Class112 aClass112_1;

	@OriginalMember(owner = "client!gt", name = "o", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!gt", name = "u", descriptor = "Lclient!vd;")
	public static Class353 aClass353_38;

	@OriginalMember(owner = "client!gt", name = "v", descriptor = "[Lclient!pga;")
	public static Class32[] aClass32Array10;

	@OriginalMember(owner = "client!gt", name = "m", descriptor = "[J")
	public static final long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!gt", name = "p", descriptor = "I")
	public static int anInt3940 = 0;

	@OriginalMember(owner = "client!gt", name = "s", descriptor = "Lclient!io;")
	public static final Class152 aClass152_6 = new Class152(7, 2);

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
	public static int method3454(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local11 > local15 - local19) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(66) char local66;
			if (local17 == '\u0000') {
				local66 = arg0.charAt(local13++);
			} else {
				local66 = local17;
			}
			@Pc(79) char local79;
			if (local19 == '\u0000') {
				local79 = arg2.charAt(local15++);
			} else {
				local79 = local19;
			}
			local17 = Static188.method4864(local66);
			local19 = Static188.method4864(local79);
			local66 = Static6.method108(arg1, local66);
			local79 = Static6.method108(arg1, local79);
			if (local79 != local66 && Character.toUpperCase(local66) != Character.toUpperCase(local79)) {
				local66 = Character.toLowerCase(local66);
				local79 = Character.toLowerCase(local79);
				if (local79 != local66) {
					return Static41.method799(local66, arg1) - Static41.method799(local79, arg1);
				}
			}
		}
		@Pc(138) int local138 = Math.min(local8, local11);
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			if (arg1 == 2) {
				local15 = local11 - local140 - 1;
				local13 = local8 - local140 - 1;
			} else {
				local15 = local140;
				local13 = local140;
			}
			@Pc(170) char local170 = arg0.charAt(local13);
			@Pc(174) char local174 = arg2.charAt(local15);
			if (local170 != local174 && Character.toUpperCase(local170) != Character.toUpperCase(local174)) {
				local170 = Character.toLowerCase(local170);
				local174 = Character.toLowerCase(local174);
				if (local170 != local174) {
					return Static41.method799(local170, arg1) - Static41.method799(local174, arg1);
				}
			}
		}
		@Pc(222) int local222 = local8 - local11;
		if (local222 != 0) {
			return local222;
		}
		for (@Pc(231) int local231 = 0; local231 < local138; local231++) {
			@Pc(237) char local237 = arg0.charAt(local231);
			@Pc(241) char local241 = arg2.charAt(local231);
			if (local237 != local241) {
				return Static41.method799(local237, arg1) - Static41.method799(local241, arg1);
			}
		}
		return 0;
	}
}
