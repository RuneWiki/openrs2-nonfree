import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!sv", name = "J", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray38;

	@OriginalMember(owner = "client!sv", name = "H", descriptor = "[Lclient!cl;")
	public static Class63[] aClass63Array1 = new Class63[6];

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIIII)V")
	public static void method7597(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static596.anInt9609 = arg3;
		Static547.anInt8692 = arg0;
		Static641.anInt10427 = arg1;
		Static448.anInt7323 = arg2;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method7599(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(20) char local20 = arg0.charAt(local12);
			if (local20 == '<' || local20 == '>') {
				local10 += 3;
			}
		}
		@Pc(50) StringBuffer local50 = new StringBuffer(local8 + local10);
		for (@Pc(54) int local54 = 0; local54 < local8; local54++) {
			@Pc(62) char local62 = arg0.charAt(local54);
			if (local62 == '<') {
				local50.append("<lt>");
			} else if (local62 == '>') {
				local50.append("<gt>");
			} else {
				local50.append(local62);
			}
		}
		if (-61 != -61) {
			aClass63Array1 = null;
		}
		return local50.toString();
	}
}
