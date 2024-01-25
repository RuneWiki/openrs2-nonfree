import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "[[[Lclient!af;")
	public static Class9[][][] aClass9ArrayArrayArray3;

	@OriginalMember(owner = "client!iea", name = "e", descriptor = "Lclient!pq;")
	public static Class251 aClass251_70;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZLclient!oa;Lclient!ss;)I")
	public static int method3108(@OriginalArg(1) Class121 arg0, @OriginalArg(2) Class298 arg1) {
		if (arg1.anInt8012 != -1) {
			return arg1.anInt8012;
		}
		if (arg1.anInt8016 != -1) {
			@Pc(25) Class76 local25 = arg0.anInterface7_14.method5209(arg0.method7142() ? arg1.anInt8016 : arg1.anInt8017);
			if (!local25.aBoolean107) {
				return local25.aShort30;
			}
		}
		return arg1.anInt8014;
	}
}
