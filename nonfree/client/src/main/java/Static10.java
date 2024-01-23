import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!am", name = "c", descriptor = "Lclient!lc;")
	public static Class98 aClass98_2;

	@OriginalMember(owner = "client!am", name = "e", descriptor = "[[[Lclient!an;")
	public static Class10[][][] aClass10ArrayArrayArray1;

	@OriginalMember(owner = "client!am", name = "k", descriptor = "[Lclient!hi;")
	public static Class59[] aClass59Array1;

	@OriginalMember(owner = "client!am", name = "d", descriptor = "[I")
	public static int[] anIntArray20 = new int[32768];

	@OriginalMember(owner = "client!am", name = "j", descriptor = "Z")
	public static boolean aBoolean6 = false;

	@OriginalMember(owner = "client!am", name = "l", descriptor = "[I")
	public static int[] anIntArray23 = new int[50];

	@OriginalMember(owner = "client!am", name = "m", descriptor = "I")
	public static volatile int anInt201 = 0;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
	public static void method173() {
		anIntArray20 = null;
		aClass98_2 = null;
		aClass10ArrayArrayArray1 = null;
		aClass59Array1 = null;
		anIntArray23 = null;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I[I)[I")
	public static int[] method176(@OriginalArg(1) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) int[] local19 = new int[arg0.length];
			Static307.method3248(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}
}
