import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!un", name = "D", descriptor = "Lclient!dp;")
	public static Class51 aClass51_18;

	@OriginalMember(owner = "client!un", name = "w", descriptor = "Lclient!bm;")
	public static final Class28 aClass28_4 = new Class28("RC", 1);

	@OriginalMember(owner = "client!un", name = "A", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_152 = new Class211(85, 1);

	@OriginalMember(owner = "client!un", name = "C", descriptor = "Lclient!qa;")
	public static final Class186 aClass186_1 = new Class186();

	@OriginalMember(owner = "client!un", name = "E", descriptor = "[I")
	public static final int[] anIntArray694 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!un", name = "a", descriptor = "()V")
	public static void method5010() {
		for (@Pc(1) int local1 = 0; local1 < Static143.anInt2670; local1++) {
			@Pc(6) Class25_Sub1 local6 = Static65.aClass25_Sub1Array2[local1];
			Static385.method5447(local6);
			Static65.aClass25_Sub1Array2[local1] = null;
		}
		Static143.anInt2670 = 0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!tq;Z)V")
	public static void method5012(@OriginalArg(0) Class164 arg0) {
		arg0.method5313(0, 0, Static136.anInt6304, 350);
		arg0.method5321(0, 0, Static136.anInt6304, 350, Static278.anInt4646 << 24 | 0x332277, 1);
		@Pc(35) int local35;
		@Pc(39) int local39;
		for (@Pc(29) int local29 = 0; local29 < 100; local29++) {
			local35 = Static197.anIntArray410[local29];
			local39 = Static55.anIntArray146[local29];
			arg0.method5321(local35, local39, 2, 2, Static100.anIntArray749[local29] << 24 | 0xFFFFFF, 1);
		}
		local35 = 350 / Static236.anInt3955;
		if (Static215.anInt3688 > 0) {
			local39 = 346 - Static236.anInt3955 - 4;
			@Pc(83) int local83 = local39 * local35 / (local35 + Static215.anInt3688 - 1);
			@Pc(85) int local85 = 4;
			if (Static215.anInt3688 > 1) {
				local85 = (local39 - local83) * (-Static209.anInt3638 + -1 + Static215.anInt3688) / (Static215.anInt3688 - 1) + 4;
			}
			arg0.method5321(Static136.anInt6304 - 16, local85, 12, local83, Static278.anInt4646 << 24 | 0x332277, 2);
			for (@Pc(124) int local124 = Static209.anInt3638; local124 < local35 + Static209.anInt3638 && Static215.anInt3688 > local124; local124++) {
				@Pc(133) String[] local133 = Static88.method1335(Static231.aStringArray79[local124], '\b');
				@Pc(140) int local140 = (Static136.anInt6304 - 24) / local133.length;
				for (@Pc(142) int local142 = 0; local142 < local133.length; local142++) {
					@Pc(150) int local150 = local142 * local140 + 8;
					arg0.method5313(local150, 0, local150 + local140 - 8, 350);
					Static334.aClass137_7.method5101(-16777216, local133[local142], local150, -1, 350 - (local124 - Static209.anInt3638) * Static236.anInt3955 - Static6.anInt74 - Static75.aClass110_1.anInt2957 - 2);
				}
			}
		}
		arg0.method5313(0, 0, Static136.anInt6304, 350);
		arg0.method5395(350 - Static6.anInt74, Static136.anInt6304, -1, 0);
		Static101.aClass137_2.method5101(-16777216, "--> " + Static110.aString69, 10, -1, 350 - Static102.aClass110_3.anInt2957 - 1);
		local39 = -1;
		if (Static366.anInt5883 % 30 > 15) {
			local39 = 16777215;
		}
		arg0.method5362(local39, 12, 350 - Static102.aClass110_3.anInt2957 - 11, 10 - -Static102.aClass110_3.method2413("--> " + Static110.aString69.substring(0, Static281.anInt4884)));
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(B)V")
	public static void method5016() {
		if (!Static90.aBoolean144) {
			return;
		}
		@Pc(11) Class117 local11 = Static84.method1246(Static119.anInt2128, Static137.anInt2555);
		if (local11 != null && local11.anObjectArray26 != null) {
			@Pc(24) Class1_Sub39 local24 = new Class1_Sub39();
			local24.aClass117_16 = local11;
			local24.anObjectArray34 = local11.anObjectArray26;
			Static387.method5496(local24);
		}
		Static283.anInt4904 = -1;
		Static267.anInt4674 = -1;
		Static90.aBoolean144 = false;
		if (local11 != null) {
			Static312.method4635(local11);
		}
	}
}
