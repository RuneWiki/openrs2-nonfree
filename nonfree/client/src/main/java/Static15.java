import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ak", name = "G", descriptor = "Lclient!em;")
	public static final Class83 aClass83_6 = new Class83(102, 7);

	@OriginalMember(owner = "client!ak", name = "M", descriptor = "I")
	public static int anInt444 = 0;

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)V")
	public static void method368(@OriginalArg(0) int arg0) {
		if (!Static67.method1102(arg0)) {
			return;
		}
		@Pc(14) Class160[] local14 = Static115.aClass160ArrayArray1[arg0];
		for (@Pc(20) int local20 = 0; local20 < local14.length; local20++) {
			@Pc(26) Class160 local26 = local14[local20];
			if (local26 != null) {
				local26.anInt4222 = 0;
				local26.anInt4154 = 1;
				local26.anInt4148 = 0;
			}
		}
	}
}
