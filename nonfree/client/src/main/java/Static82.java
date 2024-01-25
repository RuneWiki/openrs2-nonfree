import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static82 {

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_125 = new Class189("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_64 = new Class217(56, 4);

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	public static int anInt3956 = 100;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[100];

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!bu;Z)V")
	public static void method3175(@OriginalArg(0) Class32 arg0) {
		Static232.aClass32_54 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!mt;B)V")
	public static void method3176(@OriginalArg(0) Class6_Sub6 arg0) {
		arg0.aClass7_Sub2_Sub3_1 = null;
		if (Static137.anInt2887 < 20) {
			Static420.aClass138_7.method3307(arg0);
			Static137.anInt2887++;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V")
	public static void method3177(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static319.anInt1935 = arg0;
	}
}
