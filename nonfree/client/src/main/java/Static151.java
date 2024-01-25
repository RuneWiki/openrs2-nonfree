import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static151 {

	@OriginalMember(owner = "client!g", name = "e", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!rp;Lclient!rp;I)V")
	public static void method2498(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg1.aClass1_285 != null) {
			arg1.method7908();
		}
		arg1.aClass1_285 = arg0.aClass1_285;
		arg1.aClass1_286 = arg0;
		arg1.aClass1_285.aClass1_286 = arg1;
		arg1.aClass1_286.aClass1_285 = arg1;
	}
}
