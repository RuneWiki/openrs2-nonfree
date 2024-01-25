import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
	public static int anInt2850;

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
	public static int anInt2851;

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
	public static int anInt2855;

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString123 = "Started 3d Library";

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "J")
	public static long aLong100 = 0L;

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
	public static int anInt2853 = 0;

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18 = new String[100];

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZB)V")
	public static void method3066(@OriginalArg(0) boolean arg0) {
		for (@Pc(6) Class6_Sub39 local6 = (Class6_Sub39) Static264.aClass211_31.method5594(); local6 != null; local6 = (Class6_Sub39) Static264.aClass211_31.method5582()) {
			if (local6.aClass6_Sub12_Sub4_3 != null) {
				Static241.aClass6_Sub12_Sub3_6.method4902(local6.aClass6_Sub12_Sub4_3);
				local6.aClass6_Sub12_Sub4_3 = null;
			}
			if (local6.aClass6_Sub12_Sub4_2 != null) {
				Static241.aClass6_Sub12_Sub3_6.method4902(local6.aClass6_Sub12_Sub4_2);
				local6.aClass6_Sub12_Sub4_2 = null;
			}
			local6.method5756();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(53) Class6_Sub39 local53 = (Class6_Sub39) Static113.aClass211_17.method5594(); local53 != null; local53 = (Class6_Sub39) Static113.aClass211_17.method5582()) {
			if (local53.aClass6_Sub12_Sub4_3 != null) {
				Static241.aClass6_Sub12_Sub3_6.method4902(local53.aClass6_Sub12_Sub4_3);
				local53.aClass6_Sub12_Sub4_3 = null;
			}
			local53.method5756();
		}
		for (@Pc(80) Class6_Sub39 local80 = (Class6_Sub39) Static225.aClass108_26.method2903(); local80 != null; local80 = (Class6_Sub39) Static225.aClass108_26.method2905()) {
			if (local80.aClass6_Sub12_Sub4_3 != null) {
				Static241.aClass6_Sub12_Sub3_6.method4902(local80.aClass6_Sub12_Sub4_3);
				local80.aClass6_Sub12_Sub4_3 = null;
			}
			local80.method5756();
		}
	}
}
