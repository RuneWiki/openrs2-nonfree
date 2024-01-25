import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!raa", name = "o", descriptor = "I")
	public static int anInt8360;

	@OriginalMember(owner = "client!raa", name = "s", descriptor = "Lclient!dp;")
	public static Class77 aClass77_2;

	@OriginalMember(owner = "client!raa", name = "w", descriptor = "I")
	public static int anInt8366;

	@OriginalMember(owner = "client!raa", name = "A", descriptor = "[[I")
	public static int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!raa", name = "p", descriptor = "Lclient!vb;")
	public static final Class368 aClass368_16 = new Class368(12, 7);

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lclient!ol;I)Lclient!lca;")
	public static Class139_Sub1 method7457(@OriginalArg(0) Class2_Sub8 arg0) {
		@Pc(7) Class139 local7 = Static522.method8052(arg0);
		@Pc(11) int local11 = arg0.method5172();
		@Pc(15) int local15 = arg0.method5172();
		@Pc(24) int local24 = arg0.method5211();
		return new Class139_Sub1(local7.aClass236_12, local7.aClass103_12, local7.anInt11172, local7.anInt11180, local7.anInt11174, local7.anInt11179, local7.anInt11181, local7.anInt11175, local7.anInt11173, local11, local15, local24);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(III)I")
	public static int method7458(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static384.method6479(arg1 - 1, arg0 + -1) + Static384.method6479(arg1 + 1, arg0 - 1) + Static384.method6479(arg1 - 1, arg0 + 1) + Static384.method6479(arg1 + 1, arg0 + 1);
		@Pc(75) int local75 = Static384.method6479(arg1 - 1, arg0) + Static384.method6479(arg1 + 1, arg0) + Static384.method6479(arg1, arg0 - 1) + Static384.method6479(arg1, arg0 + 1);
		@Pc(80) int local80 = Static384.method6479(arg1, arg0);
		return local80 / 4 + local75 / 8 + local45 / 16;
	}
}
