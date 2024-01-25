import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!gt", name = "M", descriptor = "I")
	public static int anInt3893;

	@OriginalMember(owner = "client!gt", name = "J", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_51 = new Class45(101, -1);

	@OriginalMember(owner = "client!gt", name = "K", descriptor = "I")
	public static int anInt3892 = 0;

	@OriginalMember(owner = "client!gt", name = "L", descriptor = "S")
	public static short aShort56 = 32767;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(Z[I)Ljava/lang/String;")
	public static String method3401(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static254.anInt5218;
		for (@Pc(21) int local21 = 0; local21 < arg0.length; local21++) {
			@Pc(30) Class259 local30 = Static139.aClass106_1.method2875(arg0[local21]);
			if (local30.anInt7726 != -1) {
				@Pc(42) Class84 local42 = (Class84) Static197.aClass125_23.method3446((long) local30.anInt7726);
				if (local42 == null) {
					@Pc(50) Class40 local50 = Static550.method897(Static440.aClass16_103, local30.anInt7726, 0);
					if (local50 != null) {
						local42 = Static243.aClass42_4.method5839(local50);
						Static197.aClass125_23.method3437(local42, (long) local30.anInt7726);
					}
				}
				if (local42 != null) {
					Static519.aClass84Array15[local11] = local42;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZI)I")
	public static int method3403(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 + arg0 * 57;
		@Pc(21) int local21 = local15 ^ local15 << 13;
		@Pc(35) int local35 = Integer.MAX_VALUE & (local21 * local21 * 15731 + 789221) * local21 + 1376312589;
		return local35 >> 19 & 0xFF;
	}
}
