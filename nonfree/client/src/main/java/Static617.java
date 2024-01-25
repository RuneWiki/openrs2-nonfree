import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static617 {

	@OriginalMember(owner = "client!uu", name = "m", descriptor = "[[B")
	public static byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!uu", name = "q", descriptor = "Z")
	public static boolean aBoolean782 = false;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V")
	public static void method9229() {
		if (Static230.aClass2_Sub54_15.aClass4_Sub9_1.method2556() == 0 && Static578.anInt6963 != Static547.anInt9550) {
			Static285.method4770(11, Static587.anInt10249, Static194.anInt4134, false);
		} else {
			Static547.method8375(Static607.aClass101_15);
			if (Static340.anInt6393 != Static547.anInt9550) {
				Static597.method8974();
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(B)Lclient!w;")
	public static Class2_Sub54 method9231() {
		@Pc(7) Class182 local7 = null;
		@Pc(13) Class2_Sub54 local13 = new Class2_Sub54(Static551.aClass229_15, 0);
		try {
			@Pc(26) Class268 local26 = Static96.aClass48_5.method1306("");
			while (local26.anInt8008 == 0) {
				Static650.method9565(1L);
			}
			if (local26.anInt8008 == 1) {
				local7 = (Class182) local26.anObject19;
				@Pc(53) byte[] local53 = new byte[(int) local7.method4765()];
				@Pc(67) int local67;
				for (@Pc(55) int local55 = 0; local55 < local53.length; local55 += local67) {
					local67 = local7.method4773(local55, local53.length - local55, local53);
					if (local67 == -1) {
						throw new IOException("EOF");
					}
				}
				local13 = new Class2_Sub54(new Class2_Sub8(local53), Static551.aClass229_15, 0);
			}
		} catch (@Pc(95) Exception local95) {
		}
		try {
			if (local7 != null) {
				local7.method4769();
			}
		} catch (@Pc(102) Exception local102) {
		}
		return local13;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method9233(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static340.anInt6395 >= 200 && !Static64.aBoolean69 || Static340.anInt6395 >= 200) {
			Static439.method7152(Static205.aClass134_11.method3906(Static204.anInt8130));
			return;
		}
		@Pc(30) String local30 = Static426.method9517(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(83) String local83;
		for (@Pc(40) int local40 = 0; local40 < Static340.anInt6395; local40++) {
			@Pc(50) String local50 = Static426.method9517(Static438.aStringArray47[local40]);
			if (local50 != null && local50.equals(local30)) {
				Static439.method7152(arg0 + Static205.aClass134_38.method3906(Static204.anInt8130));
				return;
			}
			if (Static520.aStringArray59[local40] != null) {
				local83 = Static426.method9517(Static520.aStringArray59[local40]);
				if (local83 != null && local83.equals(local30)) {
					Static439.method7152(arg0 + Static205.aClass134_38.method3906(Static204.anInt8130));
					return;
				}
			}
		}
		for (@Pc(112) int local112 = 0; local112 < Static645.anInt10075; local112++) {
			local83 = Static426.method9517(Static587.aStringArray74[local112]);
			if (local83 != null && local83.equals(local30)) {
				Static439.method7152(Static205.aClass134_43.method3906(Static204.anInt8130) + arg0 + Static205.aClass134_44.method3906(Static204.anInt8130));
				return;
			}
			if (Static622.aStringArray79[local112] != null) {
				@Pc(158) String local158 = Static426.method9517(Static622.aStringArray79[local112]);
				if (local158 != null && local158.equals(local30)) {
					Static439.method7152(Static205.aClass134_43.method3906(Static204.anInt8130) + arg0 + Static205.aClass134_44.method3906(Static204.anInt8130));
					return;
				}
			}
		}
		if (Static426.method9517(Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aString29).equals(local30)) {
			Static439.method7152(Static205.aClass134_41.method3906(Static204.anInt8130));
		} else {
			@Pc(220) Class2_Sub52 local220 = Static311.method5098(Static647.aClass341_112, Static125.aClass179_1);
			local220.aClass2_Sub8_Sub2_2.method5170(Static297.method4908(arg0));
			local220.aClass2_Sub8_Sub2_2.method5212(arg0);
			Static38.method791(local220);
		}
	}
}
