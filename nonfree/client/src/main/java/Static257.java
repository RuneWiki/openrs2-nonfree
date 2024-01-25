import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!ol", name = "T", descriptor = "I")
	public static int anInt4441;

	@OriginalMember(owner = "client!ol", name = "W", descriptor = "[Lclient!tf;")
	public static final Class222[] aClass222Array1 = new Class222[4];

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "(I)V")
	public static void method3931() {
		if (Static354.anInt5766 == 5) {
			Static354.anInt5766 = 6;
		}
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(II)I")
	public static int method3933(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}
}
