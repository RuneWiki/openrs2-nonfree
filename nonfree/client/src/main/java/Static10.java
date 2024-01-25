import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!afa", name = "p", descriptor = "[I")
	public static int[] anIntArray11;

	@OriginalMember(owner = "client!afa", name = "E", descriptor = "I")
	public static int anInt172;

	@OriginalMember(owner = "client!afa", name = "T", descriptor = "Lclient!ha;")
	public static Class65 aClass65_1;

	@OriginalMember(owner = "client!afa", name = "i", descriptor = "I")
	public static int anInt152 = 503;

	@OriginalMember(owner = "client!afa", name = "x", descriptor = "I")
	public static int anInt165 = 1;

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lclient!kl;)V")
	public static void method146(@OriginalArg(0) Class199 arg0) {
		if (Static667.anInt10686 >= 65535) {
			return;
		}
		@Pc(6) Class5_Sub18 local6 = arg0.aClass5_Sub18_2;
		Static50.aClass199Array1[Static667.anInt10686] = arg0;
		Static221.aBooleanArray41[Static667.anInt10686] = false;
		Static667.anInt10686++;
		@Pc(21) int local21 = arg0.anInt6000;
		if (arg0.aBoolean532) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt6000;
		if (arg0.aBoolean531) {
			local29 = Static219.anInt4088 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method8057() + Static558.anInt7322 - local6.method8056() >> Static588.anInt9672;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method8057() + local6.method8056() - Static558.anInt7322 >> Static588.anInt9672;
			if (local73 >= Static233.anInt4238) {
				local73 = Static233.anInt4238 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray76[local41++];
				@Pc(105) int local105 = (local6.method8055() + Static558.anInt7322 - local6.method8056() >> Static588.anInt9672) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static216.anInt4042) {
					local113 = Static216.anInt4042 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static101.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static101.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static667.anInt10686;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static101.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static667.anInt10686 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static101.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static667.anInt10686 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static101.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static667.anInt10686 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "i", descriptor = "(I)V")
	public static void method148() {
		@Pc(7) client local7 = Static209.aClient2;
		synchronized (Static209.aClient2) {
			if (Static625.aFrame3 == null) {
				@Pc(26) Container local26;
				if (Static147.aFrame1 != null) {
					local26 = Static147.aFrame1;
				} else if (Static639.anApplet2 == null) {
					local26 = Static556.anApplet_Sub1_1;
				} else {
					local26 = Static639.anApplet2;
				}
				Static255.anInt4665 = local26.getSize().width;
				Static89.anInt2047 = local26.getSize().height;
				@Pc(50) Insets local50;
				if (Static147.aFrame1 == local26) {
					local50 = Static147.aFrame1.getInsets();
					Static255.anInt4665 -= local50.left + local50.right;
					Static89.anInt2047 -= local50.top + local50.bottom;
				}
				if (Static469.method6688() == 1) {
					Static47.anInt693 = 0;
					Static67.anInt1003 = (Static255.anInt4665 - Static613.anInt10005) / 2;
					Static32.anInt510 = Static613.anInt10005;
					Static79.anInt1140 = anInt152;
				} else {
					Static213.method8059();
				}
				if (Static560.aClass187_13 != Static217.aClass187_7) {
					@Pc(97) boolean local97;
					if (Static32.anInt510 < 1024 && Static79.anInt1140 < 768) {
						local97 = true;
					} else {
						local97 = false;
					}
				}
				Static141.aCanvas7.setSize(Static32.anInt510, Static79.anInt1140);
				if (Static208.aClass65_7 != null) {
					if (Static66.aBoolean570) {
						Static614.method8347(Static141.aCanvas7);
					} else {
						Static208.aClass65_7.method6950(Static141.aCanvas7, Static32.anInt510, Static79.anInt1140);
					}
				}
				if (Static147.aFrame1 == local26) {
					local50 = Static147.aFrame1.getInsets();
					Static141.aCanvas7.setLocation(local50.left + Static67.anInt1003, Static47.anInt693 + local50.top);
				} else {
					Static141.aCanvas7.setLocation(Static67.anInt1003, Static47.anInt693);
				}
				if (Static84.anInt2018 != -1) {
					Static35.method492(true);
				}
				Static236.method3643();
			}
		}
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IZB)Lclient!nt;")
	public static Class5_Sub43 method153(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(20) long local20 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
		return (Class5_Sub43) Static583.aClass300_44.method7188(local20);
	}
}
