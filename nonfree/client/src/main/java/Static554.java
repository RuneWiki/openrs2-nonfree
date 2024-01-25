import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!sg", name = "D", descriptor = "Z")
	public static boolean aBoolean681 = true;

	@OriginalMember(owner = "client!sg", name = "I", descriptor = "Lclient!kl;")
	public static final Class211 aClass211_5 = new Class211();

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "(I)V")
	public static void method7866(@OriginalArg(0) int arg0) {
		Static265.anInt5019 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static230.anInt4470; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static63.anInt777; local6++) {
				if (Static334.aClass243ArrayArrayArray2[arg0][local3][local6] == null) {
					Static334.aClass243ArrayArrayArray2[arg0][local3][local6] = new Class243(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method7869(@OriginalArg(0) String arg0) {
		if (Static29.aClass231Array1 == null) {
			return;
		}
		@Pc(19) Class260 local19 = Static629.method8573();
		@Pc(25) Class6_Sub13 local25 = Static30.method353(Static334.aClass241_74, local19.aClass270_2);
		local25.aClass6_Sub15_Sub1_1.method3016(Static290.method8800(arg0));
		local25.aClass6_Sub15_Sub1_1.method2991(arg0);
		local19.method6404(local25);
	}
}
