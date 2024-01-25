import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
	public static final int anInt4276 = 1401;

	@OriginalMember(owner = "client!lj", name = "w", descriptor = "[I")
	public static final int[] anIntArray312 = new int[16];

	@OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
	public static int anInt4277 = 0;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!dh;)V")
	public static void method3378(@OriginalArg(1) Class1_Sub10 arg0) {
		if (!Static170.aBoolean282) {
			arg0.method5953();
			Static76.anInt1078--;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([IZ)Ljava/lang/String;")
	public static String method3379(@OriginalArg(0) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(16) int local16 = Static133.anInt2067;
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(27) Class124 local27 = Static111.aClass26_1.method356(arg0[local18]);
			if (local27.anInt3420 != -1) {
				@Pc(39) Class85 local39 = (Class85) Static439.aClass77_59.method1387((long) local27.anInt3420);
				if (local39 == null) {
					@Pc(47) Class52 local47 = Static467.method891(Static178.aClass185_49, local27.anInt3420, 0);
					if (local47 != null) {
						local39 = Static186.aClass117_3.method5707(local47);
						Static439.aClass77_59.method1396(local39, (long) local27.anInt3420);
					}
				}
				if (local39 != null) {
					Static91.aClass85Array5[local16] = local39;
					local9.append(" <img=").append(local16).append(">");
					local16++;
				}
			}
		}
		return local9.toString();
	}
}
