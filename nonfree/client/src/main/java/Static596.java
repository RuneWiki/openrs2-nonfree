import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!wv", name = "r", descriptor = "I")
	public static int anInt9430;

	@OriginalMember(owner = "client!wv", name = "s", descriptor = "I")
	public static int anInt9431;

	@OriginalMember(owner = "client!wv", name = "k", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_274 = new Class272(0, 8);

	@OriginalMember(owner = "client!wv", name = "n", descriptor = "I")
	public static int anInt9426 = 0;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIII)V")
	public static void method7816(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(14) Class9_Sub7 local14 = (Class9_Sub7) Static479.aClass309_11.method6590(); local14 != null; local14 = (Class9_Sub7) Static479.aClass309_11.method6594()) {
			if (Static305.anInt5560 >= local14.anInt4271) {
				local14.method7465();
			} else {
				Static591.method7780((local14.anInt4269 << 9) + 256, (local14.anInt4266 << 9) + 256, arg3 >> 1, local14.anInt4273, arg2 >> 1, local14.anInt4268 * 2);
				Static480.aClass117_9.method7655(Static449.anIntArray577[1] + arg0, 0, arg1 + Static449.anIntArray577[0], local14.aString56, local14.anInt4267 | 0xFF000000);
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BII)Z")
	public static boolean method7818(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}
}
