import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "Lclient!in;")
	public static Class157 aClass157_154;

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "Lclient!kn;")
	public static final Class181 aClass181_8 = new Class181(13, -1);

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "Z")
	public static boolean aBoolean482 = false;

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray28 = new String[100];

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_63 = new Class94(35, 5);

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString69 = "";

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "[I")
	public static final int[] anIntArray376 = new int[25];

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
	public static void method5468() {
		@Pc(7) int local7 = Static71.anInt3990;
		@Pc(9) int[] local9 = Static549.anIntArray643;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class3_Sub1_Sub3_Sub3_Sub2 local19 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local9[local11]];
			if (local19 != null && local19.anInt6061 > 0) {
				local19.anInt6061--;
				if (local19.anInt6061 == 0) {
					local19.aString62 = null;
				}
			}
		}
		for (@Pc(49) int local49 = 0; local49 < Static398.anInt7589; local49++) {
			@Pc(56) long local56 = (long) Static301.anIntArray367[local49];
			@Pc(62) Class2_Sub33 local62 = (Class2_Sub33) Static600.aClass99_79.method3056(local56);
			if (local62 != null) {
				@Pc(67) Class3_Sub1_Sub3_Sub3_Sub1 local67 = local62.aClass3_Sub1_Sub3_Sub3_Sub1_2;
				if (local67.anInt6061 > 0) {
					local67.anInt6061--;
					if (local67.anInt6061 == 0) {
						local67.aString62 = null;
					}
				}
			}
		}
	}
}
