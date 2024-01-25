import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
	public static int anInt9420 = 0;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V")
	public static void method7937(@OriginalArg(1) int arg0) {
		@Pc(9) Class6_Sub4_Sub18 local9 = Static565.method7924((long) arg0, 2);
		local9.method7979();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Lclient!jg;")
	public static Class2_Sub1_Sub4 method7938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class351 local7 = Static441.aClass351ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass2_Sub1_Sub4_2;
	}
}
