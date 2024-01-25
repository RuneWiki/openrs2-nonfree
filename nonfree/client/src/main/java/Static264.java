import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
	public static int anInt4473;

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "[Lclient!ch;")
	public static Class41[] aClass41Array2;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
	public static int anInt4481;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "Lclient!m;")
	public static Interface5 anInterface5_14;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Lclient!og;")
	public static final Class182 aClass182_2 = new Class182("RC", 1);

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_73 = new Class96("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "Z")
	public static boolean aBoolean355 = false;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "[I")
	public static final int[] anIntArray352 = new int[1000];

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
	public static int anInt4482 = 0;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Lclient!po;")
	public static Class194 method3704() {
		try {
			return (Class194) Class.forName("Class194_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
	public static void method3705() {
		Static371.anInt6722 = 0;
		Static231.anInt4043 = 0;
		Static418.anInt7338 = 0;
		Static175.anInt5396 = 0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)I")
	public static int method3706(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 4 || arg1 == 5 ? Static251.anIntArray343[arg0 & 0x3] : 256;
	}
}
