import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "Lclient!sc;")
	private static Class107 aClass107_1097 = Static231.method3737("Examine");

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1098 = aClass107_1097;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "[I")
	public static int[] anIntArray346 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1099 = Static231.method3737("null");

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "Lclient!jd;")
	public static Class61 aClass61_73 = new Class61(50);

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1100 = Static231.method3737("(U(Y");

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)V")
	public static void method3056() {
		Static162.aClass61_62.method1695(5);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)Lclient!tg;")
	public static Class1_Sub2_Sub2 method3058() {
		@Pc(13) int local13 = Static172.anIntArray329[0] * Static141.anIntArray266[0];
		@Pc(16) int[] local16 = new int[local13];
		@Pc(20) byte[] local20 = Static158.aByteArrayArray7[0];
		for (@Pc(22) int local22 = 0; local22 < local13; local22++) {
			local16[local22] = Static169.anIntArray324[local20[local22] & 0xFF];
		}
		@Pc(65) Class1_Sub2_Sub2_Sub1 local65 = new Class1_Sub2_Sub2_Sub1(Static155.anInt432, Static182.anInt4094, Static56.anIntArray124[0], Static223.anIntArray373[0], Static141.anIntArray266[0], Static172.anIntArray329[0], local16);
		Static158.method2564();
		return local65;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public static void method3059() {
		for (@Pc(12) Class1_Sub11 local12 = (Class1_Sub11) Static154.aClass50_18.method1358(); local12 != null; local12 = (Class1_Sub11) Static154.aClass50_18.method1361()) {
			@Pc(17) int local17 = local12.anInt1575;
			if (Static224.method3669(local17)) {
				@Pc(25) Class86[] local25 = Static6.aClass86ArrayArray11[local17];
				@Pc(27) boolean local27 = true;
				for (@Pc(29) int local29 = 0; local29 < local25.length; local29++) {
					if (local25[local29] != null) {
						local27 = local25[local29].aBoolean280;
						break;
					}
				}
				if (!local27) {
					@Pc(53) int local53 = (int) local12.aLong177;
					@Pc(57) Class86 local57 = Static13.method333(local53);
					if (local57 != null) {
						Static16.method354(local57);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ed;Z)I")
	public static int method3060(@OriginalArg(0) Class5_Sub5_Sub1 arg0) {
		@Pc(11) int local11 = arg0.anInt1266;
		if (arg0.anInt3005 == arg0.anInt3022) {
			local11 = arg0.anInt1263;
		} else if (arg0.anInt3002 == arg0.anInt3005) {
			local11 = arg0.anInt1271;
		}
		return local11;
	}
}
