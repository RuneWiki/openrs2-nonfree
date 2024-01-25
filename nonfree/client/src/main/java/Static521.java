import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "[I")
	public static final int[] anIntArray573 = new int[50];

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "Z")
	public static final boolean aBoolean612 = false;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method7353(@OriginalArg(1) int[] arg0) {
		@Pc(17) StringBuffer local17 = new StringBuffer();
		@Pc(19) int local19 = Static615.anInt10066;
		for (@Pc(21) int local21 = 0; local21 < arg0.length; local21++) {
			@Pc(30) Class196 local30 = Static611.aClass233_1.method5359(arg0[local21]);
			if (local30.anInt5374 != -1) {
				@Pc(42) Class9 local42 = (Class9) Static395.aClass10_42.method373((long) local30.anInt5374);
				if (local42 == null) {
					@Pc(50) Class112 local50 = Static681.method2327(Static624.aClass8_139, local30.anInt5374, 0);
					if (local50 != null) {
						local42 = Static546.aClass132_13.method7488(local50, true);
						Static395.aClass10_42.method366(local42, (long) local30.anInt5374);
					}
				}
				if (local42 != null) {
					Static24.aClass9Array7[local19] = local42;
					local17.append(" <img=").append(local19).append(">");
					local19++;
				}
			}
		}
		return local17.toString();
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method7354(@OriginalArg(1) Class132 arg0) {
		if (Static292.aBoolean317) {
			Static105.method1718(arg0);
		} else {
			Static190.method2701(arg0);
		}
	}
}
