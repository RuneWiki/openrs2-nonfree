import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_120 = new Class47(72, 16);

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_142 = new Class73(46, 6);

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "F")
	public static float aFloat163 = 1.0F;

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
	public static int anInt7763 = 0;

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "Z")
	public static boolean aBoolean545 = false;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!qj;BLjava/awt/Frame;)V")
	public static void method6347(@OriginalArg(0) Class272 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(6) Class331 local6 = arg0.method6132(arg1);
			while (local6.anInt8818 == 0) {
				Static318.method4952(10L);
			}
			if (local6.anInt8818 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static318.method4952(100L);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!qf;II)Z")
	public static boolean method6348(@OriginalArg(0) Class6_Sub21_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0.method6078(2);
		@Pc(33) int local33;
		@Pc(40) int local40;
		@Pc(109) int local109;
		@Pc(113) int local113;
		@Pc(119) int local119;
		if (local10 == 0) {
			if (arg0.method6078(1) != 0) {
				method6348(arg0, arg1);
			}
			local33 = arg0.method6078(6);
			local40 = arg0.method6078(6);
			@Pc(52) boolean local52 = arg0.method6078(1) == 1;
			if (local52) {
				Static28.anIntArray41[Static554.anInt9174++] = arg1;
			}
			if (Static588.aClass4_Sub1_Sub1_Sub2Array3[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(75) Class302 local75 = Static412.aClass302Array1[arg1];
			@Pc(83) Class4_Sub1_Sub1_Sub2 local83 = Static588.aClass4_Sub1_Sub1_Sub2Array3[arg1] = new Class4_Sub1_Sub1_Sub2();
			local83.anInt7126 = arg1;
			if (Static439.aClass6_Sub21Array1[arg1] != null) {
				local83.method5915(Static439.aClass6_Sub21Array1[arg1]);
			}
			local83.method5903(true, local75.anInt8092);
			local83.anInt7123 = local75.anInt8094;
			local109 = local75.anInt8091;
			local113 = local109 >> 28;
			local119 = local109 >> 14 & 0xFF;
			@Pc(123) int local123 = local109 & 0xFF;
			local83.aBoolean498 = local75.aBoolean575;
			local83.aByteArray90[0] = Static308.aByteArray66[arg1];
			local83.aByte108 = (byte) local113;
			local83.method5913((local119 << 6) + local33 - Static39.anInt4952, -Static138.anInt3088 + (local123 << 6) + local40);
			local83.aBoolean500 = false;
			Static412.aClass302Array1[arg1] = null;
			return true;
		} else if (local10 == 1) {
			local33 = arg0.method6078(2);
			local40 = Static412.aClass302Array1[arg1].anInt8091;
			Static412.aClass302Array1[arg1].anInt8091 = (((local40 >> 28) + local33 & 0x3) << 28) + (local40 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(220) int local220;
			@Pc(225) int local225;
			@Pc(234) int local234;
			if (local10 != 2) {
				local33 = arg0.method6078(18);
				local40 = local33 >> 16;
				local220 = local33 >> 8 & 0xFF;
				local225 = local33 & 0xFF;
				local234 = Static412.aClass302Array1[arg1].anInt8091;
				local109 = local40 + (local234 >> 28) & 0x3;
				local113 = local220 + (local234 >> 14) & 0xFF;
				local119 = local225 + local234 & 0xFF;
				Static412.aClass302Array1[arg1].anInt8091 = local119 + (local113 << 14) + (local109 << 28);
				return false;
			}
			local33 = arg0.method6078(5);
			local40 = local33 >> 3;
			local220 = local33 & 0x7;
			local225 = Static412.aClass302Array1[arg1].anInt8091;
			local234 = (local225 >> 28) + local40 & 0x3;
			local109 = local225 >> 14 & 0xFF;
			local113 = local225 & 0xFF;
			if (local220 == 0) {
				local109--;
				local113--;
			}
			if (local220 == 1) {
				local113--;
			}
			if (local220 == 2) {
				local113--;
				local109++;
			}
			if (local220 == 3) {
				local109--;
			}
			if (local220 == 4) {
				local109++;
			}
			if (local220 == 5) {
				local109--;
				local113++;
			}
			if (local220 == 6) {
				local113++;
			}
			if (local220 == 7) {
				local113++;
				local109++;
			}
			Static412.aClass302Array1[arg1].anInt8091 = (local109 << 14) + (local234 << 28) + local113;
			return false;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V")
	public static void method6350(@OriginalArg(1) int arg0) {
		if (Static557.anInt9206 == arg0) {
			return;
		}
		if (arg0 == 13) {
			if (Static70.aString27 == null) {
				Static332.method5171(Static528.aString99, Static216.aString30, Static193.anInt9352);
			} else {
				Static474.method7122(Static193.anInt9352);
			}
		}
		if (arg0 != 13 && Static535.aClass127_1 != null) {
			Static535.aClass127_1.method6305();
			Static535.aClass127_1 = null;
		}
		if (arg0 == 3) {
			Static2.method66(Static532.anInt8836 != Static468.anInt8036);
		}
		if (arg0 == 7) {
			Static249.method4258(Static112.anInt2175 != Static468.anInt8036);
		}
		if (arg0 == 5) {
			if (Static70.aString27 == null) {
				Static45.method1073(Static528.aString99, Static216.aString30);
			} else {
				Static336.method5245();
			}
		} else if (arg0 == 6) {
			if (Static70.aString27 == null) {
				Static332.method5171(Static528.aString99, Static216.aString30, Static193.anInt9352);
			} else {
				Static474.method7122(Static193.anInt9352);
			}
		} else if (arg0 == 9) {
			if (Static70.aString27 == null) {
				Static332.method5171(Static528.aString99, Static216.aString30, Static193.anInt9352);
			} else {
				Static474.method7122(Static193.anInt9352);
			}
		} else if (arg0 == 12) {
			if (Static70.aString27 == null) {
				Static45.method1073(Static528.aString99, Static216.aString30);
			} else {
				Static336.method5245();
			}
		}
		if (Static568.method7613(Static557.anInt9206)) {
			Static579.aClass251_129.anInt6868 = 2;
			Static438.aClass251_99.anInt6868 = 2;
			Static341.aClass251_84.anInt6868 = 2;
			Static48.aClass251_14.anInt6868 = 2;
			Static114.aClass251_27.anInt6868 = 2;
			Static447.aClass251_104.anInt6868 = 2;
			Static459.aClass251_108.anInt6868 = 2;
		}
		if (Static568.method7613(arg0)) {
			Static36.anInt951 = 0;
			Static47.anInt1067 = 0;
			Static237.anInt4797 = 1;
			Static501.anInt8346 = 1;
			Static233.anInt4738 = 0;
			Static441.method6276(true);
			Static579.aClass251_129.anInt6868 = 1;
			Static438.aClass251_99.anInt6868 = 1;
			Static341.aClass251_84.anInt6868 = 1;
			Static48.aClass251_14.anInt6868 = 1;
			Static114.aClass251_27.anInt6868 = 1;
			Static447.aClass251_104.anInt6868 = 1;
			Static459.aClass251_108.anInt6868 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static300.method4759();
		}
		@Pc(221) boolean local221 = arg0 == 2 || Static33.method929(arg0) || Static379.method5623(arg0);
		@Pc(236) boolean local236 = Static557.anInt9206 == 2 || Static33.method929(Static557.anInt9206) || Static379.method5623(Static557.anInt9206);
		if (local236 != local221) {
			if (local221) {
				Static9.anInt281 = Static384.anInt6755;
				if (Static140.aClass6_Sub48_Sub1_1.anInt9005 == 0) {
					Static495.method6397();
				} else {
					Static498.method6755(Static140.aClass6_Sub48_Sub1_1.anInt9005, Static384.anInt6755, Static370.aClass251_89);
				}
				Static489.aClass163_3.method4211(false);
			} else {
				Static495.method6397();
				Static489.aClass163_3.method4211(true);
			}
		}
		if (Static568.method7613(arg0) || arg0 == 13) {
			Static240.aClass14_7.method6843();
		}
		Static557.anInt9206 = arg0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!pp;I)I")
	public static int method6351(@OriginalArg(0) Class4_Sub1_Sub1_Sub2 arg0) {
		@Pc(16) int local16 = arg0.anInt7155;
		@Pc(22) Class118 local22 = arg0.method5891();
		if (arg0.aBoolean495) {
			local16 = arg0.anInt7144;
		} else if (local22.anInt3607 == arg0.anInt7100 || local22.anInt3604 == arg0.anInt7100 || arg0.anInt7100 == local22.anInt3593 || local22.anInt3575 == arg0.anInt7100) {
			local16 = arg0.anInt7147;
		} else if (arg0.anInt7100 == local22.anInt3590 || arg0.anInt7100 == local22.anInt3606 || local22.anInt3572 == arg0.anInt7100 || arg0.anInt7100 == local22.anInt3610) {
			local16 = arg0.anInt7165;
		}
		return local16;
	}
}
