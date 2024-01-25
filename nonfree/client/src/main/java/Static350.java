import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "Lclient!he;")
	public static Class100 aClass100_69;

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "[[S")
	public static short[][] aShortArrayArray10;

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
	public static int anInt6300;

	@OriginalMember(owner = "client!rs", name = "m", descriptor = "F")
	public static float aFloat87;

	@OriginalMember(owner = "client!rs", name = "r", descriptor = "Lclient!jt;")
	public static Class136 aClass136_13;

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
	public static int anInt6295 = 0;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)Z")
	public static boolean method5227(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
	public static void method5230() {
		if (Static97.anInt2208 <= 0) {
			Static67.aString10 = "";
			return;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static406.aStringArray46.length; local18++) {
			if (Static406.aStringArray46[local18].startsWith("--> ")) {
				local16++;
				if (Static97.anInt2208 == local16) {
					Static67.aString10 = Static406.aStringArray46[local18].substring(4);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/lang/Object;ILclient!qn;)V")
	public static void method5231(@OriginalArg(0) Object arg0, @OriginalArg(2) Class209 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static88.method4161(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIILclient!so;)V")
	public static void method5232(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub2_Sub1_Sub2 arg2) {
		if (arg2.lb == arg1 && arg1 != -1) {
			@Pc(11) Class131 local11 = Static5.aClass217_1.method5234(arg1);
			@Pc(14) int local14 = local11.anInt3702;
			if (local14 == 1) {
				arg2.anInt6563 = 0;
				arg2.anInt6601 = 0;
				arg2.anInt6557 = arg0;
				arg2.anInt6551 = 0;
				arg2.anInt6568 = 1;
				Static160.method2664(arg2.anInt6563, arg2.anInt7202, arg2 == Static302.aClass3_Sub2_Sub1_Sub2_2, local11, arg2.anInt7207, arg2.aByte103);
			}
			if (local14 == 2) {
				arg2.anInt6551 = 0;
			}
		} else if (arg1 == -1 || arg2.lb == -1 || Static5.aClass217_1.method5234(arg1).anInt3701 >= Static5.aClass217_1.method5234(arg2.lb).anInt3701) {
			arg2.anInt6601 = 0;
			arg2.anInt6563 = 0;
			arg2.lb = arg1;
			arg2.anInt6611 = arg2.anInt6613;
			arg2.anInt6551 = 0;
			arg2.anInt6557 = arg0;
			arg2.anInt6568 = 1;
			if (arg2.lb != -1) {
				Static160.method2664(arg2.anInt6563, arg2.anInt7202, Static302.aClass3_Sub2_Sub1_Sub2_2 == arg2, Static5.aClass217_1.method5234(arg2.lb), arg2.anInt7207, arg2.aByte103);
			}
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "()V")
	public static void method5233() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static223.aClass101ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static223.aClass101ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static229.anInt4189; local6++) {
					for (local9 = 0; local9 < Static61.anInt1698; local9++) {
						if (Static223.aClass101ArrayArrayArray2[local3][local6][local9] != null) {
							Static223.aClass101ArrayArrayArray2[local3][local6][local9].method2554();
						}
						Static223.aClass101ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static223.aClass101ArrayArrayArray2 = null;
		Static87.aClass86Array2 = null;
		if (Static147.aClass101ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static147.aClass101ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static229.anInt4189; local6++) {
					for (local9 = 0; local9 < Static61.anInt1698; local9++) {
						if (Static147.aClass101ArrayArrayArray1[local3][local6][local9] != null) {
							Static147.aClass101ArrayArrayArray1[local3][local6][local9].method2554();
						}
						Static147.aClass101ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static147.aClass101ArrayArrayArray1 = null;
		Static288.aClass86Array3 = null;
		Static409.aClass101ArrayArrayArray3 = null;
		Static55.aClass86Array1 = null;
		Static386.anInt6859 = 0;
		if (Static300.aClass16Array4 != null) {
			for (local3 = 0; local3 < Static386.anInt6859; local3++) {
				Static300.aClass16Array4[local3] = null;
			}
		}
		if (Static81.aClass3_Sub2Array1 != null) {
			for (local3 = 0; local3 < Static96.anInt5952; local3++) {
				Static81.aClass3_Sub2Array1[local3] = null;
			}
			Static96.anInt5952 = 0;
		}
		if (Static411.aClass76Array1 != null) {
			for (local3 = 0; local3 < Static56.anInt1522; local3++) {
				Static411.aClass76Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static295.anInt5507; local6++) {
				for (local9 = 0; local9 < Static229.anInt4189; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static61.anInt1698; local160++) {
						Static441.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static56.anInt1522 = 0;
		}
		Static175.anIntArrayArrayArray8 = null;
		Static105.method1869();
		Static385.aClass111_8.method2693();
		Static316.aByteArrayArray22 = null;
		Static137.anIntArrayArray15 = null;
		Static310.aByteArrayArray21 = null;
		Static401.aClass120_1 = null;
		Static185.aClass5_2 = null;
		Static165.aClass66_8 = null;
	}
}
