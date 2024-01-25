import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "Lclient!qj;")
	public static Class165 aClass165_52;

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
	public static int anInt2898;

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
	public static int anInt2892 = 0;

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
	public static int anInt2901 = -1;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)I")
	public static int method2791(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!kq;IIIIB)Ljava/awt/Frame;")
	public static Frame method2793(@OriginalArg(0) Class110 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!arg0.method3363()) {
			return null;
		}
		@Pc(25) Class164[] local25 = Static293.method5025(arg0);
		if (local25 == null) {
			return null;
		}
		@Pc(31) boolean local31 = false;
		for (@Pc(33) int local33 = 0; local33 < local25.length; local33++) {
			if (local25[local33].anInt4856 == arg3 && local25[local33].anInt4851 == arg1 && (!local31 || local25[local33].anInt4852 > arg2)) {
				local31 = true;
				arg2 = local25[local33].anInt4852;
			}
		}
		if (!local31) {
			return null;
		}
		@Pc(95) Class134 local95 = arg0.method3370(arg1, arg3, arg2);
		while (local95.anInt4033 == 0) {
			Static134.method2598(10L);
		}
		@Pc(110) Frame local110 = (Frame) local95.anObject6;
		if (local110 == null) {
			return null;
		} else if (local95.anInt4033 == 2) {
			Static282.method4874(arg0, local110);
			return null;
		} else {
			return local110;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;BLclient!eb;)I")
	public static int method2794(@OriginalArg(0) String arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		@Pc(6) int local6 = arg1.anInt3368;
		@Pc(15) byte[] local15 = Static63.method1318(arg0);
		arg1.method3126(local15.length);
		arg1.anInt3368 += Static191.aClass147_3.method3997(local15, arg1.anInt3368, local15.length, arg1.aByteArray58, 0);
		return arg1.anInt3368 - local6;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BII)Z")
	public static boolean method2796(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static179.aBoolean310) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(17) int local17 = arg1 & 0xFFFF;
		if (Static314.aClass177ArrayArray1[local13] == null || Static314.aClass177ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(40) Class177 local40 = Static314.aClass177ArrayArray1[local13][local17];
		@Pc(52) Class1_Sub41 local52;
		if (arg0 == -1 && local40.anInt5208 == 0) {
			for (local52 = (Class1_Sub41) Static175.aClass195_36.method5029(); local52 != null; local52 = (Class1_Sub41) Static175.aClass195_36.method5021()) {
				if (local52.anInt6339 == 5 || local52.anInt6339 == 1001 || local52.anInt6339 == 13 || local52.anInt6339 == 19 || local52.anInt6339 == 58) {
					for (@Pc(87) Class177 local87 = Static140.method2694(local52.anInt6340); local87 != null; local87 = Static216.method3962(local87)) {
						if (local40.anInt5219 == local87.anInt5219) {
							return true;
						}
					}
				}
			}
		} else {
			for (local52 = (Class1_Sub41) Static175.aClass195_36.method5029(); local52 != null; local52 = (Class1_Sub41) Static175.aClass195_36.method5021()) {
				if (local52.anInt6347 == arg0 && local40.anInt5219 == local52.anInt6340 && (local52.anInt6339 == 5 || local52.anInt6339 == 1001 || local52.anInt6339 == 13 || local52.anInt6339 == 19 || local52.anInt6339 == 58)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2797(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static290.anInt5612 >= 100 && !Static214.aBoolean362 || Static290.anInt5612 >= 200) {
			Static88.method1697(Static253.aString198);
			return;
		}
		@Pc(26) String local26 = Static34.method902(arg0);
		if (local26 == null) {
			return;
		}
		@Pc(66) String local66;
		for (@Pc(31) int local31 = 0; local31 < Static290.anInt5612; local31++) {
			@Pc(39) String local39 = Static34.method902(Static257.aStringArray33[local31]);
			if (local39 != null && local39.equals(local26)) {
				Static88.method1697(arg0 + Static79.aString148);
				return;
			}
			if (Static294.aStringArray40[local31] != null) {
				local66 = Static34.method902(Static294.aStringArray40[local31]);
				if (local66 != null && local66.equals(local26)) {
					Static88.method1697(arg0 + Static79.aString148);
					return;
				}
			}
		}
		for (@Pc(94) int local94 = 0; local94 < Static227.anInt4474; local94++) {
			local66 = Static34.method902(Static313.aStringArray44[local94]);
			if (local66 != null && local66.equals(local26)) {
				Static88.method1697(Static110.aString90 + arg0 + Static185.aString33);
				return;
			}
			if (Static310.aStringArray43[local94] != null) {
				@Pc(131) String local131 = Static34.method902(Static310.aStringArray43[local94]);
				if (local131 != null && local131.equals(local26)) {
					Static88.method1697(Static110.aString90 + arg0 + Static185.aString33);
					return;
				}
			}
		}
		if (Static34.method902(Static130.aClass5_Sub3_Sub3_Sub1_1.aString130).equals(local26)) {
			Static88.method1697(Static47.aString35);
		} else {
			Static248.aClass1_Sub7_Sub1_2.method728(208);
			Static248.aClass1_Sub7_Sub1_2.method3108(Static203.method3794(arg0));
			Static248.aClass1_Sub7_Sub1_2.method3124(arg0);
		}
	}
}
