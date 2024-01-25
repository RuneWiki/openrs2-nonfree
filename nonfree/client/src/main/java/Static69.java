import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_23 = new Class397(115, -2);

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
	public static int anInt1630 = 1;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[F")
	public static final float[] aFloatArray9 = new float[2];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method1531(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg0.length();
		while (local12 < local15 && Static202.method3080(arg0.charAt(local12))) {
			local12++;
		}
		while (local15 > local12 && Static202.method3080(arg0.charAt(local15 - 1))) {
			local15--;
		}
		@Pc(70) int local70 = local15 - local12;
		if (local70 < 1 || local70 > 12) {
			return null;
		}
		@Pc(88) StringBuffer local88 = new StringBuffer(local70);
		for (@Pc(97) int local97 = local12; local97 < local15; local97++) {
			@Pc(105) char local105 = arg0.charAt(local97);
			if (Static438.method5838(local105)) {
				@Pc(113) char local113 = Static113.method2185(local105);
				if (local113 != '\u0000') {
					local88.append(local113);
				}
			}
		}
		if (local88.length() == 0) {
			return null;
		} else {
			return local88.toString();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public static void method1532() {
		Static422.aClass307_66.method7006();
		Static435.aClass307_68.method7006();
	}
}
