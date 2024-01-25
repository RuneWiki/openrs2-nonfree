import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!ka", name = "t", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_56 = new Class194(43, 4);

	@OriginalMember(owner = "client!ka", name = "K", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_57 = new Class194(4, 1);

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "[I")
	public static final int[] anIntArray217 = new int[200];

	@OriginalMember(owner = "client!ka", name = "W", descriptor = "[I")
	public static final int[] anIntArray218 = new int[14];

	@OriginalMember(owner = "client!ka", name = "Z", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_86 = new Class129(100, 14);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([IB)Ljava/lang/String;")
	public static String method2803(@OriginalArg(0) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static215.anInt3590;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(22) Class138 local22 = Static237.aClass249_4.method5647(arg0[local13]);
			if (local22.anInt3655 != -1) {
				@Pc(35) Class49 local35 = (Class49) Static117.aClass44_67.method1028((long) local22.anInt3655);
				if (local35 == null) {
					@Pc(43) Class214 local43 = Static470.method4672(Static344.aClass243_196, local22.anInt3655, 0);
					if (local43 != null) {
						local35 = Static407.aClass200_9.method5871(local43);
						Static117.aClass44_67.method1017((long) local22.anInt3655, local35);
					}
				}
				if (local35 != null) {
					Static324.aClass49Array11[local11] = local35;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}
}
