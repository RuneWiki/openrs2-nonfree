import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!daa", name = "d", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_36 = new Class298(64, 8);

	@OriginalMember(owner = "client!daa", name = "p", descriptor = "Lclient!kj;")
	public static final Class187 aClass187_3 = new Class187(1, -1);

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(FFFI)F")
	public static float method1764(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg1 + arg0 * (arg2 - arg1);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IZ)V")
	public static void method1765(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static284.aClass3_Sub3_Sub3_3 != null) {
			Static186.anInt3610 = Static284.aClass3_Sub3_Sub3_3.anInt241;
		} else {
			Static186.anInt3610 = -1;
		}
		Static277.anInt5091 = 0;
		Static555.aClass203_139 = null;
		Static284.aClass3_Sub3_Sub3_3 = null;
		Static552.aClass130_63 = null;
		Static284.method6628();
		Static284.aClass130_49.method3541();
		Static287.aClass106_4 = null;
		Static426.aClass106_5 = null;
		Static454.aClass46_28 = null;
		Static508.aClass106_7 = null;
		Static152.aClass106_2 = null;
		Static284.aClass149_3 = null;
		Static341.anInt6022 = -1;
		Static108.aClass106_1 = null;
		Static296.anInt5364 = -1;
		Static217.aClass106_3 = null;
		Static455.aClass106_6 = null;
		Static525.aClass106_8 = null;
		if (Static284.aClass168_4 != null) {
			Static284.aClass168_4.method4066();
			Static284.aClass168_4.method4063(64, 128);
		}
		if (Static284.aClass348_4 != null) {
			Static284.aClass348_4.method7401(64, 64);
		}
		if (Static284.aClass69_4 != null) {
			Static284.aClass69_4.method2179(64);
		}
		Static165.aClass212_1.method5092(64);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method1770(@OriginalArg(0) String arg0) {
		@Pc(15) int local15 = arg0.length();
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '<' || local25 == '>') {
				local17 += 3;
			}
		}
		@Pc(48) StringBuffer local48 = new StringBuffer(local15 + local17);
		for (@Pc(50) int local50 = 0; local50 < local15; local50++) {
			@Pc(56) char local56 = arg0.charAt(local50);
			if (local56 == '<') {
				local48.append("<lt>");
			} else if (local56 == '>') {
				local48.append("<gt>");
			} else {
				local48.append(local56);
			}
		}
		return local48.toString();
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IBIIII)V")
	public static void method1774(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static206.anInt4180 = arg1;
		Static349.anInt6121 = arg0;
		Static21.anInt546 = arg2;
		Static452.anInt7420 = arg3;
		Static587.anInt9355 = arg4;
		if (Static587.anInt9355 >= 100) {
			@Pc(30) int local30 = Static206.anInt4180 * 512 + 256;
			@Pc(36) int local36 = Static452.anInt7420 * 512 + 256;
			@Pc(44) int local44 = Static130.method2562(local36, Static209.anInt8182, local30) - Static21.anInt546;
			@Pc(48) int local48 = local30 - Static421.anInt7061;
			@Pc(53) int local53 = local44 - Static545.anInt8633;
			@Pc(58) int local58 = local36 - Static233.anInt4431;
			@Pc(69) int local69 = (int) Math.sqrt((double) (local48 * local48 + local58 * local58));
			Static37.anInt878 = (int) (Math.atan2((double) local53, (double) local69) * 2607.5945876176133D) & 0x3FFF;
			Static154.anInt3150 = (int) (-2607.5945876176133D * Math.atan2((double) local48, (double) local58)) & 0x3FFF;
			if (Static37.anInt878 < 1024) {
				Static37.anInt878 = 1024;
			}
			Static68.anInt4065 = 0;
			if (Static37.anInt878 > 3072) {
				Static37.anInt878 = 3072;
			}
		}
		Static446.anInt7363 = 2;
		Static205.anInt4130 = -1;
		Static471.anInt7695 = -1;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)Lclient!fq;")
	public static Class103 method1777() {
		return Static346.method5274();
	}
}
