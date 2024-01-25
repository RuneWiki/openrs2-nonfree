import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static12 {

	@OriginalMember(owner = "client!al", name = "c", descriptor = "I")
	public static int anInt159;

	@OriginalMember(owner = "client!al", name = "e", descriptor = "Lclient!us;")
	public static Class234 aClass234_6;

	@OriginalMember(owner = "client!al", name = "i", descriptor = "Lclient!lh;")
	public static Class145 aClass145_2;

	@OriginalMember(owner = "client!al", name = "n", descriptor = "Lclient!wp;")
	public static Interface10 anInterface10_1;

	@OriginalMember(owner = "client!al", name = "r", descriptor = "I")
	public static int anInt167;

	@OriginalMember(owner = "client!al", name = "E", descriptor = "Lclient!ld;")
	public static Class142 aClass142_1;

	@OriginalMember(owner = "client!al", name = "f", descriptor = "I")
	public static int anInt161 = 104;

	@OriginalMember(owner = "client!al", name = "g", descriptor = "Lclient!us;")
	public static final Class234 aClass234_7 = new Class234(104, 6);

	@OriginalMember(owner = "client!al", name = "m", descriptor = "[I")
	public static final int[] anIntArray20 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!al", name = "v", descriptor = "[I")
	public static final int[] anIntArray21 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!al", name = "x", descriptor = "I")
	public static int anInt172 = 2;

	@OriginalMember(owner = "client!al", name = "C", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_4 = new Class244(50, 0);

	@OriginalMember(owner = "client!al", name = "G", descriptor = "Lclient!kr;")
	public static final Class138 aClass138_3 = new Class138();

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIII)V")
	public static void method161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static164.aClass154_Sub1_1.anInt6066 == 0 || arg1 == 0 || Static117.anInt2227 >= 50 || arg0 == -1) {
			return;
		}
		Static127.anIntArray245[Static117.anInt2227] = arg0;
		Static138.anIntArray276[Static117.anInt2227] = arg1;
		Static336.anIntArray236[Static117.anInt2227] = arg2;
		Static205.aClass71Array2[Static117.anInt2227] = null;
		Static250.anIntArray578[Static117.anInt2227] = 0;
		Static289.anIntArray561[Static117.anInt2227] = arg3;
		Static117.anInt2227++;
	}
}
