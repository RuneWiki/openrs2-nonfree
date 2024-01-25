import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!mca", name = "t", descriptor = "Lclient!pea;")
	public static Class163 aClass163_1;

	@OriginalMember(owner = "client!mca", name = "k", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method5723(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "(I)V")
	public static void method5724() {
		Static435.anInt7845 = 1;
		Static90.anInt2169 = -1;
		if (Static76.aString8 == null) {
			Static329.method5383(35);
		} else {
			@Pc(24) Class3_Sub3 local24 = new Class3_Sub3(Static423.method6628(Static574.method8146(Static76.aString8)));
			@Pc(28) long local28 = local24.method4246();
			Static368.aLong190 = local24.method4246();
			Static471.method7101(Static171.method3001(local28), true, "");
		}
	}
}
