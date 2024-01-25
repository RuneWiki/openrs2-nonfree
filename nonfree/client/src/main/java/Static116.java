import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!fi", name = "x", descriptor = "Lclient!o;")
	public static Class137 aClass137_8;

	@OriginalMember(owner = "client!fi", name = "y", descriptor = "F")
	public static float aFloat17;

	@OriginalMember(owner = "client!fi", name = "v", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_65 = new Class263(98, 28);

	@OriginalMember(owner = "client!fi", name = "z", descriptor = "Z")
	public static volatile boolean aBoolean168 = false;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method1885(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(8) int local8 = 0;
		for (@Pc(15) int local15 = 0; local15 < local6; local15++) {
			@Pc(20) char local20 = arg0.charAt(local15);
			if (local20 == '<' || local20 == '>') {
				local8 += 3;
			}
		}
		@Pc(41) StringBuffer local41 = new StringBuffer(local6 + local8);
		for (@Pc(43) int local43 = 0; local43 < local6; local43++) {
			@Pc(48) char local48 = arg0.charAt(local43);
			if (local48 == '<') {
				local41.append("<lt>");
			} else if (local48 == '>') {
				local41.append("<gt>");
			} else {
				local41.append(local48);
			}
		}
		return local41.toString();
	}
}
