import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "[I")
	public static int[] anIntArray501;

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
	public static int anInt6702 = -1;

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "Lclient!lg;")
	public static Class119 aClass119_205 = new Class119(64);

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_114 = new Class93("M", "M", "M", "M");

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
	public static void method5802() {
		Static158.aStringArray28 = new String[500];
		Static225.anInt4338 = Static289.aClass188_8.anInt6075 + Static289.aClass188_8.anInt6080 + 2;
		Static273.anInt5576 = Static24.aClass188_1.anInt6075 + Static24.aClass188_1.anInt6080 + 2;
		for (@Pc(26) int local26 = 0; local26 < Static158.aStringArray28.length; local26++) {
			Static158.aStringArray28[local26] = "";
		}
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
	public static void method5803() {
		for (@Pc(10) int local10 = 0; local10 < Static313.aByteArrayArrayArray12.length; local10++) {
			for (@Pc(14) int local14 = 0; local14 < Static313.aByteArrayArrayArray12[0].length; local14++) {
				for (@Pc(18) int local18 = 0; local18 < Static313.aByteArrayArrayArray12[0][0].length; local18++) {
					Static313.aByteArrayArrayArray12[local10][local14][local18] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method5804(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static180.method3294(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static180.method3294(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(57) int local57 = local14 - local11;
		if (local57 < 1 || local57 > 12) {
			return null;
		}
		@Pc(72) StringBuffer local72 = new StringBuffer(local57);
		for (@Pc(74) int local74 = local11; local74 < local14; local74++) {
			@Pc(80) char local80 = arg0.charAt(local74);
			if (Static100.method2239(local80)) {
				@Pc(88) char local88 = Static263.method4794(local80);
				if (local88 != '\u0000') {
					local72.append(local88);
				}
			}
		}
		if (local72.length() == 0) {
			return null;
		} else {
			return local72.toString();
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)I")
	public static int method5805(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILclient!tq;)V")
	public static void method5806(@OriginalArg(1) Class191 arg0) {
		Static320.aClass191_198 = arg0;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method5807(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = method5804(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static296.anInt6002; local30++) {
			@Pc(36) String local36 = Static287.aStringArray53[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = method5804(local36);
			if (local36 != null && local36.equals(local20)) {
				Static296.anInt6002--;
				for (@Pc(60) int local60 = local30; local60 < Static296.anInt6002; local60++) {
					Static287.aStringArray53[local60] = Static287.aStringArray53[local60 + 1];
					Static110.aStringArray15[local60] = Static110.aStringArray15[local60 + 1];
					Static226.anIntArray275[local60] = Static226.anIntArray275[local60 + 1];
					Static83.aStringArray11[local60] = Static83.aStringArray11[local60 + 1];
					Static308.anIntArray385[local60] = Static308.anIntArray385[local60 + 1];
					Static227.aBooleanArray20[local60] = Static227.aBooleanArray20[local60 + 1];
				}
				Static266.anInt5439 = Static157.anInt3179;
				Static74.aClass2_Sub10_Sub1_2.method2049(61);
				Static74.aClass2_Sub10_Sub1_2.method4430(Static124.method3876(arg0));
				Static74.aClass2_Sub10_Sub1_2.method4443(arg0);
				return;
			}
		}
	}
}
