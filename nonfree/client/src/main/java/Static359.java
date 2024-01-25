import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "Lclient!oq;")
	public static Class245 aClass245_1;

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
	public static int anInt6255 = 0;

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "Lclient!jw;")
	public static final Class181 aClass181_9 = new Class181(12, 7);

	@OriginalMember(owner = "client!nn", name = "j", descriptor = "Z")
	public static boolean aBoolean443 = false;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)I")
	public static int method5227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >>> 31;
		return (arg1 + local7) / arg0 - local7;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!sv;ILclient!r;)I")
	public static int method5228(@OriginalArg(0) Class303 arg0, @OriginalArg(2) Class12 arg1) {
		if (arg0.anInt8303 != -1) {
			return arg0.anInt8303;
		}
		if (arg0.anInt8309 != -1) {
			@Pc(29) Class45 local29 = arg1.anInterface5_10.method4043(arg0.anInt8309);
			if (!local29.aBoolean118) {
				return local29.aShort19;
			}
		}
		return arg0.anInt8298;
	}
}
