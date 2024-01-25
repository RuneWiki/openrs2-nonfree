import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!tda", name = "e", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray9;

	@OriginalMember(owner = "client!tda", name = "f", descriptor = "Lclient!jo;")
	public static Class168 aClass168_112;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_153 = new Class254(63, 1);

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "I")
	public static int anInt8780 = 1;

	@OriginalMember(owner = "client!tda", name = "d", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_154 = new Class254(69, 8);

	@OriginalMember(owner = "client!tda", name = "g", descriptor = "Lclient!vj;")
	public static final Class333 aClass333_15 = new Class333(4);

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IB)Lclient!hh;")
	public static Class135 method7351(@OriginalArg(0) int arg0) {
		@Pc(8) Class135[] local8 = Static230.method4095();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(23) Class135 local23 = local8[local10];
			if (local23.anInt4267 == arg0) {
				return local23;
			}
		}
		return null;
	}
}
