import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!la", name = "o", descriptor = "I")
	public static int anInt3374;

	@OriginalMember(owner = "client!la", name = "v", descriptor = "[Lclient!pj;")
	public static Class158[] aClass158Array1;

	@OriginalMember(owner = "client!la", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString124 = " has logged out.";

	@OriginalMember(owner = "client!la", name = "y", descriptor = "[Lclient!rf;")
	public static final Class1_Sub2_Sub13[] aClass1_Sub2_Sub13Array2 = new Class1_Sub2_Sub13[14];

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(III)Lclient!vc;")
	public static Class10_Sub5 method2861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class83 local7 = Static347.aClass83ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class10_Sub5 local14 = local7.aClass10_Sub5_1;
			local7.aClass10_Sub5_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(JZ)V")
	public static void method2863(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static238.method4340(arg0 - 1L);
			Static238.method4340(1L);
		} else {
			Static238.method4340(arg0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
	public static void method2864(@OriginalArg(0) int arg0) {
		Static214.anInt4544 = arg0;
		@Pc(15) Class37 local15 = Static337.aClass37_107;
		synchronized (Static337.aClass37_107) {
			Static337.aClass37_107.method919();
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/String;IZ)Z")
	public static boolean method2865(@OriginalArg(1) String arg0) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(45) int local45 = 0; local45 < local33; local45++) {
			@Pc(51) char local51 = arg0.charAt(local45);
			if (local45 == 0) {
				if (local51 == '-') {
					local26 = true;
					continue;
				}
				if (local51 == '+') {
					continue;
				}
			}
			@Pc(98) int local98;
			if (local51 >= '0' && local51 <= '9') {
				local98 = local51 - '0';
			} else if (local51 >= 'A' && local51 <= 'Z') {
				local98 = local51 - '7';
			} else if (local51 >= 'a' && local51 <= 'z') {
				local98 = local51 - 'W';
			} else {
				return false;
			}
			if (local98 >= 10) {
				return false;
			}
			if (local26) {
				local98 = -local98;
			}
			@Pc(124) int local124 = local30 * 10 + local98;
			if (local30 != local124 / 10) {
				return false;
			}
			local30 = local124;
			local28 = true;
		}
		return local28;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIZ)V")
	public static void method2867(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg4) {
			Static112.method1810();
		}
		if (Static291.aFrame1 != null && (arg3 != 3 || Static147.anInt3045 != arg1 || arg0 != Static18.anInt358)) {
			Static278.method4962(Static291.aFrame1, Static197.aClass215_5);
			Static291.aFrame1 = null;
		}
		if (arg3 == 3 && Static291.aFrame1 == null) {
			Static291.aFrame1 = Static203.method3690(Static197.aClass215_5, 0, arg0, arg1);
			if (Static291.aFrame1 != null) {
				Static18.anInt358 = arg0;
				Static147.anInt3045 = arg1;
				Static100.method1593(Static197.aClass215_5);
			}
		}
		if (arg3 == 3 && Static291.aFrame1 == null) {
			method2867(-1, -1, arg2, Static25.anInt449, true);
			return;
		}
		@Pc(73) Container local73;
		@Pc(95) Insets local95;
		if (Static291.aFrame1 != null) {
			Static132.anInt6775 = arg0;
			local73 = Static291.aFrame1;
			Static350.anInt4382 = arg1;
		} else if (Static333.aFrame2 == null) {
			local73 = Static197.aClass215_5.anApplet1;
			Static350.anInt4382 = local73.getSize().width;
			Static132.anInt6775 = local73.getSize().height;
		} else {
			local95 = Static333.aFrame2.getInsets();
			@Pc(103) int local103 = local95.right + local95.left;
			Static350.anInt4382 = Static333.aFrame2.getSize().width - local103;
			@Pc(111) int local111 = -local95.bottom;
			Static132.anInt6775 = Static333.aFrame2.getSize().height + local111 - local95.top;
			local73 = Static333.aFrame2;
		}
		@Pc(146) int local146;
		if (arg3 == 1) {
			Static321.anInt6388 = 503;
			Static26.anInt476 = 765;
			Static204.anInt6778 = (Static350.anInt4382 - 765) / 2;
			Static325.anInt2764 = 0;
		} else if (Static267.anInt5492 < 96 && Static24.anInt437 == 0) {
			local146 = Static350.anInt4382 <= 1024 ? Static350.anInt4382 : 1024;
			@Pc(155) int local155 = Static132.anInt6775 <= 768 ? Static132.anInt6775 : 768;
			Static204.anInt6778 = (Static350.anInt4382 - local146) / 2;
			Static26.anInt476 = local146;
			Static325.anInt2764 = 0;
			Static321.anInt6388 = local155;
		} else {
			Static321.anInt6388 = Static132.anInt6775;
			Static204.anInt6778 = 0;
			Static26.anInt476 = Static350.anInt4382;
			Static325.anInt2764 = 0;
		}
		if (Static217.anInt951 != 0) {
			@Pc(194) boolean local194;
			if (Static26.anInt476 < 1024 && Static321.anInt6388 < 768) {
				local194 = true;
			} else {
				local194 = false;
			}
		}
		if (arg4) {
			Static20.method360(Static24.anInt437);
		} else {
			Static235.aCanvas6.setSize(Static26.anInt476, Static321.anInt6388);
			if (Static217.aClass105_5 != null) {
				Static217.aClass105_5.method4215();
			}
			if (local73 == Static333.aFrame2) {
				local95 = Static333.aFrame2.getInsets();
				Static235.aCanvas6.setLocation(Static204.anInt6778 + local95.left, Static325.anInt2764 + local95.top);
			} else {
				Static235.aCanvas6.setLocation(Static204.anInt6778, Static325.anInt2764);
			}
		}
		if (arg3 < 2) {
			Static3.aBoolean5 = false;
		} else {
			Static3.aBoolean5 = true;
		}
		if (Static129.anInt2569 != -1) {
			Static57.method1110(true);
		}
		if (Static81.aClass202_3 != null && (Static261.anInt5376 == 30 || Static261.anInt5376 == 25)) {
			Static14.method204();
		}
		for (local146 = 0; local146 < 100; local146++) {
			Static19.aBooleanArray1[local146] = true;
		}
		Static306.aBoolean506 = true;
	}
}
