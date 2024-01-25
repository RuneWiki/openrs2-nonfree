import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!of", name = "d", descriptor = "[Lclient!bs;")
	public static Class1_Sub2[] aClass1_Sub2Array6;

	@OriginalMember(owner = "client!of", name = "g", descriptor = "[Z")
	public static boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!of", name = "b", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_138 = new Class140("K", "T", "K", "K");

	@OriginalMember(owner = "client!of", name = "e", descriptor = "I")
	public static int anInt5822 = 0;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "I")
	public static int anInt5823 = 0;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIBI)V")
	public static void method4868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static197.aClass2_Sub12_Sub2_2.method3162(arg1);
		Static197.aClass2_Sub12_Sub2_2.method3121(arg2);
		Static197.aClass2_Sub12_Sub2_2.method3158(arg0);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(III)V")
	public static void method4869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class51 local7 = Static196.aClass51ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass1_Sub3_2 != null) {
			local7.aClass1_Sub3_2 = null;
		}
		if (local7.aClass1_Sub3_1 != null) {
			local7.aClass1_Sub3_1 = null;
		}
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)Z")
	public static boolean method4872() {
		return Static114.anInt2421 == 0 ? Static286.aBoolean512 : true;
	}
}
