import java.awt.Component;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!nl", name = "J", descriptor = "Lclient!pk;")
	public static Class132 aClass132_62;

	@OriginalMember(owner = "client!nl", name = "T", descriptor = "[I")
	public static int[] anIntArray263;

	@OriginalMember(owner = "client!nl", name = "U", descriptor = "[[[Lclient!sg;")
	public static Class8_Sub27[][][] aClass8_Sub27ArrayArrayArray1;

	@OriginalMember(owner = "client!nl", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString122 = "flash2:";

	@OriginalMember(owner = "client!nl", name = "O", descriptor = "[Lclient!kh;")
	public static Class94[] aClass94Array1 = new Class94[6];

	@OriginalMember(owner = "client!nl", name = "P", descriptor = "I")
	public static int anInt3503 = 0;

	@OriginalMember(owner = "client!nl", name = "V", descriptor = "[I")
	public static int[] anIntArray264 = new int[256];

	@OriginalMember(owner = "client!nl", name = "X", descriptor = "I")
	public static int anInt3508 = -1;

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "(I)V")
	public static void method2732() {
		for (@Pc(15) int local15 = 0; local15 < Static291.anInt3609; local15++) {
			@Pc(22) int local22 = Static171.anIntArray259[local15];
			@Pc(26) Class36_Sub3_Sub2 local26 = Static48.aClass36_Sub3_Sub2Array1[local22];
			@Pc(30) int local30 = Static275.aClass8_Sub2_Sub1_6.method2334();
			if ((local30 & 0x10) != 0) {
				local30 += Static275.aClass8_Sub2_Sub1_6.method2334() << 8;
			}
			if ((local30 & 0x4) != 0) {
				local26.aString146 = Static275.aClass8_Sub2_Sub1_6.method2372();
				local26.anInt4115 = 100;
			}
			@Pc(64) int local64;
			@Pc(68) int local68;
			if ((local30 & 0x8) != 0) {
				local64 = Static275.aClass8_Sub2_Sub1_6.method2338();
				local68 = Static275.aClass8_Sub2_Sub1_6.method2349();
				local26.method3104(local64, Static183.anInt3590, local68);
				local26.anInt4145 = Static183.anInt3590 + 300;
				local26.anInt4068 = Static275.aClass8_Sub2_Sub1_6.method2349();
			}
			if ((local30 & 0x80) != 0) {
				local64 = Static275.aClass8_Sub2_Sub1_6.method2377();
				if (local64 == 65535) {
					local64 = -1;
				}
				local68 = Static275.aClass8_Sub2_Sub1_6.method2322();
				Static239.method3611(local68, local64, local26);
			}
			if ((local30 & 0x20) != 0) {
				local64 = Static275.aClass8_Sub2_Sub1_6.method2338();
				local68 = Static275.aClass8_Sub2_Sub1_6.method2322();
				local26.method3104(local64, Static183.anInt3590, local68);
			}
			if ((local30 & 0x100) != 0) {
				local64 = Static275.aClass8_Sub2_Sub1_6.method2349();
				@Pc(141) int[] local141 = new int[local64];
				@Pc(144) int[] local144 = new int[local64];
				@Pc(147) int[] local147 = new int[local64];
				for (@Pc(149) int local149 = 0; local149 < local64; local149++) {
					@Pc(156) int local156 = Static275.aClass8_Sub2_Sub1_6.method2348();
					if (local156 == 65535) {
						local156 = -1;
					}
					local147[local149] = local156;
					local141[local149] = Static275.aClass8_Sub2_Sub1_6.method2349();
					local144[local149] = Static275.aClass8_Sub2_Sub1_6.method2375();
				}
				Static248.method3684(local141, local144, local26, local147);
			}
			if ((local30 & 0x40) != 0) {
				local64 = Static275.aClass8_Sub2_Sub1_6.method2348();
				if (local64 == 65535) {
					local64 = -1;
				}
				local68 = Static275.aClass8_Sub2_Sub1_6.method2352();
				@Pc(209) boolean local209 = true;
				if (local64 != -1 && local26.anInt4125 != -1 && Static115.method1855(Static81.method1346(local64).anInt4680).anInt2224 < Static115.method1855(Static81.method1346(local26.anInt4125).anInt4680).anInt2224) {
					local209 = false;
				}
				if (local209) {
					local26.anInt4095 = local68 >> 16;
					local26.anInt4124 = 1;
					local26.anInt4070 = 0;
					local26.anInt4149 = (local68 & 0xFFFF) + Static183.anInt3590;
					local26.anInt4127 = 0;
					if (Static183.anInt3590 < local26.anInt4149) {
						local26.anInt4127 = -1;
					}
					local26.anInt4125 = local64;
					if (local26.anInt4125 != -1 && Static183.anInt3590 == local26.anInt4149) {
						@Pc(286) int local286 = Static81.method1346(local26.anInt4125).anInt4680;
						if (local286 != -1) {
							@Pc(296) Class76 local296 = Static115.method1855(local286);
							if (local296 != null && local296.anIntArray159 != null) {
								Static184.method2846(false, 0, local26.anInt4117, local296, local26.anInt4118);
							}
						}
					}
				}
			}
			if ((local30 & 0x1) != 0) {
				if (local26.aClass173_1.method4251()) {
					Static232.method3544(local26);
				}
				local26.method3117(Static253.method3795(Static275.aClass8_Sub2_Sub1_6.method2348()));
				local26.method3115(local26.aClass173_1.anInt5633);
				local26.anInt4083 = local26.aClass173_1.anInt5634;
				local26.anInt4129 = local26.aClass173_1.anInt5606;
				if (local26.aClass173_1.method4251()) {
					Static213.method3340(local26.anIntArray308[0], 0, local26, null, null, local26.anIntArray310[0], Static34.anInt770);
				}
			}
			if ((local30 & 0x2) != 0) {
				local26.anInt4139 = Static275.aClass8_Sub2_Sub1_6.method2375();
				if (local26.anInt4139 == 65535) {
					local26.anInt4139 = -1;
				}
			}
			if ((local30 & 0x200) != 0) {
				local26.anInt4066 = Static275.aClass8_Sub2_Sub1_6.method2377();
				local26.anInt4105 = Static275.aClass8_Sub2_Sub1_6.method2377();
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLclient!aj;)Lclient!sk;")
	public static Class3_Sub4 method2733(@OriginalArg(1) Class8_Sub2 arg0) {
		return new Class3_Sub4(arg0.method2360(), arg0.method2360(), arg0.method2360(), arg0.method2360(), arg0.method2323(), arg0.method2323(), arg0.method2334());
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!bk;Ljava/awt/Frame;Z)V")
	public static void method2735(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Frame arg1) {
		while (true) {
			@Pc(6) Class163 local6 = arg0.method454(arg1);
			while (local6.anInt5259 == 0) {
				Static162.method2645(10L);
			}
			if (local6.anInt5259 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static162.method2645(100L);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILclient!pk;)V")
	public static void method2736(@OriginalArg(1) Class132 arg0) {
		Static61.anInt1335 = arg0.method3185("runes");
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method2737(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static89.aClass82_1);
		arg0.addMouseMotionListener(Static89.aClass82_1);
		arg0.addFocusListener(Static89.aClass82_1);
	}
}
