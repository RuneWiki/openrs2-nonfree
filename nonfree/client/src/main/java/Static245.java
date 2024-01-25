import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!ida", name = "J", descriptor = "[Lclient!hh;")
	public static Class6[] aClass6Array7;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "Lclient!ida;")
	public static final Class159 aClass159_2 = new Class159(0, Static114.aClass84_16, Static114.aClass84_16, 0, 1);

	@OriginalMember(owner = "client!ida", name = "l", descriptor = "Lclient!ida;")
	public static final Class159 aClass159_3 = new Class159(1, Static114.aClass84_16, 2);

	@OriginalMember(owner = "client!ida", name = "n", descriptor = "Lclient!ida;")
	public static final Class159 aClass159_4 = new Class159(2, Static114.aClass84_16, Static114.aClass84_16, 2, 3);

	@OriginalMember(owner = "client!ida", name = "o", descriptor = "Lclient!ida;")
	public static final Class159 aClass159_5 = new Class159(3, Static114.aClass84_16, 3);

	@OriginalMember(owner = "client!ida", name = "p", descriptor = "Lclient!ida;")
	public static final Class159 aClass159_6 = new Class159(4, Static114.aClass84_16, Static114.aClass84_16, 3, 4);

	@OriginalMember(owner = "client!ida", name = "q", descriptor = "Lclient!ida;")
	public static final Class159 aClass159_7 = new Class159(5, Static114.aClass84_16, 4);

	@OriginalMember(owner = "client!ida", name = "r", descriptor = "Lclient!ida;")
	public static final Class159 aClass159_8 = new Class159(6, Static114.aClass84_16, 4);

	@OriginalMember(owner = "client!ida", name = "s", descriptor = "Lclient!ida;")
	public static final Class159 aClass159_9 = new Class159(7, Static114.aClass84_16, Static114.aClass84_16, 4, 5);

	@OriginalMember(owner = "client!ida", name = "t", descriptor = "Lclient!ida;")
	public static final Class159 aClass159_10 = new Class159(8, Static114.aClass84_16, Static114.aClass84_16, 5, 98, true, true);

	@OriginalMember(owner = "client!ida", name = "u", descriptor = "Lclient!ida;")
	public static final Class159 aClass159_11 = new Class159(9, Static114.aClass84_16, 99);

	@OriginalMember(owner = "client!ida", name = "v", descriptor = "Lclient!ida;")
	public static final Class159 aClass159_12 = new Class159(10, Static114.aClass84_16, 100);

	@OriginalMember(owner = "client!ida", name = "w", descriptor = "Lclient!ida;")
	public static final Class159 aClass159_13 = new Class159(11, Static114.aClass84_17, Static114.aClass84_17, 0, 92, true, true);

	@OriginalMember(owner = "client!ida", name = "x", descriptor = "Lclient!ida;")
	public static final Class159 aClass159_14 = new Class159(12, Static114.aClass84_17, Static114.aClass84_17, 92, 92);

	@OriginalMember(owner = "client!ida", name = "y", descriptor = "Lclient!ida;")
	private static final Class159 aClass159_15 = new Class159(13, Static114.aClass84_17, Static114.aClass84_17, 92, 93);

	@OriginalMember(owner = "client!ida", name = "z", descriptor = "Lclient!ida;")
	public static final Class159 aClass159_16 = new Class159(14, Static114.aClass84_17, Static114.aClass84_17, 94, 95);

	@OriginalMember(owner = "client!ida", name = "B", descriptor = "Lclient!ida;")
	public static final Class159 aClass159_17 = new Class159(15, Static114.aClass84_17, Static114.aClass84_17, 96, 97);

	@OriginalMember(owner = "client!ida", name = "C", descriptor = "Lclient!ida;")
	public static final Class159 aClass159_18 = new Class159(16, Static114.aClass84_17, 97);

	@OriginalMember(owner = "client!ida", name = "D", descriptor = "Lclient!ida;")
	public static final Class159 aClass159_19 = new Class159(17, Static114.aClass84_17, 97);

	@OriginalMember(owner = "client!ida", name = "E", descriptor = "Lclient!ida;")
	public static final Class159 aClass159_20 = new Class159(18, Static114.aClass84_17, 100);

	@OriginalMember(owner = "client!ida", name = "G", descriptor = "Lclient!ida;")
	public static final Class159 aClass159_21 = new Class159(19, Static114.aClass84_17, 100);

	@OriginalMember(owner = "client!ida", name = "H", descriptor = "Lclient!ida;")
	public static final Class159 aClass159_22 = new Class159(20, Static114.aClass84_17, 100);

	@OriginalMember(owner = "client!ida", name = "I", descriptor = "I")
	public static int anInt4344 = 0;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(B)[Lclient!ida;")
	public static Class159[] method3707() {
		return new Class159[] { aClass159_2, aClass159_3, aClass159_4, aClass159_5, aClass159_6, aClass159_7, aClass159_8, aClass159_9, aClass159_10, aClass159_11, aClass159_12, aClass159_13, aClass159_14, aClass159_15, aClass159_16, aClass159_17, aClass159_18, aClass159_19, aClass159_20, aClass159_21, aClass159_22 };
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IZLclient!qba;)V")
	public static void method3710(@OriginalArg(0) int arg0, @OriginalArg(2) Class34_Sub1_Sub1_Sub2 arg1) {
		if (arg1.anIntArray527 == null) {
			return;
		}
		@Pc(17) int local17 = arg1.anIntArray527[arg0 + 1];
		if (arg1.anInt9664 == local17) {
			return;
		}
		arg1.anInt9680 = 0;
		arg1.anInt9664 = local17;
		arg1.anInt9697 = 1;
		arg1.anInt9641 = 0;
		arg1.anInt9674 = 0;
		arg1.anInt9705 = arg1.anInt9703;
		if (arg1.anInt9664 != -1) {
			Static305.method4420(arg1, Static13.aClass213_1.method5008(arg1.anInt9664), arg1.anInt9674);
			return;
		}
	}
}
