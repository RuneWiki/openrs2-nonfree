import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "Lclient!ps;")
	public static Class262 aClass262_5;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "[I")
	public static final int[] anIntArray277 = new int[64];

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)I")
	public static int method4609() {
		return Static192.anInt4149;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ri;I)V")
	public static void method4612(@OriginalArg(0) Class284 arg0) {
		Static166.aClass284_53 = arg0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)Lclient!is;")
	public static Class125 method4615() {
		try {
			return new Class125_Sub3();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class125) Class.forName("Class125_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class125_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
	public static void method4616() {
		@Pc(13) Class3_Sub27 local13 = (Class3_Sub27) Static114.aClass244_23.method5572();
		@Pc(24) boolean local24 = Static2.aClass251_1 != null || Static202.anInt4324 > 0;
		if (local24) {
			Static85.anInt2285 = 1;
		}
		if (Static171.aBoolean264 && Static446.aClass237_1.method5292(81) && Static161.anInt3613 > 2) {
			if (local24) {
				Static474.aClass3_Sub13_3 = (Class3_Sub13) Static260.aClass244_40.aClass3_189.aClass3_286.aClass3_286;
			} else {
				Static574.method7742((Class3_Sub13) Static260.aClass244_40.aClass3_189.aClass3_286.aClass3_286, local13.method5338(), local13.method5337());
			}
		} else if (local24) {
			Static474.aClass3_Sub13_3 = (Class3_Sub13) Static260.aClass244_40.aClass3_189.aClass3_286;
		} else {
			Static574.method7742((Class3_Sub13) Static260.aClass244_40.aClass3_189.aClass3_286, local13.method5338(), local13.method5337());
		}
	}
}
