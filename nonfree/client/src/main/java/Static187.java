import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!hp", name = "J", descriptor = "I")
	public static int anInt3430;

	@OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
	public static int anInt3432;

	@OriginalMember(owner = "client!hp", name = "O", descriptor = "[I")
	public static int[] anIntArray375;

	@OriginalMember(owner = "client!hp", name = "K", descriptor = "[I")
	public static final int[] anIntArray374 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3067(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(38) StringBuffer local38 = new StringBuffer(local8 + local10);
		for (@Pc(40) int local40 = 0; local40 < local8; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local46 == '<') {
				local38.append("<lt>");
			} else if (local46 == '>') {
				local38.append("<gt>");
			} else {
				local38.append(local46);
			}
		}
		return local38.toString();
	}

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "(I)Z")
	public static boolean method3069() {
		try {
			return Static494.method7276();
		} catch (@Pc(13) IOException local13) {
			Static270.method7140();
			return true;
		} catch (@Pc(18) Exception local18) {
			@Pc(80) String local80 = "T2 - " + (Static91.aClass239_38 == null ? -1 : Static91.aClass239_38.method6359()) + "," + (Static126.aClass239_152 == null ? -1 : Static126.aClass239_152.method6359()) + "," + (Static162.aClass239_77 == null ? -1 : Static162.aClass239_77.method6359()) + " - " + Static472.anInt8247 + "," + (Static238.anInt4280 + Static266.aClass1_Sub1_Sub2_Sub1_1.anIntArray450[0]) + "," + (Static371.anInt6936 + Static266.aClass1_Sub1_Sub2_Sub1_1.anIntArray449[0]) + " - ";
			for (@Pc(82) int local82 = 0; local82 < Static472.anInt8247 && local82 < 50; local82++) {
				local80 = local80 + Static70.aClass2_Sub29_Sub2_1.aByteArray96[local82] + ",";
			}
			Static459.method6984(local80, local18);
			Static346.method6463(false);
			return true;
		}
	}
}
