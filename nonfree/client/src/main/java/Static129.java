import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "Lclient!kd;")
	public static Class117 aClass117_2;

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
	public static int anInt2764;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "Lclient!sf;")
	public static final Class180 aClass180_22 = new Class180();

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "[I")
	public static final int[] anIntArray223 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "[I")
	public static int[] anIntArray224 = new int[2];

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method2510(@OriginalArg(0) String arg0) {
		if (Static51.aClass210Array1 != null) {
			Static300.method5057(Static282.aClass157_180);
			Static197.aClass2_Sub12_Sub2_2.method3147(Static217.method4134(arg0));
			Static197.aClass2_Sub12_Sub2_2.method3156(arg0);
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIILclient!o;)V")
	public static void method2511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub4 arg3) {
		@Pc(4) Class51 local4 = Static261.method4461(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass1_Sub4_1 = arg3;
		}
	}
}
