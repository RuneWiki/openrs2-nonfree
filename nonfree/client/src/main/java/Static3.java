import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "[I")
	public static int[] anIntArray3;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
	public static int anInt56 = -1;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "[C")
	public static char[] aCharArray1 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	public static int anInt60 = 0;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILjava/lang/String;C)[Ljava/lang/String;")
	public static String[] method35(@OriginalArg(1) String arg0, @OriginalArg(2) char arg1) {
		@Pc(6) int local6 = Static100.method1681(arg0, arg1);
		@Pc(15) String[] local15 = new String[local6 + 1];
		@Pc(22) int local22 = 0;
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = 0; local26 < local6; local26++) {
			@Pc(35) int local35;
			for (local35 = local22; arg1 != arg0.charAt(local35); local35++) {
			}
			local15[local24++] = arg0.substring(local22, local35);
			local22 = local35 + 1;
		}
		local15[local6] = arg0.substring(local22);
		return local15;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method36() {
		for (@Pc(11) int local11 = 0; local11 < Static147.anInt3287; local11++) {
			@Pc(18) int local18 = Static100.anIntArray224[local11];
			@Pc(22) Class2_Sub4_Sub1 local22 = Static105.aClass2_Sub4_Sub1Array1[local18];
			if (local22 != null) {
				Static149.method2419(local22.aClass145_1.anInt4909, local22);
			}
		}
	}
}
