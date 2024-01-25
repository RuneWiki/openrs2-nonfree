import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "[I")
	public static int[] anIntArray501;

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "Lclient!qea;")
	public static Class268 aClass268_1;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
	public static int anInt6775;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_105 = new Class47(64, -1);

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "Lclient!jd;")
	public static final Class153 aClass153_8 = new Class153(9, 2);

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
	public static int anInt6774 = 0;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "Lclient!dr;")
	public static Class73 aClass73_128 = null;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(III)Lclient!ld;")
	public static Class189 method5691(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class189 local7 = new Class189();
		local7.anInt5299 = arg1 + 1 + 5;
		local7.anInt5293 = -1;
		local7.anInt5292 = arg0 + 1 + 5;
		local7.anInt5301 = -1;
		local7.anIntArrayArray43 = new int[local7.anInt5292][local7.anInt5299];
		local7.method4600();
		return local7;
	}
}
