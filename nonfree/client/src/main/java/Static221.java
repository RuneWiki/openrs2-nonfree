import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
	public static int anInt3922;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "Lclient!cj;")
	public static Class51 aClass51_1;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!r;II)Lclient!ho;")
	public static Class134 method3502(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class66 local9 = Static229.method3567(arg0, arg1, true);
		return local9 == null ? null : local9.aClass134_8;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBI)V")
	public static void method3503(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub7_Sub18 local8 = Static543.method7218(7, arg1);
		local8.method7326();
		local8.anInt8802 = arg0;
	}
}
