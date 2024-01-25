import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "Lclient!bu;")
	public static Class32 aClass32_27;

	@OriginalMember(owner = "client!da", name = "y", descriptor = "I")
	public static int anInt1594 = 0;

	@OriginalMember(owner = "client!da", name = "tb", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_21 = new Class119(94, -1);

	@OriginalMember(owner = "client!da", name = "Bb", descriptor = "F")
	public static float aFloat9 = 1.0F;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method1238(@OriginalArg(1) Class172 arg0) {
		if (Static158.anInt3162 < 2 && !Static446.aBoolean648 || Static238.aClass156_9 != null) {
			return;
		}
		@Pc(41) String local41;
		if (Static446.aBoolean648 && Static158.anInt3162 < 2) {
			local41 = Static189.aString34 + Static85.aClass189_67.method4262(Static53.anInt1454) + Static415.aString62 + " ->";
		} else if (Static348.aBoolean510 && Static263.aClass10_1.method301(81) && Static158.anInt3162 > 2) {
			local41 = Static407.method5245((Class3_Sub14) Static184.aClass243_21.aClass3_231.aClass3_262.aClass3_262);
		} else {
			@Pc(47) Class3_Sub14 local47 = (Class3_Sub14) Static184.aClass243_21.aClass3_231.aClass3_262;
			local41 = Static407.method5245(local47);
			@Pc(53) int[] local53 = null;
			if (Static353.method4700(local47.anInt2182)) {
				local53 = Static314.aClass12_2.method327((int) local47.aLong76).anIntArray144;
			} else if (local47.anInt2183 != -1) {
				local53 = Static314.aClass12_2.method327(local47.anInt2183).anIntArray144;
			} else if (Static376.method4928(local47.anInt2182)) {
				@Pc(91) Class7_Sub2_Sub3_Sub1 local91 = Static139.aClass7_Sub2_Sub3_Sub1Array11[(int) local47.aLong76];
				if (local91 != null) {
					@Pc(96) Class47 local96 = local91.aClass47_1;
					if (local96.anIntArray94 != null) {
						local96 = local96.method1251(Static85.aClass49_1);
					}
					if (local96 != null) {
						local53 = local96.anIntArray95;
					}
				}
			} else if (Static102.method1794(local47.anInt2182)) {
				@Pc(134) Class93 local134;
				if (local47.anInt2182 == 1011) {
					local134 = Static435.aClass30_4.method769((int) local47.aLong76);
				} else {
					local134 = Static435.aClass30_4.method769((int) (local47.aLong76 >>> 32 & 0x7FFFFFFFL));
				}
				if (local134.anIntArray171 != null) {
					local134 = local134.method2066(Static85.aClass49_1);
				}
				if (local134 != null) {
					local53 = local134.lb;
				}
			}
			if (local53 != null) {
				local41 = local41 + Static390.method5066(local53);
			}
		}
		if (Static158.anInt3162 > 2) {
			local41 = local41 + "<col=ffffff> / " + (Static158.anInt3162 - 2) + Static438.aClass189_234.method4262(Static53.anInt1454);
		}
		if (Static233.aClass156_6 != null) {
			@Pc(213) Class59 local213 = Static233.aClass156_6.method3759(arg0);
			if (local213 == null) {
				local213 = Static321.aClass59_4;
			}
			local213.method5771(Static233.aClass156_6.anInt4876, Static124.anInt7634, Static369.anInt6219, Static233.aClass156_6.anInt4853, Static415.anIntArray466, Static233.aClass156_6.anInt4823, Static396.aRandom1, local41, Static430.aClass8Array88, Static233.aClass156_6.anInt4803, Static233.aClass156_6.anInt4847, Static221.anIntArray276, Static233.aClass156_6.anInt4841, Static24.anInt845);
			Static313.method4344(Static415.anIntArray466[2], Static415.anIntArray466[3], Static415.anIntArray466[0], Static415.anIntArray466[1]);
		} else if (Static408.aClass156_16 != null && Static57.aClass183_3 == Static300.aClass183_5) {
			@Pc(278) int local278 = Static321.aClass59_4.method5784(Static221.anIntArray276, Static396.aRandom1, Static124.anInt7634, local41, Static39.anInt1065 + 4, Static430.aClass8Array88, Static455.anInt7678 + 16);
			Static313.method4344(Static269.aClass70_27.method1759(local41) + local278, 16, Static39.anInt1065 + 4, Static455.anInt7678);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Lclient!hm;")
	public static Class102 method1239(@OriginalArg(1) int arg0) {
		@Pc(10) Class102 local10 = (Class102) Static209.aClass126_24.method3141((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static232.aClass32_54.method785(arg0, 1);
		local10 = new Class102();
		local10.anInt3096 = arg0;
		if (local20 != null) {
			local10.method2483(new Class3_Sub7(local20));
		}
		local10.method2485();
		if (local10.anInt3103 == 2 && Static450.aClass11_44.method324((long) arg0) == null) {
			Static450.aClass11_44.method319(new Class3_Sub34(Static411.anInt6761), (long) arg0);
			Static380.aClass102Array2[Static411.anInt6761++] = local10;
		}
		Static209.aClass126_24.method3132((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!mq;Lclient!mq;I)V")
	public static void method1244(@OriginalArg(0) Class156 arg0, @OriginalArg(1) Class156 arg1) {
		Static30.method641(Static303.aClass217_85);
		Static302.aClass3_Sub7_Sub1_2.method2636(arg1.anInt4850);
		Static302.aClass3_Sub7_Sub1_2.method2613(arg0.anInt4868);
		Static302.aClass3_Sub7_Sub1_2.method2587(arg0.anInt4826);
		Static302.aClass3_Sub7_Sub1_2.method2636(arg0.anInt4850);
		Static302.aClass3_Sub7_Sub1_2.method2599(arg1.anInt4868);
		Static302.aClass3_Sub7_Sub1_2.method2599(arg1.anInt4826);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLclient!bl;)V")
	public static void method1246(@OriginalArg(1) Class3_Sub5 arg0) {
		if (arg0.aClass3_Sub6_5 != null) {
			arg0.aClass3_Sub6_5.anInt1039 = 0;
		}
		arg0.aBoolean572 = false;
		for (@Pc(21) Class3_Sub5 local21 = arg0.method5123(); local21 != null; local21 = arg0.method5120()) {
			method1246(local21);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	public static void method1247() {
		if (!Static205.method3196()) {
			return;
		}
		if (Static271.aStringArray36 == null) {
			Static228.method3429();
		}
		Static323.anInt1153 = 0;
		Static339.aBoolean493 = true;
		try {
			Static96.aClipboard1 = Static332.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(21) Exception local21) {
		}
	}
}
