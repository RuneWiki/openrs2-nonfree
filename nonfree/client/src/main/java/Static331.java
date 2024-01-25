import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!qs", name = "O", descriptor = "Lclient!mg;")
	public static Class160 aClass160_65;

	@OriginalMember(owner = "client!qs", name = "N", descriptor = "Lclient!di;")
	public static final Class54 aClass54_82 = new Class54(55, 0);

	@OriginalMember(owner = "client!qs", name = "P", descriptor = "Lclient!di;")
	public static final Class54 aClass54_83 = new Class54(77, 0);

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "(I)V")
	public static void method4591() {
		Static37.method609();
		Static227.aClass22ArrayArray1 = null;
		Static195.aClass49_5 = null;
		Static198.aClass155_3 = null;
		Static164.aClass155_2 = null;
		Static273.aClass155_4 = null;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method4592(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(38) StringBuffer local38 = new StringBuffer(local10 + local8);
		for (@Pc(48) int local48 = 0; local48 < local8; local48++) {
			@Pc(54) char local54 = arg0.charAt(local48);
			if (local54 == '<') {
				local38.append("<lt>");
			} else if (local54 == '>') {
				local38.append("<gt>");
			} else {
				local38.append(local54);
			}
		}
		return local38.toString();
	}
}
