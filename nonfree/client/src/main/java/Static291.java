import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!kr", name = "S", descriptor = "F")
	public static float aFloat129;

	@OriginalMember(owner = "client!kr", name = "W", descriptor = "I")
	public static int anInt5439;

	@OriginalMember(owner = "client!kr", name = "L", descriptor = "Lclient!naa;")
	public static final Class218 aClass218_7 = new Class218();

	@OriginalMember(owner = "client!kr", name = "V", descriptor = "Z")
	public static final boolean aBoolean373 = false;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "([IB)Ljava/lang/String;")
	public static String method4365(@OriginalArg(0) int[] arg0) {
		@Pc(17) StringBuffer local17 = new StringBuffer();
		@Pc(19) int local19 = Static215.anInt4496;
		for (@Pc(21) int local21 = 0; local21 < arg0.length; local21++) {
			@Pc(30) Class135 local30 = Static428.aClass124_1.method3409(arg0[local21]);
			if (local30.anInt4465 != -1) {
				@Pc(42) Class73 local42 = (Class73) Static476.aClass342_168.method7684((long) local30.anInt4465);
				if (local42 == null) {
					@Pc(50) Class365 local50 = Static607.method8163(Static194.aClass284_60, local30.anInt4465, 0);
					if (local50 != null) {
						local42 = Static319.aClass31_11.method8086(local50, true);
						Static476.aClass342_168.method7683(local42, (long) local30.anInt4465);
					}
				}
				if (local42 != null) {
					Static147.aClass73Array5[local19] = local42;
					local17.append(" <img=").append(local19).append(">");
					local19++;
				}
			}
		}
		return local17.toString();
	}
}
