import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!wm;")
	public static Class390 aClass390_35;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
	public static int anInt3301 = 0;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZII)V")
	public static void method2876(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static107.method2043(arg0)) {
			Static107.method2040(arg1, Static648.aClass345ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	public static void method2877() {
		@Pc(12) int local12 = Static105.anInt2258;
		@Pc(14) int[] local14 = Static321.anIntArray339;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(24) Class28_Sub1_Sub4_Sub2_Sub2 local24 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local14[local16]];
			if (local24 != null) {
				Static209.method7249(local24.method4599(), local24);
			}
		}
	}
}
