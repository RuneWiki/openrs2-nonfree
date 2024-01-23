import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
	public static int anInt3428;

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "Lclient!pk;")
	public static Class132 aClass132_61;

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "Lclient!ln;")
	public static Interface3 anInterface3_1;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
	public static int anInt3425 = 0;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
	public static int anInt3426 = 127;

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
	public static int anInt3427 = 0;

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "[I")
	public static int[] anIntArray260 = new int[2];

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray11 = new byte[250][];

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "[I")
	public static int[] anIntArray261 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString120 = "rating: ";

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZIII)V")
	public static void method2680(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class8_Sub1_Sub6 local13 = Static181.method2779(11, arg1);
		local13.method931();
		local13.anInt1284 = arg0;
		local13.anInt1286 = arg2;
	}
}
