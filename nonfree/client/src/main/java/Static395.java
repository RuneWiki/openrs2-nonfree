import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "[I")
	public static int[] anIntArray494;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "Lclient!an;")
	public static Class16 aClass16_93;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_212 = new Class88("Profiling", "Profiling", "Profilage", "Profiling");

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
	public static int anInt7445 = 0;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZII)Ljava/lang/String;")
	public static String method6205(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)I")
	public static int method6206() {
		return Static324.anInt6094;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
	public static void method6208() {
		for (@Pc(8) int local8 = 0; local8 < Static34.anInt757; local8++) {
			@Pc(14) int local14 = Static188.anIntArray320[local8];
			@Pc(22) Class30_Sub1_Sub1_Sub2 local22 = ((Class12_Sub41) Static29.aClass68_7.method1917((long) local14)).aClass30_Sub1_Sub1_Sub2_2;
			@Pc(26) int local26 = Static394.aClass12_Sub8_Sub2_2.method5216();
			if ((local26 & 0x20) != 0) {
				local26 += Static394.aClass12_Sub8_Sub2_2.method5216() << 8;
			}
			@Pc(49) int local49;
			@Pc(53) int local53;
			if ((local26 & 0x40) != 0) {
				local49 = Static394.aClass12_Sub8_Sub2_2.method5218();
				local53 = Static394.aClass12_Sub8_Sub2_2.method5216();
				local22.method3603(Static409.anInt7683, local49, local53);
			}
			if ((local26 & 0x1) != 0) {
				local22.aString38 = Static394.aClass12_Sub8_Sub2_2.method5206();
				local22.anInt4170 = 100;
			}
			@Pc(97) int local97;
			if ((local26 & 0x4) != 0) {
				local49 = Static394.aClass12_Sub8_Sub2_2.method5198();
				if (local49 == 65535) {
					local49 = -1;
				}
				local53 = Static394.aClass12_Sub8_Sub2_2.method5213();
				local97 = Static394.aClass12_Sub8_Sub2_2.method5184();
				local22.method3589(false, local97, local49, local53);
			}
			if ((local26 & 0x400) != 0) {
				local49 = Static394.aClass12_Sub8_Sub2_2.method5198();
				if (local49 == 65535) {
					local49 = -1;
				}
				local53 = Static394.aClass12_Sub8_Sub2_2.method5226();
				local97 = Static394.aClass12_Sub8_Sub2_2.method5177();
				local22.method3589(true, local97, local49, local53);
			}
			if ((local26 & 0x100) != 0) {
				local49 = Static394.aClass12_Sub8_Sub2_2.method5202();
				@Pc(148) int[] local148 = new int[local49];
				@Pc(151) int[] local151 = new int[local49];
				@Pc(154) int[] local154 = new int[local49];
				for (@Pc(156) int local156 = 0; local156 < local49; local156++) {
					@Pc(162) int local162 = Static394.aClass12_Sub8_Sub2_2.method5210();
					if (local162 == 65535) {
						local162 = -1;
					}
					local148[local156] = local162;
					local151[local156] = Static394.aClass12_Sub8_Sub2_2.method5177();
					local154[local156] = Static394.aClass12_Sub8_Sub2_2.method5210();
				}
				Static352.method5521(local154, local151, local148, local22);
			}
			if ((local26 & 0x80) != 0) {
				local49 = Static394.aClass12_Sub8_Sub2_2.method5199();
				if (local49 == 65535) {
					local49 = -1;
				}
				local53 = Static394.aClass12_Sub8_Sub2_2.method5202();
				Static228.method4108(local22, local49, local53);
			}
			if ((local26 & 0x2) != 0) {
				local49 = Static394.aClass12_Sub8_Sub2_2.method5218();
				local53 = Static394.aClass12_Sub8_Sub2_2.method5177();
				local22.method3603(Static409.anInt7683, local49, local53);
				local22.anInt4144 = Static409.anInt7683 + 300;
				local22.anInt4165 = Static394.aClass12_Sub8_Sub2_2.method5202();
			}
			if ((local26 & 0x10) != 0) {
				if (local22.aClass130_1.method3563()) {
					Static183.method3613(local22);
				}
				local22.method3609(Static161.aClass110_3.method3018(Static394.aClass12_Sub8_Sub2_2.method5204()));
				local22.method3599(local22.aClass130_1.anInt4113);
				local22.anInt4199 = local22.aClass130_1.anInt4085 << 3;
				if (local22.aClass130_1.method3563()) {
					Static402.method6312(null, local22.anIntArray316[0], 0, local22, local22.aByte99, local22.anIntArray317[0], null);
				}
			}
			if ((local26 & 0x1000) != 0) {
				local22.anInt4149 = Static394.aClass12_Sub8_Sub2_2.method5209();
				local22.anInt4163 = Static394.aClass12_Sub8_Sub2_2.method5168();
				local22.anInt4180 = Static394.aClass12_Sub8_Sub2_2.method5209();
				local22.anInt4162 = Static394.aClass12_Sub8_Sub2_2.method5209();
				local22.anInt4141 = Static394.aClass12_Sub8_Sub2_2.method5210() + Static409.anInt7683;
				local22.anInt4148 = Static394.aClass12_Sub8_Sub2_2.method5210() + Static409.anInt7683;
				local22.anInt4173 = Static394.aClass12_Sub8_Sub2_2.method5177();
				local22.anInt4201 = 1;
				local22.anInt4180 += local22.anIntArray316[0];
				local22.anInt4203 = 0;
				local22.anInt4163 += local22.anIntArray317[0];
				local22.anInt4162 += local22.anIntArray317[0];
				local22.anInt4149 += local22.anIntArray316[0];
			}
			if ((local26 & 0x800) != 0) {
				local22.aByte60 = Static394.aClass12_Sub8_Sub2_2.method5173();
				local22.aByte59 = Static394.aClass12_Sub8_Sub2_2.method5209();
				local22.aByte58 = Static394.aClass12_Sub8_Sub2_2.method5222();
				local22.aByte57 = (byte) Static394.aClass12_Sub8_Sub2_2.method5216();
				local22.anInt4139 = Static409.anInt7683 + Static394.aClass12_Sub8_Sub2_2.method5198();
				local22.anInt4198 = Static409.anInt7683 + Static394.aClass12_Sub8_Sub2_2.method5210();
			}
			if ((local26 & 0x8) != 0) {
				local22.anInt4135 = Static394.aClass12_Sub8_Sub2_2.method5210();
				if (local22.anInt4135 == 65535) {
					local22.anInt4135 = -1;
				}
			}
			if ((local26 & 0x2000) != 0) {
				local22.anInt4222 = Static394.aClass12_Sub8_Sub2_2.method5204();
				local22.anInt4210 = Static394.aClass12_Sub8_Sub2_2.method5199();
			}
			if ((local26 & 0x200) != 0) {
				local49 = Static394.aClass12_Sub8_Sub2_2.method5199();
				local22.anInt4133 = Static394.aClass12_Sub8_Sub2_2.method5177();
				local22.anInt4128 = Static394.aClass12_Sub8_Sub2_2.method5216();
				local22.aBoolean336 = (local49 & 0x8000) != 0;
				local22.anInt4129 = local49 & 0x7FFF;
				local22.anInt4137 = Static409.anInt7683 + local22.anInt4129 + local22.anInt4133;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
	public static void method6209() {
		Static300.method4831();
		Static347.method5472(Static208.aClass12_Sub10_Sub1_1.aBoolean181);
		Static152.aClass69_1 = Static410.method6418(Static375.aClass71_3, 0, 22050, Static301.aCanvas11);
		Static152.aClass69_1.method6848(Static259.aClass12_Sub13_Sub2_1);
		Static349.aClass69_2 = Static410.method6418(Static375.aClass71_3, 1, 2048, Static301.aCanvas11);
		Static349.aClass69_2.method6848(Static328.aClass12_Sub13_Sub1_1);
	}
}
