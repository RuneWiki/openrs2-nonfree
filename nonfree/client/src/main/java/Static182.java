import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!ir", name = "ic", descriptor = "[[[Lclient!sd;")
	public static Class211[][][] aClass211ArrayArrayArray6;

	@OriginalMember(owner = "client!ir", name = "Zb", descriptor = "I")
	public static int anInt7140 = 0;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)Lclient!fk;")
	public static Class26_Sub3 method5528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class211 local7 = Static268.aClass211ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass26_Sub3_2;
	}
}
