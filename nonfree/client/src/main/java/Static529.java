import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!ss", name = "K", descriptor = "I")
	public static int anInt8816;

	@OriginalMember(owner = "client!ss", name = "M", descriptor = "Ljava/lang/Object;")
	public static Object anObject15;

	@OriginalMember(owner = "client!ss", name = "Q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "(B)V")
	public static void method7391() {
		for (@Pc(11) int local11 = 0; local11 < Static228.anInt4647; local11++) {
			@Pc(17) int local17 = Static160.anIntArray256[local11];
			@Pc(24) Class2_Sub51 local24 = (Class2_Sub51) Static357.aClass222_23.method5468((long) local17);
			if (local24 != null) {
				@Pc(29) Class11_Sub1_Sub1_Sub2_Sub2 local29 = local24.aClass11_Sub1_Sub1_Sub2_Sub2_2;
				Static224.method3808(local29.aClass236_1.anInt6892, local29);
			}
		}
	}
}
