import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!pi", name = "gc", descriptor = "I")
	public static int anInt7895 = 0;

	@OriginalMember(owner = "client!pi", name = "Y", descriptor = "I")
	public static int anInt7945 = 0;

	@OriginalMember(owner = "client!pi", name = "E", descriptor = "Z")
	public static boolean aBoolean548 = false;

	@OriginalMember(owner = "client!pi", name = "bh", descriptor = "Lclient!fw;")
	public static final Class125 aClass125_32 = new Class125(16);

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(IIII)V")
	public static void method7041(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class342 local9 = Static556.aClass342ArrayArray1[arg2][arg0];
		Static403.method6107(local9 == null ? Static494.aClass342_2 : local9, arg1);
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(BI)V")
	public static void method7049(@OriginalArg(1) int arg0) {
		Static92.anInt11140 = arg0;
		@Pc(7) Class317 local7 = Static216.aClass317_32;
		synchronized (Static216.aClass317_32) {
			Static216.aClass317_32.method7873();
		}
	}
}
