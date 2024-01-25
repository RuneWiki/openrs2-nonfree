import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
	public static int anInt10645 = 0;

	@OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
	public static int anInt10646 = -1;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZLclient!ha;)V")
	public static void method9046(@OriginalArg(1) Class22 arg0) {
		if (Static606.anInt9195 != Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139 && (Static448.aClass364ArrayArrayArray2 != null && Static605.method7776(arg0, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139))) {
			Static606.anInt9195 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILjava/awt/Canvas;II)Lclient!dm;")
	public static Class3_Sub15 method9047(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(12) Class local12 = Class.forName("cj");
			@Pc(16) Class3_Sub15 local16 = (Class3_Sub15) local12.getDeclaredConstructor().newInstance();
			local16.method5519(arg2, arg1, arg0);
			return local16;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) Class3_Sub15_Sub2 local29 = new Class3_Sub15_Sub2();
			local29.method5519(arg2, arg1, arg0);
			return local29;
		}
	}
}
