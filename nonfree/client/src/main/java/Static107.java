import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_73 = new Class194(6, 4);

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
	public static int anInt2177 = -1;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IB)I")
	public static int method1798(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = arg0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 1;
		@Pc(27) int local27 = local21 | local21 >>> 2;
		@Pc(33) int local33 = local27 | local27 >>> 4;
		@Pc(39) int local39 = local33 | local33 >>> 8;
		@Pc(45) int local45 = local39 | local39 >>> 16;
		return arg0 & ~local45;
	}
}
