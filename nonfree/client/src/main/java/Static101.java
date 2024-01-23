import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!he", name = "K", descriptor = "Lclient!cg;")
	public static Class22 aClass22_33;

	@OriginalMember(owner = "client!he", name = "O", descriptor = "Lclient!vh;")
	public static Class177 aClass177_2;

	@OriginalMember(owner = "client!he", name = "R", descriptor = "I")
	public static int anInt2014;

	@OriginalMember(owner = "client!he", name = "M", descriptor = "S")
	public static short aShort14 = 1;

	@OriginalMember(owner = "client!he", name = "Q", descriptor = "I")
	public static int anInt2013 = 50;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZIII)I")
	public static int method1680(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return arg2 < arg1 ? arg1 : arg0 >= arg2 ? arg2 : arg0;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(III)Lclient!li;")
	public static Class99 method1682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub21 local7 = Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt2694; local13++) {
			@Pc(22) Class99 local22 = local7.aClass99Array19[local13];
			if ((local22.aLong117 >> 29 & 0x3L) == 2L && local22.anInt3225 == arg1 && local22.anInt3222 == arg2) {
				return local22;
			}
		}
		return null;
	}
}
