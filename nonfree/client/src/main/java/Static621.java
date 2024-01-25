import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static621 {

	@OriginalMember(owner = "client!v", name = "y", descriptor = "Lclient!mga;")
	public static final Class230 aClass230_4 = new Class230();

	@OriginalMember(owner = "client!v", name = "B", descriptor = "I")
	public static int anInt9744 = 4;

	@OriginalMember(owner = "client!v", name = "E", descriptor = "[I")
	public static final int[] anIntArray671 = new int[13];

	@OriginalMember(owner = "client!v", name = "g", descriptor = "(I)I")
	public static int method8351() {
		if (Static333.aBoolean400) {
			return 6;
		} else if (Static111.aClass4_Sub5_Sub17_2 == null) {
			return 0;
		} else {
			@Pc(19) int local19 = Static111.aClass4_Sub5_Sub17_2.anInt7673;
			if (Static601.method7900(local19)) {
				return 1;
			} else if (Static566.method7494(local19)) {
				return 2;
			} else if (Static193.method3007(local19)) {
				return 3;
			} else if (Static98.method1982(local19)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
	public static Object method8352(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static618.aBoolean759) {
			try {
				@Pc(24) Class156 local24 = (Class156) Class.forName("Class156_Sub1").getDeclaredConstructor().newInstance();
				local24.method4853(arg0);
				return local24;
			} catch (@Pc(31) Throwable local31) {
				Static618.aBoolean759 = true;
			}
		}
		return arg0;
	}
}
