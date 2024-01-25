import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "Lclient!am;")
	public static Class11 aClass11_147;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "Lclient!am;")
	public static Class11 aClass11_148;

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString244 = "Loaded interfaces";

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
	public static int anInt6595 = -1;

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
	public static int anInt6596 = 0;

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "Ljava/util/Random;")
	public static final Random aRandom11 = new Random();

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method5471(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local10 += 3;
			}
		}
		@Pc(47) StringBuffer local47 = new StringBuffer(local10 + local8);
		for (@Pc(49) int local49 = 0; local49 < local8; local49++) {
			@Pc(55) char local55 = arg0.charAt(local49);
			if (local55 == '<') {
				local47.append("<lt>");
			} else if (local55 == '>') {
				local47.append("<gt>");
			} else {
				local47.append(local55);
			}
		}
		return local47.toString();
	}
}
