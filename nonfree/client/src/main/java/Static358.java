import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!rp", name = "l", descriptor = "Lclient!mn;")
	public static Class171 aClass171_99;

	@OriginalMember(owner = "client!rp", name = "n", descriptor = "Lclient!mn;")
	public static Class171 aClass171_100;

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "[I")
	public static final int[] anIntArray601 = new int[14];

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_128 = new Class231("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!rp", name = "m", descriptor = "Z")
	public static boolean aBoolean503 = false;

	@OriginalMember(owner = "client!rp", name = "o", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_103 = new Class208(75, 4);

	@OriginalMember(owner = "client!rp", name = "p", descriptor = "I")
	public static int anInt7401 = 0;

	@OriginalMember(owner = "client!rp", name = "q", descriptor = "I")
	public static int anInt7402 = 0;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!hw;B)Ljava/lang/String;")
	public static String method5939(@OriginalArg(0) Class2_Sub17 arg0) {
		return Static442.method5945(arg0);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)V")
	public static void method5941(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class2_Sub1_Sub6 local10 = Static267.method3705(arg0, 6);
		local10.method2574();
		local10.anInt3131 = arg1;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!mn;Z)I")
	public static int method5942(@OriginalArg(0) Class171 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method3666(Static192.anInt3359)) {
			local10++;
		}
		if (arg0.method3666(Static72.anInt1217)) {
			local10++;
		}
		return local10;
	}
}
