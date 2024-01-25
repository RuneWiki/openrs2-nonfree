import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "[Lclient!f;")
	public static Class49[] aClass49Array50;

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "Lclient!um;")
	public static Class244 aClass244_3;

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "J")
	public static long aLong70 = 0L;

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BII)Z")
	public static boolean method1795(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)I")
	public static int method1796(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static209.anIntArray182[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)I")
	public static int method1797(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1798(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static145.anInt2445 >= 100 && !Static164.aBoolean215 || Static145.anInt2445 >= 200) {
			Static360.method4660(Static307.aClass151_157.method3122(Static188.anInt3028));
			return;
		}
		@Pc(31) String local31 = Static330.method4213(arg0);
		if (local31 == null) {
			return;
		}
		@Pc(74) String local74;
		for (@Pc(36) int local36 = 0; local36 < Static145.anInt2445; local36++) {
			@Pc(44) String local44 = Static330.method4213(Static108.aStringArray17[local36]);
			if (local44 != null && local44.equals(local31)) {
				Static360.method4660(arg0 + Static431.aClass151_218.method3122(Static188.anInt3028));
				return;
			}
			if (Static244.aStringArray29[local36] != null) {
				local74 = Static330.method4213(Static244.aStringArray29[local36]);
				if (local74 != null && local74.equals(local31)) {
					Static360.method4660(arg0 + Static431.aClass151_218.method3122(Static188.anInt3028));
					return;
				}
			}
		}
		for (@Pc(104) int local104 = 0; local104 < Static360.anInt5990; local104++) {
			local74 = Static330.method4213(Static76.aStringArray10[local104]);
			if (local74 != null && local74.equals(local31)) {
				Static360.method4660(Static416.aClass151_208.method3122(Static188.anInt3028) + arg0 + Static274.aClass151_142.method3122(Static188.anInt3028));
				return;
			}
			if (Static11.aStringArray1[local104] != null) {
				@Pc(147) String local147 = Static330.method4213(Static11.aStringArray1[local104]);
				if (local147 != null && local147.equals(local31)) {
					Static360.method4660(Static416.aClass151_208.method3122(Static188.anInt3028) + arg0 + Static274.aClass151_142.method3122(Static188.anInt3028));
					return;
				}
			}
		}
		if (Static330.method4213(Static239.aClass20_Sub3_Sub3_Sub1_1.aString48).equals(local31)) {
			Static360.method4660(Static414.aClass151_206.method3122(Static188.anInt3028));
		} else {
			Static5.method94(Static28.aClass137_37);
			Static75.aClass1_Sub11_Sub1_1.method4445(Static221.method2944(arg0));
			Static75.aClass1_Sub11_Sub1_1.method4453(arg0);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BZLjava/lang/String;)V")
	public static void method1799(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(4) String local4 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(29) int local29 = local19 + (arg0 ? Static109.aClass229_1.anInt6311 : Static109.aClass229_1.anInt6305);
		for (@Pc(39) int local39 = local19; local39 < local29; local39++) {
			@Pc(46) Class1_Sub3_Sub17 local46 = Static109.aClass229_1.method4848(local39);
			if (local46.aBoolean555 && local46.method5202().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static355.aShortArray72 = null;
					Static62.anInt1109 = -1;
					return;
				}
				if (local11.length <= local13) {
					@Pc(76) short[] local76 = new short[local11.length * 2];
					for (@Pc(78) int local78 = 0; local78 < local13; local78++) {
						local76[local78] = local11[local78];
					}
					local11 = local76;
				}
				local11[local13++] = (short) local39;
			}
		}
		Static441.anInt7348 = 0;
		Static62.anInt1109 = local13;
		Static355.aShortArray72 = local11;
		@Pc(111) String[] local111 = new String[Static62.anInt1109];
		for (@Pc(113) int local113 = 0; local113 < Static62.anInt1109; local113++) {
			local111[local113] = Static109.aClass229_1.method4848(local11[local113]).method5202();
		}
		Static367.method4767(local111, Static355.aShortArray72);
	}
}
