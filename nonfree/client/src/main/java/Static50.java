import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!f", name = "p", descriptor = "Lclient!pb;")
	public static Class71 aClass71_10;

	@OriginalMember(owner = "client!f", name = "x", descriptor = "I")
	public static int anInt1085;

	@OriginalMember(owner = "client!f", name = "z", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!f", name = "o", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_345 = Static151.method2243("");

	@OriginalMember(owner = "client!f", name = "q", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_346 = Static151.method2243("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!f", name = "s", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_347 = Static151.method2243(")3)3)3");

	@OriginalMember(owner = "client!f", name = "v", descriptor = "[J")
	public static final long[] aLongArray2 = new long[100];

	@OriginalMember(owner = "client!f", name = "w", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_348 = Static151.method2243("k");

	@OriginalMember(owner = "client!f", name = "y", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_349 = Static151.method2243("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!f", name = "A", descriptor = "[Lclient!li;")
	public static final Class60[] aClass60Array1 = new Class60[6];

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIII)I")
	public static int method756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(21) int local21 = 65536 - Class26.anIntArray76[arg3 * 1024 / arg1] >> 1;
		return (local21 * arg0 >> 16) + ((65536 - local21) * arg2 >> 16);
	}
}
