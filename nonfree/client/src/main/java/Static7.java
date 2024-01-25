import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "L", descriptor = "I")
	public static int anInt142;

	@OriginalMember(owner = "client!af", name = "J", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_9 = new Class157(38, -1);

	@OriginalMember(owner = "client!af", name = "N", descriptor = "I")
	public static int anInt144 = 0;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(III)V")
	public static void method119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 * Static241.anInt5136 >> 8;
		if (arg1 == -1 && !Static97.aBoolean179) {
			Static205.method3919();
		} else if (arg1 != -1 && (Static290.anInt5805 != arg1 || !Static334.method5446()) && local5 != 0 && !Static97.aBoolean179) {
			Static53.method1171(Static284.aClass104_149, local5, arg1);
		}
		Static290.anInt5805 = arg1;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BLclient!fh;)V")
	public static void method120(@OriginalArg(1) Class68 arg0) {
		if (!Static60.aBoolean109) {
			return;
		}
		Static300.method5057(Static160.aClass157_112);
		Static197.aClass2_Sub12_Sub2_2.method3162(arg0.anInt1857);
		Static197.aClass2_Sub12_Sub2_2.method3115(Static292.anInt5818);
		Static197.aClass2_Sub12_Sub2_2.method3154(Static310.anInt6128);
		Static197.aClass2_Sub12_Sub2_2.method3121(Static71.anInt1272);
		Static197.aClass2_Sub12_Sub2_2.method3115(arg0.anInt1890);
		Static197.aClass2_Sub12_Sub2_2.method3121(arg0.anInt1851);
	}
}
