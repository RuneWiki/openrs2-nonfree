import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static33 {

	@OriginalMember(owner = "client!g", name = "J", descriptor = "Lclient!jc;")
	public static Interface1 anInterface1_2;

	@OriginalMember(owner = "client!g", name = "K", descriptor = "Z")
	public static boolean aBoolean63;

	@OriginalMember(owner = "client!g", name = "L", descriptor = "I")
	public static int anInt1010;

	@OriginalMember(owner = "client!g", name = "N", descriptor = "Z")
	public static boolean aBoolean64;

	@OriginalMember(owner = "client!g", name = "O", descriptor = "I")
	public static int anInt1011;

	@OriginalMember(owner = "client!g", name = "I", descriptor = "Lclient!la;")
	public static final Class45 aClass45_1 = new Class45();

	@OriginalMember(owner = "client!g", name = "M", descriptor = "[I")
	public static final int[] anIntArray95 = new int[256];

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IZIII)V")
	public static void method692(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (anIntArray95.length <= anInt1011) {
			anInterface1_2.method874(anIntArray95, anInt1011);
			anInt1011 = 0;
		}
		anIntArray95[anInt1011++] = arg3 - anInt1010;
		anInt1010 = arg3;
		anIntArray95[anInt1011++] = arg0 << 16 | arg1 << 8 | arg2;
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(B)V")
	public static void method693() {
		if (anInt1011 > 0) {
			anInterface1_2.method874(anIntArray95, anInt1011);
			anInt1011 = 0;
		}
	}
}
