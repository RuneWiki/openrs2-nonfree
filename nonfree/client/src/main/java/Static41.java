import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static41 {

	@OriginalMember(owner = "client!hd", name = "M", descriptor = "Lclient!nd;")
	public static Interface2 anInterface2_2;

	@OriginalMember(owner = "client!hd", name = "N", descriptor = "Z")
	public static boolean aBoolean56;

	@OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
	public static int anInt1153;

	@OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
	public static int anInt1154;

	@OriginalMember(owner = "client!hd", name = "S", descriptor = "Z")
	public static boolean aBoolean57;

	@OriginalMember(owner = "client!hd", name = "O", descriptor = "Lclient!b;")
	public static final Class7 aClass7_1 = new Class7();

	@OriginalMember(owner = "client!hd", name = "R", descriptor = "[I")
	public static final int[] anIntArray136 = new int[256];

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIB)V")
	public static void method783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (anIntArray136.length <= anInt1154) {
			anInterface2_2.method1238(anIntArray136, anInt1154);
			anInt1154 = 0;
		}
		anIntArray136[anInt1154++] = arg1 - anInt1153;
		anInt1153 = arg1;
		anIntArray136[anInt1154++] = arg2 << 8 | arg0 | arg3 << 16;
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
	public static void method785() {
		if (anInt1154 > 0) {
			anInterface2_2.method1238(anIntArray136, anInt1154);
			anInt1154 = 0;
		}
	}
}
