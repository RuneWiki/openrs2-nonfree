import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "Lclient!pe;")
	public static Class254 aClass254_134;

	@OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
	public static int anInt10006;

	@OriginalMember(owner = "client!vn", name = "w", descriptor = "Lclient!oo;")
	public static Class247 aClass247_11;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)Lclient!fi;")
	public static Class2_Sub3 method8123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class125 local7 = Static580.aClass125ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass2_Sub3_2;
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	public static void method8125() {
		Static271.aClass211_41.method5535();
	}
}
