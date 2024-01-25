import java.awt.Component;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static647 {

	@OriginalMember(owner = "client!wv", name = "M", descriptor = "I")
	public static int anInt10293;

	@OriginalMember(owner = "client!wv", name = "F", descriptor = "Lclient!kq;")
	public static final Class193 aClass193_9 = new Class193();

	@OriginalMember(owner = "client!wv", name = "H", descriptor = "I")
	public static int anInt10288 = -1;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ILjava/awt/Component;)Lclient!eh;")
	public static Class62 method8675(@OriginalArg(1) Component arg0) {
		return new Class62_Sub1(arg0);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZILclient!wq;)V")
	public static void method8676(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class9_Sub2_Sub1_Sub2_Sub2 arg1) {
		if (Static285.anInt7798 >= 400) {
			return;
		}
		@Pc(14) Class309 local14 = arg1.aClass309_1;
		@Pc(21) String local21 = arg1.aString108;
		if (local14.anIntArray553 != null) {
			local14 = local14.method7594(Static183.aClass285_1);
			if (local14 == null) {
				return;
			}
			local21 = local14.aString86;
		}
		if (!local14.aBoolean659) {
			return;
		}
		if (arg1.anInt10238 != 0) {
			@Pc(55) String local55 = Static300.aClass133_17 == Static431.aClass133_11 ? Static369.aClass235_33.method5893(Static455.anInt7738) : Static369.aClass235_31.method5893(Static455.anInt7738);
			local21 = local21 + Static540.method7788(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt1306, arg1.anInt10238) + " (" + local55 + arg1.anInt10238 + ")";
		}
		if (Static425.aBoolean536 && !arg0) {
			@Pc(97) Class108 local97 = Static632.anInt10065 == -1 ? null : Static220.aClass214_2.method5419(Static632.anInt10065);
			if ((Static95.anInt1910 & 0x2) != 0 && (local97 == null || local14.method7584(Static632.anInt10065, local97.anInt3158) != local97.anInt3158)) {
				Static139.method2380(true, Static551.anInt9151, false, -1, Static372.aString48 + " -> <col=ffff00>" + local21, (long) arg1.anInt10204, false, 0, (long) arg1.anInt10204, 0, 22, Static323.aString46);
			}
		}
		if (!arg0) {
			@Pc(153) String[] local153 = local14.aStringArray73;
			if (Static350.aBoolean478) {
				local153 = Static5.method81(local153);
			}
			@Pc(163) int local163;
			if (local153 != null) {
				for (local163 = 4; local163 >= 0; local163--) {
					if (local153[local163] != null && (local14.aByte97 == 0 || !local153[local163].equalsIgnoreCase(Static369.aClass235_26.method5893(Static455.anInt7738)))) {
						@Pc(186) byte local186 = 0;
						if (local163 == 0) {
							local186 = 3;
						}
						@Pc(192) int local192 = Static299.anInt5924;
						if (local163 == 1) {
							local186 = 17;
						}
						if (local163 == 2) {
							local186 = 10;
						}
						if (local163 == 3) {
							local186 = 45;
						}
						if (local14.anInt8839 == local163) {
							local192 = local14.anInt8828;
						}
						if (local163 == 4) {
							local186 = 9;
						}
						if (local14.anInt8827 == local163) {
							local192 = local14.anInt8844;
						}
						Static139.method2380(true, local153[local163].equalsIgnoreCase(Static369.aClass235_26.method5893(Static455.anInt7738)) ? local14.anInt8841 : local192, false, -1, "<col=ffff00>" + local21, (long) arg1.anInt10204, false, 0, (long) arg1.anInt10204, 0, local186, local153[local163]);
					}
				}
			}
			if (local14.aByte97 == 1 && local153 != null) {
				for (local163 = 4; local163 >= 0; local163--) {
					if (local153[local163] != null && local153[local163].equalsIgnoreCase(Static369.aClass235_26.method5893(Static455.anInt7738))) {
						@Pc(311) short local311 = 0;
						if (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt1306 < arg1.anInt10238) {
							local311 = 2000;
						}
						@Pc(324) short local324 = 0;
						if (local163 == 0) {
							local324 = 3;
						}
						if (local163 == 1) {
							local324 = 17;
						}
						if (local163 == 2) {
							local324 = 10;
						}
						if (local163 == 3) {
							local324 = 45;
						}
						if (local163 == 4) {
							local324 = 9;
						}
						if (local324 != 0) {
							local324 += local311;
						}
						Static139.method2380(true, local14.anInt8841, false, -1, "<col=ffff00>" + local21, (long) arg1.anInt10204, false, 0, (long) arg1.anInt10204, 0, local324, local153[local163]);
					}
				}
			}
		}
		Static139.method2380(true, Static135.anInt2826, arg0, -1, "<col=ffff00>" + local21, (long) arg1.anInt10204, false, 0, (long) arg1.anInt10204, 0, 1007, Static369.aClass235_25.method5893(Static455.anInt7738));
	}

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "(I)V")
	public static void method8677() {
		for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
			Static110.aBooleanArray5[local12] = true;
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/awt/Frame;BLclient!rp;)V")
	public static void method8678(@OriginalArg(0) Frame arg0, @OriginalArg(2) Class298 arg1) {
		while (true) {
			@Pc(6) Class174 local6 = arg1.method7287(arg0);
			while (local6.anInt5121 == 0) {
				Static143.method2414(10L);
			}
			if (local6.anInt5121 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static143.method2414(100L);
		}
	}
}
