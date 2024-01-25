import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!dja", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString33;

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(III)Lclient!au;")
	public static Class19_Sub1_Sub1 method2043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class262 local7 = Static584.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass19_Sub1_Sub1_2;
	}
}
