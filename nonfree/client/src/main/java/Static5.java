import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static5 {

	@OriginalMember(owner = "client!af", name = "n", descriptor = "I")
	public static int anInt65;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_7 = new Class214(111, 3);

	@OriginalMember(owner = "client!af", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[200];

	@OriginalMember(owner = "client!af", name = "o", descriptor = "I")
	public static int anInt66 = -1;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IBILclient!tf;)V")
	public static void method62(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class240 arg2) {
		if (Static65.aClass240_4 != null || Static87.aBoolean142 || (arg2 == null || Static156.method5964(arg2) == null)) {
			return;
		}
		Static65.aClass240_4 = arg2;
		Static186.aClass240_10 = Static156.method5964(arg2);
		Static149.aBoolean207 = false;
		Static270.anInt5898 = arg0;
		Static255.anInt4930 = arg1;
		Static422.anInt7303 = 0;
	}
}
