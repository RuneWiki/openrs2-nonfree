import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!fga", name = "P", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method2804(@OriginalArg(1) Class5 arg0) {
		if (Static160.anInt3142 < 2 && !Static190.aBoolean232 || Static608.aClass279_18 != null) {
			return;
		}
		@Pc(38) String local38;
		if (Static190.aBoolean232 && Static160.anInt3142 < 2) {
			local38 = Static136.aString18 + Static59.aClass43_32.method1598(Static325.anInt6083) + Static11.aString107 + " ->";
		} else if (Static585.aBoolean689 && Static339.aClass163_1.method4104(81) && Static160.anInt3142 > 2) {
			local38 = Static481.method7189(Static203.aClass3_Sub4_Sub13_1);
		} else {
			@Pc(60) Class3_Sub4_Sub13 local60 = Static203.aClass3_Sub4_Sub13_1;
			if (local60 == null) {
				return;
			}
			local38 = Static481.method7189(local60);
			@Pc(69) int[] local69 = null;
			if (Static13.method8716(local60.anInt4577)) {
				local69 = Static320.aClass53_2.method1770((int) local60.aLong136).anIntArray50;
			} else if (local60.anInt4575 != -1) {
				local69 = Static320.aClass53_2.method1770(local60.anInt4575).anIntArray50;
			} else if (Static582.method8235(local60.anInt4577)) {
				@Pc(148) Class3_Sub28 local148 = (Class3_Sub28) Static551.aClass280_43.method7107((long) local60.aLong136);
				if (local148 != null) {
					@Pc(153) Class4_Sub1_Sub2_Sub1_Sub1 local153 = local148.aClass4_Sub1_Sub2_Sub1_Sub1_2;
					@Pc(156) Class109 local156 = local153.aClass109_1;
					if (local156.anIntArray147 != null) {
						local156 = local156.method2813(Static373.aClass150_1);
					}
					if (local156 != null) {
						local69 = local156.anIntArray146;
					}
				}
			} else if (Static213.method3609(local60.anInt4577)) {
				@Pc(117) Class299 local117;
				if (local60.anInt4577 == 1009) {
					local117 = Static105.aClass302_1.method7466((int) local60.aLong136);
				} else {
					local117 = Static105.aClass302_1.method7466((int) (local60.aLong136 >>> 32 & 0x7FFFFFFFL));
				}
				if (local117.anIntArray533 != null) {
					local117 = local117.method7418(Static373.aClass150_1);
				}
				if (local117 != null) {
					local69 = local117.anIntArray537;
				}
			}
			if (local69 != null) {
				local38 = local38 + Static291.method4631(local69);
			}
		}
		if (Static160.anInt3142 > 2) {
			local38 = local38 + "<col=ffffff> / " + (Static160.anInt3142 - 2) + Static59.aClass43_25.method1598(Static325.anInt6083);
		}
		if (Static366.aClass279_12 != null) {
			@Pc(255) Class62 local255 = Static366.aClass279_12.method7078(arg0);
			if (local255 == null) {
				local255 = Static460.aClass62_9;
			}
			local255.method8362(Static366.aClass279_12.anInt8141, local38, Static366.aClass279_12.anInt8153, Static310.aRandom1, Static366.aClass279_12.anInt8163, Static526.anInt8988, Static366.aClass279_12.anInt8150, Static167.aClass24Array8, Static362.anInt6901, Static189.anIntArray187, Static51.anIntArray48, Static366.aClass279_12.anInt8220, Static366.aClass279_12.anInt8169, Static88.anInt2121);
			Static423.method6625(Static189.anIntArray187[1], Static189.anIntArray187[3], Static189.anIntArray187[2], Static189.anIntArray187[0]);
		} else if (Static511.aClass279_17 != null && Static232.aClass222_3 == Static212.aClass222_2) {
			@Pc(235) int local235 = Static460.aClass62_9.method8361(Static167.aClass24Array8, Static526.anInt8988, local38, Static51.anIntArray48, Static353.anInt6778 + 4, Static310.aRandom1, Static285.anInt5068 + 16);
			Static423.method6625(Static285.anInt5068, 16, Static489.aClass282_12.method7135(local38) + local235, Static353.anInt6778 + 4);
			return;
		}
	}
}
