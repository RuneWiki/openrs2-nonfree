import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static53 {

	@OriginalMember(owner = "client!kc", name = "Q", descriptor = "Lclient!cd;")
	public static Interface1 anInterface1_1;

	@OriginalMember(owner = "client!kc", name = "R", descriptor = "Z")
	public static boolean aBoolean84;

	@OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
	public static int anInt1676;

	@OriginalMember(owner = "client!kc", name = "T", descriptor = "Z")
	public static boolean aBoolean85;

	@OriginalMember(owner = "client!kc", name = "V", descriptor = "I")
	public static int anInt1677;

	@OriginalMember(owner = "client!kc", name = "I", descriptor = "Lclient!ub;")
	public static final Class64 aClass64_1 = new Class64();

	@OriginalMember(owner = "client!kc", name = "U", descriptor = "[I")
	public static final int[] anIntArray193 = new int[256];

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIII)V")
	public static void method1042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (anInt1676 >= anIntArray193.length) {
			anInterface1_1.method186(anIntArray193, anInt1676);
			anInt1676 = 0;
		}
		anIntArray193[anInt1676++] = arg1 - anInt1677;
		anInt1677 = arg1;
		anIntArray193[anInt1676++] = arg2 << 16 | arg0 | arg3 << 8;
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "(B)V")
	public static void method1044() {
		if (anInt1676 > 0) {
			anInterface1_1.method186(anIntArray193, anInt1676);
			anInt1676 = 0;
		}
	}
}
