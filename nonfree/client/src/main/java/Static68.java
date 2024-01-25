import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
	public static int anInt1282;

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "F")
	public static float aFloat21;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "Lclient!la;")
	public static final Class136 aClass136_36 = new Class136(40, 8);

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "[I")
	public static final int[] anIntArray66 = new int[2];

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray9 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIII)V")
	public static void method1252(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class3_Sub29 local15 = (Class3_Sub29) Static163.aClass193_67.method4519(); local15 != null; local15 = (Class3_Sub29) Static163.aClass193_67.method4525()) {
			Static193.method3012(arg2, arg0, local15, arg1, arg3);
		}
		for (@Pc(36) Class3_Sub29 local36 = (Class3_Sub29) Static163.aClass193_68.method4519(); local36 != null; local36 = (Class3_Sub29) Static163.aClass193_68.method4525()) {
			@Pc(40) byte local40 = 1;
			@Pc(47) Class142 local47 = local36.aClass1_Sub2_Sub6_Sub1_1.method6189();
			if (local36.aClass1_Sub2_Sub6_Sub1_1.aBoolean507) {
				local40 = 0;
			} else if (local36.aClass1_Sub2_Sub6_Sub1_1.anInt7586 == local47.anInt4153 || local36.aClass1_Sub2_Sub6_Sub1_1.anInt7586 == local47.anInt4182 || local36.aClass1_Sub2_Sub6_Sub1_1.anInt7586 == local47.anInt4157 || local47.anInt4191 == local36.aClass1_Sub2_Sub6_Sub1_1.anInt7586) {
				local40 = 2;
			} else if (local36.aClass1_Sub2_Sub6_Sub1_1.anInt7586 == local47.anInt4175 || local36.aClass1_Sub2_Sub6_Sub1_1.anInt7586 == local47.anInt4176 || local47.anInt4181 == local36.aClass1_Sub2_Sub6_Sub1_1.anInt7586 || local47.anInt4195 == local36.aClass1_Sub2_Sub6_Sub1_1.anInt7586) {
				local40 = 3;
			}
			if (local36.anInt3785 != local40) {
				@Pc(130) int local130 = Static201.method3082(local36.aClass1_Sub2_Sub6_Sub1_1);
				if (local36.anInt3787 != local130) {
					if (local36.aClass3_Sub1_Sub3_2 != null) {
						Static440.aClass3_Sub1_Sub2_2.method5098(local36.aClass3_Sub1_Sub3_2);
						local36.aClass3_Sub1_Sub3_2 = null;
					}
					local36.anInt3787 = local130;
				}
				local36.anInt3785 = local40;
			}
			local36.anInt3783 = local36.aClass1_Sub2_Sub6_Sub1_1.anInt7560;
			local36.anInt3789 = local36.aClass1_Sub2_Sub6_Sub1_1.anInt7560 + (local36.aClass1_Sub2_Sub6_Sub1_1.method6204() << 6);
			local36.anInt3781 = local36.aClass1_Sub2_Sub6_Sub1_1.anInt7557;
			local36.anInt3788 = local36.aClass1_Sub2_Sub6_Sub1_1.anInt7557 + (local36.aClass1_Sub2_Sub6_Sub1_1.method6204() << 6);
			Static193.method3012(arg2, arg0, local36, arg1, arg3);
		}
		for (@Pc(208) Class3_Sub29 local208 = (Class3_Sub29) Static307.aClass140_32.method3486(); local208 != null; local208 = (Class3_Sub29) Static307.aClass140_32.method3485()) {
			@Pc(212) byte local212 = 1;
			@Pc(217) Class142 local217 = local208.aClass1_Sub2_Sub6_Sub2_2.method6189();
			if (local208.aClass1_Sub2_Sub6_Sub2_2.aBoolean507) {
				local212 = 0;
			} else if (local208.aClass1_Sub2_Sub6_Sub2_2.anInt7586 == local217.anInt4153 || local208.aClass1_Sub2_Sub6_Sub2_2.anInt7586 == local217.anInt4182 || local208.aClass1_Sub2_Sub6_Sub2_2.anInt7586 == local217.anInt4157 || local208.aClass1_Sub2_Sub6_Sub2_2.anInt7586 == local217.anInt4191) {
				local212 = 2;
			} else if (local208.aClass1_Sub2_Sub6_Sub2_2.anInt7586 == local217.anInt4175 || local217.anInt4176 == local208.aClass1_Sub2_Sub6_Sub2_2.anInt7586 || local217.anInt4181 == local208.aClass1_Sub2_Sub6_Sub2_2.anInt7586 || local208.aClass1_Sub2_Sub6_Sub2_2.anInt7586 == local217.anInt4195) {
				local212 = 3;
			}
			if (local212 != local208.anInt3785) {
				@Pc(304) int local304 = Static299.method4272(local208.aClass1_Sub2_Sub6_Sub2_2);
				if (local208.anInt3787 != local304) {
					if (local208.aClass3_Sub1_Sub3_2 != null) {
						Static440.aClass3_Sub1_Sub2_2.method5098(local208.aClass3_Sub1_Sub3_2);
						local208.aClass3_Sub1_Sub3_2 = null;
					}
					local208.anInt3787 = local304;
				}
				local208.anInt3785 = local212;
			}
			local208.anInt3783 = local208.aClass1_Sub2_Sub6_Sub2_2.anInt7560;
			local208.anInt3789 = local208.aClass1_Sub2_Sub6_Sub2_2.anInt7560 + (local208.aClass1_Sub2_Sub6_Sub2_2.method6204() << 6);
			local208.anInt3781 = local208.aClass1_Sub2_Sub6_Sub2_2.anInt7557;
			local208.anInt3788 = local208.aClass1_Sub2_Sub6_Sub2_2.anInt7557 + (local208.aClass1_Sub2_Sub6_Sub2_2.method6204() << 6);
			Static193.method3012(arg2, arg0, local208, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)V")
	public static void method1253(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static360.aByteArrayArrayArray16 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	public static boolean method1256(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (Static75.anInt1371 != 3) {
			Static367.aClass241_6 = new Class241();
			Static367.aClass241_6.aString61 = arg0;
			Static367.aClass241_6.anInt6624 = arg1;
			if (Static80.aClass35_1 != Static230.aClass35_2) {
				Static367.aClass241_6.anInt6630 = Static367.aClass241_6.anInt6624 + 50000;
				Static367.aClass241_6.anInt6626 = Static367.aClass241_6.anInt6624 + 40000;
			}
			return true;
		}
		@Pc(41) String local41 = "";
		if (Static80.aClass35_1 != Static230.aClass35_2) {
			local41 = ":" + (arg1 + 7000);
		}
		@Pc(56) String local56 = "";
		if (Static153.aString38 != null) {
			local56 = "/p=" + Static153.aString38;
		}
		@Pc(104) String local104 = "http://" + arg0 + local41 + "/l=" + Static300.anInt5192 + "/a=" + Static59.anInt1131 + local56 + "/j" + (Static429.aBoolean487 ? "1" : "0") + ",o" + (Static432.aBoolean492 ? "1" : "0") + ",a2";
		try {
			Static382.aClient1.getAppletContext().showDocument(new URL(local104), "_self");
			return true;
		} catch (@Pc(114) Exception local114) {
			return false;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public static void method1259() {
		Static360.aBoolean422 = false;
		Static249.aClipboard1 = null;
		Static174.method2784();
	}
}
