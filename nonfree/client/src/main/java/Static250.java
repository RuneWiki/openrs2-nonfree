import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "Z")
	public static boolean aBoolean310;

	@OriginalMember(owner = "client!ro", name = "C", descriptor = "Lclient!nk;")
	public static Class121 aClass121_108;

	@OriginalMember(owner = "client!ro", name = "G", descriptor = "[I")
	public static int[] anIntArray398;

	@OriginalMember(owner = "client!ro", name = "H", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray19;

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "Lclient!qb;")
	public static Class142 aClass142_23 = new Class142(16);

	@OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
	public static int anInt4518 = 0;

	@OriginalMember(owner = "client!ro", name = "B", descriptor = "Z")
	public static volatile boolean aBoolean313 = true;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIII)V")
	public static void method3938(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub2_Sub11 local8 = Static5.method35(arg2, 4);
		local8.method2866();
		local8.anInt3315 = arg3;
		local8.anInt3323 = arg1;
		local8.anInt3320 = arg0;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
	public static void method3945() {
		if (!Static113.aBoolean138 && Static85.anInt1679 != 2) {
			try {
				Static321.method2506("tbrefresh", Static196.aClient1);
			} catch (@Pc(23) Throwable local23) {
			}
		}
	}
}
