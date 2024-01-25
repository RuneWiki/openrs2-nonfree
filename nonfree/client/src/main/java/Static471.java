import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!qt", name = "o", descriptor = "Lclient!wea;")
	public static Class370 aClass370_4;

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "[I")
	public static final int[] anIntArray562 = new int[4];

	@OriginalMember(owner = "client!qt", name = "k", descriptor = "Z")
	public static boolean aBoolean644 = false;

	@OriginalMember(owner = "client!qt", name = "m", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_89 = new Class94(76, 4);

	@OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
	public static int anInt8841 = 0;

	@OriginalMember(owner = "client!qt", name = "q", descriptor = "I")
	public static int anInt8843 = 0;

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "(I)V")
	public static void method7419() {
		Static264.aClass2_Sub6_Sub3_2 = new Class2_Sub6_Sub3(Static588.aClass351_6.method8691(Static476.anInt8915), "", Static151.anInt3895, 1004, -1, 0L, 0, 0, true, false, 0L, true);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(III)Lclient!oga;")
	public static Class243 method7420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class100 local7 = Static395.aClass100ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass243_1;
	}
}
