import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!fr", name = "n", descriptor = "Lclient!sb;")
	public static Class212 aClass212_4;

	@OriginalMember(owner = "client!fr", name = "l", descriptor = "[I")
	public static final int[] anIntArray167 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!fr", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString29 = "";

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)Lclient!hr;")
	public static Class16_Sub4 method2096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class164 local7 = Static202.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null || local7.aClass16_Sub4_2 == null ? null : local7.aClass16_Sub4_2;
	}
}
