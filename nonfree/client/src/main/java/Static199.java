import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
	public static int anInt2913;

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_53 = new Class349(98, 6);

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "[[B")
	public static final byte[][] aByteArrayArray8 = new byte[250][];

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "Z")
	public static volatile boolean aBoolean208 = true;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)Lclient!ms;")
	public static Class228 method2502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static469.aClass228ArrayArrayArray6[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static469.aClass228ArrayArrayArray6[0][arg1][arg2] != null && Static469.aClass228ArrayArrayArray6[0][arg1][arg2].aClass228_1 != null;
			if (local28 && arg0 >= Static450.anInt7223 - 1) {
				return null;
			}
			Static412.method5553(arg0, arg1, arg2);
		}
		return Static469.aClass228ArrayArrayArray6[arg0][arg1][arg2];
	}
}
