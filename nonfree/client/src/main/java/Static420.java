import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
	public static int anInt7323;

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "[I")
	public static final int[] anIntArray704 = new int[6];

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_111 = new Class45("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)Z")
	public static boolean method6572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static129.method2484(arg0, arg1)) {
			return (arg1 & 0xB000) != 0 | Static516.method7901(arg0, arg1) | Static29.method807(arg0, arg1) ? true : (Static447.method6927(arg1, arg0) | Static304.method5353(arg0, arg1)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
	public static void method6574(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub2_Sub16 local14 = Static422.method6588(4, arg0);
		local14.method6700();
	}
}
