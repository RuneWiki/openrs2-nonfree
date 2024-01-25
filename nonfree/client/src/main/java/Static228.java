import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!it", name = "n", descriptor = "I")
	public static int anInt4840;

	@OriginalMember(owner = "client!it", name = "g", descriptor = "Lclient!jn;")
	public static final Class167 aClass167_18 = new Class167(4);

	@OriginalMember(owner = "client!it", name = "l", descriptor = "Z")
	public static final boolean aBoolean339 = false;

	@OriginalMember(owner = "client!it", name = "p", descriptor = "I")
	public static int anInt4842 = 1;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Ljava/lang/String;IB)I")
	public static int method3711(@OriginalArg(0) String arg0) {
		return Static281.method4483(arg0, 16);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(III)Lclient!vea;")
	public static Class21_Sub1_Sub3 method3717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class182 local7 = Static571.aClass182ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass21_Sub1_Sub3_2;
	}
}
