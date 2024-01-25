import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static142 {

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "Lclient!jl;")
	public static Class136 aClass136_2;

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[200];

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "Z")
	public static boolean aBoolean166 = false;

	@OriginalMember(owner = "client!gs", name = "j", descriptor = "[I")
	public static final int[] anIntArray222 = new int[200];

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
	public static int anInt2604 = 0;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!sk;BI)V")
	public static void method2199(@OriginalArg(0) Class226 arg0, @OriginalArg(2) int arg1) {
		if (Static80.aBoolean428) {
			Static80.aBoolean428 = false;
			arg1 = 0;
		}
		if (Static239.aClass226_1 != null && Static239.aClass226_1.method5208(arg0)) {
			return;
		}
		Static239.aClass226_1 = arg0;
		Static335.aLong308 = Static432.method5870();
		Static280.anInt5044 = arg1;
		Static44.anInt715 = arg1;
		if (Static44.anInt715 != 0) {
			Static301.anInt4204 = Static79.anInt1288;
			Static270.anInt4855 = Static326.anInt5851;
			Static241.aFloat33 = Static85.aFloat11;
			Static121.aClass141_1 = Static218.aClass141_2;
			Static308.aFloat78 = Static289.aFloat74;
			Static12.aFloat3 = Static22.aFloat6;
			Static162.anInt2916 = Static103.anInt5363;
			Static206.aFloat25 = Static290.aFloat75;
			Static428.aFloat94 = Static280.aFloat71;
			Static161.aFloat20 = Static304.aFloat77;
			return;
		}
		Static397.method5502();
	}
}
