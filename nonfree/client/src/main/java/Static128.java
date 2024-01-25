import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ega", name = "e", descriptor = "Z")
	public static boolean aBoolean242 = false;

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(BII)I")
	public static int method2646(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static151.anInt3538 == -1) {
			return 1;
		}
		if (Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640() != arg1) {
			Static643.method8769(Static536.aClass316_15.method7577(Static638.anInt10709), arg1, true);
			if (arg1 != Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640()) {
				return -1;
			}
		}
		try {
			@Pc(44) Dimension local44 = Static428.aCanvas12.getSize();
			Static52.method1637(Static184.aClass213_5, Static359.aClass34_7, true, Static467.aClass5_13, Static536.aClass316_15.method7577(Static638.anInt10709));
			@Pc(68) Class192 local68 = Static63.method1779(Static450.aClass223_101, Static151.anInt3538);
			@Pc(71) long local71 = Static582.method8056();
			Static467.aClass5_13.la();
			Static469.aClass115_8.method6290(0, Static375.anInt7139, 0);
			Static467.aClass5_13.method6122(Static469.aClass115_8);
			Static467.aClass5_13.DA(local44.width / 2, local44.height / 2, 512, 512);
			Static467.aClass5_13.xa(1.0F);
			Static467.aClass5_13.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(112) Class92 local112 = Static467.aClass5_13.method6153(local68, 2048, 64, 64, 768);
			@Pc(114) int local114 = 0;
			label41: for (@Pc(116) int local116 = 0; local116 < 500; local116++) {
				Static467.aClass5_13.GA(0);
				Static467.aClass5_13.ya();
				for (@Pc(125) int local125 = 15; local125 >= 0; local125--) {
					for (@Pc(129) int local129 = 0; local129 <= local125; local129++) {
						Static267.aClass115_2.method6290((int) (((float) local129 - (float) local125 / 2.0F) * (float) Static190.anInt4138), 0, (local125 + 1) * Static190.anInt4138);
						local112.method7053(Static267.aClass115_2, (Class9_Sub6) null, 0);
						local114++;
						if ((long) arg0 <= Static582.method8056() - local71) {
							break label41;
						}
					}
				}
			}
			Static467.aClass5_13.method6188();
			@Pc(195) long local195 = (long) (local114 * 1000) / (Static582.method8056() - local71);
			Static467.aClass5_13.GA(0);
			Static467.aClass5_13.ya();
			return (int) local195;
		} catch (@Pc(204) Throwable local204) {
			local204.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method2647(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static437.anInt7955 >= 100) {
			Static238.method4329(Static536.aClass316_41.method7577(Static638.anInt10709));
			return;
		}
		@Pc(23) String local23 = Static604.method8337(arg0);
		if (local23 == null) {
			return;
		}
		@Pc(67) String local67;
		for (@Pc(28) int local28 = 0; local28 < Static437.anInt7955; local28++) {
			@Pc(36) String local36 = Static604.method8337(Static241.aStringArray14[local28]);
			if (local36 != null && local36.equals(local23)) {
				Static238.method4329(arg0 + Static536.aClass316_42.method7577(Static638.anInt10709));
				return;
			}
			if (Static548.aStringArray35[local28] != null) {
				local67 = Static604.method8337(Static548.aStringArray35[local28]);
				if (local67 != null && local67.equals(local23)) {
					Static238.method4329(arg0 + Static536.aClass316_42.method7577(Static638.anInt10709));
					return;
				}
			}
		}
		for (@Pc(94) int local94 = 0; local94 < Static544.anInt9412; local94++) {
			local67 = Static604.method8337(Static277.aStringArray16[local94]);
			if (local67 != null && local67.equals(local23)) {
				Static238.method4329(Static536.aClass316_47.method7577(Static638.anInt10709) + arg0 + Static536.aClass316_48.method7577(Static638.anInt10709));
				return;
			}
			if (Static545.aStringArray34[local94] != null) {
				@Pc(138) String local138 = Static604.method8337(Static545.aStringArray34[local94]);
				if (local138 != null && local138.equals(local23)) {
					Static238.method4329(Static536.aClass316_47.method7577(Static638.anInt10709) + arg0 + Static536.aClass316_48.method7577(Static638.anInt10709));
					return;
				}
			}
		}
		if (Static604.method8337(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aString46).equals(local23)) {
			Static238.method4329(Static536.aClass316_44.method7577(Static638.anInt10709));
			return;
		}
		@Pc(196) Class6_Sub17 local196 = Static330.method7824(Static73.aClass185_20, Static569.aClass134_2);
		local196.aClass6_Sub8_Sub1_2.method8211(Static190.method3507(arg0) + 1);
		local196.aClass6_Sub8_Sub1_2.method8205(arg0);
		local196.aClass6_Sub8_Sub1_2.method8211(arg1 ? 1 : 0);
		Static452.method6867(local196);
	}
}
