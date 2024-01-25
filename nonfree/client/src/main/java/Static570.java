import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
	public static int anInt10304;

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "[Lclient!cr;")
	public static final Class59[] aClass59Array1 = new Class59[4];

	@OriginalMember(owner = "client!vv", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString228 = "";

	@OriginalMember(owner = "client!vv", name = "f", descriptor = "I")
	public static int anInt10306 = 0;

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(III)Lclient!sp;")
	public static Class21_Sub1_Sub5 method8016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class182 local7 = Static571.aClass182ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass21_Sub1_Sub5_1 == null ? null : local7.aClass21_Sub1_Sub5_1;
	}
}
