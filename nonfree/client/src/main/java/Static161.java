import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "Lclient!oea;")
	public static Class239 aClass239_14;

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
	public static int anInt7734 = 0;

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "Z")
	public static boolean aBoolean556 = false;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method6633(@OriginalArg(0) Class20 arg0) {
		Static529.aClass68_10 = Static204.method8292(arg0, true, Static265.anInt5654);
		Static187.aClass239_8 = Static43.method5097(arg0, Static265.anInt5654);
		Static300.aClass68_4 = Static204.method8292(arg0, true, Static208.anInt4697);
		Static58.aClass239_18 = Static43.method5097(arg0, Static208.anInt4697);
		Static571.aClass68_12 = Static204.method8292(arg0, true, Static615.anInt10774);
		aClass239_14 = Static43.method5097(arg0, Static615.anInt10774);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)V")
	public static void method6634(@OriginalArg(0) int arg0) {
		@Pc(16) Class2_Sub6_Sub6 local16 = Static139.method3119(arg0, 4);
		local16.method3093();
	}
}
