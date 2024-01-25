import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!hn", name = "S", descriptor = "I")
	public static int anInt2703;

	@OriginalMember(owner = "client!hn", name = "V", descriptor = "[[I")
	public static int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!hn", name = "G", descriptor = "I")
	public static int anInt2693 = -1;

	@OriginalMember(owner = "client!hn", name = "L", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_43 = new Class96("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!hn", name = "U", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_140 = new Class12(98, 3);

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)Z")
	public static boolean method2407(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static411.method5583(arg1, arg0) || Static434.method5821(arg0, arg1);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!hh;BLclient!hh;Lclient!qe;Lclient!hh;)Z")
	public static boolean method2409(@OriginalArg(0) Class109 arg0, @OriginalArg(2) Class109 arg1, @OriginalArg(3) Class1_Sub5_Sub4 arg2, @OriginalArg(4) Class109 arg3) {
		Static58.aClass109_22 = arg0;
		Static379.aClass109_85 = arg1;
		Static406.aClass109_92 = arg3;
		Static398.aClass1_Sub5_Sub4_4 = arg2;
		return true;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(III)V")
	public static void method2410(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class51 local10 = new Class51(16);
		for (@Pc(19) Class1_Sub34 local19 = (Class1_Sub34) Static346.aClass51_22.method928(); local19 != null; local19 = (Class1_Sub34) Static346.aClass51_22.method926()) {
			local19.method5965();
			@Pc(32) int local32 = (int) (local19.aLong237 >> 28);
			@Pc(43) int local43 = (int) (local19.aLong237 >> 14 & 0x3FFFL) - arg1;
			@Pc(52) int local52 = (int) (local19.aLong237 & 0x3FFFL) - arg0;
			if (local52 >= 0 && local43 >= 0 && Static80.anInt6558 > local52 && Static104.anInt2048 > local43) {
				local10.method931(local19, (long) (local52 | local32 << 28 | local43 << 14));
			}
		}
		Static346.aClass51_22 = local10;
	}
}
