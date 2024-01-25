import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
	public static int anInt9737;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString116 = "";

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_181 = new Class254(11, 8);

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "[I")
	public static final int[] anIntArray839 = new int[500];

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
	public static void method8102() {
		@Pc(7) int local7 = Static81.anInt1953;
		@Pc(9) int[] local9 = Static227.anIntArray309;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class11_Sub1_Sub1_Sub2 local19 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local9[local11]];
			if (local19 != null && local19.anInt7419 > 0) {
				local19.anInt7419--;
				if (local19.anInt7419 == 0) {
					local19.aString94 = null;
				}
			}
		}
		for (@Pc(51) int local51 = 0; local51 < Static208.anInt4409; local51++) {
			@Pc(58) long local58 = (long) Static70.anIntArray111[local51];
			@Pc(64) Class6_Sub33 local64 = (Class6_Sub33) Static506.aClass305_36.method7447(local58);
			if (local64 != null) {
				@Pc(69) Class11_Sub1_Sub1_Sub1 local69 = local64.aClass11_Sub1_Sub1_Sub1_2;
				if (local69.anInt7419 > 0) {
					local69.anInt7419--;
					if (local69.anInt7419 == 0) {
						local69.aString94 = null;
					}
				}
			}
		}
	}
}
