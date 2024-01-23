import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!wj", name = "n", descriptor = "Lclient!rn;")
	public static Class155 aClass155_124;

	@OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
	public static int anInt6125;

	@OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
	public static int anInt6126 = 0;

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(III)Lclient!bb;")
	public static Class13 method5004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub25 local7 = Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2];
		return local7 == null || local7.aClass13_1 == null ? null : local7.aClass13_1;
	}
}
