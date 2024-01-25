import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "[Lclient!wt;")
	public static Class1_Sub5[] aClass1_Sub5Array5;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)Lclient!wr;")
	public static Class251 method4610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static64.aClass251ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static64.aClass251ArrayArrayArray1[0][arg1][arg2] != null && Static64.aClass251ArrayArrayArray1[0][arg1][arg2].aClass251_1 != null;
			if (local28 && arg0 >= Static12.anInt311 - 1) {
				return null;
			}
			Static335.method4945(arg0, arg1, arg2);
		}
		return Static64.aClass251ArrayArrayArray1[arg0][arg1][arg2];
	}
}
